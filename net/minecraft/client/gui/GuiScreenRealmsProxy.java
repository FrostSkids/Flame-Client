// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import java.util.Iterator;
import net.minecraft.item.ItemStack;
import java.util.Collections;
import com.google.common.collect.Lists;
import net.minecraft.realms.RealmsButton;
import java.util.List;
import java.io.IOException;
import net.minecraft.realms.RealmsScreen;

public class GuiScreenRealmsProxy extends GuiScreen
{
    private /* synthetic */ RealmsScreen field_154330_a;
    
    public final void actionPerformed(final GuiButton lllllllllllllIIlIIllIIllIllIlIll) throws IOException {
        this.field_154330_a.buttonClicked(((GuiButtonRealmsProxy)lllllllllllllIIlIIllIIllIllIlIll).getRealmsButton());
    }
    
    public void func_154319_c(final String lllllllllllllIIlIIllIIllIllllIll, final int lllllllllllllIIlIIllIIllIlllllll, final int lllllllllllllIIlIIllIIllIllllIIl, final int lllllllllllllIIlIIllIIllIllllIII) {
        this.fontRendererObj.drawStringWithShadow(lllllllllllllIIlIIllIIllIllllIll, (float)lllllllllllllIIlIIllIIllIlllllll, (float)lllllllllllllIIlIIllIIllIllllIIl, lllllllllllllIIlIIllIIllIllllIII);
        "".length();
    }
    
    public void drawHoveringText(final List<String> lllllllllllllIIlIIllIIlllIIllIIl, final int lllllllllllllIIlIIllIIlllIIllIII, final int lllllllllllllIIlIIllIIlllIIlIlll) {
        super.drawHoveringText(lllllllllllllIIlIIllIIlllIIllIIl, lllllllllllllIIlIIllIIlllIIllIII, lllllllllllllIIlIIllIIlllIIlIlll);
    }
    
    public int func_154329_h() {
        return this.fontRendererObj.FONT_HEIGHT;
    }
    
    public void drawGradientRect(final int lllllllllllllIIlIIllIIllllIllIll, final int lllllllllllllIIlIIllIIllllIlIIll, final int lllllllllllllIIlIIllIIllllIllIIl, final int lllllllllllllIIlIIllIIllllIllIII, final int lllllllllllllIIlIIllIIllllIlIlll, final int lllllllllllllIIlIIllIIllllIlIllI) {
        super.drawGradientRect(lllllllllllllIIlIIllIIllllIllIll, lllllllllllllIIlIIllIIllllIlIIll, lllllllllllllIIlIIllIIllllIllIIl, lllllllllllllIIlIIllIIllllIllIII, lllllllllllllIIlIIllIIllllIlIlll, lllllllllllllIIlIIllIIllllIlIllI);
    }
    
    public void func_154324_i() {
        super.buttonList.clear();
    }
    
    @Override
    public void onGuiClosed() {
        this.field_154330_a.removed();
        super.onGuiClosed();
    }
    
    public void func_154328_b(final RealmsButton lllllllllllllIIlIIllIIllIlIlIIIl) {
        super.buttonList.remove(lllllllllllllIIlIIllIIllIlIlIIIl);
        "".length();
    }
    
    public RealmsScreen func_154321_a() {
        return this.field_154330_a;
    }
    
    @Override
    public void initGui() {
        this.field_154330_a.init();
        super.initGui();
    }
    
    @Override
    public void drawTexturedModalRect(final int lllllllllllllIIlIIllIIllllllIIII, final int lllllllllllllIIlIIllIIlllllIllll, final int lllllllllllllIIlIIllIIlllllIlllI, final int lllllllllllllIIlIIllIIlllllIIllI, final int lllllllllllllIIlIIllIIlllllIllII, final int lllllllllllllIIlIIllIIlllllIIlII) {
        this.field_154330_a.blit(lllllllllllllIIlIIllIIllllllIIII, lllllllllllllIIlIIllIIlllllIllll, lllllllllllllIIlIIllIIlllllIlllI, lllllllllllllIIlIIllIIlllllIIllI, lllllllllllllIIlIIllIIlllllIllII, lllllllllllllIIlIIllIIlllllIIlII);
        super.drawTexturedModalRect(lllllllllllllIIlIIllIIllllllIIII, lllllllllllllIIlIIllIIlllllIllll, lllllllllllllIIlIIllIIlllllIlllI, lllllllllllllIIlIIllIIlllllIIllI, lllllllllllllIIlIIllIIlllllIllII, lllllllllllllIIlIIllIIlllllIIlII);
    }
    
