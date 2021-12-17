// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.particles.effects;

import org.newdawn.slick.Image;
import org.newdawn.slick.particles.Particle;
import org.newdawn.slick.particles.ParticleSystem;
import org.newdawn.slick.particles.ParticleEmitter;

public class FireEmitter implements ParticleEmitter
{
    private /* synthetic */ int timer;
    private /* synthetic */ float size;
    private /* synthetic */ int interval;
    private /* synthetic */ int x;
    private static final /* synthetic */ int[] llIIlIlIIIIlIl;
    private /* synthetic */ int y;
    
    public FireEmitter(final int llllllllllllIlllIIlIIIIlIlllIlIl, final int llllllllllllIlllIIlIIIIlIlllIlll) {
        this.interval = FireEmitter.llIIlIlIIIIlIl[0];
        this.size = 40.0f;
        this.x = llllllllllllIlllIIlIIIIlIlllIlIl;
        this.y = llllllllllllIlllIIlIIIIlIlllIlll;
    }
    
    private static boolean lIIIllIIllIllIIl(final int llllllllllllIlllIIlIIIIlIIlllIll) {
        return llllllllllllIlllIIlIIIIlIIlllIll > 0;
    }
    
    public void wrapUp() {
    }
    
    public boolean completed() {
        return FireEmitter.llIIlIlIIIIlIl[2] != 0;
    }
    
    public void update(final ParticleSystem llllllllllllIlllIIlIIIIlIlIlllIl, final int llllllllllllIlllIIlIIIIlIlIlllII) {
        this.timer -= llllllllllllIlllIIlIIIIlIlIlllII;
        if (lIIIllIIllIlIlll(this.timer)) {
            this.timer = this.interval;
            final Particle llllllllllllIlllIIlIIIIlIllIIIIl = llllllllllllIlllIIlIIIIlIlIlllIl.getNewParticle(this, 1000.0f);
            llllllllllllIlllIIlIIIIlIllIIIIl.setColor(1.0f, 1.0f, 1.0f, 0.5f);
            llllllllllllIlllIIlIIIIlIllIIIIl.setPosition((float)this.x, (float)this.y);
            llllllllllllIlllIIlIIIIlIllIIIIl.setSize(this.size);
            final float llllllllllllIlllIIlIIIIlIllIIIII = (float)(-0.019999999552965164 + Math.random() * 0.03999999910593033);
            final float llllllllllllIlllIIlIIIIlIlIlllll = (float)(-(Math.random() * 0.15000000596046448));
            llllllllllllIlllIIlIIIIlIllIIIIl.setVelocity(llllllllllllIlllIIlIIIIlIllIIIII, llllllllllllIlllIIlIIIIlIlIlllll, 1.1f);
        }
    }
    
    public void setEnabled(final boolean llllllllllllIlllIIlIIIIlIlIIIlll) {
    }
    
    public Image getImage() {
        return null;
    }
    
    public FireEmitter() {
        this.interval = FireEmitter.llIIlIlIIIIlIl[0];
        this.size = 40.0f;
    }
    
    public void updateParticle(final Particle llllllllllllIlllIIlIIIIlIlIlIIII, final int llllllllllllIlllIIlIIIIlIlIIlIll) {
        if (lIIIllIIllIllIIl(lIIIllIIllIllIII(llllllllllllIlllIIlIIIIlIlIlIIII.getLife(), 600.0f))) {
            llllllllllllIlllIIlIIIIlIlIlIIII.adjustSize(0.07f * llllllllllllIlllIIlIIIIlIlIIlIll);
            "".length();
            if ("   ".length() == 0) {
                return;
            }
        }
        else {
            llllllllllllIlllIIlIIIIlIlIlIIII.adjustSize(-0.04f * llllllllllllIlllIIlIIIIlIlIIlIll * (this.size / 40.0f));
        }
        final float llllllllllllIlllIIlIIIIlIlIIlllI = 0.002f * llllllllllllIlllIIlIIIIlIlIIlIll;
        llllllllllllIlllIIlIIIIlIlIlIIII.adjustColor(0.0f, -llllllllllllIlllIIlIIIIlIlIIlllI / 2.0f, -llllllllllllIlllIIlIIIIlIlIIlllI * 2.0f, -llllllllllllIlllIIlIIIIlIlIIlllI / 4.0f);
    }
    
    public boolean usePoints(final ParticleSystem llllllllllllIlllIIlIIIIlIlIIIIlI) {
        return FireEmitter.llIIlIlIIIIlIl[2] != 0;
    }
    
    private static void lIIIllIIllIlIllI() {
        (llIIlIlIIIIlIl = new int[3])[0] = (59 + 74 - 112 + 226 ^ 58 + 75 - 5 + 69);
        FireEmitter.llIIlIlIIIIlIl[1] = " ".length();
        FireEmitter.llIIlIlIIIIlIl[2] = ((0x1E ^ 0x24 ^ (0xDF ^ 0xBF)) & (" ".length() ^ (0xD7 ^ 0x8C) ^ -" ".length()));
    }
    
    public boolean isOriented() {
        return FireEmitter.llIIlIlIIIIlIl[2] != 0;
    }
    
    public FireEmitter(final int llllllllllllIlllIIlIIIIlIllIlIlI, final int llllllllllllIlllIIlIIIIlIllIlIIl, final float llllllllllllIlllIIlIIIIlIllIllII) {
        this.interval = FireEmitter.llIIlIlIIIIlIl[0];
        this.size = 40.0f;
        this.x = llllllllllllIlllIIlIIIIlIllIlIlI;
        this.y = llllllllllllIlllIIlIIIIlIllIlIIl;
        this.size = llllllllllllIlllIIlIIIIlIllIllII;
    }
    
    private static int lIIIllIIllIllIII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public void resetState() {
    }
    
    public boolean isEnabled() {
        return FireEmitter.llIIlIlIIIIlIl[1] != 0;
    }
    
    private static boolean lIIIllIIllIlIlll(final int llllllllllllIlllIIlIIIIlIIllllIl) {
        return llllllllllllIlllIIlIIIIlIIllllIl <= 0;
    }
    
    public boolean useAdditive() {
        return FireEmitter.llIIlIlIIIIlIl[2] != 0;
    }
    
    static {
        lIIIllIIllIlIllI();
    }
}
