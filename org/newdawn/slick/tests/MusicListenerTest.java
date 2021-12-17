// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import java.util.Arrays;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Music;
import org.newdawn.slick.MusicListener;
import org.newdawn.slick.BasicGame;

public class MusicListenerTest extends BasicGame implements MusicListener
{
    private /* synthetic */ Music stream;
    private /* synthetic */ boolean musicSwapped;
    private /* synthetic */ Music music;
    private /* synthetic */ boolean musicEnded;
    private static final /* synthetic */ String[] lIIIIlIIIIllIl;
    private static final /* synthetic */ int[] lIIIIlIIlIllIl;
    
    public void musicEnded(final Music lllllllllllllIlIIllIIIIlIlIllIll) {
        this.musicEnded = (MusicListenerTest.lIIIIlIIlIllIl[1] != 0);
    }
    
    @Override
    public void init(final GameContainer lllllllllllllIlIIllIIIIlIllIIIlI) throws SlickException {
        this.music = new Music(MusicListenerTest.lIIIIlIIIIllIl[MusicListenerTest.lIIIIlIIlIllIl[1]], (boolean)(MusicListenerTest.lIIIIlIIlIllIl[0] != 0));
        this.stream = new Music(MusicListenerTest.lIIIIlIIIIllIl[MusicListenerTest.lIIIIlIIlIllIl[2]], (boolean)(MusicListenerTest.lIIIIlIIlIllIl[0] != 0));
        this.music.addListener(this);
        this.stream.addListener(this);
    }
    
