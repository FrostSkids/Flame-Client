// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import java.util.Iterator;
import net.minecraft.entity.player.EntityPlayer;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.renderer.culling.ICamera;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.util.BlockPos;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.EntityLiving;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;

public abstract class Render<T extends Entity>
{
    protected final /* synthetic */ RenderManager renderManager;
    private static final /* synthetic */ ResourceLocation shadowTextures;
    protected /* synthetic */ float shadowSize;
    protected /* synthetic */ float shadowOpaque;
    private static final /* synthetic */ String[] llIIllIIIIIIlI;
    private static final /* synthetic */ int[] llIIllIIIIIIll;
    
    public FontRenderer getFontRendererFromRenderManager() {
        return this.renderManager.getFontRenderer();
    }
    
    public static void renderOffsetAABB(final AxisAlignedBB llllllllllllIlllIIIIlIlllIIIIlll, final double llllllllllllIlllIIIIlIlllIIIIllI, final double llllllllllllIlllIIIIlIlllIIIIlIl, final double llllllllllllIlllIIIIlIllIllllllI) {
        GlStateManager.disableTexture2D();
        final Tessellator llllllllllllIlllIIIIlIlllIIIIIll = Tessellator.getInstance();
        final WorldRenderer llllllllllllIlllIIIIlIlllIIIIIlI = llllllllllllIlllIIIIlIlllIIIIIll.getWorldRenderer();
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        llllllllllllIlllIIIIlIlllIIIIIlI.setTranslation(llllllllllllIlllIIIIlIlllIIIIllI, llllllllllllIlllIIIIlIlllIIIIlIl, llllllllllllIlllIIIIlIllIllllllI);
        llllllllllllIlllIIIIlIlllIIIIIlI.begin(Render.llIIllIIIIIIll[4], DefaultVertexFormats.POSITION_NORMAL);
        llllllllllllIlllIIIIlIlllIIIIIlI.pos(llllllllllllIlllIIIIlIlllIIIIlll.minX, llllllllllllIlllIIIIlIlllIIIIlll.maxY, llllllllllllIlllIIIIlIlllIIIIlll.minZ).normal(0.0f, 0.0f, -1.0f).endVertex();
        llllllllllllIlllIIIIlIlllIIIIIlI.pos(llllllllllllIlllIIIIlIlllIIIIlll.maxX, llllllllllllIlllIIIIlIlllIIIIlll.maxY, llllllllllllIlllIIIIlIlllIIIIlll.minZ).normal(0.0f, 0.0f, -1.0f).endVertex();
        llllllllllllIlllIIIIlIlllIIIIIlI.pos(llllllllllllIlllIIIIlIlllIIIIlll.maxX, llllllllllllIlllIIIIlIlllIIIIlll.minY, llllllllllllIlllIIIIlIlllIIIIlll.minZ).normal(0.0f, 0.0f, -1.0f).endVertex();
        llllllllllllIlllIIIIlIlllIIIIIlI.pos(llllllllllllIlllIIIIlIlllIIIIlll.minX, llllllllllllIlllIIIIlIlllIIIIlll.minY, llllllllllllIlllIIIIlIlllIIIIlll.minZ).normal(0.0f, 0.0f, -1.0f).endVertex();
        llllllllllllIlllIIIIlIlllIIIIIlI.pos(llllllllllllIlllIIIIlIlllIIIIlll.minX, llllllllllllIlllIIIIlIlllIIIIlll.minY, llllllllllllIlllIIIIlIlllIIIIlll.maxZ).normal(0.0f, 0.0f, 1.0f).endVertex();
        llllllllllllIlllIIIIlIlllIIIIIlI.pos(llllllllllllIlllIIIIlIlllIIIIlll.maxX, llllllllllllIlllIIIIlIlllIIIIlll.minY, llllllllllllIlllIIIIlIlllIIIIlll.maxZ).normal(0.0f, 0.0f, 1.0f).endVertex();
        llllllllllllIlllIIIIlIlllIIIIIlI.pos(llllllllllllIlllIIIIlIlllIIIIlll.maxX, llllllllllllIlllIIIIlIlllIIIIlll.maxY, llllllllllllIlllIIIIlIlllIIIIlll.maxZ).normal(0.0f, 0.0f, 1.0f).endVertex();
        llllllllllllIlllIIIIlIlllIIIIIlI.pos(llllllllllllIlllIIIIlIlllIIIIlll.minX, llllllllllllIlllIIIIlIlllIIIIlll.maxY, llllllllllllIlllIIIIlIlllIIIIlll.maxZ).normal(0.0f, 0.0f, 1.0f).endVertex();
        llllllllllllIlllIIIIlIlllIIIIIlI.pos(llllllllllllIlllIIIIlIlllIIIIlll.minX, llllllllllllIlllIIIIlIlllIIIIlll.minY, llllllllllllIlllIIIIlIlllIIIIlll.minZ).normal(0.0f, -1.0f, 0.0f).endVertex();
        llllllllllllIlllIIIIlIlllIIIIIlI.pos(llllllllllllIlllIIIIlIlllIIIIlll.maxX, llllllllllllIlllIIIIlIlllIIIIlll.minY, llllllllllllIlllIIIIlIlllIIIIlll.minZ).normal(0.0f, -1.0f, 0.0f).endVertex();
        llllllllllllIlllIIIIlIlllIIIIIlI.pos(llllllllllllIlllIIIIlIlllIIIIlll.maxX, llllllllllllIlllIIIIlIlllIIIIlll.minY, llllllllllllIlllIIIIlIlllIIIIlll.maxZ).normal(0.0f, -1.0f, 0.0f).endVertex();
        llllllllllllIlllIIIIlIlllIIIIIlI.pos(llllllllllllIlllIIIIlIlllIIIIlll.minX, llllllllllllIlllIIIIlIlllIIIIlll.minY, llllllllllllIlllIIIIlIlllIIIIlll.maxZ).normal(0.0f, -1.0f, 0.0f).endVertex();
        llllllllllllIlllIIIIlIlllIIIIIlI.pos(llllllllllllIlllIIIIlIlllIIIIlll.minX, llllllllllllIlllIIIIlIlllIIIIlll.maxY, llllllllllllIlllIIIIlIlllIIIIlll.maxZ).normal(0.0f, 1.0f, 0.0f).endVertex();
        llllllllllllIlllIIIIlIlllIIIIIlI.pos(llllllllllllIlllIIIIlIlllIIIIlll.maxX, llllllllllllIlllIIIIlIlllIIIIlll.maxY, llllllllllllIlllIIIIlIlllIIIIlll.maxZ).normal(0.0f, 1.0f, 0.0f).endVertex();
        llllllllllllIlllIIIIlIlllIIIIIlI.pos(llllllllllllIlllIIIIlIlllIIIIlll.maxX, llllllllllllIlllIIIIlIlllIIIIlll.maxY, llllllllllllIlllIIIIlIlllIIIIlll.minZ).normal(0.0f, 1.0f, 0.0f).endVertex();
        llllllllllllIlllIIIIlIlllIIIIIlI.pos(llllllllllllIlllIIIIlIlllIIIIlll.minX, llllllllllllIlllIIIIlIlllIIIIlll.maxY, llllllllllllIlllIIIIlIlllIIIIlll.minZ).normal(0.0f, 1.0f, 0.0f).endVertex();
        llllllllllllIlllIIIIlIlllIIIIIlI.pos(llllllllllllIlllIIIIlIlllIIIIlll.minX, llllllllllllIlllIIIIlIlllIIIIlll.minY, llllllllllllIlllIIIIlIlllIIIIlll.maxZ).normal(-1.0f, 0.0f, 0.0f).endVertex();
        llllllllllllIlllIIIIlIlllIIIIIlI.pos(llllllllllllIlllIIIIlIlllIIIIlll.minX, llllllllllllIlllIIIIlIlllIIIIlll.maxY, llllllllllllIlllIIIIlIlllIIIIlll.maxZ).normal(-1.0f, 0.0f, 0.0f).endVertex();
        llllllllllllIlllIIIIlIlllIIIIIlI.pos(llllllllllllIlllIIIIlIlllIIIIlll.minX, llllllllllllIlllIIIIlIlllIIIIlll.maxY, llllllllllllIlllIIIIlIlllIIIIlll.minZ).normal(-1.0f, 0.0f, 0.0f).endVertex();
        llllllllllllIlllIIIIlIlllIIIIIlI.pos(llllllllllllIlllIIIIlIlllIIIIlll.minX, llllllllllllIlllIIIIlIlllIIIIlll.minY, llllllllllllIlllIIIIlIlllIIIIlll.minZ).normal(-1.0f, 0.0f, 0.0f).endVertex();
        llllllllllllIlllIIIIlIlllIIIIIlI.pos(llllllllllllIlllIIIIlIlllIIIIlll.maxX, llllllllllllIlllIIIIlIlllIIIIlll.minY, llllllllllllIlllIIIIlIlllIIIIlll.minZ).normal(1.0f, 0.0f, 0.0f).endVertex();
        llllllllllllIlllIIIIlIlllIIIIIlI.pos(llllllllllllIlllIIIIlIlllIIIIlll.maxX, llllllllllllIlllIIIIlIlllIIIIlll.maxY, llllllllllllIlllIIIIlIlllIIIIlll.minZ).normal(1.0f, 0.0f, 0.0f).endVertex();
        llllllllllllIlllIIIIlIlllIIIIIlI.pos(llllllllllllIlllIIIIlIlllIIIIlll.maxX, llllllllllllIlllIIIIlIlllIIIIlll.maxY, llllllllllllIlllIIIIlIlllIIIIlll.maxZ).normal(1.0f, 0.0f, 0.0f).endVertex();
        llllllllllllIlllIIIIlIlllIIIIIlI.pos(llllllllllllIlllIIIIlIlllIIIIlll.maxX, llllllllllllIlllIIIIlIlllIIIIlll.minY, llllllllllllIlllIIIIlIlllIIIIlll.maxZ).normal(1.0f, 0.0f, 0.0f).endVertex();
        llllllllllllIlllIIIIlIlllIIIIIll.draw();
        llllllllllllIlllIIIIlIlllIIIIIlI.setTranslation(0.0, 0.0, 0.0);
        GlStateManager.enableTexture2D();
    }
    
