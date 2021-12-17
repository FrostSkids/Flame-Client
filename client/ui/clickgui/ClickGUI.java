// 
// Decompiled by Procyon v0.5.36
// 

package client.ui.clickgui;

import java.util.Iterator;
import java.io.IOException;
import client.hud.mod.HudManager;
import client.hud.mod.HudMod;
import client.ClientName;
import net.minecraft.client.gui.Gui;
import java.awt.Color;
import net.minecraft.client.gui.ScaledResolution;
import client.ui.clickgui.comp.ModButton;
import java.util.ArrayList;
import net.minecraft.client.gui.GuiScreen;

public class ClickGUI extends GuiScreen
{
    private static final /* synthetic */ int[] lllIlllIlIlIlI;
    /* synthetic */ ArrayList<ModButton> modButtons;
    
    private static void lIlIIlIllIllIlll() {
        (lllIlllIlIlIlI = new int[28])[0] = (0x86 ^ 0x9A) + (0x4A ^ 0x27) - (0x40 ^ 0xF) + (0x18 ^ 0x7E);
        ClickGUI.lllIlllIlIlIlI[1] = (0x8C ^ 0x82 ^ (0x53 ^ 0x61));
        ClickGUI.lllIlllIlIlIlI[2] = (0xAF ^ 0xB9);
        ClickGUI.lllIlllIlIlIlI[3] = (0x46 ^ 0x42);
        ClickGUI.lllIlllIlIlIlI[4] = (0x40 ^ 0x65) + (0x6A ^ 0x24) - -(0x86 ^ 0x90) + (0x6B ^ 0x5E);
        ClickGUI.lllIlllIlIlIlI[5] = (0x46 ^ 0x78);
        ClickGUI.lllIlllIlIlIlI[6] = (-(0xFFFFF25F & 0x6FF5) & (0xFFFFE356 & 0x7FFF));
        ClickGUI.lllIlllIlIlIlI[7] = (0xFFFF8165 & 0x7FBA);
        ClickGUI.lllIlllIlIlIlI[8] = (0xDD ^ 0x95);
        ClickGUI.lllIlllIlIlIlI[9] = (0x7B ^ 0x1A ^ (0xBB ^ 0x8A));
        ClickGUI.lllIlllIlIlIlI[10] = (0xBE ^ 0x87);
        ClickGUI.lllIlllIlIlIlI[11] = (0x63 ^ 0x38) + (71 + 179 - 134 + 96) - (93 + 59 + 37 + 25) + (39 + 13 + 57 + 27);
        ClickGUI.lllIlllIlIlIlI[12] = (0xBA ^ 0x90);
        ClickGUI.lllIlllIlIlIlI[13] = (0xFFFFA5D7 & 0x5B3B);
        ClickGUI.lllIlllIlIlIlI[14] = (0x2A ^ 0x60);
        ClickGUI.lllIlllIlIlIlI[15] = (17 + 91 - 90 + 177 ^ 56 + 62 + 5 + 44);
        ClickGUI.lllIlllIlIlIlI[16] = (0x9 ^ 0x49);
        ClickGUI.lllIlllIlIlIlI[17] = (-(0xFFFFDF7E & 0x6CD3) & (0xFFFFFFDF & 0x4D75));
        ClickGUI.lllIlllIlIlIlI[18] = (0x66 ^ 0x14 ^ (0x51 ^ 0x3E));
        ClickGUI.lllIlllIlIlIlI[19] = (-(0xFFFFEFDF & 0x3EF1) & (0xFFFFEFF7 & 0x3FFF));
        ClickGUI.lllIlllIlIlIlI[20] = (0xF3 ^ 0x8B);
        ClickGUI.lllIlllIlIlIlI[21] = (0x1B ^ 0x69 ^ (0x9E ^ 0xA9));
        ClickGUI.lllIlllIlIlIlI[22] = (0xE9 ^ 0xC3) + (0x57 ^ 0x16) - (0x92 ^ 0x8F) + (73 + 142 - 76 + 18);
        ClickGUI.lllIlllIlIlIlI[23] = 40 + 108 - 110 + 112;
        ClickGUI.lllIlllIlIlIlI[24] = (0x39 ^ 0x44 ^ (0x31 ^ 0x7E));
        ClickGUI.lllIlllIlIlIlI[25] = (0xC1 ^ 0xAF);
        ClickGUI.lllIlllIlIlIlI[26] = ((0x73 ^ 0x53 ^ "  ".length()) & (0xFD ^ 0xA7 ^ (0x38 ^ 0x40) ^ -" ".length()));
        ClickGUI.lllIlllIlIlIlI[27] = 59 + 69 - 97 + 139;
    }
    
