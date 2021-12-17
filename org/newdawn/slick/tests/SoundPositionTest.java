// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import java.util.Arrays;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.openal.SoundStore;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Music;
import org.newdawn.slick.BasicGame;

public class SoundPositionTest extends BasicGame
{
    private /* synthetic */ Music music;
    private static final /* synthetic */ int[] lllIlIlIIIIIll;
    private /* synthetic */ GameContainer myContainer;
    private /* synthetic */ int[] engines;
    private static final /* synthetic */ String[] lllIlIlIIIIIIl;
    
    private static String lIlIIIlIlIIlllII(final String llllllllllllIlIllIllIllllllllIII, final String llllllllllllIlIllIllIlllllllIlll) {
        try {
            final SecretKeySpec llllllllllllIlIllIllIlllllllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIllIlllllllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllIllIllllllllIlI = Cipher.getInstance("Blowfish");
            llllllllllllIlIllIllIllllllllIlI.init(SoundPositionTest.lllIlIlIIIIIll[4], llllllllllllIlIllIllIlllllllllII);
            return new String(llllllllllllIlIllIllIllllllllIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIllIllllllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIllIllllllllIIl) {
            llllllllllllIlIllIllIllllllllIIl.printStackTrace();
            return null;
        }
    }
    
    private static void lIlIIIlIlIlIIIll() {
        (lllIlIlIIIIIll = new int[12])[0] = ((0xB1 ^ 0x89 ^ (0xAF ^ 0xC4)) & (0x31 ^ 0x42 ^ (0x2F ^ 0xF) ^ -" ".length()));
        SoundPositionTest.lllIlIlIIIIIll[1] = "   ".length();
        SoundPositionTest.lllIlIlIIIIIll[2] = (35 + 78 - 94 + 128 ^ 130 + 137 - 91 + 3);
        SoundPositionTest.lllIlIlIIIIIll[3] = " ".length();
        SoundPositionTest.lllIlIlIIIIIll[4] = "  ".length();
        SoundPositionTest.lllIlIlIIIIIll[5] = (73 + 72 - 105 + 90 ^ 133 + 70 - 97 + 28);
        SoundPositionTest.lllIlIlIIIIIll[6] = (0x56 ^ 0x6F);
        SoundPositionTest.lllIlIlIIIIIll[7] = (0x68 ^ 0xA) + (0xEC ^ 0x9F) - (0xE7 ^ 0xA1) + (0xA9 ^ 0x97);
        SoundPositionTest.lllIlIlIIIIIll[8] = (0xFFFFB7BE & 0x4B61);
        SoundPositionTest.lllIlIlIIIIIll[9] = (-(0xFFFFE0A7 & 0x3F7D) & (0xFFFFF27C & 0x2FFF));
        SoundPositionTest.lllIlIlIIIIIll[10] = (0x1B ^ 0x1E);
        SoundPositionTest.lllIlIlIIIIIll[11] = (0x6 ^ 0x4A ^ (0x6A ^ 0x2E));
    }
    
    @Override
    public void keyPressed(final int llllllllllllIlIllIlllIIIIIIIllll, final char llllllllllllIlIllIlllIIIIIIIlllI) {
        if (lIlIIIlIlIlIIlII(llllllllllllIlIllIlllIIIIIIIllll, SoundPositionTest.lllIlIlIIIIIll[6])) {
            if (lIlIIIlIlIlIIlIl(this.music.playing() ? 1 : 0)) {
                this.music.pause();
                "".length();
                if (" ".length() == (0x8E ^ 0x8A)) {
                    return;
                }
            }
            else {
                this.music.resume();
            }
        }
        if (lIlIIIlIlIlIIlII(llllllllllllIlIllIlllIIIIIIIllll, SoundPositionTest.lllIlIlIIIIIll[7])) {
            this.music.setPosition(this.music.getPosition() + 5.0f);
            "".length();
        }
    }
    
    @Override
    public void init(final GameContainer llllllllllllIlIllIlllIIIIIIlllIl) throws SlickException {
        SoundStore.get().setMaxSources(SoundPositionTest.lllIlIlIIIIIll[2]);
        this.myContainer = llllllllllllIlIllIlllIIIIIIlllIl;
        this.music = new Music(SoundPositionTest.lllIlIlIIIIIIl[SoundPositionTest.lllIlIlIIIIIll[3]], (boolean)(SoundPositionTest.lllIlIlIIIIIll[3] != 0));
        this.music.play();
    }
    
    @Override
    public void update(final GameContainer llllllllllllIlIllIlllIIIIIIlIlII, final int llllllllllllIlIllIlllIIIIIIlIIll) {
    }
    
    private static boolean lIlIIIlIlIlIIlIl(final int llllllllllllIlIllIllIlllllIlIlII) {
        return llllllllllllIlIllIllIlllllIlIlII != 0;
    }
    
    public SoundPositionTest() {
        super(SoundPositionTest.lllIlIlIIIIIIl[SoundPositionTest.lllIlIlIIIIIll[0]]);
        this.engines = new int[SoundPositionTest.lllIlIlIIIIIll[1]];
    }
    
    private static void lIlIIIlIlIlIIIlI() {
        (lllIlIlIIIIIIl = new String[SoundPositionTest.lllIlIlIIIIIll[10]])[SoundPositionTest.lllIlIlIIIIIll[0]] = lIlIIIlIlIIlllII("RINtYedFQTooi28Igf94Z1sOss+xMb9Y", "lwcZe");
        SoundPositionTest.lllIlIlIIIIIIl[SoundPositionTest.lllIlIlIIIIIll[3]] = lIlIIIlIlIIlllIl("tUoaSAiFtFPnL7RQteiz8PwGKo3MDmfu", "RvAwd");
        SoundPositionTest.lllIlIlIIIIIIl[SoundPositionTest.lllIlIlIIIIIll[4]] = lIlIIIlIlIIlllII("UVC5VZtqOe72NzIOwzxyIg==", "MqonG");
        SoundPositionTest.lllIlIlIIIIIIl[SoundPositionTest.lllIlIlIIIIIll[1]] = lIlIIIlIlIIlllII("vMZEz0eFoZbKj8/8FqEvDlYQWwSmFQ82", "Ehkiz");
        SoundPositionTest.lllIlIlIIIIIIl[SoundPositionTest.lllIlIlIIIIIll[5]] = lIlIIIlIlIIlllII("tGzwVm8tHhqR5hRxBvDyYJDzkb+gUOnvq1PTCGfhgL0=", "oIEYh");
    }
    
    private static String lIlIIIlIlIIlllIl(final String llllllllllllIlIllIllIlllllIlllIl, final String llllllllllllIlIllIllIlllllIllllI) {
        try {
            final SecretKeySpec llllllllllllIlIllIllIllllllIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIllIlllllIllllI.getBytes(StandardCharsets.UTF_8)), SoundPositionTest.lllIlIlIIIIIll[11]), "DES");
            final Cipher llllllllllllIlIllIllIllllllIIIIl = Cipher.getInstance("DES");
            llllllllllllIlIllIllIllllllIIIIl.init(SoundPositionTest.lllIlIlIIIIIll[4], llllllllllllIlIllIllIllllllIIIlI);
            return new String(llllllllllllIlIllIllIllllllIIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIllIlllllIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIllIllllllIIIII) {
            llllllllllllIlIllIllIllllllIIIII.printStackTrace();
            return null;
        }
    }
    
    public static void main(final String[] llllllllllllIlIllIlllIIIIIIIlIII) {
        try {
            final AppGameContainer llllllllllllIlIllIlllIIIIIIIlIlI = new AppGameContainer(new SoundPositionTest());
            llllllllllllIlIllIlllIIIIIIIlIlI.setDisplayMode(SoundPositionTest.lllIlIlIIIIIll[8], SoundPositionTest.lllIlIlIIIIIll[9], (boolean)(SoundPositionTest.lllIlIlIIIIIll[0] != 0));
            llllllllllllIlIllIlllIIIIIIIlIlI.start();
            "".length();
            if (-(0xD3 ^ 0xBB ^ (0x17 ^ 0x7B)) > 0) {
                return;
            }
        }
        catch (SlickException llllllllllllIlIllIlllIIIIIIIlIIl) {
            llllllllllllIlIllIlllIIIIIIIlIIl.printStackTrace();
        }
    }
    
    public void render(final GameContainer llllllllllllIlIllIlllIIIIIIllIIl, final Graphics llllllllllllIlIllIlllIIIIIIllIII) {
        llllllllllllIlIllIlllIIIIIIllIII.setColor(Color.white);
        llllllllllllIlIllIlllIIIIIIllIII.drawString(String.valueOf(new StringBuilder().append(SoundPositionTest.lllIlIlIIIIIIl[SoundPositionTest.lllIlIlIIIIIll[4]]).append(this.music.getPosition())), 100.0f, 100.0f);
        llllllllllllIlIllIlllIIIIIIllIII.drawString(SoundPositionTest.lllIlIlIIIIIIl[SoundPositionTest.lllIlIlIIIIIll[1]], 100.0f, 130.0f);
        llllllllllllIlIllIlllIIIIIIllIII.drawString(SoundPositionTest.lllIlIlIIIIIIl[SoundPositionTest.lllIlIlIIIIIll[5]], 100.0f, 145.0f);
    }
    
    private static boolean lIlIIIlIlIlIIlII(final int llllllllllllIlIllIllIlllllIlIlll, final int llllllllllllIlIllIllIlllllIlIllI) {
        return llllllllllllIlIllIllIlllllIlIlll == llllllllllllIlIllIllIlllllIlIllI;
    }
    
    static {
        lIlIIIlIlIlIIIll();
        lIlIIIlIlIlIIIlI();
    }
}
