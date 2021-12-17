// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import org.newdawn.slick.Graphics;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import org.newdawn.slick.svg.InkscapeLoader;
import org.newdawn.slick.Color;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.svg.SimpleDiagramRenderer;
import org.newdawn.slick.BasicGame;

public class InkscapeTest extends BasicGame
{
    private static final /* synthetic */ int[] lIlIlIlIllIIlI;
    private /* synthetic */ float zoom;
    private /* synthetic */ SimpleDiagramRenderer[] renderer;
    private static final /* synthetic */ String[] lIlIlIlIllIIII;
    private /* synthetic */ float y;
    private /* synthetic */ float x;
    
    private static boolean lllIlllIllIIIII(final int lllllllllllllIIIlIIIIIlIIllIllIl, final int lllllllllllllIIIlIIIIIlIIllIllII) {
        return lllllllllllllIIIlIIIIIlIIllIllIl < lllllllllllllIIIlIIIIIlIIllIllII;
    }
    
    public static void main(final String[] lllllllllllllIIIlIIIIIlIlIIlIllI) {
        try {
            Renderer.setRenderer(InkscapeTest.lIlIlIlIllIIlI[2]);
            Renderer.setLineStripRenderer(InkscapeTest.lIlIlIlIllIIlI[11]);
            final AppGameContainer lllllllllllllIIIlIIIIIlIlIIllIII = new AppGameContainer(new InkscapeTest());
            lllllllllllllIIIlIIIIIlIlIIllIII.setDisplayMode(InkscapeTest.lIlIlIlIllIIlI[12], InkscapeTest.lIlIlIlIllIIlI[13], (boolean)(InkscapeTest.lIlIlIlIllIIlI[0] != 0));
            lllllllllllllIIIlIIIIIlIlIIllIII.start();
            "".length();
            if (-"   ".length() > 0) {
                return;
            }
        }
        catch (SlickException lllllllllllllIIIlIIIIIlIlIIlIlll) {
            lllllllllllllIIIlIIIIIlIlIIlIlll.printStackTrace();
        }
    }
    
    @Override
    public void update(final GameContainer lllllllllllllIIIlIIIIIlIlIlIIlIl, final int lllllllllllllIIIlIIIIIlIlIlIIIIl) throws SlickException {
        if (lllIlllIlIlllII(lllllllllllllIIIlIIIIIlIlIlIIlIl.getInput().isKeyDown(InkscapeTest.lIlIlIlIllIIlI[5]) ? 1 : 0)) {
            this.zoom += lllllllllllllIIIlIIIIIlIlIlIIIIl * 0.01f;
            if (lllIlllIlIlllIl(lllIlllIlIllIlI(this.zoom, 10.0f))) {
                this.zoom = 10.0f;
            }
        }
        if (lllIlllIlIlllII(lllllllllllllIIIlIIIIIlIlIlIIlIl.getInput().isKeyDown(InkscapeTest.lIlIlIlIllIIlI[6]) ? 1 : 0)) {
            this.zoom -= lllllllllllllIIIlIIIIIlIlIlIIIIl * 0.01f;
            if (lllIlllIlIllllI(lllIlllIlIllIll(this.zoom, 0.1f))) {
                this.zoom = 0.1f;
            }
        }
        if (lllIlllIlIlllII(lllllllllllllIIIlIIIIIlIlIlIIlIl.getInput().isKeyDown(InkscapeTest.lIlIlIlIllIIlI[7]) ? 1 : 0)) {
            this.x += lllllllllllllIIIlIIIIIlIlIlIIIIl * 0.1f;
        }
        if (lllIlllIlIlllII(lllllllllllllIIIlIIIIIlIlIlIIlIl.getInput().isKeyDown(InkscapeTest.lIlIlIlIllIIlI[8]) ? 1 : 0)) {
            this.x -= lllllllllllllIIIlIIIIIlIlIlIIIIl * 0.1f;
        }
        if (lllIlllIlIlllII(lllllllllllllIIIlIIIIIlIlIlIIlIl.getInput().isKeyDown(InkscapeTest.lIlIlIlIllIIlI[9]) ? 1 : 0)) {
            this.y += lllllllllllllIIIlIIIIIlIlIlIIIIl * 0.1f;
        }
        if (lllIlllIlIlllII(lllllllllllllIIIlIIIIIlIlIlIIlIl.getInput().isKeyDown(InkscapeTest.lIlIlIlIllIIlI[10]) ? 1 : 0)) {
            this.y -= lllllllllllllIIIlIIIIIlIlIlIIIIl * 0.1f;
        }
    }
    
