// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import java.util.List;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.enchantment.Enchantment;
import com.google.common.collect.Lists;
import java.io.IOException;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.world.World;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.EnchantmentNameParts;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraft.client.renderer.RenderHelper;
import org.lwjgl.util.glu.Project;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.inventory.ContainerEnchantment;
import net.minecraft.client.model.ModelBook;
import net.minecraft.world.IWorldNameable;
import net.minecraft.item.ItemStack;
import java.util.Random;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.client.gui.inventory.GuiContainer;

public class GuiEnchantment extends GuiContainer
{
    public /* synthetic */ float field_147076_A;
    private final /* synthetic */ InventoryPlayer playerInventory;
    public /* synthetic */ int field_147073_u;
    public /* synthetic */ float field_147071_v;
    private static final /* synthetic */ ResourceLocation ENCHANTMENT_TABLE_GUI_TEXTURE;
    public /* synthetic */ float field_147069_w;
    public /* synthetic */ float field_147082_x;
    private /* synthetic */ Random random;
    public /* synthetic */ float field_147080_z;
    public /* synthetic */ float field_147081_y;
    /* synthetic */ ItemStack field_147077_B;
    private final /* synthetic */ IWorldNameable field_175380_I;
    private static final /* synthetic */ String[] llIlIIlIlIlllI;
    private static final /* synthetic */ ModelBook MODEL_BOOK;
    private static final /* synthetic */ ResourceLocation ENCHANTMENT_TABLE_BOOK_TEXTURE;
    private static final /* synthetic */ int[] llIlIIlIllIlIl;
    private /* synthetic */ ContainerEnchantment container;
    
