// 
// Decompiled by Procyon v0.5.36
// 

package client.hud;

import java.util.Iterator;
import client.hud.mod.HudMod;
import client.ClientName;
import net.minecraft.client.gui.GuiScreen;

public class HudConfigScreen extends GuiScreen
{
    @Override
    public void drawScreen(final int llllllllllllIllllIllIlIIIlIllIIl, final int llllllllllllIllllIllIlIIIlIlIIll, final float llllllllllllIllllIllIlIIIlIlIIlI) {
        this.drawDefaultBackground();
        final byte llllllllllllIllllIllIlIIIlIlIIII = (byte)ClientName.INSTANCE.hudManager.hudMods.iterator();
        "".length();
        if ((0x6D ^ 0x69) != (0x84 ^ 0x80)) {
            return;
        }
        while (!lIIIIIlllIIllIIl(((Iterator)llllllllllllIllllIllIlIIIlIlIIII).hasNext() ? 1 : 0)) {
            final HudMod llllllllllllIllllIllIlIIIlIlIllI = ((Iterator<HudMod>)llllllllllllIllllIllIlIIIlIlIIII).next();
            if (lIIIIIlllIIllIII(llllllllllllIllllIllIlIIIlIlIllI.isEnabled() ? 1 : 0)) {
                llllllllllllIllllIllIlIIIlIlIllI.renderDummy(llllllllllllIllllIllIlIIIlIllIIl, llllllllllllIllllIllIlIIIlIlIIll);
            }
        }
        super.drawScreen(llllllllllllIllllIllIlIIIlIllIIl, llllllllllllIllllIllIlIIIlIlIIll, llllllllllllIllllIllIlIIIlIlIIlI);
    }
    
    private static boolean lIIIIIlllIIllIII(final int llllllllllllIllllIllIlIIIlIIlllI) {
        return llllllllllllIllllIllIlIIIlIIlllI != 0;
    }
    
    private static boolean lIIIIIlllIIllIIl(final int llllllllllllIllllIllIlIIIlIIllII) {
        return llllllllllllIllllIllIlIIIlIIllII == 0;
    }
}
