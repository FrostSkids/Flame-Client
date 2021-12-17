// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.realms;

import net.minecraft.client.gui.GuiClickableScrolledSelectionListProxy;

public class RealmsClickableScrolledSelectionList
{
    private final /* synthetic */ GuiClickableScrolledSelectionListProxy proxy;
    private static final /* synthetic */ int[] llIIIIlIlllIIl;
    
    public void scroll(final int llllllllllllIlllIllIllIllIlIIllI) {
        this.proxy.scrollBy(llllllllllllIlllIllIllIllIlIIllI);
    }
    
    public void customMouseEvent(final int llllllllllllIlllIllIllIllIllIIII, final int llllllllllllIlllIllIllIllIlIllll, final int llllllllllllIlllIllIllIllIlIlllI, final float llllllllllllIlllIllIllIllIlIllIl, final int llllllllllllIlllIllIllIllIlIllII) {
    }
    
    public int getScroll() {
        return this.proxy.getAmountScrolled();
    }
    
    public void render(final int llllllllllllIlllIllIllIllllIlIlI, final int llllllllllllIlllIllIllIllllIllIl, final float llllllllllllIlllIllIllIllllIllII) {
        this.proxy.drawScreen(llllllllllllIlllIllIllIllllIlIlI, llllllllllllIlllIllIllIllllIllIl, llllllllllllIlllIllIllIllllIllII);
    }
    
    public void mouseEvent() {
        this.proxy.handleMouseInput();
    }
    
    public void renderSelected(final int llllllllllllIlllIllIllIllIIlIllI, final int llllllllllllIlllIllIllIllIIlIlIl, final int llllllllllllIlllIllIllIllIIlIlII, final Tezzelator llllllllllllIlllIllIllIllIIlIIll) {
    }
    
    private static void lIIIlIIIIIIIIIII() {
        (llIIIIlIlllIIl = new int[3])[0] = ((0x17 ^ 0x13) & ~(0x81 ^ 0x85));
        RealmsClickableScrolledSelectionList.llIIIIlIlllIIl[1] = "  ".length();
        RealmsClickableScrolledSelectionList.llIIIIlIlllIIl[2] = (0x12 ^ 0x6E);
    }
    
    public void selectItem(final int llllllllllllIlllIllIllIllIllllll, final boolean llllllllllllIlllIllIllIllIlllllI, final int llllllllllllIlllIllIllIllIllllIl, final int llllllllllllIlllIllIllIllIllllII) {
    }
    
    public int getMaxPosition() {
        return RealmsClickableScrolledSelectionList.llIIIIlIlllIIl[0];
    }
    
    public RealmsClickableScrolledSelectionList(final int llllllllllllIlllIllIllIllllllllI, final int llllllllllllIlllIllIllIlllllIlll, final int llllllllllllIlllIllIllIlllllllII, final int llllllllllllIlllIllIllIlllllIlIl, final int llllllllllllIlllIllIllIllllllIlI) {
        this.proxy = new GuiClickableScrolledSelectionListProxy(this, llllllllllllIlllIllIllIllllllllI, llllllllllllIlllIllIllIlllllIlll, llllllllllllIlllIllIllIlllllllII, llllllllllllIlllIllIllIlllllIlIl, llllllllllllIlllIllIllIllllllIlI);
    }
    
    public void renderItem(final int llllllllllllIlllIllIllIlllIIlllI, final int llllllllllllIlllIllIllIlllIIllIl, final int llllllllllllIlllIllIllIlllIIllII, final int llllllllllllIlllIllIllIlllIIIlII, final int llllllllllllIlllIllIllIlllIIlIlI, final int llllllllllllIlllIllIllIlllIIIIlI) {
        this.renderItem(llllllllllllIlllIllIllIlllIIlllI, llllllllllllIlllIllIllIlllIIllIl, llllllllllllIlllIllIllIlllIIllII, llllllllllllIlllIllIllIlllIIIlII, Tezzelator.instance, llllllllllllIlllIllIllIlllIIlIlI, llllllllllllIlllIllIllIlllIIIIlI);
    }
    
    protected void renderList(final int llllllllllllIlllIllIllIllIlIIIIl, final int llllllllllllIlllIllIllIllIlIIIII, final int llllllllllllIlllIllIllIllIIlllll, final int llllllllllllIlllIllIllIllIIllllI) {
    }
    
    public void renderBackground() {
    }
    
    static {
        lIIIlIIIIIIIIIII();
    }
    
    public int getItemCount() {
        return RealmsClickableScrolledSelectionList.llIIIIlIlllIIl[0];
    }
    
    public int getScrollbarPosition() {
        return this.proxy.func_178044_e() / RealmsClickableScrolledSelectionList.llIIIIlIlllIIl[1] + RealmsClickableScrolledSelectionList.llIIIIlIlllIIl[2];
    }
    
    public int xm() {
        return this.proxy.func_178045_g();
    }
    
    public void setLeftPos(final int llllllllllllIlllIllIllIllIIIllll) {
        this.proxy.setSlotXBoundsFromLeft(llllllllllllIlllIllIllIllIIIllll);
    }
    
    public int width() {
        return this.proxy.func_178044_e();
    }
    
    public int ym() {
        return this.proxy.func_178042_f();
    }
    
    protected void renderItem(final int llllllllllllIlllIllIllIlllIlllIl, final int llllllllllllIlllIllIllIlllIlllII, final int llllllllllllIlllIllIllIlllIllIll, final int llllllllllllIlllIllIllIlllIllIlI, final Tezzelator llllllllllllIlllIllIllIlllIllIIl, final int llllllllllllIlllIllIllIlllIllIII, final int llllllllllllIlllIllIllIlllIlIlll) {
    }
    
    public void itemClicked(final int llllllllllllIlllIllIllIllIIlllII, final int llllllllllllIlllIllIllIllIIllIll, final int llllllllllllIlllIllIllIllIIllIlI, final int llllllllllllIlllIllIllIllIIllIIl, final int llllllllllllIlllIllIllIllIIllIII) {
    }
    
    public boolean isSelectedItem(final int llllllllllllIlllIllIllIllIlllIlI) {
        return RealmsClickableScrolledSelectionList.llIIIIlIlllIIl[0] != 0;
    }
}
