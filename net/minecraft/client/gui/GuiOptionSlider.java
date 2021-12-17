// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.MathHelper;
import net.minecraft.client.Minecraft;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.client.settings.GameSettings;

public class GuiOptionSlider extends GuiButton
{
    private /* synthetic */ GameSettings.Options options;
    private final /* synthetic */ float field_146131_s;
    private final /* synthetic */ float field_146132_r;
    public /* synthetic */ boolean dragging;
    private static final /* synthetic */ int[] lIlIIIlIllIlll;
    private static final /* synthetic */ String[] lIlIIIlIllIllI;
    private /* synthetic */ float sliderValue;
    
    private static void lllIIIlIlllllll() {
        (lIlIIIlIllIlll = new int[8])[0] = 142 + 51 - 103 + 60;
        GuiOptionSlider.lIlIIIlIllIlll[1] = (56 + 47 + 33 + 18 ^ 22 + 96 - 26 + 50);
        GuiOptionSlider.lIlIIIlIllIlll[2] = ((22 + 38 - 40 + 167 ^ 97 + 1 - 43 + 87) & (0xA1 ^ 0xA9 ^ (0x78 ^ 0x45) ^ -" ".length()));
        GuiOptionSlider.lIlIIIlIllIlll[3] = (0x7E ^ 0x7A);
        GuiOptionSlider.lIlIIIlIllIlll[4] = (17 + 117 - 130 + 126 ^ 24 + 109 - 7 + 12);
        GuiOptionSlider.lIlIIIlIllIlll[5] = (0x4D ^ 0xF);
        GuiOptionSlider.lIlIIIlIllIlll[6] = 140 + 139 - 105 + 22;
        GuiOptionSlider.lIlIIIlIllIlll[7] = " ".length();
    }
    
