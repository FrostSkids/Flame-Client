// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.svg;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.geom.MorphShape;
import java.util.ArrayList;

public class SVGMorph extends Diagram
{
    private static final /* synthetic */ String[] lIIIIIIlllIIlI;
    private static final /* synthetic */ int[] lIIIIIIlllIlIl;
    private /* synthetic */ ArrayList figures;
    
    private static void lIllIlIIlllIIII() {
        (lIIIIIIlllIIlI = new String[SVGMorph.lIIIIIIlllIlIl[1]])[SVGMorph.lIIIIIIlllIlIl[0]] = lIllIlIIllIllll("DjgkIzI3Mj8rN2M1Pi80MTA6PX9jPD49ICo/MG46JyI=", "CQWNS");
    }
    
    private static boolean lIllIlIIlllIllI(final int lllllllllllllIlIlIIIIIIIllIIlIlI, final int lllllllllllllIlIlIIIIIIIllIIlIIl) {
        return lllllllllllllIlIlIIIIIIIllIIlIlI != lllllllllllllIlIlIIIIIIIllIIlIIl;
    }
    
    static {
        lIllIlIIlllIlII();
        lIllIlIIlllIIII();
    }
    
    private static boolean lIllIlIIlllIlll(final int lllllllllllllIlIlIIIIIIIllIIllIl) {
        return lllllllllllllIlIlIIIIIIIllIIllIl != 0;
    }
    
    private static boolean lIllIlIIlllIlIl(final int lllllllllllllIlIlIIIIIIIllIlIIII, final int lllllllllllllIlIlIIIIIIIllIIllll) {
        return lllllllllllllIlIlIIIIIIIllIlIIII < lllllllllllllIlIlIIIIIIIllIIllll;
    }
    
    public void setMorphTime(final float lllllllllllllIlIlIIIIIIIlllllIIl) {
        int lllllllllllllIlIlIIIIIIIlllllIll = SVGMorph.lIIIIIIlllIlIl[0];
        while (lIllIlIIlllIlIl(lllllllllllllIlIlIIIIIIIlllllIll, this.figures.size())) {
            final Figure lllllllllllllIlIlIIIIIIIllllllIl = this.figures.get(lllllllllllllIlIlIIIIIIIlllllIll);
            final MorphShape lllllllllllllIlIlIIIIIIIllllllII = (MorphShape)lllllllllllllIlIlIIIIIIIllllllIl.getShape();
            lllllllllllllIlIlIIIIIIIllllllII.setMorphTime(lllllllllllllIlIlIIIIIIIlllllIIl);
            ++lllllllllllllIlIlIIIIIIIlllllIll;
            "".length();
            if (" ".length() > " ".length()) {
                return;
            }
        }
    }
    
    public void updateMorphTime(final float lllllllllllllIlIlIIIIIIlIIIIlIII) {
        int lllllllllllllIlIlIIIIIIlIIIIlIlI = SVGMorph.lIIIIIIlllIlIl[0];
        while (lIllIlIIlllIlIl(lllllllllllllIlIlIIIIIIlIIIIlIlI, this.figures.size())) {
            final Figure lllllllllllllIlIlIIIIIIlIIIIllII = this.figures.get(lllllllllllllIlIlIIIIIIlIIIIlIlI);
            final MorphShape lllllllllllllIlIlIIIIIIlIIIIlIll = (MorphShape)lllllllllllllIlIlIIIIIIlIIIIllII.getShape();
            lllllllllllllIlIlIIIIIIlIIIIlIll.updateMorphTime(lllllllllllllIlIlIIIIIIlIIIIlIII);
            ++lllllllllllllIlIlIIIIIIlIIIIlIlI;
            "".length();
            if (((0xF9 ^ 0xC5) & ~(0x80 ^ 0xBC)) != 0x0) {
                return;
            }
        }
    }
    
    @Override
    public int getFigureCount() {
        return this.figures.size();
    }
    
