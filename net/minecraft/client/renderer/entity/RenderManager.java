// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import java.util.Arrays;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.client.model.ModelHorse;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.projectile.EntityFishHook;
import net.minecraft.entity.item.EntityBoat;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.ai.EntityMinecartMobSpawner;
import net.minecraft.entity.item.EntityMinecartTNT;
import net.minecraft.entity.item.EntityArmorStand;
import net.minecraft.entity.item.EntityFallingBlock;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.client.renderer.tileentity.RenderWitherSkull;
import net.minecraft.entity.projectile.EntityWitherSkull;
import net.minecraft.entity.projectile.EntitySmallFireball;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.entity.item.EntityFireworkRocket;
import net.minecraft.entity.item.EntityExpBottle;
import net.minecraft.entity.projectile.EntityPotion;
import net.minecraft.entity.projectile.EntityEgg;
import net.minecraft.entity.item.EntityEnderEye;
import net.minecraft.entity.item.EntityEnderPearl;
import net.minecraft.init.Items;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.EntityLeashKnot;
import net.minecraft.client.renderer.tileentity.RenderItemFrame;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.entity.item.EntityPainting;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.client.renderer.tileentity.RenderEnderCrystal;
import net.minecraft.entity.item.EntityEnderCrystal;
import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.entity.monster.EntityGuardian;
import net.minecraft.entity.passive.EntityBat;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.passive.EntityVillager;
import net.minecraft.client.model.ModelSquid;
import net.minecraft.entity.passive.EntitySquid;
import net.minecraft.entity.monster.EntityGhast;
import net.minecraft.client.model.ModelZombie;
import net.minecraft.entity.monster.EntityGiantZombie;
import net.minecraft.entity.monster.EntityMagmaCube;
import net.minecraft.client.model.ModelSlime;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.monster.EntityPigZombie;
import net.minecraft.entity.monster.EntityBlaze;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySnowman;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEndermite;
import net.minecraft.entity.monster.EntitySilverfish;
import net.minecraft.client.model.ModelRabbit;
import net.minecraft.entity.passive.EntityRabbit;
import net.minecraft.client.model.ModelOcelot;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.client.model.ModelChicken;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.client.model.ModelWolf;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.passive.EntityMooshroom;
import net.minecraft.client.model.ModelCow;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.client.model.ModelSheep2;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelPig;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityCaveSpider;
import com.google.common.collect.Maps;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockBed;
import net.minecraft.util.EnumFacing;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.Vec3;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.util.ReportedException;
import net.minecraft.crash.CrashReport;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.culling.ICamera;
import net.minecraft.world.World;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.entity.Entity;
import java.util.Map;
import net.minecraft.client.gui.FontRenderer;

public class RenderManager
{
    public /* synthetic */ double viewerPosY;
    private /* synthetic */ boolean debugBoundingBox;
    public /* synthetic */ double viewerPosX;
    public /* synthetic */ float playerViewX;
    private /* synthetic */ FontRenderer textRenderer;
    private /* synthetic */ Map<String, RenderPlayer> skinMap;
    public /* synthetic */ Entity livingPlayer;
    private /* synthetic */ RenderPlayer playerRenderer;
    public /* synthetic */ TextureManager renderEngine;
    private /* synthetic */ double renderPosZ;
    private static final /* synthetic */ int[] llIllIIIIIIIlI;
    public /* synthetic */ double viewerPosZ;
    private /* synthetic */ boolean renderOutlines;
    private /* synthetic */ double renderPosX;
    public /* synthetic */ GameSettings options;
    public /* synthetic */ float playerViewY;
    private /* synthetic */ Map<Class<? extends Entity>, Render<? extends Entity>> entityRenderMap;
    private static final /* synthetic */ String[] llIlIIlllIlIll;
    private /* synthetic */ boolean renderShadow;
    public /* synthetic */ World worldObj;
    public /* synthetic */ Entity pointedEntity;
    private /* synthetic */ double renderPosY;
    
    public boolean shouldRender(final Entity llllllllllllIllIlIIIlIIIIlIlllll, final ICamera llllllllllllIllIlIIIlIIIIlIlIlll, final double llllllllllllIllIlIIIlIIIIlIlIllI, final double llllllllllllIllIlIIIlIIIIlIlIlIl, final double llllllllllllIllIlIIIlIIIIlIllIll) {
        final Render<Entity> llllllllllllIllIlIIIlIIIIlIllIlI = this.getEntityRenderObject(llllllllllllIllIlIIIlIIIIlIlllll);
        if (lIIlIllIIIlIllII(llllllllllllIllIlIIIlIIIIlIllIlI) && lIIlIllIIIlIlIll(llllllllllllIllIlIIIlIIIIlIllIlI.shouldRender(llllllllllllIllIlIIIlIIIIlIlllll, llllllllllllIllIlIIIlIIIIlIlIlll, llllllllllllIllIlIIIlIIIIlIlIllI, llllllllllllIllIlIIIlIIIIlIlIlIl, llllllllllllIllIlIIIlIIIIlIllIll) ? 1 : 0)) {
            return RenderManager.llIllIIIIIIIlI[1] != 0;
        }
        return RenderManager.llIllIIIIIIIlI[0] != 0;
    }
    
    public void setRenderShadow(final boolean llllllllllllIllIlIIIlIIIIllllIlI) {
        this.renderShadow = llllllllllllIllIlIIIlIIIIllllIlI;
    }
    
    public boolean isDebugBoundingBox() {
        return this.debugBoundingBox;
    }
    
    public <T extends Entity> Render<T> getEntityRenderObject(final Entity llllllllllllIllIlIIIlIIIlIlIlIIl) {
        if (lIIlIllIIIlIlIll((llllllllllllIllIlIIIlIIIlIlIlIIl instanceof AbstractClientPlayer) ? 1 : 0)) {
            final String llllllllllllIllIlIIIlIIIlIlIllII = ((AbstractClientPlayer)llllllllllllIllIlIIIlIIIlIlIlIIl).getSkinType();
            final RenderPlayer llllllllllllIllIlIIIlIIIlIlIlIll = this.skinMap.get(llllllllllllIllIlIIIlIIIlIlIllII);
            RenderPlayer playerRenderer;
            if (lIIlIllIIIlIllII(llllllllllllIllIlIIIlIIIlIlIlIll)) {
                playerRenderer = llllllllllllIllIlIIIlIIIlIlIlIll;
                "".length();
                if (" ".length() >= "  ".length()) {
                    return null;
                }
            }
            else {
                playerRenderer = this.playerRenderer;
            }
            return (Render<T>)playerRenderer;
        }
        return this.getEntityClassRenderObject(llllllllllllIllIlIIIlIIIlIlIlIIl.getClass());
    }
    