    private static String lllIIIlIlllllII(String lllllllllllllIIIlllllIIIllIIIIIl, final String lllllllllllllIIIlllllIIIllIIIIII) {
        lllllllllllllIIIlllllIIIllIIIIIl = (boolean)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIlllllIIIllIIIIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIlllllIIIllIIIlII = new StringBuilder();
        final char[] lllllllllllllIIIlllllIIIllIIIIll = lllllllllllllIIIlllllIIIllIIIIII.toCharArray();
        int lllllllllllllIIIlllllIIIllIIIIlI = GuiOptionSlider.lIlIIIlIllIlll[2];
        final int lllllllllllllIIIlllllIIIlIllllII = (Object)((String)lllllllllllllIIIlllllIIIllIIIIIl).toCharArray();
        final short lllllllllllllIIIlllllIIIlIlllIll = (short)lllllllllllllIIIlllllIIIlIllllII.length;
        float lllllllllllllIIIlllllIIIlIlllIlI = GuiOptionSlider.lIlIIIlIllIlll[2];
        while (lllIIIllIIIIIIl((int)lllllllllllllIIIlllllIIIlIlllIlI, lllllllllllllIIIlllllIIIlIlllIll)) {
            final char lllllllllllllIIIlllllIIIllIIIlll = lllllllllllllIIIlllllIIIlIllllII[lllllllllllllIIIlllllIIIlIlllIlI];
            lllllllllllllIIIlllllIIIllIIIlII.append((char)(lllllllllllllIIIlllllIIIllIIIlll ^ lllllllllllllIIIlllllIIIllIIIIll[lllllllllllllIIIlllllIIIllIIIIlI % lllllllllllllIIIlllllIIIllIIIIll.length]));
            "".length();
            ++lllllllllllllIIIlllllIIIllIIIIlI;
            ++lllllllllllllIIIlllllIIIlIlllIlI;
            "".length();
            if (-" ".length() >= " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIlllllIIIllIIIlII);
    }
    
    @Override
    protected int getHoverState(final boolean lllllllllllllIIIlllllIIIlllIllll) {
        return GuiOptionSlider.lIlIIIlIllIlll[2];
    }
    
    private static void lllIIIlIlllllIl() {
        (lIlIIIlIllIllI = new String[GuiOptionSlider.lIlIIIlIllIlll[7]])[GuiOptionSlider.lIlIIIlIllIlll[2]] = lllIIIlIlllllII("", "vyhax");
    }
    
    private static boolean lllIIIllIIIIIII(final int lllllllllllllIIIlllllIIIlIllIIll) {
        return lllllllllllllIIIlllllIIIlIllIIll != 0;
    }
    
    private static boolean lllIIIllIIIIIIl(final int lllllllllllllIIIlllllIIIlIllIllI, final int lllllllllllllIIIlllllIIIlIllIlIl) {
        return lllllllllllllIIIlllllIIIlIllIllI < lllllllllllllIIIlllllIIIlIllIlIl;
    }
    
    @Override
    public boolean mousePressed(final Minecraft lllllllllllllIIIlllllIIIllIllIII, final int lllllllllllllIIIlllllIIIllIllIll, final int lllllllllllllIIIlllllIIIllIllIlI) {
        if (lllIIIllIIIIIII(super.mousePressed(lllllllllllllIIIlllllIIIllIllIII, lllllllllllllIIIlllllIIIllIllIll, lllllllllllllIIIlllllIIIllIllIlI) ? 1 : 0)) {
            this.sliderValue = (lllllllllllllIIIlllllIIIllIllIll - (this.xPosition + GuiOptionSlider.lIlIIIlIllIlll[3])) / (float)(this.width - GuiOptionSlider.lIlIIIlIllIlll[4]);
            this.sliderValue = MathHelper.clamp_float(this.sliderValue, 0.0f, 1.0f);
            lllllllllllllIIIlllllIIIllIllIII.gameSettings.setOptionFloatValue(this.options, this.options.denormalizeValue(this.sliderValue));
            this.displayString = lllllllllllllIIIlllllIIIllIllIII.gameSettings.getKeyBinding(this.options);
            this.dragging = (GuiOptionSlider.lIlIIIlIllIlll[7] != 0);
            return GuiOptionSlider.lIlIIIlIllIlll[7] != 0;
        }
        return GuiOptionSlider.lIlIIIlIllIlll[2] != 0;
    }
    
    @Override
    protected void mouseDragged(final Minecraft lllllllllllllIIIlllllIIIlllIIlII, final int lllllllllllllIIIlllllIIIlllIlIII, final int lllllllllllllIIIlllllIIIlllIIlll) {
        if (lllIIIllIIIIIII(this.visible ? 1 : 0)) {
            if (lllIIIllIIIIIII(this.dragging ? 1 : 0)) {
                this.sliderValue = (lllllllllllllIIIlllllIIIlllIlIII - (this.xPosition + GuiOptionSlider.lIlIIIlIllIlll[3])) / (float)(this.width - GuiOptionSlider.lIlIIIlIllIlll[4]);
                this.sliderValue = MathHelper.clamp_float(this.sliderValue, 0.0f, 1.0f);
                final float lllllllllllllIIIlllllIIIlllIIllI = this.options.denormalizeValue(this.sliderValue);
                lllllllllllllIIIlllllIIIlllIIlII.gameSettings.setOptionFloatValue(this.options, lllllllllllllIIIlllllIIIlllIIllI);
                this.sliderValue = this.options.normalizeValue(lllllllllllllIIIlllllIIIlllIIllI);
                this.displayString = lllllllllllllIIIlllllIIIlllIIlII.gameSettings.getKeyBinding(this.options);
            }
            lllllllllllllIIIlllllIIIlllIIlII.getTextureManager().bindTexture(GuiOptionSlider.buttonTextures);
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            this.drawTexturedModalRect(this.xPosition + (int)(this.sliderValue * (this.width - GuiOptionSlider.lIlIIIlIllIlll[4])), this.yPosition, GuiOptionSlider.lIlIIIlIllIlll[2], GuiOptionSlider.lIlIIIlIllIlll[5], GuiOptionSlider.lIlIIIlIllIlll[3], GuiOptionSlider.lIlIIIlIllIlll[1]);
            this.drawTexturedModalRect(this.xPosition + (int)(this.sliderValue * (this.width - GuiOptionSlider.lIlIIIlIllIlll[4])) + GuiOptionSlider.lIlIIIlIllIlll[3], this.yPosition, GuiOptionSlider.lIlIIIlIllIlll[6], GuiOptionSlider.lIlIIIlIllIlll[5], GuiOptionSlider.lIlIIIlIllIlll[3], GuiOptionSlider.lIlIIIlIllIlll[1]);
        }
    }
    
    public GuiOptionSlider(final int lllllllllllllIIIlllllIIIllllIlll, final int lllllllllllllIIIlllllIIIlllllllI, final int lllllllllllllIIIlllllIIIllllIlIl, final GameSettings.Options lllllllllllllIIIlllllIIIllllIlII, final float lllllllllllllIIIlllllIIIlllllIll, final float lllllllllllllIIIlllllIIIlllllIlI) {
        super(lllllllllllllIIIlllllIIIllllIlll, lllllllllllllIIIlllllIIIlllllllI, lllllllllllllIIIlllllIIIllllIlIl, GuiOptionSlider.lIlIIIlIllIlll[0], GuiOptionSlider.lIlIIIlIllIlll[1], GuiOptionSlider.lIlIIIlIllIllI[GuiOptionSlider.lIlIIIlIllIlll[2]]);
        this.sliderValue = 1.0f;
        this.options = lllllllllllllIIIlllllIIIllllIlII;
        this.field_146132_r = lllllllllllllIIIlllllIIIlllllIll;
        this.field_146131_s = lllllllllllllIIIlllllIIIlllllIlI;
        final Minecraft lllllllllllllIIIlllllIIIlllllIIl = Minecraft.getMinecraft();
        this.sliderValue = lllllllllllllIIIlllllIIIllllIlII.normalizeValue(lllllllllllllIIIlllllIIIlllllIIl.gameSettings.getOptionFloatValue(lllllllllllllIIIlllllIIIllllIlII));
        this.displayString = lllllllllllllIIIlllllIIIlllllIIl.gameSettings.getKeyBinding(lllllllllllllIIIlllllIIIllllIlII);
    }
    
    public GuiOptionSlider(final int lllllllllllllIIIlllllIIlIIIlIIIl, final int lllllllllllllIIIlllllIIlIIIIlIll, final int lllllllllllllIIIlllllIIlIIIIllll, final GameSettings.Options lllllllllllllIIIlllllIIlIIIIlIIl) {
        this(lllllllllllllIIIlllllIIlIIIlIIIl, lllllllllllllIIIlllllIIlIIIIlIll, lllllllllllllIIIlllllIIlIIIIllll, lllllllllllllIIIlllllIIlIIIIlIIl, 0.0f, 1.0f);
    }
    
    @Override
    public void mouseReleased(final int lllllllllllllIIIlllllIIIllIlIIll, final int lllllllllllllIIIlllllIIIllIlIIlI) {
        this.dragging = (GuiOptionSlider.lIlIIIlIllIlll[2] != 0);
    }
    
    static {
        lllIIIlIlllllll();
        lllIIIlIlllllIl();
    }
}