    private static boolean lIIIlllIIIlllIll(final int llllllllllllIlllIIIIlIlIllllllIl) {
        return llllllllllllIlllIIIIlIlIllllllIl != 0;
    }
    
    public RenderManager getRenderManager() {
        return this.renderManager;
    }
    
    private static boolean lIIIlllIIlIIIIlI(final int llllllllllllIlllIIIIlIlIlllllIIl) {
        return llllllllllllIlllIIIIlIlIlllllIIl >= 0;
    }
    
    private void renderEntityOnFire(final Entity llllllllllllIlllIIIIllIIIlIlIIIl, final double llllllllllllIlllIIIIllIIIlIlIIII, final double llllllllllllIlllIIIIllIIIIllIlll, final double llllllllllllIlllIIIIllIIIIllIllI, final float llllllllllllIlllIIIIllIIIlIIllIl) {
        GlStateManager.disableLighting();
        final TextureMap llllllllllllIlllIIIIllIIIlIIllII = Minecraft.getMinecraft().getTextureMapBlocks();
        final TextureAtlasSprite llllllllllllIlllIIIIllIIIlIIlIll = llllllllllllIlllIIIIllIIIlIIllII.getAtlasSprite(Render.llIIllIIIIIIlI[Render.llIIllIIIIIIll[1]]);
        final TextureAtlasSprite llllllllllllIlllIIIIllIIIlIIlIlI = llllllllllllIlllIIIIllIIIlIIllII.getAtlasSprite(Render.llIIllIIIIIIlI[Render.llIIllIIIIIIll[3]]);
        GlStateManager.pushMatrix();
        GlStateManager.translate((float)llllllllllllIlllIIIIllIIIlIlIIII, (float)llllllllllllIlllIIIIllIIIIllIlll, (float)llllllllllllIlllIIIIllIIIIllIllI);
        final float llllllllllllIlllIIIIllIIIlIIlIIl = llllllllllllIlllIIIIllIIIlIlIIIl.width * 1.4f;
        GlStateManager.scale(llllllllllllIlllIIIIllIIIlIIlIIl, llllllllllllIlllIIIIllIIIlIIlIIl, llllllllllllIlllIIIIllIIIlIIlIIl);
        final Tessellator llllllllllllIlllIIIIllIIIlIIlIII = Tessellator.getInstance();
        final WorldRenderer llllllllllllIlllIIIIllIIIlIIIlll = llllllllllllIlllIIIIllIIIlIIlIII.getWorldRenderer();
        float llllllllllllIlllIIIIllIIIlIIIllI = 0.5f;
        final float llllllllllllIlllIIIIllIIIlIIIlIl = 0.0f;
        float llllllllllllIlllIIIIllIIIlIIIlII = llllllllllllIlllIIIIllIIIlIlIIIl.height / llllllllllllIlllIIIIllIIIlIIlIIl;
        float llllllllllllIlllIIIIllIIIlIIIIll = (float)(llllllllllllIlllIIIIllIIIlIlIIIl.posY - llllllllllllIlllIIIIllIIIlIlIIIl.getEntityBoundingBox().minY);
        GlStateManager.rotate(-this.renderManager.playerViewY, 0.0f, 1.0f, 0.0f);
        GlStateManager.translate(0.0f, 0.0f, -0.3f + (int)llllllllllllIlllIIIIllIIIlIIIlII * 0.02f);
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        float llllllllllllIlllIIIIllIIIlIIIIlI = 0.0f;
        int llllllllllllIlllIIIIllIIIlIIIIIl = Render.llIIllIIIIIIll[0];
        llllllllllllIlllIIIIllIIIlIIIlll.begin(Render.llIIllIIIIIIll[4], DefaultVertexFormats.POSITION_TEX);
        "".length();
        if (((0x78 ^ 0x70 ^ (0xB7 ^ 0x9C)) & (0xFA ^ 0x9E ^ (0x5 ^ 0x42) ^ -" ".length())) != 0x0) {
            return;
        }
        while (!lIIIlllIIIlllllI(lIIIlllIIIllllIl(llllllllllllIlllIIIIllIIIlIIIlII, 0.0f))) {
            TextureAtlasSprite textureAtlasSprite;
            if (lIIIlllIIIlllIlI(llllllllllllIlllIIIIllIIIlIIIIIl % Render.llIIllIIIIIIll[3])) {
                textureAtlasSprite = llllllllllllIlllIIIIllIIIlIIlIll;
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                textureAtlasSprite = llllllllllllIlllIIIIllIIIlIIlIlI;
            }
            final TextureAtlasSprite llllllllllllIlllIIIIllIIIlIIIIII = textureAtlasSprite;
            this.bindTexture(TextureMap.locationBlocksTexture);
            float llllllllllllIlllIIIIllIIIIllllll = llllllllllllIlllIIIIllIIIlIIIIII.getMinU();
            final float llllllllllllIlllIIIIllIIIIlllllI = llllllllllllIlllIIIIllIIIlIIIIII.getMinV();
            float llllllllllllIlllIIIIllIIIIllllIl = llllllllllllIlllIIIIllIIIlIIIIII.getMaxU();
            final float llllllllllllIlllIIIIllIIIIllllII = llllllllllllIlllIIIIllIIIlIIIIII.getMaxV();
            if (lIIIlllIIIlllIlI(llllllllllllIlllIIIIllIIIlIIIIIl / Render.llIIllIIIIIIll[3] % Render.llIIllIIIIIIll[3])) {
                final float llllllllllllIlllIIIIllIIIIlllIll = llllllllllllIlllIIIIllIIIIllllIl;
                llllllllllllIlllIIIIllIIIIllllIl = llllllllllllIlllIIIIllIIIIllllll;
                llllllllllllIlllIIIIllIIIIllllll = llllllllllllIlllIIIIllIIIIlllIll;
            }
            llllllllllllIlllIIIIllIIIlIIIlll.pos(llllllllllllIlllIIIIllIIIlIIIllI - llllllllllllIlllIIIIllIIIlIIIlIl, 0.0f - llllllllllllIlllIIIIllIIIlIIIIll, llllllllllllIlllIIIIllIIIlIIIIlI).tex(llllllllllllIlllIIIIllIIIIllllIl, llllllllllllIlllIIIIllIIIIllllII).endVertex();
            llllllllllllIlllIIIIllIIIlIIIlll.pos(-llllllllllllIlllIIIIllIIIlIIIllI - llllllllllllIlllIIIIllIIIlIIIlIl, 0.0f - llllllllllllIlllIIIIllIIIlIIIIll, llllllllllllIlllIIIIllIIIlIIIIlI).tex(llllllllllllIlllIIIIllIIIIllllll, llllllllllllIlllIIIIllIIIIllllII).endVertex();
            llllllllllllIlllIIIIllIIIlIIIlll.pos(-llllllllllllIlllIIIIllIIIlIIIllI - llllllllllllIlllIIIIllIIIlIIIlIl, 1.4f - llllllllllllIlllIIIIllIIIlIIIIll, llllllllllllIlllIIIIllIIIlIIIIlI).tex(llllllllllllIlllIIIIllIIIIllllll, llllllllllllIlllIIIIllIIIIlllllI).endVertex();
            llllllllllllIlllIIIIllIIIlIIIlll.pos(llllllllllllIlllIIIIllIIIlIIIllI - llllllllllllIlllIIIIllIIIlIIIlIl, 1.4f - llllllllllllIlllIIIIllIIIlIIIIll, llllllllllllIlllIIIIllIIIlIIIIlI).tex(llllllllllllIlllIIIIllIIIIllllIl, llllllllllllIlllIIIIllIIIIlllllI).endVertex();
            llllllllllllIlllIIIIllIIIlIIIlII -= 0.45f;
            llllllllllllIlllIIIIllIIIlIIIIll -= 0.45f;
            llllllllllllIlllIIIIllIIIlIIIllI *= 0.9f;
            llllllllllllIlllIIIIllIIIlIIIIlI += 0.03f;
            ++llllllllllllIlllIIIIllIIIlIIIIIl;
        }
        llllllllllllIlllIIIIllIIIlIIlIII.draw();
        GlStateManager.popMatrix();
        GlStateManager.enableLighting();
    }
    
    private static int lIIIlllIIIlllIIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean lIIIlllIIlIIIIII(final int llllllllllllIlllIIIIlIllIIIIIlII, final int llllllllllllIlllIIIIlIllIIIIIIll) {
        return llllllllllllIlllIIIIlIllIIIIIlII > llllllllllllIlllIIIIlIllIIIIIIll;
    }
    
    private static boolean lIIIlllIIlIIIlll(final int llllllllllllIlllIIIIlIllIIIIlIII, final int llllllllllllIlllIIIIlIllIIIIIlll) {
        return llllllllllllIlllIIIIlIllIIIIlIII < llllllllllllIlllIIIIlIllIIIIIlll;
    }
    
    private void renderShadow(final Entity llllllllllllIlllIIIIllIIIIIIlIII, final double llllllllllllIlllIIIIlIlllllIllIl, final double llllllllllllIlllIIIIllIIIIIIIllI, final double llllllllllllIlllIIIIllIIIIIIIlIl, final float llllllllllllIlllIIIIllIIIIIIIlII, final float llllllllllllIlllIIIIllIIIIIIIIll) {
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(Render.llIIllIIIIIIll[5], Render.llIIllIIIIIIll[6]);
        this.renderManager.renderEngine.bindTexture(Render.shadowTextures);
        final World llllllllllllIlllIIIIllIIIIIIIIlI = this.getWorldFromRenderManager();
        GlStateManager.depthMask((boolean)(Render.llIIllIIIIIIll[0] != 0));
        float llllllllllllIlllIIIIllIIIIIIIIIl = this.shadowSize;
        if (lIIIlllIIIlllIll((llllllllllllIlllIIIIllIIIIIIlIII instanceof EntityLiving) ? 1 : 0)) {
            final EntityLiving llllllllllllIlllIIIIllIIIIIIIIII = (EntityLiving)llllllllllllIlllIIIIllIIIIIIlIII;
            llllllllllllIlllIIIIllIIIIIIIIIl *= llllllllllllIlllIIIIllIIIIIIIIII.getRenderSizeModifier();
            if (lIIIlllIIIlllIll(llllllllllllIlllIIIIllIIIIIIIIII.isChild() ? 1 : 0)) {
                llllllllllllIlllIIIIllIIIIIIIIIl *= 0.5f;
            }
        }
        final double llllllllllllIlllIIIIlIllllllllll = llllllllllllIlllIIIIllIIIIIIlIII.lastTickPosX + (llllllllllllIlllIIIIllIIIIIIlIII.posX - llllllllllllIlllIIIIllIIIIIIlIII.lastTickPosX) * llllllllllllIlllIIIIllIIIIIIIIll;
        final double llllllllllllIlllIIIIlIlllllllllI = llllllllllllIlllIIIIllIIIIIIlIII.lastTickPosY + (llllllllllllIlllIIIIllIIIIIIlIII.posY - llllllllllllIlllIIIIllIIIIIIlIII.lastTickPosY) * llllllllllllIlllIIIIllIIIIIIIIll;
        final double llllllllllllIlllIIIIlIllllllllIl = llllllllllllIlllIIIIllIIIIIIlIII.lastTickPosZ + (llllllllllllIlllIIIIllIIIIIIlIII.posZ - llllllllllllIlllIIIIllIIIIIIlIII.lastTickPosZ) * llllllllllllIlllIIIIllIIIIIIIIll;
        final int llllllllllllIlllIIIIlIllllllllII = MathHelper.floor_double(llllllllllllIlllIIIIlIllllllllll - llllllllllllIlllIIIIllIIIIIIIIIl);
        final int llllllllllllIlllIIIIlIlllllllIll = MathHelper.floor_double(llllllllllllIlllIIIIlIllllllllll + llllllllllllIlllIIIIllIIIIIIIIIl);
        final int llllllllllllIlllIIIIlIlllllllIlI = MathHelper.floor_double(llllllllllllIlllIIIIlIlllllllllI - llllllllllllIlllIIIIllIIIIIIIIIl);
        final int llllllllllllIlllIIIIlIlllllllIIl = MathHelper.floor_double(llllllllllllIlllIIIIlIlllllllllI);
        final int llllllllllllIlllIIIIlIlllllllIII = MathHelper.floor_double(llllllllllllIlllIIIIlIllllllllIl - llllllllllllIlllIIIIllIIIIIIIIIl);
        final int llllllllllllIlllIIIIlIllllllIlll = MathHelper.floor_double(llllllllllllIlllIIIIlIllllllllIl + llllllllllllIlllIIIIllIIIIIIIIIl);
        final double llllllllllllIlllIIIIlIllllllIllI = llllllllllllIlllIIIIlIlllllIllIl - llllllllllllIlllIIIIlIllllllllll;
        final double llllllllllllIlllIIIIlIllllllIlIl = llllllllllllIlllIIIIllIIIIIIIllI - llllllllllllIlllIIIIlIlllllllllI;
        final double llllllllllllIlllIIIIlIllllllIlII = llllllllllllIlllIIIIllIIIIIIIlIl - llllllllllllIlllIIIIlIllllllllIl;
        final Tessellator llllllllllllIlllIIIIlIllllllIIll = Tessellator.getInstance();
        final WorldRenderer llllllllllllIlllIIIIlIllllllIIlI = llllllllllllIlllIIIIlIllllllIIll.getWorldRenderer();
        llllllllllllIlllIIIIlIllllllIIlI.begin(Render.llIIllIIIIIIll[4], DefaultVertexFormats.POSITION_TEX_COLOR);
        final char llllllllllllIlllIIIIlIllllIlIlll = (char)BlockPos.getAllInBoxMutable(new BlockPos(llllllllllllIlllIIIIlIllllllllII, llllllllllllIlllIIIIlIlllllllIlI, llllllllllllIlllIIIIlIlllllllIII), new BlockPos(llllllllllllIlllIIIIlIlllllllIll, llllllllllllIlllIIIIlIlllllllIIl, llllllllllllIlllIIIIlIllllllIlll)).iterator();
        "".length();
        if ("   ".length() == 0) {
            return;
        }
        while (!lIIIlllIIIlllIlI(((Iterator)llllllllllllIlllIIIIlIllllIlIlll).hasNext() ? 1 : 0)) {
            final BlockPos llllllllllllIlllIIIIlIllllllIIIl = ((Iterator<BlockPos>)llllllllllllIlllIIIIlIllllIlIlll).next();
            final Block llllllllllllIlllIIIIlIllllllIIII = llllllllllllIlllIIIIllIIIIIIIIlI.getBlockState(llllllllllllIlllIIIIlIllllllIIIl.down()).getBlock();
            if (lIIIlllIIIllllll(llllllllllllIlllIIIIlIllllllIIII.getRenderType(), Render.llIIllIIIIIIll[7]) && lIIIlllIIlIIIIII(llllllllllllIlllIIIIllIIIIIIIIlI.getLightFromNeighbors(llllllllllllIlllIIIIlIllllllIIIl), Render.llIIllIIIIIIll[8])) {
                this.func_180549_a(llllllllllllIlllIIIIlIllllllIIII, llllllllllllIlllIIIIlIlllllIllIl, llllllllllllIlllIIIIllIIIIIIIllI, llllllllllllIlllIIIIllIIIIIIIlIl, llllllllllllIlllIIIIlIllllllIIIl, llllllllllllIlllIIIIllIIIIIIIlII, llllllllllllIlllIIIIllIIIIIIIIIl, llllllllllllIlllIIIIlIllllllIllI, llllllllllllIlllIIIIlIllllllIlIl, llllllllllllIlllIIIIlIllllllIlII);
            }
        }
        llllllllllllIlllIIIIlIllllllIIll.draw();
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.disableBlend();
        GlStateManager.depthMask((boolean)(Render.llIIllIIIIIIll[1] != 0));
    }
    
    private static int lIIIlllIIlIIIIIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public boolean shouldRender(final T llllllllllllIlllIIIIllIIlIllllII, final ICamera llllllllllllIlllIIIIllIIlIlllIll, final double llllllllllllIlllIIIIllIIlIlllIlI, final double llllllllllllIlllIIIIllIIlIlllIIl, final double llllllllllllIlllIIIIllIIlIllIIlI) {
        AxisAlignedBB llllllllllllIlllIIIIllIIlIllIlll = llllllllllllIlllIIIIllIIlIllllII.getEntityBoundingBox();
        if (!lIIIlllIIIlllIlI(llllllllllllIlllIIIIllIIlIllIlll.func_181656_b() ? 1 : 0) || lIIIlllIIIlllIlI(lIIIlllIIIlllIIl(llllllllllllIlllIIIIllIIlIllIlll.getAverageEdgeLength(), 0.0))) {
            llllllllllllIlllIIIIllIIlIllIlll = new AxisAlignedBB(llllllllllllIlllIIIIllIIlIllllII.posX - 2.0, llllllllllllIlllIIIIllIIlIllllII.posY - 2.0, llllllllllllIlllIIIIllIIlIllllII.posZ - 2.0, llllllllllllIlllIIIIllIIlIllllII.posX + 2.0, llllllllllllIlllIIIIllIIlIllllII.posY + 2.0, llllllllllllIlllIIIIllIIlIllllII.posZ + 2.0);
        }
        if (lIIIlllIIIlllIll(llllllllllllIlllIIIIllIIlIllllII.isInRangeToRender3d(llllllllllllIlllIIIIllIIlIlllIlI, llllllllllllIlllIIIIllIIlIlllIIl, llllllllllllIlllIIIIllIIlIllIIlI) ? 1 : 0) && (!lIIIlllIIIlllIlI(llllllllllllIlllIIIIllIIlIllllII.ignoreFrustumCheck ? 1 : 0) || lIIIlllIIIlllIll(llllllllllllIlllIIIIllIIlIlllIll.isBoundingBoxInFrustum(llllllllllllIlllIIIIllIIlIllIlll) ? 1 : 0))) {
            return Render.llIIllIIIIIIll[1] != 0;
        }
        return Render.llIIllIIIIIIll[0] != 0;
    }
    
