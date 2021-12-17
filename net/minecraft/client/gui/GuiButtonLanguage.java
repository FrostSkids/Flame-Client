// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.Minecraft;

public class GuiButtonLanguage extends GuiButton
{
    private static final /* synthetic */ int[] llIIllIlIlIIll;
    private static final /* synthetic */ String[] llIIllIlIlIIlI;
    
    @Override
    public void drawButton(final Minecraft llllllllllllIlllIIIIIIlIIIIlIIlI, final int llllllllllllIlllIIIIIIlIIIIlIlll, final int llllllllllllIlllIIIIIIlIIIIlIllI) {
        if (lIIIlllIlllIIIll(this.visible ? 1 : 0)) {
            llllllllllllIlllIIIIIIlIIIIlIIlI.getTextureManager().bindTexture(GuiButton.buttonTextures);
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            int n;
            if (lIIIlllIlllIIlII(llllllllllllIlllIIIIIIlIIIIlIlll, this.xPosition) && lIIIlllIlllIIlII(llllllllllllIlllIIIIIIlIIIIlIllI, this.yPosition) && lIIIlllIlllIIlIl(llllllllllllIlllIIIIIIlIIIIlIlll, this.xPosition + this.width) && lIIIlllIlllIIlIl(llllllllllllIlllIIIIIIlIIIIlIllI, this.yPosition + this.height)) {
                n = GuiButtonLanguage.llIIllIlIlIIll[2];
                "".length();
                if ("  ".length() < " ".length()) {
                    return;
                }
            }
            else {
                n = GuiButtonLanguage.llIIllIlIlIIll[1];
            }
            final boolean llllllllllllIlllIIIIIIlIIIIlIlIl = n != 0;
            int llllllllllllIlllIIIIIIlIIIIlIlII = GuiButtonLanguage.llIIllIlIlIIll[3];
            if (lIIIlllIlllIIIll(llllllllllllIlllIIIIIIlIIIIlIlIl ? 1 : 0)) {
                llllllllllllIlllIIIIIIlIIIIlIlII += this.height;
            }
            this.drawTexturedModalRect(this.xPosition, this.yPosition, GuiButtonLanguage.llIIllIlIlIIll[1], llllllllllllIlllIIIIIIlIIIIlIlII, this.width, this.height);
        }
    }
    
    private static boolean lIIIlllIlllIIIll(final int llllllllllllIlllIIIIIIIlllllIlll) {
        return llllllllllllIlllIIIIIIIlllllIlll != 0;
    }
    
    private static boolean lIIIlllIlllIIlIl(final int llllllllllllIlllIIIIIIIllllllIlI, final int llllllllllllIlllIIIIIIIllllllIIl) {
        return llllllllllllIlllIIIIIIIllllllIlI < llllllllllllIlllIIIIIIIllllllIIl;
    }
    
    private static String lIIIlllIlllIIIII(final String llllllllllllIlllIIIIIIlIIIIIIlII, final String llllllllllllIlllIIIIIIlIIIIIIIll) {
        try {
            final SecretKeySpec llllllllllllIlllIIIIIIlIIIIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIIIIlIIIIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIIIIIIlIIIIIlIII = Cipher.getInstance("Blowfish");
            llllllllllllIlllIIIIIIlIIIIIlIII.init(GuiButtonLanguage.llIIllIlIlIIll[4], llllllllllllIlllIIIIIIlIIIIIlIIl);
            return new String(llllllllllllIlllIIIIIIlIIIIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIIIIlIIIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIIIIIlIIIIIIlll) {
            llllllllllllIlllIIIIIIlIIIIIIlll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIlllIlllIIlII(final int llllllllllllIlllIIIIIIIllllllllI, final int llllllllllllIlllIIIIIIIlllllllIl) {
        return llllllllllllIlllIIIIIIIllllllllI >= llllllllllllIlllIIIIIIIlllllllIl;
    }
    
    private static void lIIIlllIlllIIIlI() {
        (llIIllIlIlIIll = new int[5])[0] = (0x34 ^ 0x20);
        GuiButtonLanguage.llIIllIlIlIIll[1] = ((162 + 161 - 179 + 85 ^ 80 + 15 - 90 + 165) & (133 + 62 - 52 + 86 ^ 2 + 158 + 10 + 0 ^ -" ".length()));
        GuiButtonLanguage.llIIllIlIlIIll[2] = " ".length();
        GuiButtonLanguage.llIIllIlIlIIll[3] = (73 + 112 + 70 + 0 ^ 27 + 83 - 73 + 112);
        GuiButtonLanguage.llIIllIlIlIIll[4] = "  ".length();
    }
    
    public GuiButtonLanguage(final int llllllllllllIlllIIIIIIlIIIlIIllI, final int llllllllllllIlllIIIIIIlIIIlIIIIl, final int llllllllllllIlllIIIIIIlIIIlIIIII) {
        super(llllllllllllIlllIIIIIIlIIIlIIllI, llllllllllllIlllIIIIIIlIIIlIIIIl, llllllllllllIlllIIIIIIlIIIlIIIII, GuiButtonLanguage.llIIllIlIlIIll[0], GuiButtonLanguage.llIIllIlIlIIll[0], GuiButtonLanguage.llIIllIlIlIIlI[GuiButtonLanguage.llIIllIlIlIIll[1]]);
    }
    
    static {
        lIIIlllIlllIIIlI();
        lIIIlllIlllIIIIl();
    }
    
    private static void lIIIlllIlllIIIIl() {
        (llIIllIlIlIIlI = new String[GuiButtonLanguage.llIIllIlIlIIll[2]])[GuiButtonLanguage.llIIllIlIlIIll[1]] = lIIIlllIlllIIIII("Tt6USGKlvCM=", "rjxXY");
    }
}
