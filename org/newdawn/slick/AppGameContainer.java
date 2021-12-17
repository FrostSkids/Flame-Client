// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick;

import java.io.IOException;
import java.io.OutputStream;
import org.lwjgl.BufferUtils;
import org.newdawn.slick.opengl.LoadableImageData;
import org.newdawn.slick.util.ResourceLoader;
import org.newdawn.slick.opengl.ImageIOImageData;
import org.newdawn.slick.opengl.TGAImageData;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.security.PrivilegedAction;
import org.lwjgl.Sys;
import org.lwjgl.openal.AL;
import org.newdawn.slick.openal.SoundStore;
import java.util.Arrays;
import org.newdawn.slick.opengl.InternalTextureLoader;
import org.lwjgl.opengl.Display;
import org.newdawn.slick.opengl.ImageData;
import org.lwjgl.input.Cursor;
import org.newdawn.slick.util.Log;
import org.lwjgl.input.Mouse;
import org.newdawn.slick.opengl.CursorLoader;
import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.PixelFormat;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.lwjgl.opengl.DisplayMode;

public class AppGameContainer extends GameContainer
{
    protected /* synthetic */ boolean alphaSupport;
    protected /* synthetic */ DisplayMode targetDisplayMode;
    private static final /* synthetic */ String[] lllIIIIIIIIIII;
    protected /* synthetic */ DisplayMode originalDisplayMode;
    protected /* synthetic */ boolean updateOnlyOnVisible;
    private static final /* synthetic */ int[] lllIIIIIIIIlll;
    
    private static boolean lIIllIlllllIIlIl(final int llllllllllllIllIIIlIIIlIlIIlIlII, final int llllllllllllIllIIIlIIIlIlIIlIIll) {
        return llllllllllllIllIIIlIIIlIlIIlIlII < llllllllllllIllIIIlIIIlIlIIlIIll;
    }
    
