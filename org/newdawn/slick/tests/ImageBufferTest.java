// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.ImageBuffer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Image;
import org.newdawn.slick.BasicGame;

public class ImageBufferTest extends BasicGame
{
    private static final /* synthetic */ int[] llllIIlllIIIl;
    private /* synthetic */ Image image;
    private static final /* synthetic */ String[] llllIIlllIIII;
    
    @Override
    public void init(final GameContainer lllllllllllllIlIlllIIIllIllIlllI) throws SlickException {
        final ImageBuffer lllllllllllllIlIlllIIIllIllIllIl = new ImageBuffer(ImageBufferTest.llllIIlllIIIl[1], ImageBufferTest.llllIIlllIIIl[2]);
        int lllllllllllllIlIlllIIIllIlllIIII = ImageBufferTest.llllIIlllIIIl[0];
        while (lIlIlIIlIIlIIII(lllllllllllllIlIlllIIIllIlllIIII, ImageBufferTest.llllIIlllIIIl[1])) {
            int lllllllllllllIlIlllIIIllIlllIIIl = ImageBufferTest.llllIIlllIIIl[0];
            while (lIlIlIIlIIlIIII(lllllllllllllIlIlllIIIllIlllIIIl, ImageBufferTest.llllIIlllIIIl[2])) {
                if (lIlIlIIlIIlIIIl(lllllllllllllIlIlllIIIllIlllIIIl, ImageBufferTest.llllIIlllIIIl[3])) {
                    lllllllllllllIlIlllIIIllIllIllIl.setRGBA(lllllllllllllIlIlllIIIllIlllIIII, lllllllllllllIlIlllIIIllIlllIIIl, ImageBufferTest.llllIIlllIIIl[4], ImageBufferTest.llllIIlllIIIl[4], ImageBufferTest.llllIIlllIIIl[4], ImageBufferTest.llllIIlllIIIl[4]);
                    "".length();
                    if ("   ".length() <= 0) {
                        return;
                    }
                }
                else {
                    lllllllllllllIlIlllIIIllIllIllIl.setRGBA(lllllllllllllIlIlllIIIllIlllIIII, lllllllllllllIlIlllIIIllIlllIIIl, lllllllllllllIlIlllIIIllIlllIIII, lllllllllllllIlIlllIIIllIlllIIIl, ImageBufferTest.llllIIlllIIIl[0], ImageBufferTest.llllIIlllIIIl[4]);
                }
                ++lllllllllllllIlIlllIIIllIlllIIIl;
                "".length();
                if (null != null) {
                    return;
                }
            }
            ++lllllllllllllIlIlllIIIllIlllIIII;
            "".length();
            if ("   ".length() > (143 + 64 - 121 + 93 ^ 22 + 175 - 184 + 170)) {
                return;
            }
        }
        this.image = lllllllllllllIlIlllIIIllIllIllIl.getImage();
    }
    
    public static void main(final String[] lllllllllllllIlIlllIIIllIlIllIII) {
        try {
            final AppGameContainer lllllllllllllIlIlllIIIllIlIllIlI = new AppGameContainer(new ImageBufferTest());
            lllllllllllllIlIlllIIIllIlIllIlI.setDisplayMode(ImageBufferTest.llllIIlllIIIl[6], ImageBufferTest.llllIIlllIIIl[7], (boolean)(ImageBufferTest.llllIIlllIIIl[0] != 0));
            lllllllllllllIlIlllIIIllIlIllIlI.start();
            "".length();
            if (-" ".length() != -" ".length()) {
                return;
            }
        }
        catch (SlickException lllllllllllllIlIlllIIIllIlIllIIl) {
            lllllllllllllIlIlllIIIllIlIllIIl.printStackTrace();
        }
    }
    
    private static void lIlIlIIlIIIllll() {
        (llllIIlllIIIl = new int[8])[0] = ((0xB2 ^ 0xA1) & ~(0x86 ^ 0x95));
        ImageBufferTest.llllIIlllIIIl[1] = (-(-1 & 0x5EAF) & (-1 & 0x5FEE));
        ImageBufferTest.llllIIlllIIIl[2] = 72 + 90 + 19 + 19;
        ImageBufferTest.llllIIlllIIIl[3] = (0xA9 ^ 0xBD);
        ImageBufferTest.llllIIlllIIIl[4] = 168 + 105 - 169 + 151;
        ImageBufferTest.llllIIlllIIIl[5] = " ".length();
        ImageBufferTest.llllIIlllIIIl[6] = (-(0xFFFFFBC7 & 0x1CFD) & (0xFFFFDFED & 0x3BF6));
        ImageBufferTest.llllIIlllIIIl[7] = (-(0xFFFFDDAF & 0x3B71) & (0xFFFF9F79 & 0x7BFE));
    }
    
