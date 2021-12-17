// 
// Decompiled by Procyon v0.5.36
// 

package client.util;

import net.minecraft.client.gui.Gui;

public class RenderUtil
{
    public static void drawHollowRect(final int llllllllllllIlIllIllIIllIlllllIl, final int llllllllllllIlIllIllIIllIlllIlll, final int llllllllllllIlIllIllIIllIlllIllI, final int llllllllllllIlIllIllIIllIllllIlI, final int llllllllllllIlIllIllIIllIllllIIl) {
        Gui.drawHorizontalLine(llllllllllllIlIllIllIIllIlllllIl, llllllllllllIlIllIllIIllIlllllIl + llllllllllllIlIllIllIIllIlllIllI, llllllllllllIlIllIllIIllIlllIlll, llllllllllllIlIllIllIIllIllllIIl);
        Gui.drawHorizontalLine(llllllllllllIlIllIllIIllIlllllIl, llllllllllllIlIllIllIIllIlllllIl + llllllllllllIlIllIllIIllIlllIllI, llllllllllllIlIllIllIIllIlllIlll + llllllllllllIlIllIllIIllIllllIlI, llllllllllllIlIllIllIIllIllllIIl);
        Gui.drawVerticalLine(llllllllllllIlIllIllIIllIlllllIl + llllllllllllIlIllIllIIllIlllIllI, llllllllllllIlIllIllIIllIlllIlll + llllllllllllIlIllIllIIllIllllIlI, llllllllllllIlIllIllIIllIlllIlll, llllllllllllIlIllIllIIllIllllIIl);
        Gui.drawVerticalLine(llllllllllllIlIllIllIIllIlllllIl + llllllllllllIlIllIllIIllIlllIllI, llllllllllllIlIllIllIIllIlllIlll + llllllllllllIlIllIllIIllIllllIlI, llllllllllllIlIllIllIIllIlllIlll, llllllllllllIlIllIllIIllIllllIIl);
    }
}
