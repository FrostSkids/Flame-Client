// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.gui;

import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.Graphics;
import org.lwjgl.Sys;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.Font;
import org.newdawn.slick.Color;

public class TextField extends AbstractComponent
{
    private /* synthetic */ boolean consume;
    protected /* synthetic */ int x;
    private /* synthetic */ int width;
    private /* synthetic */ boolean visibleCursor;
    private /* synthetic */ Color background;
    protected /* synthetic */ int y;
    private /* synthetic */ int cursorPos;
    private /* synthetic */ String oldText;
    private /* synthetic */ int maxCharacter;
    private /* synthetic */ Font font;
    private /* synthetic */ char lastChar;
    private /* synthetic */ int lastKey;
    private /* synthetic */ Color border;
    private /* synthetic */ Color text;
    private /* synthetic */ String value;
    private /* synthetic */ int oldCursorPos;
    private static final /* synthetic */ int[] llllIIlIIIllI;
    private /* synthetic */ long repeatTimer;
    private /* synthetic */ int height;
    private static final /* synthetic */ String[] llllIIIlllIlI;
    
    private static String lIlIlIIIIIIlIll(final String lllllllllllllIlIlllIlIIIlllIIllI, final String lllllllllllllIlIlllIlIIIlllIIIll) {
        try {
            final SecretKeySpec lllllllllllllIlIlllIlIIIlllIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlllIlIIIlllIIIll.getBytes(StandardCharsets.UTF_8)), TextField.llllIIlIIIllI[21]), "DES");
            final Cipher lllllllllllllIlIlllIlIIIlllIlIII = Cipher.getInstance("DES");
            lllllllllllllIlIlllIlIIIlllIlIII.init(TextField.llllIIlIIIllI[4], lllllllllllllIlIlllIlIIIlllIlIIl);
            return new String(lllllllllllllIlIlllIlIIIlllIlIII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlllIlIIIlllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlllIlIIIlllIIlll) {
            lllllllllllllIlIlllIlIIIlllIIlll.printStackTrace();
            return null;
        }
    }
    
    protected void doUndo(final int lllllllllllllIlIlllIlIIlIIlllIII, final String lllllllllllllIlIlllIlIIlIIlllIll) {
        if (lIlIlIIIIlIIIII(lllllllllllllIlIlllIlIIlIIlllIll)) {
            this.setText(lllllllllllllIlIlllIlIIlIIlllIll);
            this.setCursorPos(lllllllllllllIlIlllIlIIlIIlllIII);
        }
    }
    
    private static boolean lIlIlIIIIlIIIlI(final int lllllllllllllIlIlllIlIIIllIllIlI, final int lllllllllllllIlIlllIlIIIllIllIIl) {
        return lllllllllllllIlIlllIlIIIllIllIlI < lllllllllllllIlIlllIlIIIllIllIIl;
    }
    
    @Override
    public void keyPressed(final int lllllllllllllIlIlllIlIIlIIIllIll, final char lllllllllllllIlIlllIlIIlIIIlIlII) {
        if (lIlIlIIIIIllllI(this.hasFocus() ? 1 : 0)) {
            if (lIlIlIIIIIlllIl(lllllllllllllIlIlllIlIIlIIIllIll, TextField.llllIIlIIIllI[3])) {
                if (lIlIlIIIIlIIIll(lllllllllllllIlIlllIlIIlIIIllIll, TextField.llllIIlIIIllI[5]) && (!lIlIlIIIIlIIlII(this.input.isKeyDown(TextField.llllIIlIIIllI[6]) ? 1 : 0) || lIlIlIIIIIllllI(this.input.isKeyDown(TextField.llllIIlIIIllI[7]) ? 1 : 0))) {
                    final String lllllllllllllIlIlllIlIIlIIIllllI = Sys.getClipboard();
                    if (lIlIlIIIIlIIIII(lllllllllllllIlIlllIlIIlIIIllllI)) {
                        this.doPaste(lllllllllllllIlIlllIlIIlIIIllllI);
                    }
                    return;
                }
                if (lIlIlIIIIlIIIll(lllllllllllllIlIlllIlIIlIIIllIll, TextField.llllIIlIIIllI[8]) && (!lIlIlIIIIlIIlII(this.input.isKeyDown(TextField.llllIIlIIIllI[6]) ? 1 : 0) || lIlIlIIIIIllllI(this.input.isKeyDown(TextField.llllIIlIIIllI[7]) ? 1 : 0))) {
                    if (lIlIlIIIIlIIIII(this.oldText)) {
                        this.doUndo(this.oldCursorPos, this.oldText);
                    }
                    return;
                }
                if (!lIlIlIIIIlIIlII(this.input.isKeyDown(TextField.llllIIlIIIllI[6]) ? 1 : 0) || lIlIlIIIIIllllI(this.input.isKeyDown(TextField.llllIIlIIIllI[7]) ? 1 : 0)) {
                    return;
                }
                if (!lIlIlIIIIlIIlII(this.input.isKeyDown(TextField.llllIIlIIIllI[9]) ? 1 : 0) || lIlIlIIIIIllllI(this.input.isKeyDown(TextField.llllIIlIIIllI[10]) ? 1 : 0)) {
                    return;
                }
            }
            if (lIlIlIIIIIlllIl(this.lastKey, lllllllllllllIlIlllIlIIlIIIllIll)) {
                this.lastKey = lllllllllllllIlIlllIlIIlIIIllIll;
                this.repeatTimer = System.currentTimeMillis() + 400L;
                "".length();
                if (-" ".length() >= (0x5A ^ 0x5E)) {
                    return;
                }
            }
            else {
                this.repeatTimer = System.currentTimeMillis() + 50L;
            }
            this.lastChar = lllllllllllllIlIlllIlIIlIIIlIlII;
            if (lIlIlIIIIlIIIll(lllllllllllllIlIlllIlIIlIIIllIll, TextField.llllIIlIIIllI[11])) {
                if (lIlIlIIIIlIIlIl(this.cursorPos)) {
                    this.cursorPos -= TextField.llllIIlIIIllI[2];
                }
                if (lIlIlIIIIIllllI(this.consume ? 1 : 0)) {
                    this.container.getInput().consumeEvent();
                    "".length();
                    if (((144 + 79 - 48 + 11 ^ 39 + 30 - 29 + 89) & (0x86 ^ 0x95 ^ (0x1E ^ 0x36) ^ -" ".length())) > ((0x84 ^ 0xAA ^ (0x1F ^ 0x2D)) & (0xBC ^ 0x80 ^ (0xAD ^ 0x8D) ^ -" ".length()))) {
                        return;
                    }
                }
            }
            else if (lIlIlIIIIlIIIll(lllllllllllllIlIlllIlIIlIIIllIll, TextField.llllIIlIIIllI[12])) {
                if (lIlIlIIIIlIIIlI(this.cursorPos, this.value.length())) {
                    this.cursorPos += TextField.llllIIlIIIllI[2];
                }
                if (lIlIlIIIIIllllI(this.consume ? 1 : 0)) {
                    this.container.getInput().consumeEvent();
                    "".length();
                    if ("   ".length() != "   ".length()) {
                        return;
                    }
                }
            }
            else if (lIlIlIIIIlIIIll(lllllllllllllIlIlllIlIIlIIIllIll, TextField.llllIIlIIIllI[13])) {
                if (lIlIlIIIIlIIlIl(this.cursorPos) && lIlIlIIIIlIIlIl(this.value.length())) {
                    if (lIlIlIIIIlIIIlI(this.cursorPos, this.value.length())) {
                        this.value = String.valueOf(new StringBuilder().append(this.value.substring(TextField.llllIIlIIIllI[1], this.cursorPos - TextField.llllIIlIIIllI[2])).append(this.value.substring(this.cursorPos)));
                        "".length();
                        if ("   ".length() < " ".length()) {
                            return;
                        }
                    }
                    else {
                        this.value = this.value.substring(TextField.llllIIlIIIllI[1], this.cursorPos - TextField.llllIIlIIIllI[2]);
                    }
                    this.cursorPos -= TextField.llllIIlIIIllI[2];
                }
                if (lIlIlIIIIIllllI(this.consume ? 1 : 0)) {
                    this.container.getInput().consumeEvent();
                    "".length();
                    if (-" ".length() != -" ".length()) {
                        return;
                    }
                }
            }
            else if (lIlIlIIIIlIIIll(lllllllllllllIlIlllIlIIlIIIllIll, TextField.llllIIlIIIllI[14])) {
                if (lIlIlIIIIlIIIIl(this.value.length(), this.cursorPos)) {
                    this.value = String.valueOf(new StringBuilder().append(this.value.substring(TextField.llllIIlIIIllI[1], this.cursorPos)).append(this.value.substring(this.cursorPos + TextField.llllIIlIIIllI[2])));
                }
                if (lIlIlIIIIIllllI(this.consume ? 1 : 0)) {
                    this.container.getInput().consumeEvent();
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
            }
            else if (lIlIlIIIIlIIIlI(lllllllllllllIlIlllIlIIlIIIlIlII, TextField.llllIIlIIIllI[15]) && lIlIlIIIIlIIIIl(lllllllllllllIlIlllIlIIlIIIlIlII, TextField.llllIIlIIIllI[16]) && lIlIlIIIIlIIIlI(this.value.length(), this.maxCharacter)) {
                if (lIlIlIIIIlIIIlI(this.cursorPos, this.value.length())) {
                    this.value = String.valueOf(new StringBuilder().append(this.value.substring(TextField.llllIIlIIIllI[1], this.cursorPos)).append(lllllllllllllIlIlllIlIIlIIIlIlII).append(this.value.substring(this.cursorPos)));
                    "".length();
                    if ((0x7F ^ 0x7B) <= 0) {
                        return;
                    }
                }
                else {
                    this.value = String.valueOf(new StringBuilder().append(this.value.substring(TextField.llllIIlIIIllI[1], this.cursorPos)).append(lllllllllllllIlIlllIlIIlIIIlIlII));
                }
                this.cursorPos += TextField.llllIIlIIIllI[2];
                if (lIlIlIIIIIllllI(this.consume ? 1 : 0)) {
                    this.container.getInput().consumeEvent();
                    "".length();
                    if (" ".length() <= ((0x5 ^ 0x7D ^ (0x2F ^ 0x5)) & (91 + 17 + 34 + 99 ^ 65 + 89 - 83 + 92 ^ -" ".length()))) {
                        return;
                    }
                }
            }
            else if (lIlIlIIIIlIIIll(lllllllllllllIlIlllIlIIlIIIllIll, TextField.llllIIlIIIllI[17])) {
                this.notifyListeners();
                if (lIlIlIIIIIllllI(this.consume ? 1 : 0)) {
                    this.container.getInput().consumeEvent();
                }
            }
        }
    }
    
    protected void recordOldPosition() {
        this.oldText = this.getText();
        this.oldCursorPos = this.cursorPos;
    }
    
    public void setMaxLength(final int lllllllllllllIlIlllIlIIlIlIlIIlI) {
        this.maxCharacter = lllllllllllllIlIlllIlIIlIlIlIIlI;
        if (lIlIlIIIIlIIIIl(this.value.length(), this.maxCharacter)) {
            this.value = this.value.substring(TextField.llllIIlIIIllI[1], this.maxCharacter);
        }
    }
    
    private static boolean lIlIlIIIIIllllI(final int lllllllllllllIlIlllIlIIIllIlIIIl) {
        return lllllllllllllIlIlllIlIIIllIlIIIl != 0;
    }
    
    public void setTextColor(final Color lllllllllllllIlIlllIlIIllIIIIIll) {
        this.text = lllllllllllllIlIlllIlIIllIIIIIll;
    }
    
    private static int lIlIlIIIIIlllII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean lIlIlIIIIlIIlII(final int lllllllllllllIlIlllIlIIIllIIllll) {
        return lllllllllllllIlIlllIlIIIllIIllll == 0;
    }
    
    private static boolean lIlIlIIIIlIIIll(final int lllllllllllllIlIlllIlIIIllIllllI, final int lllllllllllllIlIlllIlIIIllIlllIl) {
        return lllllllllllllIlIlllIlIIIllIllllI == lllllllllllllIlIlllIlIIIllIlllIl;
    }
    
    @Override
    public void render(final GUIContext lllllllllllllIlIlllIlIIlIllllIlI, final Graphics lllllllllllllIlIlllIlIIlIllllIIl) {
        if (lIlIlIIIIIlllIl(this.lastKey, TextField.llllIIlIIIllI[3])) {
            if (lIlIlIIIIIllllI(this.input.isKeyDown(this.lastKey) ? 1 : 0)) {
                if (lIlIlIIIIIlllll(lIlIlIIIIIlllII(this.repeatTimer, System.currentTimeMillis()))) {
                    this.repeatTimer = System.currentTimeMillis() + 50L;
                    this.keyPressed(this.lastKey, this.lastChar);
                    "".length();
                    if ((((0x91 ^ 0x80) & ~(0x7A ^ 0x6B)) ^ (0x1E ^ 0x1A)) == 0x0) {
                        return;
                    }
                }
            }
            else {
                this.lastKey = TextField.llllIIlIIIllI[3];
            }
        }
        final Rectangle lllllllllllllIlIlllIlIIlIllllIII = lllllllllllllIlIlllIlIIlIllllIIl.getClip();
        lllllllllllllIlIlllIlIIlIllllIIl.setWorldClip((float)this.x, (float)this.y, (float)this.width, (float)this.height);
        final Color lllllllllllllIlIlllIlIIlIlllIlll = lllllllllllllIlIlllIlIIlIllllIIl.getColor();
        if (lIlIlIIIIlIIIII(this.background)) {
            lllllllllllllIlIlllIlIIlIllllIIl.setColor(this.background.multiply(lllllllllllllIlIlllIlIIlIlllIlll));
            lllllllllllllIlIlllIlIIlIllllIIl.fillRect((float)this.x, (float)this.y, (float)this.width, (float)this.height);
        }
        lllllllllllllIlIlllIlIIlIllllIIl.setColor(this.text.multiply(lllllllllllllIlIlllIlIIlIlllIlll));
        final Font lllllllllllllIlIlllIlIIlIlllIllI = lllllllllllllIlIlllIlIIlIllllIIl.getFont();
        final int lllllllllllllIlIlllIlIIlIlllIlIl = this.font.getWidth(this.value.substring(TextField.llllIIlIIIllI[1], this.cursorPos));
        int lllllllllllllIlIlllIlIIlIlllIlII = TextField.llllIIlIIIllI[1];
        if (lIlIlIIIIlIIIIl(lllllllllllllIlIlllIlIIlIlllIlIl, this.width)) {
            lllllllllllllIlIlllIlIIlIlllIlII = this.width - lllllllllllllIlIlllIlIIlIlllIlIl - this.font.getWidth(TextField.llllIIIlllIlI[TextField.llllIIlIIIllI[2]]);
        }
        lllllllllllllIlIlllIlIIlIllllIIl.translate((float)(lllllllllllllIlIlllIlIIlIlllIlII + TextField.llllIIlIIIllI[4]), 0.0f);
        lllllllllllllIlIlllIlIIlIllllIIl.setFont(this.font);
        lllllllllllllIlIlllIlIIlIllllIIl.drawString(this.value, (float)(this.x + TextField.llllIIlIIIllI[2]), (float)(this.y + TextField.llllIIlIIIllI[2]));
        if (lIlIlIIIIIllllI(this.hasFocus() ? 1 : 0) && lIlIlIIIIIllllI(this.visibleCursor ? 1 : 0)) {
            lllllllllllllIlIlllIlIIlIllllIIl.drawString(TextField.llllIIIlllIlI[TextField.llllIIlIIIllI[4]], (float)(this.x + TextField.llllIIlIIIllI[2] + lllllllllllllIlIlllIlIIlIlllIlIl + TextField.llllIIlIIIllI[4]), (float)(this.y + TextField.llllIIlIIIllI[2]));
        }
        lllllllllllllIlIlllIlIIlIllllIIl.translate((float)(-lllllllllllllIlIlllIlIIlIlllIlII - TextField.llllIIlIIIllI[4]), 0.0f);
        if (lIlIlIIIIlIIIII(this.border)) {
            lllllllllllllIlIlllIlIIlIllllIIl.setColor(this.border.multiply(lllllllllllllIlIlllIlIIlIlllIlll));
            lllllllllllllIlIlllIlIIlIllllIIl.drawRect((float)this.x, (float)this.y, (float)this.width, (float)this.height);
        }
        lllllllllllllIlIlllIlIIlIllllIIl.setColor(lllllllllllllIlIlllIlIIlIlllIlll);
        lllllllllllllIlIlllIlIIlIllllIIl.setFont(lllllllllllllIlIlllIlIIlIlllIllI);
        lllllllllllllIlIlllIlIIlIllllIIl.clearWorldClip();
        lllllllllllllIlIlllIlIIlIllllIIl.setClip(lllllllllllllIlIlllIlIIlIllllIII);
    }
    
    protected void doPaste(final String lllllllllllllIlIlllIlIIlIlIIllII) {
        this.recordOldPosition();
        int lllllllllllllIlIlllIlIIlIlIIlllI = TextField.llllIIlIIIllI[1];
        while (lIlIlIIIIlIIIlI(lllllllllllllIlIlllIlIIlIlIIlllI, lllllllllllllIlIlllIlIIlIlIIllII.length())) {
            this.keyPressed(TextField.llllIIlIIIllI[3], lllllllllllllIlIlllIlIIlIlIIllII.charAt(lllllllllllllIlIlllIlIIlIlIIlllI));
            ++lllllllllllllIlIlllIlIIlIlIIlllI;
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        }
    }
    
    @Override
    public int getWidth() {
        return this.width;
    }
    
    public void setConsumeEvents(final boolean lllllllllllllIlIlllIlIIllIlIllIl) {
        this.consume = lllllllllllllIlIlllIlIIllIlIllIl;
    }
    
    @Override
    public int getHeight() {
        return this.height;
    }
    
    public String getText() {
        return this.value;
    }
    
    private static String lIlIlIIIIIIIlll(final String lllllllllllllIlIlllIlIIIllllIIIl, final String lllllllllllllIlIlllIlIIIllllIIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIlllIlIIIlllllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlllIlIIIllllIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlllIlIIIllllIlll = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlllIlIIIllllIlll.init(TextField.llllIIlIIIllI[4], lllllllllllllIlIlllIlIIIlllllIII);
            return new String(lllllllllllllIlIlllIlIIIllllIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlllIlIIIllllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlllIlIIIllllIlIl) {
            lllllllllllllIlIlllIlIIIllllIlIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void setFocus(final boolean lllllllllllllIlIlllIlIIlIIIIIlII) {
        this.lastKey = TextField.llllIIlIIIllI[3];
        super.setFocus(lllllllllllllIlIlllIlIIlIIIIIlII);
    }
    
    private static boolean lIlIlIIIIlIIIIl(final int lllllllllllllIlIlllIlIIIllIlIllI, final int lllllllllllllIlIlllIlIIIllIlIlIl) {
        return lllllllllllllIlIlllIlIIIllIlIllI > lllllllllllllIlIlllIlIIIllIlIlIl;
    }
    
    public void setCursorVisible(final boolean lllllllllllllIlIlllIlIIlIlIllIlI) {
        this.visibleCursor = lllllllllllllIlIlllIlIIlIlIllIlI;
    }
    
    @Override
    public int getY() {
        return this.y;
    }
    
    public void setBackgroundColor(final Color lllllllllllllIlIlllIlIIllIIIllll) {
        this.background = lllllllllllllIlIlllIlIIllIIIllll;
    }
    
    @Override
    public int getX() {
        return this.x;
    }
    
    private static void lIlIlIIIIIIllII() {
        (llllIIIlllIlI = new String[TextField.llllIIlIIIllI[20]])[TextField.llllIIlIIIllI[1]] = lIlIlIIIIIIIlll("ugdsdxyGGLc=", "okNrU");
        TextField.llllIIIlllIlI[TextField.llllIIlIIIllI[2]] = lIlIlIIIIIIIlll("3q5hgr6bMTo=", "fktUi");
        TextField.llllIIIlllIlI[TextField.llllIIlIIIllI[4]] = lIlIlIIIIIIlIll("OrVDkaP2vDE=", "AVLZS");
    }
    
    public void setCursorPos(final int lllllllllllllIlIlllIlIIlIlIllllI) {
        this.cursorPos = lllllllllllllIlIlllIlIIlIlIllllI;
        if (lIlIlIIIIlIIIIl(this.cursorPos, this.value.length())) {
            this.cursorPos = this.value.length();
        }
    }
    
    static {
        lIlIlIIIIIllIll();
        lIlIlIIIIIIllII();
        INITIAL_KEY_REPEAT_INTERVAL = TextField.llllIIlIIIllI[18];
        KEY_REPEAT_INTERVAL = TextField.llllIIlIIIllI[19];
    }
    
    public TextField(final GUIContext lllllllllllllIlIlllIlIIlllIlIllI, final Font lllllllllllllIlIlllIlIIlllIlIlIl, final int lllllllllllllIlIlllIlIIlllIlIlII, final int lllllllllllllIlIlllIlIIlllIlIIll, final int lllllllllllllIlIlllIlIIlllIIlIlI, final int lllllllllllllIlIlllIlIIlllIIlIIl, final ComponentListener lllllllllllllIlIlllIlIIlllIIlIII) {
        this(lllllllllllllIlIlllIlIIlllIlIllI, lllllllllllllIlIlllIlIIlllIlIlIl, lllllllllllllIlIlllIlIIlllIlIlII, lllllllllllllIlIlllIlIIlllIlIIll, lllllllllllllIlIlllIlIIlllIIlIlI, lllllllllllllIlIlllIlIIlllIIlIIl);
        this.addListener(lllllllllllllIlIlllIlIIlllIIlIII);
    }
    
    public void setText(final String lllllllllllllIlIlllIlIIlIllIIlII) {
        this.value = lllllllllllllIlIlllIlIIlIllIIlII;
        if (lIlIlIIIIlIIIIl(this.cursorPos, lllllllllllllIlIlllIlIIlIllIIlII.length())) {
            this.cursorPos = lllllllllllllIlIlllIlIIlIllIIlII.length();
        }
    }
    
    private static boolean lIlIlIIIIlIIlIl(final int lllllllllllllIlIlllIlIIIllIIlIll) {
        return lllllllllllllIlIlllIlIIIllIIlIll > 0;
    }
    
    private static boolean lIlIlIIIIlIIIII(final Object lllllllllllllIlIlllIlIIIllIlIIll) {
        return lllllllllllllIlIlllIlIIIllIlIIll != null;
    }
    
    public TextField(final GUIContext lllllllllllllIlIlllIlIIllIllllll, final Font lllllllllllllIlIlllIlIIllIlllllI, final int lllllllllllllIlIlllIlIIllIllllIl, final int lllllllllllllIlIlllIlIIllIllllII, final int lllllllllllllIlIlllIlIIllIlllIll, final int lllllllllllllIlIlllIlIIllIlllIlI) {
        super(lllllllllllllIlIlllIlIIllIllllll);
        this.maxCharacter = TextField.llllIIlIIIllI[0];
        this.value = TextField.llllIIIlllIlI[TextField.llllIIlIIIllI[1]];
        this.border = Color.white;
        this.text = Color.white;
        this.background = new Color(0.0f, 0.0f, 0.0f, 0.5f);
        this.visibleCursor = (TextField.llllIIlIIIllI[2] != 0);
        this.lastKey = TextField.llllIIlIIIllI[3];
        this.lastChar = (char)TextField.llllIIlIIIllI[1];
        this.consume = (TextField.llllIIlIIIllI[2] != 0);
        this.font = lllllllllllllIlIlllIlIIllIlllllI;
        this.setLocation(lllllllllllllIlIlllIlIIllIllllIl, lllllllllllllIlIlllIlIIllIllllII);
        this.width = lllllllllllllIlIlllIlIIllIlllIll;
        this.height = lllllllllllllIlIlllIlIIllIlllIlI;
    }
    
    @Override
    public void setLocation(final int lllllllllllllIlIlllIlIIllIlIIlIl, final int lllllllllllllIlIlllIlIIllIlIIIIl) {
        this.x = lllllllllllllIlIlllIlIIllIlIIlIl;
        this.y = lllllllllllllIlIlllIlIIllIlIIIIl;
    }
    
    public void deactivate() {
        this.setFocus((boolean)(TextField.llllIIlIIIllI[1] != 0));
    }
    
    public void setBorderColor(final Color lllllllllllllIlIlllIlIIllIIIlIIl) {
        this.border = lllllllllllllIlIlllIlIIllIIIlIIl;
    }
    
    private static boolean lIlIlIIIIIlllll(final int lllllllllllllIlIlllIlIIIllIIllIl) {
        return lllllllllllllIlIlllIlIIIllIIllIl < 0;
    }
    
    private static void lIlIlIIIIIllIll() {
        (llllIIlIIIllI = new int[22])[0] = (0xFFFFFFB4 & 0x275B);
        TextField.llllIIlIIIllI[1] = ((0x96 ^ 0xB3 ^ (0x88 ^ 0xA4)) & (77 + 58 - 61 + 66 ^ 43 + 76 + 2 + 12 ^ -" ".length()));
        TextField.llllIIlIIIllI[2] = " ".length();
        TextField.llllIIlIIIllI[3] = -" ".length();
        TextField.llllIIlIIIllI[4] = "  ".length();
        TextField.llllIIlIIIllI[5] = (0xB ^ 0x2E ^ (0xBB ^ 0xB1));
        TextField.llllIIlIIIllI[6] = (0x97 ^ 0x8A);
        TextField.llllIIlIIIllI[7] = 147 + 57 - 79 + 32;
        TextField.llllIIlIIIllI[8] = (0x14 ^ 0x38);
        TextField.llllIIlIIIllI[9] = (0xFD ^ 0xC5);
        TextField.llllIIlIIIllI[10] = (0xBC ^ 0xA0) + (60 + 115 - 168 + 153) - (12 + 101 - 46 + 76) + (75 + 79 - 31 + 16);
        TextField.llllIIlIIIllI[11] = (0x8 ^ 0x4E) + (107 + 128 - 180 + 77) - (0xF6 ^ 0xC0) + (0xA9 ^ 0x9E);
        TextField.llllIIlIIIllI[12] = 144 + 102 - 105 + 64;
        TextField.llllIIlIIIllI[13] = (155 + 94 - 176 + 116 ^ 122 + 87 - 186 + 156);
        TextField.llllIIlIIIllI[14] = (0xAD ^ 0xA2) + (0x44 ^ 0x3F) - -(0x6 ^ 0x27) + (0xB4 ^ 0x9C);
        TextField.llllIIlIIIllI[15] = (0xEF ^ 0x9B) + (0x74 ^ 0x3A) - (42 + 48 + 40 + 38) + (0x45 ^ 0x20);
        TextField.llllIIlIIIllI[16] = (62 + 123 - 134 + 93 ^ 80 + 132 - 204 + 135);
        TextField.llllIIlIIIllI[17] = (0x0 ^ 0x1C);
        TextField.llllIIlIIIllI[18] = (0xFFFFA5F8 & 0x5B97);
        TextField.llllIIlIIIllI[19] = (188 + 1 - 69 + 125 ^ 159 + 38 - 162 + 164);
        TextField.llllIIlIIIllI[20] = "   ".length();
        TextField.llllIIlIIIllI[21] = (0x54 ^ 0x5C);
    }
    
    private static boolean lIlIlIIIIIlllIl(final int lllllllllllllIlIlllIlIIIllIIlIII, final int lllllllllllllIlIlllIlIIIllIIIlll) {
        return lllllllllllllIlIlllIlIIIllIIlIII != lllllllllllllIlIlllIlIIIllIIIlll;
    }
}
