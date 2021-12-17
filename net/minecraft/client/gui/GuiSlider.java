// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.Minecraft;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class GuiSlider extends GuiButton
{
    private static final /* synthetic */ int[] llllIllIIlIll;
    private /* synthetic */ String name;
    public /* synthetic */ boolean isMouseDown;
    private final /* synthetic */ float min;
    private final /* synthetic */ GuiPageButtonList.GuiResponder responder;
    private /* synthetic */ FormatHelper formatHelper;
    private /* synthetic */ float sliderPosition;
    private final /* synthetic */ float max;
    private static final /* synthetic */ String[] llllIllIIlIlI;
    
    public void func_175219_a(final float lllllllllllllIlIllIlIIlIlIlIIlIl) {
        this.sliderPosition = lllllllllllllIlIllIlIIlIlIlIIlIl;
        this.displayString = this.getDisplayString();
        this.responder.onTick(this.id, this.func_175220_c());
    }
    
    private static void lIlIlIllIIIIlII() {
        (llllIllIIlIlI = new String[GuiSlider.llllIllIIlIll[8]])[GuiSlider.llllIllIIlIll[2]] = lIlIlIllIIIIIlI("wftPTDO0Pz0=", "tWCTy");
        GuiSlider.llllIllIIlIlI[GuiSlider.llllIllIIlIll[3]] = lIlIlIllIIIIIll("lMQDKbQHbvo=", "FxKcR");
    }
    
    private static boolean lIlIlIllIIIlIlI(final int lllllllllllllIlIllIlIIlIIlllIlII) {
        return lllllllllllllIlIllIlIIlIIlllIlII < 0;
    }
    
    private static int lIlIlIllIIIlIII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static String lIlIlIllIIIIIlI(final String lllllllllllllIlIllIlIIlIIlllllIl, final String lllllllllllllIlIllIlIIlIIlllllII) {
        try {
            final SecretKeySpec lllllllllllllIlIllIlIIlIlIIIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIlIIlIIlllllII.getBytes(StandardCharsets.UTF_8)), GuiSlider.llllIllIIlIll[5]), "DES");
            final Cipher lllllllllllllIlIllIlIIlIlIIIIIIl = Cipher.getInstance("DES");
            lllllllllllllIlIllIlIIlIlIIIIIIl.init(GuiSlider.llllIllIIlIll[8], lllllllllllllIlIllIlIIlIlIIIIIlI);
            return new String(lllllllllllllIlIllIlIIlIlIIIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIlIIlIIlllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllIlIIlIlIIIIIII) {
            lllllllllllllIlIllIlIIlIlIIIIIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIlIllIIIlIll(final int lllllllllllllIlIllIlIIlIIlllIIlI) {
        return lllllllllllllIlIllIlIIlIIlllIIlI > 0;
    }
    
    public void func_175218_a(final float lllllllllllllIlIllIlIIlIlIllllll, final boolean lllllllllllllIlIllIlIIlIlIlllIll) {
        this.sliderPosition = (lllllllllllllIlIllIlIIlIlIllllll - this.min) / (this.max - this.min);
        this.displayString = this.getDisplayString();
        if (lIlIlIllIIIIllI(lllllllllllllIlIllIlIIlIlIlllIll ? 1 : 0)) {
            this.responder.onTick(this.id, this.func_175220_c());
        }
    }
    
    private static String lIlIlIllIIIIIll(final String lllllllllllllIlIllIlIIlIlIIIllII, final String lllllllllllllIlIllIlIIlIlIIIlIIl) {
        try {
            final SecretKeySpec lllllllllllllIlIllIlIIlIlIIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIlIIlIlIIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIllIlIIlIlIIIlllI = Cipher.getInstance("Blowfish");
            lllllllllllllIlIllIlIIlIlIIIlllI.init(GuiSlider.llllIllIIlIll[8], lllllllllllllIlIllIlIIlIlIIIllll);
            return new String(lllllllllllllIlIllIlIIlIlIIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIlIIlIlIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllIlIIlIlIIIllIl) {
            lllllllllllllIlIllIlIIlIlIIIllIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected int getHoverState(final boolean lllllllllllllIlIllIlIIlIlIllIIll) {
        return GuiSlider.llllIllIIlIll[2];
    }
    
    @Override
    public boolean mousePressed(final Minecraft lllllllllllllIlIllIlIIlIlIIlllll, final int lllllllllllllIlIllIlIIlIlIIllllI, final int lllllllllllllIlIllIlIIlIlIIllIIl) {
        if (lIlIlIllIIIIllI(super.mousePressed(lllllllllllllIlIllIlIIlIlIIlllll, lllllllllllllIlIllIlIIlIlIIllllI, lllllllllllllIlIllIlIIlIlIIllIIl) ? 1 : 0)) {
            this.sliderPosition = (lllllllllllllIlIllIlIIlIlIIllllI - (this.xPosition + GuiSlider.llllIllIIlIll[4])) / (float)(this.width - GuiSlider.llllIllIIlIll[5]);
            if (lIlIlIllIIIlIlI(lIlIlIllIIIllII(this.sliderPosition, 0.0f))) {
                this.sliderPosition = 0.0f;
            }
            if (lIlIlIllIIIlIll(lIlIlIllIIIllIl(this.sliderPosition, 1.0f))) {
                this.sliderPosition = 1.0f;
            }
            this.displayString = this.getDisplayString();
            this.responder.onTick(this.id, this.func_175220_c());
            this.isMouseDown = (GuiSlider.llllIllIIlIll[3] != 0);
            return GuiSlider.llllIllIIlIll[3] != 0;
        }
        return GuiSlider.llllIllIIlIll[2] != 0;
    }
    
    public float func_175220_c() {
        return this.min + (this.max - this.min) * this.sliderPosition;
    }
    
    private static int lIlIlIllIIIllII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    @Override
    protected void mouseDragged(final Minecraft lllllllllllllIlIllIlIIlIlIlIllll, final int lllllllllllllIlIllIlIIlIlIlIlIll, final int lllllllllllllIlIllIlIIlIlIlIllIl) {
        if (lIlIlIllIIIIllI(this.visible ? 1 : 0)) {
            if (lIlIlIllIIIIllI(this.isMouseDown ? 1 : 0)) {
                this.sliderPosition = (lllllllllllllIlIllIlIIlIlIlIlIll - (this.xPosition + GuiSlider.llllIllIIlIll[4])) / (float)(this.width - GuiSlider.llllIllIIlIll[5]);
                if (lIlIlIllIIIlIlI(lIlIlIllIIIlIII(this.sliderPosition, 0.0f))) {
                    this.sliderPosition = 0.0f;
                }
                if (lIlIlIllIIIlIll(lIlIlIllIIIlIIl(this.sliderPosition, 1.0f))) {
                    this.sliderPosition = 1.0f;
                }
                this.displayString = this.getDisplayString();
                this.responder.onTick(this.id, this.func_175220_c());
            }
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            this.drawTexturedModalRect(this.xPosition + (int)(this.sliderPosition * (this.width - GuiSlider.llllIllIIlIll[5])), this.yPosition, GuiSlider.llllIllIIlIll[2], GuiSlider.llllIllIIlIll[6], GuiSlider.llllIllIIlIll[4], GuiSlider.llllIllIIlIll[1]);
            this.drawTexturedModalRect(this.xPosition + (int)(this.sliderPosition * (this.width - GuiSlider.llllIllIIlIll[5])) + GuiSlider.llllIllIIlIll[4], this.yPosition, GuiSlider.llllIllIIlIll[7], GuiSlider.llllIllIIlIll[6], GuiSlider.llllIllIIlIll[4], GuiSlider.llllIllIIlIll[1]);
        }
    }
    
    @Override
    public void mouseReleased(final int lllllllllllllIlIllIlIIlIlIIlIllI, final int lllllllllllllIlIllIlIIlIlIIlIlIl) {
        this.isMouseDown = (GuiSlider.llllIllIIlIll[2] != 0);
    }
    
    private String getDisplayString() {
        String s;
        if (lIlIlIllIIIIlll(this.formatHelper)) {
            s = String.valueOf(new StringBuilder(String.valueOf(I18n.format(this.name, new Object[GuiSlider.llllIllIIlIll[2]]))).append(GuiSlider.llllIllIIlIlI[GuiSlider.llllIllIIlIll[3]]).append(this.func_175220_c()));
            "".length();
            if (((0xCA ^ 0x9E) & ~(0x69 ^ 0x3D)) != ((0xBB ^ 0x8E) & ~(0x7D ^ 0x48))) {
                return null;
            }
        }
        else {
            s = this.formatHelper.getText(this.id, I18n.format(this.name, new Object[GuiSlider.llllIllIIlIll[2]]), this.func_175220_c());
        }
        return s;
    }
    
    private static int lIlIlIllIIIlIIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lIlIlIllIIIIllI(final int lllllllllllllIlIllIlIIlIIlllIllI) {
        return lllllllllllllIlIllIlIIlIIlllIllI != 0;
    }
    
    public float func_175217_d() {
        return this.sliderPosition;
    }
    
    private static int lIlIlIllIIIllIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    static {
        lIlIlIllIIIIlIl();
        lIlIlIllIIIIlII();
    }
    
    public GuiSlider(final GuiPageButtonList.GuiResponder lllllllllllllIlIllIlIIlIllIllIIl, final int lllllllllllllIlIllIlIIlIllIllIII, final int lllllllllllllIlIllIlIIlIllIIllIl, final int lllllllllllllIlIllIlIIlIllIlIllI, final String lllllllllllllIlIllIlIIlIllIIlIll, final float lllllllllllllIlIllIlIIlIllIlIlII, final float lllllllllllllIlIllIlIIlIllIIlIIl, final float lllllllllllllIlIllIlIIlIllIIlIII, final FormatHelper lllllllllllllIlIllIlIIlIllIIIlll) {
        super(lllllllllllllIlIllIlIIlIllIllIII, lllllllllllllIlIllIlIIlIllIIllIl, lllllllllllllIlIllIlIIlIllIlIllI, GuiSlider.llllIllIIlIll[0], GuiSlider.llllIllIIlIll[1], GuiSlider.llllIllIIlIlI[GuiSlider.llllIllIIlIll[2]]);
        this.sliderPosition = 1.0f;
        this.name = lllllllllllllIlIllIlIIlIllIIlIll;
        this.min = lllllllllllllIlIllIlIIlIllIlIlII;
        this.max = lllllllllllllIlIllIlIIlIllIIlIIl;
        this.sliderPosition = (lllllllllllllIlIllIlIIlIllIIlIII - lllllllllllllIlIllIlIIlIllIlIlII) / (lllllllllllllIlIllIlIIlIllIIlIIl - lllllllllllllIlIllIlIIlIllIlIlII);
        this.formatHelper = lllllllllllllIlIllIlIIlIllIIIlll;
        this.responder = lllllllllllllIlIllIlIIlIllIllIIl;
        this.displayString = this.getDisplayString();
    }
    
    private static void lIlIlIllIIIIlIl() {
        (llllIllIIlIll = new int[9])[0] = (0x78 ^ 0x39) + (0x54 ^ 0xB) - (0x6 ^ 0x75) + (0x18 ^ 0x71);
        GuiSlider.llllIllIIlIll[1] = (0x29 ^ 0x3D);
        GuiSlider.llllIllIIlIll[2] = ((56 + 1 - 43 + 170 ^ 61 + 41 + 21 + 52) & (0x35 ^ 0x7 ^ (0x36 ^ 0x13) ^ -" ".length()));
        GuiSlider.llllIllIIlIll[3] = " ".length();
        GuiSlider.llllIllIIlIll[4] = (0x37 ^ 0x33);
        GuiSlider.llllIllIIlIll[5] = (0x7C ^ 0x74);
        GuiSlider.llllIllIIlIll[6] = (0x64 ^ 0x26);
        GuiSlider.llllIllIIlIll[7] = 45 + 32 + 94 + 25;
        GuiSlider.llllIllIIlIll[8] = "  ".length();
    }
    
    private static boolean lIlIlIllIIIIlll(final Object lllllllllllllIlIllIlIIlIIllllIII) {
        return lllllllllllllIlIllIlIIlIIllllIII == null;
    }
    
    public interface FormatHelper
    {
        String getText(final int p0, final String p1, final float p2);
    }
}
