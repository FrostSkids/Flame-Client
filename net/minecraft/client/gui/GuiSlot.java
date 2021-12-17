// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import org.lwjgl.input.Mouse;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.util.MathHelper;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.Minecraft;

public abstract class GuiSlot
{
    protected /* synthetic */ int headerPadding;
    protected /* synthetic */ boolean showSelectionBox;
    protected /* synthetic */ int top;
    protected /* synthetic */ int left;
    private /* synthetic */ int scrollUpButtonID;
    protected /* synthetic */ boolean field_148163_i;
    protected /* synthetic */ int mouseY;
    protected /* synthetic */ int bottom;
    protected final /* synthetic */ Minecraft mc;
    protected /* synthetic */ int right;
    protected /* synthetic */ int width;
    protected /* synthetic */ boolean field_178041_q;
    protected /* synthetic */ int mouseX;
    private static final /* synthetic */ int[] llIIlIIlllllIl;
    protected /* synthetic */ int height;
    protected /* synthetic */ boolean hasListHeader;
    protected /* synthetic */ long lastClicked;
    private /* synthetic */ int scrollDownButtonID;
    private /* synthetic */ boolean enabled;
    protected final /* synthetic */ int slotHeight;
    protected /* synthetic */ float scrollMultiplier;
    protected /* synthetic */ int selectedElement;
    protected /* synthetic */ float amountScrolled;
    protected /* synthetic */ int initialClickY;
    
    public void registerScrollButtons(final int llllllllllllIlllIIlIIIllIIIIlIII, final int llllllllllllIlllIIlIIIllIIIIIlll) {
        this.scrollUpButtonID = llllllllllllIlllIIlIIIllIIIIlIII;
        this.scrollDownButtonID = llllllllllllIlllIIlIIIllIIIIIlll;
    }
    
    public boolean isMouseYWithinSlotBounds(final int llllllllllllIlllIIlIIIlIllllIlll) {
        if (lIIIllIIllIIIIII(llllllllllllIlllIIlIIIlIllllIlll, this.top) && lIIIllIIllIIIIIl(llllllllllllIlllIIlIIIlIllllIlll, this.bottom) && lIIIllIIllIIIIII(this.mouseX, this.left) && lIIIllIIllIIIIIl(this.mouseX, this.right)) {
            return GuiSlot.llIIlIIlllllIl[0] != 0;
        }
        return GuiSlot.llIIlIIlllllIl[3] != 0;
    }
    
    public void setEnabled(final boolean llllllllllllIlllIIlIIIlIlIIlIlII) {
        this.enabled = llllllllllllIlllIIlIIIlIlIIlIlII;
    }
    
