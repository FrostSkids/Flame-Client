// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import org.newdawn.slick.util.Log;
import org.newdawn.slick.Color;
import org.newdawn.slick.Game;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.opengl.SlickCallable;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.GameContainer;
import java.util.ArrayList;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;

public class TestBox extends BasicGame
{
    private /* synthetic */ AppGameContainer container;
    private static final /* synthetic */ String[] lIllllllIlIllI;
    private static final /* synthetic */ int[] lIllllllIlIlll;
    private /* synthetic */ BasicGame currentGame;
    private /* synthetic */ ArrayList games;
    private /* synthetic */ int index;
    
    @Override
    public void controllerLeftPressed(final int llllllllllllIllllIIlIIlIlIlIlIIl) {
        this.currentGame.controllerLeftPressed(llllllllllllIllllIIlIIlIlIlIlIIl);
    }
    
    @Override
    public void keyPressed(final int llllllllllllIllllIIlIIlIlIIIIllI, final char llllllllllllIllllIIlIIlIlIIIIIlI) {
        this.currentGame.keyPressed(llllllllllllIllllIIlIIlIlIIIIllI, llllllllllllIllllIIlIIlIlIIIIIlI);
        if (lIIIIlIlllIllllI(llllllllllllIllllIIlIIlIlIIIIllI, TestBox.lIllllllIlIlll[3])) {
            this.nextGame();
        }
    }
    
    private static void lIIIIlIlllIlllIl() {
        (lIllllllIlIlll = new int[8])[0] = ((0xBB ^ 0x91 ^ (0x5D ^ 0x67)) & (0xDC ^ 0xBD ^ (0xC0 ^ 0xB1) ^ -" ".length()));
        TestBox.lIllllllIlIlll[1] = -" ".length();
        TestBox.lIllllllIlIlll[2] = " ".length();
        TestBox.lIllllllIlIlll[3] = (0x1C ^ 0x79 ^ (0x41 ^ 0x38));
        TestBox.lIllllllIlIlll[4] = (0xFFFFB72D & 0x4BF2);
        TestBox.lIllllllIlIlll[5] = (-(0xFFFFBD8A & 0x5377) & (0xFFFFBB5D & 0x57FB));
        TestBox.lIllllllIlIlll[6] = "  ".length();
        TestBox.lIllllllIlIlll[7] = (0x3D ^ 0x35);
    }
    
    private void nextGame() {
        if (lIIIIlIlllIllllI(this.index, TestBox.lIllllllIlIlll[1])) {
            return;
        }
        this.index += TestBox.lIllllllIlIlll[2];
        if (lIIIIlIlllIlllll(this.index, this.games.size())) {
            this.index = TestBox.lIllllllIlIlll[0];
        }
        this.startGame();
    }
    
    private static boolean lIIIIlIllllIIIII(final int llllllllllllIllllIIlIIlIIIlIIIII) {
        return llllllllllllIllllIIlIIlIIIlIIIII == 0;
    }
    
    @Override
    public void keyReleased(final int llllllllllllIllllIIlIIlIIlllllIl, final char llllllllllllIllllIIlIIlIIlllllII) {
        this.currentGame.keyReleased(llllllllllllIllllIIlIIlIIlllllIl, llllllllllllIllllIIlIIlIIlllllII);
    }
    
    @Override
    public void controllerRightPressed(final int llllllllllllIllllIIlIIlIlIIlllIl) {
        this.currentGame.controllerRightPressed(llllllllllllIllllIIlIIlIlIIlllIl);
    }
    
    public void render(final GameContainer llllllllllllIllllIIlIIlIllIIlllI, final Graphics llllllllllllIllllIIlIIlIllIlIIII) throws SlickException {
        SlickCallable.enterSafeBlock();
        this.currentGame.render(llllllllllllIllllIIlIIlIllIIlllI, llllllllllllIllllIIlIIlIllIlIIII);
        SlickCallable.leaveSafeBlock();
    }
    
    public void addGame(final Class llllllllllllIllllIIlIIlIlllIlllI) {
        this.games.add(llllllllllllIllllIIlIIlIlllIlllI);
        "".length();
    }
    
