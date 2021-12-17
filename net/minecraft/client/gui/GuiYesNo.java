// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import java.util.Iterator;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.resources.I18n;
import java.io.IOException;
import java.util.Collection;
import com.google.common.collect.Lists;
import java.util.List;

public class GuiYesNo extends GuiScreen
{
    private static final /* synthetic */ String[] llIlIlIlIIIlIl;
    private /* synthetic */ int ticksUntilEnable;
    protected /* synthetic */ int parentButtonClickedId;
    protected /* synthetic */ String confirmButtonText;
    private static final /* synthetic */ int[] llIlIlIlIIIlll;
    protected /* synthetic */ String messageLine1;
    private final /* synthetic */ List<String> field_175298_s;
    private /* synthetic */ String messageLine2;
    protected /* synthetic */ GuiYesNoCallback parentScreen;
    protected /* synthetic */ String cancelButtonText;
    
    @Override
    public void updateScreen() {
        super.updateScreen();
        final int n = this.ticksUntilEnable - GuiYesNo.llIlIlIlIIIlll[1];
        this.ticksUntilEnable = n;
        if (lIIlIlIIIlIIIIIl(n)) {
            final float llllllllllllIllIlIlIIlllIllIllII = (float)this.buttonList.iterator();
            "".length();
            if (null != null) {
                return;
            }
            while (!lIIlIlIIIlIIIIIl(((Iterator)llllllllllllIllIlIlIIlllIllIllII).hasNext() ? 1 : 0)) {
                final GuiButton llllllllllllIllIlIlIIlllIllIllll = ((Iterator<GuiButton>)llllllllllllIllIlIlIIlllIllIllII).next();
                llllllllllllIllIlIlIIlllIllIllll.enabled = (GuiYesNo.llIlIlIlIIIlll[1] != 0);
            }
        }
    }
    
    public GuiYesNo(final GuiYesNoCallback llllllllllllIllIlIlIIllllIlIIIIl, final String llllllllllllIllIlIlIIllllIlIIlll, final String llllllllllllIllIlIlIIllllIlIIllI, final String llllllllllllIllIlIlIIllllIIllllI, final String llllllllllllIllIlIlIIllllIlIIlII, final int llllllllllllIllIlIlIIllllIlIIIll) {
        this.field_175298_s = (List<String>)Lists.newArrayList();
        this.parentScreen = llllllllllllIllIlIlIIllllIlIIIIl;
        this.messageLine1 = llllllllllllIllIlIlIIllllIlIIlll;
        this.messageLine2 = llllllllllllIllIlIlIIllllIlIIllI;
        this.confirmButtonText = llllllllllllIllIlIlIIllllIIllllI;
        this.cancelButtonText = llllllllllllIllIlIlIIllllIlIIlII;
        this.parentButtonClickedId = llllllllllllIllIlIlIIllllIlIIIll;
    }
    
    @Override
    public void initGui() {
        this.buttonList.add(new GuiOptionButton(GuiYesNo.llIlIlIlIIIlll[0], this.width / GuiYesNo.llIlIlIlIIIlll[2] - GuiYesNo.llIlIlIlIIIlll[3], this.height / GuiYesNo.llIlIlIlIIIlll[4] + GuiYesNo.llIlIlIlIIIlll[5], this.confirmButtonText));
        "".length();
        this.buttonList.add(new GuiOptionButton(GuiYesNo.llIlIlIlIIIlll[1], this.width / GuiYesNo.llIlIlIlIIIlll[2] - GuiYesNo.llIlIlIlIIIlll[3] + GuiYesNo.llIlIlIlIIIlll[6], this.height / GuiYesNo.llIlIlIlIIIlll[4] + GuiYesNo.llIlIlIlIIIlll[5], this.cancelButtonText));
        "".length();
        this.field_175298_s.clear();
        this.field_175298_s.addAll(this.fontRendererObj.listFormattedStringToWidth(this.messageLine2, this.width - GuiYesNo.llIlIlIlIIIlll[7]));
        "".length();
    }
    
