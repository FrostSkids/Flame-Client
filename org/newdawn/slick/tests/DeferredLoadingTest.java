// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import org.newdawn.slick.Graphics;
import java.io.IOException;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.AngelCodeFont;
import org.newdawn.slick.loading.LoadingList;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Music;
import org.newdawn.slick.loading.DeferredResource;
import org.newdawn.slick.Sound;
import org.newdawn.slick.Image;
import org.newdawn.slick.Font;
import org.newdawn.slick.BasicGame;

public class DeferredLoadingTest extends BasicGame
{
    private static final /* synthetic */ String[] lIlIlIIIIIlIll;
    private /* synthetic */ Font font;
    private /* synthetic */ Image image;
    private /* synthetic */ Sound sound;
    private /* synthetic */ boolean started;
    private /* synthetic */ DeferredResource nextResource;
    private /* synthetic */ Music music;
    private static final /* synthetic */ int[] lIlIlIIIIlllII;
    
    private static boolean lllIlIlIllllIIl(final Object lllllllllllllIIIlIlIlllllIIlIllI) {
        return lllllllllllllIIIlIlIlllllIIlIllI != null;
    }
    
    @Override
    public void init(final GameContainer lllllllllllllIIIlIlIllllllllIIII) throws SlickException {
        LoadingList.setDeferredLoading((boolean)(DeferredLoadingTest.lIlIlIIIIlllII[1] != 0));
        new Sound(DeferredLoadingTest.lIlIlIIIIIlIll[DeferredLoadingTest.lIlIlIIIIlllII[1]]);
        "".length();
        new Sound(DeferredLoadingTest.lIlIlIIIIIlIll[DeferredLoadingTest.lIlIlIIIIlllII[2]]);
        "".length();
        this.sound = new Sound(DeferredLoadingTest.lIlIlIIIIIlIll[DeferredLoadingTest.lIlIlIIIIlllII[3]]);
        new Music(DeferredLoadingTest.lIlIlIIIIIlIll[DeferredLoadingTest.lIlIlIIIIlllII[4]]);
        "".length();
        this.music = new Music(DeferredLoadingTest.lIlIlIIIIIlIll[DeferredLoadingTest.lIlIlIIIIlllII[5]]);
        new Image(DeferredLoadingTest.lIlIlIIIIIlIll[DeferredLoadingTest.lIlIlIIIIlllII[6]]);
        "".length();
        new Image(DeferredLoadingTest.lIlIlIIIIIlIll[DeferredLoadingTest.lIlIlIIIIlllII[7]]);
        "".length();
        new Image(DeferredLoadingTest.lIlIlIIIIIlIll[DeferredLoadingTest.lIlIlIIIIlllII[8]]);
        "".length();
        new Image(DeferredLoadingTest.lIlIlIIIIIlIll[DeferredLoadingTest.lIlIlIIIIlllII[9]]);
        "".length();
        new Image(DeferredLoadingTest.lIlIlIIIIIlIll[DeferredLoadingTest.lIlIlIIIIlllII[10]]);
        "".length();
        new Image(DeferredLoadingTest.lIlIlIIIIIlIll[DeferredLoadingTest.lIlIlIIIIlllII[11]]);
        "".length();
        this.image = new Image(DeferredLoadingTest.lIlIlIIIIIlIll[DeferredLoadingTest.lIlIlIIIIlllII[12]]);
        new Image(DeferredLoadingTest.lIlIlIIIIIlIll[DeferredLoadingTest.lIlIlIIIIlllII[13]]);
        "".length();
        new Image(DeferredLoadingTest.lIlIlIIIIIlIll[DeferredLoadingTest.lIlIlIIIIlllII[14]]);
        "".length();
        new Image(DeferredLoadingTest.lIlIlIIIIIlIll[DeferredLoadingTest.lIlIlIIIIlllII[15]]);
        "".length();
        this.font = new AngelCodeFont(DeferredLoadingTest.lIlIlIIIIIlIll[DeferredLoadingTest.lIlIlIIIIlllII[16]], DeferredLoadingTest.lIlIlIIIIIlIll[DeferredLoadingTest.lIlIlIIIIlllII[17]]);
    }
    
