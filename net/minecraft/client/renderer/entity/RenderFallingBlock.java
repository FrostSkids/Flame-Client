// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import net.minecraft.client.resources.model.IBakedModel;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.world.World;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.world.IBlockAccess;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.BlockPos;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.item.EntityFallingBlock;

public class RenderFallingBlock extends Render<EntityFallingBlock>
{
    private static final /* synthetic */ int[] lIIlIlIIIlIlIl;
    
    @Override
    protected ResourceLocation getEntityTexture(final EntityFallingBlock lllllllllllllIIllIlIIllIllIIIlll) {
        return TextureMap.locationBlocksTexture;
    }
    
    @Override
    public void doRender(final EntityFallingBlock lllllllllllllIIllIlIIllIlllIlIll, final double lllllllllllllIIllIlIIllIlllIlIlI, final double lllllllllllllIIllIlIIllIllIlIlll, final double lllllllllllllIIllIlIIllIlllIlIII, final float lllllllllllllIIllIlIIllIllIlIlIl, final float lllllllllllllIIllIlIIllIllIlIlII) {
        if (llIIlllllIIIIIl(lllllllllllllIIllIlIIllIlllIlIll.getBlock())) {
            this.bindTexture(TextureMap.locationBlocksTexture);
            final IBlockState lllllllllllllIIllIlIIllIlllIIlIl = lllllllllllllIIllIlIIllIlllIlIll.getBlock();
            final Block lllllllllllllIIllIlIIllIlllIIlII = lllllllllllllIIllIlIIllIlllIIlIl.getBlock();
            final BlockPos lllllllllllllIIllIlIIllIlllIIIll = new BlockPos(lllllllllllllIIllIlIIllIlllIlIll);
            final World lllllllllllllIIllIlIIllIlllIIIlI = lllllllllllllIIllIlIIllIlllIlIll.getWorldObj();
            if (llIIlllllIIIIlI(lllllllllllllIIllIlIIllIlllIIlIl, lllllllllllllIIllIlIIllIlllIIIlI.getBlockState(lllllllllllllIIllIlIIllIlllIIIll)) && llIIlllllIIIIll(lllllllllllllIIllIlIIllIlllIIlII.getRenderType(), RenderFallingBlock.lIIlIlIIIlIlIl[0]) && llIIlllllIIIlII(lllllllllllllIIllIlIIllIlllIIlII.getRenderType(), RenderFallingBlock.lIIlIlIIIlIlIl[1])) {
                GlStateManager.pushMatrix();
                GlStateManager.translate((float)lllllllllllllIIllIlIIllIlllIlIlI, (float)lllllllllllllIIllIlIIllIllIlIlll, (float)lllllllllllllIIllIlIIllIlllIlIII);
                GlStateManager.disableLighting();
                final Tessellator lllllllllllllIIllIlIIllIlllIIIIl = Tessellator.getInstance();
                final WorldRenderer lllllllllllllIIllIlIIllIlllIIIII = lllllllllllllIIllIlIIllIlllIIIIl.getWorldRenderer();
                lllllllllllllIIllIlIIllIlllIIIII.begin(RenderFallingBlock.lIIlIlIIIlIlIl[2], DefaultVertexFormats.BLOCK);
                final int lllllllllllllIIllIlIIllIllIlllll = lllllllllllllIIllIlIIllIlllIIIll.getX();
                final int lllllllllllllIIllIlIIllIllIllllI = lllllllllllllIIllIlIIllIlllIIIll.getY();
                final int lllllllllllllIIllIlIIllIllIlllIl = lllllllllllllIIllIlIIllIlllIIIll.getZ();
                lllllllllllllIIllIlIIllIlllIIIII.setTranslation(-lllllllllllllIIllIlIIllIllIlllll - 0.5f, -lllllllllllllIIllIlIIllIllIllllI, -lllllllllllllIIllIlIIllIllIlllIl - 0.5f);
                final BlockRendererDispatcher lllllllllllllIIllIlIIllIllIlllII = Minecraft.getMinecraft().getBlockRendererDispatcher();
                final IBakedModel lllllllllllllIIllIlIIllIllIllIll = lllllllllllllIIllIlIIllIllIlllII.getModelFromBlockState(lllllllllllllIIllIlIIllIlllIIlIl, lllllllllllllIIllIlIIllIlllIIIlI, null);
                lllllllllllllIIllIlIIllIllIlllII.getBlockModelRenderer().renderModel(lllllllllllllIIllIlIIllIlllIIIlI, lllllllllllllIIllIlIIllIllIllIll, lllllllllllllIIllIlIIllIlllIIlIl, lllllllllllllIIllIlIIllIlllIIIll, lllllllllllllIIllIlIIllIlllIIIII, (boolean)(RenderFallingBlock.lIIlIlIIIlIlIl[3] != 0));
                "".length();
                lllllllllllllIIllIlIIllIlllIIIII.setTranslation(0.0, 0.0, 0.0);
                lllllllllllllIIllIlIIllIlllIIIIl.draw();
                GlStateManager.enableLighting();
                GlStateManager.popMatrix();
                super.doRender(lllllllllllllIIllIlIIllIlllIlIll, lllllllllllllIIllIlIIllIlllIlIlI, lllllllllllllIIllIlIIllIllIlIlll, lllllllllllllIIllIlIIllIlllIlIII, lllllllllllllIIllIlIIllIllIlIlIl, lllllllllllllIIllIlIIllIllIlIlII);
            }
        }
    }
    
    public RenderFallingBlock(final RenderManager lllllllllllllIIllIlIIlllIIIIIIIl) {
        super(lllllllllllllIIllIlIIlllIIIIIIIl);
        this.shadowSize = 0.5f;
    }
    
    private static boolean llIIlllllIIIIlI(final Object lllllllllllllIIllIlIIllIlIlIlllI, final Object lllllllllllllIIllIlIIllIlIlIllIl) {
        return lllllllllllllIIllIlIIllIlIlIlllI != lllllllllllllIIllIlIIllIlIlIllIl;
    }
    
    static {
        llIIlllllIIIIII();
    }
    
    private static boolean llIIlllllIIIIIl(final Object lllllllllllllIIllIlIIllIlIlIlIll) {
        return lllllllllllllIIllIlIIllIlIlIlIll != null;
    }
    
    private static boolean llIIlllllIIIlII(final int lllllllllllllIIllIlIIllIlIllIIlI, final int lllllllllllllIIllIlIIllIlIllIIIl) {
        return lllllllllllllIIllIlIIllIlIllIIlI == lllllllllllllIIllIlIIllIlIllIIIl;
    }
    
    private static boolean llIIlllllIIIIll(final int lllllllllllllIIllIlIIllIlIlIlIII, final int lllllllllllllIIllIlIIllIlIlIIlll) {
        return lllllllllllllIIllIlIIllIlIlIlIII != lllllllllllllIIllIlIIllIlIlIIlll;
    }
    
    private static void llIIlllllIIIIII() {
        (lIIlIlIIIlIlIl = new int[4])[0] = -" ".length();
        RenderFallingBlock.lIIlIlIIIlIlIl[1] = "   ".length();
        RenderFallingBlock.lIIlIlIIIlIlIl[2] = (0x3 ^ 0x4);
        RenderFallingBlock.lIIlIlIIIlIlIl[3] = ((0x62 ^ 0x73) & ~(0x16 ^ 0x7));
    }
}
