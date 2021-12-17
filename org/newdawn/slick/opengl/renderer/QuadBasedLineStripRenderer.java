// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.opengl.renderer;

public class QuadBasedLineStripRenderer implements LineStripRenderer
{
    private /* synthetic */ int cpt;
    private /* synthetic */ float[] colours;
    public static /* synthetic */ int MAX_POINTS;
    private /* synthetic */ boolean lineCaps;
    private /* synthetic */ float width;
    private /* synthetic */ SGL GL;
    private /* synthetic */ DefaultLineStripRenderer def;
    private /* synthetic */ boolean renderHalf;
    private /* synthetic */ float[] points;
    private static final /* synthetic */ int[] lIlIIIlIlllIll;
    private /* synthetic */ int pts;
    private /* synthetic */ boolean antialias;
    
    public void setAntiAlias(final boolean lllllllllllllIIIllllIlllllIIIlll) {
        this.def.setAntiAlias(lllllllllllllIIIllllIlllllIIIlll);
        this.antialias = lllllllllllllIIIllllIlllllIIIlll;
    }
    
    public void end() {
        if (lllIIIllIIIllll(lllIIIllIIlIIII(this.width, 1.0f))) {
            this.def.end();
            return;
        }
        this.renderLines(this.points, this.pts);
    }
    
    public void vertex(final float lllllllllllllIIIllllIlllllIlIlIl, final float lllllllllllllIIIllllIlllllIlIlII) {
        if (lllIIIllIIIllll(lllIIIllIIlIIIl(this.width, 1.0f))) {
            this.def.vertex(lllllllllllllIIIllllIlllllIlIlIl, lllllllllllllIIIllllIlllllIlIlII);
            return;
        }
        this.points[this.pts * QuadBasedLineStripRenderer.lIlIIIlIlllIll[1]] = lllllllllllllIIIllllIlllllIlIlIl;
        this.points[this.pts * QuadBasedLineStripRenderer.lIlIIIlIlllIll[1] + QuadBasedLineStripRenderer.lIlIIIlIlllIll[3]] = lllllllllllllIIIllllIlllllIlIlII;
        this.pts += QuadBasedLineStripRenderer.lIlIIIlIlllIll[3];
        final int lllllllllllllIIIllllIlllllIlIlll = this.pts - QuadBasedLineStripRenderer.lIlIIIlIlllIll[3];
        this.color(this.colours[lllllllllllllIIIllllIlllllIlIlll * QuadBasedLineStripRenderer.lIlIIIlIlllIll[2]], this.colours[lllllllllllllIIIllllIlllllIlIlll * QuadBasedLineStripRenderer.lIlIIIlIlllIll[2] + QuadBasedLineStripRenderer.lIlIIIlIlllIll[3]], this.colours[lllllllllllllIIIllllIlllllIlIlll * QuadBasedLineStripRenderer.lIlIIIlIlllIll[2] + QuadBasedLineStripRenderer.lIlIIIlIlllIll[1]], this.colours[lllllllllllllIIIllllIlllllIlIlll * QuadBasedLineStripRenderer.lIlIIIlIlllIll[2] + QuadBasedLineStripRenderer.lIlIIIlIlllIll[4]]);
    }
    
    private static int lllIIIllIIlIIII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static int lllIIIllIIlIIll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lllIIIllIIlIlll(final int lllllllllllllIIIllllIlllIlIlIIll, final int lllllllllllllIIIllllIlllIlIlIIlI) {
        return lllllllllllllIIIllllIlllIlIlIIll >= lllllllllllllIIIllllIlllIlIlIIlI;
    }
    
    private static boolean lllIIIllIIIllll(final int lllllllllllllIIIllllIlllIlIIlIlI) {
        return lllllllllllllIIIllllIlllIlIIlIlI == 0;
    }
    
    private static int lllIIIllIIIlllI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    static {
        lllIIIllIIIllIl();
        QuadBasedLineStripRenderer.MAX_POINTS = QuadBasedLineStripRenderer.lIlIIIlIlllIll[8];
    }
    
