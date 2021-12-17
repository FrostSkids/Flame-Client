// 
// Decompiled by Procyon v0.5.36
// 

package client.ui;

import net.minecraft.client.gui.FontRenderer;
import java.awt.Color;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;

public class Buttons extends GuiButton
{
    private static final /* synthetic */ int[] lIIlIIllIIIIII;
    /* synthetic */ int outlineColor;
    private /* synthetic */ boolean background;
    
    private static boolean llIIllIllIllIlI(final int lllllllllllllIIllIllIllIlllIIlll) {
        return lllllllllllllIIllIllIllIlllIIlll == 0;
    }
    
    public Buttons(final int lllllllllllllIIllIllIlllIIllIlll, final int lllllllllllllIIllIllIlllIlIIIIll, final int lllllllllllllIIllIllIlllIlIIIIIl, final int lllllllllllllIIllIllIlllIlIIIIII, final int lllllllllllllIIllIllIlllIIllIIII, final boolean lllllllllllllIIllIllIlllIIlIllll, final String lllllllllllllIIllIllIlllIIlllIlI) {
        super(lllllllllllllIIllIllIlllIIllIlll, lllllllllllllIIllIllIlllIlIIIIll, lllllllllllllIIllIllIlllIlIIIIIl, lllllllllllllIIllIllIlllIlIIIIII, lllllllllllllIIllIllIlllIIllIIII, lllllllllllllIIllIllIlllIIlllIlI);
        this.background = lllllllllllllIIllIllIlllIIlIllll;
    }
    
    private static boolean llIIllIllIllIII(final int lllllllllllllIIllIllIllIlllllIlI, final int lllllllllllllIIllIllIllIlllllIIl) {
        return lllllllllllllIIllIllIllIlllllIlI >= lllllllllllllIIllIllIllIlllllIIl;
    }
    
    static {
        llIIllIllIlIllI();
    }
    
    @Override
    public void drawButton(final Minecraft lllllllllllllIIllIllIlllIIIlIIIl, final int lllllllllllllIIllIllIlllIIIllIlI, final int lllllllllllllIIllIllIlllIIIIllIl) {
        if (llIIllIllIlIlll(this.visible ? 1 : 0)) {
            final FontRenderer lllllllllllllIIllIllIlllIIIllIII = lllllllllllllIIllIllIlllIIIlIIIl.fontRendererObj;
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            int hovered;
            if (llIIllIllIllIII(lllllllllllllIIllIllIlllIIIllIlI, this.xPosition) && llIIllIllIllIII(lllllllllllllIIllIllIlllIIIIllIl, this.yPosition) && llIIllIllIllIIl(lllllllllllllIIllIllIlllIIIllIlI, this.xPosition + this.width) && llIIllIllIllIIl(lllllllllllllIIllIllIlllIIIIllIl, this.yPosition + this.height)) {
                hovered = Buttons.lIIlIIllIIIIII[0];
                "".length();
                if ("  ".length() == 0) {
                    return;
                }
            }
            else {
                hovered = Buttons.lIIlIIllIIIIII[1];
            }
            this.hovered = (hovered != 0);
            final int lllllllllllllIIllIllIlllIIIlIllI = this.getHoverState(this.hovered);
            Gui.drawRect(this.xPosition, this.yPosition, this.xPosition + this.width, this.yPosition + this.height, Buttons.lIIlIIllIIIIII[2]);
            Gui.drawHorizontalLine(this.xPosition, this.xPosition + this.width - Buttons.lIIlIIllIIIIII[0], this.yPosition, this.outlineColor);
            Gui.drawHorizontalLine(this.xPosition, this.xPosition + this.width - Buttons.lIIlIIllIIIIII[0], this.yPosition + this.height - Buttons.lIIlIIllIIIIII[0], this.outlineColor);
            Gui.drawVerticalLine(this.xPosition, this.yPosition + this.height, this.yPosition, this.outlineColor);
            Gui.drawVerticalLine(this.xPosition + this.width - Buttons.lIIlIIllIIIIII[0], this.yPosition + this.height, this.yPosition, this.outlineColor);
            this.mouseDragged(lllllllllllllIIllIllIlllIIIlIIIl, lllllllllllllIIllIllIlllIIIllIlI, lllllllllllllIIllIllIlllIIIIllIl);
            int lllllllllllllIIllIllIlllIIIlIlII = Buttons.lIIlIIllIIIIII[3];
            if (llIIllIllIllIlI(this.enabled ? 1 : 0)) {
                lllllllllllllIIllIllIlllIIIlIlII = Buttons.lIIlIIllIIIIII[4];
                "".length();
                if (-" ".length() != -" ".length()) {
                    return;
                }
            }
            else if (llIIllIllIlIlll(this.hovered ? 1 : 0)) {
                this.outlineColor = Buttons.lIIlIIllIIIIII[5];
                if (llIIllIllIllIll(this.id, Buttons.lIIlIIllIIIIII[6])) {
                    lllllllllllllIIllIllIlllIIIlIlII = Buttons.lIIlIIllIIIIII[7];
                    "".length();
                    if ("   ".length() >= (0x72 ^ 0x76)) {
                        return;
                    }
                }
                else {
                    lllllllllllllIIllIllIlllIIIlIlII = new Color(Buttons.lIIlIIllIIIIII[8], Buttons.lIIlIIllIIIIII[1], Buttons.lIIlIIllIIIIII[1], Buttons.lIIlIIllIIIIII[9]).getRGB();
                    "".length();
                    if (-(0x4C ^ 0x49) >= 0) {
                        return;
                    }
                }
            }
            else {
                this.outlineColor = Buttons.lIIlIIllIIIIII[10];
            }
            lllllllllllllIIllIllIlllIIIlIIIl.fontRendererObj.drawStringWithShadow(this.displayString, (float)(this.xPosition + this.width / Buttons.lIIlIIllIIIIII[11]), (float)(this.yPosition + (this.height - Buttons.lIIlIIllIIIIII[12]) / Buttons.lIIlIIllIIIIII[13]), lllllllllllllIIllIllIlllIIIlIlII);
            "".length();
        }
    }
    
