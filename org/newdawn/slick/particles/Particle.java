// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.particles;

import org.newdawn.slick.opengl.TextureImpl;
import org.newdawn.slick.opengl.renderer.Renderer;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.newdawn.slick.Color;
import org.newdawn.slick.opengl.renderer.SGL;
import org.newdawn.slick.Image;

public class Particle
{
    protected /* synthetic */ float x;
    private static final /* synthetic */ String[] lIIllllIIIlIII;
    private /* synthetic */ ParticleEmitter emitter;
    protected /* synthetic */ float size;
    private /* synthetic */ ParticleSystem engine;
    protected /* synthetic */ int type;
    private static final /* synthetic */ int[] lIIllllIIIlIIl;
    protected /* synthetic */ Image image;
    protected /* synthetic */ float vely;
    protected /* synthetic */ float velx;
    protected static /* synthetic */ SGL GL;
    protected /* synthetic */ int usePoints;
    protected /* synthetic */ float originalLife;
    protected /* synthetic */ boolean oriented;
    protected /* synthetic */ float y;
    protected /* synthetic */ float life;
    protected /* synthetic */ float scaleY;
    protected /* synthetic */ Color color;
    
    private static int llIlllIlIIlIlll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public void setUsePoint(final int lllllllllllllIIlIIllIIIIIlllIIII) {
        this.usePoints = lllllllllllllIIlIIllIIIIIlllIIII;
    }
    
    public float getSize() {
        return this.size;
    }
    
    public void adjustLife(final float lllllllllllllIIlIIllIIIIIlIlIlIl) {
        this.life += lllllllllllllIIlIIllIIIIIlIlIlIl;
    }
    
    private static boolean llIlllIlIIllllI(final int lllllllllllllIIlIIlIlllllIllIlIl, final int lllllllllllllIIlIIlIlllllIllIlII) {
        return lllllllllllllIIlIIlIlllllIllIlIl < lllllllllllllIIlIIlIlllllIllIlII;
    }
    
    private static boolean llIlllIlIIllIII(final int lllllllllllllIIlIIlIlllllIlIlllI) {
        return lllllllllllllIIlIIlIlllllIlIlllI != 0;
    }
    
    public void setVelocity(final float lllllllllllllIIlIIllIIIIIIIlllIl, final float lllllllllllllIIlIIllIIIIIIIlllll) {
        this.setVelocity(lllllllllllllIIlIIllIIIIIIIlllIl, lllllllllllllIIlIIllIIIIIIIlllll, 1.0f);
    }
    
    public float getLife() {
        return this.life;
    }
    
    public void adjustColor(final float lllllllllllllIIlIIllIIIIIIIIIlll, final float lllllllllllllIIlIIllIIIIIIIIIllI, final float lllllllllllllIIlIIllIIIIIIIIlIlI, final float lllllllllllllIIlIIllIIIIIIIIIlII) {
        if (llIlllIlIIlllIl(this.color, Color.white)) {
            this.color = new Color(1.0f, 1.0f, 1.0f, 1.0f);
        }
        final Color color = this.color;
        color.r += lllllllllllllIIlIIllIIIIIIIIIlll;
        final Color color2 = this.color;
        color2.g += lllllllllllllIIlIIllIIIIIIIIIllI;
        final Color color3 = this.color;
        color3.b += lllllllllllllIIlIIllIIIIIIIIlIlI;
        final Color color4 = this.color;
        color4.a += lllllllllllllIIlIIllIIIIIIIIIlII;
    }
    
    public void adjustPosition(final float lllllllllllllIIlIIllIIIIIIIlIlII, final float lllllllllllllIIlIIllIIIIIIIlIllI) {
        this.x += lllllllllllllIIlIIllIIIIIIIlIlII;
        this.y += lllllllllllllIIlIIllIIIIIIIlIllI;
    }
    
    private static boolean llIlllIlIIllIll(final int lllllllllllllIIlIIlIlllllIlIllII) {
        return lllllllllllllIIlIIlIlllllIlIllII == 0;
    }
    
    public void setSize(final float lllllllllllllIIlIIllIIIIIllIIlll) {
        this.size = lllllllllllllIIlIIllIIIIIllIIlll;
    }
    
    public float getX() {
        return this.x;
    }
    
    public void setPosition(final float lllllllllllllIIlIIllIIIIIIlllIll, final float lllllllllllllIIlIIllIIIIIIllllIl) {
        this.x = lllllllllllllIIlIIllIIIIIIlllIll;
        this.y = lllllllllllllIIlIIllIIIIIIllllIl;
    }
    
    public Color getColor() {
        return this.color;
    }
    
