// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.fills;

import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.Color;
import org.newdawn.slick.geom.Vector2f;
import org.newdawn.slick.ShapeFill;

public class GradientFill implements ShapeFill
{
    private /* synthetic */ Vector2f end;
    private /* synthetic */ Vector2f none;
    private /* synthetic */ Color endCol;
    private /* synthetic */ Color startCol;
    private /* synthetic */ boolean local;
    private static final /* synthetic */ int[] llIlllIIlIllII;
    private /* synthetic */ Vector2f start;
    
    public Vector2f getOffsetAt(final Shape llllllllllllIllIIlIIlllIlIIlIlll, final float llllllllllllIllIIlIIlllIlIIlIllI, final float llllllllllllIllIIlIIlllIlIIlIlIl) {
        return this.none;
    }
    
    public void setEnd(final float llllllllllllIllIIlIIlllIlllIIIll, final float llllllllllllIllIIlIIlllIllIlllll) {
        this.setEnd(new Vector2f(llllllllllllIllIIlIIlllIlllIIIll, llllllllllllIllIIlIIlllIllIlllll));
    }
    
    public Color getEndColor() {
        return this.endCol;
    }
    
    public void setStartColor(final Color llllllllllllIllIIlIIlllIllIlIIll) {
        this.startCol = new Color(llllllllllllIllIIlIIlllIllIlIIll);
    }
    
    private static boolean lIIllIIlIlIllllI(final int llllllllllllIllIIlIIlllIlIIIlllI) {
        return llllllllllllIllIIlIIlllIlIIIlllI < 0;
    }
    
    public Vector2f getStart() {
        return this.start;
    }
    
    public Color colorAt(final float llllllllllllIllIIlIIlllIlIllIIlI, final float llllllllllllIllIIlIIlllIlIlIIlII) {
        final float llllllllllllIllIIlIIlllIlIllIIII = this.end.getX() - this.start.getX();
        final float llllllllllllIllIIlIIlllIlIlIllll = this.end.getY() - this.start.getY();
        final float llllllllllllIllIIlIIlllIlIlIlllI = -llllllllllllIllIIlIIlllIlIlIllll;
        final float llllllllllllIllIIlIIlllIlIlIllIl = llllllllllllIllIIlIIlllIlIllIIII;
        final float llllllllllllIllIIlIIlllIlIlIllII = llllllllllllIllIIlIIlllIlIlIllIl * llllllllllllIllIIlIIlllIlIllIIII - llllllllllllIllIIlIIlllIlIlIlllI * llllllllllllIllIIlIIlllIlIlIllll;
        if (lIIllIIlIlIlllIl(lIIllIIlIlIllIll(llllllllllllIllIIlIIlllIlIlIllII, 0.0f))) {
            return Color.black;
        }
        float llllllllllllIllIIlIIlllIlIlIlIll = llllllllllllIllIIlIIlllIlIlIlllI * (this.start.getY() - llllllllllllIllIIlIIlllIlIlIIlII) - llllllllllllIllIIlIIlllIlIlIllIl * (this.start.getX() - llllllllllllIllIIlIIlllIlIllIIlI);
        llllllllllllIllIIlIIlllIlIlIlIll /= llllllllllllIllIIlIIlllIlIlIllII;
        float llllllllllllIllIIlIIlllIlIlIlIlI = llllllllllllIllIIlIIlllIlIllIIII * (this.start.getY() - llllllllllllIllIIlIIlllIlIlIIlII) - llllllllllllIllIIlIIlllIlIlIllll * (this.start.getX() - llllllllllllIllIIlIIlllIlIllIIlI);
        llllllllllllIllIIlIIlllIlIlIlIlI /= llllllllllllIllIIlIIlllIlIlIllII;
        float llllllllllllIllIIlIIlllIlIlIlIIl = llllllllllllIllIIlIIlllIlIlIlIll;
        if (lIIllIIlIlIllllI(lIIllIIlIlIlllII(llllllllllllIllIIlIIlllIlIlIlIIl, 0.0f))) {
            llllllllllllIllIIlIIlllIlIlIlIIl = 0.0f;
        }
        if (lIIllIIlIlIlllll(lIIllIIlIlIllIll(llllllllllllIllIIlIIlllIlIlIlIIl, 1.0f))) {
            llllllllllllIllIIlIIlllIlIlIlIIl = 1.0f;
        }
        final float llllllllllllIllIIlIIlllIlIlIlIII = 1.0f - llllllllllllIllIIlIIlllIlIlIlIIl;
        final Color llllllllllllIllIIlIIlllIlIlIIlll = new Color(GradientFill.llIlllIIlIllII[1], GradientFill.llIlllIIlIllII[1], GradientFill.llIlllIIlIllII[1], GradientFill.llIlllIIlIllII[1]);
        llllllllllllIllIIlIIlllIlIlIIlll.r = llllllllllllIllIIlIIlllIlIlIlIIl * this.endCol.r + llllllllllllIllIIlIIlllIlIlIlIII * this.startCol.r;
        llllllllllllIllIIlIIlllIlIlIIlll.b = llllllllllllIllIIlIIlllIlIlIlIIl * this.endCol.b + llllllllllllIllIIlIIlllIlIlIlIII * this.startCol.b;
        llllllllllllIllIIlIIlllIlIlIIlll.g = llllllllllllIllIIlIIlllIlIlIlIIl * this.endCol.g + llllllllllllIllIIlIIlllIlIlIlIII * this.startCol.g;
        llllllllllllIllIIlIIlllIlIlIIlll.a = llllllllllllIllIIlIIlllIlIlIlIIl * this.endCol.a + llllllllllllIllIIlIIlllIlIlIlIII * this.startCol.a;
        return llllllllllllIllIIlIIlllIlIlIIlll;
    }
    
