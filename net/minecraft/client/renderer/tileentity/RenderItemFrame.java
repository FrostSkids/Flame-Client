// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.tileentity;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.world.storage.MapData;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.item.ItemSkull;
import net.minecraft.util.MathHelper;
import net.minecraft.client.renderer.texture.TextureCompass;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.client.resources.model.ModelManager;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.util.BlockPos;
import net.minecraft.init.Items;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.Tessellator;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.item.EntityItemFrame;
import net.minecraft.client.renderer.entity.Render;

public class RenderItemFrame extends Render<EntityItemFrame>
{
    private static final /* synthetic */ String[] lIlllIlllIIllI;
    private final /* synthetic */ Minecraft mc;
    private final /* synthetic */ ModelResourceLocation itemFrameModel;
    private final /* synthetic */ ModelResourceLocation mapModel;
    private static final /* synthetic */ int[] lIlllIlllIlIIl;
    private /* synthetic */ RenderItem itemRenderer;
    private static final /* synthetic */ ResourceLocation mapBackgroundTextures;
    
    private static boolean lIIIIIllIlllIlll(final int llllllllllllIllllIllIllIIIIIIlII) {
        return llllllllllllIllllIllIllIIIIIIlII != 0;
    }
    
    static {
        lIIIIIllIlllIlII();
        lIIIIIllIllIllll();
        mapBackgroundTextures = new ResourceLocation(RenderItemFrame.lIlllIlllIIllI[RenderItemFrame.lIlllIlllIlIIl[0]]);
    }
    
