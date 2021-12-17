// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer;

import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumWorldBlockLayer;
import com.google.common.collect.Lists;
import net.minecraft.client.renderer.chunk.RenderChunk;
import java.util.List;

public abstract class ChunkRenderContainer
{
    protected /* synthetic */ boolean initialized;
    private /* synthetic */ double viewEntityX;
    private static final /* synthetic */ int[] lllllIIIIIlll;
    protected /* synthetic */ List<RenderChunk> renderChunks;
    private /* synthetic */ double viewEntityY;
    private /* synthetic */ double viewEntityZ;
    
    public ChunkRenderContainer() {
        this.renderChunks = (List<RenderChunk>)Lists.newArrayListWithCapacity(ChunkRenderContainer.lllllIIIIIlll[0]);
    }
    
    static {
        lIlIllIIlIllIIl();
    }
    
    public abstract void renderChunkLayer(final EnumWorldBlockLayer p0);
    
    private static void lIlIllIIlIllIIl() {
        (lllllIIIIIlll = new int[2])[0] = (0xFFFFEEFD & 0x5512);
        ChunkRenderContainer.lllllIIIIIlll[1] = " ".length();
    }
    
    public void initialize(final double lllllllllllllIlIllIIIlIlIlIlIIIl, final double lllllllllllllIlIllIIIlIlIlIlIIII, final double lllllllllllllIlIllIIIlIlIlIlIIll) {
        this.initialized = (ChunkRenderContainer.lllllIIIIIlll[1] != 0);
        this.renderChunks.clear();
        this.viewEntityX = lllllllllllllIlIllIIIlIlIlIlIIIl;
        this.viewEntityY = lllllllllllllIlIllIIIlIlIlIlIIII;
        this.viewEntityZ = lllllllllllllIlIllIIIlIlIlIlIIll;
    }
    
    public void preRenderChunk(final RenderChunk lllllllllllllIlIllIIIlIlIlIIlIlI) {
        final BlockPos lllllllllllllIlIllIIIlIlIlIIlIIl = lllllllllllllIlIllIIIlIlIlIIlIlI.getPosition();
        GlStateManager.translate((float)(lllllllllllllIlIllIIIlIlIlIIlIIl.getX() - this.viewEntityX), (float)(lllllllllllllIlIllIIIlIlIlIIlIIl.getY() - this.viewEntityY), (float)(lllllllllllllIlIllIIIlIlIlIIlIIl.getZ() - this.viewEntityZ));
    }
    
    public void addRenderChunk(final RenderChunk lllllllllllllIlIllIIIlIlIIllllll, final EnumWorldBlockLayer lllllllllllllIlIllIIIlIlIlIIIIIl) {
        this.renderChunks.add(lllllllllllllIlIllIIIlIlIIllllll);
        "".length();
    }
}