    public void bindTexture(final ResourceLocation llllllllllllIlllIIIIllIIIllIlIlI) {
        this.renderManager.renderEngine.bindTexture(llllllllllllIlllIIIIllIIIllIlIlI);
    }
    
    private static boolean lIIIlllIIIllllII(final Object llllllllllllIlllIIIIlIlIllllllll) {
        return llllllllllllIlllIIIIlIlIllllllll == null;
    }
    
    private static boolean lIIIlllIIlIIIIll(final int llllllllllllIlllIIIIlIlIllllIlIl) {
        return llllllllllllIlllIIIIlIlIllllIlIl > 0;
    }
    
    private static boolean lIIIlllIIIlllIlI(final int llllllllllllIlllIIIIlIlIlllllIll) {
        return llllllllllllIlllIIIIlIlIlllllIll == 0;
    }
    
    protected void renderName(final T llllllllllllIlllIIIIllIIlIIllIIl, final double llllllllllllIlllIIIIllIIlIIllIII, final double llllllllllllIlllIIIIllIIlIIlIIlI, final double llllllllllllIlllIIIIllIIlIIlIllI) {
        if (lIIIlllIIIlllIll(this.canRenderName(llllllllllllIlllIIIIllIIlIIllIIl) ? 1 : 0)) {
            this.renderLivingLabel(llllllllllllIlllIIIIllIIlIIllIIl, llllllllllllIlllIIIIllIIlIIllIIl.getDisplayName().getFormattedText(), llllllllllllIlllIIIIllIIlIIllIII, llllllllllllIlllIIIIllIIlIIlIIlI, llllllllllllIlllIIIIllIIlIIlIllI, Render.llIIllIIIIIIll[2]);
        }
    }
    
    public void doRender(final T llllllllllllIlllIIIIllIIlIlIlIlI, final double llllllllllllIlllIIIIllIIlIlIlIIl, final double llllllllllllIlllIIIIllIIlIlIIIIl, final double llllllllllllIlllIIIIllIIlIlIIIII, final float llllllllllllIlllIIIIllIIlIlIIllI, final float llllllllllllIlllIIIIllIIlIlIIlIl) {
        this.renderName(llllllllllllIlllIIIIllIIlIlIlIlI, llllllllllllIlllIIIIllIIlIlIlIIl, llllllllllllIlllIIIIllIIlIlIIIIl, llllllllllllIlllIIIIllIIlIlIIIII);
    }
    
    private static int lIIIlllIIlIIIllI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    protected void renderOffsetLivingLabel(final T llllllllllllIlllIIIIllIIIlllllIl, final double llllllllllllIlllIIIIllIIIlllllII, final double llllllllllllIlllIIIIllIIlIIIIIll, final double llllllllllllIlllIIIIllIIlIIIIIlI, final String llllllllllllIlllIIIIllIIlIIIIIIl, final float llllllllllllIlllIIIIllIIlIIIIIII, final double llllllllllllIlllIIIIllIIIlllllll) {
        this.renderLivingLabel(llllllllllllIlllIIIIllIIIlllllIl, llllllllllllIlllIIIIllIIlIIIIIIl, llllllllllllIlllIIIIllIIIlllllII, llllllllllllIlllIIIIllIIlIIIIIll, llllllllllllIlllIIIIllIIlIIIIIlI, Render.llIIllIIIIIIll[2]);
    }
    
