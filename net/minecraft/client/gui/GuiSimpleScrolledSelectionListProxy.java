// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.util.MathHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.realms.RealmsSimpleScrolledSelectionList;

public class GuiSimpleScrolledSelectionListProxy extends GuiSlot
{
    private static final /* synthetic */ int[] lIIIIllIllIIlI;
    private final /* synthetic */ RealmsSimpleScrolledSelectionList field_178050_u;
    
    public int getMouseY() {
        return super.mouseY;
    }
    
    private static void lIllllIIIIIIllI() {
        (lIIIIllIllIIlI = new int[15])[0] = (0xC2 ^ 0xC4);
        GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[1] = "  ".length();
        GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[2] = (0xA ^ 0xE);
        GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[3] = ((0x9A ^ 0xC4) & ~(0xE7 ^ 0xB9));
        GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[4] = 205 + 157 - 305 + 160 + (192 + 33 - 116 + 134) - (0xFFFFF7FE & 0x9A1) + (122 + 71 + 18 + 0);
        GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[5] = (-(0xFFFFF9FF & 0x5EED) & (0xFFFFDFEE & 0x7BFF));
        GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[6] = (0xFFFF97DB & 0x6B27);
        GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[7] = " ".length();
        GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[8] = (-(0xFFFFFD57 & 0x62FB) & (0xFFFFFFDB & 0x7D77));
        GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[9] = (0xDD ^ 0x96 ^ (0x76 ^ 0x1D));
        GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[10] = (0x30 ^ 0x38);
        GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[11] = (0x10 ^ 0x17);
        GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[12] = " ".length() + (0x2C ^ 0x74) - (0x84 ^ 0x91) + (0x3E ^ 0x2);
        GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[13] = (0xD0 ^ 0xAB) + (0x6C ^ 0x3E) - (0x61 ^ 0x74) + (0xCD ^ 0xC5);
        GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[14] = (-(0xFFFFE3FE & 0x7C7B) & (0xFFFFFD7D & 0x7FFB));
    }
    
    @Override
    protected void drawSlot(final int lllllllllllllIlIIlIIIlllIIIlllII, final int lllllllllllllIlIIlIIIlllIIIllIll, final int lllllllllllllIlIIlIIIlllIIIlIIll, final int lllllllllllllIlIIlIIIlllIIIlIIlI, final int lllllllllllllIlIIlIIIlllIIIlIIIl, final int lllllllllllllIlIIlIIIlllIIIlIlll) {
        this.field_178050_u.renderItem(lllllllllllllIlIIlIIIlllIIIlllII, lllllllllllllIlIIlIIIlllIIIllIll, lllllllllllllIlIIlIIIlllIIIlIIll, lllllllllllllIlIIlIIIlllIIIlIIlI, lllllllllllllIlIIlIIIlllIIIlIIIl, lllllllllllllIlIIlIIIlllIIIlIlll);
    }
    
    private static boolean lIllllIIIIIlIIl(final int lllllllllllllIlIIlIIIllIllIlIIll, final int lllllllllllllIlIIlIIIllIllIlIIlI) {
        return lllllllllllllIlIIlIIIllIllIlIIll < lllllllllllllIlIIlIIIllIllIlIIlI;
    }
    
    @Override
    protected void drawBackground() {
        this.field_178050_u.renderBackground();
    }
    
    static {
        lIllllIIIIIIllI();
    }
    
    private static boolean lIllllIIIIIlIII(final int lllllllllllllIlIIlIIIllIllIIlllI) {
        return lllllllllllllIlIIlIIIllIllIIlllI > 0;
    }
    
    private static boolean lIllllIIIIIIlll(final int lllllllllllllIlIIlIIIllIllIlIIII) {
        return lllllllllllllIlIIlIIIllIllIlIIII != 0;
    }
    
    public int getWidth() {
        return super.width;
    }
    
