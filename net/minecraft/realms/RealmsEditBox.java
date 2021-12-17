// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.realms;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiTextField;

public class RealmsEditBox
{
    private final /* synthetic */ GuiTextField editBox;
    
    public void mouseClicked(final int lllllllllllllIIIIIlllllIIlIlIllI, final int lllllllllllllIIIIIlllllIIlIllIIl, final int lllllllllllllIIIIIlllllIIlIllIII) {
        this.editBox.mouseClicked(lllllllllllllIIIIIlllllIIlIlIllI, lllllllllllllIIIIIlllllIIlIllIIl, lllllllllllllIIIIIlllllIIlIllIII);
    }
    
    public RealmsEditBox(final int lllllllllllllIIIIIlllllIlIIIIIlI, final int lllllllllllllIIIIIlllllIlIIIIlll, final int lllllllllllllIIIIIlllllIlIIIIIII, final int lllllllllllllIIIIIlllllIIlllllll, final int lllllllllllllIIIIIlllllIlIIIIlII) {
        this.editBox = new GuiTextField(lllllllllllllIIIIIlllllIlIIIIIlI, Minecraft.getMinecraft().fontRendererObj, lllllllllllllIIIIIlllllIlIIIIlll, lllllllllllllIIIIIlllllIlIIIIIII, lllllllllllllIIIIIlllllIIlllllll, lllllllllllllIIIIIlllllIlIIIIlII);
    }
    
    public void keyPressed(final char lllllllllllllIIIIIlllllIIllIIlll, final int lllllllllllllIIIIIlllllIIllIIIll) {
        this.editBox.textboxKeyTyped(lllllllllllllIIIIIlllllIIllIIlll, lllllllllllllIIIIIlllllIIllIIIll);
        "".length();
    }
    
    public void tick() {
        this.editBox.updateCursorCounter();
    }
    
    public void setValue(final String lllllllllllllIIIIIlllllIIllIllII) {
        this.editBox.setText(lllllllllllllIIIIIlllllIIllIllII);
    }
    
    public String getValue() {
        return this.editBox.getText();
    }
    
    public void render() {
        this.editBox.drawTextBox();
    }
    
    public boolean isFocused() {
        return this.editBox.isFocused();
    }
    
    public void setMaxLength(final int lllllllllllllIIIIIlllllIIlIIlIll) {
        this.editBox.setMaxStringLength(lllllllllllllIIIIIlllllIIlIIlIll);
    }
    
    public void setFocus(final boolean lllllllllllllIIIIIlllllIIlllIlII) {
        this.editBox.setFocused(lllllllllllllIIIIIlllllIIlllIlII);
    }
    
    public void setIsEditable(final boolean lllllllllllllIIIIIlllllIIlIIIlll) {
        this.editBox.setEnabled(lllllllllllllIIIIIlllllIIlIIIlll);
    }
}
