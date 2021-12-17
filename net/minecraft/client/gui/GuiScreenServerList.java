// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.lwjgl.input.Keyboard;
import java.io.IOException;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.multiplayer.ServerData;

public class GuiScreenServerList extends GuiScreen
{
    private final /* synthetic */ ServerData field_146301_f;
    private static final /* synthetic */ int[] lIllIIIIlIIIlI;
    private static final /* synthetic */ String[] lIllIIIIlIIIIl;
    private final /* synthetic */ GuiScreen field_146303_a;
    private /* synthetic */ GuiTextField field_146302_g;
    
    private static boolean llllIllIIlIllll(final int lllllllllllllIIIIlIIIlIIIlIIIlIl, final int lllllllllllllIIIIlIIIlIIIlIIIlII) {
        return lllllllllllllIIIIlIIIlIIIlIIIlIl != lllllllllllllIIIIlIIIlIIIlIIIlII;
    }
    
    private static void llllIllIIlIlIIl() {
        (lIllIIIIlIIIIl = new String[GuiScreenServerList.lIllIIIIlIIIlI[18]])[GuiScreenServerList.lIllIIIIlIIIlI[1]] = llllIllIIlIIllI("2I5Ptyc/T5zXXynLcElJ7BwsQapx4Xe5", "bgcbr");
        GuiScreenServerList.lIllIIIIlIIIIl[GuiScreenServerList.lIllIIIIlIIIlI[0]] = llllIllIIlIIlll("FAUBfDMSHgs3PA==", "sphRP");
        GuiScreenServerList.lIllIIIIlIIIIl[GuiScreenServerList.lIllIIIIlIIIlI[2]] = llllIllIIlIlIII("INs2U1EOcMc=", "DwgBw");
        GuiScreenServerList.lIllIIIIlIIIIl[GuiScreenServerList.lIllIIIIlIIIlI[12]] = llllIllIIlIIlll("aA==", "RAcof");
        GuiScreenServerList.lIllIIIIlIIIIl[GuiScreenServerList.lIllIIIIlIIIlI[4]] = llllIllIIlIIllI("QT/zXOH9fw/r9GBlHAyAIc5wdJt2u9zu", "xvKyh");
        GuiScreenServerList.lIllIIIIlIIIIl[GuiScreenServerList.lIllIIIIlIIIlI[16]] = llllIllIIlIIllI("QW5LlxHFGUx/SFV15rHD9ZDKu4eXa43k", "vWxIa");
    }
    
    private static boolean llllIllIIllIIII(final int lllllllllllllIIIIlIIIlIIIlIIllll, final int lllllllllllllIIIIlIIIlIIIlIIlllI) {
        return lllllllllllllIIIIlIIIlIIIlIIllll < lllllllllllllIIIIlIIIlIIIlIIlllI;
    }
    
