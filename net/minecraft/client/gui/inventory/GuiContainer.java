// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui.inventory;

import java.util.Iterator;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.texture.TextureMap;
import com.google.common.collect.Sets;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.entity.RenderItem;
import org.lwjgl.input.Keyboard;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.client.Minecraft;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MathHelper;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.GlStateManager;
import java.util.Set;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;
import net.minecraft.client.gui.GuiScreen;

public abstract class GuiContainer extends GuiScreen
{
    private /* synthetic */ boolean doubleClick;
    private /* synthetic */ Slot clickedSlot;
    public /* synthetic */ Container inventorySlots;
    private /* synthetic */ Slot lastClickSlot;
    private /* synthetic */ long dragItemDropDelay;
    private /* synthetic */ ItemStack draggedStack;
    protected /* synthetic */ int ySize;
    private /* synthetic */ int touchUpY;
    protected /* synthetic */ int guiLeft;
    private /* synthetic */ long lastClickTime;
    protected /* synthetic */ boolean dragSplitting;
    private /* synthetic */ int dragSplittingButton;
    private /* synthetic */ int dragSplittingLimit;
    private /* synthetic */ Slot theSlot;
    private static final /* synthetic */ int[] lIIIIIlIIlIIII;
    private /* synthetic */ int dragSplittingRemnant;
    private /* synthetic */ ItemStack returningStack;
    private /* synthetic */ long returningStackTime;
    private /* synthetic */ boolean isRightMouseClick;
    private /* synthetic */ Slot currentDragTargetSlot;
    protected /* synthetic */ int xSize;
    private /* synthetic */ boolean ignoreMouseUp;
    private static final /* synthetic */ String[] lIIIIIlIIIlIIl;
    private /* synthetic */ int touchUpX;
    protected final /* synthetic */ Set<Slot> dragSplittingSlots;
    private /* synthetic */ ItemStack shiftClickedSlot;
    private /* synthetic */ int lastClickButton;
    protected /* synthetic */ int guiTop;
    private /* synthetic */ Slot returningStackDestSlot;
    
    private boolean isMouseOverSlot(final Slot lllllllllllllIlIIllllIlIIlIllIlI, final int lllllllllllllIlIIllllIlIIlIlllIl, final int lllllllllllllIlIIllllIlIIlIllIII) {
        return this.isPointInRegion(lllllllllllllIlIIllllIlIIlIllIlI.xDisplayPosition, lllllllllllllIlIIllllIlIIlIllIlI.yDisplayPosition, GuiContainer.lIIIIIlIIlIIII[6], GuiContainer.lIIIIIlIIlIIII[6], lllllllllllllIlIIllllIlIIlIlllIl, lllllllllllllIlIIllllIlIIlIllIII);
    }
    
    private static boolean lIllIlIllIllIIl(final Object lllllllllllllIlIIllllIIlllIlllII) {
        return lllllllllllllIlIIllllIIlllIlllII != null;
    }
    
    protected void drawGuiContainerForegroundLayer(final int lllllllllllllIlIIllllIllIIIIIllI, final int lllllllllllllIlIIllllIllIIIIIlIl) {
    }
    
    private static boolean lIllIlIllIlIlll(final int lllllllllllllIlIIllllIIllllIlIll, final int lllllllllllllIlIIllllIIllllIlIlI) {
        return lllllllllllllIlIIllllIIllllIlIll >= lllllllllllllIlIIllllIIllllIlIlI;
    }
    
