// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.newdawn.slick.util.ResourceLoader;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.Music;
import org.newdawn.slick.Sound;
import org.newdawn.slick.BasicGame;

public class SoundURLTest extends BasicGame
{
    private /* synthetic */ Sound charlie;
    private /* synthetic */ Sound burp;
    private /* synthetic */ Music music;
    private /* synthetic */ Sound engine;
    private /* synthetic */ int volume;
    private /* synthetic */ Music musicb;
    private /* synthetic */ Sound sound;
    private static final /* synthetic */ int[] lIlIllIIllIIII;
    private static final /* synthetic */ String[] lIlIllIIlIllll;
    private /* synthetic */ Music musica;
    
    public static void main(final String[] lllllllllllllIIIIllIllllllIIIllI) {
        try {
            final AppGameContainer lllllllllllllIIIIllIllllllIIlIII = new AppGameContainer(new SoundURLTest());
            lllllllllllllIIIIllIllllllIIlIII.setDisplayMode(SoundURLTest.lIlIllIIllIIII[26], SoundURLTest.lIlIllIIllIIII[27], (boolean)(SoundURLTest.lIlIllIIllIIII[0] != 0));
            lllllllllllllIIIIllIllllllIIlIII.start();
            "".length();
            if ("   ".length() <= "  ".length()) {
                return;
            }
        }
        catch (SlickException lllllllllllllIIIIllIllllllIIIlll) {
            lllllllllllllIIIIllIllllllIIIlll.printStackTrace();
        }
    }
    
    private static boolean llllIIIlIIIllIl(final int lllllllllllllIIIIllIlllllIIIIIIl) {
        return lllllllllllllIIIIllIlllllIIIIIIl != 0;
    }
    
    private static boolean llllIIIlIIlIIII(final int lllllllllllllIIIIllIllllIlllllll) {
        return lllllllllllllIIIIllIllllIlllllll < 0;
    }
    
    @Override
    public void init(final GameContainer lllllllllllllIIIIllIlllllllIIIIl) throws SlickException {
        this.sound = new Sound(ResourceLoader.getResource(SoundURLTest.lIlIllIIlIllll[SoundURLTest.lIlIllIIllIIII[1]]));
        this.charlie = new Sound(ResourceLoader.getResource(SoundURLTest.lIlIllIIlIllll[SoundURLTest.lIlIllIIllIIII[2]]));
        this.engine = new Sound(ResourceLoader.getResource(SoundURLTest.lIlIllIIlIllll[SoundURLTest.lIlIllIIllIIII[3]]));
        final Music music = new Music(ResourceLoader.getResource(SoundURLTest.lIlIllIIlIllll[SoundURLTest.lIlIllIIllIIII[4]]), (boolean)(SoundURLTest.lIlIllIIllIIII[0] != 0));
        this.musica = music;
        this.music = music;
        this.musicb = new Music(ResourceLoader.getResource(SoundURLTest.lIlIllIIlIllll[SoundURLTest.lIlIllIIllIIII[5]]), (boolean)(SoundURLTest.lIlIllIIllIIII[0] != 0));
        this.burp = new Sound(ResourceLoader.getResource(SoundURLTest.lIlIllIIlIllll[SoundURLTest.lIlIllIIllIIII[6]]));
    }
    