    public void drawScreen(final int llllllllllllIlllIIlIIIlIllIllIIl, final int llllllllllllIlllIIlIIIlIllIllIII, final float llllllllllllIlllIIlIIIlIllIlIlll) {
        if (lIIIllIIllIIIIll(this.field_178041_q ? 1 : 0)) {
            this.mouseX = llllllllllllIlllIIlIIIlIllIllIIl;
            this.mouseY = llllllllllllIlllIIlIIIlIllIllIII;
            this.drawBackground();
            final int llllllllllllIlllIIlIIIlIllIlIllI = this.getScrollBarX();
            final int llllllllllllIlllIIlIIIlIllIlIlIl = llllllllllllIlllIIlIIIlIllIlIllI + GuiSlot.llIIlIIlllllIl[7];
            this.bindAmountScrolled();
            GlStateManager.disableLighting();
            GlStateManager.disableFog();
            final Tessellator llllllllllllIlllIIlIIIlIllIlIlII = Tessellator.getInstance();
            final WorldRenderer llllllllllllIlllIIlIIIlIllIlIIll = llllllllllllIlllIIlIIIlIllIlIlII.getWorldRenderer();
            this.mc.getTextureManager().bindTexture(Gui.optionsBackground);
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            final float llllllllllllIlllIIlIIIlIllIlIIlI = 32.0f;
            llllllllllllIlllIIlIIIlIllIlIIll.begin(GuiSlot.llIIlIIlllllIl[8], DefaultVertexFormats.POSITION_TEX_COLOR);
            llllllllllllIlllIIlIIIlIllIlIIll.pos(this.left, this.bottom, 0.0).tex(this.left / llllllllllllIlllIIlIIIlIllIlIIlI, (this.bottom + (int)this.amountScrolled) / llllllllllllIlllIIlIIIlIllIlIIlI).color(GuiSlot.llIIlIIlllllIl[9], GuiSlot.llIIlIIlllllIl[9], GuiSlot.llIIlIIlllllIl[9], GuiSlot.llIIlIIlllllIl[10]).endVertex();
            llllllllllllIlllIIlIIIlIllIlIIll.pos(this.right, this.bottom, 0.0).tex(this.right / llllllllllllIlllIIlIIIlIllIlIIlI, (this.bottom + (int)this.amountScrolled) / llllllllllllIlllIIlIIIlIllIlIIlI).color(GuiSlot.llIIlIIlllllIl[9], GuiSlot.llIIlIIlllllIl[9], GuiSlot.llIIlIIlllllIl[9], GuiSlot.llIIlIIlllllIl[10]).endVertex();
            llllllllllllIlllIIlIIIlIllIlIIll.pos(this.right, this.top, 0.0).tex(this.right / llllllllllllIlllIIlIIIlIllIlIIlI, (this.top + (int)this.amountScrolled) / llllllllllllIlllIIlIIIlIllIlIIlI).color(GuiSlot.llIIlIIlllllIl[9], GuiSlot.llIIlIIlllllIl[9], GuiSlot.llIIlIIlllllIl[9], GuiSlot.llIIlIIlllllIl[10]).endVertex();
            llllllllllllIlllIIlIIIlIllIlIIll.pos(this.left, this.top, 0.0).tex(this.left / llllllllllllIlllIIlIIIlIllIlIIlI, (this.top + (int)this.amountScrolled) / llllllllllllIlllIIlIIIlIllIlIIlI).color(GuiSlot.llIIlIIlllllIl[9], GuiSlot.llIIlIIlllllIl[9], GuiSlot.llIIlIIlllllIl[9], GuiSlot.llIIlIIlllllIl[10]).endVertex();
            llllllllllllIlllIIlIIIlIllIlIlII.draw();
            final int llllllllllllIlllIIlIIIlIllIlIIIl = this.left + this.width / GuiSlot.llIIlIIlllllIl[4] - this.getListWidth() / GuiSlot.llIIlIIlllllIl[4] + GuiSlot.llIIlIIlllllIl[4];
            final int llllllllllllIlllIIlIIIlIllIlIIII = this.top + GuiSlot.llIIlIIlllllIl[5] - (int)this.amountScrolled;
            if (lIIIllIIllIIIIll(this.hasListHeader ? 1 : 0)) {
                this.drawListHeader(llllllllllllIlllIIlIIIlIllIlIIIl, llllllllllllIlllIIlIIIlIllIlIIII, llllllllllllIlllIIlIIIlIllIlIlII);
            }
            this.drawSelectionBox(llllllllllllIlllIIlIIIlIllIlIIIl, llllllllllllIlllIIlIIIlIllIlIIII, llllllllllllIlllIIlIIIlIllIllIIl, llllllllllllIlllIIlIIIlIllIllIII);
            GlStateManager.disableDepth();
            final int llllllllllllIlllIIlIIIlIllIIllll = GuiSlot.llIIlIIlllllIl[5];
            this.overlayBackground(GuiSlot.llIIlIIlllllIl[3], this.top, GuiSlot.llIIlIIlllllIl[10], GuiSlot.llIIlIIlllllIl[10]);
            this.overlayBackground(this.bottom, this.height, GuiSlot.llIIlIIlllllIl[10], GuiSlot.llIIlIIlllllIl[10]);
            GlStateManager.enableBlend();
            GlStateManager.tryBlendFuncSeparate(GuiSlot.llIIlIIlllllIl[11], GuiSlot.llIIlIIlllllIl[12], GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[0]);
            GlStateManager.disableAlpha();
            GlStateManager.shadeModel(GuiSlot.llIIlIIlllllIl[13]);
            GlStateManager.disableTexture2D();
            llllllllllllIlllIIlIIIlIllIlIIll.begin(GuiSlot.llIIlIIlllllIl[8], DefaultVertexFormats.POSITION_TEX_COLOR);
            llllllllllllIlllIIlIIIlIllIlIIll.pos(this.left, this.top + llllllllllllIlllIIlIIIlIllIIllll, 0.0).tex(0.0, 1.0).color(GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[3]).endVertex();
            llllllllllllIlllIIlIIIlIllIlIIll.pos(this.right, this.top + llllllllllllIlllIIlIIIlIllIIllll, 0.0).tex(1.0, 1.0).color(GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[3]).endVertex();
            llllllllllllIlllIIlIIIlIllIlIIll.pos(this.right, this.top, 0.0).tex(1.0, 0.0).color(GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[10]).endVertex();
            llllllllllllIlllIIlIIIlIllIlIIll.pos(this.left, this.top, 0.0).tex(0.0, 0.0).color(GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[10]).endVertex();
            llllllllllllIlllIIlIIIlIllIlIlII.draw();
            llllllllllllIlllIIlIIIlIllIlIIll.begin(GuiSlot.llIIlIIlllllIl[8], DefaultVertexFormats.POSITION_TEX_COLOR);
            llllllllllllIlllIIlIIIlIllIlIIll.pos(this.left, this.bottom, 0.0).tex(0.0, 1.0).color(GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[10]).endVertex();
            llllllllllllIlllIIlIIIlIllIlIIll.pos(this.right, this.bottom, 0.0).tex(1.0, 1.0).color(GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[10]).endVertex();
            llllllllllllIlllIIlIIIlIllIlIIll.pos(this.right, this.bottom - llllllllllllIlllIIlIIIlIllIIllll, 0.0).tex(1.0, 0.0).color(GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[3]).endVertex();
            llllllllllllIlllIIlIIIlIllIlIIll.pos(this.left, this.bottom - llllllllllllIlllIIlIIIlIllIIllll, 0.0).tex(0.0, 0.0).color(GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[3]).endVertex();
            llllllllllllIlllIIlIIIlIllIlIlII.draw();
            final int llllllllllllIlllIIlIIIlIllIIlllI = this.func_148135_f();
            if (lIIIllIIllIIIlIl(llllllllllllIlllIIlIIIlIllIIlllI)) {
                int llllllllllllIlllIIlIIIlIllIIllIl = (this.bottom - this.top) * (this.bottom - this.top) / this.getContentHeight();
                llllllllllllIlllIIlIIIlIllIIllIl = MathHelper.clamp_int(llllllllllllIlllIIlIIIlIllIIllIl, GuiSlot.llIIlIIlllllIl[9], this.bottom - this.top - GuiSlot.llIIlIIlllllIl[14]);
                int llllllllllllIlllIIlIIIlIllIIllII = (int)this.amountScrolled * (this.bottom - this.top - llllllllllllIlllIIlIIIlIllIIllIl) / llllllllllllIlllIIlIIIlIllIIlllI + this.top;
                if (lIIIllIIlIllllll(llllllllllllIlllIIlIIIlIllIIllII, this.top)) {
                    llllllllllllIlllIIlIIIlIllIIllII = this.top;
                }
                llllllllllllIlllIIlIIIlIllIlIIll.begin(GuiSlot.llIIlIIlllllIl[8], DefaultVertexFormats.POSITION_TEX_COLOR);
                llllllllllllIlllIIlIIIlIllIlIIll.pos(llllllllllllIlllIIlIIIlIllIlIllI, this.bottom, 0.0).tex(0.0, 1.0).color(GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[10]).endVertex();
                llllllllllllIlllIIlIIIlIllIlIIll.pos(llllllllllllIlllIIlIIIlIllIlIlIl, this.bottom, 0.0).tex(1.0, 1.0).color(GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[10]).endVertex();
                llllllllllllIlllIIlIIIlIllIlIIll.pos(llllllllllllIlllIIlIIIlIllIlIlIl, this.top, 0.0).tex(1.0, 0.0).color(GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[10]).endVertex();
                llllllllllllIlllIIlIIIlIllIlIIll.pos(llllllllllllIlllIIlIIIlIllIlIllI, this.top, 0.0).tex(0.0, 0.0).color(GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[10]).endVertex();
                llllllllllllIlllIIlIIIlIllIlIlII.draw();
                llllllllllllIlllIIlIIIlIllIlIIll.begin(GuiSlot.llIIlIIlllllIl[8], DefaultVertexFormats.POSITION_TEX_COLOR);
                llllllllllllIlllIIlIIIlIllIlIIll.pos(llllllllllllIlllIIlIIIlIllIlIllI, llllllllllllIlllIIlIIIlIllIIllII + llllllllllllIlllIIlIIIlIllIIllIl, 0.0).tex(0.0, 1.0).color(GuiSlot.llIIlIIlllllIl[15], GuiSlot.llIIlIIlllllIl[15], GuiSlot.llIIlIIlllllIl[15], GuiSlot.llIIlIIlllllIl[10]).endVertex();
                llllllllllllIlllIIlIIIlIllIlIIll.pos(llllllllllllIlllIIlIIIlIllIlIlIl, llllllllllllIlllIIlIIIlIllIIllII + llllllllllllIlllIIlIIIlIllIIllIl, 0.0).tex(1.0, 1.0).color(GuiSlot.llIIlIIlllllIl[15], GuiSlot.llIIlIIlllllIl[15], GuiSlot.llIIlIIlllllIl[15], GuiSlot.llIIlIIlllllIl[10]).endVertex();
                llllllllllllIlllIIlIIIlIllIlIIll.pos(llllllllllllIlllIIlIIIlIllIlIlIl, llllllllllllIlllIIlIIIlIllIIllII, 0.0).tex(1.0, 0.0).color(GuiSlot.llIIlIIlllllIl[15], GuiSlot.llIIlIIlllllIl[15], GuiSlot.llIIlIIlllllIl[15], GuiSlot.llIIlIIlllllIl[10]).endVertex();
                llllllllllllIlllIIlIIIlIllIlIIll.pos(llllllllllllIlllIIlIIIlIllIlIllI, llllllllllllIlllIIlIIIlIllIIllII, 0.0).tex(0.0, 0.0).color(GuiSlot.llIIlIIlllllIl[15], GuiSlot.llIIlIIlllllIl[15], GuiSlot.llIIlIIlllllIl[15], GuiSlot.llIIlIIlllllIl[10]).endVertex();
                llllllllllllIlllIIlIIIlIllIlIlII.draw();
                llllllllllllIlllIIlIIIlIllIlIIll.begin(GuiSlot.llIIlIIlllllIl[8], DefaultVertexFormats.POSITION_TEX_COLOR);
                llllllllllllIlllIIlIIIlIllIlIIll.pos(llllllllllllIlllIIlIIIlIllIlIllI, llllllllllllIlllIIlIIIlIllIIllII + llllllllllllIlllIIlIIIlIllIIllIl - GuiSlot.llIIlIIlllllIl[0], 0.0).tex(0.0, 1.0).color(GuiSlot.llIIlIIlllllIl[16], GuiSlot.llIIlIIlllllIl[16], GuiSlot.llIIlIIlllllIl[16], GuiSlot.llIIlIIlllllIl[10]).endVertex();
                llllllllllllIlllIIlIIIlIllIlIIll.pos(llllllllllllIlllIIlIIIlIllIlIlIl - GuiSlot.llIIlIIlllllIl[0], llllllllllllIlllIIlIIIlIllIIllII + llllllllllllIlllIIlIIIlIllIIllIl - GuiSlot.llIIlIIlllllIl[0], 0.0).tex(1.0, 1.0).color(GuiSlot.llIIlIIlllllIl[16], GuiSlot.llIIlIIlllllIl[16], GuiSlot.llIIlIIlllllIl[16], GuiSlot.llIIlIIlllllIl[10]).endVertex();
                llllllllllllIlllIIlIIIlIllIlIIll.pos(llllllllllllIlllIIlIIIlIllIlIlIl - GuiSlot.llIIlIIlllllIl[0], llllllllllllIlllIIlIIIlIllIIllII, 0.0).tex(1.0, 0.0).color(GuiSlot.llIIlIIlllllIl[16], GuiSlot.llIIlIIlllllIl[16], GuiSlot.llIIlIIlllllIl[16], GuiSlot.llIIlIIlllllIl[10]).endVertex();
                llllllllllllIlllIIlIIIlIllIlIIll.pos(llllllllllllIlllIIlIIIlIllIlIllI, llllllllllllIlllIIlIIIlIllIIllII, 0.0).tex(0.0, 0.0).color(GuiSlot.llIIlIIlllllIl[16], GuiSlot.llIIlIIlllllIl[16], GuiSlot.llIIlIIlllllIl[16], GuiSlot.llIIlIIlllllIl[10]).endVertex();
                llllllllllllIlllIIlIIIlIllIlIlII.draw();
            }
            this.func_148142_b(llllllllllllIlllIIlIIIlIllIllIIl, llllllllllllIlllIIlIIIlIllIllIII);
            GlStateManager.enableTexture2D();
            GlStateManager.shadeModel(GuiSlot.llIIlIIlllllIl[17]);
            GlStateManager.enableAlpha();
            GlStateManager.disableBlend();
        }
    }
    