    public void setButtonDelay(final int llllllllllllIllIlIlIIlllIllllIIl) {
        this.ticksUntilEnable = llllllllllllIllIlIlIIlllIllllIIl;
        final char llllllllllllIllIlIlIIlllIlllIlII = (char)this.buttonList.iterator();
        "".length();
        if ((0xDB ^ 0x9D ^ (0xCF ^ 0x8D)) <= " ".length()) {
            return;
        }
        while (!lIIlIlIIIlIIIIIl(((Iterator)llllllllllllIllIlIlIIlllIlllIlII).hasNext() ? 1 : 0)) {
            final GuiButton llllllllllllIllIlIlIIlllIllllIII = ((Iterator<GuiButton>)llllllllllllIllIlIlIIlllIlllIlII).next();
            llllllllllllIllIlIlIIlllIllllIII.enabled = (GuiYesNo.llIlIlIlIIIlll[0] != 0);
        }
    }
    
    private static void lIIlIlIIIIlllIII() {
        (llIlIlIlIIIlIl = new String[GuiYesNo.llIlIlIlIIIlll[2]])[GuiYesNo.llIlIlIlIIIlll[0]] = lIIlIlIIIIllIllI("CT5OZ8T9Ab8=", "PgwRg");
        GuiYesNo.llIlIlIlIIIlIl[GuiYesNo.llIlIlIlIIIlll[1]] = lIIlIlIIIIllIlll("9u9/C660x/Q=", "Gpbnp");
    }
    
