// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import java.util.Arrays;
import net.minecraft.world.storage.WorldInfo;
import org.lwjgl.input.Keyboard;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import net.minecraft.world.storage.ISaveFormat;
import net.minecraft.client.resources.I18n;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.io.IOException;

public class GuiRenameWorld extends GuiScreen
{
    private static final /* synthetic */ String[] lIlllIIIlllIII;
    private final /* synthetic */ String saveName;
    private /* synthetic */ GuiTextField field_146583_f;
    private /* synthetic */ GuiScreen parentScreen;
    private static final /* synthetic */ int[] lIlllIIIlllIlI;
    
    @Override
    protected void keyTyped(final char llllllllllllIlllllIlIlIIIllIllll, final int llllllllllllIlllllIlIlIIIllIlllI) throws IOException {
        this.field_146583_f.textboxKeyTyped(llllllllllllIlllllIlIlIIIllIllll, llllllllllllIlllllIlIlIIIllIlllI);
        "".length();
        final GuiButton guiButton = this.buttonList.get(GuiRenameWorld.lIlllIIIlllIlI[1]);
        int enabled;
        if (lIIIIIIllIIIlIII(this.field_146583_f.getText().trim().length())) {
            enabled = GuiRenameWorld.lIlllIIIlllIlI[0];
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            enabled = GuiRenameWorld.lIlllIIIlllIlI[1];
        }
        guiButton.enabled = (enabled != 0);
        if (!lIIIIIIllIIIlIIl(llllllllllllIlllllIlIlIIIllIlllI, GuiRenameWorld.lIlllIIIlllIlI[11]) || lIIIIIIllIIIIllI(llllllllllllIlllllIlIlIIIllIlllI, GuiRenameWorld.lIlllIIIlllIlI[12])) {
            this.actionPerformed(this.buttonList.get(GuiRenameWorld.lIlllIIIlllIlI[1]));
        }
    }
    
    private static boolean lIIIIIIllIIIIllI(final int llllllllllllIlllllIlIlIIIIIllllI, final int llllllllllllIlllllIlIlIIIIIlllIl) {
        return llllllllllllIlllllIlIlIIIIIllllI == llllllllllllIlllllIlIlIIIIIlllIl;
    }
    
