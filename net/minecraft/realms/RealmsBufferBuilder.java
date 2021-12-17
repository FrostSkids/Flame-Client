// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.realms;

import net.minecraft.client.renderer.vertex.VertexFormat;
import java.nio.ByteBuffer;
import net.minecraft.client.renderer.WorldRenderer;

public class RealmsBufferBuilder
{
    private /* synthetic */ WorldRenderer b;
    
    public RealmsBufferBuilder tex(final double llllllllllllIlIllIIIIlllIlIlllIl, final double llllllllllllIlIllIIIIlllIlIlllII) {
        return this.from(this.b.tex(llllllllllllIlIllIIIIlllIlIlllIl, llllllllllllIlIllIIIIlllIlIlllII));
    }
    
    public int getVertexCount() {
        return this.b.getVertexCount();
    }
    
    public void fixupVertexColor(final float llllllllllllIlIllIIIIllllIIllIII, final float llllllllllllIlIllIIIIllllIIlIlll, final float llllllllllllIlIllIIIIllllIIlIllI, final int llllllllllllIlIllIIIIllllIIllIlI) {
        this.b.putColorRGB_F(llllllllllllIlIllIIIIllllIIllIII, llllllllllllIlIllIIIIllllIIlIlll, llllllllllllIlIllIIIIllllIIlIllI, llllllllllllIlIllIIIIllllIIllIlI);
    }
    
    public void fixupQuadColor(final int llllllllllllIlIllIIIlIIIIIIIllll) {
        this.b.putColor4(llllllllllllIlIllIIIlIIIIIIIllll);
    }
    
    public RealmsVertexFormat getVertexFormat() {
        return new RealmsVertexFormat(this.b.getVertexFormat());
    }
    
    public void end() {
        this.b.finishDrawing();
    }
    
    public void putBulkData(final int[] llllllllllllIlIllIIIIlllIllIIlIl) {
        this.b.addVertexData(llllllllllllIlIllIIIIlllIllIIlIl);
    }
    
    public ByteBuffer getBuffer() {
        return this.b.getByteBuffer();
    }
    
    public void sortQuads(final float llllllllllllIlIllIIIlIIIIIIlIlIl, final float llllllllllllIlIllIIIlIIIIIIllIII, final float llllllllllllIlIllIIIlIIIIIIlIIll) {
        this.b.func_181674_a(llllllllllllIlIllIIIlIIIIIIlIlIl, llllllllllllIlIllIIIlIIIIIIllIII, llllllllllllIlIllIIIlIIIIIIlIIll);
    }
    
    public void begin(final int llllllllllllIlIllIIIIlllllIlIIlI, final VertexFormat llllllllllllIlIllIIIIlllllIIlllI) {
        this.b.begin(llllllllllllIlIllIIIIlllllIlIIlI, llllllllllllIlIllIIIIlllllIIlllI);
    }
    
    public RealmsBufferBuilder color(final float llllllllllllIlIllIIIIllllIIIlIIl, final float llllllllllllIlIllIIIIllllIIIlIII, final float llllllllllllIlIllIIIIllllIIIllII, final float llllllllllllIlIllIIIIllllIIIlIll) {
        return this.from(this.b.color(llllllllllllIlIllIIIIllllIIIlIIl, llllllllllllIlIllIIIIllllIIIlIII, llllllllllllIlIllIIIIllllIIIllII, llllllllllllIlIllIIIIllllIIIlIll));
    }
    
    public int getDrawMode() {
        return this.b.getDrawMode();
    }
    
    public void offset(final double llllllllllllIlIllIIIIlllllllIIIl, final double llllllllllllIlIllIIIIlllllllIlII, final double llllllllllllIlIllIIIIllllllIllll) {
        this.b.setTranslation(llllllllllllIlIllIIIIlllllllIIIl, llllllllllllIlIllIIIIlllllllIlII, llllllllllllIlIllIIIIllllllIllll);
    }
    
    public void endVertex() {
        this.b.endVertex();
    }
    
    public RealmsBufferBuilder tex2(final int llllllllllllIlIllIIIIlllIllIllII, final int llllllllllllIlIllIIIIlllIllIlllI) {
        return this.from(this.b.lightmap(llllllllllllIlIllIIIIlllIllIllII, llllllllllllIlIllIIIIlllIllIlllI));
    }
    
