// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import java.util.Arrays;
import net.minecraft.client.resources.I18n;
import java.io.IOException;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class GuiConfirmOpenLink extends GuiYesNo
{
    private final /* synthetic */ String linkText;
    private static final /* synthetic */ String[] lIllIIIlIIIIll;
    private final /* synthetic */ String openLinkWarning;
    private /* synthetic */ boolean showSecurityWarning;
    private final /* synthetic */ String copyLinkButtonText;
    private static final /* synthetic */ int[] lIllIIIlIIIlII;
    
    static {
        llllIllllIIIIll();
        llllIllllIIIIlI();
    }
    
    private static boolean llllIllllIIIlll(final int lllllllllllllIIIIIllIlllIlllllIl, final int lllllllllllllIIIIIllIlllIlllllII) {
        return lllllllllllllIIIIIllIlllIlllllIl < lllllllllllllIIIIIllIlllIlllllII;
    }
    
    private static boolean llllIllllIIIlIl(final int lllllllllllllIIIIIllIllllIIIIIIl, final int lllllllllllllIIIIIllIllllIIIIIII) {
        return lllllllllllllIIIIIllIllllIIIIIIl == lllllllllllllIIIIIllIllllIIIIIII;
    }
    
    private static boolean llllIllllIIIlII(final int lllllllllllllIIIIIllIlllIllllIlI) {
        return lllllllllllllIIIIIllIlllIllllIlI != 0;
    }
    
    @Override
    public void initGui() {
        super.initGui();
        this.buttonList.clear();
        this.buttonList.add(new GuiButton(GuiConfirmOpenLink.lIllIIIlIIIlII[0], this.width / GuiConfirmOpenLink.lIllIIIlIIIlII[2] - GuiConfirmOpenLink.lIllIIIlIIIlII[8] - GuiConfirmOpenLink.lIllIIIlIIIlII[9], this.height / GuiConfirmOpenLink.lIllIIIlIIIlII[6] + GuiConfirmOpenLink.lIllIIIlIIIlII[10], GuiConfirmOpenLink.lIllIIIlIIIlII[11], GuiConfirmOpenLink.lIllIIIlIIIlII[12], this.confirmButtonText));
        "".length();
        this.buttonList.add(new GuiButton(GuiConfirmOpenLink.lIllIIIlIIIlII[2], this.width / GuiConfirmOpenLink.lIllIIIlIIIlII[2] - GuiConfirmOpenLink.lIllIIIlIIIlII[8], this.height / GuiConfirmOpenLink.lIllIIIlIIIlII[6] + GuiConfirmOpenLink.lIllIIIlIIIlII[10], GuiConfirmOpenLink.lIllIIIlIIIlII[11], GuiConfirmOpenLink.lIllIIIlIIIlII[12], this.copyLinkButtonText));
        "".length();
        this.buttonList.add(new GuiButton(GuiConfirmOpenLink.lIllIIIlIIIlII[1], this.width / GuiConfirmOpenLink.lIllIIIlIIIlII[2] - GuiConfirmOpenLink.lIllIIIlIIIlII[8] + GuiConfirmOpenLink.lIllIIIlIIIlII[9], this.height / GuiConfirmOpenLink.lIllIIIlIIIlII[6] + GuiConfirmOpenLink.lIllIIIlIIIlII[10], GuiConfirmOpenLink.lIllIIIlIIIlII[11], GuiConfirmOpenLink.lIllIIIlIIIlII[12], this.cancelButtonText));
        "".length();
    }
    
    private static String llllIlllIlllllI(final String lllllllllllllIIIIIllIllllIIlIllI, final String lllllllllllllIIIIIllIllllIIlIIll) {
        try {
            final SecretKeySpec lllllllllllllIIIIIllIllllIIllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIllIllllIIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIIllIllllIIllIII = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIIllIllllIIllIII.init(GuiConfirmOpenLink.lIllIIIlIIIlII[2], lllllllllllllIIIIIllIllllIIllIIl);
            return new String(lllllllllllllIIIIIllIllllIIllIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIllIllllIIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIllIllllIIlIlll) {
            lllllllllllllIIIIIllIllllIIlIlll.printStackTrace();
            return null;
        }
    }
    
    public void disableSecurityWarning() {
        this.showSecurityWarning = (GuiConfirmOpenLink.lIllIIIlIIIlII[0] != 0);
    }
    
    private static boolean llllIllllIIIllI(final int lllllllllllllIIIIIllIlllIllllIII) {
        return lllllllllllllIIIIIllIlllIllllIII == 0;
    }
    
    @Override
    protected void actionPerformed(final GuiButton lllllllllllllIIIIIllIlllllIIlIlI) throws IOException {
        if (llllIllllIIIlIl(lllllllllllllIIIIIllIlllllIIlIlI.id, GuiConfirmOpenLink.lIllIIIlIIIlII[2])) {
            this.copyLinkToClipboard();
        }
        final GuiYesNoCallback parentScreen = this.parentScreen;
        int n;
        if (llllIllllIIIllI(lllllllllllllIIIIIllIlllllIIlIlI.id)) {
            n = GuiConfirmOpenLink.lIllIIIlIIIlII[1];
            "".length();
            if (-"   ".length() > 0) {
                return;
            }
        }
        else {
            n = GuiConfirmOpenLink.lIllIIIlIIIlII[0];
        }
        parentScreen.confirmClicked((boolean)(n != 0), this.parentButtonClickedId);
    }
    
    private static void llllIllllIIIIll() {
        (lIllIIIlIIIlII = new int[16])[0] = ((0x36 ^ 0x2A) & ~(0x3E ^ 0x22));
        GuiConfirmOpenLink.lIllIIIlIIIlII[1] = " ".length();
        GuiConfirmOpenLink.lIllIIIlIIIlII[2] = "  ".length();
        GuiConfirmOpenLink.lIllIIIlIIIlII[3] = "   ".length();
        GuiConfirmOpenLink.lIllIIIlIIIlII[4] = (0x8D ^ 0x89);
        GuiConfirmOpenLink.lIllIIIlIIIlII[5] = (0x25 ^ 0x4B ^ (0x0 ^ 0x6B));
        GuiConfirmOpenLink.lIllIIIlIIIlII[6] = (0x47 ^ 0x29 ^ (0xE1 ^ 0x89));
        GuiConfirmOpenLink.lIllIIIlIIIlII[7] = (54 + 57 - 4 + 27 ^ 124 + 26 - 113 + 92);
        GuiConfirmOpenLink.lIllIIIlIIIlII[8] = (0x1C ^ 0x2E);
        GuiConfirmOpenLink.lIllIIIlIIIlII[9] = (0xC1 ^ 0xA8);
        GuiConfirmOpenLink.lIllIIIlIIIlII[10] = (" ".length() ^ (0xF6 ^ 0x97));
        GuiConfirmOpenLink.lIllIIIlIIIlII[11] = (0x95 ^ 0x8C ^ (0xF7 ^ 0x8A));
        GuiConfirmOpenLink.lIllIIIlIIIlII[12] = (0x41 ^ 0x7 ^ (0x63 ^ 0x31));
        GuiConfirmOpenLink.lIllIIIlIIIlII[13] = (0x70 ^ 0x1A ^ (0xB3 ^ 0xB7));
        GuiConfirmOpenLink.lIllIIIlIIIlII[14] = (-(0xFFFFF553 & 0x3BBE) & (-1 & 0xFFFDDD));
        GuiConfirmOpenLink.lIllIIIlIIIlII[15] = (0xA6 ^ 0xAE);
    }
    
    public GuiConfirmOpenLink(final GuiYesNoCallback lllllllllllllIIIIIllIlllllIlIlII, final String lllllllllllllIIIIIllIlllllIlIIll, final int lllllllllllllIIIIIllIlllllIlIlll, final boolean lllllllllllllIIIIIllIlllllIlIIIl) {
        String llllllllllllIlIllIlIIIIIllllIIll;
        if (llllIllllIIIlII(lllllllllllllIIIIIllIlllllIlIIIl ? 1 : 0)) {
            llllllllllllIlIllIlIIIIIllllIIll = GuiConfirmOpenLink.lIllIIIlIIIIll[GuiConfirmOpenLink.lIllIIIlIIIlII[0]];
            "".length();
            if ("   ".length() == 0) {
                throw null;
            }
        }
        else {
            llllllllllllIlIllIlIIIIIllllIIll = GuiConfirmOpenLink.lIllIIIlIIIIll[GuiConfirmOpenLink.lIllIIIlIIIlII[1]];
        }
        super(lllllllllllllIIIIIllIlllllIlIlII, I18n.format(llllllllllllIlIllIlIIIIIllllIIll, new Object[GuiConfirmOpenLink.lIllIIIlIIIlII[0]]), lllllllllllllIIIIIllIlllllIlIIll, lllllllllllllIIIIIllIlllllIlIlll);
        this.showSecurityWarning = (GuiConfirmOpenLink.lIllIIIlIIIlII[1] != 0);
        String llllllllllllIlIllIlIIIIIllllIIll2;
        if (llllIllllIIIlII(lllllllllllllIIIIIllIlllllIlIIIl ? 1 : 0)) {
            llllllllllllIlIllIlIIIIIllllIIll2 = GuiConfirmOpenLink.lIllIIIlIIIIll[GuiConfirmOpenLink.lIllIIIlIIIlII[2]];
            "".length();
            if ("  ".length() == 0) {
                throw null;
            }
        }
        else {
            llllllllllllIlIllIlIIIIIllllIIll2 = GuiConfirmOpenLink.lIllIIIlIIIIll[GuiConfirmOpenLink.lIllIIIlIIIlII[3]];
        }
        this.confirmButtonText = I18n.format(llllllllllllIlIllIlIIIIIllllIIll2, new Object[GuiConfirmOpenLink.lIllIIIlIIIlII[0]]);
        String llllllllllllIlIllIlIIIIIllllIIll3;
        if (llllIllllIIIlII(lllllllllllllIIIIIllIlllllIlIIIl ? 1 : 0)) {
            llllllllllllIlIllIlIIIIIllllIIll3 = GuiConfirmOpenLink.lIllIIIlIIIIll[GuiConfirmOpenLink.lIllIIIlIIIlII[4]];
            "".length();
            if ("  ".length() == "   ".length()) {
                throw null;
            }
        }
        else {
            llllllllllllIlIllIlIIIIIllllIIll3 = GuiConfirmOpenLink.lIllIIIlIIIIll[GuiConfirmOpenLink.lIllIIIlIIIlII[5]];
        }
        this.cancelButtonText = I18n.format(llllllllllllIlIllIlIIIIIllllIIll3, new Object[GuiConfirmOpenLink.lIllIIIlIIIlII[0]]);
        this.copyLinkButtonText = I18n.format(GuiConfirmOpenLink.lIllIIIlIIIIll[GuiConfirmOpenLink.lIllIIIlIIIlII[6]], new Object[GuiConfirmOpenLink.lIllIIIlIIIlII[0]]);
        this.openLinkWarning = I18n.format(GuiConfirmOpenLink.lIllIIIlIIIIll[GuiConfirmOpenLink.lIllIIIlIIIlII[7]], new Object[GuiConfirmOpenLink.lIllIIIlIIIlII[0]]);
        this.linkText = lllllllllllllIIIIIllIlllllIlIIll;
    }
    
    public void copyLinkToClipboard() {
        GuiScreen.setClipboardString(this.linkText);
    }
    
    private static void llllIllllIIIIlI() {
        (lIllIIIlIIIIll = new String[GuiConfirmOpenLink.lIllIIIlIIIlII[15]])[GuiConfirmOpenLink.lIllIIIlIIIlII[0]] = llllIlllIllllIl("+isGOH0v9YhextH+QSrI5e3ldEXhFZCQCG5slcxz3P8=", "TPubr");
        GuiConfirmOpenLink.lIllIIIlIIIIll[GuiConfirmOpenLink.lIllIIIlIIIlII[1]] = llllIlllIllllIl("fA3RlibcUk8qOucICHSzFotVDsE5Ktku", "vKpIn");
        GuiConfirmOpenLink.lIllIIIlIIIIll[GuiConfirmOpenLink.lIllIIIlIIIlII[2]] = llllIlllIlllllI("XUeOR0zfEnIGA+oYrU88sg==", "BgDVx");
        GuiConfirmOpenLink.lIllIIIlIIIIll[GuiConfirmOpenLink.lIllIIIlIIIlII[3]] = llllIlllIllllIl("tKdnUsSC3wo=", "zyCDh");
        GuiConfirmOpenLink.lIllIIIlIIIIll[GuiConfirmOpenLink.lIllIIIlIIIlII[4]] = llllIlllIlllllI("NNiX7af3GxY16SbxEQa7wg==", "zXdxb");
        GuiConfirmOpenLink.lIllIIIlIIIIll[GuiConfirmOpenLink.lIllIIIlIIIlII[5]] = llllIlllIlllllI("vUuiR1WpOCg=", "KBpNy");
        GuiConfirmOpenLink.lIllIIIlIIIIll[GuiConfirmOpenLink.lIllIIIlIIIlII[6]] = llllIllllIIIIIl("BBIHF3sEFRYa", "gzfcU");
        GuiConfirmOpenLink.lIllIIIlIIIIll[GuiConfirmOpenLink.lIllIIIlIIIlII[7]] = llllIlllIlllllI("Ar79/EqNh7dNUefdtYK2wmAOvhLVZWCd", "WzmRs");
    }
    
    @Override
    public void drawScreen(final int lllllllllllllIIIIIllIllllIlllIll, final int lllllllllllllIIIIIllIllllIlllllI, final float lllllllllllllIIIIIllIllllIllllIl) {
        super.drawScreen(lllllllllllllIIIIIllIllllIlllIll, lllllllllllllIIIIIllIllllIlllllI, lllllllllllllIIIIIllIllllIllllIl);
        if (llllIllllIIIlII(this.showSecurityWarning ? 1 : 0)) {
            this.drawCenteredString(this.fontRendererObj, this.openLinkWarning, this.width / GuiConfirmOpenLink.lIllIIIlIIIlII[2], GuiConfirmOpenLink.lIllIIIlIIIlII[13], GuiConfirmOpenLink.lIllIIIlIIIlII[14]);
        }
    }
    
    private static String llllIlllIllllIl(final String lllllllllllllIIIIIllIllllIIIlIIl, final String lllllllllllllIIIIIllIllllIIIlIII) {
        try {
            final SecretKeySpec lllllllllllllIIIIIllIllllIIIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIllIllllIIIlIII.getBytes(StandardCharsets.UTF_8)), GuiConfirmOpenLink.lIllIIIlIIIlII[15]), "DES");
            final Cipher lllllllllllllIIIIIllIllllIIIlIll = Cipher.getInstance("DES");
            lllllllllllllIIIIIllIllllIIIlIll.init(GuiConfirmOpenLink.lIllIIIlIIIlII[2], lllllllllllllIIIIIllIllllIIIllII);
            return new String(lllllllllllllIIIIIllIllllIIIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIllIllllIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIllIllllIIIlIlI) {
            lllllllllllllIIIIIllIllllIIIlIlI.printStackTrace();
            return null;
        }
    }
    
    private static String llllIllllIIIIIl(String lllllllllllllIIIIIllIllllIlIIllI, final String lllllllllllllIIIIIllIllllIlIlIlI) {
        lllllllllllllIIIIIllIllllIlIIllI = (char)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIIllIllllIlIIllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIIllIllllIlIlIIl = new StringBuilder();
        final char[] lllllllllllllIIIIIllIllllIlIlIII = lllllllllllllIIIIIllIllllIlIlIlI.toCharArray();
        int lllllllllllllIIIIIllIllllIlIIlll = GuiConfirmOpenLink.lIllIIIlIIIlII[0];
        final boolean lllllllllllllIIIIIllIllllIlIIIIl = (Object)((String)lllllllllllllIIIIIllIllllIlIIllI).toCharArray();
        final String lllllllllllllIIIIIllIllllIlIIIII = (String)lllllllllllllIIIIIllIllllIlIIIIl.length;
        float lllllllllllllIIIIIllIllllIIlllll = GuiConfirmOpenLink.lIllIIIlIIIlII[0];
        while (llllIllllIIIlll((int)lllllllllllllIIIIIllIllllIIlllll, (int)lllllllllllllIIIIIllIllllIlIIIII)) {
            final char lllllllllllllIIIIIllIllllIlIllII = lllllllllllllIIIIIllIllllIlIIIIl[lllllllllllllIIIIIllIllllIIlllll];
            lllllllllllllIIIIIllIllllIlIlIIl.append((char)(lllllllllllllIIIIIllIllllIlIllII ^ lllllllllllllIIIIIllIllllIlIlIII[lllllllllllllIIIIIllIllllIlIIlll % lllllllllllllIIIIIllIllllIlIlIII.length]));
            "".length();
            ++lllllllllllllIIIIIllIllllIlIIlll;
            ++lllllllllllllIIIIIllIllllIIlllll;
            "".length();
            if (-" ".length() >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIIllIllllIlIlIIl);
    }
}
