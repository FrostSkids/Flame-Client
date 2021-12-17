// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import net.minecraft.util.EnumChatFormatting;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.resources.ResourcePackListEntry;
import java.util.List;
import net.minecraft.client.Minecraft;

public abstract class GuiResourcePackList extends GuiListExtended
{
    protected final /* synthetic */ Minecraft mc;
    private static final /* synthetic */ int[] llIlIIIlIlIlII;
    protected final /* synthetic */ List<ResourcePackListEntry> field_148204_l;
    
    @Override
    public ResourcePackListEntry getListEntry(final int llllllllllllIllIllIIllllIlIIlIIl) {
        return this.getList().get(llllllllllllIllIllIIllllIlIIlIIl);
    }
    
    static {
        lIIlIIIllllIlIlI();
    }
    
    public List<ResourcePackListEntry> getList() {
        return this.field_148204_l;
    }
    
    protected abstract String getListHeader();
    
    @Override
    protected int getScrollBarX() {
        return this.right - GuiResourcePackList.llIlIIIlIlIlII[9];
    }
    
    @Override
    public int getListWidth() {
        return this.width;
    }
    
    @Override
    protected void drawListHeader(final int llllllllllllIllIllIIllllIllIIIll, final int llllllllllllIllIllIIllllIllIIIIl, final Tessellator llllllllllllIllIllIIllllIllIIIII) {
        final String llllllllllllIllIllIIllllIlIllllI = String.valueOf(new StringBuilder().append(EnumChatFormatting.UNDERLINE).append(EnumChatFormatting.BOLD).append(this.getListHeader()));
        this.mc.fontRendererObj.drawString(llllllllllllIllIllIIllllIlIllllI, llllllllllllIllIllIIllllIllIIIll + this.width / GuiResourcePackList.llIlIIIlIlIlII[6] - this.mc.fontRendererObj.getStringWidth(llllllllllllIllIllIIllllIlIllllI) / GuiResourcePackList.llIlIIIlIlIlII[6], Math.min(this.top + GuiResourcePackList.llIlIIIlIlIlII[7], llllllllllllIllIllIIllllIllIIIIl), GuiResourcePackList.llIlIIIlIlIlII[8]);
        "".length();
    }
    
    public GuiResourcePackList(final Minecraft llllllllllllIllIllIIllllIlllllIl, final int llllllllllllIllIllIIllllIllllIll, final int llllllllllllIllIllIIllllIllIllll, final List<ResourcePackListEntry> llllllllllllIllIllIIllllIlllIlll) {
        super(llllllllllllIllIllIIllllIlllllIl, llllllllllllIllIllIIllllIllllIll, llllllllllllIllIllIIllllIllIllll, GuiResourcePackList.llIlIIIlIlIlII[0], llllllllllllIllIllIIllllIllIllll - GuiResourcePackList.llIlIIIlIlIlII[1] + GuiResourcePackList.llIlIIIlIlIlII[2], GuiResourcePackList.llIlIIIlIlIlII[3]);
        this.mc = llllllllllllIllIllIIllllIlllllIl;
        this.field_148204_l = llllllllllllIllIllIIllllIlllIlll;
        this.field_148163_i = (GuiResourcePackList.llIlIIIlIlIlII[4] != 0);
        this.setHasListHeader((boolean)(GuiResourcePackList.llIlIIIlIlIlII[5] != 0), (int)(llllllllllllIllIllIIllllIlllllIl.fontRendererObj.FONT_HEIGHT * 1.5f));
    }
    
    private static void lIIlIIIllllIlIlI() {
        (llIlIIIlIlIlII = new int[10])[0] = (0x8A ^ 0xAA);
        GuiResourcePackList.llIlIIIlIlIlII[1] = (43 + 15 + 86 + 16 ^ 128 + 76 - 71 + 18);
        GuiResourcePackList.llIlIIIlIlIlII[2] = (0xA8 ^ 0xAC);
        GuiResourcePackList.llIlIIIlIlIlII[3] = (0x15 ^ 0x31);
        GuiResourcePackList.llIlIIIlIlIlII[4] = ((0xA1 ^ 0x9A) & ~(0x3E ^ 0x5));
        GuiResourcePackList.llIlIIIlIlIlII[5] = " ".length();
        GuiResourcePackList.llIlIIIlIlIlII[6] = "  ".length();
        GuiResourcePackList.llIlIIIlIlIlII[7] = "   ".length();
        GuiResourcePackList.llIlIIIlIlIlII[8] = (-1 & 0xFFFFFF);
        GuiResourcePackList.llIlIIIlIlIlII[9] = (21 + 99 - 80 + 87 ^ (0x3F ^ 0x46));
    }
    
    @Override
    protected int getSize() {
        return this.getList().size();
    }
}
