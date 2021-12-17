// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import net.minecraft.client.settings.GameSettings;

public class GuiOptionButton extends GuiButton
{
    private static final /* synthetic */ int[] lIlIlIIlllllll;
    private final /* synthetic */ GameSettings.Options enumOptions;
    
    private static void lllIllIlIllIlll() {
        (lIlIlIIlllllll = new int[2])[0] = 119 + 58 - 154 + 127;
        GuiOptionButton.lIlIlIIlllllll[1] = (0x57 ^ 0x43);
    }
    
    public GuiOptionButton(final int lllllllllllllIIIlIIlIIIlIIlIlIlI, final int lllllllllllllIIIlIIlIIIlIIlIlIIl, final int lllllllllllllIIIlIIlIIIlIIlIlllI, final GameSettings.Options lllllllllllllIIIlIIlIIIlIIlIllIl, final String lllllllllllllIIIlIIlIIIlIIlIllII) {
        super(lllllllllllllIIIlIIlIIIlIIlIlIlI, lllllllllllllIIIlIIlIIIlIIlIlIIl, lllllllllllllIIIlIIlIIIlIIlIlllI, GuiOptionButton.lIlIlIIlllllll[0], GuiOptionButton.lIlIlIIlllllll[1], lllllllllllllIIIlIIlIIIlIIlIllII);
        this.enumOptions = lllllllllllllIIIlIIlIIIlIIlIllIl;
    }
    
    public GameSettings.Options returnEnumOptions() {
        return this.enumOptions;
    }
    
    public GuiOptionButton(final int lllllllllllllIIIlIIlIIIlIlIlIIII, final int lllllllllllllIIIlIIlIIIlIlIIllll, final int lllllllllllllIIIlIIlIIIlIlIlIIll, final String lllllllllllllIIIlIIlIIIlIlIlIIlI) {
        this(lllllllllllllIIIlIIlIIIlIlIlIIII, lllllllllllllIIIlIIlIIIlIlIIllll, lllllllllllllIIIlIIlIIIlIlIlIIll, null, lllllllllllllIIIlIIlIIIlIlIlIIlI);
    }
    
    static {
        lllIllIlIllIlll();
    }
    
    public GuiOptionButton(final int lllllllllllllIIIlIIlIIIlIIllllIl, final int lllllllllllllIIIlIIlIIIlIlIIIIll, final int lllllllllllllIIIlIIlIIIlIlIIIIlI, final int lllllllllllllIIIlIIlIIIlIlIIIIIl, final int lllllllllllllIIIlIIlIIIlIIlllIIl, final String lllllllllllllIIIlIIlIIIlIIlllIII) {
        super(lllllllllllllIIIlIIlIIIlIIllllIl, lllllllllllllIIIlIIlIIIlIlIIIIll, lllllllllllllIIIlIIlIIIlIlIIIIlI, lllllllllllllIIIlIIlIIIlIlIIIIIl, lllllllllllllIIIlIIlIIIlIIlllIIl, lllllllllllllIIIlIIlIIIlIIlllIII);
        this.enumOptions = null;
    }
}
