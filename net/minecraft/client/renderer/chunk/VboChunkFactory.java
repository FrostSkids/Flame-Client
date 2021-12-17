// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.chunk;

import net.minecraft.util.BlockPos;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.world.World;

public class VboChunkFactory implements IRenderChunkFactory
{
    @Override
    public RenderChunk makeRenderChunk(final World lllllllllllllIlIllIIlIIllIlIllll, final RenderGlobal lllllllllllllIlIllIIlIIllIlIllIl, final BlockPos lllllllllllllIlIllIIlIIllIlIlIlI, final int lllllllllllllIlIllIIlIIllIlIIlII) {
        return new RenderChunk(lllllllllllllIlIllIIlIIllIlIllll, lllllllllllllIlIllIIlIIllIlIllIl, lllllllllllllIlIllIIlIIllIlIlIlI, lllllllllllllIlIllIIlIIllIlIIlII);
    }
}
