// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import net.minecraft.client.Minecraft;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.io.IOException;
import java.util.List;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.KeyBinding;

public class GuiControls extends GuiScreen
{
    private /* synthetic */ GuiKeyBindingList keyBindingList;
    private /* synthetic */ GuiScreen parentScreen;
    public /* synthetic */ long time;
    public /* synthetic */ KeyBinding buttonId;
    private /* synthetic */ GuiButton buttonReset;
    private static final /* synthetic */ int[] lIIlIllllllIll;
    private static final /* synthetic */ String[] lIIlIlllIIllll;
    protected /* synthetic */ String screenTitle;
    private static final /* synthetic */ GameSettings.Options[] optionsArr;
    private /* synthetic */ GameSettings options;
    
    private static boolean llIlIlIIllIIIIl(final int lllllllllllllIIlIllIllIllIlllIll) {
        return lllllllllllllIIlIllIllIllIlllIll != 0;
    }
    
    private static boolean llIlIlIIllIIlII(final int lllllllllllllIIlIllIllIlllIIIIII, final int lllllllllllllIIlIllIllIllIllllll) {
        return lllllllllllllIIlIllIllIlllIIIIII < lllllllllllllIIlIllIllIllIllllll;
    }
    
    private static boolean llIlIlIIllIIIll(final int lllllllllllllIIlIllIllIlllIIlIII, final int lllllllllllllIIlIllIllIlllIIIlll) {
        return lllllllllllllIIlIllIllIlllIIlIII == lllllllllllllIIlIllIllIlllIIIlll;
    }
    
    @Override
    public void initGui() {
        this.keyBindingList = new GuiKeyBindingList(this, this.mc);
        this.buttonList.add(new GuiButton(GuiControls.lIIlIllllllIll[4], this.width / GuiControls.lIIlIllllllIll[3] - GuiControls.lIIlIllllllIll[5], this.height - GuiControls.lIIlIllllllIll[6], GuiControls.lIIlIllllllIll[7], GuiControls.lIIlIllllllIll[8], I18n.format(GuiControls.lIIlIlllIIllll[GuiControls.lIIlIllllllIll[2]], new Object[GuiControls.lIIlIllllllIll[1]])));
        "".length();
        final List<GuiButton> buttonList = this.buttonList;
        final GuiButton buttonReset = new GuiButton(GuiControls.lIIlIllllllIll[9], this.width / GuiControls.lIIlIllllllIll[3] - GuiControls.lIIlIllllllIll[5] + GuiControls.lIIlIllllllIll[10], this.height - GuiControls.lIIlIllllllIll[6], GuiControls.lIIlIllllllIll[7], GuiControls.lIIlIllllllIll[8], I18n.format(GuiControls.lIIlIlllIIllll[GuiControls.lIIlIllllllIll[3]], new Object[GuiControls.lIIlIllllllIll[1]]));
        this.buttonReset = buttonReset;
        buttonList.add(buttonReset);
        "".length();
        this.screenTitle = I18n.format(GuiControls.lIIlIlllIIllll[GuiControls.lIIlIllllllIll[0]], new Object[GuiControls.lIIlIllllllIll[1]]);
        int lllllllllllllIIlIllIlllIIlIIllll = GuiControls.lIIlIllllllIll[1];
        final float lllllllllllllIIlIllIlllIIlIIlIII;
        final String lllllllllllllIIlIllIlllIIlIIlIIl = (String)((GameSettings.Options[])(Object)(lllllllllllllIIlIllIlllIIlIIlIII = (float)(Object)GuiControls.optionsArr)).length;
        short lllllllllllllIIlIllIlllIIlIIlIlI = (short)GuiControls.lIIlIllllllIll[1];
        "".length();
        if (-" ".length() >= ((0x12 ^ 0x46 ^ (0x14 ^ 0x64)) & (0 + 166 - 3 + 28 ^ 86 + 52 - 91 + 108 ^ -" ".length()))) {
            return;
        }
        while (!llIlIlIIllIIIlI(lllllllllllllIIlIllIlllIIlIIlIlI, (int)lllllllllllllIIlIllIlllIIlIIlIIl)) {
            final GameSettings.Options lllllllllllllIIlIllIlllIIlIIlllI = lllllllllllllIIlIllIlllIIlIIlIII[lllllllllllllIIlIllIlllIIlIIlIlI];
            if (llIlIlIIllIIIIl(lllllllllllllIIlIllIlllIIlIIlllI.getEnumFloat() ? 1 : 0)) {
                this.buttonList.add(new GuiOptionSlider(lllllllllllllIIlIllIlllIIlIIlllI.returnEnumOrdinal(), this.width / GuiControls.lIIlIllllllIll[3] - GuiControls.lIIlIllllllIll[5] + lllllllllllllIIlIllIlllIIlIIllll % GuiControls.lIIlIllllllIll[3] * GuiControls.lIIlIllllllIll[10], GuiControls.lIIlIllllllIll[11] + GuiControls.lIIlIllllllIll[12] * (lllllllllllllIIlIllIlllIIlIIllll >> GuiControls.lIIlIllllllIll[2]), lllllllllllllIIlIllIlllIIlIIlllI));
                "".length();
                "".length();
                if (((0x4D ^ 0x8) & ~(0x18 ^ 0x5D)) > "   ".length()) {
                    return;
                }
            }
            else {
                this.buttonList.add(new GuiOptionButton(lllllllllllllIIlIllIlllIIlIIlllI.returnEnumOrdinal(), this.width / GuiControls.lIIlIllllllIll[3] - GuiControls.lIIlIllllllIll[5] + lllllllllllllIIlIllIlllIIlIIllll % GuiControls.lIIlIllllllIll[3] * GuiControls.lIIlIllllllIll[10], GuiControls.lIIlIllllllIll[11] + GuiControls.lIIlIllllllIll[12] * (lllllllllllllIIlIllIlllIIlIIllll >> GuiControls.lIIlIllllllIll[2]), lllllllllllllIIlIllIlllIIlIIlllI, this.options.getKeyBinding(lllllllllllllIIlIllIlllIIlIIlllI)));
                "".length();
            }
            ++lllllllllllllIIlIllIlllIIlIIllll;
            ++lllllllllllllIIlIllIlllIIlIIlIlI;
        }
    }
    
