// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import net.minecraft.client.Minecraft;

public abstract class GuiListExtended extends GuiSlot
{
    private static final /* synthetic */ int[] lllIllIIllIIlI;
    
    private static void lIlIIlIIlIIlIIII() {
        (lllIllIIllIIlI = new int[4])[0] = ((0x4A ^ 0x2B) & ~(0x45 ^ 0x24));
        GuiListExtended.lllIllIIllIIlI[1] = " ".length();
        GuiListExtended.lllIllIIllIIlI[2] = "  ".length();
        GuiListExtended.lllIllIIllIIlI[3] = (0x22 ^ 0x26);
    }
    
    public GuiListExtended(final Minecraft llllllllllllIlIllIIlIllIllllIIIl, final int llllllllllllIlIllIIlIllIllllIIII, final int llllllllllllIlIllIIlIllIllllIllI, final int llllllllllllIlIllIIlIllIllllIlIl, final int llllllllllllIlIllIIlIllIllllIlII, final int llllllllllllIlIllIIlIllIlllIllII) {
        super(llllllllllllIlIllIIlIllIllllIIIl, llllllllllllIlIllIIlIllIllllIIII, llllllllllllIlIllIIlIllIllllIllI, llllllllllllIlIllIIlIllIllllIlIl, llllllllllllIlIllIIlIllIllllIlII, llllllllllllIlIllIIlIllIlllIllII);
    }
    
    @Override
    protected void drawBackground() {
    }
    
    static {
        lIlIIlIIlIIlIIII();
    }
    
    @Override
    protected boolean isSelected(final int llllllllllllIlIllIIlIllIlllIIlIl) {
        return GuiListExtended.lllIllIIllIIlI[0] != 0;
    }
    
    private static boolean lIlIIlIIlIIlIIlI(final int llllllllllllIlIllIIlIllIlIIIIIll) {
        return llllllllllllIlIllIIlIllIlIIIIIll != 0;
    }
    
    public abstract IGuiListEntry getListEntry(final int p0);
    
    private static boolean lIlIIlIIlIIlIIll(final int llllllllllllIlIllIIlIllIlIIIIIIl) {
        return llllllllllllIlIllIIlIllIlIIIIIIl >= 0;
    }
    
    private static boolean lIlIIlIIlIIlIlII(final int llllllllllllIlIllIIlIllIlIIIIllI, final int llllllllllllIlIllIIlIllIlIIIIlIl) {
        return llllllllllllIlIllIIlIllIlIIIIllI >= llllllllllllIlIllIIlIllIlIIIIlIl;
    }
    
    @Override
    protected void func_178040_a(final int llllllllllllIlIllIIlIllIllIIIlIl, final int llllllllllllIlIllIIlIllIllIIlIII, final int llllllllllllIlIllIIlIllIllIIIIll) {
        this.getListEntry(llllllllllllIlIllIIlIllIllIIIlIl).setSelected(llllllllllllIlIllIIlIllIllIIIlIl, llllllllllllIlIllIIlIllIllIIlIII, llllllllllllIlIllIIlIllIllIIIIll);
    }
    
    private static boolean lIlIIlIIlIIlIIIl(final int llllllllllllIlIllIIlIllIlIIIlIlI, final int llllllllllllIlIllIIlIllIlIIIlIIl) {
        return llllllllllllIlIllIIlIllIlIIIlIlI == llllllllllllIlIllIIlIllIlIIIlIIl;
    }
    
    public boolean mouseReleased(final int llllllllllllIlIllIIlIllIlIIlllIl, final int llllllllllllIlIllIIlIllIlIIlIIll, final int llllllllllllIlIllIIlIllIlIIllIll) {
        int llllllllllllIlIllIIlIllIlIIllIlI = GuiListExtended.lllIllIIllIIlI[0];
        "".length();
        if (-" ".length() >= " ".length()) {
            return ((137 + 58 - 158 + 171 ^ 133 + 122 - 178 + 77) & (63 + 185 - 106 + 75 ^ 16 + 91 - 9 + 49 ^ -" ".length())) != 0x0;
        }
        while (!lIlIIlIIlIIlIlII(llllllllllllIlIllIIlIllIlIIllIlI, this.getSize())) {
            final int llllllllllllIlIllIIlIllIlIIllIIl = this.left + this.width / GuiListExtended.lllIllIIllIIlI[2] - this.getListWidth() / GuiListExtended.lllIllIIllIIlI[2] + GuiListExtended.lllIllIIllIIlI[2];
            final int llllllllllllIlIllIIlIllIlIIllIII = this.top + GuiListExtended.lllIllIIllIIlI[3] - this.getAmountScrolled() + llllllllllllIlIllIIlIllIlIIllIlI * this.slotHeight + this.headerPadding;
            final int llllllllllllIlIllIIlIllIlIIlIlll = llllllllllllIlIllIIlIllIlIIlllIl - llllllllllllIlIllIIlIllIlIIllIIl;
            final int llllllllllllIlIllIIlIllIlIIlIllI = llllllllllllIlIllIIlIllIlIIlIIll - llllllllllllIlIllIIlIllIlIIllIII;
            this.getListEntry(llllllllllllIlIllIIlIllIlIIllIlI).mouseReleased(llllllllllllIlIllIIlIllIlIIllIlI, llllllllllllIlIllIIlIllIlIIlllIl, llllllllllllIlIllIIlIllIlIIlIIll, llllllllllllIlIllIIlIllIlIIllIll, llllllllllllIlIllIIlIllIlIIlIlll, llllllllllllIlIllIIlIllIlIIlIllI);
            ++llllllllllllIlIllIIlIllIlIIllIlI;
        }
        this.setEnabled((boolean)(GuiListExtended.lllIllIIllIIlI[1] != 0));
        return GuiListExtended.lllIllIIllIIlI[0] != 0;
    }
    