    @Override
    public void drawScreen(final int lllllllllllllIlIIllllIllIIlllIll, final int lllllllllllllIlIIllllIllIIlIIIll, final float lllllllllllllIlIIllllIllIIlIIIlI) {
        this.drawDefaultBackground();
        final int lllllllllllllIlIIllllIllIIlllIII = this.guiLeft;
        final int lllllllllllllIlIIllllIllIIllIlll = this.guiTop;
        this.drawGuiContainerBackgroundLayer(lllllllllllllIlIIllllIllIIlIIIlI, lllllllllllllIlIIllllIllIIlllIll, lllllllllllllIlIIllllIllIIlIIIll);
        GlStateManager.disableRescaleNormal();
        RenderHelper.disableStandardItemLighting();
        GlStateManager.disableLighting();
        GlStateManager.disableDepth();
        super.drawScreen(lllllllllllllIlIIllllIllIIlllIll, lllllllllllllIlIIllllIllIIlIIIll, lllllllllllllIlIIllllIllIIlIIIlI);
        RenderHelper.enableGUIStandardItemLighting();
        GlStateManager.pushMatrix();
        GlStateManager.translate((float)lllllllllllllIlIIllllIllIIlllIII, (float)lllllllllllllIlIIllllIllIIllIlll, 0.0f);
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.enableRescaleNormal();
        this.theSlot = null;
        final int lllllllllllllIlIIllllIllIIllIllI = GuiContainer.lIIIIIlIIlIIII[5];
        final int lllllllllllllIlIIllllIllIIllIlIl = GuiContainer.lIIIIIlIIlIIII[5];
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, lllllllllllllIlIIllllIllIIllIllI / 1.0f, lllllllllllllIlIIllllIllIIllIlIl / 1.0f);
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        int lllllllllllllIlIIllllIllIIllIlII = GuiContainer.lIIIIIlIIlIIII[0];
        "".length();
        if ((0x53 ^ 0x4A ^ (0x7 ^ 0x1A)) == 0x0) {
            return;
        }
        while (!lIllIlIllIlIlll(lllllllllllllIlIIllllIllIIllIlII, this.inventorySlots.inventorySlots.size())) {
            final Slot lllllllllllllIlIIllllIllIIllIIll = this.inventorySlots.inventorySlots.get(lllllllllllllIlIIllllIllIIllIlII);
            this.drawSlot(lllllllllllllIlIIllllIllIIllIIll);
            if (lIllIlIllIlIllI(this.isMouseOverSlot(lllllllllllllIlIIllllIllIIllIIll, lllllllllllllIlIIllllIllIIlllIll, lllllllllllllIlIIllllIllIIlIIIll) ? 1 : 0) && lIllIlIllIlIllI(lllllllllllllIlIIllllIllIIllIIll.canBeHovered() ? 1 : 0)) {
                this.theSlot = lllllllllllllIlIIllllIllIIllIIll;
                GlStateManager.disableLighting();
                GlStateManager.disableDepth();
                final int lllllllllllllIlIIllllIllIIllIIlI = lllllllllllllIlIIllllIllIIllIIll.xDisplayPosition;
                final int lllllllllllllIlIIllllIllIIllIIIl = lllllllllllllIlIIllllIllIIllIIll.yDisplayPosition;
                GlStateManager.colorMask((boolean)(GuiContainer.lIIIIIlIIlIIII[3] != 0), (boolean)(GuiContainer.lIIIIIlIIlIIII[3] != 0), (boolean)(GuiContainer.lIIIIIlIIlIIII[3] != 0), (boolean)(GuiContainer.lIIIIIlIIlIIII[0] != 0));
                this.drawGradientRect(lllllllllllllIlIIllllIllIIllIIlI, lllllllllllllIlIIllllIllIIllIIIl, lllllllllllllIlIIllllIllIIllIIlI + GuiContainer.lIIIIIlIIlIIII[6], lllllllllllllIlIIllllIllIIllIIIl + GuiContainer.lIIIIIlIIlIIII[6], GuiContainer.lIIIIIlIIlIIII[7], GuiContainer.lIIIIIlIIlIIII[7]);
                GlStateManager.colorMask((boolean)(GuiContainer.lIIIIIlIIlIIII[3] != 0), (boolean)(GuiContainer.lIIIIIlIIlIIII[3] != 0), (boolean)(GuiContainer.lIIIIIlIIlIIII[3] != 0), (boolean)(GuiContainer.lIIIIIlIIlIIII[3] != 0));
                GlStateManager.enableLighting();
                GlStateManager.enableDepth();
            }
            ++lllllllllllllIlIIllllIllIIllIlII;
        }
        RenderHelper.disableStandardItemLighting();
        this.drawGuiContainerForegroundLayer(lllllllllllllIlIIllllIllIIlllIll, lllllllllllllIlIIllllIllIIlIIIll);
        RenderHelper.enableGUIStandardItemLighting();
        final InventoryPlayer lllllllllllllIlIIllllIllIIllIIII = this.mc.thePlayer.inventory;
        ItemStack itemStack;
        if (lIllIlIllIllIII(this.draggedStack)) {
            itemStack = lllllllllllllIlIIllllIllIIllIIII.getItemStack();
            "".length();
            if ((0x7F ^ 0x39 ^ (0x2 ^ 0x41)) <= 0) {
                return;
            }
        }
        else {
            itemStack = this.draggedStack;
        }
        ItemStack lllllllllllllIlIIllllIllIIlIllll = itemStack;
        if (lIllIlIllIllIIl(lllllllllllllIlIIllllIllIIlIllll)) {
            final int lllllllllllllIlIIllllIllIIlIlllI = GuiContainer.lIIIIIlIIlIIII[8];
            int n;
            if (lIllIlIllIllIII(this.draggedStack)) {
                n = GuiContainer.lIIIIIlIIlIIII[8];
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                n = GuiContainer.lIIIIIlIIlIIII[6];
            }
            final int lllllllllllllIlIIllllIllIIlIllIl = n;
            String lllllllllllllIlIIllllIllIIlIllII = null;
            if (lIllIlIllIllIIl(this.draggedStack) && lIllIlIllIlIllI(this.isRightMouseClick ? 1 : 0)) {
                lllllllllllllIlIIllllIllIIlIllll = lllllllllllllIlIIllllIllIIlIllll.copy();
                lllllllllllllIlIIllllIllIIlIllll.stackSize = MathHelper.ceiling_float_int(lllllllllllllIlIIllllIllIIlIllll.stackSize / 2.0f);
                "".length();
                if ((0x1C ^ 0x72 ^ (0xAA ^ 0xC1)) <= 0) {
                    return;
                }
            }
            else if (lIllIlIllIlIllI(this.dragSplitting ? 1 : 0) && lIllIlIllIllIlI(this.dragSplittingSlots.size(), GuiContainer.lIIIIIlIIlIIII[3])) {
                lllllllllllllIlIIllllIllIIlIllll = lllllllllllllIlIIllllIllIIlIllll.copy();
                lllllllllllllIlIIllllIllIIlIllll.stackSize = this.dragSplittingRemnant;
                if (lIllIlIllIllIll(lllllllllllllIlIIllllIllIIlIllll.stackSize)) {
                    lllllllllllllIlIIllllIllIIlIllII = String.valueOf(new StringBuilder().append(EnumChatFormatting.YELLOW).append(GuiContainer.lIIIIIlIIIlIIl[GuiContainer.lIIIIIlIIlIIII[3]]));
                }
            }
            this.drawItemStack(lllllllllllllIlIIllllIllIIlIllll, lllllllllllllIlIIllllIllIIlllIll - lllllllllllllIlIIllllIllIIlllIII - lllllllllllllIlIIllllIllIIlIlllI, lllllllllllllIlIIllllIllIIlIIIll - lllllllllllllIlIIllllIllIIllIlll - lllllllllllllIlIIllllIllIIlIllIl, lllllllllllllIlIIllllIllIIlIllII);
        }
        if (lIllIlIllIllIIl(this.returningStack)) {
            float lllllllllllllIlIIllllIllIIlIlIll = (Minecraft.getSystemTime() - this.returningStackTime) / 100.0f;
            if (lIllIlIllIlllII(lIllIlIllIlIlIl(lllllllllllllIlIIllllIllIIlIlIll, 1.0f))) {
                lllllllllllllIlIIllllIllIIlIlIll = 1.0f;
                this.returningStack = null;
            }
            final int lllllllllllllIlIIllllIllIIlIlIlI = this.returningStackDestSlot.xDisplayPosition - this.touchUpX;
            final int lllllllllllllIlIIllllIllIIlIlIIl = this.returningStackDestSlot.yDisplayPosition - this.touchUpY;
            final int lllllllllllllIlIIllllIllIIlIlIII = this.touchUpX + (int)(lllllllllllllIlIIllllIllIIlIlIlI * lllllllllllllIlIIllllIllIIlIlIll);
            final int lllllllllllllIlIIllllIllIIlIIlll = this.touchUpY + (int)(lllllllllllllIlIIllllIllIIlIlIIl * lllllllllllllIlIIllllIllIIlIlIll);
            this.drawItemStack(this.returningStack, lllllllllllllIlIIllllIllIIlIlIII, lllllllllllllIlIIllllIllIIlIIlll, null);
        }
        GlStateManager.popMatrix();
        if (lIllIlIllIllIII(lllllllllllllIlIIllllIllIIllIIII.getItemStack()) && lIllIlIllIllIIl(this.theSlot) && lIllIlIllIlIllI(this.theSlot.getHasStack() ? 1 : 0)) {
            final ItemStack lllllllllllllIlIIllllIllIIlIIllI = this.theSlot.getStack();
            this.renderToolTip(lllllllllllllIlIIllllIllIIlIIllI, lllllllllllllIlIIllllIllIIlllIll, lllllllllllllIlIIllllIllIIlIIIll);
        }
        GlStateManager.enableLighting();
        GlStateManager.enableDepth();
        RenderHelper.enableStandardItemLighting();
    }
    
    @Override
    protected void mouseReleased(final int lllllllllllllIlIIllllIlIIllllIlI, final int lllllllllllllIlIIllllIlIIllIllII, final int lllllllllllllIlIIllllIlIIllIlIll) {
        final Slot lllllllllllllIlIIllllIlIIlllIlll = this.getSlotAtPosition(lllllllllllllIlIIllllIlIIllllIlI, lllllllllllllIlIIllllIlIIllIllII);
        final int lllllllllllllIlIIllllIlIIlllIllI = this.guiLeft;
        final int lllllllllllllIlIIllllIlIIlllIlIl = this.guiTop;
        int n;
        if (lIllIlIllIlIlll(lllllllllllllIlIIllllIlIIllllIlI, lllllllllllllIlIIllllIlIIlllIllI) && lIllIlIllIlIlll(lllllllllllllIlIIllllIlIIllIllII, lllllllllllllIlIIllllIlIIlllIlIl) && lIllIlIlllIlIII(lllllllllllllIlIIllllIlIIllllIlI, lllllllllllllIlIIllllIlIIlllIllI + this.xSize) && lIllIlIlllIlIII(lllllllllllllIlIIllllIlIIllIllII, lllllllllllllIlIIllllIlIIlllIlIl + this.ySize)) {
            n = GuiContainer.lIIIIIlIIlIIII[0];
            "".length();
            if (" ".length() > "  ".length()) {
                return;
            }
        }
        else {
            n = GuiContainer.lIIIIIlIIlIIII[3];
        }
        final boolean lllllllllllllIlIIllllIlIIlllIlII = n != 0;
        int lllllllllllllIlIIllllIlIIlllIIll = GuiContainer.lIIIIIlIIlIIII[10];
        if (lIllIlIllIllIIl(lllllllllllllIlIIllllIlIIlllIlll)) {
            lllllllllllllIlIIllllIlIIlllIIll = lllllllllllllIlIIllllIlIIlllIlll.slotNumber;
        }
        if (lIllIlIllIlIllI(lllllllllllllIlIIllllIlIIlllIlII ? 1 : 0)) {
            lllllllllllllIlIIllllIlIIlllIIll = GuiContainer.lIIIIIlIIlIIII[11];
        }
        if (lIllIlIllIlIllI(this.doubleClick ? 1 : 0) && lIllIlIllIllIIl(lllllllllllllIlIIllllIlIIlllIlll) && lIllIlIllIllIll(lllllllllllllIlIIllllIlIIllIlIll) && lIllIlIllIlIllI(this.inventorySlots.canMergeSlot(null, lllllllllllllIlIIllllIlIIlllIlll) ? 1 : 0)) {
            if (lIllIlIllIlIllI(GuiScreen.isShiftKeyDown() ? 1 : 0)) {
                if (lIllIlIllIllIIl(lllllllllllllIlIIllllIlIIlllIlll) && lIllIlIllIllIIl(lllllllllllllIlIIllllIlIIlllIlll.inventory) && lIllIlIllIllIIl(this.shiftClickedSlot)) {
                    final short lllllllllllllIlIIllllIlIIllIIlII = (short)this.inventorySlots.inventorySlots.iterator();
                    "".length();
                    if (((0x58 ^ 0x7D ^ (0x23 ^ 0x40)) & (15 + 3 + 100 + 117 ^ 125 + 17 - 50 + 81 ^ -" ".length())) != ((0xC ^ 0x64 ^ (0x91 ^ 0x9B)) & (0x30 ^ 0x3F ^ (0x55 ^ 0x38) ^ -" ".length()))) {
                        return;
                    }
                    while (!lIllIlIllIllIll(((Iterator)lllllllllllllIlIIllllIlIIllIIlII).hasNext() ? 1 : 0)) {
                        final Slot lllllllllllllIlIIllllIlIIlllIIlI = ((Iterator<Slot>)lllllllllllllIlIIllllIlIIllIIlII).next();
                        if (lIllIlIllIllIIl(lllllllllllllIlIIllllIlIIlllIIlI) && lIllIlIllIlIllI(lllllllllllllIlIIllllIlIIlllIIlI.canTakeStack(this.mc.thePlayer) ? 1 : 0) && lIllIlIllIlIllI(lllllllllllllIlIIllllIlIIlllIIlI.getHasStack() ? 1 : 0) && lIllIlIllIllllI(lllllllllllllIlIIllllIlIIlllIIlI.inventory, lllllllllllllIlIIllllIlIIlllIlll.inventory) && lIllIlIllIlIllI(Container.canAddItemToSlot(lllllllllllllIlIIllllIlIIlllIIlI, this.shiftClickedSlot, (boolean)(GuiContainer.lIIIIIlIIlIIII[3] != 0)) ? 1 : 0)) {
                            this.handleMouseClick(lllllllllllllIlIIllllIlIIlllIIlI, lllllllllllllIlIIllllIlIIlllIIlI.slotNumber, lllllllllllllIlIIllllIlIIllIlIll, GuiContainer.lIIIIIlIIlIIII[3]);
                        }
                    }
                    "".length();
                    if ("   ".length() < ((0x57 ^ 0x7C) & ~(0xEA ^ 0xC1))) {
                        return;
                    }
                }
            }
            else {
                this.handleMouseClick(lllllllllllllIlIIllllIlIIlllIlll, lllllllllllllIlIIllllIlIIlllIIll, lllllllllllllIlIIllllIlIIllIlIll, GuiContainer.lIIIIIlIIlIIII[16]);
            }
            this.doubleClick = (GuiContainer.lIIIIIlIIlIIII[0] != 0);
            this.lastClickTime = 0L;
            "".length();
            if ("   ".length() != "   ".length()) {
                return;
            }
        }
        else {
            if (lIllIlIllIlIllI(this.dragSplitting ? 1 : 0) && lIllIlIlllIIlll(this.dragSplittingButton, lllllllllllllIlIIllllIlIIllIlIll)) {
                this.dragSplitting = (GuiContainer.lIIIIIlIIlIIII[0] != 0);
                this.dragSplittingSlots.clear();
                this.ignoreMouseUp = (GuiContainer.lIIIIIlIIlIIII[3] != 0);
                return;
            }
            if (lIllIlIllIlIllI(this.ignoreMouseUp ? 1 : 0)) {
                this.ignoreMouseUp = (GuiContainer.lIIIIIlIIlIIII[0] != 0);
                return;
            }
            if (lIllIlIllIllIIl(this.clickedSlot) && lIllIlIllIlIllI(this.mc.gameSettings.touchscreen ? 1 : 0)) {
                if (!lIllIlIllIlIllI(lllllllllllllIlIIllllIlIIllIlIll) || lIllIlIlllIIIII(lllllllllllllIlIIllllIlIIllIlIll, GuiContainer.lIIIIIlIIlIIII[3])) {
                    if (lIllIlIllIllIII(this.draggedStack) && lIllIlIlllIlIlI(lllllllllllllIlIIllllIlIIlllIlll, this.clickedSlot)) {
                        this.draggedStack = this.clickedSlot.getStack();
                    }
                    final boolean lllllllllllllIlIIllllIlIIlllIIIl = Container.canAddItemToSlot(lllllllllllllIlIIllllIlIIlllIlll, this.draggedStack, (boolean)(GuiContainer.lIIIIIlIIlIIII[0] != 0));
                    if (lIllIlIlllIIlll(lllllllllllllIlIIllllIlIIlllIIll, GuiContainer.lIIIIIlIIlIIII[10]) && lIllIlIllIllIIl(this.draggedStack) && lIllIlIllIlIllI(lllllllllllllIlIIllllIlIIlllIIIl ? 1 : 0)) {
                        this.handleMouseClick(this.clickedSlot, this.clickedSlot.slotNumber, lllllllllllllIlIIllllIlIIllIlIll, GuiContainer.lIIIIIlIIlIIII[0]);
                        this.handleMouseClick(lllllllllllllIlIIllllIlIIlllIlll, lllllllllllllIlIIllllIlIIlllIIll, GuiContainer.lIIIIIlIIlIIII[0], GuiContainer.lIIIIIlIIlIIII[0]);
                        if (lIllIlIllIllIIl(this.mc.thePlayer.inventory.getItemStack())) {
                            this.handleMouseClick(this.clickedSlot, this.clickedSlot.slotNumber, lllllllllllllIlIIllllIlIIllIlIll, GuiContainer.lIIIIIlIIlIIII[0]);
                            this.touchUpX = lllllllllllllIlIIllllIlIIllllIlI - lllllllllllllIlIIllllIlIIlllIllI;
                            this.touchUpY = lllllllllllllIlIIllllIlIIllIllII - lllllllllllllIlIIllllIlIIlllIlIl;
                            this.returningStackDestSlot = this.clickedSlot;
                            this.returningStack = this.draggedStack;
                            this.returningStackTime = Minecraft.getSystemTime();
                            "".length();
                            if (null != null) {
                                return;
                            }
                        }
                        else {
                            this.returningStack = null;
                            "".length();
                            if (-" ".length() > (0x6E ^ 0x51 ^ (0xA2 ^ 0x99))) {
                                return;
                            }
                        }
                    }
                    else if (lIllIlIllIllIIl(this.draggedStack)) {
                        this.touchUpX = lllllllllllllIlIIllllIlIIllllIlI - lllllllllllllIlIIllllIlIIlllIllI;
                        this.touchUpY = lllllllllllllIlIIllllIlIIllIllII - lllllllllllllIlIIllllIlIIlllIlIl;
                        this.returningStackDestSlot = this.clickedSlot;
                        this.returningStack = this.draggedStack;
                        this.returningStackTime = Minecraft.getSystemTime();
                    }
                    this.draggedStack = null;
                    this.clickedSlot = null;
                    "".length();
                    if ((0x9 ^ 0xD) <= "   ".length()) {
                        return;
                    }
                }
            }
            else if (lIllIlIllIlIllI(this.dragSplitting ? 1 : 0) && lIllIlIllIllIll(this.dragSplittingSlots.isEmpty() ? 1 : 0)) {
                this.handleMouseClick(null, GuiContainer.lIIIIIlIIlIIII[11], Container.func_94534_d(GuiContainer.lIIIIIlIIlIIII[0], this.dragSplittingLimit), GuiContainer.lIIIIIlIIlIIII[17]);
                final short lllllllllllllIlIIllllIlIIllIIlII = (short)this.dragSplittingSlots.iterator();
                "".length();
                if ("  ".length() == 0) {
                    return;
                }
                while (!lIllIlIllIllIll(((Iterator)lllllllllllllIlIIllllIlIIllIIlII).hasNext() ? 1 : 0)) {
                    final Slot lllllllllllllIlIIllllIlIIlllIIII = ((Iterator<Slot>)lllllllllllllIlIIllllIlIIllIIlII).next();
                    this.handleMouseClick(lllllllllllllIlIIllllIlIIlllIIII, lllllllllllllIlIIllllIlIIlllIIII.slotNumber, Container.func_94534_d(GuiContainer.lIIIIIlIIlIIII[3], this.dragSplittingLimit), GuiContainer.lIIIIIlIIlIIII[17]);
                }
                this.handleMouseClick(null, GuiContainer.lIIIIIlIIlIIII[11], Container.func_94534_d(GuiContainer.lIIIIIlIIlIIII[4], this.dragSplittingLimit), GuiContainer.lIIIIIlIIlIIII[17]);
                "".length();
                if (((0x4D ^ 0x57) & ~(0x4F ^ 0x55)) > "   ".length()) {
                    return;
                }
            }
            else if (lIllIlIllIllIIl(this.mc.thePlayer.inventory.getItemStack())) {
                if (lIllIlIlllIIIII(lllllllllllllIlIIllllIlIIllIlIll, this.mc.gameSettings.keyBindPickBlock.getKeyCode() + GuiContainer.lIIIIIlIIlIIII[9])) {
                    this.handleMouseClick(lllllllllllllIlIIllllIlIIlllIlll, lllllllllllllIlIIllllIlIIlllIIll, lllllllllllllIlIIllllIlIIllIlIll, GuiContainer.lIIIIIlIIlIIII[12]);
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    int n2;
                    if (lIllIlIlllIIlll(lllllllllllllIlIIllllIlIIlllIIll, GuiContainer.lIIIIIlIIlIIII[11]) && (!lIllIlIllIllIll(Keyboard.isKeyDown(GuiContainer.lIIIIIlIIlIIII[13]) ? 1 : 0) || lIllIlIllIlIllI(Keyboard.isKeyDown(GuiContainer.lIIIIIlIIlIIII[14]) ? 1 : 0))) {
                        n2 = GuiContainer.lIIIIIlIIlIIII[3];
                        "".length();
                        if (" ".length() > "   ".length()) {
                            return;
                        }
                    }
                    else {
                        n2 = GuiContainer.lIIIIIlIIlIIII[0];
                    }
                    final boolean lllllllllllllIlIIllllIlIIllIllll = n2 != 0;
                    if (lIllIlIllIlIllI(lllllllllllllIlIIllllIlIIllIllll ? 1 : 0)) {
                        ItemStack stack;
                        if (lIllIlIllIllIIl(lllllllllllllIlIIllllIlIIlllIlll) && lIllIlIllIlIllI(lllllllllllllIlIIllllIlIIlllIlll.getHasStack() ? 1 : 0)) {
                            stack = lllllllllllllIlIIllllIlIIlllIlll.getStack();
                            "".length();
                            if (null != null) {
                                return;
                            }
                        }
                        else {
                            stack = null;
                        }
                        this.shiftClickedSlot = stack;
                    }
                    final Slot lllllllllllllIlIIllllIlIIIllIIIl = lllllllllllllIlIIllllIlIIlllIlll;
                    final int lllllllllllllIlIIllllIlIIIllIIII = lllllllllllllIlIIllllIlIIlllIIll;
                    int lllllllllllllIlIIllllIlIIIllIIll;
                    if (lIllIlIllIlIllI(lllllllllllllIlIIllllIlIIllIllll ? 1 : 0)) {
                        lllllllllllllIlIIllllIlIIIllIIll = GuiContainer.lIIIIIlIIlIIII[3];
                        "".length();
                        if (" ".length() < ((31 + 32 + 88 + 0 ^ 12 + 104 - 44 + 103) & (94 + 36 - 15 + 24 ^ 107 + 48 - 79 + 103 ^ -" ".length()))) {
                            return;
                        }
                    }
                    else {
                        lllllllllllllIlIIllllIlIIIllIIll = GuiContainer.lIIIIIlIIlIIII[0];
                    }
                    this.handleMouseClick(lllllllllllllIlIIllllIlIIIllIIIl, lllllllllllllIlIIllllIlIIIllIIII, lllllllllllllIlIIllllIlIIllIlIll, lllllllllllllIlIIllllIlIIIllIIll);
                }
            }
        }
        if (lIllIlIllIllIII(this.mc.thePlayer.inventory.getItemStack())) {
            this.lastClickTime = 0L;
        }
        this.dragSplitting = (GuiContainer.lIIIIIlIIlIIII[0] != 0);
    }
    
    private static int lIllIlIllIlIlIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lIllIlIlllIlIlI(final Object lllllllllllllIlIIllllIIlllIlllll, final Object lllllllllllllIlIIllllIIlllIllllI) {
        return lllllllllllllIlIIllllIIlllIlllll != lllllllllllllIlIIllllIIlllIllllI;
    }
    
    @Override
    public void initGui() {
        super.initGui();
        this.mc.thePlayer.openContainer = this.inventorySlots;
        this.guiLeft = (this.width - this.xSize) / GuiContainer.lIIIIIlIIlIIII[4];
        this.guiTop = (this.height - this.ySize) / GuiContainer.lIIIIIlIIlIIII[4];
    }
    
    private static boolean lIllIlIllIllllI(final Object lllllllllllllIlIIllllIIlllIllIIl, final Object lllllllllllllIlIIllllIIlllIllIII) {
        return lllllllllllllIlIIllllIIlllIllIIl == lllllllllllllIlIIllllIIlllIllIII;
    }
    
    private static void lIllIlIllIlIlII() {
        (lIIIIIlIIlIIII = new int[19])[0] = ((0x94 ^ 0xBA) & ~(0xEE ^ 0xC0));
        GuiContainer.lIIIIIlIIlIIII[1] = 22 + 47 - 46 + 104 + (0x10 ^ 0xD) - (0x6 ^ 0x6A) + (25 + 102 - 36 + 37);
        GuiContainer.lIIIIIlIIlIIII[2] = 28 + 162 - 145 + 121;
        GuiContainer.lIIIIIlIIlIIII[3] = " ".length();
        GuiContainer.lIIIIIlIIlIIII[4] = "  ".length();
        GuiContainer.lIIIIIlIIlIIII[5] = 100 + 72 - 128 + 196;
        GuiContainer.lIIIIIlIIlIIII[6] = (0xA8 ^ 0xB8);
        GuiContainer.lIIIIIlIIlIIII[7] = -(-(0xFFFFCB3D & 0x3FF7) & (0xFFFF9F3F & 0x7F006BF5));
        GuiContainer.lIIIIIlIIlIIII[8] = (0x3E ^ 0x36);
        GuiContainer.lIIIIIlIIlIIII[9] = (0xC7 ^ 0xA3);
        GuiContainer.lIIIIIlIIlIIII[10] = -" ".length();
        GuiContainer.lIIIIIlIIlIIII[11] = -(0xFFFFBFFF & 0x43E7);
        GuiContainer.lIIIIIlIIlIIII[12] = "   ".length();
        GuiContainer.lIIIIIlIIlIIII[13] = (0x37 ^ 0x1D);
        GuiContainer.lIIIIIlIIlIIII[14] = (0xB3 ^ 0x85);
        GuiContainer.lIIIIIlIIlIIII[15] = (0x4E ^ 0x4A);
        GuiContainer.lIIIIIlIIlIIII[16] = (26 + 8 - 31 + 170 ^ 5 + 165 - 9 + 10);
        GuiContainer.lIIIIIlIIlIIII[17] = (0x4B ^ 0x46 ^ (0xBE ^ 0xB6));
        GuiContainer.lIIIIIlIIlIIII[18] = (0xBA ^ 0xB3);
    }
    
    private static boolean lIllIlIllIllIII(final Object lllllllllllllIlIIllllIIlllIlIllI) {
        return lllllllllllllIlIIllllIIlllIlIllI == null;
    }
    
    private void drawItemStack(final ItemStack lllllllllllllIlIIllllIllIIIIlIll, final int lllllllllllllIlIIllllIllIIIIlIlI, final int lllllllllllllIlIIllllIllIIIIlllI, final String lllllllllllllIlIIllllIllIIIIlIII) {
        GlStateManager.translate(0.0f, 0.0f, 32.0f);
        this.zLevel = 200.0f;
        this.itemRender.zLevel = 200.0f;
        this.itemRender.renderItemAndEffectIntoGUI(lllllllllllllIlIIllllIllIIIIlIll, lllllllllllllIlIIllllIllIIIIlIlI, lllllllllllllIlIIllllIllIIIIlllI);
        final RenderItem itemRender = this.itemRender;
        final FontRenderer fontRendererObj = this.fontRendererObj;
        int n;
        if (lIllIlIllIllIII(this.draggedStack)) {
            n = GuiContainer.lIIIIIlIIlIIII[0];
            "".length();
            if (" ".length() > "  ".length()) {
                return;
            }
        }
        else {
            n = GuiContainer.lIIIIIlIIlIIII[8];
        }
        itemRender.renderItemOverlayIntoGUI(fontRendererObj, lllllllllllllIlIIllllIllIIIIlIll, lllllllllllllIlIIllllIllIIIIlIlI, lllllllllllllIlIIllllIllIIIIlllI - n, lllllllllllllIlIIllllIllIIIIlIII);
        this.zLevel = 0.0f;
        this.itemRender.zLevel = 0.0f;
    }
    
    private static int lIllIlIlllIIlIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    protected void handleMouseClick(final Slot lllllllllllllIlIIllllIlIIIllIIIl, int lllllllllllllIlIIllllIlIIIllIIII, final int lllllllllllllIlIIllllIlIIIlIllll, final int lllllllllllllIlIIllllIlIIIllIIll) {
        if (lIllIlIllIllIIl(lllllllllllllIlIIllllIlIIIllIIIl)) {
            lllllllllllllIlIIllllIlIIIllIIII = lllllllllllllIlIIllllIlIIIllIIIl.slotNumber;
        }
        this.mc.playerController.windowClick(this.inventorySlots.windowId, lllllllllllllIlIIllllIlIIIllIIII, lllllllllllllIlIIllllIlIIIlIllll, lllllllllllllIlIIllllIlIIIllIIll, this.mc.thePlayer);
        "".length();
    }
    
    private static boolean lIllIlIllIlllII(final int lllllllllllllIlIIllllIIlllIlIIII) {
        return lllllllllllllIlIIllllIIlllIlIIII >= 0;
    }
    
    protected boolean checkHotbarKeys(final int lllllllllllllIlIIllllIlIIIIlllll) {
        if (lIllIlIllIllIII(this.mc.thePlayer.inventory.getItemStack()) && lIllIlIllIllIIl(this.theSlot)) {
            int lllllllllllllIlIIllllIlIIIlIIIIl = GuiContainer.lIIIIIlIIlIIII[0];
            "".length();
            if (((0x9A ^ 0xC1 ^ (0x30 ^ 0x2F)) & (155 + 88 - 50 + 36 ^ 105 + 146 - 99 + 9 ^ -" ".length())) < -" ".length()) {
                return ((0x57 ^ 0x5A ^ (0x8B ^ 0xC5)) & (98 + 201 - 188 + 91 ^ 66 + 27 + 27 + 17 ^ -" ".length())) != 0x0;
            }
            while (!lIllIlIllIlIlll(lllllllllllllIlIIllllIlIIIlIIIIl, GuiContainer.lIIIIIlIIlIIII[18])) {
                if (lIllIlIlllIIIII(lllllllllllllIlIIllllIlIIIIlllll, this.mc.gameSettings.keyBindsHotbar[lllllllllllllIlIIllllIlIIIlIIIIl].getKeyCode())) {
                    this.handleMouseClick(this.theSlot, this.theSlot.slotNumber, lllllllllllllIlIIllllIlIIIlIIIIl, GuiContainer.lIIIIIlIIlIIII[4]);
                    return GuiContainer.lIIIIIlIIlIIII[3] != 0;
                }
                ++lllllllllllllIlIIllllIlIIIlIIIIl;
            }
        }
        return GuiContainer.lIIIIIlIIlIIII[0] != 0;
    }
    
    private Slot getSlotAtPosition(final int lllllllllllllIlIIllllIlIllIIllII, final int lllllllllllllIlIIllllIlIllIIlIll) {
        int lllllllllllllIlIIllllIlIllIIlIlI = GuiContainer.lIIIIIlIIlIIII[0];
        "".length();
        if (-"   ".length() > 0) {
            return null;
        }
        while (!lIllIlIllIlIlll(lllllllllllllIlIIllllIlIllIIlIlI, this.inventorySlots.inventorySlots.size())) {
            final Slot lllllllllllllIlIIllllIlIllIIlIIl = this.inventorySlots.inventorySlots.get(lllllllllllllIlIIllllIlIllIIlIlI);
            if (lIllIlIllIlIllI(this.isMouseOverSlot(lllllllllllllIlIIllllIlIllIIlIIl, lllllllllllllIlIIllllIlIllIIllII, lllllllllllllIlIIllllIlIllIIlIll) ? 1 : 0)) {
                return lllllllllllllIlIIllllIlIllIIlIIl;
            }
            ++lllllllllllllIlIIllllIlIllIIlIlI;
        }
        return null;
    }
    
    private static String lIllIlIllIIllII(String lllllllllllllIlIIllllIlIIIIIIlll, final String lllllllllllllIlIIllllIlIIIIIIllI) {
        lllllllllllllIlIIllllIlIIIIIIlll = new String(Base64.getDecoder().decode(lllllllllllllIlIIllllIlIIIIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIllllIlIIIIIlIlI = new StringBuilder();
        final char[] lllllllllllllIlIIllllIlIIIIIlIIl = lllllllllllllIlIIllllIlIIIIIIllI.toCharArray();
        int lllllllllllllIlIIllllIlIIIIIlIII = GuiContainer.lIIIIIlIIlIIII[0];
        final byte lllllllllllllIlIIllllIlIIIIIIIlI = (Object)lllllllllllllIlIIllllIlIIIIIIlll.toCharArray();
        final String lllllllllllllIlIIllllIlIIIIIIIIl = (String)lllllllllllllIlIIllllIlIIIIIIIlI.length;
        byte lllllllllllllIlIIllllIlIIIIIIIII = (byte)GuiContainer.lIIIIIlIIlIIII[0];
        while (lIllIlIlllIlIII(lllllllllllllIlIIllllIlIIIIIIIII, (int)lllllllllllllIlIIllllIlIIIIIIIIl)) {
            final char lllllllllllllIlIIllllIlIIIIIllIl = lllllllllllllIlIIllllIlIIIIIIIlI[lllllllllllllIlIIllllIlIIIIIIIII];
            lllllllllllllIlIIllllIlIIIIIlIlI.append((char)(lllllllllllllIlIIllllIlIIIIIllIl ^ lllllllllllllIlIIllllIlIIIIIlIIl[lllllllllllllIlIIllllIlIIIIIlIII % lllllllllllllIlIIllllIlIIIIIlIIl.length]));
            "".length();
            ++lllllllllllllIlIIllllIlIIIIIlIII;
            ++lllllllllllllIlIIllllIlIIIIIIIII;
            "".length();
            if (-" ".length() > -" ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIllllIlIIIIIlIlI);
    }
    
    @Override
    protected void mouseClicked(final int lllllllllllllIlIIllllIlIlIllIlIl, final int lllllllllllllIlIIllllIlIlIllIlII, final int lllllllllllllIlIIllllIlIlIllIIll) throws IOException {
        super.mouseClicked(lllllllllllllIlIIllllIlIlIllIlIl, lllllllllllllIlIIllllIlIlIllIlII, lllllllllllllIlIIllllIlIlIllIIll);
        int n;
        if (lIllIlIlllIIIII(lllllllllllllIlIIllllIlIlIllIIll, this.mc.gameSettings.keyBindPickBlock.getKeyCode() + GuiContainer.lIIIIIlIIlIIII[9])) {
            n = GuiContainer.lIIIIIlIIlIIII[3];
            "".length();
            if ("  ".length() > (0x31 ^ 0x50 ^ (0x67 ^ 0x2))) {
                return;
            }
        }
        else {
            n = GuiContainer.lIIIIIlIIlIIII[0];
        }
        final boolean lllllllllllllIlIIllllIlIlIllIIlI = n != 0;
        final Slot lllllllllllllIlIIllllIlIlIllIIIl = this.getSlotAtPosition(lllllllllllllIlIIllllIlIlIllIlIl, lllllllllllllIlIIllllIlIlIllIlII);
        final long lllllllllllllIlIIllllIlIlIllIIII = Minecraft.getSystemTime();
        int doubleClick;
        if (lIllIlIllIllllI(this.lastClickSlot, lllllllllllllIlIIllllIlIlIllIIIl) && lIllIlIlllIIllI(lIllIlIlllIIlIl(lllllllllllllIlIIllllIlIlIllIIII - this.lastClickTime, 250L)) && lIllIlIlllIIIII(this.lastClickButton, lllllllllllllIlIIllllIlIlIllIIll)) {
            doubleClick = GuiContainer.lIIIIIlIIlIIII[3];
            "".length();
            if (((0x9F ^ 0x90 ^ (0xBB ^ 0xA6)) & (97 + 28 + 24 + 7 ^ 134 + 87 - 195 + 116 ^ -" ".length())) > 0) {
                return;
            }
        }
        else {
            doubleClick = GuiContainer.lIIIIIlIIlIIII[0];
        }
        this.doubleClick = (doubleClick != 0);
        this.ignoreMouseUp = (GuiContainer.lIIIIIlIIlIIII[0] != 0);
        if (!lIllIlIllIlIllI(lllllllllllllIlIIllllIlIlIllIIll) || !lIllIlIlllIIlll(lllllllllllllIlIIllllIlIlIllIIll, GuiContainer.lIIIIIlIIlIIII[3]) || lIllIlIllIlIllI(lllllllllllllIlIIllllIlIlIllIIlI ? 1 : 0)) {
            final int lllllllllllllIlIIllllIlIlIlIllll = this.guiLeft;
            final int lllllllllllllIlIIllllIlIlIlIlllI = this.guiTop;
            int n2;
            if (lIllIlIllIlIlll(lllllllllllllIlIIllllIlIlIllIlIl, lllllllllllllIlIIllllIlIlIlIllll) && lIllIlIllIlIlll(lllllllllllllIlIIllllIlIlIllIlII, lllllllllllllIlIIllllIlIlIlIlllI) && lIllIlIlllIlIII(lllllllllllllIlIIllllIlIlIllIlIl, lllllllllllllIlIIllllIlIlIlIllll + this.xSize) && lIllIlIlllIlIII(lllllllllllllIlIIllllIlIlIllIlII, lllllllllllllIlIIllllIlIlIlIlllI + this.ySize)) {
                n2 = GuiContainer.lIIIIIlIIlIIII[0];
                "".length();
                if ("  ".length() <= 0) {
                    return;
                }
            }
            else {
                n2 = GuiContainer.lIIIIIlIIlIIII[3];
            }
            final boolean lllllllllllllIlIIllllIlIlIlIllIl = n2 != 0;
            int lllllllllllllIlIIllllIlIlIlIllII = GuiContainer.lIIIIIlIIlIIII[10];
            if (lIllIlIllIllIIl(lllllllllllllIlIIllllIlIlIllIIIl)) {
                lllllllllllllIlIIllllIlIlIlIllII = lllllllllllllIlIIllllIlIlIllIIIl.slotNumber;
            }
            if (lIllIlIllIlIllI(lllllllllllllIlIIllllIlIlIlIllIl ? 1 : 0)) {
                lllllllllllllIlIIllllIlIlIlIllII = GuiContainer.lIIIIIlIIlIIII[11];
            }
            if (lIllIlIllIlIllI(this.mc.gameSettings.touchscreen ? 1 : 0) && lIllIlIllIlIllI(lllllllllllllIlIIllllIlIlIlIllIl ? 1 : 0) && lIllIlIllIllIII(this.mc.thePlayer.inventory.getItemStack())) {
                this.mc.displayGuiScreen(null);
                return;
            }
            if (lIllIlIlllIIlll(lllllllllllllIlIIllllIlIlIlIllII, GuiContainer.lIIIIIlIIlIIII[10])) {
                if (lIllIlIllIlIllI(this.mc.gameSettings.touchscreen ? 1 : 0)) {
                    if (lIllIlIllIllIIl(lllllllllllllIlIIllllIlIlIllIIIl) && lIllIlIllIlIllI(lllllllllllllIlIIllllIlIlIllIIIl.getHasStack() ? 1 : 0)) {
                        this.clickedSlot = lllllllllllllIlIIllllIlIlIllIIIl;
                        this.draggedStack = null;
                        int isRightMouseClick;
                        if (lIllIlIlllIIIII(lllllllllllllIlIIllllIlIlIllIIll, GuiContainer.lIIIIIlIIlIIII[3])) {
                            isRightMouseClick = GuiContainer.lIIIIIlIIlIIII[3];
                            "".length();
                            if (" ".length() != " ".length()) {
                                return;
                            }
                        }
                        else {
                            isRightMouseClick = GuiContainer.lIIIIIlIIlIIII[0];
                        }
                        this.isRightMouseClick = (isRightMouseClick != 0);
                        "".length();
                        if ("   ".length() > (0x3F ^ 0x34 ^ (0x80 ^ 0x8F))) {
                            return;
                        }
                    }
                    else {
                        this.clickedSlot = null;
                        "".length();
                        if (((0xBD ^ 0x91) & ~(0x8C ^ 0xA0)) > 0) {
                            return;
                        }
                    }
                }
                else if (lIllIlIllIllIll(this.dragSplitting ? 1 : 0)) {
                    if (lIllIlIllIllIII(this.mc.thePlayer.inventory.getItemStack())) {
                        if (lIllIlIlllIIIII(lllllllllllllIlIIllllIlIlIllIIll, this.mc.gameSettings.keyBindPickBlock.getKeyCode() + GuiContainer.lIIIIIlIIlIIII[9])) {
                            this.handleMouseClick(lllllllllllllIlIIllllIlIlIllIIIl, lllllllllllllIlIIllllIlIlIlIllII, lllllllllllllIlIIllllIlIlIllIIll, GuiContainer.lIIIIIlIIlIIII[12]);
                            "".length();
                            if (null != null) {
                                return;
                            }
                        }
                        else {
                            int n3;
                            if (lIllIlIlllIIlll(lllllllllllllIlIIllllIlIlIlIllII, GuiContainer.lIIIIIlIIlIIII[11]) && (!lIllIlIllIllIll(Keyboard.isKeyDown(GuiContainer.lIIIIIlIIlIIII[13]) ? 1 : 0) || lIllIlIllIlIllI(Keyboard.isKeyDown(GuiContainer.lIIIIIlIIlIIII[14]) ? 1 : 0))) {
                                n3 = GuiContainer.lIIIIIlIIlIIII[3];
                                "".length();
                                if (-(0xE ^ 0xA) > 0) {
                                    return;
                                }
                            }
                            else {
                                n3 = GuiContainer.lIIIIIlIIlIIII[0];
                            }
                            final boolean lllllllllllllIlIIllllIlIlIlIlIll = n3 != 0;
                            int lllllllllllllIlIIllllIlIlIlIlIlI = GuiContainer.lIIIIIlIIlIIII[0];
                            if (lIllIlIllIlIllI(lllllllllllllIlIIllllIlIlIlIlIll ? 1 : 0)) {
                                ItemStack stack;
                                if (lIllIlIllIllIIl(lllllllllllllIlIIllllIlIlIllIIIl) && lIllIlIllIlIllI(lllllllllllllIlIIllllIlIlIllIIIl.getHasStack() ? 1 : 0)) {
                                    stack = lllllllllllllIlIIllllIlIlIllIIIl.getStack();
                                    "".length();
                                    if (-"  ".length() >= 0) {
                                        return;
                                    }
                                }
                                else {
                                    stack = null;
                                }
                                this.shiftClickedSlot = stack;
                                lllllllllllllIlIIllllIlIlIlIlIlI = GuiContainer.lIIIIIlIIlIIII[3];
                                "".length();
                                if (((0xA4 ^ 0x82) & ~(0x2D ^ 0xB)) != 0x0) {
                                    return;
                                }
                            }
                            else if (lIllIlIlllIIIII(lllllllllllllIlIIllllIlIlIlIllII, GuiContainer.lIIIIIlIIlIIII[11])) {
                                lllllllllllllIlIIllllIlIlIlIlIlI = GuiContainer.lIIIIIlIIlIIII[15];
                            }
                            this.handleMouseClick(lllllllllllllIlIIllllIlIlIllIIIl, lllllllllllllIlIIllllIlIlIlIllII, lllllllllllllIlIIllllIlIlIllIIll, lllllllllllllIlIIllllIlIlIlIlIlI);
                        }
                        this.ignoreMouseUp = (GuiContainer.lIIIIIlIIlIIII[3] != 0);
                        "".length();
                        if ((0x13 ^ 0x19 ^ (0xA3 ^ 0xAC)) <= 0) {
                            return;
                        }
                    }
                    else {
                        this.dragSplitting = (GuiContainer.lIIIIIlIIlIIII[3] != 0);
                        this.dragSplittingButton = lllllllllllllIlIIllllIlIlIllIIll;
                        this.dragSplittingSlots.clear();
                        if (lIllIlIllIllIll(lllllllllllllIlIIllllIlIlIllIIll)) {
                            this.dragSplittingLimit = GuiContainer.lIIIIIlIIlIIII[0];
                            "".length();
                            if (-(0x92 ^ 0x96) >= 0) {
                                return;
                            }
                        }
                        else if (lIllIlIlllIIIII(lllllllllllllIlIIllllIlIlIllIIll, GuiContainer.lIIIIIlIIlIIII[3])) {
                            this.dragSplittingLimit = GuiContainer.lIIIIIlIIlIIII[3];
                            "".length();
                            if ((0x9B ^ 0x95 ^ (0xB6 ^ 0xBC)) <= ((32 + 199 - 210 + 209 ^ 132 + 20 - 31 + 59) & (0x29 ^ 0x59 ^ (0x3C ^ 0x1E) ^ -" ".length()))) {
                                return;
                            }
                        }
                        else if (lIllIlIlllIIIII(lllllllllllllIlIIllllIlIlIllIIll, this.mc.gameSettings.keyBindPickBlock.getKeyCode() + GuiContainer.lIIIIIlIIlIIII[9])) {
                            this.dragSplittingLimit = GuiContainer.lIIIIIlIIlIIII[4];
                        }
                    }
                }
            }
        }
        this.lastClickSlot = lllllllllllllIlIIllllIlIlIllIIIl;
        this.lastClickTime = lllllllllllllIlIIllllIlIlIllIIII;
        this.lastClickButton = lllllllllllllIlIIllllIlIlIllIIll;
    }
    
    private static String lIllIlIllIIlIll(final String lllllllllllllIlIIllllIIlllllIlll, final String lllllllllllllIlIIllllIIlllllIllI) {
        try {
            final SecretKeySpec lllllllllllllIlIIllllIIllllllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIllllIIlllllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIllllIIllllllIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIllllIIllllllIIl.init(GuiContainer.lIIIIIlIIlIIII[4], lllllllllllllIlIIllllIIllllllIlI);
            return new String(lllllllllllllIlIIllllIIllllllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIllllIIlllllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIllllIIllllllIII) {
            lllllllllllllIlIIllllIIllllllIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIllIlIlllIIlll(final int lllllllllllllIlIIllllIIlllIIlIIl, final int lllllllllllllIlIIllllIIlllIIlIII) {
        return lllllllllllllIlIIllllIIlllIIlIIl != lllllllllllllIlIIllllIIlllIIlIII;
    }
    
    private static boolean lIllIlIlllIlIII(final int lllllllllllllIlIIllllIIllllIIlll, final int lllllllllllllIlIIllllIIllllIIllI) {
        return lllllllllllllIlIIllllIIllllIIlll < lllllllllllllIlIIllllIIllllIIllI;
    }
    
    @Override
    public boolean doesGuiPauseGame() {
        return GuiContainer.lIIIIIlIIlIIII[0] != 0;
    }
    
    private static boolean lIllIlIlllIIIII(final int lllllllllllllIlIIllllIIllllIllll, final int lllllllllllllIlIIllllIIllllIlllI) {
        return lllllllllllllIlIIllllIIllllIllll == lllllllllllllIlIIllllIIllllIlllI;
    }
    
    public GuiContainer(final Container lllllllllllllIlIIllllIllIlIIllll) {
        this.xSize = GuiContainer.lIIIIIlIIlIIII[1];
        this.ySize = GuiContainer.lIIIIIlIIlIIII[2];
        this.dragSplittingSlots = (Set<Slot>)Sets.newHashSet();
        this.inventorySlots = lllllllllllllIlIIllllIllIlIIllll;
        this.ignoreMouseUp = (GuiContainer.lIIIIIlIIlIIII[3] != 0);
    }
    
    @Override
    public void onGuiClosed() {
        if (lIllIlIllIllIIl(this.mc.thePlayer)) {
            this.inventorySlots.onContainerClosed(this.mc.thePlayer);
        }
    }
    
    private static boolean lIllIlIlllIIllI(final int lllllllllllllIlIIllllIIlllIIlllI) {
        return lllllllllllllIlIIllllIIlllIIlllI < 0;
    }
    
    static {
        lIllIlIllIlIlII();
        lIllIlIllIIllIl();
        inventoryBackground = new ResourceLocation(GuiContainer.lIIIIIlIIIlIIl[GuiContainer.lIIIIIlIIlIIII[0]]);
    }
    
    private static void lIllIlIllIIllIl() {
        (lIIIIIlIIIlIIl = new String[GuiContainer.lIIIIIlIIlIIII[4]])[GuiContainer.lIIIIIlIIlIIII[0]] = lIllIlIllIIlIll("HLzJ3fT63CrsfjHAtZc+docUOR64zWI+bl3xnqqt9Q/1nV2XbiCVcA==", "wVKBS");
        GuiContainer.lIIIIIlIIIlIIl[GuiContainer.lIIIIIlIIlIIII[3]] = lIllIlIllIIllII("SQ==", "yYSFQ");
    }
    
    @Override
    public void updateScreen() {
        super.updateScreen();
        if (!lIllIlIllIlIllI(this.mc.thePlayer.isEntityAlive() ? 1 : 0) || lIllIlIllIlIllI(this.mc.thePlayer.isDead ? 1 : 0)) {
            this.mc.thePlayer.closeScreen();
        }
    }
    
    private static int lIllIlIlllIlIIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private void updateDragSplitting() {
        final ItemStack lllllllllllllIlIIllllIlIllIlllII = this.mc.thePlayer.inventory.getItemStack();
        if (lIllIlIllIllIIl(lllllllllllllIlIIllllIlIllIlllII) && lIllIlIllIlIllI(this.dragSplitting ? 1 : 0)) {
            this.dragSplittingRemnant = lllllllllllllIlIIllllIlIllIlllII.stackSize;
            final double lllllllllllllIlIIllllIlIllIlIlIl = (double)this.dragSplittingSlots.iterator();
            "".length();
            if (((101 + 135 - 185 + 112 ^ 103 + 37 + 36 + 17) & (0x4F ^ 0x70 ^ (0xFD ^ 0xA0) ^ -" ".length())) > 0) {
                return;
            }
            while (!lIllIlIllIllIll(((Iterator)lllllllllllllIlIIllllIlIllIlIlIl).hasNext() ? 1 : 0)) {
                final Slot lllllllllllllIlIIllllIlIllIllIll = ((Iterator<Slot>)lllllllllllllIlIIllllIlIllIlIlIl).next();
                final ItemStack lllllllllllllIlIIllllIlIllIllIlI = lllllllllllllIlIIllllIlIllIlllII.copy();
                int stackSize;
                if (lIllIlIllIllIII(lllllllllllllIlIIllllIlIllIllIll.getStack())) {
                    stackSize = GuiContainer.lIIIIIlIIlIIII[0];
                    "".length();
                    if (" ".length() == -" ".length()) {
                        return;
                    }
                }
                else {
                    stackSize = lllllllllllllIlIIllllIlIllIllIll.getStack().stackSize;
                }
                final int lllllllllllllIlIIllllIlIllIllIIl = stackSize;
                Container.computeStackSize(this.dragSplittingSlots, this.dragSplittingLimit, lllllllllllllIlIIllllIlIllIllIlI, lllllllllllllIlIIllllIlIllIllIIl);
                if (lIllIlIllIllIlI(lllllllllllllIlIIllllIlIllIllIlI.stackSize, lllllllllllllIlIIllllIlIllIllIlI.getMaxStackSize())) {
                    lllllllllllllIlIIllllIlIllIllIlI.stackSize = lllllllllllllIlIIllllIlIllIllIlI.getMaxStackSize();
                }
                if (lIllIlIllIllIlI(lllllllllllllIlIIllllIlIllIllIlI.stackSize, lllllllllllllIlIIllllIlIllIllIll.getItemStackLimit(lllllllllllllIlIIllllIlIllIllIlI))) {
                    lllllllllllllIlIIllllIlIllIllIlI.stackSize = lllllllllllllIlIIllllIlIllIllIll.getItemStackLimit(lllllllllllllIlIIllllIlIllIllIlI);
                }
                this.dragSplittingRemnant -= lllllllllllllIlIIllllIlIllIllIlI.stackSize - lllllllllllllIlIIllllIlIllIllIIl;
            }
        }
    }
    
    protected boolean isPointInRegion(final int lllllllllllllIlIIllllIlIIlIIllIl, final int lllllllllllllIlIIllllIlIIlIIllII, final int lllllllllllllIlIIllllIlIIlIIIIlI, final int lllllllllllllIlIIllllIlIIlIIIIIl, int lllllllllllllIlIIllllIlIIlIIIIII, int lllllllllllllIlIIllllIlIIIllllll) {
        final int lllllllllllllIlIIllllIlIIlIIIlll = this.guiLeft;
        final int lllllllllllllIlIIllllIlIIlIIIllI = this.guiTop;
        lllllllllllllIlIIllllIlIIlIIIIII -= lllllllllllllIlIIllllIlIIlIIIlll;
        lllllllllllllIlIIllllIlIIIllllll -= (char)lllllllllllllIlIIllllIlIIlIIIllI;
        if (lIllIlIllIlIlll(lllllllllllllIlIIllllIlIIlIIIIII, lllllllllllllIlIIllllIlIIlIIllIl - GuiContainer.lIIIIIlIIlIIII[3]) && lIllIlIlllIlIII(lllllllllllllIlIIllllIlIIlIIIIII, lllllllllllllIlIIllllIlIIlIIllIl + lllllllllllllIlIIllllIlIIlIIIIlI + GuiContainer.lIIIIIlIIlIIII[3]) && lIllIlIllIlIlll(lllllllllllllIlIIllllIlIIIllllll, lllllllllllllIlIIllllIlIIlIIllII - GuiContainer.lIIIIIlIIlIIII[3]) && lIllIlIlllIlIII(lllllllllllllIlIIllllIlIIIllllll, lllllllllllllIlIIllllIlIIlIIllII + lllllllllllllIlIIllllIlIIlIIIIIl + GuiContainer.lIIIIIlIIlIIII[3])) {
            return GuiContainer.lIIIIIlIIlIIII[3] != 0;
        }
        return GuiContainer.lIIIIIlIIlIIII[0] != 0;
    }
    
    @Override
    protected void mouseClickMove(final int lllllllllllllIlIIllllIlIlIIIllII, final int lllllllllllllIlIIllllIlIlIIlIIll, final int lllllllllllllIlIIllllIlIlIIlIIlI, final long lllllllllllllIlIIllllIlIlIIlIIIl) {
        final Slot lllllllllllllIlIIllllIlIlIIlIIII = this.getSlotAtPosition(lllllllllllllIlIIllllIlIlIIIllII, lllllllllllllIlIIllllIlIlIIlIIll);
        final ItemStack lllllllllllllIlIIllllIlIlIIIllll = this.mc.thePlayer.inventory.getItemStack();
        if (lIllIlIllIllIIl(this.clickedSlot) && lIllIlIllIlIllI(this.mc.gameSettings.touchscreen ? 1 : 0)) {
            if (!lIllIlIllIlIllI(lllllllllllllIlIIllllIlIlIIlIIlI) || lIllIlIlllIIIII(lllllllllllllIlIIllllIlIlIIlIIlI, GuiContainer.lIIIIIlIIlIIII[3])) {
                if (lIllIlIllIllIII(this.draggedStack)) {
                    if (lIllIlIlllIlIlI(lllllllllllllIlIIllllIlIlIIlIIII, this.clickedSlot) && lIllIlIllIllIIl(this.clickedSlot.getStack())) {
                        this.draggedStack = this.clickedSlot.getStack().copy();
                        "".length();
                        if ("   ".length() == -" ".length()) {
                            return;
                        }
                    }
                }
                else if (lIllIlIllIllIlI(this.draggedStack.stackSize, GuiContainer.lIIIIIlIIlIIII[3]) && lIllIlIllIllIIl(lllllllllllllIlIIllllIlIlIIlIIII) && lIllIlIllIlIllI(Container.canAddItemToSlot(lllllllllllllIlIIllllIlIlIIlIIII, this.draggedStack, (boolean)(GuiContainer.lIIIIIlIIlIIII[0] != 0)) ? 1 : 0)) {
                    final long lllllllllllllIlIIllllIlIlIIIlllI = Minecraft.getSystemTime();
                    if (lIllIlIllIllllI(this.currentDragTargetSlot, lllllllllllllIlIIllllIlIlIIlIIII)) {
                        if (lIllIlIlllIlIll(lIllIlIlllIlIIl(lllllllllllllIlIIllllIlIlIIIlllI - this.dragItemDropDelay, 500L))) {
                            this.handleMouseClick(this.clickedSlot, this.clickedSlot.slotNumber, GuiContainer.lIIIIIlIIlIIII[0], GuiContainer.lIIIIIlIIlIIII[0]);
                            this.handleMouseClick(lllllllllllllIlIIllllIlIlIIlIIII, lllllllllllllIlIIllllIlIlIIlIIII.slotNumber, GuiContainer.lIIIIIlIIlIIII[3], GuiContainer.lIIIIIlIIlIIII[0]);
                            this.handleMouseClick(this.clickedSlot, this.clickedSlot.slotNumber, GuiContainer.lIIIIIlIIlIIII[0], GuiContainer.lIIIIIlIIlIIII[0]);
                            this.dragItemDropDelay = lllllllllllllIlIIllllIlIlIIIlllI + 750L;
                            final ItemStack draggedStack = this.draggedStack;
                            draggedStack.stackSize -= GuiContainer.lIIIIIlIIlIIII[3];
                            "".length();
                            if (((0x2E ^ 0xC) & ~(0x53 ^ 0x71)) < 0) {
                                return;
                            }
                        }
                    }
                    else {
                        this.currentDragTargetSlot = lllllllllllllIlIIllllIlIlIIlIIII;
                        this.dragItemDropDelay = lllllllllllllIlIIllllIlIlIIIlllI;
                        "".length();
                        if (-" ".length() > "  ".length()) {
                            return;
                        }
                    }
                }
            }
        }
        else if (lIllIlIllIlIllI(this.dragSplitting ? 1 : 0) && lIllIlIllIllIIl(lllllllllllllIlIIllllIlIlIIlIIII) && lIllIlIllIllIIl(lllllllllllllIlIIllllIlIlIIIllll) && lIllIlIllIllIlI(lllllllllllllIlIIllllIlIlIIIllll.stackSize, this.dragSplittingSlots.size()) && lIllIlIllIlIllI(Container.canAddItemToSlot(lllllllllllllIlIIllllIlIlIIlIIII, lllllllllllllIlIIllllIlIlIIIllll, (boolean)(GuiContainer.lIIIIIlIIlIIII[3] != 0)) ? 1 : 0) && lIllIlIllIlIllI(lllllllllllllIlIIllllIlIlIIlIIII.isItemValid(lllllllllllllIlIIllllIlIlIIIllll) ? 1 : 0) && lIllIlIllIlIllI(this.inventorySlots.canDragIntoSlot(lllllllllllllIlIIllllIlIlIIlIIII) ? 1 : 0)) {
            this.dragSplittingSlots.add(lllllllllllllIlIIllllIlIlIIlIIII);
            "".length();
            this.updateDragSplitting();
        }
    }
    
    private void drawSlot(final Slot lllllllllllllIlIIllllIlIlllIllIl) {
        final int lllllllllllllIlIIllllIlIllllIlll = lllllllllllllIlIIllllIlIlllIllIl.xDisplayPosition;
        final int lllllllllllllIlIIllllIlIllllIllI = lllllllllllllIlIIllllIlIlllIllIl.yDisplayPosition;
        ItemStack lllllllllllllIlIIllllIlIllllIlIl = lllllllllllllIlIIllllIlIlllIllIl.getStack();
        boolean lllllllllllllIlIIllllIlIllllIlII = GuiContainer.lIIIIIlIIlIIII[0] != 0;
        int n;
        if (lIllIlIllIllllI(lllllllllllllIlIIllllIlIlllIllIl, this.clickedSlot) && lIllIlIllIllIIl(this.draggedStack) && lIllIlIllIllIll(this.isRightMouseClick ? 1 : 0)) {
            n = GuiContainer.lIIIIIlIIlIIII[3];
            "".length();
            if (((0x9A ^ 0x84) & ~(0x7 ^ 0x19)) != 0x0) {
                return;
            }
        }
        else {
            n = GuiContainer.lIIIIIlIIlIIII[0];
        }
        boolean lllllllllllllIlIIllllIlIllllIIll = n != 0;
        final ItemStack lllllllllllllIlIIllllIlIllllIIlI = this.mc.thePlayer.inventory.getItemStack();
        String lllllllllllllIlIIllllIlIllllIIIl = null;
        if (lIllIlIllIllllI(lllllllllllllIlIIllllIlIlllIllIl, this.clickedSlot) && lIllIlIllIllIIl(this.draggedStack) && lIllIlIllIlIllI(this.isRightMouseClick ? 1 : 0) && lIllIlIllIllIIl(lllllllllllllIlIIllllIlIllllIlIl)) {
            final ItemStack copy;
            lllllllllllllIlIIllllIlIllllIlIl = (copy = lllllllllllllIlIIllllIlIllllIlIl.copy());
            copy.stackSize /= GuiContainer.lIIIIIlIIlIIII[4];
            "".length();
            if (null != null) {
                return;
            }
        }
        else if (lIllIlIllIlIllI(this.dragSplitting ? 1 : 0) && lIllIlIllIlIllI(this.dragSplittingSlots.contains(lllllllllllllIlIIllllIlIlllIllIl) ? 1 : 0) && lIllIlIllIllIIl(lllllllllllllIlIIllllIlIllllIIlI)) {
            if (lIllIlIlllIIIII(this.dragSplittingSlots.size(), GuiContainer.lIIIIIlIIlIIII[3])) {
                return;
            }
            if (lIllIlIllIlIllI(Container.canAddItemToSlot(lllllllllllllIlIIllllIlIlllIllIl, lllllllllllllIlIIllllIlIllllIIlI, (boolean)(GuiContainer.lIIIIIlIIlIIII[3] != 0)) ? 1 : 0) && lIllIlIllIlIllI(this.inventorySlots.canDragIntoSlot(lllllllllllllIlIIllllIlIlllIllIl) ? 1 : 0)) {
                lllllllllllllIlIIllllIlIllllIlIl = lllllllllllllIlIIllllIlIllllIIlI.copy();
                lllllllllllllIlIIllllIlIllllIlII = (GuiContainer.lIIIIIlIIlIIII[3] != 0);
                final Set<Slot> dragSplittingSlots = this.dragSplittingSlots;
                final int dragSplittingLimit = this.dragSplittingLimit;
                final ItemStack lllllllllllllIlIIIIIIlllIlIlIlll = lllllllllllllIlIIllllIlIllllIlIl;
                int stackSize;
                if (lIllIlIllIllIII(lllllllllllllIlIIllllIlIlllIllIl.getStack())) {
                    stackSize = GuiContainer.lIIIIIlIIlIIII[0];
                    "".length();
                    if ("   ".length() > (0x69 ^ 0x19 ^ (0x33 ^ 0x47))) {
                        return;
                    }
                }
                else {
                    stackSize = lllllllllllllIlIIllllIlIlllIllIl.getStack().stackSize;
                }
                Container.computeStackSize(dragSplittingSlots, dragSplittingLimit, lllllllllllllIlIIIIIIlllIlIlIlll, stackSize);
                if (lIllIlIllIllIlI(lllllllllllllIlIIllllIlIllllIlIl.stackSize, lllllllllllllIlIIllllIlIllllIlIl.getMaxStackSize())) {
                    lllllllllllllIlIIllllIlIllllIIIl = String.valueOf(new StringBuilder().append(EnumChatFormatting.YELLOW).append(lllllllllllllIlIIllllIlIllllIlIl.getMaxStackSize()));
                    lllllllllllllIlIIllllIlIllllIlIl.stackSize = lllllllllllllIlIIllllIlIllllIlIl.getMaxStackSize();
                }
                if (lIllIlIllIllIlI(lllllllllllllIlIIllllIlIllllIlIl.stackSize, lllllllllllllIlIIllllIlIlllIllIl.getItemStackLimit(lllllllllllllIlIIllllIlIllllIlIl))) {
                    lllllllllllllIlIIllllIlIllllIIIl = String.valueOf(new StringBuilder().append(EnumChatFormatting.YELLOW).append(lllllllllllllIlIIllllIlIlllIllIl.getItemStackLimit(lllllllllllllIlIIllllIlIllllIlIl)));
                    lllllllllllllIlIIllllIlIllllIlIl.stackSize = lllllllllllllIlIIllllIlIlllIllIl.getItemStackLimit(lllllllllllllIlIIllllIlIllllIlIl);
                    "".length();
                    if ("  ".length() < 0) {
                        return;
                    }
                }
            }
            else {
                this.dragSplittingSlots.remove(lllllllllllllIlIIllllIlIlllIllIl);
                "".length();
                this.updateDragSplitting();
            }
        }
        this.zLevel = 100.0f;
        this.itemRender.zLevel = 100.0f;
        if (lIllIlIllIllIII(lllllllllllllIlIIllllIlIllllIlIl)) {
            final String lllllllllllllIlIIllllIlIllllIIII = lllllllllllllIlIIllllIlIlllIllIl.getSlotTexture();
            if (lIllIlIllIllIIl(lllllllllllllIlIIllllIlIllllIIII)) {
                final TextureAtlasSprite lllllllllllllIlIIllllIlIlllIllll = this.mc.getTextureMapBlocks().getAtlasSprite(lllllllllllllIlIIllllIlIllllIIII);
                GlStateManager.disableLighting();
                this.mc.getTextureManager().bindTexture(TextureMap.locationBlocksTexture);
                this.drawTexturedModalRect(lllllllllllllIlIIllllIlIllllIlll, lllllllllllllIlIIllllIlIllllIllI, lllllllllllllIlIIllllIlIlllIllll, GuiContainer.lIIIIIlIIlIIII[6], GuiContainer.lIIIIIlIIlIIII[6]);
                GlStateManager.enableLighting();
                lllllllllllllIlIIllllIlIllllIIll = (GuiContainer.lIIIIIlIIlIIII[3] != 0);
            }
        }
        if (lIllIlIllIllIll(lllllllllllllIlIIllllIlIllllIIll ? 1 : 0)) {
            if (lIllIlIllIlIllI(lllllllllllllIlIIllllIlIllllIlII ? 1 : 0)) {
                Gui.drawRect(lllllllllllllIlIIllllIlIllllIlll, lllllllllllllIlIIllllIlIllllIllI, lllllllllllllIlIIllllIlIllllIlll + GuiContainer.lIIIIIlIIlIIII[6], lllllllllllllIlIIllllIlIllllIllI + GuiContainer.lIIIIIlIIlIIII[6], GuiContainer.lIIIIIlIIlIIII[7]);
            }
            GlStateManager.enableDepth();
            this.itemRender.renderItemAndEffectIntoGUI(lllllllllllllIlIIllllIlIllllIlIl, lllllllllllllIlIIllllIlIllllIlll, lllllllllllllIlIIllllIlIllllIllI);
            this.itemRender.renderItemOverlayIntoGUI(this.fontRendererObj, lllllllllllllIlIIllllIlIllllIlIl, lllllllllllllIlIIllllIlIllllIlll, lllllllllllllIlIIllllIlIllllIllI, lllllllllllllIlIIllllIlIllllIIIl);
        }
        this.itemRender.zLevel = 0.0f;
        this.zLevel = 0.0f;
    }
    
    private static boolean lIllIlIllIllIlI(final int lllllllllllllIlIIllllIIllllIIIll, final int lllllllllllllIlIIllllIIllllIIIlI) {
        return lllllllllllllIlIIllllIIllllIIIll > lllllllllllllIlIIllllIIllllIIIlI;
    }
    
    private static boolean lIllIlIlllIlIll(final int lllllllllllllIlIIllllIIlllIIllII) {
        return lllllllllllllIlIIllllIIlllIIllII > 0;
    }
    
    private static boolean lIllIlIllIllIll(final int lllllllllllllIlIIllllIIlllIlIIlI) {
        return lllllllllllllIlIIllllIIlllIlIIlI == 0;
    }
    
    private static boolean lIllIlIllIlIllI(final int lllllllllllllIlIIllllIIlllIlIlII) {
        return lllllllllllllIlIIllllIIlllIlIlII != 0;
    }
    
    @Override
    protected void keyTyped(final char lllllllllllllIlIIllllIlIIIlIlIlI, final int lllllllllllllIlIIllllIlIIIlIlIIl) throws IOException {
        if (!lIllIlIlllIIlll(lllllllllllllIlIIllllIlIIIlIlIIl, GuiContainer.lIIIIIlIIlIIII[3]) || lIllIlIlllIIIII(lllllllllllllIlIIllllIlIIIlIlIIl, this.mc.gameSettings.keyBindInventory.getKeyCode())) {
            this.mc.thePlayer.closeScreen();
        }
        this.checkHotbarKeys(lllllllllllllIlIIllllIlIIIlIlIIl);
        "".length();
        if (lIllIlIllIllIIl(this.theSlot) && lIllIlIllIlIllI(this.theSlot.getHasStack() ? 1 : 0)) {
            if (lIllIlIlllIIIII(lllllllllllllIlIIllllIlIIIlIlIIl, this.mc.gameSettings.keyBindPickBlock.getKeyCode())) {
                this.handleMouseClick(this.theSlot, this.theSlot.slotNumber, GuiContainer.lIIIIIlIIlIIII[0], GuiContainer.lIIIIIlIIlIIII[12]);
                "".length();
                if ((0xB4 ^ 0xB0) < 0) {
                    return;
                }
            }
            else if (lIllIlIlllIIIII(lllllllllllllIlIIllllIlIIIlIlIIl, this.mc.gameSettings.keyBindDrop.getKeyCode())) {
                final Slot theSlot = this.theSlot;
                final int slotNumber = this.theSlot.slotNumber;
                int lllllllllllllIlIIllllIlIIIlIllll;
                if (lIllIlIllIlIllI(GuiScreen.isCtrlKeyDown() ? 1 : 0)) {
                    lllllllllllllIlIIllllIlIIIlIllll = GuiContainer.lIIIIIlIIlIIII[3];
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    lllllllllllllIlIIllllIlIIIlIllll = GuiContainer.lIIIIIlIIlIIII[0];
                }
                this.handleMouseClick(theSlot, slotNumber, lllllllllllllIlIIllllIlIIIlIllll, GuiContainer.lIIIIIlIIlIIII[15]);
            }
        }
    }
    
    protected abstract void drawGuiContainerBackgroundLayer(final float p0, final int p1, final int p2);
}
