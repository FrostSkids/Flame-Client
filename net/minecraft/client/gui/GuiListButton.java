// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import net.minecraft.client.Minecraft;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.client.resources.I18n;

public class GuiListButton extends GuiButton
{
    private final /* synthetic */ GuiPageButtonList.GuiResponder guiResponder;
    private /* synthetic */ String localizationStr;
    private /* synthetic */ boolean field_175216_o;
    private static final /* synthetic */ String[] llIlIlIlllllIl;
    private static final /* synthetic */ int[] llIlIlIllllllI;
    
    private static void lIIlIlIIllIlIIII() {
        (llIlIlIlllllIl = new String[GuiListButton.llIlIlIllllllI[6]])[GuiListButton.llIlIlIllllllI[2]] = lIIlIlIIllIIlllI("", "JlCZn");
        GuiListButton.llIlIlIlllllIl[GuiListButton.llIlIlIllllllI[3]] = lIIlIlIIllIIllll("M9pIbRxweFk=", "dJfzQ");
        GuiListButton.llIlIlIlllllIl[GuiListButton.llIlIlIllllllI[4]] = lIIlIlIIllIIlllI("ERE5bwwTFw==", "vdPAu");
        GuiListButton.llIlIlIlllllIl[GuiListButton.llIlIlIllllllI[5]] = lIIlIlIIllIIlllI("AyEfeCAL", "dTvVN");
    }
    
    private String buildDisplayString() {
        final StringBuilder append = new StringBuilder(String.valueOf(I18n.format(this.localizationStr, new Object[GuiListButton.llIlIlIllllllI[2]]))).append(GuiListButton.llIlIlIlllllIl[GuiListButton.llIlIlIllllllI[3]]);
        String str;
        if (lIIlIlIIllIlIIlI(this.field_175216_o ? 1 : 0)) {
            str = I18n.format(GuiListButton.llIlIlIlllllIl[GuiListButton.llIlIlIllllllI[4]], new Object[GuiListButton.llIlIlIllllllI[2]]);
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            str = I18n.format(GuiListButton.llIlIlIlllllIl[GuiListButton.llIlIlIllllllI[5]], new Object[GuiListButton.llIlIlIllllllI[2]]);
        }
        return String.valueOf(append.append(str));
    }
    
    public void func_175212_b(final boolean llllllllllllIllIlIIlllllIIIllIll) {
        this.field_175216_o = llllllllllllIllIlIIlllllIIIllIll;
        this.displayString = this.buildDisplayString();
        this.guiResponder.func_175321_a(this.id, llllllllllllIllIlIIlllllIIIllIll);
    }
    
    private static boolean lIIlIlIIllIlIIll(final int llllllllllllIllIlIIllllIlllIIlll, final int llllllllllllIllIlIIllllIlllIIllI) {
        return llllllllllllIllIlIIllllIlllIIlll < llllllllllllIllIlIIllllIlllIIllI;
    }
    
    public GuiListButton(final GuiPageButtonList.GuiResponder llllllllllllIllIlIIlllllIIllIIII, final int llllllllllllIllIlIIlllllIIlIllll, final int llllllllllllIllIlIIlllllIIlIIlll, final int llllllllllllIllIlIIlllllIIlIllIl, final String llllllllllllIllIlIIlllllIIlIIlIl, final boolean llllllllllllIllIlIIlllllIIlIIlII) {
        super(llllllllllllIllIlIIlllllIIlIllll, llllllllllllIllIlIIlllllIIlIIlll, llllllllllllIllIlIIlllllIIlIllIl, GuiListButton.llIlIlIllllllI[0], GuiListButton.llIlIlIllllllI[1], GuiListButton.llIlIlIlllllIl[GuiListButton.llIlIlIllllllI[2]]);
        this.localizationStr = llllllllllllIllIlIIlllllIIlIIlIl;
        this.field_175216_o = llllllllllllIllIlIIlllllIIlIIlII;
        this.displayString = this.buildDisplayString();
        this.guiResponder = llllllllllllIllIlIIlllllIIllIIII;
    }
    