    @Override
    protected void renderName(final EntityItemFrame llllllllllllIllllIllIllIIllIlIll, final double llllllllllllIllllIllIllIIllIlIlI, final double llllllllllllIllllIllIllIIlIllIll, final double llllllllllllIllllIllIllIIlIllIlI) {
        if (lIIIIIllIlllIlll(Minecraft.isGuiEnabled() ? 1 : 0) && lIIIIIllIlllIlIl(llllllllllllIllllIllIllIIllIlIll.getDisplayedItem()) && lIIIIIllIlllIlll(llllllllllllIllllIllIllIIllIlIll.getDisplayedItem().hasDisplayName() ? 1 : 0) && lIIIIIllIlllIllI(this.renderManager.pointedEntity, llllllllllllIllllIllIllIIllIlIll)) {
            final float llllllllllllIllllIllIllIIllIIlll = 1.6f;
            final float llllllllllllIllllIllIllIIllIIllI = 0.016666668f * llllllllllllIllllIllIllIIllIIlll;
            final double llllllllllllIllllIllIllIIllIIlIl = llllllllllllIllllIllIllIIllIlIll.getDistanceSqToEntity(this.renderManager.livingPlayer);
            float n;
            if (lIIIIIllIlllIlll(llllllllllllIllllIllIllIIllIlIll.isSneaking() ? 1 : 0)) {
                n = 32.0f;
                "".length();
                if ((0xAD ^ 0x99 ^ (0x32 ^ 0x3)) == 0x0) {
                    return;
                }
            }
            else {
                n = 64.0f;
            }
            final float llllllllllllIllllIllIllIIllIIlII = n;
            if (lIIIIIllIllllIlI(lIIIIIllIllllIIl(llllllllllllIllllIllIllIIllIIlIl, llllllllllllIllllIllIllIIllIIlII * llllllllllllIllllIllIllIIllIIlII))) {
                final String llllllllllllIllllIllIllIIllIIIll = llllllllllllIllllIllIllIIllIlIll.getDisplayedItem().getDisplayName();
                if (lIIIIIllIlllIlll(llllllllllllIllllIllIllIIllIlIll.isSneaking() ? 1 : 0)) {
                    final FontRenderer llllllllllllIllllIllIllIIllIIIlI = this.getFontRendererFromRenderManager();
                    GlStateManager.pushMatrix();
                    GlStateManager.translate((float)llllllllllllIllllIllIllIIllIlIlI + 0.0f, (float)llllllllllllIllllIllIllIIlIllIll + llllllllllllIllllIllIllIIllIlIll.height + 0.5f, (float)llllllllllllIllllIllIllIIlIllIlI);
                    GL11.glNormal3f(0.0f, 1.0f, 0.0f);
                    GlStateManager.rotate(-this.renderManager.playerViewY, 0.0f, 1.0f, 0.0f);
                    GlStateManager.rotate(this.renderManager.playerViewX, 1.0f, 0.0f, 0.0f);
                    GlStateManager.scale(-llllllllllllIllllIllIllIIllIIllI, -llllllllllllIllllIllIllIIllIIllI, llllllllllllIllllIllIllIIllIIllI);
                    GlStateManager.disableLighting();
                    GlStateManager.translate(0.0f, 0.25f / llllllllllllIllllIllIllIIllIIllI, 0.0f);
                    GlStateManager.depthMask((boolean)(RenderItemFrame.lIlllIlllIlIIl[0] != 0));
                    GlStateManager.enableBlend();
                    GlStateManager.blendFunc(RenderItemFrame.lIlllIlllIlIIl[7], RenderItemFrame.lIlllIlllIlIIl[8]);
                    final Tessellator llllllllllllIllllIllIllIIllIIIIl = Tessellator.getInstance();
                    final WorldRenderer llllllllllllIllllIllIllIIllIIIII = llllllllllllIllllIllIllIIllIIIIl.getWorldRenderer();
                    final int llllllllllllIllllIllIllIIlIlllll = llllllllllllIllllIllIllIIllIIIlI.getStringWidth(llllllllllllIllllIllIllIIllIIIll) / RenderItemFrame.lIlllIlllIlIIl[2];
                    GlStateManager.disableTexture2D();
                    llllllllllllIllllIllIllIIllIIIII.begin(RenderItemFrame.lIlllIlllIlIIl[9], DefaultVertexFormats.POSITION_COLOR);
                    llllllllllllIllllIllIllIIllIIIII.pos(-llllllllllllIllllIllIllIIlIlllll - RenderItemFrame.lIlllIlllIlIIl[1], -1.0, 0.0).color(0.0f, 0.0f, 0.0f, 0.25f).endVertex();
                    llllllllllllIllllIllIllIIllIIIII.pos(-llllllllllllIllllIllIllIIlIlllll - RenderItemFrame.lIlllIlllIlIIl[1], 8.0, 0.0).color(0.0f, 0.0f, 0.0f, 0.25f).endVertex();
                    llllllllllllIllllIllIllIIllIIIII.pos(llllllllllllIllllIllIllIIlIlllll + RenderItemFrame.lIlllIlllIlIIl[1], 8.0, 0.0).color(0.0f, 0.0f, 0.0f, 0.25f).endVertex();
                    llllllllllllIllllIllIllIIllIIIII.pos(llllllllllllIllllIllIllIIlIlllll + RenderItemFrame.lIlllIlllIlIIl[1], -1.0, 0.0).color(0.0f, 0.0f, 0.0f, 0.25f).endVertex();
                    llllllllllllIllllIllIllIIllIIIIl.draw();
                    GlStateManager.enableTexture2D();
                    GlStateManager.depthMask((boolean)(RenderItemFrame.lIlllIlllIlIIl[1] != 0));
                    llllllllllllIllllIllIllIIllIIIlI.drawString(llllllllllllIllllIllIllIIllIIIll, -llllllllllllIllllIllIllIIllIIIlI.getStringWidth(llllllllllllIllllIllIllIIllIIIll) / RenderItemFrame.lIlllIlllIlIIl[2], RenderItemFrame.lIlllIlllIlIIl[0], RenderItemFrame.lIlllIlllIlIIl[10]);
                    "".length();
                    GlStateManager.enableLighting();
                    GlStateManager.disableBlend();
                    GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
                    GlStateManager.popMatrix();
                    "".length();
                    if (-"  ".length() >= 0) {
                        return;
                    }
                }
                else {
                    this.renderLivingLabel(llllllllllllIllllIllIllIIllIlIll, llllllllllllIllllIllIllIIllIIIll, llllllllllllIllllIllIllIIllIlIlI, llllllllllllIllllIllIllIIlIllIll, llllllllllllIllllIllIllIIlIllIlI, RenderItemFrame.lIlllIlllIlIIl[11]);
                }
            }
        }
    }
    