    @Override
    public boolean doesGuiPauseGame() {
        return super.doesGuiPauseGame();
    }
    
    @Override
    public void confirmClicked(final boolean lllllllllllllIIlIIllIIllIIIlIlII, final int lllllllllllllIIlIIllIIllIIIlIIII) {
        this.field_154330_a.confirmResult(lllllllllllllIIlIIllIIllIIIlIlII, lllllllllllllIIlIIllIIllIIIlIIII);
    }
    
    public GuiScreenRealmsProxy(final RealmsScreen lllllllllllllIIlIIllIlIIIIIlllIl) {
        this.field_154330_a = lllllllllllllIIlIIllIlIIIIIlllIl;
        super.buttonList = Collections.synchronizedList((List<GuiButton>)Lists.newArrayList());
    }
    
    public List<RealmsButton> func_154320_j() {
        final List<RealmsButton> lllllllllllllIIlIIllIIllIlIllIlI = (List<RealmsButton>)Lists.newArrayListWithExpectedSize(super.buttonList.size());
        final Exception lllllllllllllIIlIIllIIllIlIlIlIl = (Exception)super.buttonList.iterator();
        "".length();
        if (" ".length() < 0) {
            return null;
        }
        while (!llIlllIIllIIlIl(((Iterator)lllllllllllllIIlIIllIIllIlIlIlIl).hasNext() ? 1 : 0)) {
            final GuiButton lllllllllllllIIlIIllIIllIlIllIIl = ((Iterator<GuiButton>)lllllllllllllIIlIIllIIllIlIlIlIl).next();
            lllllllllllllIIlIIllIIllIlIllIlI.add(((GuiButtonRealmsProxy)lllllllllllllIIlIIllIIllIlIllIIl).getRealmsButton());
            "".length();
        }
        return lllllllllllllIIlIIllIIllIlIllIlI;
    }
    
    public void drawCreativeTabHoveringText(final String lllllllllllllIIlIIllIIlllIlIIIIl, final int lllllllllllllIIlIIllIIlllIlIIIII, final int lllllllllllllIIlIIllIIlllIIlllll) {
        super.drawCreativeTabHoveringText(lllllllllllllIIlIIllIIlllIlIIIIl, lllllllllllllIIlIIllIIlllIlIIIII, lllllllllllllIIlIIllIIlllIIlllll);
    }
    
    @Override
    public void drawDefaultBackground() {
        super.drawDefaultBackground();
    }
    
    public void renderToolTip(final ItemStack lllllllllllllIIlIIllIIlllIllIIIl, final int lllllllllllllIIlIIllIIlllIllIIII, final int lllllllllllllIIlIIllIIlllIlIllll) {
        super.renderToolTip(lllllllllllllIIlIIllIIlllIllIIIl, lllllllllllllIIlIIllIIlllIllIIII, lllllllllllllIIlIIllIIlllIlIllll);
    }
    
    public void mouseClicked(final int lllllllllllllIIlIIllIIllIlIIIlIl, final int lllllllllllllIIlIIllIIllIlIIlIII, final int lllllllllllllIIlIIllIIllIlIIIlll) throws IOException {
        this.field_154330_a.mouseClicked(lllllllllllllIIlIIllIIllIlIIIlIl, lllllllllllllIIlIIllIIllIlIIlIII, lllllllllllllIIlIIllIIllIlIIIlll);
        super.mouseClicked(lllllllllllllIIlIIllIIllIlIIIlIl, lllllllllllllIIlIIllIIllIlIIlIII, lllllllllllllIIlIIllIIllIlIIIlll);
    }
    
    public void mouseReleased(final int lllllllllllllIIlIIllIIllIIllIIll, final int lllllllllllllIIlIIllIIllIIllIllI, final int lllllllllllllIIlIIllIIllIIllIIIl) {
        this.field_154330_a.mouseReleased(lllllllllllllIIlIIllIIllIIllIIll, lllllllllllllIIlIIllIIllIIllIllI, lllllllllllllIIlIIllIIllIIllIIIl);
    }
    