    private static String lIIlIlIIllIIlllI(String llllllllllllIllIlIIllllIllllIIlI, final String llllllllllllIllIlIIllllIllllIIIl) {
        llllllllllllIllIlIIllllIllllIIlI = new String(Base64.getDecoder().decode(llllllllllllIllIlIIllllIllllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIIllllIllllIlIl = new StringBuilder();
        final char[] llllllllllllIllIlIIllllIllllIlII = llllllllllllIllIlIIllllIllllIIIl.toCharArray();
        int llllllllllllIllIlIIllllIllllIIll = GuiListButton.llIlIlIllllllI[2];
        final String llllllllllllIllIlIIllllIlllIllIl = (Object)llllllllllllIllIlIIllllIllllIIlI.toCharArray();
        final byte llllllllllllIllIlIIllllIlllIllII = (byte)llllllllllllIllIlIIllllIlllIllIl.length;
        Exception llllllllllllIllIlIIllllIlllIlIll = (Exception)GuiListButton.llIlIlIllllllI[2];
        while (lIIlIlIIllIlIIll((int)llllllllllllIllIlIIllllIlllIlIll, llllllllllllIllIlIIllllIlllIllII)) {
            final char llllllllllllIllIlIIllllIlllllIII = llllllllllllIllIlIIllllIlllIllIl[llllllllllllIllIlIIllllIlllIlIll];
            llllllllllllIllIlIIllllIllllIlIl.append((char)(llllllllllllIllIlIIllllIlllllIII ^ llllllllllllIllIlIIllllIllllIlII[llllllllllllIllIlIIllllIllllIIll % llllllllllllIllIlIIllllIllllIlII.length]));
            "".length();
            ++llllllllllllIllIlIIllllIllllIIll;
            ++llllllllllllIllIlIIllllIlllIlIll;
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIIllllIllllIlIl);
    }
    
    @Override
    public boolean mousePressed(final Minecraft llllllllllllIllIlIIlllllIIIlIlIl, final int llllllllllllIllIlIIlllllIIIlIIII, final int llllllllllllIllIlIIlllllIIIlIIll) {
        if (lIIlIlIIllIlIIlI(super.mousePressed(llllllllllllIllIlIIlllllIIIlIlIl, llllllllllllIllIlIIlllllIIIlIIII, llllllllllllIllIlIIlllllIIIlIIll) ? 1 : 0)) {
            int field_175216_o;
            if (lIIlIlIIllIlIIlI(this.field_175216_o ? 1 : 0)) {
                field_175216_o = GuiListButton.llIlIlIllllllI[2];
                "".length();
                if ((0xA1 ^ 0x8E ^ (0x56 ^ 0x7D)) != (11 + 73 - 82 + 129 ^ 132 + 11 - 89 + 81)) {
                    return ((0x14 ^ 0x10 ^ (0x4F ^ 0x2B)) & (149 + 66 - 171 + 167 ^ 87 + 163 - 159 + 88 ^ -" ".length())) != 0x0;
                }
            }
            else {
                field_175216_o = GuiListButton.llIlIlIllllllI[3];
            }
            this.field_175216_o = (field_175216_o != 0);
            this.displayString = this.buildDisplayString();
            this.guiResponder.func_175321_a(this.id, this.field_175216_o);
            return GuiListButton.llIlIlIllllllI[3] != 0;
        }
        return GuiListButton.llIlIlIllllllI[2] != 0;
    }
    
    private static void lIIlIlIIllIlIIIl() {
        (llIlIlIllllllI = new int[8])[0] = 137 + 83 - 215 + 145;
        GuiListButton.llIlIlIllllllI[1] = (0x8F ^ 0x9B);
        GuiListButton.llIlIlIllllllI[2] = (" ".length() & ~" ".length());
        GuiListButton.llIlIlIllllllI[3] = " ".length();
        GuiListButton.llIlIlIllllllI[4] = "  ".length();
        GuiListButton.llIlIlIllllllI[5] = "   ".length();
        GuiListButton.llIlIlIllllllI[6] = (26 + 124 - 40 + 22 ^ 125 + 36 - 122 + 89);
        GuiListButton.llIlIlIllllllI[7] = (0x53 ^ 0x5B);
    }
    
    private static String lIIlIlIIllIIllll(final String llllllllllllIllIlIIlllllIIIIIlll, final String llllllllllllIllIlIIlllllIIIIIllI) {
        try {
            final SecretKeySpec llllllllllllIllIlIIlllllIIIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIlllllIIIIIllI.getBytes(StandardCharsets.UTF_8)), GuiListButton.llIlIlIllllllI[7]), "DES");
            final Cipher llllllllllllIllIlIIlllllIIIIlIIl = Cipher.getInstance("DES");
            llllllllllllIllIlIIlllllIIIIlIIl.init(GuiListButton.llIlIlIllllllI[4], llllllllllllIllIlIIlllllIIIIlIlI);
            return new String(llllllllllllIllIlIIlllllIIIIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIlllllIIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIIlllllIIIIlIII) {
            llllllllllllIllIlIIlllllIIIIlIII.printStackTrace();
            return null;
        }
    }
    
    static {
        lIIlIlIIllIlIIIl();
        lIIlIlIIllIlIIII();
    }
    
    private static boolean lIIlIlIIllIlIIlI(final int llllllllllllIllIlIIllllIlllIIlII) {
        return llllllllllllIllIlIIllllIlllIIlII != 0;
    }
}
