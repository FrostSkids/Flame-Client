// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick;

import java.awt.GridLayout;
import java.io.Writer;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.awt.Label;
import java.awt.Font;
import java.awt.Color;
import java.awt.TextArea;
import java.awt.Panel;
import org.lwjgl.opengl.GL11;
import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.newdawn.slick.opengl.CursorLoader;
import org.newdawn.slick.opengl.ImageData;
import org.lwjgl.input.Mouse;
import org.lwjgl.input.Cursor;
import org.newdawn.slick.openal.SoundStore;
import org.newdawn.slick.opengl.InternalTextureLoader;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.LWJGLException;
import org.newdawn.slick.util.Log;
import java.awt.LayoutManager;
import java.awt.BorderLayout;
import java.awt.Component;
import org.lwjgl.opengl.Display;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.awt.Canvas;
import java.applet.Applet;

public class AppletGameContainer extends Applet
{
    private static final /* synthetic */ int[] llIlllIllIllII;
    protected /* synthetic */ Thread gameThread;
    protected /* synthetic */ ContainerPanel canvas;
    protected /* synthetic */ boolean alphaSupport;
    protected /* synthetic */ Container container;
    protected /* synthetic */ Canvas displayParent;
    private static final /* synthetic */ String[] llIlllIllIlIll;
    
    @Override
    public void stop() {
    }
    
