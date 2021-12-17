// 
// Decompiled by Procyon v0.5.36
// 

package client.hud.mod.impl;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.client.Minecraft;
import client.hud.mod.HudMod;

public class ModFOV extends HudMod
{
    private static final /* synthetic */ String[] lllllIlIIlllI;
    private static /* synthetic */ float savedFOV;
    private static final /* synthetic */ int[] lllllIlIlIIII;
    
    public ModFOV() {
        super(ModFOV.lllllIlIIlllI[ModFOV.lllllIlIlIIII[0]], ModFOV.lllllIlIlIIII[1], ModFOV.lllllIlIlIIII[1]);
    }
    
    private static boolean lIlIlllIlIIllll(final int lllllllllllllIlIlIllIllIIIIIIllI) {
        return lllllllllllllIlIlIllIllIIIIIIllI != 0;
    }
    
    private static void lIlIlllIlIIIlll() {
        (lllllIlIIlllI = new String[ModFOV.lllllIlIlIIII[3]])[ModFOV.lllllIlIlIIII[0]] = lIlIlllIlIIIlIl("IhgB", "dWWYz");
        ModFOV.lllllIlIIlllI[ModFOV.lllllIlIlIIII[2]] = lIlIlllIlIIIllI("3rDD9ou7Xv/t0R9EMaGQsg==", "fRxnK");
    }
    
    private static void lIlIlllIlIIlllI() {
        (lllllIlIlIIII = new int[5])[0] = ((77 + 79 + 16 + 58 ^ 128 + 107 - 111 + 41) & (0xA1 ^ 0xA6 ^ (0x3 ^ 0x47) ^ -" ".length()));
        ModFOV.lllllIlIlIIII[1] = (0x60 ^ 0x56 ^ (0x3A ^ 0x33));
        ModFOV.lllllIlIlIIII[2] = " ".length();
        ModFOV.lllllIlIlIIII[3] = "  ".length();
        ModFOV.lllllIlIlIIII[4] = (53 + 41 - 73 + 139 ^ 4 + 44 + 32 + 88);
    }
    
    static {
        lIlIlllIlIIlllI();
        lIlIlllIlIIIlll();
        ModFOV.savedFOV = 0.0f;
    }
    
    @Override
    public int getWidth() {
        return this.fr.getStringWidth(ModFOV.lllllIlIIlllI[ModFOV.lllllIlIlIIII[2]]);
    }
    
    @Override
    public void renderDummy(final int lllllllllllllIlIlIllIllIIIlllIll, final int lllllllllllllIlIlIllIllIIIlllIlI) {
        ModFOV.savedFOV = Minecraft.getMinecraft().gameSettings.fovSetting;
        if (lIlIlllIlIIllll(this.mc.thePlayer.isSprinting() ? 1 : 0)) {
            Minecraft.getMinecraft().gameSettings.fovSetting = ModFOV.savedFOV;
            "".length();
            if ("  ".length() <= ((0xDE ^ 0x8E ^ (0xCC ^ 0xB5)) & (0xCC ^ 0xBA ^ (0xCF ^ 0x90) ^ -" ".length()))) {
                return;
            }
        }
        else if (lIlIlllIlIIllll(this.mc.thePlayer.isPotionActive(ModFOV.lllllIlIlIIII[2]) ? 1 : 0)) {
            Minecraft.getMinecraft().gameSettings.fovSetting = ModFOV.savedFOV;
            "".length();
            if (((0x6A ^ 0x20) & ~(0xEA ^ 0xA0)) > 0) {
                return;
            }
        }
        else if (lIlIlllIlIIllll(this.mc.thePlayer.capabilities.isFlying ? 1 : 0)) {
            Minecraft.getMinecraft().gameSettings.fovSetting = ModFOV.savedFOV;
        }
        super.renderDummy(lllllllllllllIlIlIllIllIIIlllIll, lllllllllllllIlIlIllIllIIIlllIlI);
    }
    
