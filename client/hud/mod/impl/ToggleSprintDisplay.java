// 
// Decompiled by Procyon v0.5.36
// 

package client.hud.mod.impl;

import java.util.Arrays;
import net.minecraft.client.Minecraft;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import client.hud.mod.HudMod;

public class ToggleSprintDisplay extends HudMod
{
    private static final /* synthetic */ int[] lIlIllIlIllIll;
    private static final /* synthetic */ String[] lIlIllIlIllIIl;
    
    @Override
    public void draw() {
        if (llllIIIllllIIIl(this.mc.thePlayer.isSprinting() ? 1 : 0)) {
            this.fr.drawStringWithShadow(ToggleSprintDisplay.lIlIllIlIllIIl[ToggleSprintDisplay.lIlIllIlIllIll[3]], (float)this.getX(), (float)this.getY(), ToggleSprintDisplay.lIlIllIlIllIll[4]);
            "".length();
        }
        super.draw();
    }
    
    @Override
    public int getHeight() {
        return this.fr.FONT_HEIGHT + ToggleSprintDisplay.lIlIllIlIllIll[3];
    }
    
    @Override
    public void renderDummy(final int lllllllllllllIIIIllIlIIlllIIIIll, final int lllllllllllllIIIIllIlIIlllIIIlIl) {
        this.fr.drawStringWithShadow(ToggleSprintDisplay.lIlIllIlIllIIl[ToggleSprintDisplay.lIlIllIlIllIll[1]], (float)this.getX(), (float)this.getY(), ToggleSprintDisplay.lIlIllIlIllIll[4]);
        "".length();
        super.renderDummy(lllllllllllllIIIIllIlIIlllIIIIll, lllllllllllllIIIIllIlIIlllIIIlIl);
    }
    
    private static void llllIIIllllIIII() {
        (lIlIllIlIllIll = new int[9])[0] = ((0x5E ^ 0x4F) & ~(0x3E ^ 0x2F));
        ToggleSprintDisplay.lIlIllIlIllIll[1] = "  ".length();
        ToggleSprintDisplay.lIlIllIlIllIll[2] = (0x7A ^ 0x58) + (0xF6 ^ 0xA5) - (0x1B ^ 0x1C) + (0x49 ^ 0x50);
        ToggleSprintDisplay.lIlIllIlIllIll[3] = " ".length();
        ToggleSprintDisplay.lIlIllIlIllIll[4] = -" ".length();
        ToggleSprintDisplay.lIlIllIlIllIll[5] = "   ".length();
        ToggleSprintDisplay.lIlIllIlIllIll[6] = (0xAA ^ 0xB9 ^ (0x8 ^ 0x1F));
        ToggleSprintDisplay.lIlIllIlIllIll[7] = (141 + 123 - 95 + 19 ^ 94 + 38 - 104 + 157);
        ToggleSprintDisplay.lIlIllIlIllIll[8] = (0x26 ^ 0x2E);
    }
    
    private static void llllIIIlllIllIl() {
        (lIlIllIlIllIIl = new String[ToggleSprintDisplay.lIlIllIlIllIll[7]])[ToggleSprintDisplay.lIlIllIlIllIll[0]] = llllIIIlllIlIll("r1N/j1R0iiLQwcC5NtS/6g==", "UoPVT");
        ToggleSprintDisplay.lIlIllIlIllIIl[ToggleSprintDisplay.lIlIllIlIllIll[3]] = llllIIIlllIllII("pX+mCqIH61HDc5ol5q8Z2llJSmODBF+xILZsGEl7yZA=", "lcBrQ");
        ToggleSprintDisplay.lIlIllIlIllIIl[ToggleSprintDisplay.lIlIllIlIllIll[1]] = llllIIIlllIllII("3gGT6512TtrbFruX8BMjPA==", "wjhkG");
        ToggleSprintDisplay.lIlIllIlIllIIl[ToggleSprintDisplay.lIlIllIlIllIll[5]] = llllIIIlllIlIll("5PwnKMz10urHqJqLJTfvFVCeRBFK5lY74/CLna7aqOg=", "GyANZ");
        ToggleSprintDisplay.lIlIllIlIllIIl[ToggleSprintDisplay.lIlIllIlIllIll[6]] = llllIIIlllIlIll("6bT8TzNprV7sDW2G8WtYfg==", "gIGtK");
    }
    
    private static String llllIIIlllIlIll(final String lllllllllllllIIIIllIlIIllIlIIlIl, final String lllllllllllllIIIIllIlIIllIlIIlII) {
        try {
            final SecretKeySpec lllllllllllllIIIIllIlIIllIlIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIllIlIIllIlIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIllIlIIllIlIlIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIllIlIIllIlIlIIl.init(ToggleSprintDisplay.lIlIllIlIllIll[1], lllllllllllllIIIIllIlIIllIlIlIlI);
            return new String(lllllllllllllIIIIllIlIIllIlIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIllIlIIllIlIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIllIlIIllIlIlIII) {
            lllllllllllllIIIIllIlIIllIlIlIII.printStackTrace();
            return null;
        }
    }
    
    static {
        llllIIIllllIIII();
        llllIIIlllIllIl();
    }
    
    @Override
    public int getWidth() {
        if (llllIIIllllIIIl(Minecraft.isGuiEnabled() ? 1 : 0)) {
            return this.fr.getStringWidth(ToggleSprintDisplay.lIlIllIlIllIIl[ToggleSprintDisplay.lIlIllIlIllIll[5]]) + ToggleSprintDisplay.lIlIllIlIllIll[3];
        }
        return this.fr.getStringWidth(ToggleSprintDisplay.lIlIllIlIllIIl[ToggleSprintDisplay.lIlIllIlIllIll[6]]) + ToggleSprintDisplay.lIlIllIlIllIll[3];
    }
    
    private static boolean llllIIIllllIIIl(final int lllllllllllllIIIIllIlIIllIlIIIII) {
        return lllllllllllllIIIIllIlIIllIlIIIII != 0;
    }
    
    public ToggleSprintDisplay() {
        super(ToggleSprintDisplay.lIlIllIlIllIIl[ToggleSprintDisplay.lIlIllIlIllIll[0]], ToggleSprintDisplay.lIlIllIlIllIll[1], ToggleSprintDisplay.lIlIllIlIllIll[2]);
    }
    
    private static String llllIIIlllIllII(final String lllllllllllllIIIIllIlIIllIllIIlI, final String lllllllllllllIIIIllIlIIllIllIIIl) {
        try {
            final SecretKeySpec lllllllllllllIIIIllIlIIllIllIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIllIlIIllIllIIIl.getBytes(StandardCharsets.UTF_8)), ToggleSprintDisplay.lIlIllIlIllIll[8]), "DES");
            final Cipher lllllllllllllIIIIllIlIIllIllIllI = Cipher.getInstance("DES");
            lllllllllllllIIIIllIlIIllIllIllI.init(ToggleSprintDisplay.lIlIllIlIllIll[1], lllllllllllllIIIIllIlIIllIllIlll);
            return new String(lllllllllllllIIIIllIlIIllIllIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIllIlIIllIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIllIlIIllIllIlIl) {
            lllllllllllllIIIIllIlIIllIllIlIl.printStackTrace();
            return null;
        }
    }
}
