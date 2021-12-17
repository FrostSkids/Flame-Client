// 
// Decompiled by Procyon v0.5.36
// 

package client.ui.clickgui.comp;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;
import java.awt.Color;
import client.hud.mod.HudMod;

public class ModButton
{
    private static final /* synthetic */ int[] lllIIIlllIIlIl;
    public /* synthetic */ HudMod m;
    public /* synthetic */ int h;
    public /* synthetic */ int x;
    public /* synthetic */ int w;
    public /* synthetic */ int y;
    
    private static boolean lIIllllIIIllllII(final int llllllllllllIlIllllllIllllllIlII, final int llllllllllllIlIllllllIllllllIIll) {
        return llllllllllllIlIllllllIllllllIlII >= llllllllllllIlIllllllIllllllIIll;
    }
    
    private static void lIIllllIIIlllIIl() {
        (lllIIIlllIIlIl = new int[6])[0] = ((0x25 ^ 0xF) & ~(0x7D ^ 0x57));
        ModButton.lllIIIlllIIlIl[1] = (0x4C ^ 0x65) + (46 + 31 - 3 + 72) - (0x64 ^ 0x7E) + (0xCC ^ 0xC5);
        ModButton.lllIIIlllIIlIl[2] = "  ".length();
        ModButton.lllIIIlllIIlIl[3] = 201 + 90 - 80 + 8 + (25 + 68 + 61 + 3) - (0xFFFFB77B & 0x49CC) + (203 + 152 - 201 + 53);
        ModButton.lllIIIlllIIlIl[4] = (0x56 ^ 0x58 ^ (0xE1 ^ 0x97));
        ModButton.lllIIIlllIIlIl[5] = " ".length();
    }
    
    public ModButton(final int llllllllllllIlIlllllllIIIIIIlIll, final int llllllllllllIlIlllllllIIIIIlIIII, final int llllllllllllIlIlllllllIIIIIIllll, final int llllllllllllIlIlllllllIIIIIIlIII, final HudMod llllllllllllIlIlllllllIIIIIIllIl) {
        this.x = llllllllllllIlIlllllllIIIIIIlIll;
        this.y = llllllllllllIlIlllllllIIIIIlIIII;
        this.w = llllllllllllIlIlllllllIIIIIIllll;
        this.h = llllllllllllIlIlllllllIIIIIIlIII;
        this.m = llllllllllllIlIlllllllIIIIIIllIl;
    }
    
    private static boolean lIIllllIIIllllIl(final int llllllllllllIlIllllllIllllllIIII, final int llllllllllllIlIllllllIlllllIllll) {
        return llllllllllllIlIllllllIllllllIIII <= llllllllllllIlIllllllIlllllIllll;
    }
    
    private int getColor() {
        if (lIIllllIIIlllIll(this.m.isEnabled() ? 1 : 0)) {
            return new Color(ModButton.lllIIIlllIIlIl[3], ModButton.lllIIIlllIIlIl[1], ModButton.lllIIIlllIIlIl[0], ModButton.lllIIIlllIIlIl[3]).getRGB();
        }
        return new Color(ModButton.lllIIIlllIIlIl[1], ModButton.lllIIIlllIIlIl[0], ModButton.lllIIIlllIIlIl[0], ModButton.lllIIIlllIIlIl[4]).getRGB();
    }
    
    public void draw() {
        Gui.drawRect(this.x, this.y, this.x + this.w, this.y + this.h, new Color(ModButton.lllIIIlllIIlIl[0], ModButton.lllIIIlllIIlIl[0], ModButton.lllIIIlllIIlIl[0], ModButton.lllIIIlllIIlIl[1]).getRGB());
        Minecraft.getMinecraft().fontRendererObj.drawString(this.m.name, this.x + ModButton.lllIIIlllIIlIl[2], this.y + ModButton.lllIIIlllIIlIl[2], this.getColor());
        "".length();
    }
    
    static {
        lIIllllIIIlllIIl();
    }
    
    private static boolean lIIllllIIIlllIll(final int llllllllllllIlIllllllIlllllIllIl) {
        return llllllllllllIlIllllllIlllllIllIl != 0;
    }
    
    public void onClick(final int llllllllllllIlIllllllIllllllllII, final int llllllllllllIlIllllllIllllllIlll, final int llllllllllllIlIllllllIlllllllIlI) {
        if (lIIllllIIIllllII(llllllllllllIlIllllllIllllllllII, this.x) && lIIllllIIIllllIl(llllllllllllIlIllllllIllllllllII, this.x + this.w) && lIIllllIIIllllII(llllllllllllIlIllllllIllllllIlll, this.y) && lIIllllIIIllllIl(llllllllllllIlIllllllIllllllIlll, this.y + this.h)) {
            if (lIIllllIIIlllIll(this.m.isEnabled() ? 1 : 0)) {
                this.m.setEnabled((boolean)(ModButton.lllIIIlllIIlIl[0] != 0));
                System.out.println(this.m.name);
                "".length();
                if ("  ".length() == -" ".length()) {
                    return;
                }
            }
            else {
                this.m.setEnabled((boolean)(ModButton.lllIIIlllIIlIl[5] != 0));
                System.out.println(this.m.name);
            }
        }
    }
}