    private static String lIlllIIIIIIlIII(final String lllllllllllllIlIIllIIIIlIIIlIlIl, final String lllllllllllllIlIIllIIIIlIIIlIlII) {
        try {
            final SecretKeySpec lllllllllllllIlIIllIIIIlIIIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIllIIIIlIIIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIllIIIIlIIIlIlll = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIllIIIIlIIIlIlll.init(MusicListenerTest.lIIIIlIIlIllIl[2], lllllllllllllIlIIllIIIIlIIIllIII);
            return new String(lllllllllllllIlIIllIIIIlIIIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIllIIIIlIIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIllIIIIlIIIlIllI) {
            lllllllllllllIlIIllIIIIlIIIlIllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlllIIIllIIIIl(final int lllllllllllllIlIIllIIIIlIIIIIllI) {
        return lllllllllllllIlIIllIIIIlIIIIIllI != 0;
    }
    
    private static void lIlllIIIIIlIIII() {
        (lIIIIlIIIIllIl = new String[MusicListenerTest.lIIIIlIIlIllIl[11]])[MusicListenerTest.lIIIIlIIlIllIl[0]] = lIlllIIIIIIlIII("UpgG88DHK5LYsqSz+MFyEJT6WxgzwVyz", "RGMVg");
        MusicListenerTest.lIIIIlIIIIllIl[MusicListenerTest.lIIIIlIIlIllIl[1]] = lIlllIIIIIIlIIl("V1x2sQj1RNllsK/HQAlPZxeoGuDCBJDz", "rVsyV");
        MusicListenerTest.lIIIIlIIIIllIl[MusicListenerTest.lIIIIlIIlIllIl[2]] = lIlllIIIIIIlIIl("40vaifI4gXlqCIHqUVwFkdUAKaMFtPr6", "dMeIL");
        MusicListenerTest.lIIIIlIIIIllIl[MusicListenerTest.lIIIIlIIlIllIl[3]] = lIlllIIIIIIlIII("4bND3/2UZIwuA/sWHyDqE/PmpVwx/msO", "WwJLF");
        MusicListenerTest.lIIIIlIIIIllIl[MusicListenerTest.lIIIIlIIlIllIl[4]] = lIlllIIIIIIllII("OgAGBhJKIUMBDkoBFwcECx9DGBQZGwA=", "jrcua");
        MusicListenerTest.lIIIIlIIIIllIl[MusicListenerTest.lIIIIlIIlIllIl[5]] = lIlllIIIIIIllII("PB4ZGCtRLgQVLRU=", "qkjqH");
        MusicListenerTest.lIIIIlIIIIllIl[MusicListenerTest.lIIIIlIIlIllIl[6]] = lIlllIIIIIIlIII("3a2FmmjtwJvkgS6ABaZcaA==", "fxDsy");
    }
    
    @Override
    public void update(final GameContainer lllllllllllllIlIIllIIIIlIlIlllll, final int lllllllllllllIlIIllIIIIlIlIllllI) throws SlickException {
    }
    
    private static boolean lIlllIIIllIIIll(final int lllllllllllllIlIIllIIIIlIIIIlIIl, final int lllllllllllllIlIIllIIIIlIIIIlIII) {
        return lllllllllllllIlIIllIIIIlIIIIlIIl < lllllllllllllIlIIllIIIIlIIIIlIII;
    }
    
    public void musicSwapped(final Music lllllllllllllIlIIllIIIIlIlIlIlll, final Music lllllllllllllIlIIllIIIIlIlIlIllI) {
        this.musicSwapped = (MusicListenerTest.lIIIIlIIlIllIl[1] != 0);
    }
    
    private static void lIlllIIIllIIIII() {
        (lIIIIlIIlIllIl = new int[13])[0] = ((0x34 ^ 0x5B ^ (0x5 ^ 0x71)) & (0x73 ^ 0x38 ^ (0x73 ^ 0x23) ^ -" ".length()));
        MusicListenerTest.lIIIIlIIlIllIl[1] = " ".length();
        MusicListenerTest.lIIIIlIIlIllIl[2] = "  ".length();
        MusicListenerTest.lIIIIlIIlIllIl[3] = "   ".length();
        MusicListenerTest.lIIIIlIIlIllIl[4] = (0x41 ^ 0x6B ^ (0xBE ^ 0x90));
        MusicListenerTest.lIIIIlIIlIllIl[5] = (0x59 ^ 0x15 ^ (0x3 ^ 0x4A));
        MusicListenerTest.lIIIIlIIlIllIl[6] = (0x45 ^ 0x5E ^ (0xE ^ 0x13));
        MusicListenerTest.lIIIIlIIlIllIl[7] = (0xDF ^ 0x90 ^ (0x32 ^ 0x4F));
        MusicListenerTest.lIIIIlIIlIllIl[8] = (0x85 ^ 0xB6 ^ (0x65 ^ 0x49));
        MusicListenerTest.lIIIIlIIlIllIl[9] = (-(0xFFFFBF8F & 0x6C7F) & (0xFFFFFF6E & 0x2FBF));
        MusicListenerTest.lIIIIlIIlIllIl[10] = (-(0xFFFFFFF3 & 0xD0D) & (0xFFFF8F5D & 0x7FFA));
        MusicListenerTest.lIIIIlIIlIllIl[11] = (0x30 ^ 0x1F ^ (0x6D ^ 0x45));
        MusicListenerTest.lIIIIlIIlIllIl[12] = (0x38 ^ 0x43 ^ (0x19 ^ 0x6A));
    }
    
    private static String lIlllIIIIIIllII(String lllllllllllllIlIIllIIIIlIIlIIlIl, final String lllllllllllllIlIIllIIIIlIIlIlIIl) {
        lllllllllllllIlIIllIIIIlIIlIIlIl = new String(Base64.getDecoder().decode(lllllllllllllIlIIllIIIIlIIlIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIllIIIIlIIlIlIII = new StringBuilder();
        final char[] lllllllllllllIlIIllIIIIlIIlIIlll = lllllllllllllIlIIllIIIIlIIlIlIIl.toCharArray();
        int lllllllllllllIlIIllIIIIlIIlIIllI = MusicListenerTest.lIIIIlIIlIllIl[0];
        final byte lllllllllllllIlIIllIIIIlIIlIIIII = (Object)lllllllllllllIlIIllIIIIlIIlIIlIl.toCharArray();
        final String lllllllllllllIlIIllIIIIlIIIlllll = (String)lllllllllllllIlIIllIIIIlIIlIIIII.length;
        short lllllllllllllIlIIllIIIIlIIIllllI = (short)MusicListenerTest.lIIIIlIIlIllIl[0];
        while (lIlllIIIllIIIll(lllllllllllllIlIIllIIIIlIIIllllI, (int)lllllllllllllIlIIllIIIIlIIIlllll)) {
            final char lllllllllllllIlIIllIIIIlIIlIlIll = lllllllllllllIlIIllIIIIlIIlIIIII[lllllllllllllIlIIllIIIIlIIIllllI];
            lllllllllllllIlIIllIIIIlIIlIlIII.append((char)(lllllllllllllIlIIllIIIIlIIlIlIll ^ lllllllllllllIlIIllIIIIlIIlIIlll[lllllllllllllIlIIllIIIIlIIlIIllI % lllllllllllllIlIIllIIIIlIIlIIlll.length]));
            "".length();
            ++lllllllllllllIlIIllIIIIlIIlIIllI;
            ++lllllllllllllIlIIllIIIIlIIIllllI;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIllIIIIlIIlIlIII);
    }
    
    static {
        lIlllIIIllIIIII();
        lIlllIIIIIlIIII();
    }
    
    public static void main(final String[] lllllllllllllIlIIllIIIIlIlIIIIll) {
        try {
            final AppGameContainer lllllllllllllIlIIllIIIIlIlIIIlIl = new AppGameContainer(new MusicListenerTest());
            lllllllllllllIlIIllIIIIlIlIIIlIl.setDisplayMode(MusicListenerTest.lIIIIlIIlIllIl[9], MusicListenerTest.lIIIIlIIlIllIl[10], (boolean)(MusicListenerTest.lIIIIlIIlIllIl[0] != 0));
            lllllllllllllIlIIllIIIIlIlIIIlIl.start();
            "".length();
            if ((0x70 ^ 0x74) <= 0) {
                return;
            }
        }
        catch (SlickException lllllllllllllIlIIllIIIIlIlIIIlII) {
            lllllllllllllIlIIllIIIIlIlIIIlII.printStackTrace();
        }
    }
    
    private static boolean lIlllIIIllIIIlI(final int lllllllllllllIlIIllIIIIlIIIIllIl, final int lllllllllllllIlIIllIIIIlIIIIllII) {
        return lllllllllllllIlIIllIIIIlIIIIllIl == lllllllllllllIlIIllIIIIlIIIIllII;
    }
    
    public void render(final GameContainer lllllllllllllIlIIllIIIIlIlIlIIIl, final Graphics lllllllllllllIlIIllIIIIlIlIIlllI) throws SlickException {
        lllllllllllllIlIIllIIIIlIlIIlllI.drawString(MusicListenerTest.lIIIIlIIIIllIl[MusicListenerTest.lIIIIlIIlIllIl[3]], 100.0f, 100.0f);
        lllllllllllllIlIIllIIIIlIlIIlllI.drawString(MusicListenerTest.lIIIIlIIIIllIl[MusicListenerTest.lIIIIlIIlIllIl[4]], 100.0f, 150.0f);
        if (lIlllIIIllIIIIl(this.musicEnded ? 1 : 0)) {
            lllllllllllllIlIIllIIIIlIlIIlllI.drawString(MusicListenerTest.lIIIIlIIIIllIl[MusicListenerTest.lIIIIlIIlIllIl[5]], 100.0f, 200.0f);
        }
        if (lIlllIIIllIIIIl(this.musicSwapped ? 1 : 0)) {
            lllllllllllllIlIIllIIIIlIlIIlllI.drawString(MusicListenerTest.lIIIIlIIIIllIl[MusicListenerTest.lIIIIlIIlIllIl[6]], 100.0f, 250.0f);
        }
    }
    
    public MusicListenerTest() {
        super(MusicListenerTest.lIIIIlIIIIllIl[MusicListenerTest.lIIIIlIIlIllIl[0]]);
        this.musicEnded = (MusicListenerTest.lIIIIlIIlIllIl[0] != 0);
        this.musicSwapped = (MusicListenerTest.lIIIIlIIlIllIl[0] != 0);
    }
    
    @Override
    public void keyPressed(final int lllllllllllllIlIIllIIIIlIlIIlIlI, final char lllllllllllllIlIIllIIIIlIlIIlIIl) {
        if (lIlllIIIllIIIlI(lllllllllllllIlIIllIIIIlIlIIlIlI, MusicListenerTest.lIIIIlIIlIllIl[7])) {
            this.musicEnded = (MusicListenerTest.lIIIIlIIlIllIl[0] != 0);
            this.musicSwapped = (MusicListenerTest.lIIIIlIIlIllIl[0] != 0);
            this.music.play();
        }
        if (lIlllIIIllIIIlI(lllllllllllllIlIIllIIIIlIlIIlIlI, MusicListenerTest.lIIIIlIIlIllIl[8])) {
            this.musicEnded = (MusicListenerTest.lIIIIlIIlIllIl[0] != 0);
            this.musicSwapped = (MusicListenerTest.lIIIIlIIlIllIl[0] != 0);
            this.stream.play();
        }
    }
    
    private static String lIlllIIIIIIlIIl(final String lllllllllllllIlIIllIIIIlIIlllIII, final String lllllllllllllIlIIllIIIIlIIllIlll) {
        try {
            final SecretKeySpec lllllllllllllIlIIllIIIIlIIllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIllIIIIlIIllIlll.getBytes(StandardCharsets.UTF_8)), MusicListenerTest.lIIIIlIIlIllIl[12]), "DES");
            final Cipher lllllllllllllIlIIllIIIIlIIllllII = Cipher.getInstance("DES");
            lllllllllllllIlIIllIIIIlIIllllII.init(MusicListenerTest.lIIIIlIIlIllIl[2], lllllllllllllIlIIllIIIIlIIllllIl);
            return new String(lllllllllllllIlIIllIIIIlIIllllII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIllIIIIlIIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIllIIIIlIIlllIll) {
            lllllllllllllIlIIllIIIIlIIlllIll.printStackTrace();
            return null;
        }
    }
}
