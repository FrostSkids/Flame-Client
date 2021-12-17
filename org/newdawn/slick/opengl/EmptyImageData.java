// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.opengl;

import org.lwjgl.BufferUtils;
import java.nio.ByteBuffer;

public class EmptyImageData implements ImageData
{
    private static final /* synthetic */ int[] llIIlIIlIlllIl;
    private /* synthetic */ int height;
    private /* synthetic */ int width;
    
    private static void lIIIllIIlIIIllII() {
        (llIIlIIlIlllIl = new int[2])[0] = (0x1A ^ 0x3A);
        EmptyImageData.llIIlIIlIlllIl[1] = (0x11 ^ 0x73 ^ (0x63 ^ 0x5));
    }
    
    public int getTexHeight() {
        return InternalTextureLoader.get2Fold(this.height);
    }
    
    static {
        lIIIllIIlIIIllII();
    }
    
    public int getWidth() {
        return this.width;
    }
    
    public int getTexWidth() {
        return InternalTextureLoader.get2Fold(this.width);
    }
    
    public EmptyImageData(final int llllllllllllIlllIIlIIlllIlIllIlI, final int llllllllllllIlllIIlIIlllIlIllIIl) {
        this.width = llllllllllllIlllIIlIIlllIlIllIlI;
        this.height = llllllllllllIlllIIlIIlllIlIllIIl;
    }
    
    public ByteBuffer getImageBufferData() {
        return BufferUtils.createByteBuffer(this.getTexWidth() * this.getTexHeight() * EmptyImageData.llIIlIIlIlllIl[1]);
    }
    
    public int getDepth() {
        return EmptyImageData.llIIlIIlIlllIl[0];
    }
    
    public int getHeight() {
        return this.height;
    }
}
