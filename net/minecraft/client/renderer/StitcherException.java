// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer;

import net.minecraft.client.renderer.texture.Stitcher;

public class StitcherException extends RuntimeException
{
    private final /* synthetic */ Stitcher.Holder holder;
    
    public StitcherException(final Stitcher.Holder llllllllllllIllllIIllIlIIllIIllI, final String llllllllllllIllllIIllIlIIllIIlIl) {
        super(llllllllllllIllllIIllIlIIllIIlIl);
        this.holder = llllllllllllIllllIIllIlIIllIIllI;
    }
}