    public RenderItemFrame(final RenderManager llllllllllllIllllIllIllIllIIIlIl, final RenderItem llllllllllllIllllIllIllIllIIIlll) {
        super(llllllllllllIllllIllIllIllIIIlIl);
        this.mc = Minecraft.getMinecraft();
        this.itemFrameModel = new ModelResourceLocation(RenderItemFrame.lIlllIlllIIllI[RenderItemFrame.lIlllIlllIlIIl[1]], RenderItemFrame.lIlllIlllIIllI[RenderItemFrame.lIlllIlllIlIIl[2]]);
        this.mapModel = new ModelResourceLocation(RenderItemFrame.lIlllIlllIIllI[RenderItemFrame.lIlllIlllIlIIl[3]], RenderItemFrame.lIlllIlllIIllI[RenderItemFrame.lIlllIlllIlIIl[4]]);
        this.itemRenderer = llllllllllllIllllIllIllIllIIIlll;
    }
    
    private static boolean lIIIIIllIlllIllI(final Object llllllllllllIllllIllIllIIIIIIlll, final Object llllllllllllIllllIllIllIIIIIIllI) {
        return llllllllllllIllllIllIllIIIIIIlll == llllllllllllIllllIllIllIIIIIIllI;
    }
    
    @Override
    public void doRender(final EntityItemFrame llllllllllllIllllIllIllIlIlIIlll, final double llllllllllllIllllIllIllIlIlIIlIl, final double llllllllllllIllllIllIllIlIllIlII, final double llllllllllllIllllIllIllIlIlIIIIl, final float llllllllllllIllllIllIllIlIllIIlI, final float llllllllllllIllllIllIllIlIllIIIl) {
        GlStateManager.pushMatrix();
        final BlockPos llllllllllllIllllIllIllIlIllIIII = llllllllllllIllllIllIllIlIlIIlll.getHangingPosition();
        final double llllllllllllIllllIllIllIlIlIllll = llllllllllllIllllIllIllIlIllIIII.getX() - llllllllllllIllllIllIllIlIlIIlll.posX + llllllllllllIllllIllIllIlIlIIlIl;
        final double llllllllllllIllllIllIllIlIlIlllI = llllllllllllIllllIllIllIlIllIIII.getY() - llllllllllllIllllIllIllIlIlIIlll.posY + llllllllllllIllllIllIllIlIllIlII;
        final double llllllllllllIllllIllIllIlIlIllIl = llllllllllllIllllIllIllIlIllIIII.getZ() - llllllllllllIllllIllIllIlIlIIlll.posZ + llllllllllllIllllIllIllIlIlIIIIl;
        GlStateManager.translate(llllllllllllIllllIllIllIlIlIllll + 0.5, llllllllllllIllllIllIllIlIlIlllI + 0.5, llllllllllllIllllIllIllIlIlIllIl + 0.5);
        GlStateManager.rotate(180.0f - llllllllllllIllllIllIllIlIlIIlll.rotationYaw, 0.0f, 1.0f, 0.0f);
        this.renderManager.renderEngine.bindTexture(TextureMap.locationBlocksTexture);
        final BlockRendererDispatcher llllllllllllIllllIllIllIlIlIllII = this.mc.getBlockRendererDispatcher();
        final ModelManager llllllllllllIllllIllIllIlIlIlIll = llllllllllllIllllIllIllIlIlIllII.getBlockModelShapes().getModelManager();
        IBakedModel llllllllllllIllllIllIllIlIlIlIIl;
        if (lIIIIIllIlllIlIl(llllllllllllIllllIllIllIlIlIIlll.getDisplayedItem()) && lIIIIIllIlllIllI(llllllllllllIllllIllIllIlIlIIlll.getDisplayedItem().getItem(), Items.filled_map)) {
            final IBakedModel llllllllllllIllllIllIllIlIlIlIlI = llllllllllllIllllIllIllIlIlIlIll.getModel(this.mapModel);
            "".length();
            if (" ".length() == ((0x5A ^ 0x69) & ~(0x5 ^ 0x36))) {
                return;
            }
        }
        else {
            llllllllllllIllllIllIllIlIlIlIIl = llllllllllllIllllIllIllIlIlIlIll.getModel(this.itemFrameModel);
        }
        GlStateManager.pushMatrix();
        GlStateManager.translate(-0.5f, -0.5f, -0.5f);
        llllllllllllIllllIllIllIlIlIllII.getBlockModelRenderer().renderModelBrightnessColor(llllllllllllIllllIllIllIlIlIlIIl, 1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.popMatrix();
        GlStateManager.translate(0.0f, 0.0f, 0.4375f);
        this.renderItem(llllllllllllIllllIllIllIlIlIIlll);
        GlStateManager.popMatrix();
        this.renderName(llllllllllllIllllIllIllIlIlIIlll, llllllllllllIllllIllIllIlIlIIlIl + llllllllllllIllllIllIllIlIlIIlll.facingDirection.getFrontOffsetX() * 0.3f, llllllllllllIllllIllIllIlIllIlII - 0.25, llllllllllllIllllIllIllIlIlIIIIl + llllllllllllIllllIllIllIlIlIIlll.facingDirection.getFrontOffsetZ() * 0.3f);
    }
    
    @Override
    protected ResourceLocation getEntityTexture(final EntityItemFrame llllllllllllIllllIllIllIlIIllIll) {
        return null;
    }
    
    private static boolean lIIIIIllIlllIlIl(final Object llllllllllllIllllIllIllIIIIIlIlI) {
        return llllllllllllIllllIllIllIIIIIlIlI != null;
    }
    
    private static boolean lIIIIIllIllllIlI(final int llllllllllllIllllIllIllIIIIIIIlI) {
        return llllllllllllIllllIllIllIIIIIIIlI < 0;
    }
    
    private static int lIIIIIllIllllIIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private void renderItem(final EntityItemFrame llllllllllllIllllIllIllIlIIIIIll) {
        final ItemStack llllllllllllIllllIllIllIlIIIlllI = llllllllllllIllllIllIllIlIIIIIll.getDisplayedItem();
        if (lIIIIIllIlllIlIl(llllllllllllIllllIllIllIlIIIlllI)) {
            final EntityItem llllllllllllIllllIllIllIlIIIllIl = new EntityItem(llllllllllllIllllIllIllIlIIIIIll.worldObj, 0.0, 0.0, 0.0, llllllllllllIllllIllIllIlIIIlllI);
            final Item llllllllllllIllllIllIllIlIIIllII = llllllllllllIllllIllIllIlIIIllIl.getEntityItem().getItem();
            llllllllllllIllllIllIllIlIIIllIl.getEntityItem().stackSize = RenderItemFrame.lIlllIlllIlIIl[1];
            llllllllllllIllllIllIllIlIIIllIl.hoverStart = 0.0f;
            GlStateManager.pushMatrix();
            GlStateManager.disableLighting();
            int llllllllllllIllllIllIllIlIIIlIll = llllllllllllIllllIllIllIlIIIIIll.getRotation();
            if (lIIIIIllIlllIllI(llllllllllllIllllIllIllIlIIIllII, Items.filled_map)) {
                llllllllllllIllllIllIllIlIIIlIll = llllllllllllIllllIllIllIlIIIlIll % RenderItemFrame.lIlllIlllIlIIl[4] * RenderItemFrame.lIlllIlllIlIIl[2];
            }
            GlStateManager.rotate(llllllllllllIllllIllIllIlIIIlIll * 360.0f / 8.0f, 0.0f, 0.0f, 1.0f);
            if (lIIIIIllIlllIllI(llllllllllllIllllIllIllIlIIIllII, Items.filled_map)) {
                this.renderManager.renderEngine.bindTexture(RenderItemFrame.mapBackgroundTextures);
                GlStateManager.rotate(180.0f, 0.0f, 0.0f, 1.0f);
                final float llllllllllllIllllIllIllIlIIIlIlI = 0.0078125f;
                GlStateManager.scale(llllllllllllIllllIllIllIlIIIlIlI, llllllllllllIllllIllIllIlIIIlIlI, llllllllllllIllllIllIllIlIIIlIlI);
                GlStateManager.translate(-64.0f, -64.0f, 0.0f);
                final MapData llllllllllllIllllIllIllIlIIIlIIl = Items.filled_map.getMapData(llllllllllllIllllIllIllIlIIIllIl.getEntityItem(), llllllllllllIllllIllIllIlIIIIIll.worldObj);
                GlStateManager.translate(0.0f, 0.0f, -1.0f);
                if (lIIIIIllIlllIlIl(llllllllllllIllllIllIllIlIIIlIIl)) {
                    this.mc.entityRenderer.getMapItemRenderer().renderMap(llllllllllllIllllIllIllIlIIIlIIl, (boolean)(RenderItemFrame.lIlllIlllIlIIl[1] != 0));
                    "".length();
                    if (((151 + 163 - 190 + 75 ^ 136 + 9 - 43 + 55) & (0x2D ^ 0x5B ^ (0xEA ^ 0xC6) ^ -" ".length())) > ((0x6B ^ 0x4F ^ (0x31 ^ 0x29)) & (67 + 119 - 124 + 84 ^ 138 + 167 - 185 + 54 ^ -" ".length()))) {
                        return;
                    }
                }
            }
            else {
                TextureAtlasSprite llllllllllllIllllIllIllIlIIIlIII = null;
                if (lIIIIIllIlllIllI(llllllllllllIllllIllIllIlIIIllII, Items.compass)) {
                    llllllllllllIllllIllIllIlIIIlIII = this.mc.getTextureMapBlocks().getAtlasSprite(TextureCompass.field_176608_l);
                    this.mc.getTextureManager().bindTexture(TextureMap.locationBlocksTexture);
                    if (lIIIIIllIlllIlll((llllllllllllIllllIllIllIlIIIlIII instanceof TextureCompass) ? 1 : 0)) {
                        final TextureCompass llllllllllllIllllIllIllIlIIIIlll = (TextureCompass)llllllllllllIllllIllIllIlIIIlIII;
                        final double llllllllllllIllllIllIllIlIIIIllI = llllllllllllIllllIllIllIlIIIIlll.currentAngle;
                        final double llllllllllllIllllIllIllIlIIIIlIl = llllllllllllIllllIllIllIlIIIIlll.angleDelta;
                        llllllllllllIllllIllIllIlIIIIlll.currentAngle = 0.0;
                        llllllllllllIllllIllIllIlIIIIlll.angleDelta = 0.0;
                        llllllllllllIllllIllIllIlIIIIlll.updateCompass(llllllllllllIllllIllIllIlIIIIIll.worldObj, llllllllllllIllllIllIllIlIIIIIll.posX, llllllllllllIllllIllIllIlIIIIIll.posZ, MathHelper.wrapAngleTo180_float((float)(RenderItemFrame.lIlllIlllIlIIl[5] + llllllllllllIllllIllIllIlIIIIIll.facingDirection.getHorizontalIndex() * RenderItemFrame.lIlllIlllIlIIl[6])), (boolean)(RenderItemFrame.lIlllIlllIlIIl[0] != 0), (boolean)(RenderItemFrame.lIlllIlllIlIIl[1] != 0));
                        llllllllllllIllllIllIllIlIIIIlll.currentAngle = llllllllllllIllllIllIllIlIIIIllI;
                        llllllllllllIllllIllIllIlIIIIlll.angleDelta = llllllllllllIllllIllIllIlIIIIlIl;
                        "".length();
                        if (" ".length() == ((0x8D ^ 0x82) & ~(0x7C ^ 0x73))) {
                            return;
                        }
                    }
                    else {
                        llllllllllllIllllIllIllIlIIIlIII = null;
                    }
                }
                GlStateManager.scale(0.5f, 0.5f, 0.5f);
                if (!lIIIIIllIlllIlll(this.itemRenderer.shouldRenderItemIn3D(llllllllllllIllllIllIllIlIIIllIl.getEntityItem()) ? 1 : 0) || lIIIIIllIlllIlll((llllllllllllIllllIllIllIlIIIllII instanceof ItemSkull) ? 1 : 0)) {
                    GlStateManager.rotate(180.0f, 0.0f, 1.0f, 0.0f);
                }
                GlStateManager.pushAttrib();
                RenderHelper.enableStandardItemLighting();
                this.itemRenderer.func_181564_a(llllllllllllIllllIllIllIlIIIllIl.getEntityItem(), ItemCameraTransforms.TransformType.FIXED);
                RenderHelper.disableStandardItemLighting();
                GlStateManager.popAttrib();
                if (lIIIIIllIlllIlIl(llllllllllllIllllIllIllIlIIIlIII) && lIIIIIllIllllIII(llllllllllllIllllIllIllIlIIIlIII.getFrameCount())) {
                    llllllllllllIllllIllIllIlIIIlIII.updateAnimation();
                }
            }
            GlStateManager.enableLighting();
            GlStateManager.popMatrix();
        }
    }
    
    private static String lIIIIIllIllIllIl(final String llllllllllllIllllIllIllIIIIlIIll, final String llllllllllllIllllIllIllIIIIlIlII) {
        try {
            final SecretKeySpec llllllllllllIllllIllIllIIIIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIllIllIIIIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIllIllIIIIlIlll = Cipher.getInstance("Blowfish");
            llllllllllllIllllIllIllIIIIlIlll.init(RenderItemFrame.lIlllIlllIlIIl[2], llllllllllllIllllIllIllIIIIllIII);
            return new String(llllllllllllIllllIllIllIIIIlIlll.doFinal(Base64.getDecoder().decode(llllllllllllIllllIllIllIIIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIllIllIIIIlIllI) {
            llllllllllllIllllIllIllIIIIlIllI.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIIIllIllIllll() {
        (lIlllIlllIIllI = new String[RenderItemFrame.lIlllIlllIlIIl[12]])[RenderItemFrame.lIlllIlllIlIIl[0]] = lIIIIIllIllIllII("GBIKNh8eEgFtBw0HXS8LHCgQIwkHEAAtHwITXDIECw==", "lwrBj");
        RenderItemFrame.lIlllIlllIIllI[RenderItemFrame.lIlllIlllIlIIl[1]] = lIIIIIllIllIllII("Li08OiUhKzg6Hw==", "GYYWz");
        RenderItemFrame.lIlllIlllIIllI[RenderItemFrame.lIlllIlllIlIIl[2]] = lIIIIIllIllIllIl("ZdMsakR4CTM=", "gbgfx");
        RenderItemFrame.lIlllIlllIIllI[RenderItemFrame.lIlllIlllIlIIl[3]] = lIIIIIllIllIllIl("ZRPBR3W/haVsyQ0F+6D7Pw==", "dlufT");
        RenderItemFrame.lIlllIlllIIllI[RenderItemFrame.lIlllIlllIlIIl[4]] = lIIIIIllIllIllII("FBA1", "yqEQr");
    }
    
    private static boolean lIIIIIllIllllIll(final int llllllllllllIllllIllIllIIIIIllIl, final int llllllllllllIllllIllIllIIIIIllII) {
        return llllllllllllIllllIllIllIIIIIllIl < llllllllllllIllllIllIllIIIIIllII;
    }
    
    private static String lIIIIIllIllIllII(String llllllllllllIllllIllIllIIIlIIlIl, final String llllllllllllIllllIllIllIIIlIIlII) {
        llllllllllllIllllIllIllIIIlIIlIl = (short)new String(Base64.getDecoder().decode(((String)llllllllllllIllllIllIllIIIlIIlIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIllIllIIIlIlIII = new StringBuilder();
        final char[] llllllllllllIllllIllIllIIIlIIlll = llllllllllllIllllIllIllIIIlIIlII.toCharArray();
        int llllllllllllIllllIllIllIIIlIIllI = RenderItemFrame.lIlllIlllIlIIl[0];
        final byte llllllllllllIllllIllIllIIIlIIIII = (Object)((String)llllllllllllIllllIllIllIIIlIIlIl).toCharArray();
        final byte llllllllllllIllllIllIllIIIIlllll = (byte)llllllllllllIllllIllIllIIIlIIIII.length;
        long llllllllllllIllllIllIllIIIIllllI = RenderItemFrame.lIlllIlllIlIIl[0];
        while (lIIIIIllIllllIll((int)llllllllllllIllllIllIllIIIIllllI, llllllllllllIllllIllIllIIIIlllll)) {
            final char llllllllllllIllllIllIllIIIlIlIll = llllllllllllIllllIllIllIIIlIIIII[llllllllllllIllllIllIllIIIIllllI];
            llllllllllllIllllIllIllIIIlIlIII.append((char)(llllllllllllIllllIllIllIIIlIlIll ^ llllllllllllIllllIllIllIIIlIIlll[llllllllllllIllllIllIllIIIlIIllI % llllllllllllIllllIllIllIIIlIIlll.length]));
            "".length();
            ++llllllllllllIllllIllIllIIIlIIllI;
            ++llllllllllllIllllIllIllIIIIllllI;
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIllIllIIIlIlIII);
    }
    
    private static void lIIIIIllIlllIlII() {
        (lIlllIlllIlIIl = new int[13])[0] = ((0x53 ^ 0x7D) & ~(0x85 ^ 0xAB));
        RenderItemFrame.lIlllIlllIlIIl[1] = " ".length();
        RenderItemFrame.lIlllIlllIlIIl[2] = "  ".length();
        RenderItemFrame.lIlllIlllIlIIl[3] = "   ".length();
        RenderItemFrame.lIlllIlllIlIIl[4] = (0x3C ^ 0x4E ^ (0x40 ^ 0x36));
        RenderItemFrame.lIlllIlllIlIIl[5] = (0x2A ^ 0x77) + (118 + 162 - 250 + 133) - (59 + 124 - 10 + 11) + (0xFF ^ 0x93);
        RenderItemFrame.lIlllIlllIlIIl[6] = (195 + 113 - 119 + 13 ^ 2 + 38 - 38 + 142);
        RenderItemFrame.lIlllIlllIlIIl[7] = (0xFFFFA726 & 0x5BDB);
        RenderItemFrame.lIlllIlllIlIIl[8] = (0xFFFFAF4B & 0x53B7);
        RenderItemFrame.lIlllIlllIlIIl[9] = (0x37 ^ 0x30);
        RenderItemFrame.lIlllIlllIlIIl[10] = (-1 & 0x20FFFFFF);
        RenderItemFrame.lIlllIlllIlIIl[11] = (107 + 99 - 96 + 86 ^ 10 + 72 - 5 + 55);
        RenderItemFrame.lIlllIlllIlIIl[12] = (0xB ^ 0xE);
    }
    
    private static boolean lIIIIIllIllllIII(final int llllllllllllIllllIllIllIIIIIIIII) {
        return llllllllllllIllllIllIllIIIIIIIII > 0;
    }
}