    @Override
    public void draw() {
        ModFOV.savedFOV = Minecraft.getMinecraft().gameSettings.fovSetting;
        if (lIlIlllIlIIllll(this.mc.thePlayer.isSprinting() ? 1 : 0)) {
            Minecraft.getMinecraft().gameSettings.fovSetting = ModFOV.savedFOV;
            "".length();
            if (null != null) {
                return;
            }
        }
        else if (lIlIlllIlIIllll(this.mc.thePlayer.isPotionActive(ModFOV.lllllIlIlIIII[2]) ? 1 : 0)) {
            Minecraft.getMinecraft().gameSettings.fovSetting = ModFOV.savedFOV;
            "".length();
            if (null != null) {
                return;
            }
        }
        else if (lIlIlllIlIIllll(this.mc.thePlayer.capabilities.isFlying ? 1 : 0)) {
            Minecraft.getMinecraft().gameSettings.fovSetting = ModFOV.savedFOV;
        }
        super.draw();
    }
    
    private static String lIlIlllIlIIIlIl(String lllllllllllllIlIlIllIllIIIIlIlII, final String lllllllllllllIlIlIllIllIIIIlIIll) {
        lllllllllllllIlIlIllIllIIIIlIlII = new String(Base64.getDecoder().decode(lllllllllllllIlIlIllIllIIIIlIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlIllIllIIIIlIlll = new StringBuilder();
        final char[] lllllllllllllIlIlIllIllIIIIlIllI = lllllllllllllIlIlIllIllIIIIlIIll.toCharArray();
        int lllllllllllllIlIlIllIllIIIIlIlIl = ModFOV.lllllIlIlIIII[0];
        final long lllllllllllllIlIlIllIllIIIIIllll = (Object)lllllllllllllIlIlIllIllIIIIlIlII.toCharArray();
        final int lllllllllllllIlIlIllIllIIIIIlllI = lllllllllllllIlIlIllIllIIIIIllll.length;
        byte lllllllllllllIlIlIllIllIIIIIllIl = (byte)ModFOV.lllllIlIlIIII[0];
        while (lIlIlllIlIlIIII(lllllllllllllIlIlIllIllIIIIIllIl, lllllllllllllIlIlIllIllIIIIIlllI)) {
            final char lllllllllllllIlIlIllIllIIIIllIlI = lllllllllllllIlIlIllIllIIIIIllll[lllllllllllllIlIlIllIllIIIIIllIl];
            lllllllllllllIlIlIllIllIIIIlIlll.append((char)(lllllllllllllIlIlIllIllIIIIllIlI ^ lllllllllllllIlIlIllIllIIIIlIllI[lllllllllllllIlIlIllIllIIIIlIlIl % lllllllllllllIlIlIllIllIIIIlIllI.length]));
            "".length();
            ++lllllllllllllIlIlIllIllIIIIlIlIl;
            ++lllllllllllllIlIlIllIllIIIIIllIl;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlIllIllIIIIlIlll);
    }
    
    private static boolean lIlIlllIlIlIIII(final int lllllllllllllIlIlIllIllIIIIIlIIl, final int lllllllllllllIlIlIllIllIIIIIlIII) {
        return lllllllllllllIlIlIllIllIIIIIlIIl < lllllllllllllIlIlIllIllIIIIIlIII;
    }
    
    private static String lIlIlllIlIIIllI(final String lllllllllllllIlIlIllIllIIIlIlIIl, final String lllllllllllllIlIlIllIllIIIlIlIII) {
        try {
            final SecretKeySpec lllllllllllllIlIlIllIllIIIlIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIllIllIIIlIlIII.getBytes(StandardCharsets.UTF_8)), ModFOV.lllllIlIlIIII[4]), "DES");
            final Cipher lllllllllllllIlIlIllIllIIIlIlIll = Cipher.getInstance("DES");
            lllllllllllllIlIlIllIllIIIlIlIll.init(ModFOV.lllllIlIlIIII[3], lllllllllllllIlIlIllIllIIIlIllII);
            return new String(lllllllllllllIlIlIllIllIIIlIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIllIllIIIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIllIllIIIlIlIlI) {
            lllllllllllllIlIlIllIllIIIlIlIlI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public int getHeight() {
        return this.fr.FONT_HEIGHT;
    }
}