    public boolean mouseClicked(final int llllllllllllIlIllIIlIllIlIlllIII, final int llllllllllllIlIllIIlIllIlIllIlll, final int llllllllllllIlIllIIlIllIlIlIllIl) {
        if (lIlIIlIIlIIlIIlI(this.isMouseYWithinSlotBounds(llllllllllllIlIllIIlIllIlIllIlll) ? 1 : 0)) {
            final int llllllllllllIlIllIIlIllIlIllIlIl = this.getSlotIndexFromScreenCoords(llllllllllllIlIllIIlIllIlIlllIII, llllllllllllIlIllIIlIllIlIllIlll);
            if (lIlIIlIIlIIlIIll(llllllllllllIlIllIIlIllIlIllIlIl)) {
                final int llllllllllllIlIllIIlIllIlIllIlII = this.left + this.width / GuiListExtended.lllIllIIllIIlI[2] - this.getListWidth() / GuiListExtended.lllIllIIllIIlI[2] + GuiListExtended.lllIllIIllIIlI[2];
                final int llllllllllllIlIllIIlIllIlIllIIll = this.top + GuiListExtended.lllIllIIllIIlI[3] - this.getAmountScrolled() + llllllllllllIlIllIIlIllIlIllIlIl * this.slotHeight + this.headerPadding;
                final int llllllllllllIlIllIIlIllIlIllIIlI = llllllllllllIlIllIIlIllIlIlllIII - llllllllllllIlIllIIlIllIlIllIlII;
                final int llllllllllllIlIllIIlIllIlIllIIIl = llllllllllllIlIllIIlIllIlIllIlll - llllllllllllIlIllIIlIllIlIllIIll;
                if (lIlIIlIIlIIlIIlI(this.getListEntry(llllllllllllIlIllIIlIllIlIllIlIl).mousePressed(llllllllllllIlIllIIlIllIlIllIlIl, llllllllllllIlIllIIlIllIlIlllIII, llllllllllllIlIllIIlIllIlIllIlll, llllllllllllIlIllIIlIllIlIlIllIl, llllllllllllIlIllIIlIllIlIllIIlI, llllllllllllIlIllIIlIllIlIllIIIl) ? 1 : 0)) {
                    this.setEnabled((boolean)(GuiListExtended.lllIllIIllIIlI[0] != 0));
                    return GuiListExtended.lllIllIIllIIlI[1] != 0;
                }
            }
        }
        return GuiListExtended.lllIllIIllIIlI[0] != 0;
    }
    
    @Override
    protected void drawSlot(final int llllllllllllIlIllIIlIllIllIlIlII, final int llllllllllllIlIllIIlIllIllIllIlI, final int llllllllllllIlIllIIlIllIllIllIIl, final int llllllllllllIlIllIIlIllIllIlIIIl, final int llllllllllllIlIllIIlIllIllIlIIII, final int llllllllllllIlIllIIlIllIllIlIllI) {
        final IGuiListEntry listEntry = this.getListEntry(llllllllllllIlIllIIlIllIllIlIlII);
        final int listWidth = this.getListWidth();
        int n;
        if (lIlIIlIIlIIlIIIl(this.getSlotIndexFromScreenCoords(llllllllllllIlIllIIlIllIllIlIIII, llllllllllllIlIllIIlIllIllIlIllI), llllllllllllIlIllIIlIllIllIlIlII)) {
            n = GuiListExtended.lllIllIIllIIlI[1];
            "".length();
            if (" ".length() <= 0) {
                return;
            }
        }
        else {
            n = GuiListExtended.lllIllIIllIIlI[0];
        }
        listEntry.drawEntry(llllllllllllIlIllIIlIllIllIlIlII, llllllllllllIlIllIIlIllIllIllIlI, llllllllllllIlIllIIlIllIllIllIIl, listWidth, llllllllllllIlIllIIlIllIllIlIIIl, llllllllllllIlIllIIlIllIllIlIIII, llllllllllllIlIllIIlIllIllIlIllI, (boolean)(n != 0));
    }
    
    @Override
    protected void elementClicked(final int llllllllllllIlIllIIlIllIlllIlIlI, final boolean llllllllllllIlIllIIlIllIlllIlIIl, final int llllllllllllIlIllIIlIllIlllIlIII, final int llllllllllllIlIllIIlIllIlllIIlll) {
    }
    
    public interface IGuiListEntry
    {
        void mouseReleased(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5);
        
        void setSelected(final int p0, final int p1, final int p2);
        
        boolean mousePressed(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5);
        
        void drawEntry(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5, final int p6, final boolean p7);
    }
}