    private static String lllIlllIlIlIIlI(String lllllllllllllIIIlIIIIIlIIllllIII, final String lllllllllllllIIIlIIIIIlIIlllllII) {
        lllllllllllllIIIlIIIIIlIIllllIII = new String(Base64.getDecoder().decode(lllllllllllllIIIlIIIIIlIIllllIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlIIIIIlIIllllIll = new StringBuilder();
        final char[] lllllllllllllIIIlIIIIIlIIllllIlI = lllllllllllllIIIlIIIIIlIIlllllII.toCharArray();
        int lllllllllllllIIIlIIIIIlIIllllIIl = InkscapeTest.lIlIlIlIllIIlI[0];
        final Exception lllllllllllllIIIlIIIIIlIIlllIIll = (Object)lllllllllllllIIIlIIIIIlIIllllIII.toCharArray();
        final long lllllllllllllIIIlIIIIIlIIlllIIlI = lllllllllllllIIIlIIIIIlIIlllIIll.length;
        float lllllllllllllIIIlIIIIIlIIlllIIIl = InkscapeTest.lIlIlIlIllIIlI[0];
        while (lllIlllIllIIIII((int)lllllllllllllIIIlIIIIIlIIlllIIIl, (int)lllllllllllllIIIlIIIIIlIIlllIIlI)) {
            final char lllllllllllllIIIlIIIIIlIIllllllI = lllllllllllllIIIlIIIIIlIIlllIIll[lllllllllllllIIIlIIIIIlIIlllIIIl];
            lllllllllllllIIIlIIIIIlIIllllIll.append((char)(lllllllllllllIIIlIIIIIlIIllllllI ^ lllllllllllllIIIlIIIIIlIIllllIlI[lllllllllllllIIIlIIIIIlIIllllIIl % lllllllllllllIIIlIIIIIlIIllllIlI.length]));
            "".length();
            ++lllllllllllllIIIlIIIIIlIIllllIIl;
            ++lllllllllllllIIIlIIIIIlIIlllIIIl;
            "".length();
            if (-" ".length() >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlIIIIIlIIllllIll);
    }
    
    private static int lllIlllIlIllIll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    @Override
    public void init(final GameContainer lllllllllllllIIIlIIIIIlIlIlIlIlI) throws SlickException {
        lllllllllllllIIIlIIIIIlIlIlIlIlI.getGraphics().setBackground(Color.white);
        InkscapeLoader.RADIAL_TRIANGULATION_LEVEL = InkscapeTest.lIlIlIlIllIIlI[2];
        this.renderer[InkscapeTest.lIlIlIlIllIIlI[3]] = new SimpleDiagramRenderer(InkscapeLoader.load(InkscapeTest.lIlIlIlIllIIII[InkscapeTest.lIlIlIlIllIIlI[4]]));
        lllllllllllllIIIlIIIIIlIlIlIlIlI.getGraphics().setBackground(new Color(0.5f, 0.7f, 1.0f));
    }
    
    private static boolean lllIlllIlIllllI(final int lllllllllllllIIIlIIIIIlIIllIlIII) {
        return lllllllllllllIIIlIIIIIlIIllIlIII < 0;
    }
    
    private static boolean lllIlllIlIlllII(final int lllllllllllllIIIlIIIIIlIIllIlIlI) {
        return lllllllllllllIIIlIIIIIlIIllIlIlI != 0;
    }
    
    private static boolean lllIlllIlIlllIl(final int lllllllllllllIIIlIIIIIlIIllIIllI) {
        return lllllllllllllIIIlIIIIIlIIllIIllI > 0;
    }
    
    private static void lllIlllIlIllIIl() {
        (lIlIlIlIllIIlI = new int[14])[0] = ((0x93 ^ 0xBD) & ~(0x1C ^ 0x32));
        InkscapeTest.lIlIlIlIllIIlI[1] = (43 + 82 - 81 + 108 ^ 108 + 150 - 206 + 105);
        InkscapeTest.lIlIlIlIllIIlI[2] = "  ".length();
        InkscapeTest.lIlIlIlIllIIlI[3] = "   ".length();
        InkscapeTest.lIlIlIlIllIIlI[4] = " ".length();
        InkscapeTest.lIlIlIlIllIIlI[5] = (0x8C ^ 0xB4 ^ (0x1D ^ 0x35));
        InkscapeTest.lIlIlIlIllIIlI[6] = (0xFD ^ 0x8A ^ (0x43 ^ 0x2A));
        InkscapeTest.lIlIlIlIllIIlI[7] = (0xA8 ^ 0xB4) + (54 + 27 - 55 + 145) - (112 + 119 - 230 + 131) + (114 + 22 - 131 + 133);
        InkscapeTest.lIlIlIlIllIIlI[8] = 169 + 23 - 110 + 121;
        InkscapeTest.lIlIlIlIllIIlI[9] = 122 + 159 - 93 + 20;
        InkscapeTest.lIlIlIlIllIIlI[10] = " ".length() + (127 + 97 - 164 + 81) - -(0x1 ^ 0x38) + " ".length();
        InkscapeTest.lIlIlIlIllIIlI[11] = (0x34 ^ 0x30);
        InkscapeTest.lIlIlIlIllIIlI[12] = (-(0xFFFFFBDD & 0x34EE) & (0xFFFFFFEF & 0x33FB));
        InkscapeTest.lIlIlIlIllIIlI[13] = (0xFFFF935C & 0x6EFB);
    }
    
    private static String lllIlllIlIlIIIl(final String lllllllllllllIIIlIIIIIlIlIIIlIll, final String lllllllllllllIIIlIIIIIlIlIIIllII) {
        try {
            final SecretKeySpec lllllllllllllIIIlIIIIIlIlIIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIIIIIlIlIIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIlIIIIIlIlIIIllll = Cipher.getInstance("Blowfish");
            lllllllllllllIIIlIIIIIlIlIIIllll.init(InkscapeTest.lIlIlIlIllIIlI[2], lllllllllllllIIIlIIIIIlIlIIlIIII);
            return new String(lllllllllllllIIIlIIIIIlIlIIIllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIIIIIlIlIIIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIIIIIlIlIIIlllI) {
            lllllllllllllIIIlIIIIIlIlIIIlllI.printStackTrace();
            return null;
        }
    }
    
    private static int lllIlllIlIllIlI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public void render(final GameContainer lllllllllllllIIIlIIIIIlIlIIlllIl, final Graphics lllllllllllllIIIlIIIIIlIlIIllIlI) throws SlickException {
        lllllllllllllIIIlIIIIIlIlIIllIlI.scale(this.zoom, this.zoom);
        lllllllllllllIIIlIIIIIlIlIIllIlI.translate(this.x, this.y);
        lllllllllllllIIIlIIIIIlIlIIllIlI.scale(0.3f, 0.3f);
        lllllllllllllIIIlIIIIIlIlIIllIlI.scale(3.3333333f, 3.3333333f);
        lllllllllllllIIIlIIIIIlIlIIllIlI.translate(400.0f, 0.0f);
        lllllllllllllIIIlIIIIIlIlIIllIlI.translate(100.0f, 300.0f);
        lllllllllllllIIIlIIIIIlIlIIllIlI.scale(0.7f, 0.7f);
        lllllllllllllIIIlIIIIIlIlIIllIlI.scale(1.4285715f, 1.4285715f);
        lllllllllllllIIIlIIIIIlIlIIllIlI.scale(0.5f, 0.5f);
        lllllllllllllIIIlIIIIIlIlIIllIlI.translate(-1100.0f, -380.0f);
        this.renderer[InkscapeTest.lIlIlIlIllIIlI[3]].render(lllllllllllllIIIlIIIIIlIlIIllIlI);
        lllllllllllllIIIlIIIIIlIlIIllIlI.scale(2.0f, 2.0f);
        lllllllllllllIIIlIIIIIlIlIIllIlI.resetTransform();
    }
    
    private static void lllIlllIlIlIIll() {
        (lIlIlIlIllIIII = new String[InkscapeTest.lIlIlIlIllIIlI[2]])[InkscapeTest.lIlIlIlIllIIlI[0]] = lllIlllIlIlIIIl("2jLKjYQyMfh5GwO1iE1pZg==", "DLBhQ");
        InkscapeTest.lIlIlIlIllIIII[InkscapeTest.lIlIlIlIllIIlI[4]] = lllIlllIlIlIIlI("PxU9OhcqBC9hAD0XYS0fJB4rOhY4BGA9BSw=", "KpNNs");
    }
    
    public InkscapeTest() {
        super(InkscapeTest.lIlIlIlIllIIII[InkscapeTest.lIlIlIlIllIIlI[0]]);
        this.renderer = new SimpleDiagramRenderer[InkscapeTest.lIlIlIlIllIIlI[1]];
        this.zoom = 1.0f;
    }
    
    static {
        lllIlllIlIllIIl();
        lllIlllIlIlIIll();
    }
}
