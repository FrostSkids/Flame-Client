// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.particles.ParticleEmitter;
import org.newdawn.slick.particles.effects.FireEmitter;
import org.newdawn.slick.Image;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.particles.ParticleSystem;
import org.newdawn.slick.BasicGame;

public class ParticleTest extends BasicGame
{
    private static final /* synthetic */ String[] lllIIIlllIlIlI;
    private /* synthetic */ ParticleSystem system;
    private static final /* synthetic */ int[] lllIIIlllIlIll;
    private /* synthetic */ int mode;
    
    public ParticleTest() {
        super(ParticleTest.lllIIIlllIlIlI[ParticleTest.lllIIIlllIlIll[0]]);
        this.mode = ParticleTest.lllIIIlllIlIll[1];
    }
    
    private static void lIIllllIIlIIlIll() {
        (lllIIIlllIlIlI = new String[ParticleTest.lllIIIlllIlIll[11]])[ParticleTest.lllIIIlllIlIll[0]] = lIIllllIIlIIlIII("OgcQLT4JCgd5Aw8VFg==", "jfbYW");
        ParticleTest.lllIIIlllIlIlI[ParticleTest.lllIIIlllIlIll[2]] = lIIllllIIlIIlIII("HQcdPCYIFg9nMggQGiEhBQdAPCUI", "ibnHB");
        ParticleTest.lllIIIlllIlIlI[ParticleTest.lllIIIlllIlIll[1]] = lIIllllIIlIIlIIl("FlqMhFb8IG5PwnxwbVHR1ok2zZrObPNxUiEqsfqNV5a2zoMcqkzXFw==", "zNrti");
        ParticleTest.lllIIIlllIlIlI[ParticleTest.lllIIIlllIlIll[8]] = lIIllllIIlIIlIlI("QArgFrrg1/cq7RsVk1C1oK6waWkgm1Fv", "InOmb");
    }
    