    public void start() {
        if (lllIIIllIIIllll(lllIIIllIIIlllI(this.width, 1.0f))) {
            this.def.start();
            return;
        }
        this.pts = QuadBasedLineStripRenderer.lIlIIIlIlllIll[0];
        this.cpt = QuadBasedLineStripRenderer.lIlIIIlIlllIll[0];
        this.GL.flush();
        final float[] lllllllllllllIIIllllIllllllIIlII = this.GL.getCurrentColor();
        this.color(lllllllllllllIIIllllIllllllIIlII[QuadBasedLineStripRenderer.lIlIIIlIlllIll[0]], lllllllllllllIIIllllIllllllIIlII[QuadBasedLineStripRenderer.lIlIIIlIlllIll[3]], lllllllllllllIIIllllIllllllIIlII[QuadBasedLineStripRenderer.lIlIIIlIlllIll[1]], lllllllllllllIIIllllIllllllIIlII[QuadBasedLineStripRenderer.lIlIIIlIlllIll[4]]);
    }
    
    public void color(final float lllllllllllllIIIllllIlllIlIlllII, final float lllllllllllllIIIllllIlllIlIllIll, final float lllllllllllllIIIllllIlllIlIlllll, final float lllllllllllllIIIllllIlllIlIllIIl) {
        if (lllIIIllIIIllll(lllIIIllIIllIIl(this.width, 1.0f))) {
            this.def.color(lllllllllllllIIIllllIlllIlIlllII, lllllllllllllIIIllllIlllIlIllIll, lllllllllllllIIIllllIlllIlIlllll, lllllllllllllIIIllllIlllIlIllIIl);
            return;
        }
        this.colours[this.pts * QuadBasedLineStripRenderer.lIlIIIlIlllIll[2]] = lllllllllllllIIIllllIlllIlIlllII;
        this.colours[this.pts * QuadBasedLineStripRenderer.lIlIIIlIlllIll[2] + QuadBasedLineStripRenderer.lIlIIIlIlllIll[3]] = lllllllllllllIIIllllIlllIlIllIll;
        this.colours[this.pts * QuadBasedLineStripRenderer.lIlIIIlIlllIll[2] + QuadBasedLineStripRenderer.lIlIIIlIlllIll[1]] = lllllllllllllIIIllllIlllIlIlllll;
        this.colours[this.pts * QuadBasedLineStripRenderer.lIlIIIlIlllIll[2] + QuadBasedLineStripRenderer.lIlIIIlIlllIll[4]] = lllllllllllllIIIllllIlllIlIllIIl;
        this.cpt += QuadBasedLineStripRenderer.lIlIIIlIlllIll[3];
    }
    
    private static int lllIIIllIIlIlII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public QuadBasedLineStripRenderer() {
        this.GL = Renderer.get();
        this.width = 1.0f;
        this.def = new DefaultLineStripRenderer();
        this.lineCaps = (QuadBasedLineStripRenderer.lIlIIIlIlllIll[0] != 0);
        this.points = new float[QuadBasedLineStripRenderer.MAX_POINTS * QuadBasedLineStripRenderer.lIlIIIlIlllIll[1]];
        this.colours = new float[QuadBasedLineStripRenderer.MAX_POINTS * QuadBasedLineStripRenderer.lIlIIIlIlllIll[2]];
    }
    
    private static boolean lllIIIllIIlIIlI(final int lllllllllllllIIIllllIlllIlIIllII) {
        return lllllllllllllIIIllllIlllIlIIllII != 0;
    }
    
    private static int lllIIIllIIllIIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public void setWidth(final float lllllllllllllIIIllllIlllllIIllll) {
        this.width = lllllllllllllIIIllllIlllllIIllll;
    }
    
    private static int lllIIIllIIllIlI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static int lllIIIllIIlIIIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public void setLineCaps(final boolean lllllllllllllIIIllllIllllllIlIII) {
        this.lineCaps = lllllllllllllIIIllllIllllllIlIII;
    }
    
    private static void lllIIIllIIIllIl() {
        (lIlIIIlIlllIll = new int[9])[0] = ((139 + 159 - 148 + 66 ^ 106 + 87 - 137 + 100) & (0xC2 ^ 0xAC ^ (0x84 ^ 0xAE) ^ -" ".length()));
        QuadBasedLineStripRenderer.lIlIIIlIlllIll[1] = "  ".length();
        QuadBasedLineStripRenderer.lIlIIIlIlllIll[2] = (153 + 47 - 56 + 49 ^ 124 + 16 - 106 + 163);
        QuadBasedLineStripRenderer.lIlIIIlIlllIll[3] = " ".length();
        QuadBasedLineStripRenderer.lIlIIIlIlllIll[4] = "   ".length();
        QuadBasedLineStripRenderer.lIlIIIlIlllIll[5] = (-(0xFFFFFF3B & 0x74D7) & (0xFFFFFFD7 & 0x7F7B));
        QuadBasedLineStripRenderer.lIlIIIlIlllIll[6] = (41 + 69 + 12 + 36 ^ 117 + 27 - 51 + 60);
        QuadBasedLineStripRenderer.lIlIIIlIlllIll[7] = (0x4A ^ 0x4C);
        QuadBasedLineStripRenderer.lIlIIIlIlllIll[8] = (-(0xFFFFEFE5 & 0x58FB) & (0xFFFFEFF3 & 0x7FFC));
    }
    