    private static void llllIIIlIIIlIll() {
        (lIlIllIIllIIII = new int[29])[0] = ((0x30 ^ 0x8) & ~(0xAD ^ 0x95));
        SoundURLTest.lIlIllIIllIIII[1] = " ".length();
        SoundURLTest.lIlIllIIllIIII[2] = "  ".length();
        SoundURLTest.lIlIllIIllIIII[3] = "   ".length();
        SoundURLTest.lIlIllIIllIIII[4] = (4 + 105 - 38 + 70 ^ 129 + 40 - 38 + 6);
        SoundURLTest.lIlIllIIllIIII[5] = (0xA ^ 0xF);
        SoundURLTest.lIlIllIIllIIII[6] = (0x7C ^ 0x7A);
        SoundURLTest.lIlIllIIllIIII[7] = (34 + 25 - 42 + 139 ^ 114 + 102 - 69 + 8);
        SoundURLTest.lIlIllIIllIIII[8] = (0xB3 ^ 0xBB);
        SoundURLTest.lIlIllIIllIIII[9] = (4 + 107 - 95 + 172 ^ 159 + 61 - 178 + 139);
        SoundURLTest.lIlIllIIllIIII[10] = (55 + 109 - 53 + 32 ^ 22 + 122 - 64 + 53);
        SoundURLTest.lIlIllIIllIIII[11] = (0x63 ^ 0x2E ^ (0xEC ^ 0xAA));
        SoundURLTest.lIlIllIIllIIII[12] = (0xA ^ 0x6);
        SoundURLTest.lIlIllIIllIIII[13] = ("  ".length() ^ (0x36 ^ 0x39));
        SoundURLTest.lIlIllIIllIIII[14] = (0x3D ^ 0x3 ^ (0x79 ^ 0x49));
        SoundURLTest.lIlIllIIllIIII[15] = (0xE3 ^ 0x9B ^ (0xD ^ 0x7A));
        SoundURLTest.lIlIllIIllIIII[16] = (0x6A ^ 0x53);
        SoundURLTest.lIlIllIIllIIII[17] = (0x71 ^ 0x41);
        SoundURLTest.lIlIllIIllIIII[18] = (0x3B ^ 0x25);
        SoundURLTest.lIlIllIIllIIII[19] = (39 + 102 - 104 + 113 ^ 89 + 16 - 13 + 84);
        SoundURLTest.lIlIllIIllIIII[20] = (55 + 138 - 139 + 125 ^ 117 + 167 - 121 + 12);
        SoundURLTest.lIlIllIIllIIII[21] = (0xA ^ 0x67 ^ (0xCC ^ 0xB8));
        SoundURLTest.lIlIllIIllIIII[22] = (0x8F ^ 0xA1);
        SoundURLTest.lIlIllIIllIIII[23] = (0x29 ^ 0x4C ^ (0x39 ^ 0x4E));
        SoundURLTest.lIlIllIIllIIII[24] = (0x48 ^ 0x63);
        SoundURLTest.lIlIllIIllIIII[25] = (0xE6 ^ 0x8E ^ (0xC8 ^ 0x8D));
        SoundURLTest.lIlIllIIllIIII[26] = (-(0xFFFFFEDE & 0x6D25) & (0xFFFFEF67 & 0x7FBB));
        SoundURLTest.lIlIllIIllIIII[27] = (0xFFFF9EDF & 0x6378);
        SoundURLTest.lIlIllIIllIIII[28] = (140 + 75 - 147 + 143 ^ 62 + 149 - 49 + 33);
    }
    
    private void setVolume() {
        if (llllIIIlIIIllll(this.volume, SoundURLTest.lIlIllIIllIIII[10])) {
            this.volume = SoundURLTest.lIlIllIIllIIII[10];
            "".length();
            if (" ".length() < -" ".length()) {
                return;
            }
        }
        else if (llllIIIlIIlIIII(this.volume)) {
            this.volume = SoundURLTest.lIlIllIIllIIII[0];
        }
        this.music.setVolume(this.volume / 10.0f);
    }
    
    private static boolean llllIIIlIIIllII(final int lllllllllllllIIIIllIlllllIIlIIII, final int lllllllllllllIIIIllIlllllIIIllll) {
        return lllllllllllllIIIIllIlllllIIlIIII == lllllllllllllIIIIllIlllllIIIllll;
    }
    