    @Override
    public void drawScreen(final int lllllllllllllIlIIlIIIllIlllIIIIl, final int lllllllllllllIlIIlIIIllIlllIlllI, final float lllllllllllllIlIIlIIIllIlllIllIl) {
        if (lIllllIIIIIIlll(this.field_178041_q ? 1 : 0)) {
            this.mouseX = lllllllllllllIlIIlIIIllIlllIIIIl;
            this.mouseY = lllllllllllllIlIIlIIIllIlllIlllI;
            this.drawBackground();
            final int lllllllllllllIlIIlIIIllIlllIllII = this.getScrollBarX();
            final int lllllllllllllIlIIlIIIllIlllIlIll = lllllllllllllIlIIlIIIllIlllIllII + GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[0];
            this.bindAmountScrolled();
            GlStateManager.disableLighting();
            GlStateManager.disableFog();
            final Tessellator lllllllllllllIlIIlIIIllIlllIlIlI = Tessellator.getInstance();
            final WorldRenderer lllllllllllllIlIIlIIIllIlllIlIIl = lllllllllllllIlIIlIIIllIlllIlIlI.getWorldRenderer();
            final int lllllllllllllIlIIlIIIllIlllIlIII = this.left + this.width / GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[1] - this.getListWidth() / GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[1] + GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[1];
            final int lllllllllllllIlIIlIIIllIlllIIlll = this.top + GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[2] - (int)this.amountScrolled;
            if (lIllllIIIIIIlll(this.hasListHeader ? 1 : 0)) {
                this.drawListHeader(lllllllllllllIlIIlIIIllIlllIlIII, lllllllllllllIlIIlIIIllIlllIIlll, lllllllllllllIlIIlIIIllIlllIlIlI);
            }
            this.drawSelectionBox(lllllllllllllIlIIlIIIllIlllIlIII, lllllllllllllIlIIlIIIllIlllIIlll, lllllllllllllIlIIlIIIllIlllIIIIl, lllllllllllllIlIIlIIIllIlllIlllI);
            GlStateManager.disableDepth();
            final int lllllllllllllIlIIlIIIllIlllIIllI = GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[2];
            this.overlayBackground(GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[3], this.top, GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[4], GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[4]);
            this.overlayBackground(this.bottom, this.height, GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[4], GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[4]);
            GlStateManager.enableBlend();
            GlStateManager.tryBlendFuncSeparate(GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[5], GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[6], GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[3], GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[7]);
            GlStateManager.disableAlpha();
            GlStateManager.shadeModel(GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[8]);
            GlStateManager.disableTexture2D();
            final int lllllllllllllIlIIlIIIllIlllIIlIl = this.func_148135_f();
            if (lIllllIIIIIlIII(lllllllllllllIlIIlIIIllIlllIIlIl)) {
                int lllllllllllllIlIIlIIIllIlllIIlII = (this.bottom - this.top) * (this.bottom - this.top) / this.getContentHeight();
                lllllllllllllIlIIlIIIllIlllIIlII = MathHelper.clamp_int(lllllllllllllIlIIlIIIllIlllIIlII, GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[9], this.bottom - this.top - GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[10]);
                int lllllllllllllIlIIlIIIllIlllIIIll = (int)this.amountScrolled * (this.bottom - this.top - lllllllllllllIlIIlIIIllIlllIIlII) / lllllllllllllIlIIlIIIllIlllIIlIl + this.top;
                if (lIllllIIIIIlIIl(lllllllllllllIlIIlIIIllIlllIIIll, this.top)) {
                    lllllllllllllIlIIlIIIllIlllIIIll = this.top;
                }
                lllllllllllllIlIIlIIIllIlllIlIIl.begin(GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[11], DefaultVertexFormats.POSITION_TEX_COLOR);
                lllllllllllllIlIIlIIIllIlllIlIIl.pos(lllllllllllllIlIIlIIIllIlllIllII, this.bottom, 0.0).tex(0.0, 1.0).color(GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[3], GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[3], GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[3], GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[4]).endVertex();
                lllllllllllllIlIIlIIIllIlllIlIIl.pos(lllllllllllllIlIIlIIIllIlllIlIll, this.bottom, 0.0).tex(1.0, 1.0).color(GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[3], GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[3], GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[3], GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[4]).endVertex();
                lllllllllllllIlIIlIIIllIlllIlIIl.pos(lllllllllllllIlIIlIIIllIlllIlIll, this.top, 0.0).tex(1.0, 0.0).color(GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[3], GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[3], GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[3], GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[4]).endVertex();
                lllllllllllllIlIIlIIIllIlllIlIIl.pos(lllllllllllllIlIIlIIIllIlllIllII, this.top, 0.0).tex(0.0, 0.0).color(GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[3], GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[3], GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[3], GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[4]).endVertex();
                lllllllllllllIlIIlIIIllIlllIlIlI.draw();
                lllllllllllllIlIIlIIIllIlllIlIIl.begin(GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[11], DefaultVertexFormats.POSITION_TEX_COLOR);
                lllllllllllllIlIIlIIIllIlllIlIIl.pos(lllllllllllllIlIIlIIIllIlllIllII, lllllllllllllIlIIlIIIllIlllIIIll + lllllllllllllIlIIlIIIllIlllIIlII, 0.0).tex(0.0, 1.0).color(GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[12], GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[12], GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[12], GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[4]).endVertex();
                lllllllllllllIlIIlIIIllIlllIlIIl.pos(lllllllllllllIlIIlIIIllIlllIlIll, lllllllllllllIlIIlIIIllIlllIIIll + lllllllllllllIlIIlIIIllIlllIIlII, 0.0).tex(1.0, 1.0).color(GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[12], GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[12], GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[12], GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[4]).endVertex();
                lllllllllllllIlIIlIIIllIlllIlIIl.pos(lllllllllllllIlIIlIIIllIlllIlIll, lllllllllllllIlIIlIIIllIlllIIIll, 0.0).tex(1.0, 0.0).color(GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[12], GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[12], GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[12], GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[4]).endVertex();
                lllllllllllllIlIIlIIIllIlllIlIIl.pos(lllllllllllllIlIIlIIIllIlllIllII, lllllllllllllIlIIlIIIllIlllIIIll, 0.0).tex(0.0, 0.0).color(GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[12], GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[12], GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[12], GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[4]).endVertex();
                lllllllllllllIlIIlIIIllIlllIlIlI.draw();
                lllllllllllllIlIIlIIIllIlllIlIIl.begin(GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[11], DefaultVertexFormats.POSITION_TEX_COLOR);
                lllllllllllllIlIIlIIIllIlllIlIIl.pos(lllllllllllllIlIIlIIIllIlllIllII, lllllllllllllIlIIlIIIllIlllIIIll + lllllllllllllIlIIlIIIllIlllIIlII - GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[7], 0.0).tex(0.0, 1.0).color(GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[13], GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[13], GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[13], GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[4]).endVertex();
                lllllllllllllIlIIlIIIllIlllIlIIl.pos(lllllllllllllIlIIlIIIllIlllIlIll - GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[7], lllllllllllllIlIIlIIIllIlllIIIll + lllllllllllllIlIIlIIIllIlllIIlII - GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[7], 0.0).tex(1.0, 1.0).color(GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[13], GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[13], GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[13], GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[4]).endVertex();
                lllllllllllllIlIIlIIIllIlllIlIIl.pos(lllllllllllllIlIIlIIIllIlllIlIll - GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[7], lllllllllllllIlIIlIIIllIlllIIIll, 0.0).tex(1.0, 0.0).color(GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[13], GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[13], GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[13], GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[4]).endVertex();
                lllllllllllllIlIIlIIIllIlllIlIIl.pos(lllllllllllllIlIIlIIIllIlllIllII, lllllllllllllIlIIlIIIllIlllIIIll, 0.0).tex(0.0, 0.0).color(GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[13], GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[13], GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[13], GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[4]).endVertex();
                lllllllllllllIlIIlIIIllIlllIlIlI.draw();
            }
            this.func_148142_b(lllllllllllllIlIIlIIIllIlllIIIIl, lllllllllllllIlIIlIIIllIlllIlllI);
            GlStateManager.enableTexture2D();
            GlStateManager.shadeModel(GuiSimpleScrolledSelectionListProxy.lIIIIllIllIIlI[14]);
            GlStateManager.enableAlpha();
            GlStateManager.disableBlend();
        }
    }
    
