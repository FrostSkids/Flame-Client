// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.CachedRender;
import org.newdawn.slick.BasicGame;

public class CachedRenderTest extends BasicGame
{
    private static final /* synthetic */ int[] llIIllIIIlllIl;
    private /* synthetic */ Runnable operations;
    private static final /* synthetic */ String[] llIIllIIIlllII;
    private /* synthetic */ boolean drawCached;
    private /* synthetic */ CachedRender cached;
    
    public void render(final GameContainer llllllllllllIlllIIIIIlllllIIlIlI, final Graphics llllllllllllIlllIIIIIlllllIIIlll) throws SlickException {
        llllllllllllIlllIIIIIlllllIIIlll.setColor(Color.white);
        llllllllllllIlllIIIIIlllllIIIlll.drawString(CachedRenderTest.llIIllIIIlllII[CachedRenderTest.llIIllIIIlllIl[2]], 10.0f, 130.0f);
        if (lIIIlllIIllllIII(this.drawCached ? 1 : 0)) {
            llllllllllllIlllIIIIIlllllIIIlll.drawString(CachedRenderTest.llIIllIIIlllII[CachedRenderTest.llIIllIIIlllIl[3]], 10.0f, 100.0f);
            this.cached.render();
            "".length();
            if (-" ".length() > "   ".length()) {
                return;
            }
        }
        else {
            llllllllllllIlllIIIIIlllllIIIlll.drawString(CachedRenderTest.llIIllIIIlllII[CachedRenderTest.llIIllIIIlllIl[4]], 10.0f, 100.0f);
            this.operations.run();
        }
    }
    
    @Override
    public void init(final GameContainer llllllllllllIlllIIIIIlllllIlIlIl) throws SlickException {
        this.operations = new Runnable() {
            private static final /* synthetic */ int[] lllIlIllIlIlll;
            
            private static boolean lIlIIIllIlIlllIl(final int llllllllllllIlIllIlIIllllllIlIll, final int llllllllllllIlIllIlIIllllllIlIlI) {
                return llllllllllllIlIllIlIIllllllIlIll < llllllllllllIlIllIlIIllllllIlIlI;
            }
            
            public void run() {
                int llllllllllllIlIllIlIIlllllllIIlI = CachedRenderTest$1.lllIlIllIlIlll[0];
                while (lIlIIIllIlIlllIl(llllllllllllIlIllIlIIlllllllIIlI, CachedRenderTest$1.lllIlIllIlIlll[1])) {
                    final int llllllllllllIlIllIlIIlllllllIIll = llllllllllllIlIllIlIIlllllllIIlI + CachedRenderTest$1.lllIlIllIlIlll[1];
                    llllllllllllIlllIIIIIlllllIlIlIl.getGraphics().setColor(new Color(llllllllllllIlIllIlIIlllllllIIll, llllllllllllIlIllIlIIlllllllIIll, llllllllllllIlIllIlIIlllllllIIll, llllllllllllIlIllIlIIlllllllIIll));
                    llllllllllllIlllIIIIIlllllIlIlIl.getGraphics().drawOval((float)(llllllllllllIlIllIlIIlllllllIIlI * CachedRenderTest$1.lllIlIllIlIlll[2] + CachedRenderTest$1.lllIlIllIlIlll[3]), (float)(llllllllllllIlIllIlIIlllllllIIlI * CachedRenderTest$1.lllIlIllIlIlll[4] + CachedRenderTest$1.lllIlIllIlIlll[3]), 100.0f, 100.0f);
                    ++llllllllllllIlIllIlIIlllllllIIlI;
                    "".length();
                    if (((0x3D ^ 0x4) & ~(0xA5 ^ 0x9C)) != ((0x6F ^ 0x7A) & ~(0x6A ^ 0x7F))) {
                        return;
                    }
                }
            }
            
            private static void lIlIIIllIlIlllII() {
                (lllIlIllIlIlll = new int[5])[0] = ((0xD ^ 0x5A) & ~(0xDF ^ 0x88));
                CachedRenderTest$1.lllIlIllIlIlll[1] = (0xA ^ 0x6E);
                CachedRenderTest$1.lllIlIllIlIlll[2] = (0x1B ^ 0x1E);
                CachedRenderTest$1.lllIlIllIlIlll[3] = (0x33 ^ 0x1);
                CachedRenderTest$1.lllIlIllIlIlll[4] = "   ".length();
            }
            
            static {
                lIlIIIllIlIlllII();
            }
        };
        this.cached = new CachedRender(this.operations);
    }
    
