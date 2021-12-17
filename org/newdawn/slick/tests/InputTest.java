// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import org.newdawn.slick.Game;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.util.Log;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.GameContainer;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.Input;
import java.util.ArrayList;
import org.newdawn.slick.Color;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;

public class InputTest extends BasicGame
{
    private /* synthetic */ float x;
    private static final /* synthetic */ String[] llIlIllIlIIlIl;
    private /* synthetic */ boolean rshift;
    private /* synthetic */ int ypos;
    private static final /* synthetic */ int[] llIlIllIlIlIlI;
    private /* synthetic */ boolean lshift;
    private /* synthetic */ boolean buttonDown;
    private /* synthetic */ AppGameContainer app;
    private /* synthetic */ Color[] cols;
    private /* synthetic */ int index;
    private /* synthetic */ String message;
    private /* synthetic */ ArrayList lines;
    private /* synthetic */ Input input;
    private /* synthetic */ float y;
    private /* synthetic */ boolean space;
    
    private static boolean lIIlIlIlIlIlIlII(final int llllllllllllIllIlIIlIllIIlIlIlll, final int llllllllllllIllIlIIlIllIIlIlIllI) {
        return llllllllllllIllIlIIlIllIIlIlIlll == llllllllllllIllIlIIlIllIIlIlIllI;
    }
    
    @Override
    public void mouseReleased(final int llllllllllllIllIlIIlIllIllIIIIII, final int llllllllllllIllIlIIlIllIlIlllIll, final int llllllllllllIllIlIIlIllIlIlllllI) {
        if (lIIlIlIlIlIlIllI(llllllllllllIllIlIIlIllIllIIIIII)) {
            this.buttonDown = (InputTest.llIlIllIlIlIlI[0] != 0);
        }
        this.message = String.valueOf(new StringBuilder().append(InputTest.llIlIllIlIIlIl[InputTest.llIlIllIlIlIlI[19]]).append(llllllllllllIllIlIIlIllIllIIIIII).append(InputTest.llIlIllIlIIlIl[InputTest.llIlIllIlIlIlI[20]]).append(llllllllllllIllIlIIlIllIlIlllIll).append(InputTest.llIlIllIlIIlIl[InputTest.llIlIllIlIlIlI[21]]).append(llllllllllllIllIlIIlIllIlIlllllI));
    }
    