    public int getAmountScrolled() {
        return (int)this.amountScrolled;
    }
    
    private static boolean lIIIllIIlIllllll(final int llllllllllllIlllIIlIIIlIIIlllIlI, final int llllllllllllIlllIIlIIIlIIIlllIIl) {
        return llllllllllllIlllIIlIIIlIIIlllIlI < llllllllllllIlllIIlIIIlIIIlllIIl;
    }
    
    protected void drawSelectionBox(final int llllllllllllIlllIIlIIIlIlIIIIIIl, final int llllllllllllIlllIIlIIIlIIlllIIll, final int llllllllllllIlllIIlIIIlIIlllIIlI, final int llllllllllllIlllIIlIIIlIIllllllI) {
        final int llllllllllllIlllIIlIIIlIIlllllIl = this.getSize();
        final Tessellator llllllllllllIlllIIlIIIlIIlllllII = Tessellator.getInstance();
        final WorldRenderer llllllllllllIlllIIlIIIlIIllllIll = llllllllllllIlllIIlIIIlIIlllllII.getWorldRenderer();
        int llllllllllllIlllIIlIIIlIIllllIlI = GuiSlot.llIIlIIlllllIl[3];
        "".length();
        if (-(0x2C ^ 0x33 ^ (0x87 ^ 0x9C)) > 0) {
            return;
        }
        while (!lIIIllIIllIIIIII(llllllllllllIlllIIlIIIlIIllllIlI, llllllllllllIlllIIlIIIlIIlllllIl)) {
            final int llllllllllllIlllIIlIIIlIIllllIIl = llllllllllllIlllIIlIIIlIIlllIIll + llllllllllllIlllIIlIIIlIIllllIlI * this.slotHeight + this.headerPadding;
            final int llllllllllllIlllIIlIIIlIIllllIII = this.slotHeight - GuiSlot.llIIlIIlllllIl[5];
            if (!lIIIllIIllIIIIIl(llllllllllllIlllIIlIIIlIIllllIIl, this.bottom) || lIIIllIIlIllllll(llllllllllllIlllIIlIIIlIIllllIIl + llllllllllllIlllIIlIIIlIIllllIII, this.top)) {
                this.func_178040_a(llllllllllllIlllIIlIIIlIIllllIlI, llllllllllllIlllIIlIIIlIlIIIIIIl, llllllllllllIlllIIlIIIlIIllllIIl);
            }
            if (lIIIllIIllIIIIll(this.showSelectionBox ? 1 : 0) && lIIIllIIllIIIIll(this.isSelected(llllllllllllIlllIIlIIIlIIllllIlI) ? 1 : 0)) {
                final int llllllllllllIlllIIlIIIlIIlllIlll = this.left + (this.width / GuiSlot.llIIlIIlllllIl[4] - this.getListWidth() / GuiSlot.llIIlIIlllllIl[4]);
                final int llllllllllllIlllIIlIIIlIIlllIllI = this.left + this.width / GuiSlot.llIIlIIlllllIl[4] + this.getListWidth() / GuiSlot.llIIlIIlllllIl[4];
                GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
                GlStateManager.disableTexture2D();
                llllllllllllIlllIIlIIIlIIllllIll.begin(GuiSlot.llIIlIIlllllIl[8], DefaultVertexFormats.POSITION_TEX_COLOR);
                llllllllllllIlllIIlIIIlIIllllIll.pos(llllllllllllIlllIIlIIIlIIlllIlll, llllllllllllIlllIIlIIIlIIllllIIl + llllllllllllIlllIIlIIIlIIllllIII + GuiSlot.llIIlIIlllllIl[4], 0.0).tex(0.0, 1.0).color(GuiSlot.llIIlIIlllllIl[15], GuiSlot.llIIlIIlllllIl[15], GuiSlot.llIIlIIlllllIl[15], GuiSlot.llIIlIIlllllIl[10]).endVertex();
                llllllllllllIlllIIlIIIlIIllllIll.pos(llllllllllllIlllIIlIIIlIIlllIllI, llllllllllllIlllIIlIIIlIIllllIIl + llllllllllllIlllIIlIIIlIIllllIII + GuiSlot.llIIlIIlllllIl[4], 0.0).tex(1.0, 1.0).color(GuiSlot.llIIlIIlllllIl[15], GuiSlot.llIIlIIlllllIl[15], GuiSlot.llIIlIIlllllIl[15], GuiSlot.llIIlIIlllllIl[10]).endVertex();
                llllllllllllIlllIIlIIIlIIllllIll.pos(llllllllllllIlllIIlIIIlIIlllIllI, llllllllllllIlllIIlIIIlIIllllIIl - GuiSlot.llIIlIIlllllIl[4], 0.0).tex(1.0, 0.0).color(GuiSlot.llIIlIIlllllIl[15], GuiSlot.llIIlIIlllllIl[15], GuiSlot.llIIlIIlllllIl[15], GuiSlot.llIIlIIlllllIl[10]).endVertex();
                llllllllllllIlllIIlIIIlIIllllIll.pos(llllllllllllIlllIIlIIIlIIlllIlll, llllllllllllIlllIIlIIIlIIllllIIl - GuiSlot.llIIlIIlllllIl[4], 0.0).tex(0.0, 0.0).color(GuiSlot.llIIlIIlllllIl[15], GuiSlot.llIIlIIlllllIl[15], GuiSlot.llIIlIIlllllIl[15], GuiSlot.llIIlIIlllllIl[10]).endVertex();
                llllllllllllIlllIIlIIIlIIllllIll.pos(llllllllllllIlllIIlIIIlIIlllIlll + GuiSlot.llIIlIIlllllIl[0], llllllllllllIlllIIlIIIlIIllllIIl + llllllllllllIlllIIlIIIlIIllllIII + GuiSlot.llIIlIIlllllIl[0], 0.0).tex(0.0, 1.0).color(GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[10]).endVertex();
                llllllllllllIlllIIlIIIlIIllllIll.pos(llllllllllllIlllIIlIIIlIIlllIllI - GuiSlot.llIIlIIlllllIl[0], llllllllllllIlllIIlIIIlIIllllIIl + llllllllllllIlllIIlIIIlIIllllIII + GuiSlot.llIIlIIlllllIl[0], 0.0).tex(1.0, 1.0).color(GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[10]).endVertex();
                llllllllllllIlllIIlIIIlIIllllIll.pos(llllllllllllIlllIIlIIIlIIlllIllI - GuiSlot.llIIlIIlllllIl[0], llllllllllllIlllIIlIIIlIIllllIIl - GuiSlot.llIIlIIlllllIl[0], 0.0).tex(1.0, 0.0).color(GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[10]).endVertex();
                llllllllllllIlllIIlIIIlIIllllIll.pos(llllllllllllIlllIIlIIIlIIlllIlll + GuiSlot.llIIlIIlllllIl[0], llllllllllllIlllIIlIIIlIIllllIIl - GuiSlot.llIIlIIlllllIl[0], 0.0).tex(0.0, 0.0).color(GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[3], GuiSlot.llIIlIIlllllIl[10]).endVertex();
                llllllllllllIlllIIlIIIlIIlllllII.draw();
                GlStateManager.enableTexture2D();
            }
            this.drawSlot(llllllllllllIlllIIlIIIlIIllllIlI, llllllllllllIlllIIlIIIlIlIIIIIIl, llllllllllllIlllIIlIIIlIIllllIIl, llllllllllllIlllIIlIIIlIIllllIII, llllllllllllIlllIIlIIIlIIlllIIlI, llllllllllllIlllIIlIIIlIIllllllI);
            ++llllllllllllIlllIIlIIIlIIllllIlI;
        }
    }
    
