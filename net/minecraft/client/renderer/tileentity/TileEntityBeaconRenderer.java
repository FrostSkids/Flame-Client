// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.tileentity;

import net.minecraft.tileentity.TileEntity;
import java.util.List;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.GlStateManager;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tileentity.TileEntityBeacon;

public class TileEntityBeaconRenderer extends TileEntitySpecialRenderer<TileEntityBeacon>
{
    private static final /* synthetic */ String[] lIIllIlIIllIIl;
    private static final /* synthetic */ ResourceLocation beaconBeam;
    private static final /* synthetic */ int[] lIIllIlIIllIlI;
    
    private static String llIllIIIlIIllll(String lllllllllllllIIlIlIlIllIlllIIIIl, final String lllllllllllllIIlIlIlIllIlllIIlIl) {
        lllllllllllllIIlIlIlIllIlllIIIIl = new String(Base64.getDecoder().decode(lllllllllllllIIlIlIlIllIlllIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIlIlIllIlllIIlII = new StringBuilder();
        final char[] lllllllllllllIIlIlIlIllIlllIIIll = lllllllllllllIIlIlIlIllIlllIIlIl.toCharArray();
        int lllllllllllllIIlIlIlIllIlllIIIlI = TileEntityBeaconRenderer.lIIllIlIIllIlI[0];
        final float lllllllllllllIIlIlIlIllIllIlllII = (Object)lllllllllllllIIlIlIlIllIlllIIIIl.toCharArray();
        final String lllllllllllllIIlIlIlIllIllIllIll = (String)lllllllllllllIIlIlIlIllIllIlllII.length;
        int lllllllllllllIIlIlIlIllIllIllIlI = TileEntityBeaconRenderer.lIIllIlIIllIlI[0];
        while (llIllIIIlIlIlIl(lllllllllllllIIlIlIlIllIllIllIlI, (int)lllllllllllllIIlIlIlIllIllIllIll)) {
            final char lllllllllllllIIlIlIlIllIlllIIlll = lllllllllllllIIlIlIlIllIllIlllII[lllllllllllllIIlIlIlIllIllIllIlI];
            lllllllllllllIIlIlIlIllIlllIIlII.append((char)(lllllllllllllIIlIlIlIllIlllIIlll ^ lllllllllllllIIlIlIlIllIlllIIIll[lllllllllllllIIlIlIlIllIlllIIIlI % lllllllllllllIIlIlIlIllIlllIIIll.length]));
            "".length();
            ++lllllllllllllIIlIlIlIllIlllIIIlI;
            ++lllllllllllllIIlIlIlIllIllIllIlI;
            "".length();
            if ((31 + 132 - 83 + 57 ^ 112 + 52 - 48 + 25) == 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIlIlIllIlllIIlII);
    }
    
    @Override
    public void renderTileEntityAt(final TileEntityBeacon lllllllllllllIIlIlIlIlllIIIlllll, final double lllllllllllllIIlIlIlIlllIIIllllI, final double lllllllllllllIIlIlIlIlllIIIlllIl, final double lllllllllllllIIlIlIlIlllIIlllllI, final float lllllllllllllIIlIlIlIlllIIIllIll, final int lllllllllllllIIlIlIlIlllIIllllII) {
        final float lllllllllllllIIlIlIlIlllIIlllIll = lllllllllllllIIlIlIlIlllIIIlllll.shouldBeamRender();
        GlStateManager.alphaFunc(TileEntityBeaconRenderer.lIIllIlIIllIlI[1], 0.1f);
        if (llIllIIIlIlIIll(llIllIIIlIlIIlI(lllllllllllllIIlIlIlIlllIIlllIll, 0.0f))) {
            final Tessellator lllllllllllllIIlIlIlIlllIIlllIlI = Tessellator.getInstance();
            final WorldRenderer lllllllllllllIIlIlIlIlllIIlllIIl = lllllllllllllIIlIlIlIlllIIlllIlI.getWorldRenderer();
            GlStateManager.disableFog();
            final List<TileEntityBeacon.BeamSegment> lllllllllllllIIlIlIlIlllIIlllIII = lllllllllllllIIlIlIlIlllIIIlllll.getBeamSegments();
            int lllllllllllllIIlIlIlIlllIIllIlll = TileEntityBeaconRenderer.lIIllIlIIllIlI[0];
            int lllllllllllllIIlIlIlIlllIIllIllI = TileEntityBeaconRenderer.lIIllIlIIllIlI[0];
            "".length();
            if ("   ".length() <= " ".length()) {
                return;
            }
            while (!llIllIIIlIlIlII(lllllllllllllIIlIlIlIlllIIllIllI, lllllllllllllIIlIlIlIlllIIlllIII.size())) {
                final TileEntityBeacon.BeamSegment lllllllllllllIIlIlIlIlllIIllIlIl = lllllllllllllIIlIlIlIlllIIlllIII.get(lllllllllllllIIlIlIlIlllIIllIllI);
                final int lllllllllllllIIlIlIlIlllIIllIlII = lllllllllllllIIlIlIlIlllIIllIlll + lllllllllllllIIlIlIlIlllIIllIlIl.getHeight();
                this.bindTexture(TileEntityBeaconRenderer.beaconBeam);
                GL11.glTexParameterf(TileEntityBeaconRenderer.lIIllIlIIllIlI[2], TileEntityBeaconRenderer.lIIllIlIIllIlI[3], 10497.0f);
                GL11.glTexParameterf(TileEntityBeaconRenderer.lIIllIlIIllIlI[2], TileEntityBeaconRenderer.lIIllIlIIllIlI[4], 10497.0f);
                GlStateManager.disableLighting();
                GlStateManager.disableCull();
                GlStateManager.disableBlend();
                GlStateManager.depthMask((boolean)(TileEntityBeaconRenderer.lIIllIlIIllIlI[5] != 0));
                GlStateManager.tryBlendFuncSeparate(TileEntityBeaconRenderer.lIIllIlIIllIlI[6], TileEntityBeaconRenderer.lIIllIlIIllIlI[5], TileEntityBeaconRenderer.lIIllIlIIllIlI[5], TileEntityBeaconRenderer.lIIllIlIIllIlI[0]);
                final double lllllllllllllIIlIlIlIlllIIllIIll = lllllllllllllIIlIlIlIlllIIIlllll.getWorld().getTotalWorldTime() + (double)lllllllllllllIIlIlIlIlllIIIllIll;
                final double lllllllllllllIIlIlIlIlllIIllIIlI = MathHelper.func_181162_h(-lllllllllllllIIlIlIlIlllIIllIIll * 0.2 - MathHelper.floor_double(-lllllllllllllIIlIlIlIlllIIllIIll * 0.1));
                final float lllllllllllllIIlIlIlIlllIIllIIIl = lllllllllllllIIlIlIlIlllIIllIlIl.getColors()[TileEntityBeaconRenderer.lIIllIlIIllIlI[0]];
                final float lllllllllllllIIlIlIlIlllIIllIIII = lllllllllllllIIlIlIlIlllIIllIlIl.getColors()[TileEntityBeaconRenderer.lIIllIlIIllIlI[5]];
                final float lllllllllllllIIlIlIlIlllIIlIllll = lllllllllllllIIlIlIlIlllIIllIlIl.getColors()[TileEntityBeaconRenderer.lIIllIlIIllIlI[7]];
                double lllllllllllllIIlIlIlIlllIIlIlllI = lllllllllllllIIlIlIlIlllIIllIIll * 0.025 * -1.5;
                double lllllllllllllIIlIlIlIlllIIlIllIl = 0.2;
                double lllllllllllllIIlIlIlIlllIIlIllII = 0.5 + Math.cos(lllllllllllllIIlIlIlIlllIIlIlllI + 2.356194490192345) * 0.2;
                double lllllllllllllIIlIlIlIlllIIlIlIll = 0.5 + Math.sin(lllllllllllllIIlIlIlIlllIIlIlllI + 2.356194490192345) * 0.2;
                double lllllllllllllIIlIlIlIlllIIlIlIlI = 0.5 + Math.cos(lllllllllllllIIlIlIlIlllIIlIlllI + 0.7853981633974483) * 0.2;
                double lllllllllllllIIlIlIlIlllIIlIlIIl = 0.5 + Math.sin(lllllllllllllIIlIlIlIlllIIlIlllI + 0.7853981633974483) * 0.2;
                double lllllllllllllIIlIlIlIlllIIlIlIII = 0.5 + Math.cos(lllllllllllllIIlIlIlIlllIIlIlllI + 3.9269908169872414) * 0.2;
                double lllllllllllllIIlIlIlIlllIIlIIlll = 0.5 + Math.sin(lllllllllllllIIlIlIlIlllIIlIlllI + 3.9269908169872414) * 0.2;
                double lllllllllllllIIlIlIlIlllIIlIIllI = 0.5 + Math.cos(lllllllllllllIIlIlIlIlllIIlIlllI + 5.497787143782138) * 0.2;
                double lllllllllllllIIlIlIlIlllIIlIIlIl = 0.5 + Math.sin(lllllllllllllIIlIlIlIlllIIlIlllI + 5.497787143782138) * 0.2;
                double lllllllllllllIIlIlIlIlllIIlIIlII = 0.0;
                double lllllllllllllIIlIlIlIlllIIlIIIll = 1.0;
                final double lllllllllllllIIlIlIlIlllIIlIIIlI = -1.0 + lllllllllllllIIlIlIlIlllIIllIIlI;
                final double lllllllllllllIIlIlIlIlllIIlIIIIl = lllllllllllllIIlIlIlIlllIIllIlIl.getHeight() * lllllllllllllIIlIlIlIlllIIlllIll * 2.5 + lllllllllllllIIlIlIlIlllIIlIIIlI;
                lllllllllllllIIlIlIlIlllIIlllIIl.begin(TileEntityBeaconRenderer.lIIllIlIIllIlI[8], DefaultVertexFormats.POSITION_TEX_COLOR);
                lllllllllllllIIlIlIlIlllIIlllIIl.pos(lllllllllllllIIlIlIlIlllIIIllllI + lllllllllllllIIlIlIlIlllIIlIllII, lllllllllllllIIlIlIlIlllIIIlllIl + lllllllllllllIIlIlIlIlllIIllIlII, lllllllllllllIIlIlIlIlllIIlllllI + lllllllllllllIIlIlIlIlllIIlIlIll).tex(1.0, lllllllllllllIIlIlIlIlllIIlIIIIl).color(lllllllllllllIIlIlIlIlllIIllIIIl, lllllllllllllIIlIlIlIlllIIllIIII, lllllllllllllIIlIlIlIlllIIlIllll, 1.0f).endVertex();
                lllllllllllllIIlIlIlIlllIIlllIIl.pos(lllllllllllllIIlIlIlIlllIIIllllI + lllllllllllllIIlIlIlIlllIIlIllII, lllllllllllllIIlIlIlIlllIIIlllIl + lllllllllllllIIlIlIlIlllIIllIlll, lllllllllllllIIlIlIlIlllIIlllllI + lllllllllllllIIlIlIlIlllIIlIlIll).tex(1.0, lllllllllllllIIlIlIlIlllIIlIIIlI).color(lllllllllllllIIlIlIlIlllIIllIIIl, lllllllllllllIIlIlIlIlllIIllIIII, lllllllllllllIIlIlIlIlllIIlIllll, 1.0f).endVertex();
                lllllllllllllIIlIlIlIlllIIlllIIl.pos(lllllllllllllIIlIlIlIlllIIIllllI + lllllllllllllIIlIlIlIlllIIlIlIlI, lllllllllllllIIlIlIlIlllIIIlllIl + lllllllllllllIIlIlIlIlllIIllIlll, lllllllllllllIIlIlIlIlllIIlllllI + lllllllllllllIIlIlIlIlllIIlIlIIl).tex(0.0, lllllllllllllIIlIlIlIlllIIlIIIlI).color(lllllllllllllIIlIlIlIlllIIllIIIl, lllllllllllllIIlIlIlIlllIIllIIII, lllllllllllllIIlIlIlIlllIIlIllll, 1.0f).endVertex();
                lllllllllllllIIlIlIlIlllIIlllIIl.pos(lllllllllllllIIlIlIlIlllIIIllllI + lllllllllllllIIlIlIlIlllIIlIlIlI, lllllllllllllIIlIlIlIlllIIIlllIl + lllllllllllllIIlIlIlIlllIIllIlII, lllllllllllllIIlIlIlIlllIIlllllI + lllllllllllllIIlIlIlIlllIIlIlIIl).tex(0.0, lllllllllllllIIlIlIlIlllIIlIIIIl).color(lllllllllllllIIlIlIlIlllIIllIIIl, lllllllllllllIIlIlIlIlllIIllIIII, lllllllllllllIIlIlIlIlllIIlIllll, 1.0f).endVertex();
                lllllllllllllIIlIlIlIlllIIlllIIl.pos(lllllllllllllIIlIlIlIlllIIIllllI + lllllllllllllIIlIlIlIlllIIlIIllI, lllllllllllllIIlIlIlIlllIIIlllIl + lllllllllllllIIlIlIlIlllIIllIlII, lllllllllllllIIlIlIlIlllIIlllllI + lllllllllllllIIlIlIlIlllIIlIIlIl).tex(1.0, lllllllllllllIIlIlIlIlllIIlIIIIl).color(lllllllllllllIIlIlIlIlllIIllIIIl, lllllllllllllIIlIlIlIlllIIllIIII, lllllllllllllIIlIlIlIlllIIlIllll, 1.0f).endVertex();
                lllllllllllllIIlIlIlIlllIIlllIIl.pos(lllllllllllllIIlIlIlIlllIIIllllI + lllllllllllllIIlIlIlIlllIIlIIllI, lllllllllllllIIlIlIlIlllIIIlllIl + lllllllllllllIIlIlIlIlllIIllIlll, lllllllllllllIIlIlIlIlllIIlllllI + lllllllllllllIIlIlIlIlllIIlIIlIl).tex(1.0, lllllllllllllIIlIlIlIlllIIlIIIlI).color(lllllllllllllIIlIlIlIlllIIllIIIl, lllllllllllllIIlIlIlIlllIIllIIII, lllllllllllllIIlIlIlIlllIIlIllll, 1.0f).endVertex();
                lllllllllllllIIlIlIlIlllIIlllIIl.pos(lllllllllllllIIlIlIlIlllIIIllllI + lllllllllllllIIlIlIlIlllIIlIlIII, lllllllllllllIIlIlIlIlllIIIlllIl + lllllllllllllIIlIlIlIlllIIllIlll, lllllllllllllIIlIlIlIlllIIlllllI + lllllllllllllIIlIlIlIlllIIlIIlll).tex(0.0, lllllllllllllIIlIlIlIlllIIlIIIlI).color(lllllllllllllIIlIlIlIlllIIllIIIl, lllllllllllllIIlIlIlIlllIIllIIII, lllllllllllllIIlIlIlIlllIIlIllll, 1.0f).endVertex();
                lllllllllllllIIlIlIlIlllIIlllIIl.pos(lllllllllllllIIlIlIlIlllIIIllllI + lllllllllllllIIlIlIlIlllIIlIlIII, lllllllllllllIIlIlIlIlllIIIlllIl + lllllllllllllIIlIlIlIlllIIllIlII, lllllllllllllIIlIlIlIlllIIlllllI + lllllllllllllIIlIlIlIlllIIlIIlll).tex(0.0, lllllllllllllIIlIlIlIlllIIlIIIIl).color(lllllllllllllIIlIlIlIlllIIllIIIl, lllllllllllllIIlIlIlIlllIIllIIII, lllllllllllllIIlIlIlIlllIIlIllll, 1.0f).endVertex();
                lllllllllllllIIlIlIlIlllIIlllIIl.pos(lllllllllllllIIlIlIlIlllIIIllllI + lllllllllllllIIlIlIlIlllIIlIlIlI, lllllllllllllIIlIlIlIlllIIIlllIl + lllllllllllllIIlIlIlIlllIIllIlII, lllllllllllllIIlIlIlIlllIIlllllI + lllllllllllllIIlIlIlIlllIIlIlIIl).tex(1.0, lllllllllllllIIlIlIlIlllIIlIIIIl).color(lllllllllllllIIlIlIlIlllIIllIIIl, lllllllllllllIIlIlIlIlllIIllIIII, lllllllllllllIIlIlIlIlllIIlIllll, 1.0f).endVertex();
                lllllllllllllIIlIlIlIlllIIlllIIl.pos(lllllllllllllIIlIlIlIlllIIIllllI + lllllllllllllIIlIlIlIlllIIlIlIlI, lllllllllllllIIlIlIlIlllIIIlllIl + lllllllllllllIIlIlIlIlllIIllIlll, lllllllllllllIIlIlIlIlllIIlllllI + lllllllllllllIIlIlIlIlllIIlIlIIl).tex(1.0, lllllllllllllIIlIlIlIlllIIlIIIlI).color(lllllllllllllIIlIlIlIlllIIllIIIl, lllllllllllllIIlIlIlIlllIIllIIII, lllllllllllllIIlIlIlIlllIIlIllll, 1.0f).endVertex();
                lllllllllllllIIlIlIlIlllIIlllIIl.pos(lllllllllllllIIlIlIlIlllIIIllllI + lllllllllllllIIlIlIlIlllIIlIIllI, lllllllllllllIIlIlIlIlllIIIlllIl + lllllllllllllIIlIlIlIlllIIllIlll, lllllllllllllIIlIlIlIlllIIlllllI + lllllllllllllIIlIlIlIlllIIlIIlIl).tex(0.0, lllllllllllllIIlIlIlIlllIIlIIIlI).color(lllllllllllllIIlIlIlIlllIIllIIIl, lllllllllllllIIlIlIlIlllIIllIIII, lllllllllllllIIlIlIlIlllIIlIllll, 1.0f).endVertex();
                lllllllllllllIIlIlIlIlllIIlllIIl.pos(lllllllllllllIIlIlIlIlllIIIllllI + lllllllllllllIIlIlIlIlllIIlIIllI, lllllllllllllIIlIlIlIlllIIIlllIl + lllllllllllllIIlIlIlIlllIIllIlII, lllllllllllllIIlIlIlIlllIIlllllI + lllllllllllllIIlIlIlIlllIIlIIlIl).tex(0.0, lllllllllllllIIlIlIlIlllIIlIIIIl).color(lllllllllllllIIlIlIlIlllIIllIIIl, lllllllllllllIIlIlIlIlllIIllIIII, lllllllllllllIIlIlIlIlllIIlIllll, 1.0f).endVertex();
                lllllllllllllIIlIlIlIlllIIlllIIl.pos(lllllllllllllIIlIlIlIlllIIIllllI + lllllllllllllIIlIlIlIlllIIlIlIII, lllllllllllllIIlIlIlIlllIIIlllIl + lllllllllllllIIlIlIlIlllIIllIlII, lllllllllllllIIlIlIlIlllIIlllllI + lllllllllllllIIlIlIlIlllIIlIIlll).tex(1.0, lllllllllllllIIlIlIlIlllIIlIIIIl).color(lllllllllllllIIlIlIlIlllIIllIIIl, lllllllllllllIIlIlIlIlllIIllIIII, lllllllllllllIIlIlIlIlllIIlIllll, 1.0f).endVertex();
                lllllllllllllIIlIlIlIlllIIlllIIl.pos(lllllllllllllIIlIlIlIlllIIIllllI + lllllllllllllIIlIlIlIlllIIlIlIII, lllllllllllllIIlIlIlIlllIIIlllIl + lllllllllllllIIlIlIlIlllIIllIlll, lllllllllllllIIlIlIlIlllIIlllllI + lllllllllllllIIlIlIlIlllIIlIIlll).tex(1.0, lllllllllllllIIlIlIlIlllIIlIIIlI).color(lllllllllllllIIlIlIlIlllIIllIIIl, lllllllllllllIIlIlIlIlllIIllIIII, lllllllllllllIIlIlIlIlllIIlIllll, 1.0f).endVertex();
                lllllllllllllIIlIlIlIlllIIlllIIl.pos(lllllllllllllIIlIlIlIlllIIIllllI + lllllllllllllIIlIlIlIlllIIlIllII, lllllllllllllIIlIlIlIlllIIIlllIl + lllllllllllllIIlIlIlIlllIIllIlll, lllllllllllllIIlIlIlIlllIIlllllI + lllllllllllllIIlIlIlIlllIIlIlIll).tex(0.0, lllllllllllllIIlIlIlIlllIIlIIIlI).color(lllllllllllllIIlIlIlIlllIIllIIIl, lllllllllllllIIlIlIlIlllIIllIIII, lllllllllllllIIlIlIlIlllIIlIllll, 1.0f).endVertex();
                lllllllllllllIIlIlIlIlllIIlllIIl.pos(lllllllllllllIIlIlIlIlllIIIllllI + lllllllllllllIIlIlIlIlllIIlIllII, lllllllllllllIIlIlIlIlllIIIlllIl + lllllllllllllIIlIlIlIlllIIllIlII, lllllllllllllIIlIlIlIlllIIlllllI + lllllllllllllIIlIlIlIlllIIlIlIll).tex(0.0, lllllllllllllIIlIlIlIlllIIlIIIIl).color(lllllllllllllIIlIlIlIlllIIllIIIl, lllllllllllllIIlIlIlIlllIIllIIII, lllllllllllllIIlIlIlIlllIIlIllll, 1.0f).endVertex();
                lllllllllllllIIlIlIlIlllIIlllIlI.draw();
                GlStateManager.enableBlend();
                GlStateManager.tryBlendFuncSeparate(TileEntityBeaconRenderer.lIIllIlIIllIlI[6], TileEntityBeaconRenderer.lIIllIlIIllIlI[9], TileEntityBeaconRenderer.lIIllIlIIllIlI[5], TileEntityBeaconRenderer.lIIllIlIIllIlI[0]);
                GlStateManager.depthMask((boolean)(TileEntityBeaconRenderer.lIIllIlIIllIlI[0] != 0));
                lllllllllllllIIlIlIlIlllIIlIlllI = 0.2;
                lllllllllllllIIlIlIlIlllIIlIllIl = 0.2;
                lllllllllllllIIlIlIlIlllIIlIllII = 0.8;
                lllllllllllllIIlIlIlIlllIIlIlIll = 0.2;
                lllllllllllllIIlIlIlIlllIIlIlIlI = 0.2;
                lllllllllllllIIlIlIlIlllIIlIlIIl = 0.8;
                lllllllllllllIIlIlIlIlllIIlIlIII = 0.8;
                lllllllllllllIIlIlIlIlllIIlIIlll = 0.8;
                lllllllllllllIIlIlIlIlllIIlIIllI = 0.0;
                lllllllllllllIIlIlIlIlllIIlIIlIl = 1.0;
                lllllllllllllIIlIlIlIlllIIlIIlII = -1.0 + lllllllllllllIIlIlIlIlllIIllIIlI;
                lllllllllllllIIlIlIlIlllIIlIIIll = lllllllllllllIIlIlIlIlllIIllIlIl.getHeight() * lllllllllllllIIlIlIlIlllIIlllIll + lllllllllllllIIlIlIlIlllIIlIIlII;
                lllllllllllllIIlIlIlIlllIIlllIIl.begin(TileEntityBeaconRenderer.lIIllIlIIllIlI[8], DefaultVertexFormats.POSITION_TEX_COLOR);
                lllllllllllllIIlIlIlIlllIIlllIIl.pos(lllllllllllllIIlIlIlIlllIIIllllI + 0.2, lllllllllllllIIlIlIlIlllIIIlllIl + lllllllllllllIIlIlIlIlllIIllIlII, lllllllllllllIIlIlIlIlllIIlllllI + 0.2).tex(1.0, lllllllllllllIIlIlIlIlllIIlIIIll).color(lllllllllllllIIlIlIlIlllIIllIIIl, lllllllllllllIIlIlIlIlllIIllIIII, lllllllllllllIIlIlIlIlllIIlIllll, 0.125f).endVertex();
                lllllllllllllIIlIlIlIlllIIlllIIl.pos(lllllllllllllIIlIlIlIlllIIIllllI + 0.2, lllllllllllllIIlIlIlIlllIIIlllIl + lllllllllllllIIlIlIlIlllIIllIlll, lllllllllllllIIlIlIlIlllIIlllllI + 0.2).tex(1.0, lllllllllllllIIlIlIlIlllIIlIIlII).color(lllllllllllllIIlIlIlIlllIIllIIIl, lllllllllllllIIlIlIlIlllIIllIIII, lllllllllllllIIlIlIlIlllIIlIllll, 0.125f).endVertex();
                lllllllllllllIIlIlIlIlllIIlllIIl.pos(lllllllllllllIIlIlIlIlllIIIllllI + 0.8, lllllllllllllIIlIlIlIlllIIIlllIl + lllllllllllllIIlIlIlIlllIIllIlll, lllllllllllllIIlIlIlIlllIIlllllI + 0.2).tex(0.0, lllllllllllllIIlIlIlIlllIIlIIlII).color(lllllllllllllIIlIlIlIlllIIllIIIl, lllllllllllllIIlIlIlIlllIIllIIII, lllllllllllllIIlIlIlIlllIIlIllll, 0.125f).endVertex();
                lllllllllllllIIlIlIlIlllIIlllIIl.pos(lllllllllllllIIlIlIlIlllIIIllllI + 0.8, lllllllllllllIIlIlIlIlllIIIlllIl + lllllllllllllIIlIlIlIlllIIllIlII, lllllllllllllIIlIlIlIlllIIlllllI + 0.2).tex(0.0, lllllllllllllIIlIlIlIlllIIlIIIll).color(lllllllllllllIIlIlIlIlllIIllIIIl, lllllllllllllIIlIlIlIlllIIllIIII, lllllllllllllIIlIlIlIlllIIlIllll, 0.125f).endVertex();
                lllllllllllllIIlIlIlIlllIIlllIIl.pos(lllllllllllllIIlIlIlIlllIIIllllI + 0.8, lllllllllllllIIlIlIlIlllIIIlllIl + lllllllllllllIIlIlIlIlllIIllIlII, lllllllllllllIIlIlIlIlllIIlllllI + 0.8).tex(1.0, lllllllllllllIIlIlIlIlllIIlIIIll).color(lllllllllllllIIlIlIlIlllIIllIIIl, lllllllllllllIIlIlIlIlllIIllIIII, lllllllllllllIIlIlIlIlllIIlIllll, 0.125f).endVertex();
                lllllllllllllIIlIlIlIlllIIlllIIl.pos(lllllllllllllIIlIlIlIlllIIIllllI + 0.8, lllllllllllllIIlIlIlIlllIIIlllIl + lllllllllllllIIlIlIlIlllIIllIlll, lllllllllllllIIlIlIlIlllIIlllllI + 0.8).tex(1.0, lllllllllllllIIlIlIlIlllIIlIIlII).color(lllllllllllllIIlIlIlIlllIIllIIIl, lllllllllllllIIlIlIlIlllIIllIIII, lllllllllllllIIlIlIlIlllIIlIllll, 0.125f).endVertex();
                lllllllllllllIIlIlIlIlllIIlllIIl.pos(lllllllllllllIIlIlIlIlllIIIllllI + 0.2, lllllllllllllIIlIlIlIlllIIIlllIl + lllllllllllllIIlIlIlIlllIIllIlll, lllllllllllllIIlIlIlIlllIIlllllI + 0.8).tex(0.0, lllllllllllllIIlIlIlIlllIIlIIlII).color(lllllllllllllIIlIlIlIlllIIllIIIl, lllllllllllllIIlIlIlIlllIIllIIII, lllllllllllllIIlIlIlIlllIIlIllll, 0.125f).endVertex();
                lllllllllllllIIlIlIlIlllIIlllIIl.pos(lllllllllllllIIlIlIlIlllIIIllllI + 0.2, lllllllllllllIIlIlIlIlllIIIlllIl + lllllllllllllIIlIlIlIlllIIllIlII, lllllllllllllIIlIlIlIlllIIlllllI + 0.8).tex(0.0, lllllllllllllIIlIlIlIlllIIlIIIll).color(lllllllllllllIIlIlIlIlllIIllIIIl, lllllllllllllIIlIlIlIlllIIllIIII, lllllllllllllIIlIlIlIlllIIlIllll, 0.125f).endVertex();
                lllllllllllllIIlIlIlIlllIIlllIIl.pos(lllllllllllllIIlIlIlIlllIIIllllI + 0.8, lllllllllllllIIlIlIlIlllIIIlllIl + lllllllllllllIIlIlIlIlllIIllIlII, lllllllllllllIIlIlIlIlllIIlllllI + 0.2).tex(1.0, lllllllllllllIIlIlIlIlllIIlIIIll).color(lllllllllllllIIlIlIlIlllIIllIIIl, lllllllllllllIIlIlIlIlllIIllIIII, lllllllllllllIIlIlIlIlllIIlIllll, 0.125f).endVertex();
                lllllllllllllIIlIlIlIlllIIlllIIl.pos(lllllllllllllIIlIlIlIlllIIIllllI + 0.8, lllllllllllllIIlIlIlIlllIIIlllIl + lllllllllllllIIlIlIlIlllIIllIlll, lllllllllllllIIlIlIlIlllIIlllllI + 0.2).tex(1.0, lllllllllllllIIlIlIlIlllIIlIIlII).color(lllllllllllllIIlIlIlIlllIIllIIIl, lllllllllllllIIlIlIlIlllIIllIIII, lllllllllllllIIlIlIlIlllIIlIllll, 0.125f).endVertex();
                lllllllllllllIIlIlIlIlllIIlllIIl.pos(lllllllllllllIIlIlIlIlllIIIllllI + 0.8, lllllllllllllIIlIlIlIlllIIIlllIl + lllllllllllllIIlIlIlIlllIIllIlll, lllllllllllllIIlIlIlIlllIIlllllI + 0.8).tex(0.0, lllllllllllllIIlIlIlIlllIIlIIlII).color(lllllllllllllIIlIlIlIlllIIllIIIl, lllllllllllllIIlIlIlIlllIIllIIII, lllllllllllllIIlIlIlIlllIIlIllll, 0.125f).endVertex();
                lllllllllllllIIlIlIlIlllIIlllIIl.pos(lllllllllllllIIlIlIlIlllIIIllllI + 0.8, lllllllllllllIIlIlIlIlllIIIlllIl + lllllllllllllIIlIlIlIlllIIllIlII, lllllllllllllIIlIlIlIlllIIlllllI + 0.8).tex(0.0, lllllllllllllIIlIlIlIlllIIlIIIll).color(lllllllllllllIIlIlIlIlllIIllIIIl, lllllllllllllIIlIlIlIlllIIllIIII, lllllllllllllIIlIlIlIlllIIlIllll, 0.125f).endVertex();
                lllllllllllllIIlIlIlIlllIIlllIIl.pos(lllllllllllllIIlIlIlIlllIIIllllI + 0.2, lllllllllllllIIlIlIlIlllIIIlllIl + lllllllllllllIIlIlIlIlllIIllIlII, lllllllllllllIIlIlIlIlllIIlllllI + 0.8).tex(1.0, lllllllllllllIIlIlIlIlllIIlIIIll).color(lllllllllllllIIlIlIlIlllIIllIIIl, lllllllllllllIIlIlIlIlllIIllIIII, lllllllllllllIIlIlIlIlllIIlIllll, 0.125f).endVertex();
                lllllllllllllIIlIlIlIlllIIlllIIl.pos(lllllllllllllIIlIlIlIlllIIIllllI + 0.2, lllllllllllllIIlIlIlIlllIIIlllIl + lllllllllllllIIlIlIlIlllIIllIlll, lllllllllllllIIlIlIlIlllIIlllllI + 0.8).tex(1.0, lllllllllllllIIlIlIlIlllIIlIIlII).color(lllllllllllllIIlIlIlIlllIIllIIIl, lllllllllllllIIlIlIlIlllIIllIIII, lllllllllllllIIlIlIlIlllIIlIllll, 0.125f).endVertex();
                lllllllllllllIIlIlIlIlllIIlllIIl.pos(lllllllllllllIIlIlIlIlllIIIllllI + 0.2, lllllllllllllIIlIlIlIlllIIIlllIl + lllllllllllllIIlIlIlIlllIIllIlll, lllllllllllllIIlIlIlIlllIIlllllI + 0.2).tex(0.0, lllllllllllllIIlIlIlIlllIIlIIlII).color(lllllllllllllIIlIlIlIlllIIllIIIl, lllllllllllllIIlIlIlIlllIIllIIII, lllllllllllllIIlIlIlIlllIIlIllll, 0.125f).endVertex();
                lllllllllllllIIlIlIlIlllIIlllIIl.pos(lllllllllllllIIlIlIlIlllIIIllllI + 0.2, lllllllllllllIIlIlIlIlllIIIlllIl + lllllllllllllIIlIlIlIlllIIllIlII, lllllllllllllIIlIlIlIlllIIlllllI + 0.2).tex(0.0, lllllllllllllIIlIlIlIlllIIlIIIll).color(lllllllllllllIIlIlIlIlllIIllIIIl, lllllllllllllIIlIlIlIlllIIllIIII, lllllllllllllIIlIlIlIlllIIlIllll, 0.125f).endVertex();
                lllllllllllllIIlIlIlIlllIIlllIlI.draw();
                GlStateManager.enableLighting();
                GlStateManager.enableTexture2D();
                GlStateManager.depthMask((boolean)(TileEntityBeaconRenderer.lIIllIlIIllIlI[5] != 0));
                lllllllllllllIIlIlIlIlllIIllIlll = lllllllllllllIIlIlIlIlllIIllIlII;
                ++lllllllllllllIIlIlIlIlllIIllIllI;
            }
            GlStateManager.enableFog();
        }
    }
    
    private static boolean llIllIIIlIlIlII(final int lllllllllllllIIlIlIlIllIllIlIllI, final int lllllllllllllIIlIlIlIllIllIlIlIl) {
        return lllllllllllllIIlIlIlIllIllIlIllI >= lllllllllllllIIlIlIlIllIllIlIlIl;
    }
    
    private static boolean llIllIIIlIlIIll(final int lllllllllllllIIlIlIlIllIllIIllll) {
        return lllllllllllllIIlIlIlIllIllIIllll > 0;
    }
    
    private static int llIllIIIlIlIIlI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static void llIllIIIlIlIIII() {
        (lIIllIlIIllIIl = new String[TileEntityBeaconRenderer.lIIllIlIIllIlI[5]])[TileEntityBeaconRenderer.lIIllIlIIllIlI[0]] = llIllIIIlIIllll("HBApLjIaECJ1IgYBOC4+Rxc0OyQHGw44IgkYfyopDw==", "huQZG");
    }
    
    private static void llIllIIIlIlIIIl() {
        (lIIllIlIIllIlI = new int[10])[0] = ((118 + 72 + 49 + 5 ^ 26 + 80 + 57 + 3) & (0x5D ^ 0x65 ^ (0x2 ^ 0x68) ^ -" ".length()));
        TileEntityBeaconRenderer.lIIllIlIIllIlI[1] = (0xFFFF938E & 0x6E75);
        TileEntityBeaconRenderer.lIIllIlIIllIlI[2] = (0xFFFFBFFD & 0x4DE3);
        TileEntityBeaconRenderer.lIIllIlIIllIlI[3] = (0xFFFFA8CE & 0x7F33);
        TileEntityBeaconRenderer.lIIllIlIIllIlI[4] = (0xFFFFBFB7 & 0x684B);
        TileEntityBeaconRenderer.lIIllIlIIllIlI[5] = " ".length();
        TileEntityBeaconRenderer.lIIllIlIIllIlI[6] = (-(0xFFFFFBA7 & 0x14DE) & (0xFFFFF3C7 & 0x1FBF));
        TileEntityBeaconRenderer.lIIllIlIIllIlI[7] = "  ".length();
        TileEntityBeaconRenderer.lIIllIlIIllIlI[8] = (0x8F ^ 0x9A ^ (0xA3 ^ 0xB1));
        TileEntityBeaconRenderer.lIIllIlIIllIlI[9] = (0xFFFF8B37 & 0x77CB);
    }
    
    static {
        llIllIIIlIlIIIl();
        llIllIIIlIlIIII();
        beaconBeam = new ResourceLocation(TileEntityBeaconRenderer.lIIllIlIIllIIl[TileEntityBeaconRenderer.lIIllIlIIllIlI[0]]);
    }
    
    private static boolean llIllIIIlIlIlIl(final int lllllllllllllIIlIlIlIllIllIlIIlI, final int lllllllllllllIIlIlIlIllIllIlIIIl) {
        return lllllllllllllIIlIlIlIllIllIlIIlI < lllllllllllllIIlIlIlIllIllIlIIIl;
    }
    
    @Override
    public boolean func_181055_a() {
        return TileEntityBeaconRenderer.lIIllIlIIllIlI[5] != 0;
    }
}