    @Override
    public void controllerRightReleased(final int llllllllllllIllllIIlIIlIlIIlIlll) {
        this.currentGame.controllerRightReleased(llllllllllllIllllIIlIIlIlIIlIlll);
    }
    
    private static boolean lIIIIlIlllIlllll(final int llllllllllllIllllIIlIIlIIIlIIIll, final int llllllllllllIllllIIlIIlIIIlIIIlI) {
        return llllllllllllIllllIIlIIlIIIlIIIll >= llllllllllllIllllIIlIIlIIIlIIIlI;
    }
    
    @Override
    public void controllerUpPressed(final int llllllllllllIllllIIlIIlIlIIlIIIl) {
        this.currentGame.controllerUpPressed(llllllllllllIllllIIlIIlIlIIlIIIl);
    }
    
    @Override
    public void init(final GameContainer llllllllllllIllllIIlIIlIllIlllll) throws SlickException {
        if (lIIIIlIllllIIIII(this.games.size())) {
            this.currentGame = new BasicGame(TestBox.lIllllllIlIllI[TestBox.lIllllllIlIlll[2]]) {
                public void render(final GameContainer lllllllllllllIlIlIlIllIIIIllllll, final Graphics lllllllllllllIlIlIlIllIIIIlllllI) throws SlickException {
                }
                
                @Override
                public void init(final GameContainer lllllllllllllIlIlIlIllIIIlIIIlII) throws SlickException {
                }
                
                @Override
                public void update(final GameContainer lllllllllllllIlIlIlIllIIIlIIIIlI, final int lllllllllllllIlIlIlIllIIIlIIIIIl) throws SlickException {
                }
            };
            this.currentGame.init(llllllllllllIllllIIlIIlIllIlllll);
            this.index = TestBox.lIllllllIlIlll[1];
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        }
        else {
            this.index = TestBox.lIllllllIlIlll[0];
            this.container = (AppGameContainer)llllllllllllIllllIIlIIlIllIlllll;
            this.startGame();
        }
    }
    
    private static void lIIIIlIlllIlllII() {
        (lIllllllIlIllI = new String[TestBox.lIllllllIlIlll[6]])[TestBox.lIllllllIlIlll[0]] = lIIIIlIlllIllIlI("VFlKuwrBmF/8GZB29PfCXw==", "vpbJn");
        TestBox.lIllllllIlIllI[TestBox.lIllllllIlIlll[2]] = lIIIIlIlllIllIll("5q2kG5BAt7Q=", "BdreX");
    }
    
    public TestBox() {
        super(TestBox.lIllllllIlIllI[TestBox.lIllllllIlIlll[0]]);
        this.games = new ArrayList();
    }
    
    @Override
    public void controllerButtonPressed(final int llllllllllllIllllIIlIIlIllIIlIII, final int llllllllllllIllllIIlIIlIllIIIlII) {
        this.currentGame.controllerButtonPressed(llllllllllllIllllIIlIIlIllIIlIII, llllllllllllIllllIIlIIlIllIIIlII);
    }
    
    @Override
    public void controllerLeftReleased(final int llllllllllllIllllIIlIIlIlIlIIIll) {
        this.currentGame.controllerLeftReleased(llllllllllllIllllIIlIIlIlIlIIIll);
    }
    
    @Override
    public void mouseMoved(final int llllllllllllIllllIIlIIlIIllIllIl, final int llllllllllllIllllIIlIIlIIlllIIIl, final int llllllllllllIllllIIlIIlIIllIlIll, final int llllllllllllIllllIIlIIlIIllIllll) {
        this.currentGame.mouseMoved(llllllllllllIllllIIlIIlIIllIllIl, llllllllllllIllllIIlIIlIIlllIIIl, llllllllllllIllllIIlIIlIIllIlIll, llllllllllllIllllIIlIIlIIllIllll);
    }
    
    @Override
    public void mouseWheelMoved(final int llllllllllllIllllIIlIIlIIlIIlllI) {
        this.currentGame.mouseWheelMoved(llllllllllllIllllIIlIIlIIlIIlllI);
    }
    