    public boolean renderEntityStatic(final Entity llllllllllllIllIlIIIlIIIIIlllIll, final float llllllllllllIllIlIIIlIIIIlIIIlIl, final boolean llllllllllllIllIlIIIlIIIIlIIIlII) {
        if (lIIlIllIIIlIllll(llllllllllllIllIlIIIlIIIIIlllIll.ticksExisted)) {
            llllllllllllIllIlIIIlIIIIIlllIll.lastTickPosX = llllllllllllIllIlIIIlIIIIIlllIll.posX;
            llllllllllllIllIlIIIlIIIIIlllIll.lastTickPosY = llllllllllllIllIlIIIlIIIIIlllIll.posY;
            llllllllllllIllIlIIIlIIIIIlllIll.lastTickPosZ = llllllllllllIllIlIIIlIIIIIlllIll.posZ;
        }
        final double llllllllllllIllIlIIIlIIIIlIIIIll = llllllllllllIllIlIIIlIIIIIlllIll.lastTickPosX + (llllllllllllIllIlIIIlIIIIIlllIll.posX - llllllllllllIllIlIIIlIIIIIlllIll.lastTickPosX) * llllllllllllIllIlIIIlIIIIlIIIlIl;
        final double llllllllllllIllIlIIIlIIIIlIIIIlI = llllllllllllIllIlIIIlIIIIIlllIll.lastTickPosY + (llllllllllllIllIlIIIlIIIIIlllIll.posY - llllllllllllIllIlIIIlIIIIIlllIll.lastTickPosY) * llllllllllllIllIlIIIlIIIIlIIIlIl;
        final double llllllllllllIllIlIIIlIIIIlIIIIIl = llllllllllllIllIlIIIlIIIIIlllIll.lastTickPosZ + (llllllllllllIllIlIIIlIIIIIlllIll.posZ - llllllllllllIllIlIIIlIIIIIlllIll.lastTickPosZ) * llllllllllllIllIlIIIlIIIIlIIIlIl;
        final float llllllllllllIllIlIIIlIIIIlIIIIII = llllllllllllIllIlIIIlIIIIIlllIll.prevRotationYaw + (llllllllllllIllIlIIIlIIIIIlllIll.rotationYaw - llllllllllllIllIlIIIlIIIIIlllIll.prevRotationYaw) * llllllllllllIllIlIIIlIIIIlIIIlIl;
        int llllllllllllIllIlIIIlIIIIIllllll = llllllllllllIllIlIIIlIIIIIlllIll.getBrightnessForRender(llllllllllllIllIlIIIlIIIIlIIIlIl);
        if (lIIlIllIIIlIlIll(llllllllllllIllIlIIIlIIIIIlllIll.isBurning() ? 1 : 0)) {
            llllllllllllIllIlIIIlIIIIIllllll = RenderManager.llIllIIIIIIIlI[6];
        }
        final int llllllllllllIllIlIIIlIIIIIlllllI = llllllllllllIllIlIIIlIIIIIllllll % RenderManager.llIllIIIIIIIlI[7];
        final int llllllllllllIllIlIIIlIIIIIllllIl = llllllllllllIllIlIIIlIIIIIllllll / RenderManager.llIllIIIIIIIlI[7];
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, llllllllllllIllIlIIIlIIIIIlllllI / 1.0f, llllllllllllIllIlIIIlIIIIIllllIl / 1.0f);
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        return this.doRenderEntity(llllllllllllIllIlIIIlIIIIIlllIll, llllllllllllIllIlIIIlIIIIlIIIIll - this.renderPosX, llllllllllllIllIlIIIlIIIIlIIIIlI - this.renderPosY, llllllllllllIllIlIIIlIIIIlIIIIIl - this.renderPosZ, llllllllllllIllIlIIIlIIIIlIIIIII, llllllllllllIllIlIIIlIIIIlIIIlIl, llllllllllllIllIlIIIlIIIIlIIIlII);
    }
    
    private static boolean lIIlIllIIIllIIII(final int llllllllllllIllIlIIIIllIlllIllll, final int llllllllllllIllIlIIIIllIlllIlllI) {
        return llllllllllllIllIlIIIIllIlllIllll < llllllllllllIllIlIIIIllIlllIlllI;
    }
    
    public boolean doRenderEntity(final Entity llllllllllllIllIlIIIIlllllIIIlII, final double llllllllllllIllIlIIIIllllIlIllII, final double llllllllllllIllIlIIIIlllllIIIIlI, final double llllllllllllIllIlIIIIlllllIIIIIl, final float llllllllllllIllIlIIIIlllllIIIIII, final float llllllllllllIllIlIIIIllllIlIIlII, final boolean llllllllllllIllIlIIIIllllIlIIIll) {
        Render<Entity> llllllllllllIllIlIIIIllllIlllIll = null;
        try {
            llllllllllllIllIlIIIIllllIlllIll = this.getEntityRenderObject(llllllllllllIllIlIIIIlllllIIIlII);
            if (lIIlIllIIIlIllII(llllllllllllIllIlIIIIllllIlllIll) && lIIlIllIIIlIllII(this.renderEngine)) {
                try {
                    if (lIIlIllIIIlIlIll((llllllllllllIllIlIIIIllllIlllIll instanceof RendererLivingEntity) ? 1 : 0)) {
                        ((RendererLivingEntity)llllllllllllIllIlIIIIllllIlllIll).setRenderOutlines(this.renderOutlines);
                    }
                    llllllllllllIllIlIIIIllllIlllIll.doRender(llllllllllllIllIlIIIIlllllIIIlII, llllllllllllIllIlIIIIllllIlIllII, llllllllllllIllIlIIIIlllllIIIIlI, llllllllllllIllIlIIIIlllllIIIIIl, llllllllllllIllIlIIIIlllllIIIIII, llllllllllllIllIlIIIIllllIlIIlII);
                    "".length();
                    if ("   ".length() < 0) {
                        return ((0x66 ^ 0x3 ^ (0x51 ^ 0x1B)) & (0x4D ^ 0x16 ^ (0xC9 ^ 0xBD) ^ -" ".length())) != 0x0;
                    }
                }
                catch (Throwable llllllllllllIllIlIIIIllllIlllIlI) {
                    throw new ReportedException(CrashReport.makeCrashReport(llllllllllllIllIlIIIIllllIlllIlI, RenderManager.llIlIIlllIlIll[RenderManager.llIllIIIIIIIlI[5]]));
                }
                try {
                    if (lIIlIllIIIlIllll(this.renderOutlines ? 1 : 0)) {
                        llllllllllllIllIlIIIIllllIlllIll.doRenderShadowAndFire(llllllllllllIllIlIIIIlllllIIIlII, llllllllllllIllIlIIIIllllIlIllII, llllllllllllIllIlIIIIlllllIIIIlI, llllllllllllIllIlIIIIlllllIIIIIl, llllllllllllIllIlIIIIlllllIIIIII, llllllllllllIllIlIIIIllllIlIIlII);
                        "".length();
                        if (-"  ".length() > 0) {
                            return ((0x22 ^ 0x66) & ~(0x3B ^ 0x7F)) != 0x0;
                        }
                    }
                }
                catch (Throwable llllllllllllIllIlIIIIllllIlllIIl) {
                    throw new ReportedException(CrashReport.makeCrashReport(llllllllllllIllIlIIIIllllIlllIIl, RenderManager.llIlIIlllIlIll[RenderManager.llIllIIIIIIIlI[8]]));
                }
                if (!lIIlIllIIIlIlIll(this.debugBoundingBox ? 1 : 0) || !lIIlIllIIIlIllll(llllllllllllIllIlIIIIlllllIIIlII.isInvisible() ? 1 : 0) || !lIIlIllIIIlIllll(llllllllllllIllIlIIIIllllIlIIIll ? 1 : 0)) {
                    return RenderManager.llIllIIIIIIIlI[1] != 0;
                }
                try {
                    this.renderDebugBoundingBox(llllllllllllIllIlIIIIlllllIIIlII, llllllllllllIllIlIIIIllllIlIllII, llllllllllllIllIlIIIIlllllIIIIlI, llllllllllllIllIlIIIIlllllIIIIIl, llllllllllllIllIlIIIIlllllIIIIII, llllllllllllIllIlIIIIllllIlIIlII);
                    "".length();
                    if (-"  ".length() >= 0) {
                        return ((0x72 ^ 0x63) & ~(0x92 ^ 0x83)) != 0x0;
                    }
                    return RenderManager.llIllIIIIIIIlI[1] != 0;
                }
                catch (Throwable llllllllllllIllIlIIIIllllIllIlll) {
                    throw new ReportedException(CrashReport.makeCrashReport(llllllllllllIllIlIIIIllllIllIlll, RenderManager.llIlIIlllIlIll[RenderManager.llIllIIIIIIIlI[9]]));
                }
            }
            if (lIIlIllIIIlIllII(this.renderEngine)) {
                return RenderManager.llIllIIIIIIIlI[0] != 0;
            }
            return RenderManager.llIllIIIIIIIlI[1] != 0;
        }
        catch (Throwable llllllllllllIllIlIIIIllllIllIlIl) {
            final CrashReport llllllllllllIllIlIIIIllllIllIlII = CrashReport.makeCrashReport(llllllllllllIllIlIIIIllllIllIlIl, RenderManager.llIlIIlllIlIll[RenderManager.llIllIIIIIIIlI[10]]);
            final CrashReportCategory llllllllllllIllIlIIIIllllIllIIlI = llllllllllllIllIlIIIIllllIllIlII.makeCategory(RenderManager.llIlIIlllIlIll[RenderManager.llIllIIIIIIIlI[11]]);
            llllllllllllIllIlIIIIlllllIIIlII.addEntityCrashInfo(llllllllllllIllIlIIIIllllIllIIlI);
            final CrashReportCategory llllllllllllIllIlIIIIllllIllIIIl = llllllllllllIllIlIIIIllllIllIlII.makeCategory(RenderManager.llIlIIlllIlIll[RenderManager.llIllIIIIIIIlI[12]]);
            llllllllllllIllIlIIIIllllIllIIIl.addCrashSection(RenderManager.llIlIIlllIlIll[RenderManager.llIllIIIIIIIlI[13]], llllllllllllIllIlIIIIllllIlllIll);
            llllllllllllIllIlIIIIllllIllIIIl.addCrashSection(RenderManager.llIlIIlllIlIll[RenderManager.llIllIIIIIIIlI[14]], CrashReportCategory.getCoordinateInfo(llllllllllllIllIlIIIIllllIlIllII, llllllllllllIllIlIIIIlllllIIIIlI, llllllllllllIllIlIIIIlllllIIIIIl));
            llllllllllllIllIlIIIIllllIllIIIl.addCrashSection(RenderManager.llIlIIlllIlIll[RenderManager.llIllIIIIIIIlI[15]], llllllllllllIllIlIIIIlllllIIIIII);
            llllllllllllIllIlIIIIllllIllIIIl.addCrashSection(RenderManager.llIlIIlllIlIll[RenderManager.llIllIIIIIIIlI[16]], llllllllllllIllIlIIIIllllIlIIlII);
            throw new ReportedException(llllllllllllIllIlIIIIllllIllIlII);
        }
    }
    
    private static boolean lIIlIllIIIlIlllI(final int llllllllllllIllIlIIIIllIllllIIll, final int llllllllllllIllIlIIIIllIllllIIlI) {
        return llllllllllllIllIlIIIIllIllllIIll == llllllllllllIllIlIIIIllIllllIIlI;
    }
    
    private static boolean lIIlIllIIIlIlIll(final int llllllllllllIllIlIIIIllIlllIIIII) {
        return llllllllllllIllIlIIIIllIlllIIIII != 0;
    }
    
    private void renderDebugBoundingBox(final Entity llllllllllllIllIlIIIIlllIllIllII, final double llllllllllllIllIlIIIIlllIlllllIl, final double llllllllllllIllIlIIIIlllIllIlIII, final double llllllllllllIllIlIIIIlllIllllIll, final float llllllllllllIllIlIIIIlllIllllIIl, final float llllllllllllIllIlIIIIlllIllIIllI) {
        GlStateManager.depthMask((boolean)(RenderManager.llIllIIIIIIIlI[0] != 0));
        GlStateManager.disableTexture2D();
        GlStateManager.disableLighting();
        GlStateManager.disableCull();
        GlStateManager.disableBlend();
        final float llllllllllllIllIlIIIIlllIlllIllI = llllllllllllIllIlIIIIlllIllIllII.width / 2.0f;
        final AxisAlignedBB llllllllllllIllIlIIIIlllIlllIlIl = llllllllllllIllIlIIIIlllIllIllII.getEntityBoundingBox();
        final AxisAlignedBB llllllllllllIllIlIIIIlllIlllIlII = new AxisAlignedBB(llllllllllllIllIlIIIIlllIlllIlIl.minX - llllllllllllIllIlIIIIlllIllIllII.posX + llllllllllllIllIlIIIIlllIlllllIl, llllllllllllIllIlIIIIlllIlllIlIl.minY - llllllllllllIllIlIIIIlllIllIllII.posY + llllllllllllIllIlIIIIlllIllIlIII, llllllllllllIllIlIIIIlllIlllIlIl.minZ - llllllllllllIllIlIIIIlllIllIllII.posZ + llllllllllllIllIlIIIIlllIllllIll, llllllllllllIllIlIIIIlllIlllIlIl.maxX - llllllllllllIllIlIIIIlllIllIllII.posX + llllllllllllIllIlIIIIlllIlllllIl, llllllllllllIllIlIIIIlllIlllIlIl.maxY - llllllllllllIllIlIIIIlllIllIllII.posY + llllllllllllIllIlIIIIlllIllIlIII, llllllllllllIllIlIIIIlllIlllIlIl.maxZ - llllllllllllIllIlIIIIlllIllIllII.posZ + llllllllllllIllIlIIIIlllIllllIll);
        RenderGlobal.func_181563_a(llllllllllllIllIlIIIIlllIlllIlII, RenderManager.llIllIIIIIIIlI[17], RenderManager.llIllIIIIIIIlI[17], RenderManager.llIllIIIIIIIlI[17], RenderManager.llIllIIIIIIIlI[17]);
        if (lIIlIllIIIlIlIll((llllllllllllIllIlIIIIlllIllIllII instanceof EntityLivingBase) ? 1 : 0)) {
            final float llllllllllllIllIlIIIIlllIlllIIlI = 0.01f;
            RenderGlobal.func_181563_a(new AxisAlignedBB(llllllllllllIllIlIIIIlllIlllllIl - llllllllllllIllIlIIIIlllIlllIllI, llllllllllllIllIlIIIIlllIllIlIII + llllllllllllIllIlIIIIlllIllIllII.getEyeHeight() - 0.009999999776482582, llllllllllllIllIlIIIIlllIllllIll - llllllllllllIllIlIIIIlllIlllIllI, llllllllllllIllIlIIIIlllIlllllIl + llllllllllllIllIlIIIIlllIlllIllI, llllllllllllIllIlIIIIlllIllIlIII + llllllllllllIllIlIIIIlllIllIllII.getEyeHeight() + 0.009999999776482582, llllllllllllIllIlIIIIlllIllllIll + llllllllllllIllIlIIIIlllIlllIllI), RenderManager.llIllIIIIIIIlI[17], RenderManager.llIllIIIIIIIlI[0], RenderManager.llIllIIIIIIIlI[0], RenderManager.llIllIIIIIIIlI[17]);
        }
        final Tessellator llllllllllllIllIlIIIIlllIlllIIII = Tessellator.getInstance();
        final WorldRenderer llllllllllllIllIlIIIIlllIllIlllI = llllllllllllIllIlIIIIlllIlllIIII.getWorldRenderer();
        final Vec3 llllllllllllIllIlIIIIlllIllIllIl = llllllllllllIllIlIIIIlllIllIllII.getLook(llllllllllllIllIlIIIIlllIllIIllI);
        llllllllllllIllIlIIIIlllIllIlllI.begin(RenderManager.llIllIIIIIIIlI[8], DefaultVertexFormats.POSITION_COLOR);
        llllllllllllIllIlIIIIlllIllIlllI.pos(llllllllllllIllIlIIIIlllIlllllIl, llllllllllllIllIlIIIIlllIllIlIII + llllllllllllIllIlIIIIlllIllIllII.getEyeHeight(), llllllllllllIllIlIIIIlllIllllIll).color(RenderManager.llIllIIIIIIIlI[0], RenderManager.llIllIIIIIIIlI[0], RenderManager.llIllIIIIIIIlI[17], RenderManager.llIllIIIIIIIlI[17]).endVertex();
        llllllllllllIllIlIIIIlllIllIlllI.pos(llllllllllllIllIlIIIIlllIlllllIl + llllllllllllIllIlIIIIlllIllIllIl.xCoord * 2.0, llllllllllllIllIlIIIIlllIllIlIII + llllllllllllIllIlIIIIlllIllIllII.getEyeHeight() + llllllllllllIllIlIIIIlllIllIllIl.yCoord * 2.0, llllllllllllIllIlIIIIlllIllllIll + llllllllllllIllIlIIIIlllIllIllIl.zCoord * 2.0).color(RenderManager.llIllIIIIIIIlI[0], RenderManager.llIllIIIIIIIlI[0], RenderManager.llIllIIIIIIIlI[17], RenderManager.llIllIIIIIIIlI[17]).endVertex();
        llllllllllllIllIlIIIIlllIlllIIII.draw();
        GlStateManager.enableTexture2D();
        GlStateManager.enableLighting();
        GlStateManager.enableCull();
        GlStateManager.disableBlend();
        GlStateManager.depthMask((boolean)(RenderManager.llIllIIIIIIIlI[1] != 0));
    }
    
    static {
        lIIlIllIIIlIlIII();
        lIIlIllIIIlIIlIl();
    }
    
    public void renderWitherSkull(final Entity llllllllllllIllIlIIIlIIIIIIlIlll, final float llllllllllllIllIlIIIlIIIIIIlIlIl) {
        final double llllllllllllIllIlIIIlIIIIIlIIIlI = llllllllllllIllIlIIIlIIIIIIlIlll.lastTickPosX + (llllllllllllIllIlIIIlIIIIIIlIlll.posX - llllllllllllIllIlIIIlIIIIIIlIlll.lastTickPosX) * llllllllllllIllIlIIIlIIIIIIlIlIl;
        final double llllllllllllIllIlIIIlIIIIIlIIIIl = llllllllllllIllIlIIIlIIIIIIlIlll.lastTickPosY + (llllllllllllIllIlIIIlIIIIIIlIlll.posY - llllllllllllIllIlIIIlIIIIIIlIlll.lastTickPosY) * llllllllllllIllIlIIIlIIIIIIlIlIl;
        final double llllllllllllIllIlIIIlIIIIIlIIIII = llllllllllllIllIlIIIlIIIIIIlIlll.lastTickPosZ + (llllllllllllIllIlIIIlIIIIIIlIlll.posZ - llllllllllllIllIlIIIlIIIIIIlIlll.lastTickPosZ) * llllllllllllIllIlIIIlIIIIIIlIlIl;
        final Render<Entity> llllllllllllIllIlIIIlIIIIIIllllI = this.getEntityRenderObject(llllllllllllIllIlIIIlIIIIIIlIlll);
        if (lIIlIllIIIlIllII(llllllllllllIllIlIIIlIIIIIIllllI) && lIIlIllIIIlIllII(this.renderEngine)) {
            final int llllllllllllIllIlIIIlIIIIIIlllIl = llllllllllllIllIlIIIlIIIIIIlIlll.getBrightnessForRender(llllllllllllIllIlIIIlIIIIIIlIlIl);
            final int llllllllllllIllIlIIIlIIIIIIlllII = llllllllllllIllIlIIIlIIIIIIlllIl % RenderManager.llIllIIIIIIIlI[7];
            final int llllllllllllIllIlIIIlIIIIIIllIlI = llllllllllllIllIlIIIlIIIIIIlllIl / RenderManager.llIllIIIIIIIlI[7];
            OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, llllllllllllIllIlIIIlIIIIIIlllII / 1.0f, llllllllllllIllIlIIIlIIIIIIllIlI / 1.0f);
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            llllllllllllIllIlIIIlIIIIIIllllI.renderName(llllllllllllIllIlIIIlIIIIIIlIlll, llllllllllllIllIlIIIlIIIIIlIIIlI - this.renderPosX, llllllllllllIllIlIIIlIIIIIlIIIIl - this.renderPosY, llllllllllllIllIlIIIlIIIIIlIIIII - this.renderPosZ);
        }
    }
    
    private static void lIIlIllIIIlIIlIl() {
        (llIlIIlllIlIll = new String[RenderManager.llIllIIIIIIIlI[18]])[RenderManager.llIllIIIIIIIlI[0]] = lIIlIIllIIllllIl("W/6CBnHdWfU=", "SGmuw");
        RenderManager.llIlIIlllIlIll[RenderManager.llIllIIIIIIIlI[1]] = lIIlIIllIIllllIl("nqGmZsmywm0=", "jgqnT");
        RenderManager.llIlIIlllIlIll[RenderManager.llIllIIIIIIIlI[5]] = lIIlIIllIIlllllI("EDAcJxAwPBwkVSc7BioBO3UbLVU1OgAvEQ==", "BUrCu");
        RenderManager.llIlIIlllIlIll[RenderManager.llIllIIIIIIIlI[8]] = lIIlIIllIIlllllI("FzkLGno1MxYKMjU/Fgl3IjgMByM+dhEAdzA5CgIz", "GVxnW");
        RenderManager.llIlIIlllIlIll[RenderManager.llIllIIIIIIIlI[9]] = lIIlIIllIIllllIl("50tAW696DjO+Oa1bRL2CH/dZ00kyx+MRIQS7rbRAwOtRtoez4sWpUw==", "fNyHg");
        RenderManager.llIlIIlllIlIll[RenderManager.llIllIIIIIIIlI[10]] = lIIlIIllIIllllll("4TJLHAsFXw21LyznQNEeemqzqRaePOcs7BHz+MBSaoI=", "woilS");
        RenderManager.llIlIIlllIlIll[RenderManager.llIllIIIIIIIlI[11]] = lIIlIIllIIllllll("ZBFn1b/QsuFRICyBgo25lEAo4QXjrSsR", "qXwFQ");
        RenderManager.llIlIIlllIlIll[RenderManager.llIllIIIIIIIlI[12]] = lIIlIIllIIllllll("LS/JQLjjgFws/BzU25GbsmtCpUSm77iY", "GaAhn");
        RenderManager.llIlIIlllIlIll[RenderManager.llIllIIIIIIIlI[13]] = lIIlIIllIIlllllI("JDcjDSoLITREPwAqNAE/ADY=", "eDPdM");
        RenderManager.llIlIIlllIlIll[RenderManager.llIllIIIIIIIlI[14]] = lIIlIIllIIlllllI("OQUZGRccBRQ=", "ujzxc");
        RenderManager.llIlIIlllIlIll[RenderManager.llIllIIIIIIIlI[15]] = lIIlIIllIIlllllI("PTwFCxoGPB8=", "oSqjn");
        RenderManager.llIlIIlllIlIll[RenderManager.llIllIIIIIIIlI[16]] = lIIlIIllIIllllIl("IQPpuGtdHrw=", "CYtTl");
    }
    
    private static String lIIlIIllIIllllll(final String llllllllllllIllIlIIIIllIlllllIIl, final String llllllllllllIllIlIIIIllIlllllIlI) {
        try {
            final SecretKeySpec llllllllllllIllIlIIIIllIlllllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIIIllIlllllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlIIIIllIllllllIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIlIIIIllIllllllIl.init(RenderManager.llIllIIIIIIIlI[5], llllllllllllIllIlIIIIllIlllllllI);
            return new String(llllllllllllIllIlIIIIllIllllllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIIIllIlllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIIIIllIllllllII) {
            llllllllllllIllIlIIIIllIllllllII.printStackTrace();
            return null;
        }
    }
    
    public <T extends Entity> Render<T> getEntityClassRenderObject(final Class<? extends Entity> llllllllllllIllIlIIIlIIIlIllIlII) {
        Render<? extends Entity> llllllllllllIllIlIIIlIIIlIllIllI = this.entityRenderMap.get(llllllllllllIllIlIIIlIIIlIllIlII);
        if (lIIlIllIIIlIlIIl(llllllllllllIllIlIIIlIIIlIllIllI) && lIIlIllIIIlIlIlI(llllllllllllIllIlIIIlIIIlIllIlII, Entity.class)) {
            llllllllllllIllIlIIIlIIIlIllIllI = this.getEntityClassRenderObject((Class<? extends Entity>)llllllllllllIllIlIIIlIIIlIllIlII.getSuperclass());
            this.entityRenderMap.put(llllllllllllIllIlIIIlIIIlIllIlII, llllllllllllIllIlIIIlIIIlIllIllI);
            "".length();
        }
        return (Render<T>)llllllllllllIllIlIIIlIIIlIllIllI;
    }
    
    public FontRenderer getFontRenderer() {
        return this.textRenderer;
    }
    
    public void cacheActiveRenderInfo(final World llllllllllllIllIlIIIlIIIlIIlIIIl, final FontRenderer llllllllllllIllIlIIIlIIIlIIlIIII, final Entity llllllllllllIllIlIIIlIIIlIIIllll, final Entity llllllllllllIllIlIIIlIIIlIIIlllI, final GameSettings llllllllllllIllIlIIIlIIIlIIIllIl, final float llllllllllllIllIlIIIlIIIlIIIllII) {
        this.worldObj = llllllllllllIllIlIIIlIIIlIIlIIIl;
        this.options = llllllllllllIllIlIIIlIIIlIIIllIl;
        this.livingPlayer = llllllllllllIllIlIIIlIIIlIIIllll;
        this.pointedEntity = llllllllllllIllIlIIIlIIIlIIIlllI;
        this.textRenderer = llllllllllllIllIlIIIlIIIlIIlIIII;
        if (lIIlIllIIIlIlIll((llllllllllllIllIlIIIlIIIlIIIllll instanceof EntityLivingBase) ? 1 : 0) && lIIlIllIIIlIlIll(((EntityLivingBase)llllllllllllIllIlIIIlIIIlIIIllll).isPlayerSleeping() ? 1 : 0)) {
            final IBlockState llllllllllllIllIlIIIlIIIlIIlIlIl = llllllllllllIllIlIIIlIIIlIIlIIIl.getBlockState(new BlockPos(llllllllllllIllIlIIIlIIIlIIIllll));
            final Block llllllllllllIllIlIIIlIIIlIIlIlII = llllllllllllIllIlIIIlIIIlIIlIlIl.getBlock();
            if (lIIlIllIIIlIllIl(llllllllllllIllIlIIIlIIIlIIlIlII, Blocks.bed)) {
                final int llllllllllllIllIlIIIlIIIlIIlIIll = llllllllllllIllIlIIIlIIIlIIlIlIl.getValue((IProperty<EnumFacing>)BlockBed.FACING).getHorizontalIndex();
                this.playerViewY = (float)(llllllllllllIllIlIIIlIIIlIIlIIll * RenderManager.llIllIIIIIIIlI[3] + RenderManager.llIllIIIIIIIlI[4]);
                this.playerViewX = 0.0f;
                "".length();
                if (((0xB2 ^ 0x8A) & ~(0xB0 ^ 0x88) & ~((0xED ^ 0xA1) & ~(0x2C ^ 0x60))) > "  ".length()) {
                    return;
                }
            }
        }
        else {
            this.playerViewY = llllllllllllIllIlIIIlIIIlIIIllll.prevRotationYaw + (llllllllllllIllIlIIIlIIIlIIIllll.rotationYaw - llllllllllllIllIlIIIlIIIlIIIllll.prevRotationYaw) * llllllllllllIllIlIIIlIIIlIIIllII;
            this.playerViewX = llllllllllllIllIlIIIlIIIlIIIllll.prevRotationPitch + (llllllllllllIllIlIIIlIIIlIIIllll.rotationPitch - llllllllllllIllIlIIIlIIIlIIIllll.prevRotationPitch) * llllllllllllIllIlIIIlIIIlIIIllII;
        }
        if (lIIlIllIIIlIlllI(llllllllllllIllIlIIIlIIIlIIIllIl.thirdPersonView, RenderManager.llIllIIIIIIIlI[5])) {
            this.playerViewY += 180.0f;
        }
        this.viewerPosX = llllllllllllIllIlIIIlIIIlIIIllll.lastTickPosX + (llllllllllllIllIlIIIlIIIlIIIllll.posX - llllllllllllIllIlIIIlIIIlIIIllll.lastTickPosX) * llllllllllllIllIlIIIlIIIlIIIllII;
        this.viewerPosY = llllllllllllIllIlIIIlIIIlIIIllll.lastTickPosY + (llllllllllllIllIlIIIlIIIlIIIllll.posY - llllllllllllIllIlIIIlIIIlIIIllll.lastTickPosY) * llllllllllllIllIlIIIlIIIlIIIllII;
        this.viewerPosZ = llllllllllllIllIlIIIlIIIlIIIllll.lastTickPosZ + (llllllllllllIllIlIIIlIIIlIIIllll.posZ - llllllllllllIllIlIIIlIIIlIIIllll.lastTickPosZ) * llllllllllllIllIlIIIlIIIlIIIllII;
    }
    
    public boolean renderEntitySimple(final Entity llllllllllllIllIlIIIlIIIIllIlIIl, final float llllllllllllIllIlIIIlIIIIllIlIII) {
        return this.renderEntityStatic(llllllllllllIllIlIIIlIIIIllIlIIl, llllllllllllIllIlIIIlIIIIllIlIII, (boolean)(RenderManager.llIllIIIIIIIlI[0] != 0));
    }
    
    public boolean isRenderShadow() {
        return this.renderShadow;
    }
    
    public boolean renderEntityWithPosYaw(final Entity llllllllllllIllIlIIIIlllllllIIll, final double llllllllllllIllIlIIIIllllllllIlI, final double llllllllllllIllIlIIIIlllllllIIII, final double llllllllllllIllIlIIIIllllllIlllI, final float llllllllllllIllIlIIIIllllllIllII, final float llllllllllllIllIlIIIIlllllllIllI) {
        return this.doRenderEntity(llllllllllllIllIlIIIIlllllllIIll, llllllllllllIllIlIIIIllllllllIlI, llllllllllllIllIlIIIIlllllllIIII, llllllllllllIllIlIIIIllllllIlllI, llllllllllllIllIlIIIIllllllIllII, llllllllllllIllIlIIIIlllllllIllI, (boolean)(RenderManager.llIllIIIIIIIlI[0] != 0));
    }
    
    public RenderManager(final TextureManager llllllllllllIllIlIIIlIIIllIIllII, final RenderItem llllllllllllIllIlIIIlIIIllIIlIll) {
        this.entityRenderMap = (Map<Class<? extends Entity>, Render<? extends Entity>>)Maps.newHashMap();
        this.skinMap = (Map<String, RenderPlayer>)Maps.newHashMap();
        this.renderOutlines = (RenderManager.llIllIIIIIIIlI[0] != 0);
        this.renderShadow = (RenderManager.llIllIIIIIIIlI[1] != 0);
        this.debugBoundingBox = (RenderManager.llIllIIIIIIIlI[0] != 0);
        this.renderEngine = llllllllllllIllIlIIIlIIIllIIllII;
        this.entityRenderMap.put(EntityCaveSpider.class, new RenderCaveSpider(this));
        "".length();
        this.entityRenderMap.put(EntitySpider.class, new RenderSpider<Entity>(this));
        "".length();
        this.entityRenderMap.put(EntityPig.class, new RenderPig(this, new ModelPig(), 0.7f));
        "".length();
        this.entityRenderMap.put(EntitySheep.class, new RenderSheep(this, new ModelSheep2(), 0.7f));
        "".length();
        this.entityRenderMap.put(EntityCow.class, new RenderCow(this, new ModelCow(), 0.7f));
        "".length();
        this.entityRenderMap.put(EntityMooshroom.class, new RenderMooshroom(this, new ModelCow(), 0.7f));
        "".length();
        this.entityRenderMap.put(EntityWolf.class, new RenderWolf(this, new ModelWolf(), 0.5f));
        "".length();
        this.entityRenderMap.put(EntityChicken.class, new RenderChicken(this, new ModelChicken(), 0.3f));
        "".length();
        this.entityRenderMap.put(EntityOcelot.class, new RenderOcelot(this, new ModelOcelot(), 0.4f));
        "".length();
        this.entityRenderMap.put(EntityRabbit.class, new RenderRabbit(this, new ModelRabbit(), 0.3f));
        "".length();
        this.entityRenderMap.put(EntitySilverfish.class, new RenderSilverfish(this));
        "".length();
        this.entityRenderMap.put(EntityEndermite.class, new RenderEndermite(this));
        "".length();
        this.entityRenderMap.put(EntityCreeper.class, new RenderCreeper(this));
        "".length();
        this.entityRenderMap.put(EntityEnderman.class, new RenderEnderman(this));
        "".length();
        this.entityRenderMap.put(EntitySnowman.class, new RenderSnowMan(this));
        "".length();
        this.entityRenderMap.put(EntitySkeleton.class, new RenderSkeleton(this));
        "".length();
        this.entityRenderMap.put(EntityWitch.class, new RenderWitch(this));
        "".length();
        this.entityRenderMap.put(EntityBlaze.class, new RenderBlaze(this));
        "".length();
        this.entityRenderMap.put(EntityPigZombie.class, new RenderPigZombie(this));
        "".length();
        this.entityRenderMap.put(EntityZombie.class, new RenderZombie(this));
        "".length();
        this.entityRenderMap.put(EntitySlime.class, new RenderSlime(this, new ModelSlime(RenderManager.llIllIIIIIIIlI[2]), 0.25f));
        "".length();
        this.entityRenderMap.put(EntityMagmaCube.class, new RenderMagmaCube(this));
        "".length();
        this.entityRenderMap.put(EntityGiantZombie.class, new RenderGiantZombie(this, new ModelZombie(), 0.5f, 6.0f));
        "".length();
        this.entityRenderMap.put(EntityGhast.class, new RenderGhast(this));
        "".length();
        this.entityRenderMap.put(EntitySquid.class, new RenderSquid(this, new ModelSquid(), 0.7f));
        "".length();
        this.entityRenderMap.put(EntityVillager.class, new RenderVillager(this));
        "".length();
        this.entityRenderMap.put(EntityIronGolem.class, new RenderIronGolem(this));
        "".length();
        this.entityRenderMap.put(EntityBat.class, new RenderBat(this));
        "".length();
        this.entityRenderMap.put(EntityGuardian.class, new RenderGuardian(this));
        "".length();
        this.entityRenderMap.put(EntityDragon.class, new RenderDragon(this));
        "".length();
        this.entityRenderMap.put(EntityEnderCrystal.class, new RenderEnderCrystal(this));
        "".length();
        this.entityRenderMap.put(EntityWither.class, new RenderWither(this));
        "".length();
        this.entityRenderMap.put(Entity.class, new RenderEntity(this));
        "".length();
        this.entityRenderMap.put(EntityPainting.class, new RenderPainting(this));
        "".length();
        this.entityRenderMap.put(EntityItemFrame.class, new RenderItemFrame(this, llllllllllllIllIlIIIlIIIllIIlIll));
        "".length();
        this.entityRenderMap.put(EntityLeashKnot.class, new RenderLeashKnot(this));
        "".length();
        this.entityRenderMap.put(EntityArrow.class, new RenderArrow(this));
        "".length();
        this.entityRenderMap.put(EntitySnowball.class, new RenderSnowball<Entity>(this, Items.snowball, llllllllllllIllIlIIIlIIIllIIlIll));
        "".length();
        this.entityRenderMap.put(EntityEnderPearl.class, new RenderSnowball<Entity>(this, Items.ender_pearl, llllllllllllIllIlIIIlIIIllIIlIll));
        "".length();
        this.entityRenderMap.put(EntityEnderEye.class, new RenderSnowball<Entity>(this, Items.ender_eye, llllllllllllIllIlIIIlIIIllIIlIll));
        "".length();
        this.entityRenderMap.put(EntityEgg.class, new RenderSnowball<Entity>(this, Items.egg, llllllllllllIllIlIIIlIIIllIIlIll));
        "".length();
        this.entityRenderMap.put(EntityPotion.class, new RenderPotion(this, llllllllllllIllIlIIIlIIIllIIlIll));
        "".length();
        this.entityRenderMap.put(EntityExpBottle.class, new RenderSnowball<Entity>(this, Items.experience_bottle, llllllllllllIllIlIIIlIIIllIIlIll));
        "".length();
        this.entityRenderMap.put(EntityFireworkRocket.class, new RenderSnowball<Entity>(this, Items.fireworks, llllllllllllIllIlIIIlIIIllIIlIll));
        "".length();
        this.entityRenderMap.put(EntityLargeFireball.class, new RenderFireball(this, 2.0f));
        "".length();
        this.entityRenderMap.put(EntitySmallFireball.class, new RenderFireball(this, 0.5f));
        "".length();
        this.entityRenderMap.put(EntityWitherSkull.class, new RenderWitherSkull(this));
        "".length();
        this.entityRenderMap.put(EntityItem.class, new RenderEntityItem(this, llllllllllllIllIlIIIlIIIllIIlIll));
        "".length();
        this.entityRenderMap.put(EntityXPOrb.class, new RenderXPOrb(this));
        "".length();
        this.entityRenderMap.put(EntityTNTPrimed.class, new RenderTNTPrimed(this));
        "".length();
        this.entityRenderMap.put(EntityFallingBlock.class, new RenderFallingBlock(this));
        "".length();
        this.entityRenderMap.put(EntityArmorStand.class, new ArmorStandRenderer(this));
        "".length();
        this.entityRenderMap.put(EntityMinecartTNT.class, new RenderTntMinecart(this));
        "".length();
        this.entityRenderMap.put(EntityMinecartMobSpawner.class, new RenderMinecartMobSpawner(this));
        "".length();
        this.entityRenderMap.put(EntityMinecart.class, new RenderMinecart<Entity>(this));
        "".length();
        this.entityRenderMap.put(EntityBoat.class, new RenderBoat(this));
        "".length();
        this.entityRenderMap.put(EntityFishHook.class, new RenderFish(this));
        "".length();
        this.entityRenderMap.put(EntityHorse.class, new RenderHorse(this, new ModelHorse(), 0.75f));
        "".length();
        this.entityRenderMap.put(EntityLightningBolt.class, new RenderLightningBolt(this));
        "".length();
        this.playerRenderer = new RenderPlayer(this);
        this.skinMap.put(RenderManager.llIlIIlllIlIll[RenderManager.llIllIIIIIIIlI[0]], this.playerRenderer);
        "".length();
        this.skinMap.put(RenderManager.llIlIIlllIlIll[RenderManager.llIllIIIIIIIlI[1]], new RenderPlayer(this, (boolean)(RenderManager.llIllIIIIIIIlI[1] != 0)));
        "".length();
    }
    
    public double getDistanceToCamera(final double llllllllllllIllIlIIIIlllIIllIlll, final double llllllllllllIllIlIIIIlllIlIIIIII, final double llllllllllllIllIlIIIIlllIIlllllI) {
        final double llllllllllllIllIlIIIIlllIIllllIl = llllllllllllIllIlIIIIlllIIllIlll - this.viewerPosX;
        final double llllllllllllIllIlIIIIlllIIlllIll = llllllllllllIllIlIIIIlllIlIIIIII - this.viewerPosY;
        final double llllllllllllIllIlIIIIlllIIlllIlI = llllllllllllIllIlIIIIlllIIlllllI - this.viewerPosZ;
        return llllllllllllIllIlIIIIlllIIllllIl * llllllllllllIllIlIIIIlllIIllllIl + llllllllllllIllIlIIIIlllIIlllIll * llllllllllllIllIlIIIIlllIIlllIll + llllllllllllIllIlIIIIlllIIlllIlI * llllllllllllIllIlIIIIlllIIlllIlI;
    }
    
    private static String lIIlIIllIIllllIl(final String llllllllllllIllIlIIIIlllIIIIIllI, final String llllllllllllIllIlIIIIlllIIIIIlIl) {
        try {
            final SecretKeySpec llllllllllllIllIlIIIIlllIIIIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIIIlllIIIIIlIl.getBytes(StandardCharsets.UTF_8)), RenderManager.llIllIIIIIIIlI[13]), "DES");
            final Cipher llllllllllllIllIlIIIIlllIIIIlIlI = Cipher.getInstance("DES");
            llllllllllllIllIlIIIIlllIIIIlIlI.init(RenderManager.llIllIIIIIIIlI[5], llllllllllllIllIlIIIIlllIIIIlIll);
            return new String(llllllllllllIllIlIIIIlllIIIIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIIIlllIIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIIIIlllIIIIlIIl) {
            llllllllllllIllIlIIIIlllIIIIlIIl.printStackTrace();
            return null;
        }
    }
    
    public void setDebugBoundingBox(final boolean llllllllllllIllIlIIIlIIIIlllIlII) {
        this.debugBoundingBox = llllllllllllIllIlIIIlIIIIlllIlII;
    }
    
    private static boolean lIIlIllIIIlIlIlI(final Object llllllllllllIllIlIIIIllIlllIlIll, final Object llllllllllllIllIlIIIIllIlllIlIlI) {
        return llllllllllllIllIlIIIIllIlllIlIll != llllllllllllIllIlIIIIllIlllIlIlI;
    }
    
    private static boolean lIIlIllIIIlIllll(final int llllllllllllIllIlIIIIllIllIllllI) {
        return llllllllllllIllIlIIIIllIllIllllI == 0;
    }
    
    public void setRenderPosition(final double llllllllllllIllIlIIIlIIIlIlllllI, final double llllllllllllIllIlIIIlIIIlIllllIl, final double llllllllllllIllIlIIIlIIIlIllllII) {
        this.renderPosX = llllllllllllIllIlIIIlIIIlIlllllI;
        this.renderPosY = llllllllllllIllIlIIIlIIIlIllllIl;
        this.renderPosZ = llllllllllllIllIlIIIlIIIlIllllII;
    }
    
    public void setPlayerViewY(final float llllllllllllIllIlIIIlIIIlIIIIlIl) {
        this.playerViewY = llllllllllllIllIlIIIlIIIlIIIIlIl;
    }
    
    private static boolean lIIlIllIIIlIllIl(final Object llllllllllllIllIlIIIIllIlllIIlIl, final Object llllllllllllIllIlIIIIllIlllIIlII) {
        return llllllllllllIllIlIIIIllIlllIIlIl == llllllllllllIllIlIIIIllIlllIIlII;
    }
    
    private static String lIIlIIllIIlllllI(String llllllllllllIllIlIIIIlllIIIllIII, final String llllllllllllIllIlIIIIlllIIIlllII) {
        llllllllllllIllIlIIIIlllIIIllIII = (float)new String(Base64.getDecoder().decode(((String)llllllllllllIllIlIIIIlllIIIllIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIIIIlllIIIllIll = new StringBuilder();
        final char[] llllllllllllIllIlIIIIlllIIIllIlI = llllllllllllIllIlIIIIlllIIIlllII.toCharArray();
        int llllllllllllIllIlIIIIlllIIIllIIl = RenderManager.llIllIIIIIIIlI[0];
        final float llllllllllllIllIlIIIIlllIIIlIIll = (Object)((String)llllllllllllIllIlIIIIlllIIIllIII).toCharArray();
        final String llllllllllllIllIlIIIIlllIIIlIIlI = (String)llllllllllllIllIlIIIIlllIIIlIIll.length;
        Exception llllllllllllIllIlIIIIlllIIIlIIIl = (Exception)RenderManager.llIllIIIIIIIlI[0];
        while (lIIlIllIIIllIIII((int)llllllllllllIllIlIIIIlllIIIlIIIl, (int)llllllllllllIllIlIIIIlllIIIlIIlI)) {
            final char llllllllllllIllIlIIIIlllIIIllllI = llllllllllllIllIlIIIIlllIIIlIIll[llllllllllllIllIlIIIIlllIIIlIIIl];
            llllllllllllIllIlIIIIlllIIIllIll.append((char)(llllllllllllIllIlIIIIlllIIIllllI ^ llllllllllllIllIlIIIIlllIIIllIlI[llllllllllllIllIlIIIIlllIIIllIIl % llllllllllllIllIlIIIIlllIIIllIlI.length]));
            "".length();
            ++llllllllllllIllIlIIIIlllIIIllIIl;
            ++llllllllllllIllIlIIIIlllIIIlIIIl;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIIIIlllIIIllIll);
    }
    
    private static boolean lIIlIllIIIlIllII(final Object llllllllllllIllIlIIIIllIlllIlIII) {
        return llllllllllllIllIlIIIIllIlllIlIII != null;
    }
    
    private static boolean lIIlIllIIIlIlIIl(final Object llllllllllllIllIlIIIIllIlllIIIlI) {
        return llllllllllllIllIlIIIIllIlllIIIlI == null;
    }
    
    private static void lIIlIllIIIlIlIII() {
        (llIllIIIIIIIlI = new int[19])[0] = ((0xA3 ^ 0x9B) & ~(0xA ^ 0x32));
        RenderManager.llIllIIIIIIIlI[1] = " ".length();
        RenderManager.llIllIIIIIIIlI[2] = (153 + 113 - 222 + 143 ^ 136 + 101 - 97 + 31);
        RenderManager.llIllIIIIIIIlI[3] = (0x37 ^ 0x16 ^ (0x1B ^ 0x60));
        RenderManager.llIllIIIIIIIlI[4] = 69 + 0 - 5 + 116;
        RenderManager.llIllIIIIIIIlI[5] = "  ".length();
        RenderManager.llIllIIIIIIIlI[6] = (0xFFFFB7F8 & 0xF048F7);
        RenderManager.llIllIIIIIIIlI[7] = (-(0xFFFFBBF7 & 0x7FFD) & (0xFFFFFBFC & 0x13FF7));
        RenderManager.llIllIIIIIIIlI[8] = "   ".length();
        RenderManager.llIllIIIIIIIlI[9] = (0x3C ^ 0x38);
        RenderManager.llIllIIIIIIIlI[10] = (38 + 144 - 145 + 119 ^ 39 + 17 - 33 + 130);
        RenderManager.llIllIIIIIIIlI[11] = (0x57 ^ 0x4 ^ (0x1F ^ 0x4A));
        RenderManager.llIllIIIIIIIlI[12] = (0x32 ^ 0x15 ^ (0x76 ^ 0x56));
        RenderManager.llIllIIIIIIIlI[13] = (0x6F ^ 0x67);
        RenderManager.llIllIIIIIIIlI[14] = (0x11 ^ 0x18);
        RenderManager.llIllIIIIIIIlI[15] = (35 + 32 + 1 + 93 ^ 138 + 57 - 63 + 39);
        RenderManager.llIllIIIIIIIlI[16] = (0x85 ^ 0xAB ^ (0x6C ^ 0x49));
        RenderManager.llIllIIIIIIIlI[17] = 57 + 161 - 188 + 225;
        RenderManager.llIllIIIIIIIlI[18] = (0xE ^ 0x3A ^ (0xA2 ^ 0x9A));
    }
    
    public void setRenderOutlines(final boolean llllllllllllIllIlIIIIlllIIlIlIII) {
        this.renderOutlines = llllllllllllIllIlIIIIlllIIlIlIII;
    }
    
    public void set(final World llllllllllllIllIlIIIIlllIlIlIIlI) {
        this.worldObj = llllllllllllIllIlIIIIlllIlIlIIlI;
    }
}