    public void fixupQuadColor(final float llllllllllllIlIllIIIIlllIlIIIlII, final float llllllllllllIlIllIIIIlllIIllllll, final float llllllllllllIlIllIIIIlllIlIIIIlI) {
        this.b.putColorRGB_F4(llllllllllllIlIllIIIIlllIlIIIlII, llllllllllllIlIllIIIIlllIIllllll, llllllllllllIlIllIIIIlllIlIIIIlI);
    }
    
    public RealmsBufferBuilder color(final int llllllllllllIlIllIIIIlllllIIIIlI, final int llllllllllllIlIllIIIIlllllIIIIIl, final int llllllllllllIlIllIIIIlllllIIIlIl, final int llllllllllllIlIllIIIIllllIllllll) {
        return this.from(this.b.color(llllllllllllIlIllIIIIlllllIIIIlI, llllllllllllIlIllIIIIlllllIIIIIl, llllllllllllIlIllIIIIlllllIIIlIl, llllllllllllIlIllIIIIllllIllllll));
    }
    
    public void restoreState(final WorldRenderer.State llllllllllllIlIllIIIIllllllIlIll) {
        this.b.setVertexState(llllllllllllIlIllIIIIllllllIlIll);
    }
    
    public void postProcessFacePosition(final double llllllllllllIlIllIIIIllllIlIlIlI, final double llllllllllllIlIllIIIIllllIlIlIIl, final double llllllllllllIlIllIIIIllllIlIIlII) {
        this.b.putPosition(llllllllllllIlIllIIIIllllIlIlIlI, llllllllllllIlIllIIIIllllIlIlIIl, llllllllllllIlIllIIIIllllIlIIlII);
    }
    
    public RealmsBufferBuilder vertex(final double llllllllllllIlIllIIIIlllIlIIllII, final double llllllllllllIlIllIIIIlllIlIIlIll, final double llllllllllllIlIllIIIIlllIlIIlIlI) {
        return this.from(this.b.pos(llllllllllllIlIllIIIIlllIlIIllII, llllllllllllIlIllIIIIlllIlIIlIll, llllllllllllIlIllIIIIlllIlIIlIlI));
    }
    
    public RealmsBufferBuilder normal(final float llllllllllllIlIllIIIIllllllIIIII, final float llllllllllllIlIllIIIIlllllIllIll, final float llllllllllllIlIllIIIIlllllIllllI) {
        return this.from(this.b.normal(llllllllllllIlIllIIIIllllllIIIII, llllllllllllIlIllIIIIlllllIllIll, llllllllllllIlIllIIIIlllllIllllI));
    }
    
    public void clear() {
        this.b.reset();
    }
    
    public RealmsBufferBuilder(final WorldRenderer llllllllllllIlIllIIIlIIIIIlIIlIl) {
        this.b = llllllllllllIlIllIIIlIIIIIlIIlIl;
    }
    
    public void faceTint(final float llllllllllllIlIllIIIIlllIlllIlll, final float llllllllllllIlIllIIIIlllIlllIllI, final float llllllllllllIlIllIIIIlllIlllIlIl, final int llllllllllllIlIllIIIIlllIllllIIl) {
        this.b.putColorMultiplier(llllllllllllIlIllIIIIlllIlllIlll, llllllllllllIlIllIIIIlllIlllIllI, llllllllllllIlIllIIIIlllIlllIlIl, llllllllllllIlIllIIIIlllIllllIIl);
    }
    
    public void noColor() {
        this.b.markDirty();
    }
    
    public void postNormal(final float llllllllllllIlIllIIIlIIIIIIIIIII, final float llllllllllllIlIllIIIlIIIIIIIIIll, final float llllllllllllIlIllIIIIllllllllllI) {
        this.b.putNormal(llllllllllllIlIllIIIlIIIIIIIIIII, llllllllllllIlIllIIIlIIIIIIIIIll, llllllllllllIlIllIIIIllllllllllI);
    }
    
    public RealmsBufferBuilder from(final WorldRenderer llllllllllllIlIllIIIlIIIIIlIIIIl) {
        this.b = llllllllllllIlIllIIIlIIIIIlIIIIl;
        return this;
    }
    
    public void faceTex2(final int llllllllllllIlIllIIIIllllIlllIII, final int llllllllllllIlIllIIIIllllIllIIlI, final int llllllllllllIlIllIIIIllllIllIllI, final int llllllllllllIlIllIIIIllllIllIlIl) {
        this.b.putBrightness4(llllllllllllIlIllIIIIllllIlllIII, llllllllllllIlIllIIIIllllIllIIlI, llllllllllllIlIllIIIIllllIllIllI, llllllllllllIlIllIIIIllllIllIlIl);
    }
}
