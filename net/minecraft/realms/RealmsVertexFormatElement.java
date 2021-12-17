// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.realms;

import net.minecraft.client.renderer.vertex.VertexFormatElement;

public class RealmsVertexFormatElement
{
    private /* synthetic */ VertexFormatElement v;
    
    @Override
    public int hashCode() {
        return this.v.hashCode();
    }
    
    public int getCount() {
        return this.v.getElementCount();
    }
    
    public int getByteSize() {
        return this.v.getSize();
    }
    
    public VertexFormatElement getVertexFormatElement() {
        return this.v;
    }
    
    public boolean isPosition() {
        return this.v.isPositionElement();
    }
    
    public int getIndex() {
        return this.v.getIndex();
    }
    
    public RealmsVertexFormatElement(final VertexFormatElement lllllllllllllIIIIIIlllIIIllIllll) {
        this.v = lllllllllllllIIIIIIlllIIIllIllll;
    }
    
    @Override
    public boolean equals(final Object lllllllllllllIIIIIIlllIIIlIlIlIl) {
        return this.v.equals(lllllllllllllIIIIIIlllIIIlIlIlIl);
    }
    
    @Override
    public String toString() {
        return this.v.toString();
    }
}