    public void setEndColor(final Color llllllllllllIllIIlIIlllIllIIllll) {
        this.endCol = new Color(llllllllllllIllIIlIIlllIllIIllll);
    }
    
    public GradientFill(final float llllllllllllIllIIlIIllllIlIIIIlI, final float llllllllllllIllIIlIIllllIlIIIIIl, final Color llllllllllllIllIIlIIllllIIlllIIl, final float llllllllllllIllIIlIIllllIIllllll, final float llllllllllllIllIIlIIllllIIllIlll, final Color llllllllllllIllIIlIIllllIIllllIl) {
        this(llllllllllllIllIIlIIllllIlIIIIlI, llllllllllllIllIIlIIllllIlIIIIIl, llllllllllllIllIIlIIllllIIlllIIl, llllllllllllIllIIlIIllllIIllllll, llllllllllllIllIIlIIllllIIllIlll, llllllllllllIllIIlIIllllIIllllIl, (boolean)(GradientFill.llIlllIIlIllII[0] != 0));
    }
    
    public Color colorAt(final Shape llllllllllllIllIIlIIlllIllIIIIll, final float llllllllllllIllIIlIIlllIllIIIIlI, final float llllllllllllIllIIlIIlllIllIIIlIl) {
        if (lIIllIIlIlIllIlI(this.local ? 1 : 0)) {
            return this.colorAt(llllllllllllIllIIlIIlllIllIIIIlI - llllllllllllIllIIlIIlllIllIIIIll.getCenterX(), llllllllllllIllIIlIIlllIllIIIlIl - llllllllllllIllIIlIIlllIllIIIIll.getCenterY());
        }
        return this.colorAt(llllllllllllIllIIlIIlllIllIIIIlI, llllllllllllIllIIlIIlllIllIIIlIl);
    }
    
    private static void lIIllIIlIlIllIIl() {
        (llIlllIIlIllII = new int[2])[0] = ((0x6B ^ 0x40) & ~(0x3C ^ 0x17));
        GradientFill.llIlllIIlIllII[1] = " ".length();
    }
    
