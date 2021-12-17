// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer;

import net.minecraft.util.EnumWorldBlockLayer;

public class RegionRenderCacheBuilder
{
    private final /* synthetic */ WorldRenderer[] worldRenderers;
    private static final /* synthetic */ int[] llllllIIIlIll;
    
    public WorldRenderer getWorldRendererByLayerId(final int lllllllllllllIlIlIlIllIIIlIllllI) {
        return this.worldRenderers[lllllllllllllIlIlIlIllIIIlIllllI];
    }
    
    public WorldRenderer getWorldRendererByLayer(final EnumWorldBlockLayer lllllllllllllIlIlIlIllIIIllIIlII) {
        return this.worldRenderers[lllllllllllllIlIlIlIllIIIllIIlII.ordinal()];
    }
    
    private static void lIlIllllllIIIII() {
        (llllllIIIlIll = new int[3])[0] = (0xFFFFFC13 & 0x2003EC);
        RegionRenderCacheBuilder.llllllIIIlIll[1] = (0xFFFFBD76 & 0x24289);
        RegionRenderCacheBuilder.llllllIIIlIll[2] = (-(0xFFFFBB5E & 0x7EFF) & (0xFFFFBB5F & 0x47EFD));
    }
    
    public RegionRenderCacheBuilder() {
        this.worldRenderers = new WorldRenderer[EnumWorldBlockLayer.values().length];
        this.worldRenderers[EnumWorldBlockLayer.SOLID.ordinal()] = new WorldRenderer(RegionRenderCacheBuilder.llllllIIIlIll[0]);
        this.worldRenderers[EnumWorldBlockLayer.CUTOUT.ordinal()] = new WorldRenderer(RegionRenderCacheBuilder.llllllIIIlIll[1]);
        this.worldRenderers[EnumWorldBlockLayer.CUTOUT_MIPPED.ordinal()] = new WorldRenderer(RegionRenderCacheBuilder.llllllIIIlIll[1]);
        this.worldRenderers[EnumWorldBlockLayer.TRANSLUCENT.ordinal()] = new WorldRenderer(RegionRenderCacheBuilder.llllllIIIlIll[2]);
    }
    
    static {
        lIlIllllllIIIII();
    }
}