    @Override
    public void update(final GameContainer llllllllllllIllllIIlIIlIllIllIlI, final int llllllllllllIllllIIlIIlIllIllIIl) throws SlickException {
        this.currentGame.update(llllllllllllIllllIIlIIlIllIllIlI, llllllllllllIllllIIlIIlIllIllIIl);
    }
    
    private static String lIIIIlIlllIllIlI(final String llllllllllllIllllIIlIIlIIIlIllll, final String llllllllllllIllllIIlIIlIIIlIlllI) {
        try {
            final SecretKeySpec llllllllllllIllllIIlIIlIIIllIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIlIIlIIIlIlllI.getBytes(StandardCharsets.UTF_8)), TestBox.lIllllllIlIlll[7]), "DES");
            final Cipher llllllllllllIllllIIlIIlIIIllIIIl = Cipher.getInstance("DES");
            llllllllllllIllllIIlIIlIIIllIIIl.init(TestBox.lIllllllIlIlll[6], llllllllllllIllllIIlIIlIIIllIIlI);
            return new String(llllllllllllIllllIIlIIlIIIllIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIlIIlIIIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIlIIlIIIllIIII) {
            llllllllllllIllllIIlIIlIIIllIIII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void mouseReleased(final int llllllllllllIllllIIlIIlIIlIllIII, final int llllllllllllIllllIIlIIlIIlIlIlll, final int llllllllllllIllllIIlIIlIIlIlIllI) {
        this.currentGame.mouseReleased(llllllllllllIllllIIlIIlIIlIllIII, llllllllllllIllllIIlIIlIIlIlIlll, llllllllllllIllllIIlIIlIIlIlIllI);
    }
    
    @Override
    public void controllerButtonReleased(final int llllllllllllIllllIIlIIlIlIllllll, final int llllllllllllIllllIIlIIlIlIlllIll) {
        this.currentGame.controllerButtonReleased(llllllllllllIllllIIlIIlIlIllllll, llllllllllllIllllIIlIIlIlIlllIll);
    }
    
    public static void main(final String[] llllllllllllIllllIIlIIlIIlIIIllI) {
        try {
            final TestBox llllllllllllIllllIIlIIlIIlIIlIIl = new TestBox();
            llllllllllllIllllIIlIIlIIlIIlIIl.addGame(AnimationTest.class);
            llllllllllllIllllIIlIIlIIlIIlIIl.addGame(AntiAliasTest.class);
            llllllllllllIllllIIlIIlIIlIIlIIl.addGame(BigImageTest.class);
            llllllllllllIllllIIlIIlIIlIIlIIl.addGame(ClipTest.class);
            llllllllllllIllllIIlIIlIIlIIlIIl.addGame(DuplicateEmitterTest.class);
            llllllllllllIllllIIlIIlIIlIIlIIl.addGame(FlashTest.class);
            llllllllllllIllllIIlIIlIIlIIlIIl.addGame(FontPerformanceTest.class);
            llllllllllllIllllIIlIIlIIlIIlIIl.addGame(FontTest.class);
            llllllllllllIllllIIlIIlIIlIIlIIl.addGame(GeomTest.class);
            llllllllllllIllllIIlIIlIIlIIlIIl.addGame(GradientTest.class);
            llllllllllllIllllIIlIIlIIlIIlIIl.addGame(GraphicsTest.class);
            llllllllllllIllllIIlIIlIIlIIlIIl.addGame(ImageBufferTest.class);
            llllllllllllIllllIIlIIlIIlIIlIIl.addGame(ImageReadTest.class);
            llllllllllllIllllIIlIIlIIlIIlIIl.addGame(ImageTest.class);
            llllllllllllIllllIIlIIlIIlIIlIIl.addGame(KeyRepeatTest.class);
            llllllllllllIllllIIlIIlIIlIIlIIl.addGame(MusicListenerTest.class);
            llllllllllllIllllIIlIIlIIlIIlIIl.addGame(PackedSheetTest.class);
            llllllllllllIllllIIlIIlIIlIIlIIl.addGame(PedigreeTest.class);
            llllllllllllIllllIIlIIlIIlIIlIIl.addGame(PureFontTest.class);
            llllllllllllIllllIIlIIlIIlIIlIIl.addGame(ShapeTest.class);
            llllllllllllIllllIIlIIlIIlIIlIIl.addGame(SoundTest.class);
            llllllllllllIllllIIlIIlIIlIIlIIl.addGame(SpriteSheetFontTest.class);
            llllllllllllIllllIIlIIlIIlIIlIIl.addGame(TransparentColorTest.class);
            final AppGameContainer llllllllllllIllllIIlIIlIIlIIlIII = new AppGameContainer(llllllllllllIllllIIlIIlIIlIIlIIl);
            llllllllllllIllllIIlIIlIIlIIlIII.setDisplayMode(TestBox.lIllllllIlIlll[4], TestBox.lIllllllIlIlll[5], (boolean)(TestBox.lIllllllIlIlll[0] != 0));
            llllllllllllIllllIIlIIlIIlIIlIII.start();
            "".length();
            if (null != null) {
                return;
            }
        }
        catch (SlickException llllllllllllIllllIIlIIlIIlIIIlll) {
            llllllllllllIllllIIlIIlIIlIIIlll.printStackTrace();
        }
    }
    
    @Override
    public void controllerUpReleased(final int llllllllllllIllllIIlIIlIlIIIllIl) {
        this.currentGame.controllerUpReleased(llllllllllllIllllIIlIIlIlIIIllIl);
    }
    
    private void startGame() {
        try {
            this.currentGame = this.games.get(this.index).newInstance();
            this.container.getGraphics().setBackground(Color.black);
            this.currentGame.init(this.container);
            this.currentGame.render(this.container, this.container.getGraphics());
            "".length();
            if (-(43 + 49 - 26 + 121 ^ 167 + 33 - 90 + 81) > 0) {
                return;
            }
        }
        catch (Exception llllllllllllIllllIIlIIlIlllIlIII) {
            Log.error(llllllllllllIllllIIlIIlIlllIlIII);
        }
        this.container.setTitle(this.currentGame.getTitle());
    }
    
    @Override
    public void controllerDownPressed(final int llllllllllllIllllIIlIIlIlIllIlll) {
        this.currentGame.controllerDownPressed(llllllllllllIllllIIlIIlIlIllIlll);
    }
    
    private static String lIIIIlIlllIllIll(final String llllllllllllIllllIIlIIlIIIlllIlI, final String llllllllllllIllllIIlIIlIIIlllIIl) {
        try {
            final SecretKeySpec llllllllllllIllllIIlIIlIIIllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIlIIlIIIlllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIIlIIlIIIlllllI = Cipher.getInstance("Blowfish");
            llllllllllllIllllIIlIIlIIIlllllI.init(TestBox.lIllllllIlIlll[6], llllllllllllIllllIIlIIlIIIllllll);
            return new String(llllllllllllIllllIIlIIlIIIlllllI.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIlIIlIIIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIlIIlIIIllllIl) {
            llllllllllllIllllIIlIIlIIIllllIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void controllerDownReleased(final int llllllllllllIllllIIlIIlIlIlIllll) {
        this.currentGame.controllerDownReleased(llllllllllllIllllIIlIIlIlIlIllll);
    }
    
    @Override
    public void mousePressed(final int llllllllllllIllllIIlIIlIIllIIIII, final int llllllllllllIllllIIlIIlIIllIIIll, final int llllllllllllIllllIIlIIlIIllIIIlI) {
        this.currentGame.mousePressed(llllllllllllIllllIIlIIlIIllIIIII, llllllllllllIllllIIlIIlIIllIIIll, llllllllllllIllllIIlIIlIIllIIIlI);
    }
    
    private static boolean lIIIIlIlllIllllI(final int llllllllllllIllllIIlIIlIIIlIIlll, final int llllllllllllIllllIIlIIlIIIlIIllI) {
        return llllllllllllIllllIIlIIlIIIlIIlll == llllllllllllIllllIIlIIlIIIlIIllI;
    }
    
    static {
        lIIIIlIlllIlllIl();
        lIIIIlIlllIlllII();
    }
}