    public SVGMorph(final Diagram lllllllllllllIlIlIIIIIIlIlIIIIlI) {
        super(lllllllllllllIlIlIIIIIIlIlIIIIlI.getWidth(), lllllllllllllIlIlIIIIIIlIlIIIIlI.getHeight());
        this.figures = new ArrayList();
        int lllllllllllllIlIlIIIIIIlIlIIIllI = SVGMorph.lIIIIIIlllIlIl[0];
        while (lIllIlIIlllIlIl(lllllllllllllIlIlIIIIIIlIlIIIllI, lllllllllllllIlIlIIIIIIlIlIIIIlI.getFigureCount())) {
            final Figure lllllllllllllIlIlIIIIIIlIlIIlIII = lllllllllllllIlIlIIIIIIlIlIIIIlI.getFigure(lllllllllllllIlIlIIIIIIlIlIIIllI);
            final Figure lllllllllllllIlIlIIIIIIlIlIIIlll = new Figure(lllllllllllllIlIlIIIIIIlIlIIlIII.getType(), new MorphShape(lllllllllllllIlIlIIIIIIlIlIIlIII.getShape()), lllllllllllllIlIlIIIIIIlIlIIlIII.getData(), lllllllllllllIlIlIIIIIIlIlIIlIII.getTransform());
            this.figures.add(lllllllllllllIlIlIIIIIIlIlIIIlll);
            "".length();
            ++lllllllllllllIlIlIIIIIIlIlIIIllI;
            "".length();
            if (-" ".length() != -" ".length()) {
                throw null;
            }
        }
    }
    
    public void setExternalDiagram(final Diagram lllllllllllllIlIlIIIIIIlIIIllIIl) {
        int lllllllllllllIlIlIIIIIIlIIIllIll = SVGMorph.lIIIIIIlllIlIl[0];
        while (lIllIlIIlllIlIl(lllllllllllllIlIlIIIIIIlIIIllIll, this.figures.size())) {
            final Figure lllllllllllllIlIlIIIIIIlIIIlllII = this.figures.get(lllllllllllllIlIlIIIIIIlIIIllIll);
            int lllllllllllllIlIlIIIIIIlIIIlllIl = SVGMorph.lIIIIIIlllIlIl[0];
            while (lIllIlIIlllIlIl(lllllllllllllIlIlIIIIIIlIIIlllIl, lllllllllllllIlIlIIIIIIlIIIllIIl.getFigureCount())) {
                final Figure lllllllllllllIlIlIIIIIIlIIIllllI = lllllllllllllIlIlIIIIIIlIIIllIIl.getFigure(lllllllllllllIlIlIIIIIIlIIIlllIl);
                if (lIllIlIIlllIlll(lllllllllllllIlIlIIIIIIlIIIllllI.getData().getMetaData().equals(lllllllllllllIlIlIIIIIIlIIIlllII.getData().getMetaData()) ? 1 : 0)) {
                    final MorphShape lllllllllllllIlIlIIIIIIlIIIlllll = (MorphShape)lllllllllllllIlIlIIIIIIlIIIlllII.getShape();
                    lllllllllllllIlIlIIIIIIlIIIlllll.setExternalFrame(lllllllllllllIlIlIIIIIIlIIIllllI.getShape());
                    "".length();
                    if ("   ".length() <= 0) {
                        return;
                    }
                    break;
                }
                else {
                    ++lllllllllllllIlIlIIIIIIlIIIlllIl;
                    "".length();
                    if (((0xE2 ^ 0xB9) & ~(0x66 ^ 0x3D)) > 0) {
                        return;
                    }
                    continue;
                }
            }
            ++lllllllllllllIlIlIIIIIIlIIIllIll;
            "".length();
            if (-"  ".length() >= 0) {
                return;
            }
        }
    }
    
