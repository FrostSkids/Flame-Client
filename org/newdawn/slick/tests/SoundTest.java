// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import java.util.Arrays;
import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import java.io.IOException;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.openal.AudioLoader;
import org.newdawn.slick.util.ResourceLoader;
import org.newdawn.slick.openal.SoundStore;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.openal.Audio;
import org.newdawn.slick.Music;
import org.newdawn.slick.Sound;
import org.newdawn.slick.BasicGame;

public class SoundTest extends BasicGame
{
    private /* synthetic */ Sound sound;
    private /* synthetic */ int volume;
    private static final /* synthetic */ String[] lllllIlIlIIIl;
    private /* synthetic */ Music musicb;
    private static final /* synthetic */ int[] lllllIllIIIll;
    private /* synthetic */ int[] engines;
    private /* synthetic */ Sound burp;
    private /* synthetic */ Audio engine;
    private /* synthetic */ Music music;
    private /* synthetic */ Sound charlie;
    private /* synthetic */ Music musica;
    private /* synthetic */ GameContainer myContainer;
    
    private static void lIlIlllIlllIIII() {
        (lllllIllIIIll = new int[39])[0] = ((0xF0 ^ 0xC3 ^ (0x1E ^ 0x33)) & (162 + 134 - 295 + 168 ^ 87 + 174 - 135 + 57 ^ -" ".length()));
        SoundTest.lllllIllIIIll[1] = (84 + 100 - 56 + 5 ^ 92 + 55 - 107 + 103);
        SoundTest.lllllIllIIIll[2] = "   ".length();
        SoundTest.lllllIllIIIll[3] = (0x39 ^ 0x43 ^ (0xDA ^ 0x80));
        SoundTest.lllllIllIIIll[4] = " ".length();
        SoundTest.lllllIllIIIll[5] = "  ".length();
        SoundTest.lllllIllIIIll[6] = (0x28 ^ 0x2C);
        SoundTest.lllllIllIIIll[7] = (72 + 113 - 45 + 2 ^ 25 + 111 - 24 + 27);
        SoundTest.lllllIllIIIll[8] = (0xE ^ 0x8);
        SoundTest.lllllIllIIIll[9] = (0x66 ^ 0x25 ^ (0x23 ^ 0x67));
        SoundTest.lllllIllIIIll[10] = (0x8C ^ 0x84);
        SoundTest.lllllIllIIIll[11] = (0x12 ^ 0x1B);
        SoundTest.lllllIllIIIll[12] = (0x75 ^ 0x7E);
        SoundTest.lllllIllIIIll[13] = (0x98 ^ 0x8F ^ (0x80 ^ 0x9B));
        SoundTest.lllllIllIIIll[14] = (0x70 ^ 0x43 ^ (0x33 ^ 0xD));
        SoundTest.lllllIllIIIll[15] = (0x3C ^ 0x32);
        SoundTest.lllllIllIIIll[16] = (0xE ^ 0x1);
        SoundTest.lllllIllIIIll[17] = (0x7B ^ 0x7F ^ (0x5C ^ 0x48));
        SoundTest.lllllIllIIIll[18] = (103 + 35 - 87 + 106 ^ 48 + 58 + 7 + 27);
        SoundTest.lllllIllIIIll[19] = (0x9 ^ 0x3D ^ (0x7A ^ 0x5C));
        SoundTest.lllllIllIIIll[20] = (0x3C ^ 0x2F);
        SoundTest.lllllIllIIIll[21] = (187 + 182 - 338 + 182 ^ 148 + 116 - 200 + 129);
        SoundTest.lllllIllIIIll[22] = (0x89 ^ 0x9C);
        SoundTest.lllllIllIIIll[23] = (0x9F ^ 0xA6);
        SoundTest.lllllIllIIIll[24] = (0xF3 ^ 0xA2 ^ (0xC9 ^ 0xA8));
        SoundTest.lllllIllIIIll[25] = (0x8F ^ 0x89 ^ (0x3D ^ 0x25));
        SoundTest.lllllIllIIIll[26] = (0x3A ^ 0x31 ^ (0x5C ^ 0x71));
        SoundTest.lllllIllIIIll[27] = (0x29 ^ 0x35);
        SoundTest.lllllIllIIIll[28] = (0x67 ^ 0x5A ^ (0x1D ^ 0x39));
        SoundTest.lllllIllIIIll[29] = (0xD8 ^ 0x97 ^ (0xE5 ^ 0x84));
        SoundTest.lllllIllIIIll[30] = (71 + 73 - 121 + 112 ^ 47 + 9 + 6 + 83);
        SoundTest.lllllIllIIIll[31] = (0x1C ^ 0xB);
        SoundTest.lllllIllIIIll[32] = (0x83 ^ 0xA8);
        SoundTest.lllllIllIIIll[33] = (0xE9 ^ 0xC4);
        SoundTest.lllllIllIIIll[34] = (0x28 ^ 0x3B ^ (0x29 ^ 0xB));
        SoundTest.lllllIllIIIll[35] = (0xA4 ^ 0x96);
        SoundTest.lllllIllIIIll[36] = (0xFFFF87A9 & 0x7B76);
        SoundTest.lllllIllIIIll[37] = (-(0xFFFFDFA3 & 0x2DFF) & (0xFFFFCFFF & 0x3FFA));
        SoundTest.lllllIllIIIll[38] = (0x37 ^ 0x2F);
    }
    
