// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import java.io.IOException;
import net.minecraft.client.resources.I18n;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.entity.player.EnumPlayerModelParts;

public class GuiCustomizeSkin extends GuiScreen
{
    private static final /* synthetic */ int[] lIIlIIlIIlIIII;
    private /* synthetic */ String title;
    private final /* synthetic */ GuiScreen parentScreen;
    private static final /* synthetic */ String[] lIIlIIlIIIllll;
    
    private static void llIIllIIIIlllIl() {
        (lIIlIIlIIIllll = new String[GuiCustomizeSkin.lIIlIIlIIlIIII[14]])[GuiCustomizeSkin.lIIlIIlIIlIIII[0]] = llIIllIIIIllIlI("Ee5ra41D12O1nBo4AfKp5lfAcGcC+ZRiCdVNv1bqSPg=", "QiWDl");
        GuiCustomizeSkin.lIIlIIlIIIllll[GuiCustomizeSkin.lIIlIIlIIlIIII[6]] = llIIllIIIIllIlI("shKVEAsHPv+dbPZKdqQLgw==", "bZaGB");
        GuiCustomizeSkin.lIIlIIlIIIllll[GuiCustomizeSkin.lIIlIIlIIlIIII[1]] = llIIllIIIIllIll("PRkMGxk8GlYdGA==", "Rixrv");
        GuiCustomizeSkin.lIIlIIlIIIllll[GuiCustomizeSkin.lIIlIIlIIlIIII[12]] = llIIllIIIIllIlI("s7xP/N6SMAxyOe4DxY6inA==", "FuyPI");
        GuiCustomizeSkin.lIIlIIlIIIllll[GuiCustomizeSkin.lIIlIIlIIlIIII[13]] = llIIllIIIIlllII("sHr2R8ACvPc=", "XDlIl");
    }
    
    private static boolean llIIllIIIlIIIIl(final int lllllllllllllIIlllIIIIlIIIlIIIlI) {
        return lllllllllllllIIlllIIIIlIIIlIIIlI != 0;
    }
    