    public void addStep(final Diagram lllllllllllllIlIlIIIIIIlIIlIllll) {
        if (lIllIlIIlllIllI(lllllllllllllIlIlIIIIIIlIIlIllll.getFigureCount(), this.figures.size())) {
            throw new RuntimeException(SVGMorph.lIIIIIIlllIIlI[SVGMorph.lIIIIIIlllIlIl[0]]);
        }
        int lllllllllllllIlIlIIIIIIlIIllIIIl = SVGMorph.lIIIIIIlllIlIl[0];
        while (lIllIlIIlllIlIl(lllllllllllllIlIlIIIIIIlIIllIIIl, lllllllllllllIlIlIIIIIIlIIlIllll.getFigureCount())) {
            final Figure lllllllllllllIlIlIIIIIIlIIllIIll = lllllllllllllIlIlIIIIIIlIIlIllll.getFigure(lllllllllllllIlIlIIIIIIlIIllIIIl);
            final String lllllllllllllIlIlIIIIIIlIIllIIlI = lllllllllllllIlIlIIIIIIlIIllIIll.getData().getMetaData();
            int lllllllllllllIlIlIIIIIIlIIllIlII = SVGMorph.lIIIIIIlllIlIl[0];
            while (lIllIlIIlllIlIl(lllllllllllllIlIlIIIIIIlIIllIlII, this.figures.size())) {
                final Figure lllllllllllllIlIlIIIIIIlIIllIlIl = this.figures.get(lllllllllllllIlIlIIIIIIlIIllIlII);
                if (lIllIlIIlllIlll(lllllllllllllIlIlIIIIIIlIIllIlIl.getData().getMetaData().equals(lllllllllllllIlIlIIIIIIlIIllIIlI) ? 1 : 0)) {
                    final MorphShape lllllllllllllIlIlIIIIIIlIIllIllI = (MorphShape)lllllllllllllIlIlIIIIIIlIIllIlIl.getShape();
                    lllllllllllllIlIlIIIIIIlIIllIllI.addShape(lllllllllllllIlIlIIIIIIlIIllIIll.getShape());
                    "".length();
                    if (null != null) {
                        return;
                    }
                    break;
                }
                else {
                    ++lllllllllllllIlIlIIIIIIlIIllIlII;
                    "".length();
                    if ("  ".length() <= 0) {
                        return;
                    }
                    continue;
                }
            }
            ++lllllllllllllIlIlIIIIIIlIIllIIIl;
            "".length();
            if (" ".length() > "  ".length()) {
                return;
            }
        }
    }
    
    private static void lIllIlIIlllIlII() {
        (lIIIIIIlllIlIl = new int[2])[0] = ((0x25 ^ 0x48 ^ (0x8E ^ 0xA1)) & (0x58 ^ 0x7C ^ (0x10 ^ 0x76) ^ -" ".length()));
        SVGMorph.lIIIIIIlllIlIl[1] = " ".length();
    }
    
    private static String lIllIlIIllIllll(String lllllllllllllIlIlIIIIIIIllIllIll, final String lllllllllllllIlIlIIIIIIIllIllIlI) {
        lllllllllllllIlIlIIIIIIIllIllIll = (boolean)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIlIIIIIIIllIllIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlIIIIIIIllIllllI = new StringBuilder();
        final char[] lllllllllllllIlIlIIIIIIIllIlllIl = lllllllllllllIlIlIIIIIIIllIllIlI.toCharArray();
        int lllllllllllllIlIlIIIIIIIllIlllII = SVGMorph.lIIIIIIlllIlIl[0];
        final byte lllllllllllllIlIlIIIIIIIllIlIllI = (Object)((String)lllllllllllllIlIlIIIIIIIllIllIll).toCharArray();
        final long lllllllllllllIlIlIIIIIIIllIlIlIl = lllllllllllllIlIlIIIIIIIllIlIllI.length;
        short lllllllllllllIlIlIIIIIIIllIlIlII = (short)SVGMorph.lIIIIIIlllIlIl[0];
        while (lIllIlIIlllIlIl(lllllllllllllIlIlIIIIIIIllIlIlII, (int)lllllllllllllIlIlIIIIIIIllIlIlIl)) {
            final char lllllllllllllIlIlIIIIIIIlllIIIIl = lllllllllllllIlIlIIIIIIIllIlIllI[lllllllllllllIlIlIIIIIIIllIlIlII];
            lllllllllllllIlIlIIIIIIIllIllllI.append((char)(lllllllllllllIlIlIIIIIIIlllIIIIl ^ lllllllllllllIlIlIIIIIIIllIlllIl[lllllllllllllIlIlIIIIIIIllIlllII % lllllllllllllIlIlIIIIIIIllIlllIl.length]));
            "".length();
            ++lllllllllllllIlIlIIIIIIIllIlllII;
            ++lllllllllllllIlIlIIIIIIIllIlIlII;
            "".length();
            if ((101 + 65 + 7 + 25 ^ 24 + 77 + 77 + 16) <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlIIIIIIIllIllllI);
    }
    
    @Override
    public Figure getFigure(final int lllllllllllllIlIlIIIIIIIlllIlIll) {
        return this.figures.get(lllllllllllllIlIlIIIIIIIlllIlIll);
    }
}