    protected void renderLivingLabel(final T llllllllllllIlllIIIIlIllIlIIllll, final String llllllllllllIlllIIIIlIllIlIIlllI, final double llllllllllllIlllIIIIlIllIlIIllIl, final double llllllllllllIlllIIIIlIllIlIIllII, final double llllllllllllIlllIIIIlIllIlIIlIll, final int llllllllllllIlllIIIIlIllIIlllIll) {
        final double llllllllllllIlllIIIIlIllIlIIlIIl = llllllllllllIlllIIIIlIllIlIIllll.getDistanceSqToEntity(this.renderManager.livingPlayer);
        if (lIIIlllIIIlllllI(lIIIlllIIlIIIllI(llllllllllllIlllIIIIlIllIlIIlIIl, llllllllllllIlllIIIIlIllIIlllIll * llllllllllllIlllIIIIlIllIIlllIll))) {
            final FontRenderer llllllllllllIlllIIIIlIllIlIIlIII = this.getFontRendererFromRenderManager();
            final float llllllllllllIlllIIIIlIllIlIIIlll = 1.6f;
            final float llllllllllllIlllIIIIlIllIlIIIllI = 0.016666668f * llllllllllllIlllIIIIlIllIlIIIlll;
            GlStateManager.pushMatrix();
            GlStateManager.translate((float)llllllllllllIlllIIIIlIllIlIIllIl + 0.0f, (float)llllllllllllIlllIIIIlIllIlIIllII + llllllllllllIlllIIIIlIllIlIIllll.height + 0.5f, (float)llllllllllllIlllIIIIlIllIlIIlIll);
            GL11.glNormal3f(0.0f, 1.0f, 0.0f);
            GlStateManager.rotate(-this.renderManager.playerViewY, 0.0f, 1.0f, 0.0f);
            GlStateManager.rotate(this.renderManager.playerViewX, 1.0f, 0.0f, 0.0f);
            GlStateManager.scale(-llllllllllllIlllIIIIlIllIlIIIllI, -llllllllllllIlllIIIIlIllIlIIIllI, llllllllllllIlllIIIIlIllIlIIIllI);
            GlStateManager.disableLighting();
            GlStateManager.depthMask((boolean)(Render.llIIllIIIIIIll[0] != 0));
            GlStateManager.disableDepth();
            GlStateManager.enableBlend();
            GlStateManager.tryBlendFuncSeparate(Render.llIIllIIIIIIll[5], Render.llIIllIIIIIIll[6], Render.llIIllIIIIIIll[1], Render.llIIllIIIIIIll[0]);
            final Tessellator llllllllllllIlllIIIIlIllIlIIIlIl = Tessellator.getInstance();
            final WorldRenderer llllllllllllIlllIIIIlIllIlIIIlII = llllllllllllIlllIIIIlIllIlIIIlIl.getWorldRenderer();
            int llllllllllllIlllIIIIlIllIlIIIIll = Render.llIIllIIIIIIll[0];
            if (lIIIlllIIIlllIll(llllllllllllIlllIIIIlIllIlIIlllI.equals(Render.llIIllIIIIIIlI[Render.llIIllIIIIIIll[8]]) ? 1 : 0)) {
                llllllllllllIlllIIIIlIllIlIIIIll = Render.llIIllIIIIIIll[9];
            }
            final int llllllllllllIlllIIIIlIllIlIIIIlI = llllllllllllIlllIIIIlIllIlIIlIII.getStringWidth(llllllllllllIlllIIIIlIllIlIIlllI) / Render.llIIllIIIIIIll[3];
            GlStateManager.disableTexture2D();
            llllllllllllIlllIIIIlIllIlIIIlII.begin(Render.llIIllIIIIIIll[4], DefaultVertexFormats.POSITION_COLOR);
            llllllllllllIlllIIIIlIllIlIIIlII.pos(-llllllllllllIlllIIIIlIllIlIIIIlI - Render.llIIllIIIIIIll[1], Render.llIIllIIIIIIll[7] + llllllllllllIlllIIIIlIllIlIIIIll, 0.0).color(0.0f, 0.0f, 0.0f, 0.25f).endVertex();
            llllllllllllIlllIIIIlIllIlIIIlII.pos(-llllllllllllIlllIIIIlIllIlIIIIlI - Render.llIIllIIIIIIll[1], Render.llIIllIIIIIIll[10] + llllllllllllIlllIIIIlIllIlIIIIll, 0.0).color(0.0f, 0.0f, 0.0f, 0.25f).endVertex();
            llllllllllllIlllIIIIlIllIlIIIlII.pos(llllllllllllIlllIIIIlIllIlIIIIlI + Render.llIIllIIIIIIll[1], Render.llIIllIIIIIIll[10] + llllllllllllIlllIIIIlIllIlIIIIll, 0.0).color(0.0f, 0.0f, 0.0f, 0.25f).endVertex();
            llllllllllllIlllIIIIlIllIlIIIlII.pos(llllllllllllIlllIIIIlIllIlIIIIlI + Render.llIIllIIIIIIll[1], Render.llIIllIIIIIIll[7] + llllllllllllIlllIIIIlIllIlIIIIll, 0.0).color(0.0f, 0.0f, 0.0f, 0.25f).endVertex();
            llllllllllllIlllIIIIlIllIlIIIlIl.draw();
            GlStateManager.enableTexture2D();
            llllllllllllIlllIIIIlIllIlIIlIII.drawString(llllllllllllIlllIIIIlIllIlIIlllI, -llllllllllllIlllIIIIlIllIlIIlIII.getStringWidth(llllllllllllIlllIIIIlIllIlIIlllI) / Render.llIIllIIIIIIll[3], llllllllllllIlllIIIIlIllIlIIIIll, Render.llIIllIIIIIIll[11]);
            "".length();
            GlStateManager.enableDepth();
            GlStateManager.depthMask((boolean)(Render.llIIllIIIIIIll[1] != 0));
            llllllllllllIlllIIIIlIllIlIIlIII.drawString(llllllllllllIlllIIIIlIllIlIIlllI, -llllllllllllIlllIIIIlIllIlIIlIII.getStringWidth(llllllllllllIlllIIIIlIllIlIIlllI) / Render.llIIllIIIIIIll[3], llllllllllllIlllIIIIlIllIlIIIIll, Render.llIIllIIIIIIll[7]);
            "".length();
            GlStateManager.enableLighting();
            GlStateManager.disableBlend();
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManager.popMatrix();
        }
    }
    
    private static boolean lIIIlllIIIlllllI(final int llllllllllllIlllIIIIlIlIllllIlll) {
        return llllllllllllIlllIIIIlIlIllllIlll <= 0;
    }
    
    protected Render(final RenderManager llllllllllllIlllIIIIllIIllIIIllI) {
        this.shadowOpaque = 1.0f;
        this.renderManager = llllllllllllIlllIIIIllIIllIIIllI;
    }
    
    protected abstract ResourceLocation getEntityTexture(final T p0);
    
    private static boolean lIIIlllIIIllllll(final int llllllllllllIlllIIIIlIlIllllIIlI, final int llllllllllllIlllIIIIlIlIllllIIIl) {
        return llllllllllllIlllIIIIlIlIllllIIlI != llllllllllllIlllIIIIlIlIllllIIIl;
    }
    
    private static int lIIIlllIIlIIIlII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static void lIIIlllIIIlllIII() {
        (llIIllIIIIIIll = new int[13])[0] = ("  ".length() & ("  ".length() ^ -" ".length()));
        Render.llIIllIIIIIIll[1] = " ".length();
        Render.llIIllIIIIIIll[2] = (88 + 146 - 121 + 122 ^ 110 + 169 - 214 + 106);
        Render.llIIllIIIIIIll[3] = "  ".length();
        Render.llIIllIIIIIIll[4] = (0x37 ^ 0x30);
        Render.llIIllIIIIIIll[5] = (-(0xFFFFF4EF & 0x7FD6) & (0xFFFFFFDF & 0x77E7));
        Render.llIIllIIIIIIll[6] = (-(0xFFFFFC63 & 0x67DD) & (0xFFFFEF4B & 0x77F7));
        Render.llIIllIIIIIIll[7] = -" ".length();
        Render.llIIllIIIIIIll[8] = "   ".length();
        Render.llIIllIIIIIIll[9] = -(0xE5 ^ 0xBE ^ (0xB ^ 0x5A));
        Render.llIIllIIIIIIll[10] = (0x85 ^ 0x8D);
        Render.llIIllIIIIIIll[11] = (-1 & 0x20FFFFFF);
        Render.llIIllIIIIIIll[12] = (55 + 130 - 151 + 114 ^ 49 + 109 - 137 + 123);
    }
    
    static {
        lIIIlllIIIlllIII();
        lIIIlllIIIllIlll();
        shadowTextures = new ResourceLocation(Render.llIIllIIIIIIlI[Render.llIIllIIIIIIll[0]]);
    }
    