    private static String lIIIlllIIlllIlIl(final String llllllllllllIlllIIIIIllllIlIlIll, final String llllllllllllIlllIIIIIllllIlIllII) {
        try {
            final SecretKeySpec llllllllllllIlllIIIIIllllIllIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIIIllllIlIllII.getBytes(StandardCharsets.UTF_8)), CachedRenderTest.llIIllIIIlllIl[8]), "DES");
            final Cipher llllllllllllIlllIIIIIllllIlIllll = Cipher.getInstance("DES");
            llllllllllllIlllIIIIIllllIlIllll.init(CachedRenderTest.llIIllIIIlllIl[3], llllllllllllIlllIIIIIllllIllIIII);
            return new String(llllllllllllIlllIIIIIllllIlIllll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIIIllllIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIIIIllllIlIlllI) {
            llllllllllllIlllIIIIIllllIlIlllI.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIlllIIlllIlll() {
        (llIIllIIIlllIl = new int[9])[0] = ((0x74 ^ 0x5C) & ~(0x9E ^ 0xB6));
        CachedRenderTest.llIIllIIIlllIl[1] = (0x1A ^ 0x23);
        CachedRenderTest.llIIllIIIlllIl[2] = " ".length();
        CachedRenderTest.llIIllIIIlllIl[3] = "  ".length();
        CachedRenderTest.llIIllIIIlllIl[4] = "   ".length();
        CachedRenderTest.llIIllIIIlllIl[5] = (-(0xFFFFBE57 & 0x7DFF) & (0xFFFFFFF6 & 0x3F7F));
        CachedRenderTest.llIIllIIIlllIl[6] = (0xFFFF83FC & 0x7E5B);
        CachedRenderTest.llIIllIIIlllIl[7] = (0x9C ^ 0x98);
        CachedRenderTest.llIIllIIIlllIl[8] = (0x76 ^ 0x7E ^ ((0x1F ^ 0x54) & ~(0x61 ^ 0x2A)));
    }
    
    private static void lIIIlllIIlllIllI() {
        (llIIllIIIlllII = new String[CachedRenderTest.llIIllIIIlllIl[7]])[CachedRenderTest.llIIllIIIlllIl[0]] = lIIIlllIIlllIlII("maNCLaGNThOhDob6TMe8o5V64/GjRtxf", "WCLbN");
        CachedRenderTest.llIIllIIIlllII[CachedRenderTest.llIIllIIIlllIl[2]] = lIIIlllIIlllIlIl("K30IAJeVcHX+4TNt9jF3zXI6mWY2OHLR2NM8wW/PFAY=", "eUPnY");
        CachedRenderTest.llIIllIIIlllII[CachedRenderTest.llIIllIIIlllIl[3]] = lIIIlllIIlllIlII("PBTcPcZv7y+9ffUAVkgj0XimAEgbjgzn", "yloAW");
        CachedRenderTest.llIIllIIIlllII[CachedRenderTest.llIIllIIIlllIl[4]] = lIIIlllIIlllIlIl("5HDlbOTsLOmPs8vuhE5RgQ==", "ouxFW");
    }
    
    @Override
    public void update(final GameContainer llllllllllllIlllIIIIIlllllIIlllI, final int llllllllllllIlllIIIIIlllllIlIIII) throws SlickException {
        if (lIIIlllIIllllIII(llllllllllllIlllIIIIIlllllIIlllI.getInput().isKeyPressed(CachedRenderTest.llIIllIIIlllIl[1]) ? 1 : 0)) {
            int drawCached;
            if (lIIIlllIIllllIIl(this.drawCached ? 1 : 0)) {
                drawCached = CachedRenderTest.llIIllIIIlllIl[2];
                "".length();
                if (" ".length() >= "  ".length()) {
                    return;
                }
            }
            else {
                drawCached = CachedRenderTest.llIIllIIIlllIl[0];
            }
            this.drawCached = (drawCached != 0);
        }
    }
    
    private static boolean lIIIlllIIllllIII(final int llllllllllllIlllIIIIIllllIlIIllI) {
        return llllllllllllIlllIIIIIllllIlIIllI != 0;
    }
    
    static {
        lIIIlllIIlllIlll();
        lIIIlllIIlllIllI();
    }
    
    private static String lIIIlllIIlllIlII(final String llllllllllllIlllIIIIIllllIlllIlI, final String llllllllllllIlllIIIIIllllIllIlll) {
        try {
            final SecretKeySpec llllllllllllIlllIIIIIllllIllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIIIllllIllIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIIIIIllllIllllII = Cipher.getInstance("Blowfish");
            llllllllllllIlllIIIIIllllIllllII.init(CachedRenderTest.llIIllIIIlllIl[3], llllllllllllIlllIIIIIllllIllllIl);
            return new String(llllllllllllIlllIIIIIllllIllllII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIIIllllIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIIIIllllIlllIll) {
            llllllllllllIlllIIIIIllllIlllIll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIlllIIllllIIl(final int llllllllllllIlllIIIIIllllIlIIlII) {
        return llllllllllllIlllIIIIIllllIlIIlII == 0;
    }
    
    public CachedRenderTest() {
        super(CachedRenderTest.llIIllIIIlllII[CachedRenderTest.llIIllIIIlllIl[0]]);
    }
    
    public static void main(final String[] llllllllllllIlllIIIIIlllllIIIIll) {
        try {
            final AppGameContainer llllllllllllIlllIIIIIlllllIIIlIl = new AppGameContainer(new CachedRenderTest());
            llllllllllllIlllIIIIIlllllIIIlIl.setDisplayMode(CachedRenderTest.llIIllIIIlllIl[5], CachedRenderTest.llIIllIIIlllIl[6], (boolean)(CachedRenderTest.llIIllIIIlllIl[0] != 0));
            llllllllllllIlllIIIIIlllllIIIlIl.start();
            "".length();
            if ("  ".length() > "   ".length()) {
                return;
            }
        }
        catch (SlickException llllllllllllIlllIIIIIlllllIIIlII) {
            llllllllllllIlllIIIIIlllllIIIlII.printStackTrace();
        }
    }
}