    private static String lllIlIlIlIlIIII(String lllllllllllllIIIlIlIlllllIllIIIl, final String lllllllllllllIIIlIlIlllllIllIlIl) {
        lllllllllllllIIIlIlIlllllIllIIIl = new String(Base64.getDecoder().decode(lllllllllllllIIIlIlIlllllIllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlIlIlllllIllIlII = new StringBuilder();
        final char[] lllllllllllllIIIlIlIlllllIllIIll = lllllllllllllIIIlIlIlllllIllIlIl.toCharArray();
        int lllllllllllllIIIlIlIlllllIllIIlI = DeferredLoadingTest.lIlIlIIIIlllII[0];
        final boolean lllllllllllllIIIlIlIlllllIlIllII = (Object)lllllllllllllIIIlIlIlllllIllIIIl.toCharArray();
        final double lllllllllllllIIIlIlIlllllIlIlIll = lllllllllllllIIIlIlIlllllIlIllII.length;
        short lllllllllllllIIIlIlIlllllIlIlIlI = (short)DeferredLoadingTest.lIlIlIIIIlllII[0];
        while (lllIlIlIlllllIl(lllllllllllllIIIlIlIlllllIlIlIlI, (int)lllllllllllllIIIlIlIlllllIlIlIll)) {
            final char lllllllllllllIIIlIlIlllllIllIlll = lllllllllllllIIIlIlIlllllIlIllII[lllllllllllllIIIlIlIlllllIlIlIlI];
            lllllllllllllIIIlIlIlllllIllIlII.append((char)(lllllllllllllIIIlIlIlllllIllIlll ^ lllllllllllllIIIlIlIlllllIllIIll[lllllllllllllIIIlIlIlllllIllIIlI % lllllllllllllIIIlIlIlllllIllIIll.length]));
            "".length();
            ++lllllllllllllIIIlIlIlllllIllIIlI;
            ++lllllllllllllIIIlIlIlllllIlIlIlI;
            "".length();
            if (-" ".length() > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlIlIlllllIllIlII);
    }
    
    private static boolean lllIlIlIlllllIl(final int lllllllllllllIIIlIlIlllllIIllIIl, final int lllllllllllllIIIlIlIlllllIIllIII) {
        return lllllllllllllIIIlIlIlllllIIllIIl < lllllllllllllIIIlIlIlllllIIllIII;
    }
    
    private static void lllIlIlIlIllIll() {
        (lIlIlIIIIIlIll = new String[DeferredLoadingTest.lIlIlIIIIlllII[24]])[DeferredLoadingTest.lIlIlIIIIlllII[0]] = lllIlIlIlIlIIII("JiMINCIQIwpxHA0nCjg+BWY6NCMW", "bFnQP");
        DeferredLoadingTest.lIlIlIIIIIlIll[DeferredLoadingTest.lIlIlIIIIlllII[1]] = lllIlIlIlIlIIIl("2AUyML5vXAWPpEsp0JEUHy7TL2b1cQgA", "ouKBM");
        DeferredLoadingTest.lIlIlIIIIIlIll[DeferredLoadingTest.lIlIlIIIIlllII[2]] = lllIlIlIlIlIIIl("nMSFipLPZcwgOrOh3obJxw28zsjezxoY", "qnehn");
        DeferredLoadingTest.lIlIlIIIIIlIll[DeferredLoadingTest.lIlIlIIIIlllII[3]] = lllIlIlIlIlIIII("Py4BBjYqPxNdIC44BhMgP2UdFTU=", "KKrrR");
        DeferredLoadingTest.lIlIlIIIIIlIll[DeferredLoadingTest.lIlIlIIIIlllII[4]] = lllIlIlIlIllIlI("Bj5IyUecr86HbCngzK7WF9/Lx4E++FQA", "CyClR");
        DeferredLoadingTest.lIlIlIIIIIlIll[DeferredLoadingTest.lIlIlIIIIlllII[5]] = lllIlIlIlIlIIII("NwQQFhUiFQJNIg4jTjpfGyw=", "Cacbq");
        DeferredLoadingTest.lIlIlIIIIIlIll[DeferredLoadingTest.lIlIlIIIIlllII[6]] = lllIlIlIlIllIlI("t33sqJ1nei29Js+cpiMXH9tVL3TcA8IP", "jkNoh");
        DeferredLoadingTest.lIlIlIIIIIlIll[DeferredLoadingTest.lIlIlIIIIlllII[7]] = lllIlIlIlIlIIII("IDYmAi41JzRZKSEhJhk4eicyFw==", "TSUvJ");
        DeferredLoadingTest.lIlIlIIIIIlIll[DeferredLoadingTest.lIlIlIIIIlllII[8]] = lllIlIlIlIlIIIl("pVE7deAl+6A2IKCwtNf3BUxWF1lHm4YK", "ymVxW");
        DeferredLoadingTest.lIlIlIIIIIlIll[DeferredLoadingTest.lIlIlIIIIlllII[9]] = lllIlIlIlIlIIIl("/RPBU70UXCAdA2rdqxz+F8rd+tPmHRe0", "vFgdM");
        DeferredLoadingTest.lIlIlIIIIIlIll[DeferredLoadingTest.lIlIlIIIIlllII[10]] = lllIlIlIlIllIlI("ndCpNu/8vtFx43AMn11hf/X2VO9th14dMf97FToJ26Q=", "axTVB");
        DeferredLoadingTest.lIlIlIIIIIlIll[DeferredLoadingTest.lIlIlIIIIlllII[11]] = lllIlIlIlIllIlI("JjhKmzhib/BMTPX3Di+VGgb16/uc7ijB", "yjVFY");
        DeferredLoadingTest.lIlIlIIIIIlIll[DeferredLoadingTest.lIlIlIIIIlllII[12]] = lllIlIlIlIllIlI("kpVQxJZWVJ/FC8YYVjPWj0uEhX98zeGU", "KbGtX");
        DeferredLoadingTest.lIlIlIIIIIlIll[DeferredLoadingTest.lIlIlIIIIlllII[13]] = lllIlIlIlIlIIIl("2ro7jQQYq30ydWa5zIkbSLWGegKTH/8N", "iLCBr");
        DeferredLoadingTest.lIlIlIIIIIlIll[DeferredLoadingTest.lIlIlIIIIlllII[14]] = lllIlIlIlIlIIIl("1CW8ktYW6+QdtdLmVYQDRSs8ZPagJWDG", "NRezA");
        DeferredLoadingTest.lIlIlIIIIIlIll[DeferredLoadingTest.lIlIlIIIIlllII[15]] = lllIlIlIlIllIlI("H3CzInosejlJYpN0FiWxin4WzgI934zl", "FekOd");
        DeferredLoadingTest.lIlIlIIIIIlIll[DeferredLoadingTest.lIlIlIIIIlllII[16]] = lllIlIlIlIllIlI("WVdu+pMlEIoWJdhguGg6h6YS3aLFegvt", "HhWEp");
        DeferredLoadingTest.lIlIlIIIIIlIll[DeferredLoadingTest.lIlIlIIIIlllII[17]] = lllIlIlIlIllIlI("2/OdY9HKWnRez7CxxnW3DN47dSGc8fRd", "irVFe");
        DeferredLoadingTest.lIlIlIIIIIlIll[DeferredLoadingTest.lIlIlIIIIlllII[18]] = lllIlIlIlIlIIII("ByISEhglKklW", "KMsvq");
        DeferredLoadingTest.lIlIlIIIIIlIll[DeferredLoadingTest.lIlIlIIIIlllII[20]] = lllIlIlIlIlIIII("Hi4RNi0cJnAxKx8xHDcwFw==", "RaPrd");
        DeferredLoadingTest.lIlIlIIIIIlIll[DeferredLoadingTest.lIlIlIIIIlllII[21]] = lllIlIlIlIllIlI("wD7m+DlBgD+lKyCnloO0ty544v7OHFrW", "kytVj");
    }
    
    public static void main(final String[] lllllllllllllIIIlIlIllllllIlIIlI) {
        try {
            final AppGameContainer lllllllllllllIIIlIlIllllllIlIlII = new AppGameContainer(new DeferredLoadingTest());
            lllllllllllllIIIlIlIllllllIlIlII.setDisplayMode(DeferredLoadingTest.lIlIlIIIIlllII[22], DeferredLoadingTest.lIlIlIIIIlllII[23], (boolean)(DeferredLoadingTest.lIlIlIIIIlllII[0] != 0));
            lllllllllllllIIIlIlIllllllIlIlII.start();
            "".length();
            if (-" ".length() >= (0x18 ^ 0x54 ^ (0x4A ^ 0x2))) {
                return;
            }
        }
        catch (SlickException lllllllllllllIIIlIlIllllllIlIIll) {
            lllllllllllllIIIlIlIllllllIlIIll.printStackTrace();
        }
    }
    
    private static boolean lllIlIlIllllIlI(final int lllllllllllllIIIlIlIlllllIIlIlII) {
        return lllllllllllllIIIlIlIlllllIIlIlII != 0;
    }
    
    @Override
    public void keyPressed(final int lllllllllllllIIIlIlIllllllIIllll, final char lllllllllllllIIIlIlIllllllIIlllI) {
    }
    
    private static String lllIlIlIlIllIlI(final String lllllllllllllIIIlIlIlllllIlIIIIl, final String lllllllllllllIIIlIlIlllllIlIIIII) {
        try {
            final SecretKeySpec lllllllllllllIIIlIlIlllllIlIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIlIlllllIlIIIII.getBytes(StandardCharsets.UTF_8)), DeferredLoadingTest.lIlIlIIIIlllII[8]), "DES");
            final Cipher lllllllllllllIIIlIlIlllllIlIIIll = Cipher.getInstance("DES");
            lllllllllllllIIIlIlIlllllIlIIIll.init(DeferredLoadingTest.lIlIlIIIIlllII[2], lllllllllllllIIIlIlIlllllIlIIlII);
            return new String(lllllllllllllIIIlIlIlllllIlIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIlIlllllIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIlIlllllIlIIIlI) {
            lllllllllllllIIIlIlIlllllIlIIIlI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void update(final GameContainer lllllllllllllIIIlIlIllllllIllIIl, final int lllllllllllllIIIlIlIllllllIllIII) throws SlickException {
        if (lllIlIlIllllIIl(this.nextResource)) {
            try {
                this.nextResource.load();
                try {
                    Thread.sleep(50L);
                    "".length();
                    if (((0xA2 ^ 0xC4 ^ (0x9F ^ 0xB7)) & (0x10 ^ 0x70 ^ (0xB3 ^ 0x9D) ^ -" ".length())) < 0) {
                        return;
                    }
                }
                catch (Exception ex) {}
                "".length();
                if (((0x3 ^ 0x56) & ~(0x60 ^ 0x35)) > 0) {
                    return;
                }
            }
            catch (IOException lllllllllllllIIIlIlIllllllIllIll) {
                throw new SlickException(String.valueOf(new StringBuilder().append(DeferredLoadingTest.lIlIlIIIIIlIll[DeferredLoadingTest.lIlIlIIIIlllII[21]]).append(this.nextResource.getDescription())), lllllllllllllIIIlIlIllllllIllIll);
            }
            this.nextResource = null;
        }
        if (lllIlIlIllllIll(LoadingList.get().getRemainingResources())) {
            this.nextResource = LoadingList.get().getNext();
            "".length();
            if ((0x64 ^ 0x60) < (0x1A ^ 0x1E)) {
                return;
            }
        }
        else if (lllIlIlIlllllII(this.started ? 1 : 0)) {
            this.started = (DeferredLoadingTest.lIlIlIIIIlllII[1] != 0);
            this.music.loop();
            this.sound.play();
        }
    }
    
    private static boolean lllIlIlIllllIll(final int lllllllllllllIIIlIlIlllllIIlIIII) {
        return lllllllllllllIIIlIlIlllllIIlIIII > 0;
    }
    
    private static void lllIlIlIllllIII() {
        (lIlIlIIIIlllII = new int[25])[0] = ((0xF ^ 0x16) & ~(0xB7 ^ 0xAE));
        DeferredLoadingTest.lIlIlIIIIlllII[1] = " ".length();
        DeferredLoadingTest.lIlIlIIIIlllII[2] = "  ".length();
        DeferredLoadingTest.lIlIlIIIIlllII[3] = "   ".length();
        DeferredLoadingTest.lIlIlIIIIlllII[4] = (111 + 18 - 87 + 153 ^ 79 + 133 - 149 + 136);
        DeferredLoadingTest.lIlIlIIIIlllII[5] = (40 + 107 - 78 + 85 ^ 106 + 28 - 69 + 94);
        DeferredLoadingTest.lIlIlIIIIlllII[6] = (0x14 ^ 0x72 ^ (0xA5 ^ 0xC5));
        DeferredLoadingTest.lIlIlIIIIlllII[7] = (0xC6 ^ 0xC1);
        DeferredLoadingTest.lIlIlIIIIlllII[8] = (0xCF ^ 0x90 ^ (0x61 ^ 0x36));
        DeferredLoadingTest.lIlIlIIIIlllII[9] = (0x7C ^ 0x6F ^ (0x6E ^ 0x74));
        DeferredLoadingTest.lIlIlIIIIlllII[10] = (0xE4 ^ 0xB5 ^ (0x0 ^ 0x5B));
        DeferredLoadingTest.lIlIlIIIIlllII[11] = (0x1F ^ 0x14);
        DeferredLoadingTest.lIlIlIIIIlllII[12] = (0x93 ^ 0x8A ^ (0x23 ^ 0x36));
        DeferredLoadingTest.lIlIlIIIIlllII[13] = (0x7D ^ 0x25 ^ (0x3 ^ 0x56));
        DeferredLoadingTest.lIlIlIIIIlllII[14] = (60 + 77 - 47 + 38 ^ 113 + 16 - 22 + 35);
        DeferredLoadingTest.lIlIlIIIIlllII[15] = (0x6B ^ 0x64);
        DeferredLoadingTest.lIlIlIIIIlllII[16] = (0x64 ^ 0x6D ^ (0x82 ^ 0x9B));
        DeferredLoadingTest.lIlIlIIIIlllII[17] = (0x6C ^ 0x73 ^ (0x43 ^ 0x4D));
        DeferredLoadingTest.lIlIlIIIIlllII[18] = (0x8 ^ 0x1C ^ (0xB ^ 0xD));
        DeferredLoadingTest.lIlIlIIIIlllII[19] = (0x8D ^ 0x9C ^ (0x42 ^ 0x7B));
        DeferredLoadingTest.lIlIlIIIIlllII[20] = (0x6F ^ 0x7C);
        DeferredLoadingTest.lIlIlIIIIlllII[21] = (0x4A ^ 0x5E);
        DeferredLoadingTest.lIlIlIIIIlllII[22] = (0xFFFFEF68 & 0x13B7);
        DeferredLoadingTest.lIlIlIIIIlllII[23] = (0xFFFFA65D & 0x5BFA);
        DeferredLoadingTest.lIlIlIIIIlllII[24] = (0xAF ^ 0xBA);
    }
    
    static {
        lllIlIlIllllIII();
        lllIlIlIlIllIll();
    }
    
    public DeferredLoadingTest() {
        super(DeferredLoadingTest.lIlIlIIIIIlIll[DeferredLoadingTest.lIlIlIIIIlllII[0]]);
    }
    
    private static boolean lllIlIlIlllllII(final int lllllllllllllIIIlIlIlllllIIlIIlI) {
        return lllllllllllllIIIlIlIlllllIIlIIlI == 0;
    }
    
    public void render(final GameContainer lllllllllllllIIIlIlIlllllllIlIII, final Graphics lllllllllllllIIIlIlIlllllllIIIlI) {
        if (lllIlIlIllllIIl(this.nextResource)) {
            lllllllllllllIIIlIlIlllllllIIIlI.drawString(String.valueOf(new StringBuilder().append(DeferredLoadingTest.lIlIlIIIIIlIll[DeferredLoadingTest.lIlIlIIIIlllII[18]]).append(this.nextResource.getDescription())), 100.0f, 100.0f);
        }
        final int lllllllllllllIIIlIlIlllllllIIllI = LoadingList.get().getTotalResources();
        final int lllllllllllllIIIlIlIlllllllIIlIl = LoadingList.get().getTotalResources() - LoadingList.get().getRemainingResources();
        final float lllllllllllllIIIlIlIlllllllIIlII = lllllllllllllIIIlIlIlllllllIIlIl / (float)lllllllllllllIIIlIlIlllllllIIllI;
        lllllllllllllIIIlIlIlllllllIIIlI.fillRect(100.0f, 150.0f, (float)(lllllllllllllIIIlIlIlllllllIIlIl * DeferredLoadingTest.lIlIlIIIIlllII[19]), 20.0f);
        lllllllllllllIIIlIlIlllllllIIIlI.drawRect(100.0f, 150.0f, (float)(lllllllllllllIIIlIlIlllllllIIllI * DeferredLoadingTest.lIlIlIIIIlllII[19]), 20.0f);
        if (lllIlIlIllllIlI(this.started ? 1 : 0)) {
            this.image.draw(100.0f, 200.0f);
            this.font.drawString(100.0f, 500.0f, DeferredLoadingTest.lIlIlIIIIIlIll[DeferredLoadingTest.lIlIlIIIIlllII[20]]);
        }
    }
    
    private static String lllIlIlIlIlIIIl(final String lllllllllllllIIIlIlIllllllIIIllI, final String lllllllllllllIIIlIlIllllllIIIIll) {
        try {
            final SecretKeySpec lllllllllllllIIIlIlIllllllIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIlIllllllIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIlIlIllllllIIlIII = Cipher.getInstance("Blowfish");
            lllllllllllllIIIlIlIllllllIIlIII.init(DeferredLoadingTest.lIlIlIIIIlllII[2], lllllllllllllIIIlIlIllllllIIlIIl);
            return new String(lllllllllllllIIIlIlIllllllIIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIlIllllllIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIlIllllllIIIlll) {
            lllllllllllllIIIlIlIllllllIIIlll.printStackTrace();
            return null;
        }
    }
}