    private static boolean lllIIIllIIlIlIl(final int lllllllllllllIIIllllIlllIlIIllll, final int lllllllllllllIIIllllIlllIlIIlllI) {
        return lllllllllllllIIIllllIlllIlIIllll < lllllllllllllIIIllllIlllIlIIlllI;
    }
    
    public void renderLinesImpl(final float[] lllllllllllllIIIllllIllllIIIIIll, final int lllllllllllllIIIllllIllllIIIIIlI, final float lllllllllllllIIIllllIllllIIIIIIl) {
        final float lllllllllllllIIIllllIllllIIIlIlI = lllllllllllllIIIllllIllllIIIIIIl / 2.0f;
        float lllllllllllllIIIllllIllllIIIlIIl = 0.0f;
        float lllllllllllllIIIllllIllllIIIlIII = 0.0f;
        float lllllllllllllIIIllllIllllIIIIlll = 0.0f;
        float lllllllllllllIIIllllIllllIIIIllI = 0.0f;
        this.GL.glBegin(QuadBasedLineStripRenderer.lIlIIIlIlllIll[6]);
        int lllllllllllllIIIllllIllllIIllIIl = QuadBasedLineStripRenderer.lIlIIIlIlllIll[0];
        while (lllIIIllIIlIlIl(lllllllllllllIIIllllIllllIIllIIl, lllllllllllllIIIllllIllllIIIIIlI + QuadBasedLineStripRenderer.lIlIIIlIlllIll[3])) {
            int lllllllllllllIIIllllIllllIlIIllI = lllllllllllllIIIllllIllllIIllIIl;
            int lllllllllllllIIIllllIllllIlIIlIl = lllllllllllllIIIllllIllllIIllIIl + QuadBasedLineStripRenderer.lIlIIIlIlllIll[3];
            int lllllllllllllIIIllllIllllIlIIlII = lllllllllllllIIIllllIllllIIllIIl - QuadBasedLineStripRenderer.lIlIIIlIlllIll[3];
            if (lllIIIllIIlIllI(lllllllllllllIIIllllIllllIlIIlII)) {
                lllllllllllllIIIllllIllllIlIIlII += lllllllllllllIIIllllIllllIIIIIlI;
            }
            if (lllIIIllIIlIlll(lllllllllllllIIIllllIllllIlIIlIl, lllllllllllllIIIllllIllllIIIIIlI)) {
                lllllllllllllIIIllllIllllIlIIlIl -= lllllllllllllIIIllllIllllIIIIIlI;
            }
            if (lllIIIllIIlIlll(lllllllllllllIIIllllIllllIlIIllI, lllllllllllllIIIllllIllllIIIIIlI)) {
                lllllllllllllIIIllllIllllIlIIllI -= lllllllllllllIIIllllIllllIIIIIlI;
            }
            final float lllllllllllllIIIllllIllllIlIIIll = lllllllllllllIIIllllIllllIIIIIll[lllllllllllllIIIllllIllllIlIIllI * QuadBasedLineStripRenderer.lIlIIIlIlllIll[1]];
            final float lllllllllllllIIIllllIllllIlIIIlI = lllllllllllllIIIllllIllllIIIIIll[lllllllllllllIIIllllIllllIlIIllI * QuadBasedLineStripRenderer.lIlIIIlIlllIll[1] + QuadBasedLineStripRenderer.lIlIIIlIlllIll[3]];
            final float lllllllllllllIIIllllIllllIlIIIIl = lllllllllllllIIIllllIllllIIIIIll[lllllllllllllIIIllllIllllIlIIlIl * QuadBasedLineStripRenderer.lIlIIIlIlllIll[1]];
            final float lllllllllllllIIIllllIllllIlIIIII = lllllllllllllIIIllllIllllIIIIIll[lllllllllllllIIIllllIllllIlIIlIl * QuadBasedLineStripRenderer.lIlIIIlIlllIll[1] + QuadBasedLineStripRenderer.lIlIIIlIlllIll[3]];
            float lllllllllllllIIIllllIllllIIlllll = lllllllllllllIIIllllIllllIlIIIIl - lllllllllllllIIIllllIllllIlIIIll;
            float lllllllllllllIIIllllIllllIIllllI = lllllllllllllIIIllllIllllIlIIIII - lllllllllllllIIIllllIllllIlIIIlI;
            if (lllIIIllIIIllll(lllIIIllIIlIIll(lllllllllllllIIIllllIllllIIlllll, 0.0f)) && lllIIIllIIIllll(lllIIIllIIlIIll(lllllllllllllIIIllllIllllIIllllI, 0.0f))) {
                "".length();
                if (-"   ".length() >= 0) {
                    return;
                }
            }
            else {
                final float lllllllllllllIIIllllIllllIIlllIl = lllllllllllllIIIllllIllllIIlllll * lllllllllllllIIIllllIllllIIlllll + lllllllllllllIIIllllIllllIIllllI * lllllllllllllIIIllllIllllIIllllI;
                final float lllllllllllllIIIllllIllllIIlllII = (float)Math.sqrt(lllllllllllllIIIllllIllllIIlllIl);
                lllllllllllllIIIllllIllllIIlllll *= lllllllllllllIIIllllIllllIIIlIlI;
                lllllllllllllIIIllllIllllIIllllI *= lllllllllllllIIIllllIllllIIIlIlI;
                lllllllllllllIIIllllIllllIIlllll /= lllllllllllllIIIllllIllllIIlllII;
                final float lllllllllllllIIIllllIllllIIllIll;
                lllllllllllllIIIllllIllllIIllllI = (lllllllllllllIIIllllIllllIIllIll = lllllllllllllIIIllllIllllIIllllI / lllllllllllllIIIllllIllllIIlllII);
                final float lllllllllllllIIIllllIllllIIllIlI = -lllllllllllllIIIllllIllllIIlllll;
                if (lllIIIllIIlIIlI(lllllllllllllIIIllllIllllIIllIIl)) {
                    this.bindColor(lllllllllllllIIIllllIllllIlIIlII);
                    this.GL.glVertex3f(lllllllllllllIIIllllIllllIIIlIIl, lllllllllllllIIIllllIllllIIIlIII, 0.0f);
                    this.GL.glVertex3f(lllllllllllllIIIllllIllllIIIIlll, lllllllllllllIIIllllIllllIIIIllI, 0.0f);
                    this.bindColor(lllllllllllllIIIllllIllllIlIIllI);
                    this.GL.glVertex3f(lllllllllllllIIIllllIllllIlIIIll + lllllllllllllIIIllllIllllIIllIll, lllllllllllllIIIllllIllllIlIIIlI + lllllllllllllIIIllllIllllIIllIlI, 0.0f);
                    this.GL.glVertex3f(lllllllllllllIIIllllIllllIlIIIll - lllllllllllllIIIllllIllllIIllIll, lllllllllllllIIIllllIllllIlIIIlI - lllllllllllllIIIllllIllllIIllIlI, 0.0f);
                }
                lllllllllllllIIIllllIllllIIIlIIl = lllllllllllllIIIllllIllllIlIIIIl - lllllllllllllIIIllllIllllIIllIll;
                lllllllllllllIIIllllIllllIIIlIII = lllllllllllllIIIllllIllllIlIIIII - lllllllllllllIIIllllIllllIIllIlI;
                lllllllllllllIIIllllIllllIIIIlll = lllllllllllllIIIllllIllllIlIIIIl + lllllllllllllIIIllllIllllIIllIll;
                lllllllllllllIIIllllIllllIIIIllI = lllllllllllllIIIllllIllllIlIIIII + lllllllllllllIIIllllIllllIIllIlI;
                if (lllIIIllIIlIlIl(lllllllllllllIIIllllIllllIIllIIl, lllllllllllllIIIllllIllllIIIIIlI - QuadBasedLineStripRenderer.lIlIIIlIlllIll[3])) {
                    this.bindColor(lllllllllllllIIIllllIllllIlIIllI);
                    this.GL.glVertex3f(lllllllllllllIIIllllIllllIlIIIll + lllllllllllllIIIllllIllllIIllIll, lllllllllllllIIIllllIllllIlIIIlI + lllllllllllllIIIllllIllllIIllIlI, 0.0f);
                    this.GL.glVertex3f(lllllllllllllIIIllllIllllIlIIIll - lllllllllllllIIIllllIllllIIllIll, lllllllllllllIIIllllIllllIlIIIlI - lllllllllllllIIIllllIllllIIllIlI, 0.0f);
                    this.bindColor(lllllllllllllIIIllllIllllIlIIlIl);
                    this.GL.glVertex3f(lllllllllllllIIIllllIllllIlIIIIl - lllllllllllllIIIllllIllllIIllIll, lllllllllllllIIIllllIllllIlIIIII - lllllllllllllIIIllllIllllIIllIlI, 0.0f);
                    this.GL.glVertex3f(lllllllllllllIIIllllIllllIlIIIIl + lllllllllllllIIIllllIllllIIllIll, lllllllllllllIIIllllIllllIlIIIII + lllllllllllllIIIllllIllllIIllIlI, 0.0f);
                }
            }
            ++lllllllllllllIIIllllIllllIIllIIl;
            "".length();
            if (((0x16 ^ 0x2C) & ~(0xFF ^ 0xC5)) != 0x0) {
                return;
            }
        }
        this.GL.glEnd();
        float n;
        if (lllIIIllIIllIII(lllIIIllIIlIlII(lllllllllllllIIIllllIllllIIIlIlI, 12.5f))) {
            n = 5.0f;
            "".length();
            if ((0xC2 ^ 0xC6) == " ".length()) {
                return;
            }
        }
        else {
            n = 180.0f / (float)Math.ceil(lllllllllllllIIIllllIllllIIIlIlI / 2.5);
        }
        final float lllllllllllllIIIllllIllllIIIIlIl = n;
        if (lllIIIllIIlIIlI(this.lineCaps ? 1 : 0)) {
            final float lllllllllllllIIIllllIllllIIlIllI = lllllllllllllIIIllllIllllIIIIIll[QuadBasedLineStripRenderer.lIlIIIlIlllIll[1]] - lllllllllllllIIIllllIllllIIIIIll[QuadBasedLineStripRenderer.lIlIIIlIlllIll[0]];
            final float lllllllllllllIIIllllIllllIIlIlIl = lllllllllllllIIIllllIllllIIIIIll[QuadBasedLineStripRenderer.lIlIIIlIlllIll[4]] - lllllllllllllIIIllllIllllIIIIIll[QuadBasedLineStripRenderer.lIlIIIlIlllIll[3]];
            final float lllllllllllllIIIllllIllllIIlIlII = (float)Math.toDegrees(Math.atan2(lllllllllllllIIIllllIllllIIlIlIl, lllllllllllllIIIllllIllllIIlIllI)) + 90.0f;
            if (!lllIIIllIIIllll(lllIIIllIIlIIll(lllllllllllllIIIllllIllllIIlIllI, 0.0f)) || lllIIIllIIlIIlI(lllIIIllIIlIIll(lllllllllllllIIIllllIllllIIlIlIl, 0.0f))) {
                this.GL.glBegin(QuadBasedLineStripRenderer.lIlIIIlIlllIll[7]);
                this.bindColor(QuadBasedLineStripRenderer.lIlIIIlIlllIll[0]);
                this.GL.glVertex2f(lllllllllllllIIIllllIllllIIIIIll[QuadBasedLineStripRenderer.lIlIIIlIlllIll[0]], lllllllllllllIIIllllIllllIIIIIll[QuadBasedLineStripRenderer.lIlIIIlIlllIll[3]]);
                int lllllllllllllIIIllllIllllIIlIlll = QuadBasedLineStripRenderer.lIlIIIlIlllIll[0];
                while (lllIIIllIIlIllI(lllIIIllIIlIlII((float)lllllllllllllIIIllllIllllIIlIlll, 180.0f + lllllllllllllIIIllllIllllIIIIlIl))) {
                    final float lllllllllllllIIIllllIllllIIllIII = (float)Math.toRadians(lllllllllllllIIIllllIllllIIlIlII + lllllllllllllIIIllllIllllIIlIlll);
                    this.GL.glVertex2f(lllllllllllllIIIllllIllllIIIIIll[QuadBasedLineStripRenderer.lIlIIIlIlllIll[0]] + (float)(Math.cos(lllllllllllllIIIllllIllllIIllIII) * lllllllllllllIIIllllIllllIIIlIlI), lllllllllllllIIIllllIllllIIIIIll[QuadBasedLineStripRenderer.lIlIIIlIlllIll[3]] + (float)(Math.sin(lllllllllllllIIIllllIllllIIllIII) * lllllllllllllIIIllllIllllIIIlIlI));
                    lllllllllllllIIIllllIllllIIlIlll += (int)lllllllllllllIIIllllIllllIIIIlIl;
                    "".length();
                    if ("   ".length() != "   ".length()) {
                        return;
                    }
                }
                this.GL.glEnd();
            }
        }
        if (lllIIIllIIlIIlI(this.lineCaps ? 1 : 0)) {
            final float lllllllllllllIIIllllIllllIIlIIIl = lllllllllllllIIIllllIllllIIIIIll[lllllllllllllIIIllllIllllIIIIIlI * QuadBasedLineStripRenderer.lIlIIIlIlllIll[1] - QuadBasedLineStripRenderer.lIlIIIlIlllIll[1]] - lllllllllllllIIIllllIllllIIIIIll[lllllllllllllIIIllllIllllIIIIIlI * QuadBasedLineStripRenderer.lIlIIIlIlllIll[1] - QuadBasedLineStripRenderer.lIlIIIlIlllIll[2]];
            final float lllllllllllllIIIllllIllllIIlIIII = lllllllllllllIIIllllIllllIIIIIll[lllllllllllllIIIllllIllllIIIIIlI * QuadBasedLineStripRenderer.lIlIIIlIlllIll[1] - QuadBasedLineStripRenderer.lIlIIIlIlllIll[3]] - lllllllllllllIIIllllIllllIIIIIll[lllllllllllllIIIllllIllllIIIIIlI * QuadBasedLineStripRenderer.lIlIIIlIlllIll[1] - QuadBasedLineStripRenderer.lIlIIIlIlllIll[4]];
            final float lllllllllllllIIIllllIllllIIIllll = (float)Math.toDegrees(Math.atan2(lllllllllllllIIIllllIllllIIlIIII, lllllllllllllIIIllllIllllIIlIIIl)) - 90.0f;
            if (!lllIIIllIIIllll(lllIIIllIIlIIll(lllllllllllllIIIllllIllllIIlIIIl, 0.0f)) || lllIIIllIIlIIlI(lllIIIllIIlIIll(lllllllllllllIIIllllIllllIIlIIII, 0.0f))) {
                this.GL.glBegin(QuadBasedLineStripRenderer.lIlIIIlIlllIll[7]);
                this.bindColor(lllllllllllllIIIllllIllllIIIIIlI - QuadBasedLineStripRenderer.lIlIIIlIlllIll[3]);
                this.GL.glVertex2f(lllllllllllllIIIllllIllllIIIIIll[lllllllllllllIIIllllIllllIIIIIlI * QuadBasedLineStripRenderer.lIlIIIlIlllIll[1] - QuadBasedLineStripRenderer.lIlIIIlIlllIll[1]], lllllllllllllIIIllllIllllIIIIIll[lllllllllllllIIIllllIllllIIIIIlI * QuadBasedLineStripRenderer.lIlIIIlIlllIll[1] - QuadBasedLineStripRenderer.lIlIIIlIlllIll[3]]);
                int lllllllllllllIIIllllIllllIIlIIlI = QuadBasedLineStripRenderer.lIlIIIlIlllIll[0];
                while (lllIIIllIIlIllI(lllIIIllIIlIlII((float)lllllllllllllIIIllllIllllIIlIIlI, 180.0f + lllllllllllllIIIllllIllllIIIIlIl))) {
                    final float lllllllllllllIIIllllIllllIIlIIll = (float)Math.toRadians(lllllllllllllIIIllllIllllIIIllll + lllllllllllllIIIllllIllllIIlIIlI);
                    this.GL.glVertex2f(lllllllllllllIIIllllIllllIIIIIll[lllllllllllllIIIllllIllllIIIIIlI * QuadBasedLineStripRenderer.lIlIIIlIlllIll[1] - QuadBasedLineStripRenderer.lIlIIIlIlllIll[1]] + (float)(Math.cos(lllllllllllllIIIllllIllllIIlIIll) * lllllllllllllIIIllllIllllIIIlIlI), lllllllllllllIIIllllIllllIIIIIll[lllllllllllllIIIllllIllllIIIIIlI * QuadBasedLineStripRenderer.lIlIIIlIlllIll[1] - QuadBasedLineStripRenderer.lIlIIIlIlllIll[3]] + (float)(Math.sin(lllllllllllllIIIllllIllllIIlIIll) * lllllllllllllIIIllllIllllIIIlIlI));
                    lllllllllllllIIIllllIllllIIlIIlI += (int)lllllllllllllIIIllllIllllIIIIlIl;
                    "".length();
                    if ((0x9D ^ 0x99) <= 0) {
                        return;
                    }
                }
                this.GL.glEnd();
            }
        }
    }
    
