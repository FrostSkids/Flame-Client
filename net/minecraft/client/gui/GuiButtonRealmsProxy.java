// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.realms.RealmsButton;

public class GuiButtonRealmsProxy extends GuiButton
{
    private /* synthetic */ RealmsButton realmsButton;
    
    public boolean getEnabled() {
        return super.enabled;
    }
    
    public int getHoverState(final boolean llllllllllllIllIIIlIlIlIIlIllIlI) {
        return this.realmsButton.getYImage(llllllllllllIllIIIlIlIlIIlIllIlI);
    }
    
    public GuiButtonRealmsProxy(final RealmsButton llllllllllllIllIIIlIlIlIlIIllllI, final int llllllllllllIllIIIlIlIlIlIlIIlIl, final int llllllllllllIllIIIlIlIlIlIlIIlII, final int llllllllllllIllIIIlIlIlIlIIllIll, final String llllllllllllIllIIIlIlIlIlIlIIIlI, final int llllllllllllIllIIIlIlIlIlIlIIIIl, final int llllllllllllIllIIIlIlIlIlIIllIII) {
        super(llllllllllllIllIIIlIlIlIlIlIIlIl, llllllllllllIllIIIlIlIlIlIlIIlII, llllllllllllIllIIIlIlIlIlIIllIll, llllllllllllIllIIIlIlIlIlIlIIIIl, llllllllllllIllIIIlIlIlIlIIllIII, llllllllllllIllIIIlIlIlIlIlIIIlI);
        this.realmsButton = llllllllllllIllIIIlIlIlIlIIllllI;
    }
    
    @Override
    public int getButtonWidth() {
        return super.getButtonWidth();
    }
    
    @Override
    public void mouseReleased(final int llllllllllllIllIIIlIlIlIIllIllII, final int llllllllllllIllIIIlIlIlIIllIlIll) {
        this.realmsButton.released(llllllllllllIllIIIlIlIlIIllIllII, llllllllllllIllIIIlIlIlIIllIlIll);
    }
    
    public void setEnabled(final boolean llllllllllllIllIIIlIlIlIlIIIlllI) {
        super.enabled = llllllllllllIllIIIlIlIlIlIIIlllI;
    }
    
    public RealmsButton getRealmsButton() {
        return this.realmsButton;
    }
    
    public void setText(final String llllllllllllIllIIIlIlIlIlIIIlIII) {
        super.displayString = llllllllllllIllIIIlIlIlIlIIIlIII;
    }
    
    public GuiButtonRealmsProxy(final RealmsButton llllllllllllIllIIIlIlIlIlIllIlII, final int llllllllllllIllIIIlIlIlIlIlllIIl, final int llllllllllllIllIIIlIlIlIlIlllIII, final int llllllllllllIllIIIlIlIlIlIllIlll, final String llllllllllllIllIIIlIlIlIlIllIllI) {
        super(llllllllllllIllIIIlIlIlIlIlllIIl, llllllllllllIllIIIlIlIlIlIlllIII, llllllllllllIllIIIlIlIlIlIllIlll, llllllllllllIllIIIlIlIlIlIllIllI);
        this.realmsButton = llllllllllllIllIIIlIlIlIlIllIlII;
    }
    
    public int getPositionY() {
        return super.yPosition;
    }
    
    public void mouseDragged(final Minecraft llllllllllllIllIIIlIlIlIIllIIllI, final int llllllllllllIllIIIlIlIlIIllIIIlI, final int llllllllllllIllIIIlIlIlIIllIIIIl) {
        this.realmsButton.renderBg(llllllllllllIllIIIlIlIlIIllIIIlI, llllllllllllIllIIIlIlIlIIllIIIIl);
    }
    
    public int func_154312_c(final boolean llllllllllllIllIIIlIlIlIIlIlIIlI) {
        return super.getHoverState(llllllllllllIllIIIlIlIlIIlIlIIlI);
    }
    
    @Override
    public boolean mousePressed(final Minecraft llllllllllllIllIIIlIlIlIIllllIlI, final int llllllllllllIllIIIlIlIlIIlllIlIl, final int llllllllllllIllIIIlIlIlIIllllIII) {
        if (lIIllIlllIIIIlIl(super.mousePressed(llllllllllllIllIIIlIlIlIIllllIlI, llllllllllllIllIIIlIlIlIIlllIlIl, llllllllllllIllIIIlIlIlIIllllIII) ? 1 : 0)) {
            this.realmsButton.clicked(llllllllllllIllIIIlIlIlIIlllIlIl, llllllllllllIllIIIlIlIlIIllllIII);
        }
        return super.mousePressed(llllllllllllIllIIIlIlIlIIllllIlI, llllllllllllIllIIIlIlIlIIlllIlIl, llllllllllllIllIIIlIlIlIIllllIII);
    }
    
    private static boolean lIIllIlllIIIIlIl(final int llllllllllllIllIIIlIlIlIIlIIllIl) {
        return llllllllllllIllIIIlIlIlIIlIIllIl != 0;
    }
    
    public int getId() {
        return super.id;
    }
    
    public int func_175232_g() {
        return this.height;
    }
}
