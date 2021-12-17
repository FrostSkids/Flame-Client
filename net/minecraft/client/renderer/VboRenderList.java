// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer;

import java.util.Iterator;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.renderer.vertex.VertexBuffer;
import net.minecraft.client.renderer.chunk.RenderChunk;
import net.minecraft.util.EnumWorldBlockLayer;

public class VboRenderList extends ChunkRenderContainer
{
    private static final /* synthetic */ int[] llllIllllIllI;
    
    private static void lIlIllIIIllllll() {
        (llllIllllIllI = new int[9])[0] = (155 + 72 - 199 + 132 ^ 70 + 146 - 185 + 136);
        VboRenderList.llllIllllIllI[1] = ((0x57 ^ 0x5A ^ (0xDA ^ 0xB7)) & (0x6F ^ 0x51 ^ (0xCA ^ 0x94) ^ -" ".length()));
        VboRenderList.llllIllllIllI[2] = "   ".length();
        VboRenderList.llllIllllIllI[3] = (-(0xFFFFFCFB & 0x2BE6) & (0xFFFFBCFF & 0x7FE7));
        VboRenderList.llllIllllIllI[4] = (0x4A ^ 0x56);
        VboRenderList.llllIllllIllI[5] = (0x19 ^ 0x1D);
        VboRenderList.llllIllllIllI[6] = (-(0xFFFFEFBD & 0x73FB) & (0xFFFFF7BB & 0x7FFD));
        VboRenderList.llllIllllIllI[7] = "  ".length();
        VboRenderList.llllIllllIllI[8] = (-(0xFFFFF3FB & 0x4DCD) & (0xFFFFD5CB & 0x7FFE));
    }
    
    static {
        lIlIllIIIllllll();
    }
    
    @Override
    public void renderChunkLayer(final EnumWorldBlockLayer lllllllllllllIlIllIIIllIIllIlIlI) {
        if (lIlIllIIlIIIIII(this.initialized ? 1 : 0)) {
            final double lllllllllllllIlIllIIIllIIllIIlII = (double)this.renderChunks.iterator();
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
            while (!lIlIllIIlIIIIIl(((Iterator)lllllllllllllIlIllIIIllIIllIIlII).hasNext() ? 1 : 0)) {
                final RenderChunk lllllllllllllIlIllIIIllIIllIlIIl = ((Iterator<RenderChunk>)lllllllllllllIlIllIIIllIIllIIlII).next();
                final VertexBuffer lllllllllllllIlIllIIIllIIllIlIII = lllllllllllllIlIllIIIllIIllIlIIl.getVertexBufferByLayer(lllllllllllllIlIllIIIllIIllIlIlI.ordinal());
                GlStateManager.pushMatrix();
                this.preRenderChunk(lllllllllllllIlIllIIIllIIllIlIIl);
                lllllllllllllIlIllIIIllIIllIlIIl.multModelviewMatrix();
                lllllllllllllIlIllIIIllIIllIlIII.bindBuffer();
                this.setupArrayPointers();
                lllllllllllllIlIllIIIllIIllIlIII.drawArrays(VboRenderList.llllIllllIllI[0]);
                GlStateManager.popMatrix();
            }
            OpenGlHelper.glBindBuffer(OpenGlHelper.GL_ARRAY_BUFFER, VboRenderList.llllIllllIllI[1]);
            GlStateManager.resetColor();
            this.renderChunks.clear();
        }
    }
    
    private static boolean lIlIllIIlIIIIII(final int lllllllllllllIlIllIIIllIIllIIIII) {
        return lllllllllllllIlIllIIIllIIllIIIII != 0;
    }
    
    private void setupArrayPointers() {
        GL11.glVertexPointer(VboRenderList.llllIllllIllI[2], VboRenderList.llllIllllIllI[3], VboRenderList.llllIllllIllI[4], 0L);
        GL11.glColorPointer(VboRenderList.llllIllllIllI[5], VboRenderList.llllIllllIllI[6], VboRenderList.llllIllllIllI[4], 12L);
        GL11.glTexCoordPointer(VboRenderList.llllIllllIllI[7], VboRenderList.llllIllllIllI[3], VboRenderList.llllIllllIllI[4], 16L);
        OpenGlHelper.setClientActiveTexture(OpenGlHelper.lightmapTexUnit);
        GL11.glTexCoordPointer(VboRenderList.llllIllllIllI[7], VboRenderList.llllIllllIllI[8], VboRenderList.llllIllllIllI[4], 24L);
        OpenGlHelper.setClientActiveTexture(OpenGlHelper.defaultTexUnit);
    }
    
    private static boolean lIlIllIIlIIIIIl(final int lllllllllllllIlIllIIIllIIlIllllI) {
        return lllllllllllllIlIllIIIllIIlIllllI == 0;
    }
}