    @Override
    public void drawScreen(final int lllllllllllllIIlIIllIIlllIlllIIl, final int lllllllllllllIIlIIllIIlllIlllIII, final float lllllllllllllIIlIIllIIlllIlllIll) {
        this.field_154330_a.render(lllllllllllllIIlIIllIIlllIlllIIl, lllllllllllllIIlIIllIIlllIlllIII, lllllllllllllIIlIIllIIlllIlllIll);
    }
    
    @Override
    public void updateScreen() {
        this.field_154330_a.tick();
        super.updateScreen();
    }
    
    public void keyTyped(final char lllllllllllllIIlIIllIIllIIIlllIl, final int lllllllllllllIIlIIllIIllIIIllIIl) throws IOException {
        this.field_154330_a.keyPressed(lllllllllllllIIlIIllIIllIIIlllIl, lllllllllllllIIlIIllIIllIIIllIIl);
    }
    
    @Override
    public void handleMouseInput() throws IOException {
        this.field_154330_a.mouseEvent();
        super.handleMouseInput();
    }
    
    public void func_154322_b(final String lllllllllllllIIlIIllIIllllllllII, final int lllllllllllllIIlIIllIIlllllllIll, final int lllllllllllllIIlIIllIIllllllllll, final int lllllllllllllIIlIIllIIlllllllllI) {
        super.drawString(this.fontRendererObj, lllllllllllllIIlIIllIIllllllllII, lllllllllllllIIlIIllIIlllllllIll, lllllllllllllIIlIIllIIllllllllll, lllllllllllllIIlIIllIIlllllllllI);
    }
    
    public int func_154326_c(final String lllllllllllllIIlIIllIIlllIIIIlll) {
        return this.fontRendererObj.getStringWidth(lllllllllllllIIlIIllIIlllIIIIlll);
    }
    
    private static boolean llIlllIIllIIlIl(final int lllllllllllllIIlIIllIIllIIIIlIll) {
        return lllllllllllllIIlIIllIIllIIIIlIll == 0;
    }
    
    public List<String> func_154323_a(final String lllllllllllllIIlIIllIIllIlllIIII, final int lllllllllllllIIlIIllIIllIlllIIlI) {
        return this.fontRendererObj.listFormattedStringToWidth(lllllllllllllIIlIIllIIllIlllIIII, lllllllllllllIIlIIllIIllIlllIIlI);
    }
    
    @Override
    public void handleKeyboardInput() throws IOException {
        this.field_154330_a.keyboardEvent();
        super.handleKeyboardInput();
    }
    
    public void func_154325_a(final String lllllllllllllIIlIIllIlIIIIIlIIII, final int lllllllllllllIIlIIllIlIIIIIIlIlI, final int lllllllllllllIIlIIllIlIIIIIIlIIl, final int lllllllllllllIIlIIllIlIIIIIIllIl) {
        super.drawCenteredString(this.fontRendererObj, lllllllllllllIIlIIllIlIIIIIlIIII, lllllllllllllIIlIIllIlIIIIIIlIlI, lllllllllllllIIlIIllIlIIIIIIlIIl, lllllllllllllIIlIIllIlIIIIIIllIl);
    }
    
    @Override
    public void drawWorldBackground(final int lllllllllllllIIlIIllIIllllIIIIll) {
        super.drawWorldBackground(lllllllllllllIIlIIllIIllllIIIIll);
    }
    
    public void func_154327_a(final RealmsButton lllllllllllllIIlIIllIIllIllIIIlI) {
        super.buttonList.add(lllllllllllllIIlIIllIIllIllIIIlI.getProxy());
        "".length();
    }
    
    public void mouseClickMove(final int lllllllllllllIIlIIllIIllIIlIlIlI, final int lllllllllllllIIlIIllIIllIIlIIlII, final int lllllllllllllIIlIIllIIllIIlIlIII, final long lllllllllllllIIlIIllIIllIIlIIlll) {
        this.field_154330_a.mouseDragged(lllllllllllllIIlIIllIIllIIlIlIlI, lllllllllllllIIlIIllIIllIIlIIlII, lllllllllllllIIlIIllIIllIIlIlIII, lllllllllllllIIlIIllIIllIIlIIlll);
    }
}