    private static void lIIlIlIlIlIIlllI() {
        (llIlIllIlIIlIl = new String[InputTest.llIlIllIlIlIlI[27]])[InputTest.llIlIllIlIlIlI[0]] = lIIlIlIlIlIIIlIl("MzqaheN5L7TaxdVvcIcgQA==", "ZxPQK");
        InputTest.llIlIllIlIIlIl[InputTest.llIlIllIlIlIlI[1]] = lIIlIlIlIlIIIllI("IYAoTCtv8cwiMRp5lNxPB9X2BrGuG/FaBQUNZDdenxeBK05IZ+eDXzfUEC1aTSsa", "nhmXS");
        InputTest.llIlIllIlIIlIl[InputTest.llIlIllIlIlIlI[3]] = lIIlIlIlIlIIIlll("DyY8EGMQKzMCN0MnNRMtWWM=", "cCZdC");
        InputTest.llIlIllIlIIlIl[InputTest.llIlIllIlIlIlI[4]] = lIIlIlIlIlIIIllI("eQRZB5HP/3uGxNmnpBf/oTWjtChO46JX", "UkJSR");
        InputTest.llIlIllIlIIlIl[InputTest.llIlIllIlIlIlI[5]] = lIIlIlIlIlIIIllI("wSxu9PSBw9ezHovxJE3lXg==", "WhnsW");
        InputTest.llIlIllIlIIlIl[InputTest.llIlIllIlIlIlI[6]] = lIIlIlIlIlIIIlIl("7AKD4p124LU=", "HLIzD");
        InputTest.llIlIllIlIIlIl[InputTest.llIlIllIlIlIlI[2]] = lIIlIlIlIlIIIlIl("d1VyDGIUWDlzli++i/rG0ckW+byknyPapYI9tfLxADCv0aMQjfgxm85Fb7eY/FZDOxRLocfRcrsJvnAwiH2S0b4zfbDcqyy7krJLXfZEypw9+RJV3LX8cE8MFilVXu5y", "yjvDC");
        InputTest.llIlIllIlIIlIl[InputTest.llIlIllIlIlIlI[13]] = lIIlIlIlIlIIIlIl("aSn47cUMltJ3OIuciUxknac/IdTUIjuC", "bsTvr");
        InputTest.llIlIllIlIIlIl[InputTest.llIlIllIlIlIlI[14]] = lIIlIlIlIlIIIllI("e1XNwu3fcguxrc9Jft0xwg==", "xKoGe");
        InputTest.llIlIllIlIIlIl[InputTest.llIlIllIlIlIlI[15]] = lIIlIlIlIlIIIlll("SA==", "aiQlg");
        InputTest.llIlIllIlIIlIl[InputTest.llIlIllIlIlIlI[16]] = lIIlIlIlIlIIIllI("m137vgXLyHRoYWBEq1uGBA==", "SKqhW");
        InputTest.llIlIllIlIIlIl[InputTest.llIlIllIlIlIlI[17]] = lIIlIlIlIlIIIlIl("PMCEaJk6IYM=", "QaMwO");
        InputTest.llIlIllIlIIlIl[InputTest.llIlIllIlIlIlI[18]] = lIIlIlIlIlIIIlIl("K+fg1Wb8UA8=", "gzwAR");
        InputTest.llIlIllIlIIlIl[InputTest.llIlIllIlIlIlI[19]] = lIIlIlIlIlIIIllI("sI6fflOyN2xwNNXCJ0l2dw==", "iDDiz");
        InputTest.llIlIllIlIIlIl[InputTest.llIlIllIlIlIlI[20]] = lIIlIlIlIlIIIlIl("agIG6IpTTN8=", "EYwMf");
        InputTest.llIlIllIlIIlIl[InputTest.llIlIllIlIlIlI[21]] = lIIlIlIlIlIIIllI("Lx1I5M/WCsc=", "kQwBX");
        InputTest.llIlIllIlIIlIl[InputTest.llIlIllIlIlIlI[22]] = lIIlIlIlIlIIIlll("MQUTNho3DWA=", "rIZuQ");
        InputTest.llIlIllIlIIlIl[InputTest.llIlIllIlIlIlI[23]] = lIIlIlIlIlIIIllI("9wnfyVA20Aw=", "iywEF");
        InputTest.llIlIllIlIIlIl[InputTest.llIlIllIlIlIlI[24]] = lIIlIlIlIlIIIllI("KW+7RMbi5TE=", "fgtOf");
        InputTest.llIlIllIlIIlIl[InputTest.llIlIllIlIlIlI[25]] = lIIlIlIlIlIIIlll("JhwiBi5LBD8QLgdTOho9DhdtVQ==", "ksWuK");
    }
    
