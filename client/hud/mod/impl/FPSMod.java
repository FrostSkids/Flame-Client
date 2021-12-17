// 
// Decompiled by Procyon v0.5.36
// 

package client.hud.mod.impl;

import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.Minecraft;
import client.hud.mod.HudMod;

public class FPSMod extends HudMod
{
    private static final /* synthetic */ String[] lIIlIlIIIIllII;
    private static final /* synthetic */ int[] lIIlIlIIIIllll;
    
    @Override
    public int getWidth() {
        return this.fr.getStringWidth(String.valueOf(new StringBuilder(FPSMod.lIIlIlIIIIllII[FPSMod.lIIlIlIIIIllll[1]]).append(Minecraft.getDebugFPS())));
    }
    
    @Override
    public void draw() {
        this.fr.drawStringWithShadow(String.valueOf(new StringBuilder(FPSMod.lIIlIlIIIIllII[FPSMod.lIIlIlIIIIllll[2]]).append(Minecraft.getDebugFPS())), (float)this.getX(), (float)this.getY(), FPSMod.lIIlIlIIIIllll[3]);
        "".length();
        super.draw();
    }
    
    private static String llIIllllIlIllIl(final String lllllllllllllIIllIlIIllllIlIIlIl, final String lllllllllllllIIllIlIIllllIlIIlII) {
        try {
            final SecretKeySpec lllllllllllllIIllIlIIllllIlIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIlIIllllIlIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllIlIIllllIlIIlll = Cipher.getInstance("Blowfish");
            lllllllllllllIIllIlIIllllIlIIlll.init(FPSMod.lIIlIlIIIIllll[4], lllllllllllllIIllIlIIllllIlIlIII);
            return new String(lllllllllllllIIllIlIIllllIlIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIlIIllllIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIlIIllllIlIIllI) {
            lllllllllllllIIllIlIIllllIlIIllI.printStackTrace();
            return null;
        }
    }
    
    private static String llIIllllIlIllII(final String lllllllllllllIIllIlIIllllIllIIlI, final String lllllllllllllIIllIlIIllllIllIIIl) {
        try {
            final SecretKeySpec lllllllllllllIIllIlIIllllIllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIlIIllllIllIIIl.getBytes(StandardCharsets.UTF_8)), FPSMod.lIIlIlIIIIllll[6]), "DES");
            final Cipher lllllllllllllIIllIlIIllllIllIlII = Cipher.getInstance("DES");
            lllllllllllllIIllIlIIllllIllIlII.init(FPSMod.lIIlIlIIIIllll[4], lllllllllllllIIllIlIIllllIllIlIl);
            return new String(lllllllllllllIIllIlIIllllIllIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIlIIllllIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIlIIllllIllIIll) {
            lllllllllllllIIllIlIIllllIllIIll.printStackTrace();
            return null;
        }
    }
    
    private static void llIIllllIllIIll() {
        (lIIlIlIIIIllll = new int[7])[0] = ((0xAF ^ 0xA5) & ~(0x54 ^ 0x5E));
        FPSMod.lIIlIlIIIIllll[1] = "   ".length();
        FPSMod.lIIlIlIIIIllll[2] = " ".length();
        FPSMod.lIIlIlIIIIllll[3] = -" ".length();
        FPSMod.lIIlIlIIIIllll[4] = "  ".length();
        FPSMod.lIIlIlIIIIllll[5] = (70 + 93 - 159 + 170 ^ 78 + 23 + 43 + 26);
        FPSMod.lIIlIlIIIIllll[6] = (0x72 ^ 0x12 ^ (0xA ^ 0x62));
    }
    
    private static void llIIllllIllIIII() {
        (lIIlIlIIIIllII = new String[FPSMod.lIIlIlIIIIllll[5]])[FPSMod.lIIlIlIIIIllll[0]] = llIIllllIlIllII("U6S87sKaiIs=", "hSfzq");
        FPSMod.lIIlIlIIIIllII[FPSMod.lIIlIlIIIIllll[2]] = llIIllllIlIllII("c1ry4ejy13M6fZTDr1qy/w==", "gLpnF");
        FPSMod.lIIlIlIIIIllII[FPSMod.lIIlIlIIIIllll[4]] = llIIllllIlIllIl("T1KQqUfnOdlHRMg49G67kA==", "tMXzW");
        FPSMod.lIIlIlIIIIllII[FPSMod.lIIlIlIIIIllll[1]] = llIIllllIlIllll("w5RSBzEjw5RWe8OGRlM=", "sfAap");
    }
    
    @Override
    public void renderDummy(final int lllllllllllllIIllIlIIlllllIIIlII, final int lllllllllllllIIllIlIIlllllIIIIII) {
        this.fr.drawStringWithShadow(String.valueOf(new StringBuilder(FPSMod.lIIlIlIIIIllII[FPSMod.lIIlIlIIIIllll[4]]).append(Minecraft.getDebugFPS())), (float)this.getX(), (float)this.getY(), FPSMod.lIIlIlIIIIllll[3]);
        "".length();
        super.renderDummy(lllllllllllllIIllIlIIlllllIIIlII, lllllllllllllIIllIlIIlllllIIIIII);
    }
    
    public FPSMod() {
        super(FPSMod.lIIlIlIIIIllII[FPSMod.lIIlIlIIIIllll[0]], FPSMod.lIIlIlIIIIllll[1], FPSMod.lIIlIlIIIIllll[1]);
    }
    
    static {
        llIIllllIllIIll();
        llIIllllIllIIII();
    }
    
    @Override
    public int getHeight() {
        return this.fr.FONT_HEIGHT;
    }
    
    private static boolean llIIllllIllIlII(final int lllllllllllllIIllIlIIllllIIIIlIl, final int lllllllllllllIIllIlIIllllIIIIlII) {
        return lllllllllllllIIllIlIIllllIIIIlIl < lllllllllllllIIllIlIIllllIIIIlII;
    }
    
    private static String llIIllllIlIllll(String lllllllllllllIIllIlIIllllIIlIlIl, final String lllllllllllllIIllIlIIllllIIlIlII) {
        lllllllllllllIIllIlIIllllIIlIlIl = new String(Base64.getDecoder().decode(lllllllllllllIIllIlIIllllIIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllIlIIllllIIlIIll = new StringBuilder();
        final char[] lllllllllllllIIllIlIIllllIIlIIlI = lllllllllllllIIllIlIIllllIIlIlII.toCharArray();
        int lllllllllllllIIllIlIIllllIIlIIIl = FPSMod.lIIlIlIIIIllll[0];
        final boolean lllllllllllllIIllIlIIllllIIIlIll = (Object)lllllllllllllIIllIlIIllllIIlIlIl.toCharArray();
        final char lllllllllllllIIllIlIIllllIIIlIlI = (char)lllllllllllllIIllIlIIllllIIIlIll.length;
        Exception lllllllllllllIIllIlIIllllIIIlIIl = (Exception)FPSMod.lIIlIlIIIIllll[0];
        while (llIIllllIllIlII((int)lllllllllllllIIllIlIIllllIIIlIIl, lllllllllllllIIllIlIIllllIIIlIlI)) {
            final char lllllllllllllIIllIlIIllllIIlIllI = lllllllllllllIIllIlIIllllIIIlIll[lllllllllllllIIllIlIIllllIIIlIIl];
            lllllllllllllIIllIlIIllllIIlIIll.append((char)(lllllllllllllIIllIlIIllllIIlIllI ^ lllllllllllllIIllIlIIllllIIlIIlI[lllllllllllllIIllIlIIllllIIlIIIl % lllllllllllllIIllIlIIllllIIlIIlI.length]));
            "".length();
            ++lllllllllllllIIllIlIIllllIIlIIIl;
            ++lllllllllllllIIllIlIIllllIIIlIIl;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllIlIIllllIIlIIll);
    }
}
