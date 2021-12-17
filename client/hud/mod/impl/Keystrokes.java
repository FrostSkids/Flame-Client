// 
// Decompiled by Procyon v0.5.36
// 

package client.hud.mod.impl;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.Gui;
import java.awt.Color;
import org.lwjgl.opengl.GL11;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import client.hud.mod.HudMod;

public class Keystrokes extends HudMod
{
    private static final /* synthetic */ int[] lIIlIIIIllIIII;
    private /* synthetic */ KeystrokesMode mode;
    private static final /* synthetic */ String[] lIIlIIIIlIllll;
    
    private static boolean llIIlIIlllIIllI(final int lllllllllllllIIlllIllIIllllIlIll, final int lllllllllllllIIlllIllIIllllIlIlI) {
        return lllllllllllllIIlllIllIIllllIlIll >= lllllllllllllIIlllIllIIllllIlIlI;
    }
    
    private static String llIIlIIlllIIIlI(final String lllllllllllllIIlllIllIIlllllIIll, final String lllllllllllllIIlllIllIIlllllIIII) {
        try {
            final SecretKeySpec lllllllllllllIIlllIllIIlllllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIllIIlllllIIII.getBytes(StandardCharsets.UTF_8)), Keystrokes.lIIlIIIIllIIII[11]), "DES");
            final Cipher lllllllllllllIIlllIllIIlllllIlIl = Cipher.getInstance("DES");
            lllllllllllllIIlllIllIIlllllIlIl.init(Keystrokes.lIIlIIIIllIIII[8], lllllllllllllIIlllIllIIlllllIllI);
            return new String(lllllllllllllIIlllIllIIlllllIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIllIIlllllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllIllIIlllllIlII) {
            lllllllllllllIIlllIllIIlllllIlII.printStackTrace();
            return null;
        }
    }
    
    public Keystrokes() {
        super(Keystrokes.lIIlIIIIlIllll[Keystrokes.lIIlIIIIllIIII[0]], Keystrokes.lIIlIIIIllIIII[1], Keystrokes.lIIlIIIIllIIII[2]);
        this.mode = KeystrokesMode.WASD_JUMP_MOUSE;
    }
    
    @Override
    public void draw() {
        GL11.glPushMatrix();
        final short lllllllllllllIIlllIllIlIIIIlIIIl;
        final short lllllllllllllIIlllIllIlIIIIlIIlI = (short)((Key[])(Object)(lllllllllllllIIlllIllIlIIIIlIIIl = (short)(Object)this.mode.getKeys())).length;
        float lllllllllllllIIlllIllIlIIIIlIIll = Keystrokes.lIIlIIIIllIIII[0];
        "".length();
        if (-" ".length() > -" ".length()) {
            return;
        }
        while (!llIIlIIlllIIllI((int)lllllllllllllIIlllIllIlIIIIlIIll, lllllllllllllIIlllIllIlIIIIlIIlI)) {
            final Key lllllllllllllIIlllIllIlIIIIlIlll = lllllllllllllIIlllIllIlIIIIlIIIl[lllllllllllllIIlllIllIlIIIIlIIll];
            final int lllllllllllllIIlllIllIlIIIIlIllI = this.fr.getStringWidth(lllllllllllllIIlllIllIlIIIIlIlll.getName());
            final int llllllllllllIlllIlIlllIIlIllIIII = this.getX() + lllllllllllllIIlllIllIlIIIIlIlll.getX();
            final int llllllllllllIlllIlIlllIIlIlIllll = this.getY() + lllllllllllllIIlllIllIlIIIIlIlll.getY();
            final int llllllllllllIlllIlIlllIIlIlllIll = this.getX() + lllllllllllllIIlllIllIlIIIIlIlll.getX() + lllllllllllllIIlllIllIlIIIIlIlll.getWidth();
            final int llllllllllllIlllIlIlllIIlIlIllIl = this.getY() + lllllllllllllIIlllIllIlIIIIlIlll.getY() + lllllllllllllIIlllIllIlIIIIlIlll.getHeight();
            int llllllllllllIlllIlIlllIIlIlIllII;
            if (llIIlIIlllIIlIl(lllllllllllllIIlllIllIlIIIIlIlll.isDown() ? 1 : 0)) {
                llllllllllllIlllIlIlllIIlIlIllII = new Color(Keystrokes.lIIlIIIIllIIII[5], Keystrokes.lIIlIIIIllIIII[5], Keystrokes.lIIlIIIIllIIII[5], Keystrokes.lIIlIIIIllIIII[6]).getRGB();
                "".length();
                if ("   ".length() <= " ".length()) {
                    return;
                }
            }
            else {
                llllllllllllIlllIlIlllIIlIlIllII = new Color(Keystrokes.lIIlIIIIllIIII[0], Keystrokes.lIIlIIIIllIIII[0], Keystrokes.lIIlIIIIllIIII[0], Keystrokes.lIIlIIIIllIIII[7]).getRGB();
            }
            Gui.drawRect(llllllllllllIlllIlIlllIIlIllIIII, llllllllllllIlllIlIlllIIlIlIllll, llllllllllllIlllIlIlllIIlIlllIll, llllllllllllIlllIlIlllIIlIlIllIl, llllllllllllIlllIlIlllIIlIlIllII);
            final FontRenderer fr = this.fr;
            final String name = lllllllllllllIIlllIllIlIIIIlIlll.getName();
            final float llllllllllllIlllllllIlIlIIIlIIll = (float)(this.getX() + lllllllllllllIIlllIllIlIIIIlIlll.getX() + lllllllllllllIIlllIllIlIIIIlIlll.getWidth() / Keystrokes.lIIlIIIIllIIII[8] - lllllllllllllIIlllIllIlIIIIlIllI / Keystrokes.lIIlIIIIllIIII[8]);
            final float llllllllllllIlllllllIlIlIIIlIIlI = (float)(this.getY() + lllllllllllllIIlllIllIlIIIIlIlll.getY() + lllllllllllllIIlllIllIlIIIIlIlll.getHeight() / Keystrokes.lIIlIIIIllIIII[8] - Keystrokes.lIIlIIIIllIIII[9]);
            int llllllllllllIlllllllIlIlIIIlIllI;
            if (llIIlIIlllIIlIl(lllllllllllllIIlllIllIlIIIIlIlll.isDown() ? 1 : 0)) {
                llllllllllllIlllllllIlIlIIIlIllI = new Color(Keystrokes.lIIlIIIIllIIII[5], Keystrokes.lIIlIIIIllIIII[1], Keystrokes.lIIlIIIIllIIII[0], Keystrokes.lIIlIIIIllIIII[5]).getRGB();
                "".length();
                if ("   ".length() <= 0) {
                    return;
                }
            }
            else {
                llllllllllllIlllllllIlIlIIIlIllI = new Color(Keystrokes.lIIlIIIIllIIII[1], Keystrokes.lIIlIIIIllIIII[0], Keystrokes.lIIlIIIIllIIII[0], Keystrokes.lIIlIIIIllIIII[7]).getRGB();
            }
            fr.drawStringWithShadow(name, llllllllllllIlllllllIlIlIIIlIIll, llllllllllllIlllllllIlIlIIIlIIlI, llllllllllllIlllllllIlIlIIIlIllI);
            "".length();
            ++lllllllllllllIIlllIllIlIIIIlIIll;
        }
        GL11.glPopMatrix();
        super.draw();
    }
    
    @Override
    public int getWidth() {
        return Keystrokes.lIIlIIIIllIIII[3];
    }
    
    private static boolean llIIlIIlllIIlIl(final int lllllllllllllIIlllIllIIllllIlIII) {
        return lllllllllllllIIlllIllIIllllIlIII != 0;
    }
    
    private static void llIIlIIlllIIlII() {
        (lIIlIIIIllIIII = new int[12])[0] = ((0xDB ^ 0xC4) & ~(0x87 ^ 0x98));
        Keystrokes.lIIlIIIIllIIII[1] = 139 + 101 - 184 + 114;
        Keystrokes.lIIlIIIIllIIII[2] = (88 + 62 - 120 + 162 ^ 165 + 127 - 194 + 99);
        Keystrokes.lIIlIIIIllIIII[3] = (0x16 ^ 0x2C);
        Keystrokes.lIIlIIIIllIIII[4] = (0x94 ^ 0x9C ^ (0x16 ^ 0x56));
        Keystrokes.lIIlIIIIllIIII[5] = 77 + 100 - 133 + 211;
        Keystrokes.lIIlIIIIllIIII[6] = (0x49 ^ 0x40 ^ (0x7A ^ 0x15));
        Keystrokes.lIIlIIIIllIIII[7] = (0xC5 ^ 0x9E ^ (0x2F ^ 0xC));
        Keystrokes.lIIlIIIIllIIII[8] = "  ".length();
        Keystrokes.lIIlIIIIllIIII[9] = (0x38 ^ 0x3C);
        Keystrokes.lIIlIIIIllIIII[10] = " ".length();
        Keystrokes.lIIlIIIIllIIII[11] = (0x51 ^ 0x59);
    }
    
    @Override
    public int getHeight() {
        return Keystrokes.lIIlIIIIllIIII[4];
    }
    
    static {
        llIIlIIlllIIlII();
        llIIlIIlllIIIll();
    }
    
    private static void llIIlIIlllIIIll() {
        (lIIlIIIIlIllll = new String[Keystrokes.lIIlIIIIllIIII[10]])[Keystrokes.lIIlIIIIllIIII[0]] = llIIlIIlllIIIlI("cKMhU2Pl/hFANsuIZjPBCA==", "zmCXX");
    }
    
    @Override
    public void renderDummy(final int lllllllllllllIIlllIllIlIIIIIIIIl, final int lllllllllllllIIlllIllIlIIIIIIlIl) {
        GL11.glPushMatrix();
        final long lllllllllllllIIlllIllIIlllllllII;
        final short lllllllllllllIIlllIllIIlllllllIl = (short)((Key[])(Object)(lllllllllllllIIlllIllIIlllllllII = (long)(Object)this.mode.getKeys())).length;
        long lllllllllllllIIlllIllIIllllllllI = Keystrokes.lIIlIIIIllIIII[0];
        "".length();
        if (-(27 + 90 - 16 + 47 ^ 65 + 27 + 37 + 16) >= 0) {
            return;
        }
        while (!llIIlIIlllIIllI((int)lllllllllllllIIlllIllIIllllllllI, lllllllllllllIIlllIllIIlllllllIl)) {
            final Key lllllllllllllIIlllIllIlIIIIIIlII = lllllllllllllIIlllIllIIlllllllII[lllllllllllllIIlllIllIIllllllllI];
            final int lllllllllllllIIlllIllIlIIIIIIIll = this.fr.getStringWidth(lllllllllllllIIlllIllIlIIIIIIlII.getName());
            final int llllllllllllIlllIlIlllIIlIllIIII = this.getX() + lllllllllllllIIlllIllIlIIIIIIlII.getX();
            final int llllllllllllIlllIlIlllIIlIlIllll = this.getY() + lllllllllllllIIlllIllIlIIIIIIlII.getY();
            final int llllllllllllIlllIlIlllIIlIlllIll = this.getX() + lllllllllllllIIlllIllIlIIIIIIlII.getX() + lllllllllllllIIlllIllIlIIIIIIlII.getWidth();
            final int llllllllllllIlllIlIlllIIlIlIllIl = this.getY() + lllllllllllllIIlllIllIlIIIIIIlII.getY() + lllllllllllllIIlllIllIlIIIIIIlII.getHeight();
            int llllllllllllIlllIlIlllIIlIlIllII;
            if (llIIlIIlllIIlIl(lllllllllllllIIlllIllIlIIIIIIlII.isDown() ? 1 : 0)) {
                llllllllllllIlllIlIlllIIlIlIllII = new Color(Keystrokes.lIIlIIIIllIIII[5], Keystrokes.lIIlIIIIllIIII[5], Keystrokes.lIIlIIIIllIIII[5], Keystrokes.lIIlIIIIllIIII[6]).getRGB();
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                llllllllllllIlllIlIlllIIlIlIllII = new Color(Keystrokes.lIIlIIIIllIIII[0], Keystrokes.lIIlIIIIllIIII[0], Keystrokes.lIIlIIIIllIIII[0], Keystrokes.lIIlIIIIllIIII[6]).getRGB();
            }
            Gui.drawRect(llllllllllllIlllIlIlllIIlIllIIII, llllllllllllIlllIlIlllIIlIlIllll, llllllllllllIlllIlIlllIIlIlllIll, llllllllllllIlllIlIlllIIlIlIllIl, llllllllllllIlllIlIlllIIlIlIllII);
            final FontRenderer fr = this.fr;
            final String name = lllllllllllllIIlllIllIlIIIIIIlII.getName();
            final float llllllllllllIlllllllIlIlIIIlIIll = (float)(this.getX() + lllllllllllllIIlllIllIlIIIIIIlII.getX() + lllllllllllllIIlllIllIlIIIIIIlII.getWidth() / Keystrokes.lIIlIIIIllIIII[8] - lllllllllllllIIlllIllIlIIIIIIIll / Keystrokes.lIIlIIIIllIIII[8]);
            final float llllllllllllIlllllllIlIlIIIlIIlI = (float)(this.getY() + lllllllllllllIIlllIllIlIIIIIIlII.getY() + lllllllllllllIIlllIllIlIIIIIIlII.getHeight() / Keystrokes.lIIlIIIIllIIII[8] - Keystrokes.lIIlIIIIllIIII[9]);
            int llllllllllllIlllllllIlIlIIIlIllI;
            if (llIIlIIlllIIlIl(lllllllllllllIIlllIllIlIIIIIIlII.isDown() ? 1 : 0)) {
                llllllllllllIlllllllIlIlIIIlIllI = new Color(Keystrokes.lIIlIIIIllIIII[5], Keystrokes.lIIlIIIIllIIII[5], Keystrokes.lIIlIIIIllIIII[5], Keystrokes.lIIlIIIIllIIII[5]).getRGB();
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                llllllllllllIlllllllIlIlIIIlIllI = new Color(Keystrokes.lIIlIIIIllIIII[1], Keystrokes.lIIlIIIIllIIII[0], Keystrokes.lIIlIIIIllIIII[0], Keystrokes.lIIlIIIIllIIII[7]).getRGB();
            }
            fr.drawStringWithShadow(name, llllllllllllIlllllllIlIlIIIlIIll, llllllllllllIlllllllIlIlIIIlIIlI, llllllllllllIlllllllIlIlIIIlIllI);
            "".length();
            ++lllllllllllllIIlllIllIIllllllllI;
        }
        GL11.glPopMatrix();
        super.renderDummy(lllllllllllllIIlllIllIlIIIIIIIIl, lllllllllllllIIlllIllIlIIIIIIlIl);
    }
    
    public enum KeystrokesMode
    {
        private /* synthetic */ int width;
        
        WASD_MOUSE(lllllllllllllIIIIlIllllIIIlIIIIl2, lllllllllllllIIIIlIllllIIIlIIIII2, lllllllllllllIIIIlIllllIIIIlllll2);
        
        private static final /* synthetic */ int[] lIlIlllIIIllll;
        private final /* synthetic */ Key[] keys;
        
        WASD_JUMP_MOUSE(lllllllllllllIIIIlIllllIIIlIIIIl4, lllllllllllllIIIIlIllllIIIlIIIII4, lllllllllllllIIIIlIllllIIIIlllll4), 
        WASD(lllllllllllllIIIIlIllllIIIlIIIIl, lllllllllllllIIIIlIllllIIIlIIIII, lllllllllllllIIIIlIllllIIIIlllll);
        
        private /* synthetic */ int height;
        
        WASD_JUMP(lllllllllllllIIIIlIllllIIIlIIIIl3, lllllllllllllIIIIlIllllIIIlIIIII3, lllllllllllllIIIIlIllllIIIIlllll3);
        
        private static final /* synthetic */ String[] lIlIlllIIIlllI;
        
        private KeystrokesMode(final String lllllllllllllIIIIlIllllIIIlIIIIl, final int lllllllllllllIIIIlIllllIIIlIIIII, final Key... lllllllllllllIIIIlIllllIIIIlllll) {
            this.keys = lllllllllllllIIIIlIllllIIIIlllll;
            final short lllllllllllllIIIIlIllllIIIIllIll;
            final float lllllllllllllIIIIlIllllIIIIlllII = ((Key[])(Object)(lllllllllllllIIIIlIllllIIIIllIll = (short)(Object)this.keys)).length;
            long lllllllllllllIIIIlIllllIIIIlllIl = KeystrokesMode.lIlIlllIIIllll[0];
            "".length();
            if ((11 + 85 + 6 + 41 ^ 15 + 96 - 93 + 120) == 0x0) {
                throw null;
            }
            while (!llllIIllIIlIIIl((int)lllllllllllllIIIIlIllllIIIIlllIl, (int)lllllllllllllIIIIlIllllIIIIlllII)) {
                final Key lllllllllllllIIIIlIllllIIIlIIIll = lllllllllllllIIIIlIllllIIIIllIll[lllllllllllllIIIIlIllllIIIIlllIl];
                this.width = Math.max(this.width, lllllllllllllIIIIlIllllIIIlIIIll.getX() + lllllllllllllIIIIlIllllIIIlIIIll.getWidth());
                this.height = Math.max(this.height, lllllllllllllIIIIlIllllIIIlIIIll.getY() + lllllllllllllIIIIlIllllIIIlIIIll.getHeight());
                ++lllllllllllllIIIIlIllllIIIIlllIl;
            }
        }
        
        private static void llllIIllIIlIIII() {
            (lIlIlllIIIllll = new int[9])[0] = ((0x4D ^ 0x49) & ~(0x16 ^ 0x12));
            KeystrokesMode.lIlIlllIIIllll[1] = (0xAA ^ 0x96 ^ (0x11 ^ 0x29));
            KeystrokesMode.lIlIlllIIIllll[2] = " ".length();
            KeystrokesMode.lIlIlllIIIllll[3] = "  ".length();
            KeystrokesMode.lIlIlllIIIllll[4] = "   ".length();
            KeystrokesMode.lIlIlllIIIllll[5] = (183 + 138 - 258 + 129 ^ 110 + 110 - 42 + 20);
            KeystrokesMode.lIlIlllIIIllll[6] = (0x54 ^ 0x51);
            KeystrokesMode.lIlIlllIIIllll[7] = (((0x75 ^ 0x2C) & ~(0x56 ^ 0xF)) ^ (0xA5 ^ 0xA2));
            KeystrokesMode.lIlIlllIIIllll[8] = (0x5E ^ 0x56);
        }
        
        private static void llllIIllIIIllll() {
            (lIlIlllIIIlllI = new String[KeystrokesMode.lIlIlllIIIllll[1]])[KeystrokesMode.lIlIlllIIIllll[0]] = llllIIllIIIllIl("gX2HYLHuKR4=", "juOUt");
            KeystrokesMode.lIlIlllIIIlllI[KeystrokesMode.lIlIlllIIIllll[2]] = llllIIllIIIllIl("mSYV6XBNM+gJOi/Zy54bFA==", "FNBxu");
            KeystrokesMode.lIlIlllIIIlllI[KeystrokesMode.lIlIlllIIIllll[3]] = llllIIllIIIlllI("HzQ6KT4CICQ9", "Huima");
            KeystrokesMode.lIlIlllIIIlllI[KeystrokesMode.lIlIlllIIIllll[4]] = llllIIllIIIlllI("ORAiLyUkBDw7JSMeJDg/", "nQqkz");
        }
        
        private static String llllIIllIIIllIl(final String lllllllllllllIIIIlIllllIIIIIIIlI, final String lllllllllllllIIIIlIllllIIIIIIIIl) {
            try {
                final SecretKeySpec lllllllllllllIIIIlIllllIIIIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIllllIIIIIIIIl.getBytes(StandardCharsets.UTF_8)), KeystrokesMode.lIlIlllIIIllll[8]), "DES");
                final Cipher lllllllllllllIIIIlIllllIIIIIIlII = Cipher.getInstance("DES");
                lllllllllllllIIIIlIllllIIIIIIlII.init(KeystrokesMode.lIlIlllIIIllll[3], lllllllllllllIIIIlIllllIIIIIIlIl);
                return new String(lllllllllllllIIIIlIllllIIIIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIllllIIIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIIIIlIllllIIIIIIIll) {
                lllllllllllllIIIIlIllllIIIIIIIll.printStackTrace();
                return null;
            }
        }
        
        private static boolean llllIIllIIlIIIl(final int lllllllllllllIIIIlIlllIllllIIIlI, final int lllllllllllllIIIIlIlllIllllIIIIl) {
            return lllllllllllllIIIIlIlllIllllIIIlI >= lllllllllllllIIIIlIlllIllllIIIIl;
        }
        
        private static String llllIIllIIIlllI(String lllllllllllllIIIIlIlllIllllIllIl, final String lllllllllllllIIIIlIlllIlllllIIIl) {
            lllllllllllllIIIIlIlllIllllIllIl = new String(Base64.getDecoder().decode(lllllllllllllIIIIlIlllIllllIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIIIIlIlllIlllllIIII = new StringBuilder();
            final char[] lllllllllllllIIIIlIlllIllllIllll = lllllllllllllIIIIlIlllIlllllIIIl.toCharArray();
            int lllllllllllllIIIIlIlllIllllIlllI = KeystrokesMode.lIlIlllIIIllll[0];
            final boolean lllllllllllllIIIIlIlllIllllIlIII = (Object)lllllllllllllIIIIlIlllIllllIllIl.toCharArray();
            final short lllllllllllllIIIIlIlllIllllIIlll = (short)lllllllllllllIIIIlIlllIllllIlIII.length;
            boolean lllllllllllllIIIIlIlllIllllIIllI = KeystrokesMode.lIlIlllIIIllll[0] != 0;
            while (llllIIllIIlIIlI(lllllllllllllIIIIlIlllIllllIIllI ? 1 : 0, lllllllllllllIIIIlIlllIllllIIlll)) {
                final char lllllllllllllIIIIlIlllIlllllIIll = lllllllllllllIIIIlIlllIllllIlIII[lllllllllllllIIIIlIlllIllllIIllI];
                lllllllllllllIIIIlIlllIlllllIIII.append((char)(lllllllllllllIIIIlIlllIlllllIIll ^ lllllllllllllIIIIlIlllIllllIllll[lllllllllllllIIIIlIlllIllllIlllI % lllllllllllllIIIIlIlllIllllIllll.length]));
                "".length();
                ++lllllllllllllIIIIlIlllIllllIlllI;
                ++lllllllllllllIIIIlIlllIllllIIllI;
                "".length();
                if ("   ".length() <= ((66 + 115 - 47 + 2 ^ 137 + 158 - 230 + 134) & (69 + 17 + 56 + 76 ^ 41 + 85 - 44 + 67 ^ -" ".length()))) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIIIIlIlllIlllllIIII);
        }
        
        static {
            llllIIllIIlIIII();
            llllIIllIIIllll();
            final String lllllllllllllIIIIlIllllIIIlIIIIl = KeystrokesMode.lIlIlllIIIlllI[KeystrokesMode.lIlIlllIIIllll[0]];
            final int lllllllllllllIIIIlIllllIIIlIIIII = KeystrokesMode.lIlIlllIIIllll[0];
            final Key[] lllllllllllllIIIIlIllllIIIIlllll = new Key[KeystrokesMode.lIlIlllIIIllll[1]];
            lllllllllllllIIIIlIllllIIIIlllll[KeystrokesMode.lIlIlllIIIllll[0]] = Key.W;
            lllllllllllllIIIIlIllllIIIIlllll[KeystrokesMode.lIlIlllIIIllll[2]] = Key.A;
            lllllllllllllIIIIlIllllIIIIlllll[KeystrokesMode.lIlIlllIIIllll[3]] = Key.S;
            lllllllllllllIIIIlIllllIIIIlllll[KeystrokesMode.lIlIlllIIIllll[4]] = Key.D;
            final String lllllllllllllIIIIlIllllIIIlIIIIl2 = KeystrokesMode.lIlIlllIIIlllI[KeystrokesMode.lIlIlllIIIllll[2]];
            final int lllllllllllllIIIIlIllllIIIlIIIII2 = KeystrokesMode.lIlIlllIIIllll[2];
            final Key[] lllllllllllllIIIIlIllllIIIIlllll2 = new Key[KeystrokesMode.lIlIlllIIIllll[5]];
            lllllllllllllIIIIlIllllIIIIlllll2[KeystrokesMode.lIlIlllIIIllll[0]] = Key.W;
            lllllllllllllIIIIlIllllIIIIlllll2[KeystrokesMode.lIlIlllIIIllll[2]] = Key.A;
            lllllllllllllIIIIlIllllIIIIlllll2[KeystrokesMode.lIlIlllIIIllll[3]] = Key.S;
            lllllllllllllIIIIlIllllIIIIlllll2[KeystrokesMode.lIlIlllIIIllll[4]] = Key.D;
            lllllllllllllIIIIlIllllIIIIlllll2[KeystrokesMode.lIlIlllIIIllll[1]] = Key.LMB;
            lllllllllllllIIIIlIllllIIIIlllll2[KeystrokesMode.lIlIlllIIIllll[6]] = Key.RMB;
            final String lllllllllllllIIIIlIllllIIIlIIIIl3 = KeystrokesMode.lIlIlllIIIlllI[KeystrokesMode.lIlIlllIIIllll[3]];
            final int lllllllllllllIIIIlIllllIIIlIIIII3 = KeystrokesMode.lIlIlllIIIllll[3];
            final Key[] lllllllllllllIIIIlIllllIIIIlllll3 = new Key[KeystrokesMode.lIlIlllIIIllll[6]];
            lllllllllllllIIIIlIllllIIIIlllll3[KeystrokesMode.lIlIlllIIIllll[0]] = Key.W;
            lllllllllllllIIIIlIllllIIIIlllll3[KeystrokesMode.lIlIlllIIIllll[2]] = Key.A;
            lllllllllllllIIIIlIllllIIIIlllll3[KeystrokesMode.lIlIlllIIIllll[3]] = Key.S;
            lllllllllllllIIIIlIllllIIIIlllll3[KeystrokesMode.lIlIlllIIIllll[4]] = Key.D;
            lllllllllllllIIIIlIllllIIIIlllll3[KeystrokesMode.lIlIlllIIIllll[1]] = Key.Jump1;
            final String lllllllllllllIIIIlIllllIIIlIIIIl4 = KeystrokesMode.lIlIlllIIIlllI[KeystrokesMode.lIlIlllIIIllll[4]];
            final int lllllllllllllIIIIlIllllIIIlIIIII4 = KeystrokesMode.lIlIlllIIIllll[4];
            final Key[] lllllllllllllIIIIlIllllIIIIlllll4 = new Key[KeystrokesMode.lIlIlllIIIllll[7]];
            lllllllllllllIIIIlIllllIIIIlllll4[KeystrokesMode.lIlIlllIIIllll[0]] = Key.W;
            lllllllllllllIIIIlIllllIIIIlllll4[KeystrokesMode.lIlIlllIIIllll[2]] = Key.A;
            lllllllllllllIIIIlIllllIIIIlllll4[KeystrokesMode.lIlIlllIIIllll[3]] = Key.S;
            lllllllllllllIIIIlIllllIIIIlllll4[KeystrokesMode.lIlIlllIIIllll[4]] = Key.D;
            lllllllllllllIIIIlIllllIIIIlllll4[KeystrokesMode.lIlIlllIIIllll[1]] = Key.LMB;
            lllllllllllllIIIIlIllllIIIIlllll4[KeystrokesMode.lIlIlllIIIllll[6]] = Key.RMB;
            lllllllllllllIIIIlIllllIIIIlllll4[KeystrokesMode.lIlIlllIIIllll[5]] = Key.Jump2;
            final KeystrokesMode[] enum$VALUES = new KeystrokesMode[KeystrokesMode.lIlIlllIIIllll[1]];
            enum$VALUES[KeystrokesMode.lIlIlllIIIllll[0]] = KeystrokesMode.WASD;
            enum$VALUES[KeystrokesMode.lIlIlllIIIllll[2]] = KeystrokesMode.WASD_MOUSE;
            enum$VALUES[KeystrokesMode.lIlIlllIIIllll[3]] = KeystrokesMode.WASD_JUMP;
            enum$VALUES[KeystrokesMode.lIlIlllIIIllll[4]] = KeystrokesMode.WASD_JUMP_MOUSE;
            ENUM$VALUES = enum$VALUES;
        }
        
        public int getheight() {
            return this.height;
        }
        
        public int getWidth() {
            return this.width;
        }
        
        private static boolean llllIIllIIlIIlI(final int lllllllllllllIIIIlIlllIlllIllllI, final int lllllllllllllIIIIlIlllIlllIlllIl) {
            return lllllllllllllIIIIlIlllIlllIllllI < lllllllllllllIIIIlIlllIlllIlllIl;
        }
        
        public Key[] getKeys() {
            return this.keys;
        }
    }
    
    public static class Key
    {
        private final /* synthetic */ int w;
        private static final /* synthetic */ int[] lllIlIlllllIll;
        private final /* synthetic */ KeyBinding keyBind;
        private static final /* synthetic */ Key Jump2;
        private final /* synthetic */ int y;
        private static final /* synthetic */ String[] lllIlIlllllIlI;
        private static final /* synthetic */ Key LMB;
        private static final /* synthetic */ Key S;
        private static final /* synthetic */ Key A;
        private final /* synthetic */ int x;
        private static final /* synthetic */ Key W;
        private static final /* synthetic */ Key D;
        private static final /* synthetic */ Key Jump1;
        private final /* synthetic */ int h;
        public static /* synthetic */ Minecraft mc;
        private final /* synthetic */ String name;
        private static final /* synthetic */ Key RMB;
        
        private static void lIlIIIllllIIllII() {
            (lllIlIlllllIlI = new String[Key.lllIlIlllllIll[15]])[Key.lllIlIlllllIll[0]] = lIlIIIllllIIlIlI("Ow==", "lQalh");
            Key.lllIlIlllllIlI[Key.lllIlIlllllIll[2]] = lIlIIIllllIIlIll("GxbuESdUOGM=", "EnjgJ");
            Key.lllIlIlllllIlI[Key.lllIlIlllllIll[4]] = lIlIIIllllIIlIlI("GA==", "KgdrX");
            Key.lllIlIlllllIlI[Key.lllIlIlllllIll[5]] = lIlIIIllllIIlIll("raRukDrow0E=", "osYXz");
            Key.lllIlIlllllIlI[Key.lllIlIlllllIll[7]] = lIlIIIllllIIlIlI("FiUH", "ZhEEd");
            Key.lllIlIlllllIlI[Key.lllIlIlllllIll[9]] = lIlIIIllllIIlIlI("IRom", "sWdeH");
            Key.lllIlIlllllIlI[Key.lllIlIlllllIll[11]] = lIlIIIllllIIlIll("RnYGOOTz1uY=", "tlajb");
            Key.lllIlIlllllIlI[Key.lllIlIlllllIll[13]] = lIlIIIllllIIlIlI("w7cBeF9nfQ==", "PlUrJ");
        }
        
        public int getX() {
            return this.x;
        }
        
        private static boolean lIlIIIllllIIlllI(final int llllllllllllIlIllIlIIIIlIIIlIlll, final int llllllllllllIlIllIlIIIIlIIIlIllI) {
            return llllllllllllIlIllIlIIIIlIIIlIlll < llllllllllllIlIllIlIIIIlIIIlIllI;
        }
        
        private int getHeight() {
            return this.h;
        }
        
        private static String lIlIIIllllIIlIll(final String llllllllllllIlIllIlIIIIlIIlIIIlI, final String llllllllllllIlIllIlIIIIlIIIlllll) {
            try {
                final SecretKeySpec llllllllllllIlIllIlIIIIlIIlIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIlIIIIlIIIlllll.getBytes(StandardCharsets.UTF_8)), Key.lllIlIlllllIll[15]), "DES");
                final Cipher llllllllllllIlIllIlIIIIlIIlIIllI = Cipher.getInstance("DES");
                llllllllllllIlIllIlIIIIlIIlIIllI.init(Key.lllIlIlllllIll[4], llllllllllllIlIllIlIIIIlIIlIlIII);
                return new String(llllllllllllIlIllIlIIIIlIIlIIllI.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIlIIIIlIIlIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlIllIlIIIIlIIlIIlII) {
                llllllllllllIlIllIlIIIIlIIlIIlII.printStackTrace();
                return null;
            }
        }
        
        public Key(final String llllllllllllIlIllIlIIIIlIllIIIIl, final KeyBinding llllllllllllIlIllIlIIIIlIllIIIII, final int llllllllllllIlIllIlIIIIlIlIlllll, final int llllllllllllIlIllIlIIIIlIlIllllI, final int llllllllllllIlIllIlIIIIlIllIIlII, final int llllllllllllIlIllIlIIIIlIllIIIll) {
            this.name = llllllllllllIlIllIlIIIIlIllIIIIl;
            this.keyBind = llllllllllllIlIllIlIIIIlIllIIIII;
            this.x = llllllllllllIlIllIlIIIIlIlIlllll;
            this.y = llllllllllllIlIllIlIIIIlIlIllllI;
            this.h = llllllllllllIlIllIlIIIIlIllIIIll;
            this.w = llllllllllllIlIllIlIIIIlIllIIlII;
        }
        
        public int getY() {
            return this.y;
        }
        
        private static void lIlIIIllllIIllIl() {
            (lllIlIlllllIll = new int[16])[0] = ((0xC1 ^ 0x91) & ~(0x97 ^ 0xC7));
            Key.lllIlIlllllIll[1] = (0x5F ^ 0x4A);
            Key.lllIlIlllllIll[2] = " ".length();
            Key.lllIlIlllllIll[3] = (0x35 ^ 0x6B ^ (0x45 ^ 0x9));
            Key.lllIlIlllllIll[4] = "  ".length();
            Key.lllIlIlllllIll[5] = "   ".length();
            Key.lllIlIlllllIll[6] = (0xA4 ^ 0x8D);
            Key.lllIlIlllllIll[7] = (0xA ^ 0xE);
            Key.lllIlIlllllIll[8] = (0x22 ^ 0x3E);
            Key.lllIlIlllllIll[9] = (0x6 ^ 0x3);
            Key.lllIlIlllllIll[10] = (129 + 130 - 254 + 153 ^ 61 + 32 - 24 + 60);
            Key.lllIlIlllllIll[11] = (0x7C ^ 0x7A);
            Key.lllIlIlllllIll[12] = (0x3B ^ 0x1);
            Key.lllIlIlllllIll[13] = (0xAB ^ 0xAC);
            Key.lllIlIlllllIll[14] = (0x59 ^ 0x64);
            Key.lllIlIlllllIll[15] = (152 + 199 - 176 + 27 ^ 104 + 63 + 7 + 20);
        }
        
        public int getWidth() {
            return this.w;
        }
        
        public String getName() {
            return this.name;
        }
        
        public boolean isDown() {
            return this.keyBind.isKeyDown();
        }
        
        private static String lIlIIIllllIIlIlI(String llllllllllllIlIllIlIIIIlIIlllIII, final String llllllllllllIlIllIlIIIIlIIllIlll) {
            llllllllllllIlIllIlIIIIlIIlllIII = (float)new String(Base64.getDecoder().decode(((String)llllllllllllIlIllIlIIIIlIIlllIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIlIllIlIIIIlIIlllIll = new StringBuilder();
            final char[] llllllllllllIlIllIlIIIIlIIlllIlI = llllllllllllIlIllIlIIIIlIIllIlll.toCharArray();
            int llllllllllllIlIllIlIIIIlIIlllIIl = Key.lllIlIlllllIll[0];
            final byte llllllllllllIlIllIlIIIIlIIllIIll = (Object)((String)llllllllllllIlIllIlIIIIlIIlllIII).toCharArray();
            final boolean llllllllllllIlIllIlIIIIlIIllIIlI = llllllllllllIlIllIlIIIIlIIllIIll.length != 0;
            short llllllllllllIlIllIlIIIIlIIllIIIl = (short)Key.lllIlIlllllIll[0];
            while (lIlIIIllllIIlllI(llllllllllllIlIllIlIIIIlIIllIIIl, llllllllllllIlIllIlIIIIlIIllIIlI ? 1 : 0)) {
                final char llllllllllllIlIllIlIIIIlIIlllllI = llllllllllllIlIllIlIIIIlIIllIIll[llllllllllllIlIllIlIIIIlIIllIIIl];
                llllllllllllIlIllIlIIIIlIIlllIll.append((char)(llllllllllllIlIllIlIIIIlIIlllllI ^ llllllllllllIlIllIlIIIIlIIlllIlI[llllllllllllIlIllIlIIIIlIIlllIIl % llllllllllllIlIllIlIIIIlIIlllIlI.length]));
                "".length();
                ++llllllllllllIlIllIlIIIIlIIlllIIl;
                ++llllllllllllIlIllIlIIIIlIIllIIIl;
                "".length();
                if (((0x29 ^ 0x49 ^ (0x6A ^ 0xD)) & (0x68 ^ 0x19 ^ (0xF0 ^ 0x86) ^ -" ".length())) >= "  ".length()) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIlIllIlIIIIlIIlllIll);
        }
        
        static {
            lIlIIIllllIIllIl();
            lIlIIIllllIIllII();
            Key.mc = Minecraft.getMinecraft();
            W = new Key(Key.lllIlIlllllIlI[Key.lllIlIlllllIll[0]], Key.mc.gameSettings.keyBindForward, Key.lllIlIlllllIll[1], Key.lllIlIlllllIll[2], Key.lllIlIlllllIll[3], Key.lllIlIlllllIll[3]);
            A = new Key(Key.lllIlIlllllIlI[Key.lllIlIlllllIll[2]], Key.mc.gameSettings.keyBindLeft, Key.lllIlIlllllIll[2], Key.lllIlIlllllIll[1], Key.lllIlIlllllIll[3], Key.lllIlIlllllIll[3]);
            S = new Key(Key.lllIlIlllllIlI[Key.lllIlIlllllIll[4]], Key.mc.gameSettings.keyBindBack, Key.lllIlIlllllIll[1], Key.lllIlIlllllIll[1], Key.lllIlIlllllIll[3], Key.lllIlIlllllIll[3]);
            D = new Key(Key.lllIlIlllllIlI[Key.lllIlIlllllIll[5]], Key.mc.gameSettings.keyBindRight, Key.lllIlIlllllIll[6], Key.lllIlIlllllIll[1], Key.lllIlIlllllIll[3], Key.lllIlIlllllIll[3]);
            LMB = new Key(Key.lllIlIlllllIlI[Key.lllIlIlllllIll[7]], Key.mc.gameSettings.keyBindAttack, Key.lllIlIlllllIll[2], Key.lllIlIlllllIll[6], Key.lllIlIlllllIll[8], Key.lllIlIlllllIll[3]);
            RMB = new Key(Key.lllIlIlllllIlI[Key.lllIlIlllllIll[9]], Key.mc.gameSettings.keyBindUseItem, Key.lllIlIlllllIll[10], Key.lllIlIlllllIll[6], Key.lllIlIlllllIll[8], Key.lllIlIlllllIll[3]);
            Jump1 = new Key(Key.lllIlIlllllIlI[Key.lllIlIlllllIll[11]], Key.mc.gameSettings.keyBindJump, Key.lllIlIlllllIll[2], Key.lllIlIlllllIll[6], Key.lllIlIlllllIll[12], Key.lllIlIlllllIll[3]);
            Jump2 = new Key(Key.lllIlIlllllIlI[Key.lllIlIlllllIll[13]], Key.mc.gameSettings.keyBindJump, Key.lllIlIlllllIll[2], Key.lllIlIlllllIll[14], Key.lllIlIlllllIll[12], Key.lllIlIlllllIll[3]);
        }
    }
}
