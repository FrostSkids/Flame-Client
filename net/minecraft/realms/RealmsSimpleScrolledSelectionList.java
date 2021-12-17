// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.realms;

import net.minecraft.client.gui.GuiSimpleScrolledSelectionListProxy;

public class RealmsSimpleScrolledSelectionList
{
    private final /* synthetic */ GuiSimpleScrolledSelectionListProxy proxy;
    private static final /* synthetic */ int[] lIIIlIIlIIlIII;
    
    static {
        lIllllllIIllIlI();
    }
    
    protected void renderItem(final int lllllllllllllIlIIIlIlIllIIIIllIl, final int lllllllllllllIlIIIlIlIllIIIIllII, final int lllllllllllllIlIIIlIlIllIIIIlIll, final int lllllllllllllIlIIIlIlIllIIIIlIlI, final Tezzelator lllllllllllllIlIIIlIlIllIIIIlIIl, final int lllllllllllllIlIIIlIlIllIIIIlIII, final int lllllllllllllIlIIIlIlIllIIIIIlll) {
    }
    
    private static void lIllllllIIllIlI() {
        (lIIIlIIlIIlIII = new int[3])[0] = ((0x3B ^ 0x4) & ~(0x5D ^ 0x62));
        RealmsSimpleScrolledSelectionList.lIIIlIIlIIlIII[1] = "  ".length();
        RealmsSimpleScrolledSelectionList.lIIIlIIlIIlIII[2] = (0xC4 ^ 0xB8);
    }
    
    public int width() {
        return this.proxy.getWidth();
    }
    
    public boolean isSelectedItem(final int lllllllllllllIlIIIlIlIlIlllIlIlI) {
        return RealmsSimpleScrolledSelectionList.lIIIlIIlIIlIII[0] != 0;
    }
    
    public int getScrollbarPosition() {
        return this.proxy.getWidth() / RealmsSimpleScrolledSelectionList.lIIIlIIlIIlIII[1] + RealmsSimpleScrolledSelectionList.lIIIlIIlIIlIII[2];
    }
    
    public void mouseEvent() {
        this.proxy.handleMouseInput();
    }
    
    public void renderItem(final int lllllllllllllIlIIIlIlIlIlllllllI, final int lllllllllllllIlIIIlIlIlIllllIllI, final int lllllllllllllIlIIIlIlIlIllllllII, final int lllllllllllllIlIIIlIlIlIlllllIll, final int lllllllllllllIlIIIlIlIlIlllllIlI, final int lllllllllllllIlIIIlIlIlIlllllIIl) {
        this.renderItem(lllllllllllllIlIIIlIlIlIlllllllI, lllllllllllllIlIIIlIlIlIllllIllI, lllllllllllllIlIIIlIlIlIllllllII, lllllllllllllIlIIIlIlIlIlllllIll, Tezzelator.instance, lllllllllllllIlIIIlIlIlIlllllIlI, lllllllllllllIlIIIlIlIlIlllllIIl);
    }
    
    public int getItemCount() {
        return RealmsSimpleScrolledSelectionList.lIIIlIIlIIlIII[0];
    }
    
    public RealmsSimpleScrolledSelectionList(final int lllllllllllllIlIIIlIlIllIIlIlllI, final int lllllllllllllIlIIIlIlIllIIlIIlll, final int lllllllllllllIlIIIlIlIllIIlIllII, final int lllllllllllllIlIIIlIlIllIIlIlIll, final int lllllllllllllIlIIIlIlIllIIlIIlII) {
        this.proxy = new GuiSimpleScrolledSelectionListProxy(this, lllllllllllllIlIIIlIlIllIIlIlllI, lllllllllllllIlIIIlIlIllIIlIIlll, lllllllllllllIlIIIlIlIllIIlIllII, lllllllllllllIlIIIlIlIllIIlIlIll, lllllllllllllIlIIIlIlIllIIlIIlII);
    }
    
    public void selectItem(final int lllllllllllllIlIIIlIlIlIlllIllll, final boolean lllllllllllllIlIIIlIlIlIlllIlllI, final int lllllllllllllIlIIIlIlIlIlllIllIl, final int lllllllllllllIlIIIlIlIlIlllIllII) {
    }
    
    public void scroll(final int lllllllllllllIlIIIlIlIlIllIlllII) {
        this.proxy.scrollBy(lllllllllllllIlIIIlIlIlIllIlllII);
    }
    
    public int getScroll() {
        return this.proxy.getAmountScrolled();
    }
    
    public int getMaxPosition() {
        return RealmsSimpleScrolledSelectionList.lIIIlIIlIIlIII[0];
    }
    
    public int xm() {
        return this.proxy.getMouseX();
    }
    
    protected void renderList(final int lllllllllllllIlIIIlIlIlIllIlIlll, final int lllllllllllllIlIIIlIlIlIllIlIllI, final int lllllllllllllIlIIIlIlIlIllIlIlII, final int lllllllllllllIlIIIlIlIlIllIlIIll) {
    }
    
    public void renderBackground() {
    }
    
    public int ym() {
        return this.proxy.getMouseY();
    }
    
    public void render(final int lllllllllllllIlIIIlIlIllIIIllIlI, final int lllllllllllllIlIIIlIlIllIIIllIIl, final float lllllllllllllIlIIIlIlIllIIIlllII) {
        this.proxy.drawScreen(lllllllllllllIlIIIlIlIllIIIllIlI, lllllllllllllIlIIIlIlIllIIIllIIl, lllllllllllllIlIIIlIlIllIIIlllII);
    }
}
