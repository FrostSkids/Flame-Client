// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import com.google.common.base.Predicates;
import net.minecraft.util.ChatAllowedCharacters;
import net.minecraft.util.MathHelper;
import com.google.common.base.Predicate;

public class GuiTextField extends Gui
{
    private static final /* synthetic */ String[] lIlIllIIIlllIl;
    private /* synthetic */ boolean isFocused;
    private final /* synthetic */ int width;
    private final /* synthetic */ FontRenderer fontRendererInstance;
    private /* synthetic */ int selectionEnd;
    private /* synthetic */ int maxStringLength;
    private static final /* synthetic */ int[] lIlIllIIIllllI;
    private /* synthetic */ boolean canLoseFocus;
    private /* synthetic */ GuiPageButtonList.GuiResponder field_175210_x;
    private /* synthetic */ boolean visible;
    private final /* synthetic */ int id;
    private /* synthetic */ int cursorPosition;
    private /* synthetic */ String text;
    private final /* synthetic */ int height;
    private /* synthetic */ int enabledColor;
    public /* synthetic */ int xPosition;
    private /* synthetic */ int disabledColor;
    private /* synthetic */ boolean enableBackgroundDrawing;
    private /* synthetic */ int lineScrollOffset;
    public /* synthetic */ int yPosition;
    private /* synthetic */ Predicate<String> field_175209_y;
    private /* synthetic */ boolean isEnabled;
    private /* synthetic */ int cursorCounter;
    
    public void setSelectionPos(int lllllllllllllIIIIlllIIllIlIlllll) {
        final int lllllllllllllIIIIlllIIllIllIIlII = this.text.length();
        if (llllIIIIlIlIIll(lllllllllllllIIIIlllIIllIlIlllll, lllllllllllllIIIIlllIIllIllIIlII)) {
            lllllllllllllIIIIlllIIllIlIlllll = lllllllllllllIIIIlllIIllIllIIlII;
        }
        if (llllIIIIlIllIII(lllllllllllllIIIIlllIIllIlIlllll)) {
            lllllllllllllIIIIlllIIllIlIlllll = GuiTextField.lIlIllIIIllllI[0];
        }
        this.selectionEnd = lllllllllllllIIIIlllIIllIlIlllll;
        if (llllIIIIlIlIllI(this.fontRendererInstance)) {
            if (llllIIIIlIlIIll(this.lineScrollOffset, lllllllllllllIIIIlllIIllIllIIlII)) {
                this.lineScrollOffset = lllllllllllllIIIIlllIIllIllIIlII;
            }
            final int lllllllllllllIIIIlllIIllIllIIIll = this.getWidth();
            final String lllllllllllllIIIIlllIIllIllIIIlI = this.fontRendererInstance.trimStringToWidth(this.text.substring(this.lineScrollOffset), lllllllllllllIIIIlllIIllIllIIIll);
            final int lllllllllllllIIIIlllIIllIllIIIIl = lllllllllllllIIIIlllIIllIllIIIlI.length() + this.lineScrollOffset;
            if (llllIIIIlIllIll(lllllllllllllIIIIlllIIllIlIlllll, this.lineScrollOffset)) {
                this.lineScrollOffset -= this.fontRendererInstance.trimStringToWidth(this.text, lllllllllllllIIIIlllIIllIllIIIll, (boolean)(GuiTextField.lIlIllIIIllllI[2] != 0)).length();
            }
            if (llllIIIIlIlIIll(lllllllllllllIIIIlllIIllIlIlllll, lllllllllllllIIIIlllIIllIllIIIIl)) {
                this.lineScrollOffset += lllllllllllllIIIIlllIIllIlIlllll - lllllllllllllIIIIlllIIllIllIIIIl;
                "".length();
                if (((0x76 ^ 0x45) & ~(0x7C ^ 0x4F)) == "  ".length()) {
                    return;
                }
            }
            else if (llllIIIIlIlllIl(lllllllllllllIIIIlllIIllIlIlllll, this.lineScrollOffset)) {
                this.lineScrollOffset -= this.lineScrollOffset - lllllllllllllIIIIlllIIllIlIlllll;
            }
            this.lineScrollOffset = MathHelper.clamp_int(this.lineScrollOffset, GuiTextField.lIlIllIIIllllI[0], lllllllllllllIIIIlllIIllIllIIlII);
        }
    }
    
    public void setDisabledTextColour(final int lllllllllllllIIIIlllIIlllIIIIIlI) {
        this.disabledColor = lllllllllllllIIIIlllIIlllIIIIIlI;
    }
    
    private static boolean llllIIIIlIlIIll(final int lllllllllllllIIIIlllIIllIIIIIlll, final int lllllllllllllIIIIlllIIllIIIIIllI) {
        return lllllllllllllIIIIlllIIllIIIIIlll > lllllllllllllIIIIlllIIllIIIIIllI;
    }
    
    private static void llllIIIIlIlIIII() {
        (lIlIllIIIlllIl = new String[GuiTextField.lIlIllIIIllllI[16]])[GuiTextField.lIlIllIIIllllI[0]] = llllIIIIlIIllIl("gHKPTdVey/k=", "uTsWv");
        GuiTextField.lIlIllIIIlllIl[GuiTextField.lIlIllIIIllllI[2]] = llllIIIIlIIlllI("a8ZZqvoCqgk=", "FlKCa");
        GuiTextField.lIlIllIIIlllIl[GuiTextField.lIlIllIIIllllI[5]] = llllIIIIlIIllll("", "kXowF");
        GuiTextField.lIlIllIIIlllIl[GuiTextField.lIlIllIIIllllI[6]] = llllIIIIlIIllll("", "uRisL");
        GuiTextField.lIlIllIIIlllIl[GuiTextField.lIlIllIIIllllI[7]] = llllIIIIlIIllll("", "mhOpf");
        GuiTextField.lIlIllIIIlllIl[GuiTextField.lIlIllIIIllllI[9]] = llllIIIIlIIllll("", "wXgzD");
        GuiTextField.lIlIllIIIlllIl[GuiTextField.lIlIllIIIllllI[12]] = llllIIIIlIIllll("Hg==", "ACPXz");
    }
    
    private static boolean llllIIIIlIlllIl(final int lllllllllllllIIIIlllIIllIIIIlIll, final int lllllllllllllIIIIlllIIllIIIIlIlI) {
        return lllllllllllllIIIIlllIIllIIIIlIll <= lllllllllllllIIIIlllIIllIIIIlIlI;
    }
    
    private static boolean llllIIIIlIlIlII(final int lllllllllllllIIIIlllIIllIIIIllll, final int lllllllllllllIIIIlllIIllIIIIlllI) {
        return lllllllllllllIIIIlllIIllIIIIllll < lllllllllllllIIIIlllIIllIIIIlllI;
    }
    
    public String getText() {
        return this.text;
    }
    
