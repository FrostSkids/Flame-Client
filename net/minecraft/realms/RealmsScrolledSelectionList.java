// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.realms;

import net.minecraft.client.gui.GuiSlotRealmsProxy;

public class RealmsScrolledSelectionList
{
    private final /* synthetic */ GuiSlotRealmsProxy proxy;
    private static final /* synthetic */ int[] lllIIIlllIlIIl;
    
    protected void renderList(final int llllllllllllIlIllllllIllIIlIlllI, final int llllllllllllIlIllllllIllIIlIllIl, final int llllllllllllIlIllllllIllIIlIllII, final int llllllllllllIlIllllllIllIIlIlIll) {
    }
    
    private static void lIIllllIIlIIIlll() {
        (lllIIIlllIlIIl = new int[3])[0] = ((0x52 ^ 0x75) & ~(0x20 ^ 0x7));
        RealmsScrolledSelectionList.lllIIIlllIlIIl[1] = "  ".length();
        RealmsScrolledSelectionList.lllIIIlllIlIIl[2] = (0x63 ^ 0x1F);
    }
    
    public void scroll(final int llllllllllllIlIllllllIllIIllIIll) {
        this.proxy.scrollBy(llllllllllllIlIllllllIllIIllIIll);
    }
    
    public void renderItem(final int llllllllllllIlIllllllIllIlIIlllI, final int llllllllllllIlIllllllIllIlIIllIl, final int llllllllllllIlIllllllIllIlIlIIll, final int llllllllllllIlIllllllIllIlIIlIll, final int llllllllllllIlIllllllIllIlIlIIIl, final int llllllllllllIlIllllllIllIlIIlIIl) {
        this.renderItem(llllllllllllIlIllllllIllIlIIlllI, llllllllllllIlIllllllIllIlIIllIl, llllllllllllIlIllllllIllIlIlIIll, llllllllllllIlIllllllIllIlIIlIll, Tezzelator.instance, llllllllllllIlIllllllIllIlIlIIIl, llllllllllllIlIllllllIllIlIIlIIl);
    }
    
    protected void renderItem(final int llllllllllllIlIllllllIllIllIIlII, final int llllllllllllIlIllllllIllIllIIIll, final int llllllllllllIlIllllllIllIllIIIlI, final int llllllllllllIlIllllllIllIllIIIIl, final Tezzelator llllllllllllIlIllllllIllIllIIIII, final int llllllllllllIlIllllllIllIlIlllll, final int llllllllllllIlIllllllIllIlIllllI) {
    }
    
    public int ym() {
        return this.proxy.func_154339_l();
    }
    
    static {
        lIIllllIIlIIIlll();
    }
    
    public int xm() {
        return this.proxy.func_154337_m();
    }
    
    public int getMaxPosition() {
        return RealmsScrolledSelectionList.lllIIIlllIlIIl[0];
    }
    
    public void mouseEvent() {
        this.proxy.handleMouseInput();
    }
    
    public int width() {
        return this.proxy.func_154338_k();
    }
    
    public void selectItem(final int llllllllllllIlIllllllIllIlIIIllI, final boolean llllllllllllIlIllllllIllIlIIIlIl, final int llllllllllllIlIllllllIllIlIIIlII, final int llllllllllllIlIllllllIllIlIIIIll) {
    }
    
    public RealmsScrolledSelectionList(final int llllllllllllIlIllllllIlllIIIIlIl, final int llllllllllllIlIllllllIlllIIIIlII, final int llllllllllllIlIllllllIllIlllllIl, final int llllllllllllIlIllllllIlllIIIIIlI, final int llllllllllllIlIllllllIlllIIIIIIl) {
        this.proxy = new GuiSlotRealmsProxy(this, llllllllllllIlIllllllIlllIIIIlIl, llllllllllllIlIllllllIlllIIIIlII, llllllllllllIlIllllllIllIlllllIl, llllllllllllIlIllllllIlllIIIIIlI, llllllllllllIlIllllllIlllIIIIIIl);
    }
    
    public int getItemCount() {
        return RealmsScrolledSelectionList.lllIIIlllIlIIl[0];
    }
    
    public boolean isSelectedItem(final int llllllllllllIlIllllllIllIlIIIIIl) {
        return RealmsScrolledSelectionList.lllIIIlllIlIIl[0] != 0;
    }
    
    public void renderBackground() {
    }
    
    public int getScroll() {
        return this.proxy.getAmountScrolled();
    }
    
    public int getScrollbarPosition() {
        return this.proxy.func_154338_k() / RealmsScrolledSelectionList.lllIIIlllIlIIl[1] + RealmsScrolledSelectionList.lllIIIlllIlIIl[2];
    }
    
    public void render(final int llllllllllllIlIllllllIllIlllIlIl, final int llllllllllllIlIllllllIllIlllIlII, final float llllllllllllIlIllllllIllIlllIIll) {
        this.proxy.drawScreen(llllllllllllIlIllllllIllIlllIlIl, llllllllllllIlIllllllIllIlllIlII, llllllllllllIlIllllllIllIlllIIll);
    }
}
