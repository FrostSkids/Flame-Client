// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer;

import java.util.EnumSet;
import com.google.common.collect.Maps;
import com.google.gson.JsonSyntaxException;
import java.io.IOException;
import net.minecraft.client.shader.ShaderLinkHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.client.renderer.chunk.CompiledChunk;
import net.minecraft.util.ReportedException;
import net.minecraft.crash.CrashReportCategory;
import java.util.concurrent.Callable;
import net.minecraft.crash.CrashReport;
import net.minecraft.client.renderer.chunk.VboChunkFactory;
import net.minecraft.client.renderer.chunk.ListChunkFactory;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.block.state.IBlockState;
import net.minecraft.world.IBlockAccess;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.util.ClassInheritanceMultiMap;
import net.minecraft.block.BlockSkull;
import net.minecraft.block.BlockSign;
import net.minecraft.block.BlockEnderChest;
import net.minecraft.block.BlockChest;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.entity.projectile.EntityWitherSkull;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.client.renderer.vertex.VertexFormatElement;
import java.util.Iterator;
import org.lwjgl.util.vector.Vector3f;
import java.util.Queue;
import com.google.common.collect.Sets;
import java.util.Collection;
import com.google.common.collect.Lists;
import net.minecraft.client.renderer.culling.Frustum;
import net.minecraft.client.renderer.culling.ICamera;
import net.minecraft.client.particle.EntityFX;
import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.item.ItemDye;
import net.minecraft.init.Items;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.block.material.Material;
import net.minecraft.block.Block;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.item.Item;
import net.minecraft.item.ItemRecord;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.client.renderer.chunk.VisGraph;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Vec3;
import org.apache.logging.log4j.LogManager;
import org.lwjgl.opengl.GL11;
import net.minecraft.world.border.WorldBorder;
import net.minecraft.util.MathHelper;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.entity.Entity;
import net.minecraft.util.Matrix4f;
import net.minecraft.client.renderer.culling.ClippingHelperImpl;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.shader.ShaderGroup;
import net.minecraft.client.audio.ISound;
import net.minecraft.util.BlockPos;
import net.minecraft.client.renderer.chunk.RenderChunk;
import net.minecraft.client.shader.Framebuffer;
import org.lwjgl.util.vector.Vector4f;
import net.minecraft.client.renderer.culling.ClippingHelper;
import org.apache.logging.log4j.Logger;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.entity.RenderManager;
import java.util.Map;
import net.minecraft.client.renderer.vertex.VertexFormat;
import net.minecraft.client.renderer.chunk.ChunkRenderDispatcher;
import java.util.List;
import net.minecraft.client.renderer.chunk.IRenderChunkFactory;
import net.minecraft.client.Minecraft;
import net.minecraft.tileentity.TileEntity;
import java.util.Set;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraft.util.Vector3d;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.renderer.vertex.VertexBuffer;
import net.minecraft.world.IWorldAccess;
import net.minecraft.client.resources.IResourceManagerReloadListener;

public class RenderGlobal implements IResourceManagerReloadListener, IWorldAccess
{
    private /* synthetic */ int countEntitiesTotal;
    private /* synthetic */ int glSkyList;
    private /* synthetic */ int frustumUpdatePosChunkX;
    private /* synthetic */ int frustumUpdatePosChunkY;
    private /* synthetic */ VertexBuffer sky2VBO;
    private static final /* synthetic */ ResourceLocation locationSunPng;
    private /* synthetic */ double prevRenderSortY;
    private final /* synthetic */ Vector3d debugTerrainFrustumPosition;
    private /* synthetic */ int renderDistanceChunks;
    private /* synthetic */ boolean debugFixTerrainFrustum;
    private /* synthetic */ double frustumUpdatePosX;
    private /* synthetic */ int countEntitiesHidden;
    private /* synthetic */ WorldClient theWorld;
    private /* synthetic */ VertexBuffer starVBO;
    private static final /* synthetic */ String[] lIIlllllIllIlI;
    private static final /* synthetic */ ResourceLocation locationForcefieldPng;
    private static final /* synthetic */ ResourceLocation locationCloudsPng;
    private /* synthetic */ ChunkRenderContainer renderContainer;
    private /* synthetic */ int countEntitiesRendered;
    private /* synthetic */ int glSkyList2;
    private /* synthetic */ double prevRenderSortZ;
    private final /* synthetic */ Set<TileEntity> field_181024_n;
    private /* synthetic */ double lastViewEntityY;
    private /* synthetic */ int renderEntitiesStartupCounter;
    private /* synthetic */ double lastViewEntityZ;
    private final /* synthetic */ Minecraft mc;
    /* synthetic */ IRenderChunkFactory renderChunkFactory;
    private static final /* synthetic */ ResourceLocation locationEndSkyPng;
    private /* synthetic */ ViewFrustum viewFrustum;
    private static final /* synthetic */ int[] lIIlllllllIIIl;
    private /* synthetic */ List<ContainerLocalRenderInformation> renderInfos;
    private /* synthetic */ double prevRenderSortX;
    private /* synthetic */ int starGLCallList;
    private /* synthetic */ double lastViewEntityYaw;
    private /* synthetic */ double lastViewEntityPitch;
    private /* synthetic */ double frustumUpdatePosY;
    private /* synthetic */ double frustumUpdatePosZ;
    private final /* synthetic */ ChunkRenderDispatcher renderDispatcher;
    private /* synthetic */ VertexFormat vertexBufferFormat;
    private final /* synthetic */ Map<Integer, DestroyBlockProgress> damagedBlocks;
    private /* synthetic */ boolean displayListEntitiesDirty;
    private final /* synthetic */ RenderManager renderManager;
    private /* synthetic */ int frustumUpdatePosChunkZ;
    private /* synthetic */ VertexBuffer skyVBO;
    private final /* synthetic */ TextureManager renderEngine;
    private /* synthetic */ int cloudTickCounter;
    private static final /* synthetic */ Logger logger;
    private /* synthetic */ ClippingHelper debugFixedClippingHelper;
    private final /* synthetic */ Vector4f[] debugTerrainMatrix;
    private /* synthetic */ Framebuffer entityOutlineFramebuffer;
    private /* synthetic */ double lastViewEntityX;
    private /* synthetic */ Set<RenderChunk> chunksToUpdate;
    private static final /* synthetic */ ResourceLocation locationMoonPhasesPng;
    private final /* synthetic */ Map<BlockPos, ISound> mapSoundPositions;
    private /* synthetic */ ShaderGroup entityOutlineShader;
    private /* synthetic */ boolean vboEnabled;
    private final /* synthetic */ TextureAtlasSprite[] destroyBlockIcons;
    
    @Override
    public void playSound(final String lllllllllllllIIlIIIllIIIlIIIlIlI, final double lllllllllllllIIlIIIllIIIlIIIlIIl, final double lllllllllllllIIlIIIllIIIlIIIlIII, final double lllllllllllllIIlIIIllIIIlIIIIlll, final float lllllllllllllIIlIIIllIIIlIIIIllI, final float lllllllllllllIIlIIIllIIIlIIIIlIl) {
    }
    
    private static String llIllllIllIlIll(final String lllllllllllllIIlIIIlIlllIIllIlII, final String lllllllllllllIIlIIIlIlllIIllIIIl) {
        try {
            final SecretKeySpec lllllllllllllIIlIIIlIlllIIllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIlIlllIIllIIIl.getBytes(StandardCharsets.UTF_8)), RenderGlobal.lIIlllllllIIIl[8]), "DES");
            final Cipher lllllllllllllIIlIIIlIlllIIllIllI = Cipher.getInstance("DES");
            lllllllllllllIIlIIIlIlllIIllIllI.init(RenderGlobal.lIIlllllllIIIl[2], lllllllllllllIIlIIIlIlllIIllIlll);
            return new String(lllllllllllllIIlIIIlIlllIIllIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIlIlllIIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIIlIlllIIllIlIl) {
            lllllllllllllIIlIIIlIlllIIllIlIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIlllllIlllIIl(final Object lllllllllllllIIlIIIlIlllIIIIllll) {
        return lllllllllllllIIlIIIlIlllIIIIllll == null;
    }
    
    private void fixTerrainFrustum(final double lllllllllllllIIlIIIllIlllIlIIllI, final double lllllllllllllIIlIIIllIlllIIlllIl, final double lllllllllllllIIlIIIllIlllIIlllII) {
        this.debugFixedClippingHelper = new ClippingHelperImpl();
        ((ClippingHelperImpl)this.debugFixedClippingHelper).init();
        final Matrix4f lllllllllllllIIlIIIllIlllIlIIIll = new Matrix4f(this.debugFixedClippingHelper.modelviewMatrix);
        lllllllllllllIIlIIIllIlllIlIIIll.transpose();
        "".length();
        final Matrix4f lllllllllllllIIlIIIllIlllIlIIIlI = new Matrix4f(this.debugFixedClippingHelper.projectionMatrix);
        lllllllllllllIIlIIIllIlllIlIIIlI.transpose();
        "".length();
        final Matrix4f lllllllllllllIIlIIIllIlllIlIIIIl = new Matrix4f();
        Matrix4f.mul((org.lwjgl.util.vector.Matrix4f)lllllllllllllIIlIIIllIlllIlIIIlI, (org.lwjgl.util.vector.Matrix4f)lllllllllllllIIlIIIllIlllIlIIIll, (org.lwjgl.util.vector.Matrix4f)lllllllllllllIIlIIIllIlllIlIIIIl);
        "".length();
        lllllllllllllIIlIIIllIlllIlIIIIl.invert();
        "".length();
        this.debugTerrainFrustumPosition.field_181059_a = lllllllllllllIIlIIIllIlllIlIIllI;
        this.debugTerrainFrustumPosition.field_181060_b = lllllllllllllIIlIIIllIlllIIlllIl;
        this.debugTerrainFrustumPosition.field_181061_c = lllllllllllllIIlIIIllIlllIIlllII;
        this.debugTerrainMatrix[RenderGlobal.lIIlllllllIIIl[0]] = new Vector4f(-1.0f, -1.0f, -1.0f, 1.0f);
        this.debugTerrainMatrix[RenderGlobal.lIIlllllllIIIl[1]] = new Vector4f(1.0f, -1.0f, -1.0f, 1.0f);
        this.debugTerrainMatrix[RenderGlobal.lIIlllllllIIIl[2]] = new Vector4f(1.0f, 1.0f, -1.0f, 1.0f);
        this.debugTerrainMatrix[RenderGlobal.lIIlllllllIIIl[3]] = new Vector4f(-1.0f, 1.0f, -1.0f, 1.0f);
        this.debugTerrainMatrix[RenderGlobal.lIIlllllllIIIl[4]] = new Vector4f(-1.0f, -1.0f, 1.0f, 1.0f);
        this.debugTerrainMatrix[RenderGlobal.lIIlllllllIIIl[13]] = new Vector4f(1.0f, -1.0f, 1.0f, 1.0f);
        this.debugTerrainMatrix[RenderGlobal.lIIlllllllIIIl[14]] = new Vector4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.debugTerrainMatrix[RenderGlobal.lIIlllllllIIIl[15]] = new Vector4f(-1.0f, 1.0f, 1.0f, 1.0f);
        int lllllllllllllIIlIIIllIlllIlIIIII = RenderGlobal.lIIlllllllIIIl[0];
        "".length();
        if ("  ".length() < 0) {
            return;
        }
        while (!llIlllllIlllIII(lllllllllllllIIlIIIllIlllIlIIIII, RenderGlobal.lIIlllllllIIIl[8])) {
            Matrix4f.transform((org.lwjgl.util.vector.Matrix4f)lllllllllllllIIlIIIllIlllIlIIIIl, this.debugTerrainMatrix[lllllllllllllIIlIIIllIlllIlIIIII], this.debugTerrainMatrix[lllllllllllllIIlIIIllIlllIlIIIII]);
            "".length();
            final Vector4f vector4f = this.debugTerrainMatrix[lllllllllllllIIlIIIllIlllIlIIIII];
            vector4f.x /= this.debugTerrainMatrix[lllllllllllllIIlIIIllIlllIlIIIII].w;
            final Vector4f vector4f2 = this.debugTerrainMatrix[lllllllllllllIIlIIIllIlllIlIIIII];
            vector4f2.y /= this.debugTerrainMatrix[lllllllllllllIIlIIIllIlllIlIIIII].w;
            final Vector4f vector4f3 = this.debugTerrainMatrix[lllllllllllllIIlIIIllIlllIlIIIII];
            vector4f3.z /= this.debugTerrainMatrix[lllllllllllllIIlIIIllIlllIlIIIII].w;
            this.debugTerrainMatrix[lllllllllllllIIlIIIllIlllIlIIIII].w = 1.0f;
            ++lllllllllllllIIlIIIllIlllIlIIIII;
        }
    }
    
    public void renderWorldBorder(final Entity lllllllllllllIIlIIIllIIlIlllIlll, final float lllllllllllllIIlIIIllIIlIlllIllI) {
        final Tessellator lllllllllllllIIlIIIllIIllIIllIlI = Tessellator.getInstance();
        final WorldRenderer lllllllllllllIIlIIIllIIllIIllIIl = lllllllllllllIIlIIIllIIllIIllIlI.getWorldRenderer();
        final WorldBorder lllllllllllllIIlIIIllIIllIIllIII = this.theWorld.getWorldBorder();
        final double lllllllllllllIIlIIIllIIllIIlIlll = this.mc.gameSettings.renderDistanceChunks * RenderGlobal.lIIlllllllIIIl[29];
        if (!llIlllllIllllll(llIllllllIlIlIl(lllllllllllllIIlIIIllIIlIlllIlll.posX, lllllllllllllIIlIIIllIIllIIllIII.maxX() - lllllllllllllIIlIIIllIIllIIlIlll)) || !llIllllllIIIIII(llIllllllIlIllI(lllllllllllllIIlIIIllIIlIlllIlll.posX, lllllllllllllIIlIIIllIIllIIllIII.minX() + lllllllllllllIIlIIIllIIllIIlIlll)) || !llIlllllIllllll(llIllllllIlIlIl(lllllllllllllIIlIIIllIIlIlllIlll.posZ, lllllllllllllIIlIIIllIIllIIllIII.maxZ() - lllllllllllllIIlIIIllIIllIIlIlll)) || llIllllllIlIIll(llIllllllIlIllI(lllllllllllllIIlIIIllIIlIlllIlll.posZ, lllllllllllllIIlIIIllIIllIIllIII.minZ() + lllllllllllllIIlIIIllIIllIIlIlll))) {
            double lllllllllllllIIlIIIllIIllIIlIllI = 1.0 - lllllllllllllIIlIIIllIIllIIllIII.getClosestDistance(lllllllllllllIIlIIIllIIlIlllIlll) / lllllllllllllIIlIIIllIIllIIlIlll;
            lllllllllllllIIlIIIllIIllIIlIllI = Math.pow(lllllllllllllIIlIIIllIIllIIlIllI, 4.0);
            final double lllllllllllllIIlIIIllIIllIIlIlIl = lllllllllllllIIlIIIllIIlIlllIlll.lastTickPosX + (lllllllllllllIIlIIIllIIlIlllIlll.posX - lllllllllllllIIlIIIllIIlIlllIlll.lastTickPosX) * lllllllllllllIIlIIIllIIlIlllIllI;
            final double lllllllllllllIIlIIIllIIllIIlIlII = lllllllllllllIIlIIIllIIlIlllIlll.lastTickPosY + (lllllllllllllIIlIIIllIIlIlllIlll.posY - lllllllllllllIIlIIIllIIlIlllIlll.lastTickPosY) * lllllllllllllIIlIIIllIIlIlllIllI;
            final double lllllllllllllIIlIIIllIIllIIlIIll = lllllllllllllIIlIIIllIIlIlllIlll.lastTickPosZ + (lllllllllllllIIlIIIllIIlIlllIlll.posZ - lllllllllllllIIlIIIllIIlIlllIlll.lastTickPosZ) * lllllllllllllIIlIIIllIIlIlllIllI;
            GlStateManager.enableBlend();
            GlStateManager.tryBlendFuncSeparate(RenderGlobal.lIIlllllllIIIl[17], RenderGlobal.lIIlllllllIIIl[1], RenderGlobal.lIIlllllllIIIl[1], RenderGlobal.lIIlllllllIIIl[0]);
            this.renderEngine.bindTexture(RenderGlobal.locationForcefieldPng);
            GlStateManager.depthMask((boolean)(RenderGlobal.lIIlllllllIIIl[0] != 0));
            GlStateManager.pushMatrix();
            final int lllllllllllllIIlIIIllIIllIIlIIlI = lllllllllllllIIlIIIllIIllIIllIII.getStatus().getID();
            final float lllllllllllllIIlIIIllIIllIIlIIIl = (lllllllllllllIIlIIIllIIllIIlIIlI >> RenderGlobal.lIIlllllllIIIl[29] & RenderGlobal.lIIlllllllIIIl[52]) / 255.0f;
            final float lllllllllllllIIlIIIllIIllIIlIIII = (lllllllllllllIIlIIIllIIllIIlIIlI >> RenderGlobal.lIIlllllllIIIl[8] & RenderGlobal.lIIlllllllIIIl[52]) / 255.0f;
            final float lllllllllllllIIlIIIllIIllIIIllll = (lllllllllllllIIlIIIllIIllIIlIIlI & RenderGlobal.lIIlllllllIIIl[52]) / 255.0f;
            GlStateManager.color(lllllllllllllIIlIIIllIIllIIlIIIl, lllllllllllllIIlIIIllIIllIIlIIII, lllllllllllllIIlIIIllIIllIIIllll, (float)lllllllllllllIIlIIIllIIllIIlIllI);
            GlStateManager.doPolygonOffset(-3.0f, -3.0f);
            GlStateManager.enablePolygonOffset();
            GlStateManager.alphaFunc(RenderGlobal.lIIlllllllIIIl[60], 0.1f);
            GlStateManager.enableAlpha();
            GlStateManager.disableCull();
            final float lllllllllllllIIlIIIllIIllIIIlllI = Minecraft.getSystemTime() % 3000L / 3000.0f;
            final float lllllllllllllIIlIIIllIIllIIIllIl = 0.0f;
            final float lllllllllllllIIlIIIllIIllIIIllII = 0.0f;
            final float lllllllllllllIIlIIIllIIllIIIlIll = 128.0f;
            lllllllllllllIIlIIIllIIllIIllIIl.begin(RenderGlobal.lIIlllllllIIIl[15], DefaultVertexFormats.POSITION_TEX);
            lllllllllllllIIlIIIllIIllIIllIIl.setTranslation(-lllllllllllllIIlIIIllIIllIIlIlIl, -lllllllllllllIIlIIIllIIllIIlIlII, -lllllllllllllIIlIIIllIIllIIlIIll);
            double lllllllllllllIIlIIIllIIllIIIlIlI = Math.max(MathHelper.floor_double(lllllllllllllIIlIIIllIIllIIlIIll - lllllllllllllIIlIIIllIIllIIlIlll), lllllllllllllIIlIIIllIIllIIllIII.minZ());
            double lllllllllllllIIlIIIllIIllIIIlIIl = Math.min(MathHelper.ceiling_double_int(lllllllllllllIIlIIIllIIllIIlIIll + lllllllllllllIIlIIIllIIllIIlIlll), lllllllllllllIIlIIIllIIllIIllIII.maxZ());
            if (llIllllllIIIIII(llIllllllIlIlIl(lllllllllllllIIlIIIllIIllIIlIlIl, lllllllllllllIIlIIIllIIllIIllIII.maxX() - lllllllllllllIIlIIIllIIllIIlIlll))) {
                float lllllllllllllIIlIIIllIIllIIIlIII = 0.0f;
                double lllllllllllllIIlIIIllIIllIIIIlll = lllllllllllllIIlIIIllIIllIIIlIlI;
                "".length();
                if (-"  ".length() > 0) {
                    return;
                }
                while (!llIlllllIlllIll(llIllllllIlIllI(lllllllllllllIIlIIIllIIllIIIIlll, lllllllllllllIIlIIIllIIllIIIlIIl))) {
                    final double lllllllllllllIIlIIIllIIllIIIIllI = Math.min(1.0, lllllllllllllIIlIIIllIIllIIIlIIl - lllllllllllllIIlIIIllIIllIIIIlll);
                    final float lllllllllllllIIlIIIllIIllIIIIlIl = (float)lllllllllllllIIlIIIllIIllIIIIllI * 0.5f;
                    lllllllllllllIIlIIIllIIllIIllIIl.pos(lllllllllllllIIlIIIllIIllIIllIII.maxX(), 256.0, lllllllllllllIIlIIIllIIllIIIIlll).tex(lllllllllllllIIlIIIllIIllIIIlllI + lllllllllllllIIlIIIllIIllIIIlIII, lllllllllllllIIlIIIllIIllIIIlllI + 0.0f).endVertex();
                    lllllllllllllIIlIIIllIIllIIllIIl.pos(lllllllllllllIIlIIIllIIllIIllIII.maxX(), 256.0, lllllllllllllIIlIIIllIIllIIIIlll + lllllllllllllIIlIIIllIIllIIIIllI).tex(lllllllllllllIIlIIIllIIllIIIlllI + lllllllllllllIIlIIIllIIllIIIIlIl + lllllllllllllIIlIIIllIIllIIIlIII, lllllllllllllIIlIIIllIIllIIIlllI + 0.0f).endVertex();
                    lllllllllllllIIlIIIllIIllIIllIIl.pos(lllllllllllllIIlIIIllIIllIIllIII.maxX(), 0.0, lllllllllllllIIlIIIllIIllIIIIlll + lllllllllllllIIlIIIllIIllIIIIllI).tex(lllllllllllllIIlIIIllIIllIIIlllI + lllllllllllllIIlIIIllIIllIIIIlIl + lllllllllllllIIlIIIllIIllIIIlIII, lllllllllllllIIlIIIllIIllIIIlllI + 128.0f).endVertex();
                    lllllllllllllIIlIIIllIIllIIllIIl.pos(lllllllllllllIIlIIIllIIllIIllIII.maxX(), 0.0, lllllllllllllIIlIIIllIIllIIIIlll).tex(lllllllllllllIIlIIIllIIllIIIlllI + lllllllllllllIIlIIIllIIllIIIlIII, lllllllllllllIIlIIIllIIllIIIlllI + 128.0f).endVertex();
                    ++lllllllllllllIIlIIIllIIllIIIIlll;
                    lllllllllllllIIlIIIllIIllIIIlIII += 0.5f;
                }
            }
            if (llIlllllIllllll(llIllllllIlIllI(lllllllllllllIIlIIIllIIllIIlIlIl, lllllllllllllIIlIIIllIIllIIllIII.minX() + lllllllllllllIIlIIIllIIllIIlIlll))) {
                float lllllllllllllIIlIIIllIIllIIIIlII = 0.0f;
                double lllllllllllllIIlIIIllIIllIIIIIll = lllllllllllllIIlIIIllIIllIIIlIlI;
                "".length();
                if (" ".length() <= ((0x65 ^ 0x7F ^ (0xC3 ^ 0x9D)) & (" ".length() ^ (0xC3 ^ 0x86) ^ -" ".length()))) {
                    return;
                }
                while (!llIlllllIlllIll(llIllllllIlIllI(lllllllllllllIIlIIIllIIllIIIIIll, lllllllllllllIIlIIIllIIllIIIlIIl))) {
                    final double lllllllllllllIIlIIIllIIllIIIIIlI = Math.min(1.0, lllllllllllllIIlIIIllIIllIIIlIIl - lllllllllllllIIlIIIllIIllIIIIIll);
                    final float lllllllllllllIIlIIIllIIllIIIIIIl = (float)lllllllllllllIIlIIIllIIllIIIIIlI * 0.5f;
                    lllllllllllllIIlIIIllIIllIIllIIl.pos(lllllllllllllIIlIIIllIIllIIllIII.minX(), 256.0, lllllllllllllIIlIIIllIIllIIIIIll).tex(lllllllllllllIIlIIIllIIllIIIlllI + lllllllllllllIIlIIIllIIllIIIIlII, lllllllllllllIIlIIIllIIllIIIlllI + 0.0f).endVertex();
                    lllllllllllllIIlIIIllIIllIIllIIl.pos(lllllllllllllIIlIIIllIIllIIllIII.minX(), 256.0, lllllllllllllIIlIIIllIIllIIIIIll + lllllllllllllIIlIIIllIIllIIIIIlI).tex(lllllllllllllIIlIIIllIIllIIIlllI + lllllllllllllIIlIIIllIIllIIIIIIl + lllllllllllllIIlIIIllIIllIIIIlII, lllllllllllllIIlIIIllIIllIIIlllI + 0.0f).endVertex();
                    lllllllllllllIIlIIIllIIllIIllIIl.pos(lllllllllllllIIlIIIllIIllIIllIII.minX(), 0.0, lllllllllllllIIlIIIllIIllIIIIIll + lllllllllllllIIlIIIllIIllIIIIIlI).tex(lllllllllllllIIlIIIllIIllIIIlllI + lllllllllllllIIlIIIllIIllIIIIIIl + lllllllllllllIIlIIIllIIllIIIIlII, lllllllllllllIIlIIIllIIllIIIlllI + 128.0f).endVertex();
                    lllllllllllllIIlIIIllIIllIIllIIl.pos(lllllllllllllIIlIIIllIIllIIllIII.minX(), 0.0, lllllllllllllIIlIIIllIIllIIIIIll).tex(lllllllllllllIIlIIIllIIllIIIlllI + lllllllllllllIIlIIIllIIllIIIIlII, lllllllllllllIIlIIIllIIllIIIlllI + 128.0f).endVertex();
                    ++lllllllllllllIIlIIIllIIllIIIIIll;
                    lllllllllllllIIlIIIllIIllIIIIlII += 0.5f;
                }
            }
            lllllllllllllIIlIIIllIIllIIIlIlI = Math.max(MathHelper.floor_double(lllllllllllllIIlIIIllIIllIIlIlIl - lllllllllllllIIlIIIllIIllIIlIlll), lllllllllllllIIlIIIllIIllIIllIII.minX());
            lllllllllllllIIlIIIllIIllIIIlIIl = Math.min(MathHelper.ceiling_double_int(lllllllllllllIIlIIIllIIllIIlIlIl + lllllllllllllIIlIIIllIIllIIlIlll), lllllllllllllIIlIIIllIIllIIllIII.maxX());
            if (llIllllllIIIIII(llIllllllIlIlIl(lllllllllllllIIlIIIllIIllIIlIIll, lllllllllllllIIlIIIllIIllIIllIII.maxZ() - lllllllllllllIIlIIIllIIllIIlIlll))) {
                float lllllllllllllIIlIIIllIIllIIIIIII = 0.0f;
                double lllllllllllllIIlIIIllIIlIlllllll = lllllllllllllIIlIIIllIIllIIIlIlI;
                "".length();
                if ("  ".length() > "  ".length()) {
                    return;
                }
                while (!llIlllllIlllIll(llIllllllIlIllI(lllllllllllllIIlIIIllIIlIlllllll, lllllllllllllIIlIIIllIIllIIIlIIl))) {
                    final double lllllllllllllIIlIIIllIIlIllllllI = Math.min(1.0, lllllllllllllIIlIIIllIIllIIIlIIl - lllllllllllllIIlIIIllIIlIlllllll);
                    final float lllllllllllllIIlIIIllIIlIlllllIl = (float)lllllllllllllIIlIIIllIIlIllllllI * 0.5f;
                    lllllllllllllIIlIIIllIIllIIllIIl.pos(lllllllllllllIIlIIIllIIlIlllllll, 256.0, lllllllllllllIIlIIIllIIllIIllIII.maxZ()).tex(lllllllllllllIIlIIIllIIllIIIlllI + lllllllllllllIIlIIIllIIllIIIIIII, lllllllllllllIIlIIIllIIllIIIlllI + 0.0f).endVertex();
                    lllllllllllllIIlIIIllIIllIIllIIl.pos(lllllllllllllIIlIIIllIIlIlllllll + lllllllllllllIIlIIIllIIlIllllllI, 256.0, lllllllllllllIIlIIIllIIllIIllIII.maxZ()).tex(lllllllllllllIIlIIIllIIllIIIlllI + lllllllllllllIIlIIIllIIlIlllllIl + lllllllllllllIIlIIIllIIllIIIIIII, lllllllllllllIIlIIIllIIllIIIlllI + 0.0f).endVertex();
                    lllllllllllllIIlIIIllIIllIIllIIl.pos(lllllllllllllIIlIIIllIIlIlllllll + lllllllllllllIIlIIIllIIlIllllllI, 0.0, lllllllllllllIIlIIIllIIllIIllIII.maxZ()).tex(lllllllllllllIIlIIIllIIllIIIlllI + lllllllllllllIIlIIIllIIlIlllllIl + lllllllllllllIIlIIIllIIllIIIIIII, lllllllllllllIIlIIIllIIllIIIlllI + 128.0f).endVertex();
                    lllllllllllllIIlIIIllIIllIIllIIl.pos(lllllllllllllIIlIIIllIIlIlllllll, 0.0, lllllllllllllIIlIIIllIIllIIllIII.maxZ()).tex(lllllllllllllIIlIIIllIIllIIIlllI + lllllllllllllIIlIIIllIIllIIIIIII, lllllllllllllIIlIIIllIIllIIIlllI + 128.0f).endVertex();
                    ++lllllllllllllIIlIIIllIIlIlllllll;
                    lllllllllllllIIlIIIllIIllIIIIIII += 0.5f;
                }
            }
            if (llIlllllIllllll(llIllllllIlIllI(lllllllllllllIIlIIIllIIllIIlIIll, lllllllllllllIIlIIIllIIllIIllIII.minZ() + lllllllllllllIIlIIIllIIllIIlIlll))) {
                float lllllllllllllIIlIIIllIIlIlllllII = 0.0f;
                double lllllllllllllIIlIIIllIIlIllllIll = lllllllllllllIIlIIIllIIllIIIlIlI;
                "".length();
                if ("   ".length() < ((0xB1 ^ 0x8D) & ~(0x1F ^ 0x23))) {
                    return;
                }
                while (!llIlllllIlllIll(llIllllllIlIllI(lllllllllllllIIlIIIllIIlIllllIll, lllllllllllllIIlIIIllIIllIIIlIIl))) {
                    final double lllllllllllllIIlIIIllIIlIllllIlI = Math.min(1.0, lllllllllllllIIlIIIllIIllIIIlIIl - lllllllllllllIIlIIIllIIlIllllIll);
                    final float lllllllllllllIIlIIIllIIlIllllIIl = (float)lllllllllllllIIlIIIllIIlIllllIlI * 0.5f;
                    lllllllllllllIIlIIIllIIllIIllIIl.pos(lllllllllllllIIlIIIllIIlIllllIll, 256.0, lllllllllllllIIlIIIllIIllIIllIII.minZ()).tex(lllllllllllllIIlIIIllIIllIIIlllI + lllllllllllllIIlIIIllIIlIlllllII, lllllllllllllIIlIIIllIIllIIIlllI + 0.0f).endVertex();
                    lllllllllllllIIlIIIllIIllIIllIIl.pos(lllllllllllllIIlIIIllIIlIllllIll + lllllllllllllIIlIIIllIIlIllllIlI, 256.0, lllllllllllllIIlIIIllIIllIIllIII.minZ()).tex(lllllllllllllIIlIIIllIIllIIIlllI + lllllllllllllIIlIIIllIIlIllllIIl + lllllllllllllIIlIIIllIIlIlllllII, lllllllllllllIIlIIIllIIllIIIlllI + 0.0f).endVertex();
                    lllllllllllllIIlIIIllIIllIIllIIl.pos(lllllllllllllIIlIIIllIIlIllllIll + lllllllllllllIIlIIIllIIlIllllIlI, 0.0, lllllllllllllIIlIIIllIIllIIllIII.minZ()).tex(lllllllllllllIIlIIIllIIllIIIlllI + lllllllllllllIIlIIIllIIlIllllIIl + lllllllllllllIIlIIIllIIlIlllllII, lllllllllllllIIlIIIllIIllIIIlllI + 128.0f).endVertex();
                    lllllllllllllIIlIIIllIIllIIllIIl.pos(lllllllllllllIIlIIIllIIlIllllIll, 0.0, lllllllllllllIIlIIIllIIllIIllIII.minZ()).tex(lllllllllllllIIlIIIllIIllIIIlllI + lllllllllllllIIlIIIllIIlIlllllII, lllllllllllllIIlIIIllIIllIIIlllI + 128.0f).endVertex();
                    ++lllllllllllllIIlIIIllIIlIllllIll;
                    lllllllllllllIIlIIIllIIlIlllllII += 0.5f;
                }
            }
            lllllllllllllIIlIIIllIIllIIllIlI.draw();
            lllllllllllllIIlIIIllIIllIIllIIl.setTranslation(0.0, 0.0, 0.0);
            GlStateManager.enableCull();
            GlStateManager.disableAlpha();
            GlStateManager.doPolygonOffset(0.0f, 0.0f);
            GlStateManager.disablePolygonOffset();
            GlStateManager.enableAlpha();
            GlStateManager.disableBlend();
            GlStateManager.popMatrix();
            GlStateManager.depthMask((boolean)(RenderGlobal.lIIlllllllIIIl[1] != 0));
        }
    }
    
    private static boolean llIllllllIIlIIl(final int lllllllllllllIIlIIIlIlllIIlIIIII, final int lllllllllllllIIlIIIlIlllIIIlllll) {
        return lllllllllllllIIlIIIlIlllIIlIIIII <= lllllllllllllIIlIIIlIlllIIIlllll;
    }
    
    private static int llIllllllIIlIll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    @Override
    public void onEntityAdded(final Entity lllllllllllllIIlIIIllIIIIIIIllII) {
    }
    
    private void generateSky2() {
        final Tessellator lllllllllllllIIlIIIlllIlIlIIIlII = Tessellator.getInstance();
        final WorldRenderer lllllllllllllIIlIIIlllIlIlIIIIll = lllllllllllllIIlIIIlllIlIlIIIlII.getWorldRenderer();
        if (llIlllllIlllIlI(this.sky2VBO)) {
            this.sky2VBO.deleteGlBuffers();
        }
        if (llIlllllIlllIll(this.glSkyList2)) {
            GLAllocation.deleteDisplayLists(this.glSkyList2);
            this.glSkyList2 = RenderGlobal.lIIlllllllIIIl[6];
        }
        if (llIlllllIllIlll(this.vboEnabled ? 1 : 0)) {
            this.sky2VBO = new VertexBuffer(this.vertexBufferFormat);
            this.renderSky(lllllllllllllIIlIIIlllIlIlIIIIll, -16.0f, (boolean)(RenderGlobal.lIIlllllllIIIl[1] != 0));
            lllllllllllllIIlIIIlllIlIlIIIIll.finishDrawing();
            lllllllllllllIIlIIIlllIlIlIIIIll.reset();
            this.sky2VBO.func_181722_a(lllllllllllllIIlIIIlllIlIlIIIIll.getByteBuffer());
            "".length();
            if (-" ".length() >= 0) {
                return;
            }
        }
        else {
            this.glSkyList2 = GLAllocation.generateDisplayLists(RenderGlobal.lIIlllllllIIIl[1]);
            GL11.glNewList(this.glSkyList2, RenderGlobal.lIIlllllllIIIl[19]);
            this.renderSky(lllllllllllllIIlIIIlllIlIlIIIIll, -16.0f, (boolean)(RenderGlobal.lIIlllllllIIIl[1] != 0));
            lllllllllllllIIlIIIlllIlIlIIIlII.draw();
            GL11.glEndList();
        }
    }
    
    private static int llIllllllIllIlI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean llIlllllIllllll(final int lllllllllllllIIlIIIlIlllIIIIIlll) {
        return lllllllllllllIIlIIIlIlllIIIIIlll < 0;
    }
    
    static {
        llIlllllIllIllI();
        llIlllllIlIlIII();
        logger = LogManager.getLogger();
        locationMoonPhasesPng = new ResourceLocation(RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[0]]);
        locationSunPng = new ResourceLocation(RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[1]]);
        locationCloudsPng = new ResourceLocation(RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[2]]);
        locationEndSkyPng = new ResourceLocation(RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[3]]);
        locationForcefieldPng = new ResourceLocation(RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[4]]);
    }
    
    private static int llIllllllIlIllI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public void renderSky(final float lllllllllllllIIlIIIllIlIlllIlIlI, final int lllllllllllllIIlIIIllIllIIIIllll) {
        if (llIllllllIIlIII(this.mc.theWorld.provider.getDimensionId(), RenderGlobal.lIIlllllllIIIl[1])) {
            this.renderSkyEnd();
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        }
        else if (llIlllllIllIlll(this.mc.theWorld.provider.isSurfaceWorld() ? 1 : 0)) {
            GlStateManager.disableTexture2D();
            final Vec3 lllllllllllllIIlIIIllIllIIIIlllI = this.theWorld.getSkyColor(this.mc.getRenderViewEntity(), lllllllllllllIIlIIIllIlIlllIlIlI);
            float lllllllllllllIIlIIIllIllIIIIllIl = (float)lllllllllllllIIlIIIllIllIIIIlllI.xCoord;
            float lllllllllllllIIlIIIllIllIIIIllII = (float)lllllllllllllIIlIIIllIllIIIIlllI.yCoord;
            float lllllllllllllIIlIIIllIllIIIIlIll = (float)lllllllllllllIIlIIIllIllIIIIlllI.zCoord;
            if (llIllllllIIIIlI(lllllllllllllIIlIIIllIllIIIIllll, RenderGlobal.lIIlllllllIIIl[2])) {
                final float lllllllllllllIIlIIIllIllIIIIlIlI = (lllllllllllllIIlIIIllIllIIIIllIl * 30.0f + lllllllllllllIIlIIIllIllIIIIllII * 59.0f + lllllllllllllIIlIIIllIllIIIIlIll * 11.0f) / 100.0f;
                final float lllllllllllllIIlIIIllIllIIIIlIIl = (lllllllllllllIIlIIIllIllIIIIllIl * 30.0f + lllllllllllllIIlIIIllIllIIIIllII * 70.0f) / 100.0f;
                final float lllllllllllllIIlIIIllIllIIIIlIII = (lllllllllllllIIlIIIllIllIIIIllIl * 30.0f + lllllllllllllIIlIIIllIllIIIIlIll * 70.0f) / 100.0f;
                lllllllllllllIIlIIIllIllIIIIllIl = lllllllllllllIIlIIIllIllIIIIlIlI;
                lllllllllllllIIlIIIllIllIIIIllII = lllllllllllllIIlIIIllIllIIIIlIIl;
                lllllllllllllIIlIIIllIllIIIIlIll = lllllllllllllIIlIIIllIllIIIIlIII;
            }
            GlStateManager.color(lllllllllllllIIlIIIllIllIIIIllIl, lllllllllllllIIlIIIllIllIIIIllII, lllllllllllllIIlIIIllIllIIIIlIll);
            final Tessellator lllllllllllllIIlIIIllIllIIIIIlll = Tessellator.getInstance();
            final WorldRenderer lllllllllllllIIlIIIllIllIIIIIllI = lllllllllllllIIlIIIllIllIIIIIlll.getWorldRenderer();
            GlStateManager.depthMask((boolean)(RenderGlobal.lIIlllllllIIIl[0] != 0));
            GlStateManager.enableFog();
            GlStateManager.color(lllllllllllllIIlIIIllIllIIIIllIl, lllllllllllllIIlIIIllIllIIIIllII, lllllllllllllIIlIIIllIllIIIIlIll);
            if (llIlllllIllIlll(this.vboEnabled ? 1 : 0)) {
                this.skyVBO.bindBuffer();
                GL11.glEnableClientState(RenderGlobal.lIIlllllllIIIl[47]);
                GL11.glVertexPointer(RenderGlobal.lIIlllllllIIIl[3], RenderGlobal.lIIlllllllIIIl[53], RenderGlobal.lIIlllllllIIIl[26], 0L);
                this.skyVBO.drawArrays(RenderGlobal.lIIlllllllIIIl[15]);
                this.skyVBO.unbindBuffer();
                GL11.glDisableClientState(RenderGlobal.lIIlllllllIIIl[47]);
                "".length();
                if (-" ".length() >= (0xA1 ^ 0xA5)) {
                    return;
                }
            }
            else {
                GlStateManager.callList(this.glSkyList);
            }
            GlStateManager.disableFog();
            GlStateManager.disableAlpha();
            GlStateManager.enableBlend();
            GlStateManager.tryBlendFuncSeparate(RenderGlobal.lIIlllllllIIIl[17], RenderGlobal.lIIlllllllIIIl[18], RenderGlobal.lIIlllllllIIIl[1], RenderGlobal.lIIlllllllIIIl[0]);
            RenderHelper.disableStandardItemLighting();
            final float[] lllllllllllllIIlIIIllIllIIIIIlIl = this.theWorld.provider.calcSunriseSunsetColors(this.theWorld.getCelestialAngle(lllllllllllllIIlIIIllIlIlllIlIlI), lllllllllllllIIlIIIllIlIlllIlIlI);
            if (llIlllllIlllIlI(lllllllllllllIIlIIIllIllIIIIIlIl)) {
                GlStateManager.disableTexture2D();
                GlStateManager.shadeModel(RenderGlobal.lIIlllllllIIIl[54]);
                GlStateManager.pushMatrix();
                GlStateManager.rotate(90.0f, 1.0f, 0.0f, 0.0f);
                float lllllllllllllIIlIlIIllIlIIllIIII;
                if (llIlllllIllllll(llIllllllIIllIl(MathHelper.sin(this.theWorld.getCelestialAngleRadians(lllllllllllllIIlIIIllIlIlllIlIlI)), 0.0f))) {
                    lllllllllllllIIlIlIIllIlIIllIIII = 180.0f;
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    lllllllllllllIIlIlIIllIlIIllIIII = 0.0f;
                }
                GlStateManager.rotate(lllllllllllllIIlIlIIllIlIIllIIII, 0.0f, 0.0f, 1.0f);
                GlStateManager.rotate(90.0f, 0.0f, 0.0f, 1.0f);
                float lllllllllllllIIlIIIllIllIIIIIlII = lllllllllllllIIlIIIllIllIIIIIlIl[RenderGlobal.lIIlllllllIIIl[0]];
                float lllllllllllllIIlIIIllIllIIIIIIll = lllllllllllllIIlIIIllIllIIIIIlIl[RenderGlobal.lIIlllllllIIIl[1]];
                float lllllllllllllIIlIIIllIllIIIIIIlI = lllllllllllllIIlIIIllIllIIIIIlIl[RenderGlobal.lIIlllllllIIIl[2]];
                if (llIllllllIIIIlI(lllllllllllllIIlIIIllIllIIIIllll, RenderGlobal.lIIlllllllIIIl[2])) {
                    final float lllllllllllllIIlIIIllIllIIIIIIIl = (lllllllllllllIIlIIIllIllIIIIIlII * 30.0f + lllllllllllllIIlIIIllIllIIIIIIll * 59.0f + lllllllllllllIIlIIIllIllIIIIIIlI * 11.0f) / 100.0f;
                    final float lllllllllllllIIlIIIllIllIIIIIIII = (lllllllllllllIIlIIIllIllIIIIIlII * 30.0f + lllllllllllllIIlIIIllIllIIIIIIll * 70.0f) / 100.0f;
                    final float lllllllllllllIIlIIIllIlIllllllll = (lllllllllllllIIlIIIllIllIIIIIlII * 30.0f + lllllllllllllIIlIIIllIllIIIIIIlI * 70.0f) / 100.0f;
                    lllllllllllllIIlIIIllIllIIIIIlII = lllllllllllllIIlIIIllIllIIIIIIIl;
                    lllllllllllllIIlIIIllIllIIIIIIll = lllllllllllllIIlIIIllIllIIIIIIII;
                    lllllllllllllIIlIIIllIllIIIIIIlI = lllllllllllllIIlIIIllIlIllllllll;
                }
                lllllllllllllIIlIIIllIllIIIIIllI.begin(RenderGlobal.lIIlllllllIIIl[14], DefaultVertexFormats.POSITION_COLOR);
                lllllllllllllIIlIIIllIllIIIIIllI.pos(0.0, 100.0, 0.0).color(lllllllllllllIIlIIIllIllIIIIIlII, lllllllllllllIIlIIIllIllIIIIIIll, lllllllllllllIIlIIIllIllIIIIIIlI, lllllllllllllIIlIIIllIllIIIIIlIl[RenderGlobal.lIIlllllllIIIl[3]]).endVertex();
                final int lllllllllllllIIlIIIllIlIlllllllI = RenderGlobal.lIIlllllllIIIl[29];
                int lllllllllllllIIlIIIllIlIllllllIl = RenderGlobal.lIIlllllllIIIl[0];
                "".length();
                if (-" ".length() >= 0) {
                    return;
                }
                while (!llIlllllIllllII(lllllllllllllIIlIIIllIlIllllllIl, RenderGlobal.lIIlllllllIIIl[29])) {
                    final float lllllllllllllIIlIIIllIlIllllllII = lllllllllllllIIlIIIllIlIllllllIl * 3.1415927f * 2.0f / 16.0f;
                    final float lllllllllllllIIlIIIllIlIlllllIll = MathHelper.sin(lllllllllllllIIlIIIllIlIllllllII);
                    final float lllllllllllllIIlIIIllIlIlllllIlI = MathHelper.cos(lllllllllllllIIlIIIllIlIllllllII);
                    lllllllllllllIIlIIIllIllIIIIIllI.pos(lllllllllllllIIlIIIllIlIlllllIll * 120.0f, lllllllllllllIIlIIIllIlIlllllIlI * 120.0f, -lllllllllllllIIlIIIllIlIlllllIlI * 40.0f * lllllllllllllIIlIIIllIllIIIIIlIl[RenderGlobal.lIIlllllllIIIl[3]]).color(lllllllllllllIIlIIIllIllIIIIIlIl[RenderGlobal.lIIlllllllIIIl[0]], lllllllllllllIIlIIIllIllIIIIIlIl[RenderGlobal.lIIlllllllIIIl[1]], lllllllllllllIIlIIIllIllIIIIIlIl[RenderGlobal.lIIlllllllIIIl[2]], 0.0f).endVertex();
                    ++lllllllllllllIIlIIIllIlIllllllIl;
                }
                lllllllllllllIIlIIIllIllIIIIIlll.draw();
                GlStateManager.popMatrix();
                GlStateManager.shadeModel(RenderGlobal.lIIlllllllIIIl[55]);
            }
            GlStateManager.enableTexture2D();
            GlStateManager.tryBlendFuncSeparate(RenderGlobal.lIIlllllllIIIl[17], RenderGlobal.lIIlllllllIIIl[1], RenderGlobal.lIIlllllllIIIl[1], RenderGlobal.lIIlllllllIIIl[0]);
            GlStateManager.pushMatrix();
            final float lllllllllllllIIlIIIllIlIlllllIIl = 1.0f - this.theWorld.getRainStrength(lllllllllllllIIlIIIllIlIlllIlIlI);
            GlStateManager.color(1.0f, 1.0f, 1.0f, lllllllllllllIIlIIIllIlIlllllIIl);
            GlStateManager.rotate(-90.0f, 0.0f, 1.0f, 0.0f);
            GlStateManager.rotate(this.theWorld.getCelestialAngle(lllllllllllllIIlIIIllIlIlllIlIlI) * 360.0f, 1.0f, 0.0f, 0.0f);
            float lllllllllllllIIlIIIllIlIlllllIII = 30.0f;
            this.renderEngine.bindTexture(RenderGlobal.locationSunPng);
            lllllllllllllIIlIIIllIllIIIIIllI.begin(RenderGlobal.lIIlllllllIIIl[15], DefaultVertexFormats.POSITION_TEX);
            lllllllllllllIIlIIIllIllIIIIIllI.pos(-lllllllllllllIIlIIIllIlIlllllIII, 100.0, -lllllllllllllIIlIIIllIlIlllllIII).tex(0.0, 0.0).endVertex();
            lllllllllllllIIlIIIllIllIIIIIllI.pos(lllllllllllllIIlIIIllIlIlllllIII, 100.0, -lllllllllllllIIlIIIllIlIlllllIII).tex(1.0, 0.0).endVertex();
            lllllllllllllIIlIIIllIllIIIIIllI.pos(lllllllllllllIIlIIIllIlIlllllIII, 100.0, lllllllllllllIIlIIIllIlIlllllIII).tex(1.0, 1.0).endVertex();
            lllllllllllllIIlIIIllIllIIIIIllI.pos(-lllllllllllllIIlIIIllIlIlllllIII, 100.0, lllllllllllllIIlIIIllIlIlllllIII).tex(0.0, 1.0).endVertex();
            lllllllllllllIIlIIIllIllIIIIIlll.draw();
            lllllllllllllIIlIIIllIlIlllllIII = 20.0f;
            this.renderEngine.bindTexture(RenderGlobal.locationMoonPhasesPng);
            final int lllllllllllllIIlIIIllIlIllllIlll = this.theWorld.getMoonPhase();
            final int lllllllllllllIIlIIIllIlIllllIllI = lllllllllllllIIlIIIllIlIllllIlll % RenderGlobal.lIIlllllllIIIl[4];
            final int lllllllllllllIIlIIIllIlIllllIlIl = lllllllllllllIIlIIIllIlIllllIlll / RenderGlobal.lIIlllllllIIIl[4] % RenderGlobal.lIIlllllllIIIl[2];
            final float lllllllllllllIIlIIIllIlIllllIlII = (lllllllllllllIIlIIIllIlIllllIllI + RenderGlobal.lIIlllllllIIIl[0]) / 4.0f;
            final float lllllllllllllIIlIIIllIlIllllIIll = (lllllllllllllIIlIIIllIlIllllIlIl + RenderGlobal.lIIlllllllIIIl[0]) / 2.0f;
            final float lllllllllllllIIlIIIllIlIllllIIlI = (lllllllllllllIIlIIIllIlIllllIllI + RenderGlobal.lIIlllllllIIIl[1]) / 4.0f;
            final float lllllllllllllIIlIIIllIlIllllIIIl = (lllllllllllllIIlIIIllIlIllllIlIl + RenderGlobal.lIIlllllllIIIl[1]) / 2.0f;
            lllllllllllllIIlIIIllIllIIIIIllI.begin(RenderGlobal.lIIlllllllIIIl[15], DefaultVertexFormats.POSITION_TEX);
            lllllllllllllIIlIIIllIllIIIIIllI.pos(-lllllllllllllIIlIIIllIlIlllllIII, -100.0, lllllllllllllIIlIIIllIlIlllllIII).tex(lllllllllllllIIlIIIllIlIllllIIlI, lllllllllllllIIlIIIllIlIllllIIIl).endVertex();
            lllllllllllllIIlIIIllIllIIIIIllI.pos(lllllllllllllIIlIIIllIlIlllllIII, -100.0, lllllllllllllIIlIIIllIlIlllllIII).tex(lllllllllllllIIlIIIllIlIllllIlII, lllllllllllllIIlIIIllIlIllllIIIl).endVertex();
            lllllllllllllIIlIIIllIllIIIIIllI.pos(lllllllllllllIIlIIIllIlIlllllIII, -100.0, -lllllllllllllIIlIIIllIlIlllllIII).tex(lllllllllllllIIlIIIllIlIllllIlII, lllllllllllllIIlIIIllIlIllllIIll).endVertex();
            lllllllllllllIIlIIIllIllIIIIIllI.pos(-lllllllllllllIIlIIIllIlIlllllIII, -100.0, -lllllllllllllIIlIIIllIlIlllllIII).tex(lllllllllllllIIlIIIllIlIllllIIlI, lllllllllllllIIlIIIllIlIllllIIll).endVertex();
            lllllllllllllIIlIIIllIllIIIIIlll.draw();
            GlStateManager.disableTexture2D();
            final float lllllllllllllIIlIIIllIlIllllIIII = this.theWorld.getStarBrightness(lllllllllllllIIlIIIllIlIlllIlIlI) * lllllllllllllIIlIIIllIlIlllllIIl;
            if (llIllllllIIIIII(llIllllllIIlllI(lllllllllllllIIlIIIllIlIllllIIII, 0.0f))) {
                GlStateManager.color(lllllllllllllIIlIIIllIlIllllIIII, lllllllllllllIIlIIIllIlIllllIIII, lllllllllllllIIlIIIllIlIllllIIII, lllllllllllllIIlIIIllIlIllllIIII);
                if (llIlllllIllIlll(this.vboEnabled ? 1 : 0)) {
                    this.starVBO.bindBuffer();
                    GL11.glEnableClientState(RenderGlobal.lIIlllllllIIIl[47]);
                    GL11.glVertexPointer(RenderGlobal.lIIlllllllIIIl[3], RenderGlobal.lIIlllllllIIIl[53], RenderGlobal.lIIlllllllIIIl[26], 0L);
                    this.starVBO.drawArrays(RenderGlobal.lIIlllllllIIIl[15]);
                    this.starVBO.unbindBuffer();
                    GL11.glDisableClientState(RenderGlobal.lIIlllllllIIIl[47]);
                    "".length();
                    if (" ".length() > "   ".length()) {
                        return;
                    }
                }
                else {
                    GlStateManager.callList(this.starGLCallList);
                }
            }
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManager.disableBlend();
            GlStateManager.enableAlpha();
            GlStateManager.enableFog();
            GlStateManager.popMatrix();
            GlStateManager.disableTexture2D();
            GlStateManager.color(0.0f, 0.0f, 0.0f);
            final double lllllllllllllIIlIIIllIlIlllIllll = this.mc.thePlayer.getPositionEyes(lllllllllllllIIlIIIllIlIlllIlIlI).yCoord - this.theWorld.getHorizon();
            if (llIlllllIllllll(llIllllllIIllll(lllllllllllllIIlIIIllIlIlllIllll, 0.0))) {
                GlStateManager.pushMatrix();
                GlStateManager.translate(0.0f, 12.0f, 0.0f);
                if (llIlllllIllIlll(this.vboEnabled ? 1 : 0)) {
                    this.sky2VBO.bindBuffer();
                    GL11.glEnableClientState(RenderGlobal.lIIlllllllIIIl[47]);
                    GL11.glVertexPointer(RenderGlobal.lIIlllllllIIIl[3], RenderGlobal.lIIlllllllIIIl[53], RenderGlobal.lIIlllllllIIIl[26], 0L);
                    this.sky2VBO.drawArrays(RenderGlobal.lIIlllllllIIIl[15]);
                    this.sky2VBO.unbindBuffer();
                    GL11.glDisableClientState(RenderGlobal.lIIlllllllIIIl[47]);
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    GlStateManager.callList(this.glSkyList2);
                }
                GlStateManager.popMatrix();
                final float lllllllllllllIIlIIIllIlIlllIlllI = 1.0f;
                final float lllllllllllllIIlIIIllIlIlllIllIl = -(float)(lllllllllllllIIlIIIllIlIlllIllll + 65.0);
                final float lllllllllllllIIlIIIllIlIlllIllII = -1.0f;
                lllllllllllllIIlIIIllIllIIIIIllI.begin(RenderGlobal.lIIlllllllIIIl[15], DefaultVertexFormats.POSITION_COLOR);
                lllllllllllllIIlIIIllIllIIIIIllI.pos(-1.0, lllllllllllllIIlIIIllIlIlllIllIl, 1.0).color(RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[52]).endVertex();
                lllllllllllllIIlIIIllIllIIIIIllI.pos(1.0, lllllllllllllIIlIIIllIlIlllIllIl, 1.0).color(RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[52]).endVertex();
                lllllllllllllIIlIIIllIllIIIIIllI.pos(1.0, -1.0, 1.0).color(RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[52]).endVertex();
                lllllllllllllIIlIIIllIllIIIIIllI.pos(-1.0, -1.0, 1.0).color(RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[52]).endVertex();
                lllllllllllllIIlIIIllIllIIIIIllI.pos(-1.0, -1.0, -1.0).color(RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[52]).endVertex();
                lllllllllllllIIlIIIllIllIIIIIllI.pos(1.0, -1.0, -1.0).color(RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[52]).endVertex();
                lllllllllllllIIlIIIllIllIIIIIllI.pos(1.0, lllllllllllllIIlIIIllIlIlllIllIl, -1.0).color(RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[52]).endVertex();
                lllllllllllllIIlIIIllIllIIIIIllI.pos(-1.0, lllllllllllllIIlIIIllIlIlllIllIl, -1.0).color(RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[52]).endVertex();
                lllllllllllllIIlIIIllIllIIIIIllI.pos(1.0, -1.0, -1.0).color(RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[52]).endVertex();
                lllllllllllllIIlIIIllIllIIIIIllI.pos(1.0, -1.0, 1.0).color(RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[52]).endVertex();
                lllllllllllllIIlIIIllIllIIIIIllI.pos(1.0, lllllllllllllIIlIIIllIlIlllIllIl, 1.0).color(RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[52]).endVertex();
                lllllllllllllIIlIIIllIllIIIIIllI.pos(1.0, lllllllllllllIIlIIIllIlIlllIllIl, -1.0).color(RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[52]).endVertex();
                lllllllllllllIIlIIIllIllIIIIIllI.pos(-1.0, lllllllllllllIIlIIIllIlIlllIllIl, -1.0).color(RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[52]).endVertex();
                lllllllllllllIIlIIIllIllIIIIIllI.pos(-1.0, lllllllllllllIIlIIIllIlIlllIllIl, 1.0).color(RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[52]).endVertex();
                lllllllllllllIIlIIIllIllIIIIIllI.pos(-1.0, -1.0, 1.0).color(RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[52]).endVertex();
                lllllllllllllIIlIIIllIllIIIIIllI.pos(-1.0, -1.0, -1.0).color(RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[52]).endVertex();
                lllllllllllllIIlIIIllIllIIIIIllI.pos(-1.0, -1.0, -1.0).color(RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[52]).endVertex();
                lllllllllllllIIlIIIllIllIIIIIllI.pos(-1.0, -1.0, 1.0).color(RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[52]).endVertex();
                lllllllllllllIIlIIIllIllIIIIIllI.pos(1.0, -1.0, 1.0).color(RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[52]).endVertex();
                lllllllllllllIIlIIIllIllIIIIIllI.pos(1.0, -1.0, -1.0).color(RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[52]).endVertex();
                lllllllllllllIIlIIIllIllIIIIIlll.draw();
            }
            if (llIlllllIllIlll(this.theWorld.provider.isSkyColored() ? 1 : 0)) {
                GlStateManager.color(lllllllllllllIIlIIIllIllIIIIllIl * 0.2f + 0.04f, lllllllllllllIIlIIIllIllIIIIllII * 0.2f + 0.04f, lllllllllllllIIlIIIllIllIIIIlIll * 0.6f + 0.1f);
                "".length();
                if (((0x3B ^ 0x68) & ~(0xC9 ^ 0x9A)) < 0) {
                    return;
                }
            }
            else {
                GlStateManager.color(lllllllllllllIIlIIIllIllIIIIllIl, lllllllllllllIIlIIIllIllIIIIllII, lllllllllllllIIlIIIllIllIIIIlIll);
            }
            GlStateManager.pushMatrix();
            GlStateManager.translate(0.0f, -(float)(lllllllllllllIIlIIIllIlIlllIllll - 16.0), 0.0f);
            GlStateManager.callList(this.glSkyList2);
            GlStateManager.popMatrix();
            GlStateManager.enableTexture2D();
            GlStateManager.depthMask((boolean)(RenderGlobal.lIIlllllllIIIl[1] != 0));
        }
    }
    
    private static boolean llIlllllIlllIlI(final Object lllllllllllllIIlIIIlIlllIIIlIlIl) {
        return lllllllllllllIIlIIIlIlllIIIlIlIl != null;
    }
    
    private static boolean llIllllllIIIllI(final Object lllllllllllllIIlIIIlIlllIIIllIII, final Object lllllllllllllIIlIIIlIlllIIIlIlll) {
        return lllllllllllllIIlIIIlIlllIIIllIII != lllllllllllllIIlIIIlIlllIIIlIlll;
    }
    
    private static int llIllllllIIIIll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static void llIlllllIlIlIII() {
        (lIIlllllIllIlI = new String[RenderGlobal.lIIlllllllIIIl[92]])[RenderGlobal.lIIlllllllIIIl[0]] = llIllllIllIlIIl("JwQSGAEhBBlDET0XAx4bPQwPAgB8DAUDGgwRAg0HNhJEHBo0", "Sajlt");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[1]] = llIllllIllIlIlI("HbTx+4wus3jku74iEMQBMbRPYZXxgPIb1YPgbPB1ynQ=", "vZFmQ");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[2]] = llIllllIllIlIlI("64oNexUENkjy8FnKdIvCPadRCG+azST9Hsnm1jNeuY4=", "DnLET");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[3]] = llIllllIllIlIIl("IwkuLjclCSV1JzkaPygtOQEzNDZ4CTg+HSQHL3QyOQs=", "WlVZB");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[4]] = llIllllIllIlIll("b3yunZXUpOTYsNPPExUAOvmt26lYhXyw/oc8Lqh1Chc=", "HGsjD");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[13]] = llIllllIllIlIIl("HicgKCoBLyg5cxEiIS4iAGEqKDoHPCE0FgA6LyosLA==", "sNNMI");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[14]] = llIllllIllIlIlI("xl4eBuEzyYxS0plds1ZOUtNE+Z0RchOXqafxvqcJ/E4EQh9plnJvYA==", "xXAsH");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[15]] = llIllllIllIlIIl("DQogAgE=", "kcNcm");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[8]] = llIllllIllIlIll("bkuuyXXXmIK7GdoVM8PowXKlD40/FtVC", "zevus");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[16]] = llIllllIllIlIlI("vkuXFnaDYm8CJ6JGob6i7FGFv91TYQ4W", "CZUbQ");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[7]] = llIllllIllIlIlI("2uCFXmnLars=", "Okzoy");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[24]] = llIllllIllIlIll("tIJOgzEfxKw=", "VZmKf");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[26]] = llIllllIllIlIlI("U9RWDx6nZNqJ5v0857JhzA==", "SYLAv");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[28]] = llIllllIllIlIIl("Px0TAD4zFhQ=", "ZsgiJ");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[30]] = llIllllIllIlIlI("kP3z16LOpLDIdstuTfevfg==", "JLWgd");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[31]] = llIllllIllIlIIl("D2NRUApjfBVVSz8dS1VLKHVRUB0=", "LYqun");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[29]] = llIllllIllIlIll("IDdzODOsrWQ=", "kxduX");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[32]] = llIllllIllIlIll("F8e8dH61C68=", "fTxKZ");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[33]] = llIllllIllIlIlI("YqUyjoFaO8M=", "yNRdQ");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[34]] = llIllllIllIlIIl("dQ==", "ZHRmA");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[35]] = llIllllIllIlIIl("b3QtWEo=", "CTobj");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[36]] = llIllllIllIlIIl("bkwdbmY=", "BlTTF");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[37]] = llIllllIllIlIlI("qsnk1lFYCdY=", "VGpea");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[38]] = llIllllIllIlIIl("JgIJPCkmCw4rODcGCj0+NQ==", "TggXL");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[39]] = llIllllIllIlIlI("Am0hXltVgVA=", "NXKbB");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[40]] = llIllllIllIlIlI("j3NusJkzIu8=", "POghI");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[42]] = llIllllIllIlIIl("FhcKCDRUDAYFIg==", "tbcdP");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[44]] = llIllllIllIlIll("GCjTvky/6d2fWyT+qcOxxPMDTlvfYpGZ", "fPLeg");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[45]] = llIllllIllIlIll("/jerIj/e3CA0Zx7F05S+TA==", "laHON");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[46]] = llIllllIllIlIlI("quVRhUMfTKw=", "PXfkl");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[63]] = llIllllIllIlIIl("Mz8UMh0CLhg5TQEvHjsIViYTMwQYIFcnDAQzHjQBEw==", "vGwWm");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[64]] = llIllllIllIlIll("9HK28tL0ouzTDAZM4fxlBMwfnzvbSEO+", "pCdAG");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[56]] = llIllllIllIlIll("iq29rKAZeIc=", "heYeg");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[65]] = llIllllIllIlIIl("HhY1FAErAyIHHw==", "NwGul");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[66]] = llIllllIllIlIIl("GiI4IjgjIiU=", "JMKKL");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[68]] = llIllllIllIlIIl("DDUxQzwILjsIOU8pIww8Dw==", "aZSmK");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[69]] = llIllllIllIlIlI("F+e0uzOUDT9jBj7S949VEEO2mfe9igEv", "gBqfD");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[70]] = llIllllIllIlIll("XpR0Ttnp03p3ekLul5kdEg==", "LhnMr");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[71]] = llIllllIllIlIlI("PM6gRwGybcZh3fJh98ZnYg==", "bCmHZ");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[72]] = llIllllIllIlIIl("OSoqJywmZSYsNA==", "KKDCC");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[51]] = llIllllIllIlIIl("FDEDCQ4LfgkCDhQPAh0ECA==", "fPmma");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[73]] = llIllllIllIlIlI("xuKxtorRbhUSFdEWi0Xwhw==", "YBERC");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[74]] = llIllllIllIlIll("WjmPoKPFBAzPr/0chlcLeg==", "wxdlg");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[75]] = llIllllIllIlIll("ALqOwDwKy05zXBTwomYhcV9Zuf9er/oY", "NnuZR");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[76]] = llIllllIllIlIlI("HJbEHc7AQa+ifPSiurhyUiLBt2M+91Mm", "TixxB");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[77]] = llIllllIllIlIIl("BAYzQzQBCCIZfQ8AIwgxCAU9", "iiQmS");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[78]] = llIllllIllIlIlI("n0sgLJgbeHJLtYpkvgMC+K6uR0iqUegh", "FoDQJ");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[79]] = llIllllIllIlIlI("PyJyPDTXWOKjDLtohPWAEA==", "QwzbY");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[80]] = llIllllIllIlIll("sdIOSPKFwqU/78yLsfT8sBRPNIbZHq51", "bjCTY");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[81]] = llIllllIllIlIlI("7mtPqwxn2CowjcP/nX1cMDF9AJI6N94u", "ahLRu");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[82]] = llIllllIllIlIll("BkIX9rYsRY7vSxerhNRAqXGDKE38qTsl", "Aqtky");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[83]] = llIllllIllIlIlI("F5aVynoA0eoJW7KmuXH6RQ==", "FWwyu");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[84]] = llIllllIllIlIll("gl9nP/gcOS8ASSTV3siGWX9Io79Zs6Os", "OOiRp");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[85]] = llIllllIllIlIlI("r/A2IRu3KZimtEWxVdP0ct5fPFOZjF7D", "oLTms");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[86]] = llIllllIllIlIIl("PhQYLwAhWxclGSUZKSkdKRQd", "LuvKo");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[87]] = llIllllIllIlIll("fALo4QtO4EVS/9QEmCVH6zj0a4WK1ETl", "xbISf");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[88]] = llIllllIllIlIll("+OHdewhTJHISeCXT/EjDRo9x4KYNvvaf", "ICxcm");
        RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[91]] = llIllllIllIlIIl("LhEaIVg5HwMtGSdeBCkXOhg=", "IpwDv");
    }
    
    private Set<EnumFacing> getVisibleFacings(final BlockPos lllllllllllllIIlIIIllIllllIIlIlI) {
        final VisGraph lllllllllllllIIlIIIllIllllIIlIIl = new VisGraph();
        final BlockPos lllllllllllllIIlIIIllIllllIIlIII = new BlockPos(lllllllllllllIIlIIIllIllllIIlIlI.getX() >> RenderGlobal.lIIlllllllIIIl[4] << RenderGlobal.lIIlllllllIIIl[4], lllllllllllllIIlIIIllIllllIIlIlI.getY() >> RenderGlobal.lIIlllllllIIIl[4] << RenderGlobal.lIIlllllllIIIl[4], lllllllllllllIIlIIIllIllllIIlIlI.getZ() >> RenderGlobal.lIIlllllllIIIl[4] << RenderGlobal.lIIlllllllIIIl[4]);
        final Chunk lllllllllllllIIlIIIllIllllIIIlll = this.theWorld.getChunkFromBlockCoords(lllllllllllllIIlIIIllIllllIIlIII);
        final Exception lllllllllllllIIlIIIllIlllIllllll = (Exception)BlockPos.getAllInBoxMutable(lllllllllllllIIlIIIllIllllIIlIII, lllllllllllllIIlIIIllIllllIIlIII.add(RenderGlobal.lIIlllllllIIIl[31], RenderGlobal.lIIlllllllIIIl[31], RenderGlobal.lIIlllllllIIIl[31])).iterator();
        "".length();
        if ((0x7B ^ 0x41 ^ (0xA6 ^ 0x98)) <= 0) {
            return null;
        }
        while (!llIllllllIIIIIl(((Iterator)lllllllllllllIIlIIIllIlllIllllll).hasNext() ? 1 : 0)) {
            final BlockPos.MutableBlockPos lllllllllllllIIlIIIllIllllIIIllI = ((Iterator<BlockPos.MutableBlockPos>)lllllllllllllIIlIIIllIlllIllllll).next();
            if (llIlllllIllIlll(lllllllllllllIIlIIIllIllllIIIlll.getBlock(lllllllllllllIIlIIIllIllllIIIllI).isOpaqueCube() ? 1 : 0)) {
                lllllllllllllIIlIIIllIllllIIlIIl.func_178606_a(lllllllllllllIIlIIIllIllllIIIllI);
            }
        }
        return lllllllllllllIIlIIIllIllllIIlIIl.func_178609_b(lllllllllllllIIlIIIllIllllIIlIlI);
    }
    
    private static void llIlllllIllIllI() {
        (lIIlllllllIIIl = new int[93])[0] = ((25 + 123 + 9 + 31 ^ 165 + 136 - 233 + 107) & (0x53 ^ 0x38 ^ (0x7 ^ 0x7F) ^ -" ".length()));
        RenderGlobal.lIIlllllllIIIl[1] = " ".length();
        RenderGlobal.lIIlllllllIIIl[2] = "  ".length();
        RenderGlobal.lIIlllllllIIIl[3] = "   ".length();
        RenderGlobal.lIIlllllllIIIl[4] = (0x14 ^ 0x10);
        RenderGlobal.lIIlllllllIIIl[5] = (-(0xFFFFC5B9 & 0x7FEE) & (0xFFFFFFE7 & 0x155FF));
        RenderGlobal.lIIlllllllIIIl[6] = -" ".length();
        RenderGlobal.lIIlllllllIIIl[7] = (0x33 ^ 0x5E ^ (0x41 ^ 0x26));
        RenderGlobal.lIIlllllllIIIl[8] = (95 + 115 - 64 + 30 ^ 40 + 119 - 83 + 108);
        RenderGlobal.lIIlllllllIIIl[9] = (0xFFFFBDF7 & 0x4FE9);
        RenderGlobal.lIIlllllllIIIl[10] = (0xFFFFBE2E & 0x69D3);
        RenderGlobal.lIIlllllllIIIl[11] = (-(0xFFFF9EFD & 0x67DB) & (-1 & 0x2FD9));
        RenderGlobal.lIIlllllllIIIl[12] = (0xFFFFBEF3 & 0x690F);
        RenderGlobal.lIIlllllllIIIl[13] = (49 + 28 - 22 + 79 ^ 94 + 84 - 138 + 91);
        RenderGlobal.lIIlllllllIIIl[14] = (0xE6 ^ 0xA8 ^ (0x31 ^ 0x79));
        RenderGlobal.lIIlllllllIIIl[15] = (0x83 ^ 0x84);
        RenderGlobal.lIIlllllllIIIl[16] = (8 + 127 - 75 + 127 ^ 35 + 124 - 92 + 111);
        RenderGlobal.lIIlllllllIIIl[17] = (0xFFFFF3BF & 0xF42);
        RenderGlobal.lIIlllllllIIIl[18] = (0xFFFF83E7 & 0x7F1B);
        RenderGlobal.lIIlllllllIIIl[19] = (-(0xFFFFC8B3 & 0x7FFD) & (0xFFFFFFF4 & 0x5BBB));
        RenderGlobal.lIIlllllllIIIl[20] = (55 + 55 - 42 + 64 ^ 36 + 175 - 121 + 106);
        RenderGlobal.lIIlllllllIIIl[21] = -(-(0xFFFFDDF1 & 0x265E) & (0xFFFFE5EF & 0x1FDF));
        RenderGlobal.lIIlllllllIIIl[22] = (-(0xFFFF965F & 0x79FE) & (0xFFFFB7DD & 0x59FF));
        RenderGlobal.lIIlllllllIIIl[23] = (0xFFFF8FFF & 0x75DC);
        RenderGlobal.lIIlllllllIIIl[24] = (0x78 ^ 0x73);
        RenderGlobal.lIIlllllllIIIl[25] = (-(0xFFFFCBF5 & 0x750B) & (0xFFFFD777 & 0x6B8F));
        RenderGlobal.lIIlllllllIIIl[26] = (0xCE ^ 0xC2);
        RenderGlobal.lIIlllllllIIIl[27] = (-(0x74 ^ 0x61) & (0xFFFFBA97 & 0x477F));
        RenderGlobal.lIIlllllllIIIl[28] = (0x12 ^ 0x1F);
        RenderGlobal.lIIlllllllIIIl[29] = (0x51 ^ 0x41);
        RenderGlobal.lIIlllllllIIIl[30] = (0xCF ^ 0xC1);
        RenderGlobal.lIIlllllllIIIl[31] = (52 + 14 + 21 + 65 ^ 26 + 4 + 32 + 89);
        RenderGlobal.lIIlllllllIIIl[32] = (0x9B ^ 0x8A);
        RenderGlobal.lIIlllllllIIIl[33] = (0xA0 ^ 0xB2);
        RenderGlobal.lIIlllllllIIIl[34] = (50 + 159 - 107 + 88 ^ 133 + 90 - 142 + 92);
        RenderGlobal.lIIlllllllIIIl[35] = (0x1B ^ 0xF);
        RenderGlobal.lIIlllllllIIIl[36] = (113 + 183 - 113 + 6 ^ 68 + 60 - 21 + 61);
        RenderGlobal.lIIlllllllIIIl[37] = (0x5B ^ 0x40 ^ (0x44 ^ 0x49));
        RenderGlobal.lIIlllllllIIIl[38] = (3 + 121 - 73 + 124 ^ 126 + 171 - 155 + 42);
        RenderGlobal.lIIlllllllIIIl[39] = (0x7B ^ 0x63);
        RenderGlobal.lIIlllllllIIIl[40] = (0xC8 ^ 0x9F ^ (0x5A ^ 0x14));
        RenderGlobal.lIIlllllllIIIl[41] = 20 + 125 + 33 + 70;
        RenderGlobal.lIIlllllllIIIl[42] = (0xB4 ^ 0xAE);
        RenderGlobal.lIIlllllllIIIl[43] = (0xFFFFF9DC & 0x723);
        RenderGlobal.lIIlllllllIIIl[44] = (137 + 118 - 170 + 135 ^ 96 + 10 + 7 + 86);
        RenderGlobal.lIIlllllllIIIl[45] = (0x62 ^ 0x7E);
        RenderGlobal.lIIlllllllIIIl[46] = (0x2F ^ 0x44 ^ (0xE2 ^ 0x94));
        RenderGlobal.lIIlllllllIIIl[47] = (-(0xFFFFEC8B & 0x7F7D) & (0xFFFFFC7C & 0xEFFF));
        RenderGlobal.lIIlllllllIIIl[48] = (-(0xFFFFFADC & 0x5FAB) & (0xFFFFFAFF & 0xDFFF));
        RenderGlobal.lIIlllllllIIIl[49] = (0xFFFFB8F7 & 0xC77E);
        RenderGlobal.lIIlllllllIIIl[50] = (-(0xFFFFE533 & 0x1EEE) & (0xFFFFEFB5 & 0x15FB));
        RenderGlobal.lIIlllllllIIIl[51] = (0xBB ^ 0x93);
        RenderGlobal.lIIlllllllIIIl[52] = 162 + 129 - 160 + 124;
        RenderGlobal.lIIlllllllIIIl[53] = (0xFFFFBE37 & 0x55CE);
        RenderGlobal.lIIlllllllIIIl[54] = (0xFFFFDDBB & 0x3F45);
        RenderGlobal.lIIlllllllIIIl[55] = (-(0xFFFFE3F9 & 0x5E3E) & (0xFFFFFF7F & 0x5FB7));
        RenderGlobal.lIIlllllllIIIl[56] = (0x3A ^ 0x1A);
        RenderGlobal.lIIlllllllIIIl[57] = (0xFFFFCF4D & 0x38B2);
        RenderGlobal.lIIlllllllIIIl[58] = -(0xFFFFB1B0 & 0x4F4F);
        RenderGlobal.lIIlllllllIIIl[59] = -"   ".length();
        RenderGlobal.lIIlllllllIIIl[60] = (-(0xFFFFEC7F & 0x73BB) & (0xFFFFF3BF & 0x6E7E));
        RenderGlobal.lIIlllllllIIIl[61] = (0xFFFFCF9E & 0x3367);
        RenderGlobal.lIIlllllllIIIl[62] = (0xFFFFF72B & 0xBD4);
        RenderGlobal.lIIlllllllIIIl[63] = (0x74 ^ 0x6A);
        RenderGlobal.lIIlllllllIIIl[64] = (0x10 ^ 0x72 ^ (0x54 ^ 0x29));
        RenderGlobal.lIIlllllllIIIl[65] = (0x64 ^ 0x51 ^ (0xBA ^ 0xAE));
        RenderGlobal.lIIlllllllIIIl[66] = (59 + 146 - 172 + 135 ^ 90 + 29 - 8 + 27);
        RenderGlobal.lIIlllllllIIIl[67] = (-(0xFFFFAE7F & 0x7D8B) & (0xFFFFEFFF & 0x3FFF));
        RenderGlobal.lIIlllllllIIIl[68] = (0x47 ^ 0x64);
        RenderGlobal.lIIlllllllIIIl[69] = (0x12 ^ 0x36);
        RenderGlobal.lIIlllllllIIIl[70] = (0x16 ^ 0x33);
        RenderGlobal.lIIlllllllIIIl[71] = (26 + 124 - 69 + 58 ^ 111 + 16 - 9 + 55);
        RenderGlobal.lIIlllllllIIIl[72] = (0xA ^ 0x2D);
        RenderGlobal.lIIlllllllIIIl[73] = (0x89 ^ 0xA0);
        RenderGlobal.lIIlllllllIIIl[74] = (0xAA ^ 0x80);
        RenderGlobal.lIIlllllllIIIl[75] = (0x60 ^ 0x4B);
        RenderGlobal.lIIlllllllIIIl[76] = (0x47 ^ 0x7C ^ (0x0 ^ 0x17));
        RenderGlobal.lIIlllllllIIIl[77] = (49 + 154 - 39 + 2 ^ 89 + 90 - 79 + 39);
        RenderGlobal.lIIlllllllIIIl[78] = (0xAE ^ 0x80);
        RenderGlobal.lIIlllllllIIIl[79] = (0x39 ^ 0x14 ^ "  ".length());
        RenderGlobal.lIIlllllllIIIl[80] = (0x92 ^ 0xA2);
        RenderGlobal.lIIlllllllIIIl[81] = (0xA6 ^ 0x97);
        RenderGlobal.lIIlllllllIIIl[82] = (0x6E ^ 0x5C);
        RenderGlobal.lIIlllllllIIIl[83] = (0x70 ^ 0x2E ^ (0xAA ^ 0xC7));
        RenderGlobal.lIIlllllllIIIl[84] = (0x6E ^ 0x4F ^ (0xBB ^ 0xAE));
        RenderGlobal.lIIlllllllIIIl[85] = (0x7B ^ 0x4E);
        RenderGlobal.lIIlllllllIIIl[86] = (0x6 ^ 0x30);
        RenderGlobal.lIIlllllllIIIl[87] = (0x9E ^ 0x96 ^ (0x17 ^ 0x28));
        RenderGlobal.lIIlllllllIIIl[88] = (0x9A ^ 0xA2);
        RenderGlobal.lIIlllllllIIIl[89] = (0xFFFFCFFF & 0x3FFF);
        RenderGlobal.lIIlllllllIIIl[90] = (0xC7 ^ 0xA3);
        RenderGlobal.lIIlllllllIIIl[91] = (0x66 ^ 0x4E ^ (0xAF ^ 0xBE));
        RenderGlobal.lIIlllllllIIIl[92] = (0x4C ^ 0x76);
    }
    
    @Override
    public void playAuxSFX(final EntityPlayer lllllllllllllIIlIIIlIlllllIIlIlI, final int lllllllllllllIIlIIIlIlllllIIlIIl, final BlockPos lllllllllllllIIlIIIlIlllllIIlIII, final int lllllllllllllIIlIIIlIlllllIIIlll) {
        final Random lllllllllllllIIlIIIlIlllllIIIllI = this.theWorld.rand;
        switch (lllllllllllllIIlIIIlIlllllIIlIIl) {
            case 1000: {
                this.theWorld.playSoundAtPos(lllllllllllllIIlIIIlIlllllIIlIII, RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[70]], 1.0f, 1.0f, (boolean)(RenderGlobal.lIIlllllllIIIl[0] != 0));
                "".length();
                if ("   ".length() < " ".length()) {
                    return;
                }
                break;
            }
            case 1001: {
                this.theWorld.playSoundAtPos(lllllllllllllIIlIIIlIlllllIIlIII, RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[71]], 1.0f, 1.2f, (boolean)(RenderGlobal.lIIlllllllIIIl[0] != 0));
                "".length();
                if (-(0xB4 ^ 0xBF ^ (0x6F ^ 0x61)) >= 0) {
                    return;
                }
                break;
            }
            case 1002: {
                this.theWorld.playSoundAtPos(lllllllllllllIIlIIIlIlllllIIlIII, RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[72]], 1.0f, 1.2f, (boolean)(RenderGlobal.lIIlllllllIIIl[0] != 0));
                "".length();
                if ("  ".length() <= -" ".length()) {
                    return;
                }
                break;
            }
            case 1003: {
                this.theWorld.playSoundAtPos(lllllllllllllIIlIIIlIlllllIIlIII, RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[51]], 1.0f, this.theWorld.rand.nextFloat() * 0.1f + 0.9f, (boolean)(RenderGlobal.lIIlllllllIIIl[0] != 0));
                "".length();
                if (" ".length() == "  ".length()) {
                    return;
                }
                break;
            }
            case 1004: {
                this.theWorld.playSoundAtPos(lllllllllllllIIlIIIlIlllllIIlIII, RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[73]], 0.5f, 2.6f + (lllllllllllllIIlIIIlIlllllIIIllI.nextFloat() - lllllllllllllIIlIIIlIlllllIIIllI.nextFloat()) * 0.8f, (boolean)(RenderGlobal.lIIlllllllIIIl[0] != 0));
                "".length();
                if ("  ".length() < 0) {
                    return;
                }
                break;
            }
            case 1005: {
                if (llIlllllIllIlll((Item.getItemById(lllllllllllllIIlIIIlIlllllIIIlll) instanceof ItemRecord) ? 1 : 0)) {
                    this.theWorld.playRecord(lllllllllllllIIlIIIlIlllllIIlIII, String.valueOf(new StringBuilder(RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[74]]).append(((ItemRecord)Item.getItemById(lllllllllllllIIlIIIlIlllllIIIlll)).recordName)));
                    "".length();
                    if (((0x6D ^ 0x3F) & ~(0x38 ^ 0x6A)) < ("  ".length() & ~"  ".length())) {
                        return;
                    }
                    break;
                }
                else {
                    this.theWorld.playRecord(lllllllllllllIIlIIIlIlllllIIlIII, null);
                    "".length();
                    if ("  ".length() <= 0) {
                        return;
                    }
                    break;
                }
                break;
            }
            case 1006: {
                this.theWorld.playSoundAtPos(lllllllllllllIIlIIIlIlllllIIlIII, RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[75]], 1.0f, this.theWorld.rand.nextFloat() * 0.1f + 0.9f, (boolean)(RenderGlobal.lIIlllllllIIIl[0] != 0));
                "".length();
                if (((0x78 ^ 0x44) & ~(0xBB ^ 0x87)) != 0x0) {
                    return;
                }
                break;
            }
            case 1007: {
                this.theWorld.playSoundAtPos(lllllllllllllIIlIIIlIlllllIIlIII, RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[76]], 10.0f, (lllllllllllllIIlIIIlIlllllIIIllI.nextFloat() - lllllllllllllIIlIIIlIlllllIIIllI.nextFloat()) * 0.2f + 1.0f, (boolean)(RenderGlobal.lIIlllllllIIIl[0] != 0));
                "".length();
                if (null != null) {
                    return;
                }
                break;
            }
            case 1008: {
                this.theWorld.playSoundAtPos(lllllllllllllIIlIIIlIlllllIIlIII, RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[77]], 10.0f, (lllllllllllllIIlIIIlIlllllIIIllI.nextFloat() - lllllllllllllIIlIIIlIlllllIIIllI.nextFloat()) * 0.2f + 1.0f, (boolean)(RenderGlobal.lIIlllllllIIIl[0] != 0));
                "".length();
                if ("  ".length() < "  ".length()) {
                    return;
                }
                break;
            }
            case 1009: {
                this.theWorld.playSoundAtPos(lllllllllllllIIlIIIlIlllllIIlIII, RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[78]], 2.0f, (lllllllllllllIIlIIIlIlllllIIIllI.nextFloat() - lllllllllllllIIlIIIlIlllllIIIllI.nextFloat()) * 0.2f + 1.0f, (boolean)(RenderGlobal.lIIlllllllIIIl[0] != 0));
                "".length();
                if ("  ".length() == 0) {
                    return;
                }
                break;
            }
            case 1010: {
                this.theWorld.playSoundAtPos(lllllllllllllIIlIIIlIlllllIIlIII, RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[79]], 2.0f, (lllllllllllllIIlIIIlIlllllIIIllI.nextFloat() - lllllllllllllIIlIIIlIlllllIIIllI.nextFloat()) * 0.2f + 1.0f, (boolean)(RenderGlobal.lIIlllllllIIIl[0] != 0));
                "".length();
                if ("   ".length() == ((0x91 ^ 0xBA) & ~(0xAE ^ 0x85))) {
                    return;
                }
                break;
            }
            case 1011: {
                this.theWorld.playSoundAtPos(lllllllllllllIIlIIIlIlllllIIlIII, RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[80]], 2.0f, (lllllllllllllIIlIIIlIlllllIIIllI.nextFloat() - lllllllllllllIIlIIIlIlllllIIIllI.nextFloat()) * 0.2f + 1.0f, (boolean)(RenderGlobal.lIIlllllllIIIl[0] != 0));
                "".length();
                if (-" ".length() >= 0) {
                    return;
                }
                break;
            }
            case 1012: {
                this.theWorld.playSoundAtPos(lllllllllllllIIlIIIlIlllllIIlIII, RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[81]], 2.0f, (lllllllllllllIIlIIIlIlllllIIIllI.nextFloat() - lllllllllllllIIlIIIlIlllllIIIllI.nextFloat()) * 0.2f + 1.0f, (boolean)(RenderGlobal.lIIlllllllIIIl[0] != 0));
                "".length();
                if ("  ".length() == 0) {
                    return;
                }
                break;
            }
            case 1014: {
                this.theWorld.playSoundAtPos(lllllllllllllIIlIIIlIlllllIIlIII, RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[82]], 2.0f, (lllllllllllllIIlIIIlIlllllIIIllI.nextFloat() - lllllllllllllIIlIIIlIlllllIIIllI.nextFloat()) * 0.2f + 1.0f, (boolean)(RenderGlobal.lIIlllllllIIIl[0] != 0));
                "".length();
                if ((0x2 ^ 0x2D ^ (0x7E ^ 0x55)) < ((0x51 ^ 0x75 ^ (0x9B ^ 0x8B)) & (0xA5 ^ 0x90 ^ " ".length() ^ -" ".length()))) {
                    return;
                }
                break;
            }
            case 1015: {
                this.theWorld.playSoundAtPos(lllllllllllllIIlIIIlIlllllIIlIII, RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[83]], 0.05f, (lllllllllllllIIlIIIlIlllllIIIllI.nextFloat() - lllllllllllllIIlIIIlIlllllIIIllI.nextFloat()) * 0.2f + 1.0f, (boolean)(RenderGlobal.lIIlllllllIIIl[0] != 0));
                "".length();
                if (-" ".length() > 0) {
                    return;
                }
                break;
            }
            case 1016: {
                this.theWorld.playSoundAtPos(lllllllllllllIIlIIIlIlllllIIlIII, RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[84]], 2.0f, (lllllllllllllIIlIIIlIlllllIIIllI.nextFloat() - lllllllllllllIIlIIIlIlllllIIIllI.nextFloat()) * 0.2f + 1.0f, (boolean)(RenderGlobal.lIIlllllllIIIl[0] != 0));
                "".length();
                if ((108 + 149 - 148 + 67 ^ 40 + 139 - 3 + 4) == ((0x25 ^ 0x2F ^ (0x2F ^ 0x37)) & (97 + 164 - 158 + 70 ^ 154 + 82 - 184 + 139 ^ -" ".length()))) {
                    return;
                }
                break;
            }
            case 1017: {
                this.theWorld.playSoundAtPos(lllllllllllllIIlIIIlIlllllIIlIII, RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[85]], 2.0f, (lllllllllllllIIlIIIlIlllllIIIllI.nextFloat() - lllllllllllllIIlIIIlIlllllIIIllI.nextFloat()) * 0.2f + 1.0f, (boolean)(RenderGlobal.lIIlllllllIIIl[0] != 0));
                "".length();
                if (-"   ".length() >= 0) {
                    return;
                }
                break;
            }
            case 1020: {
                this.theWorld.playSoundAtPos(lllllllllllllIIlIIIlIlllllIIlIII, RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[86]], 1.0f, this.theWorld.rand.nextFloat() * 0.1f + 0.9f, (boolean)(RenderGlobal.lIIlllllllIIIl[0] != 0));
                "".length();
                if ((0x4 ^ 0x0) <= "  ".length()) {
                    return;
                }
                break;
            }
            case 1021: {
                this.theWorld.playSoundAtPos(lllllllllllllIIlIIIlIlllllIIlIII, RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[87]], 1.0f, this.theWorld.rand.nextFloat() * 0.1f + 0.9f, (boolean)(RenderGlobal.lIIlllllllIIIl[0] != 0));
                "".length();
                if (" ".length() < 0) {
                    return;
                }
                break;
            }
            case 1022: {
                this.theWorld.playSoundAtPos(lllllllllllllIIlIIIlIlllllIIlIII, RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[88]], 0.3f, this.theWorld.rand.nextFloat() * 0.1f + 0.9f, (boolean)(RenderGlobal.lIIlllllllIIIl[0] != 0));
                "".length();
                if ("   ".length() < 0) {
                    return;
                }
                break;
            }
            case 2000: {
                final int lllllllllllllIIlIIIlIlllllIIIlIl = lllllllllllllIIlIIIlIlllllIIIlll % RenderGlobal.lIIlllllllIIIl[3] - RenderGlobal.lIIlllllllIIIl[1];
                final int lllllllllllllIIlIIIlIlllllIIIlII = lllllllllllllIIlIIIlIlllllIIIlll / RenderGlobal.lIIlllllllIIIl[3] % RenderGlobal.lIIlllllllIIIl[3] - RenderGlobal.lIIlllllllIIIl[1];
                final double lllllllllllllIIlIIIlIlllllIIIIll = lllllllllllllIIlIIIlIlllllIIlIII.getX() + lllllllllllllIIlIIIlIlllllIIIlIl * 0.6 + 0.5;
                final double lllllllllllllIIlIIIlIlllllIIIIlI = lllllllllllllIIlIIIlIlllllIIlIII.getY() + 0.5;
                final double lllllllllllllIIlIIIlIlllllIIIIIl = lllllllllllllIIlIIIlIlllllIIlIII.getZ() + lllllllllllllIIlIIIlIlllllIIIlII * 0.6 + 0.5;
                int lllllllllllllIIlIIIlIlllllIIIIII = RenderGlobal.lIIlllllllIIIl[0];
                "".length();
                if ((0xB1 ^ 0xB5) != (0x3A ^ 0x3E)) {
                    return;
                }
                while (!llIlllllIlllIII(lllllllllllllIIlIIIlIlllllIIIIII, RenderGlobal.lIIlllllllIIIl[7])) {
                    final double lllllllllllllIIlIIIlIllllIllllll = lllllllllllllIIlIIIlIlllllIIIllI.nextDouble() * 0.2 + 0.01;
                    final double lllllllllllllIIlIIIlIllllIlllllI = lllllllllllllIIlIIIlIlllllIIIIll + lllllllllllllIIlIIIlIlllllIIIlIl * 0.01 + (lllllllllllllIIlIIIlIlllllIIIllI.nextDouble() - 0.5) * lllllllllllllIIlIIIlIlllllIIIlII * 0.5;
                    final double lllllllllllllIIlIIIlIllllIllllIl = lllllllllllllIIlIIIlIlllllIIIIlI + (lllllllllllllIIlIIIlIlllllIIIllI.nextDouble() - 0.5) * 0.5;
                    final double lllllllllllllIIlIIIlIllllIllllII = lllllllllllllIIlIIIlIlllllIIIIIl + lllllllllllllIIlIIIlIlllllIIIlII * 0.01 + (lllllllllllllIIlIIIlIlllllIIIllI.nextDouble() - 0.5) * lllllllllllllIIlIIIlIlllllIIIlIl * 0.5;
                    final double lllllllllllllIIlIIIlIllllIlllIll = lllllllllllllIIlIIIlIlllllIIIlIl * lllllllllllllIIlIIIlIllllIllllll + lllllllllllllIIlIIIlIlllllIIIllI.nextGaussian() * 0.01;
                    final double lllllllllllllIIlIIIlIllllIlllIlI = -0.03 + lllllllllllllIIlIIIlIlllllIIIllI.nextGaussian() * 0.01;
                    final double lllllllllllllIIlIIIlIllllIlllIIl = lllllllllllllIIlIIIlIlllllIIIlII * lllllllllllllIIlIIIlIllllIllllll + lllllllllllllIIlIIIlIlllllIIIllI.nextGaussian() * 0.01;
                    this.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, lllllllllllllIIlIIIlIllllIlllllI, lllllllllllllIIlIIIlIllllIllllIl, lllllllllllllIIlIIIlIllllIllllII, lllllllllllllIIlIIIlIllllIlllIll, lllllllllllllIIlIIIlIllllIlllIlI, lllllllllllllIIlIIIlIllllIlllIIl, new int[RenderGlobal.lIIlllllllIIIl[0]]);
                    ++lllllllllllllIIlIIIlIlllllIIIIII;
                }
            }
            case 2001: {
                final Block lllllllllllllIIlIIIlIllllIlllIII = Block.getBlockById(lllllllllllllIIlIIIlIlllllIIIlll & RenderGlobal.lIIlllllllIIIl[89]);
                if (llIllllllIIIllI(lllllllllllllIIlIIIlIllllIlllIII.getMaterial(), Material.air)) {
                    this.mc.getSoundHandler().playSound(new PositionedSoundRecord(new ResourceLocation(lllllllllllllIIlIIIlIllllIlllIII.stepSound.getBreakSound()), (lllllllllllllIIlIIIlIllllIlllIII.stepSound.getVolume() + 1.0f) / 2.0f, lllllllllllllIIlIIIlIllllIlllIII.stepSound.getFrequency() * 0.8f, lllllllllllllIIlIIIlIlllllIIlIII.getX() + 0.5f, lllllllllllllIIlIIIlIlllllIIlIII.getY() + 0.5f, lllllllllllllIIlIIIlIlllllIIlIII.getZ() + 0.5f));
                }
                this.mc.effectRenderer.addBlockDestroyEffects(lllllllllllllIIlIIIlIlllllIIlIII, lllllllllllllIIlIIIlIllllIlllIII.getStateFromMeta(lllllllllllllIIlIIIlIlllllIIIlll >> RenderGlobal.lIIlllllllIIIl[26] & RenderGlobal.lIIlllllllIIIl[52]));
                "".length();
                if (((0x28 ^ 0xA) & ~(0x1E ^ 0x3C)) != ((0x24 ^ 0x47) & ~(0x17 ^ 0x74))) {
                    return;
                }
                break;
            }
            case 2002: {
                final double lllllllllllllIIlIIIlIllllIllIlll = lllllllllllllIIlIIIlIlllllIIlIII.getX();
                final double lllllllllllllIIlIIIlIllllIllIllI = lllllllllllllIIlIIIlIlllllIIlIII.getY();
                final double lllllllllllllIIlIIIlIllllIllIlIl = lllllllllllllIIlIIIlIlllllIIlIII.getZ();
                int lllllllllllllIIlIIIlIllllIllIlII = RenderGlobal.lIIlllllllIIIl[0];
                "".length();
                if ("   ".length() < 0) {
                    return;
                }
                while (!llIlllllIlllIII(lllllllllllllIIlIIIlIllllIllIlII, RenderGlobal.lIIlllllllIIIl[8])) {
                    final EnumParticleTypes item_CRACK = EnumParticleTypes.ITEM_CRACK;
                    final double lllllllllllllIIlIIIllIIIIlIIlIlI = lllllllllllllIIlIIIlIllllIllIlll;
                    final double lllllllllllllIIlIIIllIIIIlIIIIII = lllllllllllllIIlIIIlIllllIllIllI;
                    final double lllllllllllllIIlIIIllIIIIIllllll = lllllllllllllIIlIIIlIllllIllIlIl;
                    final double lllllllllllllIIlIIIllIIIIlIIIlll = lllllllllllllIIlIIIlIlllllIIIllI.nextGaussian() * 0.15;
                    final double lllllllllllllIIlIIIllIIIIlIIIllI = lllllllllllllIIlIIIlIlllllIIIllI.nextDouble() * 0.2;
                    final double lllllllllllllIIlIIIllIIIIIllllII = lllllllllllllIIlIIIlIlllllIIIllI.nextGaussian() * 0.15;
                    final int[] lllllllllllllIIlIIIllIIIIIlllIll = new int[RenderGlobal.lIIlllllllIIIl[2]];
                    lllllllllllllIIlIIIllIIIIIlllIll[RenderGlobal.lIIlllllllIIIl[0]] = Item.getIdFromItem(Items.potionitem);
                    lllllllllllllIIlIIIllIIIIIlllIll[RenderGlobal.lIIlllllllIIIl[1]] = lllllllllllllIIlIIIlIlllllIIIlll;
                    this.spawnParticle(item_CRACK, lllllllllllllIIlIIIllIIIIlIIlIlI, lllllllllllllIIlIIIllIIIIlIIIIII, lllllllllllllIIlIIIllIIIIIllllll, lllllllllllllIIlIIIllIIIIlIIIlll, lllllllllllllIIlIIIllIIIIlIIIllI, lllllllllllllIIlIIIllIIIIIllllII, lllllllllllllIIlIIIllIIIIIlllIll);
                    ++lllllllllllllIIlIIIlIllllIllIlII;
                }
                final int lllllllllllllIIlIIIlIllllIllIIll = Items.potionitem.getColorFromDamage(lllllllllllllIIlIIIlIlllllIIIlll);
                final float lllllllllllllIIlIIIlIllllIllIIlI = (lllllllllllllIIlIIIlIllllIllIIll >> RenderGlobal.lIIlllllllIIIl[29] & RenderGlobal.lIIlllllllIIIl[52]) / 255.0f;
                final float lllllllllllllIIlIIIlIllllIllIIIl = (lllllllllllllIIlIIIlIllllIllIIll >> RenderGlobal.lIIlllllllIIIl[8] & RenderGlobal.lIIlllllllIIIl[52]) / 255.0f;
                final float lllllllllllllIIlIIIlIllllIllIIII = (lllllllllllllIIlIIIlIllllIllIIll >> RenderGlobal.lIIlllllllIIIl[0] & RenderGlobal.lIIlllllllIIIl[52]) / 255.0f;
                EnumParticleTypes lllllllllllllIIlIIIlIllllIlIllll = EnumParticleTypes.SPELL;
                if (llIlllllIllIlll(Items.potionitem.isEffectInstant(lllllllllllllIIlIIIlIlllllIIIlll) ? 1 : 0)) {
                    lllllllllllllIIlIIIlIllllIlIllll = EnumParticleTypes.SPELL_INSTANT;
                }
                int lllllllllllllIIlIIIlIllllIlIlllI = RenderGlobal.lIIlllllllIIIl[0];
                "".length();
                if (-" ".length() > " ".length()) {
                    return;
                }
                while (!llIlllllIlllIII(lllllllllllllIIlIIIlIllllIlIlllI, RenderGlobal.lIIlllllllIIIl[90])) {
                    final double lllllllllllllIIlIIIlIllllIlIllIl = lllllllllllllIIlIIIlIlllllIIIllI.nextDouble() * 4.0;
                    final double lllllllllllllIIlIIIlIllllIlIllII = lllllllllllllIIlIIIlIlllllIIIllI.nextDouble() * 3.141592653589793 * 2.0;
                    final double lllllllllllllIIlIIIlIllllIlIlIll = Math.cos(lllllllllllllIIlIIIlIllllIlIllII) * lllllllllllllIIlIIIlIllllIlIllIl;
                    final double lllllllllllllIIlIIIlIllllIlIlIlI = 0.01 + lllllllllllllIIlIIIlIlllllIIIllI.nextDouble() * 0.5;
                    final double lllllllllllllIIlIIIlIllllIlIlIIl = Math.sin(lllllllllllllIIlIIIlIllllIlIllII) * lllllllllllllIIlIIIlIllllIlIllIl;
                    final EntityFX lllllllllllllIIlIIIlIllllIlIlIII = this.spawnEntityFX(lllllllllllllIIlIIIlIllllIlIllll.getParticleID(), lllllllllllllIIlIIIlIllllIlIllll.getShouldIgnoreRange(), lllllllllllllIIlIIIlIllllIllIlll + lllllllllllllIIlIIIlIllllIlIlIll * 0.1, lllllllllllllIIlIIIlIllllIllIllI + 0.3, lllllllllllllIIlIIIlIllllIllIlIl + lllllllllllllIIlIIIlIllllIlIlIIl * 0.1, lllllllllllllIIlIIIlIllllIlIlIll, lllllllllllllIIlIIIlIllllIlIlIlI, lllllllllllllIIlIIIlIllllIlIlIIl, new int[RenderGlobal.lIIlllllllIIIl[0]]);
                    if (llIlllllIlllIlI(lllllllllllllIIlIIIlIllllIlIlIII)) {
                        final float lllllllllllllIIlIIIlIllllIlIIlll = 0.75f + lllllllllllllIIlIIIlIlllllIIIllI.nextFloat() * 0.25f;
                        lllllllllllllIIlIIIlIllllIlIlIII.setRBGColorF(lllllllllllllIIlIIIlIllllIllIIlI * lllllllllllllIIlIIIlIllllIlIIlll, lllllllllllllIIlIIIlIllllIllIIIl * lllllllllllllIIlIIIlIllllIlIIlll, lllllllllllllIIlIIIlIllllIllIIII * lllllllllllllIIlIIIlIllllIlIIlll);
                        lllllllllllllIIlIIIlIllllIlIlIII.multiplyVelocity((float)lllllllllllllIIlIIIlIllllIlIllIl);
                        "".length();
                    }
                    ++lllllllllllllIIlIIIlIllllIlIlllI;
                }
                this.theWorld.playSoundAtPos(lllllllllllllIIlIIIlIlllllIIlIII, RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[91]], 1.0f, this.theWorld.rand.nextFloat() * 0.1f + 0.9f, (boolean)(RenderGlobal.lIIlllllllIIIl[0] != 0));
                "".length();
                if (-" ".length() != -" ".length()) {
                    return;
                }
                break;
            }
            case 2003: {
                final double lllllllllllllIIlIIIlIllllIlIIllI = lllllllllllllIIlIIIlIlllllIIlIII.getX() + 0.5;
                final double lllllllllllllIIlIIIlIllllIlIIlIl = lllllllllllllIIlIIIlIlllllIIlIII.getY();
                final double lllllllllllllIIlIIIlIllllIlIIlII = lllllllllllllIIlIIIlIlllllIIlIII.getZ() + 0.5;
                int lllllllllllllIIlIIIlIllllIlIIIll = RenderGlobal.lIIlllllllIIIl[0];
                "".length();
                if (((0xB ^ 0x5) & ~(0x2C ^ 0x22)) != ((0x90 ^ 0xA1) & ~(0x1A ^ 0x2B))) {
                    return;
                }
                while (!llIlllllIlllIII(lllllllllllllIIlIIIlIllllIlIIIll, RenderGlobal.lIIlllllllIIIl[8])) {
                    final EnumParticleTypes item_CRACK2 = EnumParticleTypes.ITEM_CRACK;
                    final double lllllllllllllIIlIIIllIIIIlIIlIlI2 = lllllllllllllIIlIIIlIllllIlIIllI;
                    final double lllllllllllllIIlIIIllIIIIlIIIIII2 = lllllllllllllIIlIIIlIllllIlIIlIl;
                    final double lllllllllllllIIlIIIllIIIIIllllll2 = lllllllllllllIIlIIIlIllllIlIIlII;
                    final double lllllllllllllIIlIIIllIIIIlIIIlll2 = lllllllllllllIIlIIIlIlllllIIIllI.nextGaussian() * 0.15;
                    final double lllllllllllllIIlIIIllIIIIlIIIllI2 = lllllllllllllIIlIIIlIlllllIIIllI.nextDouble() * 0.2;
                    final double lllllllllllllIIlIIIllIIIIIllllII2 = lllllllllllllIIlIIIlIlllllIIIllI.nextGaussian() * 0.15;
                    final int[] lllllllllllllIIlIIIllIIIIIlllIll2 = new int[RenderGlobal.lIIlllllllIIIl[1]];
                    lllllllllllllIIlIIIllIIIIIlllIll2[RenderGlobal.lIIlllllllIIIl[0]] = Item.getIdFromItem(Items.ender_eye);
                    this.spawnParticle(item_CRACK2, lllllllllllllIIlIIIllIIIIlIIlIlI2, lllllllllllllIIlIIIllIIIIlIIIIII2, lllllllllllllIIlIIIllIIIIIllllll2, lllllllllllllIIlIIIllIIIIlIIIlll2, lllllllllllllIIlIIIllIIIIlIIIllI2, lllllllllllllIIlIIIllIIIIIllllII2, lllllllllllllIIlIIIllIIIIIlllIll2);
                    ++lllllllllllllIIlIIIlIllllIlIIIll;
                }
                double lllllllllllllIIlIIIlIllllIlIIIlI = 0.0;
                "".length();
                if ("  ".length() > "  ".length()) {
                    return;
                }
                while (!llIlllllIlllIll(llIllllllIllIll(lllllllllllllIIlIIIlIllllIlIIIlI, 6.283185307179586))) {
                    this.spawnParticle(EnumParticleTypes.PORTAL, lllllllllllllIIlIIIlIllllIlIIllI + Math.cos(lllllllllllllIIlIIIlIllllIlIIIlI) * 5.0, lllllllllllllIIlIIIlIllllIlIIlIl - 0.4, lllllllllllllIIlIIIlIllllIlIIlII + Math.sin(lllllllllllllIIlIIIlIllllIlIIIlI) * 5.0, Math.cos(lllllllllllllIIlIIIlIllllIlIIIlI) * -5.0, 0.0, Math.sin(lllllllllllllIIlIIIlIllllIlIIIlI) * -5.0, new int[RenderGlobal.lIIlllllllIIIl[0]]);
                    this.spawnParticle(EnumParticleTypes.PORTAL, lllllllllllllIIlIIIlIllllIlIIllI + Math.cos(lllllllllllllIIlIIIlIllllIlIIIlI) * 5.0, lllllllllllllIIlIIIlIllllIlIIlIl - 0.4, lllllllllllllIIlIIIlIllllIlIIlII + Math.sin(lllllllllllllIIlIIIlIllllIlIIIlI) * 5.0, Math.cos(lllllllllllllIIlIIIlIllllIlIIIlI) * -7.0, 0.0, Math.sin(lllllllllllllIIlIIIlIllllIlIIIlI) * -7.0, new int[RenderGlobal.lIIlllllllIIIl[0]]);
                    lllllllllllllIIlIIIlIllllIlIIIlI += 0.15707963267948966;
                }
            }
            case 2004: {
                int lllllllllllllIIlIIIlIllllIlIIIIl = RenderGlobal.lIIlllllllIIIl[0];
                "".length();
                if (-(0x85 ^ 0x80) >= 0) {
                    return;
                }
                while (!llIlllllIlllIII(lllllllllllllIIlIIIlIllllIlIIIIl, RenderGlobal.lIIlllllllIIIl[35])) {
                    final double lllllllllllllIIlIIIlIllllIlIIIII = lllllllllllllIIlIIIlIlllllIIlIII.getX() + 0.5 + (this.theWorld.rand.nextFloat() - 0.5) * 2.0;
                    final double lllllllllllllIIlIIIlIllllIIlllll = lllllllllllllIIlIIIlIlllllIIlIII.getY() + 0.5 + (this.theWorld.rand.nextFloat() - 0.5) * 2.0;
                    final double lllllllllllllIIlIIIlIllllIIllllI = lllllllllllllIIlIIIlIlllllIIlIII.getZ() + 0.5 + (this.theWorld.rand.nextFloat() - 0.5) * 2.0;
                    this.theWorld.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, lllllllllllllIIlIIIlIllllIlIIIII, lllllllllllllIIlIIIlIllllIIlllll, lllllllllllllIIlIIIlIllllIIllllI, 0.0, 0.0, 0.0, new int[RenderGlobal.lIIlllllllIIIl[0]]);
                    this.theWorld.spawnParticle(EnumParticleTypes.FLAME, lllllllllllllIIlIIIlIllllIlIIIII, lllllllllllllIIlIIIlIllllIIlllll, lllllllllllllIIlIIIlIllllIIllllI, 0.0, 0.0, 0.0, new int[RenderGlobal.lIIlllllllIIIl[0]]);
                    ++lllllllllllllIIlIIIlIllllIlIIIIl;
                }
            }
            case 2005: {
                ItemDye.spawnBonemealParticles(this.theWorld, lllllllllllllIIlIIIlIlllllIIlIII, lllllllllllllIIlIIIlIlllllIIIlll);
                break;
            }
        }
    }
    
    public void deleteAllDisplayLists() {
    }
    
    public void setupTerrain(final Entity lllllllllllllIIlIIIlllIIIIIlllIl, final double lllllllllllllIIlIIIllIllllllIllI, ICamera lllllllllllllIIlIIIllIllllllIlIl, final int lllllllllllllIIlIIIllIllllllIlII, final boolean lllllllllllllIIlIIIllIllllllIIll) {
        if (llIllllllIIIIlI(this.mc.gameSettings.renderDistanceChunks, this.renderDistanceChunks)) {
            this.loadRenderers();
        }
        this.theWorld.theProfiler.startSection(RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[37]]);
        final double lllllllllllllIIlIIIlllIIIIIllIII = lllllllllllllIIlIIIlllIIIIIlllIl.posX - this.frustumUpdatePosX;
        final double lllllllllllllIIlIIIlllIIIIIlIlll = lllllllllllllIIlIIIlllIIIIIlllIl.posY - this.frustumUpdatePosY;
        final double lllllllllllllIIlIIIlllIIIIIlIllI = lllllllllllllIIlIIIlllIIIIIlllIl.posZ - this.frustumUpdatePosZ;
        if (!llIllllllIIlIII(this.frustumUpdatePosChunkX, lllllllllllllIIlIIIlllIIIIIlllIl.chunkCoordX) || !llIllllllIIlIII(this.frustumUpdatePosChunkY, lllllllllllllIIlIIIlllIIIIIlllIl.chunkCoordY) || !llIllllllIIlIII(this.frustumUpdatePosChunkZ, lllllllllllllIIlIIIlllIIIIIlllIl.chunkCoordZ) || llIllllllIIIIII(llIllllllIIIlll(lllllllllllllIIlIIIlllIIIIIllIII * lllllllllllllIIlIIIlllIIIIIllIII + lllllllllllllIIlIIIlllIIIIIlIlll * lllllllllllllIIlIIIlllIIIIIlIlll + lllllllllllllIIlIIIlllIIIIIlIllI * lllllllllllllIIlIIIlllIIIIIlIllI, 16.0))) {
            this.frustumUpdatePosX = lllllllllllllIIlIIIlllIIIIIlllIl.posX;
            this.frustumUpdatePosY = lllllllllllllIIlIIIlllIIIIIlllIl.posY;
            this.frustumUpdatePosZ = lllllllllllllIIlIIIlllIIIIIlllIl.posZ;
            this.frustumUpdatePosChunkX = lllllllllllllIIlIIIlllIIIIIlllIl.chunkCoordX;
            this.frustumUpdatePosChunkY = lllllllllllllIIlIIIlllIIIIIlllIl.chunkCoordY;
            this.frustumUpdatePosChunkZ = lllllllllllllIIlIIIlllIIIIIlllIl.chunkCoordZ;
            this.viewFrustum.updateChunkPositions(lllllllllllllIIlIIIlllIIIIIlllIl.posX, lllllllllllllIIlIIIlllIIIIIlllIl.posZ);
        }
        this.theWorld.theProfiler.endStartSection(RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[38]]);
        final double lllllllllllllIIlIIIlllIIIIIlIlIl = lllllllllllllIIlIIIlllIIIIIlllIl.lastTickPosX + (lllllllllllllIIlIIIlllIIIIIlllIl.posX - lllllllllllllIIlIIIlllIIIIIlllIl.lastTickPosX) * lllllllllllllIIlIIIllIllllllIllI;
        final double lllllllllllllIIlIIIlllIIIIIlIlII = lllllllllllllIIlIIIlllIIIIIlllIl.lastTickPosY + (lllllllllllllIIlIIIlllIIIIIlllIl.posY - lllllllllllllIIlIIIlllIIIIIlllIl.lastTickPosY) * lllllllllllllIIlIIIllIllllllIllI;
        final double lllllllllllllIIlIIIlllIIIIIlIIll = lllllllllllllIIlIIIlllIIIIIlllIl.lastTickPosZ + (lllllllllllllIIlIIIlllIIIIIlllIl.posZ - lllllllllllllIIlIIIlllIIIIIlllIl.lastTickPosZ) * lllllllllllllIIlIIIllIllllllIllI;
        this.renderContainer.initialize(lllllllllllllIIlIIIlllIIIIIlIlIl, lllllllllllllIIlIIIlllIIIIIlIlII, lllllllllllllIIlIIIlllIIIIIlIIll);
        this.theWorld.theProfiler.endStartSection(RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[39]]);
        if (llIlllllIlllIlI(this.debugFixedClippingHelper)) {
            final Frustum lllllllllllllIIlIIIlllIIIIIlIIlI = new Frustum(this.debugFixedClippingHelper);
            lllllllllllllIIlIIIlllIIIIIlIIlI.setPosition(this.debugTerrainFrustumPosition.field_181059_a, this.debugTerrainFrustumPosition.field_181060_b, this.debugTerrainFrustumPosition.field_181061_c);
            lllllllllllllIIlIIIllIllllllIlIl = lllllllllllllIIlIIIlllIIIIIlIIlI;
        }
        this.mc.mcProfiler.endStartSection(RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[40]]);
        final BlockPos lllllllllllllIIlIIIlllIIIIIlIIIl = new BlockPos(lllllllllllllIIlIIIlllIIIIIlIlIl, lllllllllllllIIlIIIlllIIIIIlIlII + lllllllllllllIIlIIIlllIIIIIlllIl.getEyeHeight(), lllllllllllllIIlIIIlllIIIIIlIIll);
        final RenderChunk lllllllllllllIIlIIIlllIIIIIlIIII = this.viewFrustum.getRenderChunk(lllllllllllllIIlIIIlllIIIIIlIIIl);
        final BlockPos lllllllllllllIIlIIIlllIIIIIIllll = new BlockPos(MathHelper.floor_double(lllllllllllllIIlIIIlllIIIIIlIlIl / 16.0) * RenderGlobal.lIIlllllllIIIl[29], MathHelper.floor_double(lllllllllllllIIlIIIlllIIIIIlIlII / 16.0) * RenderGlobal.lIIlllllllIIIl[29], MathHelper.floor_double(lllllllllllllIIlIIIlllIIIIIlIIll / 16.0) * RenderGlobal.lIIlllllllIIIl[29]);
        int displayListEntitiesDirty;
        if (llIllllllIIIIIl(this.displayListEntitiesDirty ? 1 : 0) && llIlllllIllIlll(this.chunksToUpdate.isEmpty() ? 1 : 0) && llIllllllIIIIIl(llIllllllIIIlll(lllllllllllllIIlIIIlllIIIIIlllIl.posX, this.lastViewEntityX)) && llIllllllIIIIIl(llIllllllIIIlll(lllllllllllllIIlIIIlllIIIIIlllIl.posY, this.lastViewEntityY)) && llIllllllIIIIIl(llIllllllIIIlll(lllllllllllllIIlIIIlllIIIIIlllIl.posZ, this.lastViewEntityZ)) && llIllllllIIIIIl(llIllllllIIIlll(lllllllllllllIIlIIIlllIIIIIlllIl.rotationPitch, this.lastViewEntityPitch)) && llIllllllIIIIIl(llIllllllIIIlll(lllllllllllllIIlIIIlllIIIIIlllIl.rotationYaw, this.lastViewEntityYaw))) {
            displayListEntitiesDirty = RenderGlobal.lIIlllllllIIIl[0];
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            displayListEntitiesDirty = RenderGlobal.lIIlllllllIIIl[1];
        }
        this.displayListEntitiesDirty = (displayListEntitiesDirty != 0);
        this.lastViewEntityX = lllllllllllllIIlIIIlllIIIIIlllIl.posX;
        this.lastViewEntityY = lllllllllllllIIlIIIlllIIIIIlllIl.posY;
        this.lastViewEntityZ = lllllllllllllIIlIIIlllIIIIIlllIl.posZ;
        this.lastViewEntityPitch = lllllllllllllIIlIIIlllIIIIIlllIl.rotationPitch;
        this.lastViewEntityYaw = lllllllllllllIIlIIIlllIIIIIlllIl.rotationYaw;
        int n;
        if (llIlllllIlllIlI(this.debugFixedClippingHelper)) {
            n = RenderGlobal.lIIlllllllIIIl[1];
            "".length();
            if (" ".length() == "  ".length()) {
                return;
            }
        }
        else {
            n = RenderGlobal.lIIlllllllIIIl[0];
        }
        final boolean lllllllllllllIIlIIIlllIIIIIIlllI = n != 0;
        if (llIllllllIIIIIl(lllllllllllllIIlIIIlllIIIIIIlllI ? 1 : 0) && llIlllllIllIlll(this.displayListEntitiesDirty ? 1 : 0)) {
            this.displayListEntitiesDirty = (RenderGlobal.lIIlllllllIIIl[0] != 0);
            this.renderInfos = (List<ContainerLocalRenderInformation>)Lists.newArrayList();
            final Queue<ContainerLocalRenderInformation> lllllllllllllIIlIIIlllIIIIIIllIl = (Queue<ContainerLocalRenderInformation>)Lists.newLinkedList();
            boolean lllllllllllllIIlIIIlllIIIIIIllII = this.mc.renderChunksMany;
            if (llIlllllIlllIlI(lllllllllllllIIlIIIlllIIIIIlIIII)) {
                boolean lllllllllllllIIlIIIlllIIIIIIlIll = RenderGlobal.lIIlllllllIIIl[0] != 0;
                final ContainerLocalRenderInformation lllllllllllllIIlIIIlllIIIIIIlIlI = new ContainerLocalRenderInformation(lllllllllllllIIlIIIlllIIIIIlIIII, (EnumFacing)null, RenderGlobal.lIIlllllllIIIl[0], (ContainerLocalRenderInformation)null);
                final Set<EnumFacing> lllllllllllllIIlIIIlllIIIIIIlIIl = this.getVisibleFacings(lllllllllllllIIlIIIlllIIIIIlIIIl);
                if (llIllllllIIlIII(lllllllllllllIIlIIIlllIIIIIIlIIl.size(), RenderGlobal.lIIlllllllIIIl[1])) {
                    final Vector3f lllllllllllllIIlIIIlllIIIIIIlIII = this.getViewVector(lllllllllllllIIlIIIlllIIIIIlllIl, lllllllllllllIIlIIIllIllllllIllI);
                    final EnumFacing lllllllllllllIIlIIIlllIIIIIIIlll = EnumFacing.getFacingFromVector(lllllllllllllIIlIIIlllIIIIIIlIII.x, lllllllllllllIIlIIIlllIIIIIIlIII.y, lllllllllllllIIlIIIlllIIIIIIlIII.z).getOpposite();
                    lllllllllllllIIlIIIlllIIIIIIlIIl.remove(lllllllllllllIIlIIIlllIIIIIIIlll);
                    "".length();
                }
                if (llIlllllIllIlll(lllllllllllllIIlIIIlllIIIIIIlIIl.isEmpty() ? 1 : 0)) {
                    lllllllllllllIIlIIIlllIIIIIIlIll = (RenderGlobal.lIIlllllllIIIl[1] != 0);
                }
                if (llIlllllIllIlll(lllllllllllllIIlIIIlllIIIIIIlIll ? 1 : 0) && llIllllllIIIIIl(lllllllllllllIIlIIIllIllllllIIll ? 1 : 0)) {
                    this.renderInfos.add(lllllllllllllIIlIIIlllIIIIIIlIlI);
                    "".length();
                    "".length();
                    if (((114 + 131 - 102 + 96 ^ 111 + 48 - 112 + 135) & (0x39 ^ 0x7F ^ (0x95 ^ 0x8A) ^ -" ".length())) != ((71 + 49 - 31 + 63 ^ 145 + 155 - 283 + 171) & (62 + 7 + 1 + 160 ^ 73 + 163 - 224 + 182 ^ -" ".length()))) {
                        return;
                    }
                }
                else {
                    if (llIlllllIllIlll(lllllllllllllIIlIIIllIllllllIIll ? 1 : 0) && llIlllllIllIlll(this.theWorld.getBlockState(lllllllllllllIIlIIIlllIIIIIlIIIl).getBlock().isOpaqueCube() ? 1 : 0)) {
                        lllllllllllllIIlIIIlllIIIIIIllII = (RenderGlobal.lIIlllllllIIIl[0] != 0);
                    }
                    lllllllllllllIIlIIIlllIIIIIlIIII.setFrameIndex(lllllllllllllIIlIIIllIllllllIlII);
                    "".length();
                    lllllllllllllIIlIIIlllIIIIIIllIl.add(lllllllllllllIIlIIIlllIIIIIIlIlI);
                    "".length();
                    "".length();
                    if ((65 + 79 - 62 + 53 ^ 89 + 44 - 73 + 70) == 0x0) {
                        return;
                    }
                }
            }
            else {
                int n2;
                if (llIllllllIIIIII(lllllllllllllIIlIIIlllIIIIIlIIIl.getY())) {
                    n2 = RenderGlobal.lIIlllllllIIIl[41];
                    "".length();
                    if (-(0x6D ^ 0x69) >= 0) {
                        return;
                    }
                }
                else {
                    n2 = RenderGlobal.lIIlllllllIIIl[8];
                }
                final int lllllllllllllIIlIIIlllIIIIIIIllI = n2;
                int lllllllllllllIIlIIIlllIIIIIIIlIl = -this.renderDistanceChunks;
                "".length();
                if (" ".length() == 0) {
                    return;
                }
                while (!llIlllllIllllII(lllllllllllllIIlIIIlllIIIIIIIlIl, this.renderDistanceChunks)) {
                    int lllllllllllllIIlIIIlllIIIIIIIlII = -this.renderDistanceChunks;
                    "".length();
                    if (-" ".length() > 0) {
                        return;
                    }
                    while (!llIlllllIllllII(lllllllllllllIIlIIIlllIIIIIIIlII, this.renderDistanceChunks)) {
                        final RenderChunk lllllllllllllIIlIIIlllIIIIIIIIll = this.viewFrustum.getRenderChunk(new BlockPos((lllllllllllllIIlIIIlllIIIIIIIlIl << RenderGlobal.lIIlllllllIIIl[4]) + RenderGlobal.lIIlllllllIIIl[8], lllllllllllllIIlIIIlllIIIIIIIllI, (lllllllllllllIIlIIIlllIIIIIIIlII << RenderGlobal.lIIlllllllIIIl[4]) + RenderGlobal.lIIlllllllIIIl[8]));
                        if (llIlllllIlllIlI(lllllllllllllIIlIIIlllIIIIIIIIll) && llIlllllIllIlll(lllllllllllllIIlIIIllIllllllIlIl.isBoundingBoxInFrustum(lllllllllllllIIlIIIlllIIIIIIIIll.boundingBox) ? 1 : 0)) {
                            lllllllllllllIIlIIIlllIIIIIIIIll.setFrameIndex(lllllllllllllIIlIIIllIllllllIlII);
                            "".length();
                            lllllllllllllIIlIIIlllIIIIIIllIl.add(new ContainerLocalRenderInformation(lllllllllllllIIlIIIlllIIIIIIIIll, (EnumFacing)null, RenderGlobal.lIIlllllllIIIl[0], (ContainerLocalRenderInformation)null));
                            "".length();
                        }
                        ++lllllllllllllIIlIIIlllIIIIIIIlII;
                    }
                    ++lllllllllllllIIlIIIlllIIIIIIIlIl;
                }
                "".length();
                if (" ".length() >= "  ".length()) {
                    return;
                }
            }
            while (!llIlllllIllIlll(lllllllllllllIIlIIIlllIIIIIIllIl.isEmpty() ? 1 : 0)) {
                final ContainerLocalRenderInformation lllllllllllllIIlIIIlllIIIIIIIIlI = lllllllllllllIIlIIIlllIIIIIIllIl.poll();
                final RenderChunk lllllllllllllIIlIIIlllIIIIIIIIIl = lllllllllllllIIlIIIlllIIIIIIIIlI.renderChunk;
                final EnumFacing lllllllllllllIIlIIIlllIIIIIIIIII = lllllllllllllIIlIIIlllIIIIIIIIlI.facing;
                final BlockPos lllllllllllllIIlIIIllIllllllllll = lllllllllllllIIlIIIlllIIIIIIIIIl.getPosition();
                this.renderInfos.add(lllllllllllllIIlIIIlllIIIIIIIIlI);
                "".length();
                final boolean lllllllllllllIIlIIIllIllllIlllll;
                final long lllllllllllllIIlIIIllIlllllIIIII = ((EnumFacing[])(Object)(lllllllllllllIIlIIIllIllllIlllll = (boolean)(Object)EnumFacing.values())).length;
                boolean lllllllllllllIIlIIIllIlllllIIIIl = RenderGlobal.lIIlllllllIIIl[0] != 0;
                "".length();
                if ("  ".length() >= (0x70 ^ 0x74)) {
                    return;
                }
                while (!llIlllllIlllIII(lllllllllllllIIlIIIllIlllllIIIIl ? 1 : 0, (int)lllllllllllllIIlIIIllIlllllIIIII)) {
                    final EnumFacing lllllllllllllIIlIIIllIlllllllllI = lllllllllllllIIlIIIllIllllIlllll[lllllllllllllIIlIIIllIlllllIIIIl];
                    final RenderChunk lllllllllllllIIlIIIllIllllllllIl = this.func_181562_a(lllllllllllllIIlIIIlllIIIIIIllll, lllllllllllllIIlIIIlllIIIIIIIIIl, lllllllllllllIIlIIIllIlllllllllI);
                    if ((!llIlllllIllIlll(lllllllllllllIIlIIIlllIIIIIIllII ? 1 : 0) || llIllllllIIIIIl(lllllllllllllIIlIIIlllIIIIIIIIlI.setFacing.contains(lllllllllllllIIlIIIllIlllllllllI.getOpposite()) ? 1 : 0)) && (!llIlllllIllIlll(lllllllllllllIIlIIIlllIIIIIIllII ? 1 : 0) || !llIlllllIlllIlI(lllllllllllllIIlIIIlllIIIIIIIIII) || llIlllllIllIlll(lllllllllllllIIlIIIlllIIIIIIIIIl.getCompiledChunk().isVisible(lllllllllllllIIlIIIlllIIIIIIIIII.getOpposite(), lllllllllllllIIlIIIllIlllllllllI) ? 1 : 0)) && llIlllllIlllIlI(lllllllllllllIIlIIIllIllllllllIl) && llIlllllIllIlll(lllllllllllllIIlIIIllIllllllllIl.setFrameIndex(lllllllllllllIIlIIIllIllllllIlII) ? 1 : 0) && llIlllllIllIlll(lllllllllllllIIlIIIllIllllllIlIl.isBoundingBoxInFrustum(lllllllllllllIIlIIIllIllllllllIl.boundingBox) ? 1 : 0)) {
                        final ContainerLocalRenderInformation lllllllllllllIIlIIIllIllllllllII = new ContainerLocalRenderInformation(lllllllllllllIIlIIIllIllllllllIl, lllllllllllllIIlIIIllIlllllllllI, lllllllllllllIIlIIIlllIIIIIIIIlI.counter + RenderGlobal.lIIlllllllIIIl[1], (ContainerLocalRenderInformation)null);
                        lllllllllllllIIlIIIllIllllllllII.setFacing.addAll(lllllllllllllIIlIIIlllIIIIIIIIlI.setFacing);
                        "".length();
                        lllllllllllllIIlIIIllIllllllllII.setFacing.add(lllllllllllllIIlIIIllIlllllllllI);
                        "".length();
                        lllllllllllllIIlIIIlllIIIIIIllIl.add(lllllllllllllIIlIIIllIllllllllII);
                        "".length();
                    }
                    ++lllllllllllllIIlIIIllIlllllIIIIl;
                }
            }
        }
        if (llIlllllIllIlll(this.debugFixTerrainFrustum ? 1 : 0)) {
            this.fixTerrainFrustum(lllllllllllllIIlIIIlllIIIIIlIlIl, lllllllllllllIIlIIIlllIIIIIlIlII, lllllllllllllIIlIIIlllIIIIIlIIll);
            this.debugFixTerrainFrustum = (RenderGlobal.lIIlllllllIIIl[0] != 0);
        }
        this.renderDispatcher.clearChunkUpdates();
        final Set<RenderChunk> lllllllllllllIIlIIIllIlllllllIll = this.chunksToUpdate;
        this.chunksToUpdate = (Set<RenderChunk>)Sets.newLinkedHashSet();
        final Iterator<ContainerLocalRenderInformation> iterator = this.renderInfos.iterator();
        "".length();
        if (-" ".length() > 0) {
            return;
        }
        while (!llIllllllIIIIIl(iterator.hasNext() ? 1 : 0)) {
            final ContainerLocalRenderInformation lllllllllllllIIlIIIllIlllllllIlI = iterator.next();
            final RenderChunk lllllllllllllIIlIIIllIlllllllIIl = lllllllllllllIIlIIIllIlllllllIlI.renderChunk;
            if (!llIllllllIIIIIl(lllllllllllllIIlIIIllIlllllllIIl.isNeedsUpdate() ? 1 : 0) || llIlllllIllIlll(lllllllllllllIIlIIIllIlllllllIll.contains(lllllllllllllIIlIIIllIlllllllIIl) ? 1 : 0)) {
                this.displayListEntitiesDirty = (RenderGlobal.lIIlllllllIIIl[1] != 0);
                if (llIlllllIllIlll(this.isPositionInRenderChunk(lllllllllllllIIlIIIlllIIIIIIllll, lllllllllllllIIlIIIllIlllllllIlI.renderChunk) ? 1 : 0)) {
                    this.mc.mcProfiler.startSection(RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[42]]);
                    this.renderDispatcher.updateChunkNow(lllllllllllllIIlIIIllIlllllllIIl);
                    "".length();
                    lllllllllllllIIlIIIllIlllllllIIl.setNeedsUpdate((boolean)(RenderGlobal.lIIlllllllIIIl[0] != 0));
                    this.mc.mcProfiler.endSection();
                    "".length();
                    if ((0x16 ^ 0x12) <= " ".length()) {
                        return;
                    }
                    continue;
                }
                else {
                    this.chunksToUpdate.add(lllllllllllllIIlIIIllIlllllllIIl);
                    "".length();
                }
            }
        }
        this.chunksToUpdate.addAll(lllllllllllllIIlIIIllIlllllllIll);
        "".length();
        this.mc.mcProfiler.endSection();
    }
    
    private static int llIllllllIlIIII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public void updateClouds() {
        this.cloudTickCounter += RenderGlobal.lIIlllllllIIIl[1];
        if (llIllllllIIIIIl(this.cloudTickCounter % RenderGlobal.lIIlllllllIIIl[35])) {
            this.cleanupDamagedBlocks(this.damagedBlocks.values().iterator());
        }
    }
    
    private static int llIllllllIIlllI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public void func_181023_a(final Collection<TileEntity> lllllllllllllIIlIIIlIlllIllIIlIl, final Collection<TileEntity> lllllllllllllIIlIIIlIlllIllIIlII) {
        synchronized (this.field_181024_n) {
            this.field_181024_n.removeAll(lllllllllllllIIlIIIlIlllIllIIlIl);
            "".length();
            this.field_181024_n.addAll(lllllllllllllIIlIIIlIlllIllIIlII);
            "".length();
            // monitorexit(this.field_181024_n)
            "".length();
            if (-" ".length() == " ".length()) {
                return;
            }
        }
    }
    
    private static String llIllllIllIlIlI(final String lllllllllllllIIlIIIlIlllIlIIIIIl, final String lllllllllllllIIlIIIlIlllIlIIIIII) {
        try {
            final SecretKeySpec lllllllllllllIIlIIIlIlllIlIIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIlIlllIlIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIIIlIlllIlIIIIll = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIIIlIlllIlIIIIll.init(RenderGlobal.lIIlllllllIIIl[2], lllllllllllllIIlIIIlIlllIlIIIlII);
            return new String(lllllllllllllIIlIIIlIlllIlIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIlIlllIlIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIIlIlllIlIIIIlI) {
            lllllllllllllIIlIIIlIlllIlIIIIlI.printStackTrace();
            return null;
        }
    }
    
    private RenderChunk func_181562_a(final BlockPos lllllllllllllIIlIIIllIlllIllIIll, final RenderChunk lllllllllllllIIlIIIllIlllIllIlll, final EnumFacing lllllllllllllIIlIIIllIlllIllIIIl) {
        final BlockPos lllllllllllllIIlIIIllIlllIllIlIl = lllllllllllllIIlIIIllIlllIllIlll.func_181701_a(lllllllllllllIIlIIIllIlllIllIIIl);
        RenderChunk renderChunk;
        if (llIlllllIllllII(MathHelper.abs_int(lllllllllllllIIlIIIllIlllIllIIll.getX() - lllllllllllllIIlIIIllIlllIllIlIl.getX()), this.renderDistanceChunks * RenderGlobal.lIIlllllllIIIl[29])) {
            renderChunk = null;
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        else if (llIlllllIlllIll(lllllllllllllIIlIIIllIlllIllIlIl.getY()) && llIllllllIIlIlI(lllllllllllllIIlIIIllIlllIllIlIl.getY(), RenderGlobal.lIIlllllllIIIl[43])) {
            if (llIlllllIllllII(MathHelper.abs_int(lllllllllllllIIlIIIllIlllIllIIll.getZ() - lllllllllllllIIlIIIllIlllIllIlIl.getZ()), this.renderDistanceChunks * RenderGlobal.lIIlllllllIIIl[29])) {
                renderChunk = null;
                "".length();
                if ((0x5E ^ 0x66 ^ (0x38 ^ 0x4)) < 0) {
                    return null;
                }
            }
            else {
                renderChunk = this.viewFrustum.getRenderChunk(lllllllllllllIIlIIIllIlllIllIlIl);
                "".length();
                if ((151 + 98 - 239 + 185 ^ 91 + 171 - 196 + 132) <= 0) {
                    return null;
                }
            }
        }
        else {
            renderChunk = null;
        }
        return renderChunk;
    }
    
    private static int llIlllllIlllllI(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    @Override
    public void markBlockForUpdate(final BlockPos lllllllllllllIIlIIIllIIIllIIIlIl) {
        final int lllllllllllllIIlIIIllIIIllIIlIIl = lllllllllllllIIlIIIllIIIllIIIlIl.getX();
        final int lllllllllllllIIlIIIllIIIllIIlIII = lllllllllllllIIlIIIllIIIllIIIlIl.getY();
        final int lllllllllllllIIlIIIllIIIllIIIlll = lllllllllllllIIlIIIllIIIllIIIlIl.getZ();
        this.markBlocksForUpdate(lllllllllllllIIlIIIllIIIllIIlIIl - RenderGlobal.lIIlllllllIIIl[1], lllllllllllllIIlIIIllIIIllIIlIII - RenderGlobal.lIIlllllllIIIl[1], lllllllllllllIIlIIIllIIIllIIIlll - RenderGlobal.lIIlllllllIIIl[1], lllllllllllllIIlIIIllIIIllIIlIIl + RenderGlobal.lIIlllllllIIIl[1], lllllllllllllIIlIIIllIIIllIIlIII + RenderGlobal.lIIlllllllIIIl[1], lllllllllllllIIlIIIllIIIllIIIlll + RenderGlobal.lIIlllllllIIIl[1]);
    }
    
    static /* synthetic */ int[] $SWITCH_TABLE$net$minecraft$client$renderer$vertex$VertexFormatElement$EnumUsage() {
        final int[] $switch_TABLE$net$minecraft$client$renderer$vertex$VertexFormatElement$EnumUsage = RenderGlobal.$SWITCH_TABLE$net$minecraft$client$renderer$vertex$VertexFormatElement$EnumUsage;
        if (llIlllllIlllIlI($switch_TABLE$net$minecraft$client$renderer$vertex$VertexFormatElement$EnumUsage)) {
            return $switch_TABLE$net$minecraft$client$renderer$vertex$VertexFormatElement$EnumUsage;
        }
        "".length();
        final Exception lllllllllllllIIlIIIlIlllIllIIIIl = (Object)new int[VertexFormatElement.EnumUsage.values().length];
        try {
            lllllllllllllIIlIIIlIlllIllIIIIl[VertexFormatElement.EnumUsage.BLEND_WEIGHT.ordinal()] = RenderGlobal.lIIlllllllIIIl[14];
            "".length();
            if (-(0xAA ^ 0xAF) >= 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError) {
            "".length();
        }
        try {
            lllllllllllllIIlIIIlIlllIllIIIIl[VertexFormatElement.EnumUsage.COLOR.ordinal()] = RenderGlobal.lIIlllllllIIIl[3];
            "".length();
            if ("  ".length() < ((84 + 153 - 217 + 140 ^ 32 + 9 + 28 + 83) & (38 + 74 - 62 + 103 ^ 153 + 156 - 238 + 90 ^ -" ".length()))) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError2) {
            "".length();
        }
        try {
            lllllllllllllIIlIIIlIlllIllIIIIl[VertexFormatElement.EnumUsage.MATRIX.ordinal()] = RenderGlobal.lIIlllllllIIIl[13];
            "".length();
            if (-(0x5 ^ 0x1) > 0) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError3) {
            "".length();
        }
        try {
            lllllllllllllIIlIIIlIlllIllIIIIl[VertexFormatElement.EnumUsage.NORMAL.ordinal()] = RenderGlobal.lIIlllllllIIIl[2];
            "".length();
            if (" ".length() <= -" ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError4) {
            "".length();
        }
        try {
            lllllllllllllIIlIIIlIlllIllIIIIl[VertexFormatElement.EnumUsage.PADDING.ordinal()] = RenderGlobal.lIIlllllllIIIl[15];
            "".length();
            if (" ".length() <= ((159 + 111 - 115 + 73 ^ 68 + 75 - 40 + 66) & (0xD3 ^ 0xC2 ^ (0xDF ^ 0x83) ^ -" ".length()))) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError5) {
            "".length();
        }
        try {
            lllllllllllllIIlIIIlIlllIllIIIIl[VertexFormatElement.EnumUsage.POSITION.ordinal()] = RenderGlobal.lIIlllllllIIIl[1];
            "".length();
            if (((0xB9 ^ 0x9D) & ~(0xBD ^ 0x99)) > "  ".length()) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError6) {
            "".length();
        }
        try {
            lllllllllllllIIlIIIlIlllIllIIIIl[VertexFormatElement.EnumUsage.UV.ordinal()] = RenderGlobal.lIIlllllllIIIl[4];
            "".length();
            if (((0x6D ^ 0x2F) & ~(0x6A ^ 0x28)) != ((0x89 ^ 0xB3) & ~(0x10 ^ 0x2A))) {
                return null;
            }
        }
        catch (NoSuchFieldError noSuchFieldError7) {
            "".length();
        }
        return RenderGlobal.$SWITCH_TABLE$net$minecraft$client$renderer$vertex$VertexFormatElement$EnumUsage = (int[])(Object)lllllllllllllIIlIIIlIlllIllIIIIl;
    }
    
    @Override
    public void markBlockRangeForRenderUpdate(final int lllllllllllllIIlIIIllIIIlIlIlIlI, final int lllllllllllllIIlIIIllIIIlIlIIIlI, final int lllllllllllllIIlIIIllIIIlIlIIIIl, final int lllllllllllllIIlIIIllIIIlIlIIlll, final int lllllllllllllIIlIIIllIIIlIlIIllI, final int lllllllllllllIIlIIIllIIIlIIllllI) {
        this.markBlocksForUpdate(lllllllllllllIIlIIIllIIIlIlIlIlI - RenderGlobal.lIIlllllllIIIl[1], lllllllllllllIIlIIIllIIIlIlIIIlI - RenderGlobal.lIIlllllllIIIl[1], lllllllllllllIIlIIIllIIIlIlIIIIl - RenderGlobal.lIIlllllllIIIl[1], lllllllllllllIIlIIIllIIIlIlIIlll + RenderGlobal.lIIlllllllIIIl[1], lllllllllllllIIlIIIllIIIlIlIIllI + RenderGlobal.lIIlllllllIIIl[1], lllllllllllllIIlIIIllIIIlIIllllI + RenderGlobal.lIIlllllllIIIl[1]);
    }
    
    private static boolean llIllllllIIIIlI(final int lllllllllllllIIlIIIlIlllIIIIIIII, final int lllllllllllllIIlIIIlIllIllllllll) {
        return lllllllllllllIIlIIIlIlllIIIIIIII != lllllllllllllIIlIIIlIllIllllllll;
    }
    
    private void generateStars() {
        final Tessellator lllllllllllllIIlIIIlllIlIIIlIllI = Tessellator.getInstance();
        final WorldRenderer lllllllllllllIIlIIIlllIlIIIlIlIl = lllllllllllllIIlIIIlllIlIIIlIllI.getWorldRenderer();
        if (llIlllllIlllIlI(this.starVBO)) {
            this.starVBO.deleteGlBuffers();
        }
        if (llIlllllIlllIll(this.starGLCallList)) {
            GLAllocation.deleteDisplayLists(this.starGLCallList);
            this.starGLCallList = RenderGlobal.lIIlllllllIIIl[6];
        }
        if (llIlllllIllIlll(this.vboEnabled ? 1 : 0)) {
            this.starVBO = new VertexBuffer(this.vertexBufferFormat);
            this.renderStars(lllllllllllllIIlIIIlllIlIIIlIlIl);
            lllllllllllllIIlIIIlllIlIIIlIlIl.finishDrawing();
            lllllllllllllIIlIIIlllIlIIIlIlIl.reset();
            this.starVBO.func_181722_a(lllllllllllllIIlIIIlllIlIIIlIlIl.getByteBuffer());
            "".length();
            if (((0x67 ^ 0x22) & ~(0x3F ^ 0x7A)) != ((0x2C ^ 0x37) & ~(0x15 ^ 0xE))) {
                return;
            }
        }
        else {
            this.starGLCallList = GLAllocation.generateDisplayLists(RenderGlobal.lIIlllllllIIIl[1]);
            GlStateManager.pushMatrix();
            GL11.glNewList(this.starGLCallList, RenderGlobal.lIIlllllllIIIl[19]);
            this.renderStars(lllllllllllllIIlIIIlllIlIIIlIlIl);
            lllllllllllllIIlIIIlllIlIIIlIllI.draw();
            GL11.glEndList();
            GlStateManager.popMatrix();
        }
    }
    
    private void renderCloudsFancy(final float lllllllllllllIIlIIIllIlIIIlIIlll, final int lllllllllllllIIlIIIllIlIIlIlIlll) {
        GlStateManager.disableCull();
        final float lllllllllllllIIlIIIllIlIIlIlIllI = (float)(this.mc.getRenderViewEntity().lastTickPosY + (this.mc.getRenderViewEntity().posY - this.mc.getRenderViewEntity().lastTickPosY) * lllllllllllllIIlIIIllIlIIIlIIlll);
        final Tessellator lllllllllllllIIlIIIllIlIIlIlIlIl = Tessellator.getInstance();
        final WorldRenderer lllllllllllllIIlIIIllIlIIlIlIlII = lllllllllllllIIlIIIllIlIIlIlIlIl.getWorldRenderer();
        final float lllllllllllllIIlIIIllIlIIlIlIIll = 12.0f;
        final float lllllllllllllIIlIIIllIlIIlIlIIlI = 4.0f;
        final double lllllllllllllIIlIIIllIlIIlIlIIIl = this.cloudTickCounter + lllllllllllllIIlIIIllIlIIIlIIlll;
        double lllllllllllllIIlIIIllIlIIlIlIIII = (this.mc.getRenderViewEntity().prevPosX + (this.mc.getRenderViewEntity().posX - this.mc.getRenderViewEntity().prevPosX) * lllllllllllllIIlIIIllIlIIIlIIlll + lllllllllllllIIlIIIllIlIIlIlIIIl * 0.029999999329447746) / 12.0;
        double lllllllllllllIIlIIIllIlIIlIIllll = (this.mc.getRenderViewEntity().prevPosZ + (this.mc.getRenderViewEntity().posZ - this.mc.getRenderViewEntity().prevPosZ) * lllllllllllllIIlIIIllIlIIIlIIlll) / 12.0 + 0.33000001311302185;
        final float lllllllllllllIIlIIIllIlIIlIIlllI = this.theWorld.provider.getCloudHeight() - lllllllllllllIIlIIIllIlIIlIlIllI + 0.33f;
        final int lllllllllllllIIlIIIllIlIIlIIllIl = MathHelper.floor_double(lllllllllllllIIlIIIllIlIIlIlIIII / 2048.0);
        final int lllllllllllllIIlIIIllIlIIlIIllII = MathHelper.floor_double(lllllllllllllIIlIIIllIlIIlIIllll / 2048.0);
        lllllllllllllIIlIIIllIlIIlIlIIII -= lllllllllllllIIlIIIllIlIIlIIllIl * RenderGlobal.lIIlllllllIIIl[57];
        lllllllllllllIIlIIIllIlIIlIIllll -= lllllllllllllIIlIIIllIlIIlIIllII * RenderGlobal.lIIlllllllIIIl[57];
        this.renderEngine.bindTexture(RenderGlobal.locationCloudsPng);
        GlStateManager.enableBlend();
        GlStateManager.tryBlendFuncSeparate(RenderGlobal.lIIlllllllIIIl[17], RenderGlobal.lIIlllllllIIIl[18], RenderGlobal.lIIlllllllIIIl[1], RenderGlobal.lIIlllllllIIIl[0]);
        final Vec3 lllllllllllllIIlIIIllIlIIlIIlIll = this.theWorld.getCloudColour(lllllllllllllIIlIIIllIlIIIlIIlll);
        float lllllllllllllIIlIIIllIlIIlIIlIlI = (float)lllllllllllllIIlIIIllIlIIlIIlIll.xCoord;
        float lllllllllllllIIlIIIllIlIIlIIlIIl = (float)lllllllllllllIIlIIIllIlIIlIIlIll.yCoord;
        float lllllllllllllIIlIIIllIlIIlIIlIII = (float)lllllllllllllIIlIIIllIlIIlIIlIll.zCoord;
        if (llIllllllIIIIlI(lllllllllllllIIlIIIllIlIIlIlIlll, RenderGlobal.lIIlllllllIIIl[2])) {
            final float lllllllllllllIIlIIIllIlIIlIIIlll = (lllllllllllllIIlIIIllIlIIlIIlIlI * 30.0f + lllllllllllllIIlIIIllIlIIlIIlIIl * 59.0f + lllllllllllllIIlIIIllIlIIlIIlIII * 11.0f) / 100.0f;
            final float lllllllllllllIIlIIIllIlIIlIIIllI = (lllllllllllllIIlIIIllIlIIlIIlIlI * 30.0f + lllllllllllllIIlIIIllIlIIlIIlIIl * 70.0f) / 100.0f;
            final float lllllllllllllIIlIIIllIlIIlIIIlIl = (lllllllllllllIIlIIIllIlIIlIIlIlI * 30.0f + lllllllllllllIIlIIIllIlIIlIIlIII * 70.0f) / 100.0f;
            lllllllllllllIIlIIIllIlIIlIIlIlI = lllllllllllllIIlIIIllIlIIlIIIlll;
            lllllllllllllIIlIIIllIlIIlIIlIIl = lllllllllllllIIlIIIllIlIIlIIIllI;
            lllllllllllllIIlIIIllIlIIlIIlIII = lllllllllllllIIlIIIllIlIIlIIIlIl;
        }
        final float lllllllllllllIIlIIIllIlIIlIIIlII = lllllllllllllIIlIIIllIlIIlIIlIlI * 0.9f;
        final float lllllllllllllIIlIIIllIlIIlIIIIll = lllllllllllllIIlIIIllIlIIlIIlIIl * 0.9f;
        final float lllllllllllllIIlIIIllIlIIlIIIIlI = lllllllllllllIIlIIIllIlIIlIIlIII * 0.9f;
        final float lllllllllllllIIlIIIllIlIIlIIIIIl = lllllllllllllIIlIIIllIlIIlIIlIlI * 0.7f;
        final float lllllllllllllIIlIIIllIlIIlIIIIII = lllllllllllllIIlIIIllIlIIlIIlIIl * 0.7f;
        final float lllllllllllllIIlIIIllIlIIIllllll = lllllllllllllIIlIIIllIlIIlIIlIII * 0.7f;
        final float lllllllllllllIIlIIIllIlIIIlllllI = lllllllllllllIIlIIIllIlIIlIIlIlI * 0.8f;
        final float lllllllllllllIIlIIIllIlIIIllllIl = lllllllllllllIIlIIIllIlIIlIIlIIl * 0.8f;
        final float lllllllllllllIIlIIIllIlIIIllllII = lllllllllllllIIlIIIllIlIIlIIlIII * 0.8f;
        final float lllllllllllllIIlIIIllIlIIIlllIll = 0.00390625f;
        final float lllllllllllllIIlIIIllIlIIIlllIlI = MathHelper.floor_double(lllllllllllllIIlIIIllIlIIlIlIIII) * 0.00390625f;
        final float lllllllllllllIIlIIIllIlIIIlllIIl = MathHelper.floor_double(lllllllllllllIIlIIIllIlIIlIIllll) * 0.00390625f;
        final float lllllllllllllIIlIIIllIlIIIlllIII = (float)(lllllllllllllIIlIIIllIlIIlIlIIII - MathHelper.floor_double(lllllllllllllIIlIIIllIlIIlIlIIII));
        final float lllllllllllllIIlIIIllIlIIIllIlll = (float)(lllllllllllllIIlIIIllIlIIlIIllll - MathHelper.floor_double(lllllllllllllIIlIIIllIlIIlIIllll));
        final int lllllllllllllIIlIIIllIlIIIllIllI = RenderGlobal.lIIlllllllIIIl[8];
        final int lllllllllllllIIlIIIllIlIIIllIlIl = RenderGlobal.lIIlllllllIIIl[4];
        final float lllllllllllllIIlIIIllIlIIIllIlII = 9.765625E-4f;
        GlStateManager.scale(12.0f, 1.0f, 12.0f);
        int lllllllllllllIIlIIIllIlIIIllIIll = RenderGlobal.lIIlllllllIIIl[0];
        "".length();
        if (-(64 + 151 - 23 + 6 ^ 9 + 54 - 19 + 150) >= 0) {
            return;
        }
        while (!llIlllllIlllIII(lllllllllllllIIlIIIllIlIIIllIIll, RenderGlobal.lIIlllllllIIIl[2])) {
            if (llIllllllIIIIIl(lllllllllllllIIlIIIllIlIIIllIIll)) {
                GlStateManager.colorMask((boolean)(RenderGlobal.lIIlllllllIIIl[0] != 0), (boolean)(RenderGlobal.lIIlllllllIIIl[0] != 0), (boolean)(RenderGlobal.lIIlllllllIIIl[0] != 0), (boolean)(RenderGlobal.lIIlllllllIIIl[0] != 0));
                "".length();
                if (-" ".length() == ((0xB3 ^ 0xAD) & ~(0x5D ^ 0x43))) {
                    return;
                }
            }
            else {
                switch (lllllllllllllIIlIIIllIlIIlIlIlll) {
                    case 0: {
                        GlStateManager.colorMask((boolean)(RenderGlobal.lIIlllllllIIIl[0] != 0), (boolean)(RenderGlobal.lIIlllllllIIIl[1] != 0), (boolean)(RenderGlobal.lIIlllllllIIIl[1] != 0), (boolean)(RenderGlobal.lIIlllllllIIIl[1] != 0));
                        "".length();
                        if (-"   ".length() >= 0) {
                            return;
                        }
                        break;
                    }
                    case 1: {
                        GlStateManager.colorMask((boolean)(RenderGlobal.lIIlllllllIIIl[1] != 0), (boolean)(RenderGlobal.lIIlllllllIIIl[0] != 0), (boolean)(RenderGlobal.lIIlllllllIIIl[0] != 0), (boolean)(RenderGlobal.lIIlllllllIIIl[1] != 0));
                        "".length();
                        if (-"  ".length() > 0) {
                            return;
                        }
                        break;
                    }
                    case 2: {
                        GlStateManager.colorMask((boolean)(RenderGlobal.lIIlllllllIIIl[1] != 0), (boolean)(RenderGlobal.lIIlllllllIIIl[1] != 0), (boolean)(RenderGlobal.lIIlllllllIIIl[1] != 0), (boolean)(RenderGlobal.lIIlllllllIIIl[1] != 0));
                        break;
                    }
                }
            }
            int lllllllllllllIIlIIIllIlIIIllIIlI = RenderGlobal.lIIlllllllIIIl[59];
            "".length();
            if ("  ".length() != "  ".length()) {
                return;
            }
            while (!llIlllllIllllII(lllllllllllllIIlIIIllIlIIIllIIlI, RenderGlobal.lIIlllllllIIIl[4])) {
                int lllllllllllllIIlIIIllIlIIIllIIIl = RenderGlobal.lIIlllllllIIIl[59];
                "".length();
                if (((0x4D ^ 0x1C ^ (0x66 ^ 0x57)) & (0x41 ^ 0x26 ^ (0xAB ^ 0xAC) ^ -" ".length())) < 0) {
                    return;
                }
                while (!llIlllllIllllII(lllllllllllllIIlIIIllIlIIIllIIIl, RenderGlobal.lIIlllllllIIIl[4])) {
                    lllllllllllllIIlIIIllIlIIlIlIlII.begin(RenderGlobal.lIIlllllllIIIl[15], DefaultVertexFormats.POSITION_TEX_COLOR_NORMAL);
                    final float lllllllllllllIIlIIIllIlIIIllIIII = (float)(lllllllllllllIIlIIIllIlIIIllIIlI * RenderGlobal.lIIlllllllIIIl[8]);
                    final float lllllllllllllIIlIIIllIlIIIlIllll = (float)(lllllllllllllIIlIIIllIlIIIllIIIl * RenderGlobal.lIIlllllllIIIl[8]);
                    final float lllllllllllllIIlIIIllIlIIIlIlllI = lllllllllllllIIlIIIllIlIIIllIIII - lllllllllllllIIlIIIllIlIIIlllIII;
                    final float lllllllllllllIIlIIIllIlIIIlIllIl = lllllllllllllIIlIIIllIlIIIlIllll - lllllllllllllIIlIIIllIlIIIllIlll;
                    if (llIllllllIIIIII(llIllllllIlIIII(lllllllllllllIIlIIIllIlIIlIIlllI, -5.0f))) {
                        lllllllllllllIIlIIIllIlIIlIlIlII.pos(lllllllllllllIIlIIIllIlIIIlIlllI + 0.0f, lllllllllllllIIlIIIllIlIIlIIlllI + 0.0f, lllllllllllllIIlIIIllIlIIIlIllIl + 8.0f).tex((lllllllllllllIIlIIIllIlIIIllIIII + 0.0f) * 0.00390625f + lllllllllllllIIlIIIllIlIIIlllIlI, (lllllllllllllIIlIIIllIlIIIlIllll + 8.0f) * 0.00390625f + lllllllllllllIIlIIIllIlIIIlllIIl).color(lllllllllllllIIlIIIllIlIIlIIIIIl, lllllllllllllIIlIIIllIlIIlIIIIII, lllllllllllllIIlIIIllIlIIIllllll, 0.8f).normal(0.0f, -1.0f, 0.0f).endVertex();
                        lllllllllllllIIlIIIllIlIIlIlIlII.pos(lllllllllllllIIlIIIllIlIIIlIlllI + 8.0f, lllllllllllllIIlIIIllIlIIlIIlllI + 0.0f, lllllllllllllIIlIIIllIlIIIlIllIl + 8.0f).tex((lllllllllllllIIlIIIllIlIIIllIIII + 8.0f) * 0.00390625f + lllllllllllllIIlIIIllIlIIIlllIlI, (lllllllllllllIIlIIIllIlIIIlIllll + 8.0f) * 0.00390625f + lllllllllllllIIlIIIllIlIIIlllIIl).color(lllllllllllllIIlIIIllIlIIlIIIIIl, lllllllllllllIIlIIIllIlIIlIIIIII, lllllllllllllIIlIIIllIlIIIllllll, 0.8f).normal(0.0f, -1.0f, 0.0f).endVertex();
                        lllllllllllllIIlIIIllIlIIlIlIlII.pos(lllllllllllllIIlIIIllIlIIIlIlllI + 8.0f, lllllllllllllIIlIIIllIlIIlIIlllI + 0.0f, lllllllllllllIIlIIIllIlIIIlIllIl + 0.0f).tex((lllllllllllllIIlIIIllIlIIIllIIII + 8.0f) * 0.00390625f + lllllllllllllIIlIIIllIlIIIlllIlI, (lllllllllllllIIlIIIllIlIIIlIllll + 0.0f) * 0.00390625f + lllllllllllllIIlIIIllIlIIIlllIIl).color(lllllllllllllIIlIIIllIlIIlIIIIIl, lllllllllllllIIlIIIllIlIIlIIIIII, lllllllllllllIIlIIIllIlIIIllllll, 0.8f).normal(0.0f, -1.0f, 0.0f).endVertex();
                        lllllllllllllIIlIIIllIlIIlIlIlII.pos(lllllllllllllIIlIIIllIlIIIlIlllI + 0.0f, lllllllllllllIIlIIIllIlIIlIIlllI + 0.0f, lllllllllllllIIlIIIllIlIIIlIllIl + 0.0f).tex((lllllllllllllIIlIIIllIlIIIllIIII + 0.0f) * 0.00390625f + lllllllllllllIIlIIIllIlIIIlllIlI, (lllllllllllllIIlIIIllIlIIIlIllll + 0.0f) * 0.00390625f + lllllllllllllIIlIIIllIlIIIlllIIl).color(lllllllllllllIIlIIIllIlIIlIIIIIl, lllllllllllllIIlIIIllIlIIlIIIIII, lllllllllllllIIlIIIllIlIIIllllll, 0.8f).normal(0.0f, -1.0f, 0.0f).endVertex();
                    }
                    if (llIllllllIlIIll(llIllllllIlIIIl(lllllllllllllIIlIIIllIlIIlIIlllI, 5.0f))) {
                        lllllllllllllIIlIIIllIlIIlIlIlII.pos(lllllllllllllIIlIIIllIlIIIlIlllI + 0.0f, lllllllllllllIIlIIIllIlIIlIIlllI + 4.0f - 9.765625E-4f, lllllllllllllIIlIIIllIlIIIlIllIl + 8.0f).tex((lllllllllllllIIlIIIllIlIIIllIIII + 0.0f) * 0.00390625f + lllllllllllllIIlIIIllIlIIIlllIlI, (lllllllllllllIIlIIIllIlIIIlIllll + 8.0f) * 0.00390625f + lllllllllllllIIlIIIllIlIIIlllIIl).color(lllllllllllllIIlIIIllIlIIlIIlIlI, lllllllllllllIIlIIIllIlIIlIIlIIl, lllllllllllllIIlIIIllIlIIlIIlIII, 0.8f).normal(0.0f, 1.0f, 0.0f).endVertex();
                        lllllllllllllIIlIIIllIlIIlIlIlII.pos(lllllllllllllIIlIIIllIlIIIlIlllI + 8.0f, lllllllllllllIIlIIIllIlIIlIIlllI + 4.0f - 9.765625E-4f, lllllllllllllIIlIIIllIlIIIlIllIl + 8.0f).tex((lllllllllllllIIlIIIllIlIIIllIIII + 8.0f) * 0.00390625f + lllllllllllllIIlIIIllIlIIIlllIlI, (lllllllllllllIIlIIIllIlIIIlIllll + 8.0f) * 0.00390625f + lllllllllllllIIlIIIllIlIIIlllIIl).color(lllllllllllllIIlIIIllIlIIlIIlIlI, lllllllllllllIIlIIIllIlIIlIIlIIl, lllllllllllllIIlIIIllIlIIlIIlIII, 0.8f).normal(0.0f, 1.0f, 0.0f).endVertex();
                        lllllllllllllIIlIIIllIlIIlIlIlII.pos(lllllllllllllIIlIIIllIlIIIlIlllI + 8.0f, lllllllllllllIIlIIIllIlIIlIIlllI + 4.0f - 9.765625E-4f, lllllllllllllIIlIIIllIlIIIlIllIl + 0.0f).tex((lllllllllllllIIlIIIllIlIIIllIIII + 8.0f) * 0.00390625f + lllllllllllllIIlIIIllIlIIIlllIlI, (lllllllllllllIIlIIIllIlIIIlIllll + 0.0f) * 0.00390625f + lllllllllllllIIlIIIllIlIIIlllIIl).color(lllllllllllllIIlIIIllIlIIlIIlIlI, lllllllllllllIIlIIIllIlIIlIIlIIl, lllllllllllllIIlIIIllIlIIlIIlIII, 0.8f).normal(0.0f, 1.0f, 0.0f).endVertex();
                        lllllllllllllIIlIIIllIlIIlIlIlII.pos(lllllllllllllIIlIIIllIlIIIlIlllI + 0.0f, lllllllllllllIIlIIIllIlIIlIIlllI + 4.0f - 9.765625E-4f, lllllllllllllIIlIIIllIlIIIlIllIl + 0.0f).tex((lllllllllllllIIlIIIllIlIIIllIIII + 0.0f) * 0.00390625f + lllllllllllllIIlIIIllIlIIIlllIlI, (lllllllllllllIIlIIIllIlIIIlIllll + 0.0f) * 0.00390625f + lllllllllllllIIlIIIllIlIIIlllIIl).color(lllllllllllllIIlIIIllIlIIlIIlIlI, lllllllllllllIIlIIIllIlIIlIIlIIl, lllllllllllllIIlIIIllIlIIlIIlIII, 0.8f).normal(0.0f, 1.0f, 0.0f).endVertex();
                    }
                    if (llIlllllIllllII(lllllllllllllIIlIIIllIlIIIllIIlI, RenderGlobal.lIIlllllllIIIl[6])) {
                        int lllllllllllllIIlIIIllIlIIIlIllII = RenderGlobal.lIIlllllllIIIl[0];
                        "".length();
                        if (((73 + 40 - 33 + 60 ^ 19 + 10 + 69 + 30) & (0x25 ^ 0x6A ^ (0x62 ^ 0x21) ^ -" ".length())) != 0x0) {
                            return;
                        }
                        while (!llIlllllIlllIII(lllllllllllllIIlIIIllIlIIIlIllII, RenderGlobal.lIIlllllllIIIl[8])) {
                            lllllllllllllIIlIIIllIlIIlIlIlII.pos(lllllllllllllIIlIIIllIlIIIlIlllI + lllllllllllllIIlIIIllIlIIIlIllII + 0.0f, lllllllllllllIIlIIIllIlIIlIIlllI + 0.0f, lllllllllllllIIlIIIllIlIIIlIllIl + 8.0f).tex((lllllllllllllIIlIIIllIlIIIllIIII + lllllllllllllIIlIIIllIlIIIlIllII + 0.5f) * 0.00390625f + lllllllllllllIIlIIIllIlIIIlllIlI, (lllllllllllllIIlIIIllIlIIIlIllll + 8.0f) * 0.00390625f + lllllllllllllIIlIIIllIlIIIlllIIl).color(lllllllllllllIIlIIIllIlIIlIIIlII, lllllllllllllIIlIIIllIlIIlIIIIll, lllllllllllllIIlIIIllIlIIlIIIIlI, 0.8f).normal(-1.0f, 0.0f, 0.0f).endVertex();
                            lllllllllllllIIlIIIllIlIIlIlIlII.pos(lllllllllllllIIlIIIllIlIIIlIlllI + lllllllllllllIIlIIIllIlIIIlIllII + 0.0f, lllllllllllllIIlIIIllIlIIlIIlllI + 4.0f, lllllllllllllIIlIIIllIlIIIlIllIl + 8.0f).tex((lllllllllllllIIlIIIllIlIIIllIIII + lllllllllllllIIlIIIllIlIIIlIllII + 0.5f) * 0.00390625f + lllllllllllllIIlIIIllIlIIIlllIlI, (lllllllllllllIIlIIIllIlIIIlIllll + 8.0f) * 0.00390625f + lllllllllllllIIlIIIllIlIIIlllIIl).color(lllllllllllllIIlIIIllIlIIlIIIlII, lllllllllllllIIlIIIllIlIIlIIIIll, lllllllllllllIIlIIIllIlIIlIIIIlI, 0.8f).normal(-1.0f, 0.0f, 0.0f).endVertex();
                            lllllllllllllIIlIIIllIlIIlIlIlII.pos(lllllllllllllIIlIIIllIlIIIlIlllI + lllllllllllllIIlIIIllIlIIIlIllII + 0.0f, lllllllllllllIIlIIIllIlIIlIIlllI + 4.0f, lllllllllllllIIlIIIllIlIIIlIllIl + 0.0f).tex((lllllllllllllIIlIIIllIlIIIllIIII + lllllllllllllIIlIIIllIlIIIlIllII + 0.5f) * 0.00390625f + lllllllllllllIIlIIIllIlIIIlllIlI, (lllllllllllllIIlIIIllIlIIIlIllll + 0.0f) * 0.00390625f + lllllllllllllIIlIIIllIlIIIlllIIl).color(lllllllllllllIIlIIIllIlIIlIIIlII, lllllllllllllIIlIIIllIlIIlIIIIll, lllllllllllllIIlIIIllIlIIlIIIIlI, 0.8f).normal(-1.0f, 0.0f, 0.0f).endVertex();
                            lllllllllllllIIlIIIllIlIIlIlIlII.pos(lllllllllllllIIlIIIllIlIIIlIlllI + lllllllllllllIIlIIIllIlIIIlIllII + 0.0f, lllllllllllllIIlIIIllIlIIlIIlllI + 0.0f, lllllllllllllIIlIIIllIlIIIlIllIl + 0.0f).tex((lllllllllllllIIlIIIllIlIIIllIIII + lllllllllllllIIlIIIllIlIIIlIllII + 0.5f) * 0.00390625f + lllllllllllllIIlIIIllIlIIIlllIlI, (lllllllllllllIIlIIIllIlIIIlIllll + 0.0f) * 0.00390625f + lllllllllllllIIlIIIllIlIIIlllIIl).color(lllllllllllllIIlIIIllIlIIlIIIlII, lllllllllllllIIlIIIllIlIIlIIIIll, lllllllllllllIIlIIIllIlIIlIIIIlI, 0.8f).normal(-1.0f, 0.0f, 0.0f).endVertex();
                            ++lllllllllllllIIlIIIllIlIIIlIllII;
                        }
                    }
                    if (llIllllllIIlIIl(lllllllllllllIIlIIIllIlIIIllIIlI, RenderGlobal.lIIlllllllIIIl[1])) {
                        int lllllllllllllIIlIIIllIlIIIlIlIll = RenderGlobal.lIIlllllllIIIl[0];
                        "".length();
                        if (-" ".length() >= "  ".length()) {
                            return;
                        }
                        while (!llIlllllIlllIII(lllllllllllllIIlIIIllIlIIIlIlIll, RenderGlobal.lIIlllllllIIIl[8])) {
                            lllllllllllllIIlIIIllIlIIlIlIlII.pos(lllllllllllllIIlIIIllIlIIIlIlllI + lllllllllllllIIlIIIllIlIIIlIlIll + 1.0f - 9.765625E-4f, lllllllllllllIIlIIIllIlIIlIIlllI + 0.0f, lllllllllllllIIlIIIllIlIIIlIllIl + 8.0f).tex((lllllllllllllIIlIIIllIlIIIllIIII + lllllllllllllIIlIIIllIlIIIlIlIll + 0.5f) * 0.00390625f + lllllllllllllIIlIIIllIlIIIlllIlI, (lllllllllllllIIlIIIllIlIIIlIllll + 8.0f) * 0.00390625f + lllllllllllllIIlIIIllIlIIIlllIIl).color(lllllllllllllIIlIIIllIlIIlIIIlII, lllllllllllllIIlIIIllIlIIlIIIIll, lllllllllllllIIlIIIllIlIIlIIIIlI, 0.8f).normal(1.0f, 0.0f, 0.0f).endVertex();
                            lllllllllllllIIlIIIllIlIIlIlIlII.pos(lllllllllllllIIlIIIllIlIIIlIlllI + lllllllllllllIIlIIIllIlIIIlIlIll + 1.0f - 9.765625E-4f, lllllllllllllIIlIIIllIlIIlIIlllI + 4.0f, lllllllllllllIIlIIIllIlIIIlIllIl + 8.0f).tex((lllllllllllllIIlIIIllIlIIIllIIII + lllllllllllllIIlIIIllIlIIIlIlIll + 0.5f) * 0.00390625f + lllllllllllllIIlIIIllIlIIIlllIlI, (lllllllllllllIIlIIIllIlIIIlIllll + 8.0f) * 0.00390625f + lllllllllllllIIlIIIllIlIIIlllIIl).color(lllllllllllllIIlIIIllIlIIlIIIlII, lllllllllllllIIlIIIllIlIIlIIIIll, lllllllllllllIIlIIIllIlIIlIIIIlI, 0.8f).normal(1.0f, 0.0f, 0.0f).endVertex();
                            lllllllllllllIIlIIIllIlIIlIlIlII.pos(lllllllllllllIIlIIIllIlIIIlIlllI + lllllllllllllIIlIIIllIlIIIlIlIll + 1.0f - 9.765625E-4f, lllllllllllllIIlIIIllIlIIlIIlllI + 4.0f, lllllllllllllIIlIIIllIlIIIlIllIl + 0.0f).tex((lllllllllllllIIlIIIllIlIIIllIIII + lllllllllllllIIlIIIllIlIIIlIlIll + 0.5f) * 0.00390625f + lllllllllllllIIlIIIllIlIIIlllIlI, (lllllllllllllIIlIIIllIlIIIlIllll + 0.0f) * 0.00390625f + lllllllllllllIIlIIIllIlIIIlllIIl).color(lllllllllllllIIlIIIllIlIIlIIIlII, lllllllllllllIIlIIIllIlIIlIIIIll, lllllllllllllIIlIIIllIlIIlIIIIlI, 0.8f).normal(1.0f, 0.0f, 0.0f).endVertex();
                            lllllllllllllIIlIIIllIlIIlIlIlII.pos(lllllllllllllIIlIIIllIlIIIlIlllI + lllllllllllllIIlIIIllIlIIIlIlIll + 1.0f - 9.765625E-4f, lllllllllllllIIlIIIllIlIIlIIlllI + 0.0f, lllllllllllllIIlIIIllIlIIIlIllIl + 0.0f).tex((lllllllllllllIIlIIIllIlIIIllIIII + lllllllllllllIIlIIIllIlIIIlIlIll + 0.5f) * 0.00390625f + lllllllllllllIIlIIIllIlIIIlllIlI, (lllllllllllllIIlIIIllIlIIIlIllll + 0.0f) * 0.00390625f + lllllllllllllIIlIIIllIlIIIlllIIl).color(lllllllllllllIIlIIIllIlIIlIIIlII, lllllllllllllIIlIIIllIlIIlIIIIll, lllllllllllllIIlIIIllIlIIlIIIIlI, 0.8f).normal(1.0f, 0.0f, 0.0f).endVertex();
                            ++lllllllllllllIIlIIIllIlIIIlIlIll;
                        }
                    }
                    if (llIlllllIllllII(lllllllllllllIIlIIIllIlIIIllIIIl, RenderGlobal.lIIlllllllIIIl[6])) {
                        int lllllllllllllIIlIIIllIlIIIlIlIlI = RenderGlobal.lIIlllllllIIIl[0];
                        "".length();
                        if (((0x18 ^ 0xA ^ (0xE ^ 0x2A)) & (138 + 6 - 15 + 61 ^ 0 + 15 + 120 + 1 ^ -" ".length())) != 0x0) {
                            return;
                        }
                        while (!llIlllllIlllIII(lllllllllllllIIlIIIllIlIIIlIlIlI, RenderGlobal.lIIlllllllIIIl[8])) {
                            lllllllllllllIIlIIIllIlIIlIlIlII.pos(lllllllllllllIIlIIIllIlIIIlIlllI + 0.0f, lllllllllllllIIlIIIllIlIIlIIlllI + 4.0f, lllllllllllllIIlIIIllIlIIIlIllIl + lllllllllllllIIlIIIllIlIIIlIlIlI + 0.0f).tex((lllllllllllllIIlIIIllIlIIIllIIII + 0.0f) * 0.00390625f + lllllllllllllIIlIIIllIlIIIlllIlI, (lllllllllllllIIlIIIllIlIIIlIllll + lllllllllllllIIlIIIllIlIIIlIlIlI + 0.5f) * 0.00390625f + lllllllllllllIIlIIIllIlIIIlllIIl).color(lllllllllllllIIlIIIllIlIIIlllllI, lllllllllllllIIlIIIllIlIIIllllIl, lllllllllllllIIlIIIllIlIIIllllII, 0.8f).normal(0.0f, 0.0f, -1.0f).endVertex();
                            lllllllllllllIIlIIIllIlIIlIlIlII.pos(lllllllllllllIIlIIIllIlIIIlIlllI + 8.0f, lllllllllllllIIlIIIllIlIIlIIlllI + 4.0f, lllllllllllllIIlIIIllIlIIIlIllIl + lllllllllllllIIlIIIllIlIIIlIlIlI + 0.0f).tex((lllllllllllllIIlIIIllIlIIIllIIII + 8.0f) * 0.00390625f + lllllllllllllIIlIIIllIlIIIlllIlI, (lllllllllllllIIlIIIllIlIIIlIllll + lllllllllllllIIlIIIllIlIIIlIlIlI + 0.5f) * 0.00390625f + lllllllllllllIIlIIIllIlIIIlllIIl).color(lllllllllllllIIlIIIllIlIIIlllllI, lllllllllllllIIlIIIllIlIIIllllIl, lllllllllllllIIlIIIllIlIIIllllII, 0.8f).normal(0.0f, 0.0f, -1.0f).endVertex();
                            lllllllllllllIIlIIIllIlIIlIlIlII.pos(lllllllllllllIIlIIIllIlIIIlIlllI + 8.0f, lllllllllllllIIlIIIllIlIIlIIlllI + 0.0f, lllllllllllllIIlIIIllIlIIIlIllIl + lllllllllllllIIlIIIllIlIIIlIlIlI + 0.0f).tex((lllllllllllllIIlIIIllIlIIIllIIII + 8.0f) * 0.00390625f + lllllllllllllIIlIIIllIlIIIlllIlI, (lllllllllllllIIlIIIllIlIIIlIllll + lllllllllllllIIlIIIllIlIIIlIlIlI + 0.5f) * 0.00390625f + lllllllllllllIIlIIIllIlIIIlllIIl).color(lllllllllllllIIlIIIllIlIIIlllllI, lllllllllllllIIlIIIllIlIIIllllIl, lllllllllllllIIlIIIllIlIIIllllII, 0.8f).normal(0.0f, 0.0f, -1.0f).endVertex();
                            lllllllllllllIIlIIIllIlIIlIlIlII.pos(lllllllllllllIIlIIIllIlIIIlIlllI + 0.0f, lllllllllllllIIlIIIllIlIIlIIlllI + 0.0f, lllllllllllllIIlIIIllIlIIIlIllIl + lllllllllllllIIlIIIllIlIIIlIlIlI + 0.0f).tex((lllllllllllllIIlIIIllIlIIIllIIII + 0.0f) * 0.00390625f + lllllllllllllIIlIIIllIlIIIlllIlI, (lllllllllllllIIlIIIllIlIIIlIllll + lllllllllllllIIlIIIllIlIIIlIlIlI + 0.5f) * 0.00390625f + lllllllllllllIIlIIIllIlIIIlllIIl).color(lllllllllllllIIlIIIllIlIIIlllllI, lllllllllllllIIlIIIllIlIIIllllIl, lllllllllllllIIlIIIllIlIIIllllII, 0.8f).normal(0.0f, 0.0f, -1.0f).endVertex();
                            ++lllllllllllllIIlIIIllIlIIIlIlIlI;
                        }
                    }
                    if (llIllllllIIlIIl(lllllllllllllIIlIIIllIlIIIllIIIl, RenderGlobal.lIIlllllllIIIl[1])) {
                        int lllllllllllllIIlIIIllIlIIIlIlIIl = RenderGlobal.lIIlllllllIIIl[0];
                        "".length();
                        if ("  ".length() != "  ".length()) {
                            return;
                        }
                        while (!llIlllllIlllIII(lllllllllllllIIlIIIllIlIIIlIlIIl, RenderGlobal.lIIlllllllIIIl[8])) {
                            lllllllllllllIIlIIIllIlIIlIlIlII.pos(lllllllllllllIIlIIIllIlIIIlIlllI + 0.0f, lllllllllllllIIlIIIllIlIIlIIlllI + 4.0f, lllllllllllllIIlIIIllIlIIIlIllIl + lllllllllllllIIlIIIllIlIIIlIlIIl + 1.0f - 9.765625E-4f).tex((lllllllllllllIIlIIIllIlIIIllIIII + 0.0f) * 0.00390625f + lllllllllllllIIlIIIllIlIIIlllIlI, (lllllllllllllIIlIIIllIlIIIlIllll + lllllllllllllIIlIIIllIlIIIlIlIIl + 0.5f) * 0.00390625f + lllllllllllllIIlIIIllIlIIIlllIIl).color(lllllllllllllIIlIIIllIlIIIlllllI, lllllllllllllIIlIIIllIlIIIllllIl, lllllllllllllIIlIIIllIlIIIllllII, 0.8f).normal(0.0f, 0.0f, 1.0f).endVertex();
                            lllllllllllllIIlIIIllIlIIlIlIlII.pos(lllllllllllllIIlIIIllIlIIIlIlllI + 8.0f, lllllllllllllIIlIIIllIlIIlIIlllI + 4.0f, lllllllllllllIIlIIIllIlIIIlIllIl + lllllllllllllIIlIIIllIlIIIlIlIIl + 1.0f - 9.765625E-4f).tex((lllllllllllllIIlIIIllIlIIIllIIII + 8.0f) * 0.00390625f + lllllllllllllIIlIIIllIlIIIlllIlI, (lllllllllllllIIlIIIllIlIIIlIllll + lllllllllllllIIlIIIllIlIIIlIlIIl + 0.5f) * 0.00390625f + lllllllllllllIIlIIIllIlIIIlllIIl).color(lllllllllllllIIlIIIllIlIIIlllllI, lllllllllllllIIlIIIllIlIIIllllIl, lllllllllllllIIlIIIllIlIIIllllII, 0.8f).normal(0.0f, 0.0f, 1.0f).endVertex();
                            lllllllllllllIIlIIIllIlIIlIlIlII.pos(lllllllllllllIIlIIIllIlIIIlIlllI + 8.0f, lllllllllllllIIlIIIllIlIIlIIlllI + 0.0f, lllllllllllllIIlIIIllIlIIIlIllIl + lllllllllllllIIlIIIllIlIIIlIlIIl + 1.0f - 9.765625E-4f).tex((lllllllllllllIIlIIIllIlIIIllIIII + 8.0f) * 0.00390625f + lllllllllllllIIlIIIllIlIIIlllIlI, (lllllllllllllIIlIIIllIlIIIlIllll + lllllllllllllIIlIIIllIlIIIlIlIIl + 0.5f) * 0.00390625f + lllllllllllllIIlIIIllIlIIIlllIIl).color(lllllllllllllIIlIIIllIlIIIlllllI, lllllllllllllIIlIIIllIlIIIllllIl, lllllllllllllIIlIIIllIlIIIllllII, 0.8f).normal(0.0f, 0.0f, 1.0f).endVertex();
                            lllllllllllllIIlIIIllIlIIlIlIlII.pos(lllllllllllllIIlIIIllIlIIIlIlllI + 0.0f, lllllllllllllIIlIIIllIlIIlIIlllI + 0.0f, lllllllllllllIIlIIIllIlIIIlIllIl + lllllllllllllIIlIIIllIlIIIlIlIIl + 1.0f - 9.765625E-4f).tex((lllllllllllllIIlIIIllIlIIIllIIII + 0.0f) * 0.00390625f + lllllllllllllIIlIIIllIlIIIlllIlI, (lllllllllllllIIlIIIllIlIIIlIllll + lllllllllllllIIlIIIllIlIIIlIlIIl + 0.5f) * 0.00390625f + lllllllllllllIIlIIIllIlIIIlllIIl).color(lllllllllllllIIlIIIllIlIIIlllllI, lllllllllllllIIlIIIllIlIIIllllIl, lllllllllllllIIlIIIllIlIIIllllII, 0.8f).normal(0.0f, 0.0f, 1.0f).endVertex();
                            ++lllllllllllllIIlIIIllIlIIIlIlIIl;
                        }
                    }
                    lllllllllllllIIlIIIllIlIIlIlIlIl.draw();
                    ++lllllllllllllIIlIIIllIlIIIllIIIl;
                }
                ++lllllllllllllIIlIIIllIlIIIllIIlI;
            }
            ++lllllllllllllIIlIIIllIlIIIllIIll;
        }
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.disableBlend();
        GlStateManager.enableCull();
    }
    
    private void markBlocksForUpdate(final int lllllllllllllIIlIIIllIIIllIlllIl, final int lllllllllllllIIlIIIllIIIllIlllII, final int lllllllllllllIIlIIIllIIIllIlIlII, final int lllllllllllllIIlIIIllIIIllIlIIll, final int lllllllllllllIIlIIIllIIIllIlIIlI, final int lllllllllllllIIlIIIllIIIllIllIII) {
        this.viewFrustum.markBlocksForUpdate(lllllllllllllIIlIIIllIIIllIlllIl, lllllllllllllIIlIIIllIIIllIlllII, lllllllllllllIIlIIIllIIIllIlIlII, lllllllllllllIIlIIIllIIIllIlIIll, lllllllllllllIIlIIIllIIIllIlIIlI, lllllllllllllIIlIIIllIIIllIllIII);
    }
    
    private void preRenderDamagedBlocks() {
        GlStateManager.tryBlendFuncSeparate(RenderGlobal.lIIlllllllIIIl[61], RenderGlobal.lIIlllllllIIIl[62], RenderGlobal.lIIlllllllIIIl[1], RenderGlobal.lIIlllllllIIIl[0]);
        GlStateManager.enableBlend();
        GlStateManager.color(1.0f, 1.0f, 1.0f, 0.5f);
        GlStateManager.doPolygonOffset(-3.0f, -3.0f);
        GlStateManager.enablePolygonOffset();
        GlStateManager.alphaFunc(RenderGlobal.lIIlllllllIIIl[60], 0.1f);
        GlStateManager.enableAlpha();
        GlStateManager.pushMatrix();
    }
    
    private static boolean llIlllllIllllII(final int lllllllllllllIIlIIIlIlllIIIlllII, final int lllllllllllllIIlIIIlIlllIIIllIll) {
        return lllllllllllllIIlIIIlIlllIIIlllII > lllllllllllllIIlIIIlIlllIIIllIll;
    }
    
    public void renderEntities(final Entity lllllllllllllIIlIIIlllIIIllIIIIl, final ICamera lllllllllllllIIlIIIlllIIIllIIIII, final float lllllllllllllIIlIIIlllIIlIIIIIIl) {
        if (llIllllllIIIIII(this.renderEntitiesStartupCounter)) {
            this.renderEntitiesStartupCounter -= RenderGlobal.lIIlllllllIIIl[1];
            "".length();
            if (((80 + 48 + 6 + 23 ^ 20 + 185 - 157 + 140) & (0xA4 ^ 0xB6 ^ (0x3A ^ 0x9) ^ -" ".length())) != ((159 + 154 - 300 + 160 ^ 79 + 41 - 29 + 38) & (119 + 110 - 125 + 49 ^ 39 + 168 - 163 + 137 ^ -" ".length()))) {
                return;
            }
        }
        else {
            final double lllllllllllllIIlIIIlllIIlIIIIIII = lllllllllllllIIlIIIlllIIIllIIIIl.prevPosX + (lllllllllllllIIlIIIlllIIIllIIIIl.posX - lllllllllllllIIlIIIlllIIIllIIIIl.prevPosX) * lllllllllllllIIlIIIlllIIlIIIIIIl;
            final double lllllllllllllIIlIIIlllIIIlllllll = lllllllllllllIIlIIIlllIIIllIIIIl.prevPosY + (lllllllllllllIIlIIIlllIIIllIIIIl.posY - lllllllllllllIIlIIIlllIIIllIIIIl.prevPosY) * lllllllllllllIIlIIIlllIIlIIIIIIl;
            final double lllllllllllllIIlIIIlllIIIllllllI = lllllllllllllIIlIIIlllIIIllIIIIl.prevPosZ + (lllllllllllllIIlIIIlllIIIllIIIIl.posZ - lllllllllllllIIlIIIlllIIIllIIIIl.prevPosZ) * lllllllllllllIIlIIIlllIIlIIIIIIl;
            this.theWorld.theProfiler.startSection(RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[7]]);
            TileEntityRendererDispatcher.instance.cacheActiveRenderInfo(this.theWorld, this.mc.getTextureManager(), this.mc.fontRendererObj, this.mc.getRenderViewEntity(), lllllllllllllIIlIIIlllIIlIIIIIIl);
            this.renderManager.cacheActiveRenderInfo(this.theWorld, this.mc.fontRendererObj, this.mc.getRenderViewEntity(), this.mc.pointedEntity, this.mc.gameSettings, lllllllllllllIIlIIIlllIIlIIIIIIl);
            this.countEntitiesTotal = RenderGlobal.lIIlllllllIIIl[0];
            this.countEntitiesRendered = RenderGlobal.lIIlllllllIIIl[0];
            this.countEntitiesHidden = RenderGlobal.lIIlllllllIIIl[0];
            final Entity lllllllllllllIIlIIIlllIIIlllllIl = this.mc.getRenderViewEntity();
            final double lllllllllllllIIlIIIlllIIIlllllII = lllllllllllllIIlIIIlllIIIlllllIl.lastTickPosX + (lllllllllllllIIlIIIlllIIIlllllIl.posX - lllllllllllllIIlIIIlllIIIlllllIl.lastTickPosX) * lllllllllllllIIlIIIlllIIlIIIIIIl;
            final double lllllllllllllIIlIIIlllIIIllllIll = lllllllllllllIIlIIIlllIIIlllllIl.lastTickPosY + (lllllllllllllIIlIIIlllIIIlllllIl.posY - lllllllllllllIIlIIIlllIIIlllllIl.lastTickPosY) * lllllllllllllIIlIIIlllIIlIIIIIIl;
            final double lllllllllllllIIlIIIlllIIIllllIlI = lllllllllllllIIlIIIlllIIIlllllIl.lastTickPosZ + (lllllllllllllIIlIIIlllIIIlllllIl.posZ - lllllllllllllIIlIIIlllIIIlllllIl.lastTickPosZ) * lllllllllllllIIlIIIlllIIlIIIIIIl;
            TileEntityRendererDispatcher.staticPlayerX = lllllllllllllIIlIIIlllIIIlllllII;
            TileEntityRendererDispatcher.staticPlayerY = lllllllllllllIIlIIIlllIIIllllIll;
            TileEntityRendererDispatcher.staticPlayerZ = lllllllllllllIIlIIIlllIIIllllIlI;
            this.renderManager.setRenderPosition(lllllllllllllIIlIIIlllIIIlllllII, lllllllllllllIIlIIIlllIIIllllIll, lllllllllllllIIlIIIlllIIIllllIlI);
            this.mc.entityRenderer.enableLightmap();
            this.theWorld.theProfiler.endStartSection(RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[24]]);
            final List<Entity> lllllllllllllIIlIIIlllIIIllllIIl = this.theWorld.getLoadedEntityList();
            this.countEntitiesTotal = lllllllllllllIIlIIIlllIIIllllIIl.size();
            int lllllllllllllIIlIIIlllIIIllllIII = RenderGlobal.lIIlllllllIIIl[0];
            "".length();
            if (((0x61 ^ 0x57) & ~(0x9D ^ 0xAB)) != 0x0) {
                return;
            }
            while (!llIlllllIlllIII(lllllllllllllIIlIIIlllIIIllllIII, this.theWorld.weatherEffects.size())) {
                final Entity lllllllllllllIIlIIIlllIIIlllIlll = this.theWorld.weatherEffects.get(lllllllllllllIIlIIIlllIIIllllIII);
                this.countEntitiesRendered += RenderGlobal.lIIlllllllIIIl[1];
                if (llIlllllIllIlll(lllllllllllllIIlIIIlllIIIlllIlll.isInRangeToRender3d(lllllllllllllIIlIIIlllIIlIIIIIII, lllllllllllllIIlIIIlllIIIlllllll, lllllllllllllIIlIIIlllIIIllllllI) ? 1 : 0)) {
                    this.renderManager.renderEntitySimple(lllllllllllllIIlIIIlllIIIlllIlll, lllllllllllllIIlIIIlllIIlIIIIIIl);
                    "".length();
                }
                ++lllllllllllllIIlIIIlllIIIllllIII;
            }
            if (llIlllllIllIlll(this.isRenderEntityOutlines() ? 1 : 0)) {
                GlStateManager.depthFunc(RenderGlobal.lIIlllllllIIIl[25]);
                GlStateManager.disableFog();
                this.entityOutlineFramebuffer.framebufferClear();
                this.entityOutlineFramebuffer.bindFramebuffer((boolean)(RenderGlobal.lIIlllllllIIIl[0] != 0));
                this.theWorld.theProfiler.endStartSection(RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[26]]);
                RenderHelper.disableStandardItemLighting();
                this.renderManager.setRenderOutlines((boolean)(RenderGlobal.lIIlllllllIIIl[1] != 0));
                int lllllllllllllIIlIIIlllIIIlllIllI = RenderGlobal.lIIlllllllIIIl[0];
                "".length();
                if ("  ".length() == 0) {
                    return;
                }
                while (!llIlllllIlllIII(lllllllllllllIIlIIIlllIIIlllIllI, lllllllllllllIIlIIIlllIIIllllIIl.size())) {
                    final Entity lllllllllllllIIlIIIlllIIIlllIlIl = lllllllllllllIIlIIIlllIIIllllIIl.get(lllllllllllllIIlIIIlllIIIlllIllI);
                    int n;
                    if (llIlllllIllIlll((this.mc.getRenderViewEntity() instanceof EntityLivingBase) ? 1 : 0) && llIlllllIllIlll(((EntityLivingBase)this.mc.getRenderViewEntity()).isPlayerSleeping() ? 1 : 0)) {
                        n = RenderGlobal.lIIlllllllIIIl[1];
                        "".length();
                        if (((0x26 ^ 0x3C) & ~(0xD ^ 0x17)) > " ".length()) {
                            return;
                        }
                    }
                    else {
                        n = RenderGlobal.lIIlllllllIIIl[0];
                    }
                    final boolean lllllllllllllIIlIIIlllIIIlllIlII = n != 0;
                    int n2;
                    if (llIlllllIllIlll(lllllllllllllIIlIIIlllIIIlllIlIl.isInRangeToRender3d(lllllllllllllIIlIIIlllIIlIIIIIII, lllllllllllllIIlIIIlllIIIlllllll, lllllllllllllIIlIIIlllIIIllllllI) ? 1 : 0) && (!llIllllllIIIIIl(lllllllllllllIIlIIIlllIIIlllIlIl.ignoreFrustumCheck ? 1 : 0) || !llIllllllIIIIIl(lllllllllllllIIlIIIlllIIIllIIIII.isBoundingBoxInFrustum(lllllllllllllIIlIIIlllIIIlllIlIl.getEntityBoundingBox()) ? 1 : 0) || llIllllllIIIlIl(lllllllllllllIIlIIIlllIIIlllIlIl.riddenByEntity, this.mc.thePlayer)) && llIlllllIllIlll((lllllllllllllIIlIIIlllIIIlllIlIl instanceof EntityPlayer) ? 1 : 0)) {
                        n2 = RenderGlobal.lIIlllllllIIIl[1];
                        "".length();
                        if (null != null) {
                            return;
                        }
                    }
                    else {
                        n2 = RenderGlobal.lIIlllllllIIIl[0];
                    }
                    final boolean lllllllllllllIIlIIIlllIIIlllIIll = n2 != 0;
                    if ((!llIllllllIIIlIl(lllllllllllllIIlIIIlllIIIlllIlIl, this.mc.getRenderViewEntity()) || !llIllllllIIIIIl(this.mc.gameSettings.thirdPersonView) || llIlllllIllIlll(lllllllllllllIIlIIIlllIIIlllIlII ? 1 : 0)) && llIlllllIllIlll(lllllllllllllIIlIIIlllIIIlllIIll ? 1 : 0)) {
                        this.renderManager.renderEntitySimple(lllllllllllllIIlIIIlllIIIlllIlIl, lllllllllllllIIlIIIlllIIlIIIIIIl);
                        "".length();
                    }
                    ++lllllllllllllIIlIIIlllIIIlllIllI;
                }
                this.renderManager.setRenderOutlines((boolean)(RenderGlobal.lIIlllllllIIIl[0] != 0));
                RenderHelper.enableStandardItemLighting();
                GlStateManager.depthMask((boolean)(RenderGlobal.lIIlllllllIIIl[0] != 0));
                this.entityOutlineShader.loadShaderGroup(lllllllllllllIIlIIIlllIIlIIIIIIl);
                GlStateManager.enableLighting();
                GlStateManager.depthMask((boolean)(RenderGlobal.lIIlllllllIIIl[1] != 0));
                this.mc.getFramebuffer().bindFramebuffer((boolean)(RenderGlobal.lIIlllllllIIIl[0] != 0));
                GlStateManager.enableFog();
                GlStateManager.enableBlend();
                GlStateManager.enableColorMaterial();
                GlStateManager.depthFunc(RenderGlobal.lIIlllllllIIIl[27]);
                GlStateManager.enableDepth();
                GlStateManager.enableAlpha();
            }
            this.theWorld.theProfiler.endStartSection(RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[28]]);
            final Iterator<ContainerLocalRenderInformation> iterator = this.renderInfos.iterator();
            "".length();
            if ("  ".length() == -" ".length()) {
                return;
            }
            while (!llIllllllIIIIIl(iterator.hasNext() ? 1 : 0)) {
                final ContainerLocalRenderInformation lllllllllllllIIlIIIlllIIIlllIIlI = iterator.next();
                final Chunk lllllllllllllIIlIIIlllIIIlllIIIl = this.theWorld.getChunkFromBlockCoords(lllllllllllllIIlIIIlllIIIlllIIlI.renderChunk.getPosition());
                final ClassInheritanceMultiMap<Entity> lllllllllllllIIlIIIlllIIIlllIIII = lllllllllllllIIlIIIlllIIIlllIIIl.getEntityLists()[lllllllllllllIIlIIIlllIIIlllIIlI.renderChunk.getPosition().getY() / RenderGlobal.lIIlllllllIIIl[29]];
                if (llIllllllIIIIIl(lllllllllllllIIlIIIlllIIIlllIIII.isEmpty() ? 1 : 0)) {
                    final Iterator lllllllllllllIIlIIIlllIIIllIllll = lllllllllllllIIlIIIlllIIIlllIIII.iterator();
                    while (!llIllllllIIIIIl(lllllllllllllIIlIIIlllIIIllIllll.hasNext() ? 1 : 0)) {
                        final Entity lllllllllllllIIlIIIlllIIIllIlllI = lllllllllllllIIlIIIlllIIIllIllll.next();
                        int n3;
                        if (llIllllllIIIIIl(this.renderManager.shouldRender(lllllllllllllIIlIIIlllIIIllIlllI, lllllllllllllIIlIIIlllIIIllIIIII, lllllllllllllIIlIIIlllIIlIIIIIII, lllllllllllllIIlIIIlllIIIlllllll, lllllllllllllIIlIIIlllIIIllllllI) ? 1 : 0) && llIllllllIIIllI(lllllllllllllIIlIIIlllIIIllIlllI.riddenByEntity, this.mc.thePlayer)) {
                            n3 = RenderGlobal.lIIlllllllIIIl[0];
                            "".length();
                            if (-"  ".length() > 0) {
                                return;
                            }
                        }
                        else {
                            n3 = RenderGlobal.lIIlllllllIIIl[1];
                        }
                        final boolean lllllllllllllIIlIIIlllIIIllIllIl = n3 != 0;
                        if (llIllllllIIIIIl(lllllllllllllIIlIIIlllIIIllIllIl ? 1 : 0)) {
                            "".length();
                            if ("   ".length() < 0) {
                                return;
                            }
                        }
                        else {
                            int playerSleeping;
                            if (llIlllllIllIlll((this.mc.getRenderViewEntity() instanceof EntityLivingBase) ? 1 : 0)) {
                                playerSleeping = (((EntityLivingBase)this.mc.getRenderViewEntity()).isPlayerSleeping() ? 1 : 0);
                                "".length();
                                if ((0x3F ^ 0x3B) < "  ".length()) {
                                    return;
                                }
                            }
                            else {
                                playerSleeping = RenderGlobal.lIIlllllllIIIl[0];
                            }
                            final boolean lllllllllllllIIlIIIlllIIIllIllII = playerSleeping != 0;
                            if ((llIllllllIIIlIl(lllllllllllllIIlIIIlllIIIllIlllI, this.mc.getRenderViewEntity()) && llIllllllIIIIIl(this.mc.gameSettings.thirdPersonView) && !llIlllllIllIlll(lllllllllllllIIlIIIlllIIIllIllII ? 1 : 0)) || (llIlllllIlllIll(llIllllllIIIIll(lllllllllllllIIlIIIlllIIIllIlllI.posY, 0.0)) && llIlllllIllllll(llIllllllIIIlII(lllllllllllllIIlIIIlllIIIllIlllI.posY, 256.0)) && !llIlllllIllIlll(this.theWorld.isBlockLoaded(new BlockPos(lllllllllllllIIlIIIlllIIIllIlllI)) ? 1 : 0))) {
                                continue;
                            }
                            this.countEntitiesRendered += RenderGlobal.lIIlllllllIIIl[1];
                            this.renderManager.renderEntitySimple(lllllllllllllIIlIIIlllIIIllIlllI, lllllllllllllIIlIIIlllIIlIIIIIIl);
                            "".length();
                        }
                        if (llIllllllIIIIIl(lllllllllllllIIlIIIlllIIIllIllIl ? 1 : 0) && llIlllllIllIlll((lllllllllllllIIlIIIlllIIIllIlllI instanceof EntityWitherSkull) ? 1 : 0)) {
                            this.mc.getRenderManager().renderWitherSkull(lllllllllllllIIlIIIlllIIIllIlllI, lllllllllllllIIlIIIlllIIlIIIIIIl);
                            "".length();
                            if (-" ".length() != -" ".length()) {
                                return;
                            }
                            continue;
                        }
                    }
                    "".length();
                    if ((0x1E ^ 0x1A) < (0x63 ^ 0x67)) {
                        return;
                    }
                    continue;
                }
            }
            this.theWorld.theProfiler.endStartSection(RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[30]]);
            RenderHelper.enableStandardItemLighting();
            final Iterator<ContainerLocalRenderInformation> iterator2 = this.renderInfos.iterator();
            "".length();
            if (((0x92 ^ 0x9D ^ (0xC4 ^ 0x97)) & (140 + 5 + 40 + 15 ^ 73 + 38 - 17 + 54 ^ -" ".length())) != ((0xBE ^ 0xC3 ^ (0xDD ^ 0xAE)) & (51 + 44 + 24 + 48 ^ 45 + 81 - 50 + 93 ^ -" ".length()))) {
                return;
            }
            while (!llIllllllIIIIIl(iterator2.hasNext() ? 1 : 0)) {
                final ContainerLocalRenderInformation lllllllllllllIIlIIIlllIIIllIlIll = iterator2.next();
                final List<TileEntity> lllllllllllllIIlIIIlllIIIllIlIlI = lllllllllllllIIlIIIlllIIIllIlIll.renderChunk.getCompiledChunk().getTileEntities();
                if (llIllllllIIIIIl(lllllllllllllIIlIIIlllIIIllIlIlI.isEmpty() ? 1 : 0)) {
                    final Iterator<TileEntity> iterator3 = lllllllllllllIIlIIIlllIIIllIlIlI.iterator();
                    "".length();
                    if (-"  ".length() >= 0) {
                        return;
                    }
                    while (!llIllllllIIIIIl(iterator3.hasNext() ? 1 : 0)) {
                        final TileEntity lllllllllllllIIlIIIlllIIIllIlIIl = iterator3.next();
                        TileEntityRendererDispatcher.instance.renderTileEntity(lllllllllllllIIlIIIlllIIIllIlIIl, lllllllllllllIIlIIIlllIIlIIIIIIl, RenderGlobal.lIIlllllllIIIl[6]);
                    }
                }
            }
            synchronized (this.field_181024_n) {
                final short lllllllllllllIIlIIIlllIIIlIlIlII = (short)this.field_181024_n.iterator();
                "".length();
                if (-" ".length() >= "   ".length()) {
                    return;
                }
                while (!llIllllllIIIIIl(((Iterator)lllllllllllllIIlIIIlllIIIlIlIlII).hasNext() ? 1 : 0)) {
                    final TileEntity lllllllllllllIIlIIIlllIIIllIlIII = ((Iterator<TileEntity>)lllllllllllllIIlIIIlllIIIlIlIlII).next();
                    TileEntityRendererDispatcher.instance.renderTileEntity(lllllllllllllIIlIIIlllIIIllIlIII, lllllllllllllIIlIIIlllIIlIIIIIIl, RenderGlobal.lIIlllllllIIIl[6]);
                }
                // monitorexit(this.field_181024_n)
                "".length();
                if (null != null) {
                    return;
                }
            }
            this.preRenderDamagedBlocks();
            final Iterator<DestroyBlockProgress> iterator4 = this.damagedBlocks.values().iterator();
            "".length();
            if (-"  ".length() >= 0) {
                return;
            }
            while (!llIllllllIIIIIl(iterator4.hasNext() ? 1 : 0)) {
                final DestroyBlockProgress lllllllllllllIIlIIIlllIIIllIIlll = iterator4.next();
                BlockPos lllllllllllllIIlIIIlllIIIllIIllI = lllllllllllllIIlIIIlllIIIllIIlll.getPosition();
                TileEntity lllllllllllllIIlIIIlllIIIllIIlIl = this.theWorld.getTileEntity(lllllllllllllIIlIIIlllIIIllIIllI);
                if (llIlllllIllIlll((lllllllllllllIIlIIIlllIIIllIIlIl instanceof TileEntityChest) ? 1 : 0)) {
                    final TileEntityChest lllllllllllllIIlIIIlllIIIllIIlII = (TileEntityChest)lllllllllllllIIlIIIlllIIIllIIlIl;
                    if (llIlllllIlllIlI(lllllllllllllIIlIIIlllIIIllIIlII.adjacentChestXNeg)) {
                        lllllllllllllIIlIIIlllIIIllIIllI = lllllllllllllIIlIIIlllIIIllIIllI.offset(EnumFacing.WEST);
                        lllllllllllllIIlIIIlllIIIllIIlIl = this.theWorld.getTileEntity(lllllllllllllIIlIIIlllIIIllIIllI);
                        "".length();
                        if (null != null) {
                            return;
                        }
                    }
                    else if (llIlllllIlllIlI(lllllllllllllIIlIIIlllIIIllIIlII.adjacentChestZNeg)) {
                        lllllllllllllIIlIIIlllIIIllIIllI = lllllllllllllIIlIIIlllIIIllIIllI.offset(EnumFacing.NORTH);
                        lllllllllllllIIlIIIlllIIIllIIlIl = this.theWorld.getTileEntity(lllllllllllllIIlIIIlllIIIllIIllI);
                    }
                }
                final Block lllllllllllllIIlIIIlllIIIllIIIll = this.theWorld.getBlockState(lllllllllllllIIlIIIlllIIIllIIllI).getBlock();
                if (llIlllllIlllIlI(lllllllllllllIIlIIIlllIIIllIIlIl) && (!llIllllllIIIIIl((lllllllllllllIIlIIIlllIIIllIIIll instanceof BlockChest) ? 1 : 0) || !llIllllllIIIIIl((lllllllllllllIIlIIIlllIIIllIIIll instanceof BlockEnderChest) ? 1 : 0) || !llIllllllIIIIIl((lllllllllllllIIlIIIlllIIIllIIIll instanceof BlockSign) ? 1 : 0) || llIlllllIllIlll((lllllllllllllIIlIIIlllIIIllIIIll instanceof BlockSkull) ? 1 : 0))) {
                    TileEntityRendererDispatcher.instance.renderTileEntity(lllllllllllllIIlIIIlllIIIllIIlIl, lllllllllllllIIlIIIlllIIlIIIIIIl, lllllllllllllIIlIIIlllIIIllIIlll.getPartialBlockDamage());
                }
            }
            this.postRenderDamagedBlocks();
            this.mc.entityRenderer.disableLightmap();
            this.mc.mcProfiler.endSection();
        }
    }
    
    @Override
    public void broadcastSound(final int lllllllllllllIIlIIIlIlllllllIIIl, final BlockPos lllllllllllllIIlIIIlIlllllllllII, final int lllllllllllllIIlIIIlIllllllllIll) {
        switch (lllllllllllllIIlIIIlIlllllllIIIl) {
            case 1013:
            case 1018: {
                if (!llIlllllIlllIlI(this.mc.getRenderViewEntity())) {
                    break;
                }
                final double lllllllllllllIIlIIIlIllllllllIlI = lllllllllllllIIlIIIlIlllllllllII.getX() - this.mc.getRenderViewEntity().posX;
                final double lllllllllllllIIlIIIlIllllllllIIl = lllllllllllllIIlIIIlIlllllllllII.getY() - this.mc.getRenderViewEntity().posY;
                final double lllllllllllllIIlIIIlIllllllllIII = lllllllllllllIIlIIIlIlllllllllII.getZ() - this.mc.getRenderViewEntity().posZ;
                final double lllllllllllllIIlIIIlIlllllllIlll = Math.sqrt(lllllllllllllIIlIIIlIllllllllIlI * lllllllllllllIIlIIIlIllllllllIlI + lllllllllllllIIlIIIlIllllllllIIl * lllllllllllllIIlIIIlIllllllllIIl + lllllllllllllIIlIIIlIllllllllIII * lllllllllllllIIlIIIlIllllllllIII);
                double lllllllllllllIIlIIIlIlllllllIllI = this.mc.getRenderViewEntity().posX;
                double lllllllllllllIIlIIIlIlllllllIlIl = this.mc.getRenderViewEntity().posY;
                double lllllllllllllIIlIIIlIlllllllIlII = this.mc.getRenderViewEntity().posZ;
                if (llIllllllIIIIII(llIllllllIllIlI(lllllllllllllIIlIIIlIlllllllIlll, 0.0))) {
                    lllllllllllllIIlIIIlIlllllllIllI += lllllllllllllIIlIIIlIllllllllIlI / lllllllllllllIIlIIIlIlllllllIlll * 2.0;
                    lllllllllllllIIlIIIlIlllllllIlIl += lllllllllllllIIlIIIlIllllllllIIl / lllllllllllllIIlIIIlIlllllllIlll * 2.0;
                    lllllllllllllIIlIIIlIlllllllIlII += lllllllllllllIIlIIIlIllllllllIII / lllllllllllllIIlIIIlIlllllllIlll * 2.0;
                }
                if (!llIllllllIIlIII(lllllllllllllIIlIIIlIlllllllIIIl, RenderGlobal.lIIlllllllIIIl[67])) {
                    this.theWorld.playSound(lllllllllllllIIlIIIlIlllllllIllI, lllllllllllllIIlIIIlIlllllllIlIl, lllllllllllllIIlIIIlIlllllllIlII, RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[69]], 5.0f, 1.0f, (boolean)(RenderGlobal.lIIlllllllIIIl[0] != 0));
                    break;
                }
                this.theWorld.playSound(lllllllllllllIIlIIIlIlllllllIllI, lllllllllllllIIlIIIlIlllllllIlIl, lllllllllllllIIlIIIlIlllllllIlII, RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[68]], 1.0f, 1.0f, (boolean)(RenderGlobal.lIIlllllllIIIl[0] != 0));
                "".length();
                if (null != null) {
                    return;
                }
                break;
            }
        }
    }
    
    private static boolean llIllllllIIIIII(final int lllllllllllllIIlIIIlIlllIIIIIIll) {
        return lllllllllllllIIlIIIlIlllIIIIIIll > 0;
    }
    
    public void drawBlockDamageTexture(final Tessellator lllllllllllllIIlIIIllIIlIlIIlIIl, final WorldRenderer lllllllllllllIIlIIIllIIlIlIIlIII, final Entity lllllllllllllIIlIIIllIIlIlIIIlll, final float lllllllllllllIIlIIIllIIlIIllIIll) {
        final double lllllllllllllIIlIIIllIIlIlIIIlIl = lllllllllllllIIlIIIllIIlIlIIIlll.lastTickPosX + (lllllllllllllIIlIIIllIIlIlIIIlll.posX - lllllllllllllIIlIIIllIIlIlIIIlll.lastTickPosX) * lllllllllllllIIlIIIllIIlIIllIIll;
        final double lllllllllllllIIlIIIllIIlIlIIIlII = lllllllllllllIIlIIIllIIlIlIIIlll.lastTickPosY + (lllllllllllllIIlIIIllIIlIlIIIlll.posY - lllllllllllllIIlIIIllIIlIlIIIlll.lastTickPosY) * lllllllllllllIIlIIIllIIlIIllIIll;
        final double lllllllllllllIIlIIIllIIlIlIIIIll = lllllllllllllIIlIIIllIIlIlIIIlll.lastTickPosZ + (lllllllllllllIIlIIIllIIlIlIIIlll.posZ - lllllllllllllIIlIIIllIIlIlIIIlll.lastTickPosZ) * lllllllllllllIIlIIIllIIlIIllIIll;
        if (llIllllllIIIIIl(this.damagedBlocks.isEmpty() ? 1 : 0)) {
            this.renderEngine.bindTexture(TextureMap.locationBlocksTexture);
            this.preRenderDamagedBlocks();
            lllllllllllllIIlIIIllIIlIlIIlIII.begin(RenderGlobal.lIIlllllllIIIl[15], DefaultVertexFormats.BLOCK);
            lllllllllllllIIlIIIllIIlIlIIlIII.setTranslation(-lllllllllllllIIlIIIllIIlIlIIIlIl, -lllllllllllllIIlIIIllIIlIlIIIlII, -lllllllllllllIIlIIIllIIlIlIIIIll);
            lllllllllllllIIlIIIllIIlIlIIlIII.markDirty();
            final Iterator<DestroyBlockProgress> lllllllllllllIIlIIIllIIlIlIIIIlI = this.damagedBlocks.values().iterator();
            "".length();
            if (-"   ".length() >= 0) {
                return;
            }
            while (!llIllllllIIIIIl(lllllllllllllIIlIIIllIIlIlIIIIlI.hasNext() ? 1 : 0)) {
                final DestroyBlockProgress lllllllllllllIIlIIIllIIlIlIIIIIl = lllllllllllllIIlIIIllIIlIlIIIIlI.next();
                final BlockPos lllllllllllllIIlIIIllIIlIlIIIIII = lllllllllllllIIlIIIllIIlIlIIIIIl.getPosition();
                final double lllllllllllllIIlIIIllIIlIIllllll = lllllllllllllIIlIIIllIIlIlIIIIII.getX() - lllllllllllllIIlIIIllIIlIlIIIlIl;
                final double lllllllllllllIIlIIIllIIlIIlllllI = lllllllllllllIIlIIIllIIlIlIIIIII.getY() - lllllllllllllIIlIIIllIIlIlIIIlII;
                final double lllllllllllllIIlIIIllIIlIIllllIl = lllllllllllllIIlIIIllIIlIlIIIIII.getZ() - lllllllllllllIIlIIIllIIlIlIIIIll;
                final Block lllllllllllllIIlIIIllIIlIIllllII = this.theWorld.getBlockState(lllllllllllllIIlIIIllIIlIlIIIIII).getBlock();
                if (llIllllllIIIIIl((lllllllllllllIIlIIIllIIlIIllllII instanceof BlockChest) ? 1 : 0) && llIllllllIIIIIl((lllllllllllllIIlIIIllIIlIIllllII instanceof BlockEnderChest) ? 1 : 0) && llIllllllIIIIIl((lllllllllllllIIlIIIllIIlIIllllII instanceof BlockSign) ? 1 : 0) && llIllllllIIIIIl((lllllllllllllIIlIIIllIIlIIllllII instanceof BlockSkull) ? 1 : 0)) {
                    if (llIllllllIIIIII(llIllllllIllIII(lllllllllllllIIlIIIllIIlIIllllll * lllllllllllllIIlIIIllIIlIIllllll + lllllllllllllIIlIIIllIIlIIlllllI * lllllllllllllIIlIIIllIIlIIlllllI + lllllllllllllIIlIIIllIIlIIllllIl * lllllllllllllIIlIIIllIIlIIllllIl, 1024.0))) {
                        lllllllllllllIIlIIIllIIlIlIIIIlI.remove();
                        "".length();
                        if ("   ".length() == 0) {
                            return;
                        }
                        continue;
                    }
                    else {
                        final IBlockState lllllllllllllIIlIIIllIIlIIlllIll = this.theWorld.getBlockState(lllllllllllllIIlIIIllIIlIlIIIIII);
                        if (!llIllllllIIIllI(lllllllllllllIIlIIIllIIlIIlllIll.getBlock().getMaterial(), Material.air)) {
                            continue;
                        }
                        final int lllllllllllllIIlIIIllIIlIIlllIlI = lllllllllllllIIlIIIllIIlIlIIIIIl.getPartialBlockDamage();
                        final TextureAtlasSprite lllllllllllllIIlIIIllIIlIIlllIIl = this.destroyBlockIcons[lllllllllllllIIlIIIllIIlIIlllIlI];
                        final BlockRendererDispatcher lllllllllllllIIlIIIllIIlIIlllIII = this.mc.getBlockRendererDispatcher();
                        lllllllllllllIIlIIIllIIlIIlllIII.renderBlockDamage(lllllllllllllIIlIIIllIIlIIlllIll, lllllllllllllIIlIIIllIIlIlIIIIII, lllllllllllllIIlIIIllIIlIIlllIIl, this.theWorld);
                    }
                }
            }
            lllllllllllllIIlIIIllIIlIlIIlIIl.draw();
            lllllllllllllIIlIIIllIIlIlIIlIII.setTranslation(0.0, 0.0, 0.0);
            this.postRenderDamagedBlocks();
        }
    }
    
    private static boolean llIllllllIIIlIl(final Object lllllllllllllIIlIIIlIlllIIIlIIlI, final Object lllllllllllllIIlIIIlIlllIIIlIIIl) {
        return lllllllllllllIIlIIIlIlllIIIlIIlI == lllllllllllllIIlIIIlIlllIIIlIIIl;
    }
    
    public void setWorldAndLoadRenderers(final WorldClient lllllllllllllIIlIIIlllIIlIlIlllI) {
        if (llIlllllIlllIlI(this.theWorld)) {
            this.theWorld.removeWorldAccess(this);
        }
        this.frustumUpdatePosX = Double.MIN_VALUE;
        this.frustumUpdatePosY = Double.MIN_VALUE;
        this.frustumUpdatePosZ = Double.MIN_VALUE;
        this.frustumUpdatePosChunkX = Integer.MIN_VALUE;
        this.frustumUpdatePosChunkY = Integer.MIN_VALUE;
        this.frustumUpdatePosChunkZ = Integer.MIN_VALUE;
        this.renderManager.set(lllllllllllllIIlIIIlllIIlIlIlllI);
        this.theWorld = lllllllllllllIIlIIIlllIIlIlIlllI;
        if (llIlllllIlllIlI(lllllllllllllIIlIIIlllIIlIlIlllI)) {
            lllllllllllllIIlIIIlllIIlIlIlllI.addWorldAccess(this);
            this.loadRenderers();
        }
    }
    
    protected void stopChunkUpdates() {
        this.chunksToUpdate.clear();
        this.renderDispatcher.stopChunkUpdates();
    }
    
    @Override
    public void onResourceManagerReload(final IResourceManager lllllllllllllIIlIIIlllIlIllIIIll) {
        this.updateDestroyBlockIcons();
    }
    
    private static int llIllllllIlIIIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean llIllllllIlIIll(final int lllllllllllllIIlIIIlIlllIIIIIlIl) {
        return lllllllllllllIIlIIIlIlllIIIIIlIl <= 0;
    }
    
    private static boolean llIllllllIIIIIl(final int lllllllllllllIIlIIIlIlllIIIIlIll) {
        return lllllllllllllIIlIIIlIlllIIIIlIll == 0;
    }
    
    public static void func_181561_a(final AxisAlignedBB lllllllllllllIIlIIIllIIIllllllIl) {
        final Tessellator lllllllllllllIIlIIIllIIIllllllll = Tessellator.getInstance();
        final WorldRenderer lllllllllllllIIlIIIllIIIlllllllI = lllllllllllllIIlIIIllIIIllllllll.getWorldRenderer();
        lllllllllllllIIlIIIllIIIlllllllI.begin(RenderGlobal.lIIlllllllIIIl[3], DefaultVertexFormats.POSITION);
        lllllllllllllIIlIIIllIIIlllllllI.pos(lllllllllllllIIlIIIllIIIllllllIl.minX, lllllllllllllIIlIIIllIIIllllllIl.minY, lllllllllllllIIlIIIllIIIllllllIl.minZ).endVertex();
        lllllllllllllIIlIIIllIIIlllllllI.pos(lllllllllllllIIlIIIllIIIllllllIl.maxX, lllllllllllllIIlIIIllIIIllllllIl.minY, lllllllllllllIIlIIIllIIIllllllIl.minZ).endVertex();
        lllllllllllllIIlIIIllIIIlllllllI.pos(lllllllllllllIIlIIIllIIIllllllIl.maxX, lllllllllllllIIlIIIllIIIllllllIl.minY, lllllllllllllIIlIIIllIIIllllllIl.maxZ).endVertex();
        lllllllllllllIIlIIIllIIIlllllllI.pos(lllllllllllllIIlIIIllIIIllllllIl.minX, lllllllllllllIIlIIIllIIIllllllIl.minY, lllllllllllllIIlIIIllIIIllllllIl.maxZ).endVertex();
        lllllllllllllIIlIIIllIIIlllllllI.pos(lllllllllllllIIlIIIllIIIllllllIl.minX, lllllllllllllIIlIIIllIIIllllllIl.minY, lllllllllllllIIlIIIllIIIllllllIl.minZ).endVertex();
        lllllllllllllIIlIIIllIIIllllllll.draw();
        lllllllllllllIIlIIIllIIIlllllllI.begin(RenderGlobal.lIIlllllllIIIl[3], DefaultVertexFormats.POSITION);
        lllllllllllllIIlIIIllIIIlllllllI.pos(lllllllllllllIIlIIIllIIIllllllIl.minX, lllllllllllllIIlIIIllIIIllllllIl.maxY, lllllllllllllIIlIIIllIIIllllllIl.minZ).endVertex();
        lllllllllllllIIlIIIllIIIlllllllI.pos(lllllllllllllIIlIIIllIIIllllllIl.maxX, lllllllllllllIIlIIIllIIIllllllIl.maxY, lllllllllllllIIlIIIllIIIllllllIl.minZ).endVertex();
        lllllllllllllIIlIIIllIIIlllllllI.pos(lllllllllllllIIlIIIllIIIllllllIl.maxX, lllllllllllllIIlIIIllIIIllllllIl.maxY, lllllllllllllIIlIIIllIIIllllllIl.maxZ).endVertex();
        lllllllllllllIIlIIIllIIIlllllllI.pos(lllllllllllllIIlIIIllIIIllllllIl.minX, lllllllllllllIIlIIIllIIIllllllIl.maxY, lllllllllllllIIlIIIllIIIllllllIl.maxZ).endVertex();
        lllllllllllllIIlIIIllIIIlllllllI.pos(lllllllllllllIIlIIIllIIIllllllIl.minX, lllllllllllllIIlIIIllIIIllllllIl.maxY, lllllllllllllIIlIIIllIIIllllllIl.minZ).endVertex();
        lllllllllllllIIlIIIllIIIllllllll.draw();
        lllllllllllllIIlIIIllIIIlllllllI.begin(RenderGlobal.lIIlllllllIIIl[1], DefaultVertexFormats.POSITION);
        lllllllllllllIIlIIIllIIIlllllllI.pos(lllllllllllllIIlIIIllIIIllllllIl.minX, lllllllllllllIIlIIIllIIIllllllIl.minY, lllllllllllllIIlIIIllIIIllllllIl.minZ).endVertex();
        lllllllllllllIIlIIIllIIIlllllllI.pos(lllllllllllllIIlIIIllIIIllllllIl.minX, lllllllllllllIIlIIIllIIIllllllIl.maxY, lllllllllllllIIlIIIllIIIllllllIl.minZ).endVertex();
        lllllllllllllIIlIIIllIIIlllllllI.pos(lllllllllllllIIlIIIllIIIllllllIl.maxX, lllllllllllllIIlIIIllIIIllllllIl.minY, lllllllllllllIIlIIIllIIIllllllIl.minZ).endVertex();
        lllllllllllllIIlIIIllIIIlllllllI.pos(lllllllllllllIIlIIIllIIIllllllIl.maxX, lllllllllllllIIlIIIllIIIllllllIl.maxY, lllllllllllllIIlIIIllIIIllllllIl.minZ).endVertex();
        lllllllllllllIIlIIIllIIIlllllllI.pos(lllllllllllllIIlIIIllIIIllllllIl.maxX, lllllllllllllIIlIIIllIIIllllllIl.minY, lllllllllllllIIlIIIllIIIllllllIl.maxZ).endVertex();
        lllllllllllllIIlIIIllIIIlllllllI.pos(lllllllllllllIIlIIIllIIIllllllIl.maxX, lllllllllllllIIlIIIllIIIllllllIl.maxY, lllllllllllllIIlIIIllIIIllllllIl.maxZ).endVertex();
        lllllllllllllIIlIIIllIIIlllllllI.pos(lllllllllllllIIlIIIllIIIllllllIl.minX, lllllllllllllIIlIIIllIIIllllllIl.minY, lllllllllllllIIlIIIllIIIllllllIl.maxZ).endVertex();
        lllllllllllllIIlIIIllIIIlllllllI.pos(lllllllllllllIIlIIIllIIIllllllIl.minX, lllllllllllllIIlIIIllIIIllllllIl.maxY, lllllllllllllIIlIIIllIIIllllllIl.maxZ).endVertex();
        lllllllllllllIIlIIIllIIIllllllll.draw();
    }
    
    public void createBindEntityOutlineFbs(final int lllllllllllllIIlIIIlllIIlIIlllIl, final int lllllllllllllIIlIIIlllIIlIIlllII) {
        if (llIlllllIllIlll(OpenGlHelper.shadersSupported ? 1 : 0) && llIlllllIlllIlI(this.entityOutlineShader)) {
            this.entityOutlineShader.createBindFramebuffers(lllllllllllllIIlIIIlllIIlIIlllIl, lllllllllllllIIlIIIlllIIlIIlllII);
        }
    }
    
    private boolean isPositionInRenderChunk(final BlockPos lllllllllllllIIlIIIllIllllIlIlIl, final RenderChunk lllllllllllllIIlIIIllIllllIlIlII) {
        final BlockPos lllllllllllllIIlIIIllIllllIlIllI = lllllllllllllIIlIIIllIllllIlIlII.getPosition();
        int n;
        if (llIlllllIllllII(MathHelper.abs_int(lllllllllllllIIlIIIllIllllIlIlIl.getX() - lllllllllllllIIlIIIllIllllIlIllI.getX()), RenderGlobal.lIIlllllllIIIl[29])) {
            n = RenderGlobal.lIIlllllllIIIl[0];
            "".length();
            if ((74 + 107 - 105 + 56 ^ 17 + 40 - 44 + 115) < (0x93 ^ 0xC7 ^ (0x50 ^ 0x0))) {
                return ((0x0 ^ 0x1D ^ " ".length()) & (0xE2 ^ 0xC2 ^ (0xFE ^ 0xC2) ^ -" ".length())) != 0x0;
            }
        }
        else if (llIlllllIllllII(MathHelper.abs_int(lllllllllllllIIlIIIllIllllIlIlIl.getY() - lllllllllllllIIlIIIllIllllIlIllI.getY()), RenderGlobal.lIIlllllllIIIl[29])) {
            n = RenderGlobal.lIIlllllllIIIl[0];
            "".length();
            if ((0xB2 ^ 0x97 ^ (0xE4 ^ 0xC4)) <= 0) {
                return ((0x7F ^ 0x56 ^ (0xD0 ^ 0xA1)) & (0x6F ^ 0x49 ^ (0xBF ^ 0xC1) ^ -" ".length())) != 0x0;
            }
        }
        else if (llIllllllIIlIIl(MathHelper.abs_int(lllllllllllllIIlIIIllIllllIlIlIl.getZ() - lllllllllllllIIlIIIllIllllIlIllI.getZ()), RenderGlobal.lIIlllllllIIIl[29])) {
            n = RenderGlobal.lIIlllllllIIIl[1];
            "".length();
            if (-" ".length() > 0) {
                return ((0xD8 ^ 0x8E) & ~(0x26 ^ 0x70)) != 0x0;
            }
        }
        else {
            n = RenderGlobal.lIIlllllllIIIl[0];
        }
        return n != 0;
    }
    
    @Override
    public void onEntityRemoved(final Entity lllllllllllllIIlIIIllIIIIIIIlIlI) {
    }
    
    private static int llIllllllIIIlII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    protected boolean isRenderEntityOutlines() {
        if (llIlllllIlllIlI(this.entityOutlineFramebuffer) && llIlllllIlllIlI(this.entityOutlineShader) && llIlllllIlllIlI(this.mc.thePlayer) && llIlllllIllIlll(this.mc.thePlayer.isSpectator() ? 1 : 0) && llIlllllIllIlll(this.mc.gameSettings.keyBindSpectatorOutlines.isKeyDown() ? 1 : 0)) {
            return RenderGlobal.lIIlllllllIIIl[1] != 0;
        }
        return RenderGlobal.lIIlllllllIIIl[0] != 0;
    }
    
    private void renderStars(final WorldRenderer lllllllllllllIIlIIIlllIIllllIIIl) {
        final Random lllllllllllllIIlIIIlllIIllllIIII = new Random(10842L);
        lllllllllllllIIlIIIlllIIllllIIIl.begin(RenderGlobal.lIIlllllllIIIl[15], DefaultVertexFormats.POSITION);
        int lllllllllllllIIlIIIlllIIlllIllll = RenderGlobal.lIIlllllllIIIl[0];
        "".length();
        if ("   ".length() < 0) {
            return;
        }
        while (!llIlllllIlllIII(lllllllllllllIIlIIIlllIIlllIllll, RenderGlobal.lIIlllllllIIIl[23])) {
            double lllllllllllllIIlIIIlllIIlllIlllI = lllllllllllllIIlIIIlllIIllllIIII.nextFloat() * 2.0f - 1.0f;
            double lllllllllllllIIlIIIlllIIlllIllIl = lllllllllllllIIlIIIlllIIllllIIII.nextFloat() * 2.0f - 1.0f;
            double lllllllllllllIIlIIIlllIIlllIllII = lllllllllllllIIlIIIlllIIllllIIII.nextFloat() * 2.0f - 1.0f;
            final double lllllllllllllIIlIIIlllIIlllIlIll = 0.15f + lllllllllllllIIlIIIlllIIllllIIII.nextFloat() * 0.1f;
            double lllllllllllllIIlIIIlllIIlllIlIlI = lllllllllllllIIlIIIlllIIlllIlllI * lllllllllllllIIlIIIlllIIlllIlllI + lllllllllllllIIlIIIlllIIlllIllIl * lllllllllllllIIlIIIlllIIlllIllIl + lllllllllllllIIlIIIlllIIlllIllII * lllllllllllllIIlIIIlllIIlllIllII;
            if (llIlllllIllllll(llIlllllIllllIl(lllllllllllllIIlIIIlllIIlllIlIlI, 1.0)) && llIllllllIIIIII(llIlllllIlllllI(lllllllllllllIIlIIIlllIIlllIlIlI, 0.01))) {
                lllllllllllllIIlIIIlllIIlllIlIlI = 1.0 / Math.sqrt(lllllllllllllIIlIIIlllIIlllIlIlI);
                lllllllllllllIIlIIIlllIIlllIlllI *= lllllllllllllIIlIIIlllIIlllIlIlI;
                lllllllllllllIIlIIIlllIIlllIllIl *= lllllllllllllIIlIIIlllIIlllIlIlI;
                lllllllllllllIIlIIIlllIIlllIllII *= lllllllllllllIIlIIIlllIIlllIlIlI;
                final double lllllllllllllIIlIIIlllIIlllIlIIl = lllllllllllllIIlIIIlllIIlllIlllI * 100.0;
                final double lllllllllllllIIlIIIlllIIlllIlIII = lllllllllllllIIlIIIlllIIlllIllIl * 100.0;
                final double lllllllllllllIIlIIIlllIIlllIIlll = lllllllllllllIIlIIIlllIIlllIllII * 100.0;
                final double lllllllllllllIIlIIIlllIIlllIIllI = Math.atan2(lllllllllllllIIlIIIlllIIlllIlllI, lllllllllllllIIlIIIlllIIlllIllII);
                final double lllllllllllllIIlIIIlllIIlllIIlIl = Math.sin(lllllllllllllIIlIIIlllIIlllIIllI);
                final double lllllllllllllIIlIIIlllIIlllIIlII = Math.cos(lllllllllllllIIlIIIlllIIlllIIllI);
                final double lllllllllllllIIlIIIlllIIlllIIIll = Math.atan2(Math.sqrt(lllllllllllllIIlIIIlllIIlllIlllI * lllllllllllllIIlIIIlllIIlllIlllI + lllllllllllllIIlIIIlllIIlllIllII * lllllllllllllIIlIIIlllIIlllIllII), lllllllllllllIIlIIIlllIIlllIllIl);
                final double lllllllllllllIIlIIIlllIIlllIIIlI = Math.sin(lllllllllllllIIlIIIlllIIlllIIIll);
                final double lllllllllllllIIlIIIlllIIlllIIIIl = Math.cos(lllllllllllllIIlIIIlllIIlllIIIll);
                final double lllllllllllllIIlIIIlllIIlllIIIII = lllllllllllllIIlIIIlllIIllllIIII.nextDouble() * 3.141592653589793 * 2.0;
                final double lllllllllllllIIlIIIlllIIllIlllll = Math.sin(lllllllllllllIIlIIIlllIIlllIIIII);
                final double lllllllllllllIIlIIIlllIIllIllllI = Math.cos(lllllllllllllIIlIIIlllIIlllIIIII);
                int lllllllllllllIIlIIIlllIIllIlllIl = RenderGlobal.lIIlllllllIIIl[0];
                "".length();
                if (((0x15 ^ 0x56) & ~(0x4D ^ 0xE)) != 0x0) {
                    return;
                }
                while (!llIlllllIlllIII(lllllllllllllIIlIIIlllIIllIlllIl, RenderGlobal.lIIlllllllIIIl[4])) {
                    final double lllllllllllllIIlIIIlllIIllIlllII = 0.0;
                    final double lllllllllllllIIlIIIlllIIllIllIll = ((lllllllllllllIIlIIIlllIIllIlllIl & RenderGlobal.lIIlllllllIIIl[2]) - RenderGlobal.lIIlllllllIIIl[1]) * lllllllllllllIIlIIIlllIIlllIlIll;
                    final double lllllllllllllIIlIIIlllIIllIllIlI = ((lllllllllllllIIlIIIlllIIllIlllIl + RenderGlobal.lIIlllllllIIIl[1] & RenderGlobal.lIIlllllllIIIl[2]) - RenderGlobal.lIIlllllllIIIl[1]) * lllllllllllllIIlIIIlllIIlllIlIll;
                    final double lllllllllllllIIlIIIlllIIllIllIIl = 0.0;
                    final double lllllllllllllIIlIIIlllIIllIllIII = lllllllllllllIIlIIIlllIIllIllIll * lllllllllllllIIlIIIlllIIllIllllI - lllllllllllllIIlIIIlllIIllIllIlI * lllllllllllllIIlIIIlllIIllIlllll;
                    final double lllllllllllllIIlIIIlllIIllIlIlll = lllllllllllllIIlIIIlllIIllIllIlI * lllllllllllllIIlIIIlllIIllIllllI + lllllllllllllIIlIIIlllIIllIllIll * lllllllllllllIIlIIIlllIIllIlllll;
                    final double lllllllllllllIIlIIIlllIIllIlIllI = lllllllllllllIIlIIIlllIIllIllIII * lllllllllllllIIlIIIlllIIlllIIIlI + 0.0 * lllllllllllllIIlIIIlllIIlllIIIIl;
                    final double lllllllllllllIIlIIIlllIIllIlIlIl = 0.0 * lllllllllllllIIlIIIlllIIlllIIIlI - lllllllllllllIIlIIIlllIIllIllIII * lllllllllllllIIlIIIlllIIlllIIIIl;
                    final double lllllllllllllIIlIIIlllIIllIlIlII = lllllllllllllIIlIIIlllIIllIlIlIl * lllllllllllllIIlIIIlllIIlllIIlIl - lllllllllllllIIlIIIlllIIllIlIlll * lllllllllllllIIlIIIlllIIlllIIlII;
                    final double lllllllllllllIIlIIIlllIIllIlIIll = lllllllllllllIIlIIIlllIIllIlIlll * lllllllllllllIIlIIIlllIIlllIIlIl + lllllllllllllIIlIIIlllIIllIlIlIl * lllllllllllllIIlIIIlllIIlllIIlII;
                    lllllllllllllIIlIIIlllIIllllIIIl.pos(lllllllllllllIIlIIIlllIIlllIlIIl + lllllllllllllIIlIIIlllIIllIlIlII, lllllllllllllIIlIIIlllIIlllIlIII + lllllllllllllIIlIIIlllIIllIlIllI, lllllllllllllIIlIIIlllIIlllIIlll + lllllllllllllIIlIIIlllIIllIlIIll).endVertex();
                    ++lllllllllllllIIlIIIlllIIllIlllIl;
                }
            }
            ++lllllllllllllIIlIIIlllIIlllIllll;
        }
    }
    
    private static boolean llIlllllIllIlll(final int lllllllllllllIIlIIIlIlllIIIIllIl) {
        return lllllllllllllIIlIIIlIlllIIIIllIl != 0;
    }
    
    private void renderBlockLayer(final EnumWorldBlockLayer lllllllllllllIIlIIIllIllIlIIlIIl) {
        this.mc.entityRenderer.enableLightmap();
        if (llIlllllIllIlll(OpenGlHelper.useVbo() ? 1 : 0)) {
            GL11.glEnableClientState(RenderGlobal.lIIlllllllIIIl[47]);
            OpenGlHelper.setClientActiveTexture(OpenGlHelper.defaultTexUnit);
            GL11.glEnableClientState(RenderGlobal.lIIlllllllIIIl[48]);
            OpenGlHelper.setClientActiveTexture(OpenGlHelper.lightmapTexUnit);
            GL11.glEnableClientState(RenderGlobal.lIIlllllllIIIl[48]);
            OpenGlHelper.setClientActiveTexture(OpenGlHelper.defaultTexUnit);
            GL11.glEnableClientState(RenderGlobal.lIIlllllllIIIl[49]);
        }
        this.renderContainer.renderChunkLayer(lllllllllllllIIlIIIllIllIlIIlIIl);
        if (llIlllllIllIlll(OpenGlHelper.useVbo() ? 1 : 0)) {
            final boolean lllllllllllllIIlIIIllIllIlIIIlll = (boolean)DefaultVertexFormats.BLOCK.getElements().iterator();
            "".length();
            if ("  ".length() > "  ".length()) {
                return;
            }
            while (!llIllllllIIIIIl(((Iterator)lllllllllllllIIlIIIllIllIlIIIlll).hasNext() ? 1 : 0)) {
                final VertexFormatElement lllllllllllllIIlIIIllIllIlIIllIl = ((Iterator<VertexFormatElement>)lllllllllllllIIlIIIllIllIlIIIlll).next();
                final VertexFormatElement.EnumUsage lllllllllllllIIlIIIllIllIlIIllII = lllllllllllllIIlIIIllIllIlIIllIl.getUsage();
                final int lllllllllllllIIlIIIllIllIlIIlIll = lllllllllllllIIlIIIllIllIlIIllIl.getIndex();
                switch ($SWITCH_TABLE$net$minecraft$client$renderer$vertex$VertexFormatElement$EnumUsage()[lllllllllllllIIlIIIllIllIlIIllII.ordinal()]) {
                    case 1: {
                        GL11.glDisableClientState(RenderGlobal.lIIlllllllIIIl[47]);
                        "".length();
                        if (((0x53 ^ 0x32 ^ (0x89 ^ 0xAC)) & (136 + 60 - 168 + 220 ^ 152 + 4 - 15 + 47 ^ -" ".length())) != 0x0) {
                            return;
                        }
                        continue;
                    }
                    case 4: {
                        OpenGlHelper.setClientActiveTexture(OpenGlHelper.defaultTexUnit + lllllllllllllIIlIIIllIllIlIIlIll);
                        GL11.glDisableClientState(RenderGlobal.lIIlllllllIIIl[48]);
                        OpenGlHelper.setClientActiveTexture(OpenGlHelper.defaultTexUnit);
                        "".length();
                        if (((0x41 ^ 0x57) & ~(0xA7 ^ 0xB1)) >= " ".length()) {
                            return;
                        }
                        continue;
                    }
                    case 3: {
                        GL11.glDisableClientState(RenderGlobal.lIIlllllllIIIl[49]);
                        GlStateManager.resetColor();
                    }
                    default: {
                        continue;
                    }
                }
            }
        }
        this.mc.entityRenderer.disableLightmap();
    }
    
    public void renderEntityOutlineFramebuffer() {
        if (llIlllllIllIlll(this.isRenderEntityOutlines() ? 1 : 0)) {
            GlStateManager.enableBlend();
            GlStateManager.tryBlendFuncSeparate(RenderGlobal.lIIlllllllIIIl[17], RenderGlobal.lIIlllllllIIIl[18], RenderGlobal.lIIlllllllIIIl[0], RenderGlobal.lIIlllllllIIIl[1]);
            this.entityOutlineFramebuffer.framebufferRenderExt(this.mc.displayWidth, this.mc.displayHeight, (boolean)(RenderGlobal.lIIlllllllIIIl[0] != 0));
            GlStateManager.disableBlend();
        }
    }
    
    public void loadRenderers() {
        if (llIlllllIlllIlI(this.theWorld)) {
            this.displayListEntitiesDirty = (RenderGlobal.lIIlllllllIIIl[1] != 0);
            Blocks.leaves.setGraphicsLevel(this.mc.gameSettings.fancyGraphics);
            Blocks.leaves2.setGraphicsLevel(this.mc.gameSettings.fancyGraphics);
            this.renderDistanceChunks = this.mc.gameSettings.renderDistanceChunks;
            final boolean lllllllllllllIIlIIIlllIIlIlIlIIl = this.vboEnabled;
            this.vboEnabled = OpenGlHelper.useVbo();
            if (llIlllllIllIlll(lllllllllllllIIlIIIlllIIlIlIlIIl ? 1 : 0) && llIllllllIIIIIl(this.vboEnabled ? 1 : 0)) {
                this.renderContainer = new RenderList();
                this.renderChunkFactory = new ListChunkFactory();
                "".length();
                if (" ".length() <= 0) {
                    return;
                }
            }
            else if (llIllllllIIIIIl(lllllllllllllIIlIIIlllIIlIlIlIIl ? 1 : 0) && llIlllllIllIlll(this.vboEnabled ? 1 : 0)) {
                this.renderContainer = new VboRenderList();
                this.renderChunkFactory = new VboChunkFactory();
            }
            if (llIllllllIIIIlI(lllllllllllllIIlIIIlllIIlIlIlIIl ? 1 : 0, this.vboEnabled ? 1 : 0)) {
                this.generateStars();
                this.generateSky();
                this.generateSky2();
            }
            if (llIlllllIlllIlI(this.viewFrustum)) {
                this.viewFrustum.deleteGlResources();
            }
            this.stopChunkUpdates();
            synchronized (this.field_181024_n) {
                this.field_181024_n.clear();
                // monitorexit(this.field_181024_n)
                "".length();
                if ((114 + 157 - 222 + 109 ^ 139 + 19 - 137 + 133) <= "   ".length()) {
                    return;
                }
            }
            this.viewFrustum = new ViewFrustum(this.theWorld, this.mc.gameSettings.renderDistanceChunks, this, this.renderChunkFactory);
            if (llIlllllIlllIlI(this.theWorld)) {
                final Entity lllllllllllllIIlIIIlllIIlIlIlIII = this.mc.getRenderViewEntity();
                if (llIlllllIlllIlI(lllllllllllllIIlIIIlllIIlIlIlIII)) {
                    this.viewFrustum.updateChunkPositions(lllllllllllllIIlIIIlllIIlIlIlIII.posX, lllllllllllllIIlIIIlllIIlIlIlIII.posZ);
                }
            }
            this.renderEntitiesStartupCounter = RenderGlobal.lIIlllllllIIIl[2];
        }
    }
    
    private EntityFX spawnEntityFX(final int lllllllllllllIIlIIIllIIIIIlIlIlI, final boolean lllllllllllllIIlIIIllIIIIIlIlIIl, final double lllllllllllllIIlIIIllIIIIIIllIIl, final double lllllllllllllIIlIIIllIIIIIlIIlll, final double lllllllllllllIIlIIIllIIIIIIlIlll, final double lllllllllllllIIlIIIllIIIIIIlIllI, final double lllllllllllllIIlIIIllIIIIIlIIlII, final double lllllllllllllIIlIIIllIIIIIIlIlII, final int... lllllllllllllIIlIIIllIIIIIlIIIlI) {
        if (!llIlllllIlllIlI(this.mc) || !llIlllllIlllIlI(this.mc.getRenderViewEntity()) || !llIlllllIlllIlI(this.mc.effectRenderer)) {
            return null;
        }
        int lllllllllllllIIlIIIllIIIIIlIIIIl = this.mc.gameSettings.particleSetting;
        if (llIllllllIIlIII(lllllllllllllIIlIIIllIIIIIlIIIIl, RenderGlobal.lIIlllllllIIIl[1]) && llIllllllIIIIIl(this.theWorld.rand.nextInt(RenderGlobal.lIIlllllllIIIl[3]))) {
            lllllllllllllIIlIIIllIIIIIlIIIIl = RenderGlobal.lIIlllllllIIIl[2];
        }
        final double lllllllllllllIIlIIIllIIIIIlIIIII = this.mc.getRenderViewEntity().posX - lllllllllllllIIlIIIllIIIIIIllIIl;
        final double lllllllllllllIIlIIIllIIIIIIlllll = this.mc.getRenderViewEntity().posY - lllllllllllllIIlIIIllIIIIIlIIlll;
        final double lllllllllllllIIlIIIllIIIIIIllllI = this.mc.getRenderViewEntity().posZ - lllllllllllllIIlIIIllIIIIIIlIlll;
        if (llIlllllIllIlll(lllllllllllllIIlIIIllIIIIIlIlIIl ? 1 : 0)) {
            return this.mc.effectRenderer.spawnEffectParticle(lllllllllllllIIlIIIllIIIIIlIlIlI, lllllllllllllIIlIIIllIIIIIIllIIl, lllllllllllllIIlIIIllIIIIIlIIlll, lllllllllllllIIlIIIllIIIIIIlIlll, lllllllllllllIIlIIIllIIIIIIlIllI, lllllllllllllIIlIIIllIIIIIlIIlII, lllllllllllllIIlIIIllIIIIIIlIlII, lllllllllllllIIlIIIllIIIIIlIIIlI);
        }
        final double lllllllllllllIIlIIIllIIIIIIlllIl = 16.0;
        EntityFX spawnEffectParticle;
        if (llIllllllIIIIII(llIllllllIllIIl(lllllllllllllIIlIIIllIIIIIlIIIII * lllllllllllllIIlIIIllIIIIIlIIIII + lllllllllllllIIlIIIllIIIIIIlllll * lllllllllllllIIlIIIllIIIIIIlllll + lllllllllllllIIlIIIllIIIIIIllllI * lllllllllllllIIlIIIllIIIIIIllllI, 256.0))) {
            spawnEffectParticle = null;
            "".length();
            if (null != null) {
                return null;
            }
        }
        else if (llIlllllIllllII(lllllllllllllIIlIIIllIIIIIlIIIIl, RenderGlobal.lIIlllllllIIIl[1])) {
            spawnEffectParticle = null;
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            spawnEffectParticle = this.mc.effectRenderer.spawnEffectParticle(lllllllllllllIIlIIIllIIIIIlIlIlI, lllllllllllllIIlIIIllIIIIIIllIIl, lllllllllllllIIlIIIllIIIIIlIIlll, lllllllllllllIIlIIIllIIIIIIlIlll, lllllllllllllIIlIIIllIIIIIIlIllI, lllllllllllllIIlIIIllIIIIIlIIlII, lllllllllllllIIlIIIllIIIIIIlIlII, lllllllllllllIIlIIIllIIIIIlIIIlI);
        }
        return spawnEffectParticle;
    }
    
    @Override
    public void sendBlockBreakProgress(final int lllllllllllllIIlIIIlIlllIlllIlII, final BlockPos lllllllllllllIIlIIIlIlllIllllIII, final int lllllllllllllIIlIIIlIlllIlllIIlI) {
        if (llIlllllIlllIll(lllllllllllllIIlIIIlIlllIlllIIlI) && llIllllllIIlIlI(lllllllllllllIIlIIIlIlllIlllIIlI, RenderGlobal.lIIlllllllIIIl[7])) {
            DestroyBlockProgress lllllllllllllIIlIIIlIlllIlllIllI = this.damagedBlocks.get(lllllllllllllIIlIIIlIlllIlllIlII);
            if (!llIlllllIlllIlI(lllllllllllllIIlIIIlIlllIlllIllI) || !llIllllllIIlIII(lllllllllllllIIlIIIlIlllIlllIllI.getPosition().getX(), lllllllllllllIIlIIIlIlllIllllIII.getX()) || !llIllllllIIlIII(lllllllllllllIIlIIIlIlllIlllIllI.getPosition().getY(), lllllllllllllIIlIIIlIlllIllllIII.getY()) || llIllllllIIIIlI(lllllllllllllIIlIIIlIlllIlllIllI.getPosition().getZ(), lllllllllllllIIlIIIlIlllIllllIII.getZ())) {
                lllllllllllllIIlIIIlIlllIlllIllI = new DestroyBlockProgress(lllllllllllllIIlIIIlIlllIlllIlII, lllllllllllllIIlIIIlIlllIllllIII);
                this.damagedBlocks.put(lllllllllllllIIlIIIlIlllIlllIlII, lllllllllllllIIlIIIlIlllIlllIllI);
                "".length();
            }
            lllllllllllllIIlIIIlIlllIlllIllI.setPartialBlockDamage(lllllllllllllIIlIIIlIlllIlllIIlI);
            lllllllllllllIIlIIIlIlllIlllIllI.setCloudUpdateTick(this.cloudTickCounter);
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            this.damagedBlocks.remove(lllllllllllllIIlIIIlIlllIlllIlII);
            "".length();
        }
    }
    
    private static int llIllllllIllIII(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private void generateSky() {
        final Tessellator lllllllllllllIIlIIIlllIlIIlllIll = Tessellator.getInstance();
        final WorldRenderer lllllllllllllIIlIIIlllIlIIlllIlI = lllllllllllllIIlIIIlllIlIIlllIll.getWorldRenderer();
        if (llIlllllIlllIlI(this.skyVBO)) {
            this.skyVBO.deleteGlBuffers();
        }
        if (llIlllllIlllIll(this.glSkyList)) {
            GLAllocation.deleteDisplayLists(this.glSkyList);
            this.glSkyList = RenderGlobal.lIIlllllllIIIl[6];
        }
        if (llIlllllIllIlll(this.vboEnabled ? 1 : 0)) {
            this.skyVBO = new VertexBuffer(this.vertexBufferFormat);
            this.renderSky(lllllllllllllIIlIIIlllIlIIlllIlI, 16.0f, (boolean)(RenderGlobal.lIIlllllllIIIl[0] != 0));
            lllllllllllllIIlIIIlllIlIIlllIlI.finishDrawing();
            lllllllllllllIIlIIIlllIlIIlllIlI.reset();
            this.skyVBO.func_181722_a(lllllllllllllIIlIIIlllIlIIlllIlI.getByteBuffer());
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            this.glSkyList = GLAllocation.generateDisplayLists(RenderGlobal.lIIlllllllIIIl[1]);
            GL11.glNewList(this.glSkyList, RenderGlobal.lIIlllllllIIIl[19]);
            this.renderSky(lllllllllllllIIlIIIlllIlIIlllIlI, 16.0f, (boolean)(RenderGlobal.lIIlllllllIIIl[0] != 0));
            lllllllllllllIIlIIIlllIlIIlllIll.draw();
            GL11.glEndList();
        }
    }
    
    @Override
    public void spawnParticle(final int lllllllllllllIIlIIIllIIIIllIIIIl, final boolean lllllllllllllIIlIIIllIIIIllIllIl, final double lllllllllllllIIlIIIllIIIIllIllII, final double lllllllllllllIIlIIIllIIIIllIlIll, final double lllllllllllllIIlIIIllIIIIlIlllIl, final double lllllllllllllIIlIIIllIIIIllIlIIl, final double lllllllllllllIIlIIIllIIIIlIllIll, final double lllllllllllllIIlIIIllIIIIllIIlll, final int... lllllllllllllIIlIIIllIIIIlIllIIl) {
        try {
            this.spawnEntityFX(lllllllllllllIIlIIIllIIIIllIIIIl, lllllllllllllIIlIIIllIIIIllIllIl, lllllllllllllIIlIIIllIIIIllIllII, lllllllllllllIIlIIIllIIIIllIlIll, lllllllllllllIIlIIIllIIIIlIlllIl, lllllllllllllIIlIIIllIIIIllIlIIl, lllllllllllllIIlIIIllIIIIlIllIll, lllllllllllllIIlIIIllIIIIllIIlll, lllllllllllllIIlIIIllIIIIlIllIIl);
            "".length();
            "".length();
            if (-" ".length() >= ((0x2F ^ 0x64 ^ (0x3 ^ 0x1E)) & (0x17 ^ 0x11 ^ (0x7A ^ 0x2A) ^ -" ".length()))) {
                return;
            }
        }
        catch (Throwable lllllllllllllIIlIIIllIIIIllIIlIl) {
            final CrashReport lllllllllllllIIlIIIllIIIIllIIlII = CrashReport.makeCrashReport(lllllllllllllIIlIIIllIIIIllIIlIl, RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[63]]);
            final CrashReportCategory lllllllllllllIIlIIIllIIIIllIIIll = lllllllllllllIIlIIIllIIIIllIIlII.makeCategory(RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[64]]);
            lllllllllllllIIlIIIllIIIIllIIIll.addCrashSection(RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[56]], lllllllllllllIIlIIIllIIIIllIIIIl);
            if (llIlllllIlllIlI(lllllllllllllIIlIIIllIIIIlIllIIl)) {
                lllllllllllllIIlIIIllIIIIllIIIll.addCrashSection(RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[65]], lllllllllllllIIlIIIllIIIIlIllIIl);
            }
            lllllllllllllIIlIIIllIIIIllIIIll.addCrashSectionCallable(RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[66]], new Callable<String>() {
                @Override
                public String call() throws Exception {
                    return CrashReportCategory.getCoordinateInfo(lllllllllllllIIlIIIllIIIIllIllII, lllllllllllllIIlIIIllIIIIllIlIll, lllllllllllllIIlIIIllIIIIlIlllIl);
                }
            });
            throw new ReportedException(lllllllllllllIIlIIIllIIIIllIIlII);
        }
    }
    
    private void postRenderDamagedBlocks() {
        GlStateManager.disableAlpha();
        GlStateManager.doPolygonOffset(0.0f, 0.0f);
        GlStateManager.disablePolygonOffset();
        GlStateManager.enableAlpha();
        GlStateManager.depthMask((boolean)(RenderGlobal.lIIlllllllIIIl[1] != 0));
        GlStateManager.popMatrix();
    }
    
    private static int llIllllllIIllll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    @Override
    public void playRecord(final String lllllllllllllIIlIIIllIIIlIIlIIII, final BlockPos lllllllllllllIIlIIIllIIIlIIlIlIl) {
        final ISound lllllllllllllIIlIIIllIIIlIIlIlII = this.mapSoundPositions.get(lllllllllllllIIlIIIllIIIlIIlIlIl);
        if (llIlllllIlllIlI(lllllllllllllIIlIIIllIIIlIIlIlII)) {
            this.mc.getSoundHandler().stopSound(lllllllllllllIIlIIIllIIIlIIlIlII);
            this.mapSoundPositions.remove(lllllllllllllIIlIIIllIIIlIIlIlIl);
            "".length();
        }
        if (llIlllllIlllIlI(lllllllllllllIIlIIIllIIIlIIlIIII)) {
            final ItemRecord lllllllllllllIIlIIIllIIIlIIlIIll = ItemRecord.getRecord(lllllllllllllIIlIIIllIIIlIIlIIII);
            if (llIlllllIlllIlI(lllllllllllllIIlIIIllIIIlIIlIIll)) {
                this.mc.ingameGUI.setRecordPlayingMessage(lllllllllllllIIlIIIllIIIlIIlIIll.getRecordNameLocal());
            }
            final PositionedSoundRecord lllllllllllllIIlIIIllIIIlIIlIIlI = PositionedSoundRecord.create(new ResourceLocation(lllllllllllllIIlIIIllIIIlIIlIIII), (float)lllllllllllllIIlIIIllIIIlIIlIlIl.getX(), (float)lllllllllllllIIlIIIllIIIlIIlIlIl.getY(), (float)lllllllllllllIIlIIIllIIIlIIlIlIl.getZ());
            this.mapSoundPositions.put(lllllllllllllIIlIIIllIIIlIIlIlIl, lllllllllllllIIlIIIllIIIlIIlIIlI);
            "".length();
            this.mc.getSoundHandler().playSound(lllllllllllllIIlIIIllIIIlIIlIIlI);
        }
    }
    
    public String getDebugInfoEntities() {
        return String.valueOf(new StringBuilder(RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[33]]).append(this.countEntitiesRendered).append(RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[34]]).append(this.countEntitiesTotal).append(RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[35]]).append(this.countEntitiesHidden).append(RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[36]]).append(this.countEntitiesTotal - this.countEntitiesHidden - this.countEntitiesRendered));
    }
    
    public static void func_181563_a(final AxisAlignedBB lllllllllllllIIlIIIllIIIlllIllII, final int lllllllllllllIIlIIIllIIIllllIIlI, final int lllllllllllllIIlIIIllIIIllllIIIl, final int lllllllllllllIIlIIIllIIIlllIlIIl, final int lllllllllllllIIlIIIllIIIlllIlIII) {
        final Tessellator lllllllllllllIIlIIIllIIIlllIlllI = Tessellator.getInstance();
        final WorldRenderer lllllllllllllIIlIIIllIIIlllIllIl = lllllllllllllIIlIIIllIIIlllIlllI.getWorldRenderer();
        lllllllllllllIIlIIIllIIIlllIllIl.begin(RenderGlobal.lIIlllllllIIIl[3], DefaultVertexFormats.POSITION_COLOR);
        lllllllllllllIIlIIIllIIIlllIllIl.pos(lllllllllllllIIlIIIllIIIlllIllII.minX, lllllllllllllIIlIIIllIIIlllIllII.minY, lllllllllllllIIlIIIllIIIlllIllII.minZ).color(lllllllllllllIIlIIIllIIIllllIIlI, lllllllllllllIIlIIIllIIIllllIIIl, lllllllllllllIIlIIIllIIIlllIlIIl, lllllllllllllIIlIIIllIIIlllIlIII).endVertex();
        lllllllllllllIIlIIIllIIIlllIllIl.pos(lllllllllllllIIlIIIllIIIlllIllII.maxX, lllllllllllllIIlIIIllIIIlllIllII.minY, lllllllllllllIIlIIIllIIIlllIllII.minZ).color(lllllllllllllIIlIIIllIIIllllIIlI, lllllllllllllIIlIIIllIIIllllIIIl, lllllllllllllIIlIIIllIIIlllIlIIl, lllllllllllllIIlIIIllIIIlllIlIII).endVertex();
        lllllllllllllIIlIIIllIIIlllIllIl.pos(lllllllllllllIIlIIIllIIIlllIllII.maxX, lllllllllllllIIlIIIllIIIlllIllII.minY, lllllllllllllIIlIIIllIIIlllIllII.maxZ).color(lllllllllllllIIlIIIllIIIllllIIlI, lllllllllllllIIlIIIllIIIllllIIIl, lllllllllllllIIlIIIllIIIlllIlIIl, lllllllllllllIIlIIIllIIIlllIlIII).endVertex();
        lllllllllllllIIlIIIllIIIlllIllIl.pos(lllllllllllllIIlIIIllIIIlllIllII.minX, lllllllllllllIIlIIIllIIIlllIllII.minY, lllllllllllllIIlIIIllIIIlllIllII.maxZ).color(lllllllllllllIIlIIIllIIIllllIIlI, lllllllllllllIIlIIIllIIIllllIIIl, lllllllllllllIIlIIIllIIIlllIlIIl, lllllllllllllIIlIIIllIIIlllIlIII).endVertex();
        lllllllllllllIIlIIIllIIIlllIllIl.pos(lllllllllllllIIlIIIllIIIlllIllII.minX, lllllllllllllIIlIIIllIIIlllIllII.minY, lllllllllllllIIlIIIllIIIlllIllII.minZ).color(lllllllllllllIIlIIIllIIIllllIIlI, lllllllllllllIIlIIIllIIIllllIIIl, lllllllllllllIIlIIIllIIIlllIlIIl, lllllllllllllIIlIIIllIIIlllIlIII).endVertex();
        lllllllllllllIIlIIIllIIIlllIlllI.draw();
        lllllllllllllIIlIIIllIIIlllIllIl.begin(RenderGlobal.lIIlllllllIIIl[3], DefaultVertexFormats.POSITION_COLOR);
        lllllllllllllIIlIIIllIIIlllIllIl.pos(lllllllllllllIIlIIIllIIIlllIllII.minX, lllllllllllllIIlIIIllIIIlllIllII.maxY, lllllllllllllIIlIIIllIIIlllIllII.minZ).color(lllllllllllllIIlIIIllIIIllllIIlI, lllllllllllllIIlIIIllIIIllllIIIl, lllllllllllllIIlIIIllIIIlllIlIIl, lllllllllllllIIlIIIllIIIlllIlIII).endVertex();
        lllllllllllllIIlIIIllIIIlllIllIl.pos(lllllllllllllIIlIIIllIIIlllIllII.maxX, lllllllllllllIIlIIIllIIIlllIllII.maxY, lllllllllllllIIlIIIllIIIlllIllII.minZ).color(lllllllllllllIIlIIIllIIIllllIIlI, lllllllllllllIIlIIIllIIIllllIIIl, lllllllllllllIIlIIIllIIIlllIlIIl, lllllllllllllIIlIIIllIIIlllIlIII).endVertex();
        lllllllllllllIIlIIIllIIIlllIllIl.pos(lllllllllllllIIlIIIllIIIlllIllII.maxX, lllllllllllllIIlIIIllIIIlllIllII.maxY, lllllllllllllIIlIIIllIIIlllIllII.maxZ).color(lllllllllllllIIlIIIllIIIllllIIlI, lllllllllllllIIlIIIllIIIllllIIIl, lllllllllllllIIlIIIllIIIlllIlIIl, lllllllllllllIIlIIIllIIIlllIlIII).endVertex();
        lllllllllllllIIlIIIllIIIlllIllIl.pos(lllllllllllllIIlIIIllIIIlllIllII.minX, lllllllllllllIIlIIIllIIIlllIllII.maxY, lllllllllllllIIlIIIllIIIlllIllII.maxZ).color(lllllllllllllIIlIIIllIIIllllIIlI, lllllllllllllIIlIIIllIIIllllIIIl, lllllllllllllIIlIIIllIIIlllIlIIl, lllllllllllllIIlIIIllIIIlllIlIII).endVertex();
        lllllllllllllIIlIIIllIIIlllIllIl.pos(lllllllllllllIIlIIIllIIIlllIllII.minX, lllllllllllllIIlIIIllIIIlllIllII.maxY, lllllllllllllIIlIIIllIIIlllIllII.minZ).color(lllllllllllllIIlIIIllIIIllllIIlI, lllllllllllllIIlIIIllIIIllllIIIl, lllllllllllllIIlIIIllIIIlllIlIIl, lllllllllllllIIlIIIllIIIlllIlIII).endVertex();
        lllllllllllllIIlIIIllIIIlllIlllI.draw();
        lllllllllllllIIlIIIllIIIlllIllIl.begin(RenderGlobal.lIIlllllllIIIl[1], DefaultVertexFormats.POSITION_COLOR);
        lllllllllllllIIlIIIllIIIlllIllIl.pos(lllllllllllllIIlIIIllIIIlllIllII.minX, lllllllllllllIIlIIIllIIIlllIllII.minY, lllllllllllllIIlIIIllIIIlllIllII.minZ).color(lllllllllllllIIlIIIllIIIllllIIlI, lllllllllllllIIlIIIllIIIllllIIIl, lllllllllllllIIlIIIllIIIlllIlIIl, lllllllllllllIIlIIIllIIIlllIlIII).endVertex();
        lllllllllllllIIlIIIllIIIlllIllIl.pos(lllllllllllllIIlIIIllIIIlllIllII.minX, lllllllllllllIIlIIIllIIIlllIllII.maxY, lllllllllllllIIlIIIllIIIlllIllII.minZ).color(lllllllllllllIIlIIIllIIIllllIIlI, lllllllllllllIIlIIIllIIIllllIIIl, lllllllllllllIIlIIIllIIIlllIlIIl, lllllllllllllIIlIIIllIIIlllIlIII).endVertex();
        lllllllllllllIIlIIIllIIIlllIllIl.pos(lllllllllllllIIlIIIllIIIlllIllII.maxX, lllllllllllllIIlIIIllIIIlllIllII.minY, lllllllllllllIIlIIIllIIIlllIllII.minZ).color(lllllllllllllIIlIIIllIIIllllIIlI, lllllllllllllIIlIIIllIIIllllIIIl, lllllllllllllIIlIIIllIIIlllIlIIl, lllllllllllllIIlIIIllIIIlllIlIII).endVertex();
        lllllllllllllIIlIIIllIIIlllIllIl.pos(lllllllllllllIIlIIIllIIIlllIllII.maxX, lllllllllllllIIlIIIllIIIlllIllII.maxY, lllllllllllllIIlIIIllIIIlllIllII.minZ).color(lllllllllllllIIlIIIllIIIllllIIlI, lllllllllllllIIlIIIllIIIllllIIIl, lllllllllllllIIlIIIllIIIlllIlIIl, lllllllllllllIIlIIIllIIIlllIlIII).endVertex();
        lllllllllllllIIlIIIllIIIlllIllIl.pos(lllllllllllllIIlIIIllIIIlllIllII.maxX, lllllllllllllIIlIIIllIIIlllIllII.minY, lllllllllllllIIlIIIllIIIlllIllII.maxZ).color(lllllllllllllIIlIIIllIIIllllIIlI, lllllllllllllIIlIIIllIIIllllIIIl, lllllllllllllIIlIIIllIIIlllIlIIl, lllllllllllllIIlIIIllIIIlllIlIII).endVertex();
        lllllllllllllIIlIIIllIIIlllIllIl.pos(lllllllllllllIIlIIIllIIIlllIllII.maxX, lllllllllllllIIlIIIllIIIlllIllII.maxY, lllllllllllllIIlIIIllIIIlllIllII.maxZ).color(lllllllllllllIIlIIIllIIIllllIIlI, lllllllllllllIIlIIIllIIIllllIIIl, lllllllllllllIIlIIIllIIIlllIlIIl, lllllllllllllIIlIIIllIIIlllIlIII).endVertex();
        lllllllllllllIIlIIIllIIIlllIllIl.pos(lllllllllllllIIlIIIllIIIlllIllII.minX, lllllllllllllIIlIIIllIIIlllIllII.minY, lllllllllllllIIlIIIllIIIlllIllII.maxZ).color(lllllllllllllIIlIIIllIIIllllIIlI, lllllllllllllIIlIIIllIIIllllIIIl, lllllllllllllIIlIIIllIIIlllIlIIl, lllllllllllllIIlIIIllIIIlllIlIII).endVertex();
        lllllllllllllIIlIIIllIIIlllIllIl.pos(lllllllllllllIIlIIIllIIIlllIllII.minX, lllllllllllllIIlIIIllIIIlllIllII.maxY, lllllllllllllIIlIIIllIIIlllIllII.maxZ).color(lllllllllllllIIlIIIllIIIllllIIlI, lllllllllllllIIlIIIllIIIllllIIIl, lllllllllllllIIlIIIllIIIlllIlIIl, lllllllllllllIIlIIIllIIIlllIlIII).endVertex();
        lllllllllllllIIlIIIllIIIlllIlllI.draw();
    }
    
    private static String llIllllIllIlIIl(String lllllllllllllIIlIIIlIlllIlIlIIIl, final String lllllllllllllIIlIIIlIlllIlIlIlIl) {
        lllllllllllllIIlIIIlIlllIlIlIIIl = (int)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIIIlIlllIlIlIIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIIIlIlllIlIlIlII = new StringBuilder();
        final char[] lllllllllllllIIlIIIlIlllIlIlIIll = lllllllllllllIIlIIIlIlllIlIlIlIl.toCharArray();
        int lllllllllllllIIlIIIlIlllIlIlIIlI = RenderGlobal.lIIlllllllIIIl[0];
        final Exception lllllllllllllIIlIIIlIlllIlIIllII = (Object)((String)lllllllllllllIIlIIIlIlllIlIlIIIl).toCharArray();
        final byte lllllllllllllIIlIIIlIlllIlIIlIll = (byte)lllllllllllllIIlIIIlIlllIlIIllII.length;
        boolean lllllllllllllIIlIIIlIlllIlIIlIlI = RenderGlobal.lIIlllllllIIIl[0] != 0;
        while (llIllllllIIlIlI(lllllllllllllIIlIIIlIlllIlIIlIlI ? 1 : 0, lllllllllllllIIlIIIlIlllIlIIlIll)) {
            final char lllllllllllllIIlIIIlIlllIlIlIlll = lllllllllllllIIlIIIlIlllIlIIllII[lllllllllllllIIlIIIlIlllIlIIlIlI];
            lllllllllllllIIlIIIlIlllIlIlIlII.append((char)(lllllllllllllIIlIIIlIlllIlIlIlll ^ lllllllllllllIIlIIIlIlllIlIlIIll[lllllllllllllIIlIIIlIlllIlIlIIlI % lllllllllllllIIlIIIlIlllIlIlIIll.length]));
            "".length();
            ++lllllllllllllIIlIIIlIlllIlIlIIlI;
            ++lllllllllllllIIlIIIlIlllIlIIlIlI;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIIIlIlllIlIlIlII);
    }
    
    @Override
    public void notifyLightSet(final BlockPos lllllllllllllIIlIIIllIIIlIlllIll) {
        final int lllllllllllllIIlIIIllIIIlIlllIlI = lllllllllllllIIlIIIllIIIlIlllIll.getX();
        final int lllllllllllllIIlIIIllIIIlIlllIIl = lllllllllllllIIlIIIllIIIlIlllIll.getY();
        final int lllllllllllllIIlIIIllIIIlIlllIII = lllllllllllllIIlIIIllIIIlIlllIll.getZ();
        this.markBlocksForUpdate(lllllllllllllIIlIIIllIIIlIlllIlI - RenderGlobal.lIIlllllllIIIl[1], lllllllllllllIIlIIIllIIIlIlllIIl - RenderGlobal.lIIlllllllIIIl[1], lllllllllllllIIlIIIllIIIlIlllIII - RenderGlobal.lIIlllllllIIIl[1], lllllllllllllIIlIIIllIIIlIlllIlI + RenderGlobal.lIIlllllllIIIl[1], lllllllllllllIIlIIIllIIIlIlllIIl + RenderGlobal.lIIlllllllIIIl[1], lllllllllllllIIlIIIllIIIlIlllIII + RenderGlobal.lIIlllllllIIIl[1]);
    }
    
    public String getDebugInfoRenders() {
        final int lllllllllllllIIlIIIlllIIIlIIIlll = this.viewFrustum.renderChunks.length;
        int lllllllllllllIIlIIIlllIIIlIIIllI = RenderGlobal.lIIlllllllIIIl[0];
        final Exception lllllllllllllIIlIIIlllIIIIllllll = (Exception)this.renderInfos.iterator();
        "".length();
        if (null != null) {
            return null;
        }
        while (!llIllllllIIIIIl(((Iterator)lllllllllllllIIlIIIlllIIIIllllll).hasNext() ? 1 : 0)) {
            final ContainerLocalRenderInformation lllllllllllllIIlIIIlllIIIlIIIlIl = ((Iterator<ContainerLocalRenderInformation>)lllllllllllllIIlIIIlllIIIIllllll).next();
            final CompiledChunk lllllllllllllIIlIIIlllIIIlIIIlII = lllllllllllllIIlIIIlllIIIlIIIlIl.renderChunk.compiledChunk;
            if (llIllllllIIIllI(lllllllllllllIIlIIIlllIIIlIIIlII, CompiledChunk.DUMMY) && llIllllllIIIIIl(lllllllllllllIIlIIIlllIIIlIIIlII.isEmpty() ? 1 : 0)) {
                ++lllllllllllllIIlIIIlllIIIlIIIllI;
            }
        }
        final String format = RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[31]];
        final Object[] args = new Object[RenderGlobal.lIIlllllllIIIl[13]];
        args[RenderGlobal.lIIlllllllIIIl[0]] = lllllllllllllIIlIIIlllIIIlIIIllI;
        args[RenderGlobal.lIIlllllllIIIl[1]] = lllllllllllllIIlIIIlllIIIlIIIlll;
        final int n = RenderGlobal.lIIlllllllIIIl[2];
        String s;
        if (llIlllllIllIlll(this.mc.renderChunksMany ? 1 : 0)) {
            s = RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[29]];
            "".length();
            if (((0x9 ^ 0xC) & ~(0x3D ^ 0x38)) <= -" ".length()) {
                return null;
            }
        }
        else {
            s = RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[32]];
        }
        args[n] = s;
        args[RenderGlobal.lIIlllllllIIIl[3]] = this.renderDistanceChunks;
        args[RenderGlobal.lIIlllllllIIIl[4]] = this.renderDispatcher.getDebugInfo();
        return String.format(format, args);
    }
    
    private static int llIllllllIlIlIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static int llIllllllIIIlll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    public void drawSelectionBox(final EntityPlayer lllllllllllllIIlIIIllIIlIIIllIII, final MovingObjectPosition lllllllllllllIIlIIIllIIlIIIlIlll, final int lllllllllllllIIlIIIllIIlIIIIlIll, final float lllllllllllllIIlIIIllIIlIIIIlIlI) {
        if (llIllllllIIIIIl(lllllllllllllIIlIIIllIIlIIIIlIll) && llIllllllIIIlIl(lllllllllllllIIlIIIllIIlIIIlIlll.typeOfHit, MovingObjectPosition.MovingObjectType.BLOCK)) {
            GlStateManager.enableBlend();
            GlStateManager.tryBlendFuncSeparate(RenderGlobal.lIIlllllllIIIl[17], RenderGlobal.lIIlllllllIIIl[18], RenderGlobal.lIIlllllllIIIl[1], RenderGlobal.lIIlllllllIIIl[0]);
            GlStateManager.color(0.0f, 0.0f, 0.0f, 0.4f);
            GL11.glLineWidth(2.0f);
            GlStateManager.disableTexture2D();
            GlStateManager.depthMask((boolean)(RenderGlobal.lIIlllllllIIIl[0] != 0));
            final float lllllllllllllIIlIIIllIIlIIIlIlII = 0.002f;
            final BlockPos lllllllllllllIIlIIIllIIlIIIlIIll = lllllllllllllIIlIIIllIIlIIIlIlll.getBlockPos();
            final Block lllllllllllllIIlIIIllIIlIIIlIIlI = this.theWorld.getBlockState(lllllllllllllIIlIIIllIIlIIIlIIll).getBlock();
            if (llIllllllIIIllI(lllllllllllllIIlIIIllIIlIIIlIIlI.getMaterial(), Material.air) && llIlllllIllIlll(this.theWorld.getWorldBorder().contains(lllllllllllllIIlIIIllIIlIIIlIIll) ? 1 : 0)) {
                lllllllllllllIIlIIIllIIlIIIlIIlI.setBlockBoundsBasedOnState(this.theWorld, lllllllllllllIIlIIIllIIlIIIlIIll);
                final double lllllllllllllIIlIIIllIIlIIIlIIIl = lllllllllllllIIlIIIllIIlIIIllIII.lastTickPosX + (lllllllllllllIIlIIIllIIlIIIllIII.posX - lllllllllllllIIlIIIllIIlIIIllIII.lastTickPosX) * lllllllllllllIIlIIIllIIlIIIIlIlI;
                final double lllllllllllllIIlIIIllIIlIIIlIIII = lllllllllllllIIlIIIllIIlIIIllIII.lastTickPosY + (lllllllllllllIIlIIIllIIlIIIllIII.posY - lllllllllllllIIlIIIllIIlIIIllIII.lastTickPosY) * lllllllllllllIIlIIIllIIlIIIIlIlI;
                final double lllllllllllllIIlIIIllIIlIIIIllll = lllllllllllllIIlIIIllIIlIIIllIII.lastTickPosZ + (lllllllllllllIIlIIIllIIlIIIllIII.posZ - lllllllllllllIIlIIIllIIlIIIllIII.lastTickPosZ) * lllllllllllllIIlIIIllIIlIIIIlIlI;
                func_181561_a(lllllllllllllIIlIIIllIIlIIIlIIlI.getSelectedBoundingBox(this.theWorld, lllllllllllllIIlIIIllIIlIIIlIIll).expand(0.0020000000949949026, 0.0020000000949949026, 0.0020000000949949026).offset(-lllllllllllllIIlIIIllIIlIIIlIIIl, -lllllllllllllIIlIIIllIIlIIIlIIII, -lllllllllllllIIlIIIllIIlIIIIllll));
            }
            GlStateManager.depthMask((boolean)(RenderGlobal.lIIlllllllIIIl[1] != 0));
            GlStateManager.enableTexture2D();
            GlStateManager.disableBlend();
        }
    }
    
    private void cleanupDamagedBlocks(final Iterator<DestroyBlockProgress> lllllllllllllIIlIIIllIllIIllllll) {
        "".length();
        if (((0x75 ^ 0x4A ^ (0x38 ^ 0x29)) & (0xD4 ^ 0xBD ^ (0xE5 ^ 0xA2) ^ -" ".length())) != 0x0) {
            return;
        }
        while (!llIllllllIIIIIl(lllllllllllllIIlIIIllIllIIllllll.hasNext() ? 1 : 0)) {
            final DestroyBlockProgress lllllllllllllIIlIIIllIllIIlllllI = lllllllllllllIIlIIIllIllIIllllll.next();
            final int lllllllllllllIIlIIIllIllIIllllIl = lllllllllllllIIlIIIllIllIIlllllI.getCreationCloudUpdateTick();
            if (llIlllllIllllII(this.cloudTickCounter - lllllllllllllIIlIIIllIllIIllllIl, RenderGlobal.lIIlllllllIIIl[50])) {
                lllllllllllllIIlIIIllIllIIllllll.remove();
            }
        }
    }
    
    public void updateChunks(final long lllllllllllllIIlIIIllIIlllllIlII) {
        this.displayListEntitiesDirty |= this.renderDispatcher.runChunkUploads(lllllllllllllIIlIIIllIIlllllIlII);
        if (llIllllllIIIIIl(this.chunksToUpdate.isEmpty() ? 1 : 0)) {
            final Iterator<RenderChunk> lllllllllllllIIlIIIllIIlllllIIll = this.chunksToUpdate.iterator();
            "".length();
            if (null != null) {
                return;
            }
            while (!llIllllllIIIIIl(lllllllllllllIIlIIIllIIlllllIIll.hasNext() ? 1 : 0)) {
                final RenderChunk lllllllllllllIIlIIIllIIlllllIIIl = lllllllllllllIIlIIIllIIlllllIIll.next();
                if (llIllllllIIIIIl(this.renderDispatcher.updateChunkLater(lllllllllllllIIlIIIllIIlllllIIIl) ? 1 : 0)) {
                    "".length();
                    if ("   ".length() < 0) {
                        return;
                    }
                    break;
                }
                else {
                    lllllllllllllIIlIIIllIIlllllIIIl.setNeedsUpdate((boolean)(RenderGlobal.lIIlllllllIIIl[0] != 0));
                    lllllllllllllIIlIIIllIIlllllIIll.remove();
                    final long lllllllllllllIIlIIIllIIlllllIIII = lllllllllllllIIlIIIllIIlllllIlII - System.nanoTime();
                    if (!llIlllllIllllll(llIllllllIlIlII(lllllllllllllIIlIIIllIIlllllIIII, 0L))) {
                        continue;
                    }
                    "".length();
                    if (null != null) {
                        return;
                    }
                    break;
                }
            }
        }
    }
    
    private static int llIllllllIllIll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public int renderBlockLayer(final EnumWorldBlockLayer lllllllllllllIIlIIIllIllIllIIIII, final double lllllllllllllIIlIIIllIllIlllIIII, final int lllllllllllllIIlIIIllIllIllIllll, final Entity lllllllllllllIIlIIIllIllIlIlllll) {
        RenderHelper.disableStandardItemLighting();
        if (llIllllllIIIlIl(lllllllllllllIIlIIIllIllIllIIIII, EnumWorldBlockLayer.TRANSLUCENT)) {
            this.mc.mcProfiler.startSection(RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[44]]);
            final double lllllllllllllIIlIIIllIllIllIllIl = lllllllllllllIIlIIIllIllIlIlllll.posX - this.prevRenderSortX;
            final double lllllllllllllIIlIIIllIllIllIllII = lllllllllllllIIlIIIllIllIlIlllll.posY - this.prevRenderSortY;
            final double lllllllllllllIIlIIIllIllIllIlIll = lllllllllllllIIlIIIllIllIlIlllll.posZ - this.prevRenderSortZ;
            if (llIllllllIIIIII(llIllllllIIlIll(lllllllllllllIIlIIIllIllIllIllIl * lllllllllllllIIlIIIllIllIllIllIl + lllllllllllllIIlIIIllIllIllIllII * lllllllllllllIIlIIIllIllIllIllII + lllllllllllllIIlIIIllIllIllIlIll * lllllllllllllIIlIIIllIllIllIlIll, 1.0))) {
                this.prevRenderSortX = lllllllllllllIIlIIIllIllIlIlllll.posX;
                this.prevRenderSortY = lllllllllllllIIlIIIllIllIlIlllll.posY;
                this.prevRenderSortZ = lllllllllllllIIlIIIllIllIlIlllll.posZ;
                int lllllllllllllIIlIIIllIllIllIlIlI = RenderGlobal.lIIlllllllIIIl[0];
                final short lllllllllllllIIlIIIllIllIlIlIllI = (short)this.renderInfos.iterator();
                "".length();
                if (null != null) {
                    return (0x2D ^ 0x55 ^ (0xDA ^ 0x91)) & (66 + 157 - 162 + 106 ^ 11 + 15 + 113 + 9 ^ -" ".length());
                }
                while (!llIllllllIIIIIl(((Iterator)lllllllllllllIIlIIIllIllIlIlIllI).hasNext() ? 1 : 0)) {
                    final ContainerLocalRenderInformation lllllllllllllIIlIIIllIllIllIlIIl = ((Iterator<ContainerLocalRenderInformation>)lllllllllllllIIlIIIllIllIlIlIllI).next();
                    if (llIlllllIllIlll(lllllllllllllIIlIIIllIllIllIlIIl.renderChunk.compiledChunk.isLayerStarted(lllllllllllllIIlIIIllIllIllIIIII) ? 1 : 0) && llIllllllIIlIlI(lllllllllllllIIlIIIllIllIllIlIlI++, RenderGlobal.lIIlllllllIIIl[31])) {
                        this.renderDispatcher.updateTransparencyLater(lllllllllllllIIlIIIllIllIllIlIIl.renderChunk);
                        "".length();
                    }
                }
            }
            this.mc.mcProfiler.endSection();
        }
        this.mc.mcProfiler.startSection(RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[45]]);
        int lllllllllllllIIlIIIllIllIllIlIII = RenderGlobal.lIIlllllllIIIl[0];
        int n;
        if (llIllllllIIIlIl(lllllllllllllIIlIIIllIllIllIIIII, EnumWorldBlockLayer.TRANSLUCENT)) {
            n = RenderGlobal.lIIlllllllIIIl[1];
            "".length();
            if (((0xC5 ^ 0x9B ^ (0xC8 ^ 0xB1)) & (0x24 ^ 0x4A ^ (0x70 ^ 0x39) ^ -" ".length())) != 0x0) {
                return (97 + 148 - 104 + 39 ^ 125 + 42 - 150 + 168) & (0x64 ^ 0x4F ^ (0x82 ^ 0xA4) ^ -" ".length());
            }
        }
        else {
            n = RenderGlobal.lIIlllllllIIIl[0];
        }
        final boolean lllllllllllllIIlIIIllIllIllIIlll = n != 0;
        int n2;
        if (llIlllllIllIlll(lllllllllllllIIlIIIllIllIllIIlll ? 1 : 0)) {
            n2 = this.renderInfos.size() - RenderGlobal.lIIlllllllIIIl[1];
            "".length();
            if (null != null) {
                return (0xD ^ 0x6F ^ (0xB5 ^ 0x91)) & (19 + 200 - 77 + 76 ^ 35 + 68 + 27 + 26 ^ -" ".length());
            }
        }
        else {
            n2 = RenderGlobal.lIIlllllllIIIl[0];
        }
        final int lllllllllllllIIlIIIllIllIllIIllI = n2;
        int size;
        if (llIlllllIllIlll(lllllllllllllIIlIIIllIllIllIIlll ? 1 : 0)) {
            size = RenderGlobal.lIIlllllllIIIl[6];
            "".length();
            if ("   ".length() < 0) {
                return (0x39 ^ 0x62) & ~(0x14 ^ 0x4F);
            }
        }
        else {
            size = this.renderInfos.size();
        }
        final int lllllllllllllIIlIIIllIllIllIIlIl = size;
        int n3;
        if (llIlllllIllIlll(lllllllllllllIIlIIIllIllIllIIlll ? 1 : 0)) {
            n3 = RenderGlobal.lIIlllllllIIIl[6];
            "".length();
            if (((0x35 ^ 0x52 ^ (0x27 ^ 0x72)) & (0xF ^ 0x69 ^ (0x7C ^ 0x28) ^ -" ".length())) != 0x0) {
                return (0xF4 ^ 0x97 ^ (0x1D ^ 0x52)) & (77 + 21 - 9 + 46 ^ 90 + 86 - 76 + 71 ^ -" ".length());
            }
        }
        else {
            n3 = RenderGlobal.lIIlllllllIIIl[1];
        }
        final int lllllllllllllIIlIIIllIllIllIIlII = n3;
        int lllllllllllllIIlIIIllIllIllIIIll = lllllllllllllIIlIIIllIllIllIIllI;
        "".length();
        if (-" ".length() == ((0xA0 ^ 0xA4) & ~(0x9E ^ 0x9A))) {
            return (0x3E ^ 0x6C) & ~(0x7F ^ 0x2D);
        }
        while (!llIllllllIIlIII(lllllllllllllIIlIIIllIllIllIIIll, lllllllllllllIIlIIIllIllIllIIlIl)) {
            final RenderChunk lllllllllllllIIlIIIllIllIllIIIlI = this.renderInfos.get(lllllllllllllIIlIIIllIllIllIIIll).renderChunk;
            if (llIllllllIIIIIl(lllllllllllllIIlIIIllIllIllIIIlI.getCompiledChunk().isLayerEmpty(lllllllllllllIIlIIIllIllIllIIIII) ? 1 : 0)) {
                ++lllllllllllllIIlIIIllIllIllIlIII;
                this.renderContainer.addRenderChunk(lllllllllllllIIlIIIllIllIllIIIlI, lllllllllllllIIlIIIllIllIllIIIII);
            }
            lllllllllllllIIlIIIllIllIllIIIll += lllllllllllllIIlIIIllIllIllIIlII;
        }
        this.mc.mcProfiler.endStartSection(String.valueOf(new StringBuilder(RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[46]]).append(lllllllllllllIIlIIIllIllIllIIIII)));
        this.renderBlockLayer(lllllllllllllIIlIIIllIllIllIIIII);
        this.mc.mcProfiler.endSection();
        return lllllllllllllIIlIIIllIllIllIlIII;
    }
    
    private static boolean llIlllllIlllIll(final int lllllllllllllIIlIIIlIlllIIIIlIIl) {
        return lllllllllllllIIlIIIlIlllIIIIlIIl >= 0;
    }
    
    private static int llIlllllIllllIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public boolean hasCloudFog(final double lllllllllllllIIlIIIllIlIlIIIlIII, final double lllllllllllllIIlIIIllIlIlIIIIlll, final double lllllllllllllIIlIIIllIlIlIIIIllI, final float lllllllllllllIIlIIIllIlIlIIIIlIl) {
        return RenderGlobal.lIIlllllllIIIl[0] != 0;
    }
    
    @Override
    public void playSoundToNearExcept(final EntityPlayer lllllllllllllIIlIIIllIIIlIIIIIll, final String lllllllllllllIIlIIIllIIIlIIIIIlI, final double lllllllllllllIIlIIIllIIIlIIIIIIl, final double lllllllllllllIIlIIIllIIIlIIIIIII, final double lllllllllllllIIlIIIllIIIIlllllll, final float lllllllllllllIIlIIIllIIIIllllllI, final float lllllllllllllIIlIIIllIIIIlllllIl) {
    }
    
    private void updateDestroyBlockIcons() {
        final TextureMap lllllllllllllIIlIIIlllIlIlIlllIl = this.mc.getTextureMapBlocks();
        int lllllllllllllIIlIIIlllIlIlIlllII = RenderGlobal.lIIlllllllIIIl[0];
        "".length();
        if (" ".length() < ((40 + 114 - 131 + 115 ^ 78 + 163 - 92 + 19) & (0x14 ^ 0x65 ^ (0xFA ^ 0xA9) ^ -" ".length()))) {
            return;
        }
        while (!llIlllllIlllIII(lllllllllllllIIlIIIlllIlIlIlllII, this.destroyBlockIcons.length)) {
            this.destroyBlockIcons[lllllllllllllIIlIIIlllIlIlIlllII] = lllllllllllllIIlIIIlllIlIlIlllIl.getAtlasSprite(String.valueOf(new StringBuilder(RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[13]]).append(lllllllllllllIIlIIIlllIlIlIlllII)));
            ++lllllllllllllIIlIIIlllIlIlIlllII;
        }
    }
    
    public void makeEntityOutlineShader() {
        if (llIlllllIllIlll(OpenGlHelper.shadersSupported ? 1 : 0)) {
            if (llIlllllIlllIIl(ShaderLinkHelper.getStaticShaderLinkHelper())) {
                ShaderLinkHelper.setNewStaticShaderLinkHelper();
            }
            final ResourceLocation lllllllllllllIIlIIIlllIlIlIlIlII = new ResourceLocation(RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[14]]);
            try {
                this.entityOutlineShader = new ShaderGroup(this.mc.getTextureManager(), this.mc.getResourceManager(), this.mc.getFramebuffer(), lllllllllllllIIlIIIlllIlIlIlIlII);
                this.entityOutlineShader.createBindFramebuffers(this.mc.displayWidth, this.mc.displayHeight);
                this.entityOutlineFramebuffer = this.entityOutlineShader.getFramebufferRaw(RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[15]]);
                "".length();
                if ((0x24 ^ 0x40 ^ (0xFD ^ 0x9D)) < "   ".length()) {
                    return;
                }
                return;
            }
            catch (IOException lllllllllllllIIlIIIlllIlIlIlIIll) {
                RenderGlobal.logger.warn(String.valueOf(new StringBuilder(RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[8]]).append(lllllllllllllIIlIIIlllIlIlIlIlII)), (Throwable)lllllllllllllIIlIIIlllIlIlIlIIll);
                this.entityOutlineShader = null;
                this.entityOutlineFramebuffer = null;
                "".length();
                if (-(0x42 ^ 0x46) >= 0) {
                    return;
                }
                return;
            }
            catch (JsonSyntaxException lllllllllllllIIlIIIlllIlIlIlIIlI) {
                RenderGlobal.logger.warn(String.valueOf(new StringBuilder(RenderGlobal.lIIlllllIllIlI[RenderGlobal.lIIlllllllIIIl[16]]).append(lllllllllllllIIlIIIlllIlIlIlIlII)), (Throwable)lllllllllllllIIlIIIlllIlIlIlIIlI);
                this.entityOutlineShader = null;
                this.entityOutlineFramebuffer = null;
                "".length();
                if (((75 + 57 - 47 + 160 ^ 160 + 89 - 158 + 71) & (0xC3 ^ 0xA1 ^ (0x5F ^ 0x6A) ^ -" ".length())) != 0x0) {
                    return;
                }
                return;
            }
        }
        this.entityOutlineShader = null;
        this.entityOutlineFramebuffer = null;
    }
    
    public void setDisplayListEntitiesDirty() {
        this.displayListEntitiesDirty = (RenderGlobal.lIIlllllllIIIl[1] != 0);
    }
    
    protected Vector3f getViewVector(final Entity lllllllllllllIIlIIIllIlllIIIIllI, final double lllllllllllllIIlIIIllIlllIIIllIl) {
        float lllllllllllllIIlIIIllIlllIIIllII = (float)(lllllllllllllIIlIIIllIlllIIIIllI.prevRotationPitch + (lllllllllllllIIlIIIllIlllIIIIllI.rotationPitch - lllllllllllllIIlIIIllIlllIIIIllI.prevRotationPitch) * lllllllllllllIIlIIIllIlllIIIllIl);
        final float lllllllllllllIIlIIIllIlllIIIlIll = (float)(lllllllllllllIIlIIIllIlllIIIIllI.prevRotationYaw + (lllllllllllllIIlIIIllIlllIIIIllI.rotationYaw - lllllllllllllIIlIIIllIlllIIIIllI.prevRotationYaw) * lllllllllllllIIlIIIllIlllIIIllIl);
        if (llIllllllIIlIII(Minecraft.getMinecraft().gameSettings.thirdPersonView, RenderGlobal.lIIlllllllIIIl[2])) {
            lllllllllllllIIlIIIllIlllIIIllII += 180.0f;
        }
        final float lllllllllllllIIlIIIllIlllIIIlIlI = MathHelper.cos(-lllllllllllllIIlIIIllIlllIIIlIll * 0.017453292f - 3.1415927f);
        final float lllllllllllllIIlIIIllIlllIIIlIIl = MathHelper.sin(-lllllllllllllIIlIIIllIlllIIIlIll * 0.017453292f - 3.1415927f);
        final float lllllllllllllIIlIIIllIlllIIIlIII = -MathHelper.cos(-lllllllllllllIIlIIIllIlllIIIllII * 0.017453292f);
        final float lllllllllllllIIlIIIllIlllIIIIlll = MathHelper.sin(-lllllllllllllIIlIIIllIlllIIIllII * 0.017453292f);
        return new Vector3f(lllllllllllllIIlIIIllIlllIIIlIIl * lllllllllllllIIlIIIllIlllIIIlIII, lllllllllllllIIlIIIllIlllIIIIlll, lllllllllllllIIlIIIllIlllIIIlIlI * lllllllllllllIIlIIIllIlllIIIlIII);
    }
    
    private static int llIllllllIlIlII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public void renderClouds(final float lllllllllllllIIlIIIllIlIlIlIIIII, final int lllllllllllllIIlIIIllIlIlIlllIIl) {
        if (llIlllllIllIlll(this.mc.theWorld.provider.isSurfaceWorld() ? 1 : 0)) {
            if (llIllllllIIlIII(this.mc.gameSettings.func_181147_e(), RenderGlobal.lIIlllllllIIIl[2])) {
                this.renderCloudsFancy(lllllllllllllIIlIIIllIlIlIlIIIII, lllllllllllllIIlIIIllIlIlIlllIIl);
                "".length();
                if (-" ".length() >= 0) {
                    return;
                }
            }
            else {
                GlStateManager.disableCull();
                final float lllllllllllllIIlIIIllIlIlIlllIII = (float)(this.mc.getRenderViewEntity().lastTickPosY + (this.mc.getRenderViewEntity().posY - this.mc.getRenderViewEntity().lastTickPosY) * lllllllllllllIIlIIIllIlIlIlIIIII);
                final int lllllllllllllIIlIIIllIlIlIllIlll = RenderGlobal.lIIlllllllIIIl[56];
                final int lllllllllllllIIlIIIllIlIlIllIllI = RenderGlobal.lIIlllllllIIIl[8];
                final Tessellator lllllllllllllIIlIIIllIlIlIllIlIl = Tessellator.getInstance();
                final WorldRenderer lllllllllllllIIlIIIllIlIlIllIlII = lllllllllllllIIlIIIllIlIlIllIlIl.getWorldRenderer();
                this.renderEngine.bindTexture(RenderGlobal.locationCloudsPng);
                GlStateManager.enableBlend();
                GlStateManager.tryBlendFuncSeparate(RenderGlobal.lIIlllllllIIIl[17], RenderGlobal.lIIlllllllIIIl[18], RenderGlobal.lIIlllllllIIIl[1], RenderGlobal.lIIlllllllIIIl[0]);
                final Vec3 lllllllllllllIIlIIIllIlIlIllIIll = this.theWorld.getCloudColour(lllllllllllllIIlIIIllIlIlIlIIIII);
                float lllllllllllllIIlIIIllIlIlIllIIlI = (float)lllllllllllllIIlIIIllIlIlIllIIll.xCoord;
                float lllllllllllllIIlIIIllIlIlIllIIIl = (float)lllllllllllllIIlIIIllIlIlIllIIll.yCoord;
                float lllllllllllllIIlIIIllIlIlIllIIII = (float)lllllllllllllIIlIIIllIlIlIllIIll.zCoord;
                if (llIllllllIIIIlI(lllllllllllllIIlIIIllIlIlIlllIIl, RenderGlobal.lIIlllllllIIIl[2])) {
                    final float lllllllllllllIIlIIIllIlIlIlIllll = (lllllllllllllIIlIIIllIlIlIllIIlI * 30.0f + lllllllllllllIIlIIIllIlIlIllIIIl * 59.0f + lllllllllllllIIlIIIllIlIlIllIIII * 11.0f) / 100.0f;
                    final float lllllllllllllIIlIIIllIlIlIlIlllI = (lllllllllllllIIlIIIllIlIlIllIIlI * 30.0f + lllllllllllllIIlIIIllIlIlIllIIIl * 70.0f) / 100.0f;
                    final float lllllllllllllIIlIIIllIlIlIlIllIl = (lllllllllllllIIlIIIllIlIlIllIIlI * 30.0f + lllllllllllllIIlIIIllIlIlIllIIII * 70.0f) / 100.0f;
                    lllllllllllllIIlIIIllIlIlIllIIlI = lllllllllllllIIlIIIllIlIlIlIllll;
                    lllllllllllllIIlIIIllIlIlIllIIIl = lllllllllllllIIlIIIllIlIlIlIlllI;
                    lllllllllllllIIlIIIllIlIlIllIIII = lllllllllllllIIlIIIllIlIlIlIllIl;
                }
                final float lllllllllllllIIlIIIllIlIlIlIllII = 4.8828125E-4f;
                final double lllllllllllllIIlIIIllIlIlIlIlIll = this.cloudTickCounter + lllllllllllllIIlIIIllIlIlIlIIIII;
                double lllllllllllllIIlIIIllIlIlIlIlIlI = this.mc.getRenderViewEntity().prevPosX + (this.mc.getRenderViewEntity().posX - this.mc.getRenderViewEntity().prevPosX) * lllllllllllllIIlIIIllIlIlIlIIIII + lllllllllllllIIlIIIllIlIlIlIlIll * 0.029999999329447746;
                double lllllllllllllIIlIIIllIlIlIlIlIIl = this.mc.getRenderViewEntity().prevPosZ + (this.mc.getRenderViewEntity().posZ - this.mc.getRenderViewEntity().prevPosZ) * lllllllllllllIIlIIIllIlIlIlIIIII;
                final int lllllllllllllIIlIIIllIlIlIlIlIII = MathHelper.floor_double(lllllllllllllIIlIIIllIlIlIlIlIlI / 2048.0);
                final int lllllllllllllIIlIIIllIlIlIlIIlll = MathHelper.floor_double(lllllllllllllIIlIIIllIlIlIlIlIIl / 2048.0);
                lllllllllllllIIlIIIllIlIlIlIlIlI -= lllllllllllllIIlIIIllIlIlIlIlIII * RenderGlobal.lIIlllllllIIIl[57];
                lllllllllllllIIlIIIllIlIlIlIlIIl -= lllllllllllllIIlIIIllIlIlIlIIlll * RenderGlobal.lIIlllllllIIIl[57];
                final float lllllllllllllIIlIIIllIlIlIlIIllI = this.theWorld.provider.getCloudHeight() - lllllllllllllIIlIIIllIlIlIlllIII + 0.33f;
                final float lllllllllllllIIlIIIllIlIlIlIIlIl = (float)(lllllllllllllIIlIIIllIlIlIlIlIlI * 4.8828125E-4);
                final float lllllllllllllIIlIIIllIlIlIlIIlII = (float)(lllllllllllllIIlIIIllIlIlIlIlIIl * 4.8828125E-4);
                lllllllllllllIIlIIIllIlIlIllIlII.begin(RenderGlobal.lIIlllllllIIIl[15], DefaultVertexFormats.POSITION_TEX_COLOR);
                int lllllllllllllIIlIIIllIlIlIlIIIll = RenderGlobal.lIIlllllllIIIl[58];
                "".length();
                if ((0x6 ^ 0x2) <= ((0xB7 ^ 0xBB) & ~(0x69 ^ 0x65))) {
                    return;
                }
                while (!llIlllllIlllIII(lllllllllllllIIlIIIllIlIlIlIIIll, RenderGlobal.lIIlllllllIIIl[43])) {
                    int lllllllllllllIIlIIIllIlIlIlIIIlI = RenderGlobal.lIIlllllllIIIl[58];
                    "".length();
                    if (-"  ".length() >= 0) {
                        return;
                    }
                    while (!llIlllllIlllIII(lllllllllllllIIlIIIllIlIlIlIIIlI, RenderGlobal.lIIlllllllIIIl[43])) {
                        lllllllllllllIIlIIIllIlIlIllIlII.pos(lllllllllllllIIlIIIllIlIlIlIIIll + RenderGlobal.lIIlllllllIIIl[0], lllllllllllllIIlIIIllIlIlIlIIllI, lllllllllllllIIlIIIllIlIlIlIIIlI + RenderGlobal.lIIlllllllIIIl[56]).tex((lllllllllllllIIlIIIllIlIlIlIIIll + RenderGlobal.lIIlllllllIIIl[0]) * 4.8828125E-4f + lllllllllllllIIlIIIllIlIlIlIIlIl, (lllllllllllllIIlIIIllIlIlIlIIIlI + RenderGlobal.lIIlllllllIIIl[56]) * 4.8828125E-4f + lllllllllllllIIlIIIllIlIlIlIIlII).color(lllllllllllllIIlIIIllIlIlIllIIlI, lllllllllllllIIlIIIllIlIlIllIIIl, lllllllllllllIIlIIIllIlIlIllIIII, 0.8f).endVertex();
                        lllllllllllllIIlIIIllIlIlIllIlII.pos(lllllllllllllIIlIIIllIlIlIlIIIll + RenderGlobal.lIIlllllllIIIl[56], lllllllllllllIIlIIIllIlIlIlIIllI, lllllllllllllIIlIIIllIlIlIlIIIlI + RenderGlobal.lIIlllllllIIIl[56]).tex((lllllllllllllIIlIIIllIlIlIlIIIll + RenderGlobal.lIIlllllllIIIl[56]) * 4.8828125E-4f + lllllllllllllIIlIIIllIlIlIlIIlIl, (lllllllllllllIIlIIIllIlIlIlIIIlI + RenderGlobal.lIIlllllllIIIl[56]) * 4.8828125E-4f + lllllllllllllIIlIIIllIlIlIlIIlII).color(lllllllllllllIIlIIIllIlIlIllIIlI, lllllllllllllIIlIIIllIlIlIllIIIl, lllllllllllllIIlIIIllIlIlIllIIII, 0.8f).endVertex();
                        lllllllllllllIIlIIIllIlIlIllIlII.pos(lllllllllllllIIlIIIllIlIlIlIIIll + RenderGlobal.lIIlllllllIIIl[56], lllllllllllllIIlIIIllIlIlIlIIllI, lllllllllllllIIlIIIllIlIlIlIIIlI + RenderGlobal.lIIlllllllIIIl[0]).tex((lllllllllllllIIlIIIllIlIlIlIIIll + RenderGlobal.lIIlllllllIIIl[56]) * 4.8828125E-4f + lllllllllllllIIlIIIllIlIlIlIIlIl, (lllllllllllllIIlIIIllIlIlIlIIIlI + RenderGlobal.lIIlllllllIIIl[0]) * 4.8828125E-4f + lllllllllllllIIlIIIllIlIlIlIIlII).color(lllllllllllllIIlIIIllIlIlIllIIlI, lllllllllllllIIlIIIllIlIlIllIIIl, lllllllllllllIIlIIIllIlIlIllIIII, 0.8f).endVertex();
                        lllllllllllllIIlIIIllIlIlIllIlII.pos(lllllllllllllIIlIIIllIlIlIlIIIll + RenderGlobal.lIIlllllllIIIl[0], lllllllllllllIIlIIIllIlIlIlIIllI, lllllllllllllIIlIIIllIlIlIlIIIlI + RenderGlobal.lIIlllllllIIIl[0]).tex((lllllllllllllIIlIIIllIlIlIlIIIll + RenderGlobal.lIIlllllllIIIl[0]) * 4.8828125E-4f + lllllllllllllIIlIIIllIlIlIlIIlIl, (lllllllllllllIIlIIIllIlIlIlIIIlI + RenderGlobal.lIIlllllllIIIl[0]) * 4.8828125E-4f + lllllllllllllIIlIIIllIlIlIlIIlII).color(lllllllllllllIIlIIIllIlIlIllIIlI, lllllllllllllIIlIIIllIlIlIllIIIl, lllllllllllllIIlIIIllIlIlIllIIII, 0.8f).endVertex();
                        lllllllllllllIIlIIIllIlIlIlIIIlI += 32;
                    }
                    lllllllllllllIIlIIIllIlIlIlIIIll += 32;
                }
                lllllllllllllIIlIIIllIlIlIllIlIl.draw();
                GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
                GlStateManager.disableBlend();
                GlStateManager.enableCull();
            }
        }
    }
    
    private static int llIllllllIIllIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean llIllllllIIlIII(final int lllllllllllllIIlIIIlIlllIIlIllII, final int lllllllllllllIIlIIIlIlllIIlIlIll) {
        return lllllllllllllIIlIIIlIlllIIlIllII == lllllllllllllIIlIIIlIlllIIlIlIll;
    }
    
    private void renderSkyEnd() {
        GlStateManager.disableFog();
        GlStateManager.disableAlpha();
        GlStateManager.enableBlend();
        GlStateManager.tryBlendFuncSeparate(RenderGlobal.lIIlllllllIIIl[17], RenderGlobal.lIIlllllllIIIl[18], RenderGlobal.lIIlllllllIIIl[1], RenderGlobal.lIIlllllllIIIl[0]);
        RenderHelper.disableStandardItemLighting();
        GlStateManager.depthMask((boolean)(RenderGlobal.lIIlllllllIIIl[0] != 0));
        this.renderEngine.bindTexture(RenderGlobal.locationEndSkyPng);
        final Tessellator lllllllllllllIIlIIIllIllIIllIIII = Tessellator.getInstance();
        final WorldRenderer lllllllllllllIIlIIIllIllIIlIllll = lllllllllllllIIlIIIllIllIIllIIII.getWorldRenderer();
        int lllllllllllllIIlIIIllIllIIlIlllI = RenderGlobal.lIIlllllllIIIl[0];
        "".length();
        if (-(0x4 ^ 0x29 ^ (0x25 ^ 0xC)) > 0) {
            return;
        }
        while (!llIlllllIlllIII(lllllllllllllIIlIIIllIllIIlIlllI, RenderGlobal.lIIlllllllIIIl[14])) {
            GlStateManager.pushMatrix();
            if (llIllllllIIlIII(lllllllllllllIIlIIIllIllIIlIlllI, RenderGlobal.lIIlllllllIIIl[1])) {
                GlStateManager.rotate(90.0f, 1.0f, 0.0f, 0.0f);
            }
            if (llIllllllIIlIII(lllllllllllllIIlIIIllIllIIlIlllI, RenderGlobal.lIIlllllllIIIl[2])) {
                GlStateManager.rotate(-90.0f, 1.0f, 0.0f, 0.0f);
            }
            if (llIllllllIIlIII(lllllllllllllIIlIIIllIllIIlIlllI, RenderGlobal.lIIlllllllIIIl[3])) {
                GlStateManager.rotate(180.0f, 1.0f, 0.0f, 0.0f);
            }
            if (llIllllllIIlIII(lllllllllllllIIlIIIllIllIIlIlllI, RenderGlobal.lIIlllllllIIIl[4])) {
                GlStateManager.rotate(90.0f, 0.0f, 0.0f, 1.0f);
            }
            if (llIllllllIIlIII(lllllllllllllIIlIIIllIllIIlIlllI, RenderGlobal.lIIlllllllIIIl[13])) {
                GlStateManager.rotate(-90.0f, 0.0f, 0.0f, 1.0f);
            }
            lllllllllllllIIlIIIllIllIIlIllll.begin(RenderGlobal.lIIlllllllIIIl[15], DefaultVertexFormats.POSITION_TEX_COLOR);
            lllllllllllllIIlIIIllIllIIlIllll.pos(-100.0, -100.0, -100.0).tex(0.0, 0.0).color(RenderGlobal.lIIlllllllIIIl[51], RenderGlobal.lIIlllllllIIIl[51], RenderGlobal.lIIlllllllIIIl[51], RenderGlobal.lIIlllllllIIIl[52]).endVertex();
            lllllllllllllIIlIIIllIllIIlIllll.pos(-100.0, -100.0, 100.0).tex(0.0, 16.0).color(RenderGlobal.lIIlllllllIIIl[51], RenderGlobal.lIIlllllllIIIl[51], RenderGlobal.lIIlllllllIIIl[51], RenderGlobal.lIIlllllllIIIl[52]).endVertex();
            lllllllllllllIIlIIIllIllIIlIllll.pos(100.0, -100.0, 100.0).tex(16.0, 16.0).color(RenderGlobal.lIIlllllllIIIl[51], RenderGlobal.lIIlllllllIIIl[51], RenderGlobal.lIIlllllllIIIl[51], RenderGlobal.lIIlllllllIIIl[52]).endVertex();
            lllllllllllllIIlIIIllIllIIlIllll.pos(100.0, -100.0, -100.0).tex(16.0, 0.0).color(RenderGlobal.lIIlllllllIIIl[51], RenderGlobal.lIIlllllllIIIl[51], RenderGlobal.lIIlllllllIIIl[51], RenderGlobal.lIIlllllllIIIl[52]).endVertex();
            lllllllllllllIIlIIIllIllIIllIIII.draw();
            GlStateManager.popMatrix();
            ++lllllllllllllIIlIIIllIllIIlIlllI;
        }
        GlStateManager.depthMask((boolean)(RenderGlobal.lIIlllllllIIIl[1] != 0));
        GlStateManager.enableTexture2D();
        GlStateManager.enableAlpha();
    }
    
    private static boolean llIllllllIIlIlI(final int lllllllllllllIIlIIIlIlllIIlIIlII, final int lllllllllllllIIlIIIlIlllIIlIIIll) {
        return lllllllllllllIIlIIIlIlllIIlIIlII < lllllllllllllIIlIIIlIlllIIlIIIll;
    }
    
    public RenderGlobal(final Minecraft lllllllllllllIIlIIIlllIlIllIIllI) {
        this.chunksToUpdate = (Set<RenderChunk>)Sets.newLinkedHashSet();
        this.renderInfos = (List<ContainerLocalRenderInformation>)Lists.newArrayListWithCapacity(RenderGlobal.lIIlllllllIIIl[5]);
        this.field_181024_n = (Set<TileEntity>)Sets.newHashSet();
        this.starGLCallList = RenderGlobal.lIIlllllllIIIl[6];
        this.glSkyList = RenderGlobal.lIIlllllllIIIl[6];
        this.glSkyList2 = RenderGlobal.lIIlllllllIIIl[6];
        this.damagedBlocks = (Map<Integer, DestroyBlockProgress>)Maps.newHashMap();
        this.mapSoundPositions = (Map<BlockPos, ISound>)Maps.newHashMap();
        this.destroyBlockIcons = new TextureAtlasSprite[RenderGlobal.lIIlllllllIIIl[7]];
        this.frustumUpdatePosX = Double.MIN_VALUE;
        this.frustumUpdatePosY = Double.MIN_VALUE;
        this.frustumUpdatePosZ = Double.MIN_VALUE;
        this.frustumUpdatePosChunkX = Integer.MIN_VALUE;
        this.frustumUpdatePosChunkY = Integer.MIN_VALUE;
        this.frustumUpdatePosChunkZ = Integer.MIN_VALUE;
        this.lastViewEntityX = Double.MIN_VALUE;
        this.lastViewEntityY = Double.MIN_VALUE;
        this.lastViewEntityZ = Double.MIN_VALUE;
        this.lastViewEntityPitch = Double.MIN_VALUE;
        this.lastViewEntityYaw = Double.MIN_VALUE;
        this.renderDispatcher = new ChunkRenderDispatcher();
        this.renderDistanceChunks = RenderGlobal.lIIlllllllIIIl[6];
        this.renderEntitiesStartupCounter = RenderGlobal.lIIlllllllIIIl[2];
        this.debugFixTerrainFrustum = (RenderGlobal.lIIlllllllIIIl[0] != 0);
        this.debugTerrainMatrix = new Vector4f[RenderGlobal.lIIlllllllIIIl[8]];
        this.debugTerrainFrustumPosition = new Vector3d();
        this.vboEnabled = (RenderGlobal.lIIlllllllIIIl[0] != 0);
        this.displayListEntitiesDirty = (RenderGlobal.lIIlllllllIIIl[1] != 0);
        this.mc = lllllllllllllIIlIIIlllIlIllIIllI;
        this.renderManager = lllllllllllllIIlIIIlllIlIllIIllI.getRenderManager();
        this.renderEngine = lllllllllllllIIlIIIlllIlIllIIllI.getTextureManager();
        this.renderEngine.bindTexture(RenderGlobal.locationForcefieldPng);
        GL11.glTexParameteri(RenderGlobal.lIIlllllllIIIl[9], RenderGlobal.lIIlllllllIIIl[10], RenderGlobal.lIIlllllllIIIl[11]);
        GL11.glTexParameteri(RenderGlobal.lIIlllllllIIIl[9], RenderGlobal.lIIlllllllIIIl[12], RenderGlobal.lIIlllllllIIIl[11]);
        GlStateManager.bindTexture(RenderGlobal.lIIlllllllIIIl[0]);
        this.updateDestroyBlockIcons();
        this.vboEnabled = OpenGlHelper.useVbo();
        if (llIlllllIllIlll(this.vboEnabled ? 1 : 0)) {
            this.renderContainer = new VboRenderList();
            this.renderChunkFactory = new VboChunkFactory();
            "".length();
            if (("   ".length() & ("   ".length() ^ -" ".length())) > 0) {
                throw null;
            }
        }
        else {
            this.renderContainer = new RenderList();
            this.renderChunkFactory = new ListChunkFactory();
        }
        this.vertexBufferFormat = new VertexFormat();
        this.vertexBufferFormat.func_181721_a(new VertexFormatElement(RenderGlobal.lIIlllllllIIIl[0], VertexFormatElement.EnumType.FLOAT, VertexFormatElement.EnumUsage.POSITION, RenderGlobal.lIIlllllllIIIl[3]));
        "".length();
        this.generateStars();
        this.generateSky();
        this.generateSky2();
    }
    
    private static int llIllllllIllIIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static boolean llIlllllIlllIII(final int lllllllllllllIIlIIIlIlllIIlIlIII, final int lllllllllllllIIlIIIlIlllIIlIIlll) {
        return lllllllllllllIIlIIIlIlllIIlIlIII >= lllllllllllllIIlIIIlIlllIIlIIlll;
    }
    
    private void spawnParticle(final EnumParticleTypes lllllllllllllIIlIIIllIIIIlIIlIll, final double lllllllllllllIIlIIIllIIIIlIIlIlI, final double lllllllllllllIIlIIIllIIIIlIIIIII, final double lllllllllllllIIlIIIllIIIIIllllll, final double lllllllllllllIIlIIIllIIIIlIIIlll, final double lllllllllllllIIlIIIllIIIIlIIIllI, final double lllllllllllllIIlIIIllIIIIIllllII, final int... lllllllllllllIIlIIIllIIIIIlllIll) {
        this.spawnParticle(lllllllllllllIIlIIIllIIIIlIIlIll.getParticleID(), lllllllllllllIIlIIIllIIIIlIIlIll.getShouldIgnoreRange(), lllllllllllllIIlIIIllIIIIlIIlIlI, lllllllllllllIIlIIIllIIIIlIIIIII, lllllllllllllIIlIIIllIIIIIllllll, lllllllllllllIIlIIIllIIIIlIIIlll, lllllllllllllIIlIIIllIIIIlIIIllI, lllllllllllllIIlIIIllIIIIIllllII, lllllllllllllIIlIIIllIIIIIlllIll);
    }
    
    private void renderSky(final WorldRenderer lllllllllllllIIlIIIlllIlIIlIllII, final float lllllllllllllIIlIIIlllIlIIlIIIlI, final boolean lllllllllllllIIlIIIlllIlIIlIlIlI) {
        final int lllllllllllllIIlIIIlllIlIIlIlIIl = RenderGlobal.lIIlllllllIIIl[20];
        final int lllllllllllllIIlIIIlllIlIIlIlIII = RenderGlobal.lIIlllllllIIIl[14];
        lllllllllllllIIlIIIlllIlIIlIllII.begin(RenderGlobal.lIIlllllllIIIl[15], DefaultVertexFormats.POSITION);
        int lllllllllllllIIlIIIlllIlIIlIIlll = RenderGlobal.lIIlllllllIIIl[21];
        "".length();
        if (null != null) {
            return;
        }
        while (!llIlllllIllllII(lllllllllllllIIlIIIlllIlIIlIIlll, RenderGlobal.lIIlllllllIIIl[22])) {
            int lllllllllllllIIlIIIlllIlIIlIIllI = RenderGlobal.lIIlllllllIIIl[21];
            "".length();
            if (((57 + 125 - 63 + 36 ^ 71 + 24 - 17 + 68) & (0x8E ^ 0xAE ^ (0x63 ^ 0x4A) ^ -" ".length())) != 0x0) {
                return;
            }
            while (!llIlllllIllllII(lllllllllllllIIlIIIlllIlIIlIIllI, RenderGlobal.lIIlllllllIIIl[22])) {
                float lllllllllllllIIlIIIlllIlIIlIIlIl = (float)lllllllllllllIIlIIIlllIlIIlIIlll;
                float lllllllllllllIIlIIIlllIlIIlIIlII = (float)(lllllllllllllIIlIIIlllIlIIlIIlll + RenderGlobal.lIIlllllllIIIl[20]);
                if (llIlllllIllIlll(lllllllllllllIIlIIIlllIlIIlIlIlI ? 1 : 0)) {
                    lllllllllllllIIlIIIlllIlIIlIIlII = (float)lllllllllllllIIlIIIlllIlIIlIIlll;
                    lllllllllllllIIlIIIlllIlIIlIIlIl = (float)(lllllllllllllIIlIIIlllIlIIlIIlll + RenderGlobal.lIIlllllllIIIl[20]);
                }
                lllllllllllllIIlIIIlllIlIIlIllII.pos(lllllllllllllIIlIIIlllIlIIlIIlIl, lllllllllllllIIlIIIlllIlIIlIIIlI, lllllllllllllIIlIIIlllIlIIlIIllI).endVertex();
                lllllllllllllIIlIIIlllIlIIlIllII.pos(lllllllllllllIIlIIIlllIlIIlIIlII, lllllllllllllIIlIIIlllIlIIlIIIlI, lllllllllllllIIlIIIlllIlIIlIIllI).endVertex();
                lllllllllllllIIlIIIlllIlIIlIllII.pos(lllllllllllllIIlIIIlllIlIIlIIlII, lllllllllllllIIlIIIlllIlIIlIIIlI, lllllllllllllIIlIIIlllIlIIlIIllI + RenderGlobal.lIIlllllllIIIl[20]).endVertex();
                lllllllllllllIIlIIIlllIlIIlIllII.pos(lllllllllllllIIlIIIlllIlIIlIIlIl, lllllllllllllIIlIIIlllIlIIlIIIlI, lllllllllllllIIlIIIlllIlIIlIIllI + RenderGlobal.lIIlllllllIIIl[20]).endVertex();
                lllllllllllllIIlIIIlllIlIIlIIllI += 64;
            }
            lllllllllllllIIlIIIlllIlIIlIIlll += 64;
        }
    }
    
    class ContainerLocalRenderInformation
    {
        final /* synthetic */ Set<EnumFacing> setFacing;
        final /* synthetic */ int counter;
        final /* synthetic */ EnumFacing facing;
        final /* synthetic */ RenderChunk renderChunk;
        
        private ContainerLocalRenderInformation(final RenderChunk lllllllllllllIIlIlIllllIlllIIIIl, final EnumFacing lllllllllllllIIlIlIllllIlllIIIII, final int lllllllllllllIIlIlIllllIllIlllll) {
            this.setFacing = EnumSet.noneOf(EnumFacing.class);
            this.renderChunk = lllllllllllllIIlIlIllllIlllIIIIl;
            this.facing = lllllllllllllIIlIlIllllIlllIIIII;
            this.counter = lllllllllllllIIlIlIllllIllIlllll;
        }
    }
}