    private static void lIIlIlIlIlIlIIIl() {
        (llIlIllIlIlIlI = new int[28])[0] = ((0x75 ^ 0x6E) & ~(0x5 ^ 0x1E));
        InputTest.llIlIllIlIlIlI[1] = " ".length();
        InputTest.llIlIllIlIlIlI[2] = (0x2C ^ 0x2A);
        InputTest.llIlIllIlIlIlI[3] = "  ".length();
        InputTest.llIlIllIlIlIlI[4] = "   ".length();
        InputTest.llIlIllIlIlIlI[5] = (0x8C ^ 0x88);
        InputTest.llIlIllIlIlIlI[6] = (0x5B ^ 0x70 ^ (0x5C ^ 0x72));
        InputTest.llIlIllIlIlIlI[7] = (0xAC ^ 0x9B) + (2 + 117 - 96 + 109) - (0x5D ^ 0x1A) + (0xED ^ 0xB9);
        InputTest.llIlIllIlIlIlI[8] = (0x76 ^ 0x5C);
        InputTest.llIlIllIlIlIlI[9] = (0xF4 ^ 0xC2);
        InputTest.llIlIllIlIlIlI[10] = (0xFD ^ 0xC4);
        InputTest.llIlIllIlIlIlI[11] = (0x3A ^ 0x5B ^ (0x6B ^ 0x31));
        InputTest.llIlIllIlIlIlI[12] = (0xFFFF96DF & 0x6B78);
        InputTest.llIlIllIlIlIlI[13] = (0x74 ^ 0x73);
        InputTest.llIlIllIlIlIlI[14] = (0xB6 ^ 0x94 ^ (0xB9 ^ 0x93));
        InputTest.llIlIllIlIlIlI[15] = (0x6B ^ 0x62);
        InputTest.llIlIllIlIlIlI[16] = (0x73 ^ 0x79);
        InputTest.llIlIllIlIlIlI[17] = (0xBD ^ 0x83 ^ (0x46 ^ 0x73));
        InputTest.llIlIllIlIlIlI[18] = (0x72 ^ 0x7E);
        InputTest.llIlIllIlIlIlI[19] = (0x9A ^ 0x97);
        InputTest.llIlIllIlIlIlI[20] = (0x65 ^ 0x6B);
        InputTest.llIlIllIlIlIlI[21] = (0xB0 ^ 0xC0 ^ 48 + 52 + 4 + 23);
        InputTest.llIlIllIlIlIlI[22] = (0x83 ^ 0x93);
        InputTest.llIlIllIlIlIlI[23] = (0x58 ^ 0x1F ^ (0x75 ^ 0x23));
        InputTest.llIlIllIlIlIlI[24] = (107 + 139 - 111 + 6 ^ 79 + 99 - 161 + 142);
        InputTest.llIlIllIlIlIlI[25] = (52 + 73 - 33 + 93 ^ 126 + 118 - 187 + 113);
        InputTest.llIlIllIlIlIlI[26] = (-(0xFFFFFDDB & 0x5E2F) & (0xFFFFDFBF & 0x7F6A));
        InputTest.llIlIllIlIlIlI[27] = (0xBB ^ 0xAF);
    }
    
    @Override
    public void mousePressed(final int llllllllllllIllIlIIlIllIllIIlIII, final int llllllllllllIllIlIIlIllIllIIIlll, final int llllllllllllIllIlIIlIllIllIIlIlI) {
        if (lIIlIlIlIlIlIllI(llllllllllllIllIlIIlIllIllIIlIII)) {
            this.buttonDown = (InputTest.llIlIllIlIlIlI[1] != 0);
        }
        this.message = String.valueOf(new StringBuilder().append(InputTest.llIlIllIlIIlIl[InputTest.llIlIllIlIlIlI[16]]).append(llllllllllllIllIlIIlIllIllIIlIII).append(InputTest.llIlIllIlIIlIl[InputTest.llIlIllIlIlIlI[17]]).append(llllllllllllIllIlIIlIllIllIIIlll).append(InputTest.llIlIllIlIIlIl[InputTest.llIlIllIlIlIlI[18]]).append(llllllllllllIllIlIIlIllIllIIlIlI));
    }
    
    public InputTest() {
        super(InputTest.llIlIllIlIIlIl[InputTest.llIlIllIlIlIlI[0]]);
        this.message = InputTest.llIlIllIlIIlIl[InputTest.llIlIllIlIlIlI[1]];
        this.lines = new ArrayList();
        final Color[] cols = new Color[InputTest.llIlIllIlIlIlI[2]];
        cols[InputTest.llIlIllIlIlIlI[0]] = Color.red;
        cols[InputTest.llIlIllIlIlIlI[1]] = Color.green;
        cols[InputTest.llIlIllIlIlIlI[3]] = Color.blue;
        cols[InputTest.llIlIllIlIlIlI[4]] = Color.white;
        cols[InputTest.llIlIllIlIlIlI[5]] = Color.magenta;
        cols[InputTest.llIlIllIlIlIlI[6]] = Color.cyan;
        this.cols = cols;
    }
    