    private static String lIIllllIIlIIlIlI(final String llllllllllllIlIllllllIlIllIlIlIl, final String llllllllllllIlIllllllIlIllIlIlII) {
        try {
            final SecretKeySpec llllllllllllIlIllllllIlIllIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllllllIlIllIlIlII.getBytes(StandardCharsets.UTF_8)), ParticleTest.lllIIIlllIlIll[12]), "DES");
            final Cipher llllllllllllIlIllllllIlIllIllIIl = Cipher.getInstance("DES");
            llllllllllllIlIllllllIlIllIllIIl.init(ParticleTest.lllIIIlllIlIll[1], llllllllllllIlIllllllIlIllIllIlI);
            return new String(llllllllllllIlIllllllIlIllIllIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllllllIlIllIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllllllIlIllIllIII) {
            llllllllllllIlIllllllIlIllIllIII.printStackTrace();
            return null;
        }
    }
    
    private static String lIIllllIIlIIlIIl(final String llllllllllllIlIllllllIlIlllIIIlI, final String llllllllllllIlIllllllIlIlllIIIll) {
        try {
            final SecretKeySpec llllllllllllIlIllllllIlIlllIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllllllIlIlllIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllllllIlIlllIIllI = Cipher.getInstance("Blowfish");
            llllllllllllIlIllllllIlIlllIIllI.init(ParticleTest.lllIIIlllIlIll[1], llllllllllllIlIllllllIlIlllIIlll);
            return new String(llllllllllllIlIllllllIlIlllIIllI.doFinal(Base64.getDecoder().decode(llllllllllllIlIllllllIlIlllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllllllIlIlllIIlIl) {
            llllllllllllIlIllllllIlIlllIIlIl.printStackTrace();
            return null;
        }
    }
    
    public static void main(final String[] llllllllllllIlIllllllIllIIIIIlIl) {
        try {
            final AppGameContainer llllllllllllIlIllllllIllIIIIIlll = new AppGameContainer(new ParticleTest());
            llllllllllllIlIllllllIllIIIIIlll.setDisplayMode(ParticleTest.lllIIIlllIlIll[10], ParticleTest.lllIIIlllIlIll[6], (boolean)(ParticleTest.lllIIIlllIlIll[0] != 0));
            llllllllllllIlIllllllIllIIIIIlll.start();
            "".length();
            if (-"  ".length() > 0) {
                return;
            }
        }
        catch (SlickException llllllllllllIlIllllllIllIIIIIllI) {
            llllllllllllIlIllllllIllIIIIIllI.printStackTrace();
        }
    }
    
    static {
        lIIllllIIlIIllII();
        lIIllllIIlIIlIll();
    }
    
    @Override
    public void init(final GameContainer llllllllllllIlIllllllIllIIlIIlII) throws SlickException {
        final Image llllllllllllIlIllllllIllIIlIIIll = new Image(ParticleTest.lllIIIlllIlIlI[ParticleTest.lllIIIlllIlIll[2]], (boolean)(ParticleTest.lllIIIlllIlIll[2] != 0));
        this.system = new ParticleSystem(llllllllllllIlIllllllIllIIlIIIll);
        this.system.addEmitter(new FireEmitter(ParticleTest.lllIIIlllIlIll[3], ParticleTest.lllIIIlllIlIll[4], 45.0f));
        this.system.addEmitter(new FireEmitter(ParticleTest.lllIIIlllIlIll[5], ParticleTest.lllIIIlllIlIll[4], 60.0f));
        this.system.addEmitter(new FireEmitter(ParticleTest.lllIIIlllIlIll[6], ParticleTest.lllIIIlllIlIll[4], 30.0f));
    }
    
    @Override
    public void keyPressed(final int llllllllllllIlIllllllIllIIIIlIIl, final char llllllllllllIlIllllllIllIIIIlIll) {
        if (lIIllllIIlIIlllI(llllllllllllIlIllllllIllIIIIlIIl, ParticleTest.lllIIIlllIlIll[2])) {
            System.exit(ParticleTest.lllIIIlllIlIll[0]);
        }
        if (lIIllllIIlIIlllI(llllllllllllIlIllllllIllIIIIlIIl, ParticleTest.lllIIIlllIlIll[9])) {
            int mode;
            if (lIIllllIIlIIlllI(ParticleTest.lllIIIlllIlIll[2], this.mode)) {
                mode = ParticleTest.lllIIIlllIlIll[1];
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                mode = ParticleTest.lllIIIlllIlIll[2];
            }
            this.mode = mode;
            this.system.setBlendingMode(this.mode);
        }
    }
    
    public void render(final GameContainer llllllllllllIlIllllllIllIIIllIll, final Graphics llllllllllllIlIllllllIllIIIllIlI) {
        int llllllllllllIlIllllllIllIIIlllIl = ParticleTest.lllIIIlllIlIll[0];
        while (lIIllllIIlIIllIl(llllllllllllIlIllllllIllIIIlllIl, ParticleTest.lllIIIlllIlIll[7])) {
            llllllllllllIlIllllllIllIIIllIlI.translate(1.0f, 1.0f);
            this.system.render();
            ++llllllllllllIlIllllllIllIIIlllIl;
            "".length();
            if ((0x70 ^ 0x7C ^ (0x68 ^ 0x60)) <= 0) {
                return;
            }
        }
        llllllllllllIlIllllllIllIIIllIlI.resetTransform();
        llllllllllllIlIllllllIllIIIllIlI.drawString(ParticleTest.lllIIIlllIlIlI[ParticleTest.lllIIIlllIlIll[1]], 200.0f, 500.0f);
        llllllllllllIlIllllllIllIIIllIlI.drawString(String.valueOf(new StringBuilder().append(ParticleTest.lllIIIlllIlIlI[ParticleTest.lllIIIlllIlIll[8]]).append(this.system.getParticleCount() * ParticleTest.lllIIIlllIlIll[7])), 200.0f, 520.0f);
    }
    
    private static boolean lIIllllIIlIIlllI(final int llllllllllllIlIllllllIlIllIIllll, final int llllllllllllIlIllllllIlIllIIlllI) {
        return llllllllllllIlIllllllIlIllIIllll == llllllllllllIlIllllllIlIllIIlllI;
    }
    
    private static String lIIllllIIlIIlIII(String llllllllllllIlIllllllIlIllllIlII, final String llllllllllllIlIllllllIlIllllIIll) {
        llllllllllllIlIllllllIlIllllIlII = new String(Base64.getDecoder().decode(llllllllllllIlIllllllIlIllllIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllllllIlIllllIlll = new StringBuilder();
        final char[] llllllllllllIlIllllllIlIllllIllI = llllllllllllIlIllllllIlIllllIIll.toCharArray();
        int llllllllllllIlIllllllIlIllllIlIl = ParticleTest.lllIIIlllIlIll[0];
        final int llllllllllllIlIllllllIlIlllIllll = (Object)llllllllllllIlIllllllIlIllllIlII.toCharArray();
        final double llllllllllllIlIllllllIlIlllIlllI = llllllllllllIlIllllllIlIlllIllll.length;
        boolean llllllllllllIlIllllllIlIlllIllIl = ParticleTest.lllIIIlllIlIll[0] != 0;
        while (lIIllllIIlIIllIl(llllllllllllIlIllllllIlIlllIllIl ? 1 : 0, (int)llllllllllllIlIllllllIlIlllIlllI)) {
            final char llllllllllllIlIllllllIlIlllllIlI = llllllllllllIlIllllllIlIlllIllll[llllllllllllIlIllllllIlIlllIllIl];
            llllllllllllIlIllllllIlIllllIlll.append((char)(llllllllllllIlIllllllIlIlllllIlI ^ llllllllllllIlIllllllIlIllllIllI[llllllllllllIlIllllllIlIllllIlIl % llllllllllllIlIllllllIlIllllIllI.length]));
            "".length();
            ++llllllllllllIlIllllllIlIllllIlIl;
            ++llllllllllllIlIllllllIlIlllIllIl;
            "".length();
            if (((0xA ^ 0x46) & ~(0xD4 ^ 0x98)) != 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllllllIlIllllIlll);
    }
    
    @Override
    public void update(final GameContainer llllllllllllIlIllllllIllIIIlIIll, final int llllllllllllIlIllllllIllIIIlIIlI) {
        this.system.update(llllllllllllIlIllllllIllIIIlIIlI);
    }
    
    private static void lIIllllIIlIIllII() {
        (lllIIIlllIlIll = new int[13])[0] = ((0x86 ^ 0xA2 ^ (0x1B ^ 0x75)) & (47 + 168 - 132 + 163 ^ 94 + 19 + 4 + 71 ^ -" ".length()));
        ParticleTest.lllIIIlllIlIll[1] = "  ".length();
        ParticleTest.lllIIIlllIlIll[2] = " ".length();
        ParticleTest.lllIIIlllIlIll[3] = (-(0xFFFFFE6E & 0x53F7) & (0xFFFFDBF7 & 0x77FD));
        ParticleTest.lllIIIlllIlIll[4] = (0xFFFF89AF & 0x777C);
        ParticleTest.lllIIIlllIlIll[5] = 8 + 117 + 26 + 49;
        ParticleTest.lllIIIlllIlIll[6] = (-(0xFFFFF397 & 0x5DEB) & (0xFFFFFBFB & 0x57DE));
        ParticleTest.lllIIIlllIlIll[7] = (104 + 85 - 11 + 16 ^ 124 + 164 - 140 + 18);
        ParticleTest.lllIIIlllIlIll[8] = "   ".length();
        ParticleTest.lllIIIlllIlIll[9] = (0x99 ^ 0x96 ^ (0x2E ^ 0x18));
        ParticleTest.lllIIIlllIlIll[10] = (0xFFFFB32C & 0x4FF3);
        ParticleTest.lllIIIlllIlIll[11] = (0x76 ^ 0x3C ^ (0xCE ^ 0x80));
        ParticleTest.lllIIIlllIlIll[12] = (0x69 ^ 0x61);
    }
    
    private static boolean lIIllllIIlIIllIl(final int llllllllllllIlIllllllIlIllIIlIll, final int llllllllllllIlIllllllIlIllIIlIlI) {
        return llllllllllllIlIllllllIlIllIIlIll < llllllllllllIlIllllllIlIllIIlIlI;
    }
}