    @Override
    public void drawScreen(final int llllllllllllIlIllIIIIlIIIIllllII, final int llllllllllllIlIllIIIIlIIIIlllIll, final float llllllllllllIlIllIIIIlIIIlIIIIII) {
        final ScaledResolution llllllllllllIlIllIIIIlIIIIllllll = new ScaledResolution(this.mc);
        super.drawScreen(llllllllllllIlIllIIIIlIIIIllllII, llllllllllllIlIllIIIIlIIIIlllIll, llllllllllllIlIllIIIIlIIIlIIIIII);
        Gui.drawRect(ClickGUI.lllIlllIlIlIlI[23], ClickGUI.lllIlllIlIlIlI[24], llllllllllllIlIllIIIIlIIIIllllll.getScaledWidth() - ClickGUI.lllIlllIlIlIlI[25], llllllllllllIlIllIIIIlIIIIllllll.getScaledHeight() - ClickGUI.lllIlllIlIlIlI[24], new Color(ClickGUI.lllIlllIlIlIlI[26], ClickGUI.lllIlllIlIlIlI[26], ClickGUI.lllIlllIlIlIlI[26], ClickGUI.lllIlllIlIlIlI[27]).getRGB());
        final int llllllllllllIlIllIIIIlIIIIllIlll = (int)this.modButtons.iterator();
        "".length();
        if ("  ".length() == (0x8A ^ 0x8E)) {
            return;
        }
        while (!lIlIIlIllIlllIII(((Iterator)llllllllllllIlIllIIIIlIIIIllIlll).hasNext() ? 1 : 0)) {
            final ModButton llllllllllllIlIllIIIIlIIIIlllllI = ((Iterator<ModButton>)llllllllllllIlIllIIIIlIIIIllIlll).next();
            llllllllllllIlIllIIIIlIIIIlllllI.draw();
        }
    }
    
