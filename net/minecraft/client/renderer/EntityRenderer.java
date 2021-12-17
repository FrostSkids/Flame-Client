// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.IInventory;
import net.minecraft.world.WorldSettings;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityCreeper;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import net.minecraft.client.renderer.culling.ICamera;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.particle.EffectRenderer;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.culling.ClippingHelperImpl;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.world.IBlockAccess;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import org.lwjgl.opengl.GLContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import java.util.List;
import net.minecraft.entity.item.EntityItemFrame;
import com.google.common.base.Predicates;
import com.google.common.base.Predicate;
import net.minecraft.util.EntitySelectors;
import org.lwjgl.opengl.GL11;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.client.shader.ShaderLinkHelper;
import net.minecraft.potion.Potion;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.util.ReportedException;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.concurrent.Callable;
import net.minecraft.crash.CrashReport;
import net.minecraft.client.gui.ScaledResolution;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.util.glu.Project;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.util.Vec3;
import net.minecraft.util.MathHelper;
import client.hud.mod.HudManager;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockBed;
import net.minecraft.util.EnumFacing;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.texture.DynamicTexture;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.client.Minecraft;
import net.minecraft.util.MouseFilter;
import org.apache.logging.log4j.Logger;
import net.minecraft.client.resources.IResourceManager;
import java.util.Random;
import net.minecraft.client.gui.MapItemRenderer;
import java.nio.FloatBuffer;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.resources.IResourceManagerReloadListener;

public class EntityRenderer implements IResourceManagerReloadListener
{
    public static /* synthetic */ boolean anaglyphEnable;
    private static final /* synthetic */ ResourceLocation locationRainPng;
    private /* synthetic */ float fogColorGreen;
    private /* synthetic */ float bossColorModifierPrev;
    private /* synthetic */ int debugViewDirection;
    private /* synthetic */ float smoothCamFilterX;
    private /* synthetic */ float thirdPersonDistanceTemp;
    private /* synthetic */ Entity pointedEntity;
    private /* synthetic */ double cameraYaw;
    public static /* synthetic */ int anaglyphField;
    private /* synthetic */ boolean lightmapUpdateNeeded;
    private /* synthetic */ float fogColorRed;
    private static final /* synthetic */ ResourceLocation[] shaderResourceLocations;
    public final /* synthetic */ ItemRenderer itemRenderer;
    private static final /* synthetic */ int[] lIllIIIllIIIlI;
    private /* synthetic */ FloatBuffer fogColorBuffer;
    private final /* synthetic */ MapItemRenderer theMapItemRenderer;
    private /* synthetic */ float farPlaneDistance;
    private /* synthetic */ boolean renderHand;
    private final /* synthetic */ ResourceLocation locationLightMap;
    private final /* synthetic */ int[] lightmapColors;
    private /* synthetic */ Random random;
    private /* synthetic */ float[] rainYCoords;
    private /* synthetic */ float[] rainXCoords;
    private static final /* synthetic */ ResourceLocation locationSnowPng;
    private /* synthetic */ double cameraZoom;
    private final /* synthetic */ IResourceManager resourceManager;
    private /* synthetic */ float fovModifierHandPrev;
    private /* synthetic */ int shaderIndex;
    private /* synthetic */ int frameCount;
    public static final /* synthetic */ int shaderCount;
    private static final /* synthetic */ Logger logger;
    private /* synthetic */ MouseFilter mouseFilterYAxis;
    private /* synthetic */ float fovModifierHand;
    private /* synthetic */ float smoothCamPitch;
    private /* synthetic */ boolean useShader;
    private /* synthetic */ long renderEndNanoTime;
    private /* synthetic */ float smoothCamPartialTicks;
    private /* synthetic */ float smoothCamYaw;
    private /* synthetic */ int rainSoundCounter;
    private /* synthetic */ boolean drawBlockOutline;
    private static final /* synthetic */ String[] lIllIIIlIllIll;
    private /* synthetic */ boolean cloudFog;
    private /* synthetic */ float fogColor1;
    private /* synthetic */ int rendererUpdateCount;
    private /* synthetic */ Minecraft mc;
    private /* synthetic */ MouseFilter mouseFilterXAxis;
    private /* synthetic */ ShaderGroup theShaderGroup;
    private /* synthetic */ boolean debugView;
    private /* synthetic */ float fogColor2;
    private /* synthetic */ float bossColorModifier;
    private /* synthetic */ double cameraPitch;
    private final /* synthetic */ DynamicTexture lightmapTexture;
    private /* synthetic */ float torchFlickerDX;
    private /* synthetic */ float torchFlickerX;
    private /* synthetic */ float fogColorBlue;
    private /* synthetic */ long prevFrameTime;
    private /* synthetic */ float thirdPersonDistance;
    private /* synthetic */ float smoothCamFilterY;
    
    private void orientCamera(final float lllllllllllllIIIIIlIlllIIlIllllI) {
        final Entity lllllllllllllIIIIIlIlllIIlIlllIl = this.mc.getRenderViewEntity();
        float lllllllllllllIIIIIlIlllIIlIlllII = lllllllllllllIIIIIlIlllIIlIlllIl.getEyeHeight();
        double lllllllllllllIIIIIlIlllIIlIllIll = lllllllllllllIIIIIlIlllIIlIlllIl.prevPosX + (lllllllllllllIIIIIlIlllIIlIlllIl.posX - lllllllllllllIIIIIlIlllIIlIlllIl.prevPosX) * lllllllllllllIIIIIlIlllIIlIllllI;
        double lllllllllllllIIIIIlIlllIIlIllIlI = lllllllllllllIIIIIlIlllIIlIlllIl.prevPosY + (lllllllllllllIIIIIlIlllIIlIlllIl.posY - lllllllllllllIIIIIlIlllIIlIlllIl.prevPosY) * lllllllllllllIIIIIlIlllIIlIllllI + lllllllllllllIIIIIlIlllIIlIlllII;
        double lllllllllllllIIIIIlIlllIIlIllIIl = lllllllllllllIIIIIlIlllIIlIlllIl.prevPosZ + (lllllllllllllIIIIIlIlllIIlIlllIl.posZ - lllllllllllllIIIIIlIlllIIlIlllIl.prevPosZ) * lllllllllllllIIIIIlIlllIIlIllllI;
        if (lllllIIIIllIIll((lllllllllllllIIIIIlIlllIIlIlllIl instanceof EntityLivingBase) ? 1 : 0) && lllllIIIIllIIll(((EntityLivingBase)lllllllllllllIIIIIlIlllIIlIlllIl).isPlayerSleeping() ? 1 : 0)) {
            ++lllllllllllllIIIIIlIlllIIlIlllII;
            GlStateManager.translate(0.0f, 0.3f, 0.0f);
            if (lllllIIIIllllII(this.mc.gameSettings.debugCamEnable ? 1 : 0)) {
                final BlockPos lllllllllllllIIIIIlIlllIIlIllIII = new BlockPos(lllllllllllllIIIIIlIlllIIlIlllIl);
                final IBlockState lllllllllllllIIIIIlIlllIIlIlIlll = this.mc.theWorld.getBlockState(lllllllllllllIIIIIlIlllIIlIllIII);
                final Block lllllllllllllIIIIIlIlllIIlIlIllI = lllllllllllllIIIIIlIlllIIlIlIlll.getBlock();
                if (lllllIIIIllllIl(lllllllllllllIIIIIlIlllIIlIlIllI, Blocks.bed)) {
                    final int lllllllllllllIIIIIlIlllIIlIlIlIl = lllllllllllllIIIIIlIlllIIlIlIlll.getValue((IProperty<EnumFacing>)BlockBed.FACING).getHorizontalIndex();
                    GlStateManager.rotate((float)(lllllllllllllIIIIIlIlllIIlIlIlIl * EntityRenderer.lIllIIIllIIIlI[34]), 0.0f, 1.0f, 0.0f);
                }
                GlStateManager.rotate(HudManager.getModPerspective().getCameraYaw() + (HudManager.getModPerspective().getCameraYaw() - HudManager.getModPerspective().getCameraYaw()) * lllllllllllllIIIIIlIlllIIlIllllI + 180.0f, 0.0f, -1.0f, 0.0f);
                GlStateManager.rotate(HudManager.getModPerspective().getCameraPitch() + (HudManager.getModPerspective().getCameraPitch() - HudManager.getModPerspective().getCameraPitch()) * lllllllllllllIIIIIlIlllIIlIllllI, -1.0f, 0.0f, 0.0f);
                "".length();
                if ((0xF ^ 0xB) < 0) {
                    return;
                }
            }
        }
        else if (lllllIIIIlllIII(this.mc.gameSettings.thirdPersonView)) {
            double lllllllllllllIIIIIlIlllIIlIlIlII = this.thirdPersonDistanceTemp + (this.thirdPersonDistance - this.thirdPersonDistanceTemp) * lllllllllllllIIIIIlIlllIIlIllllI;
            if (lllllIIIIllIIll(this.mc.gameSettings.debugCamEnable ? 1 : 0)) {
                GlStateManager.translate(0.0f, 0.0f, (float)(-lllllllllllllIIIIIlIlllIIlIlIlII));
                "".length();
                if (((0xFD ^ 0xBC) & ~(0x80 ^ 0xC1)) != 0x0) {
                    return;
                }
            }
            else {
                final float lllllllllllllIIIIIlIlllIIlIlIIll = HudManager.getModPerspective().getCameraYaw();
                float lllllllllllllIIIIIlIlllIIlIlIIlI = HudManager.getModPerspective().getCameraPitch();
                if (lllllIIIlIIIlIl(this.mc.gameSettings.thirdPersonView, EntityRenderer.lIllIIIllIIIlI[3])) {
                    lllllllllllllIIIIIlIlllIIlIlIIlI += 180.0f;
                }
                final double lllllllllllllIIIIIlIlllIIlIlIIIl = -MathHelper.sin(lllllllllllllIIIIIlIlllIIlIlIIll / 180.0f * 3.1415927f) * MathHelper.cos(lllllllllllllIIIIIlIlllIIlIlIIlI / 180.0f * 3.1415927f) * lllllllllllllIIIIIlIlllIIlIlIlII;
                final double lllllllllllllIIIIIlIlllIIlIlIIII = MathHelper.cos(lllllllllllllIIIIIlIlllIIlIlIIll / 180.0f * 3.1415927f) * MathHelper.cos(lllllllllllllIIIIIlIlllIIlIlIIlI / 180.0f * 3.1415927f) * lllllllllllllIIIIIlIlllIIlIlIlII;
                final double lllllllllllllIIIIIlIlllIIlIIllll = -MathHelper.sin(lllllllllllllIIIIIlIlllIIlIlIIlI / 180.0f * 3.1415927f) * lllllllllllllIIIIIlIlllIIlIlIlII;
                int lllllllllllllIIIIIlIlllIIlIIlllI = EntityRenderer.lIllIIIllIIIlI[0];
                "".length();
                if (-" ".length() < -" ".length()) {
                    return;
                }
                while (!lllllIIIIllIIlI(lllllllllllllIIIIIlIlllIIlIIlllI, EntityRenderer.lIllIIIllIIIlI[9])) {
                    float lllllllllllllIIIIIlIlllIIlIIllIl = (float)((lllllllllllllIIIIIlIlllIIlIIlllI & EntityRenderer.lIllIIIllIIIlI[1]) * EntityRenderer.lIllIIIllIIIlI[3] - EntityRenderer.lIllIIIllIIIlI[1]);
                    float lllllllllllllIIIIIlIlllIIlIIllII = (float)((lllllllllllllIIIIIlIlllIIlIIlllI >> EntityRenderer.lIllIIIllIIIlI[1] & EntityRenderer.lIllIIIllIIIlI[1]) * EntityRenderer.lIllIIIllIIIlI[3] - EntityRenderer.lIllIIIllIIIlI[1]);
                    float lllllllllllllIIIIIlIlllIIlIIlIll = (float)((lllllllllllllIIIIIlIlllIIlIIlllI >> EntityRenderer.lIllIIIllIIIlI[3] & EntityRenderer.lIllIIIllIIIlI[1]) * EntityRenderer.lIllIIIllIIIlI[3] - EntityRenderer.lIllIIIllIIIlI[1]);
                    lllllllllllllIIIIIlIlllIIlIIllIl *= 0.1f;
                    lllllllllllllIIIIIlIlllIIlIIllII *= 0.1f;
                    lllllllllllllIIIIIlIlllIIlIIlIll *= 0.1f;
                    final MovingObjectPosition lllllllllllllIIIIIlIlllIIlIIlIlI = this.mc.theWorld.rayTraceBlocks(new Vec3(lllllllllllllIIIIIlIlllIIlIllIll + lllllllllllllIIIIIlIlllIIlIIllIl, lllllllllllllIIIIIlIlllIIlIllIlI + lllllllllllllIIIIIlIlllIIlIIllII, lllllllllllllIIIIIlIlllIIlIllIIl + lllllllllllllIIIIIlIlllIIlIIlIll), new Vec3(lllllllllllllIIIIIlIlllIIlIllIll - lllllllllllllIIIIIlIlllIIlIlIIIl + lllllllllllllIIIIIlIlllIIlIIllIl + lllllllllllllIIIIIlIlllIIlIIlIll, lllllllllllllIIIIIlIlllIIlIllIlI - lllllllllllllIIIIIlIlllIIlIIllll + lllllllllllllIIIIIlIlllIIlIIllII, lllllllllllllIIIIIlIlllIIlIllIIl - lllllllllllllIIIIIlIlllIIlIlIIII + lllllllllllllIIIIIlIlllIIlIIlIll));
                    if (lllllIIIIllIlII(lllllllllllllIIIIIlIlllIIlIIlIlI)) {
                        final double lllllllllllllIIIIIlIlllIIlIIlIIl = lllllllllllllIIIIIlIlllIIlIIlIlI.hitVec.distanceTo(new Vec3(lllllllllllllIIIIIlIlllIIlIllIll, lllllllllllllIIIIIlIlllIIlIllIlI, lllllllllllllIIIIIlIlllIIlIllIIl));
                        if (lllllIIIlIIIIII(lllllIIIlIIIlII(lllllllllllllIIIIIlIlllIIlIIlIIl, lllllllllllllIIIIIlIlllIIlIlIlII))) {
                            lllllllllllllIIIIIlIlllIIlIlIlII = lllllllllllllIIIIIlIlllIIlIIlIIl;
                        }
                    }
                    ++lllllllllllllIIIIIlIlllIIlIIlllI;
                }
                if (lllllIIIlIIIlIl(this.mc.gameSettings.thirdPersonView, EntityRenderer.lIllIIIllIIIlI[3])) {
                    GlStateManager.rotate(180.0f, 0.0f, 1.0f, 0.0f);
                }
                GlStateManager.rotate(HudManager.getModPerspective().getCameraPitch() - lllllllllllllIIIIIlIlllIIlIlIIlI, 1.0f, 0.0f, 0.0f);
                GlStateManager.rotate(HudManager.getModPerspective().getCameraYaw() - lllllllllllllIIIIIlIlllIIlIlIIll, 0.0f, 1.0f, 0.0f);
                GlStateManager.translate(0.0f, 0.0f, (float)(-lllllllllllllIIIIIlIlllIIlIlIlII));
                GlStateManager.rotate(lllllllllllllIIIIIlIlllIIlIlIIll - HudManager.getModPerspective().getCameraYaw(), 0.0f, 1.0f, 0.0f);
                GlStateManager.rotate(lllllllllllllIIIIIlIlllIIlIlIIlI - HudManager.getModPerspective().getCameraPitch(), 1.0f, 0.0f, 0.0f);
                "".length();
                if (null != null) {
                    return;
                }
            }
        }
        else {
            GlStateManager.translate(0.0f, 0.0f, -0.1f);
        }
        if (lllllIIIIllllII(this.mc.gameSettings.debugCamEnable ? 1 : 0)) {
            GlStateManager.rotate(HudManager.getModPerspective().getCameraPitch() + (HudManager.getModPerspective().getCameraPitch() - HudManager.getModPerspective().getCameraPitch()) * lllllllllllllIIIIIlIlllIIlIllllI, 1.0f, 0.0f, 0.0f);
            if (lllllIIIIllIIll((lllllllllllllIIIIIlIlllIIlIlllIl instanceof EntityAnimal) ? 1 : 0)) {
                final EntityAnimal lllllllllllllIIIIIlIlllIIlIIlIII = (EntityAnimal)lllllllllllllIIIIIlIlllIIlIlllIl;
                GlStateManager.rotate(lllllllllllllIIIIIlIlllIIlIIlIII.prevRotationYawHead + (lllllllllllllIIIIIlIlllIIlIIlIII.rotationYawHead - lllllllllllllIIIIIlIlllIIlIIlIII.prevRotationYawHead) * lllllllllllllIIIIIlIlllIIlIllllI + 180.0f, 0.0f, 1.0f, 0.0f);
                "".length();
                if ("   ".length() == "  ".length()) {
                    return;
                }
            }
            else {
                GlStateManager.rotate(HudManager.getModPerspective().getCameraYaw() + (HudManager.getModPerspective().getCameraYaw() - HudManager.getModPerspective().getCameraYaw()) * lllllllllllllIIIIIlIlllIIlIllllI + 180.0f, 0.0f, 1.0f, 0.0f);
            }
        }
        GlStateManager.translate(0.0f, -lllllllllllllIIIIIlIlllIIlIlllII, 0.0f);
        lllllllllllllIIIIIlIlllIIlIllIll = lllllllllllllIIIIIlIlllIIlIlllIl.prevPosX + (lllllllllllllIIIIIlIlllIIlIlllIl.posX - lllllllllllllIIIIIlIlllIIlIlllIl.prevPosX) * lllllllllllllIIIIIlIlllIIlIllllI;
        lllllllllllllIIIIIlIlllIIlIllIlI = lllllllllllllIIIIIlIlllIIlIlllIl.prevPosY + (lllllllllllllIIIIIlIlllIIlIlllIl.posY - lllllllllllllIIIIIlIlllIIlIlllIl.prevPosY) * lllllllllllllIIIIIlIlllIIlIllllI + lllllllllllllIIIIIlIlllIIlIlllII;
        lllllllllllllIIIIIlIlllIIlIllIIl = lllllllllllllIIIIIlIlllIIlIlllIl.prevPosZ + (lllllllllllllIIIIIlIlllIIlIlllIl.posZ - lllllllllllllIIIIIlIlllIIlIlllIl.prevPosZ) * lllllllllllllIIIIIlIlllIIlIllllI;
        this.cloudFog = this.mc.renderGlobal.hasCloudFog(lllllllllllllIIIIIlIlllIIlIllIll, lllllllllllllIIIIIlIlllIIlIllIlI, lllllllllllllIIIIIlIlllIIlIllIIl, lllllllllllllIIIIIlIlllIIlIllllI);
    }
    
    private void renderHand(final float lllllllllllllIIIIIlIlllIIIIllIII, final int lllllllllllllIIIIIlIlllIIIIlIIlI) {
        if (lllllIIIIllllII(this.debugView ? 1 : 0)) {
            GlStateManager.matrixMode(EntityRenderer.lIllIIIllIIIlI[35]);
            GlStateManager.loadIdentity();
            final float lllllllllllllIIIIIlIlllIIIIlIllI = 0.07f;
            if (lllllIIIIllIIll(this.mc.gameSettings.anaglyph ? 1 : 0)) {
                GlStateManager.translate(-(lllllllllllllIIIIIlIlllIIIIlIIlI * EntityRenderer.lIllIIIllIIIlI[3] - EntityRenderer.lIllIIIllIIIlI[1]) * lllllllllllllIIIIIlIlllIIIIlIllI, 0.0f, 0.0f);
            }
            Project.gluPerspective(this.getFOVModifier(lllllllllllllIIIIIlIlllIIIIllIII, (boolean)(EntityRenderer.lIllIIIllIIIlI[0] != 0)), this.mc.displayWidth / (float)this.mc.displayHeight, 0.05f, this.farPlaneDistance * 2.0f);
            GlStateManager.matrixMode(EntityRenderer.lIllIIIllIIIlI[36]);
            GlStateManager.loadIdentity();
            if (lllllIIIIllIIll(this.mc.gameSettings.anaglyph ? 1 : 0)) {
                GlStateManager.translate((lllllllllllllIIIIIlIlllIIIIlIIlI * EntityRenderer.lIllIIIllIIIlI[3] - EntityRenderer.lIllIIIllIIIlI[1]) * 0.1f, 0.0f, 0.0f);
            }
            GlStateManager.pushMatrix();
            this.hurtCameraEffect(lllllllllllllIIIIIlIlllIIIIllIII);
            if (lllllIIIIllIIll(this.mc.gameSettings.viewBobbing ? 1 : 0)) {
                this.setupViewBobbing(lllllllllllllIIIIIlIlllIIIIllIII);
            }
            int n;
            if (lllllIIIIllIIll((this.mc.getRenderViewEntity() instanceof EntityLivingBase) ? 1 : 0) && lllllIIIIllIIll(((EntityLivingBase)this.mc.getRenderViewEntity()).isPlayerSleeping() ? 1 : 0)) {
                n = EntityRenderer.lIllIIIllIIIlI[1];
                "".length();
                if (((74 + 121 - 58 + 16 ^ 109 + 70 - 89 + 67) & (0xFB ^ 0xBB ^ (0xC0 ^ 0x84) ^ -" ".length())) >= " ".length()) {
                    return;
                }
            }
            else {
                n = EntityRenderer.lIllIIIllIIIlI[0];
            }
            final boolean lllllllllllllIIIIIlIlllIIIIlIlIl = n != 0;
            if (lllllIIIIllllII(this.mc.gameSettings.thirdPersonView) && lllllIIIIllllII(lllllllllllllIIIIIlIlllIIIIlIlIl ? 1 : 0) && lllllIIIIllllII(this.mc.gameSettings.hideGUI ? 1 : 0) && lllllIIIIllllII(this.mc.playerController.isSpectator() ? 1 : 0)) {
                this.enableLightmap();
                this.itemRenderer.renderItemInFirstPerson(lllllllllllllIIIIIlIlllIIIIllIII);
                this.disableLightmap();
            }
            GlStateManager.popMatrix();
            if (lllllIIIIllllII(this.mc.gameSettings.thirdPersonView) && lllllIIIIllllII(lllllllllllllIIIIIlIlllIIIIlIlIl ? 1 : 0)) {
                this.itemRenderer.renderOverlays(lllllllllllllIIIIIlIlllIIIIllIII);
                this.hurtCameraEffect(lllllllllllllIIIIIlIlllIIIIllIII);
            }
            if (lllllIIIIllIIll(this.mc.gameSettings.viewBobbing ? 1 : 0)) {
                this.setupViewBobbing(lllllllllllllIIIIIlIlllIIIIllIII);
            }
        }
    }
    
