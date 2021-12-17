// 
// Decompiled by Procyon v0.5.36
// 

package client.ui;

import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.io.IOException;
import client.ui.clickgui.ClickGUI;
import net.minecraft.client.gui.GuiLanguage;
import net.minecraft.client.gui.GuiOptions;
import net.minecraft.client.gui.GuiMultiplayer;
import net.minecraft.client.gui.GuiSelectWorld;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.gui.Gui;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiScreen;

public class MainMenu extends GuiScreen
{
    private static final /* synthetic */ String[] lIllIllIllIlII;
    private static final /* synthetic */ int[] lIllIllIllIllI;
    
    @Override
    public void drawScreen(final int llllllllllllIllllllIllIIIlIIIlIl, final int llllllllllllIllllllIllIIIlIIIlII, final float llllllllllllIllllllIllIIIlIIIIll) {
        final ScaledResolution llllllllllllIllllllIllIIIlIIIIlI = new ScaledResolution(this.mc);
        this.mc.getTextureManager().bindTexture(new ResourceLocation(MainMenu.lIllIllIllIlII[MainMenu.lIllIllIllIllI[11]]));
        Gui.drawModalRectWithCustomSizedTexture(MainMenu.lIllIllIllIllI[5], MainMenu.lIllIllIllIllI[5], 0.0f, 0.0f, this.width, this.height, (float)this.width, (float)this.height);
        super.drawScreen(llllllllllllIllllllIllIIIlIIIlIl, llllllllllllIllllllIllIIIlIIIlII, llllllllllllIllllllIllIIIlIIIIll);
        this.mc.fontRendererObj.drawStringWithShadow(MainMenu.lIllIllIllIlII[MainMenu.lIllIllIllIllI[9]], (float)(this.width - this.mc.fontRendererObj.getStringWidth(MainMenu.lIllIllIllIlII[MainMenu.lIllIllIllIllI[12]]) - MainMenu.lIllIllIllIllI[1]), (float)(this.height - this.mc.fontRendererObj.FONT_HEIGHT - MainMenu.lIllIllIllIllI[1]), MainMenu.lIllIllIllIllI[13]);
        "".length();
    }
    
    @Override
    public void initGui() {
        this.buttonList.add(new Buttons(MainMenu.lIllIllIllIllI[0], this.width / MainMenu.lIllIllIllIllI[1] - MainMenu.lIllIllIllIllI[2], this.height / MainMenu.lIllIllIllIllI[1], MainMenu.lIllIllIllIllI[3], MainMenu.lIllIllIllIllI[4], (boolean)(MainMenu.lIllIllIllIllI[0] != 0), I18n.format(MainMenu.lIllIllIllIlII[MainMenu.lIllIllIllIllI[5]], new Object[MainMenu.lIllIllIllIllI[5]])));
        "".length();
        this.buttonList.add(new Buttons(MainMenu.lIllIllIllIllI[1], this.width / MainMenu.lIllIllIllIllI[1] - MainMenu.lIllIllIllIllI[2], this.height / MainMenu.lIllIllIllIllI[1] + MainMenu.lIllIllIllIllI[6], MainMenu.lIllIllIllIllI[3], MainMenu.lIllIllIllIllI[4], (boolean)(MainMenu.lIllIllIllIllI[0] != 0), I18n.format(MainMenu.lIllIllIllIlII[MainMenu.lIllIllIllIllI[0]], new Object[MainMenu.lIllIllIllIllI[5]])));
        "".length();
        this.buttonList.add(new Buttons(MainMenu.lIllIllIllIllI[7], this.width / MainMenu.lIllIllIllIllI[1] - MainMenu.lIllIllIllIllI[2], this.height / MainMenu.lIllIllIllIllI[1] + MainMenu.lIllIllIllIllI[8], MainMenu.lIllIllIllIllI[3], MainMenu.lIllIllIllIllI[4], (boolean)(MainMenu.lIllIllIllIllI[0] != 0), I18n.format(MainMenu.lIllIllIllIlII[MainMenu.lIllIllIllIllI[1]], new Object[MainMenu.lIllIllIllIllI[5]])));
        "".length();
        this.buttonList.add(new Buttons(MainMenu.lIllIllIllIllI[9], this.width - MainMenu.lIllIllIllIllI[10], MainMenu.lIllIllIllIllI[7], MainMenu.lIllIllIllIllI[4], MainMenu.lIllIllIllIllI[4], (boolean)(MainMenu.lIllIllIllIllI[0] != 0), MainMenu.lIllIllIllIlII[MainMenu.lIllIllIllIllI[7]]));
        "".length();
        super.initGui();
    }
    