    @Override
    protected void mouseClicked(final int lllllllllllllIIlIllIlllIIIlIllII, final int lllllllllllllIIlIllIlllIIIlIllll, final int lllllllllllllIIlIllIlllIIIlIlllI) throws IOException {
        if (llIlIlIIllIIlIl(this.buttonId)) {
            this.options.setOptionKeyBinding(this.buttonId, GuiControls.lIIlIllllllIll[14] + lllllllllllllIIlIllIlllIIIlIlllI);
            this.buttonId = null;
            KeyBinding.resetKeyBindingArrayAndHash();
            "".length();
            if (-" ".length() >= "  ".length()) {
                return;
            }
        }
        else if (!llIlIlIIllIIllI(lllllllllllllIIlIllIlllIIIlIlllI) || llIlIlIIllIIllI(this.keyBindingList.mouseClicked(lllllllllllllIIlIllIlllIIIlIllII, lllllllllllllIIlIllIlllIIIlIllll, lllllllllllllIIlIllIlllIIIlIlllI) ? 1 : 0)) {
            super.mouseClicked(lllllllllllllIIlIllIlllIIIlIllII, lllllllllllllIIlIllIlllIIIlIllll, lllllllllllllIIlIllIlllIIIlIlllI);
        }
    }
    
    static {
        llIlIlIIllIIIII();
        llIlIIllllllIlI();
        final GameSettings.Options[] optionsArr2 = new GameSettings.Options[GuiControls.lIIlIllllllIll[0]];
        optionsArr2[GuiControls.lIIlIllllllIll[1]] = GameSettings.Options.INVERT_MOUSE;
        optionsArr2[GuiControls.lIIlIllllllIll[2]] = GameSettings.Options.SENSITIVITY;
        optionsArr2[GuiControls.lIIlIllllllIll[3]] = GameSettings.Options.TOUCHSCREEN;
        optionsArr = optionsArr2;
    }
    