    public void func_181560_a(final float lllllllllllllIIIIIlIllIllIlIIlII, final long lllllllllllllIIIIIlIllIllIlIIIll) {
        final boolean lllllllllllllIIIIIlIllIllIlIIIlI = Display.isActive();
        if (lllllIIIIllllII(lllllllllllllIIIIIlIllIllIlIIIlI ? 1 : 0) && lllllIIIIllIIll(this.mc.gameSettings.pauseOnLostFocus ? 1 : 0) && (!lllllIIIIllIIll(this.mc.gameSettings.touchscreen ? 1 : 0) || lllllIIIIllllII(Mouse.isButtonDown(EntityRenderer.lIllIIIllIIIlI[1]) ? 1 : 0))) {
            if (lllllIIIIlllIII(lllllIIIlIIlIll(Minecraft.getSystemTime() - this.prevFrameTime, 500L))) {
                this.mc.displayInGameMenu();
                "".length();
                if (" ".length() > "   ".length()) {
                    return;
                }
            }
        }
        else {
            this.prevFrameTime = Minecraft.getSystemTime();
        }
        this.mc.mcProfiler.startSection(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[49]]);
        if (lllllIIIIllIIll(lllllllllllllIIIIIlIllIllIlIIIlI ? 1 : 0) && lllllIIIIllIIll(Minecraft.isRunningOnMac ? 1 : 0) && lllllIIIIllIIll(this.mc.inGameHasFocus ? 1 : 0) && lllllIIIIllllII(Mouse.isInsideWindow() ? 1 : 0)) {
            Mouse.setGrabbed((boolean)(EntityRenderer.lIllIIIllIIIlI[0] != 0));
            Mouse.setCursorPosition(Display.getWidth() / EntityRenderer.lIllIIIllIIIlI[3], Display.getHeight() / EntityRenderer.lIllIIIllIIIlI[3]);
            Mouse.setGrabbed((boolean)(EntityRenderer.lIllIIIllIIIlI[1] != 0));
        }
        if (lllllIIIIllIIll(this.mc.inGameHasFocus ? 1 : 0) && lllllIIIIllIIll(lllllllllllllIIIIIlIllIllIlIIIlI ? 1 : 0) && lllllIIIIllIIll(HudManager.getModPerspective().overrideMouse() ? 1 : 0)) {
            this.mc.mouseHelper.mouseXYChange();
            final float lllllllllllllIIIIIlIllIllIlIIIIl = this.mc.gameSettings.mouseSensitivity * 0.6f + 0.2f;
            final float lllllllllllllIIIIIlIllIllIlIIIII = lllllllllllllIIIIIlIllIllIlIIIIl * lllllllllllllIIIIIlIllIllIlIIIIl * lllllllllllllIIIIIlIllIllIlIIIIl * 8.0f;
            float lllllllllllllIIIIIlIllIllIIlllll = this.mc.mouseHelper.deltaX * lllllllllllllIIIIIlIllIllIlIIIII;
            float lllllllllllllIIIIIlIllIllIIllllI = this.mc.mouseHelper.deltaY * lllllllllllllIIIIIlIllIllIlIIIII;
            int lllllllllllllIIIIIlIllIllIIlllIl = EntityRenderer.lIllIIIllIIIlI[1];
            if (lllllIIIIllIIll(this.mc.gameSettings.invertMouse ? 1 : 0)) {
                lllllllllllllIIIIIlIllIllIIlllIl = EntityRenderer.lIllIIIllIIIlI[50];
            }
            if (lllllIIIIllIIll(this.mc.gameSettings.smoothCamera ? 1 : 0)) {
                this.smoothCamYaw += lllllllllllllIIIIIlIllIllIIlllll;
                this.smoothCamPitch += lllllllllllllIIIIIlIllIllIIllllI;
                final float lllllllllllllIIIIIlIllIllIIlllII = lllllllllllllIIIIIlIllIllIlIIlII - this.smoothCamPartialTicks;
                this.smoothCamPartialTicks = lllllllllllllIIIIIlIllIllIlIIlII;
                lllllllllllllIIIIIlIllIllIIlllll = this.smoothCamFilterX * lllllllllllllIIIIIlIllIllIIlllII;
                lllllllllllllIIIIIlIllIllIIllllI = this.smoothCamFilterY * lllllllllllllIIIIIlIllIllIIlllII;
                this.mc.thePlayer.setAngles(lllllllllllllIIIIIlIllIllIIlllll, lllllllllllllIIIIIlIllIllIIllllI * lllllllllllllIIIIIlIllIllIIlllIl);
                "".length();
                if ((0x3D ^ 0x39) == 0x0) {
                    return;
                }
            }
            else {
                this.smoothCamYaw = 0.0f;
                this.smoothCamPitch = 0.0f;
                this.mc.thePlayer.setAngles(lllllllllllllIIIIIlIllIllIIlllll, lllllllllllllIIIIIlIllIllIIllllI * lllllllllllllIIIIIlIllIllIIlllIl);
            }
        }
        this.mc.mcProfiler.endSection();
        if (lllllIIIIllllII(this.mc.skipRenderWorld ? 1 : 0)) {
            EntityRenderer.anaglyphEnable = this.mc.gameSettings.anaglyph;
            final ScaledResolution lllllllllllllIIIIIlIllIllIIllIll = new ScaledResolution(this.mc);
            final int lllllllllllllIIIIIlIllIllIIllIlI = lllllllllllllIIIIIlIllIllIIllIll.getScaledWidth();
            final int lllllllllllllIIIIIlIllIllIIllIIl = lllllllllllllIIIIIlIllIllIIllIll.getScaledHeight();
            final int lllllllllllllIIIIIlIllIllIIllIII = Mouse.getX() * lllllllllllllIIIIIlIllIllIIllIlI / this.mc.displayWidth;
            final int lllllllllllllIIIIIlIllIllIIlIlll = lllllllllllllIIIIIlIllIllIIllIIl - Mouse.getY() * lllllllllllllIIIIIlIllIllIIllIIl / this.mc.displayHeight - EntityRenderer.lIllIIIllIIIlI[1];
            final int lllllllllllllIIIIIlIllIllIIlIllI = this.mc.gameSettings.limitFramerate;
            if (lllllIIIIllIlII(this.mc.theWorld)) {
                this.mc.mcProfiler.startSection(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[51]]);
                int lllllllllllllIIIIIlIllIllIIlIlIl = Math.min(Minecraft.getDebugFPS(), lllllllllllllIIIIIlIllIllIIlIllI);
                lllllllllllllIIIIIlIllIllIIlIlIl = Math.max(lllllllllllllIIIIIlIllIllIIlIlIl, EntityRenderer.lIllIIIllIIIlI[52]);
                final long lllllllllllllIIIIIlIllIllIIlIlII = System.nanoTime() - lllllllllllllIIIIIlIllIllIlIIIll;
                final long lllllllllllllIIIIIlIllIllIIlIIll = Math.max(EntityRenderer.lIllIIIllIIIlI[53] / lllllllllllllIIIIIlIllIllIIlIlIl / EntityRenderer.lIllIIIllIIIlI[5] - lllllllllllllIIIIIlIllIllIIlIlII, 0L);
                this.renderWorld(lllllllllllllIIIIIlIllIllIlIIlII, System.nanoTime() + lllllllllllllIIIIIlIllIllIIlIIll);
                if (lllllIIIIllIIll(OpenGlHelper.shadersSupported ? 1 : 0)) {
                    this.mc.renderGlobal.renderEntityOutlineFramebuffer();
                    if (lllllIIIIllIlII(this.theShaderGroup) && lllllIIIIllIIll(this.useShader ? 1 : 0)) {
                        GlStateManager.matrixMode(EntityRenderer.lIllIIIllIIIlI[37]);
                        GlStateManager.pushMatrix();
                        GlStateManager.loadIdentity();
                        this.theShaderGroup.loadShaderGroup(lllllllllllllIIIIIlIllIllIlIIlII);
                        GlStateManager.popMatrix();
                    }
                    this.mc.getFramebuffer().bindFramebuffer((boolean)(EntityRenderer.lIllIIIllIIIlI[1] != 0));
                }
                this.renderEndNanoTime = System.nanoTime();
                this.mc.mcProfiler.endStartSection(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[54]]);
                if (!lllllIIIIllIIll(this.mc.gameSettings.hideGUI ? 1 : 0) || lllllIIIIllIlII(this.mc.currentScreen)) {
                    GlStateManager.alphaFunc(EntityRenderer.lIllIIIllIIIlI[55], 0.1f);
                    this.mc.ingameGUI.renderGameOverlay(lllllllllllllIIIIIlIllIllIlIIlII);
                }
                this.mc.mcProfiler.endSection();
                "".length();
                if (((0x58 ^ 0x17 ^ (0xBE ^ 0x90)) & (0x4A ^ 0x54 ^ 106 + 124 - 180 + 77 ^ -" ".length())) == " ".length()) {
                    return;
                }
            }
            else {
                GlStateManager.viewport(EntityRenderer.lIllIIIllIIIlI[0], EntityRenderer.lIllIIIllIIIlI[0], this.mc.displayWidth, this.mc.displayHeight);
                GlStateManager.matrixMode(EntityRenderer.lIllIIIllIIIlI[35]);
                GlStateManager.loadIdentity();
                GlStateManager.matrixMode(EntityRenderer.lIllIIIllIIIlI[36]);
                GlStateManager.loadIdentity();
                this.setupOverlayRendering();
                this.renderEndNanoTime = System.nanoTime();
            }
            if (lllllIIIIllIlII(this.mc.currentScreen)) {
                GlStateManager.clear(EntityRenderer.lIllIIIllIIIlI[47]);
                try {
                    this.mc.currentScreen.drawScreen(lllllllllllllIIIIIlIllIllIIllIII, lllllllllllllIIIIIlIllIllIIlIlll, lllllllllllllIIIIIlIllIllIlIIlII);
                    "".length();
                    if ("  ".length() >= "   ".length()) {
                        return;
                    }
                }
                catch (Throwable lllllllllllllIIIIIlIllIllIIlIIlI) {
                    final CrashReport lllllllllllllIIIIIlIllIllIIlIIIl = CrashReport.makeCrashReport(lllllllllllllIIIIIlIllIllIIlIIlI, EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[56]]);
                    final CrashReportCategory lllllllllllllIIIIIlIllIllIIlIIII = lllllllllllllIIIIIlIllIllIIlIIIl.makeCategory(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[57]]);
                    lllllllllllllIIIIIlIllIllIIlIIII.addCrashSectionCallable(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[58]], new Callable<String>() {
                        @Override
                        public String call() throws Exception {
                            return EntityRenderer.this.mc.currentScreen.getClass().getCanonicalName();
                        }
                    });
                    lllllllllllllIIIIIlIllIllIIlIIII.addCrashSectionCallable(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[59]], new Callable<String>() {
                        private static final /* synthetic */ String[] lIIllIIIlllIll;
                        private static final /* synthetic */ int[] lIIllIIIllllII;
                        
                        private static void llIlIllIlllIllI() {
                            (lIIllIIIllllII = new int[6])[0] = ((0xCB ^ 0xC1) & ~(0xAC ^ 0xA6));
                            EntityRenderer$3.lIIllIIIllllII[1] = (0xAC ^ 0x8D ^ (0x9B ^ 0xBE));
                            EntityRenderer$3.lIIllIIIllllII[2] = " ".length();
                            EntityRenderer$3.lIIllIIIllllII[3] = "  ".length();
                            EntityRenderer$3.lIIllIIIllllII[4] = "   ".length();
                            EntityRenderer$3.lIIllIIIllllII[5] = (0x89 ^ 0xC7 ^ (0x4D ^ 0xB));
                        }
                        
                        static {
                            llIlIllIlllIllI();
                            llIlIllIlllIlIl();
                        }
                        
                        private static String llIlIllIllIllII(final String lllllllllllllIIlIllIIIlllIIlIllI, final String lllllllllllllIIlIllIIIlllIIlIlIl) {
                            try {
                                final SecretKeySpec lllllllllllllIIlIllIIIlllIIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIllIIIlllIIlIlIl.getBytes(StandardCharsets.UTF_8)), EntityRenderer$3.lIIllIIIllllII[5]), "DES");
                                final Cipher lllllllllllllIIlIllIIIlllIIllIlI = Cipher.getInstance("DES");
                                lllllllllllllIIlIllIIIlllIIllIlI.init(EntityRenderer$3.lIIllIIIllllII[3], lllllllllllllIIlIllIIIlllIIllIll);
                                return new String(lllllllllllllIIlIllIIIlllIIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIllIIIlllIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                            }
                            catch (Exception lllllllllllllIIlIllIIIlllIIllIIl) {
                                lllllllllllllIIlIllIIIlllIIllIIl.printStackTrace();
                                return null;
                            }
                        }
                        
                        @Override
                        public String call() throws Exception {
                            final String format = EntityRenderer$3.lIIllIIIlllIll[EntityRenderer$3.lIIllIIIllllII[0]];
                            final Object[] args = new Object[EntityRenderer$3.lIIllIIIllllII[1]];
                            args[EntityRenderer$3.lIIllIIIllllII[0]] = lllllllllllllIIIIIlIllIllIIllIII;
                            args[EntityRenderer$3.lIIllIIIllllII[2]] = lllllllllllllIIIIIlIllIllIIlIlll;
                            args[EntityRenderer$3.lIIllIIIllllII[3]] = Mouse.getX();
                            args[EntityRenderer$3.lIIllIIIllllII[4]] = Mouse.getY();
                            return String.format(format, args);
                        }
                        
                        private static void llIlIllIlllIlIl() {
                            (lIIllIIIlllIll = new String[EntityRenderer$3.lIIllIIIllllII[2]])[EntityRenderer$3.lIIllIIIllllII[0]] = llIlIllIllIllII("lzyX3dXVNv8EyWnjrin38BAB0VEsP1kHkBMfJy8CAWBqRn/6Xkqxrw==", "DbuAE");
                        }
                    });
                    lllllllllllllIIIIIlIllIllIIlIIII.addCrashSectionCallable(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[60]], new Callable<String>() {
                        private static final /* synthetic */ int[] llIIllIIIlllll;
                        private static final /* synthetic */ String[] llIIllIIIllllI;
                        
                        @Override
                        public String call() throws Exception {
                            final String format = EntityRenderer$4.llIIllIIIllllI[EntityRenderer$4.llIIllIIIlllll[0]];
                            final Object[] args = new Object[EntityRenderer$4.llIIllIIIlllll[1]];
                            args[EntityRenderer$4.llIIllIIIlllll[0]] = lllllllllllllIIIIIlIllIllIIllIll.getScaledWidth();
                            args[EntityRenderer$4.llIIllIIIlllll[2]] = lllllllllllllIIIIIlIllIllIIllIll.getScaledHeight();
                            args[EntityRenderer$4.llIIllIIIlllll[3]] = EntityRenderer.this.mc.displayWidth;
                            args[EntityRenderer$4.llIIllIIIlllll[4]] = EntityRenderer.this.mc.displayHeight;
                            args[EntityRenderer$4.llIIllIIIlllll[5]] = lllllllllllllIIIIIlIllIllIIllIll.getScaleFactor();
                            return String.format(format, args);
                        }
                        
                        private static void lIIIlllIIlllllII() {
                            (llIIllIIIlllll = new int[6])[0] = ((0xD ^ 0x6D) & ~(0xC0 ^ 0xA0));
                            EntityRenderer$4.llIIllIIIlllll[1] = (158 + 141 - 267 + 143 ^ 57 + 129 - 94 + 78);
                            EntityRenderer$4.llIIllIIIlllll[2] = " ".length();
                            EntityRenderer$4.llIIllIIIlllll[3] = "  ".length();
                            EntityRenderer$4.llIIllIIIlllll[4] = "   ".length();
                            EntityRenderer$4.llIIllIIIlllll[5] = (0x12 ^ 0x16);
                        }
                        
                        private static boolean lIIIlllIIlllllIl(final int llllllllllllIlllIIIIIlllIlllllIl, final int llllllllllllIlllIIIIIlllIlllllII) {
                            return llllllllllllIlllIIIIIlllIlllllIl < llllllllllllIlllIIIIIlllIlllllII;
                        }
                        
                        private static String lIIIlllIIllllIlI(String llllllllllllIlllIIIIIllllIIIlIII, final String llllllllllllIlllIIIIIllllIIIIlll) {
                            llllllllllllIlllIIIIIllllIIIlIII = (double)new String(Base64.getDecoder().decode(((String)llllllllllllIlllIIIIIllllIIIlIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                            final StringBuilder llllllllllllIlllIIIIIllllIIIlIll = new StringBuilder();
                            final char[] llllllllllllIlllIIIIIllllIIIlIlI = llllllllllllIlllIIIIIllllIIIIlll.toCharArray();
                            int llllllllllllIlllIIIIIllllIIIlIIl = EntityRenderer$4.llIIllIIIlllll[0];
                            final short llllllllllllIlllIIIIIllllIIIIIll = (Object)((String)llllllllllllIlllIIIIIllllIIIlIII).toCharArray();
                            final String llllllllllllIlllIIIIIllllIIIIIlI = (String)llllllllllllIlllIIIIIllllIIIIIll.length;
                            long llllllllllllIlllIIIIIllllIIIIIIl = EntityRenderer$4.llIIllIIIlllll[0];
                            while (lIIIlllIIlllllIl((int)llllllllllllIlllIIIIIllllIIIIIIl, (int)llllllllllllIlllIIIIIllllIIIIIlI)) {
                                final char llllllllllllIlllIIIIIllllIIIlllI = llllllllllllIlllIIIIIllllIIIIIll[llllllllllllIlllIIIIIllllIIIIIIl];
                                llllllllllllIlllIIIIIllllIIIlIll.append((char)(llllllllllllIlllIIIIIllllIIIlllI ^ llllllllllllIlllIIIIIllllIIIlIlI[llllllllllllIlllIIIIIllllIIIlIIl % llllllllllllIlllIIIIIllllIIIlIlI.length]));
                                "".length();
                                ++llllllllllllIlllIIIIIllllIIIlIIl;
                                ++llllllllllllIlllIIIIIllllIIIIIIl;
                                "".length();
                                if (-" ".length() >= (90 + 51 - 75 + 86 ^ 88 + 69 - 17 + 16)) {
                                    return null;
                                }
                            }
                            return String.valueOf(llllllllllllIlllIIIIIllllIIIlIll);
                        }
                        
                        private static void lIIIlllIIllllIll() {
                            (llIIllIIIllllI = new String[EntityRenderer$4.llIIllIIIlllll[2]])[EntityRenderer$4.llIIllIIIlllll[0]] = lIIIlllIIllllIlI("BSIrGikye2peaTJtalMof29qNy4lLiYDODN7al5pMm1qUyh/b2olLzctL1YqNyI+GT52LixWaTI=", "VAJvL");
                        }
                        
                        static {
                            lIIIlllIIlllllII();
                            lIIIlllIIllllIll();
                        }
                    });
                    throw new ReportedException(lllllllllllllIIIIIlIllIllIIlIIIl);
                }
            }
        }
    }
    
    public void setupOverlayRendering() {
        final ScaledResolution lllllllllllllIIIIIlIllIIIllIlIll = new ScaledResolution(this.mc);
        GlStateManager.clear(EntityRenderer.lIllIIIllIIIlI[47]);
        GlStateManager.matrixMode(EntityRenderer.lIllIIIllIIIlI[35]);
        GlStateManager.loadIdentity();
        GlStateManager.ortho(0.0, lllllllllllllIIIIIlIllIIIllIlIll.getScaledWidth_double(), lllllllllllllIIIIIlIllIIIllIlIll.getScaledHeight_double(), 0.0, 1000.0, 3000.0);
        GlStateManager.matrixMode(EntityRenderer.lIllIIIllIIIlI[36]);
        GlStateManager.loadIdentity();
        GlStateManager.translate(0.0f, 0.0f, -2000.0f);
    }
    
    public void renderStreamIndicator(final float lllllllllllllIIIIIlIllIlIlllllll) {
        this.setupOverlayRendering();
        this.mc.ingameGUI.renderStreamIndicator(new ScaledResolution(this.mc));
    }
    
    private static boolean lllllIIIlIIIIII(final int lllllllllllllIIIIIlIlIlllIIlllll) {
        return lllllllllllllIIIIIlIlIlllIIlllll < 0;
    }
    
    public void updateShaderGroupSize(final int lllllllllllllIIIIIlIlllIllllIlIl, final int lllllllllllllIIIIIlIlllIllllIIIl) {
        if (lllllIIIIllIIll(OpenGlHelper.shadersSupported ? 1 : 0)) {
            if (lllllIIIIllIlII(this.theShaderGroup)) {
                this.theShaderGroup.createBindFramebuffers(lllllllllllllIIIIIlIlllIllllIlIl, lllllllllllllIIIIIlIlllIllllIIIl);
            }
            this.mc.renderGlobal.createBindEntityOutlineFbs(lllllllllllllIIIIIlIlllIllllIlIl, lllllllllllllIIIIIlIlllIllllIIIl);
        }
    }
    
    private static void lllllIIIIlIlIlI() {
        (lIllIIIlIllIll = new String[EntityRenderer.lIllIIIllIIIlI[101]])[EntityRenderer.lIllIIIllIIIlI[0]] = lllllIIIIIlllII("Nz5N4aBlHmSRRM64pJR9sYZE0L63nGLVadu/SkEKrYo=", "Tsxcr");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[1]] = lllllIIIIIlllIl("6qNap7EQ8qoYKXM36sMT5ZZn8kuPaf8GYh34u+yVKas=", "pRVrt");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[3]] = lllllIIIIIllllI("Iw0pIA0iFmc0ByMRZyoHJAYgagIjCiY=", "PeHDh");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[4]] = lllllIIIIIllllI("EQ01ERcQFnsFHRERexMKAwR6HwENCw==", "beTur");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[5]] = lllllIIIIIllllI("BColFgYFMWsCDAQ2axMRA2wuAQwZ", "wBDrc");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[6]] = lllllIIIIIlllIl("YV660gBtUmh0vphkfwTyxOrbkR/mLlvJ", "tPwDL");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[7]] = lllllIIIIIlllIl("klWCEhQoxjrH84WvR7L6tJ/ZsTj1vVPKfspKI5k7ot0=", "RwTQR");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[8]] = lllllIIIIIlllIl("mUBMr74NYWj3nSgsRBTnSZxzVewXzhDdunmY1n9HBAg=", "Pwggi");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[9]] = lllllIIIIIlllIl("bj71Lj7SJCmffhSBlJVYKMBsm4Gh+2ewBob3zN0lhg6DRy45UdZv7g==", "YfdBo");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[10]] = lllllIIIIIlllIl("3grUmKbyc/NJLhTsCvL07f0YXldSpzNNIAtgl6F9FWc=", "cAPys");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[11]] = lllllIIIIIlllIl("7ggWrjIm1oU1YdeHf87CYVpD/C+Zvhlm", "uLWoc");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[12]] = lllllIIIIIllllI("MDsMNgoxIEIiADAnQjsBNTYfJkEpIAI8", "CSmRo");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[13]] = lllllIIIIIlllII("A/3vwrc2gi9UNHcz6nZuZGMHvy6tiNcd", "pPvEp");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[14]] = lllllIIIIIlllII("sro4FlFCD6cQesHLnvmDAp7gfmsSaIBA5Xj3M9Bux3w=", "AOAEB");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[15]] = lllllIIIIIlllII("OyxLxSIwk2+QVd+/MZOMFikIvNpU30AEiLIg+kqoin8=", "SmtuE");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[16]] = lllllIIIIIllllI("KwM4JQ8qGHYxBSsfdjIJOQUGMQM2CCwyAjEEN28AKwQ3", "XkYAj");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[17]] = lllllIIIIIllllI("CwEjLBAKGm04GgsdbTsaGgwuZh8LBiw=", "xiBHu");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[18]] = lllllIIIIIllllI("Ej8gASQTJG4VLhIjbgcoFSRvDzIOOQ==", "aWAeA");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[19]] = lllllIIIIIlllII("UhIFPiVi61lo7Ps7SEC/4fNh2enrKwJHaViaOHSmSHk=", "umtdb");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[20]] = lllllIIIIIllllI("EBE3EjARCnkGOhANeREnBhw4WD8QFjg=", "cyVvU");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[21]] = lllllIIIIIllllI("HTsZNyEcIFcjKx0nVzEoGyFWOTcBPQ==", "nSxSD");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[22]] = lllllIIIIIlllIl("9aU4LoVYuBetKGlrT2R391cRnzgjiHXL07jh29ENyN0=", "TMEUp");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[23]] = lllllIIIIIlllIl("8GcacBOHSUszGpDil9LFVpZlld2amwMM", "XqsST");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[24]] = lllllIIIIIlllIl("Xxe8qQBBm9/3bPQDHK4hHmWOOsvg+0Tq2ogGE9YFMfU=", "jLTac");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[2]] = lllllIIIIIlllIl("wgRJxbnTfBHhQiQ8L9ZF6HdB89mj/InD98y3dMtnKWk=", "zkcwQ");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[25]] = lllllIIIIIllllI("FDwmFxcVJ2gDHRQgaAACDjAiAVwNJygd", "gTGsr");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[27]] = lllllIIIIIlllIl("sKvs8LvfR+x6lwMSF+Lhiw==", "GjyVT");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[29]] = lllllIIIIIlllIl("hCswawAX99/oHNRBLKr/z8nSSDtMVXdnfbnrPy1Om7I=", "cXnTc");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[30]] = lllllIIIIIlllIl("yDBsKTgJWBldJqZIA5EgQx7ggpiYqxVzx+OHzHWf57A=", "uRaiB");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[31]] = lllllIIIIIllllI("AQItAQ0AGWMVBwEeYwwGBA8+EUYYGSML", "rjLeh");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[32]] = lllllIIIIIlllII("VoVYzItU5HLlWBSsWBctmolTYHSouYhq", "PnTvF");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[33]] = lllllIIIIIlllIl("jHSvESJo8bsYOevEqSNm8l1CcJrbvpuR", "zbJPW");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[28]] = lllllIIIIIllllI("GAI2Ig==", "hkUIa");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[45]] = lllllIIIIIllllI("CT8PGBMxMxA=", "eVhpg");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[49]] = lllllIIIIIlllIl("TllHtWERMSQ=", "XyiTO");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[51]] = lllllIIIIIllllI("DyMkChk=", "cFRou");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[54]] = lllllIIIIIllllI("Mwwm", "TyOAf");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[56]] = lllllIIIIIlllII("Bqh6AAItP1ptmgRdC3vaVWM3KU0JsUEE", "LYChG");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[57]] = lllllIIIIIlllII("+sHrMXzL1qb5879SWorrisg/6OoqArHw", "FyjAR");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[58]] = lllllIIIIIlllIl("Y7LvAZspyL2H/rJ2wKhL5A==", "POIKD");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[59]] = lllllIIIIIllllI("BQI+PjVoASQuMTwEJCM=", "HmKMP");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[60]] = lllllIIIIIllllI("MBk+LiQNWj8iOwY=", "czLKA");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[63]] = lllllIIIIIlllIl("xngd22OFdjo=", "WxrfK");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[64]] = lllllIIIIIllllI("OwUADSE=", "XielS");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[66]] = lllllIIIIIlllII("KklDv96kUiQ=", "isipp");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[67]] = lllllIIIIIlllIl("RScZFfI9InU=", "AVzPV");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[68]] = lllllIIIIIllllI("MwE0GyI+Ew==", "PtXwK");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[69]] = lllllIIIIIllllI("ECg/", "cCFZP");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[71]] = lllllIIIIIlllII("/4VXmJ8+sJyD3clcRUqI4w==", "RBKwC");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[72]] = lllllIIIIIlllIl("CpUhpwp3pXTpMxATpahB0Q==", "gpVLE");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[73]] = lllllIIIIIlllIl("qVXaAXejpO8f1sARDurr4w==", "NvrUx");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[74]] = lllllIIIIIlllII("7cZEP5yVj5I=", "nLTtt");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[76]] = lllllIIIIIllllI("AQk5ACANAj4=", "dgMiT");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[77]] = lllllIIIIIlllII("kk4IJhZ9HGI=", "qWKmY");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[78]] = lllllIIIIIllllI("JzgkAx8mKA==", "HMPov");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[79]] = lllllIIIIIlllIl("4/i9L81i3ckIok4wZbGVoA==", "qjRVY");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[80]] = lllllIIIIIlllIl("5qOF01brwiEtK2oboqY3Lw==", "MozQE");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[81]] = lllllIIIIIlllII("qpZ3l6lix0aoUdxqhEenoA==", "MnERK");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[82]] = lllllIIIIIlllII("zI9fD0W/epM=", "EpTIh");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[83]] = lllllIIIIIlllIl("HWXPvR4RRgXn0Rt8TL1Q+Q==", "YyaGW");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[52]] = lllllIIIIIllllI("LDg2GAAONjYbAT4=", "MZYne");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[84]] = lllllIIIIIllllI("GhgEHQ==", "ryjyP");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[85]] = lllllIIIIIlllIl("VhWun4IXV84=", "eMlRs");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[86]] = lllllIIIIIlllIl("LsR7Q38o/nDoTTMBAX79CRF4nmH/k+VO", "HEial");
        EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[87]] = lllllIIIIIlllII("IYCj3jE9AkXjoKK4hV95oMSma4y83Y2Z", "jXPHu");
    }
    
    private static String lllllIIIIIllllI(String lllllllllllllIIIIIlIlIlllllIlIIl, final String lllllllllllllIIIIIlIlIlllllIlIII) {
        lllllllllllllIIIIIlIlIlllllIlIIl = new String(Base64.getDecoder().decode(lllllllllllllIIIIIlIlIlllllIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIIlIlIlllllIllII = new StringBuilder();
        final char[] lllllllllllllIIIIIlIlIlllllIlIll = lllllllllllllIIIIIlIlIlllllIlIII.toCharArray();
        int lllllllllllllIIIIIlIlIlllllIlIlI = EntityRenderer.lIllIIIllIIIlI[0];
        final double lllllllllllllIIIIIlIlIlllllIIlII = (Object)lllllllllllllIIIIIlIlIlllllIlIIl.toCharArray();
        final char lllllllllllllIIIIIlIlIlllllIIIll = (char)lllllllllllllIIIIIlIlIlllllIIlII.length;
        String lllllllllllllIIIIIlIlIlllllIIIlI = (String)EntityRenderer.lIllIIIllIIIlI[0];
        while (lllllIIIlIlIlII((int)lllllllllllllIIIIIlIlIlllllIIIlI, lllllllllllllIIIIIlIlIlllllIIIll)) {
            final char lllllllllllllIIIIIlIlIlllllIllll = lllllllllllllIIIIIlIlIlllllIIlII[lllllllllllllIIIIIlIlIlllllIIIlI];
            lllllllllllllIIIIIlIlIlllllIllII.append((char)(lllllllllllllIIIIIlIlIlllllIllll ^ lllllllllllllIIIIIlIlIlllllIlIll[lllllllllllllIIIIIlIlIlllllIlIlI % lllllllllllllIIIIIlIlIlllllIlIll.length]));
            "".length();
            ++lllllllllllllIIIIIlIlIlllllIlIlI;
            ++lllllllllllllIIIIIlIlIlllllIIIlI;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIIlIlIlllllIllII);
    }
    
    private static boolean lllllIIIIllIIll(final int lllllllllllllIIIIIlIlIlllIlIIlIl) {
        return lllllllllllllIIIIIlIlIlllIlIIlIl != 0;
    }
    
    private void updateFogColor(final float lllllllllllllIIIIIlIllIIIlIlIlIl) {
        final World lllllllllllllIIIIIlIllIIIlIlIlII = this.mc.theWorld;
        final Entity lllllllllllllIIIIIlIllIIIlIlIIll = this.mc.getRenderViewEntity();
        float lllllllllllllIIIIIlIllIIIlIlIIlI = 0.25f + 0.75f * this.mc.gameSettings.renderDistanceChunks / 32.0f;
        lllllllllllllIIIIIlIllIIIlIlIIlI = 1.0f - (float)Math.pow(lllllllllllllIIIIIlIllIIIlIlIIlI, 0.25);
        final Vec3 lllllllllllllIIIIIlIllIIIlIlIIIl = lllllllllllllIIIIIlIllIIIlIlIlII.getSkyColor(this.mc.getRenderViewEntity(), lllllllllllllIIIIIlIllIIIlIlIlIl);
        final float lllllllllllllIIIIIlIllIIIlIlIIII = (float)lllllllllllllIIIIIlIllIIIlIlIIIl.xCoord;
        final float lllllllllllllIIIIIlIllIIIlIIllll = (float)lllllllllllllIIIIIlIllIIIlIlIIIl.yCoord;
        final float lllllllllllllIIIIIlIllIIIlIIlllI = (float)lllllllllllllIIIIIlIllIIIlIlIIIl.zCoord;
        final Vec3 lllllllllllllIIIIIlIllIIIlIIllIl = lllllllllllllIIIIIlIllIIIlIlIlII.getFogColor(lllllllllllllIIIIIlIllIIIlIlIlIl);
        this.fogColorRed = (float)lllllllllllllIIIIIlIllIIIlIIllIl.xCoord;
        this.fogColorGreen = (float)lllllllllllllIIIIIlIllIIIlIIllIl.yCoord;
        this.fogColorBlue = (float)lllllllllllllIIIIIlIllIIIlIIllIl.zCoord;
        if (lllllIIIIllIIlI(this.mc.gameSettings.renderDistanceChunks, EntityRenderer.lIllIIIllIIIlI[5])) {
            final double lllllllllllllIIIIIlIllIIIlIIllII = -1.0;
            Vec3 vec3;
            if (lllllIIIIlllIII(lllllIIIlIlIllI(MathHelper.sin(lllllllllllllIIIIIlIllIIIlIlIlII.getCelestialAngleRadians(lllllllllllllIIIIIlIllIIIlIlIlIl)), 0.0f))) {
                vec3 = new Vec3(lllllllllllllIIIIIlIllIIIlIIllII, 0.0, 0.0);
                "".length();
                if (-"  ".length() > 0) {
                    return;
                }
            }
            else {
                vec3 = new Vec3(1.0, 0.0, 0.0);
            }
            final Vec3 lllllllllllllIIIIIlIllIIIlIIlIll = vec3;
            float lllllllllllllIIIIIlIllIIIlIIlIlI = (float)lllllllllllllIIIIIlIllIIIlIlIIll.getLook(lllllllllllllIIIIIlIllIIIlIlIlIl).dotProduct(lllllllllllllIIIIIlIllIIIlIIlIll);
            if (lllllIIIlIIIIII(lllllIIIlIlIlll(lllllllllllllIIIIIlIllIIIlIIlIlI, 0.0f))) {
                lllllllllllllIIIIIlIllIIIlIIlIlI = 0.0f;
            }
            if (lllllIIIIlllIII(lllllIIIlIlIllI(lllllllllllllIIIIIlIllIIIlIIlIlI, 0.0f))) {
                final float[] lllllllllllllIIIIIlIllIIIlIIlIIl = lllllllllllllIIIIIlIllIIIlIlIlII.provider.calcSunriseSunsetColors(lllllllllllllIIIIIlIllIIIlIlIlII.getCelestialAngle(lllllllllllllIIIIIlIllIIIlIlIlIl), lllllllllllllIIIIIlIllIIIlIlIlIl);
                if (lllllIIIIllIlII(lllllllllllllIIIIIlIllIIIlIIlIIl)) {
                    lllllllllllllIIIIIlIllIIIlIIlIlI *= lllllllllllllIIIIIlIllIIIlIIlIIl[EntityRenderer.lIllIIIllIIIlI[4]];
                    this.fogColorRed = this.fogColorRed * (1.0f - lllllllllllllIIIIIlIllIIIlIIlIlI) + lllllllllllllIIIIIlIllIIIlIIlIIl[EntityRenderer.lIllIIIllIIIlI[0]] * lllllllllllllIIIIIlIllIIIlIIlIlI;
                    this.fogColorGreen = this.fogColorGreen * (1.0f - lllllllllllllIIIIIlIllIIIlIIlIlI) + lllllllllllllIIIIIlIllIIIlIIlIIl[EntityRenderer.lIllIIIllIIIlI[1]] * lllllllllllllIIIIIlIllIIIlIIlIlI;
                    this.fogColorBlue = this.fogColorBlue * (1.0f - lllllllllllllIIIIIlIllIIIlIIlIlI) + lllllllllllllIIIIIlIllIIIlIIlIIl[EntityRenderer.lIllIIIllIIIlI[3]] * lllllllllllllIIIIIlIllIIIlIIlIlI;
                }
            }
        }
        this.fogColorRed += (lllllllllllllIIIIIlIllIIIlIlIIII - this.fogColorRed) * lllllllllllllIIIIIlIllIIIlIlIIlI;
        this.fogColorGreen += (lllllllllllllIIIIIlIllIIIlIIllll - this.fogColorGreen) * lllllllllllllIIIIIlIllIIIlIlIIlI;
        this.fogColorBlue += (lllllllllllllIIIIIlIllIIIlIIlllI - this.fogColorBlue) * lllllllllllllIIIIIlIllIIIlIlIIlI;
        final float lllllllllllllIIIIIlIllIIIlIIlIII = lllllllllllllIIIIIlIllIIIlIlIlII.getRainStrength(lllllllllllllIIIIIlIllIIIlIlIlIl);
        if (lllllIIIIlllIII(lllllIIIlIlIllI(lllllllllllllIIIIIlIllIIIlIIlIII, 0.0f))) {
            final float lllllllllllllIIIIIlIllIIIlIIIlll = 1.0f - lllllllllllllIIIIIlIllIIIlIIlIII * 0.5f;
            final float lllllllllllllIIIIIlIllIIIlIIIllI = 1.0f - lllllllllllllIIIIIlIllIIIlIIlIII * 0.4f;
            this.fogColorRed *= lllllllllllllIIIIIlIllIIIlIIIlll;
            this.fogColorGreen *= lllllllllllllIIIIIlIllIIIlIIIlll;
            this.fogColorBlue *= lllllllllllllIIIIIlIllIIIlIIIllI;
        }
        final float lllllllllllllIIIIIlIllIIIlIIIlIl = lllllllllllllIIIIIlIllIIIlIlIlII.getThunderStrength(lllllllllllllIIIIIlIllIIIlIlIlIl);
        if (lllllIIIIlllIII(lllllIIIlIlIllI(lllllllllllllIIIIIlIllIIIlIIIlIl, 0.0f))) {
            final float lllllllllllllIIIIIlIllIIIlIIIlII = 1.0f - lllllllllllllIIIIIlIllIIIlIIIlIl * 0.5f;
            this.fogColorRed *= lllllllllllllIIIIIlIllIIIlIIIlII;
            this.fogColorGreen *= lllllllllllllIIIIIlIllIIIlIIIlII;
            this.fogColorBlue *= lllllllllllllIIIIIlIllIIIlIIIlII;
        }
        final Block lllllllllllllIIIIIlIllIIIlIIIIll = ActiveRenderInfo.getBlockAtEntityViewpoint(this.mc.theWorld, lllllllllllllIIIIIlIllIIIlIlIIll, lllllllllllllIIIIIlIllIIIlIlIlIl);
        if (lllllIIIIllIIll(this.cloudFog ? 1 : 0)) {
            final Vec3 lllllllllllllIIIIIlIllIIIlIIIIlI = lllllllllllllIIIIIlIllIIIlIlIlII.getCloudColour(lllllllllllllIIIIIlIllIIIlIlIlIl);
            this.fogColorRed = (float)lllllllllllllIIIIIlIllIIIlIIIIlI.xCoord;
            this.fogColorGreen = (float)lllllllllllllIIIIIlIllIIIlIIIIlI.yCoord;
            this.fogColorBlue = (float)lllllllllllllIIIIIlIllIIIlIIIIlI.zCoord;
            "".length();
            if (null != null) {
                return;
            }
        }
        else if (lllllIIIIllllIl(lllllllllllllIIIIIlIllIIIlIIIIll.getMaterial(), Material.water)) {
            float lllllllllllllIIIIIlIllIIIlIIIIIl = EnchantmentHelper.getRespiration(lllllllllllllIIIIIlIllIIIlIlIIll) * 0.2f;
            if (lllllIIIIllIIll((lllllllllllllIIIIIlIllIIIlIlIIll instanceof EntityLivingBase) ? 1 : 0) && lllllIIIIllIIll(((EntityLivingBase)lllllllllllllIIIIIlIllIIIlIlIIll).isPotionActive(Potion.waterBreathing) ? 1 : 0)) {
                lllllllllllllIIIIIlIllIIIlIIIIIl = lllllllllllllIIIIIlIllIIIlIIIIIl * 0.3f + 0.6f;
            }
            this.fogColorRed = 0.02f + lllllllllllllIIIIIlIllIIIlIIIIIl;
            this.fogColorGreen = 0.02f + lllllllllllllIIIIIlIllIIIlIIIIIl;
            this.fogColorBlue = 0.2f + lllllllllllllIIIIIlIllIIIlIIIIIl;
            "".length();
            if (-"   ".length() >= 0) {
                return;
            }
        }
        else if (lllllIIIIllllIl(lllllllllllllIIIIIlIllIIIlIIIIll.getMaterial(), Material.lava)) {
            this.fogColorRed = 0.6f;
            this.fogColorGreen = 0.1f;
            this.fogColorBlue = 0.0f;
        }
        final float lllllllllllllIIIIIlIllIIIlIIIIII = this.fogColor2 + (this.fogColor1 - this.fogColor2) * lllllllllllllIIIIIlIllIIIlIlIlIl;
        this.fogColorRed *= lllllllllllllIIIIIlIllIIIlIIIIII;
        this.fogColorGreen *= lllllllllllllIIIIIlIllIIIlIIIIII;
        this.fogColorBlue *= lllllllllllllIIIIIlIllIIIlIIIIII;
        double lllllllllllllIIIIIlIllIIIIllllll = (lllllllllllllIIIIIlIllIIIlIlIIll.lastTickPosY + (lllllllllllllIIIIIlIllIIIlIlIIll.posY - lllllllllllllIIIIIlIllIIIlIlIIll.lastTickPosY) * lllllllllllllIIIIIlIllIIIlIlIlIl) * lllllllllllllIIIIIlIllIIIlIlIlII.provider.getVoidFogYFactor();
        if (lllllIIIIllIIll((lllllllllllllIIIIIlIllIIIlIlIIll instanceof EntityLivingBase) ? 1 : 0) && lllllIIIIllIIll(((EntityLivingBase)lllllllllllllIIIIIlIllIIIlIlIIll).isPotionActive(Potion.blindness) ? 1 : 0)) {
            final int lllllllllllllIIIIIlIllIIIIlllllI = ((EntityLivingBase)lllllllllllllIIIIIlIllIIIlIlIIll).getActivePotionEffect(Potion.blindness).getDuration();
            if (lllllIIIlIlIlII(lllllllllllllIIIIIlIllIIIIlllllI, EntityRenderer.lIllIIIllIIIlI[21])) {
                lllllllllllllIIIIIlIllIIIIllllll *= 1.0f - lllllllllllllIIIIIlIllIIIIlllllI / 20.0f;
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                lllllllllllllIIIIIlIllIIIIllllll = 0.0;
            }
        }
        if (lllllIIIlIIIIII(lllllIIIlIllIII(lllllllllllllIIIIIlIllIIIIllllll, 1.0))) {
            if (lllllIIIlIIIIII(lllllIIIlIllIII(lllllllllllllIIIIIlIllIIIIllllll, 0.0))) {
                lllllllllllllIIIIIlIllIIIIllllll = 0.0;
            }
            lllllllllllllIIIIIlIllIIIIllllll *= lllllllllllllIIIIIlIllIIIIllllll;
            this.fogColorRed *= (float)lllllllllllllIIIIIlIllIIIIllllll;
            this.fogColorGreen *= (float)lllllllllllllIIIIIlIllIIIIllllll;
            this.fogColorBlue *= (float)lllllllllllllIIIIIlIllIIIIllllll;
        }
        if (lllllIIIIlllIII(lllllIIIlIlIllI(this.bossColorModifier, 0.0f))) {
            final float lllllllllllllIIIIIlIllIIIIllllIl = this.bossColorModifierPrev + (this.bossColorModifier - this.bossColorModifierPrev) * lllllllllllllIIIIIlIllIIIlIlIlIl;
            this.fogColorRed = this.fogColorRed * (1.0f - lllllllllllllIIIIIlIllIIIIllllIl) + this.fogColorRed * 0.7f * lllllllllllllIIIIIlIllIIIIllllIl;
            this.fogColorGreen = this.fogColorGreen * (1.0f - lllllllllllllIIIIIlIllIIIIllllIl) + this.fogColorGreen * 0.6f * lllllllllllllIIIIIlIllIIIIllllIl;
            this.fogColorBlue = this.fogColorBlue * (1.0f - lllllllllllllIIIIIlIllIIIIllllIl) + this.fogColorBlue * 0.6f * lllllllllllllIIIIIlIllIIIIllllIl;
        }
        if (lllllIIIIllIIll((lllllllllllllIIIIIlIllIIIlIlIIll instanceof EntityLivingBase) ? 1 : 0) && lllllIIIIllIIll(((EntityLivingBase)lllllllllllllIIIIIlIllIIIlIlIIll).isPotionActive(Potion.nightVision) ? 1 : 0)) {
            final float lllllllllllllIIIIIlIllIIIIllllII = this.getNightVisionBrightness((EntityLivingBase)lllllllllllllIIIIIlIllIIIlIlIIll, lllllllllllllIIIIIlIllIIIlIlIlIl);
            float lllllllllllllIIIIIlIllIIIIlllIll = 1.0f / this.fogColorRed;
            if (lllllIIIIlllIII(lllllIIIlIlIllI(lllllllllllllIIIIIlIllIIIIlllIll, 1.0f / this.fogColorGreen))) {
                lllllllllllllIIIIIlIllIIIIlllIll = 1.0f / this.fogColorGreen;
            }
            if (lllllIIIIlllIII(lllllIIIlIlIllI(lllllllllllllIIIIIlIllIIIIlllIll, 1.0f / this.fogColorBlue))) {
                lllllllllllllIIIIIlIllIIIIlllIll = 1.0f / this.fogColorBlue;
            }
            this.fogColorRed = this.fogColorRed * (1.0f - lllllllllllllIIIIIlIllIIIIllllII) + this.fogColorRed * lllllllllllllIIIIIlIllIIIIlllIll * lllllllllllllIIIIIlIllIIIIllllII;
            this.fogColorGreen = this.fogColorGreen * (1.0f - lllllllllllllIIIIIlIllIIIIllllII) + this.fogColorGreen * lllllllllllllIIIIIlIllIIIIlllIll * lllllllllllllIIIIIlIllIIIIllllII;
            this.fogColorBlue = this.fogColorBlue * (1.0f - lllllllllllllIIIIIlIllIIIIllllII) + this.fogColorBlue * lllllllllllllIIIIIlIllIIIIlllIll * lllllllllllllIIIIIlIllIIIIllllII;
        }
        if (lllllIIIIllIIll(this.mc.gameSettings.anaglyph ? 1 : 0)) {
            final float lllllllllllllIIIIIlIllIIIIlllIlI = (this.fogColorRed * 30.0f + this.fogColorGreen * 59.0f + this.fogColorBlue * 11.0f) / 100.0f;
            final float lllllllllllllIIIIIlIllIIIIlllIIl = (this.fogColorRed * 30.0f + this.fogColorGreen * 70.0f) / 100.0f;
            final float lllllllllllllIIIIIlIllIIIIlllIII = (this.fogColorRed * 30.0f + this.fogColorBlue * 70.0f) / 100.0f;
            this.fogColorRed = lllllllllllllIIIIIlIllIIIIlllIlI;
            this.fogColorGreen = lllllllllllllIIIIIlIllIIIIlllIIl;
            this.fogColorBlue = lllllllllllllIIIIIlIllIIIIlllIII;
        }
        GlStateManager.clearColor(this.fogColorRed, this.fogColorGreen, this.fogColorBlue, 0.0f);
    }
    
    private static int lllllIIIIllllll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public void disableLightmap() {
        GlStateManager.setActiveTexture(OpenGlHelper.lightmapTexUnit);
        GlStateManager.disableTexture2D();
        GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
    }
    
    private static int lllllIIIlIIlIll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static int lllllIIIlIlIIIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private void renderCloudsCheck(final RenderGlobal lllllllllllllIIIIIlIllIlIIlIllII, final float lllllllllllllIIIIIlIllIlIIlIIlll, final int lllllllllllllIIIIIlIllIlIIlIlIlI) {
        if (lllllIIIIllIIll(this.mc.gameSettings.func_181147_e())) {
            this.mc.mcProfiler.endStartSection(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[85]]);
            GlStateManager.matrixMode(EntityRenderer.lIllIIIllIIIlI[35]);
            GlStateManager.loadIdentity();
            Project.gluPerspective(this.getFOVModifier(lllllllllllllIIIIIlIllIlIIlIIlll, (boolean)(EntityRenderer.lIllIIIllIIIlI[1] != 0)), this.mc.displayWidth / (float)this.mc.displayHeight, 0.05f, this.farPlaneDistance * 4.0f);
            GlStateManager.matrixMode(EntityRenderer.lIllIIIllIIIlI[36]);
            GlStateManager.pushMatrix();
            this.setupFog(EntityRenderer.lIllIIIllIIIlI[0], lllllllllllllIIIIIlIllIlIIlIIlll);
            lllllllllllllIIIIIlIllIlIIlIllII.renderClouds(lllllllllllllIIIIIlIllIlIIlIIlll, lllllllllllllIIIIIlIllIlIIlIlIlI);
            GlStateManager.disableFog();
            GlStateManager.popMatrix();
            GlStateManager.matrixMode(EntityRenderer.lIllIIIllIIIlI[35]);
            GlStateManager.loadIdentity();
            Project.gluPerspective(this.getFOVModifier(lllllllllllllIIIIIlIllIlIIlIIlll, (boolean)(EntityRenderer.lIllIIIllIIIlI[1] != 0)), this.mc.displayWidth / (float)this.mc.displayHeight, 0.05f, this.farPlaneDistance * MathHelper.SQRT_2);
            GlStateManager.matrixMode(EntityRenderer.lIllIIIllIIIlI[36]);
        }
    }
    
    public EntityRenderer(final Minecraft lllllllllllllIIIIIlIllllIIlllIIl, final IResourceManager lllllllllllllIIIIIlIllllIIllIIII) {
        this.random = new Random();
        this.mouseFilterXAxis = new MouseFilter();
        this.mouseFilterYAxis = new MouseFilter();
        this.thirdPersonDistance = 4.0f;
        this.thirdPersonDistanceTemp = 4.0f;
        this.renderHand = (EntityRenderer.lIllIIIllIIIlI[1] != 0);
        this.drawBlockOutline = (EntityRenderer.lIllIIIllIIIlI[1] != 0);
        this.prevFrameTime = Minecraft.getSystemTime();
        this.rainXCoords = new float[EntityRenderer.lIllIIIllIIIlI[26]];
        this.rainYCoords = new float[EntityRenderer.lIllIIIllIIIlI[26]];
        this.fogColorBuffer = GLAllocation.createDirectFloatBuffer(EntityRenderer.lIllIIIllIIIlI[17]);
        this.debugViewDirection = EntityRenderer.lIllIIIllIIIlI[0];
        this.debugView = (EntityRenderer.lIllIIIllIIIlI[0] != 0);
        this.cameraZoom = 1.0;
        this.shaderIndex = EntityRenderer.shaderCount;
        this.useShader = (EntityRenderer.lIllIIIllIIIlI[0] != 0);
        this.frameCount = EntityRenderer.lIllIIIllIIIlI[0];
        this.mc = lllllllllllllIIIIIlIllllIIlllIIl;
        this.resourceManager = lllllllllllllIIIIIlIllllIIllIIII;
        this.itemRenderer = lllllllllllllIIIIIlIllllIIlllIIl.getItemRenderer();
        this.theMapItemRenderer = new MapItemRenderer(lllllllllllllIIIIIlIllllIIlllIIl.getTextureManager());
        this.lightmapTexture = new DynamicTexture(EntityRenderer.lIllIIIllIIIlI[17], EntityRenderer.lIllIIIllIIIlI[17]);
        this.locationLightMap = lllllllllllllIIIIIlIllllIIlllIIl.getTextureManager().getDynamicTextureLocation(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[27]], this.lightmapTexture);
        this.lightmapColors = this.lightmapTexture.getTextureData();
        this.theShaderGroup = null;
        int lllllllllllllIIIIIlIllllIIllIlll = EntityRenderer.lIllIIIllIIIlI[0];
        "".length();
        if (-" ".length() >= ((0x29 ^ 0x24) & ~(0x50 ^ 0x5D))) {
            throw null;
        }
        while (!lllllIIIIllIIlI(lllllllllllllIIIIIlIllllIIllIlll, EntityRenderer.lIllIIIllIIIlI[28])) {
            int lllllllllllllIIIIIlIllllIIllIllI = EntityRenderer.lIllIIIllIIIlI[0];
            "".length();
            if (null != null) {
                throw null;
            }
            while (!lllllIIIIllIIlI(lllllllllllllIIIIIlIllllIIllIllI, EntityRenderer.lIllIIIllIIIlI[28])) {
                final float lllllllllllllIIIIIlIllllIIllIlIl = (float)(lllllllllllllIIIIIlIllllIIllIllI - EntityRenderer.lIllIIIllIIIlI[17]);
                final float lllllllllllllIIIIIlIllllIIllIlII = (float)(lllllllllllllIIIIIlIllllIIllIlll - EntityRenderer.lIllIIIllIIIlI[17]);
                final float lllllllllllllIIIIIlIllllIIllIIll = MathHelper.sqrt_float(lllllllllllllIIIIIlIllllIIllIlIl * lllllllllllllIIIIIlIllllIIllIlIl + lllllllllllllIIIIIlIllllIIllIlII * lllllllllllllIIIIIlIllllIIllIlII);
                this.rainXCoords[lllllllllllllIIIIIlIllllIIllIlll << EntityRenderer.lIllIIIllIIIlI[6] | lllllllllllllIIIIIlIllllIIllIllI] = -lllllllllllllIIIIIlIllllIIllIlII / lllllllllllllIIIIIlIllllIIllIIll;
                this.rainYCoords[lllllllllllllIIIIIlIllllIIllIlll << EntityRenderer.lIllIIIllIIIlI[6] | lllllllllllllIIIIIlIllllIIllIllI] = lllllllllllllIIIIIlIllllIIllIlIl / lllllllllllllIIIIIlIllllIIllIIll;
                ++lllllllllllllIIIIIlIllllIIllIllI;
            }
            ++lllllllllllllIIIIIlIllllIIllIlll;
        }
    }
    
    private float getFOVModifier(final float lllllllllllllIIIIIlIlllIlIlIIlII, final boolean lllllllllllllIIIIIlIlllIlIIlllII) {
        if (lllllIIIIllIIll(this.debugView ? 1 : 0)) {
            return 90.0f;
        }
        final Entity lllllllllllllIIIIIlIlllIlIlIIIlI = this.mc.getRenderViewEntity();
        float lllllllllllllIIIIIlIlllIlIlIIIIl = 70.0f;
        if (lllllIIIIllIIll(lllllllllllllIIIIIlIlllIlIIlllII ? 1 : 0)) {
            lllllllllllllIIIIIlIlllIlIlIIIIl = this.mc.gameSettings.fovSetting;
            lllllllllllllIIIIIlIlllIlIlIIIIl *= this.fovModifierHandPrev + (this.fovModifierHand - this.fovModifierHandPrev) * lllllllllllllIIIIIlIlllIlIlIIlII;
        }
        if (lllllIIIIllIIll((lllllllllllllIIIIIlIlllIlIlIIIlI instanceof EntityLivingBase) ? 1 : 0) && lllllIIIlIIIIlI(lllllIIIlIIIIIl(((EntityLivingBase)lllllllllllllIIIIIlIlllIlIlIIIlI).getHealth(), 0.0f))) {
            final float lllllllllllllIIIIIlIlllIlIlIIIII = ((EntityLivingBase)lllllllllllllIIIIIlIlllIlIlIIIlI).deathTime + lllllllllllllIIIIIlIlllIlIlIIlII;
            lllllllllllllIIIIIlIlllIlIlIIIIl /= (1.0f - 500.0f / (lllllllllllllIIIIIlIlllIlIlIIIII + 500.0f)) * 2.0f + 1.0f;
        }
        final Block lllllllllllllIIIIIlIlllIlIIlllll = ActiveRenderInfo.getBlockAtEntityViewpoint(this.mc.theWorld, lllllllllllllIIIIIlIlllIlIlIIIlI, lllllllllllllIIIIIlIlllIlIlIIlII);
        if (lllllIIIIllllIl(lllllllllllllIIIIIlIlllIlIIlllll.getMaterial(), Material.water)) {
            lllllllllllllIIIIIlIlllIlIlIIIIl = lllllllllllllIIIIIlIlllIlIlIIIIl * 60.0f / 70.0f;
        }
        return lllllllllllllIIIIIlIlllIlIlIIIIl;
    }
    
    private static boolean lllllIIIIllIlIl(final int lllllllllllllIIIIIlIlIlllIIllIII, final int lllllllllllllIIIIIlIlIlllIIlIlll) {
        return lllllllllllllIIIIIlIlIlllIIllIII != lllllllllllllIIIIIlIlIlllIIlIlll;
    }
    
    private static int lllllIIIlIIlIII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static String lllllIIIIIlllIl(final String lllllllllllllIIIIIlIlIllllIllIIl, final String lllllllllllllIIIIIlIlIllllIlIllI) {
        try {
            final SecretKeySpec lllllllllllllIIIIIlIlIllllIlllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIlIlIllllIlIllI.getBytes(StandardCharsets.UTF_8)), EntityRenderer.lIllIIIllIIIlI[9]), "DES");
            final Cipher lllllllllllllIIIIIlIlIllllIllIll = Cipher.getInstance("DES");
            lllllllllllllIIIIIlIlIllllIllIll.init(EntityRenderer.lIllIIIllIIIlI[3], lllllllllllllIIIIIlIlIllllIlllII);
            return new String(lllllllllllllIIIIIlIlIllllIllIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIlIlIllllIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIlIlIllllIllIlI) {
            lllllllllllllIIIIIlIlIllllIllIlI.printStackTrace();
            return null;
        }
    }
    
    public void updateRenderer() {
        if (lllllIIIIllIIll(OpenGlHelper.shadersSupported ? 1 : 0) && lllllIIIIllIlll(ShaderLinkHelper.getStaticShaderLinkHelper())) {
            ShaderLinkHelper.setNewStaticShaderLinkHelper();
        }
        this.updateFovModifierHand();
        this.updateTorchFlicker();
        this.fogColor2 = this.fogColor1;
        this.thirdPersonDistanceTemp = this.thirdPersonDistance;
        if (lllllIIIIllIIll(this.mc.gameSettings.smoothCamera ? 1 : 0)) {
            final float lllllllllllllIIIIIlIllllIIIIIlIl = this.mc.gameSettings.mouseSensitivity * 0.6f + 0.2f;
            final float lllllllllllllIIIIIlIllllIIIIIlII = lllllllllllllIIIIIlIllllIIIIIlIl * lllllllllllllIIIIIlIllllIIIIIlIl * lllllllllllllIIIIIlIllllIIIIIlIl * 8.0f;
            this.smoothCamFilterX = this.mouseFilterXAxis.smooth(this.smoothCamYaw, 0.05f * lllllllllllllIIIIIlIllllIIIIIlII);
            this.smoothCamFilterY = this.mouseFilterYAxis.smooth(this.smoothCamPitch, 0.05f * lllllllllllllIIIIIlIllllIIIIIlII);
            this.smoothCamPartialTicks = 0.0f;
            this.smoothCamYaw = 0.0f;
            this.smoothCamPitch = 0.0f;
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            this.smoothCamFilterX = 0.0f;
            this.smoothCamFilterY = 0.0f;
            this.mouseFilterXAxis.reset();
            this.mouseFilterYAxis.reset();
        }
        if (lllllIIIIllIlll(this.mc.getRenderViewEntity())) {
            this.mc.setRenderViewEntity(this.mc.thePlayer);
        }
        final float lllllllllllllIIIIIlIllllIIIIIIll = this.mc.theWorld.getLightBrightness(new BlockPos(this.mc.getRenderViewEntity()));
        final float lllllllllllllIIIIIlIllllIIIIIIlI = this.mc.gameSettings.renderDistanceChunks / 32.0f;
        final float lllllllllllllIIIIIlIllllIIIIIIIl = lllllllllllllIIIIIlIllllIIIIIIll * (1.0f - lllllllllllllIIIIIlIllllIIIIIIlI) + lllllllllllllIIIIIlIllllIIIIIIlI;
        this.fogColor1 += (lllllllllllllIIIIIlIllllIIIIIIIl - this.fogColor1) * 0.1f;
        this.rendererUpdateCount += EntityRenderer.lIllIIIllIIIlI[1];
        this.itemRenderer.updateEquippedItem();
        this.addRainParticles();
        this.bossColorModifierPrev = this.bossColorModifier;
        if (lllllIIIIllIIll(BossStatus.hasColorModifier ? 1 : 0)) {
            this.bossColorModifier += 0.05f;
            if (lllllIIIIlllIII(lllllIIIIllIllI(this.bossColorModifier, 1.0f))) {
                this.bossColorModifier = 1.0f;
            }
            BossStatus.hasColorModifier = (EntityRenderer.lIllIIIllIIIlI[0] != 0);
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        }
        else if (lllllIIIIlllIII(lllllIIIIllIllI(this.bossColorModifier, 0.0f))) {
            this.bossColorModifier -= 0.0125f;
        }
    }
    
    public void renderWorld(final float lllllllllllllIIIIIlIllIlIlIllIll, final long lllllllllllllIIIIIlIllIlIlIlllIl) {
        this.updateLightmap(lllllllllllllIIIIIlIllIlIlIllIll);
        if (lllllIIIIllIlll(this.mc.getRenderViewEntity())) {
            this.mc.setRenderViewEntity(this.mc.thePlayer);
        }
        this.getMouseOver(lllllllllllllIIIIIlIllIlIlIllIll);
        GlStateManager.enableDepth();
        GlStateManager.enableAlpha();
        GlStateManager.alphaFunc(EntityRenderer.lIllIIIllIIIlI[55], 0.5f);
        this.mc.mcProfiler.startSection(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[63]]);
        if (lllllIIIIllIIll(this.mc.gameSettings.anaglyph ? 1 : 0)) {
            EntityRenderer.anaglyphField = EntityRenderer.lIllIIIllIIIlI[0];
            GlStateManager.colorMask((boolean)(EntityRenderer.lIllIIIllIIIlI[0] != 0), (boolean)(EntityRenderer.lIllIIIllIIIlI[1] != 0), (boolean)(EntityRenderer.lIllIIIllIIIlI[1] != 0), (boolean)(EntityRenderer.lIllIIIllIIIlI[0] != 0));
            this.renderWorldPass(EntityRenderer.lIllIIIllIIIlI[0], lllllllllllllIIIIIlIllIlIlIllIll, lllllllllllllIIIIIlIllIlIlIlllIl);
            EntityRenderer.anaglyphField = EntityRenderer.lIllIIIllIIIlI[1];
            GlStateManager.colorMask((boolean)(EntityRenderer.lIllIIIllIIIlI[1] != 0), (boolean)(EntityRenderer.lIllIIIllIIIlI[0] != 0), (boolean)(EntityRenderer.lIllIIIllIIIlI[0] != 0), (boolean)(EntityRenderer.lIllIIIllIIIlI[0] != 0));
            this.renderWorldPass(EntityRenderer.lIllIIIllIIIlI[1], lllllllllllllIIIIIlIllIlIlIllIll, lllllllllllllIIIIIlIllIlIlIlllIl);
            GlStateManager.colorMask((boolean)(EntityRenderer.lIllIIIllIIIlI[1] != 0), (boolean)(EntityRenderer.lIllIIIllIIIlI[1] != 0), (boolean)(EntityRenderer.lIllIIIllIIIlI[1] != 0), (boolean)(EntityRenderer.lIllIIIllIIIlI[0] != 0));
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            this.renderWorldPass(EntityRenderer.lIllIIIllIIIlI[3], lllllllllllllIIIIIlIllIlIlIllIll, lllllllllllllIIIIIlIllIlIlIlllIl);
        }
        this.mc.mcProfiler.endSection();
    }
    
    private static boolean lllllIIIIllIlll(final Object lllllllllllllIIIIIlIlIlllIlIIlll) {
        return lllllllllllllIIIIIlIlIlllIlIIlll == null;
    }
    
    private static int lllllIIIlIIIIll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private void updateTorchFlicker() {
        this.torchFlickerDX += (float)((Math.random() - Math.random()) * Math.random() * Math.random());
        this.torchFlickerDX *= (float)0.9;
        this.torchFlickerX += (this.torchFlickerDX - this.torchFlickerX) * 1.0f;
        this.lightmapUpdateNeeded = (EntityRenderer.lIllIIIllIIIlI[1] != 0);
    }
    
    private float getNightVisionBrightness(final EntityLivingBase lllllllllllllIIIIIlIllIllIlllIIl, final float lllllllllllllIIIIIlIllIllIlllIII) {
        final int lllllllllllllIIIIIlIllIllIllIlll = lllllllllllllIIIIIlIllIllIlllIIl.getActivePotionEffect(Potion.nightVision).getDuration();
        float n;
        if (lllllIIIlIIlIlI(lllllllllllllIIIIIlIllIllIllIlll, EntityRenderer.lIllIIIllIIIlI[48])) {
            n = 1.0f;
            "".length();
            if (" ".length() <= ((0x24 ^ 0x3) & ~(0x16 ^ 0x31))) {
                return 0.0f;
            }
        }
        else {
            n = 0.7f + MathHelper.sin((lllllllllllllIIIIIlIllIllIllIlll - lllllllllllllIIIIIlIllIllIlllIII) * 3.1415927f * 0.2f) * 0.3f;
        }
        return n;
    }
    
    private static int lllllIIIIllIllI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static int lllllIIIlIIlIIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public void enableLightmap() {
        GlStateManager.setActiveTexture(OpenGlHelper.lightmapTexUnit);
        GlStateManager.matrixMode(EntityRenderer.lIllIIIllIIIlI[37]);
        GlStateManager.loadIdentity();
        final float lllllllllllllIIIIIlIlllIIIIIlIll = 0.00390625f;
        GlStateManager.scale(lllllllllllllIIIIIlIlllIIIIIlIll, lllllllllllllIIIIIlIlllIIIIIlIll, lllllllllllllIIIIIlIlllIIIIIlIll);
        GlStateManager.translate(8.0f, 8.0f, 8.0f);
        GlStateManager.matrixMode(EntityRenderer.lIllIIIllIIIlI[36]);
        this.mc.getTextureManager().bindTexture(this.locationLightMap);
        GL11.glTexParameteri(EntityRenderer.lIllIIIllIIIlI[38], EntityRenderer.lIllIIIllIIIlI[39], EntityRenderer.lIllIIIllIIIlI[40]);
        GL11.glTexParameteri(EntityRenderer.lIllIIIllIIIlI[38], EntityRenderer.lIllIIIllIIIlI[41], EntityRenderer.lIllIIIllIIIlI[40]);
        GL11.glTexParameteri(EntityRenderer.lIllIIIllIIIlI[38], EntityRenderer.lIllIIIllIIIlI[42], EntityRenderer.lIllIIIllIIIlI[43]);
        GL11.glTexParameteri(EntityRenderer.lIllIIIllIIIlI[38], EntityRenderer.lIllIIIllIIIlI[44], EntityRenderer.lIllIIIllIIIlI[43]);
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.enableTexture2D();
        GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
    }
    
    private static void lllllIIIIllIIIl() {
        (lIllIIIllIIIlI = new int[102])[0] = ((0x55 ^ 0x2D ^ (0x2A ^ 0x12)) & (0x28 ^ 0x7B ^ (0x65 ^ 0x76) ^ -" ".length()));
        EntityRenderer.lIllIIIllIIIlI[1] = " ".length();
        EntityRenderer.lIllIIIllIIIlI[2] = (0x45 ^ 0x4B ^ (0x2 ^ 0x14));
        EntityRenderer.lIllIIIllIIIlI[3] = "  ".length();
        EntityRenderer.lIllIIIllIIIlI[4] = "   ".length();
        EntityRenderer.lIllIIIllIIIlI[5] = (126 + 31 - 49 + 62 ^ 12 + 22 + 73 + 67);
        EntityRenderer.lIllIIIllIIIlI[6] = (0xB0 ^ 0xB5);
        EntityRenderer.lIllIIIllIIIlI[7] = (0xA3 ^ 0x9F ^ (0x74 ^ 0x4E));
        EntityRenderer.lIllIIIllIIIlI[8] = (0x98 ^ 0x9F);
        EntityRenderer.lIllIIIllIIIlI[9] = (0x91 ^ 0x99);
        EntityRenderer.lIllIIIllIIIlI[10] = ("  ".length() ^ (0x36 ^ 0x3D));
        EntityRenderer.lIllIIIllIIIlI[11] = (0x96 ^ 0x9C);
        EntityRenderer.lIllIIIllIIIlI[12] = (0x9A ^ 0x91);
        EntityRenderer.lIllIIIllIIIlI[13] = (0x9 ^ 0x5);
        EntityRenderer.lIllIIIllIIIlI[14] = (0xB1 ^ 0xBC);
        EntityRenderer.lIllIIIllIIIlI[15] = (0xCE ^ 0x89 ^ (0xD8 ^ 0x91));
        EntityRenderer.lIllIIIllIIIlI[16] = (0x7 ^ 0x51 ^ (0xF0 ^ 0xA9));
        EntityRenderer.lIllIIIllIIIlI[17] = (0x93 ^ 0x9D ^ (0x16 ^ 0x8));
        EntityRenderer.lIllIIIllIIIlI[18] = (0x92 ^ 0x83);
        EntityRenderer.lIllIIIllIIIlI[19] = (0x57 ^ 0x10 ^ (0x16 ^ 0x43));
        EntityRenderer.lIllIIIllIIIlI[20] = (0x9E ^ 0x8D);
        EntityRenderer.lIllIIIllIIIlI[21] = (0x6 ^ 0x70 ^ (0xF0 ^ 0x92));
        EntityRenderer.lIllIIIllIIIlI[22] = (0xE5 ^ 0x83 ^ (0x1E ^ 0x6D));
        EntityRenderer.lIllIIIllIIIlI[23] = (57 + 149 - 15 + 17 ^ 77 + 151 - 70 + 40);
        EntityRenderer.lIllIIIllIIIlI[24] = (0x4F ^ 0x58);
        EntityRenderer.lIllIIIllIIIlI[25] = (0x32 ^ 0x2B);
        EntityRenderer.lIllIIIllIIIlI[26] = (-(0xFFFFDAFB & 0x7FFE) & (0xFFFFDFFB & 0x7EFD));
        EntityRenderer.lIllIIIllIIIlI[27] = (0x91 ^ 0x8B);
        EntityRenderer.lIllIIIllIIIlI[28] = (74 + 116 - 127 + 70 ^ 38 + 38 + 13 + 76);
        EntityRenderer.lIllIIIllIIIlI[29] = (0x7D ^ 0x50 ^ (0xAC ^ 0x9A));
        EntityRenderer.lIllIIIllIIIlI[30] = (0x31 ^ 0x8 ^ (0xF ^ 0x2A));
        EntityRenderer.lIllIIIllIIIlI[31] = (70 + 51 - 35 + 86 ^ 140 + 7 - 20 + 50);
        EntityRenderer.lIllIIIllIIIlI[32] = (0xB3 ^ 0xAD);
        EntityRenderer.lIllIIIllIIIlI[33] = (98 + 15 - 31 + 52 ^ 71 + 117 - 83 + 48);
        EntityRenderer.lIllIIIllIIIlI[34] = (0x45 ^ 0x1F);
        EntityRenderer.lIllIIIllIIIlI[35] = (-(0xFFFF9AE7 & 0x6D7F) & (0xFFFFFFEF & 0x1F77));
        EntityRenderer.lIllIIIllIIIlI[36] = (0xFFFF9FFA & 0x7705);
        EntityRenderer.lIllIIIllIIIlI[37] = (-(0xFFFFE8E6 & 0x5F3F) & (0xFFFFDF27 & 0x7FFF));
        EntityRenderer.lIllIIIllIIIlI[38] = (0xFFFFEDFF & 0x1FE1);
        EntityRenderer.lIllIIIllIIIlI[39] = (-(0xFFFFD2ED & 0x7F7F) & (0xFFFFFB6F & 0x7EFD));
        EntityRenderer.lIllIIIllIIIlI[40] = (0xFFFFBF11 & 0x66EF);
        EntityRenderer.lIllIIIllIIIlI[41] = (-(0xFFFF96F1 & 0x7BFF) & (0xFFFFFEF1 & 0x3BFE));
        EntityRenderer.lIllIIIllIIIlI[42] = (-(0xFFFFFFEF & 0x47D2) & (0xFFFFEFD3 & 0x7FEF));
        EntityRenderer.lIllIIIllIIIlI[43] = (0xFFFFAD8E & 0x7B71);
        EntityRenderer.lIllIIIllIIIlI[44] = (0xFFFFFE93 & 0x296F);
        EntityRenderer.lIllIIIllIIIlI[45] = (0x78 ^ 0x59);
        EntityRenderer.lIllIIIllIIIlI[46] = 115 + 153 - 99 + 86;
        EntityRenderer.lIllIIIllIIIlI[47] = (0xFFFFB74F & 0x49B0);
        EntityRenderer.lIllIIIllIIIlI[48] = 59 + 94 - 110 + 157;
        EntityRenderer.lIllIIIllIIIlI[49] = (0x1E ^ 0x3C);
        EntityRenderer.lIllIIIllIIIlI[50] = -" ".length();
        EntityRenderer.lIllIIIllIIIlI[51] = (0x22 ^ 0x1B ^ (0x87 ^ 0x9D));
        EntityRenderer.lIllIIIllIIIlI[52] = (0x62 ^ 0x5E);
        EntityRenderer.lIllIIIllIIIlI[53] = (-(0xFFFFF7BB & 0x1DE6) & (0xFFFFFFB1 & 0x3B9ADFEF));
        EntityRenderer.lIllIIIllIIIlI[54] = (0x96 ^ 0xB2);
        EntityRenderer.lIllIIIllIIIlI[55] = (-(0xFFFFE49F & 0x1F79) & (0xFFFF97FC & 0x6E1F));
        EntityRenderer.lIllIIIllIIIlI[56] = (0xB1 ^ 0x94);
        EntityRenderer.lIllIIIllIIIlI[57] = (0x8 ^ 0x3A ^ (0x24 ^ 0x30));
        EntityRenderer.lIllIIIllIIIlI[58] = (0xBB ^ 0x9C);
        EntityRenderer.lIllIIIllIIIlI[59] = (0x11 ^ 0x15 ^ (0x9A ^ 0xB6));
        EntityRenderer.lIllIIIllIIIlI[60] = (0xAE ^ 0x87);
        EntityRenderer.lIllIIIllIIIlI[61] = (-(0xFFFFDE3F & 0x35D9) & (0xFFFFD7DF & 0x3F3A));
        EntityRenderer.lIllIIIllIIIlI[62] = (0xFFFFABD7 & 0x572B);
        EntityRenderer.lIllIIIllIIIlI[63] = (0x53 ^ 0x79);
        EntityRenderer.lIllIIIllIIIlI[64] = (18 + 102 - 13 + 47 ^ 125 + 163 - 255 + 144);
        EntityRenderer.lIllIIIllIIIlI[65] = (0xFFFFD100 & 0x6FFF);
        EntityRenderer.lIllIIIllIIIlI[66] = (159 + 146 - 298 + 161 ^ 67 + 119 - 178 + 124);
        EntityRenderer.lIllIIIllIIIlI[67] = (0x6A ^ 0x67 ^ (0x25 ^ 0x5));
        EntityRenderer.lIllIIIllIIIlI[68] = (0x27 ^ 0x6B ^ (0x1E ^ 0x7C));
        EntityRenderer.lIllIIIllIIIlI[69] = (34 + 105 - 135 + 135 ^ 12 + 37 + 113 + 2);
        EntityRenderer.lIllIIIllIIIlI[70] = (0xFFFFDFE1 & 0x3D1F);
        EntityRenderer.lIllIIIllIIIlI[71] = (0xC ^ 0x7E ^ (0x60 ^ 0x22));
        EntityRenderer.lIllIIIllIIIlI[72] = (21 + 153 - 87 + 80 ^ 97 + 99 - 189 + 143);
        EntityRenderer.lIllIIIllIIIlI[73] = (0x8A ^ 0xB8);
        EntityRenderer.lIllIIIllIIIlI[74] = (0x4A ^ 0x79);
        EntityRenderer.lIllIIIllIIIlI[75] = (-(0x93 ^ 0x9E) & (0xFFFF9F1F & 0x7DEC));
        EntityRenderer.lIllIIIllIIIlI[76] = (0x7D ^ 0x3D ^ (0x22 ^ 0x56));
        EntityRenderer.lIllIIIllIIIlI[77] = (0x33 ^ 0x6);
        EntityRenderer.lIllIIIllIIIlI[78] = (82 + 35 + 36 + 20 ^ 62 + 102 - 131 + 122);
        EntityRenderer.lIllIIIllIIIlI[79] = (124 + 73 - 188 + 139 ^ 49 + 2 + 54 + 58);
        EntityRenderer.lIllIIIllIIIlI[80] = (0xA1 ^ 0x99);
        EntityRenderer.lIllIIIllIIIlI[81] = (0x42 ^ 0x49 ^ (0xB7 ^ 0x85));
        EntityRenderer.lIllIIIllIIIlI[82] = (0x49 ^ 0x73);
        EntityRenderer.lIllIIIllIIIlI[83] = (51 + 1 + 17 + 122 ^ 7 + 40 + 55 + 30);
        EntityRenderer.lIllIIIllIIIlI[84] = (0x37 ^ 0xA);
        EntityRenderer.lIllIIIllIIIlI[85] = (0xB7 ^ 0x89);
        EntityRenderer.lIllIIIllIIIlI[86] = (0x9D ^ 0xA2);
        EntityRenderer.lIllIIIllIIIlI[87] = (176 + 28 - 17 + 61 ^ 127 + 141 - 225 + 141);
        EntityRenderer.lIllIIIllIIIlI[88] = (-(0xFFFFDBCF & 0x37F3) & (0xFFFFFFFB & 0x1FF7));
        EntityRenderer.lIllIIIllIIIlI[89] = (0xFFFFDFFF & 0x2B26ABB);
        EntityRenderer.lIllIIIllIIIlI[90] = (0xFFFFF39F & 0x66FF7);
        EntityRenderer.lIllIIIllIIIlI[91] = (0xFFFFFFE9 & 0x35D7);
        EntityRenderer.lIllIIIllIIIlI[92] = (-1 & 0xFFFF);
        EntityRenderer.lIllIIIllIIIlI[93] = (-(0xFFFFFFAF & 0x4251) & (0xFFFFCFFF & 0x73FF));
        EntityRenderer.lIllIIIllIIIlI[94] = (-(0xFFFFF39B & 0x2E6F) & (0xFFFFF6FF & 0xF02BFA));
        EntityRenderer.lIllIIIllIIIlI[95] = (-(0xFFFFFD9F & 0x7669) & (0xFFFFFFEF & 0x7F7E));
        EntityRenderer.lIllIIIllIIIlI[96] = (0xFFFF857B & 0xFFDE);
        EntityRenderer.lIllIIIllIIIlI[97] = (-(0xFFFFB875 & 0x7FAF) & (0xFFFFBDFF & 0xFF7F));
        EntityRenderer.lIllIIIllIIIlI[98] = (-(0xFFFFD47A & 0x7F97) & (0xFFFFFEB1 & 0x5D5F));
        EntityRenderer.lIllIIIllIIIlI[99] = (0xFFFFD514 & 0x2EEF);
        EntityRenderer.lIllIIIllIIIlI[100] = (-(0xFFFFCC9E & 0x7FEB) & (0xFFFFDFB9 & 0x7ECF));
        EntityRenderer.lIllIIIllIIIlI[101] = (0x24 ^ 0x7B ^ (0x67 ^ 0x79));
    }
    
    private FloatBuffer setFogColorBuffer(final float lllllllllllllIIIIIlIllIIIIIIIllI, final float lllllllllllllIIIIIlIllIIIIIIIIII, final float lllllllllllllIIIIIlIlIllllllllll, final float lllllllllllllIIIIIlIllIIIIIIIIll) {
        this.fogColorBuffer.clear();
        "".length();
        this.fogColorBuffer.put(lllllllllllllIIIIIlIllIIIIIIIllI).put(lllllllllllllIIIIIlIllIIIIIIIIII).put(lllllllllllllIIIIIlIlIllllllllll).put(lllllllllllllIIIIIlIllIIIIIIIIll);
        "".length();
        this.fogColorBuffer.flip();
        "".length();
        return this.fogColorBuffer;
    }
    
    private static int lllllIIIIlllIlI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean lllllIIIIllllII(final int lllllllllllllIIIIIlIlIlllIlIIIll) {
        return lllllllllllllIIIIIlIlIlllIlIIIll == 0;
    }
    
    private void setupCameraTransform(final float lllllllllllllIIIIIlIlllIIIlIIlII, final int lllllllllllllIIIIIlIlllIIIlIIIll) {
        this.farPlaneDistance = (float)(this.mc.gameSettings.renderDistanceChunks * EntityRenderer.lIllIIIllIIIlI[17]);
        GlStateManager.matrixMode(EntityRenderer.lIllIIIllIIIlI[35]);
        GlStateManager.loadIdentity();
        final float lllllllllllllIIIIIlIlllIIIlIlIIl = 0.07f;
        if (lllllIIIIllIIll(this.mc.gameSettings.anaglyph ? 1 : 0)) {
            GlStateManager.translate(-(lllllllllllllIIIIIlIlllIIIlIIIll * EntityRenderer.lIllIIIllIIIlI[3] - EntityRenderer.lIllIIIllIIIlI[1]) * lllllllllllllIIIIIlIlllIIIlIlIIl, 0.0f, 0.0f);
        }
        if (lllllIIIIllIIll(lllllIIIlIIIllI(this.cameraZoom, 1.0))) {
            GlStateManager.translate((float)this.cameraYaw, (float)(-this.cameraPitch), 0.0f);
            GlStateManager.scale(this.cameraZoom, this.cameraZoom, 1.0);
        }
        Project.gluPerspective(this.getFOVModifier(lllllllllllllIIIIIlIlllIIIlIIlII, (boolean)(EntityRenderer.lIllIIIllIIIlI[1] != 0)), this.mc.displayWidth / (float)this.mc.displayHeight, 0.05f, this.farPlaneDistance * MathHelper.SQRT_2);
        GlStateManager.matrixMode(EntityRenderer.lIllIIIllIIIlI[36]);
        GlStateManager.loadIdentity();
        if (lllllIIIIllIIll(this.mc.gameSettings.anaglyph ? 1 : 0)) {
            GlStateManager.translate((lllllllllllllIIIIIlIlllIIIlIIIll * EntityRenderer.lIllIIIllIIIlI[3] - EntityRenderer.lIllIIIllIIIlI[1]) * 0.1f, 0.0f, 0.0f);
        }
        this.hurtCameraEffect(lllllllllllllIIIIIlIlllIIIlIIlII);
        if (lllllIIIIllIIll(this.mc.gameSettings.viewBobbing ? 1 : 0)) {
            this.setupViewBobbing(lllllllllllllIIIIIlIlllIIIlIIlII);
        }
        final float lllllllllllllIIIIIlIlllIIIlIlIII = this.mc.thePlayer.prevTimeInPortal + (this.mc.thePlayer.timeInPortal - this.mc.thePlayer.prevTimeInPortal) * lllllllllllllIIIIIlIlllIIIlIIlII;
        if (lllllIIIIlllIII(lllllIIIlIIIlll(lllllllllllllIIIIIlIlllIIIlIlIII, 0.0f))) {
            int lllllllllllllIIIIIlIlllIIIlIIlll = EntityRenderer.lIllIIIllIIIlI[21];
            if (lllllIIIIllIIll(this.mc.thePlayer.isPotionActive(Potion.confusion) ? 1 : 0)) {
                lllllllllllllIIIIIlIlllIIIlIIlll = EntityRenderer.lIllIIIllIIIlI[8];
            }
            float lllllllllllllIIIIIlIlllIIIlIIllI = 5.0f / (lllllllllllllIIIIIlIlllIIIlIlIII * lllllllllllllIIIIIlIlllIIIlIlIII + 5.0f) - lllllllllllllIIIIIlIlllIIIlIlIII * 0.04f;
            lllllllllllllIIIIIlIlllIIIlIIllI *= lllllllllllllIIIIIlIlllIIIlIIllI;
            GlStateManager.rotate((this.rendererUpdateCount + lllllllllllllIIIIIlIlllIIIlIIlII) * lllllllllllllIIIIIlIlllIIIlIIlll, 0.0f, 1.0f, 1.0f);
            GlStateManager.scale(1.0f / lllllllllllllIIIIIlIlllIIIlIIllI, 1.0f, 1.0f);
            GlStateManager.rotate(-(this.rendererUpdateCount + lllllllllllllIIIIIlIlllIIIlIIlII) * lllllllllllllIIIIIlIlllIIIlIIlll, 0.0f, 1.0f, 1.0f);
        }
        this.orientCamera(lllllllllllllIIIIIlIlllIIIlIIlII);
        if (lllllIIIIllIIll(this.debugView ? 1 : 0)) {
            switch (this.debugViewDirection) {
                case 0: {
                    GlStateManager.rotate(90.0f, 0.0f, 1.0f, 0.0f);
                    "".length();
                    if (-(120 + 120 - 117 + 48 ^ 8 + 60 + 17 + 89) >= 0) {
                        return;
                    }
                    break;
                }
                case 1: {
                    GlStateManager.rotate(180.0f, 0.0f, 1.0f, 0.0f);
                    "".length();
                    if (null != null) {
                        return;
                    }
                    break;
                }
                case 2: {
                    GlStateManager.rotate(-90.0f, 0.0f, 1.0f, 0.0f);
                    "".length();
                    if (((0x6B ^ 0x72 ^ (0x1F ^ 0x52)) & (174 + 158 - 295 + 218 ^ 6 + 165 - 95 + 95 ^ -" ".length())) != 0x0) {
                        return;
                    }
                    break;
                }
                case 3: {
                    GlStateManager.rotate(90.0f, 1.0f, 0.0f, 0.0f);
                    "".length();
                    if ("   ".length() < " ".length()) {
                        return;
                    }
                    break;
                }
                case 4: {
                    GlStateManager.rotate(-90.0f, 1.0f, 0.0f, 0.0f);
                    break;
                }
            }
        }
    }
    
    private static int lllllIIIIlllIIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean lllllIIIIllIlII(final Object lllllllllllllIIIIIlIlIlllIlIllIl) {
        return lllllllllllllIIIIIlIlIlllIlIllIl != null;
    }
    
    private static boolean lllllIIIIllllIl(final Object lllllllllllllIIIIIlIlIlllIlIlIlI, final Object lllllllllllllIIIIIlIlIlllIlIlIIl) {
        return lllllllllllllIIIIIlIlIlllIlIlIlI == lllllllllllllIIIIIlIlIlllIlIlIIl;
    }
    
    private static boolean lllllIIIIlllIII(final int lllllllllllllIIIIIlIlIlllIIllIll) {
        return lllllllllllllIIIIIlIlIlllIIllIll > 0;
    }
    
    public void getMouseOver(final float lllllllllllllIIIIIlIlllIllIllIll) {
        final Entity lllllllllllllIIIIIlIlllIllIllIlI = this.mc.getRenderViewEntity();
        if (lllllIIIIllIlII(lllllllllllllIIIIIlIlllIllIllIlI) && lllllIIIIllIlII(this.mc.theWorld)) {
            this.mc.mcProfiler.startSection(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[28]]);
            this.mc.pointedEntity = null;
            double lllllllllllllIIIIIlIlllIllIllIIl = this.mc.playerController.getBlockReachDistance();
            this.mc.objectMouseOver = lllllllllllllIIIIIlIlllIllIllIlI.rayTrace(lllllllllllllIIIIIlIlllIllIllIIl, lllllllllllllIIIIIlIlllIllIllIll);
            double lllllllllllllIIIIIlIlllIllIllIII = lllllllllllllIIIIIlIlllIllIllIIl;
            final Vec3 lllllllllllllIIIIIlIlllIllIlIlll = lllllllllllllIIIIIlIlllIllIllIlI.getPositionEyes(lllllllllllllIIIIIlIlllIllIllIll);
            boolean lllllllllllllIIIIIlIlllIllIlIllI = EntityRenderer.lIllIIIllIIIlI[0] != 0;
            final int lllllllllllllIIIIIlIlllIllIlIlIl = EntityRenderer.lIllIIIllIIIlI[4];
            if (lllllIIIIllIIll(this.mc.playerController.extendedReach() ? 1 : 0)) {
                lllllllllllllIIIIIlIlllIllIllIIl = 6.0;
                lllllllllllllIIIIIlIlllIllIllIII = 6.0;
                "".length();
                if ("  ".length() < -" ".length()) {
                    return;
                }
            }
            else if (lllllIIIIlllIII(lllllIIIIlllIIl(lllllllllllllIIIIIlIlllIllIllIIl, 3.0))) {
                lllllllllllllIIIIIlIlllIllIlIllI = (EntityRenderer.lIllIIIllIIIlI[1] != 0);
            }
            if (lllllIIIIllIlII(this.mc.objectMouseOver)) {
                lllllllllllllIIIIIlIlllIllIllIII = this.mc.objectMouseOver.hitVec.distanceTo(lllllllllllllIIIIIlIlllIllIlIlll);
            }
            final Vec3 lllllllllllllIIIIIlIlllIllIlIlII = lllllllllllllIIIIIlIlllIllIllIlI.getLook(lllllllllllllIIIIIlIlllIllIllIll);
            final Vec3 lllllllllllllIIIIIlIlllIllIlIIll = lllllllllllllIIIIIlIlllIllIlIlll.addVector(lllllllllllllIIIIIlIlllIllIlIlII.xCoord * lllllllllllllIIIIIlIlllIllIllIIl, lllllllllllllIIIIIlIlllIllIlIlII.yCoord * lllllllllllllIIIIIlIlllIllIllIIl, lllllllllllllIIIIIlIlllIllIlIlII.zCoord * lllllllllllllIIIIIlIlllIllIllIIl);
            this.pointedEntity = null;
            Vec3 lllllllllllllIIIIIlIlllIllIlIIlI = null;
            final float lllllllllllllIIIIIlIlllIllIlIIIl = 1.0f;
            final List<Entity> lllllllllllllIIIIIlIlllIllIlIIII = this.mc.theWorld.getEntitiesInAABBexcluding(lllllllllllllIIIIIlIlllIllIllIlI, lllllllllllllIIIIIlIlllIllIllIlI.getEntityBoundingBox().addCoord(lllllllllllllIIIIIlIlllIllIlIlII.xCoord * lllllllllllllIIIIIlIlllIllIllIIl, lllllllllllllIIIIIlIlllIllIlIlII.yCoord * lllllllllllllIIIIIlIlllIllIllIIl, lllllllllllllIIIIIlIlllIllIlIlII.zCoord * lllllllllllllIIIIIlIlllIllIllIIl).expand(lllllllllllllIIIIIlIlllIllIlIIIl, lllllllllllllIIIIIlIlllIllIlIIIl, lllllllllllllIIIIIlIlllIllIlIIIl), (Predicate<? super Entity>)Predicates.and((Predicate)EntitySelectors.NOT_SPECTATING, (Predicate)new Predicate<Entity>() {
                public boolean apply(final Entity lllllllllllllIlIIIIllIIIllIIIlII) {
                    return lllllllllllllIlIIIIllIIIllIIIlII.canBeCollidedWith();
                }
            }));
            double lllllllllllllIIIIIlIlllIllIIllll = lllllllllllllIIIIIlIlllIllIllIII;
            int lllllllllllllIIIIIlIlllIllIIlllI = EntityRenderer.lIllIIIllIIIlI[0];
            "".length();
            if (-" ".length() >= " ".length()) {
                return;
            }
            while (!lllllIIIIllIIlI(lllllllllllllIIIIIlIlllIllIIlllI, lllllllllllllIIIIIlIlllIllIlIIII.size())) {
                final Entity lllllllllllllIIIIIlIlllIllIIllIl = lllllllllllllIIIIIlIlllIllIlIIII.get(lllllllllllllIIIIIlIlllIllIIlllI);
                final float lllllllllllllIIIIIlIlllIllIIllII = lllllllllllllIIIIIlIlllIllIIllIl.getCollisionBorderSize();
                final AxisAlignedBB lllllllllllllIIIIIlIlllIllIIlIll = lllllllllllllIIIIIlIlllIllIIllIl.getEntityBoundingBox().expand(lllllllllllllIIIIIlIlllIllIIllII, lllllllllllllIIIIIlIlllIllIIllII, lllllllllllllIIIIIlIlllIllIIllII);
                final MovingObjectPosition lllllllllllllIIIIIlIlllIllIIlIlI = lllllllllllllIIIIIlIlllIllIIlIll.calculateIntercept(lllllllllllllIIIIIlIlllIllIlIlll, lllllllllllllIIIIIlIlllIllIlIIll);
                if (lllllIIIIllIIll(lllllllllllllIIIIIlIlllIllIIlIll.isVecInside(lllllllllllllIIIIIlIlllIllIlIlll) ? 1 : 0)) {
                    if (lllllIIIIlllIll(lllllIIIIlllIIl(lllllllllllllIIIIIlIlllIllIIllll, 0.0))) {
                        this.pointedEntity = lllllllllllllIIIIIlIlllIllIIllIl;
                        Vec3 hitVec;
                        if (lllllIIIIllIlll(lllllllllllllIIIIIlIlllIllIIlIlI)) {
                            hitVec = lllllllllllllIIIIIlIlllIllIlIlll;
                            "".length();
                            if ("   ".length() < " ".length()) {
                                return;
                            }
                        }
                        else {
                            hitVec = lllllllllllllIIIIIlIlllIllIIlIlI.hitVec;
                        }
                        lllllllllllllIIIIIlIlllIllIlIIlI = hitVec;
                        lllllllllllllIIIIIlIlllIllIIllll = 0.0;
                        "".length();
                        if ("  ".length() <= 0) {
                            return;
                        }
                    }
                }
                else if (lllllIIIIllIlII(lllllllllllllIIIIIlIlllIllIIlIlI)) {
                    final double lllllllllllllIIIIIlIlllIllIIlIIl = lllllllllllllIIIIIlIlllIllIlIlll.distanceTo(lllllllllllllIIIIIlIlllIllIIlIlI.hitVec);
                    if (!lllllIIIIlllIll(lllllIIIIlllIlI(lllllllllllllIIIIIlIlllIllIIlIIl, lllllllllllllIIIIIlIlllIllIIllll)) || lllllIIIIllllII(lllllIIIIlllIIl(lllllllllllllIIIIIlIlllIllIIllll, 0.0))) {
                        if (lllllIIIIllllIl(lllllllllllllIIIIIlIlllIllIIllIl, lllllllllllllIIIIIlIlllIllIllIlI.ridingEntity)) {
                            if (lllllIIIIllllII(lllllIIIIlllIIl(lllllllllllllIIIIIlIlllIllIIllll, 0.0))) {
                                this.pointedEntity = lllllllllllllIIIIIlIlllIllIIllIl;
                                lllllllllllllIIIIIlIlllIllIlIIlI = lllllllllllllIIIIIlIlllIllIIlIlI.hitVec;
                                "".length();
                                if ("  ".length() > (108 + 35 - 11 + 37 ^ 170 + 78 - 216 + 141)) {
                                    return;
                                }
                            }
                        }
                        else {
                            this.pointedEntity = lllllllllllllIIIIIlIlllIllIIllIl;
                            lllllllllllllIIIIIlIlllIllIlIIlI = lllllllllllllIIIIIlIlllIllIIlIlI.hitVec;
                            lllllllllllllIIIIIlIlllIllIIllll = lllllllllllllIIIIIlIlllIllIIlIIl;
                        }
                    }
                }
                ++lllllllllllllIIIIIlIlllIllIIlllI;
            }
            if (lllllIIIIllIlII(this.pointedEntity) && lllllIIIIllIIll(lllllllllllllIIIIIlIlllIllIlIllI ? 1 : 0) && lllllIIIIlllIII(lllllIIIIlllIIl(lllllllllllllIIIIIlIlllIllIlIlll.distanceTo(lllllllllllllIIIIIlIlllIllIlIIlI), 3.0))) {
                this.pointedEntity = null;
                this.mc.objectMouseOver = new MovingObjectPosition(MovingObjectPosition.MovingObjectType.MISS, lllllllllllllIIIIIlIlllIllIlIIlI, null, new BlockPos(lllllllllllllIIIIIlIlllIllIlIIlI));
            }
            if (lllllIIIIllIlII(this.pointedEntity) && (!lllllIIIIlllIll(lllllIIIIlllIlI(lllllllllllllIIIIIlIlllIllIIllll, lllllllllllllIIIIIlIlllIllIllIII)) || lllllIIIIllIlll(this.mc.objectMouseOver))) {
                this.mc.objectMouseOver = new MovingObjectPosition(this.pointedEntity, lllllllllllllIIIIIlIlllIllIlIIlI);
                if (!lllllIIIIllllII((this.pointedEntity instanceof EntityLivingBase) ? 1 : 0) || lllllIIIIllIIll((this.pointedEntity instanceof EntityItemFrame) ? 1 : 0)) {
                    this.mc.pointedEntity = this.pointedEntity;
                }
            }
            this.mc.mcProfiler.endSection();
        }
    }
    
    private static int lllllIIIlIIIllI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private void setupFog(final int lllllllllllllIIIIIlIllIIIIIlIIll, final float lllllllllllllIIIIIlIllIIIIIlIIlI) {
        final Entity lllllllllllllIIIIIlIllIIIIIllIlI = this.mc.getRenderViewEntity();
        boolean lllllllllllllIIIIIlIllIIIIIllIIl = EntityRenderer.lIllIIIllIIIlI[0] != 0;
        if (lllllIIIIllIIll((lllllllllllllIIIIIlIllIIIIIllIlI instanceof EntityPlayer) ? 1 : 0)) {
            lllllllllllllIIIIIlIllIIIIIllIIl = ((EntityPlayer)lllllllllllllIIIIIlIllIIIIIllIlI).capabilities.isCreativeMode;
        }
        GL11.glFog(EntityRenderer.lIllIIIllIIIlI[95], this.setFogColorBuffer(this.fogColorRed, this.fogColorGreen, this.fogColorBlue, 1.0f));
        GL11.glNormal3f(0.0f, -1.0f, 0.0f);
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        final Block lllllllllllllIIIIIlIllIIIIIllIII = ActiveRenderInfo.getBlockAtEntityViewpoint(this.mc.theWorld, lllllllllllllIIIIIlIllIIIIIllIlI, lllllllllllllIIIIIlIllIIIIIlIIlI);
        if (lllllIIIIllIIll((lllllllllllllIIIIIlIllIIIIIllIlI instanceof EntityLivingBase) ? 1 : 0) && lllllIIIIllIIll(((EntityLivingBase)lllllllllllllIIIIIlIllIIIIIllIlI).isPotionActive(Potion.blindness) ? 1 : 0)) {
            float lllllllllllllIIIIIlIllIIIIIlIlll = 5.0f;
            final int lllllllllllllIIIIIlIllIIIIIlIllI = ((EntityLivingBase)lllllllllllllIIIIIlIllIIIIIllIlI).getActivePotionEffect(Potion.blindness).getDuration();
            if (lllllIIIlIlIlII(lllllllllllllIIIIIlIllIIIIIlIllI, EntityRenderer.lIllIIIllIIIlI[21])) {
                lllllllllllllIIIIIlIllIIIIIlIlll = 5.0f + (this.farPlaneDistance - 5.0f) * (1.0f - lllllllllllllIIIIIlIllIIIIIlIllI / 20.0f);
            }
            GlStateManager.setFog(EntityRenderer.lIllIIIllIIIlI[40]);
            if (lllllIIIlIIIlIl(lllllllllllllIIIIIlIllIIIIIlIIll, EntityRenderer.lIllIIIllIIIlI[50])) {
                GlStateManager.setFogStart(0.0f);
                GlStateManager.setFogEnd(lllllllllllllIIIIIlIllIIIIIlIlll * 0.8f);
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                GlStateManager.setFogStart(lllllllllllllIIIIIlIllIIIIIlIlll * 0.25f);
                GlStateManager.setFogEnd(lllllllllllllIIIIIlIllIIIIIlIlll);
            }
            if (lllllIIIIllIIll(GLContext.getCapabilities().GL_NV_fog_distance ? 1 : 0)) {
                GL11.glFogi(EntityRenderer.lIllIIIllIIIlI[96], EntityRenderer.lIllIIIllIIIlI[97]);
                "".length();
                if (("  ".length() & ("  ".length() ^ -" ".length())) != 0x0) {
                    return;
                }
            }
        }
        else if (lllllIIIIllIIll(this.cloudFog ? 1 : 0)) {
            GlStateManager.setFog(EntityRenderer.lIllIIIllIIIlI[98]);
            GlStateManager.setFogDensity(0.1f);
            "".length();
            if (-" ".length() != -" ".length()) {
                return;
            }
        }
        else if (lllllIIIIllllIl(lllllllllllllIIIIIlIllIIIIIllIII.getMaterial(), Material.water)) {
            GlStateManager.setFog(EntityRenderer.lIllIIIllIIIlI[98]);
            if (lllllIIIIllIIll((lllllllllllllIIIIIlIllIIIIIllIlI instanceof EntityLivingBase) ? 1 : 0) && lllllIIIIllIIll(((EntityLivingBase)lllllllllllllIIIIIlIllIIIIIllIlI).isPotionActive(Potion.waterBreathing) ? 1 : 0)) {
                GlStateManager.setFogDensity(0.01f);
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                GlStateManager.setFogDensity(0.1f - EnchantmentHelper.getRespiration(lllllllllllllIIIIIlIllIIIIIllIlI) * 0.03f);
                "".length();
                if ("   ".length() > "   ".length()) {
                    return;
                }
            }
        }
        else if (lllllIIIIllllIl(lllllllllllllIIIIIlIllIIIIIllIII.getMaterial(), Material.lava)) {
            GlStateManager.setFog(EntityRenderer.lIllIIIllIIIlI[98]);
            GlStateManager.setFogDensity(2.0f);
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            final float lllllllllllllIIIIIlIllIIIIIlIlIl = this.farPlaneDistance;
            GlStateManager.setFog(EntityRenderer.lIllIIIllIIIlI[40]);
            if (lllllIIIlIIIlIl(lllllllllllllIIIIIlIllIIIIIlIIll, EntityRenderer.lIllIIIllIIIlI[50])) {
                GlStateManager.setFogStart(0.0f);
                GlStateManager.setFogEnd(lllllllllllllIIIIIlIllIIIIIlIlIl);
                "".length();
                if ((0x63 ^ 0x67) < (0x55 ^ 0x51)) {
                    return;
                }
            }
            else {
                GlStateManager.setFogStart(lllllllllllllIIIIIlIllIIIIIlIlIl * 0.75f);
                GlStateManager.setFogEnd(lllllllllllllIIIIIlIllIIIIIlIlIl);
            }
            if (lllllIIIIllIIll(GLContext.getCapabilities().GL_NV_fog_distance ? 1 : 0)) {
                GL11.glFogi(EntityRenderer.lIllIIIllIIIlI[96], EntityRenderer.lIllIIIllIIIlI[97]);
            }
            if (lllllIIIIllIIll(this.mc.theWorld.provider.doesXZShowFog((int)lllllllllllllIIIIIlIllIIIIIllIlI.posX, (int)lllllllllllllIIIIIlIllIIIIIllIlI.posZ) ? 1 : 0)) {
                GlStateManager.setFogStart(lllllllllllllIIIIIlIllIIIIIlIlIl * 0.05f);
                GlStateManager.setFogEnd(Math.min(lllllllllllllIIIIIlIllIIIIIlIlIl, 192.0f) * 0.5f);
            }
        }
        GlStateManager.enableColorMaterial();
        GlStateManager.enableFog();
        GlStateManager.colorMaterial(EntityRenderer.lIllIIIllIIIlI[99], EntityRenderer.lIllIIIllIIIlI[100]);
    }
    
    public void switchUseShader() {
        int useShader;
        if (lllllIIIIllIIll(this.useShader ? 1 : 0)) {
            useShader = EntityRenderer.lIllIIIllIIIlI[0];
            "".length();
            if ((0x7 ^ 0x64 ^ (0xCD ^ 0xAA)) != (0x4F ^ 0x3F ^ (0xB1 ^ 0xC5))) {
                return;
            }
        }
        else {
            useShader = EntityRenderer.lIllIIIllIIIlI[1];
        }
        this.useShader = (useShader != 0);
    }
    
    private static int lllllIIIlIlIlIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static int lllllIIIlIIIIIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static int lllllIIIlIlIlll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static int lllllIIIlIIllll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    @Override
    public void onResourceManagerReload(final IResourceManager lllllllllllllIIIIIlIllllIIIIllII) {
        if (lllllIIIIllIlII(this.theShaderGroup)) {
            this.theShaderGroup.deleteShaderGroup();
        }
        this.theShaderGroup = null;
        if (lllllIIIIllIlIl(this.shaderIndex, EntityRenderer.shaderCount)) {
            this.loadShader(EntityRenderer.shaderResourceLocations[this.shaderIndex]);
            "".length();
            if ("  ".length() != "  ".length()) {
                return;
            }
        }
        else {
            this.loadEntityShader(this.mc.getRenderViewEntity());
        }
    }
    
    protected void renderRainSnow(final float lllllllllllllIIIIIlIllIIlIIlIllI) {
        final float lllllllllllllIIIIIlIllIIllIIIlII = this.mc.theWorld.getRainStrength(lllllllllllllIIIIIlIllIIlIIlIllI);
        if (lllllIIIIlllIII(lllllIIIlIlIlIl(lllllllllllllIIIIIlIllIIllIIIlII, 0.0f))) {
            this.enableLightmap();
            final Entity lllllllllllllIIIIIlIllIIllIIIIll = this.mc.getRenderViewEntity();
            final World lllllllllllllIIIIIlIllIIllIIIIlI = this.mc.theWorld;
            final int lllllllllllllIIIIIlIllIIllIIIIIl = MathHelper.floor_double(lllllllllllllIIIIIlIllIIllIIIIll.posX);
            final int lllllllllllllIIIIIlIllIIllIIIIII = MathHelper.floor_double(lllllllllllllIIIIIlIllIIllIIIIll.posY);
            final int lllllllllllllIIIIIlIllIIlIllllll = MathHelper.floor_double(lllllllllllllIIIIIlIllIIllIIIIll.posZ);
            final Tessellator lllllllllllllIIIIIlIllIIlIlllllI = Tessellator.getInstance();
            final WorldRenderer lllllllllllllIIIIIlIllIIlIllllIl = lllllllllllllIIIIIlIllIIlIlllllI.getWorldRenderer();
            GlStateManager.disableCull();
            GL11.glNormal3f(0.0f, 1.0f, 0.0f);
            GlStateManager.enableBlend();
            GlStateManager.tryBlendFuncSeparate(EntityRenderer.lIllIIIllIIIlI[61], EntityRenderer.lIllIIIllIIIlI[62], EntityRenderer.lIllIIIllIIIlI[1], EntityRenderer.lIllIIIllIIIlI[0]);
            GlStateManager.alphaFunc(EntityRenderer.lIllIIIllIIIlI[55], 0.1f);
            final double lllllllllllllIIIIIlIllIIlIllllII = lllllllllllllIIIIIlIllIIllIIIIll.lastTickPosX + (lllllllllllllIIIIIlIllIIllIIIIll.posX - lllllllllllllIIIIIlIllIIllIIIIll.lastTickPosX) * lllllllllllllIIIIIlIllIIlIIlIllI;
            final double lllllllllllllIIIIIlIllIIlIlllIll = lllllllllllllIIIIIlIllIIllIIIIll.lastTickPosY + (lllllllllllllIIIIIlIllIIllIIIIll.posY - lllllllllllllIIIIIlIllIIllIIIIll.lastTickPosY) * lllllllllllllIIIIIlIllIIlIIlIllI;
            final double lllllllllllllIIIIIlIllIIlIlllIlI = lllllllllllllIIIIIlIllIIllIIIIll.lastTickPosZ + (lllllllllllllIIIIIlIllIIllIIIIll.posZ - lllllllllllllIIIIIlIllIIllIIIIll.lastTickPosZ) * lllllllllllllIIIIIlIllIIlIIlIllI;
            final int lllllllllllllIIIIIlIllIIlIlllIIl = MathHelper.floor_double(lllllllllllllIIIIIlIllIIlIlllIll);
            int lllllllllllllIIIIIlIllIIlIlllIII = EntityRenderer.lIllIIIllIIIlI[6];
            if (lllllIIIIllIIll(this.mc.gameSettings.fancyGraphics ? 1 : 0)) {
                lllllllllllllIIIIIlIllIIlIlllIII = EntityRenderer.lIllIIIllIIIlI[11];
            }
            int lllllllllllllIIIIIlIllIIlIllIlll = EntityRenderer.lIllIIIllIIIlI[50];
            final float lllllllllllllIIIIIlIllIIlIllIllI = this.rendererUpdateCount + lllllllllllllIIIIIlIllIIlIIlIllI;
            lllllllllllllIIIIIlIllIIlIllllIl.setTranslation(-lllllllllllllIIIIIlIllIIlIllllII, -lllllllllllllIIIIIlIllIIlIlllIll, -lllllllllllllIIIIIlIllIIlIlllIlI);
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            final BlockPos.MutableBlockPos lllllllllllllIIIIIlIllIIlIllIlIl = new BlockPos.MutableBlockPos();
            int lllllllllllllIIIIIlIllIIlIllIlII = lllllllllllllIIIIIlIllIIlIllllll - lllllllllllllIIIIIlIllIIlIlllIII;
            "".length();
            if (-"   ".length() > 0) {
                return;
            }
            while (!lllllIIIlIIlIlI(lllllllllllllIIIIIlIllIIlIllIlII, lllllllllllllIIIIIlIllIIlIllllll + lllllllllllllIIIIIlIllIIlIlllIII)) {
                int lllllllllllllIIIIIlIllIIlIllIIll = lllllllllllllIIIIIlIllIIllIIIIIl - lllllllllllllIIIIIlIllIIlIlllIII;
                "".length();
                if (((0x2A ^ 0x48) & ~(0xC0 ^ 0xA2)) != 0x0) {
                    return;
                }
                while (!lllllIIIlIIlIlI(lllllllllllllIIIIIlIllIIlIllIIll, lllllllllllllIIIIIlIllIIllIIIIIl + lllllllllllllIIIIIlIllIIlIlllIII)) {
                    final int lllllllllllllIIIIIlIllIIlIllIIlI = (lllllllllllllIIIIIlIllIIlIllIlII - lllllllllllllIIIIIlIllIIlIllllll + EntityRenderer.lIllIIIllIIIlI[17]) * EntityRenderer.lIllIIIllIIIlI[28] + lllllllllllllIIIIIlIllIIlIllIIll - lllllllllllllIIIIIlIllIIllIIIIIl + EntityRenderer.lIllIIIllIIIlI[17];
                    final double lllllllllllllIIIIIlIllIIlIllIIIl = this.rainXCoords[lllllllllllllIIIIIlIllIIlIllIIlI] * 0.5;
                    final double lllllllllllllIIIIIlIllIIlIllIIII = this.rainYCoords[lllllllllllllIIIIIlIllIIlIllIIlI] * 0.5;
                    lllllllllllllIIIIIlIllIIlIllIlIl.func_181079_c(lllllllllllllIIIIIlIllIIlIllIIll, EntityRenderer.lIllIIIllIIIlI[0], lllllllllllllIIIIIlIllIIlIllIlII);
                    "".length();
                    final BiomeGenBase lllllllllllllIIIIIlIllIIlIlIllll = lllllllllllllIIIIIlIllIIllIIIIlI.getBiomeGenForCoords(lllllllllllllIIIIIlIllIIlIllIlIl);
                    if (!lllllIIIIllllII(lllllllllllllIIIIIlIllIIlIlIllll.canSpawnLightningBolt() ? 1 : 0) || lllllIIIIllIIll(lllllllllllllIIIIIlIllIIlIlIllll.getEnableSnow() ? 1 : 0)) {
                        final int lllllllllllllIIIIIlIllIIlIlIlllI = lllllllllllllIIIIIlIllIIllIIIIlI.getPrecipitationHeight(lllllllllllllIIIIIlIllIIlIllIlIl).getY();
                        int lllllllllllllIIIIIlIllIIlIlIllIl = lllllllllllllIIIIIlIllIIllIIIIII - lllllllllllllIIIIIlIllIIlIlllIII;
                        int lllllllllllllIIIIIlIllIIlIlIllII = lllllllllllllIIIIIlIllIIllIIIIII + lllllllllllllIIIIIlIllIIlIlllIII;
                        if (lllllIIIlIlIlII(lllllllllllllIIIIIlIllIIlIlIllIl, lllllllllllllIIIIIlIllIIlIlIlllI)) {
                            lllllllllllllIIIIIlIllIIlIlIllIl = lllllllllllllIIIIIlIllIIlIlIlllI;
                        }
                        if (lllllIIIlIlIlII(lllllllllllllIIIIIlIllIIlIlIllII, lllllllllllllIIIIIlIllIIlIlIlllI)) {
                            lllllllllllllIIIIIlIllIIlIlIllII = lllllllllllllIIIIIlIllIIlIlIlllI;
                        }
                        int lllllllllllllIIIIIlIllIIlIlIlIll = lllllllllllllIIIIIlIllIIlIlIlllI;
                        if (lllllIIIlIlIlII(lllllllllllllIIIIIlIllIIlIlIlllI, lllllllllllllIIIIIlIllIIlIlllIIl)) {
                            lllllllllllllIIIIIlIllIIlIlIlIll = lllllllllllllIIIIIlIllIIlIlllIIl;
                        }
                        if (lllllIIIIllIlIl(lllllllllllllIIIIIlIllIIlIlIllIl, lllllllllllllIIIIIlIllIIlIlIllII)) {
                            this.random.setSeed(lllllllllllllIIIIIlIllIIlIllIIll * lllllllllllllIIIIIlIllIIlIllIIll * EntityRenderer.lIllIIIllIIIlI[88] + lllllllllllllIIIIIlIllIIlIllIIll * EntityRenderer.lIllIIIllIIIlI[89] ^ lllllllllllllIIIIIlIllIIlIllIlII * lllllllllllllIIIIIlIllIIlIllIlII * EntityRenderer.lIllIIIllIIIlI[90] + lllllllllllllIIIIIlIllIIlIllIlII * EntityRenderer.lIllIIIllIIIlI[91]);
                            lllllllllllllIIIIIlIllIIlIllIlIl.func_181079_c(lllllllllllllIIIIIlIllIIlIllIIll, lllllllllllllIIIIIlIllIIlIlIllIl, lllllllllllllIIIIIlIllIIlIllIlII);
                            "".length();
                            final float lllllllllllllIIIIIlIllIIlIlIlIlI = lllllllllllllIIIIIlIllIIlIlIllll.getFloatTemperature(lllllllllllllIIIIIlIllIIlIllIlIl);
                            if (lllllIIIIlllIll(lllllIIIlIlIlIl(lllllllllllllIIIIIlIllIIllIIIIlI.getWorldChunkManager().getTemperatureAtHeight(lllllllllllllIIIIIlIllIIlIlIlIlI, lllllllllllllIIIIIlIllIIlIlIlllI), 0.15f))) {
                                if (lllllIIIIllIIll(lllllllllllllIIIIIlIllIIlIllIlll)) {
                                    if (lllllIIIIlllIll(lllllllllllllIIIIIlIllIIlIllIlll)) {
                                        lllllllllllllIIIIIlIllIIlIlllllI.draw();
                                    }
                                    lllllllllllllIIIIIlIllIIlIllIlll = EntityRenderer.lIllIIIllIIIlI[0];
                                    this.mc.getTextureManager().bindTexture(EntityRenderer.locationRainPng);
                                    lllllllllllllIIIIIlIllIIlIllllIl.begin(EntityRenderer.lIllIIIllIIIlI[8], DefaultVertexFormats.PARTICLE_POSITION_TEX_COLOR_LMAP);
                                }
                                final double lllllllllllllIIIIIlIllIIlIlIlIIl = ((this.rendererUpdateCount + lllllllllllllIIIIIlIllIIlIllIIll * lllllllllllllIIIIIlIllIIlIllIIll * EntityRenderer.lIllIIIllIIIlI[88] + lllllllllllllIIIIIlIllIIlIllIIll * EntityRenderer.lIllIIIllIIIlI[89] + lllllllllllllIIIIIlIllIIlIllIlII * lllllllllllllIIIIIlIllIIlIllIlII * EntityRenderer.lIllIIIllIIIlI[90] + lllllllllllllIIIIIlIllIIlIllIlII * EntityRenderer.lIllIIIllIIIlI[91] & EntityRenderer.lIllIIIllIIIlI[33]) + (double)lllllllllllllIIIIIlIllIIlIIlIllI) / 32.0 * (3.0 + this.random.nextDouble());
                                final double lllllllllllllIIIIIlIllIIlIlIlIII = lllllllllllllIIIIIlIllIIlIllIIll + 0.5f - lllllllllllllIIIIIlIllIIllIIIIll.posX;
                                final double lllllllllllllIIIIIlIllIIlIlIIlll = lllllllllllllIIIIIlIllIIlIllIlII + 0.5f - lllllllllllllIIIIIlIllIIllIIIIll.posZ;
                                final float lllllllllllllIIIIIlIllIIlIlIIllI = MathHelper.sqrt_double(lllllllllllllIIIIIlIllIIlIlIlIII * lllllllllllllIIIIIlIllIIlIlIlIII + lllllllllllllIIIIIlIllIIlIlIIlll * lllllllllllllIIIIIlIllIIlIlIIlll) / lllllllllllllIIIIIlIllIIlIlllIII;
                                final float lllllllllllllIIIIIlIllIIlIlIIlIl = ((1.0f - lllllllllllllIIIIIlIllIIlIlIIllI * lllllllllllllIIIIIlIllIIlIlIIllI) * 0.5f + 0.5f) * lllllllllllllIIIIIlIllIIllIIIlII;
                                lllllllllllllIIIIIlIllIIlIllIlIl.func_181079_c(lllllllllllllIIIIIlIllIIlIllIIll, lllllllllllllIIIIIlIllIIlIlIlIll, lllllllllllllIIIIIlIllIIlIllIlII);
                                "".length();
                                final int lllllllllllllIIIIIlIllIIlIlIIlII = lllllllllllllIIIIIlIllIIllIIIIlI.getCombinedLight(lllllllllllllIIIIIlIllIIlIllIlIl, EntityRenderer.lIllIIIllIIIlI[0]);
                                final int lllllllllllllIIIIIlIllIIlIlIIIll = lllllllllllllIIIIIlIllIIlIlIIlII >> EntityRenderer.lIllIIIllIIIlI[17] & EntityRenderer.lIllIIIllIIIlI[92];
                                final int lllllllllllllIIIIIlIllIIlIlIIIlI = lllllllllllllIIIIIlIllIIlIlIIlII & EntityRenderer.lIllIIIllIIIlI[92];
                                lllllllllllllIIIIIlIllIIlIllllIl.pos(lllllllllllllIIIIIlIllIIlIllIIll - lllllllllllllIIIIIlIllIIlIllIIIl + 0.5, lllllllllllllIIIIIlIllIIlIlIllIl, lllllllllllllIIIIIlIllIIlIllIlII - lllllllllllllIIIIIlIllIIlIllIIII + 0.5).tex(0.0, lllllllllllllIIIIIlIllIIlIlIllIl * 0.25 + lllllllllllllIIIIIlIllIIlIlIlIIl).color(1.0f, 1.0f, 1.0f, lllllllllllllIIIIIlIllIIlIlIIlIl).lightmap(lllllllllllllIIIIIlIllIIlIlIIIll, lllllllllllllIIIIIlIllIIlIlIIIlI).endVertex();
                                lllllllllllllIIIIIlIllIIlIllllIl.pos(lllllllllllllIIIIIlIllIIlIllIIll + lllllllllllllIIIIIlIllIIlIllIIIl + 0.5, lllllllllllllIIIIIlIllIIlIlIllIl, lllllllllllllIIIIIlIllIIlIllIlII + lllllllllllllIIIIIlIllIIlIllIIII + 0.5).tex(1.0, lllllllllllllIIIIIlIllIIlIlIllIl * 0.25 + lllllllllllllIIIIIlIllIIlIlIlIIl).color(1.0f, 1.0f, 1.0f, lllllllllllllIIIIIlIllIIlIlIIlIl).lightmap(lllllllllllllIIIIIlIllIIlIlIIIll, lllllllllllllIIIIIlIllIIlIlIIIlI).endVertex();
                                lllllllllllllIIIIIlIllIIlIllllIl.pos(lllllllllllllIIIIIlIllIIlIllIIll + lllllllllllllIIIIIlIllIIlIllIIIl + 0.5, lllllllllllllIIIIIlIllIIlIlIllII, lllllllllllllIIIIIlIllIIlIllIlII + lllllllllllllIIIIIlIllIIlIllIIII + 0.5).tex(1.0, lllllllllllllIIIIIlIllIIlIlIllII * 0.25 + lllllllllllllIIIIIlIllIIlIlIlIIl).color(1.0f, 1.0f, 1.0f, lllllllllllllIIIIIlIllIIlIlIIlIl).lightmap(lllllllllllllIIIIIlIllIIlIlIIIll, lllllllllllllIIIIIlIllIIlIlIIIlI).endVertex();
                                lllllllllllllIIIIIlIllIIlIllllIl.pos(lllllllllllllIIIIIlIllIIlIllIIll - lllllllllllllIIIIIlIllIIlIllIIIl + 0.5, lllllllllllllIIIIIlIllIIlIlIllII, lllllllllllllIIIIIlIllIIlIllIlII - lllllllllllllIIIIIlIllIIlIllIIII + 0.5).tex(0.0, lllllllllllllIIIIIlIllIIlIlIllII * 0.25 + lllllllllllllIIIIIlIllIIlIlIlIIl).color(1.0f, 1.0f, 1.0f, lllllllllllllIIIIIlIllIIlIlIIlIl).lightmap(lllllllllllllIIIIIlIllIIlIlIIIll, lllllllllllllIIIIIlIllIIlIlIIIlI).endVertex();
                                "".length();
                                if ((0x3 ^ 0x76 ^ (0x1 ^ 0x70)) <= "  ".length()) {
                                    return;
                                }
                            }
                            else {
                                if (lllllIIIIllIlIl(lllllllllllllIIIIIlIllIIlIllIlll, EntityRenderer.lIllIIIllIIIlI[1])) {
                                    if (lllllIIIIlllIll(lllllllllllllIIIIIlIllIIlIllIlll)) {
                                        lllllllllllllIIIIIlIllIIlIlllllI.draw();
                                    }
                                    lllllllllllllIIIIIlIllIIlIllIlll = EntityRenderer.lIllIIIllIIIlI[1];
                                    this.mc.getTextureManager().bindTexture(EntityRenderer.locationSnowPng);
                                    lllllllllllllIIIIIlIllIIlIllllIl.begin(EntityRenderer.lIllIIIllIIIlI[8], DefaultVertexFormats.PARTICLE_POSITION_TEX_COLOR_LMAP);
                                }
                                final double lllllllllllllIIIIIlIllIIlIlIIIIl = ((this.rendererUpdateCount & EntityRenderer.lIllIIIllIIIlI[93]) + lllllllllllllIIIIIlIllIIlIIlIllI) / 512.0f;
                                final double lllllllllllllIIIIIlIllIIlIlIIIII = this.random.nextDouble() + lllllllllllllIIIIIlIllIIlIllIllI * 0.01 * (float)this.random.nextGaussian();
                                final double lllllllllllllIIIIIlIllIIlIIlllll = this.random.nextDouble() + lllllllllllllIIIIIlIllIIlIllIllI * (float)this.random.nextGaussian() * 0.001;
                                final double lllllllllllllIIIIIlIllIIlIIllllI = lllllllllllllIIIIIlIllIIlIllIIll + 0.5f - lllllllllllllIIIIIlIllIIllIIIIll.posX;
                                final double lllllllllllllIIIIIlIllIIlIIlllIl = lllllllllllllIIIIIlIllIIlIllIlII + 0.5f - lllllllllllllIIIIIlIllIIllIIIIll.posZ;
                                final float lllllllllllllIIIIIlIllIIlIIlllII = MathHelper.sqrt_double(lllllllllllllIIIIIlIllIIlIIllllI * lllllllllllllIIIIIlIllIIlIIllllI + lllllllllllllIIIIIlIllIIlIIlllIl * lllllllllllllIIIIIlIllIIlIIlllIl) / lllllllllllllIIIIIlIllIIlIlllIII;
                                final float lllllllllllllIIIIIlIllIIlIIllIll = ((1.0f - lllllllllllllIIIIIlIllIIlIIlllII * lllllllllllllIIIIIlIllIIlIIlllII) * 0.3f + 0.5f) * lllllllllllllIIIIIlIllIIllIIIlII;
                                lllllllllllllIIIIIlIllIIlIllIlIl.func_181079_c(lllllllllllllIIIIIlIllIIlIllIIll, lllllllllllllIIIIIlIllIIlIlIlIll, lllllllllllllIIIIIlIllIIlIllIlII);
                                "".length();
                                final int lllllllllllllIIIIIlIllIIlIIllIlI = (lllllllllllllIIIIIlIllIIllIIIIlI.getCombinedLight(lllllllllllllIIIIIlIllIIlIllIlIl, EntityRenderer.lIllIIIllIIIlI[0]) * EntityRenderer.lIllIIIllIIIlI[4] + EntityRenderer.lIllIIIllIIIlI[94]) / EntityRenderer.lIllIIIllIIIlI[5];
                                final int lllllllllllllIIIIIlIllIIlIIllIIl = lllllllllllllIIIIIlIllIIlIIllIlI >> EntityRenderer.lIllIIIllIIIlI[17] & EntityRenderer.lIllIIIllIIIlI[92];
                                final int lllllllllllllIIIIIlIllIIlIIllIII = lllllllllllllIIIIIlIllIIlIIllIlI & EntityRenderer.lIllIIIllIIIlI[92];
                                lllllllllllllIIIIIlIllIIlIllllIl.pos(lllllllllllllIIIIIlIllIIlIllIIll - lllllllllllllIIIIIlIllIIlIllIIIl + 0.5, lllllllllllllIIIIIlIllIIlIlIllIl, lllllllllllllIIIIIlIllIIlIllIlII - lllllllllllllIIIIIlIllIIlIllIIII + 0.5).tex(0.0 + lllllllllllllIIIIIlIllIIlIlIIIII, lllllllllllllIIIIIlIllIIlIlIllIl * 0.25 + lllllllllllllIIIIIlIllIIlIlIIIIl + lllllllllllllIIIIIlIllIIlIIlllll).color(1.0f, 1.0f, 1.0f, lllllllllllllIIIIIlIllIIlIIllIll).lightmap(lllllllllllllIIIIIlIllIIlIIllIIl, lllllllllllllIIIIIlIllIIlIIllIII).endVertex();
                                lllllllllllllIIIIIlIllIIlIllllIl.pos(lllllllllllllIIIIIlIllIIlIllIIll + lllllllllllllIIIIIlIllIIlIllIIIl + 0.5, lllllllllllllIIIIIlIllIIlIlIllIl, lllllllllllllIIIIIlIllIIlIllIlII + lllllllllllllIIIIIlIllIIlIllIIII + 0.5).tex(1.0 + lllllllllllllIIIIIlIllIIlIlIIIII, lllllllllllllIIIIIlIllIIlIlIllIl * 0.25 + lllllllllllllIIIIIlIllIIlIlIIIIl + lllllllllllllIIIIIlIllIIlIIlllll).color(1.0f, 1.0f, 1.0f, lllllllllllllIIIIIlIllIIlIIllIll).lightmap(lllllllllllllIIIIIlIllIIlIIllIIl, lllllllllllllIIIIIlIllIIlIIllIII).endVertex();
                                lllllllllllllIIIIIlIllIIlIllllIl.pos(lllllllllllllIIIIIlIllIIlIllIIll + lllllllllllllIIIIIlIllIIlIllIIIl + 0.5, lllllllllllllIIIIIlIllIIlIlIllII, lllllllllllllIIIIIlIllIIlIllIlII + lllllllllllllIIIIIlIllIIlIllIIII + 0.5).tex(1.0 + lllllllllllllIIIIIlIllIIlIlIIIII, lllllllllllllIIIIIlIllIIlIlIllII * 0.25 + lllllllllllllIIIIIlIllIIlIlIIIIl + lllllllllllllIIIIIlIllIIlIIlllll).color(1.0f, 1.0f, 1.0f, lllllllllllllIIIIIlIllIIlIIllIll).lightmap(lllllllllllllIIIIIlIllIIlIIllIIl, lllllllllllllIIIIIlIllIIlIIllIII).endVertex();
                                lllllllllllllIIIIIlIllIIlIllllIl.pos(lllllllllllllIIIIIlIllIIlIllIIll - lllllllllllllIIIIIlIllIIlIllIIIl + 0.5, lllllllllllllIIIIIlIllIIlIlIllII, lllllllllllllIIIIIlIllIIlIllIlII - lllllllllllllIIIIIlIllIIlIllIIII + 0.5).tex(0.0 + lllllllllllllIIIIIlIllIIlIlIIIII, lllllllllllllIIIIIlIllIIlIlIllII * 0.25 + lllllllllllllIIIIIlIllIIlIlIIIIl + lllllllllllllIIIIIlIllIIlIIlllll).color(1.0f, 1.0f, 1.0f, lllllllllllllIIIIIlIllIIlIIllIll).lightmap(lllllllllllllIIIIIlIllIIlIIllIIl, lllllllllllllIIIIIlIllIIlIIllIII).endVertex();
                            }
                        }
                    }
                    ++lllllllllllllIIIIIlIllIIlIllIIll;
                }
                ++lllllllllllllIIIIIlIllIIlIllIlII;
            }
            if (lllllIIIIlllIll(lllllllllllllIIIIIlIllIIlIllIlll)) {
                lllllllllllllIIIIIlIllIIlIlllllI.draw();
            }
            lllllllllllllIIIIIlIllIIlIllllIl.setTranslation(0.0, 0.0, 0.0);
            GlStateManager.enableCull();
            GlStateManager.disableBlend();
            GlStateManager.alphaFunc(EntityRenderer.lIllIIIllIIIlI[55], 0.1f);
            this.disableLightmap();
        }
    }
    
    private static boolean lllllIIIlIIIIlI(final int lllllllllllllIIIIIlIlIlllIIlllIl) {
        return lllllllllllllIIIIIlIlIlllIIlllIl <= 0;
    }
    
    private static String lllllIIIIIlllII(final String lllllllllllllIIIIIlIlIllllIIllII, final String lllllllllllllIIIIIlIlIllllIIlIll) {
        try {
            final SecretKeySpec lllllllllllllIIIIIlIlIllllIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIlIlIllllIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIIlIlIllllIIlllI = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIIlIlIllllIIlllI.init(EntityRenderer.lIllIIIllIIIlI[3], lllllllllllllIIIIIlIlIllllIIllll);
            return new String(lllllllllllllIIIIIlIlIllllIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIlIlIllllIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIlIlIllllIIllIl) {
            lllllllllllllIIIIIlIlIllllIIllIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllllIIIlIlIIll(final Object lllllllllllllIIIIIlIlIlllIllIIII, final Object lllllllllllllIIIIIlIlIlllIlIllll) {
        return lllllllllllllIIIIIlIlIlllIllIIII != lllllllllllllIIIIIlIlIlllIlIllll;
    }
    
    public ShaderGroup getShaderGroup() {
        return this.theShaderGroup;
    }
    
    private void addRainParticles() {
        float lllllllllllllIIIIIlIllIlIIIlIIlI = this.mc.theWorld.getRainStrength(1.0f);
        if (lllllIIIIllllII(this.mc.gameSettings.fancyGraphics ? 1 : 0)) {
            lllllllllllllIIIIIlIllIlIIIlIIlI /= 2.0f;
        }
        if (lllllIIIIllIIll(lllllIIIlIlIIII(lllllllllllllIIIIIlIllIlIIIlIIlI, 0.0f))) {
            this.random.setSeed(this.rendererUpdateCount * 312987231L);
            final Entity lllllllllllllIIIIIlIllIlIIIlIIIl = this.mc.getRenderViewEntity();
            final World lllllllllllllIIIIIlIllIlIIIlIIII = this.mc.theWorld;
            final BlockPos lllllllllllllIIIIIlIllIlIIIIllll = new BlockPos(lllllllllllllIIIIIlIllIlIIIlIIIl);
            final int lllllllllllllIIIIIlIllIlIIIIlllI = EntityRenderer.lIllIIIllIIIlI[11];
            double lllllllllllllIIIIIlIllIlIIIIllIl = 0.0;
            double lllllllllllllIIIIIlIllIlIIIIllII = 0.0;
            double lllllllllllllIIIIIlIllIlIIIIlIll = 0.0;
            int lllllllllllllIIIIIlIllIlIIIIlIlI = EntityRenderer.lIllIIIllIIIlI[0];
            int lllllllllllllIIIIIlIllIlIIIIlIIl = (int)(100.0f * lllllllllllllIIIIIlIllIlIIIlIIlI * lllllllllllllIIIIIlIllIlIIIlIIlI);
            if (lllllIIIlIIIlIl(this.mc.gameSettings.particleSetting, EntityRenderer.lIllIIIllIIIlI[1])) {
                lllllllllllllIIIIIlIllIlIIIIlIIl >>= EntityRenderer.lIllIIIllIIIlI[1];
                "".length();
                if ((0xB9 ^ 0xB1 ^ (0x3D ^ 0x31)) == "  ".length()) {
                    return;
                }
            }
            else if (lllllIIIlIIIlIl(this.mc.gameSettings.particleSetting, EntityRenderer.lIllIIIllIIIlI[3])) {
                lllllllllllllIIIIIlIllIlIIIIlIIl = EntityRenderer.lIllIIIllIIIlI[0];
            }
            int lllllllllllllIIIIIlIllIlIIIIlIII = EntityRenderer.lIllIIIllIIIlI[0];
            "".length();
            if (null != null) {
                return;
            }
            while (!lllllIIIIllIIlI(lllllllllllllIIIIIlIllIlIIIIlIII, lllllllllllllIIIIIlIllIlIIIIlIIl)) {
                final BlockPos lllllllllllllIIIIIlIllIlIIIIIlll = lllllllllllllIIIIIlIllIlIIIlIIII.getPrecipitationHeight(lllllllllllllIIIIIlIllIlIIIIllll.add(this.random.nextInt(lllllllllllllIIIIIlIllIlIIIIlllI) - this.random.nextInt(lllllllllllllIIIIIlIllIlIIIIlllI), EntityRenderer.lIllIIIllIIIlI[0], this.random.nextInt(lllllllllllllIIIIIlIllIlIIIIlllI) - this.random.nextInt(lllllllllllllIIIIIlIllIlIIIIlllI)));
                final BiomeGenBase lllllllllllllIIIIIlIllIlIIIIIllI = lllllllllllllIIIIIlIllIlIIIlIIII.getBiomeGenForCoords(lllllllllllllIIIIIlIllIlIIIIIlll);
                final BlockPos lllllllllllllIIIIIlIllIlIIIIIlIl = lllllllllllllIIIIIlIllIlIIIIIlll.down();
                final Block lllllllllllllIIIIIlIllIlIIIIIlII = lllllllllllllIIIIIlIllIlIIIlIIII.getBlockState(lllllllllllllIIIIIlIllIlIIIIIlIl).getBlock();
                if (lllllIIIlIlIIlI(lllllllllllllIIIIIlIllIlIIIIIlll.getY(), lllllllllllllIIIIIlIllIlIIIIllll.getY() + lllllllllllllIIIIIlIllIlIIIIlllI) && lllllIIIIllIIlI(lllllllllllllIIIIIlIllIlIIIIIlll.getY(), lllllllllllllIIIIIlIllIlIIIIllll.getY() - lllllllllllllIIIIIlIllIlIIIIlllI) && lllllIIIIllIIll(lllllllllllllIIIIIlIllIlIIIIIllI.canSpawnLightningBolt() ? 1 : 0) && lllllIIIIlllIll(lllllIIIlIlIIII(lllllllllllllIIIIIlIllIlIIIIIllI.getFloatTemperature(lllllllllllllIIIIIlIllIlIIIIIlll), 0.15f))) {
                    final double lllllllllllllIIIIIlIllIlIIIIIIll = this.random.nextDouble();
                    final double lllllllllllllIIIIIlIllIlIIIIIIlI = this.random.nextDouble();
                    if (lllllIIIIllllIl(lllllllllllllIIIIIlIllIlIIIIIlII.getMaterial(), Material.lava)) {
                        this.mc.theWorld.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, lllllllllllllIIIIIlIllIlIIIIIlll.getX() + lllllllllllllIIIIIlIllIlIIIIIIll, lllllllllllllIIIIIlIllIlIIIIIlll.getY() + 0.1f - lllllllllllllIIIIIlIllIlIIIIIlII.getBlockBoundsMinY(), lllllllllllllIIIIIlIllIlIIIIIlll.getZ() + lllllllllllllIIIIIlIllIlIIIIIIlI, 0.0, 0.0, 0.0, new int[EntityRenderer.lIllIIIllIIIlI[0]]);
                        "".length();
                        if (null != null) {
                            return;
                        }
                    }
                    else if (lllllIIIlIlIIll(lllllllllllllIIIIIlIllIlIIIIIlII.getMaterial(), Material.air)) {
                        lllllllllllllIIIIIlIllIlIIIIIlII.setBlockBoundsBasedOnState(lllllllllllllIIIIIlIllIlIIIlIIII, lllllllllllllIIIIIlIllIlIIIIIlIl);
                        ++lllllllllllllIIIIIlIllIlIIIIlIlI;
                        if (lllllIIIIllllII(this.random.nextInt(lllllllllllllIIIIIlIllIlIIIIlIlI))) {
                            lllllllllllllIIIIIlIllIlIIIIllIl = lllllllllllllIIIIIlIllIlIIIIIlIl.getX() + lllllllllllllIIIIIlIllIlIIIIIIll;
                            lllllllllllllIIIIIlIllIlIIIIllII = lllllllllllllIIIIIlIllIlIIIIIlIl.getY() + 0.1f + lllllllllllllIIIIIlIllIlIIIIIlII.getBlockBoundsMaxY() - 1.0;
                            lllllllllllllIIIIIlIllIlIIIIlIll = lllllllllllllIIIIIlIllIlIIIIIlIl.getZ() + lllllllllllllIIIIIlIllIlIIIIIIlI;
                        }
                        this.mc.theWorld.spawnParticle(EnumParticleTypes.WATER_DROP, lllllllllllllIIIIIlIllIlIIIIIlIl.getX() + lllllllllllllIIIIIlIllIlIIIIIIll, lllllllllllllIIIIIlIllIlIIIIIlIl.getY() + 0.1f + lllllllllllllIIIIIlIllIlIIIIIlII.getBlockBoundsMaxY(), lllllllllllllIIIIIlIllIlIIIIIlIl.getZ() + lllllllllllllIIIIIlIllIlIIIIIIlI, 0.0, 0.0, 0.0, new int[EntityRenderer.lIllIIIllIIIlI[0]]);
                    }
                }
                ++lllllllllllllIIIIIlIllIlIIIIlIII;
            }
            if (lllllIIIIlllIII(lllllllllllllIIIIIlIllIlIIIIlIlI)) {
                final int nextInt = this.random.nextInt(EntityRenderer.lIllIIIllIIIlI[4]);
                final int rainSoundCounter = this.rainSoundCounter;
                this.rainSoundCounter = rainSoundCounter + EntityRenderer.lIllIIIllIIIlI[1];
                if (lllllIIIlIlIlII(nextInt, rainSoundCounter)) {
                    this.rainSoundCounter = EntityRenderer.lIllIIIllIIIlI[0];
                    if (lllllIIIIlllIII(lllllIIIlIlIIIl(lllllllllllllIIIIIlIllIlIIIIllII, lllllllllllllIIIIIlIllIlIIIIllll.getY() + EntityRenderer.lIllIIIllIIIlI[1])) && lllllIIIlIIlIlI(lllllllllllllIIIIIlIllIlIIIlIIII.getPrecipitationHeight(lllllllllllllIIIIIlIllIlIIIIllll).getY(), MathHelper.floor_float((float)lllllllllllllIIIIIlIllIlIIIIllll.getY()))) {
                        this.mc.theWorld.playSound(lllllllllllllIIIIIlIllIlIIIIllIl, lllllllllllllIIIIIlIllIlIIIIllII, lllllllllllllIIIIIlIllIlIIIIlIll, EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[86]], 0.1f, 0.5f, (boolean)(EntityRenderer.lIllIIIllIIIlI[0] != 0));
                        "".length();
                        if ((85 + 109 - 144 + 106 ^ 116 + 124 - 231 + 143) < " ".length()) {
                            return;
                        }
                    }
                    else {
                        this.mc.theWorld.playSound(lllllllllllllIIIIIlIllIlIIIIllIl, lllllllllllllIIIIIlIllIlIIIIllII, lllllllllllllIIIIIlIllIlIIIIlIll, EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[87]], 0.2f, 1.0f, (boolean)(EntityRenderer.lIllIIIllIIIlI[0] != 0));
                    }
                }
            }
        }
    }
    
    private void updateFovModifierHand() {
        float lllllllllllllIIIIIlIlllIlIllIIII = 1.0f;
        if (lllllIIIIllIIll((this.mc.getRenderViewEntity() instanceof AbstractClientPlayer) ? 1 : 0)) {
            final AbstractClientPlayer lllllllllllllIIIIIlIlllIlIlIllll = (AbstractClientPlayer)this.mc.getRenderViewEntity();
            lllllllllllllIIIIIlIlllIlIllIIII = lllllllllllllIIIIIlIlllIlIlIllll.getFovModifier();
        }
        this.fovModifierHandPrev = this.fovModifierHand;
        this.fovModifierHand += (lllllllllllllIIIIIlIlllIlIllIIII - this.fovModifierHand) * 0.5f;
        if (lllllIIIIlllIII(lllllIIIIlllllI(this.fovModifierHand, 1.5f))) {
            this.fovModifierHand = 1.5f;
        }
        if (lllllIIIlIIIIII(lllllIIIIllllll(this.fovModifierHand, 0.1f))) {
            this.fovModifierHand = 0.1f;
        }
    }
    
    private static boolean lllllIIIlIIlIlI(final int lllllllllllllIIIIIlIlIlllIllIlII, final int lllllllllllllIIIIIlIlIlllIllIIll) {
        return lllllllllllllIIIIIlIlIlllIllIlII > lllllllllllllIIIIIlIlIlllIllIIll;
    }
    
    public void func_181022_b() {
        if (lllllIIIIllIlII(this.theShaderGroup)) {
            this.theShaderGroup.deleteShaderGroup();
        }
        this.theShaderGroup = null;
        this.shaderIndex = EntityRenderer.shaderCount;
    }
    
    private static int lllllIIIlIIIlII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private void renderWorldPass(final int lllllllllllllIIIIIlIllIlIIllllIl, final float lllllllllllllIIIIIlIllIlIlIIlIlI, final long lllllllllllllIIIIIlIllIlIIlllIll) {
        final RenderGlobal lllllllllllllIIIIIlIllIlIlIIlIII = this.mc.renderGlobal;
        final EffectRenderer lllllllllllllIIIIIlIllIlIlIIIlll = this.mc.effectRenderer;
        final boolean lllllllllllllIIIIIlIllIlIlIIIllI = this.isDrawBlockOutline();
        GlStateManager.enableCull();
        this.mc.mcProfiler.endStartSection(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[64]]);
        GlStateManager.viewport(EntityRenderer.lIllIIIllIIIlI[0], EntityRenderer.lIllIIIllIIIlI[0], this.mc.displayWidth, this.mc.displayHeight);
        this.updateFogColor(lllllllllllllIIIIIlIllIlIlIIlIlI);
        GlStateManager.clear(EntityRenderer.lIllIIIllIIIlI[65]);
        this.mc.mcProfiler.endStartSection(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[66]]);
        this.setupCameraTransform(lllllllllllllIIIIIlIllIlIlIIlIlI, lllllllllllllIIIIIlIllIlIIllllIl);
        final EntityPlayerSP thePlayer = this.mc.thePlayer;
        int lllllllllllllIIIllIlIllllIlIllIl;
        if (lllllIIIlIIIlIl(this.mc.gameSettings.thirdPersonView, EntityRenderer.lIllIIIllIIIlI[3])) {
            lllllllllllllIIIllIlIllllIlIllIl = EntityRenderer.lIllIIIllIIIlI[1];
            "".length();
            if ("  ".length() < "  ".length()) {
                return;
            }
        }
        else {
            lllllllllllllIIIllIlIllllIlIllIl = EntityRenderer.lIllIIIllIIIlI[0];
        }
        ActiveRenderInfo.updateRenderInfo(thePlayer, (boolean)(lllllllllllllIIIllIlIllllIlIllIl != 0));
        this.mc.mcProfiler.endStartSection(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[67]]);
        ClippingHelperImpl.getInstance();
        "".length();
        this.mc.mcProfiler.endStartSection(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[68]]);
        final ICamera lllllllllllllIIIIIlIllIlIlIIIlIl = new Frustum();
        final Entity lllllllllllllIIIIIlIllIlIlIIIlII = this.mc.getRenderViewEntity();
        final double lllllllllllllIIIIIlIllIlIlIIIIll = lllllllllllllIIIIIlIllIlIlIIIlII.lastTickPosX + (lllllllllllllIIIIIlIllIlIlIIIlII.posX - lllllllllllllIIIIIlIllIlIlIIIlII.lastTickPosX) * lllllllllllllIIIIIlIllIlIlIIlIlI;
        final double lllllllllllllIIIIIlIllIlIlIIIIlI = lllllllllllllIIIIIlIllIlIlIIIlII.lastTickPosY + (lllllllllllllIIIIIlIllIlIlIIIlII.posY - lllllllllllllIIIIIlIllIlIlIIIlII.lastTickPosY) * lllllllllllllIIIIIlIllIlIlIIlIlI;
        final double lllllllllllllIIIIIlIllIlIlIIIIIl = lllllllllllllIIIIIlIllIlIlIIIlII.lastTickPosZ + (lllllllllllllIIIIIlIllIlIlIIIlII.posZ - lllllllllllllIIIIIlIllIlIlIIIlII.lastTickPosZ) * lllllllllllllIIIIIlIllIlIlIIlIlI;
        lllllllllllllIIIIIlIllIlIlIIIlIl.setPosition(lllllllllllllIIIIIlIllIlIlIIIIll, lllllllllllllIIIIIlIllIlIlIIIIlI, lllllllllllllIIIIIlIllIlIlIIIIIl);
        if (lllllIIIIllIIlI(this.mc.gameSettings.renderDistanceChunks, EntityRenderer.lIllIIIllIIIlI[5])) {
            this.setupFog(EntityRenderer.lIllIIIllIIIlI[50], lllllllllllllIIIIIlIllIlIlIIlIlI);
            this.mc.mcProfiler.endStartSection(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[69]]);
            GlStateManager.matrixMode(EntityRenderer.lIllIIIllIIIlI[35]);
            GlStateManager.loadIdentity();
            Project.gluPerspective(this.getFOVModifier(lllllllllllllIIIIIlIllIlIlIIlIlI, (boolean)(EntityRenderer.lIllIIIllIIIlI[1] != 0)), this.mc.displayWidth / (float)this.mc.displayHeight, 0.05f, this.farPlaneDistance * 2.0f);
            GlStateManager.matrixMode(EntityRenderer.lIllIIIllIIIlI[36]);
            lllllllllllllIIIIIlIllIlIlIIlIII.renderSky(lllllllllllllIIIIIlIllIlIlIIlIlI, lllllllllllllIIIIIlIllIlIIllllIl);
            GlStateManager.matrixMode(EntityRenderer.lIllIIIllIIIlI[35]);
            GlStateManager.loadIdentity();
            Project.gluPerspective(this.getFOVModifier(lllllllllllllIIIIIlIllIlIlIIlIlI, (boolean)(EntityRenderer.lIllIIIllIIIlI[1] != 0)), this.mc.displayWidth / (float)this.mc.displayHeight, 0.05f, this.farPlaneDistance * MathHelper.SQRT_2);
            GlStateManager.matrixMode(EntityRenderer.lIllIIIllIIIlI[36]);
        }
        this.setupFog(EntityRenderer.lIllIIIllIIIlI[0], lllllllllllllIIIIIlIllIlIlIIlIlI);
        GlStateManager.shadeModel(EntityRenderer.lIllIIIllIIIlI[70]);
        if (lllllIIIlIIIIII(lllllIIIlIIlllI(lllllllllllllIIIIIlIllIlIlIIIlII.posY + lllllllllllllIIIIIlIllIlIlIIIlII.getEyeHeight(), 128.0))) {
            this.renderCloudsCheck(lllllllllllllIIIIIlIllIlIlIIlIII, lllllllllllllIIIIIlIllIlIlIIlIlI, lllllllllllllIIIIIlIllIlIIllllIl);
        }
        this.mc.mcProfiler.endStartSection(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[71]]);
        this.setupFog(EntityRenderer.lIllIIIllIIIlI[0], lllllllllllllIIIIIlIllIlIlIIlIlI);
        this.mc.getTextureManager().bindTexture(TextureMap.locationBlocksTexture);
        RenderHelper.disableStandardItemLighting();
        this.mc.mcProfiler.endStartSection(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[72]]);
        final RenderGlobal renderGlobal = lllllllllllllIIIIIlIllIlIlIIlIII;
        final Entity lllllllllllllIIlIIIlllIIIIIlllIl = lllllllllllllIIIIIlIllIlIlIIIlII;
        final double lllllllllllllIIlIIIllIllllllIllI = lllllllllllllIIIIIlIllIlIlIIlIlI;
        final ICamera lllllllllllllIIlIIIllIllllllIlIl = lllllllllllllIIIIIlIllIlIlIIIlIl;
        final int frameCount = this.frameCount;
        this.frameCount = frameCount + EntityRenderer.lIllIIIllIIIlI[1];
        renderGlobal.setupTerrain(lllllllllllllIIlIIIlllIIIIIlllIl, lllllllllllllIIlIIIllIllllllIllI, lllllllllllllIIlIIIllIllllllIlIl, frameCount, this.mc.thePlayer.isSpectator());
        if (!lllllIIIIllIIll(lllllllllllllIIIIIlIllIlIIllllIl) || lllllIIIlIIIlIl(lllllllllllllIIIIIlIllIlIIllllIl, EntityRenderer.lIllIIIllIIIlI[3])) {
            this.mc.mcProfiler.endStartSection(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[73]]);
            this.mc.renderGlobal.updateChunks(lllllllllllllIIIIIlIllIlIIlllIll);
        }
        this.mc.mcProfiler.endStartSection(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[74]]);
        GlStateManager.matrixMode(EntityRenderer.lIllIIIllIIIlI[36]);
        GlStateManager.pushMatrix();
        GlStateManager.disableAlpha();
        lllllllllllllIIIIIlIllIlIlIIlIII.renderBlockLayer(EnumWorldBlockLayer.SOLID, lllllllllllllIIIIIlIllIlIlIIlIlI, lllllllllllllIIIIIlIllIlIIllllIl, lllllllllllllIIIIIlIllIlIlIIIlII);
        "".length();
        GlStateManager.enableAlpha();
        lllllllllllllIIIIIlIllIlIlIIlIII.renderBlockLayer(EnumWorldBlockLayer.CUTOUT_MIPPED, lllllllllllllIIIIIlIllIlIlIIlIlI, lllllllllllllIIIIIlIllIlIIllllIl, lllllllllllllIIIIIlIllIlIlIIIlII);
        "".length();
        this.mc.getTextureManager().getTexture(TextureMap.locationBlocksTexture).setBlurMipmap((boolean)(EntityRenderer.lIllIIIllIIIlI[0] != 0), (boolean)(EntityRenderer.lIllIIIllIIIlI[0] != 0));
        lllllllllllllIIIIIlIllIlIlIIlIII.renderBlockLayer(EnumWorldBlockLayer.CUTOUT, lllllllllllllIIIIIlIllIlIlIIlIlI, lllllllllllllIIIIIlIllIlIIllllIl, lllllllllllllIIIIIlIllIlIlIIIlII);
        "".length();
        this.mc.getTextureManager().getTexture(TextureMap.locationBlocksTexture).restoreLastBlurMipmap();
        GlStateManager.shadeModel(EntityRenderer.lIllIIIllIIIlI[75]);
        GlStateManager.alphaFunc(EntityRenderer.lIllIIIllIIIlI[55], 0.1f);
        if (lllllIIIIllllII(this.debugView ? 1 : 0)) {
            GlStateManager.matrixMode(EntityRenderer.lIllIIIllIIIlI[36]);
            GlStateManager.popMatrix();
            GlStateManager.pushMatrix();
            RenderHelper.enableStandardItemLighting();
            this.mc.mcProfiler.endStartSection(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[76]]);
            lllllllllllllIIIIIlIllIlIlIIlIII.renderEntities(lllllllllllllIIIIIlIllIlIlIIIlII, lllllllllllllIIIIIlIllIlIlIIIlIl, lllllllllllllIIIIIlIllIlIlIIlIlI);
            RenderHelper.disableStandardItemLighting();
            this.disableLightmap();
            GlStateManager.matrixMode(EntityRenderer.lIllIIIllIIIlI[36]);
            GlStateManager.popMatrix();
            GlStateManager.pushMatrix();
            if (lllllIIIIllIlII(this.mc.objectMouseOver) && lllllIIIIllIIll(lllllllllllllIIIIIlIllIlIlIIIlII.isInsideOfMaterial(Material.water) ? 1 : 0) && lllllIIIIllIIll(lllllllllllllIIIIIlIllIlIlIIIllI ? 1 : 0)) {
                final EntityPlayer lllllllllllllIIIIIlIllIlIlIIIIII = (EntityPlayer)lllllllllllllIIIIIlIllIlIlIIIlII;
                GlStateManager.disableAlpha();
                this.mc.mcProfiler.endStartSection(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[77]]);
                lllllllllllllIIIIIlIllIlIlIIlIII.drawSelectionBox(lllllllllllllIIIIIlIllIlIlIIIIII, this.mc.objectMouseOver, EntityRenderer.lIllIIIllIIIlI[0], lllllllllllllIIIIIlIllIlIlIIlIlI);
                GlStateManager.enableAlpha();
            }
        }
        GlStateManager.matrixMode(EntityRenderer.lIllIIIllIIIlI[36]);
        GlStateManager.popMatrix();
        if (lllllIIIIllIIll(lllllllllllllIIIIIlIllIlIlIIIllI ? 1 : 0) && lllllIIIIllIlII(this.mc.objectMouseOver) && lllllIIIIllllII(lllllllllllllIIIIIlIllIlIlIIIlII.isInsideOfMaterial(Material.water) ? 1 : 0)) {
            final EntityPlayer lllllllllllllIIIIIlIllIlIIllllll = (EntityPlayer)lllllllllllllIIIIIlIllIlIlIIIlII;
            GlStateManager.disableAlpha();
            this.mc.mcProfiler.endStartSection(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[78]]);
            lllllllllllllIIIIIlIllIlIlIIlIII.drawSelectionBox(lllllllllllllIIIIIlIllIlIIllllll, this.mc.objectMouseOver, EntityRenderer.lIllIIIllIIIlI[0], lllllllllllllIIIIIlIllIlIlIIlIlI);
            GlStateManager.enableAlpha();
        }
        this.mc.mcProfiler.endStartSection(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[79]]);
        GlStateManager.enableBlend();
        GlStateManager.tryBlendFuncSeparate(EntityRenderer.lIllIIIllIIIlI[61], EntityRenderer.lIllIIIllIIIlI[1], EntityRenderer.lIllIIIllIIIlI[1], EntityRenderer.lIllIIIllIIIlI[0]);
        this.mc.getTextureManager().getTexture(TextureMap.locationBlocksTexture).setBlurMipmap((boolean)(EntityRenderer.lIllIIIllIIIlI[0] != 0), (boolean)(EntityRenderer.lIllIIIllIIIlI[0] != 0));
        lllllllllllllIIIIIlIllIlIlIIlIII.drawBlockDamageTexture(Tessellator.getInstance(), Tessellator.getInstance().getWorldRenderer(), lllllllllllllIIIIIlIllIlIlIIIlII, lllllllllllllIIIIIlIllIlIlIIlIlI);
        this.mc.getTextureManager().getTexture(TextureMap.locationBlocksTexture).restoreLastBlurMipmap();
        GlStateManager.disableBlend();
        if (lllllIIIIllllII(this.debugView ? 1 : 0)) {
            this.enableLightmap();
            this.mc.mcProfiler.endStartSection(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[80]]);
            lllllllllllllIIIIIlIllIlIlIIIlll.renderLitParticles(lllllllllllllIIIIIlIllIlIlIIIlII, lllllllllllllIIIIIlIllIlIlIIlIlI);
            RenderHelper.disableStandardItemLighting();
            this.setupFog(EntityRenderer.lIllIIIllIIIlI[0], lllllllllllllIIIIIlIllIlIlIIlIlI);
            this.mc.mcProfiler.endStartSection(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[81]]);
            lllllllllllllIIIIIlIllIlIlIIIlll.renderParticles(lllllllllllllIIIIIlIllIlIlIIIlII, lllllllllllllIIIIIlIllIlIlIIlIlI);
            this.disableLightmap();
        }
        GlStateManager.depthMask((boolean)(EntityRenderer.lIllIIIllIIIlI[0] != 0));
        GlStateManager.enableCull();
        this.mc.mcProfiler.endStartSection(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[82]]);
        this.renderRainSnow(lllllllllllllIIIIIlIllIlIlIIlIlI);
        GlStateManager.depthMask((boolean)(EntityRenderer.lIllIIIllIIIlI[1] != 0));
        lllllllllllllIIIIIlIllIlIlIIlIII.renderWorldBorder(lllllllllllllIIIIIlIllIlIlIIIlII, lllllllllllllIIIIIlIllIlIlIIlIlI);
        GlStateManager.disableBlend();
        GlStateManager.enableCull();
        GlStateManager.tryBlendFuncSeparate(EntityRenderer.lIllIIIllIIIlI[61], EntityRenderer.lIllIIIllIIIlI[62], EntityRenderer.lIllIIIllIIIlI[1], EntityRenderer.lIllIIIllIIIlI[0]);
        GlStateManager.alphaFunc(EntityRenderer.lIllIIIllIIIlI[55], 0.1f);
        this.setupFog(EntityRenderer.lIllIIIllIIIlI[0], lllllllllllllIIIIIlIllIlIlIIlIlI);
        GlStateManager.enableBlend();
        GlStateManager.depthMask((boolean)(EntityRenderer.lIllIIIllIIIlI[0] != 0));
        this.mc.getTextureManager().bindTexture(TextureMap.locationBlocksTexture);
        GlStateManager.shadeModel(EntityRenderer.lIllIIIllIIIlI[70]);
        this.mc.mcProfiler.endStartSection(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[83]]);
        lllllllllllllIIIIIlIllIlIlIIlIII.renderBlockLayer(EnumWorldBlockLayer.TRANSLUCENT, lllllllllllllIIIIIlIllIlIlIIlIlI, lllllllllllllIIIIIlIllIlIIllllIl, lllllllllllllIIIIIlIllIlIlIIIlII);
        "".length();
        GlStateManager.shadeModel(EntityRenderer.lIllIIIllIIIlI[75]);
        GlStateManager.depthMask((boolean)(EntityRenderer.lIllIIIllIIIlI[1] != 0));
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        GlStateManager.disableFog();
        if (lllllIIIIlllIll(lllllIIIlIIllll(lllllllllllllIIIIIlIllIlIlIIIlII.posY + lllllllllllllIIIIIlIllIlIlIIIlII.getEyeHeight(), 128.0))) {
            this.mc.mcProfiler.endStartSection(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[52]]);
            this.renderCloudsCheck(lllllllllllllIIIIIlIllIlIlIIlIII, lllllllllllllIIIIIlIllIlIlIIlIlI, lllllllllllllIIIIIlIllIlIIllllIl);
        }
        this.mc.mcProfiler.endStartSection(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[84]]);
        if (lllllIIIIllIIll(this.renderHand ? 1 : 0)) {
            GlStateManager.clear(EntityRenderer.lIllIIIllIIIlI[47]);
            this.renderHand(lllllllllllllIIIIIlIllIlIlIIlIlI, lllllllllllllIIIIIlIllIlIIllllIl);
            this.renderWorldDirections(lllllllllllllIIIIIlIllIlIlIIlIlI);
        }
    }
    
    private static int lllllIIIlIIlllI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public void activateNextShader() {
        if (lllllIIIIllIIll(OpenGlHelper.shadersSupported ? 1 : 0) && lllllIIIIllIIll((this.mc.getRenderViewEntity() instanceof EntityPlayer) ? 1 : 0)) {
            if (lllllIIIIllIlII(this.theShaderGroup)) {
                this.theShaderGroup.deleteShaderGroup();
            }
            this.shaderIndex = (this.shaderIndex + EntityRenderer.lIllIIIllIIIlI[1]) % (EntityRenderer.shaderResourceLocations.length + EntityRenderer.lIllIIIllIIIlI[1]);
            if (lllllIIIIllIlIl(this.shaderIndex, EntityRenderer.shaderCount)) {
                this.loadShader(EntityRenderer.shaderResourceLocations[this.shaderIndex]);
                "".length();
                if (-" ".length() >= ((0x77 ^ 0x5C) & ~(0xAF ^ 0x84))) {
                    return;
                }
            }
            else {
                this.theShaderGroup = null;
            }
        }
    }
    
    static {
        lllllIIIIllIIIl();
        lllllIIIIlIlIlI();
        logger = LogManager.getLogger();
        locationRainPng = new ResourceLocation(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[0]]);
        locationSnowPng = new ResourceLocation(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[1]]);
        final ResourceLocation[] shaderResourceLocations2 = new ResourceLocation[EntityRenderer.lIllIIIllIIIlI[2]];
        shaderResourceLocations2[EntityRenderer.lIllIIIllIIIlI[0]] = new ResourceLocation(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[3]]);
        shaderResourceLocations2[EntityRenderer.lIllIIIllIIIlI[1]] = new ResourceLocation(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[4]]);
        shaderResourceLocations2[EntityRenderer.lIllIIIllIIIlI[3]] = new ResourceLocation(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[5]]);
        shaderResourceLocations2[EntityRenderer.lIllIIIllIIIlI[4]] = new ResourceLocation(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[6]]);
        shaderResourceLocations2[EntityRenderer.lIllIIIllIIIlI[5]] = new ResourceLocation(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[7]]);
        shaderResourceLocations2[EntityRenderer.lIllIIIllIIIlI[6]] = new ResourceLocation(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[8]]);
        shaderResourceLocations2[EntityRenderer.lIllIIIllIIIlI[7]] = new ResourceLocation(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[9]]);
        shaderResourceLocations2[EntityRenderer.lIllIIIllIIIlI[8]] = new ResourceLocation(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[10]]);
        shaderResourceLocations2[EntityRenderer.lIllIIIllIIIlI[9]] = new ResourceLocation(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[11]]);
        shaderResourceLocations2[EntityRenderer.lIllIIIllIIIlI[10]] = new ResourceLocation(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[12]]);
        shaderResourceLocations2[EntityRenderer.lIllIIIllIIIlI[11]] = new ResourceLocation(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[13]]);
        shaderResourceLocations2[EntityRenderer.lIllIIIllIIIlI[12]] = new ResourceLocation(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[14]]);
        shaderResourceLocations2[EntityRenderer.lIllIIIllIIIlI[13]] = new ResourceLocation(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[15]]);
        shaderResourceLocations2[EntityRenderer.lIllIIIllIIIlI[14]] = new ResourceLocation(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[16]]);
        shaderResourceLocations2[EntityRenderer.lIllIIIllIIIlI[15]] = new ResourceLocation(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[17]]);
        shaderResourceLocations2[EntityRenderer.lIllIIIllIIIlI[16]] = new ResourceLocation(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[18]]);
        shaderResourceLocations2[EntityRenderer.lIllIIIllIIIlI[17]] = new ResourceLocation(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[19]]);
        shaderResourceLocations2[EntityRenderer.lIllIIIllIIIlI[18]] = new ResourceLocation(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[20]]);
        shaderResourceLocations2[EntityRenderer.lIllIIIllIIIlI[19]] = new ResourceLocation(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[21]]);
        shaderResourceLocations2[EntityRenderer.lIllIIIllIIIlI[20]] = new ResourceLocation(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[22]]);
        shaderResourceLocations2[EntityRenderer.lIllIIIllIIIlI[21]] = new ResourceLocation(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[23]]);
        shaderResourceLocations2[EntityRenderer.lIllIIIllIIIlI[22]] = new ResourceLocation(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[24]]);
        shaderResourceLocations2[EntityRenderer.lIllIIIllIIIlI[23]] = new ResourceLocation(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[2]]);
        shaderResourceLocations2[EntityRenderer.lIllIIIllIIIlI[24]] = new ResourceLocation(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[25]]);
        shaderResourceLocations = shaderResourceLocations2;
        shaderCount = EntityRenderer.shaderResourceLocations.length;
    }
    
    private void loadShader(final ResourceLocation lllllllllllllIIIIIlIllllIIIlIIII) {
        try {
            this.theShaderGroup = new ShaderGroup(this.mc.getTextureManager(), this.resourceManager, this.mc.getFramebuffer(), lllllllllllllIIIIIlIllllIIIlIIII);
            this.theShaderGroup.createBindFramebuffers(this.mc.displayWidth, this.mc.displayHeight);
            this.useShader = (EntityRenderer.lIllIIIllIIIlI[1] != 0);
            "".length();
            if ((0x5 ^ 0x1) == "   ".length()) {
                return;
            }
        }
        catch (IOException lllllllllllllIIIIIlIllllIIIlIIll) {
            EntityRenderer.logger.warn(String.valueOf(new StringBuilder(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[32]]).append(lllllllllllllIIIIIlIllllIIIlIIII)), (Throwable)lllllllllllllIIIIIlIllllIIIlIIll);
            this.shaderIndex = EntityRenderer.shaderCount;
            this.useShader = (EntityRenderer.lIllIIIllIIIlI[0] != 0);
            "".length();
            if (null != null) {
                return;
            }
        }
        catch (JsonSyntaxException lllllllllllllIIIIIlIllllIIIlIIlI) {
            EntityRenderer.logger.warn(String.valueOf(new StringBuilder(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[33]]).append(lllllllllllllIIIIIlIllllIIIlIIII)), (Throwable)lllllllllllllIIIIIlIllllIIIlIIlI);
            this.shaderIndex = EntityRenderer.shaderCount;
            this.useShader = (EntityRenderer.lIllIIIllIIIlI[0] != 0);
        }
    }
    
    private static boolean lllllIIIlIIIlIl(final int lllllllllllllIIIIIlIlIllllIIIlII, final int lllllllllllllIIIIIlIlIllllIIIIll) {
        return lllllllllllllIIIIIlIlIllllIIIlII == lllllllllllllIIIIIlIlIllllIIIIll;
    }
    
    private void updateLightmap(final float lllllllllllllIIIIIlIllIllllIllIl) {
        if (lllllIIIIllIIll(this.lightmapUpdateNeeded ? 1 : 0)) {
            this.mc.mcProfiler.startSection(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[45]]);
            final World lllllllllllllIIIIIlIllIllllIllII = this.mc.theWorld;
            if (lllllIIIIllIlII(lllllllllllllIIIIIlIllIllllIllII)) {
                final float lllllllllllllIIIIIlIllIllllIlIll = lllllllllllllIIIIIlIllIllllIllII.getSunBrightness(1.0f);
                final float lllllllllllllIIIIIlIllIllllIlIlI = lllllllllllllIIIIIlIllIllllIlIll * 0.95f + 0.05f;
                int lllllllllllllIIIIIlIllIllllIlIIl = EntityRenderer.lIllIIIllIIIlI[0];
                "".length();
                if (-" ".length() >= 0) {
                    return;
                }
                while (!lllllIIIIllIIlI(lllllllllllllIIIIIlIllIllllIlIIl, EntityRenderer.lIllIIIllIIIlI[47])) {
                    float lllllllllllllIIIIIlIllIllllIlIII = lllllllllllllIIIIIlIllIllllIllII.provider.getLightBrightnessTable()[lllllllllllllIIIIIlIllIllllIlIIl / EntityRenderer.lIllIIIllIIIlI[17]] * lllllllllllllIIIIIlIllIllllIlIlI;
                    final float lllllllllllllIIIIIlIllIllllIIlll = lllllllllllllIIIIIlIllIllllIllII.provider.getLightBrightnessTable()[lllllllllllllIIIIIlIllIllllIlIIl % EntityRenderer.lIllIIIllIIIlI[17]] * (this.torchFlickerX * 0.1f + 1.5f);
                    if (lllllIIIIlllIII(lllllllllllllIIIIIlIllIllllIllII.getLastLightningBolt())) {
                        lllllllllllllIIIIIlIllIllllIlIII = lllllllllllllIIIIIlIllIllllIllII.provider.getLightBrightnessTable()[lllllllllllllIIIIIlIllIllllIlIIl / EntityRenderer.lIllIIIllIIIlI[17]];
                    }
                    final float lllllllllllllIIIIIlIllIllllIIllI = lllllllllllllIIIIIlIllIllllIlIII * (lllllllllllllIIIIIlIllIllllIlIll * 0.65f + 0.35f);
                    final float lllllllllllllIIIIIlIllIllllIIlIl = lllllllllllllIIIIIlIllIllllIlIII * (lllllllllllllIIIIIlIllIllllIlIll * 0.65f + 0.35f);
                    final float lllllllllllllIIIIIlIllIllllIIlII = lllllllllllllIIIIIlIllIllllIIlll * ((lllllllllllllIIIIIlIllIllllIIlll * 0.6f + 0.4f) * 0.6f + 0.4f);
                    final float lllllllllllllIIIIIlIllIllllIIIll = lllllllllllllIIIIIlIllIllllIIlll * (lllllllllllllIIIIIlIllIllllIIlll * lllllllllllllIIIIIlIllIllllIIlll * 0.6f + 0.4f);
                    float lllllllllllllIIIIIlIllIllllIIIlI = lllllllllllllIIIIIlIllIllllIIllI + lllllllllllllIIIIIlIllIllllIIlll;
                    float lllllllllllllIIIIIlIllIllllIIIIl = lllllllllllllIIIIIlIllIllllIIlIl + lllllllllllllIIIIIlIllIllllIIlII;
                    float lllllllllllllIIIIIlIllIllllIIIII = lllllllllllllIIIIIlIllIllllIlIII + lllllllllllllIIIIIlIllIllllIIIll;
                    lllllllllllllIIIIIlIllIllllIIIlI = lllllllllllllIIIIIlIllIllllIIIlI * 0.96f + 0.03f;
                    lllllllllllllIIIIIlIllIllllIIIIl = lllllllllllllIIIIIlIllIllllIIIIl * 0.96f + 0.03f;
                    lllllllllllllIIIIIlIllIllllIIIII = lllllllllllllIIIIIlIllIllllIIIII * 0.96f + 0.03f;
                    if (lllllIIIIlllIII(lllllIIIlIIlIII(this.bossColorModifier, 0.0f))) {
                        final float lllllllllllllIIIIIlIllIlllIlllll = this.bossColorModifierPrev + (this.bossColorModifier - this.bossColorModifierPrev) * lllllllllllllIIIIIlIllIllllIllIl;
                        lllllllllllllIIIIIlIllIllllIIIlI = lllllllllllllIIIIIlIllIllllIIIlI * (1.0f - lllllllllllllIIIIIlIllIlllIlllll) + lllllllllllllIIIIIlIllIllllIIIlI * 0.7f * lllllllllllllIIIIIlIllIlllIlllll;
                        lllllllllllllIIIIIlIllIllllIIIIl = lllllllllllllIIIIIlIllIllllIIIIl * (1.0f - lllllllllllllIIIIIlIllIlllIlllll) + lllllllllllllIIIIIlIllIllllIIIIl * 0.6f * lllllllllllllIIIIIlIllIlllIlllll;
                        lllllllllllllIIIIIlIllIllllIIIII = lllllllllllllIIIIIlIllIllllIIIII * (1.0f - lllllllllllllIIIIIlIllIlllIlllll) + lllllllllllllIIIIIlIllIllllIIIII * 0.6f * lllllllllllllIIIIIlIllIlllIlllll;
                    }
                    if (lllllIIIlIIIlIl(lllllllllllllIIIIIlIllIllllIllII.provider.getDimensionId(), EntityRenderer.lIllIIIllIIIlI[1])) {
                        lllllllllllllIIIIIlIllIllllIIIlI = 0.22f + lllllllllllllIIIIIlIllIllllIIlll * 0.75f;
                        lllllllllllllIIIIIlIllIllllIIIIl = 0.28f + lllllllllllllIIIIIlIllIllllIIlII * 0.75f;
                        lllllllllllllIIIIIlIllIllllIIIII = 0.25f + lllllllllllllIIIIIlIllIllllIIIll * 0.75f;
                    }
                    if (lllllIIIIllIIll(this.mc.thePlayer.isPotionActive(Potion.nightVision) ? 1 : 0)) {
                        final float lllllllllllllIIIIIlIllIlllIllllI = this.getNightVisionBrightness(this.mc.thePlayer, lllllllllllllIIIIIlIllIllllIllIl);
                        float lllllllllllllIIIIIlIllIlllIlllIl = 1.0f / lllllllllllllIIIIIlIllIllllIIIlI;
                        if (lllllIIIIlllIII(lllllIIIlIIlIII(lllllllllllllIIIIIlIllIlllIlllIl, 1.0f / lllllllllllllIIIIIlIllIllllIIIIl))) {
                            lllllllllllllIIIIIlIllIlllIlllIl = 1.0f / lllllllllllllIIIIIlIllIllllIIIIl;
                        }
                        if (lllllIIIIlllIII(lllllIIIlIIlIII(lllllllllllllIIIIIlIllIlllIlllIl, 1.0f / lllllllllllllIIIIIlIllIllllIIIII))) {
                            lllllllllllllIIIIIlIllIlllIlllIl = 1.0f / lllllllllllllIIIIIlIllIllllIIIII;
                        }
                        lllllllllllllIIIIIlIllIllllIIIlI = lllllllllllllIIIIIlIllIllllIIIlI * (1.0f - lllllllllllllIIIIIlIllIlllIllllI) + lllllllllllllIIIIIlIllIllllIIIlI * lllllllllllllIIIIIlIllIlllIlllIl * lllllllllllllIIIIIlIllIlllIllllI;
                        lllllllllllllIIIIIlIllIllllIIIIl = lllllllllllllIIIIIlIllIllllIIIIl * (1.0f - lllllllllllllIIIIIlIllIlllIllllI) + lllllllllllllIIIIIlIllIllllIIIIl * lllllllllllllIIIIIlIllIlllIlllIl * lllllllllllllIIIIIlIllIlllIllllI;
                        lllllllllllllIIIIIlIllIllllIIIII = lllllllllllllIIIIIlIllIllllIIIII * (1.0f - lllllllllllllIIIIIlIllIlllIllllI) + lllllllllllllIIIIIlIllIllllIIIII * lllllllllllllIIIIIlIllIlllIlllIl * lllllllllllllIIIIIlIllIlllIllllI;
                    }
                    if (lllllIIIIlllIII(lllllIIIlIIlIII(lllllllllllllIIIIIlIllIllllIIIlI, 1.0f))) {
                        lllllllllllllIIIIIlIllIllllIIIlI = 1.0f;
                    }
                    if (lllllIIIIlllIII(lllllIIIlIIlIII(lllllllllllllIIIIIlIllIllllIIIIl, 1.0f))) {
                        lllllllllllllIIIIIlIllIllllIIIIl = 1.0f;
                    }
                    if (lllllIIIIlllIII(lllllIIIlIIlIII(lllllllllllllIIIIIlIllIllllIIIII, 1.0f))) {
                        lllllllllllllIIIIIlIllIllllIIIII = 1.0f;
                    }
                    final float lllllllllllllIIIIIlIllIlllIlllII = this.mc.gameSettings.gammaSetting;
                    float lllllllllllllIIIIIlIllIlllIllIll = 1.0f - lllllllllllllIIIIIlIllIllllIIIlI;
                    float lllllllllllllIIIIIlIllIlllIllIlI = 1.0f - lllllllllllllIIIIIlIllIllllIIIIl;
                    float lllllllllllllIIIIIlIllIlllIllIIl = 1.0f - lllllllllllllIIIIIlIllIllllIIIII;
                    lllllllllllllIIIIIlIllIlllIllIll = 1.0f - lllllllllllllIIIIIlIllIlllIllIll * lllllllllllllIIIIIlIllIlllIllIll * lllllllllllllIIIIIlIllIlllIllIll * lllllllllllllIIIIIlIllIlllIllIll;
                    lllllllllllllIIIIIlIllIlllIllIlI = 1.0f - lllllllllllllIIIIIlIllIlllIllIlI * lllllllllllllIIIIIlIllIlllIllIlI * lllllllllllllIIIIIlIllIlllIllIlI * lllllllllllllIIIIIlIllIlllIllIlI;
                    lllllllllllllIIIIIlIllIlllIllIIl = 1.0f - lllllllllllllIIIIIlIllIlllIllIIl * lllllllllllllIIIIIlIllIlllIllIIl * lllllllllllllIIIIIlIllIlllIllIIl * lllllllllllllIIIIIlIllIlllIllIIl;
                    lllllllllllllIIIIIlIllIllllIIIlI = lllllllllllllIIIIIlIllIllllIIIlI * (1.0f - lllllllllllllIIIIIlIllIlllIlllII) + lllllllllllllIIIIIlIllIlllIllIll * lllllllllllllIIIIIlIllIlllIlllII;
                    lllllllllllllIIIIIlIllIllllIIIIl = lllllllllllllIIIIIlIllIllllIIIIl * (1.0f - lllllllllllllIIIIIlIllIlllIlllII) + lllllllllllllIIIIIlIllIlllIllIlI * lllllllllllllIIIIIlIllIlllIlllII;
                    lllllllllllllIIIIIlIllIllllIIIII = lllllllllllllIIIIIlIllIllllIIIII * (1.0f - lllllllllllllIIIIIlIllIlllIlllII) + lllllllllllllIIIIIlIllIlllIllIIl * lllllllllllllIIIIIlIllIlllIlllII;
                    lllllllllllllIIIIIlIllIllllIIIlI = lllllllllllllIIIIIlIllIllllIIIlI * 0.96f + 0.03f;
                    lllllllllllllIIIIIlIllIllllIIIIl = lllllllllllllIIIIIlIllIllllIIIIl * 0.96f + 0.03f;
                    lllllllllllllIIIIIlIllIllllIIIII = lllllllllllllIIIIIlIllIllllIIIII * 0.96f + 0.03f;
                    if (lllllIIIIlllIII(lllllIIIlIIlIII(lllllllllllllIIIIIlIllIllllIIIlI, 1.0f))) {
                        lllllllllllllIIIIIlIllIllllIIIlI = 1.0f;
                    }
                    if (lllllIIIIlllIII(lllllIIIlIIlIII(lllllllllllllIIIIIlIllIllllIIIIl, 1.0f))) {
                        lllllllllllllIIIIIlIllIllllIIIIl = 1.0f;
                    }
                    if (lllllIIIIlllIII(lllllIIIlIIlIII(lllllllllllllIIIIIlIllIllllIIIII, 1.0f))) {
                        lllllllllllllIIIIIlIllIllllIIIII = 1.0f;
                    }
                    if (lllllIIIlIIIIII(lllllIIIlIIlIIl(lllllllllllllIIIIIlIllIllllIIIlI, 0.0f))) {
                        lllllllllllllIIIIIlIllIllllIIIlI = 0.0f;
                    }
                    if (lllllIIIlIIIIII(lllllIIIlIIlIIl(lllllllllllllIIIIIlIllIllllIIIIl, 0.0f))) {
                        lllllllllllllIIIIIlIllIllllIIIIl = 0.0f;
                    }
                    if (lllllIIIlIIIIII(lllllIIIlIIlIIl(lllllllllllllIIIIIlIllIllllIIIII, 0.0f))) {
                        lllllllllllllIIIIIlIllIllllIIIII = 0.0f;
                    }
                    final int lllllllllllllIIIIIlIllIlllIllIII = EntityRenderer.lIllIIIllIIIlI[46];
                    final int lllllllllllllIIIIIlIllIlllIlIlll = (int)(lllllllllllllIIIIIlIllIllllIIIlI * 255.0f);
                    final int lllllllllllllIIIIIlIllIlllIlIllI = (int)(lllllllllllllIIIIIlIllIllllIIIIl * 255.0f);
                    final int lllllllllllllIIIIIlIllIlllIlIlIl = (int)(lllllllllllllIIIIIlIllIllllIIIII * 255.0f);
                    this.lightmapColors[lllllllllllllIIIIIlIllIllllIlIIl] = (lllllllllllllIIIIIlIllIlllIllIII << EntityRenderer.lIllIIIllIIIlI[2] | lllllllllllllIIIIIlIllIlllIlIlll << EntityRenderer.lIllIIIllIIIlI[17] | lllllllllllllIIIIIlIllIlllIlIllI << EntityRenderer.lIllIIIllIIIlI[9] | lllllllllllllIIIIIlIllIlllIlIlIl);
                    ++lllllllllllllIIIIIlIllIllllIlIIl;
                }
                this.lightmapTexture.updateDynamicTexture();
                this.lightmapUpdateNeeded = (EntityRenderer.lIllIIIllIIIlI[0] != 0);
                this.mc.mcProfiler.endSection();
            }
        }
    }
    
    private static int lllllIIIlIlIllI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static int lllllIIIlIllIII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static int lllllIIIlIIIlll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static int lllllIIIlIlIIII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lllllIIIlIlIlII(final int lllllllllllllIIIIIlIlIlllIllllII, final int lllllllllllllIIIIIlIlIlllIlllIll) {
        return lllllllllllllIIIIIlIlIlllIllllII < lllllllllllllIIIIIlIlIlllIlllIll;
    }
    
    private void renderWorldDirections(final float lllllllllllllIIIIIlIllIlIllIIlll) {
        if (lllllIIIIllIIll(this.mc.gameSettings.showDebugInfo ? 1 : 0) && lllllIIIIllllII(this.mc.gameSettings.hideGUI ? 1 : 0) && lllllIIIIllllII(this.mc.thePlayer.hasReducedDebug() ? 1 : 0) && lllllIIIIllllII(this.mc.gameSettings.reducedDebugInfo ? 1 : 0)) {
            final Entity lllllllllllllIIIIIlIllIlIllIIllI = this.mc.getRenderViewEntity();
            GlStateManager.enableBlend();
            GlStateManager.tryBlendFuncSeparate(EntityRenderer.lIllIIIllIIIlI[61], EntityRenderer.lIllIIIllIIIlI[62], EntityRenderer.lIllIIIllIIIlI[1], EntityRenderer.lIllIIIllIIIlI[0]);
            GL11.glLineWidth(1.0f);
            GlStateManager.disableTexture2D();
            GlStateManager.depthMask((boolean)(EntityRenderer.lIllIIIllIIIlI[0] != 0));
            GlStateManager.pushMatrix();
            GlStateManager.matrixMode(EntityRenderer.lIllIIIllIIIlI[36]);
            GlStateManager.loadIdentity();
            this.orientCamera(lllllllllllllIIIIIlIllIlIllIIlll);
            GlStateManager.translate(0.0f, lllllllllllllIIIIIlIllIlIllIIllI.getEyeHeight(), 0.0f);
            RenderGlobal.func_181563_a(new AxisAlignedBB(0.0, 0.0, 0.0, 0.005, 1.0E-4, 1.0E-4), EntityRenderer.lIllIIIllIIIlI[46], EntityRenderer.lIllIIIllIIIlI[0], EntityRenderer.lIllIIIllIIIlI[0], EntityRenderer.lIllIIIllIIIlI[46]);
            RenderGlobal.func_181563_a(new AxisAlignedBB(0.0, 0.0, 0.0, 1.0E-4, 1.0E-4, 0.005), EntityRenderer.lIllIIIllIIIlI[0], EntityRenderer.lIllIIIllIIIlI[0], EntityRenderer.lIllIIIllIIIlI[46], EntityRenderer.lIllIIIllIIIlI[46]);
            RenderGlobal.func_181563_a(new AxisAlignedBB(0.0, 0.0, 0.0, 1.0E-4, 0.0033, 1.0E-4), EntityRenderer.lIllIIIllIIIlI[0], EntityRenderer.lIllIIIllIIIlI[46], EntityRenderer.lIllIIIllIIIlI[0], EntityRenderer.lIllIIIllIIIlI[46]);
            GlStateManager.popMatrix();
            GlStateManager.depthMask((boolean)(EntityRenderer.lIllIIIllIIIlI[1] != 0));
            GlStateManager.enableTexture2D();
            GlStateManager.disableBlend();
        }
    }
    
    public void loadEntityShader(final Entity lllllllllllllIIIIIlIllllIIIllllI) {
        if (lllllIIIIllIIll(OpenGlHelper.shadersSupported ? 1 : 0)) {
            if (lllllIIIIllIlII(this.theShaderGroup)) {
                this.theShaderGroup.deleteShaderGroup();
            }
            this.theShaderGroup = null;
            if (lllllIIIIllIIll((lllllllllllllIIIIIlIllllIIIllllI instanceof EntityCreeper) ? 1 : 0)) {
                this.loadShader(new ResourceLocation(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[29]]));
                "".length();
                if (((0x2A ^ 0x6D) & ~(0x7B ^ 0x3C)) != 0x0) {
                    return;
                }
            }
            else if (lllllIIIIllIIll((lllllllllllllIIIIIlIllllIIIllllI instanceof EntitySpider) ? 1 : 0)) {
                this.loadShader(new ResourceLocation(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[30]]));
                "".length();
                if (-" ".length() >= 0) {
                    return;
                }
            }
            else if (lllllIIIIllIIll((lllllllllllllIIIIIlIllllIIIllllI instanceof EntityEnderman) ? 1 : 0)) {
                this.loadShader(new ResourceLocation(EntityRenderer.lIllIIIlIllIll[EntityRenderer.lIllIIIllIIIlI[31]]));
            }
        }
    }
    
    private void setupViewBobbing(final float lllllllllllllIIIIIlIlllIIllllIIl) {
        if (lllllIIIIllIIll((this.mc.getRenderViewEntity() instanceof EntityPlayer) ? 1 : 0)) {
            final EntityPlayer lllllllllllllIIIIIlIlllIIlllllll = (EntityPlayer)this.mc.getRenderViewEntity();
            final float lllllllllllllIIIIIlIlllIIllllllI = lllllllllllllIIIIIlIlllIIlllllll.distanceWalkedModified - lllllllllllllIIIIIlIlllIIlllllll.prevDistanceWalkedModified;
            final float lllllllllllllIIIIIlIlllIIlllllIl = -(lllllllllllllIIIIIlIlllIIlllllll.distanceWalkedModified + lllllllllllllIIIIIlIlllIIllllllI * lllllllllllllIIIIIlIlllIIllllIIl);
            final float lllllllllllllIIIIIlIlllIIlllllII = lllllllllllllIIIIIlIlllIIlllllll.prevCameraYaw + (lllllllllllllIIIIIlIlllIIlllllll.cameraYaw - lllllllllllllIIIIIlIlllIIlllllll.prevCameraYaw) * lllllllllllllIIIIIlIlllIIllllIIl;
            final float lllllllllllllIIIIIlIlllIIllllIll = lllllllllllllIIIIIlIlllIIlllllll.prevCameraPitch + (lllllllllllllIIIIIlIlllIIlllllll.cameraPitch - lllllllllllllIIIIIlIlllIIlllllll.prevCameraPitch) * lllllllllllllIIIIIlIlllIIllllIIl;
            GlStateManager.translate(MathHelper.sin(lllllllllllllIIIIIlIlllIIlllllIl * 3.1415927f) * lllllllllllllIIIIIlIlllIIlllllII * 0.5f, -Math.abs(MathHelper.cos(lllllllllllllIIIIIlIlllIIlllllIl * 3.1415927f) * lllllllllllllIIIIIlIlllIIlllllII), 0.0f);
            GlStateManager.rotate(MathHelper.sin(lllllllllllllIIIIIlIlllIIlllllIl * 3.1415927f) * lllllllllllllIIIIIlIlllIIlllllII * 3.0f, 0.0f, 0.0f, 1.0f);
            GlStateManager.rotate(Math.abs(MathHelper.cos(lllllllllllllIIIIIlIlllIIlllllIl * 3.1415927f - 0.2f) * lllllllllllllIIIIIlIlllIIlllllII) * 5.0f, 1.0f, 0.0f, 0.0f);
            GlStateManager.rotate(lllllllllllllIIIIIlIlllIIllllIll, 1.0f, 0.0f, 0.0f);
        }
    }
    
    private void hurtCameraEffect(final float lllllllllllllIIIIIlIlllIlIIIllII) {
        if (lllllIIIIllIIll((this.mc.getRenderViewEntity() instanceof EntityLivingBase) ? 1 : 0)) {
            final EntityLivingBase lllllllllllllIIIIIlIlllIlIIlIIIl = (EntityLivingBase)this.mc.getRenderViewEntity();
            float lllllllllllllIIIIIlIlllIlIIlIIII = lllllllllllllIIIIIlIlllIlIIlIIIl.hurtTime - lllllllllllllIIIIIlIlllIlIIIllII;
            if (lllllIIIlIIIIlI(lllllIIIlIIIIll(lllllllllllllIIIIIlIlllIlIIlIIIl.getHealth(), 0.0f))) {
                final float lllllllllllllIIIIIlIlllIlIIIllll = lllllllllllllIIIIIlIlllIlIIlIIIl.deathTime + lllllllllllllIIIIIlIlllIlIIIllII;
                GlStateManager.rotate(40.0f - 8000.0f / (lllllllllllllIIIIIlIlllIlIIIllll + 200.0f), 0.0f, 0.0f, 1.0f);
            }
            if (lllllIIIlIIIIII(lllllIIIlIIIIll(lllllllllllllIIIIIlIlllIlIIlIIII, 0.0f))) {
                return;
            }
            lllllllllllllIIIIIlIlllIlIIlIIII /= lllllllllllllIIIIIlIlllIlIIlIIIl.maxHurtTime;
            lllllllllllllIIIIIlIlllIlIIlIIII = MathHelper.sin(lllllllllllllIIIIIlIlllIlIIlIIII * lllllllllllllIIIIIlIlllIlIIlIIII * lllllllllllllIIIIIlIlllIlIIlIIII * lllllllllllllIIIIIlIlllIlIIlIIII * 3.1415927f);
            final float lllllllllllllIIIIIlIlllIlIIIlllI = lllllllllllllIIIIIlIlllIlIIlIIIl.attackedAtYaw;
            GlStateManager.rotate(-lllllllllllllIIIIIlIlllIlIIIlllI, 0.0f, 1.0f, 0.0f);
            GlStateManager.rotate(-lllllllllllllIIIIIlIlllIlIIlIIII * 14.0f, 0.0f, 0.0f, 1.0f);
            GlStateManager.rotate(lllllllllllllIIIIIlIlllIlIIIlllI, 0.0f, 1.0f, 0.0f);
        }
    }
    
    private static boolean lllllIIIIlllIll(final int lllllllllllllIIIIIlIlIlllIlIIIIl) {
        return lllllllllllllIIIIIlIlIlllIlIIIIl >= 0;
    }
    
    public MapItemRenderer getMapItemRenderer() {
        return this.theMapItemRenderer;
    }
    
    private static boolean lllllIIIlIlIIlI(final int lllllllllllllIIIIIlIlIlllIlllIII, final int lllllllllllllIIIIIlIlIlllIllIlll) {
        return lllllllllllllIIIIIlIlIlllIlllIII <= lllllllllllllIIIIIlIlIlllIllIlll;
    }
    
    private boolean isDrawBlockOutline() {
        if (lllllIIIIllllII(this.drawBlockOutline ? 1 : 0)) {
            return EntityRenderer.lIllIIIllIIIlI[0] != 0;
        }
        final Entity lllllllllllllIIIIIlIllIlIlllIllI = this.mc.getRenderViewEntity();
        int n;
        if (lllllIIIIllIIll((lllllllllllllIIIIIlIllIlIlllIllI instanceof EntityPlayer) ? 1 : 0) && lllllIIIIllllII(this.mc.gameSettings.hideGUI ? 1 : 0)) {
            n = EntityRenderer.lIllIIIllIIIlI[1];
            "".length();
            if (null != null) {
                return ((0x49 ^ 0x4E ^ (0x23 ^ 0x35)) & (0x8D ^ 0xA1 ^ (0x64 ^ 0x59) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = EntityRenderer.lIllIIIllIIIlI[0];
        }
        boolean lllllllllllllIIIIIlIllIlIlllIlIl = n != 0;
        if (lllllIIIIllIIll(lllllllllllllIIIIIlIllIlIlllIlIl ? 1 : 0) && lllllIIIIllllII(((EntityPlayer)lllllllllllllIIIIIlIllIlIlllIllI).capabilities.allowEdit ? 1 : 0)) {
            final ItemStack lllllllllllllIIIIIlIllIlIlllIlII = ((EntityPlayer)lllllllllllllIIIIIlIllIlIlllIllI).getCurrentEquippedItem();
            if (lllllIIIIllIlII(this.mc.objectMouseOver) && lllllIIIIllllIl(this.mc.objectMouseOver.typeOfHit, MovingObjectPosition.MovingObjectType.BLOCK)) {
                final BlockPos lllllllllllllIIIIIlIllIlIlllIIll = this.mc.objectMouseOver.getBlockPos();
                final Block lllllllllllllIIIIIlIllIlIlllIIlI = this.mc.theWorld.getBlockState(lllllllllllllIIIIIlIllIlIlllIIll).getBlock();
                if (lllllIIIIllllIl(this.mc.playerController.getCurrentGameType(), WorldSettings.GameType.SPECTATOR)) {
                    int n2;
                    if (lllllIIIIllIIll(lllllllllllllIIIIIlIllIlIlllIIlI.hasTileEntity() ? 1 : 0) && lllllIIIIllIIll((this.mc.theWorld.getTileEntity(lllllllllllllIIIIIlIllIlIlllIIll) instanceof IInventory) ? 1 : 0)) {
                        n2 = EntityRenderer.lIllIIIllIIIlI[1];
                        "".length();
                        if (-" ".length() > 0) {
                            return ((0xC6 ^ 0xA1 ^ (0xE ^ 0x54)) & (0x1E ^ 0x39 ^ (0x9A ^ 0x80) ^ -" ".length())) != 0x0;
                        }
                    }
                    else {
                        n2 = EntityRenderer.lIllIIIllIIIlI[0];
                    }
                    lllllllllllllIIIIIlIllIlIlllIlIl = (n2 != 0);
                    "".length();
                    if ("  ".length() < "  ".length()) {
                        return ((0xEE ^ 0x8D) & ~(0xC8 ^ 0xAB)) != 0x0;
                    }
                }
                else {
                    int n3;
                    if (lllllIIIIllIlII(lllllllllllllIIIIIlIllIlIlllIlII) && (!lllllIIIIllllII(lllllllllllllIIIIIlIllIlIlllIlII.canDestroy(lllllllllllllIIIIIlIllIlIlllIIlI) ? 1 : 0) || lllllIIIIllIIll(lllllllllllllIIIIIlIllIlIlllIlII.canPlaceOn(lllllllllllllIIIIIlIllIlIlllIIlI) ? 1 : 0))) {
                        n3 = EntityRenderer.lIllIIIllIIIlI[1];
                        "".length();
                        if (" ".length() >= (0x4A ^ 0x4E)) {
                            return ((0x70 ^ 0x6C) & ~(0x4D ^ 0x51)) != 0x0;
                        }
                    }
                    else {
                        n3 = EntityRenderer.lIllIIIllIIIlI[0];
                    }
                    lllllllllllllIIIIIlIllIlIlllIlIl = (n3 != 0);
                }
            }
        }
        return lllllllllllllIIIIIlIllIlIlllIlIl;
    }
    
    private static int lllllIIIIlllllI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lllllIIIIllIIlI(final int lllllllllllllIIIIIlIlIllllIIIIII, final int lllllllllllllIIIIIlIlIlllIllllll) {
        return lllllllllllllIIIIIlIlIllllIIIIII >= lllllllllllllIIIIIlIlIlllIllllll;
    }
    
    public boolean isShaderActive() {
        if (lllllIIIIllIIll(OpenGlHelper.shadersSupported ? 1 : 0) && lllllIIIIllIlII(this.theShaderGroup)) {
            return EntityRenderer.lIllIIIllIIIlI[1] != 0;
        }
        return EntityRenderer.lIllIIIllIIIlI[0] != 0;
    }
}