    private void func_180549_a(final Block llllllllllllIlllIIIIlIlllIlllIlI, final double llllllllllllIlllIIIIlIlllIlIIIII, final double llllllllllllIlllIIIIlIlllIlllIII, final double llllllllllllIlllIIIIlIlllIllIlll, final BlockPos llllllllllllIlllIIIIlIlllIllIllI, final float llllllllllllIlllIIIIlIlllIllIlIl, final float llllllllllllIlllIIIIlIlllIllIlII, final double llllllllllllIlllIIIIlIlllIIllIIl, final double llllllllllllIlllIIIIlIlllIllIIlI, final double llllllllllllIlllIIIIlIlllIIlIlll) {
        if (lIIIlllIIIlllIll(llllllllllllIlllIIIIlIlllIlllIlI.isFullCube() ? 1 : 0)) {
            final Tessellator llllllllllllIlllIIIIlIlllIllIIII = Tessellator.getInstance();
            final WorldRenderer llllllllllllIlllIIIIlIlllIlIllll = llllllllllllIlllIIIIlIlllIllIIII.getWorldRenderer();
            double llllllllllllIlllIIIIlIlllIlIlllI = (llllllllllllIlllIIIIlIlllIllIlIl - (llllllllllllIlllIIIIlIlllIlllIII - (llllllllllllIlllIIIIlIlllIllIllI.getY() + llllllllllllIlllIIIIlIlllIllIIlI)) / 2.0) * 0.5 * this.getWorldFromRenderManager().getLightBrightness(llllllllllllIlllIIIIlIlllIllIllI);
            if (lIIIlllIIlIIIIlI(lIIIlllIIlIIIIIl(llllllllllllIlllIIIIlIlllIlIlllI, 0.0))) {
                if (lIIIlllIIlIIIIll(lIIIlllIIlIIIIIl(llllllllllllIlllIIIIlIlllIlIlllI, 1.0))) {
                    llllllllllllIlllIIIIlIlllIlIlllI = 1.0;
                }
                final double llllllllllllIlllIIIIlIlllIlIllIl = llllllllllllIlllIIIIlIlllIllIllI.getX() + llllllllllllIlllIIIIlIlllIlllIlI.getBlockBoundsMinX() + llllllllllllIlllIIIIlIlllIIllIIl;
                final double llllllllllllIlllIIIIlIlllIlIllII = llllllllllllIlllIIIIlIlllIllIllI.getX() + llllllllllllIlllIIIIlIlllIlllIlI.getBlockBoundsMaxX() + llllllllllllIlllIIIIlIlllIIllIIl;
                final double llllllllllllIlllIIIIlIlllIlIlIll = llllllllllllIlllIIIIlIlllIllIllI.getY() + llllllllllllIlllIIIIlIlllIlllIlI.getBlockBoundsMinY() + llllllllllllIlllIIIIlIlllIllIIlI + 0.015625;
                final double llllllllllllIlllIIIIlIlllIlIlIlI = llllllllllllIlllIIIIlIlllIllIllI.getZ() + llllllllllllIlllIIIIlIlllIlllIlI.getBlockBoundsMinZ() + llllllllllllIlllIIIIlIlllIIlIlll;
                final double llllllllllllIlllIIIIlIlllIlIlIIl = llllllllllllIlllIIIIlIlllIllIllI.getZ() + llllllllllllIlllIIIIlIlllIlllIlI.getBlockBoundsMaxZ() + llllllllllllIlllIIIIlIlllIIlIlll;
                final float llllllllllllIlllIIIIlIlllIlIlIII = (float)((llllllllllllIlllIIIIlIlllIlIIIII - llllllllllllIlllIIIIlIlllIlIllIl) / 2.0 / llllllllllllIlllIIIIlIlllIllIlII + 0.5);
                final float llllllllllllIlllIIIIlIlllIlIIlll = (float)((llllllllllllIlllIIIIlIlllIlIIIII - llllllllllllIlllIIIIlIlllIlIllII) / 2.0 / llllllllllllIlllIIIIlIlllIllIlII + 0.5);
                final float llllllllllllIlllIIIIlIlllIlIIllI = (float)((llllllllllllIlllIIIIlIlllIllIlll - llllllllllllIlllIIIIlIlllIlIlIlI) / 2.0 / llllllllllllIlllIIIIlIlllIllIlII + 0.5);
                final float llllllllllllIlllIIIIlIlllIlIIlIl = (float)((llllllllllllIlllIIIIlIlllIllIlll - llllllllllllIlllIIIIlIlllIlIlIIl) / 2.0 / llllllllllllIlllIIIIlIlllIllIlII + 0.5);
                llllllllllllIlllIIIIlIlllIlIllll.pos(llllllllllllIlllIIIIlIlllIlIllIl, llllllllllllIlllIIIIlIlllIlIlIll, llllllllllllIlllIIIIlIlllIlIlIlI).tex(llllllllllllIlllIIIIlIlllIlIlIII, llllllllllllIlllIIIIlIlllIlIIllI).color(1.0f, 1.0f, 1.0f, (float)llllllllllllIlllIIIIlIlllIlIlllI).endVertex();
                llllllllllllIlllIIIIlIlllIlIllll.pos(llllllllllllIlllIIIIlIlllIlIllIl, llllllllllllIlllIIIIlIlllIlIlIll, llllllllllllIlllIIIIlIlllIlIlIIl).tex(llllllllllllIlllIIIIlIlllIlIlIII, llllllllllllIlllIIIIlIlllIlIIlIl).color(1.0f, 1.0f, 1.0f, (float)llllllllllllIlllIIIIlIlllIlIlllI).endVertex();
                llllllllllllIlllIIIIlIlllIlIllll.pos(llllllllllllIlllIIIIlIlllIlIllII, llllllllllllIlllIIIIlIlllIlIlIll, llllllllllllIlllIIIIlIlllIlIlIIl).tex(llllllllllllIlllIIIIlIlllIlIIlll, llllllllllllIlllIIIIlIlllIlIIlIl).color(1.0f, 1.0f, 1.0f, (float)llllllllllllIlllIIIIlIlllIlIlllI).endVertex();
                llllllllllllIlllIIIIlIlllIlIllll.pos(llllllllllllIlllIIIIlIlllIlIllII, llllllllllllIlllIIIIlIlllIlIlIll, llllllllllllIlllIIIIlIlllIlIlIlI).tex(llllllllllllIlllIIIIlIlllIlIIlll, llllllllllllIlllIIIIlIlllIlIIllI).color(1.0f, 1.0f, 1.0f, (float)llllllllllllIlllIIIIlIlllIlIlllI).endVertex();
            }
        }
    }
    