    @Override
    protected void actionPerformed(final GuiButton llllllllllllIllIlIlIIllllIIlIIll) throws IOException {
        final GuiYesNoCallback parentScreen = this.parentScreen;
        int n;
        if (lIIlIlIIIlIIIIIl(llllllllllllIllIlIlIIllllIIlIIll.id)) {
            n = GuiYesNo.llIlIlIlIIIlll[1];
            "".length();
            if (((0x2D ^ 0x77 ^ (0x2B ^ 0x25)) & (0xA7 ^ 0xB0 ^ (0x21 ^ 0x62) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else {
            n = GuiYesNo.llIlIlIlIIIlll[0];
        }
        parentScreen.confirmClicked((boolean)(n != 0), this.parentButtonClickedId);
    }
    
    public GuiYesNo(final GuiYesNoCallback llllllllllllIllIlIlIIllllIlllIIl, final String llllllllllllIllIlIlIIllllIllIIll, final String llllllllllllIllIlIlIIllllIllIIlI, final int llllllllllllIllIlIlIIllllIllIllI) {
        this.field_175298_s = (List<String>)Lists.newArrayList();
        this.parentScreen = llllllllllllIllIlIlIIllllIlllIIl;
        this.messageLine1 = llllllllllllIllIlIlIIllllIllIIll;
        this.messageLine2 = llllllllllllIllIlIlIIllllIllIIlI;
        this.parentButtonClickedId = llllllllllllIllIlIlIIllllIllIllI;
        this.confirmButtonText = I18n.format(GuiYesNo.llIlIlIlIIIlIl[GuiYesNo.llIlIlIlIIIlll[0]], new Object[GuiYesNo.llIlIlIlIIIlll[0]]);
        this.cancelButtonText = I18n.format(GuiYesNo.llIlIlIlIIIlIl[GuiYesNo.llIlIlIlIIIlll[1]], new Object[GuiYesNo.llIlIlIlIIIlll[0]]);
    }
    
    @Override
    public void drawScreen(final int llllllllllllIllIlIlIIllllIIIIlII, final int llllllllllllIllIlIlIIllllIIIIIll, final float llllllllllllIllIlIlIIllllIIIlIII) {
        this.drawDefaultBackground();
        this.drawCenteredString(this.fontRendererObj, this.messageLine1, this.width / GuiYesNo.llIlIlIlIIIlll[2], GuiYesNo.llIlIlIlIIIlll[8], GuiYesNo.llIlIlIlIIIlll[9]);
        int llllllllllllIllIlIlIIllllIIIIlll = GuiYesNo.llIlIlIlIIIlll[10];
        final long llllllllllllIllIlIlIIlllIlllllll = (long)this.field_175298_s.iterator();
        "".length();
        if ("  ".length() != "  ".length()) {
            return;
        }
        while (!lIIlIlIIIlIIIIIl(((Iterator)llllllllllllIllIlIlIIlllIlllllll).hasNext() ? 1 : 0)) {
            final String llllllllllllIllIlIlIIllllIIIIllI = ((Iterator<String>)llllllllllllIllIlIlIIlllIlllllll).next();
            this.drawCenteredString(this.fontRendererObj, llllllllllllIllIlIlIIllllIIIIllI, this.width / GuiYesNo.llIlIlIlIIIlll[2], llllllllllllIllIlIlIIllllIIIIlll, GuiYesNo.llIlIlIlIIIlll[9]);
            llllllllllllIllIlIlIIllllIIIIlll += this.fontRendererObj.FONT_HEIGHT;
        }
        super.drawScreen(llllllllllllIllIlIlIIllllIIIIlII, llllllllllllIllIlIlIIllllIIIIIll, llllllllllllIllIlIlIIllllIIIlIII);
    }
    
    private static String lIIlIlIIIIllIlll(final String llllllllllllIllIlIlIIlllIlIlIlll, final String llllllllllllIllIlIlIIlllIlIlIllI) {
        try {
            final SecretKeySpec llllllllllllIllIlIlIIlllIlIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlIIlllIlIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlIlIIlllIlIllIIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIlIlIIlllIlIllIIl.init(GuiYesNo.llIlIlIlIIIlll[2], llllllllllllIllIlIlIIlllIlIllIlI);
            return new String(llllllllllllIllIlIlIIlllIlIllIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlIIlllIlIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIlIIlllIlIllIII) {
            llllllllllllIllIlIlIIlllIlIllIII.printStackTrace();
            return null;
        }
    }
    
    private static void lIIlIlIIIlIIIIII() {
        (llIlIlIlIIIlll = new int[12])[0] = ((82 + 4 - 40 + 138 ^ 146 + 120 - 139 + 36) & (0xF ^ 0x35 ^ (0xBA ^ 0x9B) ^ -" ".length()));
        GuiYesNo.llIlIlIlIIIlll[1] = " ".length();
        GuiYesNo.llIlIlIlIIIlll[2] = "  ".length();
        GuiYesNo.llIlIlIlIIIlll[3] = 65 + 16 - 20 + 70 + (0x3 ^ 0x26) - (60 + 141 - 146 + 104) + (56 + 30 + 4 + 56);
        GuiYesNo.llIlIlIlIIIlll[4] = (0x2 ^ 0x5A ^ (0x30 ^ 0x6E));
        GuiYesNo.llIlIlIlIIIlll[5] = (0x46 ^ 0x26);
        GuiYesNo.llIlIlIlIIIlll[6] = (0x52 ^ 0x10) + (0x8F ^ 0xAC) - -(0xAC ^ 0x9D) + (0xBF ^ 0xB5);
        GuiYesNo.llIlIlIlIIIlll[7] = (0x35 ^ 0x57 ^ (0xD7 ^ 0x87));
        GuiYesNo.llIlIlIlIIIlll[8] = (0x3B ^ 0x7D);
        GuiYesNo.llIlIlIlIIIlll[9] = (-1 & 0xFFFFFF);
        GuiYesNo.llIlIlIlIIIlll[10] = (0xE2 ^ 0xB8);
        GuiYesNo.llIlIlIlIIIlll[11] = (0x33 ^ 0x3E ^ (0x1B ^ 0x1E));
    }
    
    private static String lIIlIlIIIIllIllI(final String llllllllllllIllIlIlIIlllIllIIIlI, final String llllllllllllIllIlIlIIlllIllIIIIl) {
        try {
            final SecretKeySpec llllllllllllIllIlIlIIlllIllIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlIIlllIllIIIIl.getBytes(StandardCharsets.UTF_8)), GuiYesNo.llIlIlIlIIIlll[11]), "DES");
            final Cipher llllllllllllIllIlIlIIlllIllIIllI = Cipher.getInstance("DES");
            llllllllllllIllIlIlIIlllIllIIllI.init(GuiYesNo.llIlIlIlIIIlll[2], llllllllllllIllIlIlIIlllIllIIlll);
            return new String(llllllllllllIllIlIlIIlllIllIIllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlIIlllIllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIlIIlllIllIIlIl) {
            llllllllllllIllIlIlIIlllIllIIlIl.printStackTrace();
            return null;
        }
    }
    
    static {
        lIIlIlIIIlIIIIII();
        lIIlIlIIIIlllIII();
    }
    
    private static boolean lIIlIlIIIlIIIIIl(final int llllllllllllIllIlIlIIlllIlIlIIII) {
        return llllllllllllIllIlIlIIlllIlIlIIII == 0;
    }
}
