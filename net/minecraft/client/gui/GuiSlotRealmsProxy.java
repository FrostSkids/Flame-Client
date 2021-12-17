// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.realms.RealmsScrolledSelectionList;

public class GuiSlotRealmsProxy extends GuiSlot
{
    private final /* synthetic */ RealmsScrolledSelectionList selectionList;
    
    @Override
    protected boolean isSelected(final int lllllllllllllIlIIIlllIlIIIllIlIl) {
        return this.selectionList.isSelectedItem(lllllllllllllIlIIIlllIlIIIllIlIl);
    }
    
    public GuiSlotRealmsProxy(final RealmsScrolledSelectionList lllllllllllllIlIIIlllIlIIlIlIIlI, final int lllllllllllllIlIIIlllIlIIlIllIII, final int lllllllllllllIlIIIlllIlIIlIlIIII, final int lllllllllllllIlIIIlllIlIIlIIllll, final int lllllllllllllIlIIIlllIlIIlIlIlIl, final int lllllllllllllIlIIIlllIlIIlIIllIl) {
        super(Minecraft.getMinecraft(), lllllllllllllIlIIIlllIlIIlIllIII, lllllllllllllIlIIIlllIlIIlIlIIII, lllllllllllllIlIIIlllIlIIlIIllll, lllllllllllllIlIIIlllIlIIlIlIlIl, lllllllllllllIlIIIlllIlIIlIIllIl);
        this.selectionList = lllllllllllllIlIIIlllIlIIlIlIIlI;
    }
    
    public int func_154338_k() {
        return super.width;
    }
    
    @Override
    protected void drawSlot(final int lllllllllllllIlIIIlllIlIIIlIlIIl, final int lllllllllllllIlIIIlllIlIIIlIlIII, final int lllllllllllllIlIIIlllIlIIIlIIIII, final int lllllllllllllIlIIIlllIlIIIIlllll, final int lllllllllllllIlIIIlllIlIIIlIIlIl, final int lllllllllllllIlIIIlllIlIIIlIIlII) {
        this.selectionList.renderItem(lllllllllllllIlIIIlllIlIIIlIlIIl, lllllllllllllIlIIIlllIlIIIlIlIII, lllllllllllllIlIIIlllIlIIIlIIIII, lllllllllllllIlIIIlllIlIIIIlllll, lllllllllllllIlIIIlllIlIIIlIIlIl, lllllllllllllIlIIIlllIlIIIlIIlII);
    }
    
    @Override
    protected int getSize() {
        return this.selectionList.getItemCount();
    }
    
    @Override
    protected void elementClicked(final int lllllllllllllIlIIIlllIlIIlIIIIll, final boolean lllllllllllllIlIIIlllIlIIlIIIIlI, final int lllllllllllllIlIIIlllIlIIlIIIIIl, final int lllllllllllllIlIIIlllIlIIIlllIll) {
        this.selectionList.selectItem(lllllllllllllIlIIIlllIlIIlIIIIll, lllllllllllllIlIIIlllIlIIlIIIIlI, lllllllllllllIlIIIlllIlIIlIIIIIl, lllllllllllllIlIIIlllIlIIIlllIll);
    }
    
    @Override
    public void handleMouseInput() {
        super.handleMouseInput();
    }
    
    @Override
    protected int getScrollBarX() {
        return this.selectionList.getScrollbarPosition();
    }
    
    @Override
    protected void drawBackground() {
        this.selectionList.renderBackground();
    }
    
    public int func_154339_l() {
        return super.mouseY;
    }
    
    @Override
    protected int getContentHeight() {
        return this.selectionList.getMaxPosition();
    }
    
    public int func_154337_m() {
        return super.mouseX;
    }
}