    private static String llIIllIIIIlllII(final String lllllllllllllIIlllIIIIlIIIllIlIl, final String lllllllllllllIIlllIIIIlIIIllIIlI) {
        try {
            final SecretKeySpec lllllllllllllIIlllIIIIlIIIlllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIIIIlIIIllIIlI.getBytes(StandardCharsets.UTF_8)), GuiCustomizeSkin.lIIlIIlIIlIIII[15]), "DES");
            final Cipher lllllllllllllIIlllIIIIlIIIllIlll = Cipher.getInstance("DES");
            lllllllllllllIIlllIIIIlIIIllIlll.init(GuiCustomizeSkin.lIIlIIlIIlIIII[1], lllllllllllllIIlllIIIIlIIIlllIII);
            return new String(lllllllllllllIIlllIIIIlIIIllIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIIIIlIIIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllIIIIlIIIllIllI) {
            lllllllllllllIIlllIIIIlIIIllIllI.printStackTrace();
            return null;
        }
    }
    
    public GuiCustomizeSkin(final GuiScreen lllllllllllllIIlllIIIIlIlIIlIlII) {
        this.parentScreen = lllllllllllllIIlllIIIIlIlIIlIlII;
    }
    
    private static boolean llIIllIIIlIIIlI(final int lllllllllllllIIlllIIIIlIIIlIIlIl, final int lllllllllllllIIlllIIIIlIIIlIIlII) {
        return lllllllllllllIIlllIIIIlIIIlIIlIl < lllllllllllllIIlllIIIIlIIIlIIlII;
    }
    
    private static String llIIllIIIIllIll(String lllllllllllllIIlllIIIIlIIlIlIIlI, final String lllllllllllllIIlllIIIIlIIlIlIllI) {
        lllllllllllllIIlllIIIIlIIlIlIIlI = new String(Base64.getDecoder().decode(lllllllllllllIIlllIIIIlIIlIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlllIIIIlIIlIlIlIl = new StringBuilder();
        final char[] lllllllllllllIIlllIIIIlIIlIlIlII = lllllllllllllIIlllIIIIlIIlIlIllI.toCharArray();
        int lllllllllllllIIlllIIIIlIIlIlIIll = GuiCustomizeSkin.lIIlIIlIIlIIII[0];
        final boolean lllllllllllllIIlllIIIIlIIlIIllIl = (Object)lllllllllllllIIlllIIIIlIIlIlIIlI.toCharArray();
        final int lllllllllllllIIlllIIIIlIIlIIllII = lllllllllllllIIlllIIIIlIIlIIllIl.length;
        Exception lllllllllllllIIlllIIIIlIIlIIlIll = (Exception)GuiCustomizeSkin.lIIlIIlIIlIIII[0];
        while (llIIllIIIlIIIlI((int)lllllllllllllIIlllIIIIlIIlIIlIll, lllllllllllllIIlllIIIIlIIlIIllII)) {
            final char lllllllllllllIIlllIIIIlIIlIllIII = lllllllllllllIIlllIIIIlIIlIIllIl[lllllllllllllIIlllIIIIlIIlIIlIll];
            lllllllllllllIIlllIIIIlIIlIlIlIl.append((char)(lllllllllllllIIlllIIIIlIIlIllIII ^ lllllllllllllIIlllIIIIlIIlIlIlII[lllllllllllllIIlllIIIIlIIlIlIIll % lllllllllllllIIlllIIIIlIIlIlIlII.length]));
            "".length();
            ++lllllllllllllIIlllIIIIlIIlIlIIll;
            ++lllllllllllllIIlllIIIIlIIlIIlIll;
            "".length();
            if ("  ".length() == ((0x76 ^ 0x4B ^ (0xCD ^ 0xC7)) & (0xEB ^ 0x8C ^ (0x6B ^ 0x3B) ^ -" ".length()))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlllIIIIlIIlIlIlIl);
    }
    
    static {
        llIIllIIIIllllI();
        llIIllIIIIlllIl();
    }
    
    @Override
    public void initGui() {
        int lllllllllllllIIlllIIIIlIlIIIllII = GuiCustomizeSkin.lIIlIIlIIlIIII[0];
        this.title = I18n.format(GuiCustomizeSkin.lIIlIIlIIIllll[GuiCustomizeSkin.lIIlIIlIIlIIII[0]], new Object[GuiCustomizeSkin.lIIlIIlIIlIIII[0]]);
        final float lllllllllllllIIlllIIIIlIlIIIIlIl;
        final boolean lllllllllllllIIlllIIIIlIlIIIIllI = ((EnumPlayerModelParts[])(Object)(lllllllllllllIIlllIIIIlIlIIIIlIl = (float)(Object)EnumPlayerModelParts.values())).length != 0;
        float lllllllllllllIIlllIIIIlIlIIIIlll = GuiCustomizeSkin.lIIlIIlIIlIIII[0];
        "".length();
        if (-"  ".length() > 0) {
            return;
        }
        while (!llIIllIIIIlllll((int)lllllllllllllIIlllIIIIlIlIIIIlll, lllllllllllllIIlllIIIIlIlIIIIllI ? 1 : 0)) {
            final EnumPlayerModelParts lllllllllllllIIlllIIIIlIlIIIlIll = lllllllllllllIIlllIIIIlIlIIIIlIl[lllllllllllllIIlllIIIIlIlIIIIlll];
            this.buttonList.add(new ButtonPart(lllllllllllllIIlllIIIIlIlIIIlIll.getPartId(), this.width / GuiCustomizeSkin.lIIlIIlIIlIIII[1] - GuiCustomizeSkin.lIIlIIlIIlIIII[2] + lllllllllllllIIlllIIIIlIlIIIllII % GuiCustomizeSkin.lIIlIIlIIlIIII[1] * GuiCustomizeSkin.lIIlIIlIIlIIII[3], this.height / GuiCustomizeSkin.lIIlIIlIIlIIII[4] + GuiCustomizeSkin.lIIlIIlIIlIIII[5] * (lllllllllllllIIlllIIIIlIlIIIllII >> GuiCustomizeSkin.lIIlIIlIIlIIII[6]), GuiCustomizeSkin.lIIlIIlIIlIIII[7], GuiCustomizeSkin.lIIlIIlIIlIIII[8], lllllllllllllIIlllIIIIlIlIIIlIll, (ButtonPart)null));
            "".length();
            ++lllllllllllllIIlllIIIIlIlIIIllII;
            ++lllllllllllllIIlllIIIIlIlIIIIlll;
        }
        if (llIIllIIIlIIIII(lllllllllllllIIlllIIIIlIlIIIllII % GuiCustomizeSkin.lIIlIIlIIlIIII[1], GuiCustomizeSkin.lIIlIIlIIlIIII[6])) {
            ++lllllllllllllIIlllIIIIlIlIIIllII;
        }
        this.buttonList.add(new GuiButton(GuiCustomizeSkin.lIIlIIlIIlIIII[9], this.width / GuiCustomizeSkin.lIIlIIlIIlIIII[1] - GuiCustomizeSkin.lIIlIIlIIlIIII[10], this.height / GuiCustomizeSkin.lIIlIIlIIlIIII[4] + GuiCustomizeSkin.lIIlIIlIIlIIII[5] * (lllllllllllllIIlllIIIIlIlIIIllII >> GuiCustomizeSkin.lIIlIIlIIlIIII[6]), I18n.format(GuiCustomizeSkin.lIIlIIlIIIllll[GuiCustomizeSkin.lIIlIIlIIlIIII[6]], new Object[GuiCustomizeSkin.lIIlIIlIIlIIII[0]])));
        "".length();
    }
    
    @Override
    public void drawScreen(final int lllllllllllllIIlllIIIIlIIlllIllI, final int lllllllllllllIIlllIIIIlIIlllIIIl, final float lllllllllllllIIlllIIIIlIIlllIIII) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, this.title, this.width / GuiCustomizeSkin.lIIlIIlIIlIIII[1], GuiCustomizeSkin.lIIlIIlIIlIIII[8], GuiCustomizeSkin.lIIlIIlIIlIIII[11]);
        super.drawScreen(lllllllllllllIIlllIIIIlIIlllIllI, lllllllllllllIIlllIIIIlIIlllIIIl, lllllllllllllIIlllIIIIlIIlllIIII);
    }
    
    private static void llIIllIIIIllllI() {
        (lIIlIIlIIlIIII = new int[16])[0] = ((0xCA ^ 0x99) & ~(0x31 ^ 0x62));
        GuiCustomizeSkin.lIIlIIlIIlIIII[1] = "  ".length();
        GuiCustomizeSkin.lIIlIIlIIlIIII[2] = 16 + 19 + 98 + 22;
        GuiCustomizeSkin.lIIlIIlIIlIIII[3] = 95 + 121 - 203 + 146 + (0x32 ^ 0x14) - (0xB8 ^ 0xC0) + (0x44 ^ 0x17);
        GuiCustomizeSkin.lIIlIIlIIlIIII[4] = (0x9A ^ 0x9C);
        GuiCustomizeSkin.lIIlIIlIIlIIII[5] = (0x25 ^ 0x3D);
        GuiCustomizeSkin.lIIlIIlIIlIIII[6] = " ".length();
        GuiCustomizeSkin.lIIlIIlIIlIIII[7] = (0x5 ^ 0x22) + (0x33 ^ 0x10) - -(0xCE ^ 0xC4) + (0x74 ^ 0x36);
        GuiCustomizeSkin.lIIlIIlIIlIIII[8] = (0x7F ^ 0x48 ^ (0x5A ^ 0x79));
        GuiCustomizeSkin.lIIlIIlIIlIIII[9] = (0x93 ^ 0xBA) + (65 + 8 - 9 + 117) - (54 + 25 - 72 + 138) + (0x20 ^ 0x5B);
        GuiCustomizeSkin.lIIlIIlIIlIIII[10] = (0x59 ^ 0x4B ^ (0x63 ^ 0x15));
        GuiCustomizeSkin.lIIlIIlIIlIIII[11] = (-1 & 0xFFFFFF);
        GuiCustomizeSkin.lIIlIIlIIlIIII[12] = "   ".length();
        GuiCustomizeSkin.lIIlIIlIIlIIII[13] = (0x37 ^ 0x63 ^ (0xD9 ^ 0x89));
        GuiCustomizeSkin.lIIlIIlIIlIIII[14] = (0xC6 ^ 0xC3);
        GuiCustomizeSkin.lIIlIIlIIlIIII[15] = (0xAF ^ 0xA7);
    }
    
    private static boolean llIIllIIIIlllll(final int lllllllllllllIIlllIIIIlIIIlIlIIl, final int lllllllllllllIIlllIIIIlIIIlIlIII) {
        return lllllllllllllIIlllIIIIlIIIlIlIIl >= lllllllllllllIIlllIIIIlIIIlIlIII;
    }
    
    private static String llIIllIIIIllIlI(final String lllllllllllllIIlllIIIIlIIlIIIIII, final String lllllllllllllIIlllIIIIlIIlIIIIIl) {
        try {
            final SecretKeySpec lllllllllllllIIlllIIIIlIIlIIIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIIIIlIIlIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlllIIIIlIIlIIIlII = Cipher.getInstance("Blowfish");
            lllllllllllllIIlllIIIIlIIlIIIlII.init(GuiCustomizeSkin.lIIlIIlIIlIIII[1], lllllllllllllIIlllIIIIlIIlIIIlIl);
            return new String(lllllllllllllIIlllIIIIlIIlIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIIIIlIIlIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllIIIIlIIlIIIIll) {
            lllllllllllllIIlllIIIIlIIlIIIIll.printStackTrace();
            return null;
        }
    }
    
    private String func_175358_a(final EnumPlayerModelParts lllllllllllllIIlllIIIIlIIllIlIll) {
        String lllllllllllllIIlllIIIIlIIllIlIIl = null;
        if (llIIllIIIlIIIIl(this.mc.gameSettings.getModelParts().contains(lllllllllllllIIlllIIIIlIIllIlIll) ? 1 : 0)) {
            final String lllllllllllllIIlllIIIIlIIllIlIlI = I18n.format(GuiCustomizeSkin.lIIlIIlIIIllll[GuiCustomizeSkin.lIIlIIlIIlIIII[1]], new Object[GuiCustomizeSkin.lIIlIIlIIlIIII[0]]);
            "".length();
            if (((0x4E ^ 0x45) & ~(0x9A ^ 0x91)) != 0x0) {
                return null;
            }
        }
        else {
            lllllllllllllIIlllIIIIlIIllIlIIl = I18n.format(GuiCustomizeSkin.lIIlIIlIIIllll[GuiCustomizeSkin.lIIlIIlIIlIIII[12]], new Object[GuiCustomizeSkin.lIIlIIlIIlIIII[0]]);
        }
        return String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIIlllIIIIlIIllIlIll.func_179326_d().getFormattedText())).append(GuiCustomizeSkin.lIIlIIlIIIllll[GuiCustomizeSkin.lIIlIIlIIlIIII[13]]).append(lllllllllllllIIlllIIIIlIIllIlIIl));
    }
    
    @Override
    protected void actionPerformed(final GuiButton lllllllllllllIIlllIIIIlIlIIIIIII) throws IOException {
        if (llIIllIIIlIIIIl(lllllllllllllIIlllIIIIlIlIIIIIII.enabled ? 1 : 0)) {
            if (llIIllIIIlIIIII(lllllllllllllIIlllIIIIlIlIIIIIII.id, GuiCustomizeSkin.lIIlIIlIIlIIII[9])) {
                this.mc.gameSettings.saveOptions();
                this.mc.displayGuiScreen(this.parentScreen);
                "".length();
                if (null != null) {
                    return;
                }
            }
            else if (llIIllIIIlIIIIl((lllllllllllllIIlllIIIIlIlIIIIIII instanceof ButtonPart) ? 1 : 0)) {
                final EnumPlayerModelParts lllllllllllllIIlllIIIIlIIlllllll = ((ButtonPart)lllllllllllllIIlllIIIIlIlIIIIIII).playerModelParts;
                this.mc.gameSettings.switchModelPartEnabled(lllllllllllllIIlllIIIIlIIlllllll);
                lllllllllllllIIlllIIIIlIlIIIIIII.displayString = this.func_175358_a(lllllllllllllIIlllIIIIlIIlllllll);
            }
        }
    }
    
    private static boolean llIIllIIIlIIIII(final int lllllllllllllIIlllIIIIlIIIlIllIl, final int lllllllllllllIIlllIIIIlIIIlIllII) {
        return lllllllllllllIIlllIIIIlIIIlIllIl == lllllllllllllIIlllIIIIlIIIlIllII;
    }
    
    class ButtonPart extends GuiButton
    {
        private final /* synthetic */ EnumPlayerModelParts playerModelParts;
        
        private ButtonPart(final int lllllllllllllIIIIIlIIllIIIllIIII, final int lllllllllllllIIIIIlIIllIIIlIllll, final int lllllllllllllIIIIIlIIllIIIlIIllI, final int lllllllllllllIIIIIlIIllIIIlIllIl, final int lllllllllllllIIIIIlIIllIIIlIllII, final EnumPlayerModelParts lllllllllllllIIIIIlIIllIIIlIIIll) {
            super(lllllllllllllIIIIIlIIllIIIllIIII, lllllllllllllIIIIIlIIllIIIlIllll, lllllllllllllIIIIIlIIllIIIlIIllI, lllllllllllllIIIIIlIIllIIIlIllIl, lllllllllllllIIIIIlIIllIIIlIllII, GuiCustomizeSkin.this.func_175358_a(lllllllllllllIIIIIlIIllIIIlIIIll));
            this.playerModelParts = lllllllllllllIIIIIlIIllIIIlIIIll;
        }
    }
}
