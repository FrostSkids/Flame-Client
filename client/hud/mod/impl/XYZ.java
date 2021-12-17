// 
// Decompiled by Procyon v0.5.36
// 

package client.hud.mod.impl;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import client.hud.mod.HudMod;

public class XYZ extends HudMod
{
    private static final /* synthetic */ int[] lIIIlllIIIIIIl;
    private static final /* synthetic */ String[] lIIIllIllllIIl;
    
    private static String llIIIlIlIllIllI(final String lllllllllllllIIllllllIIllIlIIlII, final String lllllllllllllIIllllllIIllIlIIlIl) {
        try {
            final SecretKeySpec lllllllllllllIIllllllIIllIlIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllllIIllIlIIlIl.getBytes(StandardCharsets.UTF_8)), XYZ.lIIIlllIIIIIIl[10]), "DES");
            final Cipher lllllllllllllIIllllllIIllIlIlIII = Cipher.getInstance("DES");
            lllllllllllllIIllllllIIllIlIlIII.init(XYZ.lIIIlllIIIIIIl[4], lllllllllllllIIllllllIIllIlIlIIl);
            return new String(lllllllllllllIIllllllIIllIlIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllllIIllIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllllIIllIlIIlll) {
            lllllllllllllIIllllllIIllIlIIlll.printStackTrace();
            return null;
        }
    }
    
    static {
        llIIIlIlIllllll();
        llIIIlIlIllllIl();
    }
    
    public XYZ() {
        super(XYZ.lIIIllIllllIIl[XYZ.lIIIlllIIIIIIl[0]], XYZ.lIIIlllIIIIIIl[1], XYZ.lIIIlllIIIIIIl[2]);
    }
    
    @Override
    public int getWidth() {
        return this.fr.getStringWidth(XYZ.lIIIllIllllIIl[XYZ.lIIIlllIIIIIIl[9]]);
    }
    
    private static String llIIIlIlIllIlll(final String lllllllllllllIIllllllIIllIllIIIl, final String lllllllllllllIIllllllIIllIllIIII) {
        try {
            final SecretKeySpec lllllllllllllIIllllllIIllIllIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllllIIllIllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllllllIIllIllIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIllllllIIllIllIlIl.init(XYZ.lIIIlllIIIIIIl[4], lllllllllllllIIllllllIIllIllIllI);
            return new String(lllllllllllllIIllllllIIllIllIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllllIIllIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllllIIllIllIlII) {
            lllllllllllllIIllllllIIllIllIlII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public int getHeight() {
        return this.fr.FONT_HEIGHT;
    }
    
    private static String llIIIlIlIllllII(String lllllllllllllIIllllllIIllIIlIIIl, final String lllllllllllllIIllllllIIllIIlIlIl) {
        lllllllllllllIIllllllIIllIIlIIIl = new String(Base64.getDecoder().decode(lllllllllllllIIllllllIIllIIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllllllIIllIIlIlII = new StringBuilder();
        final char[] lllllllllllllIIllllllIIllIIlIIll = lllllllllllllIIllllllIIllIIlIlIl.toCharArray();
        int lllllllllllllIIllllllIIllIIlIIlI = XYZ.lIIIlllIIIIIIl[0];
        final Exception lllllllllllllIIllllllIIllIIIllII = (Object)lllllllllllllIIllllllIIllIIlIIIl.toCharArray();
        final int lllllllllllllIIllllllIIllIIIlIll = lllllllllllllIIllllllIIllIIIllII.length;
        Exception lllllllllllllIIllllllIIllIIIlIlI = (Exception)XYZ.lIIIlllIIIIIIl[0];
        while (llIIIlIllIIIIII((int)lllllllllllllIIllllllIIllIIIlIlI, lllllllllllllIIllllllIIllIIIlIll)) {
            final char lllllllllllllIIllllllIIllIIlIlll = lllllllllllllIIllllllIIllIIIllII[lllllllllllllIIllllllIIllIIIlIlI];
            lllllllllllllIIllllllIIllIIlIlII.append((char)(lllllllllllllIIllllllIIllIIlIlll ^ lllllllllllllIIllllllIIllIIlIIll[lllllllllllllIIllllllIIllIIlIIlI % lllllllllllllIIllllllIIllIIlIIll.length]));
            "".length();
            ++lllllllllllllIIllllllIIllIIlIIlI;
            ++lllllllllllllIIllllllIIllIIIlIlI;
            "".length();
            if (-" ".length() != -" ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllllllIIllIIlIlII);
    }
    
    private static void llIIIlIlIllllll() {
        (lIIIlllIIIIIIl = new int[11])[0] = ((0x16 ^ 0x5B) & ~(0xE4 ^ 0xA9));
        XYZ.lIIIlllIIIIIIl[1] = "   ".length();
        XYZ.lIIIlllIIIIIIl[2] = (102 + 72 - 163 + 135 ^ 155 + 68 - 141 + 77);
        XYZ.lIIIlllIIIIIIl[3] = " ".length();
        XYZ.lIIIlllIIIIIIl[4] = "  ".length();
        XYZ.lIIIlllIIIIIIl[5] = -" ".length();
        XYZ.lIIIlllIIIIIIl[6] = (0xE2 ^ 0xA5 ^ (0x33 ^ 0x70));
        XYZ.lIIIlllIIIIIIl[7] = (0xB ^ 0xE);
        XYZ.lIIIlllIIIIIIl[8] = (0x60 ^ 0x66);
        XYZ.lIIIlllIIIIIIl[9] = (0x7D ^ 0x7A);
        XYZ.lIIIlllIIIIIIl[10] = (159 + 93 - 78 + 16 ^ 28 + 83 + 4 + 67);
    }
    
    private static void llIIIlIlIllllIl() {
        (lIIIllIllllIIl = new String[XYZ.lIIIlllIIIIIIl[10]])[XYZ.lIIIlllIIIIIIl[0]] = llIIIlIlIllIllI("jPA0guIIHr8=", "WGlGr");
        XYZ.lIIIllIllllIIl[XYZ.lIIIlllIIIIIIl[3]] = llIIIlIlIllIllI("Hsu7YF0tvdEvxolIhpNBhw==", "zGeDz");
        XYZ.lIIIllIllllIIl[XYZ.lIIIlllIIIIIIl[4]] = llIIIlIlIllIllI("th+js2S63K4=", "EcxJV");
        XYZ.lIIIllIllllIIl[XYZ.lIIIlllIIIIIIl[1]] = llIIIlIlIllIlll("xzaW2ngFLMw=", "eiHcV");
        XYZ.lIIIllIllllIIl[XYZ.lIIIlllIIIIIIl[6]] = llIIIlIlIllIlll("g58pHkCyIDiWJlm8XVBR6A==", "RwTrw");
        XYZ.lIIIllIllllIIl[XYZ.lIIIlllIIIIIIl[7]] = llIIIlIlIllIlll("zsV+ZURYruw=", "dNOof");
        XYZ.lIIIllIllllIIl[XYZ.lIIIlllIIIIIIl[8]] = llIIIlIlIllllII("Zg==", "FVmBq");
        XYZ.lIIIllIllllIIl[XYZ.lIIIlllIIIIIIl[9]] = llIIIlIlIllIlll("pcQMKmRbhwPwAzVvt7lJaV9Ht1D9gdutF8LuP76Lo1g=", "cFeEN");
    }
    
    @Override
    public void draw() {
        this.fr.drawStringWithShadow(String.valueOf(new StringBuilder(XYZ.lIIIllIllllIIl[XYZ.lIIIlllIIIIIIl[3]]).append(Math.round(this.mc.thePlayer.posX)).append(XYZ.lIIIllIllllIIl[XYZ.lIIIlllIIIIIIl[4]]).append(Math.round(this.mc.thePlayer.posY)).append(XYZ.lIIIllIllllIIl[XYZ.lIIIlllIIIIIIl[1]]).append(Math.round(this.mc.thePlayer.posZ))), (float)this.getX(), (float)this.getY(), XYZ.lIIIlllIIIIIIl[5]);
        "".length();
        super.draw();
    }
    
    @Override
    public void renderDummy(final int lllllllllllllIIllllllIIlllIIIIlI, final int lllllllllllllIIllllllIIlllIIIlII) {
        this.fr.drawStringWithShadow(String.valueOf(new StringBuilder(XYZ.lIIIllIllllIIl[XYZ.lIIIlllIIIIIIl[6]]).append(Math.round(this.mc.thePlayer.posX)).append(XYZ.lIIIllIllllIIl[XYZ.lIIIlllIIIIIIl[7]]).append(Math.round(this.mc.thePlayer.posY)).append(XYZ.lIIIllIllllIIl[XYZ.lIIIlllIIIIIIl[8]]).append(Math.round(this.mc.thePlayer.posZ))), (float)this.getX(), (float)this.getY(), XYZ.lIIIlllIIIIIIl[5]);
        "".length();
        super.renderDummy(lllllllllllllIIllllllIIlllIIIIlI, lllllllllllllIIllllllIIlllIIIlII);
    }
    
    private static boolean llIIIlIllIIIIII(final int lllllllllllllIIllllllIIllIIIIllI, final int lllllllllllllIIllllllIIllIIIIlIl) {
        return lllllllllllllIIllllllIIllIIIIllI < lllllllllllllIIllllllIIllIIIIlIl;
    }
}
