// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.realms.Tezzelator;
import org.lwjgl.input.Mouse;
import net.minecraft.realms.RealmsClickableScrolledSelectionList;

public class GuiClickableScrolledSelectionListProxy extends GuiSlot
{
    private static final /* synthetic */ int[] lllllIllIIIlI;
    private final /* synthetic */ RealmsClickableScrolledSelectionList field_178046_u;
    
    @Override
    protected int getScrollBarX() {
        return this.field_178046_u.getScrollbarPosition();
    }
    
    private static int lIlIlllIllIlIlI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    @Override
    public void handleMouseInput() {
        super.handleMouseInput();
        if (lIlIlllIllIlIll(lIlIlllIllIlIlI(this.scrollMultiplier, 0.0f)) && lIlIlllIllIllII(Mouse.getEventButtonState() ? 1 : 0)) {
            this.field_178046_u.customMouseEvent(this.top, this.bottom, this.headerPadding, this.amountScrolled, this.slotHeight);
        }
    }
    
    public int func_178042_f() {
        return super.mouseY;
    }
    
    private static void lIlIlllIllIlIIl() {
        (lllllIllIIIlI = new int[2])[0] = ((0x53 ^ 0x71 ^ (0x4 ^ 0x61)) & (15 + 123 - 120 + 193 ^ 112 + 27 + 1 + 8 ^ -" ".length()));
        GuiClickableScrolledSelectionListProxy.lllllIllIIIlI[1] = (0x32 ^ 0x36);
    }
    
    public void func_178043_a(final int lllllllllllllIlIlIllIlIIlIIIIIll, final int lllllllllllllIlIlIllIlIIlIIIIIlI, final int lllllllllllllIlIlIllIlIIIlllllII, final Tezzelator lllllllllllllIlIlIllIlIIlIIIIIII) {
        this.field_178046_u.renderSelected(lllllllllllllIlIlIllIlIIlIIIIIll, lllllllllllllIlIlIllIlIIlIIIIIlI, lllllllllllllIlIlIllIlIIIlllllII, lllllllllllllIlIlIllIlIIlIIIIIII);
    }
    
    private static boolean lIlIlllIllIllII(final int lllllllllllllIlIlIllIlIIIlIlIIlI) {
        return lllllllllllllIlIlIllIlIIIlIlIIlI != 0;
    }
    
    public int func_178045_g() {
        return super.mouseX;
    }
    
    @Override
    protected void drawSlot(final int lllllllllllllIlIlIllIlIIlIlIIIIl, final int lllllllllllllIlIlIllIlIIlIlIIlll, final int lllllllllllllIlIlIllIlIIlIlIIllI, final int lllllllllllllIlIlIllIlIIlIlIIlIl, final int lllllllllllllIlIlIllIlIIlIlIIlII, final int lllllllllllllIlIlIllIlIIlIlIIIll) {
        this.field_178046_u.renderItem(lllllllllllllIlIlIllIlIIlIlIIIIl, lllllllllllllIlIlIllIlIIlIlIIlll, lllllllllllllIlIlIllIlIIlIlIIllI, lllllllllllllIlIlIllIlIIlIlIIlIl, lllllllllllllIlIlIllIlIIlIlIIlII, lllllllllllllIlIlIllIlIIlIlIIIll);
    }
    
    @Override
    protected void drawBackground() {
        this.field_178046_u.renderBackground();
    }
    
    static {
        lIlIlllIllIlIIl();
    }
    
    @Override
    protected boolean isSelected(final int lllllllllllllIlIlIllIlIIlIllIlII) {
        return this.field_178046_u.isSelectedItem(lllllllllllllIlIlIllIlIIlIllIlII);
    }
    
    @Override
    protected int getContentHeight() {
        return this.field_178046_u.getMaxPosition();
    }
    
    @Override
    protected int getSize() {
        return this.field_178046_u.getItemCount();
    }
    
    @Override
    protected void elementClicked(final int lllllllllllllIlIlIllIlIIlIllllIl, final boolean lllllllllllllIlIlIllIlIIlIllllII, final int lllllllllllllIlIlIllIlIIllIIIIII, final int lllllllllllllIlIlIllIlIIlIlllIlI) {
        this.field_178046_u.selectItem(lllllllllllllIlIlIllIlIIlIllllIl, lllllllllllllIlIlIllIlIIlIllllII, lllllllllllllIlIlIllIlIIllIIIIII, lllllllllllllIlIlIllIlIIlIlllIlI);
    }
    
    public int func_178044_e() {
        return super.width;
    }
    
