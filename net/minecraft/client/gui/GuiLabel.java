// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import com.google.common.collect.Lists;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.Minecraft;
import java.util.List;

public class GuiLabel extends Gui
{
    private /* synthetic */ int field_146169_o;
    private /* synthetic */ boolean centered;
    public /* synthetic */ int field_146174_h;
    private /* synthetic */ int field_146165_q;
    private /* synthetic */ int field_146168_n;
    private static final /* synthetic */ int[] lllIllIIlIIIIl;
    protected /* synthetic */ int field_146161_f;
    protected /* synthetic */ int field_146167_a;
    public /* synthetic */ boolean visible;
    private /* synthetic */ int field_146166_p;
    private /* synthetic */ FontRenderer fontRenderer;
    private /* synthetic */ int field_146163_s;
    private /* synthetic */ List<String> field_146173_k;
    private /* synthetic */ boolean labelBgEnabled;
    public /* synthetic */ int field_175204_i;
    public /* synthetic */ int field_146162_g;
    
    private static boolean lIlIIlIIIlIlIIll(final int llllllllllllIlIllIIllIlIIlIIIIlI) {
        return llllllllllllIlIllIIllIlIIlIIIIlI != 0;
    }
    
    public void drawLabel(final Minecraft llllllllllllIlIllIIllIlIIlIlllll, final int llllllllllllIlIllIIllIlIIllIIlIl, final int llllllllllllIlIllIIllIlIIllIIlII) {
        if (lIlIIlIIIlIlIIll(this.visible ? 1 : 0)) {
            GlStateManager.enableBlend();
            GlStateManager.tryBlendFuncSeparate(GuiLabel.lllIllIIlIIIIl[5], GuiLabel.lllIllIIlIIIIl[6], GuiLabel.lllIllIIlIIIIl[2], GuiLabel.lllIllIIlIIIIl[3]);
            this.drawLabelBackground(llllllllllllIlIllIIllIlIIlIlllll, llllllllllllIlIllIIllIlIIllIIlIl, llllllllllllIlIllIIllIlIIllIIlII);
            final int llllllllllllIlIllIIllIlIIllIIIll = this.field_146174_h + this.field_146161_f / GuiLabel.lllIllIIlIIIIl[7] + this.field_146163_s / GuiLabel.lllIllIIlIIIIl[7];
            final int llllllllllllIlIllIIllIlIIllIIIlI = llllllllllllIlIllIIllIlIIllIIIll - this.field_146173_k.size() * GuiLabel.lllIllIIlIIIIl[8] / GuiLabel.lllIllIIlIIIIl[7];
            int llllllllllllIlIllIIllIlIIllIIIIl = GuiLabel.lllIllIIlIIIIl[3];
            "".length();
            if ("  ".length() > "   ".length()) {
                return;
            }
            while (!lIlIIlIIIlIlIlII(llllllllllllIlIllIIllIlIIllIIIIl, this.field_146173_k.size())) {
                if (lIlIIlIIIlIlIIll(this.centered ? 1 : 0)) {
                    this.drawCenteredString(this.fontRenderer, this.field_146173_k.get(llllllllllllIlIllIIllIlIIllIIIIl), this.field_146162_g + this.field_146167_a / GuiLabel.lllIllIIlIIIIl[7], llllllllllllIlIllIIllIlIIllIIIlI + llllllllllllIlIllIIllIlIIllIIIIl * GuiLabel.lllIllIIlIIIIl[8], this.field_146168_n);
                    "".length();
                    if (((65 + 80 - 133 + 116 ^ 97 + 17 - 21 + 89) & (0x4D ^ 0x17 ^ (0x38 ^ 0x54) ^ -" ".length())) != 0x0) {
                        return;
                    }
                }
                else {
                    this.drawString(this.fontRenderer, this.field_146173_k.get(llllllllllllIlIllIIllIlIIllIIIIl), this.field_146162_g, llllllllllllIlIllIIllIlIIllIIIlI + llllllllllllIlIllIIllIlIIllIIIIl * GuiLabel.lllIllIIlIIIIl[8], this.field_146168_n);
                }
                ++llllllllllllIlIllIIllIlIIllIIIIl;
            }
        }
    }
    
    static {
        lIlIIlIIIlIlIIlI();
    }
    
    public void func_175202_a(final String llllllllllllIlIllIIllIlIIlllIlII) {
        this.field_146173_k.add(I18n.format(llllllllllllIlIllIIllIlIIlllIlII, new Object[GuiLabel.lllIllIIlIIIIl[3]]));
        "".length();
    }
    
    public GuiLabel setCentered() {
        this.centered = (GuiLabel.lllIllIIlIIIIl[2] != 0);
        return this;
    }
    
    private static void lIlIIlIIIlIlIIlI() {
        (lllIllIIlIIIIl = new int[9])[0] = (0x15 ^ 0x5C) + (0x50 ^ 0x2) - (0xA4 ^ 0xA3) + (0x76 ^ 0x42);
        GuiLabel.lllIllIIlIIIIl[1] = (0x6E ^ 0x4D ^ (0x44 ^ 0x73));
        GuiLabel.lllIllIIlIIIIl[2] = " ".length();
        GuiLabel.lllIllIIlIIIIl[3] = ((0x57 ^ 0x1A ^ (0xCB ^ 0xB9)) & (108 + 109 - 109 + 71 ^ 128 + 133 - 162 + 41 ^ -" ".length()));
        GuiLabel.lllIllIIlIIIIl[4] = -" ".length();
        GuiLabel.lllIllIIlIIIIl[5] = (0xFFFFABD7 & 0x572A);
        GuiLabel.lllIllIIlIIIIl[6] = (0xFFFFE7AF & 0x1B53);
        GuiLabel.lllIllIIlIIIIl[7] = "  ".length();
        GuiLabel.lllIllIIlIIIIl[8] = (0x36 ^ 0x66 ^ (0x14 ^ 0x4E));
    }
    