    public int getListWidth() {
        return GuiSlot.llIIlIIlllllIl[18];
    }
    
    private static boolean lIIIllIIllIIIIIl(final int llllllllllllIlllIIlIIIlIIIllIllI, final int llllllllllllIlllIIlIIIlIIIllIlIl) {
        return llllllllllllIlllIIlIIIlIIIllIllI <= llllllllllllIlllIIlIIIlIIIllIlIl;
    }
    
    protected int getScrollBarX() {
        return this.width / GuiSlot.llIIlIIlllllIl[4] + GuiSlot.llIIlIIlllllIl[19];
    }
    
    public void setSlotXBoundsFromLeft(final int llllllllllllIlllIIlIIIlIIlIIlIlI) {
        this.left = llllllllllllIlllIIlIIIlIIlIIlIlI;
        this.right = llllllllllllIlllIIlIIIlIIlIIlIlI + this.width;
    }
    
    protected void func_178040_a(final int llllllllllllIlllIIlIIIllIIlIlllI, final int llllllllllllIlllIIlIIIllIIlIllIl, final int llllllllllllIlllIIlIIIllIIlIllII) {
    }
    
    private static boolean lIIIllIIllIIIIII(final int llllllllllllIlllIIlIIIlIIIlllllI, final int llllllllllllIlllIIlIIIlIIIllllIl) {
        return llllllllllllIlllIIlIIIlIIIlllllI >= llllllllllllIlllIIlIIIlIIIllllIl;
    }
    
