// 
// Decompiled by Procyon v0.5.36
// 

package client.hud.mod.impl;

import org.lwjgl.opengl.Display;
import client.event.EventTarget;
import org.lwjgl.input.Keyboard;
import client.event.impl.KeyEvent;
import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import client.hud.mod.HudMod;

public class Perspective extends HudMod
{
    private /* synthetic */ float cameraPitch;
    private /* synthetic */ float cameraYaw;
    private static final /* synthetic */ int[] lIlIlIllIlIIII;
    private /* synthetic */ boolean perspectiveToggled;
    private /* synthetic */ int previousPerspective;
    private /* synthetic */ boolean returnOnRelease;
    private static final /* synthetic */ String[] lIlIlIllIIlllI;
    
    private static void lllIllllIIlIlII() {
        (lIlIlIllIlIIII = new int[8])[0] = ((0x29 ^ 0x60) & ~(0x8A ^ 0xC3));
        Perspective.lIlIlIllIlIIII[1] = " ".length();
        Perspective.lIlIlIllIlIIII[2] = "   ".length();
        Perspective.lIlIlIllIlIIII[3] = (-(0xFFFFFE1C & 0x15F7) & (0xFFFF9FFF & 0x77FB));
        Perspective.lIlIlIllIlIIII[4] = "  ".length();
        Perspective.lIlIlIllIlIIII[5] = -" ".length();
        Perspective.lIlIlIllIlIIII[6] = (0x1B ^ 0x23 ^ (0x20 ^ 0x1C));
        Perspective.lIlIlIllIlIIII[7] = (0x25 ^ 0x2D);
    }
    
    @Override
    public void renderDummy(final int lllllllllllllIIIIlllllllIlllIlIl, final int lllllllllllllIIIIlllllllIlllIlII) {
        this.fr.drawString(Perspective.lIlIlIllIIlllI[Perspective.lIlIlIllIlIIII[2]], this.getX(), this.getY(), Perspective.lIlIlIllIlIIII[5]);
        "".length();
    }
    
    private static int lllIllllIIllIII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean lllIllllIIllIll(final int lllllllllllllIIIIlllllllIIllIIll) {
        return lllllllllllllIIIIlllllllIIllIIll < 0;
    }
    