    private static String lIIllIlllIllIlll(final String llllllllllllIllIIIlIIIlIllIIlIIl, final String llllllllllllIllIIIlIIIlIllIIlIII) {
        try {
            final SecretKeySpec llllllllllllIllIIIlIIIlIllIIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIlIIIlIllIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIIlIIIlIllIIlIll = Cipher.getInstance("Blowfish");
            llllllllllllIllIIIlIIIlIllIIlIll.init(AppGameContainer.lllIIIIIIIIlll[4], llllllllllllIllIIIlIIIlIllIIllII);
            return new String(llllllllllllIllIIIlIIIlIllIIlIll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIlIIIlIllIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIlIIIlIllIIlIlI) {
            llllllllllllIllIIIlIIIlIllIIlIlI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void setMouseCursor(final String llllllllllllIllIIIlIIIllIllIlIIl, final int llllllllllllIllIIIlIIIllIllIlIII, final int llllllllllllIllIIIlIIIllIllIIlII) throws SlickException {
        try {
            final Cursor llllllllllllIllIIIlIIIllIllIllII = CursorLoader.get().getCursor(llllllllllllIllIIIlIIIllIllIlIIl, llllllllllllIllIIIlIIIllIllIlIII, llllllllllllIllIIIlIIIllIllIIlII);
            Mouse.setNativeCursor(llllllllllllIllIIIlIIIllIllIllII);
            "".length();
            "".length();
            if (" ".length() == 0) {
                return;
            }
        }
        catch (Throwable llllllllllllIllIIIlIIIllIllIlIll) {
            Log.error(AppGameContainer.lllIIIIIIIIIII[AppGameContainer.lllIIIIIIIIlll[10]], llllllllllllIllIIIlIIIllIllIlIll);
            throw new SlickException(AppGameContainer.lllIIIIIIIIIII[AppGameContainer.lllIIIIIIIIlll[11]], llllllllllllIllIIIlIIIllIllIlIll);
        }
    }
    
    @Override
    public boolean isUpdatingOnlyWhenVisible() {
        return this.updateOnlyOnVisible;
    }
    
    @Override
    public int getScreenWidth() {
        return this.originalDisplayMode.getWidth();
    }
    
    @Override
    public void setMouseGrabbed(final boolean llllllllllllIllIIIlIIIlIlllllIII) {
        Mouse.setGrabbed(llllllllllllIllIIIlIIIlIlllllIII);
    }
    
    @Override
    public void setMouseCursor(final ImageData llllllllllllIllIIIlIIIllIlIllIII, final int llllllllllllIllIIIlIIIllIlIlIlll, final int llllllllllllIllIIIlIIIllIlIlIllI) throws SlickException {
        try {
            final Cursor llllllllllllIllIIIlIIIllIlIllllI = CursorLoader.get().getCursor(llllllllllllIllIIIlIIIllIlIllIII, llllllllllllIllIIIlIIIllIlIlIlll, llllllllllllIllIIIlIIIllIlIlIllI);
            Mouse.setNativeCursor(llllllllllllIllIIIlIIIllIlIllllI);
            "".length();
            "".length();
            if (-" ".length() == "  ".length()) {
                return;
            }
        }
        catch (Throwable llllllllllllIllIIIlIIIllIlIlllIl) {
            Log.error(AppGameContainer.lllIIIIIIIIIII[AppGameContainer.lllIIIIIIIIlll[12]], llllllllllllIllIIIlIIIllIlIlllIl);
            throw new SlickException(AppGameContainer.lllIIIIIIIIIII[AppGameContainer.lllIIIIIIIIlll[13]], llllllllllllIllIIIlIIIllIlIlllIl);
        }
    }
    
    @Override
    public void setFullscreen(final boolean llllllllllllIllIIIlIIIllIlllIIlI) throws SlickException {
        if (lIIllIlllllIIIll(this.isFullscreen() ? 1 : 0, llllllllllllIllIIIlIIIllIlllIIlI ? 1 : 0)) {
            return;
        }
        Label_0091: {
            if (lIIllIlllllIlIlI(llllllllllllIllIIIlIIIllIlllIIlI ? 1 : 0)) {
                try {
                    Display.setFullscreen(llllllllllllIllIIIlIIIllIlllIIlI);
                    "".length();
                    if (-(0xB0 ^ 0xB5) >= 0) {
                        return;
                    }
                    break Label_0091;
                }
                catch (LWJGLException llllllllllllIllIIIlIIIllIlllIllI) {
                    throw new SlickException(String.valueOf(new StringBuilder().append(AppGameContainer.lllIIIIIIIIIII[AppGameContainer.lllIIIIIIIIlll[9]]).append(llllllllllllIllIIIlIIIllIlllIIlI)), (Throwable)llllllllllllIllIIIlIIIllIlllIllI);
                }
            }
            this.setDisplayMode(this.width, this.height, llllllllllllIllIIIlIIIllIlllIIlI);
        }
        this.getDelta();
        "".length();
    }
    
    private static void lIIllIlllIlllIll() {
        (lllIIIIIIIIIII = new String[AppGameContainer.lllIIIIIIIIlll[26]])[AppGameContainer.lllIIIIIIIIlll[2]] = lIIllIlllIllIlll("Um+Te3YNam6PKZtV9s0/0aA+pbbniMecLJawKerOmDQ=", "FwPgC");
        AppGameContainer.lllIIIIIIIIIII[AppGameContainer.lllIIIIIIIIlll[3]] = lIIllIlllIlllIII("cDSJWxIuUPU=", "nNIYx");
        AppGameContainer.lllIIIIIIIIIII[AppGameContainer.lllIIIIIIIIlll[4]] = lIIllIlllIlllIIl("ZAAiew==", "DfQFf");
        AppGameContainer.lllIIIIIIIIIII[AppGameContainer.lllIIIIIIIIlll[6]] = lIIllIlllIllIlll("mdipckKb7WjEgld/h+uAHIdx7V1Qq1CR", "QGMRw");
        AppGameContainer.lllIIIIIIIIIII[AppGameContainer.lllIIIIIIIIlll[7]] = lIIllIlllIllIlll("t5l8HvXHZ4I=", "ZSVJz");
        AppGameContainer.lllIIIIIIIIIII[AppGameContainer.lllIIIIIIIIlll[8]] = lIIllIlllIlllIIl("UiwNGi4BKQoTJxx3", "rJxvB");
        AppGameContainer.lllIIIIIIIIIII[AppGameContainer.lllIIIIIIIIlll[9]] = lIIllIlllIllIlll("JY4225QBU1/JbTUZquVig9MxNrLsXJ4I0T/SEPp3K+E=", "KQSCR");
        AppGameContainer.lllIIIIIIIIIII[AppGameContainer.lllIIIIIIIIlll[10]] = lIIllIlllIllIlll("5mvHYlpuxiirX/mdPEptr8C1mrmi2WUpSorIg0uwLH27JGv1fruhzg==", "DPpJg");
        AppGameContainer.lllIIIIIIIIIII[AppGameContainer.lllIIIIIIIIlll[11]] = lIIllIlllIlllIIl("FigjKQs0aT4qTiMsPmUDPzw5IE4zPDg2ASI=", "PIJEn");
        AppGameContainer.lllIIIIIIIIIII[AppGameContainer.lllIIIIIIIIlll[12]] = lIIllIlllIllIlll("rMw/KezVGRVbhnQDlYG251JS0aLd4zNfKPUIYoQcmnFFB3u4bxSkyg==", "ZVdup");
        AppGameContainer.lllIIIIIIIIIII[AppGameContainer.lllIIIIIIIIlll[13]] = lIIllIlllIlllIII("PwD3X+kGSDJ1y8+jxykB8coIzmJ+0spYX/LuehADZIc=", "TRwAd");
        AppGameContainer.lllIIIIIIIIIII[AppGameContainer.lllIIIIIIIIlll[14]] = lIIllIlllIllIlll("C+ahYhFesMfWcWni6svJaSNb8wxhDfpDJtgNlY+NyLE/zg1eQ/Q9rg==", "Deqzi");
        AppGameContainer.lllIIIIIIIIIII[AppGameContainer.lllIIIIIIIIlll[15]] = lIIllIlllIlllIIl("MgUeAB8QRAMDWgcBA0wXGxEECVoXEQUfFQY=", "tdwlz");
        AppGameContainer.lllIIIIIIIIIII[AppGameContainer.lllIIIIIIIIlll[16]] = lIIllIlllIlllIII("jin3jS6B8FsPp+b2onEd81MpyFWxzZ3HHCNX0UHuYxddS+H3tFW8Bw==", "tsfkL");
        AppGameContainer.lllIIIIIIIIIII[AppGameContainer.lllIIIIIIIIlll[17]] = lIIllIlllIlllIII("+GZNEESr57BW4r1X6IGcK0ClXi+EYU/2HyvpOMLnDbg=", "cQDyU");
        AppGameContainer.lllIIIIIIIIIII[AppGameContainer.lllIIIIIIIIlll[18]] = lIIllIlllIlllIII("EoJBw+LPK3x1RKul3vrb8A==", "exthi");
        AppGameContainer.lllIIIIIIIIIII[AppGameContainer.lllIIIIIIIIlll[5]] = lIIllIlllIlllIII("4nqO/+24ehmZsYUn3OECQt+O+lO1PuU7", "iwDnD");
        AppGameContainer.lllIIIIIIIIIII[AppGameContainer.lllIIIIIIIIlll[19]] = lIIllIlllIlllIII("WCKYClb1UDSLOzP6PrSgndPTDjK53tYv", "rHQJY");
        AppGameContainer.lllIIIIIIIIIII[AppGameContainer.lllIIIIIIIIlll[20]] = lIIllIlllIllIlll("RdsRtClJa5ybQj+gQD1zTDSqh9PCpDOc09nJUhmgKzg/Ku3A6XUZ5w==", "KAyDW");
        AppGameContainer.lllIIIIIIIIIII[AppGameContainer.lllIIIIIIIIlll[21]] = lIIllIlllIlllIIl("AhcCOx8uFAAqHzJYAiAZYRkaLgQtGQ4jCA==", "AxlOm");
        AppGameContainer.lllIIIIIIIIIII[AppGameContainer.lllIIIIIIIIlll[22]] = lIIllIlllIllIlll("gPbM04tOw6Ktl5KNyjv9TTVHkeRjOYt5UpNifwuA8aU=", "sPzgY");
        AppGameContainer.lllIIIIIIIIIII[AppGameContainer.lllIIIIIIIIlll[23]] = lIIllIlllIlllIII("1QK4AdbwePs=", "AccSu");
        AppGameContainer.lllIIIIIIIIIII[AppGameContainer.lllIIIIIIIIlll[24]] = lIIllIlllIlllIIl("Ki0YOCEIbAU7ZB8pBXQwBClRPScDIg==", "lLqTD");
        AppGameContainer.lllIIIIIIIIIII[AppGameContainer.lllIIIIIIIIlll[25]] = lIIllIlllIlllIIl("AwssGiEhSjEZZDcPNhMwZQcqAzcgSiYDNjYFNw==", "EjEvD");
    }
    
    private static boolean lIIllIlllllIIlII(final int llllllllllllIllIIIlIIIlIlIIIlIIl) {
        return llllllllllllIllIIIlIIIlIlIIIlIIl != 0;
    }
    
    public AppGameContainer(final Game llllllllllllIllIIIlIIIlllIlIllII) throws SlickException {
        this(llllllllllllIllIIIlIIIlllIlIllII, AppGameContainer.lllIIIIIIIIlll[0], AppGameContainer.lllIIIIIIIIlll[1], (boolean)(AppGameContainer.lllIIIIIIIIlll[2] != 0));
    }
    
    @Override
    public void setIcon(final String llllllllllllIllIIIlIIIlIlllllllI) throws SlickException {
        final String[] icons = new String[AppGameContainer.lllIIIIIIIIlll[3]];
        icons[AppGameContainer.lllIIIIIIIIlll[2]] = llllllllllllIllIIIlIIIlIlllllllI;
        this.setIcons(icons);
    }
    
    private static boolean lIIllIlllllIIllI(final Object llllllllllllIllIIIlIIIlIlIIIllIl) {
        return llllllllllllIllIIIlIIIlIlIIIllIl != null;
    }
    
    private static boolean lIIllIlllllIlIlI(final int llllllllllllIllIIIlIIIlIlIIIIlll) {
        return llllllllllllIllIIIlIIIlIlIIIIlll == 0;
    }
    
    @Override
    public void setMouseCursor(final Cursor llllllllllllIllIIIlIIIllIlIlIIII, final int llllllllllllIllIIIlIIIllIlIIllll, final int llllllllllllIllIIIlIIIllIlIIlllI) throws SlickException {
        try {
            Mouse.setNativeCursor(llllllllllllIllIIIlIIIllIlIlIIII);
            "".length();
            "".length();
            if ("   ".length() > "   ".length()) {
                return;
            }
        }
        catch (Throwable llllllllllllIllIIIlIIIllIlIlIIlI) {
            Log.error(AppGameContainer.lllIIIIIIIIIII[AppGameContainer.lllIIIIIIIIlll[14]], llllllllllllIllIIIlIIIllIlIlIIlI);
            throw new SlickException(AppGameContainer.lllIIIIIIIIIII[AppGameContainer.lllIIIIIIIIlll[15]], llllllllllllIllIIIlIIIllIlIlIIlI);
        }
    }
    
    private int get2Fold(final int llllllllllllIllIIIlIIIllIlIIlIII) {
        int llllllllllllIllIIIlIIIllIlIIIlll = AppGameContainer.lllIIIIIIIIlll[4];
        while (lIIllIlllllIIlIl(llllllllllllIllIIIlIIIllIlIIIlll, llllllllllllIllIIIlIIIllIlIIlIII)) {
            llllllllllllIllIIIlIIIllIlIIIlll *= AppGameContainer.lllIIIIIIIIlll[4];
            "".length();
            if (((0x82 ^ 0xB9) & ~(0x7D ^ 0x46)) != 0x0) {
                return (0x92 ^ 0x99) & ~(0xC9 ^ 0xC2);
            }
        }
        return llllllllllllIllIIIlIIIllIlIIIlll;
    }
    
    public void setDisplayMode(final int llllllllllllIllIIIlIIIlllIIIIlIl, final int llllllllllllIllIIIlIIIlllIIIIIII, final boolean llllllllllllIllIIIlIIIlllIIIIIll) throws SlickException {
        if (lIIllIlllllIIIll(this.width, llllllllllllIllIIIlIIIlllIIIIlIl) && lIIllIlllllIIIll(this.height, llllllllllllIllIIIlIIIlllIIIIIII) && lIIllIlllllIIIll(this.isFullscreen() ? 1 : 0, llllllllllllIllIIIlIIIlllIIIIIll ? 1 : 0)) {
            return;
        }
        try {
            this.targetDisplayMode = null;
            if (lIIllIlllllIIlII(llllllllllllIllIIIlIIIlllIIIIIll ? 1 : 0)) {
                final DisplayMode[] llllllllllllIllIIIlIIIlllIIIlIIl = Display.getAvailableDisplayModes();
                int llllllllllllIllIIIlIIIlllIIIlIII = AppGameContainer.lllIIIIIIIIlll[2];
                int llllllllllllIllIIIlIIIlllIIIlIlI = AppGameContainer.lllIIIIIIIIlll[2];
                while (lIIllIlllllIIlIl(llllllllllllIllIIIlIIIlllIIIlIlI, llllllllllllIllIIIlIIIlllIIIlIIl.length)) {
                    final DisplayMode llllllllllllIllIIIlIIIlllIIIlIll = llllllllllllIllIIIlIIIlllIIIlIIl[llllllllllllIllIIIlIIIlllIIIlIlI];
                    if (lIIllIlllllIIIll(llllllllllllIllIIIlIIIlllIIIlIll.getWidth(), llllllllllllIllIIIlIIIlllIIIIlIl) && lIIllIlllllIIIll(llllllllllllIllIIIlIIIlllIIIlIll.getHeight(), llllllllllllIllIIIlIIIlllIIIIIII)) {
                        if ((!lIIllIlllllIIllI(this.targetDisplayMode) || lIIllIlllllIIlll(llllllllllllIllIIIlIIIlllIIIlIll.getFrequency(), llllllllllllIllIIIlIIIlllIIIlIII)) && (!lIIllIlllllIIllI(this.targetDisplayMode) || lIIllIlllllIlIII(llllllllllllIllIIIlIIIlllIIIlIll.getBitsPerPixel(), this.targetDisplayMode.getBitsPerPixel()))) {
                            this.targetDisplayMode = llllllllllllIllIIIlIIIlllIIIlIll;
                            llllllllllllIllIIIlIIIlllIIIlIII = this.targetDisplayMode.getFrequency();
                        }
                        if (lIIllIlllllIIIll(llllllllllllIllIIIlIIIlllIIIlIll.getBitsPerPixel(), this.originalDisplayMode.getBitsPerPixel()) && lIIllIlllllIIIll(llllllllllllIllIIIlIIIlllIIIlIll.getFrequency(), this.originalDisplayMode.getFrequency())) {
                            this.targetDisplayMode = llllllllllllIllIIIlIIIlllIIIlIll;
                            "".length();
                            if ((123 + 90 - 39 + 9 ^ 120 + 94 - 87 + 52) < 0) {
                                return;
                            }
                            break;
                        }
                    }
                    ++llllllllllllIllIIIlIIIlllIIIlIlI;
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                "".length();
                if (((0xBE ^ 0x8F) & ~(0x39 ^ 0x8)) > " ".length()) {
                    return;
                }
            }
            else {
                this.targetDisplayMode = new DisplayMode(llllllllllllIllIIIlIIIlllIIIIlIl, llllllllllllIllIIIlIIIlllIIIIIII);
            }
            if (lIIllIlllllIlIIl(this.targetDisplayMode)) {
                throw new SlickException(String.valueOf(new StringBuilder().append(AppGameContainer.lllIIIIIIIIIII[AppGameContainer.lllIIIIIIIIlll[2]]).append(llllllllllllIllIIIlIIIlllIIIIlIl).append(AppGameContainer.lllIIIIIIIIIII[AppGameContainer.lllIIIIIIIIlll[3]]).append(llllllllllllIllIIIlIIIlllIIIIIII).append(AppGameContainer.lllIIIIIIIIIII[AppGameContainer.lllIIIIIIIIlll[4]]).append(llllllllllllIllIIIlIIIlllIIIIIll)));
            }
            this.width = llllllllllllIllIIIlIIIlllIIIIlIl;
            this.height = llllllllllllIllIIIlIIIlllIIIIIII;
            Display.setDisplayMode(this.targetDisplayMode);
            Display.setFullscreen(llllllllllllIllIIIlIIIlllIIIIIll);
            if (lIIllIlllllIIlII(Display.isCreated() ? 1 : 0)) {
                this.initGL();
                this.enterOrtho();
            }
            if (lIIllIlllllIIIll(this.targetDisplayMode.getBitsPerPixel(), AppGameContainer.lllIIIIIIIIlll[5])) {
                InternalTextureLoader.get().set16BitMode();
            }
            "".length();
            if (((0x63 ^ 0x1E ^ (0xB3 ^ 0xC0)) & (0x83 ^ 0x92 ^ (0x24 ^ 0x3B) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        catch (LWJGLException llllllllllllIllIIIlIIIlllIIIIlll) {
            throw new SlickException(String.valueOf(new StringBuilder().append(AppGameContainer.lllIIIIIIIIIII[AppGameContainer.lllIIIIIIIIlll[6]]).append(llllllllllllIllIIIlIIIlllIIIIlIl).append(AppGameContainer.lllIIIIIIIIIII[AppGameContainer.lllIIIIIIIIlll[7]]).append(llllllllllllIllIIIlIIIlllIIIIIII).append(AppGameContainer.lllIIIIIIIIIII[AppGameContainer.lllIIIIIIIIlll[8]]).append(llllllllllllIllIIIlIIIlllIIIIIll)), (Throwable)llllllllllllIllIIIlIIIlllIIIIlll);
        }
        this.getDelta();
        "".length();
    }
    
    @Override
    public boolean hasFocus() {
        return Display.isActive();
    }
    
    private void tryCreateDisplay(final PixelFormat llllllllllllIllIIIlIIIllIIlIIIlI) throws LWJGLException {
        if (lIIllIlllllIlIIl(AppGameContainer.SHARED_DRAWABLE)) {
            Display.create(llllllllllllIllIIIlIIIllIIlIIIlI);
            "".length();
            if ((0x3D ^ 0x39) < 0) {
                return;
            }
        }
        else {
            Display.create(llllllllllllIllIIIlIIIllIIlIIIlI, AppGameContainer.SHARED_DRAWABLE);
        }
    }
    
    @Override
    public boolean isMouseGrabbed() {
        return Mouse.isGrabbed();
    }
    
    private static String lIIllIlllIlllIII(final String llllllllllllIllIIIlIIIlIlIlIIIlI, final String llllllllllllIllIIIlIIIlIlIlIIIll) {
        try {
            final SecretKeySpec llllllllllllIllIIIlIIIlIlIlIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIlIIIlIlIlIIIll.getBytes(StandardCharsets.UTF_8)), AppGameContainer.lllIIIIIIIIlll[11]), "DES");
            final Cipher llllllllllllIllIIIlIIIlIlIlIIllI = Cipher.getInstance("DES");
            llllllllllllIllIIIlIIIlIlIlIIllI.init(AppGameContainer.lllIIIIIIIIlll[4], llllllllllllIllIIIlIIIlIlIlIIlll);
            return new String(llllllllllllIllIIIlIIIlIlIlIIllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIlIIIlIlIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIlIIIlIlIlIIlIl) {
            llllllllllllIllIIIlIIIlIlIlIIlIl.printStackTrace();
            return null;
        }
    }
    
    public AppGameContainer(final Game llllllllllllIllIIIlIIIlllIIllllI, final int llllllllllllIllIIIlIIIlllIIlllIl, final int llllllllllllIllIIIlIIIlllIIlllII, final boolean llllllllllllIllIIIlIIIlllIlIIIII) throws SlickException {
        super(llllllllllllIllIIIlIIIlllIIllllI);
        this.updateOnlyOnVisible = (AppGameContainer.lllIIIIIIIIlll[3] != 0);
        this.alphaSupport = (AppGameContainer.lllIIIIIIIIlll[2] != 0);
        this.originalDisplayMode = Display.getDisplayMode();
        this.setDisplayMode(llllllllllllIllIIIlIIIlllIIlllIl, llllllllllllIllIIIlIIIlllIIlllII, llllllllllllIllIIIlIIIlllIlIIIII);
    }
    
    @Override
    public boolean isFullscreen() {
        return Display.isFullscreen();
    }
    
    @Override
    public void reinit() throws SlickException {
        InternalTextureLoader.get().clear();
        SoundStore.get().clear();
        this.initSystem();
        this.enterOrtho();
        try {
            this.game.init(this);
            "".length();
            if (((0x78 ^ 0x30 ^ (0x94 ^ 0xBF)) & (0x24 ^ 0x66 ^ (0xA0 ^ 0x81) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        catch (SlickException llllllllllllIllIIIlIIIllIIlIlIIl) {
            Log.error(llllllllllllIllIIIlIIIllIIlIlIIl);
            this.running = (AppGameContainer.lllIIIIIIIIlll[2] != 0);
        }
    }
    
    @Override
    public void setUpdateOnlyWhenVisible(final boolean llllllllllllIllIIIlIIIllIIIIIlll) {
        this.updateOnlyOnVisible = llllllllllllIllIIIlIIIllIIIIIlll;
    }
    
    @Override
    public void setDefaultMouseCursor() {
        try {
            Mouse.setNativeCursor((Cursor)null);
            "".length();
            "".length();
            if (null != null) {
                return;
            }
        }
        catch (LWJGLException llllllllllllIllIIIlIIIlIllIllIIl) {
            Log.error(AppGameContainer.lllIIIIIIIIIII[AppGameContainer.lllIIIIIIIIlll[25]], (Throwable)llllllllllllIllIIIlIIIlIllIllIIl);
        }
    }
    
    private static boolean lIIllIlllllIIlll(final int llllllllllllIllIIIlIIIlIlIIllIII, final int llllllllllllIllIIIlIIIlIlIIlIlll) {
        return llllllllllllIllIIIlIIIlIlIIllIII >= llllllllllllIllIIIlIIIlIlIIlIlll;
    }
    
    private static String lIIllIlllIlllIIl(String llllllllllllIllIIIlIIIlIlIllIlII, final String llllllllllllIllIIIlIIIlIlIlllIII) {
        llllllllllllIllIIIlIIIlIlIllIlII = (double)new String(Base64.getDecoder().decode(((String)llllllllllllIllIIIlIIIlIlIllIlII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIlIIIlIlIllIlll = new StringBuilder();
        final char[] llllllllllllIllIIIlIIIlIlIllIllI = llllllllllllIllIIIlIIIlIlIlllIII.toCharArray();
        int llllllllllllIllIIIlIIIlIlIllIlIl = AppGameContainer.lllIIIIIIIIlll[2];
        final byte llllllllllllIllIIIlIIIlIlIlIllll = (Object)((String)llllllllllllIllIIIlIIIlIlIllIlII).toCharArray();
        final Exception llllllllllllIllIIIlIIIlIlIlIlllI = (Exception)llllllllllllIllIIIlIIIlIlIlIllll.length;
        String llllllllllllIllIIIlIIIlIlIlIllIl = (String)AppGameContainer.lllIIIIIIIIlll[2];
        while (lIIllIlllllIIlIl((int)llllllllllllIllIIIlIIIlIlIlIllIl, (int)llllllllllllIllIIIlIIIlIlIlIlllI)) {
            final char llllllllllllIllIIIlIIIlIlIlllIlI = llllllllllllIllIIIlIIIlIlIlIllll[llllllllllllIllIIIlIIIlIlIlIllIl];
            llllllllllllIllIIIlIIIlIlIllIlll.append((char)(llllllllllllIllIIIlIIIlIlIlllIlI ^ llllllllllllIllIIIlIIIlIlIllIllI[llllllllllllIllIIIlIIIlIlIllIlIl % llllllllllllIllIIIlIIIlIlIllIllI.length]));
            "".length();
            ++llllllllllllIllIIIlIIIlIlIllIlIl;
            ++llllllllllllIllIIIlIIIlIlIlIllIl;
            "".length();
            if (((0x95 ^ 0x9B) & ~(0xA0 ^ 0xAE)) == (0xA8 ^ 0xAC)) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIlIIIlIlIllIlll);
    }
    
    public void destroy() {
        Display.destroy();
        AL.destroy();
    }
    
    public boolean supportsAlphaInBackBuffer() {
        return this.alphaSupport;
    }
    
    private static boolean lIIllIlllllIIIll(final int llllllllllllIllIIIlIIIlIlIIlllII, final int llllllllllllIllIIIlIIIlIlIIllIll) {
        return llllllllllllIllIIIlIIIlIlIIlllII == llllllllllllIllIIIlIIIlIlIIllIll;
    }
    
    private static boolean lIIllIlllllIlIII(final int llllllllllllIllIIIlIIIlIlIIlIIII, final int llllllllllllIllIIIlIIIlIlIIIllll) {
        return llllllllllllIllIIIlIIIlIlIIlIIII > llllllllllllIllIIIlIIIlIlIIIllll;
    }
    
    public void start() throws SlickException {
        try {
            this.setup();
            this.getDelta();
            "".length();
            while (lIIllIlllllIIlII(this.running() ? 1 : 0)) {
                this.gameLoop();
                "".length();
                if (((0x3C ^ 0x0) & ~(0x86 ^ 0xBA)) >= (0x6E ^ 0x6A)) {
                    return;
                }
            }
            this.destroy();
            "".length();
            if (null != null) {
                return;
            }
        }
        finally {
            this.destroy();
        }
        if (lIIllIlllllIIlII(this.forceExit ? 1 : 0)) {
            System.exit(AppGameContainer.lllIIIIIIIIlll[2]);
        }
    }
    
    protected void gameLoop() throws SlickException {
        final int llllllllllllIllIIIlIIIllIIIIlllI = this.getDelta();
        Label_0125: {
            if (lIIllIlllllIlIlI(Display.isVisible() ? 1 : 0) && lIIllIlllllIIlII(this.updateOnlyOnVisible ? 1 : 0)) {
                try {
                    Thread.sleep(100L);
                    "".length();
                    if (-" ".length() >= 0) {
                        return;
                    }
                    break Label_0125;
                }
                catch (Exception llllllllllllIllIIIlIIIllIIIlIIIl) {
                    "".length();
                    if ("  ".length() == "   ".length()) {
                        return;
                    }
                    break Label_0125;
                }
            }
            try {
                this.updateAndRender(llllllllllllIllIIIlIIIllIIIIlllI);
                "".length();
                if (-(172 + 7 - 81 + 92 ^ 47 + 105 - 141 + 175) >= 0) {
                    return;
                }
            }
            catch (SlickException llllllllllllIllIIIlIIIllIIIlIIII) {
                Log.error(llllllllllllIllIIIlIIIllIIIlIIII);
                this.running = (AppGameContainer.lllIIIIIIIIlll[2] != 0);
                return;
            }
        }
        this.updateFPS();
        Display.update();
        if (lIIllIlllllIIlII(Display.isCloseRequested() ? 1 : 0) && lIIllIlllllIIlII(this.game.closeRequested() ? 1 : 0)) {
            this.running = (AppGameContainer.lllIIIIIIIIlll[2] != 0);
        }
    }
    
    public void setTitle(final String llllllllllllIllIIIlIIIlllIIlIlII) {
        Display.setTitle(llllllllllllIllIIIlIIIlllIIlIlII);
    }
    
    protected void setup() throws SlickException {
        if (lIIllIlllllIlIIl(this.targetDisplayMode)) {
            this.setDisplayMode(AppGameContainer.lllIIIIIIIIlll[0], AppGameContainer.lllIIIIIIIIlll[1], (boolean)(AppGameContainer.lllIIIIIIIIlll[2] != 0));
        }
        Display.setTitle(this.game.getTitle());
        Log.info(String.valueOf(new StringBuilder().append(AppGameContainer.lllIIIIIIIIIII[AppGameContainer.lllIIIIIIIIlll[18]]).append(Sys.getVersion())));
        Log.info(String.valueOf(new StringBuilder().append(AppGameContainer.lllIIIIIIIIIII[AppGameContainer.lllIIIIIIIIlll[5]]).append(this.originalDisplayMode)));
        Log.info(String.valueOf(new StringBuilder().append(AppGameContainer.lllIIIIIIIIIII[AppGameContainer.lllIIIIIIIIlll[19]]).append(this.targetDisplayMode)));
        AccessController.doPrivileged((PrivilegedAction<Object>)new PrivilegedAction() {
            private static final /* synthetic */ int[] lIllllllIIIlII;
            
            public Object run() {
                try {
                    final int n = AppGameContainer$2.lIllllllIIIlII[0];
                    final int n2 = AppGameContainer$2.lIllllllIIIlII[0];
                    int n3;
                    if (lIIIIlIllIlllIlI(GameContainer.stencil ? 1 : 0)) {
                        n3 = AppGameContainer$2.lIllllllIIIlII[0];
                        "".length();
                        if (-" ".length() >= ((0x39 ^ 0x31) & ~(0x23 ^ 0x2B))) {
                            return null;
                        }
                    }
                    else {
                        n3 = AppGameContainer$2.lIllllllIIIlII[1];
                    }
                    final PixelFormat llllllllllllIllllIIlIlIIllIIIlIl = new PixelFormat(n, n2, n3, AppGameContainer.this.samples);
                    AppGameContainer.this.tryCreateDisplay(llllllllllllIllllIIlIlIIllIIIlIl);
                    AppGameContainer.this.supportsMultiSample = (AppGameContainer$2.lIllllllIIIlII[2] != 0);
                    "".length();
                    if (null != null) {
                        return null;
                    }
                }
                catch (Exception llllllllllllIllllIIlIlIIllIIIIIl) {
                    Display.destroy();
                    try {
                        final int n4 = AppGameContainer$2.lIllllllIIIlII[0];
                        final int n5 = AppGameContainer$2.lIllllllIIIlII[0];
                        int n6;
                        if (lIIIIlIllIlllIlI(GameContainer.stencil ? 1 : 0)) {
                            n6 = AppGameContainer$2.lIllllllIIIlII[0];
                            "".length();
                            if ((0x8F ^ 0x8B) <= "  ".length()) {
                                return null;
                            }
                        }
                        else {
                            n6 = AppGameContainer$2.lIllllllIIIlII[1];
                        }
                        final PixelFormat llllllllllllIllllIIlIlIIllIIIlII = new PixelFormat(n4, n5, n6);
                        AppGameContainer.this.tryCreateDisplay(llllllllllllIllllIIlIlIIllIIIlII);
                        AppGameContainer.this.alphaSupport = (AppGameContainer$2.lIllllllIIIlII[1] != 0);
                        "".length();
                        if ("   ".length() != "   ".length()) {
                            return null;
                        }
                        return null;
                    }
                    catch (Exception llllllllllllIllllIIlIlIIllIIIIlI) {
                        Display.destroy();
                        try {
                            AppGameContainer.this.tryCreateDisplay(new PixelFormat());
                            "".length();
                            if (((0xE8 ^ 0x88 ^ (0xCB ^ 0x83)) & (0xAE ^ 0xAB ^ (0x9 ^ 0x24) ^ -" ".length())) != 0x0) {
                                return null;
                            }
                            return null;
                        }
                        catch (Exception llllllllllllIllllIIlIlIIllIIIIll) {
                            Log.error(llllllllllllIllllIIlIlIIllIIIIll);
                        }
                    }
                }
                return null;
            }
            
            static {
                lIIIIlIllIlllIIl();
            }
            
            private static void lIIIIlIllIlllIIl() {
                (lIllllllIIIlII = new int[3])[0] = (" ".length() ^ (0x4C ^ 0x45));
                AppGameContainer$2.lIllllllIIIlII[1] = ((0x73 ^ 0x36) & ~(0x84 ^ 0xC1));
                AppGameContainer$2.lIllllllIIIlII[2] = " ".length();
            }
            
            private static boolean lIIIIlIllIlllIlI(final int llllllllllllIllllIIlIlIIlIlllIlI) {
                return llllllllllllIllllIIlIlIIlIlllIlI != 0;
            }
        });
        "".length();
        if (lIIllIlllllIlIlI(Display.isCreated() ? 1 : 0)) {
            throw new SlickException(AppGameContainer.lllIIIIIIIIIII[AppGameContainer.lllIIIIIIIIlll[20]]);
        }
        this.initSystem();
        this.enterOrtho();
        try {
            this.getInput().initControllers();
            "".length();
            if ((0x72 ^ 0x76) == 0x0) {
                return;
            }
        }
        catch (SlickException llllllllllllIllIIIlIIIllIIIllIlI) {
            Log.info(AppGameContainer.lllIIIIIIIIIII[AppGameContainer.lllIIIIIIIIlll[21]]);
            "".length();
            if ("  ".length() == 0) {
                return;
            }
        }
        catch (Throwable llllllllllllIllIIIlIIIllIIIllIIl) {
            Log.info(AppGameContainer.lllIIIIIIIIIII[AppGameContainer.lllIIIIIIIIlll[22]]);
        }
        try {
            this.game.init(this);
            "".length();
            if (null != null) {
                return;
            }
        }
        catch (SlickException llllllllllllIllIIIlIIIllIIIllIII) {
            Log.error(llllllllllllIllIIIlIIIllIIIllIII);
            this.running = (AppGameContainer.lllIIIIIIIIlll[2] != 0);
        }
    }
    
    private static boolean lIIllIlllllIlIIl(final Object llllllllllllIllIIIlIIIlIlIIIlIll) {
        return llllllllllllIllIIIlIIIlIlIIIlIll == null;
    }
    
    @Override
    public void setIcons(final String[] llllllllllllIllIIIlIIIlIlllIIIII) throws SlickException {
        final ByteBuffer[] llllllllllllIllIIIlIIIlIlllIIIIl = new ByteBuffer[llllllllllllIllIIIlIIIlIlllIIIII.length];
        int llllllllllllIllIIIlIIIlIlllIIlII = AppGameContainer.lllIIIIIIIIlll[2];
        while (lIIllIlllllIIlIl(llllllllllllIllIIIlIIIlIlllIIlII, llllllllllllIllIIIlIIIlIlllIIIII.length)) {
            boolean llllllllllllIllIIIlIIIlIlllIIlIl = AppGameContainer.lllIIIIIIIIlll[3] != 0;
            LoadableImageData llllllllllllIllIIIlIIIlIlllIIllI = null;
            if (lIIllIlllllIIlII(llllllllllllIllIIIlIIIlIlllIIIII[llllllllllllIllIIIlIIIlIlllIIlII].endsWith(AppGameContainer.lllIIIIIIIIIII[AppGameContainer.lllIIIIIIIIlll[23]]) ? 1 : 0)) {
                final LoadableImageData llllllllllllIllIIIlIIIlIlllIlIII = new TGAImageData();
                "".length();
                if ("   ".length() > (0x73 ^ 0x77)) {
                    return;
                }
            }
            else {
                llllllllllllIllIIIlIIIlIlllIIlIl = (AppGameContainer.lllIIIIIIIIlll[2] != 0);
                llllllllllllIllIIIlIIIlIlllIIllI = new ImageIOImageData();
            }
            try {
                llllllllllllIllIIIlIIIlIlllIIIIl[llllllllllllIllIIIlIIIlIlllIIlII] = llllllllllllIllIIIlIIIlIlllIIllI.loadImage(ResourceLoader.getResourceAsStream(llllllllllllIllIIIlIIIlIlllIIIII[llllllllllllIllIIIlIIIlIlllIIlII]), llllllllllllIllIIIlIIIlIlllIIlIl, (boolean)(AppGameContainer.lllIIIIIIIIlll[2] != 0), null);
                "".length();
                if (-" ".length() >= "   ".length()) {
                    return;
                }
            }
            catch (Exception llllllllllllIllIIIlIIIlIlllIIlll) {
                Log.error(llllllllllllIllIIIlIIIlIlllIIlll);
                throw new SlickException(AppGameContainer.lllIIIIIIIIIII[AppGameContainer.lllIIIIIIIIlll[24]]);
            }
            ++llllllllllllIllIIIlIIIlIlllIIlII;
            "".length();
            if (null != null) {
                return;
            }
        }
        Display.setIcon(llllllllllllIllIIIlIIIlIlllIIIIl);
        "".length();
    }
    
    private static void lIIllIlllllIIIlI() {
        (lllIIIIIIIIlll = new int[27])[0] = (-(0xFFFFFF7D & 0x7CD6) & (0xFFFFFED7 & 0x7FFB));
        AppGameContainer.lllIIIIIIIIlll[1] = (0xFFFFF5F7 & 0xBE8);
        AppGameContainer.lllIIIIIIIIlll[2] = ((0x75 ^ 0x58) & ~(0xAE ^ 0x83));
        AppGameContainer.lllIIIIIIIIlll[3] = " ".length();
        AppGameContainer.lllIIIIIIIIlll[4] = "  ".length();
        AppGameContainer.lllIIIIIIIIlll[5] = (64 + 116 - 31 + 21 ^ 143 + 173 - 295 + 165);
        AppGameContainer.lllIIIIIIIIlll[6] = "   ".length();
        AppGameContainer.lllIIIIIIIIlll[7] = (0xB6 ^ 0xB2);
        AppGameContainer.lllIIIIIIIIlll[8] = (98 + 170 - 258 + 189 ^ 88 + 125 - 141 + 122);
        AppGameContainer.lllIIIIIIIIlll[9] = (0x82 ^ 0x84);
        AppGameContainer.lllIIIIIIIIlll[10] = (0x5A ^ 0x3A ^ (0x32 ^ 0x55));
        AppGameContainer.lllIIIIIIIIlll[11] = (0x1C ^ 0x14);
        AppGameContainer.lllIIIIIIIIlll[12] = (0xD1 ^ 0xAF ^ (0xDC ^ 0xAB));
        AppGameContainer.lllIIIIIIIIlll[13] = (0x90 ^ 0x9A);
        AppGameContainer.lllIIIIIIIIlll[14] = (0x68 ^ 0x63);
        AppGameContainer.lllIIIIIIIIlll[15] = (0x1B ^ 0x17);
        AppGameContainer.lllIIIIIIIIlll[16] = (0x49 ^ 0x43 ^ (0x14 ^ 0x13));
        AppGameContainer.lllIIIIIIIIlll[17] = (0x4B ^ 0x45);
        AppGameContainer.lllIIIIIIIIlll[18] = (0x50 ^ 0xE ^ (0xD8 ^ 0x89));
        AppGameContainer.lllIIIIIIIIlll[19] = (0x72 ^ 0x63);
        AppGameContainer.lllIIIIIIIIlll[20] = (0x98 ^ 0x8A);
        AppGameContainer.lllIIIIIIIIlll[21] = (0x44 ^ 0x2A ^ (0x54 ^ 0x29));
        AppGameContainer.lllIIIIIIIIlll[22] = (0xA ^ 0x1E);
        AppGameContainer.lllIIIIIIIIlll[23] = (8 + 36 + 91 + 8 ^ 93 + 94 - 181 + 148);
        AppGameContainer.lllIIIIIIIIlll[24] = (0x74 ^ 0x62);
        AppGameContainer.lllIIIIIIIIlll[25] = (0x5F ^ 0x48);
        AppGameContainer.lllIIIIIIIIlll[26] = (0x5D ^ 0x29 ^ (0xEB ^ 0x87));
    }
    
    @Override
    public int getScreenHeight() {
        return this.originalDisplayMode.getHeight();
    }
    
    @Override
    public void setMouseCursor(final Image llllllllllllIllIIIlIIIllIIllIllI, final int llllllllllllIllIIIlIIIllIIllIlIl, final int llllllllllllIllIIIlIIIllIIllIlII) throws SlickException {
        try {
            final Image llllllllllllIllIIIlIIIllIIllllII = new Image(this.get2Fold(llllllllllllIllIIIlIIIllIIllIllI.getWidth()), this.get2Fold(llllllllllllIllIIIlIIIllIIllIllI.getHeight()));
            final Graphics llllllllllllIllIIIlIIIllIIlllIll = llllllllllllIllIIIlIIIllIIllllII.getGraphics();
            final ByteBuffer llllllllllllIllIIIlIIIllIIlllIlI = BufferUtils.createByteBuffer(llllllllllllIllIIIlIIIllIIllllII.getWidth() * llllllllllllIllIIIlIIIllIIllllII.getHeight() * AppGameContainer.lllIIIIIIIIlll[7]);
            llllllllllllIllIIIlIIIllIIlllIll.drawImage(llllllllllllIllIIIlIIIllIIllIllI.getFlippedCopy((boolean)(AppGameContainer.lllIIIIIIIIlll[2] != 0), (boolean)(AppGameContainer.lllIIIIIIIIlll[3] != 0)), 0.0f, 0.0f);
            llllllllllllIllIIIlIIIllIIlllIll.flush();
            llllllllllllIllIIIlIIIllIIlllIll.getArea(AppGameContainer.lllIIIIIIIIlll[2], AppGameContainer.lllIIIIIIIIlll[2], llllllllllllIllIIIlIIIllIIllllII.getWidth(), llllllllllllIllIIIlIIIllIIllllII.getHeight(), llllllllllllIllIIIlIIIllIIlllIlI);
            final Cursor llllllllllllIllIIIlIIIllIIlllIIl = CursorLoader.get().getCursor(llllllllllllIllIIIlIIIllIIlllIlI, llllllllllllIllIIIlIIIllIIllIlIl, llllllllllllIllIIIlIIIllIIllIlII, llllllllllllIllIIIlIIIllIIllllII.getWidth(), llllllllllllIllIIIlIIIllIIllIllI.getHeight());
            Mouse.setNativeCursor(llllllllllllIllIIIlIIIllIIlllIIl);
            "".length();
            "".length();
            if (" ".length() > "   ".length()) {
                return;
            }
        }
        catch (Throwable llllllllllllIllIIIlIIIllIIlllIII) {
            Log.error(AppGameContainer.lllIIIIIIIIIII[AppGameContainer.lllIIIIIIIIlll[16]], llllllllllllIllIIIlIIIllIIlllIII);
            throw new SlickException(AppGameContainer.lllIIIIIIIIIII[AppGameContainer.lllIIIIIIIIlll[17]], llllllllllllIllIIIlIIIllIIlllIII);
        }
    }
    
    static {
        lIIllIlllllIIIlI();
        lIIllIlllIlllIll();
        AccessController.doPrivileged((PrivilegedAction<Object>)new PrivilegedAction() {
            public Object run() {
                try {
                    Display.getDisplayMode();
                    "".length();
                    "".length();
                    if (null != null) {
                        return null;
                    }
                }
                catch (Exception lllllllllllllIIlIIIIIIlllIIlIlII) {
                    Log.error(lllllllllllllIIlIIIIIIlllIIlIlII);
                }
                return null;
            }
        });
        "".length();
    }
    
    private class NullOutputStream extends OutputStream
    {
        @Override
        public void write(final int llllllllllllIlllllllIIlIllIIlIlI) throws IOException {
        }
    }
}
