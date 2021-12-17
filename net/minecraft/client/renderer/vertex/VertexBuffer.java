// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.vertex;

import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL11;
import net.minecraft.client.renderer.OpenGlHelper;

public class VertexBuffer
{
    private /* synthetic */ int count;
    private final /* synthetic */ VertexFormat vertexFormat;
    private /* synthetic */ int glBufferId;
    private static final /* synthetic */ int[] llIIlIIlIIlIll;
    
    public void bindBuffer() {
        OpenGlHelper.glBindBuffer(OpenGlHelper.GL_ARRAY_BUFFER, this.glBufferId);
    }
    
    public void drawArrays(final int llllllllllllIlllIIlIlIllIlIIlIII) {
        GL11.glDrawArrays(llllllllllllIlllIIlIlIllIlIIlIII, VertexBuffer.llIIlIIlIIlIll[1], this.count);
    }
    
    public void deleteGlBuffers() {
        if (lIIIllIIIlIIlllI(this.glBufferId)) {
            OpenGlHelper.glDeleteBuffers(this.glBufferId);
            this.glBufferId = VertexBuffer.llIIlIIlIIlIll[2];
        }
    }
    
    private static boolean lIIIllIIIlIIlllI(final int llllllllllllIlllIIlIlIllIlIIIIII) {
        return llllllllllllIlllIIlIlIllIlIIIIII >= 0;
    }
    
    public void unbindBuffer() {
        OpenGlHelper.glBindBuffer(OpenGlHelper.GL_ARRAY_BUFFER, VertexBuffer.llIIlIIlIIlIll[1]);
    }
    
    static {
        lIIIllIIIlIIllIl();
    }
    
    public void func_181722_a(final ByteBuffer llllllllllllIlllIIlIlIllIlIIllII) {
        this.bindBuffer();
        OpenGlHelper.glBufferData(OpenGlHelper.GL_ARRAY_BUFFER, llllllllllllIlllIIlIlIllIlIIllII, VertexBuffer.llIIlIIlIIlIll[0]);
        this.unbindBuffer();
        this.count = llllllllllllIlllIIlIlIllIlIIllII.limit() / this.vertexFormat.getNextOffset();
    }
    
    private static void lIIIllIIIlIIllIl() {
        (llIIlIIlIIlIll = new int[3])[0] = (-(0xFFFFF70D & 0x2AF3) & (0xFFFFBBFC & 0xEEE7));
        VertexBuffer.llIIlIIlIIlIll[1] = ((0xFC ^ 0xC6) & ~(0x16 ^ 0x2C));
        VertexBuffer.llIIlIIlIIlIll[2] = -" ".length();
    }
    
    public VertexBuffer(final VertexFormat llllllllllllIlllIIlIlIllIlIlIlIl) {
        this.vertexFormat = llllllllllllIlllIIlIlIllIlIlIlIl;
        this.glBufferId = OpenGlHelper.glGenBuffers();
    }
}
