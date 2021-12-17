// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.model;

import net.minecraft.util.Vec3;

public class PositionTextureVertex
{
    public /* synthetic */ float texturePositionX;
    public /* synthetic */ float texturePositionY;
    public /* synthetic */ Vec3 vector3D;
    
    public PositionTextureVertex setTexturePosition(final float llllllllllllIllllIllIIllllIIIIII, final float llllllllllllIllllIllIIlllIllllII) {
        return new PositionTextureVertex(this, llllllllllllIllllIllIIllllIIIIII, llllllllllllIllllIllIIlllIllllII);
    }
    
    public PositionTextureVertex(final Vec3 llllllllllllIllllIllIIlllIlIlIlI, final float llllllllllllIllllIllIIlllIlIIlIl, final float llllllllllllIllllIllIIlllIlIlIII) {
        this.vector3D = llllllllllllIllllIllIIlllIlIlIlI;
        this.texturePositionX = llllllllllllIllllIllIIlllIlIIlIl;
        this.texturePositionY = llllllllllllIllllIllIIlllIlIlIII;
    }
    
    public PositionTextureVertex(final PositionTextureVertex llllllllllllIllllIllIIlllIllIllI, final float llllllllllllIllllIllIIlllIllIlIl, final float llllllllllllIllllIllIIlllIllIIII) {
        this.vector3D = llllllllllllIllllIllIIlllIllIllI.vector3D;
        this.texturePositionX = llllllllllllIllllIllIIlllIllIlIl;
        this.texturePositionY = llllllllllllIllllIllIIlllIllIIII;
    }
    
    public PositionTextureVertex(final float llllllllllllIllllIllIIllllIIllll, final float llllllllllllIllllIllIIllllIIlllI, final float llllllllllllIllllIllIIllllIIllIl, final float llllllllllllIllllIllIIllllIIllII, final float llllllllllllIllllIllIIllllIIIlIl) {
        this(new Vec3(llllllllllllIllllIllIIllllIIllll, llllllllllllIllllIllIIllllIIlllI, llllllllllllIllllIllIIllllIIllIl), llllllllllllIllllIllIIllllIIllII, llllllllllllIllllIllIIllllIIIlIl);
    }
}