    private static String lIIllIlIIIIlIlll(final String llllllllllllIllIIlIIIIllIlIlIIII, final String llllllllllllIllIIlIIIIllIlIlIIIl) {
        try {
            final SecretKeySpec llllllllllllIllIIlIIIIllIlIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIIIIllIlIlIIIl.getBytes(StandardCharsets.UTF_8)), AppletGameContainer.llIlllIllIllII[4]), "DES");
            final Cipher llllllllllllIllIIlIIIIllIlIlIlII = Cipher.getInstance("DES");
            llllllllllllIllIIlIIIIllIlIlIlII.init(AppletGameContainer.llIlllIllIllII[2], llllllllllllIllIIlIIIIllIlIlIlIl);
            return new String(llllllllllllIllIIlIIIIllIlIlIlII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIIIIllIlIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlIIIIllIlIlIIll) {
            llllllllllllIllIIlIIIIllIlIlIIll.printStackTrace();
            return null;
        }
    }
    
    public AppletGameContainer() {
        this.alphaSupport = (AppletGameContainer.llIlllIllIllII[0] != 0);
    }
    
    public GameContainer getContainer() {
        return this.container;
    }
    
    @Override
    public void start() {
    }
    
    private static String lIIllIlIIIIlIllI(String llllllllllllIllIIlIIIIllIllIIIlI, final String llllllllllllIllIIlIIIIllIllIIllI) {
        llllllllllllIllIIlIIIIllIllIIIlI = (short)new String(Base64.getDecoder().decode(((String)llllllllllllIllIIlIIIIllIllIIIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIlIIIIllIllIIlIl = new StringBuilder();
        final char[] llllllllllllIllIIlIIIIllIllIIlII = llllllllllllIllIIlIIIIllIllIIllI.toCharArray();
        int llllllllllllIllIIlIIIIllIllIIIll = AppletGameContainer.llIlllIllIllII[1];
        final short llllllllllllIllIIlIIIIllIlIlllIl = (Object)((String)llllllllllllIllIIlIIIIllIllIIIlI).toCharArray();
        final byte llllllllllllIllIIlIIIIllIlIlllII = (byte)llllllllllllIllIIlIIIIllIlIlllIl.length;
        String llllllllllllIllIIlIIIIllIlIllIll = (String)AppletGameContainer.llIlllIllIllII[1];
        while (lIIllIlIIIIllIll((int)llllllllllllIllIIlIIIIllIlIllIll, llllllllllllIllIIlIIIIllIlIlllII)) {
            final char llllllllllllIllIIlIIIIllIllIlIII = llllllllllllIllIIlIIIIllIlIlllIl[llllllllllllIllIIlIIIIllIlIllIll];
            llllllllllllIllIIlIIIIllIllIIlIl.append((char)(llllllllllllIllIIlIIIIllIllIlIII ^ llllllllllllIllIIlIIIIllIllIIlII[llllllllllllIllIIlIIIIllIllIIIll % llllllllllllIllIIlIIIIllIllIIlII.length]));
            "".length();
            ++llllllllllllIllIIlIIIIllIllIIIll;
            ++llllllllllllIllIIlIIIIllIlIllIll;
            "".length();
            if ((0x9C ^ 0x99) == 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIlIIIIllIllIIlIl);
    }
    
    private static void lIIllIlIIIIllIIl() {
        (llIlllIllIllII = new int[5])[0] = " ".length();
        AppletGameContainer.llIlllIllIllII[1] = ((0x3F ^ 0x73 ^ (0x8E ^ 0x89)) & (0xC9 ^ 0x96 ^ (0xA8 ^ 0xBC) ^ -" ".length()) & (((154 + 98 - 142 + 116 ^ 32 + 67 - 27 + 99) & (0x21 ^ 0x60 ^ (0xB4 ^ 0xBC) ^ -" ".length())) ^ -" ".length()));
        AppletGameContainer.llIlllIllIllII[2] = "  ".length();
        AppletGameContainer.llIlllIllIllII[3] = "   ".length();
        AppletGameContainer.llIlllIllIllII[4] = (21 + 59 + 35 + 62 ^ 63 + 138 - 22 + 6);
    }
    
    public void startLWJGL() {
        if (lIIllIlIIIIllIlI(this.gameThread)) {
            return;
        }
        this.gameThread = new Thread() {
            private static final /* synthetic */ int[] llIIIlIllllIll;
            
            private static void lIIIlIIlllIllIIl() {
                (llIIIlIllllIll = new int[1])[0] = ((76 + 228 - 151 + 84 ^ 48 + 116 - 43 + 62) & (0x25 ^ 0x49 ^ (0x1 ^ 0x37) ^ -" ".length()));
            }
            
            @Override
            public void run() {
                try {
                    AppletGameContainer.this.canvas.start();
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                catch (Exception llllllllllllIlllIlIlIIlIlIlllIIl) {
                    llllllllllllIlllIlIlIIlIlIlllIIl.printStackTrace();
                    if (lIIIlIIlllIllIlI(Display.isCreated() ? 1 : 0)) {
                        Display.destroy();
                    }
                    AppletGameContainer.this.displayParent.setVisible((boolean)(AppletGameContainer$1.llIIIlIllllIll[0] != 0));
                    AppletGameContainer.this.add(new ConsolePanel(llllllllllllIlllIlIlIIlIlIlllIIl));
                    "".length();
                    AppletGameContainer.this.validate();
                }
            }
            
            private static boolean lIIIlIIlllIllIlI(final int llllllllllllIlllIlIlIIlIlIllIlII) {
                return llllllllllllIlllIlIlIIlIlIllIlII != 0;
            }
            
            static {
                lIIIlIIlllIllIIl();
            }
        };
        this.gameThread.start();
    }
    
    private static void lIIllIlIIIIllIII() {
        (llIlllIllIlIll = new String[AppletGameContainer.llIlllIllIllII[3]])[AppletGameContainer.llIlllIllIllII[1]] = lIIllIlIIIIlIllI("FgMdKBx1Ggg=", "UoxIn");
        AppletGameContainer.llIlllIllIlIll[AppletGameContainer.llIlllIllIllII[0]] = lIIllIlIIIIlIlll("UYl8k8P7UNg=", "tCzZT");
        AppletGameContainer.llIlllIllIlIll[AppletGameContainer.llIlllIllIllII[2]] = lIIllIlIIIIlIlll("4I7KV+nMDEumiULDejiYsilgHSmkLU76t4wJDGZ1vzM=", "wVJKO");
    }
    
    private static boolean lIIllIlIIIIllIlI(final Object llllllllllllIllIIlIIIIllIlIIIlll) {
        return llllllllllllIllIIlIIIIllIlIIIlll != null;
    }
    
    @Override
    public void init() {
        this.removeAll();
        this.setLayout(new BorderLayout());
        this.setIgnoreRepaint((boolean)(AppletGameContainer.llIlllIllIllII[0] != 0));
        try {
            final Game llllllllllllIllIIlIIIIllIlllllII = (Game)Class.forName(this.getParameter(AppletGameContainer.llIlllIllIlIll[AppletGameContainer.llIlllIllIllII[0]])).newInstance();
            this.container = new Container(llllllllllllIllIIlIIIIllIlllllII);
            this.canvas = new ContainerPanel(this.container);
            this.displayParent = new Canvas() {
                @Override
                public final void removeNotify() {
                    AppletGameContainer.this.destroyLWJGL();
                    super.removeNotify();
                }
                
                @Override
                public final void addNotify() {
                    super.addNotify();
                    AppletGameContainer.this.startLWJGL();
                }
            };
            this.displayParent.setSize(this.getWidth(), this.getHeight());
            this.add(this.displayParent);
            "".length();
            this.displayParent.setFocusable((boolean)(AppletGameContainer.llIlllIllIllII[0] != 0));
            this.displayParent.requestFocus();
            this.displayParent.setIgnoreRepaint((boolean)(AppletGameContainer.llIlllIllIllII[0] != 0));
            this.setVisible((boolean)(AppletGameContainer.llIlllIllIllII[0] != 0));
            "".length();
            if ("   ".length() <= "  ".length()) {
                return;
            }
        }
        catch (Exception llllllllllllIllIIlIIIIllIllllIll) {
            Log.error(llllllllllllIllIIlIIIIllIllllIll);
            throw new RuntimeException(AppletGameContainer.llIlllIllIlIll[AppletGameContainer.llIlllIllIllII[2]]);
        }
    }
    
    private static boolean lIIllIlIIIIllIll(final int llllllllllllIllIIlIIIIllIlIIlIlI, final int llllllllllllIllIIlIIIIllIlIIlIIl) {
        return llllllllllllIllIIlIIIIllIlIIlIlI < llllllllllllIllIIlIIIIllIlIIlIIl;
    }
    
    private void destroyLWJGL() {
        this.container.stopApplet();
        try {
            this.gameThread.join();
            "".length();
            if (-" ".length() > ((150 + 133 - 136 + 48 ^ 28 + 125 - 99 + 89) & (0x3F ^ 0x51 ^ (0x96 ^ 0xB4) ^ -" ".length()))) {
                return;
            }
        }
        catch (InterruptedException llllllllllllIllIIlIIIIlllIIIIlll) {
            Log.error(llllllllllllIllIIlIIIIlllIIIIlll);
        }
    }
    
    static {
        lIIllIlIIIIllIIl();
        lIIllIlIIIIllIII();
    }
    
    @Override
    public void destroy() {
        if (lIIllIlIIIIllIlI(this.displayParent)) {
            this.remove(this.displayParent);
        }
        super.destroy();
        Log.info(AppletGameContainer.llIlllIllIlIll[AppletGameContainer.llIlllIllIllII[1]]);
    }
    
    public class ContainerPanel
    {
        private static final /* synthetic */ int[] lIIIIlIIIlIIlI;
        private /* synthetic */ Container container;
        
        public void start() throws Exception {
            Display.setParent(AppletGameContainer.this.displayParent);
            Display.setVSyncEnabled((boolean)(ContainerPanel.lIIIIlIIIlIIlI[2] != 0));
            try {
                this.createDisplay();
                "".length();
                if (" ".length() != " ".length()) {
                    return;
                }
            }
            catch (LWJGLException lllllllllllllIlIIllIlIIIlIIIIIII) {
                lllllllllllllIlIIllIlIIIlIIIIIII.printStackTrace();
                Thread.sleep(1000L);
                this.createDisplay();
            }
            this.initGL();
            AppletGameContainer.this.displayParent.requestFocus();
            this.container.runloop();
        }
        
        private static boolean lIlllIIIIIIllIl(final int lllllllllllllIlIIllIlIIIIlllIlIl) {
            return lllllllllllllIlIIllIlIIIIlllIlIl != 0;
        }
        
        private void createDisplay() throws Exception {
            try {
                final int n = ContainerPanel.lIIIIlIIIlIIlI[0];
                final int n2 = ContainerPanel.lIIIIlIIIlIIlI[0];
                int n3;
                if (lIlllIIIIIIllIl(GameContainer.stencil ? 1 : 0)) {
                    n3 = ContainerPanel.lIIIIlIIIlIIlI[0];
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    n3 = ContainerPanel.lIIIIlIIIlIIlI[1];
                }
                Display.create(new PixelFormat(n, n2, n3));
                AppletGameContainer.this.alphaSupport = (ContainerPanel.lIIIIlIIIlIIlI[2] != 0);
                "".length();
                if ((0x21 ^ 0x25) < ((0xC9 ^ 0x82) & ~(0x47 ^ 0xC))) {
                    return;
                }
            }
            catch (Exception lllllllllllllIlIIllIlIIIlIIIIllI) {
                AppletGameContainer.this.alphaSupport = (ContainerPanel.lIIIIlIIIlIIlI[1] != 0);
                Display.destroy();
                Display.create();
            }
        }
        
        static {
            lIlllIIIIIIlIll();
        }
        
        public ContainerPanel(final Container lllllllllllllIlIIllIlIIIlIIIlIIl) {
            this.container = lllllllllllllIlIIllIlIIIlIIIlIIl;
        }
        
        private static void lIlllIIIIIIlIll() {
            (lIIIIlIIIlIIlI = new int[3])[0] = (0x96 ^ 0x9E);
            ContainerPanel.lIIIIlIIIlIIlI[1] = ((0x26 ^ 0x6) & ~(0x19 ^ 0x39));
            ContainerPanel.lIIIIlIIIlIIlI[2] = " ".length();
        }
        
        protected void initGL() {
            try {
                InternalTextureLoader.get().clear();
                SoundStore.get().clear();
                this.container.initApplet();
                "".length();
                if ("  ".length() >= (0x8B ^ 0x8F)) {
                    return;
                }
            }
            catch (Exception lllllllllllllIlIIllIlIIIIllllIlI) {
                Log.error(lllllllllllllIlIIllIlIIIIllllIlI);
                this.container.stopApplet();
            }
        }
    }
    
    public class Container extends GameContainer
    {
        private static final /* synthetic */ int[] lIIlIIlllIIIIl;
        private static final /* synthetic */ String[] lIIlIIllIlIIIl;
        
        public void initApplet() throws SlickException {
            this.initSystem();
            this.enterOrtho();
            try {
                this.getInput().initControllers();
                "".length();
                if (((0x7D ^ 0x27) & ~(0x2C ^ 0x76)) != 0x0) {
                    return;
                }
            }
            catch (SlickException lllllllllllllIIllIllIIlIlIIlIlIl) {
                Log.info(Container.lIIlIIllIlIIIl[Container.lIIlIIlllIIIIl[0]]);
                "".length();
                if ("   ".length() != "   ".length()) {
                    return;
                }
            }
            catch (Throwable lllllllllllllIIllIllIIlIlIIlIlII) {
                Log.info(Container.lIIlIIllIlIIIl[Container.lIIlIIlllIIIIl[1]]);
            }
            this.game.init(this);
            this.getDelta();
            "".length();
        }
        
        private static String llIIlllIIIIIIIl(final String lllllllllllllIIllIllIIIlllIllllI, final String lllllllllllllIIllIllIIIlllIllIll) {
            try {
                final SecretKeySpec lllllllllllllIIllIllIIIllllIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIllIIIlllIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIllIllIIIllllIIIII = Cipher.getInstance("Blowfish");
                lllllllllllllIIllIllIIIllllIIIII.init(Container.lIIlIIlllIIIIl[2], lllllllllllllIIllIllIIIllllIIIIl);
                return new String(lllllllllllllIIllIllIIIllllIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIllIIIlllIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIllIllIIIlllIlllll) {
                lllllllllllllIIllIllIIIlllIlllll.printStackTrace();
                return null;
            }
        }
        
        @Override
        public int getScreenHeight() {
            return Container.lIIlIIlllIIIIl[0];
        }
        
        private static int llIIlllIIlIlIlI(final float n, final float n2) {
            return fcmpl(n, n2);
        }
        
        private static void llIIlllIIIIlllI() {
            (lIIlIIllIlIIIl = new String[Container.lIIlIIlllIIIIl[10]])[Container.lIIlIIlllIIIIl[0]] = llIIlllIIIIIIII("lvDVyiG/eP//4LExh3/jkcg0JXK0nNdViTzBaql/lhk=", "iwoBb");
            Container.lIIlIIllIlIIIl[Container.lIIlIIlllIIIIl[1]] = llIIlllIIIIIIII("i2T+NaFqv+wRus1bLimZh2d+hW2qx+HqrUPci4O3B/o=", "VVnPx");
            Container.lIIlIIllIlIIIl[Container.lIIlIIlllIIIIl[2]] = llIIlllIIIIIIIl("OT/7sZD1H/XCeH8GoqWRqj5fa7W5dGgH5EX0oWq0oNSnQFqebpykXQ==", "dbUIk");
            Container.lIIlIIllIlIIIl[Container.lIIlIIlllIIIIl[3]] = llIIlllIIIIIIII("2uqDRVE9vfpMFCqGjaqwKlT9qVrKHYA7sXHrBXoS6KI=", "tddvP");
            Container.lIIlIIllIlIIIl[Container.lIIlIIlllIIIIl[4]] = llIIlllIIIIIIII("chOoO8/L2xvo34q3J5+JV0vTyAuKGO6Azy2LXJU356q3HQnta+K65A==", "SSaWv");
            Container.lIIlIIllIlIIIl[Container.lIIlIIlllIIIIl[5]] = llIIlllIIIIIIll("Nik6JD0UaCcneAMtJ2g1Hz0gLXgTPSE7NwI=", "pHSHX");
            Container.lIIlIIllIlIIIl[Container.lIIlIIlllIIIIl[6]] = llIIlllIIIIIIIl("BOtvak8TUV2KVPUDMpfrt0cgK31c3gNN2wGOliAyxOkiS8VUocgUnA==", "iPRGA");
            Container.lIIlIIllIlIIIl[Container.lIIlIIlllIIIIl[7]] = llIIlllIIIIIIII("pDSNKAdms+makA6+m4fsfxlYUEByU42ligK2RKMpeB4=", "tgEeE");
            Container.lIIlIIllIlIIIl[Container.lIIlIIlllIIIIl[8]] = llIIlllIIIIIIll("KgwDISAITR4iZQACCyllDQMObSQcHQY0ZQ8YGD4qHkM=", "lmjME");
            Container.lIIlIIllIlIIIl[Container.lIIlIIlllIIIIl[9]] = llIIlllIIIIIIll("BAkbLTQmSAYucTENBmE8LR0BJHEhHQAyPjA=", "BhrAQ");
        }
        
        @Override
        public boolean isFullscreen() {
            return Display.isFullscreen();
        }
        
        private static String llIIlllIIIIIIll(String lllllllllllllIIllIllIIlIIIIIIIII, final String lllllllllllllIIllIllIIIlllllllll) {
            lllllllllllllIIllIllIIlIIIIIIIII = new String(Base64.getDecoder().decode(lllllllllllllIIllIllIIlIIIIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIllIllIIIllllllllI = new StringBuilder();
            final char[] lllllllllllllIIllIllIIIlllllllIl = lllllllllllllIIllIllIIIlllllllll.toCharArray();
            int lllllllllllllIIllIllIIIlllllllII = Container.lIIlIIlllIIIIl[0];
            final boolean lllllllllllllIIllIllIIIlllllIllI = (Object)lllllllllllllIIllIllIIlIIIIIIIII.toCharArray();
            final byte lllllllllllllIIllIllIIIlllllIlIl = (byte)lllllllllllllIIllIllIIIlllllIllI.length;
            short lllllllllllllIIllIllIIIlllllIlII = (short)Container.lIIlIIlllIIIIl[0];
            while (llIIlllIIlIlIIl(lllllllllllllIIllIllIIIlllllIlII, lllllllllllllIIllIllIIIlllllIlIl)) {
                final char lllllllllllllIIllIllIIlIIIIIIIIl = lllllllllllllIIllIllIIIlllllIllI[lllllllllllllIIllIllIIIlllllIlII];
                lllllllllllllIIllIllIIIllllllllI.append((char)(lllllllllllllIIllIllIIlIIIIIIIIl ^ lllllllllllllIIllIllIIIlllllllIl[lllllllllllllIIllIllIIIlllllllII % lllllllllllllIIllIllIIIlllllllIl.length]));
                "".length();
                ++lllllllllllllIIllIllIIIlllllllII;
                ++lllllllllllllIIllIllIIIlllllIlII;
                "".length();
                if (((0xB8 ^ 0x93 ^ (0x37 ^ 0x45)) & (34 + 8 + 132 + 64 ^ 92 + 127 - 174 + 138 ^ -" ".length())) != 0x0) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIllIllIIIllllllllI);
        }
        
        public boolean supportsAlphaInBackBuffer() {
            return AppletGameContainer.this.alphaSupport;
        }
        
        private static boolean llIIlllIIlIllII(final int lllllllllllllIIllIllIIIlllIIllll) {
            return lllllllllllllIIllIllIIIlllIIllll != 0;
        }
        
        @Override
        public void setMouseCursor(final Cursor lllllllllllllIIllIllIIlIIIlllIII, final int lllllllllllllIIllIllIIlIIIllIlll, final int lllllllllllllIIllIllIIlIIIllIllI) throws SlickException {
            try {
                Mouse.setNativeCursor(lllllllllllllIIllIllIIlIIIlllIII);
                "".length();
                "".length();
                if (-(0x5 ^ 0x2F ^ (0x81 ^ 0xAE)) >= 0) {
                    return;
                }
            }
            catch (Throwable lllllllllllllIIllIllIIlIIIlllIlI) {
                Log.error(Container.lIIlIIllIlIIIl[Container.lIIlIIlllIIIIl[8]], lllllllllllllIIllIllIIlIIIlllIlI);
                throw new SlickException(Container.lIIlIIllIlIIIl[Container.lIIlIIlllIIIIl[9]], lllllllllllllIIllIllIIlIIIlllIlI);
            }
        }
        
        @Override
        public int getScreenWidth() {
            return Container.lIIlIIlllIIIIl[0];
        }
        
        static {
            llIIlllIIlIlIII();
            llIIlllIIIIlllI();
        }
        
        @Override
        public void setIcons(final String[] lllllllllllllIIllIllIIlIIlIIlIll) throws SlickException {
        }
        
        private static boolean llIIlllIIlIlIIl(final int lllllllllllllIIllIllIIIlllIlIIlI, final int lllllllllllllIIllIllIIIlllIlIIIl) {
            return lllllllllllllIIllIllIIIlllIlIIlI < lllllllllllllIIllIllIIIlllIlIIIl;
        }
        
        private static void llIIlllIIlIlIII() {
            (lIIlIIlllIIIIl = new int[11])[0] = ((0x8E ^ 0xA4) & ~(0xE8 ^ 0xC2));
            Container.lIIlIIlllIIIIl[1] = " ".length();
            Container.lIIlIIlllIIIIl[2] = "  ".length();
            Container.lIIlIIlllIIIIl[3] = "   ".length();
            Container.lIIlIIlllIIIIl[4] = (75 + 59 - 37 + 76 ^ 2 + 56 + 76 + 35);
            Container.lIIlIIlllIIIIl[5] = (0xF8 ^ 0xBA ^ (0xE7 ^ 0xA0));
            Container.lIIlIIlllIIIIl[6] = (0x8D ^ 0x8B);
            Container.lIIlIIlllIIIIl[7] = (0x51 ^ 0x56);
            Container.lIIlIIlllIIIIl[8] = (0x3E ^ 0x36);
            Container.lIIlIIlllIIIIl[9] = (14 + 115 - 27 + 54 ^ 91 + 119 - 160 + 99);
            Container.lIIlIIlllIIIIl[10] = (0x67 ^ 0x6D);
        }
        
        public void stopApplet() {
            this.running = (Container.lIIlIIlllIIIIl[0] != 0);
        }
        
        @Override
        public void setIcon(final String lllllllllllllIIllIllIIlIlIIIIIII) throws SlickException {
        }
        
        public void runloop() throws Exception {
            while (llIIlllIIlIllII(this.running ? 1 : 0)) {
                final int lllllllllllllIIllIllIIlIIIIIlllI = this.getDelta();
                this.updateAndRender(lllllllllllllIIllIllIIlIIIIIlllI);
                this.updateFPS();
                Display.update();
                "".length();
                if (-" ".length() > 0) {
                    return;
                }
            }
            Display.destroy();
        }
        
        public Container(final Game lllllllllllllIIllIllIIlIlIIllIll) {
            super(lllllllllllllIIllIllIIlIlIIllIll);
            this.width = AppletGameContainer.this.getWidth();
            this.height = AppletGameContainer.this.getHeight();
        }
        
        @Override
        public void setMouseCursor(final ImageData lllllllllllllIIllIllIIlIIlIIIIll, final int lllllllllllllIIllIllIIlIIlIIIIlI, final int lllllllllllllIIllIllIIlIIIlllllI) throws SlickException {
            try {
                final Cursor lllllllllllllIIllIllIIlIIlIIIllI = CursorLoader.get().getCursor(lllllllllllllIIllIllIIlIIlIIIIll, lllllllllllllIIllIllIIlIIlIIIIlI, lllllllllllllIIllIllIIlIIIlllllI);
                Mouse.setNativeCursor(lllllllllllllIIllIllIIlIIlIIIllI);
                "".length();
                "".length();
                if (-(0xE2 ^ 0x9E ^ (0x1A ^ 0x62)) > 0) {
                    return;
                }
            }
            catch (Throwable lllllllllllllIIllIllIIlIIlIIIlIl) {
                Log.error(Container.lIIlIIllIlIIIl[Container.lIIlIIlllIIIIl[6]], lllllllllllllIIllIllIIlIIlIIIlIl);
                throw new SlickException(Container.lIIlIIllIlIIIl[Container.lIIlIIlllIIIIl[7]], lllllllllllllIIllIllIIlIIlIIIlIl);
            }
        }
        
        private int get2Fold(final int lllllllllllllIIllIllIIlIIllIlIIl) {
            int lllllllllllllIIllIllIIlIIllIlIII = Container.lIIlIIlllIIIIl[2];
            while (llIIlllIIlIlIIl(lllllllllllllIIllIllIIlIIllIlIII, lllllllllllllIIllIllIIlIIllIlIIl)) {
                lllllllllllllIIllIllIIlIIllIlIII *= Container.lIIlIIlllIIIIl[2];
                "".length();
                if ("   ".length() != "   ".length()) {
                    return (0x18 ^ 0x12) & ~(0x7D ^ 0x77);
                }
            }
            return lllllllllllllIIllIllIIlIIllIlIII;
        }
        
        private static boolean llIIlllIIlIlIll(final int lllllllllllllIIllIllIIIlllIlIllI, final int lllllllllllllIIllIllIIIlllIlIlIl) {
            return lllllllllllllIIllIllIIIlllIlIllI == lllllllllllllIIllIllIIIlllIlIlIl;
        }
        
        @Override
        public void setMouseCursor(final String lllllllllllllIIllIllIIlIIlllIIII, final int lllllllllllllIIllIllIIlIIlllIIlI, final int lllllllllllllIIllIllIIlIIlllIIIl) throws SlickException {
            try {
                final Cursor lllllllllllllIIllIllIIlIIlllIllI = CursorLoader.get().getCursor(lllllllllllllIIllIllIIlIIlllIIII, lllllllllllllIIllIllIIlIIlllIIlI, lllllllllllllIIllIllIIlIIlllIIIl);
                Mouse.setNativeCursor(lllllllllllllIIllIllIIlIIlllIllI);
                "".length();
                "".length();
                if (-" ".length() >= " ".length()) {
                    return;
                }
            }
            catch (Throwable lllllllllllllIIllIllIIlIIlllIlIl) {
                Log.error(Container.lIIlIIllIlIIIl[Container.lIIlIIlllIIIIl[2]], lllllllllllllIIllIllIIlIIlllIlIl);
                throw new SlickException(Container.lIIlIIllIlIIIl[Container.lIIlIIlllIIIIl[3]], lllllllllllllIIllIllIIlIIlllIlIl);
            }
        }
        
        private static boolean llIIlllIIlIllIl(final int lllllllllllllIIllIllIIIlllIIllIl) {
            return lllllllllllllIIllIllIIIlllIIllIl >= 0;
        }
        
        @Override
        public boolean isMouseGrabbed() {
            return Mouse.isGrabbed();
        }
        
        @Override
        public boolean hasFocus() {
            return Container.lIIlIIlllIIIIl[1] != 0;
        }
        
        public Applet getApplet() {
            return AppletGameContainer.this;
        }
        
        @Override
        public void setDefaultMouseCursor() {
        }
        
        @Override
        public void setMouseCursor(final Image lllllllllllllIIllIllIIlIIlIlIIll, final int lllllllllllllIIllIllIIlIIlIlIIlI, final int lllllllllllllIIllIllIIlIIlIlIlIl) throws SlickException {
            try {
                final Image lllllllllllllIIllIllIIlIIlIlllIl = new Image(this.get2Fold(lllllllllllllIIllIllIIlIIlIlIIll.getWidth()), this.get2Fold(lllllllllllllIIllIllIIlIIlIlIIll.getHeight()));
                final Graphics lllllllllllllIIllIllIIlIIlIlllII = lllllllllllllIIllIllIIlIIlIlllIl.getGraphics();
                final ByteBuffer lllllllllllllIIllIllIIlIIlIllIll = BufferUtils.createByteBuffer(lllllllllllllIIllIllIIlIIlIlllIl.getWidth() * lllllllllllllIIllIllIIlIIlIlllIl.getHeight() * Container.lIIlIIlllIIIIl[4]);
                lllllllllllllIIllIllIIlIIlIlllII.drawImage(lllllllllllllIIllIllIIlIIlIlIIll.getFlippedCopy((boolean)(Container.lIIlIIlllIIIIl[0] != 0), (boolean)(Container.lIIlIIlllIIIIl[1] != 0)), 0.0f, 0.0f);
                lllllllllllllIIllIllIIlIIlIlllII.flush();
                lllllllllllllIIllIllIIlIIlIlllII.getArea(Container.lIIlIIlllIIIIl[0], Container.lIIlIIlllIIIIl[0], lllllllllllllIIllIllIIlIIlIlllIl.getWidth(), lllllllllllllIIllIllIIlIIlIlllIl.getHeight(), lllllllllllllIIllIllIIlIIlIllIll);
                final Cursor lllllllllllllIIllIllIIlIIlIllIlI = CursorLoader.get().getCursor(lllllllllllllIIllIllIIlIIlIllIll, lllllllllllllIIllIllIIlIIlIlIIlI, lllllllllllllIIllIllIIlIIlIlIlIl, lllllllllllllIIllIllIIlIIlIlllIl.getWidth(), lllllllllllllIIllIllIIlIIlIlllIl.getHeight());
                Mouse.setNativeCursor(lllllllllllllIIllIllIIlIIlIllIlI);
                "".length();
                "".length();
                if ("  ".length() < -" ".length()) {
                    return;
                }
            }
            catch (Throwable lllllllllllllIIllIllIIlIIlIllIIl) {
                Log.error(Container.lIIlIIllIlIIIl[Container.lIIlIIlllIIIIl[4]], lllllllllllllIIllIllIIlIIlIllIIl);
                throw new SlickException(Container.lIIlIIllIlIIIl[Container.lIIlIIlllIIIIl[5]], lllllllllllllIIllIllIIlIIlIllIIl);
            }
        }
        
        private static String llIIlllIIIIIIII(final String lllllllllllllIIllIllIIIllllIlIIl, final String lllllllllllllIIllIllIIIllllIlIlI) {
            try {
                final SecretKeySpec lllllllllllllIIllIllIIIllllIlllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIllIIIllllIlIlI.getBytes(StandardCharsets.UTF_8)), Container.lIIlIIlllIIIIl[8]), "DES");
                final Cipher lllllllllllllIIllIllIIIllllIllIl = Cipher.getInstance("DES");
                lllllllllllllIIllIllIIIllllIllIl.init(Container.lIIlIIlllIIIIl[2], lllllllllllllIIllIllIIIllllIlllI);
                return new String(lllllllllllllIIllIllIIIllllIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIllIIIllllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIllIllIIIllllIllII) {
                lllllllllllllIIllIllIIIllllIllII.printStackTrace();
                return null;
            }
        }
        
        @Override
        public void setFullscreen(final boolean lllllllllllllIIllIllIIlIIIIllIIl) throws SlickException {
            if (llIIlllIIlIlIll(lllllllllllllIIllIllIIlIIIIllIIl ? 1 : 0, this.isFullscreen() ? 1 : 0)) {
                return;
            }
            try {
                if (llIIlllIIlIllII(lllllllllllllIIllIllIIlIIIIllIIl ? 1 : 0)) {
                    final int lllllllllllllIIllIllIIlIIIlIIlIl = Display.getDisplayMode().getWidth();
                    final int lllllllllllllIIllIllIIlIIIlIIlII = Display.getDisplayMode().getHeight();
                    final float lllllllllllllIIllIllIIlIIIlIIIll = this.width / (float)this.height;
                    final float lllllllllllllIIllIllIIlIIIlIIIlI = lllllllllllllIIllIllIIlIIIlIIlIl / (float)lllllllllllllIIllIllIIlIIIlIIlII;
                    int lllllllllllllIIllIllIIlIIIlIIIIl = 0;
                    int lllllllllllllIIllIllIIlIIIlIIIII;
                    if (llIIlllIIlIllIl(llIIlllIIlIlIlI(lllllllllllllIIllIllIIlIIIlIIIll, lllllllllllllIIllIllIIlIIIlIIIlI))) {
                        final int lllllllllllllIIllIllIIlIIIlIIlll = lllllllllllllIIllIllIIlIIIlIIlIl;
                        final int lllllllllllllIIllIllIIlIIIlIIllI = (int)(this.height / (this.width / (float)lllllllllllllIIllIllIIlIIIlIIlIl));
                        "".length();
                        if (-(0x26 ^ 0x22) >= 0) {
                            return;
                        }
                    }
                    else {
                        lllllllllllllIIllIllIIlIIIlIIIIl = (int)(this.width / (this.height / (float)lllllllllllllIIllIllIIlIIIlIIlII));
                        lllllllllllllIIllIllIIlIIIlIIIII = lllllllllllllIIllIllIIlIIIlIIlII;
                    }
                    final int lllllllllllllIIllIllIIlIIIIlllll = (lllllllllllllIIllIllIIlIIIlIIlIl - lllllllllllllIIllIllIIlIIIlIIIIl) / Container.lIIlIIlllIIIIl[2];
                    final int lllllllllllllIIllIllIIlIIIIllllI = (lllllllllllllIIllIllIIlIIIlIIlII - lllllllllllllIIllIllIIlIIIlIIIII) / Container.lIIlIIlllIIIIl[2];
                    GL11.glViewport(lllllllllllllIIllIllIIlIIIIlllll, lllllllllllllIIllIllIIlIIIIllllI, lllllllllllllIIllIllIIlIIIlIIIIl, lllllllllllllIIllIllIIlIIIlIIIII);
                    this.enterOrtho();
                    this.getInput().setOffset(-lllllllllllllIIllIllIIlIIIIlllll * (float)this.width / lllllllllllllIIllIllIIlIIIlIIIIl, -lllllllllllllIIllIllIIlIIIIllllI * (float)this.height / lllllllllllllIIllIllIIlIIIlIIIII);
                    this.getInput().setScale(this.width / (float)lllllllllllllIIllIllIIlIIIlIIIIl, this.height / (float)lllllllllllllIIllIllIIlIIIlIIIII);
                    this.width = lllllllllllllIIllIllIIlIIIlIIlIl;
                    this.height = lllllllllllllIIllIllIIlIIIlIIlII;
                    Display.setFullscreen((boolean)(Container.lIIlIIlllIIIIl[1] != 0));
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    this.getInput().setOffset(0.0f, 0.0f);
                    this.getInput().setScale(1.0f, 1.0f);
                    this.width = AppletGameContainer.this.getWidth();
                    this.height = AppletGameContainer.this.getHeight();
                    GL11.glViewport(Container.lIIlIIlllIIIIl[0], Container.lIIlIIlllIIIIl[0], this.width, this.height);
                    this.enterOrtho();
                    Display.setFullscreen((boolean)(Container.lIIlIIlllIIIIl[0] != 0));
                }
                "".length();
                if ("   ".length() < 0) {
                    return;
                }
            }
            catch (LWJGLException lllllllllllllIIllIllIIlIIIIlllIl) {
                Log.error((Throwable)lllllllllllllIIllIllIIlIIIIlllIl);
            }
        }
        
        @Override
        public void setMouseGrabbed(final boolean lllllllllllllIIllIllIIlIIlllllII) {
            Mouse.setGrabbed(lllllllllllllIIllIllIIlIIlllllII);
        }
        
        public boolean isRunning() {
            return this.running;
        }
    }
    
    public class ConsolePanel extends Panel
    {
        private static final /* synthetic */ int[] lIIIllIllIIIIl;
        /* synthetic */ TextArea textArea;
        private static final /* synthetic */ String[] lIIIllIllIIIII;
        
        public ConsolePanel(final Exception lllllllllllllIIlllllllIlIIllllll) {
            this.textArea = new TextArea();
            this.setLayout(new BorderLayout());
            this.setBackground(Color.black);
            this.setForeground(Color.white);
            final Font lllllllllllllIIlllllllIlIIlllllI = new Font(ConsolePanel.lIIIllIllIIIII[ConsolePanel.lIIIllIllIIIIl[0]], ConsolePanel.lIIIllIllIIIIl[1], ConsolePanel.lIIIllIllIIIIl[2]);
            final Label lllllllllllllIIlllllllIlIIllllIl = new Label(ConsolePanel.lIIIllIllIIIII[ConsolePanel.lIIIllIllIIIIl[1]], ConsolePanel.lIIIllIllIIIIl[1]);
            lllllllllllllIIlllllllIlIIllllIl.setFont(lllllllllllllIIlllllllIlIIlllllI);
            this.add(lllllllllllllIIlllllllIlIIllllIl, ConsolePanel.lIIIllIllIIIII[ConsolePanel.lIIIllIllIIIIl[3]]);
            final StringWriter lllllllllllllIIlllllllIlIIllllII = new StringWriter();
            lllllllllllllIIlllllllIlIIllllll.printStackTrace(new PrintWriter(lllllllllllllIIlllllllIlIIllllII));
            this.textArea.setText(lllllllllllllIIlllllllIlIIllllII.toString());
            this.textArea.setEditable((boolean)(ConsolePanel.lIIIllIllIIIIl[0] != 0));
            this.add(this.textArea, ConsolePanel.lIIIllIllIIIII[ConsolePanel.lIIIllIllIIIIl[4]]);
            this.add(new Panel(), ConsolePanel.lIIIllIllIIIII[ConsolePanel.lIIIllIllIIIIl[5]]);
            this.add(new Panel(), ConsolePanel.lIIIllIllIIIII[ConsolePanel.lIIIllIllIIIIl[6]]);
            final Panel lllllllllllllIIlllllllIlIIlllIll = new Panel();
            lllllllllllllIIlllllllIlIIlllIll.setLayout(new GridLayout(ConsolePanel.lIIIllIllIIIIl[0], ConsolePanel.lIIIllIllIIIIl[1]));
            final Label lllllllllllllIIlllllllIlIIlllIlI = new Label(ConsolePanel.lIIIllIllIIIII[ConsolePanel.lIIIllIllIIIIl[7]], ConsolePanel.lIIIllIllIIIIl[1]);
            final Label lllllllllllllIIlllllllIlIIlllIIl = new Label(ConsolePanel.lIIIllIllIIIII[ConsolePanel.lIIIllIllIIIIl[8]], ConsolePanel.lIIIllIllIIIIl[1]);
            lllllllllllllIIlllllllIlIIlllIlI.setFont(lllllllllllllIIlllllllIlIIlllllI);
            lllllllllllllIIlllllllIlIIlllIIl.setFont(lllllllllllllIIlllllllIlIIlllllI);
            lllllllllllllIIlllllllIlIIlllIll.add(lllllllllllllIIlllllllIlIIlllIlI);
            "".length();
            lllllllllllllIIlllllllIlIIlllIll.add(lllllllllllllIIlllllllIlIIlllIIl);
            "".length();
            this.add(lllllllllllllIIlllllllIlIIlllIll, ConsolePanel.lIIIllIllIIIII[ConsolePanel.lIIIllIllIIIIl[9]]);
        }
        
        private static void llIIIlIlIIIIIlI() {
            (lIIIllIllIIIIl = new int[11])[0] = ((24 + 90 - 67 + 89 ^ 58 + 18 + 79 + 37) & (0x74 ^ 0x7D ^ (0x0 ^ 0x41) ^ -" ".length()));
            ConsolePanel.lIIIllIllIIIIl[1] = " ".length();
            ConsolePanel.lIIIllIllIIIIl[2] = (0x4F ^ 0x41);
            ConsolePanel.lIIIllIllIIIIl[3] = "  ".length();
            ConsolePanel.lIIIllIllIIIIl[4] = "   ".length();
            ConsolePanel.lIIIllIllIIIIl[5] = (0x35 ^ 0x1D ^ (0xB4 ^ 0x98));
            ConsolePanel.lIIIllIllIIIIl[6] = (0xE8 ^ 0xC2 ^ (0xA8 ^ 0x87));
            ConsolePanel.lIIIllIllIIIIl[7] = (0x35 ^ 0x1B ^ (0x22 ^ 0xA));
            ConsolePanel.lIIIllIllIIIIl[8] = (0x16 ^ 0x11);
            ConsolePanel.lIIIllIllIIIIl[9] = (0x1B ^ 0x2E ^ (0x50 ^ 0x6D));
            ConsolePanel.lIIIllIllIIIIl[10] = (0xCA ^ 0xC3);
        }
        
        private static void llIIIlIlIIIIIII() {
            (lIIIllIllIIIII = new String[ConsolePanel.lIIIllIllIIIIl[10]])[ConsolePanel.lIIIllIllIIIIl[0]] = llIIIlIIlllllIl("GTYgKwU=", "XDIJi");
            ConsolePanel.lIIIllIllIIIII[ConsolePanel.lIIIllIllIIIIl[1]] = llIIIlIIlllllIl("BikTBRp1JhUIAhopHw==", "UeZFQ");
            ConsolePanel.lIIIllIllIIIII[ConsolePanel.lIIIllIllIIIIl[3]] = llIIIlIIlllllIl("BQsgCzk=", "CbRxM");
            ConsolePanel.lIIIllIllIIIII[ConsolePanel.lIIIllIllIIIIl[4]] = llIIIlIIllllllI("oEJZ1hLM1U4=", "UtKNC");
            ConsolePanel.lIIIllIllIIIII[ConsolePanel.lIIIllIllIIIIl[5]] = llIIIlIIllllllI("4ojZ2sUtbwk=", "ymFXC");
            ConsolePanel.lIIIllIllIIIII[ConsolePanel.lIIIllIllIIIIl[6]] = llIIIlIIlllllIl("Ow4QIAY=", "zhdEt");
            ConsolePanel.lIIIllIllIIIII[ConsolePanel.lIIIllIllIIIIl[7]] = llIIIlIIllllllI("w3IY/axqC5gsLhCDjmOzBYKRG5KLJsUcVCwx2Mf6twujEYAmnGFRr6apA97h/CWq", "hUIaw");
            ConsolePanel.lIIIllIllIIIII[ConsolePanel.lIIIllIllIIIIl[8]] = llIIIlIIllllllI("LfqJxidDdfMOGp4nfY2/SPZK63HuxpvsOxz/zmFdmHjieOE5xv7xnMsJoc9TotBg", "uVZvP");
            ConsolePanel.lIIIllIllIIIII[ConsolePanel.lIIIllIllIIIIl[9]] = llIIIlIIlllllll("QmxMAi7UO10=", "PDSEa");
        }
        
        private static String llIIIlIIlllllll(final String lllllllllllllIIlllllllIlIIIIIIIl, final String lllllllllllllIIlllllllIlIIIIIIlI) {
            try {
                final SecretKeySpec lllllllllllllIIlllllllIlIIIIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllllllIlIIIIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIIlllllllIlIIIIIlIl = Cipher.getInstance("Blowfish");
                lllllllllllllIIlllllllIlIIIIIlIl.init(ConsolePanel.lIIIllIllIIIIl[3], lllllllllllllIIlllllllIlIIIIIllI);
                return new String(lllllllllllllIIlllllllIlIIIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllllllIlIIIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlllllllIlIIIIIlII) {
                lllllllllllllIIlllllllIlIIIIIlII.printStackTrace();
                return null;
            }
        }
        
        private static String llIIIlIIllllllI(final String lllllllllllllIIlllllllIlIIlIlIII, final String lllllllllllllIIlllllllIlIIlIIlll) {
            try {
                final SecretKeySpec lllllllllllllIIlllllllIlIIlIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllllllIlIIlIIlll.getBytes(StandardCharsets.UTF_8)), ConsolePanel.lIIIllIllIIIIl[9]), "DES");
                final Cipher lllllllllllllIIlllllllIlIIlIlIlI = Cipher.getInstance("DES");
                lllllllllllllIIlllllllIlIIlIlIlI.init(ConsolePanel.lIIIllIllIIIIl[3], lllllllllllllIIlllllllIlIIlIlIll);
                return new String(lllllllllllllIIlllllllIlIIlIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllllllIlIIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIlllllllIlIIlIlIIl) {
                lllllllllllllIIlllllllIlIIlIlIIl.printStackTrace();
                return null;
            }
        }
        
        private static boolean llIIIlIlIIIIIll(final int lllllllllllllIIlllllllIIlllllIll, final int lllllllllllllIIlllllllIIlllllIlI) {
            return lllllllllllllIIlllllllIIlllllIll < lllllllllllllIIlllllllIIlllllIlI;
        }
        
        private static String llIIIlIIlllllIl(String lllllllllllllIIlllllllIlIIIlIIll, final String lllllllllllllIIlllllllIlIIIlIlll) {
            lllllllllllllIIlllllllIlIIIlIIll = new String(Base64.getDecoder().decode(lllllllllllllIIlllllllIlIIIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIlllllllIlIIIlIllI = new StringBuilder();
            final char[] lllllllllllllIIlllllllIlIIIlIlIl = lllllllllllllIIlllllllIlIIIlIlll.toCharArray();
            int lllllllllllllIIlllllllIlIIIlIlII = ConsolePanel.lIIIllIllIIIIl[0];
            final short lllllllllllllIIlllllllIlIIIIlllI = (Object)lllllllllllllIIlllllllIlIIIlIIll.toCharArray();
            final String lllllllllllllIIlllllllIlIIIIllIl = (String)lllllllllllllIIlllllllIlIIIIlllI.length;
            long lllllllllllllIIlllllllIlIIIIllII = ConsolePanel.lIIIllIllIIIIl[0];
            while (llIIIlIlIIIIIll((int)lllllllllllllIIlllllllIlIIIIllII, (int)lllllllllllllIIlllllllIlIIIIllIl)) {
                final char lllllllllllllIIlllllllIlIIIllIIl = lllllllllllllIIlllllllIlIIIIlllI[lllllllllllllIIlllllllIlIIIIllII];
                lllllllllllllIIlllllllIlIIIlIllI.append((char)(lllllllllllllIIlllllllIlIIIllIIl ^ lllllllllllllIIlllllllIlIIIlIlIl[lllllllllllllIIlllllllIlIIIlIlII % lllllllllllllIIlllllllIlIIIlIlIl.length]));
                "".length();
                ++lllllllllllllIIlllllllIlIIIlIlII;
                ++lllllllllllllIIlllllllIlIIIIllII;
                "".length();
                if (((0xAB ^ 0xBD ^ (0x1E ^ 0x35)) & (0xBF ^ 0x93 ^ (0xAA ^ 0xBB) ^ -" ".length())) != 0x0) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIlllllllIlIIIlIllI);
        }
        
        static {
            llIIIlIlIIIIIlI();
            llIIIlIlIIIIIII();
        }
    }
}
