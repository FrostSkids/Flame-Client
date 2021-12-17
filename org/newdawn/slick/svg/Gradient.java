// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.svg;

import org.newdawn.slick.ImageBuffer;
import org.newdawn.slick.Color;
import org.newdawn.slick.Image;
import org.newdawn.slick.geom.Transform;
import java.util.ArrayList;

public class Gradient
{
    private /* synthetic */ ArrayList steps;
    private /* synthetic */ Transform transform;
    private /* synthetic */ float x2;
    private /* synthetic */ String ref;
    private /* synthetic */ float y1;
    private /* synthetic */ float r;
    private /* synthetic */ float y2;
    private /* synthetic */ boolean radial;
    private /* synthetic */ Image image;
    private /* synthetic */ float x1;
    private static final /* synthetic */ int[] lIlIllllIIlIlI;
    private /* synthetic */ String name;
    
    public float getR() {
        return this.r;
    }
    
    public void setX1(final float lllllllllllllIIIIlIlIIlIIIllllll) {
        this.x1 = lllllllllllllIIIIlIlIIlIIIllllll;
    }
    
    public boolean isRadial() {
        return this.radial;
    }
    
    public Color getColorAt(float lllllllllllllIIIIlIlIIlIIIIIIlIl) {
        if (llllIlIIlIllIII(llllIlIIlIlIllI(lllllllllllllIIIIlIlIIlIIIIIIlIl, 0.0f))) {
            return this.steps.get(Gradient.lIlIllllIIlIlI[0]).col;
        }
        if (llllIlIIlIllIIl(llllIlIIlIlIlll(lllllllllllllIIIIlIlIIlIIIIIIlIl, 1.0f))) {
            return this.steps.get(this.steps.size() - Gradient.lIlIllllIIlIlI[3]).col;
        }
        int lllllllllllllIIIIlIlIIlIIIIIIlll = Gradient.lIlIllllIIlIlI[3];
        while (llllIlIIlIlIlIl(lllllllllllllIIIIlIlIIlIIIIIIlll, this.steps.size())) {
            final Step lllllllllllllIIIIlIlIIlIIIIIlIIl = this.steps.get(lllllllllllllIIIIlIlIIlIIIIIIlll - Gradient.lIlIllllIIlIlI[3]);
            final Step lllllllllllllIIIIlIlIIlIIIIIlIII = this.steps.get(lllllllllllllIIIIlIlIIlIIIIIIlll);
            if (llllIlIIlIllIII(llllIlIIlIlIllI(lllllllllllllIIIIlIlIIlIIIIIIlIl, lllllllllllllIIIIlIlIIlIIIIIlIII.location))) {
                final float lllllllllllllIIIIlIlIIlIIIIIllII = lllllllllllllIIIIlIlIIlIIIIIlIII.location - lllllllllllllIIIIlIlIIlIIIIIlIIl.location;
                lllllllllllllIIIIlIlIIlIIIIIIlIl -= lllllllllllllIIIIlIlIIlIIIIIlIIl.location;
                final float lllllllllllllIIIIlIlIIlIIIIIlIll = lllllllllllllIIIIlIlIIlIIIIIIlIl / lllllllllllllIIIIlIlIIlIIIIIllII;
                final Color lllllllllllllIIIIlIlIIlIIIIIlIlI = new Color(Gradient.lIlIllllIIlIlI[3], Gradient.lIlIllllIIlIlI[3], Gradient.lIlIllllIIlIlI[3], Gradient.lIlIllllIIlIlI[3]);
                lllllllllllllIIIIlIlIIlIIIIIlIlI.a = lllllllllllllIIIIlIlIIlIIIIIlIIl.col.a * (1.0f - lllllllllllllIIIIlIlIIlIIIIIlIll) + lllllllllllllIIIIlIlIIlIIIIIlIII.col.a * lllllllllllllIIIIlIlIIlIIIIIlIll;
                lllllllllllllIIIIlIlIIlIIIIIlIlI.r = lllllllllllllIIIIlIlIIlIIIIIlIIl.col.r * (1.0f - lllllllllllllIIIIlIlIIlIIIIIlIll) + lllllllllllllIIIIlIlIIlIIIIIlIII.col.r * lllllllllllllIIIIlIlIIlIIIIIlIll;
                lllllllllllllIIIIlIlIIlIIIIIlIlI.g = lllllllllllllIIIIlIlIIlIIIIIlIIl.col.g * (1.0f - lllllllllllllIIIIlIlIIlIIIIIlIll) + lllllllllllllIIIIlIlIIlIIIIIlIII.col.g * lllllllllllllIIIIlIlIIlIIIIIlIll;
                lllllllllllllIIIIlIlIIlIIIIIlIlI.b = lllllllllllllIIIIlIlIIlIIIIIlIIl.col.b * (1.0f - lllllllllllllIIIIlIlIIlIIIIIlIll) + lllllllllllllIIIIlIlIIlIIIIIlIII.col.b * lllllllllllllIIIIlIlIIlIIIIIlIll;
                return lllllllllllllIIIIlIlIIlIIIIIlIlI;
            }
            ++lllllllllllllIIIIlIlIIlIIIIIIlll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return Color.black;
    }
    
    private static int llllIlIIlIlIllI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public void genImage() {
        if (llllIlIIlIlIlII(this.image)) {
            final ImageBuffer lllllllllllllIIIIlIlIIlIIlIlIlII = new ImageBuffer(Gradient.lIlIllllIIlIlI[1], Gradient.lIlIllllIIlIlI[2]);
            int lllllllllllllIIIIlIlIIlIIlIlIlIl = Gradient.lIlIllllIIlIlI[0];
            while (llllIlIIlIlIlIl(lllllllllllllIIIIlIlIIlIIlIlIlIl, Gradient.lIlIllllIIlIlI[1])) {
                final Color lllllllllllllIIIIlIlIIlIIlIlIllI = this.getColorAt(lllllllllllllIIIIlIlIIlIIlIlIlIl / 128.0f);
                int lllllllllllllIIIIlIlIIlIIlIlIlll = Gradient.lIlIllllIIlIlI[0];
                while (llllIlIIlIlIlIl(lllllllllllllIIIIlIlIIlIIlIlIlll, Gradient.lIlIllllIIlIlI[2])) {
                    lllllllllllllIIIIlIlIIlIIlIlIlII.setRGBA(lllllllllllllIIIIlIlIIlIIlIlIlIl, lllllllllllllIIIIlIlIIlIIlIlIlll, lllllllllllllIIIIlIlIIlIIlIlIllI.getRedByte(), lllllllllllllIIIIlIlIIlIIlIlIllI.getGreenByte(), lllllllllllllIIIIlIlIIlIIlIlIllI.getBlueByte(), lllllllllllllIIIIlIlIIlIIlIlIllI.getAlphaByte());
                    ++lllllllllllllIIIIlIlIIlIIlIlIlll;
                    "".length();
                    if (" ".length() == 0) {
                        return;
                    }
                }
                ++lllllllllllllIIIIlIlIIlIIlIlIlIl;
                "".length();
                if (-"   ".length() > 0) {
                    return;
                }
            }
            this.image = lllllllllllllIIIIlIlIIlIIlIlIlII.getImage();
        }
    }
    
    public float getY1() {
        return this.y1;
    }
    
    public Gradient(final String lllllllllllllIIIIlIlIIlIIlllllll, final boolean lllllllllllllIIIIlIlIIlIIllllllI) {
        this.steps = new ArrayList();
        this.name = lllllllllllllIIIIlIlIIlIIlllllll;
        this.radial = lllllllllllllIIIIlIlIIlIIllllllI;
    }
    
    public float getX2() {
        return this.x2;
    }
    
    private static int llllIlIIlIlIlll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public float getX1() {
        return this.x1;
    }
    
    public void resolve(final Diagram lllllllllllllIIIIlIlIIlIIllIIIlI) {
        if (llllIlIIlIlIlII(this.ref)) {
            return;
        }
        final Gradient lllllllllllllIIIIlIlIIlIIllIIIIl = lllllllllllllIIIIlIlIIlIIllIIIlI.getGradient(this.ref);
        int lllllllllllllIIIIlIlIIlIIllIIlII = Gradient.lIlIllllIIlIlI[0];
        while (llllIlIIlIlIlIl(lllllllllllllIIIIlIlIIlIIllIIlII, lllllllllllllIIIIlIlIIlIIllIIIIl.steps.size())) {
            this.steps.add(lllllllllllllIIIIlIlIIlIIllIIIIl.steps.get(lllllllllllllIIIIlIlIIlIIllIIlII));
            "".length();
            ++lllllllllllllIIIIlIlIIlIIllIIlII;
            "".length();
            if (null != null) {
                return;
            }
        }
    }
    
    static {
        llllIlIIlIlIIll();
    }
    
    public void setR(final float lllllllllllllIIIIlIlIIlIIlIIIlIl) {
        this.r = lllllllllllllIIIIlIlIIlIIlIIIlIl;
    }
    
    public void reference(final String lllllllllllllIIIIlIlIIlIIllIlIll) {
        this.ref = lllllllllllllIIIIlIlIIlIIllIlIll;
    }
    
    private static boolean llllIlIIlIlIlIl(final int lllllllllllllIIIIlIlIIIllllllIlI, final int lllllllllllllIIIIlIlIIIllllllIIl) {
        return lllllllllllllIIIIlIlIIIllllllIlI < lllllllllllllIIIIlIlIIIllllllIIl;
    }
    
    public Transform getTransform() {
        return this.transform;
    }
    
    public void setY1(final float lllllllllllllIIIIlIlIIlIIIllIlIl) {
        this.y1 = lllllllllllllIIIIlIlIIlIIIllIlIl;
    }
    
    public void setX2(final float lllllllllllllIIIIlIlIIlIIIlllIll) {
        this.x2 = lllllllllllllIIIIlIlIIlIIIlllIll;
    }
    
    private static void llllIlIIlIlIIll() {
        (lIlIllllIIlIlI = new int[4])[0] = ((74 + 40 - 63 + 114 ^ 99 + 69 - 50 + 29) & (89 + 176 - 162 + 80 ^ 17 + 103 - 83 + 92 ^ -" ".length()));
        Gradient.lIlIllllIIlIlI[1] = (0x30 ^ 0x43) + (0x99 ^ 0xBD) - (0xB0 ^ 0xAB) + (0x3 ^ 0x7);
        Gradient.lIlIllllIIlIlI[2] = (0x45 ^ 0x55);
        Gradient.lIlIllllIIlIlI[3] = " ".length();
    }
    
    public void setY2(final float lllllllllllllIIIIlIlIIlIIIlIllll) {
        this.y2 = lllllllllllllIIIIlIlIIlIIIlIllll;
    }
    
    public float getY2() {
        return this.y2;
    }
    
    public void addStep(final float lllllllllllllIIIIlIlIIlIIIIlIllI, final Color lllllllllllllIIIIlIlIIlIIIIllIII) {
        this.steps.add(new Step(lllllllllllllIIIIlIlIIlIIIIlIllI, lllllllllllllIIIIlIlIIlIIIIllIII));
        "".length();
    }
    
    public Image getImage() {
        this.genImage();
        return this.image;
    }
    
    public void setTransform(final Transform lllllllllllllIIIIlIlIIlIIlllIlII) {
        this.transform = lllllllllllllIIIIlIlIIlIIlllIlII;
    }
    
    private static boolean llllIlIIlIllIIl(final int lllllllllllllIIIIlIlIIIlllllIIll) {
        return lllllllllllllIIIIlIlIIIlllllIIll > 0;
    }
    
    private static boolean llllIlIIlIlIlII(final Object lllllllllllllIIIIlIlIIIlllllIlll) {
        return lllllllllllllIIIIlIlIIIlllllIlll == null;
    }
    
    private static boolean llllIlIIlIllIII(final int lllllllllllllIIIIlIlIIIlllllIlIl) {
        return lllllllllllllIIIIlIlIIIlllllIlIl <= 0;
    }
    
    private class Step
    {
        /* synthetic */ Color col;
        /* synthetic */ float location;
        
        public Step(final float llllllllllllIlllllIllllIllIIlIll, final Color llllllllllllIlllllIllllIllIIlIlI) {
            this.location = llllllllllllIlllllIllllIllIIlIll;
            this.col = llllllllllllIlllllIllllIllIIlIlI;
        }
    }
}