    @Override
    protected void actionPerformed(final GuiButton llllllllllllIllllllIllIIIIlllIIl) throws IOException {
        switch (llllllllllllIllllllIllIIIIlllIIl.id) {
            case 1: {
                this.mc.displayGuiScreen(new GuiSelectWorld(this));
                "".length();
                if (-" ".length() > " ".length()) {
                    return;
                }
                break;
            }
            case 2: {
                this.mc.displayGuiScreen(new GuiMultiplayer(this));
                "".length();
                if (-" ".length() == "  ".length()) {
                    return;
                }
                break;
            }
            case 3: {
                this.mc.displayGuiScreen(new GuiOptions(this, this.mc.gameSettings));
                "".length();
                if (-"   ".length() > 0) {
                    return;
                }
                break;
            }
            case 4: {
                this.mc.displayGuiScreen(new GuiLanguage(this, this.mc.gameSettings, this.mc.getLanguageManager()));
                "".length();
                if (-"   ".length() >= 0) {
                    return;
                }
                break;
            }
            case 5: {
                this.mc.shutdown();
                "".length();
                if ((84 + 124 - 100 + 24 ^ 10 + 95 - 37 + 60) == -" ".length()) {
                    return;
                }
                break;
            }
            case 6: {
                this.mc.displayGuiScreen(new ClickGUI());
                break;
            }
        }
        super.actionPerformed(llllllllllllIllllllIllIIIIlllIIl);
    }
    
    private static void lllllllllIllIII() {
        (lIllIllIllIlII = new String[MainMenu.lIllIllIllIllI[14]])[MainMenu.lIllIllIllIllI[5]] = lllllllllIlIIlI("IQIUBCMXOxYCNhcZ", "rkzcO");
        MainMenu.lIllIllIllIlII[MainMenu.lIllIllIllIllI[0]] = lllllllllIlIIlI("azw3JiMiIS4rLi4D", "KqBJW");
        MainMenu.lIllIllIllIlII[MainMenu.lIllIllIllIllI[1]] = lllllllllIlIIlI("WnlWFh0OMBk3Hg==", "zYvYm");
        MainMenu.lIllIllIllIlII[MainMenu.lIllIllIllIllI[7]] = lllllllllIlIIll("3AeViMDlWCk=", "qUDvK");
        MainMenu.lIllIllIllIlII[MainMenu.lIllIllIllIllI[11]] = lllllllllIlIIlI("MD0pMCQ4IzsyNSp/JTYoNw8lMi8sfjg5Jg==", "YPHWA");
        MainMenu.lIllIllIllIlII[MainMenu.lIllIllIllIllI[9]] = lllllllllIlIlIl("CNkVrpPDHf79dcGKIO2hufQ5aDJ34egI4NhdOjxNAapgmhbpSgPqNg==", "dzwzi");
        MainMenu.lIllIllIllIlII[MainMenu.lIllIllIllIllI[12]] = lllllllllIlIIlI("Oiw3NysQJC86eTQsLS83HmMGDHdZByhuNxY3ZyowCjc1JzsMNyJv", "yCGNY");
    }
    
    private static boolean lllllllllIllIlI(final int llllllllllllIllllllIllIIIIIIIIlI, final int llllllllllllIllllllIllIIIIIIIIIl) {
        return llllllllllllIllllllIllIIIIIIIIlI < llllllllllllIllllllIllIIIIIIIIIl;
    }
    