    @Override
    protected void drawGuiContainerBackgroundLayer(final float llllllllllllIllIllIIIIlIIIIlIllI, final int llllllllllllIllIllIIIIlIIIlIllIl, final int llllllllllllIllIllIIIIlIIIlIllII) {
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.getTextureManager().bindTexture(GuiEnchantment.ENCHANTMENT_TABLE_GUI_TEXTURE);
        final int llllllllllllIllIllIIIIlIIIlIlIll = (this.width - this.xSize) / GuiEnchantment.llIlIIlIllIlIl[7];
        final int llllllllllllIllIllIIIIlIIIlIlIlI = (this.height - this.ySize) / GuiEnchantment.llIlIIlIllIlIl[7];
        this.drawTexturedModalRect(llllllllllllIllIllIIIIlIIIlIlIll, llllllllllllIllIllIIIIlIIIlIlIlI, GuiEnchantment.llIlIIlIllIlIl[0], GuiEnchantment.llIlIIlIllIlIl[0], this.xSize, this.ySize);
        GlStateManager.pushMatrix();
        GlStateManager.matrixMode(GuiEnchantment.llIlIIlIllIlIl[13]);
        GlStateManager.pushMatrix();
        GlStateManager.loadIdentity();
        final ScaledResolution llllllllllllIllIllIIIIlIIIlIlIIl = new ScaledResolution(this.mc);
        GlStateManager.viewport((llllllllllllIllIllIIIIlIIIlIlIIl.getScaledWidth() - GuiEnchantment.llIlIIlIllIlIl[14]) / GuiEnchantment.llIlIIlIllIlIl[7] * llllllllllllIllIllIIIIlIIIlIlIIl.getScaleFactor(), (llllllllllllIllIllIIIIlIIIlIlIIl.getScaledHeight() - GuiEnchantment.llIlIIlIllIlIl[15]) / GuiEnchantment.llIlIIlIllIlIl[7] * llllllllllllIllIllIIIIlIIIlIlIIl.getScaleFactor(), GuiEnchantment.llIlIIlIllIlIl[14] * llllllllllllIllIllIIIIlIIIlIlIIl.getScaleFactor(), GuiEnchantment.llIlIIlIllIlIl[15] * llllllllllllIllIllIIIIlIIIlIlIIl.getScaleFactor());
        GlStateManager.translate(-0.34f, 0.23f, 0.0f);
        Project.gluPerspective(90.0f, 1.3333334f, 9.0f, 80.0f);
        final float llllllllllllIllIllIIIIlIIIlIlIII = 1.0f;
        GlStateManager.matrixMode(GuiEnchantment.llIlIIlIllIlIl[16]);
        GlStateManager.loadIdentity();
        RenderHelper.enableStandardItemLighting();
        GlStateManager.translate(0.0f, 3.3f, -16.0f);
        GlStateManager.scale(llllllllllllIllIllIIIIlIIIlIlIII, llllllllllllIllIllIIIIlIIIlIlIII, llllllllllllIllIllIIIIlIIIlIlIII);
        final float llllllllllllIllIllIIIIlIIIlIIlll = 5.0f;
        GlStateManager.scale(llllllllllllIllIllIIIIlIIIlIIlll, llllllllllllIllIllIIIIlIIIlIIlll, llllllllllllIllIllIIIIlIIIlIIlll);
        GlStateManager.rotate(180.0f, 0.0f, 0.0f, 1.0f);
        this.mc.getTextureManager().bindTexture(GuiEnchantment.ENCHANTMENT_TABLE_BOOK_TEXTURE);
        GlStateManager.rotate(20.0f, 1.0f, 0.0f, 0.0f);
        final float llllllllllllIllIllIIIIlIIIlIIllI = this.field_147076_A + (this.field_147080_z - this.field_147076_A) * llllllllllllIllIllIIIIlIIIIlIllI;
        GlStateManager.translate((1.0f - llllllllllllIllIllIIIIlIIIlIIllI) * 0.2f, (1.0f - llllllllllllIllIllIIIIlIIIlIIllI) * 0.1f, (1.0f - llllllllllllIllIllIIIIlIIIlIIllI) * 0.25f);
        GlStateManager.rotate(-(1.0f - llllllllllllIllIllIIIIlIIIlIIllI) * 90.0f - 90.0f, 0.0f, 1.0f, 0.0f);
        GlStateManager.rotate(180.0f, 1.0f, 0.0f, 0.0f);
        float llllllllllllIllIllIIIIlIIIlIIlIl = this.field_147069_w + (this.field_147071_v - this.field_147069_w) * llllllllllllIllIllIIIIlIIIIlIllI + 0.25f;
        float llllllllllllIllIllIIIIlIIIlIIlII = this.field_147069_w + (this.field_147071_v - this.field_147069_w) * llllllllllllIllIllIIIIlIIIIlIllI + 0.75f;
        llllllllllllIllIllIIIIlIIIlIIlIl = (llllllllllllIllIllIIIIlIIIlIIlIl - MathHelper.truncateDoubleToInt(llllllllllllIllIllIIIIlIIIlIIlIl)) * 1.6f - 0.3f;
        llllllllllllIllIllIIIIlIIIlIIlII = (llllllllllllIllIllIIIIlIIIlIIlII - MathHelper.truncateDoubleToInt(llllllllllllIllIllIIIIlIIIlIIlII)) * 1.6f - 0.3f;
        if (lIIlIIlIlIlIlIll(lIIlIIlIlIlIlIIl(llllllllllllIllIllIIIIlIIIlIIlIl, 0.0f))) {
            llllllllllllIllIllIIIIlIIIlIIlIl = 0.0f;
        }
        if (lIIlIIlIlIlIlIll(lIIlIIlIlIlIlIIl(llllllllllllIllIllIIIIlIIIlIIlII, 0.0f))) {
            llllllllllllIllIllIIIIlIIIlIIlII = 0.0f;
        }
        if (lIIlIIlIlIlIllII(lIIlIIlIlIlIlIlI(llllllllllllIllIllIIIIlIIIlIIlIl, 1.0f))) {
            llllllllllllIllIllIIIIlIIIlIIlIl = 1.0f;
        }
        if (lIIlIIlIlIlIllII(lIIlIIlIlIlIlIlI(llllllllllllIllIllIIIIlIIIlIIlII, 1.0f))) {
            llllllllllllIllIllIIIIlIIIlIIlII = 1.0f;
        }
        GlStateManager.enableRescaleNormal();
        GuiEnchantment.MODEL_BOOK.render(null, 0.0f, llllllllllllIllIllIIIIlIIIlIIlIl, llllllllllllIllIllIIIIlIIIlIIlII, llllllllllllIllIllIIIIlIIIlIIllI, 0.0f, 0.0625f);
        GlStateManager.disableRescaleNormal();
        RenderHelper.disableStandardItemLighting();
        GlStateManager.matrixMode(GuiEnchantment.llIlIIlIllIlIl[13]);
        GlStateManager.viewport(GuiEnchantment.llIlIIlIllIlIl[0], GuiEnchantment.llIlIIlIllIlIl[0], this.mc.displayWidth, this.mc.displayHeight);
        GlStateManager.popMatrix();
        GlStateManager.matrixMode(GuiEnchantment.llIlIIlIllIlIl[16]);
        GlStateManager.popMatrix();
        RenderHelper.disableStandardItemLighting();
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        EnchantmentNameParts.getInstance().reseedRandomGenerator(this.container.xpSeed);
        final int llllllllllllIllIllIIIIlIIIlIIIll = this.container.getLapisAmount();
        int llllllllllllIllIllIIIIlIIIlIIIlI = GuiEnchantment.llIlIIlIllIlIl[0];
        "".length();
        if ((0x16 ^ 0x33 ^ (0xC ^ 0x2D)) != (0x8B ^ 0x97 ^ (0x90 ^ 0x88))) {
            return;
        }
        while (!lIIlIIlIlIlIlIII(llllllllllllIllIllIIIIlIIIlIIIlI, GuiEnchantment.llIlIIlIllIlIl[12])) {
            final int llllllllllllIllIllIIIIlIIIlIIIIl = llllllllllllIllIllIIIIlIIIlIlIll + GuiEnchantment.llIlIIlIllIlIl[8];
            final int llllllllllllIllIllIIIIlIIIlIIIII = llllllllllllIllIllIIIIlIIIlIIIIl + GuiEnchantment.llIlIIlIllIlIl[17];
            final int llllllllllllIllIllIIIIlIIIIlllll = GuiEnchantment.llIlIIlIllIlIl[18];
            final String llllllllllllIllIllIIIIlIIIIllllI = EnchantmentNameParts.getInstance().generateNewRandomName();
            this.zLevel = 0.0f;
            this.mc.getTextureManager().bindTexture(GuiEnchantment.ENCHANTMENT_TABLE_GUI_TEXTURE);
            final int llllllllllllIllIllIIIIlIIIIlllIl = this.container.enchantLevels[llllllllllllIllIllIIIIlIIIlIIIlI];
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            if (lIIlIIlIlIlIllIl(llllllllllllIllIllIIIIlIIIIlllIl)) {
                this.drawTexturedModalRect(llllllllllllIllIllIIIIlIIIlIIIIl, llllllllllllIllIllIIIIlIIIlIlIlI + GuiEnchantment.llIlIIlIllIlIl[9] + GuiEnchantment.llIlIIlIllIlIl[10] * llllllllllllIllIllIIIIlIIIlIIIlI, GuiEnchantment.llIlIIlIllIlIl[0], GuiEnchantment.llIlIIlIllIlIl[19], GuiEnchantment.llIlIIlIllIlIl[11], GuiEnchantment.llIlIIlIllIlIl[10]);
                "".length();
                if (" ".length() <= ((0xA5 ^ 0xA1 ^ (0xA ^ 0x1B)) & (98 + 24 - 18 + 65 ^ 138 + 63 - 183 + 170 ^ -" ".length()))) {
                    return;
                }
            }
            else {
                final String llllllllllllIllIllIIIIlIIIIlllII = String.valueOf(new StringBuilder().append(llllllllllllIllIllIIIIlIIIIlllIl));
                FontRenderer llllllllllllIllIllIIIIlIIIIllIll = this.mc.standardGalacticFontRenderer;
                int llllllllllllIllIllIIIIlIIIIllIlI = GuiEnchantment.llIlIIlIllIlIl[20];
                if ((!lIIlIIlIlIlIlIII(llllllllllllIllIllIIIIlIIIlIIIll, llllllllllllIllIllIIIIlIIIlIIIlI + GuiEnchantment.llIlIIlIllIlIl[1]) || lIIlIIlIlIlIIllI(this.mc.thePlayer.experienceLevel, llllllllllllIllIllIIIIlIIIIlllIl)) && lIIlIIlIlIlIllIl(this.mc.thePlayer.capabilities.isCreativeMode ? 1 : 0)) {
                    this.drawTexturedModalRect(llllllllllllIllIllIIIIlIIIlIIIIl, llllllllllllIllIllIIIIlIIIlIlIlI + GuiEnchantment.llIlIIlIllIlIl[9] + GuiEnchantment.llIlIIlIllIlIl[10] * llllllllllllIllIllIIIIlIIIlIIIlI, GuiEnchantment.llIlIIlIllIlIl[0], GuiEnchantment.llIlIIlIllIlIl[19], GuiEnchantment.llIlIIlIllIlIl[11], GuiEnchantment.llIlIIlIllIlIl[10]);
                    this.drawTexturedModalRect(llllllllllllIllIllIIIIlIIIlIIIIl + GuiEnchantment.llIlIIlIllIlIl[1], llllllllllllIllIllIIIIlIIIlIlIlI + GuiEnchantment.llIlIIlIllIlIl[21] + GuiEnchantment.llIlIIlIllIlIl[10] * llllllllllllIllIllIIIIlIIIlIIIlI, GuiEnchantment.llIlIIlIllIlIl[22] * llllllllllllIllIllIIIIlIIIlIIIlI, GuiEnchantment.llIlIIlIllIlIl[23], GuiEnchantment.llIlIIlIllIlIl[22], GuiEnchantment.llIlIIlIllIlIl[22]);
                    llllllllllllIllIllIIIIlIIIIllIll.drawSplitString(llllllllllllIllIllIIIIlIIIIllllI, llllllllllllIllIllIIIIlIIIlIIIII, llllllllllllIllIllIIIIlIIIlIlIlI + GuiEnchantment.llIlIIlIllIlIl[22] + GuiEnchantment.llIlIIlIllIlIl[10] * llllllllllllIllIllIIIIlIIIlIIIlI, llllllllllllIllIllIIIIlIIIIlllll, (llllllllllllIllIllIIIIlIIIIllIlI & GuiEnchantment.llIlIIlIllIlIl[24]) >> GuiEnchantment.llIlIIlIllIlIl[1]);
                    llllllllllllIllIllIIIIlIIIIllIlI = GuiEnchantment.llIlIIlIllIlIl[25];
                    "".length();
                    if (" ".length() > "  ".length()) {
                        return;
                    }
                }
                else {
                    final int llllllllllllIllIllIIIIlIIIIllIIl = llllllllllllIllIllIIIIlIIIlIllIl - (llllllllllllIllIllIIIIlIIIlIlIll + GuiEnchantment.llIlIIlIllIlIl[8]);
                    final int llllllllllllIllIllIIIIlIIIIllIII = llllllllllllIllIllIIIIlIIIlIllII - (llllllllllllIllIllIIIIlIIIlIlIlI + GuiEnchantment.llIlIIlIllIlIl[9] + GuiEnchantment.llIlIIlIllIlIl[10] * llllllllllllIllIllIIIIlIIIlIIIlI);
                    if (lIIlIIlIlIlIIlIl(llllllllllllIllIllIIIIlIIIIllIIl) && lIIlIIlIlIlIIlIl(llllllllllllIllIllIIIIlIIIIllIII) && lIIlIIlIlIlIIllI(llllllllllllIllIllIIIIlIIIIllIIl, GuiEnchantment.llIlIIlIllIlIl[11]) && lIIlIIlIlIlIIllI(llllllllllllIllIllIIIIlIIIIllIII, GuiEnchantment.llIlIIlIllIlIl[10])) {
                        this.drawTexturedModalRect(llllllllllllIllIllIIIIlIIIlIIIIl, llllllllllllIllIllIIIIlIIIlIlIlI + GuiEnchantment.llIlIIlIllIlIl[9] + GuiEnchantment.llIlIIlIllIlIl[10] * llllllllllllIllIllIIIIlIIIlIIIlI, GuiEnchantment.llIlIIlIllIlIl[0], GuiEnchantment.llIlIIlIllIlIl[26], GuiEnchantment.llIlIIlIllIlIl[11], GuiEnchantment.llIlIIlIllIlIl[10]);
                        llllllllllllIllIllIIIIlIIIIllIlI = GuiEnchantment.llIlIIlIllIlIl[27];
                        "".length();
                        if (null != null) {
                            return;
                        }
                    }
                    else {
                        this.drawTexturedModalRect(llllllllllllIllIllIIIIlIIIlIIIIl, llllllllllllIllIllIIIIlIIIlIlIlI + GuiEnchantment.llIlIIlIllIlIl[9] + GuiEnchantment.llIlIIlIllIlIl[10] * llllllllllllIllIllIIIIlIIIlIIIlI, GuiEnchantment.llIlIIlIllIlIl[0], GuiEnchantment.llIlIIlIllIlIl[28], GuiEnchantment.llIlIIlIllIlIl[11], GuiEnchantment.llIlIIlIllIlIl[10]);
                    }
                    this.drawTexturedModalRect(llllllllllllIllIllIIIIlIIIlIIIIl + GuiEnchantment.llIlIIlIllIlIl[1], llllllllllllIllIllIIIIlIIIlIlIlI + GuiEnchantment.llIlIIlIllIlIl[21] + GuiEnchantment.llIlIIlIllIlIl[10] * llllllllllllIllIllIIIIlIIIlIIIlI, GuiEnchantment.llIlIIlIllIlIl[22] * llllllllllllIllIllIIIIlIIIlIIIlI, GuiEnchantment.llIlIIlIllIlIl[29], GuiEnchantment.llIlIIlIllIlIl[22], GuiEnchantment.llIlIIlIllIlIl[22]);
                    llllllllllllIllIllIIIIlIIIIllIll.drawSplitString(llllllllllllIllIllIIIIlIIIIllllI, llllllllllllIllIllIIIIlIIIlIIIII, llllllllllllIllIllIIIIlIIIlIlIlI + GuiEnchantment.llIlIIlIllIlIl[22] + GuiEnchantment.llIlIIlIllIlIl[10] * llllllllllllIllIllIIIIlIIIlIIIlI, llllllllllllIllIllIIIIlIIIIlllll, llllllllllllIllIllIIIIlIIIIllIlI);
                    llllllllllllIllIllIIIIlIIIIllIlI = GuiEnchantment.llIlIIlIllIlIl[30];
                }
                llllllllllllIllIllIIIIlIIIIllIll = this.mc.fontRendererObj;
                llllllllllllIllIllIIIIlIIIIllIll.drawStringWithShadow(llllllllllllIllIllIIIIlIIIIlllII, (float)(llllllllllllIllIllIIIIlIIIlIIIII + GuiEnchantment.llIlIIlIllIlIl[18] - llllllllllllIllIllIIIIlIIIIllIll.getStringWidth(llllllllllllIllIllIIIIlIIIIlllII)), (float)(llllllllllllIllIllIIIIlIIIlIlIlI + GuiEnchantment.llIlIIlIllIlIl[22] + GuiEnchantment.llIlIIlIllIlIl[10] * llllllllllllIllIllIIIIlIIIlIIIlI + GuiEnchantment.llIlIIlIllIlIl[31]), llllllllllllIllIllIIIIlIIIIllIlI);
                "".length();
            }
            ++llllllllllllIllIllIIIIlIIIlIIIlI;
        }
    }
    
