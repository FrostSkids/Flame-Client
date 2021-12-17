// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer;

import net.minecraft.client.renderer.vertex.VertexBuffer;

public class VertexBufferUploader extends WorldVertexBufferUploader
{
    private /* synthetic */ VertexBuffer vertexBuffer;
    
    @Override
    public void func_181679_a(final WorldRenderer llllllllllllIlllIIIlIllIIlIllIIl) {
        llllllllllllIlllIIIlIllIIlIllIIl.reset();
        this.vertexBuffer.func_181722_a(llllllllllllIlllIIIlIllIIlIllIIl.getByteBuffer());
    }
    
    public void setVertexBuffer(final VertexBuffer llllllllllllIlllIIIlIllIIlIlIlIl) {
        this.vertexBuffer = llllllllllllIlllIIIlIllIIlIlIlIl;
    }
    
    public VertexBufferUploader() {
        this.vertexBuffer = null;
    }
}