    public int getMouseX() {
        return super.mouseX;
    }
    
    @Override
    protected int getScrollBarX() {
        return this.field_178050_u.getScrollbarPosition();
    }
    
    @Override
    public void handleMouseInput() {
        super.handleMouseInput();
    }
    
    public GuiSimpleScrolledSelectionListProxy(final RealmsSimpleScrolledSelectionList lllllllllllllIlIIlIIIlllIlIIllII, final int lllllllllllllIlIIlIIIlllIlIIIlII, final int lllllllllllllIlIIlIIIlllIlIIIIll, final int lllllllllllllIlIIlIIIlllIlIIlIIl, final int lllllllllllllIlIIlIIIlllIlIIlIII, final int lllllllllllllIlIIlIIIlllIlIIIlll) {
        super(Minecraft.getMinecraft(), lllllllllllllIlIIlIIIlllIlIIIlII, lllllllllllllIlIIlIIIlllIlIIIIll, lllllllllllllIlIIlIIIlllIlIIlIIl, lllllllllllllIlIIlIIIlllIlIIlIII, lllllllllllllIlIIlIIIlllIlIIIlll);
        this.field_178050_u = lllllllllllllIlIIlIIIlllIlIIllII;
    }
    
    @Override
    protected boolean isSelected(final int lllllllllllllIlIIlIIIlllIIlIlIlI) {
        return this.field_178050_u.isSelectedItem(lllllllllllllIlIIlIIIlllIIlIlIlI);
    }
    
    @Override
    protected void elementClicked(final int lllllllllllllIlIIlIIIlllIIllIllI, final boolean lllllllllllllIlIIlIIIlllIIllIlIl, final int lllllllllllllIlIIlIIIlllIIlIllll, final int lllllllllllllIlIIlIIIlllIIllIIll) {
        this.field_178050_u.selectItem(lllllllllllllIlIIlIIIlllIIllIllI, lllllllllllllIlIIlIIIlllIIllIlIl, lllllllllllllIlIIlIIIlllIIlIllll, lllllllllllllIlIIlIIIlllIIllIIll);
    }
    
    @Override
    protected int getSize() {
        return this.field_178050_u.getItemCount();
    }
    
    @Override
    protected int getContentHeight() {
        return this.field_178050_u.getMaxPosition();
    }
}
