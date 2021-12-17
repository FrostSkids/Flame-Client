// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick;

import org.lwjgl.Sys;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.Pbuffer;
import org.lwjgl.opengl.PixelFormat;
import java.util.Arrays;
import org.lwjgl.input.Cursor;
import org.lwjgl.LWJGLException;
import java.io.IOException;
import org.newdawn.slick.opengl.CursorLoader;
import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.util.ResourceLoader;
import java.util.Properties;
import org.newdawn.slick.opengl.ImageData;
import org.newdawn.slick.util.Log;
import org.newdawn.slick.openal.SoundStore;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.lwjgl.opengl.Drawable;
import org.newdawn.slick.opengl.renderer.SGL;
import org.newdawn.slick.gui.GUIContext;

public abstract class GameContainer implements GUIContext
{
    protected /* synthetic */ long maximumLogicInterval;
    protected /* synthetic */ boolean vsync;
    protected /* synthetic */ int height;
    protected /* synthetic */ long lastFPS;
    protected static /* synthetic */ SGL GL;
    protected /* synthetic */ Input input;
    protected /* synthetic */ boolean supportsMultiSample;
    private /* synthetic */ boolean showFPS;
    protected /* synthetic */ boolean smoothDeltas;
    private /* synthetic */ Font defaultFont;
    protected static /* synthetic */ boolean stencil;
    private static final /* synthetic */ int[] lllIlllIIIIlIl;
    protected /* synthetic */ boolean clearEachFrame;
    protected /* synthetic */ int fps;
    private /* synthetic */ Graphics graphics;
    protected static /* synthetic */ Drawable SHARED_DRAWABLE;
    protected /* synthetic */ boolean alwaysRender;
    protected /* synthetic */ Game game;
    protected /* synthetic */ boolean paused;
    protected /* synthetic */ int targetFPS;
    protected /* synthetic */ int recordedFPS;
    protected /* synthetic */ int samples;
    private static final /* synthetic */ String[] lllIllIllllllI;
    protected /* synthetic */ boolean running;
    protected /* synthetic */ long minimumLogicInterval;
    protected /* synthetic */ Game lastGame;
    protected /* synthetic */ boolean forceExit;
    protected /* synthetic */ long lastFrame;
    protected /* synthetic */ int width;
    protected /* synthetic */ long storedDelta;
    
