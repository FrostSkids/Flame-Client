// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.chunk;

import net.minecraft.client.renderer.GLAllocation;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.util.BlockPos;
import net.minecraft.client.renderer.RenderGlobal;
import net.minecraft.world.World;

public class ListedRenderChunk extends RenderChunk
{
    private final /* synthetic */ int baseDisplayList;
    private static final /* synthetic */ int[] lIIIIIIIlIIllI;
    
    public ListedRenderChunk(final World lllllllllllllIlIlIIlIIIIlllllIlI, final RenderGlobal lllllllllllllIlIlIIlIIIIlllllllI, final BlockPos lllllllllllllIlIlIIlIIIIllllllIl, final int lllllllllllllIlIlIIlIIIIllllIlll) {
        super(lllllllllllllIlIlIIlIIIIlllllIlI, lllllllllllllIlIlIIlIIIIlllllllI, lllllllllllllIlIlIIlIIIIllllllIl, lllllllllllllIlIlIIlIIIIllllIlll);
        this.baseDisplayList = GLAllocation.generateDisplayLists(EnumWorldBlockLayer.values().length);
    }
    
    private static void lIllIIllIIIIlIl() {
        (lIIIIIIIlIIllI = new int[1])[0] = -" ".length();
    }
    
    static {
        lIllIIllIIIIlIl();
    }
    
    private static boolean lIllIIllIIIIllI(final int lllllllllllllIlIlIIlIIIIlllIlIIl) {
        return lllllllllllllIlIlIIlIIIIlllIlIIl == 0;
    }
    
    public int getDisplayList(final EnumWorldBlockLayer lllllllllllllIlIlIIlIIIIllllIIlI, final CompiledChunk lllllllllllllIlIlIIlIIIIllllIIIl) {
        int n;
        if (lIllIIllIIIIllI(lllllllllllllIlIlIIlIIIIllllIIIl.isLayerEmpty(lllllllllllllIlIlIIlIIIIllllIIlI) ? 1 : 0)) {
            n = this.baseDisplayList + lllllllllllllIlIlIIlIIIIllllIIlI.ordinal();
            "".length();
            if (-" ".length() >= "  ".length()) {
                return (0x10 ^ 0xD ^ (0x3B ^ 0x7E)) & (0x0 ^ 0x61 ^ (0x35 ^ 0xC) ^ -" ".length());
            }
        }
        else {
            n = ListedRenderChunk.lIIIIIIIlIIllI[0];
        }
        return n;
    }
    
    @Override
    public void deleteGlResources() {
        super.deleteGlResources();
        GLAllocation.deleteDisplayLists(this.baseDisplayList, EnumWorldBlockLayer.values().length);
    }
}
