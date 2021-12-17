// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.culling;

import net.minecraft.util.AxisAlignedBB;

public class Frustum implements ICamera
{
    private /* synthetic */ double yPosition;
    private /* synthetic */ double xPosition;
    private /* synthetic */ double zPosition;
    private /* synthetic */ ClippingHelper clippingHelper;
    
    public boolean isBoxInFrustum(final double llllllllllllIlIllIIlIIIIIIIlIlIl, final double llllllllllllIlIllIIlIIIIIIIlIlII, final double llllllllllllIlIllIIlIIIIIIIllIlI, final double llllllllllllIlIllIIlIIIIIIIllIIl, final double llllllllllllIlIllIIlIIIIIIIlIIIl, final double llllllllllllIlIllIIlIIIIIIIlIlll) {
        return this.clippingHelper.isBoxInFrustum(llllllllllllIlIllIIlIIIIIIIlIlIl - this.xPosition, llllllllllllIlIllIIlIIIIIIIlIlII - this.yPosition, llllllllllllIlIllIIlIIIIIIIllIlI - this.zPosition, llllllllllllIlIllIIlIIIIIIIllIIl - this.xPosition, llllllllllllIlIllIIlIIIIIIIlIIIl - this.yPosition, llllllllllllIlIllIIlIIIIIIIlIlll - this.zPosition);
    }
    
    @Override
    public void setPosition(final double llllllllllllIlIllIIlIIIIIIlIIlll, final double llllllllllllIlIllIIlIIIIIIlIlIlI, final double llllllllllllIlIllIIlIIIIIIlIIlIl) {
        this.xPosition = llllllllllllIlIllIIlIIIIIIlIIlll;
        this.yPosition = llllllllllllIlIllIIlIIIIIIlIlIlI;
        this.zPosition = llllllllllllIlIllIIlIIIIIIlIIlIl;
    }
    
    @Override
    public boolean isBoundingBoxInFrustum(final AxisAlignedBB llllllllllllIlIllIIlIIIIIIIIllII) {
        return this.isBoxInFrustum(llllllllllllIlIllIIlIIIIIIIIllII.minX, llllllllllllIlIllIIlIIIIIIIIllII.minY, llllllllllllIlIllIIlIIIIIIIIllII.minZ, llllllllllllIlIllIIlIIIIIIIIllII.maxX, llllllllllllIlIllIIlIIIIIIIIllII.maxY, llllllllllllIlIllIIlIIIIIIIIllII.maxZ);
    }
    
    public Frustum(final ClippingHelper llllllllllllIlIllIIlIIIIIIllIIll) {
        this.clippingHelper = llllllllllllIlIllIIlIIIIIIllIIll;
    }
    
    public Frustum() {
        this(ClippingHelperImpl.getInstance());
    }
}
