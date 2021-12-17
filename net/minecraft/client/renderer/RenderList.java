// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer;

import java.util.Iterator;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.renderer.chunk.ListedRenderChunk;
import net.minecraft.client.renderer.chunk.RenderChunk;
import net.minecraft.util.EnumWorldBlockLayer;

public class RenderList extends ChunkRenderContainer
{
    private static boolean lIIIlIIllIlIllll(final int llllllllllllIlllIlIlIlIIllllIIII) {
        return llllllllllllIlllIlIlIlIIllllIIII != 0;
    }
    
    private static boolean lIIIlIIllIllIIII(final int llllllllllllIlllIlIlIlIIlllIlllI) {
        return llllllllllllIlllIlIlIlIIlllIlllI == 0;
    }
    
    @Override
    public void renderChunkLayer(final EnumWorldBlockLayer llllllllllllIlllIlIlIlIIllllIlIl) {
        if (lIIIlIIllIlIllll(this.initialized ? 1 : 0)) {
            final short llllllllllllIlllIlIlIlIIllllIIll = (short)this.renderChunks.iterator();
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
            while (!lIIIlIIllIllIIII(((Iterator)llllllllllllIlllIlIlIlIIllllIIll).hasNext() ? 1 : 0)) {
                final RenderChunk llllllllllllIlllIlIlIlIIlllllIII = ((Iterator<RenderChunk>)llllllllllllIlllIlIlIlIIllllIIll).next();
                final ListedRenderChunk llllllllllllIlllIlIlIlIIllllIlll = (ListedRenderChunk)llllllllllllIlllIlIlIlIIlllllIII;
                GlStateManager.pushMatrix();
                this.preRenderChunk(llllllllllllIlllIlIlIlIIlllllIII);
                GL11.glCallList(llllllllllllIlllIlIlIlIIllllIlll.getDisplayList(llllllllllllIlllIlIlIlIIllllIlIl, llllllllllllIlllIlIlIlIIllllIlll.getCompiledChunk()));
                GlStateManager.popMatrix();
            }
            GlStateManager.resetColor();
            this.renderChunks.clear();
        }
    }
}