    private static boolean llIlllIlIIllIlI(final int lllllllllllllIIlIIlIlllllIlllIIl, final int lllllllllllllIIlIIlIlllllIlllIII) {
        return lllllllllllllIIlIIlIlllllIlllIIl == lllllllllllllIIlIIlIlllllIlllIII;
    }
    
    private static String llIlllIlIIlIIlI(String lllllllllllllIIlIIlIllllllIIIlII, final String lllllllllllllIIlIIlIllllllIIIIll) {
        lllllllllllllIIlIIlIllllllIIIlII = new String(Base64.getDecoder().decode(lllllllllllllIIlIIlIllllllIIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIIlIllllllIIIlll = new StringBuilder();
        final char[] lllllllllllllIIlIIlIllllllIIIllI = lllllllllllllIIlIIlIllllllIIIIll.toCharArray();
        int lllllllllllllIIlIIlIllllllIIIlIl = Particle.lIIllllIIIlIIl[1];
        final byte lllllllllllllIIlIIlIlllllIllllll = (Object)lllllllllllllIIlIIlIllllllIIIlII.toCharArray();
        final long lllllllllllllIIlIIlIlllllIlllllI = lllllllllllllIIlIIlIlllllIllllll.length;
        long lllllllllllllIIlIIlIlllllIllllIl = Particle.lIIllllIIIlIIl[1];
        while (llIlllIlIIllllI((int)lllllllllllllIIlIIlIlllllIllllIl, (int)lllllllllllllIIlIIlIlllllIlllllI)) {
            final char lllllllllllllIIlIIlIllllllIIlIlI = lllllllllllllIIlIIlIlllllIllllll[lllllllllllllIIlIIlIlllllIllllIl];
            lllllllllllllIIlIIlIllllllIIIlll.append((char)(lllllllllllllIIlIIlIllllllIIlIlI ^ lllllllllllllIIlIIlIllllllIIIllI[lllllllllllllIIlIIlIllllllIIIlIl % lllllllllllllIIlIIlIllllllIIIllI.length]));
            "".length();
            ++lllllllllllllIIlIIlIllllllIIIlIl;
            ++lllllllllllllIIlIIlIlllllIllllIl;
            "".length();
            if (-"   ".length() > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIIlIllllllIIIlll);
    }
    
    public void setLife(final float lllllllllllllIIlIIllIIIIIlIlllIl) {
        this.life = lllllllllllllIIlIIllIIIIIlIlllIl;
    }
    
    public void init(final ParticleEmitter lllllllllllllIIlIIllIIIIIlllllIl, final float lllllllllllllIIlIIllIIIIIlllllll) {
        this.x = 0.0f;
        this.emitter = lllllllllllllIIlIIllIIIIIlllllIl;
        this.y = 0.0f;
        this.velx = 0.0f;
        this.vely = 0.0f;
        this.size = 10.0f;
        this.type = Particle.lIIllllIIIlIIl[1];
        this.life = lllllllllllllIIlIIllIIIIIlllllll;
        this.originalLife = lllllllllllllIIlIIllIIIIIlllllll;
        this.oriented = (Particle.lIIllllIIIlIIl[1] != 0);
        this.scaleY = 1.0f;
    }
    
    private static void llIlllIlIIlIlII() {
        (lIIllllIIIlIIl = new int[5])[0] = " ".length();
        Particle.lIIllllIIIlIIl[1] = ((0xC8 ^ 0x98 ^ " ".length()) & (0xA8 ^ 0x8A ^ (0x75 ^ 0x6) ^ -" ".length()));
        Particle.lIIllllIIIlIIl[2] = "  ".length();
        Particle.lIIllllIIIlIIl[3] = (-(0xFFFFD7F9 & 0x7CCF) & (0xFFFFDFFD & 0x7FDA));
        Particle.lIIllllIIIlIIl[4] = "   ".length();
    }
    
    public void adjustColor(final int lllllllllllllIIlIIlIllllllllllIl, final int lllllllllllllIIlIIlIllllllllllII, final int lllllllllllllIIlIIlIlllllllllIll, final int lllllllllllllIIlIIlIlllllllllIlI) {
        if (llIlllIlIIlllIl(this.color, Color.white)) {
            this.color = new Color(1.0f, 1.0f, 1.0f, 1.0f);
        }
        final Color color = this.color;
        color.r += lllllllllllllIIlIIlIllllllllllIl / 255.0f;
        final Color color2 = this.color;
        color2.g += lllllllllllllIIlIIlIllllllllllII / 255.0f;
        final Color color3 = this.color;
        color3.b += lllllllllllllIIlIIlIlllllllllIll / 255.0f;
        final Color color4 = this.color;
        color4.a += lllllllllllllIIlIIlIlllllllllIlI / 255.0f;
    }
    
    public void setType(final int lllllllllllllIIlIIllIIIIIllllIII) {
        this.type = lllllllllllllIIlIIllIIIIIllllIII;
    }
    
    public float getY() {
        return this.y;
    }
    
    public void setColor(final float lllllllllllllIIlIIllIIIIIlIIlIll, final float lllllllllllllIIlIIllIIIIIlIIlIlI, final float lllllllllllllIIlIIllIIIIIlIIlIIl, final float lllllllllllllIIlIIllIIIIIlIIIIll) {
        if (llIlllIlIIlllIl(this.color, Color.white)) {
            this.color = new Color(lllllllllllllIIlIIllIIIIIlIIlIll, lllllllllllllIIlIIllIIIIIlIIlIlI, lllllllllllllIIlIIllIIIIIlIIlIIl, lllllllllllllIIlIIllIIIIIlIIIIll);
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            this.color.r = lllllllllllllIIlIIllIIIIIlIIlIll;
            this.color.g = lllllllllllllIIlIIllIIIIIlIIlIlI;
            this.color.b = lllllllllllllIIlIIllIIIIIlIIlIIl;
            this.color.a = lllllllllllllIIlIIllIIIIIlIIIIll;
        }
    }
    
    private static boolean llIlllIlIIlIllI(final int lllllllllllllIIlIIlIlllllIlIlIlI) {
        return lllllllllllllIIlIIlIlllllIlIlIlI > 0;
    }
    
    static {
        llIlllIlIIlIlII();
        llIlllIlIIlIIll();
        USE_QUADS = Particle.lIIllllIIIlIIl[4];
        USE_POINTS = Particle.lIIllllIIIlIIl[2];
        INHERIT_POINTS = Particle.lIIllllIIIlIIl[0];
        Particle.GL = Renderer.get();
    }
    
    public int getType() {
        return this.type;
    }
    
    public ParticleEmitter getEmitter() {
        return this.emitter;
    }
    
    public Particle(final ParticleSystem lllllllllllllIIlIIllIIIIlIllIlIl) {
        this.size = 10.0f;
        this.color = Color.white;
        this.usePoints = Particle.lIIllllIIIlIIl[0];
        this.oriented = (Particle.lIIllllIIIlIIl[1] != 0);
        this.scaleY = 1.0f;
        this.engine = lllllllllllllIIlIIllIIIIlIllIlIl;
    }
    
    public boolean isOriented() {
        return this.oriented;
    }
    
    public void setVelocity(final float lllllllllllllIIlIIllIIIIIIllIIII, final float lllllllllllllIIlIIllIIIIIIlIllll, final float lllllllllllllIIlIIllIIIIIIlIlllI) {
        this.velx = lllllllllllllIIlIIllIIIIIIllIIII * lllllllllllllIIlIIllIIIIIIlIlllI;
        this.vely = lllllllllllllIIlIIllIIIIIIlIllll * lllllllllllllIIlIIllIIIIIIlIlllI;
    }
    
    public void setImage(final Image lllllllllllllIIlIIllIIIIlIIlllII) {
        this.image = lllllllllllllIIlIIllIIIIlIIlllII;
    }
    
    public void kill() {
        this.life = 1.0f;
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder().append(super.toString()).append(Particle.lIIllllIIIlIII[Particle.lIIllllIIIlIIl[1]]).append(this.life));
    }
    
    private static int llIlllIlIIlllII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean llIlllIlIIlllIl(final Object lllllllllllllIIlIIlIlllllIllIIIl, final Object lllllllllllllIIlIIlIlllllIllIIII) {
        return lllllllllllllIIlIIlIlllllIllIIIl == lllllllllllllIIlIIlIlllllIllIIII;
    }
    
    public void move(final float lllllllllllllIIlIIllIIIIlIlIlIlI, final float lllllllllllllIIlIIllIIIIlIlIlIIl) {
        this.x += lllllllllllllIIlIIllIIIIlIlIlIlI;
        this.y += lllllllllllllIIlIIllIIIIlIlIlIIl;
    }
    
    public float getOriginalLife() {
        return this.originalLife;
    }
    
    public boolean inUse() {
        int n;
        if (llIlllIlIIlIllI(llIlllIlIIlIlIl(this.life, 0.0f))) {
            n = Particle.lIIllllIIIlIIl[0];
            "".length();
            if ((0x0 ^ 0x4) <= "   ".length()) {
                return ((0xB8 ^ 0xBC) & ~(0x14 ^ 0x10)) != 0x0;
            }
        }
        else {
            n = Particle.lIIllllIIIlIIl[1];
        }
        return n != 0;
    }
    
    public void setOriented(final boolean lllllllllllllIIlIIlIllllllIlllIl) {
        this.oriented = lllllllllllllIIlIIlIllllllIlllIl;
    }
    
    public void setSpeed(final float lllllllllllllIIlIIllIIIIIIlIIllI) {
        final float lllllllllllllIIlIIllIIIIIIlIlIII = (float)Math.sqrt(this.velx * this.velx + this.vely * this.vely);
        this.velx *= lllllllllllllIIlIIllIIIIIIlIIllI;
        this.vely *= lllllllllllllIIlIIllIIIIIIlIIllI;
        this.velx /= lllllllllllllIIlIIllIIIIIIlIlIII;
        this.vely /= lllllllllllllIIlIIllIIIIIIlIlIII;
    }
    
    public float getScaleY() {
        return this.scaleY;
    }
    
    private static void llIlllIlIIlIIll() {
        (lIIllllIIIlIII = new String[Particle.lIIllllIIIlIIl[0]])[Particle.lIIllllIIIlIIl[1]] = llIlllIlIIlIIlI("SnJB", "jHaZH");
    }
    
    public void render() {
        if ((llIlllIlIIllIII(this.engine.usePoints() ? 1 : 0) && !llIlllIlIIllIIl(this.usePoints, Particle.lIIllllIIIlIIl[0])) || llIlllIlIIllIlI(this.usePoints, Particle.lIIllllIIIlIIl[2])) {
            TextureImpl.bindNone();
            Particle.GL.glEnable(Particle.lIIllllIIIlIIl[3]);
            Particle.GL.glPointSize(this.size / 2.0f);
            this.color.bind();
            Particle.GL.glBegin(Particle.lIIllllIIIlIIl[1]);
            Particle.GL.glVertex2f(this.x, this.y);
            Particle.GL.glEnd();
            "".length();
            if (-" ".length() < -" ".length()) {
                return;
            }
        }
        else if (!llIlllIlIIllIll(this.oriented ? 1 : 0) || llIlllIlIIllIII(llIlllIlIIlIlll(this.scaleY, 1.0f))) {
            Particle.GL.glPushMatrix();
            Particle.GL.glTranslatef(this.x, this.y, 0.0f);
            if (llIlllIlIIllIII(this.oriented ? 1 : 0)) {
                final float lllllllllllllIIlIIllIIIIlIIIlllI = (float)(Math.atan2(this.y, this.x) * 180.0 / 3.141592653589793);
                Particle.GL.glRotatef(lllllllllllllIIlIIllIIIIlIIIlllI, 0.0f, 0.0f, 1.0f);
            }
            Particle.GL.glScalef(1.0f, this.scaleY, 1.0f);
            this.image.draw((float)(int)(-(this.size / 2.0f)), (float)(int)(-(this.size / 2.0f)), (float)(int)this.size, (float)(int)this.size, this.color);
            Particle.GL.glPopMatrix();
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        }
        else {
            this.color.bind();
            this.image.drawEmbedded((float)(int)(this.x - this.size / 2.0f), (float)(int)(this.y - this.size / 2.0f), (float)(int)this.size, (float)(int)this.size);
        }
    }
    
    public void setScaleY(final float lllllllllllllIIlIIlIllllllIlIllI) {
        this.scaleY = lllllllllllllIIlIIlIllllllIlIllI;
    }
    
    public void adjustSize(final float lllllllllllllIIlIIllIIIIIllIIIIl) {
        this.size += lllllllllllllIIlIIllIIIIIllIIIIl;
        this.size = Math.max(0.0f, this.size);
    }
    
    public void update(final int lllllllllllllIIlIIllIIIIlIIIIlIl) {
        this.emitter.updateParticle(this, lllllllllllllIIlIIllIIIIlIIIIlIl);
        this.life -= lllllllllllllIIlIIllIIIIlIIIIlIl;
        if (llIlllIlIIlIllI(llIlllIlIIlllII(this.life, 0.0f))) {
            this.x += lllllllllllllIIlIIllIIIIlIIIIlIl * this.velx;
            this.y += lllllllllllllIIlIIllIIIIlIIIIlIl * this.vely;
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            this.engine.release(this);
        }
    }
    
    private static int llIlllIlIIlIlIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean llIlllIlIIllIIl(final int lllllllllllllIIlIIlIlllllIlIIlll, final int lllllllllllllIIlIIlIlllllIlIIllI) {
        return lllllllllllllIIlIIlIlllllIlIIlll != lllllllllllllIIlIIlIlllllIlIIllI;
    }
    
    public void adjustVelocity(final float lllllllllllllIIlIIlIlllllllIllIl, final float lllllllllllllIIlIIlIlllllllIllll) {
        this.velx += lllllllllllllIIlIIlIlllllllIllIl;
        this.vely += lllllllllllllIIlIIlIlllllllIllll;
    }
}