    private static String lllllllllIlIlIl(final String llllllllllllIllllllIllIIIIlIllll, final String llllllllllllIllllllIllIIIIlIlllI) {
        try {
            final SecretKeySpec llllllllllllIllllllIllIIIIllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllllIllIIIIlIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllllIllIIIIllIIIl = Cipher.getInstance("Blowfish");
            llllllllllllIllllllIllIIIIllIIIl.init(MainMenu.lIllIllIllIllI[1], llllllllllllIllllllIllIIIIllIIlI);
            return new String(llllllllllllIllllllIllIIIIllIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllllllIllIIIIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllllIllIIIIllIIII) {
            llllllllllllIllllllIllIIIIllIIII.printStackTrace();
            return null;
        }
    }
    
    private static String lllllllllIlIIll(final String llllllllllllIllllllIllIIIIIIlIII, final String llllllllllllIllllllIllIIIIIIIlll) {
        try {
            final SecretKeySpec llllllllllllIllllllIllIIIIIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllllIllIIIIIIIlll.getBytes(StandardCharsets.UTF_8)), MainMenu.lIllIllIllIllI[15]), "DES");
            final Cipher llllllllllllIllllllIllIIIIIIllII = Cipher.getInstance("DES");
            llllllllllllIllllllIllIIIIIIllII.init(MainMenu.lIllIllIllIllI[1], llllllllllllIllllllIllIIIIIIllIl);
            return new String(llllllllllllIllllllIllIIIIIIllII.doFinal(Base64.getDecoder().decode(llllllllllllIllllllIllIIIIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllllIllIIIIIIlIll) {
            llllllllllllIllllllIllIIIIIIlIll.printStackTrace();
            return null;
        }
    }
    
    private static String lllllllllIlIIlI(String llllllllllllIllllllIllIIIIIllIlI, final String llllllllllllIllllllIllIIIIIllllI) {
        llllllllllllIllllllIllIIIIIllIlI = (double)new String(Base64.getDecoder().decode(((String)llllllllllllIllllllIllIIIIIllIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllllIllIIIIIlllIl = new StringBuilder();
        final char[] llllllllllllIllllllIllIIIIIlllII = llllllllllllIllllllIllIIIIIllllI.toCharArray();
        int llllllllllllIllllllIllIIIIIllIll = MainMenu.lIllIllIllIllI[5];
        final int llllllllllllIllllllIllIIIIIlIlIl = (Object)((String)llllllllllllIllllllIllIIIIIllIlI).toCharArray();
        final Exception llllllllllllIllllllIllIIIIIlIlII = (Exception)llllllllllllIllllllIllIIIIIlIlIl.length;
        long llllllllllllIllllllIllIIIIIlIIll = MainMenu.lIllIllIllIllI[5];
        while (lllllllllIllIlI((int)llllllllllllIllllllIllIIIIIlIIll, (int)llllllllllllIllllllIllIIIIIlIlII)) {
            final char llllllllllllIllllllIllIIIIlIIIII = llllllllllllIllllllIllIIIIIlIlIl[llllllllllllIllllllIllIIIIIlIIll];
            llllllllllllIllllllIllIIIIIlllIl.append((char)(llllllllllllIllllllIllIIIIlIIIII ^ llllllllllllIllllllIllIIIIIlllII[llllllllllllIllllllIllIIIIIllIll % llllllllllllIllllllIllIIIIIlllII.length]));
            "".length();
            ++llllllllllllIllllllIllIIIIIllIll;
            ++llllllllllllIllllllIllIIIIIlIIll;
            "".length();
            if (-"   ".length() > 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllllIllIIIIIlllIl);
    }
    
    private static void lllllllllIllIIl() {
        (lIllIllIllIllI = new int[16])[0] = " ".length();
        MainMenu.lIllIllIllIllI[1] = "  ".length();
        MainMenu.lIllIllIllIllI[2] = (0x3E ^ 0x75);
        MainMenu.lIllIllIllIllI[3] = (0x55 ^ 0x40) + (0x83 ^ 0xAE) - (0x87 ^ 0xA8) + (76 + 38 + 1 + 16);
        MainMenu.lIllIllIllIllI[4] = (0xB1 ^ 0xA5);
        MainMenu.lIllIllIllIllI[5] = ((0xE9 ^ 0xC5) & ~(0x30 ^ 0x1C));
        MainMenu.lIllIllIllIllI[6] = (0x4A ^ 0x5C);
        MainMenu.lIllIllIllIllI[7] = "   ".length();
        MainMenu.lIllIllIllIllI[8] = (0xF3 ^ 0x89 ^ (0x20 ^ 0x76));
        MainMenu.lIllIllIllIllI[9] = (0x96 ^ 0x93);
        MainMenu.lIllIllIllIllI[10] = (0x36 ^ 0x21);
        MainMenu.lIllIllIllIllI[11] = (0x29 ^ 0x2D);
        MainMenu.lIllIllIllIllI[12] = (0x67 ^ 0x19 ^ (0xD2 ^ 0xAA));
        MainMenu.lIllIllIllIllI[13] = -" ".length();
        MainMenu.lIllIllIllIllI[14] = (0x14 ^ 0x13);
        MainMenu.lIllIllIllIllI[15] = (9 + 81 - 50 + 94 ^ 140 + 16 - 50 + 36);
    }
    
    static {
        lllllllllIllIIl();
        lllllllllIllIII();
    }
}