    private static boolean lIlIlllIlllIllI(final Object lllllllllllllIlIlIllIIlllIIlIllI, final Object lllllllllllllIlIlIllIIlllIIlIlIl) {
        return lllllllllllllIlIlIllIIlllIIlIllI == lllllllllllllIlIlIllIIlllIIlIlIl;
    }
    
    private static String lIlIlllIlIlIIlI(final String lllllllllllllIlIlIllIIllllIIllll, final String lllllllllllllIlIlIllIIllllIIllII) {
        try {
            final SecretKeySpec lllllllllllllIlIlIllIIllllIlIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIllIIllllIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlIllIIllllIlIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlIllIIllllIlIIIl.init(SoundTest.lllllIllIIIll[5], lllllllllllllIlIlIllIIllllIlIIlI);
            return new String(lllllllllllllIlIlIllIIllllIlIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIllIIllllIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIllIIllllIlIIII) {
            lllllllllllllIlIlIllIIllllIlIIII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void keyPressed(final int lllllllllllllIlIlIllIIlllllIIlII, final char lllllllllllllIlIlIllIIlllllIIIll) {
        if (lIlIlllIlllIIll(lllllllllllllIlIlIllIIlllllIIlII, SoundTest.lllllIllIIIll[4])) {
            System.exit(SoundTest.lllllIllIIIll[0]);
        }
        if (lIlIlllIlllIIll(lllllllllllllIlIlIllIIlllllIIlII, SoundTest.lllllIllIIIll[23])) {
            this.sound.play();
        }
        if (lIlIlllIlllIIll(lllllllllllllIlIlIllIIlllllIIlII, SoundTest.lllllIllIIIll[24])) {
            this.burp.play();
        }
        if (lIlIlllIlllIIll(lllllllllllllIlIlIllIIlllllIIlII, SoundTest.lllllIllIIIll[25])) {
            this.sound.playAt(-1.0f, 0.0f, 0.0f);
        }
        if (lIlIlllIlllIIll(lllllllllllllIlIlIllIIlllllIIlII, SoundTest.lllllIllIIIll[26])) {
            this.sound.playAt(1.0f, 0.0f, 0.0f);
        }
        if (lIlIlllIlllIIll(lllllllllllllIlIlIllIIlllllIIlII, SoundTest.lllllIllIIIll[27])) {
            this.charlie.play(1.0f, 1.0f);
        }
        if (lIlIlllIlllIIll(lllllllllllllIlIlIllIIlllllIIlII, SoundTest.lllllIllIIIll[28])) {
            if (lIlIlllIlllIlII(this.music.playing() ? 1 : 0)) {
                this.music.pause();
                "".length();
                if ((0x36 ^ 0x33) == 0x0) {
                    return;
                }
            }
            else {
                this.music.resume();
            }
        }
        if (lIlIlllIlllIIll(lllllllllllllIlIlIllIIlllllIIlII, SoundTest.lllllIllIIIll[29])) {
            this.music.stop();
            if (lIlIlllIlllIllI(this.music, this.musica)) {
                this.music = this.musicb;
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                this.music = this.musica;
            }
            this.music.loop();
        }
        int lllllllllllllIlIlIllIIlllllIlIlI = SoundTest.lllllIllIIIll[0];
        while (lIlIlllIlllIlll(lllllllllllllIlIlIllIIlllllIlIlI, SoundTest.lllllIllIIIll[2])) {
            if (lIlIlllIlllIIll(lllllllllllllIlIlIllIIlllllIIlII, SoundTest.lllllIllIIIll[5] + lllllllllllllIlIlIllIIlllllIlIlI)) {
                if (lIlIlllIlllIlII(this.engines[lllllllllllllIlIlIllIIlllllIlIlI])) {
                    System.out.println(String.valueOf(new StringBuilder().append(SoundTest.lllllIlIlIIIl[SoundTest.lllllIllIIIll[30]]).append(lllllllllllllIlIlIllIIlllllIlIlI)));
                    SoundStore.get().stopSoundEffect(this.engines[lllllllllllllIlIlIllIIlllllIlIlI]);
                    this.engines[lllllllllllllIlIlIllIIlllllIlIlI] = SoundTest.lllllIllIIIll[0];
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    System.out.println(String.valueOf(new StringBuilder().append(SoundTest.lllllIlIlIIIl[SoundTest.lllllIllIIIll[31]]).append(lllllllllllllIlIlIllIIlllllIlIlI)));
                    this.engines[lllllllllllllIlIlIllIIlllllIlIlI] = this.engine.playAsSoundEffect(1.0f, 1.0f, (boolean)(SoundTest.lllllIllIIIll[4] != 0));
                }
            }
            ++lllllllllllllIlIlIllIIlllllIlIlI;
            "".length();
            if (-(0x2A ^ 0x2E) > 0) {
                return;
            }
        }
        if (lIlIlllIlllIIll(lllllllllllllIlIlIllIIlllllIIIll, SoundTest.lllllIllIIIll[32])) {
            this.volume += SoundTest.lllllIllIIIll[4];
            this.setVolume();
        }
        if (lIlIlllIlllIIll(lllllllllllllIlIlIllIIlllllIIIll, SoundTest.lllllIllIIIll[33])) {
            this.volume -= SoundTest.lllllIllIIIll[4];
            this.setVolume();
        }
        if (lIlIlllIlllIIll(lllllllllllllIlIlIllIIlllllIIlII, SoundTest.lllllIllIIIll[22])) {
            int lllllllllllllIlIlIllIIlllllIlIIl = (int)(this.music.getVolume() * 10.0f);
            if (lIlIlllIllllIII(--lllllllllllllIlIlIllIIlllllIlIIl)) {
                lllllllllllllIlIlIllIIlllllIlIIl = SoundTest.lllllIllIIIll[0];
            }
            this.music.setVolume(lllllllllllllIlIlIllIIlllllIlIIl / 10.0f);
        }
        if (lIlIlllIlllIIll(lllllllllllllIlIlIllIIlllllIIlII, SoundTest.lllllIllIIIll[33])) {
            int lllllllllllllIlIlIllIIlllllIlIII = (int)(this.music.getVolume() * 10.0f);
            if (lIlIlllIllllIIl(++lllllllllllllIlIlIllIIlllllIlIII, SoundTest.lllllIllIIIll[1])) {
                lllllllllllllIlIlIllIIlllllIlIII = SoundTest.lllllIllIIIll[1];
            }
            this.music.setVolume(lllllllllllllIlIlIllIIlllllIlIII / 10.0f);
        }
        if (lIlIlllIlllIIll(lllllllllllllIlIlIllIIlllllIIlII, SoundTest.lllllIllIIIll[34])) {
            int lllllllllllllIlIlIllIIlllllIIlll = (int)(this.myContainer.getSoundVolume() * 10.0f);
            if (lIlIlllIllllIII(--lllllllllllllIlIlIllIIlllllIIlll)) {
                lllllllllllllIlIlIllIIlllllIIlll = SoundTest.lllllIllIIIll[0];
            }
            this.myContainer.setSoundVolume(lllllllllllllIlIlIllIIlllllIIlll / 10.0f);
        }
        if (lIlIlllIlllIIll(lllllllllllllIlIlIllIIlllllIIlII, SoundTest.lllllIllIIIll[35])) {
            int lllllllllllllIlIlIllIIlllllIIllI = (int)(this.myContainer.getSoundVolume() * 10.0f);
            if (lIlIlllIllllIIl(++lllllllllllllIlIlIllIIlllllIIllI, SoundTest.lllllIllIIIll[1])) {
                lllllllllllllIlIlIllIIlllllIIllI = SoundTest.lllllIllIIIll[1];
            }
            this.myContainer.setSoundVolume(lllllllllllllIlIlIllIIlllllIIllI / 10.0f);
        }
    }
    
    static {
        lIlIlllIlllIIII();
        lIlIlllIllIIIll();
    }
    
    @Override
    public void init(final GameContainer lllllllllllllIlIlIllIlIIIIIIIIIl) throws SlickException {
        SoundStore.get().setMaxSources(SoundTest.lllllIllIIIll[3]);
        this.myContainer = lllllllllllllIlIlIllIlIIIIIIIIIl;
        this.sound = new Sound(SoundTest.lllllIlIlIIIl[SoundTest.lllllIllIIIll[4]]);
        this.charlie = new Sound(SoundTest.lllllIlIlIIIl[SoundTest.lllllIllIIIll[5]]);
        try {
            this.engine = AudioLoader.getAudio(SoundTest.lllllIlIlIIIl[SoundTest.lllllIllIIIll[2]], ResourceLoader.getResourceAsStream(SoundTest.lllllIlIlIIIl[SoundTest.lllllIllIIIll[6]]));
            "".length();
            if ((0xC4 ^ 0x97 ^ (0x1D ^ 0x4A)) != (15 + 118 - 14 + 25 ^ 92 + 102 - 172 + 126)) {
                return;
            }
        }
        catch (IOException lllllllllllllIlIlIllIlIIIIIIIlIl) {
            throw new SlickException(SoundTest.lllllIlIlIIIl[SoundTest.lllllIllIIIll[7]], lllllllllllllIlIlIllIlIIIIIIIlIl);
        }
        final Music music = new Music(SoundTest.lllllIlIlIIIl[SoundTest.lllllIllIIIll[8]]);
        this.musica = music;
        this.music = music;
        this.musicb = new Music(SoundTest.lllllIlIlIIIl[SoundTest.lllllIllIIIll[9]], (boolean)(SoundTest.lllllIllIIIll[4] != 0));
        this.burp = new Sound(SoundTest.lllllIlIlIIIl[SoundTest.lllllIllIIIll[10]]);
        this.music.play();
    }
    
    private static String lIlIlllIlIlIlll(String lllllllllllllIlIlIllIIlllIlllIlI, final String lllllllllllllIlIlIllIIlllIlllIIl) {
        lllllllllllllIlIlIllIIlllIlllIlI = (Exception)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIlIllIIlllIlllIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlIllIIlllIllllIl = new StringBuilder();
        final char[] lllllllllllllIlIlIllIIlllIllllII = lllllllllllllIlIlIllIIlllIlllIIl.toCharArray();
        int lllllllllllllIlIlIllIIlllIlllIll = SoundTest.lllllIllIIIll[0];
        final long lllllllllllllIlIlIllIIlllIllIlIl = (Object)((String)lllllllllllllIlIlIllIIlllIlllIlI).toCharArray();
        final double lllllllllllllIlIlIllIIlllIllIlII = lllllllllllllIlIlIllIIlllIllIlIl.length;
        Exception lllllllllllllIlIlIllIIlllIllIIll = (Exception)SoundTest.lllllIllIIIll[0];
        while (lIlIlllIlllIlll((int)lllllllllllllIlIlIllIIlllIllIIll, (int)lllllllllllllIlIlIllIIlllIllIlII)) {
            final char lllllllllllllIlIlIllIIllllIIIIII = lllllllllllllIlIlIllIIlllIllIlIl[lllllllllllllIlIlIllIIlllIllIIll];
            lllllllllllllIlIlIllIIlllIllllIl.append((char)(lllllllllllllIlIlIllIIllllIIIIII ^ lllllllllllllIlIlIllIIlllIllllII[lllllllllllllIlIlIllIIlllIlllIll % lllllllllllllIlIlIllIIlllIllllII.length]));
            "".length();
            ++lllllllllllllIlIlIllIIlllIlllIll;
            ++lllllllllllllIlIlIllIIlllIllIIll;
            "".length();
            if (((25 + 120 - 144 + 132 ^ 123 + 90 - 115 + 40) & (0xC8 ^ 0xBC ^ (0x7E ^ 0x5) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlIllIIlllIllllIl);
    }
    
    private static boolean lIlIlllIlllIlll(final int lllllllllllllIlIlIllIIlllIIllllI, final int lllllllllllllIlIlIllIIlllIIlllIl) {
        return lllllllllllllIlIlIllIIlllIIllllI < lllllllllllllIlIlIllIIlllIIlllIl;
    }
    
    private static boolean lIlIlllIllllIII(final int lllllllllllllIlIlIllIIlllIIlIIIl) {
        return lllllllllllllIlIlIllIIlllIIlIIIl < 0;
    }
    
    private static boolean lIlIlllIlllIIll(final int lllllllllllllIlIlIllIIlllIlIIIlI, final int lllllllllllllIlIlIllIIlllIlIIIIl) {
        return lllllllllllllIlIlIllIIlllIlIIIlI == lllllllllllllIlIlIllIIlllIlIIIIl;
    }
    
    public void render(final GameContainer lllllllllllllIlIlIllIIllllllIllI, final Graphics lllllllllllllIlIlIllIIllllllIlIl) {
        lllllllllllllIlIlIllIIllllllIlIl.setColor(Color.white);
        lllllllllllllIlIlIllIIllllllIlIl.drawString(SoundTest.lllllIlIlIIIl[SoundTest.lllllIllIIIll[11]], 100.0f, 60.0f);
        lllllllllllllIlIlIllIIllllllIlIl.drawString(SoundTest.lllllIlIlIIIl[SoundTest.lllllIllIIIll[1]], 100.0f, 100.0f);
        lllllllllllllIlIlIllIIllllllIlIl.drawString(SoundTest.lllllIlIlIIIl[SoundTest.lllllIllIIIll[12]], 100.0f, 130.0f);
        lllllllllllllIlIlIllIIllllllIlIl.drawString(SoundTest.lllllIlIlIIIl[SoundTest.lllllIllIIIll[13]], 100.0f, 190.0f);
        lllllllllllllIlIlIllIIllllllIlIl.drawString(SoundTest.lllllIlIlIIIl[SoundTest.lllllIllIIIll[14]], 100.0f, 160.0f);
        lllllllllllllIlIlIllIIllllllIlIl.drawString(SoundTest.lllllIlIlIIIl[SoundTest.lllllIllIIIll[15]], 100.0f, 210.0f);
        lllllllllllllIlIlIllIIllllllIlIl.drawString(SoundTest.lllllIlIlIIIl[SoundTest.lllllIllIIIll[16]], 100.0f, 240.0f);
        lllllllllllllIlIlIllIIllllllIlIl.drawString(SoundTest.lllllIlIlIIIl[SoundTest.lllllIllIIIll[17]], 100.0f, 270.0f);
        lllllllllllllIlIlIllIIllllllIlIl.drawString(SoundTest.lllllIlIlIIIl[SoundTest.lllllIllIIIll[18]], 100.0f, 300.0f);
        lllllllllllllIlIlIllIIllllllIlIl.drawString(SoundTest.lllllIlIlIIIl[SoundTest.lllllIllIIIll[19]], 100.0f, 330.0f);
        lllllllllllllIlIlIllIIllllllIlIl.setColor(Color.blue);
        lllllllllllllIlIlIllIIllllllIlIl.drawString(String.valueOf(new StringBuilder().append(SoundTest.lllllIlIlIIIl[SoundTest.lllllIllIIIll[20]]).append(lllllllllllllIlIlIllIIllllllIllI.getSoundVolume())), 150.0f, 390.0f);
        lllllllllllllIlIlIllIIllllllIlIl.drawString(String.valueOf(new StringBuilder().append(SoundTest.lllllIlIlIIIl[SoundTest.lllllIllIIIll[21]]).append(lllllllllllllIlIlIllIIllllllIllI.getMusicVolume())), 150.0f, 420.0f);
        lllllllllllllIlIlIllIIllllllIlIl.drawString(String.valueOf(new StringBuilder().append(SoundTest.lllllIlIlIIIl[SoundTest.lllllIllIIIll[22]]).append(this.music.getVolume())), 150.0f, 450.0f);
    }
    
    public SoundTest() {
        super(SoundTest.lllllIlIlIIIl[SoundTest.lllllIllIIIll[0]]);
        this.volume = SoundTest.lllllIllIIIll[1];
        this.engines = new int[SoundTest.lllllIllIIIll[2]];
    }
    
    @Override
    public void update(final GameContainer lllllllllllllIlIlIllIIllllllIIII, final int lllllllllllllIlIlIllIIlllllIllll) {
    }
    
    private static boolean lIlIlllIlllIlII(final int lllllllllllllIlIlIllIIlllIIlIIll) {
        return lllllllllllllIlIlIllIIlllIIlIIll != 0;
    }
    
    private void setVolume() {
        if (lIlIlllIllllIIl(this.volume, SoundTest.lllllIllIIIll[1])) {
            this.volume = SoundTest.lllllIllIIIll[1];
            "".length();
            if (-" ".length() != -" ".length()) {
                return;
            }
        }
        else if (lIlIlllIllllIII(this.volume)) {
            this.volume = SoundTest.lllllIllIIIll[0];
        }
        this.myContainer.setMusicVolume(this.volume / 10.0f);
    }
    
    public static void main(final String[] lllllllllllllIlIlIllIIllllIllIII) {
        try {
            final AppGameContainer lllllllllllllIlIlIllIIllllIllIlI = new AppGameContainer(new SoundTest());
            lllllllllllllIlIlIllIIllllIllIlI.setDisplayMode(SoundTest.lllllIllIIIll[36], SoundTest.lllllIllIIIll[37], (boolean)(SoundTest.lllllIllIIIll[0] != 0));
            lllllllllllllIlIlIllIIllllIllIlI.start();
            "".length();
            if (null != null) {
                return;
            }
        }
        catch (SlickException lllllllllllllIlIlIllIIllllIllIIl) {
            lllllllllllllIlIlIllIIllllIllIIl.printStackTrace();
        }
    }
    
    private static void lIlIlllIllIIIll() {
        (lllllIlIlIIIl = new String[SoundTest.lllllIllIIIll[38]])[SoundTest.lllllIllIIIll[0]] = lIlIlllIlIlIIIl("IK1qwIEXl8Qudlcun6bHJWvnWWN9Up7K", "RzImg");
        SoundTest.lllllIlIlIIIl[SoundTest.lllllIllIIIll[4]] = lIlIlllIlIlIIlI("Lxrje4v4k2uXrwyYQzckBnF9UkFyque5", "yloZJ");
        SoundTest.lllllIlIlIIIl[SoundTest.lllllIllIIIll[5]] = lIlIlllIlIlIIIl("AaUASaGgKcLYZqEomd0kUasxLM2A3Xhk", "KivYP");
        SoundTest.lllllIlIlIIIl[SoundTest.lllllIllIIIll[2]] = lIlIlllIlIlIIlI("9hZVvVFjCBQ=", "DcSrD");
        SoundTest.lllllIlIlIIIl[SoundTest.lllllIllIIIll[6]] = lIlIlllIlIlIIlI("Pi8933Yb6GVGQ40++IXtc6C97X2wjA32", "toZAW");
        SoundTest.lllllIlIlIIIl[SoundTest.lllllIllIIIll[7]] = lIlIlllIlIlIlll("Pw0TDwsdTA4MThUDGwdOHAIdCgAc", "ylzcn");
        SoundTest.lllllIlIlIIIl[SoundTest.lllllIllIIIll[8]] = lIlIlllIlIlIlll("IgoXFx43GwVMKRstSTtUDiI=", "Vodcz");
        SoundTest.lllllIlIlIIIl[SoundTest.lllllIllIIIll[9]] = lIlIlllIlIlIlll("BQk0NwUQGCZsChgeJTpPHgsg", "qlGCa");
        SoundTest.lllllIlIlIIIl[SoundTest.lllllIllIIIll[10]] = lIlIlllIlIlIIlI("v0YURdMeIb2xW3LhJpZ53544jvN0EF8C", "kJQkI");
        SoundTest.lllllIlIlIIIl[SoundTest.lllllIllIIIll[11]] = lIlIlllIlIlIIlI("/ob2EQ73DKYO2eMjwxDNq6rf3w9gesSyVOXJkgCpK/zeER2mBGR3PK/c6LAlZZvG0fNw4Zl0gNo=", "YnkSP");
        SoundTest.lllllIlIlIIIl[SoundTest.lllllIllIIIll[1]] = lIlIlllIlIlIIlI("UzCDbJEdq8Ol8qQbk+PSnYtzHHuLyKgBjyykneSZDJVZ7Bgtpe/ysw==", "SDYlq");
        SoundTest.lllllIlIlIIIl[SoundTest.lllllIllIIIll[12]] = lIlIlllIlIlIlll("HiUKPAJuB087Hm4nDjoCK3gdKgI7OgpvHDskBixRZg8iZg==", "NWoOq");
        SoundTest.lllllIlIlIIIl[SoundTest.lllllIllIIIll[13]] = lIlIlllIlIlIIlI("ABIPCxF6rmwfQMFq1XjIluk33SDOnUuAJpqb0sfTF6aACAzEw0sbfiVDc8euedjc", "bdOzE");
        SoundTest.lllllIlIlIIIl[SoundTest.lllllIllIIIll[14]] = lIlIlllIlIlIIlI("gK77r9o8waofCEVrfCZnw8Zi6pd59DlFM06Ki/ar7zM=", "VxYTO");
        SoundTest.lllllIlIlIIIl[SoundTest.lllllIllIIIll[15]] = lIlIlllIlIlIIlI("mBx57kFa1HyNnAU78T/0Mc1UVJ7/7oji", "CsOTl");
        SoundTest.lllllIlIlIIIl[SoundTest.lllllIllIIIll[16]] = lIlIlllIlIlIIlI("E4eNyVPrxWqfvlpQ0j4UohRSHVnTgLU7", "tqxIJ");
        SoundTest.lllllIlIlIIIl[SoundTest.lllllIllIIIll[17]] = lIlIlllIlIlIIIl("2eWoVjyhA/TmTqr6RAywKl7sfYRQPd6W+VJ5fhtgZc7bNW8N/Dxm/f8rQSPgnX/y", "jXAqO");
        SoundTest.lllllIlIlIIIl[SoundTest.lllllIllIIIll[18]] = lIlIlllIlIlIlll("KAAfPAlYK1ogCFgqWjsVWBESLhQfF1omFBwbDCYeDRMWbwwXHg8iH1gdHG8XDQETLA==", "xrzOz");
        SoundTest.lllllIlIlIIIl[SoundTest.lllllIllIIIll[19]] = lIlIlllIlIlIlll("KhAQHCZaLFUAJ1ovVRs6WgEdDjsdB1UIORUAFAN1DA0ZGjgfQhoJdQkNAAExWgQN", "zbuoU");
        SoundTest.lllllIlIlIIIl[SoundTest.lllllIllIIIll[20]] = lIlIlllIlIlIlll("LS0+GigGYQIXPAQlcS4mBjQ8HWkmJCcdJVBh", "jAQxI");
        SoundTest.lllllIlIlIIIl[SoundTest.lllllIllIIIll[21]] = lIlIlllIlIlIIlI("iPMIRgW+VOrazzfbNGa3KZ+5SrUSa41bUFJs6b7OlBE=", "Orozx");
        SoundTest.lllllIlIlIIIl[SoundTest.lllllIllIIIll[22]] = lIlIlllIlIlIlll("BTsfPhMoOk0BAzUnDmwgKSIYIRNmAgg6Eyp0TQ==", "FNmLv");
        SoundTest.lllllIlIlIIIl[SoundTest.lllllIllIIIll[30]] = lIlIlllIlIlIIlI("AmDork80mOw=", "gpCOa");
        SoundTest.lllllIlIlIIIl[SoundTest.lllllIllIIIll[31]] = lIlIlllIlIlIIIl("VpPR4iY9Hwk=", "uQxyV");
    }
    
    private static String lIlIlllIlIlIIIl(final String lllllllllllllIlIlIllIIlllIlIlIII, final String lllllllllllllIlIlIllIIlllIlIlIIl) {
        try {
            final SecretKeySpec lllllllllllllIlIlIllIIlllIlIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIllIIlllIlIlIIl.getBytes(StandardCharsets.UTF_8)), SoundTest.lllllIllIIIll[10]), "DES");
            final Cipher lllllllllllllIlIlIllIIlllIlIllII = Cipher.getInstance("DES");
            lllllllllllllIlIlIllIIlllIlIllII.init(SoundTest.lllllIllIIIll[5], lllllllllllllIlIlIllIIlllIlIllIl);
            return new String(lllllllllllllIlIlIllIIlllIlIllII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIllIIlllIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIllIIlllIlIlIll) {
            lllllllllllllIlIlIllIIlllIlIlIll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIlllIllllIIl(final int lllllllllllllIlIlIllIIlllIIllIlI, final int lllllllllllllIlIlIllIIlllIIllIIl) {
        return lllllllllllllIlIlIllIIlllIIllIlI > lllllllllllllIlIlIllIIlllIIllIIl;
    }
}
