// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer;

public class Tessellator
{
    private static final /* synthetic */ int[] lIIIIlIlllllII;
    private /* synthetic */ WorldRenderer worldRenderer;
    private /* synthetic */ WorldVertexBufferUploader vboUploader;
    private static final /* synthetic */ Tessellator instance;
    
    public void draw() {
        this.worldRenderer.finishDrawing();
        this.vboUploader.func_181679_a(this.worldRenderer);
    }
    
    static {
        lIlllIlIllIlIlI();
        instance = new Tessellator(Tessellator.lIIIIlIlllllII[0]);
    }
    
    private static void lIlllIlIllIlIlI() {
        (lIIIIlIlllllII = new int[1])[0] = (-(0xFFFFA4E6 & 0x7BDB) & (0xFFFFEEE1 & 0x2031DF));
    }
    
    public static Tessellator getInstance() {
        return Tessellator.instance;
    }
    
    public WorldRenderer getWorldRenderer() {
        return this.worldRenderer;
    }
    
    public Tessellator(final int lllllllllllllIlIIlIlIIIIlIlllIlI) {
        this.vboUploader = new WorldVertexBufferUploader();
        this.worldRenderer = new WorldRenderer(lllllllllllllIlIIlIlIIIIlIlllIlI);
    }
}
