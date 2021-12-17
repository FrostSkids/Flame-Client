// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import org.newdawn.slick.svg.SimpleDiagramRenderer;
import org.newdawn.slick.Graphics;
import java.util.Arrays;
import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.svg.InkscapeLoader;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.svg.Diagram;
import org.newdawn.slick.svg.SVGMorph;
import org.newdawn.slick.BasicGame;

public class MorphSVGTest extends BasicGame
{
    private /* synthetic */ SVGMorph morph;
    private /* synthetic */ Diagram base;
    private /* synthetic */ float x;
    private static final /* synthetic */ String[] llIllIIIllIlII;
    private static final /* synthetic */ int[] llIllIIIlllIll;
    
    @Override
    public void init(final GameContainer llllllllllllIllIlIIIIIIIIllIllll) throws SlickException {
        this.base = InkscapeLoader.load(MorphSVGTest.llIllIIIllIlII[MorphSVGTest.llIllIIIlllIll[1]]);
        this.morph = new SVGMorph(this.base);
        this.morph.addStep(InkscapeLoader.load(MorphSVGTest.llIllIIIllIlII[MorphSVGTest.llIllIIIlllIll[2]]));
        this.morph.addStep(InkscapeLoader.load(MorphSVGTest.llIllIIIllIlII[MorphSVGTest.llIllIIIlllIll[3]]));
        this.morph.addStep(InkscapeLoader.load(MorphSVGTest.llIllIIIllIlII[MorphSVGTest.llIllIIIlllIll[4]]));
        llllllllllllIllIlIIIIIIIIllIllll.setVSync((boolean)(MorphSVGTest.llIllIIIlllIll[1] != 0));
    }
    
    private static void lIIlIllIlIIlIlll() {
        (llIllIIIlllIll = new int[9])[0] = ((0x11 ^ 0x3F) & ~(0x38 ^ 0x16));
        MorphSVGTest.llIllIIIlllIll[1] = " ".length();
        MorphSVGTest.llIllIIIlllIll[2] = "  ".length();
        MorphSVGTest.llIllIIIlllIll[3] = "   ".length();
        MorphSVGTest.llIllIIIlllIll[4] = (0x75 ^ 0x71);
        MorphSVGTest.llIllIIIlllIll[5] = (0xFFFFA3BF & 0x5F60);
        MorphSVGTest.llIllIIIlllIll[6] = (0xFFFFE25D & 0x1FFA);
        MorphSVGTest.llIllIIIlllIll[7] = (0x57 ^ 0x23 ^ (0x1B ^ 0x6A));
        MorphSVGTest.llIllIIIlllIll[8] = (0x3E ^ 0x5 ^ (0xD ^ 0x3E));
    }
    
    static {
        lIIlIllIlIIlIlll();
        lIIlIllIlIIIlllI();
    }
    
    private static int lIIlIllIlIIllIII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    @Override
    public void update(final GameContainer llllllllllllIllIlIIIIIIIIllIlIll, final int llllllllllllIllIlIIIIIIIIllIlIlI) throws SlickException {
        this.morph.updateMorphTime(llllllllllllIllIlIIIIIIIIllIlIlI * 0.003f);
        this.x += llllllllllllIllIlIIIIIIIIllIlIlI * 0.2f;
        if (lIIlIllIlIIllIIl(lIIlIllIlIIllIII(this.x, 550.0f))) {
            this.x = -450.0f;
        }
    }
    
    private static boolean lIIlIllIlIIllIIl(final int llllllllllllIllIlIIIIIIIIIlIIlII) {
        return llllllllllllIllIlIIIIIIIIIlIIlII > 0;
    }
    
    public MorphSVGTest() {
        super(MorphSVGTest.llIllIIIllIlII[MorphSVGTest.llIllIIIlllIll[0]]);
        this.x = -300.0f;
    }
    
    private static void lIIlIllIlIIIlllI() {
        (llIllIIIllIlII = new String[MorphSVGTest.llIllIIIlllIll[7]])[MorphSVGTest.llIllIIIlllIll[0]] = lIIlIllIlIIIlIll("Cy0oOREVKjs5HBInKT0=", "FBZIy");
        MorphSVGTest.llIllIIIllIlII[MorphSVGTest.llIllIIIlllIll[1]] = lIIlIllIlIIIlIll("JSsdEi4wOg9JOScpQRErPSVfSDknKQ==", "QNnfJ");
        MorphSVGTest.llIllIIIllIlII[MorphSVGTest.llIllIIIlllIll[2]] = lIIlIllIlIIIllII("9X9UR7e8DVdQfkmv8jpk4+hO8KTP3mak", "vfGqZ");
        MorphSVGTest.llIllIIIllIlII[MorphSVGTest.llIllIIIlllIll[3]] = lIIlIllIlIIIllIl("zP2cu6nzNfUa51BGEZrhvuP0IcDGBa/G", "jRsoA");
        MorphSVGTest.llIllIIIllIlII[MorphSVGTest.llIllIIIlllIll[4]] = lIIlIllIlIIIllII("FM04v0n76QCn5aFTpwt6wLTuFt1yBbUc", "PtHng");
    }
    