    public boolean applyGLLineFixes() {
        if (lllIIIllIIIllll(lllIIIllIIllIlI(this.width, 1.0f))) {
            return this.def.applyGLLineFixes();
        }
        return this.def.applyGLLineFixes();
    }
    
    public void renderLines(final float[] lllllllllllllIIIllllIlllllIIIIlI, final int lllllllllllllIIIllllIlllllIIIIIl) {
        if (lllIIIllIIlIIlI(this.antialias ? 1 : 0)) {
            this.GL.glEnable(QuadBasedLineStripRenderer.lIlIIIlIlllIll[5]);
            this.renderLinesImpl(lllllllllllllIIIllllIlllllIIIIlI, lllllllllllllIIIllllIlllllIIIIIl, this.width + 1.0f);
        }
        this.GL.glDisable(QuadBasedLineStripRenderer.lIlIIIlIlllIll[5]);
        this.renderLinesImpl(lllllllllllllIIIllllIlllllIIIIlI, lllllllllllllIIIllllIlllllIIIIIl, this.width);
        if (lllIIIllIIlIIlI(this.antialias ? 1 : 0)) {
            this.GL.glEnable(QuadBasedLineStripRenderer.lIlIIIlIlllIll[5]);
        }
    }
    
    private static boolean lllIIIllIIlIllI(final int lllllllllllllIIIllllIlllIlIIlIII) {
        return lllllllllllllIIIllllIlllIlIIlIII < 0;
    }
    