    private static String lllIllllIIIllII(String lllllllllllllIIIIlllllllIlIlIllI, final String lllllllllllllIIIIlllllllIlIlIlIl) {
        lllllllllllllIIIIlllllllIlIlIllI = new String(Base64.getDecoder().decode(lllllllllllllIIIIlllllllIlIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIlllllllIlIllIIl = new StringBuilder();
        final char[] lllllllllllllIIIIlllllllIlIllIII = lllllllllllllIIIIlllllllIlIlIlIl.toCharArray();
        int lllllllllllllIIIIlllllllIlIlIlll = Perspective.lIlIlIllIlIIII[0];
        final short lllllllllllllIIIIlllllllIlIlIIIl = (Object)lllllllllllllIIIIlllllllIlIlIllI.toCharArray();
        final short lllllllllllllIIIIlllllllIlIlIIII = (short)lllllllllllllIIIIlllllllIlIlIIIl.length;
        Exception lllllllllllllIIIIlllllllIlIIllll = (Exception)Perspective.lIlIlIllIlIIII[0];
        while (lllIllllIIlllII((int)lllllllllllllIIIIlllllllIlIIllll, lllllllllllllIIIIlllllllIlIlIIII)) {
            final char lllllllllllllIIIIlllllllIlIlllII = lllllllllllllIIIIlllllllIlIlIIIl[lllllllllllllIIIIlllllllIlIIllll];
            lllllllllllllIIIIlllllllIlIllIIl.append((char)(lllllllllllllIIIIlllllllIlIlllII ^ lllllllllllllIIIIlllllllIlIllIII[lllllllllllllIIIIlllllllIlIlIlll % lllllllllllllIIIIlllllllIlIllIII.length]));
            "".length();
            ++lllllllllllllIIIIlllllllIlIlIlll;
            ++lllllllllllllIIIIlllllllIlIIllll;
            "".length();
            if (-"   ".length() > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIlllllllIlIllIIl);
    }
    
    private static boolean lllIllllIIlIlIl(final int lllllllllllllIIIIlllllllIIlllllI, final int lllllllllllllIIIIlllllllIIllllIl) {
        return lllllllllllllIIIIlllllllIIlllllI == lllllllllllllIIIIlllllllIIllllIl;
    }
    
    @Override
    public void draw() {
        if (lllIllllIIlIllI(this.perspectiveToggled ? 1 : 0)) {
            this.fr.drawString(Perspective.lIlIlIllIIlllI[Perspective.lIlIlIllIlIIII[4]], this.getX(), this.getY(), Perspective.lIlIlIllIlIIII[5]);
            "".length();
        }
    }
    
    private static boolean lllIllllIIllIIl(final int lllllllllllllIIIIlllllllIIllIlIl) {
        return lllllllllllllIIIIlllllllIIllIlIl == 0;
    }
    
    private static String lllIllllIIIllIl(final String lllllllllllllIIIIlllllllIllIlIll, final String lllllllllllllIIIIlllllllIllIlIlI) {
        try {
            final SecretKeySpec lllllllllllllIIIIlllllllIllIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlllllllIllIlIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIlllllllIllIllIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIlllllllIllIllIl.init(Perspective.lIlIlIllIlIIII[4], lllllllllllllIIIIlllllllIllIlllI);
            return new String(lllllllllllllIIIIlllllllIllIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlllllllIllIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlllllllIllIllII) {
            lllllllllllllIIIIlllllllIllIllII.printStackTrace();
            return null;
        }
    }
    
    static {
        lllIllllIIlIlII();
        lllIllllIIlIIII();
    }
    
    private static String lllIllllIIIllll(final String lllllllllllllIIIIlllllllIlIIIllI, final String lllllllllllllIIIIlllllllIlIIIIll) {
        try {
            final SecretKeySpec lllllllllllllIIIIlllllllIlIIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlllllllIlIIIIll.getBytes(StandardCharsets.UTF_8)), Perspective.lIlIlIllIlIIII[7]), "DES");
            final Cipher lllllllllllllIIIIlllllllIlIIlIII = Cipher.getInstance("DES");
            lllllllllllllIIIIlllllllIlIIlIII.init(Perspective.lIlIlIllIlIIII[4], lllllllllllllIIIIlllllllIlIIlIIl);
            return new String(lllllllllllllIIIIlllllllIlIIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlllllllIlIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlllllllIlIIIlll) {
            lllllllllllllIIIIlllllllIlIIIlll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllIllllIIlllII(final int lllllllllllllIIIIlllllllIIlllIlI, final int lllllllllllllIIIIlllllllIIlllIIl) {
        return lllllllllllllIIIIlllllllIIlllIlI < lllllllllllllIIIIlllllllIIlllIIl;
    }
    
    private static void lllIllllIIlIIII() {
        (lIlIlIllIIlllI = new String[Perspective.lIlIlIllIlIIII[6]])[Perspective.lIlIlIllIlIIII[0]] = lllIllllIIIllII("JiM7FzYTJT0NMBM=", "vFIdF");
        Perspective.lIlIlIllIIlllI[Perspective.lIlIlIllIlIIII[1]] = lllIllllIIIllIl("v63xUb/m8lM=", "DTJlG");
        Perspective.lIlIlIllIIlllI[Perspective.lIlIlIllIlIIII[4]] = lllIllllIIIllll("aSAVvt9ZhjA=", "KJJJt");
        Perspective.lIlIlIllIIlllI[Perspective.lIlIlIllIlIIII[2]] = lllIllllIIIllIl("bnPQ/4J1dMc=", "tRNKF");
    }
    
    private static boolean lllIllllIIlIllI(final int lllllllllllllIIIIlllllllIIllIlll) {
        return lllllllllllllIIIIlllllllIIllIlll != 0;
    }
    
    @EventTarget
    public void keyboardEvent(final KeyEvent lllllllllllllIIIIllllllllIIllIll) {
        if (lllIllllIIlIlIl(lllllllllllllIIIIllllllllIIllIll.getKey(), this.mc.gameSettings.CLIENT_PERSPECTIVE.getKeyCode())) {
            if (lllIllllIIlIllI(Keyboard.getEventKeyState() ? 1 : 0)) {
                int perspectiveToggled;
                if (lllIllllIIlIllI(this.perspectiveToggled ? 1 : 0)) {
                    perspectiveToggled = Perspective.lIlIlIllIlIIII[0];
                    "".length();
                    if (((0xBF ^ 0xB2 ^ (0x6C ^ 0x7B)) & (67 + 220 - 119 + 55 ^ 157 + 153 - 127 + 14 ^ -" ".length())) > 0) {
                        return;
                    }
                }
                else {
                    perspectiveToggled = Perspective.lIlIlIllIlIIII[1];
                }
                this.perspectiveToggled = (perspectiveToggled != 0);
                this.cameraYaw = this.mc.thePlayer.rotationYaw;
                this.cameraPitch = this.mc.thePlayer.rotationPitch;
                if (lllIllllIIlIllI(this.perspectiveToggled ? 1 : 0)) {
                    this.previousPerspective = this.mc.gameSettings.thirdPersonView;
                    this.mc.gameSettings.thirdPersonView = Perspective.lIlIlIllIlIIII[1];
                    "".length();
                    if (-(0x86 ^ 0x82) >= 0) {
                        return;
                    }
                }
                else {
                    this.mc.gameSettings.thirdPersonView = this.previousPerspective;
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
            }
            else if (lllIllllIIlIllI(this.returnOnRelease ? 1 : 0)) {
                this.perspectiveToggled = (Perspective.lIlIlIllIlIIII[0] != 0);
                this.mc.gameSettings.thirdPersonView = this.previousPerspective;
            }
        }
        if (lllIllllIIlIlIl(Keyboard.getEventKey(), this.mc.gameSettings.keyBindTogglePerspective.getKeyCode())) {
            this.perspectiveToggled = (Perspective.lIlIlIllIlIIII[0] != 0);
        }
    }
    
    private static boolean lllIllllIIllIlI(final int lllllllllllllIIIIlllllllIIllIIIl) {
        return lllllllllllllIIIIlllllllIIllIIIl > 0;
    }
    
    public boolean overrideMouse() {
        if (lllIllllIIlIllI(this.mc.inGameHasFocus ? 1 : 0) && lllIllllIIlIllI(Display.isActive() ? 1 : 0)) {
            if (lllIllllIIllIIl(this.perspectiveToggled ? 1 : 0)) {
                return Perspective.lIlIlIllIlIIII[1] != 0;
            }
            this.mc.mouseHelper.mouseXYChange();
            final float lllllllllllllIIIIllllllllIIIllII = this.mc.gameSettings.mouseSensitivity * 0.6f + 0.2f;
            final float lllllllllllllIIIIllllllllIIIlIll = lllllllllllllIIIIllllllllIIIllII * lllllllllllllIIIIllllllllIIIllII * lllllllllllllIIIIllllllllIIIllII * 8.0f;
            final float lllllllllllllIIIIllllllllIIIlIlI = this.mc.mouseHelper.deltaX * lllllllllllllIIIIllllllllIIIlIll;
            final float lllllllllllllIIIIllllllllIIIlIIl = this.mc.mouseHelper.deltaY * lllllllllllllIIIIllllllllIIIlIll;
            this.cameraYaw += lllllllllllllIIIIllllllllIIIlIlI * 0.15f;
            this.cameraPitch += lllllllllllllIIIIllllllllIIIlIIl * 0.15f;
            if (lllIllllIIllIlI(lllIllllIIlIlll(this.cameraPitch, 90.0f))) {
                this.cameraPitch = 90.0f;
            }
            if (lllIllllIIllIll(lllIllllIIllIII(this.cameraPitch, -90.0f))) {
                this.cameraPitch = -90.0f;
            }
        }
        return Perspective.lIlIlIllIlIIII[0] != 0;
    }
    
    public Perspective() {
        super(Perspective.lIlIlIllIIlllI[Perspective.lIlIlIllIlIIII[0]], Perspective.lIlIlIllIlIIII[2], Perspective.lIlIlIllIlIIII[3]);
        this.returnOnRelease = (Perspective.lIlIlIllIlIIII[1] != 0);
        this.perspectiveToggled = (Perspective.lIlIlIllIlIIII[0] != 0);
        this.cameraYaw = 0.0f;
        this.cameraPitch = 0.0f;
        this.previousPerspective = Perspective.lIlIlIllIlIIII[0];
    }
    
    @Override
    public int getHeight() {
        return this.fr.FONT_HEIGHT;
    }
    
    private static int lllIllllIIlIlll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    @Override
    public int getWidth() {
        return this.fr.getStringWidth(Perspective.lIlIlIllIIlllI[Perspective.lIlIlIllIlIIII[1]]);
    }
    
    public float getCameraPitch() {
        float n;
        if (lllIllllIIlIllI(this.perspectiveToggled ? 1 : 0)) {
            n = this.cameraPitch;
            "".length();
            if (-(52 + 159 - 190 + 163 ^ 168 + 65 - 196 + 152) >= 0) {
                return 0.0f;
            }
        }
        else {
            n = this.mc.thePlayer.rotationPitch;
        }
        return n;
    }
    
    public float getCameraYaw() {
        float n;
        if (lllIllllIIlIllI(this.perspectiveToggled ? 1 : 0)) {
            n = this.cameraYaw;
            "".length();
            if ("   ".length() >= (0x64 ^ 0x75 ^ (0x96 ^ 0x83))) {
                return 0.0f;
            }
        }
        else {
            n = this.mc.thePlayer.rotationYaw;
        }
        return n;
    }
}