    private static String lIIlIllIlIIIllII(final String llllllllllllIllIlIIIIIIIIIlIllll, final String llllllllllllIllIlIIIIIIIIIlIlllI) {
        try {
            final SecretKeySpec llllllllllllIllIlIIIIIIIIIllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIIIIIIIIlIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlIIIIIIIIIllIIIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIlIIIIIIIIIllIIIl.init(MorphSVGTest.llIllIIIlllIll[2], llllllllllllIllIlIIIIIIIIIllIIlI);
            return new String(llllllllllllIllIlIIIIIIIIIllIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIIIIIIIIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIIIIIIIIIllIIII) {
            llllllllllllIllIlIIIIIIIIIllIIII.printStackTrace();
            return null;
        }
    }
    
    public static void main(final String[] llllllllllllIllIlIIIIIIIIlIlllIl) {
        try {
            final AppGameContainer llllllllllllIllIlIIIIIIIIlIlllll = new AppGameContainer(new MorphSVGTest());
            llllllllllllIllIlIIIIIIIIlIlllll.setDisplayMode(MorphSVGTest.llIllIIIlllIll[5], MorphSVGTest.llIllIIIlllIll[6], (boolean)(MorphSVGTest.llIllIIIlllIll[0] != 0));
            llllllllllllIllIlIIIIIIIIlIlllll.start();
            "".length();
            if (" ".length() != " ".length()) {
                return;
            }
        }
        catch (SlickException llllllllllllIllIlIIIIIIIIlIllllI) {
            llllllllllllIllIlIIIIIIIIlIllllI.printStackTrace();
        }
    }
    
    private static String lIIlIllIlIIIllIl(final String llllllllllllIllIlIIIIIIIIlIlIlII, final String llllllllllllIllIlIIIIIIIIlIlIIll) {
        try {
            final SecretKeySpec llllllllllllIllIlIIIIIIIIlIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIIIIIIIlIlIIll.getBytes(StandardCharsets.UTF_8)), MorphSVGTest.llIllIIIlllIll[8]), "DES");
            final Cipher llllllllllllIllIlIIIIIIIIlIlIllI = Cipher.getInstance("DES");
            llllllllllllIllIlIIIIIIIIlIlIllI.init(MorphSVGTest.llIllIIIlllIll[2], llllllllllllIllIlIIIIIIIIlIlIlll);
            return new String(llllllllllllIllIlIIIIIIIIlIlIllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIIIIIIIlIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIIIIIIIIlIlIlIl) {
            llllllllllllIllIlIIIIIIIIlIlIlIl.printStackTrace();
            return null;
        }
    }
    
    public void render(final GameContainer llllllllllllIllIlIIIIIIIIllIIlII, final Graphics llllllllllllIllIlIIIIIIIIllIIIll) throws SlickException {
        llllllllllllIllIlIIIIIIIIllIIIll.translate(this.x, 0.0f);
        SimpleDiagramRenderer.render(llllllllllllIllIlIIIIIIIIllIIIll, this.morph);
    }
    
    private static String lIIlIllIlIIIlIll(String llllllllllllIllIlIIIIIIIIIllllll, final String llllllllllllIllIlIIIIIIIIIlllllI) {
        llllllllllllIllIlIIIIIIIIIllllll = (Exception)new String(Base64.getDecoder().decode(((String)llllllllllllIllIlIIIIIIIIIllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIIIIIIIIlIIIIlI = new StringBuilder();
        final char[] llllllllllllIllIlIIIIIIIIlIIIIIl = llllllllllllIllIlIIIIIIIIIlllllI.toCharArray();
        int llllllllllllIllIlIIIIIIIIlIIIIII = MorphSVGTest.llIllIIIlllIll[0];
        final boolean llllllllllllIllIlIIIIIIIIIlllIlI = (Object)((String)llllllllllllIllIlIIIIIIIIIllllll).toCharArray();
        final long llllllllllllIllIlIIIIIIIIIlllIIl = llllllllllllIllIlIIIIIIIIIlllIlI.length;
        char llllllllllllIllIlIIIIIIIIIlllIII = (char)MorphSVGTest.llIllIIIlllIll[0];
        while (lIIlIllIlIIllIlI(llllllllllllIllIlIIIIIIIIIlllIII, (int)llllllllllllIllIlIIIIIIIIIlllIIl)) {
            final char llllllllllllIllIlIIIIIIIIlIIIlIl = llllllllllllIllIlIIIIIIIIIlllIlI[llllllllllllIllIlIIIIIIIIIlllIII];
            llllllllllllIllIlIIIIIIIIlIIIIlI.append((char)(llllllllllllIllIlIIIIIIIIlIIIlIl ^ llllllllllllIllIlIIIIIIIIlIIIIIl[llllllllllllIllIlIIIIIIIIlIIIIII % llllllllllllIllIlIIIIIIIIlIIIIIl.length]));
            "".length();
            ++llllllllllllIllIlIIIIIIIIlIIIIII;
            ++llllllllllllIllIlIIIIIIIIIlllIII;
            "".length();
            if (-"  ".length() >= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIIIIIIIIlIIIIlI);
    }
    
    private static boolean lIIlIllIlIIllIlI(final int llllllllllllIllIlIIIIIIIIIlIIlll, final int llllllllllllIllIlIIIIIIIIIlIIllI) {
        return llllllllllllIllIlIIIIIIIIIlIIlll < llllllllllllIllIlIIIIIIIIIlIIllI;
    }
}
