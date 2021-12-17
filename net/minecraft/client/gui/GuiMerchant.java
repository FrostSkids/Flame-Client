// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import java.util.Arrays;
import net.minecraft.client.Minecraft;
import org.apache.logging.log4j.LogManager;
import net.minecraft.item.ItemStack;
import net.minecraft.client.renderer.RenderHelper;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.resources.I18n;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.inventory.Container;
import net.minecraft.world.World;
import net.minecraft.entity.player.InventoryPlayer;
import java.io.IOException;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C17PacketCustomPayload;
import net.minecraft.network.PacketBuffer;
import io.netty.buffer.Unpooled;
import net.minecraft.inventory.ContainerMerchant;
import net.minecraft.entity.player.EntityPlayer;
import java.util.List;
import net.minecraft.entity.IMerchant;
import net.minecraft.util.IChatComponent;
import org.apache.logging.log4j.Logger;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.gui.inventory.GuiContainer;

public class GuiMerchant extends GuiContainer
{
    private /* synthetic */ int selectedMerchantRecipe;
    private static final /* synthetic */ ResourceLocation MERCHANT_GUI_TEXTURE;
    private static final /* synthetic */ int[] lllIIlIIllIIll;
    private /* synthetic */ MerchantButton previousButton;
    private static final /* synthetic */ String[] lllIIlIIlIlIIl;
    private /* synthetic */ IChatComponent chatComponent;
    private /* synthetic */ IMerchant merchant;
    private /* synthetic */ MerchantButton nextButton;
    
    @Override
    public void initGui() {
        super.initGui();
        final int llllllllllllIlIllllIllIllIlIlIll = (this.width - this.xSize) / GuiMerchant.lllIIlIIllIIll[1];
        final int llllllllllllIlIllllIllIllIlIlIlI = (this.height - this.ySize) / GuiMerchant.lllIIlIIllIIll[1];
        final List<GuiButton> buttonList = this.buttonList;
        final MerchantButton nextButton = new MerchantButton(GuiMerchant.lllIIlIIllIIll[2], llllllllllllIlIllllIllIllIlIlIll + GuiMerchant.lllIIlIIllIIll[3] + GuiMerchant.lllIIlIIllIIll[4], llllllllllllIlIllllIllIllIlIlIlI + GuiMerchant.lllIIlIIllIIll[5] - GuiMerchant.lllIIlIIllIIll[2], (boolean)(GuiMerchant.lllIIlIIllIIll[2] != 0));
        this.nextButton = nextButton;
        buttonList.add(nextButton);
        "".length();
        final List<GuiButton> buttonList2 = this.buttonList;
        final MerchantButton previousButton = new MerchantButton(GuiMerchant.lllIIlIIllIIll[1], llllllllllllIlIllllIllIllIlIlIll + GuiMerchant.lllIIlIIllIIll[6] - GuiMerchant.lllIIlIIllIIll[7], llllllllllllIlIllllIllIllIlIlIlI + GuiMerchant.lllIIlIIllIIll[5] - GuiMerchant.lllIIlIIllIIll[2], (boolean)(GuiMerchant.lllIIlIIllIIll[0] != 0));
        this.previousButton = previousButton;
        buttonList2.add(previousButton);
        "".length();
        this.nextButton.enabled = (GuiMerchant.lllIIlIIllIIll[0] != 0);
        this.previousButton.enabled = (GuiMerchant.lllIIlIIllIIll[0] != 0);
    }
    
    private static boolean lIIlllllIlIIlIll(final int llllllllllllIlIllllIllIlIIIlIlIl) {
        return llllllllllllIlIllllIllIlIIIlIlIl < 0;
    }
    
    private static boolean lIIlllllIlIIlIII(final int llllllllllllIlIllllIllIlIIIlIIll) {
        return llllllllllllIlIllllIllIlIIIlIIll > 0;
    }
    
    private static boolean lIIlllllIlIIllII(final int llllllllllllIlIllllIllIlIIIllIll) {
        return llllllllllllIlIllllIllIlIIIllIll != 0;
    }
    
