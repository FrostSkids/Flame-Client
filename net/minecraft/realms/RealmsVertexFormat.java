// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.realms;

import java.util.Iterator;
import net.minecraft.client.renderer.vertex.VertexFormatElement;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.renderer.vertex.VertexFormat;

public class RealmsVertexFormat
{
    private /* synthetic */ VertexFormat v;
    
    @Override
    public String toString() {
        return this.v.toString();
    }
    
    public int getVertexSize() {
        return this.v.getNextOffset();
    }
    
    public void clear() {
        this.v.clear();
    }
    
    public int getIntegerSize() {
        return this.v.func_181719_f();
    }
    
    public List<RealmsVertexFormatElement> getElements() {
        final List<RealmsVertexFormatElement> lllllllllllllIlIIIIlIIlllIllllll = new ArrayList<RealmsVertexFormatElement>();
        final byte lllllllllllllIlIIIIlIIlllIlllIlI = (byte)this.v.getElements().iterator();
        "".length();
        if (null != null) {
            return null;
        }
        while (!llIIIIlIIIIlIlI(((Iterator)lllllllllllllIlIIIIlIIlllIlllIlI).hasNext() ? 1 : 0)) {
            final VertexFormatElement lllllllllllllIlIIIIlIIlllIlllllI = ((Iterator<VertexFormatElement>)lllllllllllllIlIIIIlIIlllIlllIlI).next();
            lllllllllllllIlIIIIlIIlllIllllll.add(new RealmsVertexFormatElement(lllllllllllllIlIIIIlIIlllIlllllI));
            "".length();
        }
        return lllllllllllllIlIIIIlIIlllIllllll;
    }
    
    public boolean hasColor() {
        return this.v.hasColor();
    }
    
    private static boolean llIIIIlIIIIlIlI(final int lllllllllllllIlIIIIlIIlllIIllIlI) {
        return lllllllllllllIlIIIIlIIlllIIllIlI == 0;
    }
    
    @Override
    public boolean equals(final Object lllllllllllllIlIIIIlIIlllIlIIlII) {
        return this.v.equals(lllllllllllllIlIIIIlIIlllIlIIlII);
    }
    
    public int getNormalOffset() {
        return this.v.getNormalOffset();
    }
    
    public RealmsVertexFormat(final VertexFormat lllllllllllllIlIIIIlIIllllllIIlI) {
        this.v = lllllllllllllIlIIIIlIIllllllIIlI;
    }
    
    public int getElementCount() {
        return this.v.getElementCount();
    }
    
    public boolean hasUv(final int lllllllllllllIlIIIIlIIllllIlIllI) {
        return this.v.hasUvOffset(lllllllllllllIlIIIIlIIllllIlIllI);
    }
    
    public RealmsVertexFormatElement getElement(final int lllllllllllllIlIIIIlIIllllIIlllI) {
        return new RealmsVertexFormatElement(this.v.getElement(lllllllllllllIlIIIIlIIllllIIlllI));
    }
    
    public RealmsVertexFormat from(final VertexFormat lllllllllllllIlIIIIlIIlllllIlllI) {
        this.v = lllllllllllllIlIIIIlIIlllllIlllI;
        return this;
    }
    
    @Override
    public int hashCode() {
        return this.v.hashCode();
    }
    
    public int getUvOffset(final int lllllllllllllIlIIIIlIIlllllIIIII) {
        return this.v.getUvOffsetById(lllllllllllllIlIIIIlIIlllllIIIII);
    }
    
    public VertexFormat getVertexFormat() {
        return this.v;
    }
    
    public int getOffset(final int lllllllllllllIlIIIIlIIlllIllIIII) {
        return this.v.func_181720_d(lllllllllllllIlIIIIlIIlllIllIIII);
    }
    
    public RealmsVertexFormat addElement(final RealmsVertexFormatElement lllllllllllllIlIIIIlIIllllIIlIlI) {
        return this.from(this.v.func_181721_a(lllllllllllllIlIIIIlIIllllIIlIlI.getVertexFormatElement()));
    }
    
    public int getColorOffset() {
        return this.v.getColorOffset();
    }
    
    public boolean hasNormal() {
        return this.v.hasNormal();
    }
}