    private static String llIlIIlllllIlll(final String lllllllllllllIIlIllIllIlllIlllIl, final String lllllllllllllIIlIllIllIlllIllIlI) {
        try {
            final SecretKeySpec lllllllllllllIIlIllIllIllllIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIllIllIlllIllIlI.getBytes(StandardCharsets.UTF_8)), GuiControls.lIIlIllllllIll[16]), "DES");
            final Cipher lllllllllllllIIlIllIllIlllIlllll = Cipher.getInstance("DES");
            lllllllllllllIIlIllIllIlllIlllll.init(GuiControls.lIIlIllllllIll[3], lllllllllllllIIlIllIllIllllIIIII);
            return new String(lllllllllllllIIlIllIllIlllIlllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIllIllIlllIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIllIllIlllIllllI) {
            lllllllllllllIIlIllIllIlllIllllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIlIlIIllIIllI(final int lllllllllllllIIlIllIllIllIlllIIl) {
        return lllllllllllllIIlIllIllIllIlllIIl == 0;
    }
    
    @Override
    protected void actionPerformed(final GuiButton lllllllllllllIIlIllIlllIIIlllIlI) throws IOException {
        if (llIlIlIIllIIIll(lllllllllllllIIlIllIlllIIIlllIlI.id, GuiControls.lIIlIllllllIll[4])) {
            this.mc.displayGuiScreen(this.parentScreen);
            "".length();
            if (((0x84 ^ 0x94) & ~(0x9D ^ 0x8D)) == " ".length()) {
                return;
            }
        }
        else if (llIlIlIIllIIIll(lllllllllllllIIlIllIlllIIIlllIlI.id, GuiControls.lIIlIllllllIll[9])) {
            final Exception lllllllllllllIIlIllIlllIIIllIllI;
            final short lllllllllllllIIlIllIlllIIIllIlll = (short)((KeyBinding[])(Object)(lllllllllllllIIlIllIlllIIIllIllI = (Exception)(Object)this.mc.gameSettings.keyBindings)).length;
            String lllllllllllllIIlIllIlllIIIlllIII = (String)GuiControls.lIIlIllllllIll[1];
            "".length();
            if (" ".length() == "  ".length()) {
                return;
            }
            while (!llIlIlIIllIIIlI((int)lllllllllllllIIlIllIlllIIIlllIII, lllllllllllllIIlIllIlllIIIllIlll)) {
                final KeyBinding lllllllllllllIIlIllIlllIIIllllII = lllllllllllllIIlIllIlllIIIllIllI[lllllllllllllIIlIllIlllIIIlllIII];
                lllllllllllllIIlIllIlllIIIllllII.setKeyCode(lllllllllllllIIlIllIlllIIIllllII.getKeyCodeDefault());
                ++lllllllllllllIIlIllIlllIIIlllIII;
            }
            KeyBinding.resetKeyBindingArrayAndHash();
            "".length();
            if ((0xA7 ^ 0xA3) != (0x1D ^ 0x19)) {
                return;
            }
        }
        else if (llIlIlIIllIIlII(lllllllllllllIIlIllIlllIIIlllIlI.id, GuiControls.lIIlIllllllIll[13]) && llIlIlIIllIIIIl((lllllllllllllIIlIllIlllIIIlllIlI instanceof GuiOptionButton) ? 1 : 0)) {
            this.options.setOptionValue(((GuiOptionButton)lllllllllllllIIlIllIlllIIIlllIlI).returnEnumOptions(), GuiControls.lIIlIllllllIll[2]);
            lllllllllllllIIlIllIlllIIIlllIlI.displayString = this.options.getKeyBinding(GameSettings.Options.getEnumOptions(lllllllllllllIIlIllIlllIIIlllIlI.id));
        }
    }
    
    private static boolean llIlIlIIllIIlIl(final Object lllllllllllllIIlIllIllIllIllllIl) {
        return lllllllllllllIIlIllIllIllIllllIl != null;
    }
    
    @Override
    public void handleMouseInput() throws IOException {
        super.handleMouseInput();
        this.keyBindingList.handleMouseInput();
    }
    
    private static String llIlIIllllllIII(String lllllllllllllIIlIllIllIllllIllIl, final String lllllllllllllIIlIllIllIllllIllII) {
        lllllllllllllIIlIllIllIllllIllIl = new String(Base64.getDecoder().decode(lllllllllllllIIlIllIllIllllIllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIllIllIlllllIIII = new StringBuilder();
        final char[] lllllllllllllIIlIllIllIllllIllll = lllllllllllllIIlIllIllIllllIllII.toCharArray();
        int lllllllllllllIIlIllIllIllllIlllI = GuiControls.lIIlIllllllIll[1];
        final short lllllllllllllIIlIllIllIllllIlIII = (Object)lllllllllllllIIlIllIllIllllIllIl.toCharArray();
        final boolean lllllllllllllIIlIllIllIllllIIlll = lllllllllllllIIlIllIllIllllIlIII.length != 0;
        double lllllllllllllIIlIllIllIllllIIllI = GuiControls.lIIlIllllllIll[1];
        while (llIlIlIIllIIlII((int)lllllllllllllIIlIllIllIllllIIllI, lllllllllllllIIlIllIllIllllIIlll ? 1 : 0)) {
            final char lllllllllllllIIlIllIllIlllllIIll = lllllllllllllIIlIllIllIllllIlIII[lllllllllllllIIlIllIllIllllIIllI];
            lllllllllllllIIlIllIllIlllllIIII.append((char)(lllllllllllllIIlIllIllIlllllIIll ^ lllllllllllllIIlIllIllIllllIllll[lllllllllllllIIlIllIllIllllIlllI % lllllllllllllIIlIllIllIllllIllll.length]));
            "".length();
            ++lllllllllllllIIlIllIllIllllIlllI;
            ++lllllllllllllIIlIllIllIllllIIllI;
            "".length();
            if (((0x9E ^ 0xBE) & ~(0x1B ^ 0x3B)) != 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIllIllIlllllIIII);
    }
    
    private static String llIlIIllllllIIl(final String lllllllllllllIIlIllIllIlllIlIIII, final String lllllllllllllIIlIllIllIlllIIllIl) {
        try {
            final SecretKeySpec lllllllllllllIIlIllIllIlllIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIllIllIlllIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIllIllIlllIlIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIllIllIlllIlIIlI.init(GuiControls.lIIlIllllllIll[3], lllllllllllllIIlIllIllIlllIlIIll);
            return new String(lllllllllllllIIlIllIllIlllIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIllIllIlllIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIllIllIlllIlIIIl) {
            lllllllllllllIIlIllIllIlllIlIIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIlIlIIllIlIII(final int lllllllllllllIIlIllIllIllIllIlII, final int lllllllllllllIIlIllIllIllIllIIll) {
        return lllllllllllllIIlIllIllIllIllIlII != lllllllllllllIIlIllIllIllIllIIll;
    }
    
    @Override
    protected void keyTyped(final char lllllllllllllIIlIllIlllIIIIllIIl, final int lllllllllllllIIlIllIlllIIIIllIII) throws IOException {
        if (llIlIlIIllIIlIl(this.buttonId)) {
            if (llIlIlIIllIIIll(lllllllllllllIIlIllIlllIIIIllIII, GuiControls.lIIlIllllllIll[2])) {
                this.options.setOptionKeyBinding(this.buttonId, GuiControls.lIIlIllllllIll[1]);
                "".length();
                if (-" ".length() >= 0) {
                    return;
                }
            }
            else if (llIlIlIIllIIIIl(lllllllllllllIIlIllIlllIIIIllIII)) {
                this.options.setOptionKeyBinding(this.buttonId, lllllllllllllIIlIllIlllIIIIllIII);
                "".length();
                if ("  ".length() == 0) {
                    return;
                }
            }
            else if (llIlIlIIllIIlll(lllllllllllllIIlIllIlllIIIIllIIl)) {
                this.options.setOptionKeyBinding(this.buttonId, lllllllllllllIIlIllIlllIIIIllIIl + GuiControls.lIIlIllllllIll[15]);
            }
            this.buttonId = null;
            this.time = Minecraft.getSystemTime();
            KeyBinding.resetKeyBindingArrayAndHash();
            "".length();
            if (-" ".length() > "  ".length()) {
                return;
            }
        }
        else {
            super.keyTyped(lllllllllllllIIlIllIlllIIIIllIIl, lllllllllllllIIlIllIlllIIIIllIII);
        }
    }
    
    private static void llIlIlIIllIIIII() {
        (lIIlIllllllIll = new int[19])[0] = "   ".length();
        GuiControls.lIIlIllllllIll[1] = ((0x5C ^ 0xD ^ (0x51 ^ 0x1D)) & (0x7F ^ 0x1A ^ (0xE9 ^ 0x91) ^ -" ".length()));
        GuiControls.lIIlIllllllIll[2] = " ".length();
        GuiControls.lIIlIllllllIll[3] = "  ".length();
        GuiControls.lIIlIllllllIll[4] = 177 + 153 - 176 + 46;
        GuiControls.lIIlIllllllIll[5] = (0x7D ^ 0x2C) + (118 + 87 - 192 + 130) - (66 + 56 - 105 + 116) + (0x76 ^ 0x36);
        GuiControls.lIIlIllllllIll[6] = (0x7E ^ 0x41 ^ (0x86 ^ 0xA4));
        GuiControls.lIIlIllllllIll[7] = (0x79 ^ 0x3C) + (0xC0 ^ 0x9A) - (0xD1 ^ 0xA0) + (0x1F ^ 0x77);
        GuiControls.lIIlIllllllIll[8] = (0xB3 ^ 0x92 ^ (0x1C ^ 0x29));
        GuiControls.lIIlIllllllIll[9] = 57 + 133 - 172 + 133 + (28 + 121 - 43 + 60) - (43 + 138 - 16 + 39) + (0x2C ^ 0x74);
        GuiControls.lIIlIllllllIll[10] = (0xEB ^ 0x9E) + (0xF9 ^ 0xA5) - (84 + 35 - 8 + 32) + (0x15 ^ 0x4B);
        GuiControls.lIIlIllllllIll[11] = (18 + 50 - 50 + 110 ^ 138 + 142 - 273 + 139);
        GuiControls.lIIlIllllllIll[12] = (147 + 26 - 39 + 14 ^ 109 + 57 - 144 + 118);
        GuiControls.lIIlIllllllIll[13] = (126 + 92 - 15 + 7 ^ 178 + 44 - 145 + 105);
        GuiControls.lIIlIllllllIll[14] = -(211 + 27 - 185 + 170 ^ 166 + 22 - 5 + 4);
        GuiControls.lIIlIllllllIll[15] = (-(0xFFFFBBFD & 0x7E3B) & (0xFFFFBBBA & 0x7F7D));
        GuiControls.lIIlIllllllIll[16] = (21 + 94 - 114 + 168 ^ 89 + 123 - 145 + 94);
        GuiControls.lIIlIllllllIll[17] = (-" ".length() & (-1 & 0xFFFFFF));
        GuiControls.lIIlIllllllIll[18] = (0xF1 ^ 0xAC ^ (0x99 ^ 0xC0));
    }
    
    private static void llIlIIllllllIlI() {
        (lIIlIlllIIllll = new String[GuiControls.lIIlIllllllIll[18]])[GuiControls.lIIlIllllllIll[1]] = llIlIIlllllIlll("Wg+73q0AgJrxfIKSTeLffg==", "WqYVz");
        GuiControls.lIIlIlllIIllll[GuiControls.lIIlIllllllIll[2]] = llIlIIllllllIII("Eho7TDAaATc=", "uoRbT");
        GuiControls.lIIlIlllIIllll[GuiControls.lIIlIllllllIll[3]] = llIlIIllllllIIl("Q3JTdX1ict2r3GpzLHf1Q+kvUaVrDEGf", "tOOAT");
        GuiControls.lIIlIlllIIllll[GuiControls.lIIlIllllllIll[0]] = llIlIIllllllIII("Cz4hMT0HPTxrOwElIyA=", "hQOEO");
    }
    
    @Override
    public void drawScreen(final int lllllllllllllIIlIllIlllIIIIIlIlI, final int lllllllllllllIIlIllIlllIIIIIlIIl, final float lllllllllllllIIlIllIlllIIIIIlIII) {
        this.drawDefaultBackground();
        this.keyBindingList.drawScreen(lllllllllllllIIlIllIlllIIIIIlIlI, lllllllllllllIIlIllIlllIIIIIlIIl, lllllllllllllIIlIllIlllIIIIIlIII);
        this.drawCenteredString(this.fontRendererObj, this.screenTitle, this.width / GuiControls.lIIlIllllllIll[3], GuiControls.lIIlIllllllIll[16], GuiControls.lIIlIllllllIll[17]);
        boolean lllllllllllllIIlIllIlllIIIIIIlll = GuiControls.lIIlIllllllIll[2] != 0;
        final float lllllllllllllIIlIllIllIlllllllIl;
        final String lllllllllllllIIlIllIllIllllllllI = (String)((KeyBinding[])(Object)(lllllllllllllIIlIllIllIlllllllIl = (float)(Object)this.options.keyBindings)).length;
        char lllllllllllllIIlIllIllIlllllllll = (char)GuiControls.lIIlIllllllIll[1];
        "".length();
        if ("   ".length() < 0) {
            return;
        }
        while (!llIlIlIIllIIIlI(lllllllllllllIIlIllIllIlllllllll, (int)lllllllllllllIIlIllIllIllllllllI)) {
            final KeyBinding lllllllllllllIIlIllIlllIIIIIIllI = lllllllllllllIIlIllIllIlllllllIl[lllllllllllllIIlIllIllIlllllllll];
            if (llIlIlIIllIlIII(lllllllllllllIIlIllIlllIIIIIIllI.getKeyCode(), lllllllllllllIIlIllIlllIIIIIIllI.getKeyCodeDefault())) {
                lllllllllllllIIlIllIlllIIIIIIlll = (GuiControls.lIIlIllllllIll[1] != 0);
                "".length();
                if ((0xB7 ^ 0xB2) <= 0) {
                    return;
                }
                break;
            }
            else {
                ++lllllllllllllIIlIllIllIlllllllll;
            }
        }
        final GuiButton buttonReset = this.buttonReset;
        int enabled;
        if (llIlIlIIllIIIIl(lllllllllllllIIlIllIlllIIIIIIlll ? 1 : 0)) {
            enabled = GuiControls.lIIlIllllllIll[1];
            "".length();
            if ((0x1A ^ 0x1E) <= 0) {
                return;
            }
        }
        else {
            enabled = GuiControls.lIIlIllllllIll[2];
        }
        buttonReset.enabled = (enabled != 0);
        super.drawScreen(lllllllllllllIIlIllIlllIIIIIlIlI, lllllllllllllIIlIllIlllIIIIIlIIl, lllllllllllllIIlIllIlllIIIIIlIII);
    }
    
    public GuiControls(final GuiScreen lllllllllllllIIlIllIlllIIlIllIII, final GameSettings lllllllllllllIIlIllIlllIIlIllIlI) {
        this.screenTitle = GuiControls.lIIlIlllIIllll[GuiControls.lIIlIllllllIll[1]];
        this.buttonId = null;
        this.parentScreen = lllllllllllllIIlIllIlllIIlIllIII;
        this.options = lllllllllllllIIlIllIlllIIlIllIlI;
    }
    
    private static boolean llIlIlIIllIIIlI(final int lllllllllllllIIlIllIllIlllIIIlII, final int lllllllllllllIIlIllIllIlllIIIIll) {
        return lllllllllllllIIlIllIllIlllIIIlII >= lllllllllllllIIlIllIllIlllIIIIll;
    }
    
    private static boolean llIlIlIIllIIlll(final int lllllllllllllIIlIllIllIllIllIlll) {
        return lllllllllllllIIlIllIllIllIllIlll > 0;
    }
    
    @Override
    protected void mouseReleased(final int lllllllllllllIIlIllIlllIIIlIIIII, final int lllllllllllllIIlIllIlllIIIlIIIll, final int lllllllllllllIIlIllIlllIIIlIIIlI) {
        if (!llIlIlIIllIIllI(lllllllllllllIIlIllIlllIIIlIIIlI) || llIlIlIIllIIllI(this.keyBindingList.mouseReleased(lllllllllllllIIlIllIlllIIIlIIIII, lllllllllllllIIlIllIlllIIIlIIIll, lllllllllllllIIlIllIlllIIIlIIIlI) ? 1 : 0)) {
            super.mouseReleased(lllllllllllllIIlIllIlllIIIlIIIII, lllllllllllllIIlIllIlllIIIlIIIll, lllllllllllllIIlIllIlllIIIlIIIlI);
        }
    }
}
