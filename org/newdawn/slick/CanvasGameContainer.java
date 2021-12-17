// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick;

import org.newdawn.slick.util.Log;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import javax.swing.SwingUtilities;
import java.awt.Canvas;

public class CanvasGameContainer extends Canvas
{
    private static final /* synthetic */ int[] lllIllIIllllII;
    protected /* synthetic */ Container container;
    protected /* synthetic */ Game game;
    
    public GameContainer getContainer() {
        return this.container;
    }
    
    public void dispose() {
    }
    
    public CanvasGameContainer(final Game llllllllllllIlIllIIlIllIIlIlIIll) throws SlickException {
        this(llllllllllllIlIllIIlIllIIlIlIIll, (boolean)(CanvasGameContainer.lllIllIIllllII[0] != 0));
    }
    
    static {
        lIlIIlIIlIIlIlll();
    }
    
    public CanvasGameContainer(final Game llllllllllllIlIllIIlIllIIlIIllII, final boolean llllllllllllIlIllIIlIllIIlIIlIll) throws SlickException {
        this.game = llllllllllllIlIllIIlIllIIlIIllII;
        this.setIgnoreRepaint((boolean)(CanvasGameContainer.lllIllIIllllII[1] != 0));
        this.requestFocus();
        this.setSize(CanvasGameContainer.lllIllIIllllII[2], CanvasGameContainer.lllIllIIllllII[2]);
        this.container = new Container(llllllllllllIlIllIIlIllIIlIIllII, llllllllllllIlIllIIlIllIIlIIlIll);
        this.container.setForceExit((boolean)(CanvasGameContainer.lllIllIIllllII[0] != 0));
    }
    