    public void setDimensions(final int llllllllllllIlllIIlIIIllIlIIlIlI, final int llllllllllllIlllIIlIIIllIlIIIlII, final int llllllllllllIlllIIlIIIllIlIIlIII, final int llllllllllllIlllIIlIIIllIlIIIlll) {
        this.width = llllllllllllIlllIIlIIIllIlIIlIlI;
        this.height = llllllllllllIlllIIlIIIllIlIIIlII;
        this.top = llllllllllllIlllIIlIIIllIlIIlIII;
        this.bottom = llllllllllllIlllIIlIIIllIlIIIlll;
        this.left = GuiSlot.llIIlIIlllllIl[3];
        this.right = llllllllllllIlllIIlIIIllIlIIlIlI;
    }
    
    protected abstract boolean isSelected(final int p0);
    
    private static int lIIIllIIllIIIllI(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public int func_148135_f() {
        return Math.max(GuiSlot.llIIlIIlllllIl[3], this.getContentHeight() - (this.bottom - this.top - GuiSlot.llIIlIIlllllIl[5]));
    }
    
    protected abstract void drawSlot(final int p0, final int p1, final int p2, final int p3, final int p4, final int p5);
    
    protected void func_148142_b(final int llllllllllllIlllIIlIIIllIIlIIIll, final int llllllllllllIlllIIlIIIllIIlIIIlI) {
    }
    
    private static boolean lIIIllIIllIIIIll(final int llllllllllllIlllIIlIIIlIIIllIIll) {
        return llllllllllllIlllIIlIIIlIIIllIIll != 0;
    }
    
    protected int getContentHeight() {
        return this.getSize() * this.slotHeight + this.headerPadding;
    }
    
    protected void drawListHeader(final int llllllllllllIlllIIlIIIllIIlIlIlI, final int llllllllllllIlllIIlIIIllIIlIlIIl, final Tessellator llllllllllllIlllIIlIIIllIIlIlIII) {
    }
    
    public void handleMouseInput() {
        if (lIIIllIIllIIIIll(this.isMouseYWithinSlotBounds(this.mouseY) ? 1 : 0)) {
            if (lIIIllIIlIlllllI(Mouse.getEventButton()) && lIIIllIIllIIIIll(Mouse.getEventButtonState() ? 1 : 0) && lIIIllIIllIIIIII(this.mouseY, this.top) && lIIIllIIllIIIIIl(this.mouseY, this.bottom)) {
                final int llllllllllllIlllIIlIIIlIlIllIIlI = (this.width - this.getListWidth()) / GuiSlot.llIIlIIlllllIl[4];
                final int llllllllllllIlllIIlIIIlIlIllIIIl = (this.width + this.getListWidth()) / GuiSlot.llIIlIIlllllIl[4];
                final int llllllllllllIlllIIlIIIlIlIllIIII = this.mouseY - this.top - this.headerPadding + (int)this.amountScrolled - GuiSlot.llIIlIIlllllIl[5];
                final int llllllllllllIlllIIlIIIlIlIlIllll = llllllllllllIlllIIlIIIlIlIllIIII / this.slotHeight;
                if (lIIIllIIlIllllll(llllllllllllIlllIIlIIIlIlIlIllll, this.getSize()) && lIIIllIIllIIIIII(this.mouseX, llllllllllllIlllIIlIIIlIlIllIIlI) && lIIIllIIllIIIIIl(this.mouseX, llllllllllllIlllIIlIIIlIlIllIIIl) && lIIIllIIllIIIIlI(llllllllllllIlllIIlIIIlIlIlIllll) && lIIIllIIllIIIIlI(llllllllllllIlllIIlIIIlIlIllIIII)) {
                    this.elementClicked(llllllllllllIlllIIlIIIlIlIlIllll, (boolean)(GuiSlot.llIIlIIlllllIl[3] != 0), this.mouseX, this.mouseY);
                    this.selectedElement = llllllllllllIlllIIlIIIlIlIlIllll;
                    "".length();
                    if (" ".length() != " ".length()) {
                        return;
                    }
                }
                else if (lIIIllIIllIIIIII(this.mouseX, llllllllllllIlllIIlIIIlIlIllIIlI) && lIIIllIIllIIIIIl(this.mouseX, llllllllllllIlllIIlIIIlIlIllIIIl) && lIIIllIIllIIIlll(llllllllllllIlllIIlIIIlIlIllIIII)) {
                    this.func_148132_a(this.mouseX - llllllllllllIlllIIlIIIlIlIllIIlI, this.mouseY - this.top + (int)this.amountScrolled - GuiSlot.llIIlIIlllllIl[5]);
                }
            }
            if (lIIIllIIllIIIIll(Mouse.isButtonDown(GuiSlot.llIIlIIlllllIl[3]) ? 1 : 0) && lIIIllIIllIIIIll(this.getEnabled() ? 1 : 0)) {
                if (lIIIllIIllIIIlII(this.initialClickY, GuiSlot.llIIlIIlllllIl[2])) {
                    boolean llllllllllllIlllIIlIIIlIlIlIlllI = GuiSlot.llIIlIIlllllIl[0] != 0;
                    if (lIIIllIIllIIIIII(this.mouseY, this.top) && lIIIllIIllIIIIIl(this.mouseY, this.bottom)) {
                        final int llllllllllllIlllIIlIIIlIlIlIllIl = (this.width - this.getListWidth()) / GuiSlot.llIIlIIlllllIl[4];
                        final int llllllllllllIlllIIlIIIlIlIlIllII = (this.width + this.getListWidth()) / GuiSlot.llIIlIIlllllIl[4];
                        final int llllllllllllIlllIIlIIIlIlIlIlIll = this.mouseY - this.top - this.headerPadding + (int)this.amountScrolled - GuiSlot.llIIlIIlllllIl[5];
                        final int llllllllllllIlllIIlIIIlIlIlIlIlI = llllllllllllIlllIIlIIIlIlIlIlIll / this.slotHeight;
                        if (lIIIllIIlIllllll(llllllllllllIlllIIlIIIlIlIlIlIlI, this.getSize()) && lIIIllIIllIIIIII(this.mouseX, llllllllllllIlllIIlIIIlIlIlIllIl) && lIIIllIIllIIIIIl(this.mouseX, llllllllllllIlllIIlIIIlIlIlIllII) && lIIIllIIllIIIIlI(llllllllllllIlllIIlIIIlIlIlIlIlI) && lIIIllIIllIIIIlI(llllllllllllIlllIIlIIIlIlIlIlIll)) {
                            int n;
                            if (lIIIllIIllIIIlII(llllllllllllIlllIIlIIIlIlIlIlIlI, this.selectedElement) && lIIIllIIllIIIlll(lIIIllIIllIIIllI(Minecraft.getSystemTime() - this.lastClicked, 250L))) {
                                n = GuiSlot.llIIlIIlllllIl[0];
                                "".length();
                                if (" ".length() <= ((0x5A ^ 0x46) & ~(0x17 ^ 0xB))) {
                                    return;
                                }
                            }
                            else {
                                n = GuiSlot.llIIlIIlllllIl[3];
                            }
                            final boolean llllllllllllIlllIIlIIIlIlIlIlIIl = n != 0;
                            this.elementClicked(llllllllllllIlllIIlIIIlIlIlIlIlI, llllllllllllIlllIIlIIIlIlIlIlIIl, this.mouseX, this.mouseY);
                            this.selectedElement = llllllllllllIlllIIlIIIlIlIlIlIlI;
                            this.lastClicked = Minecraft.getSystemTime();
                            "".length();
                            if (null != null) {
                                return;
                            }
                        }
                        else if (lIIIllIIllIIIIII(this.mouseX, llllllllllllIlllIIlIIIlIlIlIllIl) && lIIIllIIllIIIIIl(this.mouseX, llllllllllllIlllIIlIIIlIlIlIllII) && lIIIllIIllIIIlll(llllllllllllIlllIIlIIIlIlIlIlIll)) {
                            this.func_148132_a(this.mouseX - llllllllllllIlllIIlIIIlIlIlIllIl, this.mouseY - this.top + (int)this.amountScrolled - GuiSlot.llIIlIIlllllIl[5]);
                            llllllllllllIlllIIlIIIlIlIlIlllI = (GuiSlot.llIIlIIlllllIl[3] != 0);
                        }
                        final int llllllllllllIlllIIlIIIlIlIlIlIII = this.getScrollBarX();
                        final int llllllllllllIlllIIlIIIlIlIlIIlll = llllllllllllIlllIIlIIIlIlIlIlIII + GuiSlot.llIIlIIlllllIl[7];
                        if (lIIIllIIllIIIIII(this.mouseX, llllllllllllIlllIIlIIIlIlIlIlIII) && lIIIllIIllIIIIIl(this.mouseX, llllllllllllIlllIIlIIIlIlIlIIlll)) {
                            this.scrollMultiplier = -1.0f;
                            int llllllllllllIlllIIlIIIlIlIlIIllI = this.func_148135_f();
                            if (lIIIllIIlIllllll(llllllllllllIlllIIlIIIlIlIlIIllI, GuiSlot.llIIlIIlllllIl[0])) {
                                llllllllllllIlllIIlIIIlIlIlIIllI = GuiSlot.llIIlIIlllllIl[0];
                            }
                            int llllllllllllIlllIIlIIIlIlIlIIlIl = (int)((this.bottom - this.top) * (this.bottom - this.top) / (float)this.getContentHeight());
                            llllllllllllIlllIIlIIIlIlIlIIlIl = MathHelper.clamp_int(llllllllllllIlllIIlIIIlIlIlIIlIl, GuiSlot.llIIlIIlllllIl[9], this.bottom - this.top - GuiSlot.llIIlIIlllllIl[14]);
                            this.scrollMultiplier /= (this.bottom - this.top - llllllllllllIlllIIlIIIlIlIlIIlIl) / (float)llllllllllllIlllIIlIIIlIlIlIIllI;
                            "".length();
                            if ("  ".length() <= 0) {
                                return;
                            }
                        }
                        else {
                            this.scrollMultiplier = 1.0f;
                        }
                        if (lIIIllIIllIIIIll(llllllllllllIlllIIlIIIlIlIlIlllI ? 1 : 0)) {
                            this.initialClickY = this.mouseY;
                            "".length();
                            if (" ".length() >= "   ".length()) {
                                return;
                            }
                        }
                        else {
                            this.initialClickY = GuiSlot.llIIlIIlllllIl[1];
                            "".length();
                            if (null != null) {
                                return;
                            }
                        }
                    }
                    else {
                        this.initialClickY = GuiSlot.llIIlIIlllllIl[1];
                        "".length();
                        if ((0x1C ^ 0x18) <= 0) {
                            return;
                        }
                    }
                }
                else if (lIIIllIIllIIIIlI(this.initialClickY)) {
                    this.amountScrolled -= (this.mouseY - this.initialClickY) * this.scrollMultiplier;
                    this.initialClickY = this.mouseY;
                    "".length();
                    if (((0xE9 ^ 0xA2 ^ (0x5E ^ 0x2E)) & (20 + 77 - 36 + 68 ^ 150 + 109 - 153 + 80 ^ -" ".length())) == " ".length()) {
                        return;
                    }
                }
            }
            else {
                this.initialClickY = GuiSlot.llIIlIIlllllIl[2];
            }
            int llllllllllllIlllIIlIIIlIlIlIIlII = Mouse.getEventDWheel();
            if (lIIIllIIllIIIIll(llllllllllllIlllIIlIIIlIlIlIIlII)) {
                if (lIIIllIIllIIIlIl(llllllllllllIlllIIlIIIlIlIlIIlII)) {
                    llllllllllllIlllIIlIIIlIlIlIIlII = GuiSlot.llIIlIIlllllIl[2];
                    "".length();
                    if (((71 + 114 - 81 + 28 ^ 146 + 16 + 13 + 17) & (0x51 ^ 0x17 ^ "  ".length() ^ -" ".length())) != 0x0) {
                        return;
                    }
                }
                else if (lIIIllIIllIIIlll(llllllllllllIlllIIlIIIlIlIlIIlII)) {
                    llllllllllllIlllIIlIIIlIlIlIIlII = GuiSlot.llIIlIIlllllIl[0];
                }
                this.amountScrolled += llllllllllllIlllIIlIIIlIlIlIIlII * this.slotHeight / GuiSlot.llIIlIIlllllIl[4];
            }
        }
    }
    
    public GuiSlot(final Minecraft llllllllllllIlllIIlIIIllIlIlIllI, final int llllllllllllIlllIIlIIIllIlIlIlIl, final int llllllllllllIlllIIlIIIllIlIllIll, final int llllllllllllIlllIIlIIIllIlIlIIll, final int llllllllllllIlllIIlIIIllIlIllIIl, final int llllllllllllIlllIIlIIIllIlIllIII) {
        this.field_148163_i = (GuiSlot.llIIlIIlllllIl[0] != 0);
        this.initialClickY = GuiSlot.llIIlIIlllllIl[1];
        this.selectedElement = GuiSlot.llIIlIIlllllIl[2];
        this.field_178041_q = (GuiSlot.llIIlIIlllllIl[0] != 0);
        this.showSelectionBox = (GuiSlot.llIIlIIlllllIl[0] != 0);
        this.enabled = (GuiSlot.llIIlIIlllllIl[0] != 0);
        this.mc = llllllllllllIlllIIlIIIllIlIlIllI;
        this.width = llllllllllllIlllIIlIIIllIlIlIlIl;
        this.height = llllllllllllIlllIIlIIIllIlIllIll;
        this.top = llllllllllllIlllIIlIIIllIlIlIIll;
        this.bottom = llllllllllllIlllIIlIIIllIlIllIIl;
        this.slotHeight = llllllllllllIlllIIlIIIllIlIllIII;
        this.left = GuiSlot.llIIlIIlllllIl[3];
        this.right = llllllllllllIlllIIlIIIllIlIlIlIl;
    }
    
    protected void func_148132_a(final int llllllllllllIlllIIlIIIllIIlIIllI, final int llllllllllllIlllIIlIIIllIIlIIlIl) {
    }
    
    static {
        lIIIllIIlIllllIl();
    }
    
    protected void setHasListHeader(final boolean llllllllllllIlllIIlIIIllIIllIlII, final int llllllllllllIlllIIlIIIllIIllIIll) {
        this.hasListHeader = llllllllllllIlllIIlIIIllIIllIlII;
        this.headerPadding = llllllllllllIlllIIlIIIllIIllIIll;
        if (lIIIllIIlIlllllI(llllllllllllIlllIIlIIIllIIllIlII ? 1 : 0)) {
            this.headerPadding = GuiSlot.llIIlIIlllllIl[3];
        }
    }
    
    protected abstract void drawBackground();
    
    public void actionPerformed(final GuiButton llllllllllllIlllIIlIIIlIlllIlIll) {
        if (lIIIllIIllIIIIll(llllllllllllIlllIIlIIIlIlllIlIll.enabled ? 1 : 0)) {
            if (lIIIllIIllIIIlII(llllllllllllIlllIIlIIIlIlllIlIll.id, this.scrollUpButtonID)) {
                this.amountScrolled -= this.slotHeight * GuiSlot.llIIlIIlllllIl[4] / GuiSlot.llIIlIIlllllIl[6];
                this.initialClickY = GuiSlot.llIIlIIlllllIl[1];
                this.bindAmountScrolled();
                "".length();
                if ((115 + 124 - 208 + 108 ^ 75 + 79 - 117 + 106) < "   ".length()) {
                    return;
                }
            }
            else if (lIIIllIIllIIIlII(llllllllllllIlllIIlIIIlIlllIlIll.id, this.scrollDownButtonID)) {
                this.amountScrolled += this.slotHeight * GuiSlot.llIIlIIlllllIl[4] / GuiSlot.llIIlIIlllllIl[6];
                this.initialClickY = GuiSlot.llIIlIIlllllIl[1];
                this.bindAmountScrolled();
            }
        }
    }
    
    public boolean getEnabled() {
        return this.enabled;
    }
    
    public void scrollBy(final int llllllllllllIlllIIlIIIlIlllIllll) {
        this.amountScrolled += llllllllllllIlllIIlIIIlIlllIllll;
        this.bindAmountScrolled();
        this.initialClickY = GuiSlot.llIIlIIlllllIl[1];
    }
    
    protected void overlayBackground(final int llllllllllllIlllIIlIIIlIIlIlIlII, final int llllllllllllIlllIIlIIIlIIlIlIIll, final int llllllllllllIlllIIlIIIlIIlIlIIlI, final int llllllllllllIlllIIlIIIlIIlIlIIIl) {
        final Tessellator llllllllllllIlllIIlIIIlIIlIllIII = Tessellator.getInstance();
        final WorldRenderer llllllllllllIlllIIlIIIlIIlIlIlll = llllllllllllIlllIIlIIIlIIlIllIII.getWorldRenderer();
        this.mc.getTextureManager().bindTexture(Gui.optionsBackground);
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        final float llllllllllllIlllIIlIIIlIIlIlIllI = 32.0f;
        llllllllllllIlllIIlIIIlIIlIlIlll.begin(GuiSlot.llIIlIIlllllIl[8], DefaultVertexFormats.POSITION_TEX_COLOR);
        llllllllllllIlllIIlIIIlIIlIlIlll.pos(this.left, llllllllllllIlllIIlIIIlIIlIlIIll, 0.0).tex(0.0, llllllllllllIlllIIlIIIlIIlIlIIll / 32.0f).color(GuiSlot.llIIlIIlllllIl[20], GuiSlot.llIIlIIlllllIl[20], GuiSlot.llIIlIIlllllIl[20], llllllllllllIlllIIlIIIlIIlIlIIIl).endVertex();
        llllllllllllIlllIIlIIIlIIlIlIlll.pos(this.left + this.width, llllllllllllIlllIIlIIIlIIlIlIIll, 0.0).tex(this.width / 32.0f, llllllllllllIlllIIlIIIlIIlIlIIll / 32.0f).color(GuiSlot.llIIlIIlllllIl[20], GuiSlot.llIIlIIlllllIl[20], GuiSlot.llIIlIIlllllIl[20], llllllllllllIlllIIlIIIlIIlIlIIIl).endVertex();
        llllllllllllIlllIIlIIIlIIlIlIlll.pos(this.left + this.width, llllllllllllIlllIIlIIIlIIlIlIlII, 0.0).tex(this.width / 32.0f, llllllllllllIlllIIlIIIlIIlIlIlII / 32.0f).color(GuiSlot.llIIlIIlllllIl[20], GuiSlot.llIIlIIlllllIl[20], GuiSlot.llIIlIIlllllIl[20], llllllllllllIlllIIlIIIlIIlIlIIlI).endVertex();
        llllllllllllIlllIIlIIIlIIlIlIlll.pos(this.left, llllllllllllIlllIIlIIIlIIlIlIlII, 0.0).tex(0.0, llllllllllllIlllIIlIIIlIIlIlIlII / 32.0f).color(GuiSlot.llIIlIIlllllIl[20], GuiSlot.llIIlIIlllllIl[20], GuiSlot.llIIlIIlllllIl[20], llllllllllllIlllIIlIIIlIIlIlIIlI).endVertex();
        llllllllllllIlllIIlIIIlIIlIllIII.draw();
    }
    
    protected abstract int getSize();
    
    public int getSlotIndexFromScreenCoords(final int llllllllllllIlllIIlIIIllIIIllIIl, final int llllllllllllIlllIIlIIIllIIIlIIIl) {
        final int llllllllllllIlllIIlIIIllIIIlIlll = this.left + this.width / GuiSlot.llIIlIIlllllIl[4] - this.getListWidth() / GuiSlot.llIIlIIlllllIl[4];
        final int llllllllllllIlllIIlIIIllIIIlIllI = this.left + this.width / GuiSlot.llIIlIIlllllIl[4] + this.getListWidth() / GuiSlot.llIIlIIlllllIl[4];
        final int llllllllllllIlllIIlIIIllIIIlIlIl = llllllllllllIlllIIlIIIllIIIlIIIl - this.top - this.headerPadding + (int)this.amountScrolled - GuiSlot.llIIlIIlllllIl[5];
        final int llllllllllllIlllIIlIIIllIIIlIlII = llllllllllllIlllIIlIIIllIIIlIlIl / this.slotHeight;
        int n;
        if (lIIIllIIlIllllll(llllllllllllIlllIIlIIIllIIIllIIl, this.getScrollBarX()) && lIIIllIIllIIIIII(llllllllllllIlllIIlIIIllIIIllIIl, llllllllllllIlllIIlIIIllIIIlIlll) && lIIIllIIllIIIIIl(llllllllllllIlllIIlIIIllIIIllIIl, llllllllllllIlllIIlIIIllIIIlIllI) && lIIIllIIllIIIIlI(llllllllllllIlllIIlIIIllIIIlIlII) && lIIIllIIllIIIIlI(llllllllllllIlllIIlIIIllIIIlIlIl) && lIIIllIIlIllllll(llllllllllllIlllIIlIIIllIIIlIlII, this.getSize())) {
            n = llllllllllllIlllIIlIIIllIIIlIlII;
            "".length();
            if (((59 + 85 - 114 + 103 ^ 163 + 98 - 139 + 72) & ("  ".length() ^ (0xDF ^ 0x9A) ^ -" ".length())) > 0) {
                return (39 + 156 - 154 + 182 ^ 108 + 146 - 98 + 0) & (0x54 ^ 0x78 ^ (0x7 ^ 0x68) ^ -" ".length());
            }
        }
        else {
            n = GuiSlot.llIIlIIlllllIl[2];
        }
        return n;
    }
    
    private static boolean lIIIllIIlIlllllI(final int llllllllllllIlllIIlIIIlIIIllIIIl) {
        return llllllllllllIlllIIlIIIlIIIllIIIl == 0;
    }
    
    private static boolean lIIIllIIllIIIlIl(final int llllllllllllIlllIIlIIIlIIIlIlIll) {
        return llllllllllllIlllIIlIIIlIIIlIlIll > 0;
    }
    
    private static boolean lIIIllIIllIIIlll(final int llllllllllllIlllIIlIIIlIIIlIllIl) {
        return llllllllllllIlllIIlIIIlIIIlIllIl < 0;
    }
    
    public int getSlotHeight() {
        return this.slotHeight;
    }
    
    protected void bindAmountScrolled() {
        this.amountScrolled = MathHelper.clamp_float(this.amountScrolled, 0.0f, (float)this.func_148135_f());
    }
    
    private static boolean lIIIllIIllIIIlII(final int llllllllllllIlllIIlIIIlIIlIIIIlI, final int llllllllllllIlllIIlIIIlIIlIIIIIl) {
        return llllllllllllIlllIIlIIIlIIlIIIIlI == llllllllllllIlllIIlIIIlIIlIIIIIl;
    }
    
    private static void lIIIllIIlIllllIl() {
        (llIIlIIlllllIl = new int[21])[0] = " ".length();
        GuiSlot.llIIlIIlllllIl[1] = -"  ".length();
        GuiSlot.llIIlIIlllllIl[2] = -" ".length();
        GuiSlot.llIIlIIlllllIl[3] = ("   ".length() & ~"   ".length());
        GuiSlot.llIIlIIlllllIl[4] = "  ".length();
        GuiSlot.llIIlIIlllllIl[5] = (0x2 ^ 0x6);
        GuiSlot.llIIlIIlllllIl[6] = "   ".length();
        GuiSlot.llIIlIIlllllIl[7] = (87 + 52 - 117 + 109 ^ 42 + 81 - 83 + 93);
        GuiSlot.llIIlIIlllllIl[8] = (0x35 ^ 0x32);
        GuiSlot.llIIlIIlllllIl[9] = (164 + 27 - 114 + 98 ^ 16 + 91 - 85 + 121);
        GuiSlot.llIIlIIlllllIl[10] = 190 + 189 - 163 + 1 + (0x3F ^ 0x30) - -(0x39 ^ 0x3F) + (0x9D ^ 0x8C);
        GuiSlot.llIIlIIlllllIl[11] = (0xFFFF9BC3 & 0x673E);
        GuiSlot.llIIlIIlllllIl[12] = (-(0xFFFFBAFF & 0x75F5) & (0xFFFFF3FF & 0x3FF7));
        GuiSlot.llIIlIIlllllIl[13] = (-(0xFFFFF1F7 & 0x6E9F) & (0xFFFFFFB7 & 0x7DDF));
        GuiSlot.llIIlIIlllllIl[14] = (119 + 148 - 184 + 117 ^ 69 + 158 - 202 + 167);
        GuiSlot.llIIlIIlllllIl[15] = (0xFF ^ 0xC1) + (0xF4 ^ 0xA6) - (0x81 ^ 0xB1) + (0x2A ^ 0xA);
        GuiSlot.llIIlIIlllllIl[16] = 96 + 17 - 101 + 139 + (82 + 12 + 72 + 23) - (205 + 78 - 243 + 195) + (0xE3 ^ 0xB4);
        GuiSlot.llIIlIIlllllIl[17] = (0xFFFFFFBE & 0x1D41);
        GuiSlot.llIIlIIlllllIl[18] = 168 + 106 - 207 + 153;
        GuiSlot.llIIlIIlllllIl[19] = (102 + 217 - 184 + 97 ^ 55 + 38 - 9 + 64);
        GuiSlot.llIIlIIlllllIl[20] = (0x91 ^ 0x8C ^ (0x6B ^ 0x36));
    }
    
    protected abstract void elementClicked(final int p0, final boolean p1, final int p2, final int p3);
    
    private static boolean lIIIllIIllIIIIlI(final int llllllllllllIlllIIlIIIlIIIlIllll) {
        return llllllllllllIlllIIlIIIlIIIlIllll >= 0;
    }
    
    public void setShowSelectionBox(final boolean llllllllllllIlllIIlIIIllIIllllII) {
        this.showSelectionBox = llllllllllllIlllIIlIIIllIIllllII;
    }
}
