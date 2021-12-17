// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import net.minecraft.client.resources.I18n;
import java.io.IOException;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class GuiErrorScreen extends GuiScreen
{
    private /* synthetic */ String field_146312_f;
    private static final /* synthetic */ int[] lllllllIllllI;
    private /* synthetic */ String field_146313_a;
    private static final /* synthetic */ String[] lllllllIlllIl;
    
    private static String lIllIIIlIllllIl(final String lllllllllllllIlIlIIllIlIllIlIIll, final String lllllllllllllIlIlIIllIlIllIlIlII) {
        try {
            final SecretKeySpec lllllllllllllIlIlIIllIlIllIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIllIlIllIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlIIllIlIllIlIlll = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlIIllIlIllIlIlll.init(GuiErrorScreen.lllllllIllllI[1], lllllllllllllIlIlIIllIlIllIllIII);
            return new String(lllllllllllllIlIlIIllIlIllIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIllIlIllIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIIllIlIllIlIllI) {
            lllllllllllllIlIlIIllIlIllIlIllI.printStackTrace();
            return null;
        }
    }
    
    static {
        lIllIIIlIllllll();
        lIllIIIlIlllllI();
    }
    
    private static void lIllIIIlIlllllI() {
        (lllllllIlllIl = new String[GuiErrorScreen.lllllllIllllI[9]])[GuiErrorScreen.lllllllIllllI[0]] = lIllIIIlIllllIl("EgF8n3+aY1hCOnd6Z9OMlA==", "fxWnG");
    }
    
    private static void lIllIIIlIllllll() {
        (lllllllIllllI = new int[10])[0] = ((0x83 ^ 0xBB) & ~(0x95 ^ 0xAD));
        GuiErrorScreen.lllllllIllllI[1] = "  ".length();
        GuiErrorScreen.lllllllIllllI[2] = (0xF1 ^ 0x95);
        GuiErrorScreen.lllllllIllllI[3] = (0x68 ^ 0x5F) + (0x38 ^ 0x30) - -(0x8F ^ 0x9C) + (0xA ^ 0x30);
        GuiErrorScreen.lllllllIllllI[4] = -(0xFFFFDFEF & 0xBFFFF0);
        GuiErrorScreen.lllllllIllllI[5] = -(-(0x54 ^ 0x58) & (0xFFFFEFFB & 0xAFFFFF));
        GuiErrorScreen.lllllllIllllI[6] = (0x69 ^ 0x33);
        GuiErrorScreen.lllllllIllllI[7] = (-" ".length() & (-1 & 0xFFFFFF));
        GuiErrorScreen.lllllllIllllI[8] = (0x62 ^ 0xC);
        GuiErrorScreen.lllllllIllllI[9] = " ".length();
    }
    
    @Override
    protected void actionPerformed(final GuiButton lllllllllllllIlIlIIllIlIllIllllI) throws IOException {
        this.mc.displayGuiScreen(null);
    }
    
    public GuiErrorScreen(final String lllllllllllllIlIlIIllIlIllllIlll, final String lllllllllllllIlIlIIllIlIllllIIll) {
        this.field_146313_a = lllllllllllllIlIlIIllIlIllllIlll;
        this.field_146312_f = lllllllllllllIlIlIIllIlIllllIIll;
    }
    
    @Override
    public void initGui() {
        super.initGui();
        this.buttonList.add(new GuiButton(GuiErrorScreen.lllllllIllllI[0], this.width / GuiErrorScreen.lllllllIllllI[1] - GuiErrorScreen.lllllllIllllI[2], GuiErrorScreen.lllllllIllllI[3], I18n.format(GuiErrorScreen.lllllllIlllIl[GuiErrorScreen.lllllllIllllI[0]], new Object[GuiErrorScreen.lllllllIllllI[0]])));
        "".length();
    }
    
    @Override
    protected void keyTyped(final char lllllllllllllIlIlIIllIlIlllIIIlI, final int lllllllllllllIlIlIIllIlIlllIIIIl) throws IOException {
    }
    
    @Override
    public void drawScreen(final int lllllllllllllIlIlIIllIlIlllIIllI, final int lllllllllllllIlIlIIllIlIlllIIlIl, final float lllllllllllllIlIlIIllIlIlllIIlII) {
        this.drawGradientRect(GuiErrorScreen.lllllllIllllI[0], GuiErrorScreen.lllllllIllllI[0], this.width, this.height, GuiErrorScreen.lllllllIllllI[4], GuiErrorScreen.lllllllIllllI[5]);
        this.drawCenteredString(this.fontRendererObj, this.field_146313_a, this.width / GuiErrorScreen.lllllllIllllI[1], GuiErrorScreen.lllllllIllllI[6], GuiErrorScreen.lllllllIllllI[7]);
        this.drawCenteredString(this.fontRendererObj, this.field_146312_f, this.width / GuiErrorScreen.lllllllIllllI[1], GuiErrorScreen.lllllllIllllI[8], GuiErrorScreen.lllllllIllllI[7]);
        super.drawScreen(lllllllllllllIlIlIIllIlIlllIIllI, lllllllllllllIlIlIIllIlIlllIIlIl, lllllllllllllIlIlIIllIlIlllIIlII);
    }
}