    private void scheduleUpdate() {
        if (lIlIIlIIlIIllIII(this.isVisible() ? 1 : 0)) {
            return;
        }
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                try {
                    CanvasGameContainer.this.container.gameLoop();
                    "".length();
                    if ("   ".length() < "  ".length()) {
                        return;
                    }
                }
                catch (SlickException lllllllllllllIIIIIlIIlIIIIllIlIl) {
                    lllllllllllllIIIIIlIIlIIIIllIlIl.printStackTrace();
                }
                CanvasGameContainer.this.container.checkDimensions();
                CanvasGameContainer.this.scheduleUpdate();
            }
        });
    }
    
    public void start() throws SlickException {
        SwingUtilities.invokeLater(new Runnable() {
            private static final /* synthetic */ String[] lllIlIIllIllll;
            private static final /* synthetic */ int[] lllIlIIlllIIII;
            
            public void run() {
                try {
                    Input.disableControllers();
                    try {
                        Display.setParent((Canvas)CanvasGameContainer.this);
                        "".length();
                        if (((0x6D ^ 0x75) & ~(0x9A ^ 0x82)) != 0x0) {
                            return;
                        }
                    }
                    catch (LWJGLException llllllllllllIlIllIlllIlIIllllIIl) {
                        throw new SlickException(CanvasGameContainer$1.lllIlIIllIllll[CanvasGameContainer$1.lllIlIIlllIIII[0]], (Throwable)llllllllllllIlIllIlllIlIIllllIIl);
                    }
                    CanvasGameContainer.this.container.setup();
                    CanvasGameContainer.this.scheduleUpdate();
                    "".length();
                    if ("   ".length() <= 0) {
                        return;
                    }
                }
                catch (SlickException llllllllllllIlIllIlllIlIIllllIII) {
                    llllllllllllIlIllIlllIlIIllllIII.printStackTrace();
                    System.exit(CanvasGameContainer$1.lllIlIIlllIIII[0]);
                }
            }
            
            private static String lIlIIIlIIlllIlIl(final String llllllllllllIlIllIlllIlIIllIllIl, final String llllllllllllIlIllIlllIlIIllIllII) {
                try {
                    final SecretKeySpec llllllllllllIlIllIlllIlIIlllIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIlllIlIIllIllII.getBytes(StandardCharsets.UTF_8)), CanvasGameContainer$1.lllIlIIlllIIII[2]), "DES");
                    final Cipher llllllllllllIlIllIlllIlIIllIllll = Cipher.getInstance("DES");
                    llllllllllllIlIllIlllIlIIllIllll.init(CanvasGameContainer$1.lllIlIIlllIIII[3], llllllllllllIlIllIlllIlIIlllIIII);
                    return new String(llllllllllllIlIllIlllIlIIllIllll.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIlllIlIIllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIlIllIlllIlIIllIlllI) {
                    llllllllllllIlIllIlllIlIIllIlllI.printStackTrace();
                    return null;
                }
            }
            
            private static void lIlIIIlIIllllIII() {
                (lllIlIIlllIIII = new int[4])[0] = ((0xB1 ^ 0xA3) & ~(0xB6 ^ 0xA4));
                CanvasGameContainer$1.lllIlIIlllIIII[1] = " ".length();
                CanvasGameContainer$1.lllIlIIlllIIII[2] = (0x54 ^ 0x5C);
                CanvasGameContainer$1.lllIlIIlllIIII[3] = "  ".length();
            }
            
            private static void lIlIIIlIIlllIllI() {
                (lllIlIIllIllll = new String[CanvasGameContainer$1.lllIlIIlllIIII[1]])[CanvasGameContainer$1.lllIlIIlllIIII[0]] = lIlIIIlIIlllIlIl("4w3AsFDkxuVTw7/7h44xU0BI+ZC91BMSR7xL9cr39lU=", "RqAEX");
            }
            
            static {
                lIlIIIlIIllllIII();
                lIlIIIlIIlllIllI();
            }
        });
    }
    
    private static void lIlIIlIIlIIlIlll() {
        (lllIllIIllllII = new int[3])[0] = ((0x16 ^ 0x0 ^ (0x9 ^ 0x4A)) & (0x48 ^ 0x69 ^ (0xC ^ 0x78) ^ -" ".length()));
        CanvasGameContainer.lllIllIIllllII[1] = " ".length();
        CanvasGameContainer.lllIllIIllllII[2] = (-(0xFFFFCD2F & 0x3EDB) & (0xFFFFADFF & 0x5FFE));
    }
    
    private static boolean lIlIIlIIlIIllIII(final int llllllllllllIlIllIIlIllIIIlllIIl) {
        return llllllllllllIlIllIIlIllIIIlllIIl == 0;
    }
    
    private class Container extends AppGameContainer
    {
        private static final /* synthetic */ int[] lllIllIllIIllI;
        
        @Override
        public int getWidth() {
            return CanvasGameContainer.this.getWidth();
        }
        
        private static boolean lIlIIlIlIIIllIII(final int llllllllllllIlIllIIIlllIIllIlIll) {
            return llllllllllllIlIllIIIlllIIllIlIll != 0;
        }
        
        private static boolean lIlIIlIlIIIllIlI(final int llllllllllllIlIllIIIlllIIllIlIII, final int llllllllllllIlIllIIIlllIIllIIlll) {
            return llllllllllllIlIllIIIlllIIllIlIII != llllllllllllIlIllIIIlllIIllIIlll;
        }
        
        public Container(final Game llllllllllllIlIllIIIlllIlIIIlIII, final boolean llllllllllllIlIllIIIlllIlIIIIIll) throws SlickException {
            super(llllllllllllIlIllIIIlllIlIIIlIII, CanvasGameContainer.this.getWidth(), CanvasGameContainer.this.getHeight(), (boolean)(Container.lllIllIllIIllI[0] != 0));
            this.width = CanvasGameContainer.this.getWidth();
            this.height = CanvasGameContainer.this.getHeight();
            if (lIlIIlIlIIIllIII(llllllllllllIlIllIIIlllIlIIIIIll ? 1 : 0)) {
                enableSharedContext();
            }
        }
        
        public void checkDimensions() {
            if (lIlIIlIlIIIllIIl(this.width, CanvasGameContainer.this.getWidth())) {
                if (!lIlIIlIlIIIllIlI(this.height, CanvasGameContainer.this.getHeight())) {
                    return;
                }
            }
            try {
                this.setDisplayMode(CanvasGameContainer.this.getWidth(), CanvasGameContainer.this.getHeight(), (boolean)(Container.lllIllIllIIllI[0] != 0));
                "".length();
                if (null != null) {
                    return;
                }
            }
            catch (SlickException llllllllllllIlIllIIIlllIIlllIlII) {
                Log.error(llllllllllllIlIllIIIlllIIlllIlII);
            }
        }
        
        @Override
        protected boolean running() {
            int n;
            if (lIlIIlIlIIIllIII(super.running() ? 1 : 0) && lIlIIlIlIIIllIII(CanvasGameContainer.this.isDisplayable() ? 1 : 0)) {
                n = Container.lllIllIllIIllI[1];
                "".length();
                if (" ".length() <= ((0x3D ^ 0x78) & ~(0xE7 ^ 0xA2))) {
                    return ((0x7F ^ 0x42) & ~(0x2F ^ 0x12)) != 0x0;
                }
            }
            else {
                n = Container.lllIllIllIIllI[0];
            }
            return n != 0;
        }
        
        private static void lIlIIlIlIIIlIlll() {
            (lllIllIllIIllI = new int[2])[0] = ((0x6D ^ 0x48) & ~(0xB9 ^ 0x9C));
            Container.lllIllIllIIllI[1] = " ".length();
        }
        
        @Override
        public int getHeight() {
            return CanvasGameContainer.this.getHeight();
        }
        
        @Override
        protected void updateFPS() {
            super.updateFPS();
        }
        
        static {
            lIlIIlIlIIIlIlll();
        }
        
        private static boolean lIlIIlIlIIIllIIl(final int llllllllllllIlIllIIIlllIIllIlllI, final int llllllllllllIlIllIIIlllIIllIllIl) {
            return llllllllllllIlIllIIIlllIIllIlllI == llllllllllllIlIllIIIlllIIllIllIl;
        }
    }
}