    private static void lIlIlIIlIIIlllI() {
        (llllIIlllIIII = new String[ImageBufferTest.llllIIlllIIIl[5]])[ImageBufferTest.llllIIlllIIIl[0]] = lIlIlIIlIIIllIl("CgkDHw9jJhceDCYWQiwPMBA=", "Cdbxj");
    }
    
    @Override
    public void update(final GameContainer lllllllllllllIlIlllIIIllIllIIIlI, final int lllllllllllllIlIlllIIIllIllIIIIl) {
    }
    
    private static boolean lIlIlIIlIIlIIIl(final int lllllllllllllIlIlllIIIllIIllllII, final int lllllllllllllIlIlllIIIllIIlllIll) {
        return lllllllllllllIlIlllIIIllIIllllII == lllllllllllllIlIlllIIIllIIlllIll;
    }
    
    public ImageBufferTest() {
        super(ImageBufferTest.llllIIlllIIII[ImageBufferTest.llllIIlllIIIl[0]]);
    }
    
    public void render(final GameContainer lllllllllllllIlIlllIIIllIllIIllI, final Graphics lllllllllllllIlIlllIIIllIllIIlIl) {
        this.image.draw(50.0f, 50.0f);
    }
    
    static {
        lIlIlIIlIIIllll();
        lIlIlIIlIIIlllI();
    }
    
    @Override
    public void keyPressed(final int lllllllllllllIlIlllIIIllIlIlllII, final char lllllllllllllIlIlllIIIllIlIlllIl) {
        if (lIlIlIIlIIlIIIl(lllllllllllllIlIlllIIIllIlIlllII, ImageBufferTest.llllIIlllIIIl[5])) {
            System.exit(ImageBufferTest.llllIIlllIIIl[0]);
        }
    }
    
    private static boolean lIlIlIIlIIlIIII(final int lllllllllllllIlIlllIIIllIIlllIII, final int lllllllllllllIlIlllIIIllIIllIlll) {
        return lllllllllllllIlIlllIIIllIIlllIII < lllllllllllllIlIlllIIIllIIllIlll;
    }
    
    private static String lIlIlIIlIIIllIl(String lllllllllllllIlIlllIIIllIlIIIlll, final String lllllllllllllIlIlllIIIllIlIIIllI) {
        lllllllllllllIlIlllIIIllIlIIIlll = (double)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIlllIIIllIlIIIlll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlllIIIllIlIIlIlI = new StringBuilder();
        final char[] lllllllllllllIlIlllIIIllIlIIlIIl = lllllllllllllIlIlllIIIllIlIIIllI.toCharArray();
        int lllllllllllllIlIlllIIIllIlIIlIII = ImageBufferTest.llllIIlllIIIl[0];
        final boolean lllllllllllllIlIlllIIIllIlIIIIlI = (Object)((String)lllllllllllllIlIlllIIIllIlIIIlll).toCharArray();
        final long lllllllllllllIlIlllIIIllIlIIIIIl = lllllllllllllIlIlllIIIllIlIIIIlI.length;
        char lllllllllllllIlIlllIIIllIlIIIIII = (char)ImageBufferTest.llllIIlllIIIl[0];
        while (lIlIlIIlIIlIIII(lllllllllllllIlIlllIIIllIlIIIIII, (int)lllllllllllllIlIlllIIIllIlIIIIIl)) {
            final char lllllllllllllIlIlllIIIllIlIIllIl = lllllllllllllIlIlllIIIllIlIIIIlI[lllllllllllllIlIlllIIIllIlIIIIII];
            lllllllllllllIlIlllIIIllIlIIlIlI.append((char)(lllllllllllllIlIlllIIIllIlIIllIl ^ lllllllllllllIlIlllIIIllIlIIlIIl[lllllllllllllIlIlllIIIllIlIIlIII % lllllllllllllIlIlllIIIllIlIIlIIl.length]));
            "".length();
            ++lllllllllllllIlIlllIIIllIlIIlIII;
            ++lllllllllllllIlIlllIIIllIlIIIIII;
            "".length();
            if (((27 + 44 - 33 + 104 ^ 60 + 48 - 66 + 108) & (2 + 105 + 9 + 32 ^ 91 + 130 - 144 + 63 ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlllIIIllIlIIlIlI);
    }
}