    private static String lIlIIlIlIlIllllI(String llllllllllllIlIllIIIlIIIIllIIIll, final String llllllllllllIlIllIIIlIIIIllIIlll) {
        llllllllllllIlIllIIIlIIIIllIIIll = (long)new String(Base64.getDecoder().decode(((String)llllllllllllIlIllIIIlIIIIllIIIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllIIIlIIIIllIIllI = new StringBuilder();
        final char[] llllllllllllIlIllIIIlIIIIllIIlIl = llllllllllllIlIllIIIlIIIIllIIlll.toCharArray();
        int llllllllllllIlIllIIIlIIIIllIIlII = GameContainer.lllIlllIIIIlIl[2];
        final String llllllllllllIlIllIIIlIIIIlIllllI = (Object)((String)llllllllllllIlIllIIIlIIIIllIIIll).toCharArray();
        final String llllllllllllIlIllIIIlIIIIlIlllIl = (String)llllllllllllIlIllIIIlIIIIlIllllI.length;
        double llllllllllllIlIllIIIlIIIIlIlllII = GameContainer.lllIlllIIIIlIl[2];
        while (lIlIIlIlIllllIll((int)llllllllllllIlIllIIIlIIIIlIlllII, (int)llllllllllllIlIllIIIlIIIIlIlllIl)) {
            final char llllllllllllIlIllIIIlIIIIllIlIIl = llllllllllllIlIllIIIlIIIIlIllllI[llllllllllllIlIllIIIlIIIIlIlllII];
            llllllllllllIlIllIIIlIIIIllIIllI.append((char)(llllllllllllIlIllIIIlIIIIllIlIIl ^ llllllllllllIlIllIIIlIIIIllIIlIl[llllllllllllIlIllIIIlIIIIllIIlII % llllllllllllIlIllIIIlIIIIllIIlIl.length]));
            "".length();
            ++llllllllllllIlIllIIIlIIIIllIIlII;
            ++llllllllllllIlIllIIIlIIIIlIlllII;
            "".length();
            if (((0x57 ^ 0x53) & ~(0x4A ^ 0x4E)) >= (0xB7 ^ 0xB3)) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllIIIlIIIIllIIllI);
    }
    
    public static void enableStencil() {
        GameContainer.stencil = (GameContainer.lllIlllIIIIlIl[0] != 0);
    }
    
    public abstract int getScreenWidth();
    
    public Graphics getGraphics() {
        return this.graphics;
    }
    
    private static String lIlIIlIlIllIIIII(final String llllllllllllIlIllIIIlIIIIlIIIllI, final String llllllllllllIlIllIIIlIIIIlIIIIll) {
        try {
            final SecretKeySpec llllllllllllIlIllIIIlIIIIlIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIIlIIIIlIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllIIIlIIIIlIIlIII = Cipher.getInstance("Blowfish");
            llllllllllllIlIllIIIlIIIIlIIlIII.init(GameContainer.lllIlllIIIIlIl[5], llllllllllllIlIllIIIlIIIIlIIlIIl);
            return new String(llllllllllllIlIllIIIlIIIIlIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIIlIIIIlIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIIlIIIIlIIIlll) {
            llllllllllllIlIllIIIlIIIIlIIIlll.printStackTrace();
            return null;
        }
    }
    
    public boolean isFullscreen() {
        return GameContainer.lllIlllIIIIlIl[2] != 0;
    }
    
    private static boolean lIlIIlIlIlllIlll(final int llllllllllllIlIllIIIlIIIIIllIlIl) {
        return llllllllllllIlIllIIIlIIIIIllIlIl == 0;
    }
    
    public void setSoundVolume(final float llllllllllllIlIllIIIlIIlIIIIlIlI) {
        SoundStore.get().setSoundVolume(llllllllllllIlIllIIIlIIlIIIIlIlI);
    }
    
    public Input getInput() {
        return this.input;
    }
    
    public int getFPS() {
        return this.recordedFPS;
    }
    
    public void setForceExit(final boolean llllllllllllIlIllIIIlIIllIIIIIII) {
        this.forceExit = llllllllllllIlIllIIIlIIllIIIIIII;
    }
    
    public void setShowFPS(final boolean llllllllllllIlIllIIIlIIIlIIllIll) {
        this.showFPS = llllllllllllIlIllIIIlIIIlIIllIll;
    }
    
    private static boolean lIlIIlIlIlllIIII(final Object llllllllllllIlIllIIIlIIIIIlllIll) {
        return llllllllllllIlIllIIIlIIIIIlllIll != null;
    }
    
    protected void initGL() {
        Log.info(String.valueOf(new StringBuilder().append(GameContainer.lllIllIllllllI[GameContainer.lllIlllIIIIlIl[15]]).append(this.width).append(GameContainer.lllIllIllllllI[GameContainer.lllIlllIIIIlIl[16]]).append(this.height)));
        GameContainer.GL.initDisplay(this.width, this.height);
        if (lIlIIlIlIllllIlI(this.input)) {
            this.input = new Input(this.height);
        }
        this.input.init(this.height);
        if (lIlIIlIlIlllIllI((this.game instanceof InputListener) ? 1 : 0)) {
            this.input.removeListener((InputListener)this.game);
            this.input.addListener((InputListener)this.game);
        }
        if (lIlIIlIlIlllIIII(this.graphics)) {
            this.graphics.setDimensions(this.getWidth(), this.getHeight());
        }
        this.lastGame = this.game;
    }
    
    public boolean isShowingFPS() {
        return this.showFPS;
    }
    
    public abstract void setMouseCursor(final Image p0, final int p1, final int p2) throws SlickException;
    
    protected void enterOrtho(final int llllllllllllIlIllIIIlIIIIlllIllI, final int llllllllllllIlIllIIIlIIIIlllIIll) {
        GameContainer.GL.enterOrtho(llllllllllllIlIllIIIlIIIIlllIllI, llllllllllllIlIllIIIlIIIIlllIIll);
    }
    
    private static boolean lIlIIlIlIlllIllI(final int llllllllllllIlIllIIIlIIIIIllIlll) {
        return llllllllllllIlIllIIIlIIIIIllIlll != 0;
    }
    
    protected GameContainer(final Game llllllllllllIlIllIIIlIIllIIllIII) {
        this.running = (GameContainer.lllIlllIIIIlIl[0] != 0);
        this.targetFPS = GameContainer.lllIlllIIIIlIl[1];
        this.showFPS = (GameContainer.lllIlllIIIIlIl[0] != 0);
        this.minimumLogicInterval = 1L;
        this.maximumLogicInterval = 0L;
        this.clearEachFrame = (GameContainer.lllIlllIIIIlIl[0] != 0);
        this.forceExit = (GameContainer.lllIlllIIIIlIl[0] != 0);
        this.game = llllllllllllIlIllIIIlIIllIIllIII;
        this.lastFrame = this.getTime();
        getBuildVersion();
        "".length();
        Log.checkVerboseLogSetting();
    }
    
    public void setFullscreen(final boolean llllllllllllIlIllIIIlIIlIlllIIlI) throws SlickException {
    }
    
    public void setMultiSample(final int llllllllllllIlIllIIIlIIllIIIllII) {
        this.samples = llllllllllllIlIllIIIlIIllIIIllII;
    }
    
    private static boolean lIlIIlIlIllllIll(final int llllllllllllIlIllIIIlIIIIIlllllI, final int llllllllllllIlIllIIIlIIIIIllllIl) {
        return llllllllllllIlIllIIIlIIIIIlllllI < llllllllllllIlIllIIIlIIIIIllllIl;
    }
    
    public void exit() {
        this.running = (GameContainer.lllIlllIIIIlIl[2] != 0);
    }
    
    public int getWidth() {
        return this.width;
    }
    
    public void setMusicOn(final boolean llllllllllllIlIllIIIlIIlIIIllIlI) {
        SoundStore.get().setMusicOn(llllllllllllIlIllIIIlIIlIIIllIlI);
    }
    
    private static void lIlIIlIlIllIlIIl() {
        (lllIllIllllllI = new String[GameContainer.lllIlllIIIIlIl[17]])[GameContainer.lllIlllIIIIlIl[2]] = lIlIIlIlIlIllllI("MiMTFSkHbwYGNRQmEhF6A28YGzRCIQMYNkIpGRou", "bOvtZ");
        GameContainer.lllIllIllllllI[GameContainer.lllIlllIIIIlIl[0]] = lIlIIlIlIlIllllI("HB01GiUsUyAXaSoBMRk9LFMgECxpAzYNLy8WJlg8OhYwWC8mAXQLISgBMFgqJh0gHTE9X3QaPC8VMQo6aR07DGk6BiQIJjsHMRw=", "IsTxI");
        GameContainer.lllIllIllllllI[GameContainer.lllIlllIIIIlIl[5]] = lIlIIlIlIlIlllll("N0YuM9nNmJk=", "yQfYY");
        GameContainer.lllIllIllllllI[GameContainer.lllIlllIIIIlIl[6]] = lIlIIlIlIlIlllll("ugiPj+zGgm4=", "nElgB");
        GameContainer.lllIllIllllllI[GameContainer.lllIlllIIIIlIl[7]] = lIlIIlIlIllIIIII("uUwG03z9MDm7LVmlLqXzbw==", "JKoDY");
        GameContainer.lllIllIllllllI[GameContainer.lllIlllIIIIlIl[8]] = lIlIIlIlIlIllllI("IgYLKQESSB4kTRMNHi4fGgEELk0kBAMoBlcKHyIBE0gEPgAVDRg=", "whjKm");
        GameContainer.lllIllIllllllI[GameContainer.lllIlllIIIIlIl[9]] = lIlIIlIlIlIlllll("jMF2gccftcX2BOgXq0sbFd6H6If2P/2zzy4jhApqBWA=", "mxUya");
        GameContainer.lllIllIllllllI[GameContainer.lllIlllIIIIlIl[10]] = lIlIIlIlIlIlllll("zpLwZM6jryYIsV5OuLyAQL1NVimXB+W47DNZLe+/liQ=", "PKXrB");
        GameContainer.lllIllIllllllI[GameContainer.lllIlllIIIIlIl[4]] = lIlIIlIlIlIlllll("wypO/y+af+Q+FpCObaWayQJ/gLznXDMfC7AGRT/wpl03XaJgtUlKZuK84/S/XiJY", "hxbKW");
        GameContainer.lllIllIllllllI[GameContainer.lllIlllIIIIlIl[13]] = lIlIIlIlIlIlllll("gH6IawVEC3R7PQdPd5xWO2WECSVJy9aEmVPwwZ+cN/lQfxH6PB3a8+vgUKFe96UU", "qzLRy");
        GameContainer.lllIllIllllllI[GameContainer.lllIlllIIIIlIl[14]] = lIlIIlIlIlIllllI("ISMxX0Y=", "gsbef");
        GameContainer.lllIllIllllllI[GameContainer.lllIlllIIIIlIl[15]] = lIlIIlIlIllIIIII("5iQ7N93pZVMzpTgiZiJsQdTuLB2yGC7f", "fBbbe");
        GameContainer.lllIllIllllllI[GameContainer.lllIlllIIIIlIl[16]] = lIlIIlIlIlIlllll("eT+fBpl+COY=", "oqufp");
    }
    
    public void pause() {
        this.setPaused((boolean)(GameContainer.lllIlllIIIIlIl[0] != 0));
    }
    
    public abstract int getScreenHeight();
    
    public void setPaused(final boolean llllllllllllIlIllIIIlIIlIlIIlIll) {
        this.paused = llllllllllllIlIllIIIlIIlIlIIlIll;
    }
    
    public abstract void setMouseCursor(final ImageData p0, final int p1, final int p2) throws SlickException;
    
    public abstract void setMouseGrabbed(final boolean p0);
    
    private static int lIlIIlIlIlllIIIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public abstract boolean isMouseGrabbed();
    
    public static int getBuildVersion() {
        try {
            final Properties llllllllllllIlIllIIIlIIlIIllIlIl = new Properties();
            llllllllllllIlIllIIIlIIlIIllIlIl.load(ResourceLoader.getResourceAsStream(GameContainer.lllIllIllllllI[GameContainer.lllIlllIIIIlIl[5]]));
            final int llllllllllllIlIllIIIlIIlIIllIIll = Integer.parseInt(llllllllllllIlIllIIIlIIlIIllIlIl.getProperty(GameContainer.lllIllIllllllI[GameContainer.lllIlllIIIIlIl[6]]));
            Log.info(String.valueOf(new StringBuilder().append(GameContainer.lllIllIllllllI[GameContainer.lllIlllIIIIlIl[7]]).append(llllllllllllIlIllIIIlIIlIIllIIll)));
            return llllllllllllIlIllIIIlIIlIIllIIll;
        }
        catch (Exception llllllllllllIlIllIIIlIIlIIllIIIl) {
            Log.error(GameContainer.lllIllIllllllI[GameContainer.lllIlllIIIIlIl[8]]);
            return GameContainer.lllIlllIIIIlIl[1];
        }
    }
    
    public boolean supportsMultiSample() {
        return this.supportsMultiSample;
    }
    
    static {
        lIlIIlIlIllIllll();
        lIlIIlIlIllIlIIl();
        GameContainer.GL = Renderer.get();
    }
    
    public void setAnimatedMouseCursor(final String llllllllllllIlIllIIIlIIIlllIIlIl, final int llllllllllllIlIllIIIlIIIllIlllIl, final int llllllllllllIlIllIIIlIIIllIlllII, final int llllllllllllIlIllIIIlIIIlllIIIlI, final int llllllllllllIlIllIIIlIIIllIllIlI, final int[] llllllllllllIlIllIIIlIIIllIllIIl) throws SlickException {
        try {
            final Cursor llllllllllllIlIllIIIlIIIlllIlIIl = CursorLoader.get().getAnimatedCursor(llllllllllllIlIllIIIlIIIlllIIlIl, llllllllllllIlIllIIIlIIIllIlllIl, llllllllllllIlIllIIIlIIIllIlllII, llllllllllllIlIllIIIlIIIlllIIIlI, llllllllllllIlIllIIIlIIIllIllIlI, llllllllllllIlIllIIIlIIIllIllIIl);
            this.setMouseCursor(llllllllllllIlIllIIIlIIIlllIlIIl, llllllllllllIlIllIIIlIIIllIlllIl, llllllllllllIlIllIIIlIIIllIlllII);
            "".length();
            if (((0x5B ^ 0x4A) & ~(0x57 ^ 0x46)) > ((0x4F ^ 0x9) & ~(0xD0 ^ 0x96))) {
                return;
            }
        }
        catch (IOException llllllllllllIlIllIIIlIIIlllIlIII) {
            throw new SlickException(GameContainer.lllIllIllllllI[GameContainer.lllIlllIIIIlIl[9]], llllllllllllIlIllIIIlIIIlllIlIII);
        }
        catch (LWJGLException llllllllllllIlIllIIIlIIIlllIIlll) {
            throw new SlickException(GameContainer.lllIllIllllllI[GameContainer.lllIlllIIIIlIl[10]], (Throwable)llllllllllllIlIllIIIlIIIlllIIlll);
        }
    }
    
    public abstract void setIcons(final String[] p0) throws SlickException;
    
    private static String lIlIIlIlIlIlllll(final String llllllllllllIlIllIIIlIIIIlIlIIll, final String llllllllllllIlIllIIIlIIIIlIlIIII) {
        try {
            final SecretKeySpec llllllllllllIlIllIIIlIIIIlIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIIlIIIIlIlIIII.getBytes(StandardCharsets.UTF_8)), GameContainer.lllIlllIIIIlIl[4]), "DES");
            final Cipher llllllllllllIlIllIIIlIIIIlIlIlIl = Cipher.getInstance("DES");
            llllllllllllIlIllIIIlIIIIlIlIlIl.init(GameContainer.lllIlllIIIIlIl[5], llllllllllllIlIllIIIlIIIIlIlIllI);
            return new String(llllllllllllIlIllIIIlIIIIlIlIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIIlIIIIlIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIIlIIIIlIlIlII) {
            llllllllllllIlIllIIIlIIIIlIlIlII.printStackTrace();
            return null;
        }
    }
    
    public boolean isVSyncRequested() {
        return this.vsync;
    }
    
    protected void updateFPS() {
        if (lIlIIlIlIlllIlII(lIlIIlIlIlllIIll(this.getTime() - this.lastFPS, 1000L))) {
            this.lastFPS = this.getTime();
            this.recordedFPS = this.fps;
            this.fps = GameContainer.lllIlllIIIIlIl[2];
        }
        this.fps += GameContainer.lllIlllIIIIlIl[0];
    }
    
    public abstract void setDefaultMouseCursor();
    
    private static boolean lIlIIlIlIllllIIl(final int llllllllllllIlIllIIIlIIIIIlIllII, final int llllllllllllIlIllIIIlIIIIIlIlIll) {
        return llllllllllllIlIllIIIlIIIIIlIllII != llllllllllllIlIllIIIlIIIIIlIlIll;
    }
    
    private static boolean lIlIIlIlIllllIlI(final Object llllllllllllIlIllIIIlIIIIIlllIIl) {
        return llllllllllllIlIllIIIlIIIIIlllIIl == null;
    }
    
    public float getSoundVolume() {
        return SoundStore.get().getSoundVolume();
    }
    
    public boolean isMusicOn() {
        return SoundStore.get().musicOn();
    }
    
    public void setClearEachFrame(final boolean llllllllllllIlIllIIIlIIlIllIlIll) {
        this.clearEachFrame = llllllllllllIlIllIIIlIIlIllIlIll;
    }
    
    public static void enableSharedContext() throws SlickException {
        try {
            GameContainer.SHARED_DRAWABLE = (Drawable)new Pbuffer(GameContainer.lllIlllIIIIlIl[3], GameContainer.lllIlllIIIIlIl[3], new PixelFormat(GameContainer.lllIlllIIIIlIl[4], GameContainer.lllIlllIIIIlIl[2], GameContainer.lllIlllIIIIlIl[2]), (Drawable)null);
            "".length();
            if (-" ".length() > -" ".length()) {
                return;
            }
        }
        catch (LWJGLException llllllllllllIlIllIIIlIIlIlllIIII) {
            throw new SlickException(GameContainer.lllIllIllllllI[GameContainer.lllIlllIIIIlIl[0]], (Throwable)llllllllllllIlIllIIIlIIlIlllIIII);
        }
    }
    
    public float getAspectRatio() {
        return (float)(this.getWidth() / this.getHeight());
    }
    
    public void setAlwaysRender(final boolean llllllllllllIlIllIIIlIIlIIlllllI) {
        this.alwaysRender = llllllllllllIlIllIIIlIIlIIlllllI;
    }
    
    public void setTargetFrameRate(final int llllllllllllIlIllIIIlIIIlIIlIIII) {
        this.targetFPS = llllllllllllIlIllIIIlIIIlIIlIIII;
    }
    
    public float getMusicVolume() {
        return SoundStore.get().getMusicVolume();
    }
    
    public boolean isSoundOn() {
        return SoundStore.get().soundsOn();
    }
    
    public void setMinimumLogicUpdateInterval(final int llllllllllllIlIllIIIlIIIllIIIIlI) {
        this.minimumLogicInterval = llllllllllllIlIllIIIlIIIllIIIIlI;
    }
    
    public void sleep(final int llllllllllllIlIllIIIlIIIllllIlll) {
        final long llllllllllllIlIllIIIlIIIllllIllI = this.getTime() + llllllllllllIlIllIIIlIIIllllIlll;
        while (lIlIIlIlIlllIIlI(lIlIIlIlIlllIIIl(this.getTime(), llllllllllllIlIllIIIlIIIllllIllI))) {
            try {
                Thread.sleep(1L);
                "".length();
                if ("  ".length() == 0) {
                    return;
                }
                continue;
            }
            catch (Exception llllllllllllIlIllIIIlIIIlllllIIl) {
                "".length();
                if (" ".length() != " ".length()) {
                    return;
                }
                continue;
            }
            break;
        }
    }
    
    protected void enterOrtho() {
        this.enterOrtho(this.width, this.height);
    }
    
    public void setVerbose(final boolean llllllllllllIlIllIIIlIIIlIIIIIII) {
        Log.setVerbose(llllllllllllIlIllIIIlIIIlIIIIIII);
    }
    
    public void setSoundOn(final boolean llllllllllllIlIllIIIlIIlIIIlIIll) {
        SoundStore.get().setSoundsOn(llllllllllllIlIllIIIlIIlIIIlIIll);
    }
    
    public int getSamples() {
        return this.samples;
    }
    
    public static Drawable getSharedContext() {
        return GameContainer.SHARED_DRAWABLE;
    }
    
    private static boolean lIlIIlIlIlllIlII(final int llllllllllllIlIllIIIlIIIIIlIllll) {
        return llllllllllllIlIllIIIlIIIIIlIllll > 0;
    }
    
    public int getHeight() {
        return this.height;
    }
    
    public abstract void setMouseCursor(final Cursor p0, final int p1, final int p2) throws SlickException;
    
    public abstract boolean hasFocus();
    
    public void setDefaultFont(final Font llllllllllllIlIllIIIlIIllIIlIIII) {
        if (lIlIIlIlIlllIIII(llllllllllllIlIllIIIlIIllIIlIIII)) {
            this.defaultFont = llllllllllllIlIllIIIlIIllIIlIIII;
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            Log.warn(GameContainer.lllIllIllllllI[GameContainer.lllIlllIIIIlIl[2]]);
        }
    }
    
    protected void updateAndRender(int llllllllllllIlIllIIIlIIIlIlIllIl) throws SlickException {
        if (lIlIIlIlIlllIllI(this.smoothDeltas ? 1 : 0) && lIlIIlIlIlllIllI(this.getFPS())) {
            llllllllllllIlIllIIIlIIIlIlIllIl = GameContainer.lllIlllIIIIlIl[11] / this.getFPS();
        }
        this.input.poll(this.width, this.height);
        Music.poll(llllllllllllIlIllIIIlIIIlIlIllIl);
        Label_0382: {
            if (lIlIIlIlIlllIlll(this.paused ? 1 : 0)) {
                this.storedDelta += llllllllllllIlIllIIIlIIIlIlIllIl;
                if (!lIlIIlIlIllllIII(lIlIIlIlIlllIlIl(this.storedDelta, this.minimumLogicInterval))) {
                    break Label_0382;
                }
                try {
                    if (lIlIIlIlIlllIllI(lIlIIlIlIlllIlIl(this.maximumLogicInterval, 0L))) {
                        final long llllllllllllIlIllIIIlIIIlIllIlII = this.storedDelta / this.maximumLogicInterval;
                        int llllllllllllIlIllIIIlIIIlIllIlIl = GameContainer.lllIlllIIIIlIl[2];
                        while (lIlIIlIlIlllIIlI(lIlIIlIlIlllIlIl(llllllllllllIlIllIIIlIIIlIllIlIl, llllllllllllIlIllIIIlIIIlIllIlII))) {
                            this.game.update(this, (int)this.maximumLogicInterval);
                            ++llllllllllllIlIllIIIlIIIlIllIlIl;
                            "".length();
                            if ("  ".length() < 0) {
                                return;
                            }
                        }
                        final int llllllllllllIlIllIIIlIIIlIllIIll = (int)(this.storedDelta % this.maximumLogicInterval);
                        if (lIlIIlIlIlllIlII(lIlIIlIlIlllIlIl(llllllllllllIlIllIIIlIIIlIllIIll, this.minimumLogicInterval))) {
                            this.game.update(this, (int)(llllllllllllIlIllIIIlIIIlIllIIll % this.maximumLogicInterval));
                            this.storedDelta = 0L;
                            "".length();
                            if (-" ".length() >= ((0x2A ^ 0xF ^ (0x80 ^ 0xAD)) & (39 + 0 + 70 + 38 ^ 55 + 54 - 42 + 88 ^ -" ".length()))) {
                                return;
                            }
                        }
                        else {
                            this.storedDelta = llllllllllllIlIllIIIlIIIlIllIIll;
                        }
                        "".length();
                        if ((0x32 ^ 0x36) < 0) {
                            return;
                        }
                    }
                    else {
                        this.game.update(this, (int)this.storedDelta);
                        this.storedDelta = 0L;
                    }
                    "".length();
                    if (-" ".length() == "  ".length()) {
                        return;
                    }
                    break Label_0382;
                }
                catch (Throwable llllllllllllIlIllIIIlIIIlIllIIlI) {
                    Log.error(llllllllllllIlIllIIIlIIIlIllIIlI);
                    throw new SlickException(GameContainer.lllIllIllllllI[GameContainer.lllIlllIIIIlIl[4]]);
                }
            }
            this.game.update(this, GameContainer.lllIlllIIIIlIl[2]);
        }
        if (!lIlIIlIlIlllIlll(this.hasFocus() ? 1 : 0) || lIlIIlIlIlllIllI(this.getAlwaysRender() ? 1 : 0)) {
            if (lIlIIlIlIlllIllI(this.clearEachFrame ? 1 : 0)) {
                GameContainer.GL.glClear(GameContainer.lllIlllIIIIlIl[12]);
            }
            GameContainer.GL.glLoadIdentity();
            this.graphics.resetTransform();
            this.graphics.resetFont();
            this.graphics.resetLineWidth();
            this.graphics.setAntiAlias((boolean)(GameContainer.lllIlllIIIIlIl[2] != 0));
            try {
                this.game.render(this, this.graphics);
                "".length();
                if (-"  ".length() > 0) {
                    return;
                }
            }
            catch (Throwable llllllllllllIlIllIIIlIIIlIllIIIl) {
                Log.error(llllllllllllIlIllIIIlIIIlIllIIIl);
                throw new SlickException(GameContainer.lllIllIllllllI[GameContainer.lllIlllIIIIlIl[13]]);
            }
            this.graphics.resetTransform();
            if (lIlIIlIlIlllIllI(this.showFPS ? 1 : 0)) {
                this.defaultFont.drawString(10.0f, 10.0f, String.valueOf(new StringBuilder().append(GameContainer.lllIllIllllllI[GameContainer.lllIlllIIIIlIl[14]]).append(this.recordedFPS)));
            }
            GameContainer.GL.flush();
        }
        if (lIlIIlIlIllllIIl(this.targetFPS, GameContainer.lllIlllIIIIlIl[1])) {
            Display.sync(this.targetFPS);
        }
    }
    
    private static boolean lIlIIlIlIlllIIlI(final int llllllllllllIlIllIIIlIIIIIllIIIl) {
        return llllllllllllIlIllIIIlIIIIIllIIIl < 0;
    }
    
    public long getTime() {
        return Sys.getTime() * 1000L / Sys.getTimerResolution();
    }
    
    public boolean isPaused() {
        return this.paused;
    }
    
    public void setMusicVolume(final float llllllllllllIlIllIIIlIIlIIIIIllI) {
        SoundStore.get().setMusicVolume(llllllllllllIlIllIIIlIIlIIIIIllI);
    }
    
    private static int lIlIIlIlIlllIlIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    protected boolean running() {
        return this.running;
    }
    
    public boolean isUpdatingOnlyWhenVisible() {
        return GameContainer.lllIlllIIIIlIl[0] != 0;
    }
    
    public void reinit() throws SlickException {
    }
    
    public void setVSync(final boolean llllllllllllIlIllIIIlIIIlIIIlIlI) {
        this.vsync = llllllllllllIlIllIIIlIIIlIIIlIlI;
        Display.setVSyncEnabled(llllllllllllIlIllIIIlIIIlIIIlIlI);
    }
    
    protected int getDelta() {
        final long llllllllllllIlIllIIIlIIIllIIllIl = this.getTime();
        final int llllllllllllIlIllIIIlIIIllIIllII = (int)(llllllllllllIlIllIIIlIIIllIIllIl - this.lastFrame);
        this.lastFrame = llllllllllllIlIllIIIlIIIllIIllIl;
        return llllllllllllIlIllIIIlIIIllIIllII;
    }
    
    public void resume() {
        this.setPaused((boolean)(GameContainer.lllIlllIIIIlIl[2] != 0));
    }
    
    protected void initSystem() throws SlickException {
        this.initGL();
        this.setMusicVolume(1.0f);
        this.setSoundVolume(1.0f);
        this.graphics = new Graphics(this.width, this.height);
        this.defaultFont = this.graphics.getFont();
    }
    
    private static int lIlIIlIlIlllIIll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public abstract void setMouseCursor(final String p0, final int p1, final int p2) throws SlickException;
    
    private static boolean lIlIIlIlIllllIII(final int llllllllllllIlIllIIIlIIIIIllIIll) {
        return llllllllllllIlIllIIIlIIIIIllIIll >= 0;
    }
    
    public boolean getAlwaysRender() {
        return this.alwaysRender;
    }
    
    private static void lIlIIlIlIllIllll() {
        (lllIlllIIIIlIl = new int[18])[0] = " ".length();
        GameContainer.lllIlllIIIIlIl[1] = -" ".length();
        GameContainer.lllIlllIIIIlIl[2] = ((141 + 140 - 278 + 140 ^ 159 + 194 - 232 + 75) & (4 + 126 + 76 + 43 ^ 119 + 129 - 113 + 43 ^ -" ".length()));
        GameContainer.lllIlllIIIIlIl[3] = (0x10 ^ 0x50);
        GameContainer.lllIlllIIIIlIl[4] = (0x43 ^ 0x4B);
        GameContainer.lllIlllIIIIlIl[5] = "  ".length();
        GameContainer.lllIlllIIIIlIl[6] = "   ".length();
        GameContainer.lllIlllIIIIlIl[7] = (94 + 27 - 5 + 24 ^ 6 + 28 - 13 + 115);
        GameContainer.lllIlllIIIIlIl[8] = (0x44 ^ 0x15 ^ (0x6B ^ 0x3F));
        GameContainer.lllIlllIIIIlIl[9] = (0x56 ^ 0x50);
        GameContainer.lllIlllIIIIlIl[10] = (0xD0 ^ 0x97 ^ (0x29 ^ 0x69));
        GameContainer.lllIlllIIIIlIl[11] = (0xFFFFEFFE & 0x13E9);
        GameContainer.lllIlllIIIIlIl[12] = (-(0xFFFFE45E & 0x3FEF) & (0xFFFFE7ED & 0x7D5F));
        GameContainer.lllIlllIIIIlIl[13] = (0xD ^ 0x4);
        GameContainer.lllIlllIIIIlIl[14] = (0x8B ^ 0x81);
        GameContainer.lllIlllIIIIlIl[15] = (40 + 39 - 76 + 132 ^ 111 + 137 - 184 + 76);
        GameContainer.lllIlllIIIIlIl[16] = (0x6B ^ 0x67);
        GameContainer.lllIlllIIIIlIl[17] = (76 + 22 + 77 + 15 ^ 142 + 3 - 118 + 152);
    }
    
    public void setMaximumLogicUpdateInterval(final int llllllllllllIlIllIIIlIIIlIllllII) {
        this.maximumLogicInterval = llllllllllllIlIllIIIlIIIlIllllII;
    }
    
    public void setSmoothDeltas(final boolean llllllllllllIlIllIIIlIIlIllllIII) {
        this.smoothDeltas = llllllllllllIlIllIIIlIIlIllllIII;
    }
    
    public abstract void setIcon(final String p0) throws SlickException;
    
    public void setUpdateOnlyWhenVisible(final boolean llllllllllllIlIllIIIlIIIlIlIlIIl) {
    }
    
    public Font getDefaultFont() {
        return this.defaultFont;
    }
}