    private static boolean lIlIlllIllIllIl(final int lllllllllllllIlIlIllIlIIIlIlIlIl, final int lllllllllllllIlIlIllIlIIIlIlIlII) {
        return lllllllllllllIlIlIllIlIIIlIlIlIl <= lllllllllllllIlIlIllIlIIIlIlIlII;
    }
    
    private static boolean lIlIlllIllIllll(final int lllllllllllllIlIlIllIlIIIlIlllIl, final int lllllllllllllIlIlIllIlIIIlIlllII) {
        return lllllllllllllIlIlIllIlIIIlIlllIl >= lllllllllllllIlIlIllIlIIIlIlllII;
    }
    
    private static boolean lIlIlllIllIlllI(final int lllllllllllllIlIlIllIlIIIlIllIIl, final int lllllllllllllIlIlIllIlIIIlIllIII) {
        return lllllllllllllIlIlIllIlIIIlIllIIl < lllllllllllllIlIlIllIlIIIlIllIII;
    }
    
    public GuiClickableScrolledSelectionListProxy(final RealmsClickableScrolledSelectionList lllllllllllllIlIlIllIlIIllIllIII, final int lllllllllllllIlIlIllIlIIllIlIIII, final int lllllllllllllIlIlIllIlIIllIlIllI, final int lllllllllllllIlIlIllIlIIllIlIlIl, final int lllllllllllllIlIlIllIlIIllIIllIl, final int lllllllllllllIlIlIllIlIIllIlIIll) {
        super(Minecraft.getMinecraft(), lllllllllllllIlIlIllIlIIllIlIIII, lllllllllllllIlIlIllIlIIllIlIllI, lllllllllllllIlIlIllIlIIllIlIlIl, lllllllllllllIlIlIllIlIIllIIllIl, lllllllllllllIlIlIllIlIIllIlIIll);
        this.field_178046_u = lllllllllllllIlIlIllIlIIllIllIII;
    }
    
    private static boolean lIlIlllIllIlIll(final int lllllllllllllIlIlIllIlIIIlIlIIII) {
        return lllllllllllllIlIlIllIlIIIlIlIIII > 0;
    }
    
    @Override
    protected void drawSelectionBox(final int lllllllllllllIlIlIllIlIIIllIIlll, final int lllllllllllllIlIlIllIlIIIllIllll, final int lllllllllllllIlIlIllIlIIIllIIlIl, final int lllllllllllllIlIlIllIlIIIllIllIl) {
        final int lllllllllllllIlIlIllIlIIIllIllII = this.getSize();
        int lllllllllllllIlIlIllIlIIIllIlIll = GuiClickableScrolledSelectionListProxy.lllllIllIIIlI[0];
        "".length();
        if (-" ".length() >= 0) {
            return;
        }
        while (!lIlIlllIllIllll(lllllllllllllIlIlIllIlIIIllIlIll, lllllllllllllIlIlIllIlIIIllIllII)) {
            final int lllllllllllllIlIlIllIlIIIllIlIlI = lllllllllllllIlIlIllIlIIIllIllll + lllllllllllllIlIlIllIlIIIllIlIll * this.slotHeight + this.headerPadding;
            final int lllllllllllllIlIlIllIlIIIllIlIIl = this.slotHeight - GuiClickableScrolledSelectionListProxy.lllllIllIIIlI[1];
            if (!lIlIlllIllIllIl(lllllllllllllIlIlIllIlIIIllIlIlI, this.bottom) || lIlIlllIllIlllI(lllllllllllllIlIlIllIlIIIllIlIlI + lllllllllllllIlIlIllIlIIIllIlIIl, this.top)) {
                this.func_178040_a(lllllllllllllIlIlIllIlIIIllIlIll, lllllllllllllIlIlIllIlIIIllIIlll, lllllllllllllIlIlIllIlIIIllIlIlI);
            }
            if (lIlIlllIllIllII(this.showSelectionBox ? 1 : 0) && lIlIlllIllIllII(this.isSelected(lllllllllllllIlIlIllIlIIIllIlIll) ? 1 : 0)) {
                this.func_178043_a(this.width, lllllllllllllIlIlIllIlIIIllIlIlI, lllllllllllllIlIlIllIlIIIllIlIIl, Tezzelator.instance);
            }
            this.drawSlot(lllllllllllllIlIlIllIlIIIllIlIll, lllllllllllllIlIlIllIlIIIllIIlll, lllllllllllllIlIlIllIlIIIllIlIlI, lllllllllllllIlIlIllIlIIIllIlIIl, lllllllllllllIlIlIllIlIIIllIIlIl, lllllllllllllIlIlIllIlIIIllIllIl);
            ++lllllllllllllIlIlIllIlIIIllIlIll;
        }
    }
}
