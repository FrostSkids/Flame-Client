// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.svg.inkscape;

import org.w3c.dom.Element;
import org.newdawn.slick.svg.NonGeometricData;

public class InkscapeNonGeometricData extends NonGeometricData
{
    private /* synthetic */ Element element;
    
    private static boolean lIIlIIIIllIIIIll(final Object llllllllllllIllIlllIIIlIlIllIIll) {
        return llllllllllllIllIlllIIIlIlIllIIll == null;
    }
    
    public Element getElement() {
        return this.element;
    }
    
    @Override
    public String getAttribute(final String llllllllllllIllIlllIIIlIlIlllIIl) {
        String llllllllllllIllIlllIIIlIlIlllIll = super.getAttribute(llllllllllllIllIlllIIIlIlIlllIIl);
        if (lIIlIIIIllIIIIll(llllllllllllIllIlllIIIlIlIlllIll)) {
            llllllllllllIllIlllIIIlIlIlllIll = this.element.getAttribute(llllllllllllIllIlllIIIlIlIlllIIl);
        }
        return llllllllllllIllIlllIIIlIlIlllIll;
    }
    
    public InkscapeNonGeometricData(final String llllllllllllIllIlllIIIlIllIIIlIl, final Element llllllllllllIllIlllIIIlIllIIIIIl) {
        super(llllllllllllIllIlllIIIlIllIIIlIl);
        this.element = llllllllllllIllIlllIIIlIllIIIIIl;
    }
}