    private static boolean llIIllIllIlIlll(final int lllllllllllllIIllIllIllIlllIllII) {
        return lllllllllllllIIllIllIllIlllIllII != 0;
    }
    
    private static boolean llIIllIllIllIll(final int lllllllllllllIIllIllIllIlllllllI, final int lllllllllllllIIllIllIllIllllllIl) {
        return lllllllllllllIIllIllIllIlllllllI == lllllllllllllIIllIllIllIllllllIl;
    }
    
    private static void llIIllIllIlIllI() {
        (lIIlIIllIIIIII = new int[14])[0] = " ".length();
        Buttons.lIIlIIllIIIIII[1] = ((12 + 113 - 5 + 29 ^ 39 + 12 + 105 + 33) & (0x46 ^ 0x67 ^ (0x50 ^ 0x59) ^ -" ".length()));
        Buttons.lIIlIIllIIIIII[2] = -(-(0xFFFFBD67 & 0x57B9) & (0xFFFFDFFB & 0x50CAFFEF));
        Buttons.lIIlIIllIIIIII[3] = (-(0xFFFFFE4F & 0x17BC) & (0xFFFFFEEB & 0xE0F7FF));
        Buttons.lIIlIIllIIIIII[4] = (-(0xFFFFDF7B & 0x75DF) & (0xFFFFF5FF & 0xA0FFFA));
        Buttons.lIIlIIllIIIIII[5] = -(0xFFFFCFFF & 0xCFFFD0);
        Buttons.lIIlIIllIIIIII[6] = (175 + 128 - 113 + 18 ^ 50 + 164 - 111 + 76);
        Buttons.lIIlIIllIIIIII[7] = -(0xFFFFEEDB & 0xDBEF);
        Buttons.lIIlIIllIIIIII[8] = (0x13 ^ 0x1A) + (0xB1 ^ 0x8D) - -(0x6D ^ 0x4E) + (0x5E ^ 0x1C);
        Buttons.lIIlIIllIIIIII[9] = 110 + 142 - 131 + 58 + (152 + 25 - 21 + 12) - (0x6 ^ 0x6C) + (0x57 ^ 0x59);
        Buttons.lIIlIIllIIIIII[10] = -(0xFFFFFED3 & 0x5100012C);
        Buttons.lIIlIIllIIIIII[11] = "   ".length();
        Buttons.lIIlIIllIIIIII[12] = (0xC ^ 0x6);
        Buttons.lIIlIIllIIIIII[13] = "  ".length();
    }
    
    private static boolean llIIllIllIllIIl(final int lllllllllllllIIllIllIllIllllIIlI, final int lllllllllllllIIllIllIllIllllIIIl) {
        return lllllllllllllIIllIllIllIllllIIlI < lllllllllllllIIllIllIllIllllIIIl;
    }
}