    private static String lIIIlllIIIllIllI(String llllllllllllIlllIIIIlIllIIIlIIll, final String llllllllllllIlllIIIIlIllIIIlIIlI) {
        llllllllllllIlllIIIIlIllIIIlIIll = new String(Base64.getDecoder().decode(llllllllllllIlllIIIIlIllIIIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIIIIlIllIIIlIllI = new StringBuilder();
        final char[] llllllllllllIlllIIIIlIllIIIlIlIl = llllllllllllIlllIIIIlIllIIIlIIlI.toCharArray();
        int llllllllllllIlllIIIIlIllIIIlIlII = Render.llIIllIIIIIIll[0];
        final String llllllllllllIlllIIIIlIllIIIIlllI = (Object)llllllllllllIlllIIIIlIllIIIlIIll.toCharArray();
        final boolean llllllllllllIlllIIIIlIllIIIIllIl = llllllllllllIlllIIIIlIllIIIIlllI.length != 0;
        short llllllllllllIlllIIIIlIllIIIIllII = (short)Render.llIIllIIIIIIll[0];
        while (lIIIlllIIlIIIlll(llllllllllllIlllIIIIlIllIIIIllII, llllllllllllIlllIIIIlIllIIIIllIl ? 1 : 0)) {
            final char llllllllllllIlllIIIIlIllIIIllIIl = llllllllllllIlllIIIIlIllIIIIlllI[llllllllllllIlllIIIIlIllIIIIllII];
            llllllllllllIlllIIIIlIllIIIlIllI.append((char)(llllllllllllIlllIIIIlIllIIIllIIl ^ llllllllllllIlllIIIIlIllIIIlIlIl[llllllllllllIlllIIIIlIllIIIlIlII % llllllllllllIlllIIIIlIllIIIlIlIl.length]));
            "".length();
            ++llllllllllllIlllIIIIlIllIIIlIlII;
            ++llllllllllllIlllIIIIlIllIIIIllII;
            "".length();
            if (-(0x41 ^ 0x45) >= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIIIIlIllIIIlIllI);
    }
    
    private static int lIIIlllIIIllllIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static void lIIIlllIIIllIlll() {
        (llIIllIIIIIIlI = new String[Render.llIIllIIIIIIll[12]])[Render.llIIllIIIIIIll[0]] = lIIIlllIIIllIlIl("7OMCT6HGVqTMs02Z14QWJOSLw3eCvIoE4VzVojypOF0=", "wAySQ");
        Render.llIIllIIIIIIlI[Render.llIIllIIIIIIll[1]] = lIIIlllIIIllIllI("OQI5HzomCjEOYzYHOBkyJ0QxEysxNDsbIDEZCEo=", "TkWzY");
        Render.llIIllIIIIIIlI[Render.llIIllIIIIIIll[3]] = lIIIlllIIIllIlIl("0NkXWz5Pz3J/Dlvf2imD+b7IPKxQBIwfiOI1mzVspM0=", "OVLHI");
        Render.llIIllIIIIIIlI[Render.llIIllIIIIIIll[8]] = lIIIlllIIIllIlIl("5vD0gcbKh4L1mdvci0VTYA==", "nwByO");
    }
    
    private static boolean lIIIlllIIlIIIlIl(final Object llllllllllllIlllIIIIlIllIIIIIIIl) {
        return llllllllllllIlllIIIIlIllIIIIIIIl != null;
    }
    
    protected boolean bindEntityTexture(final T llllllllllllIlllIIIIllIIIlllIIIl) {
        final ResourceLocation llllllllllllIlllIIIIllIIIlllIIll = this.getEntityTexture(llllllllllllIlllIIIIllIIIlllIIIl);
        if (lIIIlllIIIllllII(llllllllllllIlllIIIIllIIIlllIIll)) {
            return Render.llIIllIIIIIIll[0] != 0;
        }
        this.bindTexture(llllllllllllIlllIIIIllIIIlllIIll);
        return Render.llIIllIIIIIIll[1] != 0;
    }
    
    private static String lIIIlllIIIllIlIl(final String llllllllllllIlllIIIIlIllIIlIIllI, final String llllllllllllIlllIIIIlIllIIlIIlIl) {
        try {
            final SecretKeySpec llllllllllllIlllIIIIlIllIIlIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIIlIllIIlIIlIl.getBytes(StandardCharsets.UTF_8)), Render.llIIllIIIIIIll[10]), "DES");
            final Cipher llllllllllllIlllIIIIlIllIIlIlIlI = Cipher.getInstance("DES");
            llllllllllllIlllIIIIlIllIIlIlIlI.init(Render.llIIllIIIIIIll[3], llllllllllllIlllIIIIlIllIIlIlIll);
            return new String(llllllllllllIlllIIIIlIllIIlIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIIlIllIIlIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIIIlIllIIlIlIIl) {
            llllllllllllIlllIIIIlIllIIlIlIIl.printStackTrace();
            return null;
        }
    }
    
    private World getWorldFromRenderManager() {
        return this.renderManager.worldObj;
    }
    
    protected boolean canRenderName(final T llllllllllllIlllIIIIllIIlIIIlllI) {
        if (lIIIlllIIIlllIll(llllllllllllIlllIIIIllIIlIIIlllI.getAlwaysRenderNameTagForRender() ? 1 : 0) && lIIIlllIIIlllIll(llllllllllllIlllIIIIllIIlIIIlllI.hasCustomName() ? 1 : 0)) {
            return Render.llIIllIIIIIIll[1] != 0;
        }
        return Render.llIIllIIIIIIll[0] != 0;
    }
    
    public void doRenderShadowAndFire(final Entity llllllllllllIlllIIIIlIllIllIlIIl, final double llllllllllllIlllIIIIlIllIlllIIIl, final double llllllllllllIlllIIIIlIllIlllIIII, final double llllllllllllIlllIIIIlIllIllIIllI, final float llllllllllllIlllIIIIlIllIllIlllI, final float llllllllllllIlllIIIIlIllIllIllIl) {
        if (lIIIlllIIlIIIlIl(this.renderManager.options)) {
            if (lIIIlllIIIlllIll(this.renderManager.options.field_181151_V ? 1 : 0) && lIIIlllIIlIIIIll(lIIIlllIIlIIIlII(this.shadowSize, 0.0f)) && lIIIlllIIIlllIlI(llllllllllllIlllIIIIlIllIllIlIIl.isInvisible() ? 1 : 0) && lIIIlllIIIlllIll(this.renderManager.isRenderShadow() ? 1 : 0)) {
                final double llllllllllllIlllIIIIlIllIllIllII = this.renderManager.getDistanceToCamera(llllllllllllIlllIIIIlIllIllIlIIl.posX, llllllllllllIlllIIIIlIllIllIlIIl.posY, llllllllllllIlllIIIIlIllIllIlIIl.posZ);
                final float llllllllllllIlllIIIIlIllIllIlIll = (float)((1.0 - llllllllllllIlllIIIIlIllIllIllII / 256.0) * this.shadowOpaque);
                if (lIIIlllIIlIIIIll(lIIIlllIIlIIIlII(llllllllllllIlllIIIIlIllIllIlIll, 0.0f))) {
                    this.renderShadow(llllllllllllIlllIIIIlIllIllIlIIl, llllllllllllIlllIIIIlIllIlllIIIl, llllllllllllIlllIIIIlIllIlllIIII, llllllllllllIlllIIIIlIllIllIIllI, llllllllllllIlllIIIIlIllIllIlIll, llllllllllllIlllIIIIlIllIllIllIl);
                }
            }
            if (lIIIlllIIIlllIll(llllllllllllIlllIIIIlIllIllIlIIl.canRenderOnFire() ? 1 : 0) && (!lIIIlllIIIlllIll((llllllllllllIlllIIIIlIllIllIlIIl instanceof EntityPlayer) ? 1 : 0) || lIIIlllIIIlllIlI(((EntityPlayer)llllllllllllIlllIIIIlIllIllIlIIl).isSpectator() ? 1 : 0))) {
                this.renderEntityOnFire(llllllllllllIlllIIIIlIllIllIlIIl, llllllllllllIlllIIIIlIllIlllIIIl, llllllllllllIlllIIIIlIllIlllIIII, llllllllllllIlllIIIIlIllIllIIllI, llllllllllllIlllIIIIlIllIllIllIl);
            }
        }
    }
}
