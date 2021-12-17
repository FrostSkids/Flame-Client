// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import java.io.IOException;
import org.newdawn.slick.particles.ParticleIO;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import org.newdawn.slick.particles.ConfigurableEmitter;
import org.newdawn.slick.Graphics;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.particles.ParticleSystem;
import org.newdawn.slick.Image;
import org.newdawn.slick.BasicGame;

public class PedigreeTest extends BasicGame
{
    private /* synthetic */ float ry;
    private static final /* synthetic */ int[] llIllIllIIlIll;
    private /* synthetic */ Image image;
    private /* synthetic */ ParticleSystem trail;
    private /* synthetic */ ParticleSystem fire;
    private static final /* synthetic */ String[] llIllIllIIlIIl;
    private /* synthetic */ float rx;
    private /* synthetic */ GameContainer container;
    
    @Override
    public void update(final GameContainer llllllllllllIllIIllIIlIlllIlIIII, final int llllllllllllIllIIllIIlIlllIIllll) {
        this.fire.update(llllllllllllIllIIllIIlIlllIIllll);
        this.trail.update(llllllllllllIllIIllIIlIlllIIllll);
        this.ry -= llllllllllllIllIIllIIlIlllIIllll * 0.25f;
        if (lIIllIIIIIlllIII(lIIllIIIIIllIlll(this.ry, -100.0f))) {
            this.spawnRocket();
        }
    }
    
    public static void main(final String[] llllllllllllIllIIllIIlIllIlllIlI) {
        try {
            final AppGameContainer llllllllllllIllIIllIIlIllIllllII = new AppGameContainer(new PedigreeTest());
            llllllllllllIllIIllIIlIllIllllII.setDisplayMode(PedigreeTest.llIllIllIIlIll[7], PedigreeTest.llIllIllIIlIll[8], (boolean)(PedigreeTest.llIllIllIIlIll[0] != 0));
            llllllllllllIllIIllIIlIllIllllII.start();
            "".length();
            if (-(0x5 ^ 0x0) >= 0) {
                return;
            }
        }
        catch (SlickException llllllllllllIllIIllIIlIllIlllIll) {
            llllllllllllIllIIllIIlIllIlllIll.printStackTrace();
        }
    }
    
    static {
        lIIllIIIIIllIllI();
        lIIllIIIIIllIlII();
    }
    
    private static void lIIllIIIIIllIllI() {
        (llIllIllIIlIll = new int[10])[0] = ((96 + 126 - 55 + 14 ^ 150 + 68 - 134 + 101) & (162 + 27 - 147 + 128 ^ 90 + 60 - 69 + 85 ^ -" ".length()));
        PedigreeTest.llIllIllIIlIll[1] = " ".length();
        PedigreeTest.llIllIllIIlIll[2] = "  ".length();
        PedigreeTest.llIllIllIIlIll[3] = "   ".length();
        PedigreeTest.llIllIllIIlIll[4] = (0x3A ^ 0x3E);
        PedigreeTest.llIllIllIIlIll[5] = (-(0xFFFFEF5B & 0x54AF) & (0xFFFFEDFB & 0x579E));
        PedigreeTest.llIllIllIIlIll[6] = (0xFFFFBDBE & 0x436D);
        PedigreeTest.llIllIllIIlIll[7] = (-(0xFFFFFDCB & 0x4EFC) & (0xFFFFCFF7 & 0x7FEF));
        PedigreeTest.llIllIllIIlIll[8] = (-(0xFFFFBFD3 & 0x4DAE) & (0xFFFF8FF9 & 0x7FDF));
        PedigreeTest.llIllIllIIlIll[9] = (0xD ^ 0x8);
    }
    
    public PedigreeTest() {
        super(PedigreeTest.llIllIllIIlIIl[PedigreeTest.llIllIllIIlIll[0]]);
        this.ry = 900.0f;
    }
    
