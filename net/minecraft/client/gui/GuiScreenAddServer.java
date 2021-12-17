// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import java.util.Arrays;
import java.net.IDN;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.io.IOException;
import java.util.List;
import org.lwjgl.input.Keyboard;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.multiplayer.ServerData;
import com.google.common.base.Predicate;

public class GuiScreenAddServer extends GuiScreen
{
    private final /* synthetic */ GuiScreen parentScreen;
    private static final /* synthetic */ String[] llllIlIIIllIl;
    private /* synthetic */ GuiTextField serverNameField;
    private /* synthetic */ GuiButton serverResourcePacks;
    private /* synthetic */ Predicate<String> field_181032_r;
    private /* synthetic */ GuiTextField serverIPField;
    private final /* synthetic */ ServerData serverData;
    private static final /* synthetic */ int[] llllIlIIIllll;
    
    private static boolean lIlIlIlIIIIIIII(final int lllllllllllllIlIllIlllIIIlIIIIIl, final int lllllllllllllIlIllIlllIIIlIIIIII) {
        return lllllllllllllIlIllIlllIIIlIIIIIl == lllllllllllllIlIllIlllIIIlIIIIII;
    }
    
    private static boolean lIlIlIlIIIIIIll(final int lllllllllllllIlIllIlllIIIIllllIl, final int lllllllllllllIlIllIlllIIIIllllII) {
        return lllllllllllllIlIllIlllIIIIllllIl < lllllllllllllIlIllIlllIIIIllllII;
    }
    