    @Override
    public void drawScreen(final int lllllllllllllIIIIlIIIlIIlIIIlllI, final int lllllllllllllIIIIlIIIlIIlIIIlIIl, final float lllllllllllllIIIIlIIIlIIlIIIllII) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, I18n.format(GuiScreenServerList.lIllIIIIlIIIIl[GuiScreenServerList.lIllIIIIlIIIlI[4]], new Object[GuiScreenServerList.lIllIIIIlIIIlI[1]]), this.width / GuiScreenServerList.lIllIIIIlIIIlI[2], GuiScreenServerList.lIllIIIIlIIIlI[10], GuiScreenServerList.lIllIIIIlIIIlI[15]);
        this.drawString(this.fontRendererObj, I18n.format(GuiScreenServerList.lIllIIIIlIIIIl[GuiScreenServerList.lIllIIIIlIIIlI[16]], new Object[GuiScreenServerList.lIllIIIIlIIIlI[1]]), this.width / GuiScreenServerList.lIllIIIIlIIIlI[2] - GuiScreenServerList.lIllIIIIlIIIlI[3], GuiScreenServerList.lIllIIIIlIIIlI[3], GuiScreenServerList.lIllIIIIlIIIlI[17]);
        this.field_146302_g.drawTextBox();
        super.drawScreen(lllllllllllllIIIIlIIIlIIlIIIlllI, lllllllllllllIIIIlIIIlIIlIIIlIIl, lllllllllllllIIIIlIIIlIIlIIIllII);
    }
    
    @Override
    protected void keyTyped(final char lllllllllllllIIIIlIIIlIIlIlIIIIl, final int lllllllllllllIIIIlIIIlIIlIlIIIll) throws IOException {
        if (llllIllIIlIllII(this.field_146302_g.textboxKeyTyped(lllllllllllllIIIIlIIIlIIlIlIIIIl, lllllllllllllIIIIlIIIlIIlIlIIIll) ? 1 : 0)) {
            final GuiButton guiButton = this.buttonList.get(GuiScreenServerList.lIllIIIIlIIIlI[1]);
            int enabled;
            if (llllIllIIlIlIll(this.field_146302_g.getText().length()) && llllIllIIlIlIll(this.field_146302_g.getText().split(GuiScreenServerList.lIllIIIIlIIIIl[GuiScreenServerList.lIllIIIIlIIIlI[12]]).length)) {
                enabled = GuiScreenServerList.lIllIIIIlIIIlI[0];
                "".length();
                if (((0x58 ^ 0x41) & ~(0x3A ^ 0x23)) != ((0xC2 ^ 0x9E) & ~(0x14 ^ 0x48))) {
                    return;
                }
            }
            else {
                enabled = GuiScreenServerList.lIllIIIIlIIIlI[1];
            }
            guiButton.enabled = (enabled != 0);
            "".length();
            if (-"  ".length() > 0) {
                return;
            }
        }
        else if (!llllIllIIlIllll(lllllllllllllIIIIlIIIlIIlIlIIIll, GuiScreenServerList.lIllIIIIlIIIlI[13]) || llllIllIIlIllIl(lllllllllllllIIIIlIIIlIIlIlIIIll, GuiScreenServerList.lIllIIIIlIIIlI[14])) {
            this.actionPerformed(this.buttonList.get(GuiScreenServerList.lIllIIIIlIIIlI[1]));
        }
    }
    
    private static boolean llllIllIIlIlllI(final int lllllllllllllIIIIlIIIlIIIlIIlIlI) {
        return lllllllllllllIIIIlIIIlIIIlIIlIlI == 0;
    }
    
    private static boolean llllIllIIlIllIl(final int lllllllllllllIIIIlIIIlIIIlIlIIll, final int lllllllllllllIIIIlIIIlIIIlIlIIlI) {
        return lllllllllllllIIIIlIIIlIIIlIlIIll == lllllllllllllIIIIlIIIlIIIlIlIIlI;
    }
    
    private static boolean llllIllIIlIllII(final int lllllllllllllIIIIlIIIlIIIlIIllII) {
        return lllllllllllllIIIIlIIIlIIIlIIllII != 0;
    }
    
    private static void llllIllIIlIlIlI() {
        (lIllIIIIlIIIlI = new int[20])[0] = " ".length();
        GuiScreenServerList.lIllIIIIlIIIlI[1] = ((0x7B ^ 0x6E ^ (0x72 ^ 0x44)) & (0x44 ^ 0x35 ^ (0x74 ^ 0x26) ^ -" ".length()));
        GuiScreenServerList.lIllIIIIlIIIlI[2] = "  ".length();
        GuiScreenServerList.lIllIIIIlIIIlI[3] = (0x1 ^ 0x53 ^ (0xA9 ^ 0x9F));
        GuiScreenServerList.lIllIIIIlIIIlI[4] = (0x46 ^ 0x1D ^ (0xEB ^ 0xB4));
        GuiScreenServerList.lIllIIIIlIIIlI[5] = (0x6D ^ 0x57 ^ (0xE1 ^ 0xBB));
        GuiScreenServerList.lIllIIIIlIIIlI[6] = (59 + 96 - 64 + 80 ^ 17 + 98 - 62 + 114);
        GuiScreenServerList.lIllIIIIlIIIlI[7] = (0xB ^ 0x73);
        GuiScreenServerList.lIllIIIIlIIIlI[8] = (98 + 176 - 124 + 96 ^ 6 + 90 + 31 + 3);
        GuiScreenServerList.lIllIIIIlIIIlI[9] = 113 + 112 - 172 + 93 + (0x6B ^ 0x32) - (87 + 120 - 157 + 146) + (107 + 157 - 112 + 9);
        GuiScreenServerList.lIllIIIIlIIIlI[10] = (0x33 ^ 0x27);
        GuiScreenServerList.lIllIIIIlIIIlI[11] = 85 + 34 + 2 + 7;
        GuiScreenServerList.lIllIIIIlIIIlI[12] = "   ".length();
        GuiScreenServerList.lIllIIIIlIIIlI[13] = (0xAF ^ 0xB3);
        GuiScreenServerList.lIllIIIIlIIIlI[14] = 36 + 44 - 37 + 113;
        GuiScreenServerList.lIllIIIIlIIIlI[15] = (-" ".length() & (-1 & 0xFFFFFF));
        GuiScreenServerList.lIllIIIIlIIIlI[16] = (0xF ^ 0xA);
        GuiScreenServerList.lIllIIIIlIIIlI[17] = (-(0xFFFFBA73 & 0x57DF) & (0xFFFFF2F6 & 0xA0BFFB));
        GuiScreenServerList.lIllIIIIlIIIlI[18] = (0x9F ^ 0x99);
        GuiScreenServerList.lIllIIIIlIIIlI[19] = (0x46 ^ 0x8 ^ (0x78 ^ 0x3E));
    }
    
    static {
        llllIllIIlIlIlI();
        llllIllIIlIlIIl();
    }
    
    @Override
    public void onGuiClosed() {
        Keyboard.enableRepeatEvents((boolean)(GuiScreenServerList.lIllIIIIlIIIlI[1] != 0));
        this.mc.gameSettings.lastServer = this.field_146302_g.getText();
        this.mc.gameSettings.saveOptions();
    }
    
    private static String llllIllIIlIIllI(final String lllllllllllllIIIIlIIIlIIIlIllIIl, final String lllllllllllllIIIIlIIIlIIIlIllIlI) {
        try {
            final SecretKeySpec lllllllllllllIIIIlIIIlIIIlIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIIIlIIIlIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIlIIIlIIIlIlllIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIlIIIlIIIlIlllIl.init(GuiScreenServerList.lIllIIIIlIIIlI[2], lllllllllllllIIIIlIIIlIIIlIllllI);
            return new String(lllllllllllllIIIIlIIIlIIIlIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIIIlIIIlIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlIIIlIIIlIlllII) {
            lllllllllllllIIIIlIIIlIIIlIlllII.printStackTrace();
            return null;
        }
    }
    
    public GuiScreenServerList(final GuiScreen lllllllllllllIIIIlIIIlIIlIllllII, final ServerData lllllllllllllIIIIlIIIlIIlIlllIII) {
        this.field_146303_a = lllllllllllllIIIIlIIIlIIlIllllII;
        this.field_146301_f = lllllllllllllIIIIlIIIlIIlIlllIII;
    }
    
    private static boolean llllIllIIlIlIll(final int lllllllllllllIIIIlIIIlIIIlIIlIII) {
        return lllllllllllllIIIIlIIIlIIIlIIlIII > 0;
    }
    
    @Override
    public void initGui() {
        Keyboard.enableRepeatEvents((boolean)(GuiScreenServerList.lIllIIIIlIIIlI[0] != 0));
        this.buttonList.clear();
        this.buttonList.add(new GuiButton(GuiScreenServerList.lIllIIIIlIIIlI[1], this.width / GuiScreenServerList.lIllIIIIlIIIlI[2] - GuiScreenServerList.lIllIIIIlIIIlI[3], this.height / GuiScreenServerList.lIllIIIIlIIIlI[4] + GuiScreenServerList.lIllIIIIlIIIlI[5] + GuiScreenServerList.lIllIIIIlIIIlI[6], I18n.format(GuiScreenServerList.lIllIIIIlIIIIl[GuiScreenServerList.lIllIIIIlIIIlI[1]], new Object[GuiScreenServerList.lIllIIIIlIIIlI[1]])));
        "".length();
        this.buttonList.add(new GuiButton(GuiScreenServerList.lIllIIIIlIIIlI[0], this.width / GuiScreenServerList.lIllIIIIlIIIlI[2] - GuiScreenServerList.lIllIIIIlIIIlI[3], this.height / GuiScreenServerList.lIllIIIIlIIIlI[4] + GuiScreenServerList.lIllIIIIlIIIlI[7] + GuiScreenServerList.lIllIIIIlIIIlI[6], I18n.format(GuiScreenServerList.lIllIIIIlIIIIl[GuiScreenServerList.lIllIIIIlIIIlI[0]], new Object[GuiScreenServerList.lIllIIIIlIIIlI[1]])));
        "".length();
        this.field_146302_g = new GuiTextField(GuiScreenServerList.lIllIIIIlIIIlI[2], this.fontRendererObj, this.width / GuiScreenServerList.lIllIIIIlIIIlI[2] - GuiScreenServerList.lIllIIIIlIIIlI[3], GuiScreenServerList.lIllIIIIlIIIlI[8], GuiScreenServerList.lIllIIIIlIIIlI[9], GuiScreenServerList.lIllIIIIlIIIlI[10]);
        this.field_146302_g.setMaxStringLength(GuiScreenServerList.lIllIIIIlIIIlI[11]);
        this.field_146302_g.setFocused((boolean)(GuiScreenServerList.lIllIIIIlIIIlI[0] != 0));
        this.field_146302_g.setText(this.mc.gameSettings.lastServer);
        final GuiButton guiButton = this.buttonList.get(GuiScreenServerList.lIllIIIIlIIIlI[1]);
        int enabled;
        if (llllIllIIlIlIll(this.field_146302_g.getText().length()) && llllIllIIlIlIll(this.field_146302_g.getText().split(GuiScreenServerList.lIllIIIIlIIIIl[GuiScreenServerList.lIllIIIIlIIIlI[2]]).length)) {
            enabled = GuiScreenServerList.lIllIIIIlIIIlI[0];
            "".length();
            if ("   ".length() <= -" ".length()) {
                return;
            }
        }
        else {
            enabled = GuiScreenServerList.lIllIIIIlIIIlI[1];
        }
        guiButton.enabled = (enabled != 0);
    }
    
    @Override
    public void updateScreen() {
        this.field_146302_g.updateCursorCounter();
    }
    
    @Override
    protected void actionPerformed(final GuiButton lllllllllllllIIIIlIIIlIIlIlIlIll) throws IOException {
        if (llllIllIIlIllII(lllllllllllllIIIIlIIIlIIlIlIlIll.enabled ? 1 : 0)) {
            if (llllIllIIlIllIl(lllllllllllllIIIIlIIIlIIlIlIlIll.id, GuiScreenServerList.lIllIIIIlIIIlI[0])) {
                this.field_146303_a.confirmClicked((boolean)(GuiScreenServerList.lIllIIIIlIIIlI[1] != 0), GuiScreenServerList.lIllIIIIlIIIlI[1]);
                "".length();
                if ((0x86 ^ 0x82) == 0x0) {
                    return;
                }
            }
            else if (llllIllIIlIlllI(lllllllllllllIIIIlIIIlIIlIlIlIll.id)) {
                this.field_146301_f.serverIP = this.field_146302_g.getText();
                this.field_146303_a.confirmClicked((boolean)(GuiScreenServerList.lIllIIIIlIIIlI[0] != 0), GuiScreenServerList.lIllIIIIlIIIlI[1]);
            }
        }
    }
    
    private static String llllIllIIlIIlll(String lllllllllllllIIIIlIIIlIIIllIlIll, final String lllllllllllllIIIIlIIIlIIIllIllll) {
        lllllllllllllIIIIlIIIlIIIllIlIll = (boolean)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIlIIIlIIIllIlIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIlIIIlIIIllIlllI = new StringBuilder();
        final char[] lllllllllllllIIIIlIIIlIIIllIllIl = lllllllllllllIIIIlIIIlIIIllIllll.toCharArray();
        int lllllllllllllIIIIlIIIlIIIllIllII = GuiScreenServerList.lIllIIIIlIIIlI[1];
        final byte lllllllllllllIIIIlIIIlIIIllIIllI = (Object)((String)lllllllllllllIIIIlIIIlIIIllIlIll).toCharArray();
        final int lllllllllllllIIIIlIIIlIIIllIIlIl = lllllllllllllIIIIlIIIlIIIllIIllI.length;
        boolean lllllllllllllIIIIlIIIlIIIllIIlII = GuiScreenServerList.lIllIIIIlIIIlI[1] != 0;
        while (llllIllIIllIIII(lllllllllllllIIIIlIIIlIIIllIIlII ? 1 : 0, lllllllllllllIIIIlIIIlIIIllIIlIl)) {
            final char lllllllllllllIIIIlIIIlIIIlllIIIl = lllllllllllllIIIIlIIIlIIIllIIllI[lllllllllllllIIIIlIIIlIIIllIIlII];
            lllllllllllllIIIIlIIIlIIIllIlllI.append((char)(lllllllllllllIIIIlIIIlIIIlllIIIl ^ lllllllllllllIIIIlIIIlIIIllIllIl[lllllllllllllIIIIlIIIlIIIllIllII % lllllllllllllIIIIlIIIlIIIllIllIl.length]));
            "".length();
            ++lllllllllllllIIIIlIIIlIIIllIllII;
            ++lllllllllllllIIIIlIIIlIIIllIIlII;
            "".length();
            if (((0x5A ^ 0x41 ^ (0x96 ^ 0x8A)) & (0x5D ^ 0x3C ^ (0x16 ^ 0x70) ^ -" ".length())) > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIlIIIlIIIllIlllI);
    }
    
    private static String llllIllIIlIlIII(final String lllllllllllllIIIIlIIIlIIIllllllI, final String lllllllllllllIIIIlIIIlIIIlllllIl) {
        try {
            final SecretKeySpec lllllllllllllIIIIlIIIlIIlIIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIIIlIIIlllllIl.getBytes(StandardCharsets.UTF_8)), GuiScreenServerList.lIllIIIIlIIIlI[19]), "DES");
            final Cipher lllllllllllllIIIIlIIIlIIlIIIIIlI = Cipher.getInstance("DES");
            lllllllllllllIIIIlIIIlIIlIIIIIlI.init(GuiScreenServerList.lIllIIIIlIIIlI[2], lllllllllllllIIIIlIIIlIIlIIIIIll);
            return new String(lllllllllllllIIIIlIIIlIIlIIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIIIlIIIllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlIIIlIIlIIIIIIl) {
            lllllllllllllIIIIlIIIlIIlIIIIIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected void mouseClicked(final int lllllllllllllIIIIlIIIlIIlIIllIlI, final int lllllllllllllIIIIlIIIlIIlIIlIlIl, final int lllllllllllllIIIIlIIIlIIlIIlIlII) throws IOException {
        super.mouseClicked(lllllllllllllIIIIlIIIlIIlIIllIlI, lllllllllllllIIIIlIIIlIIlIIlIlIl, lllllllllllllIIIIlIIIlIIlIIlIlII);
        this.field_146302_g.mouseClicked(lllllllllllllIIIIlIIIlIIlIIllIlI, lllllllllllllIIIIlIIIlIIlIIlIlIl, lllllllllllllIIIIlIIIlIIlIIlIlII);
    }
}