    private static String lIIIIIIlIlllIllI(String llllllllllllIlllllIlIlIIIlIIIIll, final String llllllllllllIlllllIlIlIIIlIIIlll) {
        llllllllllllIlllllIlIlIIIlIIIIll = (short)new String(Base64.getDecoder().decode(((String)llllllllllllIlllllIlIlIIIlIIIIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllllIlIlIIIlIIIllI = new StringBuilder();
        final char[] llllllllllllIlllllIlIlIIIlIIIlIl = llllllllllllIlllllIlIlIIIlIIIlll.toCharArray();
        int llllllllllllIlllllIlIlIIIlIIIlII = GuiRenameWorld.lIlllIIIlllIlI[1];
        final short llllllllllllIlllllIlIlIIIIlllllI = (Object)((String)llllllllllllIlllllIlIlIIIlIIIIll).toCharArray();
        final double llllllllllllIlllllIlIlIIIIllllIl = llllllllllllIlllllIlIlIIIIlllllI.length;
        int llllllllllllIlllllIlIlIIIIllllII = GuiRenameWorld.lIlllIIIlllIlI[1];
        while (lIIIIIIllIIIlIlI(llllllllllllIlllllIlIlIIIIllllII, (int)llllllllllllIlllllIlIlIIIIllllIl)) {
            final char llllllllllllIlllllIlIlIIIlIIlIIl = llllllllllllIlllllIlIlIIIIlllllI[llllllllllllIlllllIlIlIIIIllllII];
            llllllllllllIlllllIlIlIIIlIIIllI.append((char)(llllllllllllIlllllIlIlIIIlIIlIIl ^ llllllllllllIlllllIlIlIIIlIIIlIl[llllllllllllIlllllIlIlIIIlIIIlII % llllllllllllIlllllIlIlIIIlIIIlIl.length]));
            "".length();
            ++llllllllllllIlllllIlIlIIIlIIIlII;
            ++llllllllllllIlllllIlIlIIIIllllII;
            "".length();
            if (((0xB4 ^ 0x92 ^ (0x69 ^ 0x5A)) & (0x99 ^ 0xB3 ^ (0x84 ^ 0xBB) ^ -" ".length())) < 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllllIlIlIIIlIIIllI);
    }
    
    private static boolean lIIIIIIllIIIIlll(final int llllllllllllIlllllIlIlIIIIIlIlIl) {
        return llllllllllllIlllllIlIlIIIIIlIlIl == 0;
    }
    
    @Override
    protected void mouseClicked(final int llllllllllllIlllllIlIlIIIllIIlIl, final int llllllllllllIlllllIlIlIIIllIIlII, final int llllllllllllIlllllIlIlIIIlIlllll) throws IOException {
        super.mouseClicked(llllllllllllIlllllIlIlIIIllIIlIl, llllllllllllIlllllIlIlIIIllIIlII, llllllllllllIlllllIlIlIIIlIlllll);
        this.field_146583_f.mouseClicked(llllllllllllIlllllIlIlIIIllIIlIl, llllllllllllIlllllIlIlIIIllIIlII, llllllllllllIlllllIlIlIIIlIlllll);
    }
    
    @Override
    public void drawScreen(final int llllllllllllIlllllIlIlIIIlIlIlIl, final int llllllllllllIlllllIlIlIIIlIllIII, final float llllllllllllIlllllIlIlIIIlIlIIll) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, I18n.format(GuiRenameWorld.lIlllIIIlllIII[GuiRenameWorld.lIlllIIIlllIlI[2]], new Object[GuiRenameWorld.lIlllIIIlllIlI[1]]), this.width / GuiRenameWorld.lIlllIIIlllIlI[2], GuiRenameWorld.lIlllIIIlllIlI[10], GuiRenameWorld.lIlllIIIlllIlI[13]);
        this.drawString(this.fontRendererObj, I18n.format(GuiRenameWorld.lIlllIIIlllIII[GuiRenameWorld.lIlllIIIlllIlI[14]], new Object[GuiRenameWorld.lIlllIIIlllIlI[1]]), this.width / GuiRenameWorld.lIlllIIIlllIlI[2] - GuiRenameWorld.lIlllIIIlllIlI[3], GuiRenameWorld.lIlllIIIlllIlI[15], GuiRenameWorld.lIlllIIIlllIlI[16]);
        this.field_146583_f.drawTextBox();
        super.drawScreen(llllllllllllIlllllIlIlIIIlIlIlIl, llllllllllllIlllllIlIlIIIlIllIII, llllllllllllIlllllIlIlIIIlIlIIll);
    }
    
    @Override
    protected void actionPerformed(final GuiButton llllllllllllIlllllIlIlIIIlllIlIl) throws IOException {
        if (lIIIIIIllIIIIlIl(llllllllllllIlllllIlIlIIIlllIlIl.enabled ? 1 : 0)) {
            if (lIIIIIIllIIIIllI(llllllllllllIlllllIlIlIIIlllIlIl.id, GuiRenameWorld.lIlllIIIlllIlI[0])) {
                this.mc.displayGuiScreen(this.parentScreen);
                "".length();
                if (((0x47 ^ 0x6A) & ~(0x98 ^ 0xB5)) == " ".length()) {
                    return;
                }
            }
            else if (lIIIIIIllIIIIlll(llllllllllllIlllllIlIlIIIlllIlIl.id)) {
                final ISaveFormat llllllllllllIlllllIlIlIIIlllIlll = this.mc.getSaveLoader();
                llllllllllllIlllllIlIlIIIlllIlll.renameWorld(this.saveName, this.field_146583_f.getText().trim());
                this.mc.displayGuiScreen(this.parentScreen);
            }
        }
    }
    
    private static boolean lIIIIIIllIIIlIII(final int llllllllllllIlllllIlIlIIIIIlIIll) {
        return llllllllllllIlllllIlIlIIIIIlIIll > 0;
    }
    
    private static String lIIIIIIlIlllIlll(final String llllllllllllIlllllIlIlIIIIllIIll, final String llllllllllllIlllllIlIlIIIIllIIII) {
        try {
            final SecretKeySpec llllllllllllIlllllIlIlIIIIllIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIlIlIIIIllIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllllIlIlIIIIllIlIl = Cipher.getInstance("Blowfish");
            llllllllllllIlllllIlIlIIIIllIlIl.init(GuiRenameWorld.lIlllIIIlllIlI[2], llllllllllllIlllllIlIlIIIIllIllI);
            return new String(llllllllllllIlllllIlIlIIIIllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIlIlIIIIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllIlIlIIIIllIlII) {
            llllllllllllIlllllIlIlIIIIllIlII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void onGuiClosed() {
        Keyboard.enableRepeatEvents((boolean)(GuiRenameWorld.lIlllIIIlllIlI[1] != 0));
    }
    
    private static boolean lIIIIIIllIIIlIlI(final int llllllllllllIlllllIlIlIIIIIllIlI, final int llllllllllllIlllllIlIlIIIIIllIIl) {
        return llllllllllllIlllllIlIlIIIIIllIlI < llllllllllllIlllllIlIlIIIIIllIIl;
    }
    
    @Override
    public void updateScreen() {
        this.field_146583_f.updateCursorCounter();
    }
    
    @Override
    public void initGui() {
        Keyboard.enableRepeatEvents((boolean)(GuiRenameWorld.lIlllIIIlllIlI[0] != 0));
        this.buttonList.clear();
        this.buttonList.add(new GuiButton(GuiRenameWorld.lIlllIIIlllIlI[1], this.width / GuiRenameWorld.lIlllIIIlllIlI[2] - GuiRenameWorld.lIlllIIIlllIlI[3], this.height / GuiRenameWorld.lIlllIIIlllIlI[4] + GuiRenameWorld.lIlllIIIlllIlI[5] + GuiRenameWorld.lIlllIIIlllIlI[6], I18n.format(GuiRenameWorld.lIlllIIIlllIII[GuiRenameWorld.lIlllIIIlllIlI[1]], new Object[GuiRenameWorld.lIlllIIIlllIlI[1]])));
        "".length();
        this.buttonList.add(new GuiButton(GuiRenameWorld.lIlllIIIlllIlI[0], this.width / GuiRenameWorld.lIlllIIIlllIlI[2] - GuiRenameWorld.lIlllIIIlllIlI[3], this.height / GuiRenameWorld.lIlllIIIlllIlI[4] + GuiRenameWorld.lIlllIIIlllIlI[7] + GuiRenameWorld.lIlllIIIlllIlI[6], I18n.format(GuiRenameWorld.lIlllIIIlllIII[GuiRenameWorld.lIlllIIIlllIlI[0]], new Object[GuiRenameWorld.lIlllIIIlllIlI[1]])));
        "".length();
        final ISaveFormat llllllllllllIlllllIlIlIIlIIIIlII = this.mc.getSaveLoader();
        final WorldInfo llllllllllllIlllllIlIlIIlIIIIIll = llllllllllllIlllllIlIlIIlIIIIlII.getWorldInfo(this.saveName);
        final String llllllllllllIlllllIlIlIIlIIIIIlI = llllllllllllIlllllIlIlIIlIIIIIll.getWorldName();
        this.field_146583_f = new GuiTextField(GuiRenameWorld.lIlllIIIlllIlI[2], this.fontRendererObj, this.width / GuiRenameWorld.lIlllIIIlllIlI[2] - GuiRenameWorld.lIlllIIIlllIlI[3], GuiRenameWorld.lIlllIIIlllIlI[8], GuiRenameWorld.lIlllIIIlllIlI[9], GuiRenameWorld.lIlllIIIlllIlI[10]);
        this.field_146583_f.setFocused((boolean)(GuiRenameWorld.lIlllIIIlllIlI[0] != 0));
        this.field_146583_f.setText(llllllllllllIlllllIlIlIIlIIIIIlI);
    }
    
    private static void lIIIIIIllIIIIlII() {
        (lIlllIIIlllIlI = new int[18])[0] = " ".length();
        GuiRenameWorld.lIlllIIIlllIlI[1] = ((103 + 33 - 91 + 166 ^ 79 + 43 - 49 + 61) & (" ".length() ^ (0x43 ^ 0x17) ^ -" ".length()));
        GuiRenameWorld.lIlllIIIlllIlI[2] = "  ".length();
        GuiRenameWorld.lIlllIIIlllIlI[3] = (186 + 74 - 51 + 7 ^ 90 + 159 - 101 + 40);
        GuiRenameWorld.lIlllIIIlllIlI[4] = (0x12 ^ 0x16);
        GuiRenameWorld.lIlllIIIlllIlI[5] = (" ".length() ^ (0xCB ^ 0xAA));
        GuiRenameWorld.lIlllIIIlllIlI[6] = (0xB5 ^ 0x9B ^ (0x64 ^ 0x46));
        GuiRenameWorld.lIlllIIIlllIlI[7] = (0x1A ^ 0x63 ^ " ".length());
        GuiRenameWorld.lIlllIIIlllIlI[8] = (145 + 14 - 154 + 170 ^ 119 + 135 - 128 + 21);
        GuiRenameWorld.lIlllIIIlllIlI[9] = (0x64 ^ 0x1F) + " ".length() - -(0x7A ^ 0x62) + (0xAD ^ 0x99);
        GuiRenameWorld.lIlllIIIlllIlI[10] = (40 + 102 - 94 + 130 ^ 24 + 151 - 20 + 11);
        GuiRenameWorld.lIlllIIIlllIlI[11] = (29 + 159 - 134 + 107 ^ 45 + 175 - 50 + 19);
        GuiRenameWorld.lIlllIIIlllIlI[12] = (0x8C ^ 0xBE) + (0x75 ^ 0x43) - (0xA2 ^ 0xC6) + (93 + 142 - 204 + 121);
        GuiRenameWorld.lIlllIIIlllIlI[13] = (-1 & 0xFFFFFF);
        GuiRenameWorld.lIlllIIIlllIlI[14] = "   ".length();
        GuiRenameWorld.lIlllIIIlllIlI[15] = (0x17 ^ 0x38);
        GuiRenameWorld.lIlllIIIlllIlI[16] = (-(0xFFFFCD7C & 0x739F) & (0xFFFFEBFB & 0xA0F5BF));
        GuiRenameWorld.lIlllIIIlllIlI[17] = (0x7D ^ 0x75);
    }
    
    static {
        lIIIIIIllIIIIlII();
        lIIIIIIllIIIIIll();
    }
    
    private static boolean lIIIIIIllIIIIlIl(final int llllllllllllIlllllIlIlIIIIIlIlll) {
        return llllllllllllIlllllIlIlIIIIIlIlll != 0;
    }
    
    private static String lIIIIIIllIIIIIlI(final String llllllllllllIlllllIlIlIIIIlIIlII, final String llllllllllllIlllllIlIlIIIIlIIlIl) {
        try {
            final SecretKeySpec llllllllllllIlllllIlIlIIIIlIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIlIlIIIIlIIlIl.getBytes(StandardCharsets.UTF_8)), GuiRenameWorld.lIlllIIIlllIlI[17]), "DES");
            final Cipher llllllllllllIlllllIlIlIIIIlIlIII = Cipher.getInstance("DES");
            llllllllllllIlllllIlIlIIIIlIlIII.init(GuiRenameWorld.lIlllIIIlllIlI[2], llllllllllllIlllllIlIlIIIIlIlIIl);
            return new String(llllllllllllIlllllIlIlIIIIlIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIlIlIIIIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllIlIlIIIIlIIlll) {
            llllllllllllIlllllIlIlIIIIlIIlll.printStackTrace();
            return null;
        }
    }
    
    public GuiRenameWorld(final GuiScreen llllllllllllIlllllIlIlIIlIIlIIIl, final String llllllllllllIlllllIlIlIIlIIIllIl) {
        this.parentScreen = llllllllllllIlllllIlIlIIlIIlIIIl;
        this.saveName = llllllllllllIlllllIlIlIIlIIIllIl;
    }
    
    private static boolean lIIIIIIllIIIlIIl(final int llllllllllllIlllllIlIlIIIIIlIIII, final int llllllllllllIlllllIlIlIIIIIIllll) {
        return llllllllllllIlllllIlIlIIIIIlIIII != llllllllllllIlllllIlIlIIIIIIllll;
    }
    
    private static void lIIIIIIllIIIIIll() {
        (lIlllIIIlllIII = new String[GuiRenameWorld.lIlllIIIlllIlI[4]])[GuiRenameWorld.lIlllIIIlllIlI[1]] = lIIIIIIlIlllIllI("NTALKi0yAgg9IiJ7FSogJzgCDTsyIQgh", "FUgON");
        GuiRenameWorld.lIlllIIIlllIII[GuiRenameWorld.lIlllIIIlllIlI[0]] = lIIIIIIlIlllIlll("guFBXJpFuIGSGsL9JlTGTw==", "gfcNl");
        GuiRenameWorld.lIlllIIIlllIII[GuiRenameWorld.lIlllIIIlllIlI[2]] = lIIIIIIllIIIIIlI("A0gjTbaa1tAl6n7tl3CNUago+XPqBjqk", "eFHVy");
        GuiRenameWorld.lIlllIIIlllIII[GuiRenameWorld.lIlllIIIlllIlI[14]] = lIIIIIIllIIIIIlI("RF7/uGu/4PN4d+qt0tMjO7dVTsv2nfQp", "XePyA");
    }
}