    private static String lIIllIIIIIllIIll(String llllllllllllIllIIllIIlIllIlIIIlI, final String llllllllllllIllIIllIIlIllIlIIIIl) {
        llllllllllllIllIIllIIlIllIlIIIlI = new String(Base64.getDecoder().decode(llllllllllllIllIIllIIlIllIlIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIllIIlIllIlIIlIl = new StringBuilder();
        final char[] llllllllllllIllIIllIIlIllIlIIlII = llllllllllllIllIIllIIlIllIlIIIIl.toCharArray();
        int llllllllllllIllIIllIIlIllIlIIIll = PedigreeTest.llIllIllIIlIll[0];
        final float llllllllllllIllIIllIIlIllIIlllIl = (Object)llllllllllllIllIIllIIlIllIlIIIlI.toCharArray();
        final double llllllllllllIllIIllIIlIllIIlllII = llllllllllllIllIIllIIlIllIIlllIl.length;
        long llllllllllllIllIIllIIlIllIIllIll = PedigreeTest.llIllIllIIlIll[0];
        while (lIIllIIIIIlllIIl((int)llllllllllllIllIIllIIlIllIIllIll, (int)llllllllllllIllIIllIIlIllIIlllII)) {
            final char llllllllllllIllIIllIIlIllIlIlIII = llllllllllllIllIIllIIlIllIIlllIl[llllllllllllIllIIllIIlIllIIllIll];
            llllllllllllIllIIllIIlIllIlIIlIl.append((char)(llllllllllllIllIIllIIlIllIlIlIII ^ llllllllllllIllIIllIIlIllIlIIlII[llllllllllllIllIIllIIlIllIlIIIll % llllllllllllIllIIllIIlIllIlIIlII.length]));
            "".length();
            ++llllllllllllIllIIllIIlIllIlIIIll;
            ++llllllllllllIllIIllIIlIllIIllIll;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIllIIlIllIlIIlIl);
    }
    
    private static boolean lIIllIIIIIlllIII(final int llllllllllllIllIIllIIlIllIIIIIll) {
        return llllllllllllIllIIllIIlIllIIIIIll < 0;
    }
    
    @Override
    public void keyPressed(final int llllllllllllIllIIllIIlIllIllIlIl, final char llllllllllllIllIIllIIlIllIllIlII) {
        if (lIIllIIIIIlllIlI(llllllllllllIllIIllIIlIllIllIlIl, PedigreeTest.llIllIllIIlIll[1])) {
            this.container.exit();
        }
    }
    
    private static int lIIllIIIIIllIlll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public void render(final GameContainer llllllllllllIllIIllIIlIlllIlIlll, final Graphics llllllllllllIllIIllIIlIlllIlIllI) {
        ((ConfigurableEmitter)this.trail.getEmitter(PedigreeTest.llIllIllIIlIll[0])).setPosition(this.rx + 14.0f, this.ry + 35.0f);
        this.trail.render();
        this.image.draw((float)(int)this.rx, (float)(int)this.ry);
        llllllllllllIllIIllIIlIlllIlIllI.translate(400.0f, 300.0f);
        this.fire.render();
    }
    
    private static boolean lIIllIIIIIlllIlI(final int llllllllllllIllIIllIIlIllIIIlIlI, final int llllllllllllIllIIllIIlIllIIIlIIl) {
        return llllllllllllIllIIllIIlIllIIIlIlI == llllllllllllIllIIllIIlIllIIIlIIl;
    }
    
    @Override
    public void mousePressed(final int llllllllllllIllIIllIIlIlllIIIIIl, final int llllllllllllIllIIllIIlIlllIIIlII, final int llllllllllllIllIIllIIlIlllIIIIll) {
        super.mousePressed(llllllllllllIllIIllIIlIlllIIIIIl, llllllllllllIllIIllIIlIlllIIIlII, llllllllllllIllIIllIIlIlllIIIIll);
        int llllllllllllIllIIllIIlIlllIIIlll = PedigreeTest.llIllIllIIlIll[0];
        while (lIIllIIIIIlllIIl(llllllllllllIllIIllIIlIlllIIIlll, this.fire.getEmitterCount())) {
            ((ConfigurableEmitter)this.fire.getEmitter(llllllllllllIllIIllIIlIlllIIIlll)).setPosition((float)(llllllllllllIllIIllIIlIlllIIIlII - PedigreeTest.llIllIllIIlIll[5]), (float)(llllllllllllIllIIllIIlIlllIIIIll - PedigreeTest.llIllIllIIlIll[6]), (boolean)(PedigreeTest.llIllIllIIlIll[1] != 0));
            ++llllllllllllIllIIllIIlIlllIIIlll;
            "".length();
            if ((104 + 16 - 2 + 11 ^ 87 + 52 - 28 + 22) < 0) {
                return;
            }
        }
    }
    
    private void spawnRocket() {
        this.ry = 700.0f;
        this.rx = (float)(Math.random() * 600.0 + 100.0);
    }
    
    private static String lIIllIIIIIllIIlI(final String llllllllllllIllIIllIIlIllIIlIIlI, final String llllllllllllIllIIllIIlIllIIlIIIl) {
        try {
            final SecretKeySpec llllllllllllIllIIllIIlIllIIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIllIIlIllIIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIllIIlIllIIlIlII = Cipher.getInstance("Blowfish");
            llllllllllllIllIIllIIlIllIIlIlII.init(PedigreeTest.llIllIllIIlIll[2], llllllllllllIllIIllIIlIllIIlIlIl);
            return new String(llllllllllllIllIIllIIlIllIIlIlII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIllIIlIllIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIllIIlIllIIlIIll) {
            llllllllllllIllIIllIIlIllIIlIIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void init(final GameContainer llllllllllllIllIIllIIlIllllIIIIl) throws SlickException {
        this.container = llllllllllllIllIIllIIlIllllIIIIl;
        try {
            this.fire = ParticleIO.loadConfiguredSystem(PedigreeTest.llIllIllIIlIIl[PedigreeTest.llIllIllIIlIll[1]]);
            this.trail = ParticleIO.loadConfiguredSystem(PedigreeTest.llIllIllIIlIIl[PedigreeTest.llIllIllIIlIll[2]]);
            "".length();
            if (" ".length() < " ".length()) {
                return;
            }
        }
        catch (IOException llllllllllllIllIIllIIlIllllIIIll) {
            throw new SlickException(PedigreeTest.llIllIllIIlIIl[PedigreeTest.llIllIllIIlIll[3]], llllllllllllIllIIllIIlIllllIIIll);
        }
        this.image = new Image(PedigreeTest.llIllIllIIlIIl[PedigreeTest.llIllIllIIlIll[4]]);
        this.spawnRocket();
    }
    
    private static boolean lIIllIIIIIlllIIl(final int llllllllllllIllIIllIIlIllIIIIllI, final int llllllllllllIllIIllIIlIllIIIIlIl) {
        return llllllllllllIllIIllIIlIllIIIIllI < llllllllllllIllIIllIIlIllIIIIlIl;
    }
    
    private static void lIIllIIIIIllIlII() {
        (llIllIllIIlIIl = new String[PedigreeTest.llIllIllIIlIll[9]])[PedigreeTest.llIllIllIIlIll[0]] = lIIllIIIIIllIIlI("7KIyWXZSEO8sTH4lIn6pJw==", "diiGC");
        PedigreeTest.llIllIllIIlIIl[PedigreeTest.llIllIllIIlIll[1]] = lIIllIIIIIllIIll("LA8xPwA5HiNkFyEZNi4JdhIvJw==", "XjBKd");
        PedigreeTest.llIllIllIIlIIl[PedigreeTest.llIllIllIIlIll[2]] = lIIllIIIIIllIIll("JCQhBgUxNTNdEj0uORcVIiA7Hk8oLD4=", "PARra");
        PedigreeTest.llIllIllIIlIIl[PedigreeTest.llIllIllIIlIll[3]] = lIIllIIIIIllIIlI("cITQxE1cDqAuoks6AcLuzQDbG75QSa24BIjpjT5MrcQ=", "dKScP");
        PedigreeTest.llIllIllIIlIIl[PedigreeTest.llIllIllIIlIll[4]] = lIIllIIIIIllIIlI("X5ejPWysGJ6+7EOwf9rZNUPQsHzhn3rB", "NONKu");
    }
}
