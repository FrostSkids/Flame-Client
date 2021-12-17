// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.tileentity;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.world.World;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.block.BlockPistonBase;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockPistonExtension;
import net.minecraft.init.Blocks;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.tileentity.TileEntityPiston;

public class TileEntityPistonRenderer extends TileEntitySpecialRenderer<TileEntityPiston>
{
    private final /* synthetic */ BlockRendererDispatcher blockRenderer;
    private static final /* synthetic */ int[] llIIllIlllIlll;
    
    @Override
    public void renderTileEntityAt(final TileEntityPiston llllllllllllIllIllllllIlIIlIlllI, final double llllllllllllIllIllllllIlIIllllII, final double llllllllllllIllIllllllIlIIlllIll, final double llllllllllllIllIllllllIlIIlIlIll, final float llllllllllllIllIllllllIlIIlIlIlI, final int llllllllllllIllIllllllIlIIlllIII) {
        final BlockPos llllllllllllIllIllllllIlIIllIlll = llllllllllllIllIllllllIlIIlIlllI.getPos();
        IBlockState llllllllllllIllIllllllIlIIllIllI = llllllllllllIllIllllllIlIIlIlllI.getPistonState();
        final Block llllllllllllIllIllllllIlIIllIlIl = llllllllllllIllIllllllIlIIllIllI.getBlock();
        if (lIIIllllIIlIllll(llllllllllllIllIllllllIlIIllIlIl.getMaterial(), Material.air) && lIIIllllIIllIIII(lIIIllllIIlIllIl(llllllllllllIllIllllllIlIIlIlllI.getProgress(llllllllllllIllIllllllIlIIlIlIlI), 1.0f))) {
            final Tessellator llllllllllllIllIllllllIlIIllIlII = Tessellator.getInstance();
            final WorldRenderer llllllllllllIllIllllllIlIIllIIll = llllllllllllIllIllllllIlIIllIlII.getWorldRenderer();
            this.bindTexture(TextureMap.locationBlocksTexture);
            RenderHelper.disableStandardItemLighting();
            GlStateManager.blendFunc(TileEntityPistonRenderer.llIIllIlllIlll[0], TileEntityPistonRenderer.llIIllIlllIlll[1]);
            GlStateManager.enableBlend();
            GlStateManager.disableCull();
            if (lIIIllllIIllIIIl(Minecraft.isAmbientOcclusionEnabled() ? 1 : 0)) {
                GlStateManager.shadeModel(TileEntityPistonRenderer.llIIllIlllIlll[2]);
                "".length();
                if (((0x9E ^ 0xB5) & ~(0xB6 ^ 0x9D)) == (0xB2 ^ 0xB6)) {
                    return;
                }
            }
            else {
                GlStateManager.shadeModel(TileEntityPistonRenderer.llIIllIlllIlll[3]);
            }
            llllllllllllIllIllllllIlIIllIIll.begin(TileEntityPistonRenderer.llIIllIlllIlll[4], DefaultVertexFormats.BLOCK);
            llllllllllllIllIllllllIlIIllIIll.setTranslation((float)llllllllllllIllIllllllIlIIllllII - llllllllllllIllIllllllIlIIllIlll.getX() + llllllllllllIllIllllllIlIIlIlllI.getOffsetX(llllllllllllIllIllllllIlIIlIlIlI), (float)llllllllllllIllIllllllIlIIlllIll - llllllllllllIllIllllllIlIIllIlll.getY() + llllllllllllIllIllllllIlIIlIlllI.getOffsetY(llllllllllllIllIllllllIlIIlIlIlI), (float)llllllllllllIllIllllllIlIIlIlIll - llllllllllllIllIllllllIlIIllIlll.getZ() + llllllllllllIllIllllllIlIIlIlllI.getOffsetZ(llllllllllllIllIllllllIlIIlIlIlI));
            final World llllllllllllIllIllllllIlIIllIIlI = this.getWorld();
            if (lIIIllllIIllIIlI(llllllllllllIllIllllllIlIIllIlIl, Blocks.piston_head) && lIIIllllIIllIIII(lIIIllllIIlIllIl(llllllllllllIllIllllllIlIIlIlllI.getProgress(llllllllllllIllIllllllIlIIlIlIlI), 0.5f))) {
                llllllllllllIllIllllllIlIIllIllI = llllllllllllIllIllllllIlIIllIllI.withProperty((IProperty<Comparable>)BlockPistonExtension.SHORT, (boolean)(TileEntityPistonRenderer.llIIllIlllIlll[5] != 0));
                this.blockRenderer.getBlockModelRenderer().renderModel(llllllllllllIllIllllllIlIIllIIlI, this.blockRenderer.getModelFromBlockState(llllllllllllIllIllllllIlIIllIllI, llllllllllllIllIllllllIlIIllIIlI, llllllllllllIllIllllllIlIIllIlll), llllllllllllIllIllllllIlIIllIllI, llllllllllllIllIllllllIlIIllIlll, llllllllllllIllIllllllIlIIllIIll, (boolean)(TileEntityPistonRenderer.llIIllIlllIlll[5] != 0));
                "".length();
                "".length();
                if (((0x1A ^ 0x1C) & ~(0x44 ^ 0x42)) == "  ".length()) {
                    return;
                }
            }
            else if (lIIIllllIIllIIIl(llllllllllllIllIllllllIlIIlIlllI.shouldPistonHeadBeRendered() ? 1 : 0) && lIIIllllIIllIIll(llllllllllllIllIllllllIlIIlIlllI.isExtending() ? 1 : 0)) {
                BlockPistonExtension.EnumPistonType enumPistonType;
                if (lIIIllllIIllIIlI(llllllllllllIllIllllllIlIIllIlIl, Blocks.sticky_piston)) {
                    enumPistonType = BlockPistonExtension.EnumPistonType.STICKY;
                    "".length();
                    if ("  ".length() >= "   ".length()) {
                        return;
                    }
                }
                else {
                    enumPistonType = BlockPistonExtension.EnumPistonType.DEFAULT;
                }
                final BlockPistonExtension.EnumPistonType llllllllllllIllIllllllIlIIllIIIl = enumPistonType;
                final IBlockState withProperty;
                IBlockState llllllllllllIllIllllllIlIIllIIII = withProperty = Blocks.piston_head.getDefaultState().withProperty(BlockPistonExtension.TYPE, llllllllllllIllIllllllIlIIllIIIl).withProperty((IProperty<Comparable>)BlockPistonExtension.FACING, (EnumFacing)llllllllllllIllIllllllIlIIllIllI.getValue((IProperty<V>)BlockPistonBase.FACING));
                final PropertyBool short1 = BlockPistonExtension.SHORT;
                int b;
                if (lIIIllllIIllIlII(lIIIllllIIlIlllI(llllllllllllIllIllllllIlIIlIlllI.getProgress(llllllllllllIllIllllllIlIIlIlIlI), 0.5f))) {
                    b = TileEntityPistonRenderer.llIIllIlllIlll[5];
                    "".length();
                    if ("  ".length() != "  ".length()) {
                        return;
                    }
                }
                else {
                    b = TileEntityPistonRenderer.llIIllIlllIlll[6];
                }
                llllllllllllIllIllllllIlIIllIIII = withProperty.withProperty((IProperty<Comparable>)short1, (boolean)(b != 0));
                this.blockRenderer.getBlockModelRenderer().renderModel(llllllllllllIllIllllllIlIIllIIlI, this.blockRenderer.getModelFromBlockState(llllllllllllIllIllllllIlIIllIIII, llllllllllllIllIllllllIlIIllIIlI, llllllllllllIllIllllllIlIIllIlll), llllllllllllIllIllllllIlIIllIIII, llllllllllllIllIllllllIlIIllIlll, llllllllllllIllIllllllIlIIllIIll, (boolean)(TileEntityPistonRenderer.llIIllIlllIlll[5] != 0));
                "".length();
                llllllllllllIllIllllllIlIIllIIll.setTranslation((float)llllllllllllIllIllllllIlIIllllII - llllllllllllIllIllllllIlIIllIlll.getX(), (float)llllllllllllIllIllllllIlIIlllIll - llllllllllllIllIllllllIlIIllIlll.getY(), (float)llllllllllllIllIllllllIlIIlIlIll - llllllllllllIllIllllllIlIIllIlll.getZ());
                llllllllllllIllIllllllIlIIllIllI.withProperty((IProperty<Comparable>)BlockPistonBase.EXTENDED, (boolean)(TileEntityPistonRenderer.llIIllIlllIlll[5] != 0));
                "".length();
                this.blockRenderer.getBlockModelRenderer().renderModel(llllllllllllIllIllllllIlIIllIIlI, this.blockRenderer.getModelFromBlockState(llllllllllllIllIllllllIlIIllIllI, llllllllllllIllIllllllIlIIllIIlI, llllllllllllIllIllllllIlIIllIlll), llllllllllllIllIllllllIlIIllIllI, llllllllllllIllIllllllIlIIllIlll, llllllllllllIllIllllllIlIIllIIll, (boolean)(TileEntityPistonRenderer.llIIllIlllIlll[5] != 0));
                "".length();
                "".length();
                if ((0x79 ^ 0x7D) < "  ".length()) {
                    return;
                }
            }
            else {
                this.blockRenderer.getBlockModelRenderer().renderModel(llllllllllllIllIllllllIlIIllIIlI, this.blockRenderer.getModelFromBlockState(llllllllllllIllIllllllIlIIllIllI, llllllllllllIllIllllllIlIIllIIlI, llllllllllllIllIllllllIlIIllIlll), llllllllllllIllIllllllIlIIllIllI, llllllllllllIllIllllllIlIIllIlll, llllllllllllIllIllllllIlIIllIIll, (boolean)(TileEntityPistonRenderer.llIIllIlllIlll[6] != 0));
                "".length();
            }
            llllllllllllIllIllllllIlIIllIIll.setTranslation(0.0, 0.0, 0.0);
            llllllllllllIllIllllllIlIIllIlII.draw();
            RenderHelper.enableStandardItemLighting();
        }
    }
    