    private static String lIIlIIlIlIIlIIll(final String llllllllllllIllIllIIIIIlllIIIIIl, final String llllllllllllIllIllIIIIIlllIIIIII) {
        try {
            final SecretKeySpec llllllllllllIllIllIIIIIlllIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIIIIIlllIIIIII.getBytes(StandardCharsets.UTF_8)), GuiEnchantment.llIlIIlIllIlIl[5]), "DES");
            final Cipher llllllllllllIllIllIIIIIlllIIIlIl = Cipher.getInstance("DES");
            llllllllllllIllIllIIIIIlllIIIlIl.init(GuiEnchantment.llIlIIlIllIlIl[7], llllllllllllIllIllIIIIIlllIIIllI);
            return new String(llllllllllllIllIllIIIIIlllIIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIIIIIlllIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllIIIIIlllIIIlII) {
            llllllllllllIllIllIIIIIlllIIIlII.printStackTrace();
            return null;
        }
    }
    
    public void func_147068_g() {
        final ItemStack llllllllllllIllIllIIIIIlllIlIlII = this.inventorySlots.getSlot(GuiEnchantment.llIlIIlIllIlIl[0]).getStack();
        if (lIIlIIlIlIlIllIl(ItemStack.areItemStacksEqual(llllllllllllIllIllIIIIIlllIlIlII, this.field_147077_B) ? 1 : 0)) {
            this.field_147077_B = llllllllllllIllIllIIIIIlllIlIlII;
            do {
                this.field_147082_x += this.random.nextInt(GuiEnchantment.llIlIIlIllIlIl[35]) - this.random.nextInt(GuiEnchantment.llIlIIlIllIlIl[35]);
            } while (lIIlIIlIlIllIIlI(lIIlIIlIlIllIIII(this.field_147071_v, this.field_147082_x + 1.0f)) && !lIIlIIlIlIlIlIll(lIIlIIlIlIllIIIl(this.field_147071_v, this.field_147082_x - 1.0f)));
        }
        this.field_147073_u += GuiEnchantment.llIlIIlIllIlIl[1];
        this.field_147069_w = this.field_147071_v;
        this.field_147076_A = this.field_147080_z;
        boolean llllllllllllIllIllIIIIIlllIlIIll = GuiEnchantment.llIlIIlIllIlIl[0] != 0;
        int llllllllllllIllIllIIIIIlllIlIIlI = GuiEnchantment.llIlIIlIllIlIl[0];
        "".length();
        if (null != null) {
            return;
        }
        while (!lIIlIIlIlIlIlIII(llllllllllllIllIllIIIIIlllIlIIlI, GuiEnchantment.llIlIIlIllIlIl[12])) {
            if (lIIlIIlIlIlIIlll(this.container.enchantLevels[llllllllllllIllIllIIIIIlllIlIIlI])) {
                llllllllllllIllIllIIIIIlllIlIIll = (GuiEnchantment.llIlIIlIllIlIl[1] != 0);
            }
            ++llllllllllllIllIllIIIIIlllIlIIlI;
        }
        if (lIIlIIlIlIlIIlll(llllllllllllIllIllIIIIIlllIlIIll ? 1 : 0)) {
            this.field_147080_z += 0.2f;
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        }
        else {
            this.field_147080_z -= 0.2f;
        }
        this.field_147080_z = MathHelper.clamp_float(this.field_147080_z, 0.0f, 1.0f);
        float llllllllllllIllIllIIIIIlllIlIIIl = (this.field_147082_x - this.field_147071_v) * 0.4f;
        final float llllllllllllIllIllIIIIIlllIlIIII = 0.2f;
        llllllllllllIllIllIIIIIlllIlIIIl = MathHelper.clamp_float(llllllllllllIllIllIIIIIlllIlIIIl, -llllllllllllIllIllIIIIIlllIlIIII, llllllllllllIllIllIIIIIlllIlIIII);
        this.field_147081_y += (llllllllllllIllIllIIIIIlllIlIIIl - this.field_147081_y) * 0.9f;
        this.field_147071_v += this.field_147081_y;
    }
    
    private static boolean lIIlIIlIlIlIlllI(final Object llllllllllllIllIllIIIIIllIIIlIll) {
        return llllllllllllIllIllIIIIIllIIIlIll != null;
    }
    
    private static int lIIlIIlIlIlIlIlI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static String lIIlIIlIlIIlIlII(final String llllllllllllIllIllIIIIIllIllIlII, final String llllllllllllIllIllIIIIIllIllIIll) {
        try {
            final SecretKeySpec llllllllllllIllIllIIIIIllIlllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIIIIIllIllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIllIIIIIllIlllIII = Cipher.getInstance("Blowfish");
            llllllllllllIllIllIIIIIllIlllIII.init(GuiEnchantment.llIlIIlIllIlIl[7], llllllllllllIllIllIIIIIllIlllIIl);
            return new String(llllllllllllIllIllIIIIIllIlllIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIIIIIllIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllIIIIIllIllIlll) {
            llllllllllllIllIllIIIIIllIllIlll.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected void drawGuiContainerForegroundLayer(final int llllllllllllIllIllIIIIlIIllIlIII, final int llllllllllllIllIllIIIIlIIllIIlll) {
        this.fontRendererObj.drawString(this.field_175380_I.getDisplayName().getUnformattedText(), GuiEnchantment.llIlIIlIllIlIl[2], GuiEnchantment.llIlIIlIllIlIl[3], GuiEnchantment.llIlIIlIllIlIl[4]);
        "".length();
        this.fontRendererObj.drawString(this.playerInventory.getDisplayName().getUnformattedText(), GuiEnchantment.llIlIIlIllIlIl[5], this.ySize - GuiEnchantment.llIlIIlIllIlIl[6] + GuiEnchantment.llIlIIlIllIlIl[7], GuiEnchantment.llIlIIlIllIlIl[4]);
        "".length();
    }
    
    private static boolean lIIlIIlIlIlIlIll(final int llllllllllllIllIllIIIIIllIIIIIll) {
        return llllllllllllIllIllIIIIIllIIIIIll < 0;
    }
    
    static {
        lIIlIIlIlIlIIlII();
        lIIlIIlIlIIllIII();
        ENCHANTMENT_TABLE_GUI_TEXTURE = new ResourceLocation(GuiEnchantment.llIlIIlIlIlllI[GuiEnchantment.llIlIIlIllIlIl[0]]);
        ENCHANTMENT_TABLE_BOOK_TEXTURE = new ResourceLocation(GuiEnchantment.llIlIIlIlIlllI[GuiEnchantment.llIlIIlIllIlIl[1]]);
        MODEL_BOOK = new ModelBook();
    }
    
    private static int lIIlIIlIlIlIlIIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static int lIIlIIlIlIllIIIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean lIIlIIlIlIllIIlI(final int llllllllllllIllIllIIIIIllIIIIIIl) {
        return llllllllllllIllIllIIIIIllIIIIIIl <= 0;
    }
    
    private static void lIIlIIlIlIIllIII() {
        (llIlIIlIlIlllI = new String[GuiEnchantment.llIlIIlIllIlIl[38]])[GuiEnchantment.llIlIIlIllIlIl[0]] = lIIlIIlIlIIlIIll("jntGCa63IZWKNqy3YtxRN+xBwH9NxL6BsuZ9zOWM/V4b0u3yqdu+tqtYqkE35YdU", "cCnLy");
        GuiEnchantment.llIlIIlIlIlllI[GuiEnchantment.llIlIIlIllIlIl[1]] = lIIlIIlIlIIlIIll("K8aFzPwVI77davO/0h9bXx0V1spHX0j077HYIJdgjX2e64K5NXk2hLw/mh5Wre1S", "wzBIN");
        GuiEnchantment.llIlIIlIlIlllI[GuiEnchantment.llIlIIlIllIlIl[7]] = lIIlIIlIlIIlIIll("lQBhJpHn/M3OMkFo0L6KIngSXObCkje6", "BguXt");
        GuiEnchantment.llIlIIlIlIlllI[GuiEnchantment.llIlIIlIllIlIl[12]] = lIIlIIlIlIIlIlII("7hxiH8RXJdU=", "IEGpb");
        GuiEnchantment.llIlIIlIlIlllI[GuiEnchantment.llIlIIlIllIlIl[35]] = lIIlIIlIlIIlIlII("BlLzo53MX9x+IFAwd+cK29aClcwPSIww", "kwawq");
        GuiEnchantment.llIlIIlIlIlllI[GuiEnchantment.llIlIIlIllIlIl[3]] = lIIlIIlIlIIlIIll("05Vi88smD1M=", "jLcMD");
        GuiEnchantment.llIlIIlIlIlllI[GuiEnchantment.llIlIIlIllIlIl[36]] = lIIlIIlIlIIlIllI("KwYHIBkhBwwmVi0HCjwZJh1HOBk4ABp6FyYM", "HiiTx");
        GuiEnchantment.llIlIIlIlIlllI[GuiEnchantment.llIlIIlIllIlIl[31]] = lIIlIIlIlIIlIIll("MRLOffvgJko+ZlSwPlXE4L1aFyrzLEBEtargwG5Omp4=", "OrShg");
        GuiEnchantment.llIlIIlIlIlllI[GuiEnchantment.llIlIIlIllIlIl[5]] = lIIlIIlIlIIlIlII("vg2vG6UZ+rqIhYUTOcdhMqMu0ZHUJe+ykC9EyPA8Rrk=", "SuRZG");
        GuiEnchantment.llIlIIlIlIlllI[GuiEnchantment.llIlIIlIllIlIl[37]] = lIIlIIlIlIIlIlII("rimx12WiHqVxvtd8PoYQ5qvEBsZbQVDb6BvOGk06QKI=", "OTSDs");
    }
    
    private static boolean lIIlIIlIlIlIIlll(final int llllllllllllIllIllIIIIIllIIIlIIl) {
        return llllllllllllIllIllIIIIIllIIIlIIl != 0;
    }
    
    private static String lIIlIIlIlIIlIllI(String llllllllllllIllIllIIIIIllIlIIIIl, final String llllllllllllIllIllIIIIIllIlIIIII) {
        llllllllllllIllIllIIIIIllIlIIIIl = new String(Base64.getDecoder().decode(llllllllllllIllIllIIIIIllIlIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIllIIIIIllIlIIlII = new StringBuilder();
        final char[] llllllllllllIllIllIIIIIllIlIIIll = llllllllllllIllIllIIIIIllIlIIIII.toCharArray();
        int llllllllllllIllIllIIIIIllIlIIIlI = GuiEnchantment.llIlIIlIllIlIl[0];
        final short llllllllllllIllIllIIIIIllIIlllII = (Object)llllllllllllIllIllIIIIIllIlIIIIl.toCharArray();
        final char llllllllllllIllIllIIIIIllIIllIll = (char)llllllllllllIllIllIIIIIllIIlllII.length;
        String llllllllllllIllIllIIIIIllIIllIlI = (String)GuiEnchantment.llIlIIlIllIlIl[0];
        while (lIIlIIlIlIlIIllI((int)llllllllllllIllIllIIIIIllIIllIlI, llllllllllllIllIllIIIIIllIIllIll)) {
            final char llllllllllllIllIllIIIIIllIlIIlll = llllllllllllIllIllIIIIIllIIlllII[llllllllllllIllIllIIIIIllIIllIlI];
            llllllllllllIllIllIIIIIllIlIIlII.append((char)(llllllllllllIllIllIIIIIllIlIIlll ^ llllllllllllIllIllIIIIIllIlIIIll[llllllllllllIllIllIIIIIllIlIIIlI % llllllllllllIllIllIIIIIllIlIIIll.length]));
            "".length();
            ++llllllllllllIllIllIIIIIllIlIIIlI;
            ++llllllllllllIllIllIIIIIllIIllIlI;
            "".length();
            if ((0x14 ^ 0x10) < -" ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIllIIIIIllIlIIlII);
    }
    
    private static boolean lIIlIIlIlIlIIllI(final int llllllllllllIllIllIIIIIllIIIlllI, final int llllllllllllIllIllIIIIIllIIIllIl) {
        return llllllllllllIllIllIIIIIllIIIlllI < llllllllllllIllIllIIIIIllIIIllIl;
    }
    
    public GuiEnchantment(final InventoryPlayer llllllllllllIllIllIIIIlIIlllIIIl, final World llllllllllllIllIllIIIIlIIllIllII, final IWorldNameable llllllllllllIllIllIIIIlIIllIlIll) {
        super(new ContainerEnchantment(llllllllllllIllIllIIIIlIIlllIIIl, llllllllllllIllIllIIIIlIIllIllII));
        this.random = new Random();
        this.playerInventory = llllllllllllIllIllIIIIlIIlllIIIl;
        this.container = (ContainerEnchantment)this.inventorySlots;
        this.field_175380_I = llllllllllllIllIllIIIIlIIllIlIll;
    }
    
    private static boolean lIIlIIlIlIlIIlIl(final int llllllllllllIllIllIIIIIllIIIIlIl) {
        return llllllllllllIllIllIIIIIllIIIIlIl >= 0;
    }
    
    private static void lIIlIIlIlIlIIlII() {
        (llIlIIlIllIlIl = new int[39])[0] = ((0xEF ^ 0x8D ^ (0xB ^ 0x78)) & (3 + 79 + 49 + 47 ^ 86 + 111 - 134 + 100 ^ -" ".length()));
        GuiEnchantment.llIlIIlIllIlIl[1] = " ".length();
        GuiEnchantment.llIlIIlIllIlIl[2] = (0xCC ^ 0xC0);
        GuiEnchantment.llIlIIlIllIlIl[3] = (30 + 133 - 61 + 51 ^ 141 + 58 - 70 + 27);
        GuiEnchantment.llIlIIlIllIlIl[4] = (-(0xFFFFBFF3 & 0x7EBD) & (0xFFFFFEFD & 0x407FF2));
        GuiEnchantment.llIlIIlIllIlIl[5] = (0x8C ^ 0xAD ^ (0xE9 ^ 0xC0));
        GuiEnchantment.llIlIIlIllIlIl[6] = (0x56 ^ 0x36);
        GuiEnchantment.llIlIIlIllIlIl[7] = "  ".length();
        GuiEnchantment.llIlIIlIllIlIl[8] = (0x57 ^ 0x19 ^ (0xF1 ^ 0x83));
        GuiEnchantment.llIlIIlIllIlIl[9] = (0x43 ^ 0x71 ^ (0xA8 ^ 0x94));
        GuiEnchantment.llIlIIlIllIlIl[10] = (0x8 ^ 0x1B);
        GuiEnchantment.llIlIIlIllIlIl[11] = (0x5F ^ 0x40 ^ (0x6C ^ 0x1F));
        GuiEnchantment.llIlIIlIllIlIl[12] = "   ".length();
        GuiEnchantment.llIlIIlIllIlIl[13] = (-(0xFFFFBEFD & 0x49A7) & (0xFFFFDFF5 & 0x3FAF));
        GuiEnchantment.llIlIIlIllIlIl[14] = (-(0xFFFFDEBF & 0x2F6B) & (0xFFFFEFEE & 0x1F7B));
        GuiEnchantment.llIlIIlIllIlIl[15] = (0x64 ^ 0x5) + (18 + 114 - 51 + 105) - (0xFFFFEDFF & 0x1314) + (21 + 163 - 22 + 71);
        GuiEnchantment.llIlIIlIllIlIl[16] = (0xFFFF9FA8 & 0x7757);
        GuiEnchantment.llIlIIlIllIlIl[17] = (0x3A ^ 0x2E);
        GuiEnchantment.llIlIIlIllIlIl[18] = (0x30 ^ 0x62 ^ (0xB5 ^ 0xB1));
        GuiEnchantment.llIlIIlIllIlIl[19] = (0x83 ^ 0x85) + (11 + 82 + 31 + 55) - (36 + 2 + 84 + 56) + (87 + 0 - 70 + 161);
        GuiEnchantment.llIlIIlIllIlIl[20] = (-(131 + 158 - 160 + 37) & (0xFFFFFFEF & 0x685EFF));
        GuiEnchantment.llIlIIlIllIlIl[21] = (0xF5 ^ 0xC1 ^ (0x6E ^ 0x55));
        GuiEnchantment.llIlIIlIllIlIl[22] = (0x84 ^ 0xAF ^ (0x2C ^ 0x17));
        GuiEnchantment.llIlIIlIllIlIl[23] = 137 + 114 - 47 + 35;
        GuiEnchantment.llIlIIlIllIlIl[24] = (0xFFFFFEFE & 0xFEFFFF);
        GuiEnchantment.llIlIIlIllIlIl[25] = (-(24 + 125 - 145 + 126) & (0xFFFFFFB9 & 0x407FD7));
        GuiEnchantment.llIlIIlIllIlIl[26] = (0x33 ^ 0x8) + (119 + 115 - 126 + 54) - (0x2E ^ 0xD) + (0x58 ^ 0x4A);
        GuiEnchantment.llIlIIlIllIlIl[27] = (-(0xA5 ^ 0x84) & (0xFFFFFFA8 & 0xFFFFF7));
        GuiEnchantment.llIlIIlIllIlIl[28] = ((0xB ^ 0x45) & ~(0xE4 ^ 0xAA)) + (0x87 ^ 0xAF) - -(0x2C ^ 0xF) + (0x2 ^ 0x59);
        GuiEnchantment.llIlIIlIllIlIl[29] = 57 + 110 - 132 + 188;
        GuiEnchantment.llIlIIlIllIlIl[30] = (0xFFFFFFA5 & 0x80FF7A);
        GuiEnchantment.llIlIIlIllIlIl[31] = (0x6C ^ 0x6B);
        GuiEnchantment.llIlIIlIllIlIl[32] = (0x40 ^ 0x51);
        GuiEnchantment.llIlIIlIllIlIl[33] = (0x12 ^ 0x7C) + (0x8B ^ 0xBB) - (0xFF ^ 0xAC) + (105 + 38 - 115 + 152);
        GuiEnchantment.llIlIIlIllIlIl[34] = (0xFFFFFFD2 & 0xFF2D);
        GuiEnchantment.llIlIIlIllIlIl[35] = (0x7C ^ 0x78);
        GuiEnchantment.llIlIIlIllIlIl[36] = (0x93 ^ 0x95);
        GuiEnchantment.llIlIIlIllIlIl[37] = (0x6F ^ 0x66);
        GuiEnchantment.llIlIIlIllIlIl[38] = (93 + 121 - 132 + 78 ^ 84 + 97 - 89 + 78);
    }
    
    @Override
    public void updateScreen() {
        super.updateScreen();
        this.func_147068_g();
    }
    
    @Override
    protected void mouseClicked(final int llllllllllllIllIllIIIIlIIlIIllll, final int llllllllllllIllIllIIIIlIIlIlIlll, final int llllllllllllIllIllIIIIlIIlIlIllI) throws IOException {
        super.mouseClicked(llllllllllllIllIllIIIIlIIlIIllll, llllllllllllIllIllIIIIlIIlIlIlll, llllllllllllIllIllIIIIlIIlIlIllI);
        final int llllllllllllIllIllIIIIlIIlIlIlIl = (this.width - this.xSize) / GuiEnchantment.llIlIIlIllIlIl[7];
        final int llllllllllllIllIllIIIIlIIlIlIlII = (this.height - this.ySize) / GuiEnchantment.llIlIIlIllIlIl[7];
        int llllllllllllIllIllIIIIlIIlIlIIll = GuiEnchantment.llIlIIlIllIlIl[0];
        "".length();
        if ((37 + 113 - 143 + 122 ^ 10 + 68 - 26 + 81) <= "  ".length()) {
            return;
        }
        while (!lIIlIIlIlIlIlIII(llllllllllllIllIllIIIIlIIlIlIIll, GuiEnchantment.llIlIIlIllIlIl[12])) {
            final int llllllllllllIllIllIIIIlIIlIlIIlI = llllllllllllIllIllIIIIlIIlIIllll - (llllllllllllIllIllIIIIlIIlIlIlIl + GuiEnchantment.llIlIIlIllIlIl[8]);
            final int llllllllllllIllIllIIIIlIIlIlIIIl = llllllllllllIllIllIIIIlIIlIlIlll - (llllllllllllIllIllIIIIlIIlIlIlII + GuiEnchantment.llIlIIlIllIlIl[9] + GuiEnchantment.llIlIIlIllIlIl[10] * llllllllllllIllIllIIIIlIIlIlIIll);
            if (lIIlIIlIlIlIIlIl(llllllllllllIllIllIIIIlIIlIlIIlI) && lIIlIIlIlIlIIlIl(llllllllllllIllIllIIIIlIIlIlIIIl) && lIIlIIlIlIlIIllI(llllllllllllIllIllIIIIlIIlIlIIlI, GuiEnchantment.llIlIIlIllIlIl[11]) && lIIlIIlIlIlIIllI(llllllllllllIllIllIIIIlIIlIlIIIl, GuiEnchantment.llIlIIlIllIlIl[10]) && lIIlIIlIlIlIIlll(this.container.enchantItem(this.mc.thePlayer, llllllllllllIllIllIIIIlIIlIlIIll) ? 1 : 0)) {
                this.mc.playerController.sendEnchantPacket(this.container.windowId, llllllllllllIllIllIIIIlIIlIlIIll);
            }
            ++llllllllllllIllIllIIIIlIIlIlIIll;
        }
    }
    
    private static boolean lIIlIIlIlIlIllll(final int llllllllllllIllIllIIIIIllIIlIllI, final int llllllllllllIllIllIIIIIllIIlIlIl) {
        return llllllllllllIllIllIIIIIllIIlIllI == llllllllllllIllIllIIIIIllIIlIlIl;
    }
    
    private static int lIIlIIlIlIllIIII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    @Override
    public void drawScreen(final int llllllllllllIllIllIIIIIlllllIIlI, final int llllllllllllIllIllIIIIIlllllIIIl, final float llllllllllllIllIllIIIIIlllllIIII) {
        super.drawScreen(llllllllllllIllIllIIIIIlllllIIlI, llllllllllllIllIllIIIIIlllllIIIl, llllllllllllIllIllIIIIIlllllIIII);
        final boolean llllllllllllIllIllIIIIIllllIllll = this.mc.thePlayer.capabilities.isCreativeMode;
        final int llllllllllllIllIllIIIIIllllIlllI = this.container.getLapisAmount();
        int llllllllllllIllIllIIIIIllllIllIl = GuiEnchantment.llIlIIlIllIlIl[0];
        "".length();
        if (-(0xA4 ^ 0xAD ^ (0x46 ^ 0x4A)) >= 0) {
            return;
        }
        while (!lIIlIIlIlIlIlIII(llllllllllllIllIllIIIIIllllIllIl, GuiEnchantment.llIlIIlIllIlIl[12])) {
            final int llllllllllllIllIllIIIIIllllIllII = this.container.enchantLevels[llllllllllllIllIllIIIIIllllIllIl];
            final int llllllllllllIllIllIIIIIllllIlIll = this.container.field_178151_h[llllllllllllIllIllIIIIIllllIllIl];
            final int llllllllllllIllIllIIIIIllllIlIlI = llllllllllllIllIllIIIIIllllIllIl + GuiEnchantment.llIlIIlIllIlIl[1];
            if (lIIlIIlIlIlIIlll(this.isPointInRegion(GuiEnchantment.llIlIIlIllIlIl[8], GuiEnchantment.llIlIIlIllIlIl[9] + GuiEnchantment.llIlIIlIllIlIl[10] * llllllllllllIllIllIIIIIllllIllIl, GuiEnchantment.llIlIIlIllIlIl[11], GuiEnchantment.llIlIIlIllIlIl[32], llllllllllllIllIllIIIIIlllllIIlI, llllllllllllIllIllIIIIIlllllIIIl) ? 1 : 0) && lIIlIIlIlIlIllII(llllllllllllIllIllIIIIIllllIllII) && lIIlIIlIlIlIIlIl(llllllllllllIllIllIIIIIllllIlIll)) {
                final List<String> llllllllllllIllIllIIIIIllllIlIIl = (List<String>)Lists.newArrayList();
                if (lIIlIIlIlIlIIlIl(llllllllllllIllIllIIIIIllllIlIll) && lIIlIIlIlIlIlllI(Enchantment.getEnchantmentById(llllllllllllIllIllIIIIIllllIlIll & GuiEnchantment.llIlIIlIllIlIl[33]))) {
                    final String llllllllllllIllIllIIIIIllllIlIII = Enchantment.getEnchantmentById(llllllllllllIllIllIIIIIllllIlIll & GuiEnchantment.llIlIIlIllIlIl[33]).getTranslatedName((llllllllllllIllIllIIIIIllllIlIll & GuiEnchantment.llIlIIlIllIlIl[34]) >> GuiEnchantment.llIlIIlIllIlIl[5]);
                    final List<String> list = llllllllllllIllIllIIIIIllllIlIIl;
                    final StringBuilder append = new StringBuilder(String.valueOf(EnumChatFormatting.WHITE.toString())).append(EnumChatFormatting.ITALIC.toString());
                    final String llllllllllllIlIllIlIIIIIllllIIll = GuiEnchantment.llIlIIlIlIlllI[GuiEnchantment.llIlIIlIllIlIl[7]];
                    final Object[] llllllllllllIlIllIlIIIIIllllIIII = new Object[GuiEnchantment.llIlIIlIllIlIl[1]];
                    llllllllllllIlIllIlIIIIIllllIIII[GuiEnchantment.llIlIIlIllIlIl[0]] = llllllllllllIllIllIIIIIllllIlIII;
                    list.add(String.valueOf(append.append(I18n.format(llllllllllllIlIllIlIIIIIllllIIll, llllllllllllIlIllIlIIIIIllllIIII))));
                    "".length();
                }
                if (lIIlIIlIlIlIllIl(llllllllllllIllIllIIIIIllllIllll ? 1 : 0)) {
                    if (lIIlIIlIlIlIIlIl(llllllllllllIllIllIIIIIllllIlIll)) {
                        llllllllllllIllIllIIIIIllllIlIIl.add(GuiEnchantment.llIlIIlIlIlllI[GuiEnchantment.llIlIIlIllIlIl[12]]);
                        "".length();
                    }
                    if (lIIlIIlIlIlIIllI(this.mc.thePlayer.experienceLevel, llllllllllllIllIllIIIIIllllIllII)) {
                        llllllllllllIllIllIIIIIllllIlIIl.add(String.valueOf(new StringBuilder(String.valueOf(EnumChatFormatting.RED.toString())).append(GuiEnchantment.llIlIIlIlIlllI[GuiEnchantment.llIlIIlIllIlIl[35]]).append(this.container.enchantLevels[llllllllllllIllIllIIIIIllllIllIl])));
                        "".length();
                        "".length();
                        if ((76 + 122 - 133 + 65 ^ 90 + 48 - 115 + 111) <= 0) {
                            return;
                        }
                    }
                    else {
                        String llllllllllllIllIllIIIIIllllIIlll = GuiEnchantment.llIlIIlIlIlllI[GuiEnchantment.llIlIIlIllIlIl[3]];
                        if (lIIlIIlIlIlIllll(llllllllllllIllIllIIIIIllllIlIlI, GuiEnchantment.llIlIIlIllIlIl[1])) {
                            llllllllllllIllIllIIIIIllllIIlll = I18n.format(GuiEnchantment.llIlIIlIlIlllI[GuiEnchantment.llIlIIlIllIlIl[36]], new Object[GuiEnchantment.llIlIIlIllIlIl[0]]);
                            "".length();
                            if (" ".length() > (0x59 ^ 0x5D)) {
                                return;
                            }
                        }
                        else {
                            final String llllllllllllIlIllIlIIIIIllllIIll2 = GuiEnchantment.llIlIIlIlIlllI[GuiEnchantment.llIlIIlIllIlIl[31]];
                            final Object[] llllllllllllIlIllIlIIIIIllllIIII2 = new Object[GuiEnchantment.llIlIIlIllIlIl[1]];
                            llllllllllllIlIllIlIIIIIllllIIII2[GuiEnchantment.llIlIIlIllIlIl[0]] = llllllllllllIllIllIIIIIllllIlIlI;
                            llllllllllllIllIllIIIIIllllIIlll = I18n.format(llllllllllllIlIllIlIIIIIllllIIll2, llllllllllllIlIllIlIIIIIllllIIII2);
                        }
                        if (lIIlIIlIlIlIlIII(llllllllllllIllIllIIIIIllllIlllI, llllllllllllIllIllIIIIIllllIlIlI)) {
                            llllllllllllIllIllIIIIIllllIlIIl.add(String.valueOf(new StringBuilder(String.valueOf(EnumChatFormatting.GRAY.toString())).append(llllllllllllIllIllIIIIIllllIIlll)));
                            "".length();
                            "".length();
                            if (null != null) {
                                return;
                            }
                        }
                        else {
                            llllllllllllIllIllIIIIIllllIlIIl.add(String.valueOf(new StringBuilder(String.valueOf(EnumChatFormatting.RED.toString())).append(llllllllllllIllIllIIIIIllllIIlll)));
                            "".length();
                        }
                        if (lIIlIIlIlIlIllll(llllllllllllIllIllIIIIIllllIlIlI, GuiEnchantment.llIlIIlIllIlIl[1])) {
                            llllllllllllIllIllIIIIIllllIIlll = I18n.format(GuiEnchantment.llIlIIlIlIlllI[GuiEnchantment.llIlIIlIllIlIl[5]], new Object[GuiEnchantment.llIlIIlIllIlIl[0]]);
                            "".length();
                            if ("  ".length() <= -" ".length()) {
                                return;
                            }
                        }
                        else {
                            final String llllllllllllIlIllIlIIIIIllllIIll3 = GuiEnchantment.llIlIIlIlIlllI[GuiEnchantment.llIlIIlIllIlIl[37]];
                            final Object[] llllllllllllIlIllIlIIIIIllllIIII3 = new Object[GuiEnchantment.llIlIIlIllIlIl[1]];
                            llllllllllllIlIllIlIIIIIllllIIII3[GuiEnchantment.llIlIIlIllIlIl[0]] = llllllllllllIllIllIIIIIllllIlIlI;
                            llllllllllllIllIllIIIIIllllIIlll = I18n.format(llllllllllllIlIllIlIIIIIllllIIll3, llllllllllllIlIllIlIIIIIllllIIII3);
                        }
                        llllllllllllIllIllIIIIIllllIlIIl.add(String.valueOf(new StringBuilder(String.valueOf(EnumChatFormatting.GRAY.toString())).append(llllllllllllIllIllIIIIIllllIIlll)));
                        "".length();
                    }
                }
                this.drawHoveringText(llllllllllllIllIllIIIIIllllIlIIl, llllllllllllIllIllIIIIIlllllIIlI, llllllllllllIllIllIIIIIlllllIIIl);
                "".length();
                if (((0x69 ^ 0x2E) & ~(0x7F ^ 0x38)) != 0x0) {
                    return;
                }
                break;
            }
            else {
                ++llllllllllllIllIllIIIIIllllIllIl;
            }
        }
    }
    
    private static boolean lIIlIIlIlIlIllII(final int llllllllllllIllIllIIIIIlIlllllll) {
        return llllllllllllIllIllIIIIIlIlllllll > 0;
    }
    
    private static boolean lIIlIIlIlIlIllIl(final int llllllllllllIllIllIIIIIllIIIIlll) {
        return llllllllllllIllIllIIIIIllIIIIlll == 0;
    }
    
    private static boolean lIIlIIlIlIlIlIII(final int llllllllllllIllIllIIIIIllIIlIIlI, final int llllllllllllIllIllIIIIIllIIlIIIl) {
        return llllllllllllIllIllIIIIIllIIlIIlI >= llllllllllllIllIllIIIIIllIIlIIIl;
    }
}