    private static void llllIIIIlIlIIIl() {
        (lIlIllIIIllllI = new int[17])[0] = ((0x45 ^ 0x5D ^ (0xFD ^ 0xC4)) & (149 + 143 - 134 + 7 ^ 122 + 71 - 69 + 8 ^ -" ".length()));
        GuiTextField.lIlIllIIIllllI[1] = ("  ".length() ^ (0x67 ^ 0x45));
        GuiTextField.lIlIllIIIllllI[2] = " ".length();
        GuiTextField.lIlIllIIIllllI[3] = (-(0xFFFF9F3F & 0x7DDD) & (-1 & 0xE0FDFC));
        GuiTextField.lIlIllIIIllllI[4] = (-(0xFFFFECCD & 0x1F3E) & (0xFFFFFC7B & 0x707FFF));
        GuiTextField.lIlIllIIIllllI[5] = "  ".length();
        GuiTextField.lIlIllIIIllllI[6] = "   ".length();
        GuiTextField.lIlIllIIIllllI[7] = (37 + 144 - 110 + 94 ^ 85 + 20 - 87 + 143);
        GuiTextField.lIlIllIIIllllI[8] = -" ".length();
        GuiTextField.lIlIllIIIllllI[9] = (0xC4 ^ 0xC1);
        GuiTextField.lIlIllIIIllllI[10] = -(0xFFFFDFEF & 0x5F7F70);
        GuiTextField.lIlIllIIIllllI[11] = -(-(0xFFFFFFFD & 0x5BDB) & (0xFFFFFFDD & 0x1005BFA));
        GuiTextField.lIlIllIIIllllI[12] = (0x70 ^ 0x76);
        GuiTextField.lIlIllIIIllllI[13] = (0x9D ^ 0x95);
        GuiTextField.lIlIllIIIllllI[14] = -(-(0xFFFFC6CF & 0x79B2) & (0xFFFFEFB5 & 0x2F7FFB));
        GuiTextField.lIlIllIIIllllI[15] = (-(0xFFFFF2F5 & 0x2FEF) & (0xFFFFF7FF & 0x3FEF));
        GuiTextField.lIlIllIIIllllI[16] = (0x38 ^ 0x3F ^ ((0x41 ^ 0x7E) & ~(0x23 ^ 0x1C)));
    }
    