    public TileEntityPistonRenderer() {
        this.blockRenderer = Minecraft.getMinecraft().getBlockRendererDispatcher();
    }
    
    private static boolean lIIIllllIIllIlII(final int llllllllllllIllIllllllIlIIIIIllI) {
        return llllllllllllIllIllllllIlIIIIIllI >= 0;
    }
    
    private static boolean lIIIllllIIllIIII(final int llllllllllllIllIllllllIlIIIIIlII) {
        return llllllllllllIllIllllllIlIIIIIlII < 0;
    }
    
    private static boolean lIIIllllIIllIIll(final int llllllllllllIllIllllllIlIIIIlIII) {
        return llllllllllllIllIllllllIlIIIIlIII == 0;
    }
    
    private static void lIIIllllIIlIllII() {
        (llIIllIlllIlll = new int[7])[0] = (0xFFFFA763 & 0x5B9E);
        TileEntityPistonRenderer.llIIllIlllIlll[1] = (0xFFFFA307 & 0x5FFB);
        TileEntityPistonRenderer.llIIllIlllIlll[2] = (-(0xFFFFC7ED & 0x78FF) & (-1 & 0x5DED));
        TileEntityPistonRenderer.llIIllIlllIlll[3] = (-(0xFFFFD55B & 0x6AE7) & (0xFFFFDD4E & 0x7FF3));
        TileEntityPistonRenderer.llIIllIlllIlll[4] = (0xD9 ^ 0x91 ^ (0x20 ^ 0x6F));
        TileEntityPistonRenderer.llIIllIlllIlll[5] = " ".length();
        TileEntityPistonRenderer.llIIllIlllIlll[6] = ((0x78 ^ 0x70) & ~(0x6E ^ 0x66));
    }
    
    private static boolean lIIIllllIIllIIlI(final Object llllllllllllIllIllllllIlIIIIllIl, final Object llllllllllllIllIllllllIlIIIIllII) {
        return llllllllllllIllIllllllIlIIIIllIl == llllllllllllIllIllllllIlIIIIllII;
    }
    
    static {
        lIIIllllIIlIllII();
    }
    
    private static boolean lIIIllllIIllIIIl(final int llllllllllllIllIllllllIlIIIIlIlI) {
        return llllllllllllIllIllllllIlIIIIlIlI != 0;
    }
    
    private static int lIIIllllIIlIllIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static int lIIIllllIIlIlllI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lIIIllllIIlIllll(final Object llllllllllllIllIllllllIlIIIlIIIl, final Object llllllllllllIllIllllllIlIIIlIIII) {
        return llllllllllllIllIllllllIlIIIlIIIl != llllllllllllIllIllllllIlIIIlIIII;
    }
}