    private static String lIIlIlIlIlIIIlIl(final String llllllllllllIllIlIIlIllIIlllIlIl, final String llllllllllllIllIlIIlIllIIlllIllI) {
        try {
            final SecretKeySpec llllllllllllIllIlIIlIllIIllllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIlIllIIlllIllI.getBytes(StandardCharsets.UTF_8)), InputTest.llIlIllIlIlIlI[14]), "DES");
            final Cipher llllllllllllIllIlIIlIllIIllllIIl = Cipher.getInstance("DES");
            llllllllllllIllIlIIlIllIIllllIIl.init(InputTest.llIlIllIlIlIlI[3], llllllllllllIllIlIIlIllIIllllIlI);
            return new String(llllllllllllIllIlIIlIllIIllllIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIlIllIIlllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIIlIllIIllllIII) {
            llllllllllllIllIlIIlIllIIllllIII.printStackTrace();
            return null;
        }
    }
    
    public void render(final GameContainer llllllllllllIllIlIIlIllIllllllII, final Graphics llllllllllllIllIlIIlIllIllllIlll) {
        llllllllllllIllIlIIlIllIllllIlll.drawString(String.valueOf(new StringBuilder().append(InputTest.llIlIllIlIIlIl[InputTest.llIlIllIlIlIlI[3]]).append(this.lshift)), 100.0f, 240.0f);
        llllllllllllIllIlIIlIllIllllIlll.drawString(String.valueOf(new StringBuilder().append(InputTest.llIlIllIlIIlIl[InputTest.llIlIllIlIlIlI[4]]).append(this.rshift)), 100.0f, 260.0f);
        llllllllllllIllIlIIlIllIllllIlll.drawString(String.valueOf(new StringBuilder().append(InputTest.llIlIllIlIIlIl[InputTest.llIlIllIlIlIlI[5]]).append(this.space)), 100.0f, 280.0f);
        llllllllllllIllIlIIlIllIllllIlll.setColor(Color.white);
        llllllllllllIllIlIIlIllIllllIlll.drawString(this.message, 10.0f, 50.0f);
        llllllllllllIllIlIIlIllIllllIlll.drawString(String.valueOf(new StringBuilder().append(InputTest.llIlIllIlIIlIl[InputTest.llIlIllIlIlIlI[6]]).append(llllllllllllIllIlIIlIllIllllllII.getInput().getMouseY())), 10.0f, 400.0f);
        llllllllllllIllIlIIlIllIllllIlll.drawString(InputTest.llIlIllIlIIlIl[InputTest.llIlIllIlIlIlI[2]], 10.0f, 90.0f);
        int llllllllllllIllIlIIlIllIlllllllI = InputTest.llIlIllIlIlIlI[0];
        while (lIIlIlIlIlIlIIll(llllllllllllIllIlIIlIllIlllllllI, this.lines.size())) {
            final Line llllllllllllIllIlIIlIllIllllllll = this.lines.get(llllllllllllIllIlIIlIllIlllllllI);
            llllllllllllIllIlIIlIllIllllllll.draw(llllllllllllIllIlIIlIllIllllIlll);
            ++llllllllllllIllIlIIlIllIlllllllI;
            "".length();
            if (" ".length() > "  ".length()) {
                return;
            }
        }
        llllllllllllIllIlIIlIllIllllIlll.setColor(this.cols[this.index]);
        llllllllllllIllIlIIlIllIllllIlll.fillOval((float)(int)this.x, (float)(int)this.y, 50.0f, 50.0f);
        llllllllllllIllIlIIlIllIllllIlll.setColor(Color.yellow);
        llllllllllllIllIlIIlIllIllllIlll.fillRect(50.0f, (float)(InputTest.llIlIllIlIlIlI[7] + this.ypos), 40.0f, 40.0f);
    }
    
    @Override
    public void keyPressed(final int llllllllllllIllIlIIlIllIllIlllll, final char llllllllllllIllIlIIlIllIllIllllI) {
        if (lIIlIlIlIlIlIlII(llllllllllllIllIlIIlIllIllIlllll, InputTest.llIlIllIlIlIlI[1])) {
            System.exit(InputTest.llIlIllIlIlIlI[0]);
        }
        if (lIIlIlIlIlIlIlII(llllllllllllIllIlIIlIllIllIlllll, InputTest.llIlIllIlIlIlI[11]) && lIIlIlIlIlIlIlIl(this.app)) {
            try {
                this.app.setDisplayMode(InputTest.llIlIllIlIlIlI[12], InputTest.llIlIllIlIlIlI[12], (boolean)(InputTest.llIlIllIlIlIlI[0] != 0));
                this.app.reinit();
                "".length();
                if (-" ".length() >= ((0xBC ^ 0x86) & ~(0x86 ^ 0xBC))) {
                    return;
                }
            }
            catch (Exception llllllllllllIllIlIIlIllIlllIIIIl) {
                Log.error(llllllllllllIllIlIIlIllIlllIIIIl);
            }
        }
    }
    
    @Override
    public void mouseClicked(final int llllllllllllIllIlIIlIllIlIllIlIl, final int llllllllllllIllIlIIlIllIlIllIIIl, final int llllllllllllIllIlIIlIllIlIllIIll, final int llllllllllllIllIlIIlIllIlIllIIlI) {
        System.out.println(String.valueOf(new StringBuilder().append(InputTest.llIlIllIlIIlIl[InputTest.llIlIllIlIlIlI[22]]).append(llllllllllllIllIlIIlIllIlIllIIIl).append(InputTest.llIlIllIlIIlIl[InputTest.llIlIllIlIlIlI[23]]).append(llllllllllllIllIlIIlIllIlIllIIll).append(InputTest.llIlIllIlIIlIl[InputTest.llIlIllIlIlIlI[24]]).append(llllllllllllIllIlIIlIllIlIllIIlI)));
    }
    
    private static String lIIlIlIlIlIIIllI(final String llllllllllllIllIlIIlIllIlIIIIlII, final String llllllllllllIllIlIIlIllIlIIIIIll) {
        try {
            final SecretKeySpec llllllllllllIllIlIIlIllIlIIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIlIllIlIIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlIIlIllIlIIIIllI = Cipher.getInstance("Blowfish");
            llllllllllllIllIlIIlIllIlIIIIllI.init(InputTest.llIlIllIlIlIlI[3], llllllllllllIllIlIIlIllIlIIIIlll);
            return new String(llllllllllllIllIlIIlIllIlIIIIllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIlIllIlIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIIlIllIlIIIIlIl) {
            llllllllllllIllIlIIlIllIlIIIIlIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void mouseWheelMoved(final int llllllllllllIllIlIIlIllIlIlIlIll) {
        this.message = String.valueOf(new StringBuilder().append(InputTest.llIlIllIlIIlIl[InputTest.llIlIllIlIlIlI[25]]).append(llllllllllllIllIlIIlIllIlIlIlIll));
        if (lIIlIlIlIlIlIlll(llllllllllllIllIlIIlIllIlIlIlIll)) {
            this.ypos -= InputTest.llIlIllIlIlIlI[16];
        }
        if (lIIlIlIlIlIllIII(llllllllllllIllIlIIlIllIlIlIlIll)) {
            this.ypos += InputTest.llIlIllIlIlIlI[16];
        }
    }
    
    @Override
    public void controllerButtonPressed(final int llllllllllllIllIlIIlIllIlIIlIlIl, final int llllllllllllIllIlIIlIllIlIIlIIIl) {
        super.controllerButtonPressed(llllllllllllIllIlIIlIllIlIIlIlIl, llllllllllllIllIlIIlIllIlIIlIIIl);
        this.index += InputTest.llIlIllIlIlIlI[1];
        this.index %= this.cols.length;
    }
    
    private static boolean lIIlIlIlIlIlIIlI(final int llllllllllllIllIlIIlIllIIlIIlllI) {
        return llllllllllllIllIlIIlIllIIlIIlllI != 0;
    }
    
    private static boolean lIIlIlIlIlIlIllI(final int llllllllllllIllIlIIlIllIIlIIllII) {
        return llllllllllllIllIlIIlIllIIlIIllII == 0;
    }
    
    @Override
    public void init(final GameContainer llllllllllllIllIlIIlIlllIIIlIllI) throws SlickException {
        if (lIIlIlIlIlIlIIlI((llllllllllllIllIlIIlIlllIIIlIllI instanceof AppGameContainer) ? 1 : 0)) {
            this.app = (AppGameContainer)llllllllllllIllIlIIlIlllIIIlIllI;
        }
        this.input = llllllllllllIllIlIIlIlllIIIlIllI.getInput();
        this.x = 300.0f;
        this.y = 300.0f;
    }
    
    @Override
    public void update(final GameContainer llllllllllllIllIlIIlIllIlllIIllI, final int llllllllllllIllIlIIlIllIlllIIlIl) {
        this.lshift = llllllllllllIllIlIIlIllIlllIIllI.getInput().isKeyDown(InputTest.llIlIllIlIlIlI[8]);
        this.rshift = llllllllllllIllIlIIlIllIlllIIllI.getInput().isKeyDown(InputTest.llIlIllIlIlIlI[9]);
        this.space = llllllllllllIllIlIIlIllIlllIIllI.getInput().isKeyDown(InputTest.llIlIllIlIlIlI[10]);
        if (lIIlIlIlIlIlIIlI(this.controllerLeft[InputTest.llIlIllIlIlIlI[0]] ? 1 : 0)) {
            this.x -= llllllllllllIllIlIIlIllIlllIIlIl * 0.1f;
        }
        if (lIIlIlIlIlIlIIlI(this.controllerRight[InputTest.llIlIllIlIlIlI[0]] ? 1 : 0)) {
            this.x += llllllllllllIllIlIIlIllIlllIIlIl * 0.1f;
        }
        if (lIIlIlIlIlIlIIlI(this.controllerUp[InputTest.llIlIllIlIlIlI[0]] ? 1 : 0)) {
            this.y -= llllllllllllIllIlIIlIllIlllIIlIl * 0.1f;
        }
        if (lIIlIlIlIlIlIIlI(this.controllerDown[InputTest.llIlIllIlIlIlI[0]] ? 1 : 0)) {
            this.y += llllllllllllIllIlIIlIllIlllIIlIl * 0.1f;
        }
    }
    
    private static boolean lIIlIlIlIlIlIlIl(final Object llllllllllllIllIlIIlIllIIlIlIIII) {
        return llllllllllllIllIlIIlIllIIlIlIIII != null;
    }
    
    private static boolean lIIlIlIlIlIllIII(final int llllllllllllIllIlIIlIllIIlIIlIII) {
        return llllllllllllIllIlIIlIllIIlIIlIII > 0;
    }
    
    @Override
    public void mouseMoved(final int llllllllllllIllIlIIlIllIlIlIIIlI, final int llllllllllllIllIlIIlIllIlIlIIIIl, final int llllllllllllIllIlIIlIllIlIIllIll, final int llllllllllllIllIlIIlIllIlIIlllll) {
        if (lIIlIlIlIlIlIIlI(this.buttonDown ? 1 : 0)) {
            this.lines.add(new Line(llllllllllllIllIlIIlIllIlIlIIIlI, llllllllllllIllIlIIlIllIlIlIIIIl, llllllllllllIllIlIIlIllIlIIllIll, llllllllllllIllIlIIlIllIlIIlllll));
            "".length();
        }
    }
    
    static {
        lIIlIlIlIlIlIIIl();
        lIIlIlIlIlIIlllI();
    }
    
    private static boolean lIIlIlIlIlIlIIll(final int llllllllllllIllIlIIlIllIIlIlIIll, final int llllllllllllIllIlIIlIllIIlIlIIlI) {
        return llllllllllllIllIlIIlIllIIlIlIIll < llllllllllllIllIlIIlIllIIlIlIIlI;
    }
    
    private static String lIIlIlIlIlIIIlll(String llllllllllllIllIlIIlIllIIllIIIlI, final String llllllllllllIllIlIIlIllIIllIIIIl) {
        llllllllllllIllIlIIlIllIIllIIIlI = new String(Base64.getDecoder().decode(llllllllllllIllIlIIlIllIIllIIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIIlIllIIllIIlIl = new StringBuilder();
        final char[] llllllllllllIllIlIIlIllIIllIIlII = llllllllllllIllIlIIlIllIIllIIIIl.toCharArray();
        int llllllllllllIllIlIIlIllIIllIIIll = InputTest.llIlIllIlIlIlI[0];
        final boolean llllllllllllIllIlIIlIllIIlIlllIl = (Object)llllllllllllIllIlIIlIllIIllIIIlI.toCharArray();
        final boolean llllllllllllIllIlIIlIllIIlIlllII = llllllllllllIllIlIIlIllIIlIlllIl.length != 0;
        char llllllllllllIllIlIIlIllIIlIllIll = (char)InputTest.llIlIllIlIlIlI[0];
        while (lIIlIlIlIlIlIIll(llllllllllllIllIlIIlIllIIlIllIll, llllllllllllIllIlIIlIllIIlIlllII ? 1 : 0)) {
            final char llllllllllllIllIlIIlIllIIllIlIII = llllllllllllIllIlIIlIllIIlIlllIl[llllllllllllIllIlIIlIllIIlIllIll];
            llllllllllllIllIlIIlIllIIllIIlIl.append((char)(llllllllllllIllIlIIlIllIIllIlIII ^ llllllllllllIllIlIIlIllIIllIIlII[llllllllllllIllIlIIlIllIIllIIIll % llllllllllllIllIlIIlIllIIllIIlII.length]));
            "".length();
            ++llllllllllllIllIlIIlIllIIllIIIll;
            ++llllllllllllIllIlIIlIllIIlIllIll;
            "".length();
            if ((93 + 40 - 104 + 129 ^ 59 + 82 - 54 + 67) == 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIIlIllIIllIIlIl);
    }
    
    @Override
    public void keyReleased(final int llllllllllllIllIlIIlIllIllIlIIll, final char llllllllllllIllIlIIlIllIllIlIlIl) {
        this.message = String.valueOf(new StringBuilder().append(InputTest.llIlIllIlIIlIl[InputTest.llIlIllIlIlIlI[13]]).append(llllllllllllIllIlIIlIllIllIlIIll).append(InputTest.llIlIllIlIIlIl[InputTest.llIlIllIlIlIlI[14]]).append(llllllllllllIllIlIIlIllIllIlIlIl).append(InputTest.llIlIllIlIIlIl[InputTest.llIlIllIlIlIlI[15]]));
    }
    
    public static void main(final String[] llllllllllllIllIlIIlIllIlIIIllIl) {
        try {
            final AppGameContainer llllllllllllIllIlIIlIllIlIIIllll = new AppGameContainer(new InputTest());
            llllllllllllIllIlIIlIllIlIIIllll.setDisplayMode(InputTest.llIlIllIlIlIlI[26], InputTest.llIlIllIlIlIlI[12], (boolean)(InputTest.llIlIllIlIlIlI[0] != 0));
            llllllllllllIllIlIIlIllIlIIIllll.start();
            "".length();
            if ("   ".length() == " ".length()) {
                return;
            }
        }
        catch (SlickException llllllllllllIllIlIIlIllIlIIIlllI) {
            llllllllllllIllIlIIlIllIlIIIlllI.printStackTrace();
        }
    }
    
    private static boolean lIIlIlIlIlIlIlll(final int llllllllllllIllIlIIlIllIIlIIlIlI) {
        return llllllllllllIllIlIIlIllIIlIIlIlI < 0;
    }
    
    private class Line
    {
        private /* synthetic */ int oldx;
        private /* synthetic */ int newy;
        private /* synthetic */ int newx;
        private /* synthetic */ int oldy;
        
        public void draw(final Graphics llllllllllllIllIIllIllIllIIIlIll) {
            llllllllllllIllIIllIllIllIIIlIll.drawLine((float)this.oldx, (float)this.oldy, (float)this.newx, (float)this.newy);
        }
        
        public Line(final int llllllllllllIllIIllIllIllIIlIlII, final int llllllllllllIllIIllIllIllIIlIIll, final int llllllllllllIllIIllIllIllIIllIII, final int llllllllllllIllIIllIllIllIIlIIIl) {
            this.oldx = llllllllllllIllIIllIllIllIIlIlII;
            this.oldy = llllllllllllIllIIllIllIllIIlIIll;
            this.newx = llllllllllllIllIIllIllIllIIllIII;
            this.newy = llllllllllllIllIIllIllIllIIlIIIl;
        }
    }
}