    @Override
    protected void actionPerformed(final GuiButton llllllllllllIlIllllIllIllIIlIIll) throws IOException {
        boolean llllllllllllIlIllllIllIllIIlIIlI = GuiMerchant.lllIIlIIllIIll[0] != 0;
        if (lIIlllllIlIIlIIl(llllllllllllIlIllllIllIllIIlIIll, this.nextButton)) {
            this.selectedMerchantRecipe += GuiMerchant.lllIIlIIllIIll[2];
            final MerchantRecipeList llllllllllllIlIllllIllIllIIlIIIl = this.merchant.getRecipes(this.mc.thePlayer);
            if (lIIlllllIlIIIllI(llllllllllllIlIllllIllIllIIlIIIl) && lIIlllllIlIIlIlI(this.selectedMerchantRecipe, llllllllllllIlIllllIllIllIIlIIIl.size())) {
                this.selectedMerchantRecipe = llllllllllllIlIllllIllIllIIlIIIl.size() - GuiMerchant.lllIIlIIllIIll[2];
            }
            llllllllllllIlIllllIllIllIIlIIlI = (GuiMerchant.lllIIlIIllIIll[2] != 0);
            "".length();
            if (((113 + 38 - 10 + 19 ^ 15 + 71 - 25 + 69) & (129 + 164 - 260 + 139 ^ 115 + 51 - 159 + 135 ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else if (lIIlllllIlIIlIIl(llllllllllllIlIllllIllIllIIlIIll, this.previousButton)) {
            this.selectedMerchantRecipe -= GuiMerchant.lllIIlIIllIIll[2];
            if (lIIlllllIlIIlIll(this.selectedMerchantRecipe)) {
                this.selectedMerchantRecipe = GuiMerchant.lllIIlIIllIIll[0];
            }
            llllllllllllIlIllllIllIllIIlIIlI = (GuiMerchant.lllIIlIIllIIll[2] != 0);
        }
        if (lIIlllllIlIIllII(llllllllllllIlIllllIllIllIIlIIlI ? 1 : 0)) {
            ((ContainerMerchant)this.inventorySlots).setCurrentRecipeIndex(this.selectedMerchantRecipe);
            final PacketBuffer llllllllllllIlIllllIllIllIIlIIII = new PacketBuffer(Unpooled.buffer());
            llllllllllllIlIllllIllIllIIlIIII.writeInt(this.selectedMerchantRecipe);
            "".length();
            this.mc.getNetHandler().addToSendQueue(new C17PacketCustomPayload(GuiMerchant.lllIIlIIlIlIIl[GuiMerchant.lllIIlIIllIIll[1]], llllllllllllIlIllllIllIllIIlIIII));
        }
    }
    
    private static boolean lIIlllllIlIIlllI(final int llllllllllllIlIllllIllIlIIIlIlll) {
        return llllllllllllIlIllllIllIlIIIlIlll >= 0;
    }
    
    public IMerchant getMerchant() {
        return this.merchant;
    }
    
    public GuiMerchant(final InventoryPlayer llllllllllllIlIllllIllIllIllIllI, final IMerchant llllllllllllIlIllllIllIllIllIlIl, final World llllllllllllIlIllllIllIllIllIIII) {
        super(new ContainerMerchant(llllllllllllIlIllllIllIllIllIllI, llllllllllllIlIllllIllIllIllIlIl, llllllllllllIlIllllIllIllIllIIII));
        this.merchant = llllllllllllIlIllllIllIllIllIlIl;
        this.chatComponent = llllllllllllIlIllllIllIllIllIlIl.getDisplayName();
    }
    
    private static void lIIlllllIIlllIlI() {
        (lllIIlIIlIlIIl = new String[GuiMerchant.lllIIlIIllIIll[20]])[GuiMerchant.lllIIlIIllIIll[0]] = lIIlllllIIllIlII("IR83DQUnHzxWFyATYBofOw4uEB4wCGAPGTkWLh4VJ1Q/Fxc=", "UzOyp");
        GuiMerchant.lllIIlIIlIlIIl[GuiMerchant.lllIIlIIllIIll[2]] = lIIlllllIIllIlIl("sYwz+IapvuNqMwyt7kHQqLf8Hi9sE0rO", "SLbHf");
        GuiMerchant.lllIIlIIlIlIIl[GuiMerchant.lllIIlIIllIIll[1]] = lIIlllllIIllIlII("ITstExM/HT0=", "lxQGa");
        GuiMerchant.lllIIlIIlIlIIl[GuiMerchant.lllIIlIIllIIll[19]] = lIIlllllIIllIlII("Lww8DjIjBzpDPicZPAg5Ix0rCQ==", "BiNmZ");
    }
    
    @Override
    protected void drawGuiContainerBackgroundLayer(final float llllllllllllIlIllllIllIllIIIIlII, final int llllllllllllIlIllllIllIllIIIIIll, final int llllllllllllIlIllllIllIllIIIIIlI) {
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.getTextureManager().bindTexture(GuiMerchant.MERCHANT_GUI_TEXTURE);
        final int llllllllllllIlIllllIllIllIIIIIIl = (this.width - this.xSize) / GuiMerchant.lllIIlIIllIIll[1];
        final int llllllllllllIlIllllIllIllIIIIIII = (this.height - this.ySize) / GuiMerchant.lllIIlIIllIIll[1];
        this.drawTexturedModalRect(llllllllllllIlIllllIllIllIIIIIIl, llllllllllllIlIllllIllIllIIIIIII, GuiMerchant.lllIIlIIllIIll[0], GuiMerchant.lllIIlIIllIIll[0], this.xSize, this.ySize);
        final MerchantRecipeList llllllllllllIlIllllIllIlIlllllll = this.merchant.getRecipes(this.mc.thePlayer);
        if (lIIlllllIlIIIllI(llllllllllllIlIllllIllIlIlllllll) && lIIlllllIlIIllIl(llllllllllllIlIllllIllIlIlllllll.isEmpty() ? 1 : 0)) {
            final int llllllllllllIlIllllIllIlIllllllI = this.selectedMerchantRecipe;
            if (!lIIlllllIlIIlllI(llllllllllllIlIllllIllIlIllllllI) || lIIlllllIlIIlIlI(llllllllllllIlIllllIllIlIllllllI, llllllllllllIlIllllIllIlIlllllll.size())) {
                return;
            }
            final MerchantRecipe llllllllllllIlIllllIllIlIlllllIl = llllllllllllIlIllllIllIlIlllllll.get(llllllllllllIlIllllIllIlIllllllI);
            if (lIIlllllIlIIllII(llllllllllllIlIllllIllIlIlllllIl.isRecipeDisabled() ? 1 : 0)) {
                this.mc.getTextureManager().bindTexture(GuiMerchant.MERCHANT_GUI_TEXTURE);
                GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
                GlStateManager.disableLighting();
                this.drawTexturedModalRect(this.guiLeft + GuiMerchant.lllIIlIIllIIll[12], this.guiTop + GuiMerchant.lllIIlIIllIIll[13], GuiMerchant.lllIIlIIllIIll[14], GuiMerchant.lllIIlIIllIIll[0], GuiMerchant.lllIIlIIllIIll[15], GuiMerchant.lllIIlIIllIIll[13]);
                this.drawTexturedModalRect(this.guiLeft + GuiMerchant.lllIIlIIllIIll[12], this.guiTop + GuiMerchant.lllIIlIIllIIll[16], GuiMerchant.lllIIlIIllIIll[14], GuiMerchant.lllIIlIIllIIll[0], GuiMerchant.lllIIlIIllIIll[15], GuiMerchant.lllIIlIIllIIll[13]);
            }
        }
    }
    
    @Override
    protected void drawGuiContainerForegroundLayer(final int llllllllllllIlIllllIllIllIlIIIll, final int llllllllllllIlIllllIllIllIlIIIlI) {
        final String llllllllllllIlIllllIllIllIlIIIIl = this.chatComponent.getUnformattedText();
        this.fontRendererObj.drawString(llllllllllllIlIllllIllIllIlIIIIl, this.xSize / GuiMerchant.lllIIlIIllIIll[1] - this.fontRendererObj.getStringWidth(llllllllllllIlIllllIllIllIlIIIIl) / GuiMerchant.lllIIlIIllIIll[1], GuiMerchant.lllIIlIIllIIll[8], GuiMerchant.lllIIlIIllIIll[9]);
        "".length();
        this.fontRendererObj.drawString(I18n.format(GuiMerchant.lllIIlIIlIlIIl[GuiMerchant.lllIIlIIllIIll[2]], new Object[GuiMerchant.lllIIlIIllIIll[0]]), GuiMerchant.lllIIlIIllIIll[10], this.ySize - GuiMerchant.lllIIlIIllIIll[11] + GuiMerchant.lllIIlIIllIIll[1], GuiMerchant.lllIIlIIllIIll[9]);
        "".length();
    }
    
    private static String lIIlllllIIllIlIl(final String llllllllllllIlIllllIllIlIIllIIII, final String llllllllllllIlIllllIllIlIIlIllIl) {
        try {
            final SecretKeySpec llllllllllllIlIllllIllIlIIllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllllIllIlIIlIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllllIllIlIIllIIlI = Cipher.getInstance("Blowfish");
            llllllllllllIlIllllIllIlIIllIIlI.init(GuiMerchant.lllIIlIIllIIll[1], llllllllllllIlIllllIllIlIIllIIll);
            return new String(llllllllllllIlIllllIllIlIIllIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlIllllIllIlIIllIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllllIllIlIIllIIIl) {
            llllllllllllIlIllllIllIlIIllIIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void drawScreen(final int llllllllllllIlIllllIllIlIlIlllIl, final int llllllllllllIlIllllIllIlIlIlllII, final float llllllllllllIlIllllIllIlIlIllIll) {
        super.drawScreen(llllllllllllIlIllllIllIlIlIlllIl, llllllllllllIlIllllIllIlIlIlllII, llllllllllllIlIllllIllIlIlIllIll);
        final MerchantRecipeList llllllllllllIlIllllIllIlIllIIllI = this.merchant.getRecipes(this.mc.thePlayer);
        if (lIIlllllIlIIIllI(llllllllllllIlIllllIllIlIllIIllI) && lIIlllllIlIIllIl(llllllllllllIlIllllIllIlIllIIllI.isEmpty() ? 1 : 0)) {
            final int llllllllllllIlIllllIllIlIllIIlIl = (this.width - this.xSize) / GuiMerchant.lllIIlIIllIIll[1];
            final int llllllllllllIlIllllIllIlIllIIlII = (this.height - this.ySize) / GuiMerchant.lllIIlIIllIIll[1];
            final int llllllllllllIlIllllIllIlIllIIIll = this.selectedMerchantRecipe;
            final MerchantRecipe llllllllllllIlIllllIllIlIllIIIlI = llllllllllllIlIllllIllIlIllIIllI.get(llllllllllllIlIllllIllIlIllIIIll);
            final ItemStack llllllllllllIlIllllIllIlIllIIIIl = llllllllllllIlIllllIllIlIllIIIlI.getItemToBuy();
            final ItemStack llllllllllllIlIllllIllIlIllIIIII = llllllllllllIlIllllIllIlIllIIIlI.getSecondItemToBuy();
            final ItemStack llllllllllllIlIllllIllIlIlIlllll = llllllllllllIlIllllIllIlIllIIIlI.getItemToSell();
            GlStateManager.pushMatrix();
            RenderHelper.enableGUIStandardItemLighting();
            GlStateManager.disableLighting();
            GlStateManager.enableRescaleNormal();
            GlStateManager.enableColorMaterial();
            GlStateManager.enableLighting();
            this.itemRender.zLevel = 100.0f;
            this.itemRender.renderItemAndEffectIntoGUI(llllllllllllIlIllllIllIlIllIIIIl, llllllllllllIlIllllIllIlIllIIlIl + GuiMerchant.lllIIlIIllIIll[6], llllllllllllIlIllllIllIlIllIIlII + GuiMerchant.lllIIlIIllIIll[5]);
            this.itemRender.renderItemOverlays(this.fontRendererObj, llllllllllllIlIllllIllIlIllIIIIl, llllllllllllIlIllllIllIlIllIIlIl + GuiMerchant.lllIIlIIllIIll[6], llllllllllllIlIllllIllIlIllIIlII + GuiMerchant.lllIIlIIllIIll[5]);
            if (lIIlllllIlIIIllI(llllllllllllIlIllllIllIlIllIIIII)) {
                this.itemRender.renderItemAndEffectIntoGUI(llllllllllllIlIllllIllIlIllIIIII, llllllllllllIlIllllIllIlIllIIlIl + GuiMerchant.lllIIlIIllIIll[17], llllllllllllIlIllllIllIlIllIIlII + GuiMerchant.lllIIlIIllIIll[5]);
                this.itemRender.renderItemOverlays(this.fontRendererObj, llllllllllllIlIllllIllIlIllIIIII, llllllllllllIlIllllIllIlIllIIlIl + GuiMerchant.lllIIlIIllIIll[17], llllllllllllIlIllllIllIlIllIIlII + GuiMerchant.lllIIlIIllIIll[5]);
            }
            this.itemRender.renderItemAndEffectIntoGUI(llllllllllllIlIllllIllIlIlIlllll, llllllllllllIlIllllIllIlIllIIlIl + GuiMerchant.lllIIlIIllIIll[3], llllllllllllIlIllllIllIlIllIIlII + GuiMerchant.lllIIlIIllIIll[5]);
            this.itemRender.renderItemOverlays(this.fontRendererObj, llllllllllllIlIllllIllIlIlIlllll, llllllllllllIlIllllIllIlIllIIlIl + GuiMerchant.lllIIlIIllIIll[3], llllllllllllIlIllllIllIlIllIIlII + GuiMerchant.lllIIlIIllIIll[5]);
            this.itemRender.zLevel = 0.0f;
            GlStateManager.disableLighting();
            if (lIIlllllIlIIllII(this.isPointInRegion(GuiMerchant.lllIIlIIllIIll[6], GuiMerchant.lllIIlIIllIIll[5], GuiMerchant.lllIIlIIllIIll[18], GuiMerchant.lllIIlIIllIIll[18], llllllllllllIlIllllIllIlIlIlllIl, llllllllllllIlIllllIllIlIlIlllII) ? 1 : 0) && lIIlllllIlIIIllI(llllllllllllIlIllllIllIlIllIIIIl)) {
                this.renderToolTip(llllllllllllIlIllllIllIlIllIIIIl, llllllllllllIlIllllIllIlIlIlllIl, llllllllllllIlIllllIllIlIlIlllII);
                "".length();
                if (((0x8A ^ 0xB6 ^ (0x1B ^ 0x17)) & (0xD9 ^ 0x98 ^ (0x22 ^ 0x53) ^ -" ".length())) >= "   ".length()) {
                    return;
                }
            }
            else if (lIIlllllIlIIIllI(llllllllllllIlIllllIllIlIllIIIII) && lIIlllllIlIIllII(this.isPointInRegion(GuiMerchant.lllIIlIIllIIll[17], GuiMerchant.lllIIlIIllIIll[5], GuiMerchant.lllIIlIIllIIll[18], GuiMerchant.lllIIlIIllIIll[18], llllllllllllIlIllllIllIlIlIlllIl, llllllllllllIlIllllIllIlIlIlllII) ? 1 : 0) && lIIlllllIlIIIllI(llllllllllllIlIllllIllIlIllIIIII)) {
                this.renderToolTip(llllllllllllIlIllllIllIlIllIIIII, llllllllllllIlIllllIllIlIlIlllIl, llllllllllllIlIllllIllIlIlIlllII);
                "".length();
                if ("  ".length() == 0) {
                    return;
                }
            }
            else if (lIIlllllIlIIIllI(llllllllllllIlIllllIllIlIlIlllll) && lIIlllllIlIIllII(this.isPointInRegion(GuiMerchant.lllIIlIIllIIll[3], GuiMerchant.lllIIlIIllIIll[5], GuiMerchant.lllIIlIIllIIll[18], GuiMerchant.lllIIlIIllIIll[18], llllllllllllIlIllllIllIlIlIlllIl, llllllllllllIlIllllIllIlIlIlllII) ? 1 : 0) && lIIlllllIlIIIllI(llllllllllllIlIllllIllIlIlIlllll)) {
                this.renderToolTip(llllllllllllIlIllllIllIlIlIlllll, llllllllllllIlIllllIllIlIlIlllIl, llllllllllllIlIllllIllIlIlIlllII);
                "".length();
                if (-" ".length() > 0) {
                    return;
                }
            }
            else if (lIIlllllIlIIllII(llllllllllllIlIllllIllIlIllIIIlI.isRecipeDisabled() ? 1 : 0) && (!lIIlllllIlIIllIl(this.isPointInRegion(GuiMerchant.lllIIlIIllIIll[12], GuiMerchant.lllIIlIIllIIll[13], GuiMerchant.lllIIlIIllIIll[15], GuiMerchant.lllIIlIIllIIll[13], llllllllllllIlIllllIllIlIlIlllIl, llllllllllllIlIllllIllIlIlIlllII) ? 1 : 0) || lIIlllllIlIIllII(this.isPointInRegion(GuiMerchant.lllIIlIIllIIll[12], GuiMerchant.lllIIlIIllIIll[16], GuiMerchant.lllIIlIIllIIll[15], GuiMerchant.lllIIlIIllIIll[13], llllllllllllIlIllllIllIlIlIlllIl, llllllllllllIlIllllIllIlIlIlllII) ? 1 : 0))) {
                this.drawCreativeTabHoveringText(I18n.format(GuiMerchant.lllIIlIIlIlIIl[GuiMerchant.lllIIlIIllIIll[19]], new Object[GuiMerchant.lllIIlIIllIIll[0]]), llllllllllllIlIllllIllIlIlIlllIl, llllllllllllIlIllllIllIlIlIlllII);
            }
            GlStateManager.popMatrix();
            GlStateManager.enableLighting();
            GlStateManager.enableDepth();
            RenderHelper.enableStandardItemLighting();
        }
    }
    
    private static boolean lIIlllllIlIIIlll(final int llllllllllllIlIllllIllIlIIlIIlII, final int llllllllllllIlIllllIllIlIIlIIIll) {
        return llllllllllllIlIllllIllIlIIlIIlII < llllllllllllIlIllllIllIlIIlIIIll;
    }
    
    @Override
    public void updateScreen() {
        super.updateScreen();
        final MerchantRecipeList llllllllllllIlIllllIllIllIIllIll = this.merchant.getRecipes(this.mc.thePlayer);
        if (lIIlllllIlIIIllI(llllllllllllIlIllllIllIllIIllIll)) {
            final MerchantButton nextButton = this.nextButton;
            int enabled;
            if (lIIlllllIlIIIlll(this.selectedMerchantRecipe, llllllllllllIlIllllIllIllIIllIll.size() - GuiMerchant.lllIIlIIllIIll[2])) {
                enabled = GuiMerchant.lllIIlIIllIIll[2];
                "".length();
                if (" ".length() >= "  ".length()) {
                    return;
                }
            }
            else {
                enabled = GuiMerchant.lllIIlIIllIIll[0];
            }
            nextButton.enabled = (enabled != 0);
            final MerchantButton previousButton = this.previousButton;
            int enabled2;
            if (lIIlllllIlIIlIII(this.selectedMerchantRecipe)) {
                enabled2 = GuiMerchant.lllIIlIIllIIll[2];
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                enabled2 = GuiMerchant.lllIIlIIllIIll[0];
            }
            previousButton.enabled = (enabled2 != 0);
        }
    }
    
    private static boolean lIIlllllIlIIIllI(final Object llllllllllllIlIllllIllIlIIlIIIIl) {
        return llllllllllllIlIllllIllIlIIlIIIIl != null;
    }
    
    private static String lIIlllllIIllIlII(String llllllllllllIlIllllIllIlIlIIIIII, final String llllllllllllIlIllllIllIlIlIIIlII) {
        llllllllllllIlIllllIllIlIlIIIIII = (float)new String(Base64.getDecoder().decode(((String)llllllllllllIlIllllIllIlIlIIIIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllllIllIlIlIIIIll = new StringBuilder();
        final char[] llllllllllllIlIllllIllIlIlIIIIlI = llllllllllllIlIllllIllIlIlIIIlII.toCharArray();
        int llllllllllllIlIllllIllIlIlIIIIIl = GuiMerchant.lllIIlIIllIIll[0];
        final int llllllllllllIlIllllIllIlIIlllIll = (Object)((String)llllllllllllIlIllllIllIlIlIIIIII).toCharArray();
        final long llllllllllllIlIllllIllIlIIlllIlI = llllllllllllIlIllllIllIlIIlllIll.length;
        double llllllllllllIlIllllIllIlIIlllIIl = GuiMerchant.lllIIlIIllIIll[0];
        while (lIIlllllIlIIIlll((int)llllllllllllIlIllllIllIlIIlllIIl, (int)llllllllllllIlIllllIllIlIIlllIlI)) {
            final char llllllllllllIlIllllIllIlIlIIIllI = llllllllllllIlIllllIllIlIIlllIll[llllllllllllIlIllllIllIlIIlllIIl];
            llllllllllllIlIllllIllIlIlIIIIll.append((char)(llllllllllllIlIllllIllIlIlIIIllI ^ llllllllllllIlIllllIllIlIlIIIIlI[llllllllllllIlIllllIllIlIlIIIIIl % llllllllllllIlIllllIllIlIlIIIIlI.length]));
            "".length();
            ++llllllllllllIlIllllIllIlIlIIIIIl;
            ++llllllllllllIlIllllIllIlIIlllIIl;
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllllIllIlIlIIIIll);
    }
    
    static {
        lIIlllllIlIIIlIl();
        lIIlllllIIlllIlI();
        logger = LogManager.getLogger();
        MERCHANT_GUI_TEXTURE = new ResourceLocation(GuiMerchant.lllIIlIIlIlIIl[GuiMerchant.lllIIlIIllIIll[0]]);
    }
    
    private static void lIIlllllIlIIIlIl() {
        (lllIIlIIllIIll = new int[21])[0] = ((0x2A ^ 0xC ^ (0xB6 ^ 0xA6)) & (0x46 ^ 0x61 ^ (0x52 ^ 0x43) ^ -" ".length()));
        GuiMerchant.lllIIlIIllIIll[1] = "  ".length();
        GuiMerchant.lllIIlIIllIIll[2] = " ".length();
        GuiMerchant.lllIIlIIllIIll[3] = (0x31 ^ 0x49);
        GuiMerchant.lllIIlIIllIIll[4] = (0xF4 ^ 0xAC ^ (0x57 ^ 0x14));
        GuiMerchant.lllIIlIIllIIll[5] = (0x9C ^ 0x84);
        GuiMerchant.lllIIlIIllIIll[6] = (44 + 6 + 18 + 83 ^ 37 + 115 - 150 + 177);
        GuiMerchant.lllIIlIIllIIll[7] = (0x76 ^ 0x65);
        GuiMerchant.lllIIlIIllIIll[8] = (0x5F ^ 0x59);
        GuiMerchant.lllIIlIIllIIll[9] = (0xFFFFFB7D & 0x4044C2);
        GuiMerchant.lllIIlIIllIIll[10] = (0x1 ^ 0x9);
        GuiMerchant.lllIIlIIllIIll[11] = (0x72 ^ 0x12);
        GuiMerchant.lllIIlIIllIIll[12] = (0x21 ^ 0x27 ^ (0x4D ^ 0x18));
        GuiMerchant.lllIIlIIllIIll[13] = (0x1F ^ 0x3E ^ (0x70 ^ 0x44));
        GuiMerchant.lllIIlIIllIIll[14] = (0xC ^ 0x4D) + (102 + 178 - 188 + 116) - (0xF1 ^ 0xA5) + (0x82 ^ 0x95);
        GuiMerchant.lllIIlIIllIIll[15] = (0xDD ^ 0xC1);
        GuiMerchant.lllIIlIIllIIll[16] = (0xB1 ^ 0x82);
        GuiMerchant.lllIIlIIllIIll[17] = (216 + 154 - 348 + 229 ^ 100 + 33 - 74 + 138);
        GuiMerchant.lllIIlIIllIIll[18] = (0x8E ^ 0x9E);
        GuiMerchant.lllIIlIIllIIll[19] = "   ".length();
        GuiMerchant.lllIIlIIllIIll[20] = (0x8A ^ 0xAA ^ (0x50 ^ 0x74));
    }
    
    private static boolean lIIlllllIlIIlIIl(final Object llllllllllllIlIllllIllIlIIIllllI, final Object llllllllllllIlIllllIllIlIIIlllIl) {
        return llllllllllllIlIllllIllIlIIIllllI == llllllllllllIlIllllIllIlIIIlllIl;
    }
    
    private static boolean lIIlllllIlIIlIlI(final int llllllllllllIlIllllIllIlIIlIlIII, final int llllllllllllIlIllllIllIlIIlIIlll) {
        return llllllllllllIlIllllIllIlIIlIlIII >= llllllllllllIlIllllIllIlIIlIIlll;
    }
    
    private static boolean lIIlllllIlIIllIl(final int llllllllllllIlIllllIllIlIIIllIIl) {
        return llllllllllllIlIllllIllIlIIIllIIl == 0;
    }
    
    static class MerchantButton extends GuiButton
    {
        private final /* synthetic */ boolean field_146157_o;
        private static final /* synthetic */ String[] lIlllllllIIIll;
        private static final /* synthetic */ int[] lIlllllllIIlII;
        
        private static boolean lIIIIllIIIIlIIlI(final int llllllllllllIllllIIIllllllIlIIII) {
            return llllllllllllIllllIIIllllllIlIIII == 0;
        }
        
        private static boolean lIIIIllIIIIIllll(final int llllllllllllIllllIIIllllllIlIIlI) {
            return llllllllllllIllllIIIllllllIlIIlI != 0;
        }
        
        static {
            lIIIIllIIIIIlllI();
            lIIIIllIIIIIllIl();
        }
        
        public MerchantButton(final int llllllllllllIllllIIlIIIIIIIIIIIl, final int llllllllllllIllllIIlIIIIIIIIIlIl, final int llllllllllllIllllIIIllllllllllll, final boolean llllllllllllIllllIIIlllllllllllI) {
            super(llllllllllllIllllIIlIIIIIIIIIIIl, llllllllllllIllllIIlIIIIIIIIIlIl, llllllllllllIllllIIIllllllllllll, MerchantButton.lIlllllllIIlII[0], MerchantButton.lIlllllllIIlII[1], MerchantButton.lIlllllllIIIll[MerchantButton.lIlllllllIIlII[2]]);
            this.field_146157_o = llllllllllllIllllIIIlllllllllllI;
        }
        
        private static void lIIIIllIIIIIllIl() {
            (lIlllllllIIIll = new String[MerchantButton.lIlllllllIIlII[3]])[MerchantButton.lIlllllllIIlII[2]] = lIIIIllIIIIIllII("MthHY0zoKdo=", "qRzya");
        }
        
        @Override
        public void drawButton(final Minecraft llllllllllllIllllIIIlllllllIlllI, final int llllllllllllIllllIIIlllllllIllIl, final int llllllllllllIllllIIIllllllllIIll) {
            if (lIIIIllIIIIIllll(this.visible ? 1 : 0)) {
                llllllllllllIllllIIIlllllllIlllI.getTextureManager().bindTexture(GuiMerchant.MERCHANT_GUI_TEXTURE);
                GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
                int n;
                if (lIIIIllIIIIlIIII(llllllllllllIllllIIIlllllllIllIl, this.xPosition) && lIIIIllIIIIlIIII(llllllllllllIllllIIIllllllllIIll, this.yPosition) && lIIIIllIIIIlIIIl(llllllllllllIllllIIIlllllllIllIl, this.xPosition + this.width) && lIIIIllIIIIlIIIl(llllllllllllIllllIIIllllllllIIll, this.yPosition + this.height)) {
                    n = MerchantButton.lIlllllllIIlII[3];
                    "".length();
                    if (-" ".length() > "  ".length()) {
                        return;
                    }
                }
                else {
                    n = MerchantButton.lIlllllllIIlII[2];
                }
                final boolean llllllllllllIllllIIIllllllllIIlI = n != 0;
                int llllllllllllIllllIIIllllllllIIIl = MerchantButton.lIlllllllIIlII[2];
                int llllllllllllIllllIIIllllllllIIII = MerchantButton.lIlllllllIIlII[4];
                if (lIIIIllIIIIlIIlI(this.enabled ? 1 : 0)) {
                    llllllllllllIllllIIIllllllllIIII += this.width * MerchantButton.lIlllllllIIlII[5];
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else if (lIIIIllIIIIIllll(llllllllllllIllllIIIllllllllIIlI ? 1 : 0)) {
                    llllllllllllIllllIIIllllllllIIII += this.width;
                }
                if (lIIIIllIIIIlIIlI(this.field_146157_o ? 1 : 0)) {
                    llllllllllllIllllIIIllllllllIIIl += this.height;
                }
                this.drawTexturedModalRect(this.xPosition, this.yPosition, llllllllllllIllllIIIllllllllIIII, llllllllllllIllllIIIllllllllIIIl, this.width, this.height);
            }
        }
        
        private static void lIIIIllIIIIIlllI() {
            (lIlllllllIIlII = new int[7])[0] = (0x44 ^ 0xB ^ (0x55 ^ 0x16));
            MerchantButton.lIlllllllIIlII[1] = (0x44 ^ 0x5B ^ (0x82 ^ 0x8E));
            MerchantButton.lIlllllllIIlII[2] = ((0x56 ^ 0x4D) & ~(0x27 ^ 0x3C));
            MerchantButton.lIlllllllIIlII[3] = " ".length();
            MerchantButton.lIlllllllIIlII[4] = 120 + 123 - 75 + 8;
            MerchantButton.lIlllllllIIlII[5] = "  ".length();
            MerchantButton.lIlllllllIIlII[6] = (0xB5 ^ 0xBD);
        }
        
        private static boolean lIIIIllIIIIlIIII(final int llllllllllllIllllIIIllllllIllIIl, final int llllllllllllIllllIIIllllllIllIII) {
            return llllllllllllIllllIIIllllllIllIIl >= llllllllllllIllllIIIllllllIllIII;
        }
        
        private static boolean lIIIIllIIIIlIIIl(final int llllllllllllIllllIIIllllllIlIlIl, final int llllllllllllIllllIIIllllllIlIlII) {
            return llllllllllllIllllIIIllllllIlIlIl < llllllllllllIllllIIIllllllIlIlII;
        }
        
        private static String lIIIIllIIIIIllII(final String llllllllllllIllllIIIllllllIlllll, final String llllllllllllIllllIIIlllllllIIIII) {
            try {
                final SecretKeySpec llllllllllllIllllIIIlllllllIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIIlllllllIIIII.getBytes(StandardCharsets.UTF_8)), MerchantButton.lIlllllllIIlII[6]), "DES");
                final Cipher llllllllllllIllllIIIlllllllIIIll = Cipher.getInstance("DES");
                llllllllllllIllllIIIlllllllIIIll.init(MerchantButton.lIlllllllIIlII[5], llllllllllllIllllIIIlllllllIIlII);
                return new String(llllllllllllIllllIIIlllllllIIIll.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIIllllllIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIllllIIIlllllllIIIlI) {
                llllllllllllIllllIIIlllllllIIIlI.printStackTrace();
                return null;
            }
        }
    }
}