    static {
        lIIllIIlIlIllIIl();
    }
    
    public GradientFill getInvertedCopy() {
        return new GradientFill(this.start, this.endCol, this.end, this.startCol, this.local);
    }
    
    public void setLocal(final boolean llllllllllllIllIIlIIllllIIIIIlIl) {
        this.local = llllllllllllIllIIlIIllllIIIIIlIl;
    }
    
    private static boolean lIIllIIlIlIlllll(final int llllllllllllIllIIlIIlllIlIIIllII) {
        return llllllllllllIllIIlIIlllIlIIIllII > 0;
    }
    
    private static boolean lIIllIIlIlIlllIl(final int llllllllllllIllIIlIIlllIlIIlIIII) {
        return llllllllllllIllIIlIIlllIlIIlIIII == 0;
    }
    
    public Color getStartColor() {
        return this.startCol;
    }
    
    public GradientFill(final float llllllllllllIllIIlIIllllIIlIllII, final float llllllllllllIllIIlIIllllIIlIlIll, final Color llllllllllllIllIIlIIllllIIlIlIlI, final float llllllllllllIllIIlIIllllIIlIlIIl, final float llllllllllllIllIIlIIllllIIlIIIII, final Color llllllllllllIllIIlIIllllIIIlllll, final boolean llllllllllllIllIIlIIllllIIlIIllI) {
        this(new Vector2f(llllllllllllIllIIlIIllllIIlIllII, llllllllllllIllIIlIIllllIIlIlIll), llllllllllllIllIIlIIllllIIlIlIlI, new Vector2f(llllllllllllIllIIlIIllllIIlIlIIl, llllllllllllIllIIlIIllllIIlIIIII), llllllllllllIllIIlIIllllIIIlllll, llllllllllllIllIIlIIllllIIlIIllI);
    }
    
    public void setStart(final Vector2f llllllllllllIllIIlIIlllIlllIlIlI) {
        this.start = new Vector2f(llllllllllllIllIIlIIlllIlllIlIlI);
    }
    
    public void setStart(final float llllllllllllIllIIlIIlllIlllIllll, final float llllllllllllIllIIlIIlllIlllIlllI) {
        this.setStart(new Vector2f(llllllllllllIllIIlIIlllIlllIllll, llllllllllllIllIIlIIlllIlllIlllI));
    }
    
    public Vector2f getEnd() {
        return this.end;
    }
    
    public void setEnd(final Vector2f llllllllllllIllIIlIIlllIllIllIIl) {
        this.end = new Vector2f(llllllllllllIllIIlIIlllIllIllIIl);
    }
    
    private static boolean lIIllIIlIlIllIlI(final int llllllllllllIllIIlIIlllIlIIlIIlI) {
        return llllllllllllIllIIlIIlllIlIIlIIlI != 0;
    }
    
    public GradientFill(final Vector2f llllllllllllIllIIlIIllllIIIlIllI, final Color llllllllllllIllIIlIIllllIIIIllll, final Vector2f llllllllllllIllIIlIIllllIIIlIlII, final Color llllllllllllIllIIlIIllllIIIlIIll, final boolean llllllllllllIllIIlIIllllIIIlIIlI) {
        this.none = new Vector2f(0.0f, 0.0f);
        this.local = (GradientFill.llIlllIIlIllII[0] != 0);
        this.start = new Vector2f(llllllllllllIllIIlIIllllIIIlIllI);
        this.end = new Vector2f(llllllllllllIllIIlIIllllIIIlIlII);
        this.startCol = new Color(llllllllllllIllIIlIIllllIIIIllll);
        this.endCol = new Color(llllllllllllIllIIlIIllllIIIlIIll);
        this.local = llllllllllllIllIIlIIllllIIIlIIlI;
    }
    
    private static int lIIllIIlIlIlllII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static int lIIllIIlIlIllIll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
}