    protected void drawLabelBackground(final Minecraft llllllllllllIlIllIIllIlIIlIlIIll, final int llllllllllllIlIllIIllIlIIlIlIIlI, final int llllllllllllIlIllIIllIlIIlIlIIIl) {
        if (lIlIIlIIIlIlIIll(this.labelBgEnabled ? 1 : 0)) {
            final int llllllllllllIlIllIIllIlIIlIlIIII = this.field_146167_a + this.field_146163_s * GuiLabel.lllIllIIlIIIIl[7];
            final int llllllllllllIlIllIIllIlIIlIIllll = this.field_146161_f + this.field_146163_s * GuiLabel.lllIllIIlIIIIl[7];
            final int llllllllllllIlIllIIllIlIIlIIlllI = this.field_146162_g - this.field_146163_s;
            final int llllllllllllIlIllIIllIlIIlIIllIl = this.field_146174_h - this.field_146163_s;
            Gui.drawRect(llllllllllllIlIllIIllIlIIlIIlllI, llllllllllllIlIllIIllIlIIlIIllIl, llllllllllllIlIllIIllIlIIlIIlllI + llllllllllllIlIllIIllIlIIlIlIIII, llllllllllllIlIllIIllIlIIlIIllIl + llllllllllllIlIllIIllIlIIlIIllll, this.field_146169_o);
            Gui.drawHorizontalLine(llllllllllllIlIllIIllIlIIlIIlllI, llllllllllllIlIllIIllIlIIlIIlllI + llllllllllllIlIllIIllIlIIlIlIIII, llllllllllllIlIllIIllIlIIlIIllIl, this.field_146166_p);
            Gui.drawHorizontalLine(llllllllllllIlIllIIllIlIIlIIlllI, llllllllllllIlIllIIllIlIIlIIlllI + llllllllllllIlIllIIllIlIIlIlIIII, llllllllllllIlIllIIllIlIIlIIllIl + llllllllllllIlIllIIllIlIIlIIllll, this.field_146165_q);
            Gui.drawVerticalLine(llllllllllllIlIllIIllIlIIlIIlllI, llllllllllllIlIllIIllIlIIlIIllIl, llllllllllllIlIllIIllIlIIlIIllIl + llllllllllllIlIllIIllIlIIlIIllll, this.field_146166_p);
            Gui.drawVerticalLine(llllllllllllIlIllIIllIlIIlIIlllI + llllllllllllIlIllIIllIlIIlIlIIII, llllllllllllIlIllIIllIlIIlIIllIl, llllllllllllIlIllIIllIlIIlIIllIl + llllllllllllIlIllIIllIlIIlIIllll, this.field_146165_q);
        }
    }
    
    public GuiLabel(final FontRenderer llllllllllllIlIllIIllIlIIllllllI, final int llllllllllllIlIllIIllIlIIlllllIl, final int llllllllllllIlIllIIllIlIIlllllII, final int llllllllllllIlIllIIllIlIIllllIll, final int llllllllllllIlIllIIllIlIIllllIlI, final int llllllllllllIlIllIIllIlIlIIIIIIl, final int llllllllllllIlIllIIllIlIIllllIII) {
        this.field_146167_a = GuiLabel.lllIllIIlIIIIl[0];
        this.field_146161_f = GuiLabel.lllIllIIlIIIIl[1];
        this.visible = (GuiLabel.lllIllIIlIIIIl[2] != 0);
        this.fontRenderer = llllllllllllIlIllIIllIlIIllllllI;
        this.field_175204_i = llllllllllllIlIllIIllIlIIlllllIl;
        this.field_146162_g = llllllllllllIlIllIIllIlIIlllllII;
        this.field_146174_h = llllllllllllIlIllIIllIlIIllllIll;
        this.field_146167_a = llllllllllllIlIllIIllIlIIllllIlI;
        this.field_146161_f = llllllllllllIlIllIIllIlIlIIIIIIl;
        this.field_146173_k = (List<String>)Lists.newArrayList();
        this.centered = (GuiLabel.lllIllIIlIIIIl[3] != 0);
        this.labelBgEnabled = (GuiLabel.lllIllIIlIIIIl[3] != 0);
        this.field_146168_n = llllllllllllIlIllIIllIlIIllllIII;
        this.field_146169_o = GuiLabel.lllIllIIlIIIIl[4];
        this.field_146166_p = GuiLabel.lllIllIIlIIIIl[4];
        this.field_146165_q = GuiLabel.lllIllIIlIIIIl[4];
        this.field_146163_s = GuiLabel.lllIllIIlIIIIl[3];
    }
    
    private static boolean lIlIIlIIIlIlIlII(final int llllllllllllIlIllIIllIlIIlIIIlIl, final int llllllllllllIlIllIIllIlIIlIIIlII) {
        return llllllllllllIlIllIIllIlIIlIIIlIl >= llllllllllllIlIllIIllIlIIlIIIlII;
    }
}