    @Override
    public void drawScreen(final int lllllllllllllIlIllIlllIIlIlIlllI, final int lllllllllllllIlIllIlllIIlIllIIlI, final float lllllllllllllIlIllIlllIIlIlIlIll) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, I18n.format(GuiScreenAddServer.llllIlIIIllIl[GuiScreenAddServer.llllIlIIIllll[21]], new Object[GuiScreenAddServer.llllIlIIIllll[1]]), this.width / GuiScreenAddServer.llllIlIIIllll[2], GuiScreenAddServer.llllIlIIIllll[22], GuiScreenAddServer.llllIlIIIllll[23]);
        this.drawString(this.fontRendererObj, I18n.format(GuiScreenAddServer.llllIlIIIllIl[GuiScreenAddServer.llllIlIIIllll[24]], new Object[GuiScreenAddServer.llllIlIIIllll[1]]), this.width / GuiScreenAddServer.llllIlIIIllll[2] - GuiScreenAddServer.llllIlIIIllll[3], GuiScreenAddServer.llllIlIIIllll[25], GuiScreenAddServer.llllIlIIIllll[26]);
        this.drawString(this.fontRendererObj, I18n.format(GuiScreenAddServer.llllIlIIIllIl[GuiScreenAddServer.llllIlIIIllll[27]], new Object[GuiScreenAddServer.llllIlIIIllll[1]]), this.width / GuiScreenAddServer.llllIlIIIllll[2] - GuiScreenAddServer.llllIlIIIllll[3], GuiScreenAddServer.llllIlIIIllll[28], GuiScreenAddServer.llllIlIIIllll[26]);
        this.serverNameField.drawTextBox();
        this.serverIPField.drawTextBox();
        super.drawScreen(lllllllllllllIlIllIlllIIlIlIlllI, lllllllllllllIlIllIlllIIlIllIIlI, lllllllllllllIlIllIlllIIlIlIlIll);
    }
    
    private static void lIlIlIIllllllIl() {
        (llllIlIIIllll = new int[30])[0] = " ".length();
        GuiScreenAddServer.llllIlIIIllll[1] = (" ".length() & ~" ".length());
        GuiScreenAddServer.llllIlIIIllll[2] = "  ".length();
        GuiScreenAddServer.llllIlIIIllll[3] = (0x71 ^ 0x15);
        GuiScreenAddServer.llllIlIIIllll[4] = (0xB0 ^ 0xB4);
        GuiScreenAddServer.llllIlIIIllll[5] = (0x11 ^ 0x2E ^ (0xF0 ^ 0xAF));
        GuiScreenAddServer.llllIlIIIllll[6] = (0x49 ^ 0x29 ^ (0x38 ^ 0x4A));
        GuiScreenAddServer.llllIlIIIllll[7] = (0x65 ^ 0x16 ^ (0x86 ^ 0x8D));
        GuiScreenAddServer.llllIlIIIllll[8] = (0xF1 ^ 0xB9);
        GuiScreenAddServer.llllIlIIIllll[9] = "   ".length();
        GuiScreenAddServer.llllIlIIIllll[10] = (162 + 46 - 105 + 100 ^ 122 + 20 - 75 + 70);
        GuiScreenAddServer.llllIlIIIllll[11] = (0x6D ^ 0x3C) + (0x35 ^ 0x7C) - (112 + 100 - 175 + 98) + (65 + 95 - 5 + 26);
        GuiScreenAddServer.llllIlIIIllll[12] = (0x33 ^ 0x27);
        GuiScreenAddServer.llllIlIIIllll[13] = (206 + 42 - 114 + 78 ^ 36 + 51 + 19 + 84);
        GuiScreenAddServer.llllIlIIIllll[14] = (0xA9 ^ 0xA2) + (0xD3 ^ 0x86) - (0x12 ^ 0x40) + (0x6D ^ 0x1F);
        GuiScreenAddServer.llllIlIIIllll[15] = (0xB1 ^ 0xB4);
        GuiScreenAddServer.llllIlIIIllll[16] = (0x53 ^ 0x55);
        GuiScreenAddServer.llllIlIIIllll[17] = (0x19 ^ 0x1 ^ (0x7B ^ 0x6C));
        GuiScreenAddServer.llllIlIIIllll[18] = (0xD9 ^ 0xC5);
        GuiScreenAddServer.llllIlIIIllll[19] = (0x70 ^ 0x7D) + (0xE ^ 0x22) - (0x3 ^ 0x35) + (98 + 16 - 91 + 130);
        GuiScreenAddServer.llllIlIIIllll[20] = (0xAF ^ 0xC2 ^ (0x4F ^ 0x25));
        GuiScreenAddServer.llllIlIIIllll[21] = (0x40 ^ 0x45 ^ (0x44 ^ 0x49));
        GuiScreenAddServer.llllIlIIIllll[22] = (0xA ^ 0x1B);
        GuiScreenAddServer.llllIlIIIllll[23] = (-1 & 0xFFFFFF);
        GuiScreenAddServer.llllIlIIIllll[24] = (0xB1 ^ 0x9C ^ (0x77 ^ 0x53));
        GuiScreenAddServer.llllIlIIIllll[25] = (51 + 116 - 48 + 9 ^ 149 + 107 - 169 + 94);
        GuiScreenAddServer.llllIlIIIllll[26] = (0xFFFFF3E7 & 0xA0ACB8);
        GuiScreenAddServer.llllIlIIIllll[27] = (0x59 ^ 0xA ^ (0x66 ^ 0x3F));
        GuiScreenAddServer.llllIlIIIllll[28] = (0xA0 ^ 0xAE ^ (0xD1 ^ 0x81));
        GuiScreenAddServer.llllIlIIIllll[29] = (0x75 ^ 0x7E);
    }
    
    @Override
    public void initGui() {
        Keyboard.enableRepeatEvents((boolean)(GuiScreenAddServer.llllIlIIIllll[0] != 0));
        this.buttonList.clear();
        this.buttonList.add(new GuiButton(GuiScreenAddServer.llllIlIIIllll[1], this.width / GuiScreenAddServer.llllIlIIIllll[2] - GuiScreenAddServer.llllIlIIIllll[3], this.height / GuiScreenAddServer.llllIlIIIllll[4] + GuiScreenAddServer.llllIlIIIllll[5] + GuiScreenAddServer.llllIlIIIllll[6], I18n.format(GuiScreenAddServer.llllIlIIIllIl[GuiScreenAddServer.llllIlIIIllll[1]], new Object[GuiScreenAddServer.llllIlIIIllll[1]])));
        "".length();
        this.buttonList.add(new GuiButton(GuiScreenAddServer.llllIlIIIllll[0], this.width / GuiScreenAddServer.llllIlIIIllll[2] - GuiScreenAddServer.llllIlIIIllll[3], this.height / GuiScreenAddServer.llllIlIIIllll[4] + GuiScreenAddServer.llllIlIIIllll[7] + GuiScreenAddServer.llllIlIIIllll[6], I18n.format(GuiScreenAddServer.llllIlIIIllIl[GuiScreenAddServer.llllIlIIIllll[0]], new Object[GuiScreenAddServer.llllIlIIIllll[1]])));
        "".length();
        final List<GuiButton> buttonList = this.buttonList;
        final GuiButton serverResourcePacks = new GuiButton(GuiScreenAddServer.llllIlIIIllll[2], this.width / GuiScreenAddServer.llllIlIIIllll[2] - GuiScreenAddServer.llllIlIIIllll[3], this.height / GuiScreenAddServer.llllIlIIIllll[4] + GuiScreenAddServer.llllIlIIIllll[8], String.valueOf(new StringBuilder(String.valueOf(I18n.format(GuiScreenAddServer.llllIlIIIllIl[GuiScreenAddServer.llllIlIIIllll[2]], new Object[GuiScreenAddServer.llllIlIIIllll[1]]))).append(GuiScreenAddServer.llllIlIIIllIl[GuiScreenAddServer.llllIlIIIllll[9]]).append(this.serverData.getResourceMode().getMotd().getFormattedText())));
        this.serverResourcePacks = serverResourcePacks;
        buttonList.add(serverResourcePacks);
        "".length();
        this.serverNameField = new GuiTextField(GuiScreenAddServer.llllIlIIIllll[1], this.fontRendererObj, this.width / GuiScreenAddServer.llllIlIIIllll[2] - GuiScreenAddServer.llllIlIIIllll[3], GuiScreenAddServer.llllIlIIIllll[10], GuiScreenAddServer.llllIlIIIllll[11], GuiScreenAddServer.llllIlIIIllll[12]);
        this.serverNameField.setFocused((boolean)(GuiScreenAddServer.llllIlIIIllll[0] != 0));
        this.serverNameField.setText(this.serverData.serverName);
        this.serverIPField = new GuiTextField(GuiScreenAddServer.llllIlIIIllll[0], this.fontRendererObj, this.width / GuiScreenAddServer.llllIlIIIllll[2] - GuiScreenAddServer.llllIlIIIllll[3], GuiScreenAddServer.llllIlIIIllll[13], GuiScreenAddServer.llllIlIIIllll[11], GuiScreenAddServer.llllIlIIIllll[12]);
        this.serverIPField.setMaxStringLength(GuiScreenAddServer.llllIlIIIllll[14]);
        this.serverIPField.setText(this.serverData.serverIP);
        this.serverIPField.func_175205_a(this.field_181032_r);
        final GuiButton guiButton = this.buttonList.get(GuiScreenAddServer.llllIlIIIllll[1]);
        int enabled;
        if (lIlIlIIlllllllI(this.serverIPField.getText().length()) && lIlIlIIlllllllI(this.serverIPField.getText().split(GuiScreenAddServer.llllIlIIIllIl[GuiScreenAddServer.llllIlIIIllll[4]]).length) && lIlIlIIlllllllI(this.serverNameField.getText().length())) {
            enabled = GuiScreenAddServer.llllIlIIIllll[0];
            "".length();
            if ("  ".length() <= 0) {
                return;
            }
        }
        else {
            enabled = GuiScreenAddServer.llllIlIIIllll[1];
        }
        guiButton.enabled = (enabled != 0);
    }
    
    @Override
    protected void actionPerformed(final GuiButton lllllllllllllIlIllIlllIIlllIlIlI) throws IOException {
        if (lIlIlIIllllllll(lllllllllllllIlIllIlllIIlllIlIlI.enabled ? 1 : 0)) {
            if (lIlIlIlIIIIIIII(lllllllllllllIlIllIlllIIlllIlIlI.id, GuiScreenAddServer.llllIlIIIllll[2])) {
                this.serverData.setResourceMode(ServerData.ServerResourceMode.values()[(this.serverData.getResourceMode().ordinal() + GuiScreenAddServer.llllIlIIIllll[0]) % ServerData.ServerResourceMode.values().length]);
                this.serverResourcePacks.displayString = String.valueOf(new StringBuilder(String.valueOf(I18n.format(GuiScreenAddServer.llllIlIIIllIl[GuiScreenAddServer.llllIlIIIllll[15]], new Object[GuiScreenAddServer.llllIlIIIllll[1]]))).append(GuiScreenAddServer.llllIlIIIllIl[GuiScreenAddServer.llllIlIIIllll[16]]).append(this.serverData.getResourceMode().getMotd().getFormattedText()));
                "".length();
                if (" ".length() != " ".length()) {
                    return;
                }
            }
            else if (lIlIlIlIIIIIIII(lllllllllllllIlIllIlllIIlllIlIlI.id, GuiScreenAddServer.llllIlIIIllll[0])) {
                this.parentScreen.confirmClicked((boolean)(GuiScreenAddServer.llllIlIIIllll[1] != 0), GuiScreenAddServer.llllIlIIIllll[1]);
                "".length();
                if (-" ".length() >= "   ".length()) {
                    return;
                }
            }
            else if (lIlIlIlIIIIIIIl(lllllllllllllIlIllIlllIIlllIlIlI.id)) {
                this.serverData.serverName = this.serverNameField.getText();
                this.serverData.serverIP = this.serverIPField.getText();
                this.parentScreen.confirmClicked((boolean)(GuiScreenAddServer.llllIlIIIllll[0] != 0), GuiScreenAddServer.llllIlIIIllll[1]);
            }
        }
    }
    
    @Override
    protected void mouseClicked(final int lllllllllllllIlIllIlllIIllIIlIIl, final int lllllllllllllIlIllIlllIIllIIlIII, final int lllllllllllllIlIllIlllIIllIIIIll) throws IOException {
        super.mouseClicked(lllllllllllllIlIllIlllIIllIIlIIl, lllllllllllllIlIllIlllIIllIIlIII, lllllllllllllIlIllIlllIIllIIIIll);
        this.serverIPField.mouseClicked(lllllllllllllIlIllIlllIIllIIlIIl, lllllllllllllIlIllIlllIIllIIlIII, lllllllllllllIlIllIlllIIllIIIIll);
        this.serverNameField.mouseClicked(lllllllllllllIlIllIlllIIllIIlIIl, lllllllllllllIlIllIlllIIllIIlIII, lllllllllllllIlIllIlllIIllIIIIll);
    }
    
    private static boolean lIlIlIlIIIIIIIl(final int lllllllllllllIlIllIlllIIIIlllIII) {
        return lllllllllllllIlIllIlllIIIIlllIII == 0;
    }
    
    private static String lIlIlIIllllIIII(final String lllllllllllllIlIllIlllIIIlIlIIll, final String lllllllllllllIlIllIlllIIIlIIllll) {
        try {
            final SecretKeySpec lllllllllllllIlIllIlllIIIlIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIlllIIIlIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIllIlllIIIlIlIllI = Cipher.getInstance("Blowfish");
            lllllllllllllIlIllIlllIIIlIlIllI.init(GuiScreenAddServer.llllIlIIIllll[2], lllllllllllllIlIllIlllIIIlIllIII);
            return new String(lllllllllllllIlIllIlllIIIlIlIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIlllIIIlIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllIlllIIIlIlIlII) {
            lllllllllllllIlIllIlllIIIlIlIlII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void onGuiClosed() {
        Keyboard.enableRepeatEvents((boolean)(GuiScreenAddServer.llllIlIIIllll[1] != 0));
    }
    
    private static String lIlIlIIllllIIlI(String lllllllllllllIlIllIlllIIlIIIIlIl, final String lllllllllllllIlIllIlllIIlIIIllII) {
        lllllllllllllIlIllIlllIIlIIIIlIl = new String(Base64.getDecoder().decode(lllllllllllllIlIllIlllIIlIIIIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIllIlllIIlIIIlIlI = new StringBuilder();
        final char[] lllllllllllllIlIllIlllIIlIIIlIII = lllllllllllllIlIllIlllIIlIIIllII.toCharArray();
        int lllllllllllllIlIllIlllIIlIIIIllI = GuiScreenAddServer.llllIlIIIllll[1];
        final byte lllllllllllllIlIllIlllIIlIIIIIII = (Object)lllllllllllllIlIllIlllIIlIIIIlIl.toCharArray();
        final long lllllllllllllIlIllIlllIIIlllllll = lllllllllllllIlIllIlllIIlIIIIIII.length;
        int lllllllllllllIlIllIlllIIIlllllIl = GuiScreenAddServer.llllIlIIIllll[1];
        while (lIlIlIlIIIIIIll(lllllllllllllIlIllIlllIIIlllllIl, (int)lllllllllllllIlIllIlllIIIlllllll)) {
            final char lllllllllllllIlIllIlllIIlIIlIIII = lllllllllllllIlIllIlllIIlIIIIIII[lllllllllllllIlIllIlllIIIlllllIl];
            lllllllllllllIlIllIlllIIlIIIlIlI.append((char)(lllllllllllllIlIllIlllIIlIIlIIII ^ lllllllllllllIlIllIlllIIlIIIlIII[lllllllllllllIlIllIlllIIlIIIIllI % lllllllllllllIlIllIlllIIlIIIlIII.length]));
            "".length();
            ++lllllllllllllIlIllIlllIIlIIIIllI;
            ++lllllllllllllIlIllIlllIIIlllllIl;
            "".length();
            if ((0x28 ^ 0x2D) == 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIllIlllIIlIIIlIlI);
    }
    
    private static boolean lIlIlIIllllllll(final int lllllllllllllIlIllIlllIIIIlllIlI) {
        return lllllllllllllIlIllIlllIIIIlllIlI != 0;
    }
    
    private static boolean lIlIlIlIIIIIIlI(final int lllllllllllllIlIllIlllIIIIllIIll, final int lllllllllllllIlIllIlllIIIIllIIlI) {
        return lllllllllllllIlIllIlllIIIIllIIll != lllllllllllllIlIllIlllIIIIllIIlI;
    }
    
    private static boolean lIlIlIIlllllllI(final int lllllllllllllIlIllIlllIIIIllIllI) {
        return lllllllllllllIlIllIlllIIIIllIllI > 0;
    }
    
    static {
        lIlIlIIllllllIl();
        lIlIlIIllllIlII();
    }
    
    @Override
    protected void keyTyped(final char lllllllllllllIlIllIlllIIllIlIIlI, final int lllllllllllllIlIllIlllIIllIlIlIl) throws IOException {
        this.serverNameField.textboxKeyTyped(lllllllllllllIlIllIlllIIllIlIIlI, lllllllllllllIlIllIlllIIllIlIlIl);
        "".length();
        this.serverIPField.textboxKeyTyped(lllllllllllllIlIllIlllIIllIlIIlI, lllllllllllllIlIllIlllIIllIlIlIl);
        "".length();
        if (lIlIlIlIIIIIIII(lllllllllllllIlIllIlllIIllIlIlIl, GuiScreenAddServer.llllIlIIIllll[17])) {
            final GuiTextField serverNameField = this.serverNameField;
            int focused;
            if (lIlIlIIllllllll(this.serverNameField.isFocused() ? 1 : 0)) {
                focused = GuiScreenAddServer.llllIlIIIllll[1];
                "".length();
                if ("  ".length() >= "   ".length()) {
                    return;
                }
            }
            else {
                focused = GuiScreenAddServer.llllIlIIIllll[0];
            }
            serverNameField.setFocused((boolean)(focused != 0));
            final GuiTextField serverIPField = this.serverIPField;
            int focused2;
            if (lIlIlIIllllllll(this.serverIPField.isFocused() ? 1 : 0)) {
                focused2 = GuiScreenAddServer.llllIlIIIllll[1];
                "".length();
                if ("   ".length() < "   ".length()) {
                    return;
                }
            }
            else {
                focused2 = GuiScreenAddServer.llllIlIIIllll[0];
            }
            serverIPField.setFocused((boolean)(focused2 != 0));
        }
        if (!lIlIlIlIIIIIIlI(lllllllllllllIlIllIlllIIllIlIlIl, GuiScreenAddServer.llllIlIIIllll[18]) || lIlIlIlIIIIIIII(lllllllllllllIlIllIlllIIllIlIlIl, GuiScreenAddServer.llllIlIIIllll[19])) {
            this.actionPerformed(this.buttonList.get(GuiScreenAddServer.llllIlIIIllll[1]));
        }
        final GuiButton guiButton = this.buttonList.get(GuiScreenAddServer.llllIlIIIllll[1]);
        int enabled;
        if (lIlIlIIlllllllI(this.serverIPField.getText().length()) && lIlIlIIlllllllI(this.serverIPField.getText().split(GuiScreenAddServer.llllIlIIIllIl[GuiScreenAddServer.llllIlIIIllll[20]]).length) && lIlIlIIlllllllI(this.serverNameField.getText().length())) {
            enabled = GuiScreenAddServer.llllIlIIIllll[0];
            "".length();
            if (((0x91 ^ 0x87) & ~(0x3 ^ 0x15)) < ((0x48 ^ 0x73) & ~(0x3B ^ 0x0))) {
                return;
            }
        }
        else {
            enabled = GuiScreenAddServer.llllIlIIIllll[1];
        }
        guiButton.enabled = (enabled != 0);
    }
    
    private static void lIlIlIIllllIlII() {
        (llllIlIIIllIl = new String[GuiScreenAddServer.llllIlIIIllll[29]])[GuiScreenAddServer.llllIlIIIllll[1]] = lIlIlIIllllIIII("DBoBpzne8eLa+yHOMy9tVA==", "CddDq");
        GuiScreenAddServer.llllIlIIIllIl[GuiScreenAddServer.llllIlIIIllll[0]] = lIlIlIIllllIIII("cSIDtHIbo2FgfBoBtxUCnA==", "jmNRi");
        GuiScreenAddServer.llllIlIIIllIl[GuiScreenAddServer.llllIlIIIllll[2]] = lIlIlIIllllIIIl("zAaIBXqY7lm1U4Oiobk0Jff2MOIr1H24", "fJhNX");
        GuiScreenAddServer.llllIlIIIllIl[GuiScreenAddServer.llllIlIIIllll[9]] = lIlIlIIllllIIII("SgeBbdnIt0A=", "tFkxe");
        GuiScreenAddServer.llllIlIIIllIl[GuiScreenAddServer.llllIlIIIllll[4]] = lIlIlIIllllIIlI("Yg==", "XqhzK");
        GuiScreenAddServer.llllIlIIIllIl[GuiScreenAddServer.llllIlIIIllll[15]] = lIlIlIIllllIIIl("YvMdBBBxeMVSWa0UaMC8UEow34Z03+/D", "PylZy");
        GuiScreenAddServer.llllIlIIIllIl[GuiScreenAddServer.llllIlIIIllll[16]] = lIlIlIIllllIIlI("VnM=", "lSKqP");
        GuiScreenAddServer.llllIlIIIllIl[GuiScreenAddServer.llllIlIIIllll[20]] = lIlIlIIllllIIII("42hqcfDOrnQ=", "AEoHx");
        GuiScreenAddServer.llllIlIIIllIl[GuiScreenAddServer.llllIlIIIllll[21]] = lIlIlIIllllIIIl("ZloyNIMgUto4MK5vKapFgw==", "XjCjZ");
        GuiScreenAddServer.llllIlIIIllIl[GuiScreenAddServer.llllIlIIIllll[24]] = lIlIlIIllllIIII("z2s53VBbjMfxU5Dvg4deu3uv+SAJxw3H", "VKeic");
        GuiScreenAddServer.llllIlIIIllIl[GuiScreenAddServer.llllIlIIIllll[27]] = lIlIlIIllllIIlI("OwAiJxQoEiMGXz8KMhEDExQ=", "ZdFtq");
    }
    
    public GuiScreenAddServer(final GuiScreen lllllllllllllIlIllIlllIlIIIIllIl, final ServerData lllllllllllllIlIllIlllIlIIIIllII) {
        this.field_181032_r = (Predicate<String>)new Predicate<String>() {
            private static final /* synthetic */ int[] lIIllIllllIIIl;
            private static final /* synthetic */ String[] lIIllIllllIIII;
            
            private static void llIllIlIIIlllIl() {
                (lIIllIllllIIIl = new int[3])[0] = " ".length();
                GuiScreenAddServer$1.lIIllIllllIIIl[1] = ((0x7A ^ 0x75) & ~(0x95 ^ 0x9A));
                GuiScreenAddServer$1.lIIllIllllIIIl[2] = "  ".length();
            }
            
            private static boolean llIllIlIIIllllI(final int lllllllllllllIIlIlIIlIIlllIlIlII) {
                return lllllllllllllIIlIlIIlIIlllIlIlII == 0;
            }
            
            private static String llIllIlIIIllIll(final String lllllllllllllIIlIlIIlIIlllIllIll, final String lllllllllllllIIlIlIIlIIlllIllIlI) {
                try {
                    final SecretKeySpec lllllllllllllIIlIlIIlIIlllIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIIlIIlllIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                    final Cipher lllllllllllllIIlIlIIlIIlllIlllIl = Cipher.getInstance("Blowfish");
                    lllllllllllllIIlIlIIlIIlllIlllIl.init(GuiScreenAddServer$1.lIIllIllllIIIl[2], lllllllllllllIIlIlIIlIIlllIllllI);
                    return new String(lllllllllllllIIlIlIIlIIlllIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIIlIIlllIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIIlIlIIlIIlllIlllII) {
                    lllllllllllllIIlIlIIlIIlllIlllII.printStackTrace();
                    return null;
                }
            }
            
            private static void llIllIlIIIlllII() {
                (lIIllIllllIIII = new String[GuiScreenAddServer$1.lIIllIllllIIIl[0]])[GuiScreenAddServer$1.lIIllIllllIIIl[1]] = llIllIlIIIllIll("u8UVY9Qz4Vc=", "oFRBE");
            }
            
            static {
                llIllIlIIIlllIl();
                llIllIlIIIlllII();
            }
            
            public boolean apply(final String lllllllllllllIIlIlIIlIIllllIlIIl) {
                if (llIllIlIIIllllI(lllllllllllllIIlIlIIlIIllllIlIIl.length())) {
                    return GuiScreenAddServer$1.lIIllIllllIIIl[0] != 0;
                }
                final String[] lllllllllllllIIlIlIIlIIllllIllII = lllllllllllllIIlIlIIlIIllllIlIIl.split(GuiScreenAddServer$1.lIIllIllllIIII[GuiScreenAddServer$1.lIIllIllllIIIl[1]]);
                if (llIllIlIIIllllI(lllllllllllllIIlIlIIlIIllllIllII.length)) {
                    return GuiScreenAddServer$1.lIIllIllllIIIl[0] != 0;
                }
                try {
                    final String lllllllllllllIIlIlIIlIIllllIlIll = IDN.toASCII(lllllllllllllIIlIlIIlIIllllIllII[GuiScreenAddServer$1.lIIllIllllIIIl[1]]);
                    return GuiScreenAddServer$1.lIIllIllllIIIl[0] != 0;
                }
                catch (IllegalArgumentException lllllllllllllIIlIlIIlIIllllIlIlI) {
                    return GuiScreenAddServer$1.lIIllIllllIIIl[1] != 0;
                }
            }
        };
        this.parentScreen = lllllllllllllIlIllIlllIlIIIIllIl;
        this.serverData = lllllllllllllIlIllIlllIlIIIIllII;
    }
    
    private static String lIlIlIIllllIIIl(final String lllllllllllllIlIllIlllIIIllIlIII, final String lllllllllllllIlIllIlllIIIllIIlIl) {
        try {
            final SecretKeySpec lllllllllllllIlIllIlllIIIllIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIlllIIIllIIlIl.getBytes(StandardCharsets.UTF_8)), GuiScreenAddServer.llllIlIIIllll[21]), "DES");
            final Cipher lllllllllllllIlIllIlllIIIllIlIll = Cipher.getInstance("DES");
            lllllllllllllIlIllIlllIIIllIlIll.init(GuiScreenAddServer.llllIlIIIllll[2], lllllllllllllIlIllIlllIIIllIllIl);
            return new String(lllllllllllllIlIllIlllIIIllIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIlllIIIllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllIlllIIIllIlIIl) {
            lllllllllllllIlIllIlllIIIllIlIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void updateScreen() {
        this.serverNameField.updateCursorCounter();
        this.serverIPField.updateCursorCounter();
    }
}
