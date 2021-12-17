// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import java.util.Arrays;
import net.minecraft.client.resources.I18n;
import java.io.IOException;
import net.minecraft.client.gui.achievement.GuiStats;
import net.minecraft.client.gui.achievement.GuiAchievements;
import net.minecraft.realms.RealmsBridge;
import client.ui.MainMenu;
import net.minecraft.client.multiplayer.WorldClient;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class GuiIngameMenu extends GuiScreen
{
    private /* synthetic */ int field_146445_a;
    private static final /* synthetic */ int[] lIlllIllIIlIlI;
    private /* synthetic */ int field_146444_f;
    private static final /* synthetic */ String[] lIlllIlIllllII;
    
    private static String lIIIIIllIIIIlIlI(final String llllllllllllIllllIlllIlIIIllllIl, final String llllllllllllIllllIlllIlIIIlllIlI) {
        try {
            final SecretKeySpec llllllllllllIllllIlllIlIIlIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlllIlIIIlllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIlllIlIIIllllll = Cipher.getInstance("Blowfish");
            llllllllllllIllllIlllIlIIIllllll.init(GuiIngameMenu.lIlllIllIIlIlI[4], llllllllllllIllllIlllIlIIlIIIIII);
            return new String(llllllllllllIllllIlllIlIIIllllll.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlllIlIIIllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIlllIlIIIlllllI) {
            llllllllllllIllllIlllIlIIIlllllI.printStackTrace();
            return null;
        }
    }
    
    private static String lIIIIIllIIIlIlll(String llllllllllllIllllIlllIlIIIlIlIII, final String llllllllllllIllllIlllIlIIIlIllII) {
        llllllllllllIllllIlllIlIIIlIlIII = new String(Base64.getDecoder().decode(llllllllllllIllllIlllIlIIIlIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIlllIlIIIlIlIll = new StringBuilder();
        final char[] llllllllllllIllllIlllIlIIIlIlIlI = llllllllllllIllllIlllIlIIIlIllII.toCharArray();
        int llllllllllllIllllIlllIlIIIlIlIIl = GuiIngameMenu.lIlllIllIIlIlI[0];
        final String llllllllllllIllllIlllIlIIIlIIIll = (Object)llllllllllllIllllIlllIlIIIlIlIII.toCharArray();
        final char llllllllllllIllllIlllIlIIIlIIIlI = (char)llllllllllllIllllIlllIlIIIlIIIll.length;
        float llllllllllllIllllIlllIlIIIlIIIIl = GuiIngameMenu.lIlllIllIIlIlI[0];
        while (lIIIIIllIIllIIII((int)llllllllllllIllllIlllIlIIIlIIIIl, llllllllllllIllllIlllIlIIIlIIIlI)) {
            final char llllllllllllIllllIlllIlIIIlIlllI = llllllllllllIllllIlllIlIIIlIIIll[llllllllllllIllllIlllIlIIIlIIIIl];
            llllllllllllIllllIlllIlIIIlIlIll.append((char)(llllllllllllIllllIlllIlIIIlIlllI ^ llllllllllllIllllIlllIlIIIlIlIlI[llllllllllllIllllIlllIlIIIlIlIIl % llllllllllllIllllIlllIlIIIlIlIlI.length]));
            "".length();
            ++llllllllllllIllllIlllIlIIIlIlIIl;
            ++llllllllllllIllllIlllIlIIIlIIIIl;
            "".length();
            if ((31 + 62 - 53 + 99 ^ 83 + 122 - 147 + 85) < 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIlllIlIIIlIlIll);
    }
    
    private static boolean lIIIIIllIIlIllll(final int llllllllllllIllllIlllIlIIIIllIlI) {
        return llllllllllllIllllIlllIlIIIIllIlI != 0;
    }
    
    private static void lIIIIIllIIIllIIl() {
        (lIlllIlIllllII = new String[GuiIngameMenu.lIlllIllIIlIlI[18]])[GuiIngameMenu.lIlllIllIIlIlI[0]] = lIIIIIllIIIIlIIl("FGEEtPpZG46LJSYdbKScQBf80jOi7VVe", "tNKtM");
        GuiIngameMenu.lIlllIlIllllII[GuiIngameMenu.lIlllIllIIlIlI[3]] = lIIIIIllIIIIlIIl("aQr7Tegf84NFrEU4+uvNbw==", "opDRr");
        GuiIngameMenu.lIlllIlIllllII[GuiIngameMenu.lIlllIllIIlIlI[4]] = lIIIIIllIIIIlIlI("LvvB0a2swkzV/gepvW88noOTIXtPZXjM", "MdAwl");
        GuiIngameMenu.lIlllIlIllllII[GuiIngameMenu.lIlllIllIIlIlI[11]] = lIIIIIllIIIlIlll("OQwNG0w7GRcHDToa", "Ticnb");
        GuiIngameMenu.lIlllIlIllllII[GuiIngameMenu.lIlllIllIIlIlI[6]] = lIIIIIllIIIIlIlI("IPztApmAJel2My0Qhu9t5A==", "MjVei");
        GuiIngameMenu.lIlllIlIllllII[GuiIngameMenu.lIlllIllIIlIlI[13]] = lIIIIIllIIIIlIlI("0u55giPy6ZccjcUnsL17W1MajaXYe6oJ", "PBKZx");
        GuiIngameMenu.lIlllIlIllllII[GuiIngameMenu.lIlllIllIIlIlI[15]] = lIIIIIllIIIlIlll("NxQqSjwkADcX", "PaCdO");
        GuiIngameMenu.lIlllIlIllllII[GuiIngameMenu.lIlllIllIIlIlI[12]] = lIIIIIllIIIlIlll("KCM3I1wiJzQz", "EFYVr");
    }
    
    private static boolean lIIIIIllIIlIlllI(final int llllllllllllIllllIlllIlIIIIllIII) {
        return llllllllllllIllllIlllIlIIIIllIII == 0;
    }
    
    private static boolean lIIIIIllIIllIIII(final int llllllllllllIllllIlllIlIIIIlllIl, final int llllllllllllIllllIlllIlIIIIlllII) {
        return llllllllllllIllllIlllIlIIIIlllIl < llllllllllllIllllIlllIlIIIIlllII;
    }
    
    private static void lIIIIIllIIlIllIl() {
        (lIlllIllIIlIlI = new int[19])[0] = ((0x8C ^ 0xA1 ^ (0x73 ^ 0x67)) & (0x26 ^ 0x42 ^ (0x52 ^ 0xF) ^ -" ".length()));
        GuiIngameMenu.lIlllIllIIlIlI[1] = -(45 + 105 - 37 + 39 ^ 51 + 77 - 121 + 129);
        GuiIngameMenu.lIlllIllIIlIlI[2] = (0x57 ^ 0x71 ^ (0x1A ^ 0x5E));
        GuiIngameMenu.lIlllIllIIlIlI[3] = " ".length();
        GuiIngameMenu.lIlllIllIIlIlI[4] = "  ".length();
        GuiIngameMenu.lIlllIllIIlIlI[5] = (151 + 17 - 120 + 181 ^ 55 + 6 + 28 + 40);
        GuiIngameMenu.lIlllIllIIlIlI[6] = (0xC5 ^ 0xC1);
        GuiIngameMenu.lIlllIllIIlIlI[7] = (0x78 ^ 0x63 ^ (0xF ^ 0x6C));
        GuiIngameMenu.lIlllIllIIlIlI[8] = (0xD ^ 0x15);
        GuiIngameMenu.lIlllIllIIlIlI[9] = (0xF1 ^ 0x91);
        GuiIngameMenu.lIlllIllIIlIlI[10] = (0x5B ^ 0x4A ^ (0x65 ^ 0x60));
        GuiIngameMenu.lIlllIllIIlIlI[11] = "   ".length();
        GuiIngameMenu.lIlllIllIIlIlI[12] = (0xF0 ^ 0x97 ^ (0x6 ^ 0x66));
        GuiIngameMenu.lIlllIllIIlIlI[13] = (99 + 18 - 36 + 66 ^ 95 + 46 - 48 + 57);
        GuiIngameMenu.lIlllIllIIlIlI[14] = (0xB4 ^ 0x84);
        GuiIngameMenu.lIlllIllIIlIlI[15] = (0x8F ^ 0x89);
        GuiIngameMenu.lIlllIllIIlIlI[16] = (0x30 ^ 0x18);
        GuiIngameMenu.lIlllIllIIlIlI[17] = (-1 & 0xFFFFFF);
        GuiIngameMenu.lIlllIllIIlIlI[18] = (0x4B ^ 0x43);
    }
    
    @Override
    protected void actionPerformed(final GuiButton llllllllllllIllllIlllIlIIllIIlII) throws IOException {
        switch (llllllllllllIllllIlllIlIIllIIlII.id) {
            case 0: {
                this.mc.displayGuiScreen(new GuiOptions(this, this.mc.gameSettings));
                "".length();
                if (null != null) {
                    return;
                }
                return;
            }
            case 1: {
                final boolean llllllllllllIllllIlllIlIIllIlIII = this.mc.isIntegratedServerRunning();
                final boolean llllllllllllIllllIlllIlIIllIIlll = this.mc.func_181540_al();
                llllllllllllIllllIlllIlIIllIIlII.enabled = (GuiIngameMenu.lIlllIllIIlIlI[0] != 0);
                this.mc.theWorld.sendQuittingDisconnectingPacket();
                this.mc.loadWorld(null);
                if (lIIIIIllIIlIllll(llllllllllllIllllIlllIlIIllIlIII ? 1 : 0)) {
                    this.mc.displayGuiScreen(new MainMenu());
                    "".length();
                    if (null != null) {
                        return;
                    }
                    return;
                }
                else {
                    if (!lIIIIIllIIlIllll(llllllllllllIllllIlllIlIIllIIlll ? 1 : 0)) {
                        this.mc.displayGuiScreen(new GuiMultiplayer(new MainMenu()));
                        break;
                    }
                    final RealmsBridge llllllllllllIllllIlllIlIIllIIllI = new RealmsBridge();
                    llllllllllllIllllIlllIlIIllIIllI.switchToRealms(new MainMenu());
                    "".length();
                    if ("   ".length() < 0) {
                        return;
                    }
                    return;
                }
                break;
            }
            case 4: {
                this.mc.displayGuiScreen(null);
                this.mc.setIngameFocus();
                "".length();
                if (-" ".length() > 0) {
                    return;
                }
                return;
            }
            case 5: {
                this.mc.displayGuiScreen(new GuiAchievements(this, this.mc.thePlayer.getStatFileWriter()));
                "".length();
                if ((0x82 ^ 0x86) <= 0) {
                    return;
                }
                return;
            }
            case 6: {
                this.mc.displayGuiScreen(new GuiStats(this, this.mc.thePlayer.getStatFileWriter()));
                "".length();
                if (-"   ".length() >= 0) {
                    return;
                }
                return;
            }
            case 7: {
                this.mc.displayGuiScreen(new GuiShareToLan(this));
                return;
            }
        }
        "".length();
        if (((0x6B ^ 0x4A) & ~(0x9D ^ 0xBC)) != 0x0) {
            return;
        }
    }
    
    @Override
    public void updateScreen() {
        super.updateScreen();
        this.field_146444_f += GuiIngameMenu.lIlllIllIIlIlI[3];
    }
    
    @Override
    public void initGui() {
        this.field_146445_a = GuiIngameMenu.lIlllIllIIlIlI[0];
        this.buttonList.clear();
        final int llllllllllllIllllIlllIlIIlllIllI = GuiIngameMenu.lIlllIllIIlIlI[1];
        final int llllllllllllIllllIlllIlIIlllIlIl = GuiIngameMenu.lIlllIllIIlIlI[2];
        this.buttonList.add(new GuiButton(GuiIngameMenu.lIlllIllIIlIlI[3], this.width / GuiIngameMenu.lIlllIllIIlIlI[4] - GuiIngameMenu.lIlllIllIIlIlI[5], this.height / GuiIngameMenu.lIlllIllIIlIlI[6] + GuiIngameMenu.lIlllIllIIlIlI[7] + llllllllllllIllllIlllIlIIlllIllI, I18n.format(GuiIngameMenu.lIlllIlIllllII[GuiIngameMenu.lIlllIllIIlIlI[0]], new Object[GuiIngameMenu.lIlllIllIIlIlI[0]])));
        "".length();
        if (lIIIIIllIIlIlllI(this.mc.isIntegratedServerRunning() ? 1 : 0)) {
            this.buttonList.get(GuiIngameMenu.lIlllIllIIlIlI[0]).displayString = I18n.format(GuiIngameMenu.lIlllIlIllllII[GuiIngameMenu.lIlllIllIIlIlI[3]], new Object[GuiIngameMenu.lIlllIllIIlIlI[0]]);
        }
        this.buttonList.add(new GuiButton(GuiIngameMenu.lIlllIllIIlIlI[6], this.width / GuiIngameMenu.lIlllIllIIlIlI[4] - GuiIngameMenu.lIlllIllIIlIlI[5], this.height / GuiIngameMenu.lIlllIllIIlIlI[6] + GuiIngameMenu.lIlllIllIIlIlI[8] + llllllllllllIllllIlllIlIIlllIllI, I18n.format(GuiIngameMenu.lIlllIlIllllII[GuiIngameMenu.lIlllIllIIlIlI[4]], new Object[GuiIngameMenu.lIlllIllIIlIlI[0]])));
        "".length();
        this.buttonList.add(new GuiButton(GuiIngameMenu.lIlllIllIIlIlI[0], this.width / GuiIngameMenu.lIlllIllIIlIlI[4] - GuiIngameMenu.lIlllIllIIlIlI[5], this.height / GuiIngameMenu.lIlllIllIIlIlI[6] + GuiIngameMenu.lIlllIllIIlIlI[9] + llllllllllllIllllIlllIlIIlllIllI, GuiIngameMenu.lIlllIllIIlIlI[2], GuiIngameMenu.lIlllIllIIlIlI[10], I18n.format(GuiIngameMenu.lIlllIlIllllII[GuiIngameMenu.lIlllIllIIlIlI[11]], new Object[GuiIngameMenu.lIlllIllIIlIlI[0]])));
        "".length();
        final GuiButton llllllllllllIllllIlllIlIIlllIlII;
        this.buttonList.add(llllllllllllIllllIlllIlIIlllIlII = new GuiButton(GuiIngameMenu.lIlllIllIIlIlI[12], this.width / GuiIngameMenu.lIlllIllIIlIlI[4] + GuiIngameMenu.lIlllIllIIlIlI[4], this.height / GuiIngameMenu.lIlllIllIIlIlI[6] + GuiIngameMenu.lIlllIllIIlIlI[9] + llllllllllllIllllIlllIlIIlllIllI, GuiIngameMenu.lIlllIllIIlIlI[2], GuiIngameMenu.lIlllIllIIlIlI[10], I18n.format(GuiIngameMenu.lIlllIlIllllII[GuiIngameMenu.lIlllIllIIlIlI[6]], new Object[GuiIngameMenu.lIlllIllIIlIlI[0]])));
        "".length();
        this.buttonList.add(new GuiButton(GuiIngameMenu.lIlllIllIIlIlI[13], this.width / GuiIngameMenu.lIlllIllIIlIlI[4] - GuiIngameMenu.lIlllIllIIlIlI[5], this.height / GuiIngameMenu.lIlllIllIIlIlI[6] + GuiIngameMenu.lIlllIllIIlIlI[14] + llllllllllllIllllIlllIlIIlllIllI, GuiIngameMenu.lIlllIllIIlIlI[2], GuiIngameMenu.lIlllIllIIlIlI[10], I18n.format(GuiIngameMenu.lIlllIlIllllII[GuiIngameMenu.lIlllIllIIlIlI[13]], new Object[GuiIngameMenu.lIlllIllIIlIlI[0]])));
        "".length();
        this.buttonList.add(new GuiButton(GuiIngameMenu.lIlllIllIIlIlI[15], this.width / GuiIngameMenu.lIlllIllIIlIlI[4] + GuiIngameMenu.lIlllIllIIlIlI[4], this.height / GuiIngameMenu.lIlllIllIIlIlI[6] + GuiIngameMenu.lIlllIllIIlIlI[14] + llllllllllllIllllIlllIlIIlllIllI, GuiIngameMenu.lIlllIllIIlIlI[2], GuiIngameMenu.lIlllIllIIlIlI[10], I18n.format(GuiIngameMenu.lIlllIlIllllII[GuiIngameMenu.lIlllIllIIlIlI[15]], new Object[GuiIngameMenu.lIlllIllIIlIlI[0]])));
        "".length();
        final GuiButton guiButton = llllllllllllIllllIlllIlIIlllIlII;
        int enabled;
        if (lIIIIIllIIlIllll(this.mc.isSingleplayer() ? 1 : 0) && lIIIIIllIIlIlllI(this.mc.getIntegratedServer().getPublic() ? 1 : 0)) {
            enabled = GuiIngameMenu.lIlllIllIIlIlI[3];
            "".length();
            if ((136 + 118 - 183 + 98 ^ 118 + 100 - 145 + 100) == -" ".length()) {
                return;
            }
        }
        else {
            enabled = GuiIngameMenu.lIlllIllIIlIlI[0];
        }
        guiButton.enabled = (enabled != 0);
    }
    
    private static String lIIIIIllIIIIlIIl(final String llllllllllllIllllIlllIlIIlIIlIII, final String llllllllllllIllllIlllIlIIlIIIlll) {
        try {
            final SecretKeySpec llllllllllllIllllIlllIlIIlIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlllIlIIlIIIlll.getBytes(StandardCharsets.UTF_8)), GuiIngameMenu.lIlllIllIIlIlI[18]), "DES");
            final Cipher llllllllllllIllllIlllIlIIlIIllII = Cipher.getInstance("DES");
            llllllllllllIllllIlllIlIIlIIllII.init(GuiIngameMenu.lIlllIllIIlIlI[4], llllllllllllIllllIlllIlIIlIIllIl);
            return new String(llllllllllllIllllIlllIlIIlIIllII.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlllIlIIlIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIlllIlIIlIIlIll) {
            llllllllllllIllllIlllIlIIlIIlIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void drawScreen(final int llllllllllllIllllIlllIlIIlIllIII, final int llllllllllllIllllIlllIlIIlIlIIll, final float llllllllllllIllllIlllIlIIlIlIIlI) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, I18n.format(GuiIngameMenu.lIlllIlIllllII[GuiIngameMenu.lIlllIllIIlIlI[12]], new Object[GuiIngameMenu.lIlllIllIIlIlI[0]]), this.width / GuiIngameMenu.lIlllIllIIlIlI[4], GuiIngameMenu.lIlllIllIIlIlI[16], GuiIngameMenu.lIlllIllIIlIlI[17]);
        super.drawScreen(llllllllllllIllllIlllIlIIlIllIII, llllllllllllIllllIlllIlIIlIlIIll, llllllllllllIllllIlllIlIIlIlIIlI);
    }
    
    static {
        lIIIIIllIIlIllIl();
        lIIIIIllIIIllIIl();
    }
}