    private void bindColor(final int lllllllllllllIIIllllIlllIllIlIlI) {
        if (lllIIIllIIlIlIl(lllllllllllllIIIllllIlllIllIlIlI, this.cpt)) {
            if (lllIIIllIIlIIlI(this.renderHalf ? 1 : 0)) {
                this.GL.glColor4f(this.colours[lllllllllllllIIIllllIlllIllIlIlI * QuadBasedLineStripRenderer.lIlIIIlIlllIll[2]] * 0.5f, this.colours[lllllllllllllIIIllllIlllIllIlIlI * QuadBasedLineStripRenderer.lIlIIIlIlllIll[2] + QuadBasedLineStripRenderer.lIlIIIlIlllIll[3]] * 0.5f, this.colours[lllllllllllllIIIllllIlllIllIlIlI * QuadBasedLineStripRenderer.lIlIIIlIlllIll[2] + QuadBasedLineStripRenderer.lIlIIIlIlllIll[1]] * 0.5f, this.colours[lllllllllllllIIIllllIlllIllIlIlI * QuadBasedLineStripRenderer.lIlIIIlIlllIll[2] + QuadBasedLineStripRenderer.lIlIIIlIlllIll[4]] * 0.5f);
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                this.GL.glColor4f(this.colours[lllllllllllllIIIllllIlllIllIlIlI * QuadBasedLineStripRenderer.lIlIIIlIlllIll[2]], this.colours[lllllllllllllIIIllllIlllIllIlIlI * QuadBasedLineStripRenderer.lIlIIIlIlllIll[2] + QuadBasedLineStripRenderer.lIlIIIlIlllIll[3]], this.colours[lllllllllllllIIIllllIlllIllIlIlI * QuadBasedLineStripRenderer.lIlIIIlIlllIll[2] + QuadBasedLineStripRenderer.lIlIIIlIlllIll[1]], this.colours[lllllllllllllIIIllllIlllIllIlIlI * QuadBasedLineStripRenderer.lIlIIIlIlllIll[2] + QuadBasedLineStripRenderer.lIlIIIlIlllIll[4]]);
            }
        }
    }
    
    private static boolean lllIIIllIIllIII(final int lllllllllllllIIIllllIlllIlIIIllI) {
        return lllllllllllllIIIllllIlllIlIIIllI <= 0;
    }
}