    @Override
    public void initGui() {
        super.initGui();
        this.modButtons.add(new ModButton(ClickGUI.lllIlllIlIlIlI[0], ClickGUI.lllIlllIlIlIlI[1], ClickGUI.lllIlllIlIlIlI[2], this.mc.fontRendererObj.FONT_HEIGHT + ClickGUI.lllIlllIlIlIlI[3], ClientName.INSTANCE.hudManager.fps));
        "".length();
        this.modButtons.add(new ModButton(ClickGUI.lllIlllIlIlIlI[4], ClickGUI.lllIlllIlIlIlI[1], ClickGUI.lllIlllIlIlIlI[5], this.mc.fontRendererObj.FONT_HEIGHT + ClickGUI.lllIlllIlIlIlI[3], ClientName.INSTANCE.hudManager.keystrokes));
        "".length();
        this.modButtons.add(new ModButton(ClickGUI.lllIlllIlIlIlI[6], ClickGUI.lllIlllIlIlIlI[1], ClickGUI.lllIlllIlIlIlI[2], this.mc.fontRendererObj.FONT_HEIGHT + ClickGUI.lllIlllIlIlIlI[3], ClientName.INSTANCE.hudManager.xyz));
        "".length();
        this.modButtons.add(new ModButton(ClickGUI.lllIlllIlIlIlI[7], ClickGUI.lllIlllIlIlIlI[1], ClickGUI.lllIlllIlIlIlI[8], this.mc.fontRendererObj.FONT_HEIGHT + ClickGUI.lllIlllIlIlIlI[3], ClientName.INSTANCE.hudManager.togglesprintdisplay));
        "".length();
        this.modButtons.add(new ModButton(ClickGUI.lllIlllIlIlIlI[0], ClickGUI.lllIlllIlIlIlI[9], ClickGUI.lllIlllIlIlIlI[10], this.mc.fontRendererObj.FONT_HEIGHT + ClickGUI.lllIlllIlIlIlI[3], ClientName.INSTANCE.hudManager.target));
        "".length();
        this.modButtons.add(new ModButton(ClickGUI.lllIlllIlIlIlI[11], ClickGUI.lllIlllIlIlIlI[9], ClickGUI.lllIlllIlIlIlI[12], this.mc.fontRendererObj.FONT_HEIGHT + ClickGUI.lllIlllIlIlIlI[3], ClientName.INSTANCE.hudManager.ping));
        "".length();
        this.modButtons.add(new ModButton(ClickGUI.lllIlllIlIlIlI[13], ClickGUI.lllIlllIlIlIlI[9], ClickGUI.lllIlllIlIlIlI[14], this.mc.fontRendererObj.FONT_HEIGHT + ClickGUI.lllIlllIlIlIlI[3], ClientName.INSTANCE.hudManager.armorstatus));
        "".length();
        this.modButtons.add(new ModButton(ClickGUI.lllIlllIlIlIlI[0], ClickGUI.lllIlllIlIlIlI[15], ClickGUI.lllIlllIlIlIlI[2], this.mc.fontRendererObj.FONT_HEIGHT + ClickGUI.lllIlllIlIlIlI[3], ClientName.INSTANCE.hudManager.cps));
        "".length();
        final ArrayList<ModButton> modButtons = this.modButtons;
        final int llllllllllllIlIlllllllIIIIIIlIll = ClickGUI.lllIlllIlIlIlI[4];
        final int llllllllllllIlIlllllllIIIIIlIIII = ClickGUI.lllIlllIlIlIlI[15];
        final int llllllllllllIlIlllllllIIIIIIllll = ClickGUI.lllIlllIlIlIlI[16];
        final int llllllllllllIlIlllllllIIIIIIlIII = this.mc.fontRendererObj.FONT_HEIGHT + ClickGUI.lllIlllIlIlIlI[3];
        final HudManager hudManager = ClientName.INSTANCE.hudManager;
        "".length();
        modButtons.add(new ModButton(llllllllllllIlIlllllllIIIIIIlIll, llllllllllllIlIlllllllIIIIIlIIII, llllllllllllIlIlllllllIIIIIIllll, llllllllllllIlIlllllllIIIIIIlIII, HudManager.perspective));
        "".length();
        this.modButtons.add(new ModButton(ClickGUI.lllIlllIlIlIlI[17], ClickGUI.lllIlllIlIlIlI[15], ClickGUI.lllIlllIlIlIlI[18], this.mc.fontRendererObj.FONT_HEIGHT + ClickGUI.lllIlllIlIlIlI[3], ClientName.INSTANCE.hudManager.biome));
        "".length();
        this.modButtons.add(new ModButton(ClickGUI.lllIlllIlIlIlI[19], ClickGUI.lllIlllIlIlIlI[15], ClickGUI.lllIlllIlIlIlI[18], this.mc.fontRendererObj.FONT_HEIGHT + ClickGUI.lllIlllIlIlIlI[3], ClientName.INSTANCE.hudManager.clockmod));
        "".length();
        this.modButtons.add(new ModButton(ClickGUI.lllIlllIlIlIlI[0], ClickGUI.lllIlllIlIlIlI[20], ClickGUI.lllIlllIlIlIlI[21], this.mc.fontRendererObj.FONT_HEIGHT + ClickGUI.lllIlllIlIlIlI[3], ClientName.INSTANCE.hudManager.ps));
        "".length();
        this.modButtons.add(new ModButton(ClickGUI.lllIlllIlIlIlI[22], ClickGUI.lllIlllIlIlIlI[20], ClickGUI.lllIlllIlIlIlI[21], this.mc.fontRendererObj.FONT_HEIGHT + ClickGUI.lllIlllIlIlIlI[3], ClientName.INSTANCE.hudManager.direction));
        "".length();
    }
    
    private static boolean lIlIIlIllIlllIII(final int llllllllllllIlIllIIIIlIIIIlIIlII) {
        return llllllllllllIlIllIIIIlIIIIlIIlII == 0;
    }
    
    public ClickGUI() {
        this.modButtons = new ArrayList<ModButton>();
    }
    
    static {
        lIlIIlIllIllIlll();
    }
    
    @Override
    protected void mouseClicked(final int llllllllllllIlIllIIIIlIIIIlIlIlI, final int llllllllllllIlIllIIIIlIIIIlIlllI, final int llllllllllllIlIllIIIIlIIIIlIlIII) throws IOException {
        super.mouseClicked(llllllllllllIlIllIIIIlIIIIlIlIlI, llllllllllllIlIllIIIIlIIIIlIlllI, llllllllllllIlIllIIIIlIIIIlIlIII);
        final long llllllllllllIlIllIIIIlIIIIlIIllI = (long)this.modButtons.iterator();
        "".length();
        if ((0xB0 ^ 0x8A ^ (0xC ^ 0x32)) == 0x0) {
            return;
        }
        while (!lIlIIlIllIlllIII(((Iterator)llllllllllllIlIllIIIIlIIIIlIIllI).hasNext() ? 1 : 0)) {
            final ModButton llllllllllllIlIllIIIIlIIIIlIllII = ((Iterator<ModButton>)llllllllllllIlIllIIIIlIIIIlIIllI).next();
            llllllllllllIlIllIIIIlIIIIlIllII.onClick(llllllllllllIlIllIIIIlIIIIlIlIlI, llllllllllllIlIllIIIIlIIIIlIlllI, llllllllllllIlIllIIIIlIIIIlIlIII);
        }
    }
}