    private static String llllIIIlIIIlIII(String lllllllllllllIIIIllIlllllIIllIll, final String lllllllllllllIIIIllIlllllIIlllll) {
        lllllllllllllIIIIllIlllllIIllIll = (int)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIllIlllllIIllIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIllIlllllIIllllI = new StringBuilder();
        final char[] lllllllllllllIIIIllIlllllIIlllIl = lllllllllllllIIIIllIlllllIIlllll.toCharArray();
        int lllllllllllllIIIIllIlllllIIlllII = SoundURLTest.lIlIllIIllIIII[0];
        final byte lllllllllllllIIIIllIlllllIIlIllI = (Object)((String)lllllllllllllIIIIllIlllllIIllIll).toCharArray();
        final float lllllllllllllIIIIllIlllllIIlIlIl = lllllllllllllIIIIllIlllllIIlIllI.length;
        int lllllllllllllIIIIllIlllllIIlIlII = SoundURLTest.lIlIllIIllIIII[0];
        while (llllIIIlIIlIIIl(lllllllllllllIIIIllIlllllIIlIlII, (int)lllllllllllllIIIIllIlllllIIlIlIl)) {
            final char lllllllllllllIIIIllIlllllIlIIIIl = lllllllllllllIIIIllIlllllIIlIllI[lllllllllllllIIIIllIlllllIIlIlII];
            lllllllllllllIIIIllIlllllIIllllI.append((char)(lllllllllllllIIIIllIlllllIlIIIIl ^ lllllllllllllIIIIllIlllllIIlllIl[lllllllllllllIIIIllIlllllIIlllII % lllllllllllllIIIIllIlllllIIlllIl.length]));
            "".length();
            ++lllllllllllllIIIIllIlllllIIlllII;
            ++lllllllllllllIIIIllIlllllIIlIlII;
            "".length();
            if (-"  ".length() > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIllIlllllIIllllI);
    }
    
    private static boolean llllIIIlIIlIIIl(final int lllllllllllllIIIIllIlllllIIIllII, final int lllllllllllllIIIIllIlllllIIIlIll) {
        return lllllllllllllIIIIllIlllllIIIllII < lllllllllllllIIIIllIlllllIIIlIll;
    }
    
    @Override
    public void keyPressed(final int lllllllllllllIIIIllIllllllIIlllI, final char lllllllllllllIIIIllIllllllIlIIII) {
        if (llllIIIlIIIllII(lllllllllllllIIIIllIllllllIIlllI, SoundURLTest.lIlIllIIllIIII[1])) {
            System.exit(SoundURLTest.lIlIllIIllIIII[0]);
        }
        if (llllIIIlIIIllII(lllllllllllllIIIIllIllllllIIlllI, SoundURLTest.lIlIllIIllIIII[16])) {
            this.sound.play();
        }
        if (llllIIIlIIIllII(lllllllllllllIIIIllIllllllIIlllI, SoundURLTest.lIlIllIIllIIII[17])) {
            this.burp.play();
        }
        if (llllIIIlIIIllII(lllllllllllllIIIIllIllllllIIlllI, SoundURLTest.lIlIllIIllIIII[18])) {
            this.sound.playAt(-1.0f, 0.0f, 0.0f);
        }
        if (llllIIIlIIIllII(lllllllllllllIIIIllIllllllIIlllI, SoundURLTest.lIlIllIIllIIII[19])) {
            this.sound.playAt(1.0f, 0.0f, 0.0f);
        }
        if (llllIIIlIIIllII(lllllllllllllIIIIllIllllllIIlllI, SoundURLTest.lIlIllIIllIIII[20])) {
            this.charlie.play(1.0f, 1.0f);
        }
        if (llllIIIlIIIllII(lllllllllllllIIIIllIllllllIIlllI, SoundURLTest.lIlIllIIllIIII[21])) {
            if (llllIIIlIIIllIl(this.music.playing() ? 1 : 0)) {
                this.music.pause();
                "".length();
                if (((0x16 ^ 0x39 ^ (0xB1 ^ 0x9A)) & (109 + 26 - 117 + 125 ^ 102 + 47 - 146 + 136 ^ -" ".length())) != 0x0) {
                    return;
                }
            }
            else {
                this.music.resume();
            }
        }
        if (llllIIIlIIIllII(lllllllllllllIIIIllIllllllIIlllI, SoundURLTest.lIlIllIIllIIII[22])) {
            this.music.stop();
            if (llllIIIlIIIlllI(this.music, this.musica)) {
                this.music = this.musicb;
                "".length();
                if (" ".length() != " ".length()) {
                    return;
                }
            }
            else {
                this.music = this.musica;
            }
            this.music.loop();
        }
        if (llllIIIlIIIllII(lllllllllllllIIIIllIllllllIIlllI, SoundURLTest.lIlIllIIllIIII[23])) {
            if (llllIIIlIIIllIl(this.engine.playing() ? 1 : 0)) {
                this.engine.stop();
                "".length();
                if (-(0x3B ^ 0x3F) > 0) {
                    return;
                }
            }
            else {
                this.engine.loop();
            }
        }
        if (llllIIIlIIIllII(lllllllllllllIIIIllIllllllIlIIII, SoundURLTest.lIlIllIIllIIII[24])) {
            this.volume += SoundURLTest.lIlIllIIllIIII[1];
            this.setVolume();
        }
        if (llllIIIlIIIllII(lllllllllllllIIIIllIllllllIlIIII, SoundURLTest.lIlIllIIllIIII[25])) {
            this.volume -= SoundURLTest.lIlIllIIllIIII[1];
            this.setVolume();
        }
    }
    
    public void render(final GameContainer lllllllllllllIIIIllIllllllIlllII, final Graphics lllllllllllllIIIIllIllllllIllIIl) {
        lllllllllllllIIIIllIllllllIllIIl.setColor(Color.white);
        lllllllllllllIIIIllIllllllIllIIl.drawString(SoundURLTest.lIlIllIIlIllll[SoundURLTest.lIlIllIIllIIII[7]], 100.0f, 60.0f);
        lllllllllllllIIIIllIllllllIllIIl.drawString(SoundURLTest.lIlIllIIlIllll[SoundURLTest.lIlIllIIllIIII[8]], 100.0f, 100.0f);
        lllllllllllllIIIIllIllllllIllIIl.drawString(SoundURLTest.lIlIllIIlIllll[SoundURLTest.lIlIllIIllIIII[9]], 100.0f, 130.0f);
        lllllllllllllIIIIllIllllllIllIIl.drawString(SoundURLTest.lIlIllIIlIllll[SoundURLTest.lIlIllIIllIIII[10]], 100.0f, 190.0f);
        lllllllllllllIIIIllIllllllIllIIl.drawString(SoundURLTest.lIlIllIIlIllll[SoundURLTest.lIlIllIIllIIII[11]], 100.0f, 160.0f);
        lllllllllllllIIIIllIllllllIllIIl.drawString(SoundURLTest.lIlIllIIlIllll[SoundURLTest.lIlIllIIllIIII[12]], 100.0f, 210.0f);
        lllllllllllllIIIIllIllllllIllIIl.drawString(SoundURLTest.lIlIllIIlIllll[SoundURLTest.lIlIllIIllIIII[13]], 100.0f, 240.0f);
        lllllllllllllIIIIllIllllllIllIIl.drawString(SoundURLTest.lIlIllIIlIllll[SoundURLTest.lIlIllIIllIIII[14]], 100.0f, 270.0f);
        lllllllllllllIIIIllIllllllIllIIl.setColor(Color.blue);
        lllllllllllllIIIIllIllllllIllIIl.drawString(String.valueOf(new StringBuilder().append(SoundURLTest.lIlIllIIlIllll[SoundURLTest.lIlIllIIllIIII[15]]).append(this.volume / 10.0f)), 150.0f, 300.0f);
    }
    
    static {
        llllIIIlIIIlIll();
        llllIIIlIIIlIlI();
    }
    
    private static String llllIIIlIIIlIIl(final String lllllllllllllIIIIllIlllllIlIlllI, final String lllllllllllllIIIIllIlllllIlIllIl) {
        try {
            final SecretKeySpec lllllllllllllIIIIllIlllllIllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIllIlllllIlIllIl.getBytes(StandardCharsets.UTF_8)), SoundURLTest.lIlIllIIllIIII[8]), "DES");
            final Cipher lllllllllllllIIIIllIlllllIllIIlI = Cipher.getInstance("DES");
            lllllllllllllIIIIllIlllllIllIIlI.init(SoundURLTest.lIlIllIIllIIII[2], lllllllllllllIIIIllIlllllIllIIll);
            return new String(lllllllllllllIIIIllIlllllIllIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIllIlllllIlIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIllIlllllIllIIIl) {
            lllllllllllllIIIIllIlllllIllIIIl.printStackTrace();
            return null;
        }
    }
    
    private static void llllIIIlIIIlIlI() {
        (lIlIllIIlIllll = new String[SoundURLTest.lIlIllIIllIIII[28]])[SoundURLTest.lIlIllIIllIIII[0]] = llllIIIlIIIIlll("JWv82dl4qyw3ZTVghVsRzA==", "POZhC");
        SoundURLTest.lIlIllIIlIllll[SoundURLTest.lIlIllIIllIIII[1]] = llllIIIlIIIIlll("kyhky+JH+ODT2+dT5SXWh6EgEhR/f/hb", "NScsp");
        SoundURLTest.lIlIllIIlIllll[SoundURLTest.lIlIllIIllIIII[2]] = llllIIIlIIIIlll("8OaYo2Izbz/f2G/3YbzM/aCbHwdOGstd", "CtGvt");
        SoundURLTest.lIlIllIIlIllll[SoundURLTest.lIlIllIIllIIII[3]] = llllIIIlIIIIlll("oPq6FZ2tqOgoVKMgRU9V6MYJ5gRxdzak", "COgLg");
        SoundURLTest.lIlIllIIlIllll[SoundURLTest.lIlIllIIllIIII[4]] = llllIIIlIIIIlll("iIzAV1p+pxrlSKtsUqdVyx4PRSIQd9d3", "Chjwf");
        SoundURLTest.lIlIllIIlIllll[SoundURLTest.lIlIllIIllIIII[5]] = llllIIIlIIIlIII("GRU2MTMMBCRqPAQCJzx5Ahci", "mpEEW");
        SoundURLTest.lIlIllIIlIllll[SoundURLTest.lIlIllIIllIIII[6]] = llllIIIlIIIIlll("IXc96/G0+MxAIT3fWPUdj2dgmTcV6S2b", "wosgw");
        SoundURLTest.lIlIllIIlIllll[SoundURLTest.lIlIllIIllIIII[7]] = llllIIIlIIIlIII("FyQ2TS4EC3MBDiw8cwQSYyI8GkEwOCEIAC4lPQpBJT48AEE3JDZNByogNkFBNCM8GU8=", "CLSma");
        SoundURLTest.lIlIllIIlIllll[SoundURLTest.lIlIllIIllIIII[8]] = llllIIIlIIIlIII("CTYWJCJ5NwM2MjxkFTgjeTccIj89ZBYxNzwnB3d5FgM0fg==", "YDsWQ");
        SoundURLTest.lIlIllIIlIllll[SoundURLTest.lIlIllIIllIIII[9]] = llllIIIlIIIIlll("tOUJq1sSwC55+8ZOPlWLXmFtoP9gtiG2bvTKqOMqlIAskmzZB4AYKA==", "jEVXT");
        SoundURLTest.lIlIllIIlIllll[SoundURLTest.lIlIllIIllIIII[10]] = llllIIIlIIIlIII("PT0kFjhNCmERJE0/IBA4CGAzADgYIiRFLgMoKAsuTTwuECUJb2kyCjtm", "mOAeK");
        SoundURLTest.lIlIllIIlIllll[SoundURLTest.lIlIllIIllIIII[11]] = llllIIIlIIIlIII("IhAwMjFSBzs1JwBCMy4wUgE9IDAeCzBhaiUjA2g=", "rbUAB");
        SoundURLTest.lIlIllIIlIllll[SoundURLTest.lIlIllIIllIIII[12]] = llllIIIlIIIlIII("OjMMFhlKAkkRBUoiAQQEDSRJCB8ZKAo=", "jAiej");
        SoundURLTest.lIlIllIIlIllll[SoundURLTest.lIlIllIIllIIII[13]] = llllIIIlIIIIlll("49ALadQPNo0W9hs0hbakdeayJGgWAVfn", "hspOX");
        SoundURLTest.lIlIllIIlIllll[SoundURLTest.lIlIllIIllIIII[14]] = llllIIIlIIIlIIl("5tu3Kan3sZHvmLMSZ53Ti4j5BEAYh8iMWKjZhTBH/QgOlsyQxI8YrA==", "nDiFY");
        SoundURLTest.lIlIllIIlIllll[SoundURLTest.lIlIllIIllIIII[15]] = llllIIIlIIIlIII("IxgDIhdOOx8nAQMIUAcRGAgccVQ=", "nmpKt");
    }
    
    public SoundURLTest() {
        super(SoundURLTest.lIlIllIIlIllll[SoundURLTest.lIlIllIIllIIII[0]]);
        this.volume = SoundURLTest.lIlIllIIllIIII[1];
    }
    
    private static String llllIIIlIIIIlll(final String lllllllllllllIIIIllIlllllIlllIll, final String lllllllllllllIIIIllIlllllIlllIlI) {
        try {
            final SecretKeySpec lllllllllllllIIIIllIllllllIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIllIlllllIlllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIllIlllllIllllll = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIllIlllllIllllll.init(SoundURLTest.lIlIllIIllIIII[2], lllllllllllllIIIIllIllllllIIIIII);
            return new String(lllllllllllllIIIIllIlllllIllllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIllIlllllIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIllIlllllIlllllI) {
            lllllllllllllIIIIllIlllllIlllllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean llllIIIlIIIllll(final int lllllllllllllIIIIllIlllllIIIlIII, final int lllllllllllllIIIIllIlllllIIIIlll) {
        return lllllllllllllIIIIllIlllllIIIlIII > lllllllllllllIIIIllIlllllIIIIlll;
    }
    
    @Override
    public void update(final GameContainer lllllllllllllIIIIllIllllllIlIlll, final int lllllllllllllIIIIllIllllllIlIllI) {
    }
    
    private static boolean llllIIIlIIIlllI(final Object lllllllllllllIIIIllIlllllIIIIlII, final Object lllllllllllllIIIIllIlllllIIIIIll) {
        return lllllllllllllIIIIllIlllllIIIIlII == lllllllllllllIIIIllIlllllIIIIIll;
    }
}