    public void deleteFromCursor(final int lllllllllllllIIIIlllIlIIIlIIIllI) {
        if (llllIIIIlIlIIlI(this.text.length())) {
            if (llllIIIIlIlIlll(this.selectionEnd, this.cursorPosition)) {
                this.writeText(GuiTextField.lIlIllIIIlllIl[GuiTextField.lIlIllIIIllllI[6]]);
                "".length();
                if ("  ".length() <= " ".length()) {
                    return;
                }
            }
            else {
                int n;
                if (llllIIIIlIllIII(lllllllllllllIIIIlllIlIIIlIIIllI)) {
                    n = GuiTextField.lIlIllIIIllllI[2];
                    "".length();
                    if (-" ".length() > 0) {
                        return;
                    }
                }
                else {
                    n = GuiTextField.lIlIllIIIllllI[0];
                }
                final boolean lllllllllllllIIIIlllIlIIIlIIlIll = n != 0;
                int cursorPosition;
                if (llllIIIIlIlIIlI(lllllllllllllIIIIlllIlIIIlIIlIll ? 1 : 0)) {
                    cursorPosition = this.cursorPosition + lllllllllllllIIIIlllIlIIIlIIIllI;
                    "".length();
                    if ((0x16 ^ 0x24 ^ (0x43 ^ 0x74)) <= 0) {
                        return;
                    }
                }
                else {
                    cursorPosition = this.cursorPosition;
                }
                final int lllllllllllllIIIIlllIlIIIlIIlIlI = cursorPosition;
                int cursorPosition2;
                if (llllIIIIlIlIIlI(lllllllllllllIIIIlllIlIIIlIIlIll ? 1 : 0)) {
                    cursorPosition2 = this.cursorPosition;
                    "".length();
                    if (((0x57 ^ 0x43) & ~(0xD2 ^ 0xC6)) == " ".length()) {
                        return;
                    }
                }
                else {
                    cursorPosition2 = this.cursorPosition + lllllllllllllIIIIlllIlIIIlIIIllI;
                }
                final int lllllllllllllIIIIlllIlIIIlIIlIIl = cursorPosition2;
                String lllllllllllllIIIIlllIlIIIlIIlIII = GuiTextField.lIlIllIIIlllIl[GuiTextField.lIlIllIIIllllI[7]];
                if (llllIIIIlIllIIl(lllllllllllllIIIIlllIlIIIlIIlIlI)) {
                    lllllllllllllIIIIlllIlIIIlIIlIII = this.text.substring(GuiTextField.lIlIllIIIllllI[0], lllllllllllllIIIIlllIlIIIlIIlIlI);
                }
                if (llllIIIIlIlIlII(lllllllllllllIIIIlllIlIIIlIIlIIl, this.text.length())) {
                    lllllllllllllIIIIlllIlIIIlIIlIII = String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIIIIlllIlIIIlIIlIII)).append(this.text.substring(lllllllllllllIIIIlllIlIIIlIIlIIl)));
                }
                if (llllIIIIlIlIIlI(this.field_175209_y.apply((Object)lllllllllllllIIIIlllIlIIIlIIlIII) ? 1 : 0)) {
                    this.text = lllllllllllllIIIIlllIlIIIlIIlIII;
                    if (llllIIIIlIlIIlI(lllllllllllllIIIIlllIlIIIlIIlIll ? 1 : 0)) {
                        this.moveCursorBy(lllllllllllllIIIIlllIlIIIlIIIllI);
                    }
                    if (llllIIIIlIlIllI(this.field_175210_x)) {
                        this.field_175210_x.func_175319_a(this.id, this.text);
                    }
                }
            }
        }
    }
    
    public void writeText(final String lllllllllllllIIIIlllIlIIIllIlIII) {
        String lllllllllllllIIIIlllIlIIIllIIlll = GuiTextField.lIlIllIIIlllIl[GuiTextField.lIlIllIIIllllI[2]];
        final String lllllllllllllIIIIlllIlIIIllIIllI = ChatAllowedCharacters.filterAllowedCharacters(lllllllllllllIIIIlllIlIIIllIlIII);
        int n;
        if (llllIIIIlIlIlII(this.cursorPosition, this.selectionEnd)) {
            n = this.cursorPosition;
            "".length();
            if ((0x39 ^ 0x3D) <= "   ".length()) {
                return;
            }
        }
        else {
            n = this.selectionEnd;
        }
        final int lllllllllllllIIIIlllIlIIIllIIlIl = n;
        int n2;
        if (llllIIIIlIlIlII(this.cursorPosition, this.selectionEnd)) {
            n2 = this.selectionEnd;
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            n2 = this.cursorPosition;
        }
        final int lllllllllllllIIIIlllIlIIIllIIlII = n2;
        final int lllllllllllllIIIIlllIlIIIllIIIll = this.maxStringLength - this.text.length() - (lllllllllllllIIIIlllIlIIIllIIlIl - lllllllllllllIIIIlllIlIIIllIIlII);
        int lllllllllllllIIIIlllIlIIIllIIIlI = GuiTextField.lIlIllIIIllllI[0];
        if (llllIIIIlIlIlIl(this.text.length())) {
            lllllllllllllIIIIlllIlIIIllIIlll = String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIIIIlllIlIIIllIIlll)).append(this.text.substring(GuiTextField.lIlIllIIIllllI[0], lllllllllllllIIIIlllIlIIIllIIlIl)));
        }
        if (llllIIIIlIlIlII(lllllllllllllIIIIlllIlIIIllIIIll, lllllllllllllIIIIlllIlIIIllIIllI.length())) {
            lllllllllllllIIIIlllIlIIIllIIlll = String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIIIIlllIlIIIllIIlll)).append(lllllllllllllIIIIlllIlIIIllIIllI.substring(GuiTextField.lIlIllIIIllllI[0], lllllllllllllIIIIlllIlIIIllIIIll)));
            lllllllllllllIIIIlllIlIIIllIIIlI = lllllllllllllIIIIlllIlIIIllIIIll;
            "".length();
            if (-" ".length() == (0xAE ^ 0xAA)) {
                return;
            }
        }
        else {
            lllllllllllllIIIIlllIlIIIllIIlll = String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIIIIlllIlIIIllIIlll)).append(lllllllllllllIIIIlllIlIIIllIIllI));
            lllllllllllllIIIIlllIlIIIllIIIlI = lllllllllllllIIIIlllIlIIIllIIllI.length();
        }
        if (llllIIIIlIlIlIl(this.text.length()) && llllIIIIlIlIlII(lllllllllllllIIIIlllIlIIIllIIlII, this.text.length())) {
            lllllllllllllIIIIlllIlIIIllIIlll = String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIIIIlllIlIIIllIIlll)).append(this.text.substring(lllllllllllllIIIIlllIlIIIllIIlII)));
        }
        if (llllIIIIlIlIIlI(this.field_175209_y.apply((Object)lllllllllllllIIIIlllIlIIIllIIlll) ? 1 : 0)) {
            this.text = lllllllllllllIIIIlllIlIIIllIIlll;
            this.moveCursorBy(lllllllllllllIIIIlllIlIIIllIIlIl - this.selectionEnd + lllllllllllllIIIIlllIlIIIllIIIlI);
            if (llllIIIIlIlIllI(this.field_175210_x)) {
                this.field_175210_x.func_175319_a(this.id, this.text);
            }
        }
    }
    
    private static boolean llllIIIIlIllIlI(final int lllllllllllllIIIIlllIIllIIIIIIII) {
        return lllllllllllllIIIIlllIIllIIIIIIII == 0;
    }
    
    public int getWidth() {
        int width;
        if (llllIIIIlIlIIlI(this.getEnableBackgroundDrawing() ? 1 : 0)) {
            width = this.width - GuiTextField.lIlIllIIIllllI[13];
            "".length();
            if (-(0x83 ^ 0x87) >= 0) {
                return (0x1C ^ 0x5C) & ~(0x44 ^ 0x4);
            }
        }
        else {
            width = this.width;
        }
        return width;
    }
    
    public void moveCursorBy(final int lllllllllllllIIIIlllIlIIIIIlIIIl) {
        this.setCursorPosition(this.selectionEnd + lllllllllllllIIIIlllIlIIIIIlIIIl);
    }
    
    private static boolean llllIIIIlIllIII(final int lllllllllllllIIIIlllIIlIllllllII) {
        return lllllllllllllIIIIlllIIlIllllllII < 0;
    }
    
    public void updateCursorCounter() {
        this.cursorCounter += GuiTextField.lIlIllIIIllllI[2];
    }
    
    public void func_175205_a(final Predicate<String> lllllllllllllIIIIlllIlIIIlllIlII) {
        this.field_175209_y = lllllllllllllIIIIlllIlIIIlllIlII;
    }
    
    public void setCursorPositionEnd() {
        this.setCursorPosition(this.text.length());
    }
    
    public void setTextColor(final int lllllllllllllIIIIlllIIlllIIIlIII) {
        this.enabledColor = lllllllllllllIIIIlllIIlllIIIlIII;
    }
    
    private static boolean llllIIIIlIllIll(final int lllllllllllllIIIIlllIIllIIIlIlll, final int lllllllllllllIIIIlllIIllIIIlIllI) {
        return lllllllllllllIIIIlllIIllIIIlIlll == lllllllllllllIIIIlllIIllIIIlIllI;
    }
    
    public void setFocused(final boolean lllllllllllllIIIIlllIIllIllllllI) {
        if (llllIIIIlIlIIlI(lllllllllllllIIIIlllIIllIllllllI ? 1 : 0) && llllIIIIlIllIlI(this.isFocused ? 1 : 0)) {
            this.cursorCounter = GuiTextField.lIlIllIIIllllI[0];
        }
        this.isFocused = lllllllllllllIIIIlllIIllIllllllI;
    }
    
    public int getSelectionEnd() {
        return this.selectionEnd;
    }
    
    private static boolean llllIIIIlIlllII(final int lllllllllllllIIIIlllIIllIIIlIIll, final int lllllllllllllIIIIlllIIllIIIlIIlI) {
        return lllllllllllllIIIIlllIIllIIIlIIll >= lllllllllllllIIIIlllIIllIIIlIIlI;
    }
    
    public boolean getEnableBackgroundDrawing() {
        return this.enableBackgroundDrawing;
    }
    
    public void setVisible(final boolean lllllllllllllIIIIlllIIllIlIIllII) {
        this.visible = lllllllllllllIIIIlllIIllIlIIllII;
    }
    
    public boolean getVisible() {
        return this.visible;
    }
    
    public void drawTextBox() {
        if (llllIIIIlIlIIlI(this.getVisible() ? 1 : 0)) {
            if (llllIIIIlIlIIlI(this.getEnableBackgroundDrawing() ? 1 : 0)) {
                Gui.drawRect(this.xPosition - GuiTextField.lIlIllIIIllllI[2], this.yPosition - GuiTextField.lIlIllIIIllllI[2], this.xPosition + this.width + GuiTextField.lIlIllIIIllllI[2], this.yPosition + this.height + GuiTextField.lIlIllIIIllllI[2], GuiTextField.lIlIllIIIllllI[10]);
                Gui.drawRect(this.xPosition, this.yPosition, this.xPosition + this.width, this.yPosition + this.height, GuiTextField.lIlIllIIIllllI[11]);
            }
            int n;
            if (llllIIIIlIlIIlI(this.isEnabled ? 1 : 0)) {
                n = this.enabledColor;
                "".length();
                if ((0x29 ^ 0x2D) <= "   ".length()) {
                    return;
                }
            }
            else {
                n = this.disabledColor;
            }
            final int lllllllllllllIIIIlllIIllllIlIIll = n;
            final int lllllllllllllIIIIlllIIllllIlIIlI = this.cursorPosition - this.lineScrollOffset;
            int lllllllllllllIIIIlllIIllllIlIIIl = this.selectionEnd - this.lineScrollOffset;
            final String lllllllllllllIIIIlllIIllllIlIIII = this.fontRendererInstance.trimStringToWidth(this.text.substring(this.lineScrollOffset), this.getWidth());
            int n2;
            if (llllIIIIlIllIIl(lllllllllllllIIIIlllIIllllIlIIlI) && llllIIIIlIlllIl(lllllllllllllIIIIlllIIllllIlIIlI, lllllllllllllIIIIlllIIllllIlIIII.length())) {
                n2 = GuiTextField.lIlIllIIIllllI[2];
                "".length();
                if ("   ".length() != "   ".length()) {
                    return;
                }
            }
            else {
                n2 = GuiTextField.lIlIllIIIllllI[0];
            }
            final boolean lllllllllllllIIIIlllIIllllIIllll = n2 != 0;
            int n3;
            if (llllIIIIlIlIIlI(this.isFocused ? 1 : 0) && llllIIIIlIllIlI(this.cursorCounter / GuiTextField.lIlIllIIIllllI[12] % GuiTextField.lIlIllIIIllllI[5]) && llllIIIIlIlIIlI(lllllllllllllIIIIlllIIllllIIllll ? 1 : 0)) {
                n3 = GuiTextField.lIlIllIIIllllI[2];
                "".length();
                if (" ".length() == "   ".length()) {
                    return;
                }
            }
            else {
                n3 = GuiTextField.lIlIllIIIllllI[0];
            }
            final boolean lllllllllllllIIIIlllIIllllIIlllI = n3 != 0;
            int xPosition;
            if (llllIIIIlIlIIlI(this.enableBackgroundDrawing ? 1 : 0)) {
                xPosition = this.xPosition + GuiTextField.lIlIllIIIllllI[7];
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                xPosition = this.xPosition;
            }
            final int lllllllllllllIIIIlllIIllllIIllIl = xPosition;
            int yPosition;
            if (llllIIIIlIlIIlI(this.enableBackgroundDrawing ? 1 : 0)) {
                yPosition = this.yPosition + (this.height - GuiTextField.lIlIllIIIllllI[13]) / GuiTextField.lIlIllIIIllllI[5];
                "".length();
                if (-" ".length() >= 0) {
                    return;
                }
            }
            else {
                yPosition = this.yPosition;
            }
            final int lllllllllllllIIIIlllIIllllIIllII = yPosition;
            int lllllllllllllIIIIlllIIllllIIlIll = lllllllllllllIIIIlllIIllllIIllIl;
            if (llllIIIIlIlIIll(lllllllllllllIIIIlllIIllllIlIIIl, lllllllllllllIIIIlllIIllllIlIIII.length())) {
                lllllllllllllIIIIlllIIllllIlIIIl = lllllllllllllIIIIlllIIllllIlIIII.length();
            }
            if (llllIIIIlIlIlIl(lllllllllllllIIIIlllIIllllIlIIII.length())) {
                String substring;
                if (llllIIIIlIlIIlI(lllllllllllllIIIIlllIIllllIIllll ? 1 : 0)) {
                    substring = lllllllllllllIIIIlllIIllllIlIIII.substring(GuiTextField.lIlIllIIIllllI[0], lllllllllllllIIIIlllIIllllIlIIlI);
                    "".length();
                    if (((0x7C ^ 0x4E) & ~(0x56 ^ 0x64)) != 0x0) {
                        return;
                    }
                }
                else {
                    substring = lllllllllllllIIIIlllIIllllIlIIII;
                }
                final String lllllllllllllIIIIlllIIllllIIlIlI = substring;
                lllllllllllllIIIIlllIIllllIIlIll = this.fontRendererInstance.drawStringWithShadow(lllllllllllllIIIIlllIIllllIIlIlI, (float)lllllllllllllIIIIlllIIllllIIllIl, (float)lllllllllllllIIIIlllIIllllIIllII, lllllllllllllIIIIlllIIllllIlIIll);
            }
            int n4;
            if (llllIIIIlIlllII(this.cursorPosition, this.text.length()) && llllIIIIlIlIlII(this.text.length(), this.getMaxStringLength())) {
                n4 = GuiTextField.lIlIllIIIllllI[0];
                "".length();
                if (((0xB8 ^ 0x93) & ~(0xBA ^ 0x91)) != ((0xEE ^ 0xBD) & ~(0x7A ^ 0x29))) {
                    return;
                }
            }
            else {
                n4 = GuiTextField.lIlIllIIIllllI[2];
            }
            final boolean lllllllllllllIIIIlllIIllllIIlIIl = n4 != 0;
            int lllllllllllllIIIIlllIIllllIIlIII = lllllllllllllIIIIlllIIllllIIlIll;
            if (llllIIIIlIllIlI(lllllllllllllIIIIlllIIllllIIllll ? 1 : 0)) {
                int n5;
                if (llllIIIIlIlIlIl(lllllllllllllIIIIlllIIllllIlIIlI)) {
                    n5 = lllllllllllllIIIIlllIIllllIIllIl + this.width;
                    "".length();
                    if ((("  ".length() ^ (0x29 ^ 0x1E)) & (86 + 102 - 160 + 150 ^ 17 + 6 + 12 + 100 ^ -" ".length())) != 0x0) {
                        return;
                    }
                }
                else {
                    n5 = lllllllllllllIIIIlllIIllllIIllIl;
                }
                lllllllllllllIIIIlllIIllllIIlIII = n5;
                "".length();
                if (((60 + 46 - 29 + 66 ^ 152 + 172 - 252 + 101) & (0x36 ^ 0x55 ^ (0xFB ^ 0xBA) ^ -" ".length())) <= -" ".length()) {
                    return;
                }
            }
            else if (llllIIIIlIlIIlI(lllllllllllllIIIIlllIIllllIIlIIl ? 1 : 0)) {
                lllllllllllllIIIIlllIIllllIIlIII = lllllllllllllIIIIlllIIllllIIlIll - GuiTextField.lIlIllIIIllllI[2];
                --lllllllllllllIIIIlllIIllllIIlIll;
            }
            if (llllIIIIlIlIlIl(lllllllllllllIIIIlllIIllllIlIIII.length()) && llllIIIIlIlIIlI(lllllllllllllIIIIlllIIllllIIllll ? 1 : 0) && llllIIIIlIlIlII(lllllllllllllIIIIlllIIllllIlIIlI, lllllllllllllIIIIlllIIllllIlIIII.length())) {
                lllllllllllllIIIIlllIIllllIIlIll = this.fontRendererInstance.drawStringWithShadow(lllllllllllllIIIIlllIIllllIlIIII.substring(lllllllllllllIIIIlllIIllllIlIIlI), (float)lllllllllllllIIIIlllIIllllIIlIll, (float)lllllllllllllIIIIlllIIllllIIllII, lllllllllllllIIIIlllIIllllIlIIll);
            }
            if (llllIIIIlIlIIlI(lllllllllllllIIIIlllIIllllIIlllI ? 1 : 0)) {
                if (llllIIIIlIlIIlI(lllllllllllllIIIIlllIIllllIIlIIl ? 1 : 0)) {
                    Gui.drawRect(lllllllllllllIIIIlllIIllllIIlIII, lllllllllllllIIIIlllIIllllIIllII - GuiTextField.lIlIllIIIllllI[2], lllllllllllllIIIIlllIIllllIIlIII + GuiTextField.lIlIllIIIllllI[2], lllllllllllllIIIIlllIIllllIIllII + GuiTextField.lIlIllIIIllllI[2] + this.fontRendererInstance.FONT_HEIGHT, GuiTextField.lIlIllIIIllllI[14]);
                    "".length();
                    if (-"  ".length() >= 0) {
                        return;
                    }
                }
                else {
                    this.fontRendererInstance.drawStringWithShadow(GuiTextField.lIlIllIIIlllIl[GuiTextField.lIlIllIIIllllI[12]], (float)lllllllllllllIIIIlllIIllllIIlIII, (float)lllllllllllllIIIIlllIIllllIIllII, lllllllllllllIIIIlllIIllllIlIIll);
                    "".length();
                }
            }
            if (llllIIIIlIlIlll(lllllllllllllIIIIlllIIllllIlIIIl, lllllllllllllIIIIlllIIllllIlIIlI)) {
                final int lllllllllllllIIIIlllIIllllIIIlll = lllllllllllllIIIIlllIIllllIIllIl + this.fontRendererInstance.getStringWidth(lllllllllllllIIIIlllIIllllIlIIII.substring(GuiTextField.lIlIllIIIllllI[0], lllllllllllllIIIIlllIIllllIlIIIl));
                this.drawCursorVertical(lllllllllllllIIIIlllIIllllIIlIII, lllllllllllllIIIIlllIIllllIIllII - GuiTextField.lIlIllIIIllllI[2], lllllllllllllIIIIlllIIllllIIIlll - GuiTextField.lIlIllIIIllllI[2], lllllllllllllIIIIlllIIllllIIllII + GuiTextField.lIlIllIIIllllI[2] + this.fontRendererInstance.FONT_HEIGHT);
            }
        }
    }
    
    public void setEnabled(final boolean lllllllllllllIIIIlllIIllIlllIlIl) {
        this.isEnabled = lllllllllllllIIIIlllIIllIlllIlIl;
    }
    
    public void func_175207_a(final GuiPageButtonList.GuiResponder lllllllllllllIIIIlllIlIIlIIIllll) {
        this.field_175210_x = lllllllllllllIIIIlllIlIIlIIIllll;
    }
    
    private static boolean llllIIIIlIlIIlI(final int lllllllllllllIIIIlllIIllIIIIIIlI) {
        return lllllllllllllIIIIlllIIllIIIIIIlI != 0;
    }
    
    public String getSelectedText() {
        int n;
        if (llllIIIIlIlIlII(this.cursorPosition, this.selectionEnd)) {
            n = this.cursorPosition;
            "".length();
            if ((0xAE ^ 0xAA) == 0x0) {
                return null;
            }
        }
        else {
            n = this.selectionEnd;
        }
        final int lllllllllllllIIIIlllIlIIIlllllII = n;
        int n2;
        if (llllIIIIlIlIlII(this.cursorPosition, this.selectionEnd)) {
            n2 = this.selectionEnd;
            "".length();
            if (((0x4D ^ 0x7B) & ~(0x45 ^ 0x73)) < -" ".length()) {
                return null;
            }
        }
        else {
            n2 = this.cursorPosition;
        }
        final int lllllllllllllIIIIlllIlIIIllllIll = n2;
        return this.text.substring(lllllllllllllIIIIlllIlIIIlllllII, lllllllllllllIIIIlllIlIIIllllIll);
    }
    
    public GuiTextField(final int lllllllllllllIIIIlllIlIIlIIlllll, final FontRenderer lllllllllllllIIIIlllIlIIlIIllllI, final int lllllllllllllIIIIlllIlIIlIIlllIl, final int lllllllllllllIIIIlllIlIIlIIlllII, final int lllllllllllllIIIIlllIlIIlIIllIll, final int lllllllllllllIIIIlllIlIIlIIllIlI) {
        this.text = GuiTextField.lIlIllIIIlllIl[GuiTextField.lIlIllIIIllllI[0]];
        this.maxStringLength = GuiTextField.lIlIllIIIllllI[1];
        this.enableBackgroundDrawing = (GuiTextField.lIlIllIIIllllI[2] != 0);
        this.canLoseFocus = (GuiTextField.lIlIllIIIllllI[2] != 0);
        this.isEnabled = (GuiTextField.lIlIllIIIllllI[2] != 0);
        this.enabledColor = GuiTextField.lIlIllIIIllllI[3];
        this.disabledColor = GuiTextField.lIlIllIIIllllI[4];
        this.visible = (GuiTextField.lIlIllIIIllllI[2] != 0);
        this.field_175209_y = (Predicate<String>)Predicates.alwaysTrue();
        this.id = lllllllllllllIIIIlllIlIIlIIlllll;
        this.fontRendererInstance = lllllllllllllIIIIlllIlIIlIIllllI;
        this.xPosition = lllllllllllllIIIIlllIlIIlIIlllIl;
        this.yPosition = lllllllllllllIIIIlllIlIIlIIlllII;
        this.width = lllllllllllllIIIIlllIlIIlIIllIll;
        this.height = lllllllllllllIIIIlllIlIIlIIllIlI;
    }
    
    public void setMaxStringLength(final int lllllllllllllIIIIlllIIlllIIlllll) {
        this.maxStringLength = lllllllllllllIIIIlllIIlllIIlllll;
        if (llllIIIIlIlIIll(this.text.length(), lllllllllllllIIIIlllIIlllIIlllll)) {
            this.text = this.text.substring(GuiTextField.lIlIllIIIllllI[0], lllllllllllllIIIIlllIIlllIIlllll);
        }
    }
    
    public int getCursorPosition() {
        return this.cursorPosition;
    }
    
    public int func_146197_a(final int lllllllllllllIIIIlllIlIIIIIlllII, final int lllllllllllllIIIIlllIlIIIIIllIll, final boolean lllllllllllllIIIIlllIlIIIIIllIlI) {
        int lllllllllllllIIIIlllIlIIIIlIIIlI = lllllllllllllIIIIlllIlIIIIIllIll;
        int n;
        if (llllIIIIlIllIII(lllllllllllllIIIIlllIlIIIIIlllII)) {
            n = GuiTextField.lIlIllIIIllllI[2];
            "".length();
            if ("  ".length() <= 0) {
                return (134 + 134 - 115 + 22 ^ 22 + 48 + 9 + 88) & ("   ".length() ^ (0xD ^ 0x6) ^ -" ".length());
            }
        }
        else {
            n = GuiTextField.lIlIllIIIllllI[0];
        }
        final boolean lllllllllllllIIIIlllIlIIIIlIIIIl = n != 0;
        final int lllllllllllllIIIIlllIlIIIIlIIIII = Math.abs(lllllllllllllIIIIlllIlIIIIIlllII);
        int lllllllllllllIIIIlllIlIIIIIlllll = GuiTextField.lIlIllIIIllllI[0];
        "".length();
        if ((0x2A ^ 0xD ^ (0x48 ^ 0x6B)) <= 0) {
            return " ".length() & (" ".length() ^ -" ".length());
        }
        while (!llllIIIIlIlllII(lllllllllllllIIIIlllIlIIIIIlllll, lllllllllllllIIIIlllIlIIIIlIIIII)) {
            if (llllIIIIlIllIlI(lllllllllllllIIIIlllIlIIIIlIIIIl ? 1 : 0)) {
                final int lllllllllllllIIIIlllIlIIIIIllllI = this.text.length();
                lllllllllllllIIIIlllIlIIIIlIIIlI = this.text.indexOf(GuiTextField.lIlIllIIIllllI[1], lllllllllllllIIIIlllIlIIIIlIIIlI);
                if (llllIIIIlIllIll(lllllllllllllIIIIlllIlIIIIlIIIlI, GuiTextField.lIlIllIIIllllI[8])) {
                    lllllllllllllIIIIlllIlIIIIlIIIlI = lllllllllllllIIIIlllIlIIIIIllllI;
                    "".length();
                    if (-" ".length() > (0x21 ^ 0x25)) {
                        return (0x4B ^ 0x6D) & ~(0x4A ^ 0x6C);
                    }
                }
                else {
                    while (llllIIIIlIlIIlI(lllllllllllllIIIIlllIlIIIIIllIlI ? 1 : 0) && llllIIIIlIlIlII(lllllllllllllIIIIlllIlIIIIlIIIlI, lllllllllllllIIIIlllIlIIIIIllllI)) {
                        if (llllIIIIlIlIlll(this.text.charAt(lllllllllllllIIIIlllIlIIIIlIIIlI), GuiTextField.lIlIllIIIllllI[1])) {
                            "".length();
                            if ((103 + 113 - 159 + 82 ^ 5 + 57 + 35 + 46) <= 0) {
                                return (0xED ^ 0x82 ^ (0x20 ^ 0x7C)) & (126 + 115 - 184 + 79 ^ 88 + 23 - 73 + 149 ^ -" ".length());
                            }
                            break;
                        }
                        else {
                            ++lllllllllllllIIIIlllIlIIIIlIIIlI;
                        }
                    }
                }
            }
            else {
                while (llllIIIIlIlIIlI(lllllllllllllIIIIlllIlIIIIIllIlI ? 1 : 0) && llllIIIIlIlIlIl(lllllllllllllIIIIlllIlIIIIlIIIlI)) {
                    if (llllIIIIlIlIlll(this.text.charAt(lllllllllllllIIIIlllIlIIIIlIIIlI - GuiTextField.lIlIllIIIllllI[2]), GuiTextField.lIlIllIIIllllI[1])) {
                        "".length();
                        if (-" ".length() >= "   ".length()) {
                            return (0xD5 ^ 0x84) & ~(0xE5 ^ 0xB4);
                        }
                        break;
                    }
                    else {
                        --lllllllllllllIIIIlllIlIIIIlIIIlI;
                    }
                }
                while (llllIIIIlIlIlIl(lllllllllllllIIIIlllIlIIIIlIIIlI) && !llllIIIIlIllIll(this.text.charAt(lllllllllllllIIIIlllIlIIIIlIIIlI - GuiTextField.lIlIllIIIllllI[2]), GuiTextField.lIlIllIIIllllI[1])) {
                    --lllllllllllllIIIIlllIlIIIIlIIIlI;
                }
            }
            ++lllllllllllllIIIIlllIlIIIIIlllll;
        }
        return lllllllllllllIIIIlllIlIIIIlIIIlI;
    }
    
    private static boolean llllIIIIlIlIlIl(final int lllllllllllllIIIIlllIIlIlllllIlI) {
        return lllllllllllllIIIIlllIIlIlllllIlI > 0;
    }
    
    public void deleteWords(final int lllllllllllllIIIIlllIlIIIlIlIllI) {
        if (llllIIIIlIlIIlI(this.text.length())) {
            if (llllIIIIlIlIlll(this.selectionEnd, this.cursorPosition)) {
                this.writeText(GuiTextField.lIlIllIIIlllIl[GuiTextField.lIlIllIIIllllI[5]]);
                "".length();
                if (-(4 + 109 + 14 + 13 ^ 9 + 48 - 7 + 87) >= 0) {
                    return;
                }
            }
            else {
                this.deleteFromCursor(this.getNthWordFromCursor(lllllllllllllIIIIlllIlIIIlIlIllI) - this.cursorPosition);
            }
        }
    }
    
    public void setEnableBackgroundDrawing(final boolean lllllllllllllIIIIlllIIlllIIIlllI) {
        this.enableBackgroundDrawing = lllllllllllllIIIIlllIIlllIIIlllI;
    }
    
    public void mouseClicked(final int lllllllllllllIIIIlllIIlllllIIlll, final int lllllllllllllIIIIlllIIlllllIIllI, final int lllllllllllllIIIIlllIIlllllIllII) {
        int n;
        if (llllIIIIlIlllII(lllllllllllllIIIIlllIIlllllIIlll, this.xPosition) && llllIIIIlIlIlII(lllllllllllllIIIIlllIIlllllIIlll, this.xPosition + this.width) && llllIIIIlIlllII(lllllllllllllIIIIlllIIlllllIIllI, this.yPosition) && llllIIIIlIlIlII(lllllllllllllIIIIlllIIlllllIIllI, this.yPosition + this.height)) {
            n = GuiTextField.lIlIllIIIllllI[2];
            "".length();
            if ((0x9B ^ 0xC1 ^ (0x1E ^ 0x40)) <= 0) {
                return;
            }
        }
        else {
            n = GuiTextField.lIlIllIIIllllI[0];
        }
        final boolean lllllllllllllIIIIlllIIlllllIlIll = n != 0;
        if (llllIIIIlIlIIlI(this.canLoseFocus ? 1 : 0)) {
            this.setFocused(lllllllllllllIIIIlllIIlllllIlIll);
        }
        if (llllIIIIlIlIIlI(this.isFocused ? 1 : 0) && llllIIIIlIlIIlI(lllllllllllllIIIIlllIIlllllIlIll ? 1 : 0) && llllIIIIlIllIlI(lllllllllllllIIIIlllIIlllllIllII)) {
            int lllllllllllllIIIIlllIIlllllIlIlI = lllllllllllllIIIIlllIIlllllIIlll - this.xPosition;
            if (llllIIIIlIlIIlI(this.enableBackgroundDrawing ? 1 : 0)) {
                lllllllllllllIIIIlllIIlllllIlIlI -= 4;
            }
            final String lllllllllllllIIIIlllIIlllllIlIIl = this.fontRendererInstance.trimStringToWidth(this.text.substring(this.lineScrollOffset), this.getWidth());
            this.setCursorPosition(this.fontRendererInstance.trimStringToWidth(lllllllllllllIIIIlllIIlllllIlIIl, lllllllllllllIIIIlllIIlllllIlIlI).length() + this.lineScrollOffset);
        }
    }
    
    public int getNthWordFromCursor(final int lllllllllllllIIIIlllIlIIIIlllIIl) {
        return this.getNthWordFromPos(lllllllllllllIIIIlllIlIIIIlllIIl, this.getCursorPosition());
    }
    
    private static String llllIIIIlIIllIl(final String lllllllllllllIIIIlllIIllIlIIIIlI, final String lllllllllllllIIIIlllIIllIlIIIIIl) {
        try {
            final SecretKeySpec lllllllllllllIIIIlllIIllIlIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlllIIllIlIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIlllIIllIlIIIllI = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIlllIIllIlIIIllI.init(GuiTextField.lIlIllIIIllllI[5], lllllllllllllIIIIlllIIllIlIIIlll);
            return new String(lllllllllllllIIIIlllIIllIlIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlllIIllIlIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlllIIllIlIIIlIl) {
            lllllllllllllIIIIlllIIllIlIIIlIl.printStackTrace();
            return null;
        }
    }
    
    public void setText(final String lllllllllllllIIIIlllIlIIlIIIIlII) {
        if (llllIIIIlIlIIlI(this.field_175209_y.apply((Object)lllllllllllllIIIIlllIlIIlIIIIlII) ? 1 : 0)) {
            if (llllIIIIlIlIIll(lllllllllllllIIIIlllIlIIlIIIIlII.length(), this.maxStringLength)) {
                this.text = lllllllllllllIIIIlllIlIIlIIIIlII.substring(GuiTextField.lIlIllIIIllllI[0], this.maxStringLength);
                "".length();
                if (-" ".length() >= (0x88 ^ 0x8C)) {
                    return;
                }
            }
            else {
                this.text = lllllllllllllIIIIlllIlIIlIIIIlII;
            }
            this.setCursorPositionEnd();
        }
    }
    
    private static String llllIIIIlIIllll(String lllllllllllllIIIIlllIIllIIlIIIlI, final String lllllllllllllIIIIlllIIllIIlIIIIl) {
        lllllllllllllIIIIlllIIllIIlIIIlI = (short)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIlllIIllIIlIIIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIlllIIllIIlIIlIl = new StringBuilder();
        final char[] lllllllllllllIIIIlllIIllIIlIIlII = lllllllllllllIIIIlllIIllIIlIIIIl.toCharArray();
        int lllllllllllllIIIIlllIIllIIlIIIll = GuiTextField.lIlIllIIIllllI[0];
        final byte lllllllllllllIIIIlllIIllIIIlllIl = (Object)((String)lllllllllllllIIIIlllIIllIIlIIIlI).toCharArray();
        final float lllllllllllllIIIIlllIIllIIIlllII = lllllllllllllIIIIlllIIllIIIlllIl.length;
        int lllllllllllllIIIIlllIIllIIIllIll = GuiTextField.lIlIllIIIllllI[0];
        while (llllIIIIlIlIlII(lllllllllllllIIIIlllIIllIIIllIll, (int)lllllllllllllIIIIlllIIllIIIlllII)) {
            final char lllllllllllllIIIIlllIIllIIlIlIII = lllllllllllllIIIIlllIIllIIIlllIl[lllllllllllllIIIIlllIIllIIIllIll];
            lllllllllllllIIIIlllIIllIIlIIlIl.append((char)(lllllllllllllIIIIlllIIllIIlIlIII ^ lllllllllllllIIIIlllIIllIIlIIlII[lllllllllllllIIIIlllIIllIIlIIIll % lllllllllllllIIIIlllIIllIIlIIlII.length]));
            "".length();
            ++lllllllllllllIIIIlllIIllIIlIIIll;
            ++lllllllllllllIIIIlllIIllIIIllIll;
            "".length();
            if ((0xC4 ^ 0xC0) == 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIlllIIllIIlIIlIl);
    }
    
    public void setCanLoseFocus(final boolean lllllllllllllIIIIlllIIllIlIlIlIl) {
        this.canLoseFocus = lllllllllllllIIIIlllIIllIlIlIlIl;
    }
    
    private static boolean llllIIIIlIllIIl(final int lllllllllllllIIIIlllIIlIlllllllI) {
        return lllllllllllllIIIIlllIIlIlllllllI >= 0;
    }
    
    private static String llllIIIIlIIlllI(final String lllllllllllllIIIIlllIIllIIllIlIl, final String lllllllllllllIIIIlllIIllIIllIlII) {
        try {
            final SecretKeySpec lllllllllllllIIIIlllIIllIIlllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlllIIllIIllIlII.getBytes(StandardCharsets.UTF_8)), GuiTextField.lIlIllIIIllllI[13]), "DES");
            final Cipher lllllllllllllIIIIlllIIllIIlllIIl = Cipher.getInstance("DES");
            lllllllllllllIIIIlllIIllIIlllIIl.init(GuiTextField.lIlIllIIIllllI[5], lllllllllllllIIIIlllIIllIIlllIlI);
            return new String(lllllllllllllIIIIlllIIllIIlllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlllIIllIIllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlllIIllIIlllIII) {
            lllllllllllllIIIIlllIIllIIlllIII.printStackTrace();
            return null;
        }
    }
    
    public boolean isFocused() {
        return this.isFocused;
    }
    
    public void setCursorPositionZero() {
        this.setCursorPosition(GuiTextField.lIlIllIIIllllI[0]);
    }
    
    public boolean textboxKeyTyped(final char lllllllllllllIIIIlllIIlllllllIll, final int lllllllllllllIIIIlllIIllllllIlll) {
        if (llllIIIIlIllIlI(this.isFocused ? 1 : 0)) {
            return GuiTextField.lIlIllIIIllllI[0] != 0;
        }
        if (llllIIIIlIlIIlI(GuiScreen.isKeyComboCtrlA(lllllllllllllIIIIlllIIllllllIlll) ? 1 : 0)) {
            this.setCursorPositionEnd();
            this.setSelectionPos(GuiTextField.lIlIllIIIllllI[0]);
            return GuiTextField.lIlIllIIIllllI[2] != 0;
        }
        if (llllIIIIlIlIIlI(GuiScreen.isKeyComboCtrlC(lllllllllllllIIIIlllIIllllllIlll) ? 1 : 0)) {
            GuiScreen.setClipboardString(this.getSelectedText());
            return GuiTextField.lIlIllIIIllllI[2] != 0;
        }
        if (llllIIIIlIlIIlI(GuiScreen.isKeyComboCtrlV(lllllllllllllIIIIlllIIllllllIlll) ? 1 : 0)) {
            if (llllIIIIlIlIIlI(this.isEnabled ? 1 : 0)) {
                this.writeText(GuiScreen.getClipboardString());
            }
            return GuiTextField.lIlIllIIIllllI[2] != 0;
        }
        if (llllIIIIlIlIIlI(GuiScreen.isKeyComboCtrlX(lllllllllllllIIIIlllIIllllllIlll) ? 1 : 0)) {
            GuiScreen.setClipboardString(this.getSelectedText());
            if (llllIIIIlIlIIlI(this.isEnabled ? 1 : 0)) {
                this.writeText(GuiTextField.lIlIllIIIlllIl[GuiTextField.lIlIllIIIllllI[9]]);
            }
            return GuiTextField.lIlIllIIIllllI[2] != 0;
        }
        switch (lllllllllllllIIIIlllIIllllllIlll) {
            case 14: {
                if (llllIIIIlIlIIlI(GuiScreen.isCtrlKeyDown() ? 1 : 0)) {
                    if (llllIIIIlIlIIlI(this.isEnabled ? 1 : 0)) {
                        this.deleteWords(GuiTextField.lIlIllIIIllllI[8]);
                        "".length();
                        if ("  ".length() > (0x9A ^ 0x9C ^ "  ".length())) {
                            return ((0x7D ^ 0x1F ^ (0xEB ^ 0x9E)) & (57 + 115 - 129 + 106 ^ 49 + 74 - 74 + 81 ^ -" ".length())) != 0x0;
                        }
                    }
                }
                else if (llllIIIIlIlIIlI(this.isEnabled ? 1 : 0)) {
                    this.deleteFromCursor(GuiTextField.lIlIllIIIllllI[8]);
                }
                return GuiTextField.lIlIllIIIllllI[2] != 0;
            }
            case 199: {
                if (llllIIIIlIlIIlI(GuiScreen.isShiftKeyDown() ? 1 : 0)) {
                    this.setSelectionPos(GuiTextField.lIlIllIIIllllI[0]);
                    "".length();
                    if (null != null) {
                        return ((0x4B ^ 0x75 ^ (0xF0 ^ 0x8B)) & (0xCF ^ 0xA3 ^ (0x91 ^ 0xB8) ^ -" ".length())) != 0x0;
                    }
                }
                else {
                    this.setCursorPositionZero();
                }
                return GuiTextField.lIlIllIIIllllI[2] != 0;
            }
            case 203: {
                if (llllIIIIlIlIIlI(GuiScreen.isShiftKeyDown() ? 1 : 0)) {
                    if (llllIIIIlIlIIlI(GuiScreen.isCtrlKeyDown() ? 1 : 0)) {
                        this.setSelectionPos(this.getNthWordFromPos(GuiTextField.lIlIllIIIllllI[8], this.getSelectionEnd()));
                        "".length();
                        if ((0x23 ^ 0x27) < -" ".length()) {
                            return ((0x12 ^ 0x43) & ~(0x5A ^ 0xB)) != 0x0;
                        }
                    }
                    else {
                        this.setSelectionPos(this.getSelectionEnd() - GuiTextField.lIlIllIIIllllI[2]);
                        "".length();
                        if (((0x6E ^ 0x68) & ~(0x7C ^ 0x7A)) >= (0xC2 ^ 0xC6)) {
                            return ((0xB1 ^ 0x89) & ~(0x14 ^ 0x2C)) != 0x0;
                        }
                    }
                }
                else if (llllIIIIlIlIIlI(GuiScreen.isCtrlKeyDown() ? 1 : 0)) {
                    this.setCursorPosition(this.getNthWordFromCursor(GuiTextField.lIlIllIIIllllI[8]));
                    "".length();
                    if (" ".length() < -" ".length()) {
                        return ((92 + 2 + 97 + 53 ^ 45 + 118 - 51 + 80) & (61 + 55 + 18 + 1 ^ 78 + 138 - 154 + 117 ^ -" ".length())) != 0x0;
                    }
                }
                else {
                    this.moveCursorBy(GuiTextField.lIlIllIIIllllI[8]);
                }
                return GuiTextField.lIlIllIIIllllI[2] != 0;
            }
            case 205: {
                if (llllIIIIlIlIIlI(GuiScreen.isShiftKeyDown() ? 1 : 0)) {
                    if (llllIIIIlIlIIlI(GuiScreen.isCtrlKeyDown() ? 1 : 0)) {
                        this.setSelectionPos(this.getNthWordFromPos(GuiTextField.lIlIllIIIllllI[2], this.getSelectionEnd()));
                        "".length();
                        if (null != null) {
                            return ((0x4B ^ 0x5C) & ~(0x25 ^ 0x32)) != 0x0;
                        }
                    }
                    else {
                        this.setSelectionPos(this.getSelectionEnd() + GuiTextField.lIlIllIIIllllI[2]);
                        "".length();
                        if ("   ".length() == 0) {
                            return ((0x2E ^ 0x29) & ~(0x7F ^ 0x78)) != 0x0;
                        }
                    }
                }
                else if (llllIIIIlIlIIlI(GuiScreen.isCtrlKeyDown() ? 1 : 0)) {
                    this.setCursorPosition(this.getNthWordFromCursor(GuiTextField.lIlIllIIIllllI[2]));
                    "".length();
                    if (-(135 + 73 - 175 + 135 ^ 134 + 130 - 108 + 16) > 0) {
                        return ((0xE1 ^ 0xC0 ^ (0x49 ^ 0x53)) & (0x64 ^ 0x29 ^ (0x59 ^ 0x2F) ^ -" ".length())) != 0x0;
                    }
                }
                else {
                    this.moveCursorBy(GuiTextField.lIlIllIIIllllI[2]);
                }
                return GuiTextField.lIlIllIIIllllI[2] != 0;
            }
            case 207: {
                if (llllIIIIlIlIIlI(GuiScreen.isShiftKeyDown() ? 1 : 0)) {
                    this.setSelectionPos(this.text.length());
                    "".length();
                    if (((0xE6 ^ 0xA4) & ~(0x2E ^ 0x6C)) != 0x0) {
                        return ((0x65 ^ 0x31) & ~(0x5F ^ 0xB)) != 0x0;
                    }
                }
                else {
                    this.setCursorPositionEnd();
                }
                return GuiTextField.lIlIllIIIllllI[2] != 0;
            }
            case 211: {
                if (llllIIIIlIlIIlI(GuiScreen.isCtrlKeyDown() ? 1 : 0)) {
                    if (llllIIIIlIlIIlI(this.isEnabled ? 1 : 0)) {
                        this.deleteWords(GuiTextField.lIlIllIIIllllI[2]);
                        "".length();
                        if (-"  ".length() > 0) {
                            return ((67 + 80 - 50 + 69 ^ 48 + 13 + 17 + 61) & (0xCB ^ 0x9C ^ (0x46 ^ 0x3C) ^ -" ".length())) != 0x0;
                        }
                    }
                }
                else if (llllIIIIlIlIIlI(this.isEnabled ? 1 : 0)) {
                    this.deleteFromCursor(GuiTextField.lIlIllIIIllllI[2]);
                }
                return GuiTextField.lIlIllIIIllllI[2] != 0;
            }
            default: {
                if (llllIIIIlIlIIlI(ChatAllowedCharacters.isAllowedCharacter(lllllllllllllIIIIlllIIlllllllIll) ? 1 : 0)) {
                    if (llllIIIIlIlIIlI(this.isEnabled ? 1 : 0)) {
                        this.writeText(Character.toString(lllllllllllllIIIIlllIIlllllllIll));
                    }
                    return GuiTextField.lIlIllIIIllllI[2] != 0;
                }
                return GuiTextField.lIlIllIIIllllI[0] != 0;
            }
        }
    }
    
    private void drawCursorVertical(int lllllllllllllIIIIlllIIlllIlIlIII, int lllllllllllllIIIIlllIIlllIlIIlll, int lllllllllllllIIIIlllIIlllIlIIllI, int lllllllllllllIIIIlllIIlllIlIIlIl) {
        if (llllIIIIlIlIlII(lllllllllllllIIIIlllIIlllIlIlIII, (int)lllllllllllllIIIIlllIIlllIlIIllI)) {
            final int lllllllllllllIIIIlllIIlllIlIllIl = lllllllllllllIIIIlllIIlllIlIlIII;
            lllllllllllllIIIIlllIIlllIlIlIII = (int)lllllllllllllIIIIlllIIlllIlIIllI;
            lllllllllllllIIIIlllIIlllIlIIllI = lllllllllllllIIIIlllIIlllIlIllIl;
        }
        if (llllIIIIlIlIlII(lllllllllllllIIIIlllIIlllIlIIlll, (int)lllllllllllllIIIIlllIIlllIlIIlIl)) {
            final int lllllllllllllIIIIlllIIlllIlIllII = lllllllllllllIIIIlllIIlllIlIIlll;
            lllllllllllllIIIIlllIIlllIlIIlll = (int)lllllllllllllIIIIlllIIlllIlIIlIl;
            lllllllllllllIIIIlllIIlllIlIIlIl = lllllllllllllIIIIlllIIlllIlIllII;
        }
        if (llllIIIIlIlIIll((int)lllllllllllllIIIIlllIIlllIlIIllI, this.xPosition + this.width)) {
            lllllllllllllIIIIlllIIlllIlIIllI = this.xPosition + this.width;
        }
        if (llllIIIIlIlIIll(lllllllllllllIIIIlllIIlllIlIlIII, this.xPosition + this.width)) {
            lllllllllllllIIIIlllIIlllIlIlIII = this.xPosition + this.width;
        }
        final Tessellator lllllllllllllIIIIlllIIlllIlIlIll = Tessellator.getInstance();
        final WorldRenderer lllllllllllllIIIIlllIIlllIlIlIlI = lllllllllllllIIIIlllIIlllIlIlIll.getWorldRenderer();
        GlStateManager.color(0.0f, 0.0f, 255.0f, 255.0f);
        GlStateManager.disableTexture2D();
        GlStateManager.enableColorLogic();
        GlStateManager.colorLogicOp(GuiTextField.lIlIllIIIllllI[15]);
        lllllllllllllIIIIlllIIlllIlIlIlI.begin(GuiTextField.lIlIllIIIllllI[16], DefaultVertexFormats.POSITION);
        lllllllllllllIIIIlllIIlllIlIlIlI.pos(lllllllllllllIIIIlllIIlllIlIlIII, (double)lllllllllllllIIIIlllIIlllIlIIlIl, 0.0).endVertex();
        lllllllllllllIIIIlllIIlllIlIlIlI.pos((double)lllllllllllllIIIIlllIIlllIlIIllI, (double)lllllllllllllIIIIlllIIlllIlIIlIl, 0.0).endVertex();
        lllllllllllllIIIIlllIIlllIlIlIlI.pos((double)lllllllllllllIIIIlllIIlllIlIIllI, lllllllllllllIIIIlllIIlllIlIIlll, 0.0).endVertex();
        lllllllllllllIIIIlllIIlllIlIlIlI.pos(lllllllllllllIIIIlllIIlllIlIlIII, lllllllllllllIIIIlllIIlllIlIIlll, 0.0).endVertex();
        lllllllllllllIIIIlllIIlllIlIlIll.draw();
        GlStateManager.disableColorLogic();
        GlStateManager.enableTexture2D();
    }
    
    public int getNthWordFromPos(final int lllllllllllllIIIIlllIlIIIIllIIIl, final int lllllllllllllIIIIlllIlIIIIllIIII) {
        return this.func_146197_a(lllllllllllllIIIIlllIlIIIIllIIIl, lllllllllllllIIIIlllIlIIIIllIIII, (boolean)(GuiTextField.lIlIllIIIllllI[2] != 0));
    }
    
    private static boolean llllIIIIlIlIlll(final int lllllllllllllIIIIlllIIlIllllIlll, final int lllllllllllllIIIIlllIIlIllllIllI) {
        return lllllllllllllIIIIlllIIlIllllIlll != lllllllllllllIIIIlllIIlIllllIllI;
    }
    
    static {
        llllIIIIlIlIIIl();
        llllIIIIlIlIIII();
    }
    
    public int getId() {
        return this.id;
    }
    
    public int getMaxStringLength() {
        return this.maxStringLength;
    }
    
    public void setCursorPosition(final int lllllllllllllIIIIlllIlIIIIIIIlll) {
        this.cursorPosition = lllllllllllllIIIIlllIlIIIIIIIlll;
        final int lllllllllllllIIIIlllIlIIIIIIlIIl = this.text.length();
        this.cursorPosition = MathHelper.clamp_int(this.cursorPosition, GuiTextField.lIlIllIIIllllI[0], lllllllllllllIIIIlllIlIIIIIIlIIl);
        this.setSelectionPos(this.cursorPosition);
    }
    
    private static boolean llllIIIIlIlIllI(final Object lllllllllllllIIIIlllIIllIIIIIlII) {
        return lllllllllllllIIIIlllIIllIIIIIlII != null;
    }
}
