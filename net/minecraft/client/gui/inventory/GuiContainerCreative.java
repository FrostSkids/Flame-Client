// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui.inventory;

import net.minecraft.inventory.IInventory;
import com.google.common.collect.Lists;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.RenderHelper;
import java.util.Arrays;
import java.util.Iterator;
import net.minecraft.item.Item;
import org.lwjgl.input.Keyboard;
import net.minecraft.inventory.ICrafting;
import net.minecraft.client.gui.achievement.GuiStats;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.achievement.GuiAchievements;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.util.MathHelper;
import org.lwjgl.input.Mouse;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.io.IOException;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.client.renderer.GlStateManager;
import java.util.Map;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.Container;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.resources.I18n;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.util.ResourceLocation;
import net.minecraft.inventory.Slot;
import java.util.List;
import net.minecraft.client.renderer.InventoryEffectRenderer;

public class GuiContainerCreative extends InventoryEffectRenderer
{
    private /* synthetic */ boolean wasClicking;
    private /* synthetic */ boolean isScrolling;
    private /* synthetic */ List<Slot> field_147063_B;
    private static final /* synthetic */ ResourceLocation creativeInventoryTabs;
    private static /* synthetic */ InventoryBasic field_147060_v;
    private static final /* synthetic */ String[] lIIIlllIlIlIll;
    private static final /* synthetic */ int[] lIIIlllIlIlllI;
    private /* synthetic */ CreativeCrafting field_147059_E;
    private /* synthetic */ Slot field_147064_C;
    private /* synthetic */ float currentScroll;
    private /* synthetic */ GuiTextField searchField;
    private /* synthetic */ boolean field_147057_D;
    private static /* synthetic */ int selectedTabIndex;
    
    protected boolean renderCreativeInventoryHoveringText(final CreativeTabs lllllllllllllIIllllIllllllllIIII, final int lllllllllllllIIllllIllllllllIllI, final int lllllllllllllIIllllIllllllllIlIl) {
        final int lllllllllllllIIllllIllllllllIlII = lllllllllllllIIllllIllllllllIIII.getTabColumn();
        int lllllllllllllIIllllIllllllllIIll = GuiContainerCreative.lIIIlllIlIlllI[35] * lllllllllllllIIllllIllllllllIlII;
        int lllllllllllllIIllllIllllllllIIlI = GuiContainerCreative.lIIIlllIlIlllI[0];
        if (llIIIllIlIllIll(lllllllllllllIIllllIllllllllIlII, GuiContainerCreative.lIIIlllIlIlllI[7])) {
            lllllllllllllIIllllIllllllllIIll = this.xSize - GuiContainerCreative.lIIIlllIlIlllI[35] + GuiContainerCreative.lIIIlllIlIlllI[8];
            "".length();
            if ((0x37 ^ 0x33) <= ((0x0 ^ 0x32) & ~(0x72 ^ 0x40))) {
                return ((0x90 ^ 0xAE) & ~(0x92 ^ 0xAC)) != 0x0;
            }
        }
        else if (llIIIllIllIIlIl(lllllllllllllIIllllIllllllllIlII)) {
            lllllllllllllIIllllIllllllllIIll += lllllllllllllIIllllIllllllllIlII;
        }
        if (llIIIllIllIIIII(lllllllllllllIIllllIllllllllIIII.isTabInFirstRow() ? 1 : 0)) {
            lllllllllllllIIllllIllllllllIIlI -= 32;
            "".length();
            if (" ".length() == -" ".length()) {
                return ((0x13 ^ 0x56) & ~(0x4C ^ 0x9)) != 0x0;
            }
        }
        else {
            lllllllllllllIIllllIllllllllIIlI += this.ySize;
        }
        if (llIIIllIllIIIII(this.isPointInRegion(lllllllllllllIIllllIllllllllIIll + GuiContainerCreative.lIIIlllIlIlllI[10], lllllllllllllIIllllIllllllllIIlI + GuiContainerCreative.lIIIlllIlIlllI[10], GuiContainerCreative.lIIIlllIlIlllI[37], GuiContainerCreative.lIIIlllIlIlllI[21], lllllllllllllIIllllIllllllllIllI, lllllllllllllIIllllIllllllllIlIl) ? 1 : 0)) {
            this.drawCreativeTabHoveringText(I18n.format(lllllllllllllIIllllIllllllllIIII.getTranslatedTabLabel(), new Object[GuiContainerCreative.lIIIlllIlIlllI[0]]), lllllllllllllIIllllIllllllllIllI, lllllllllllllIIllllIllllllllIlIl);
            return GuiContainerCreative.lIIIlllIlIlllI[1] != 0;
        }
        return GuiContainerCreative.lIIIlllIlIlllI[0] != 0;
    }
    
    private static boolean llIIIllIllIIIII(final int lllllllllllllIIllllIllllIlllIlll) {
        return lllllllllllllIIllllIllllIlllIlll != 0;
    }
    
    public GuiContainerCreative(final EntityPlayer lllllllllllllIIlllllIIIlIIllllll) {
        super(new ContainerCreative(lllllllllllllIIlllllIIIlIIllllll));
        lllllllllllllIIlllllIIIlIIllllll.openContainer = this.inventorySlots;
        this.allowUserInput = (GuiContainerCreative.lIIIlllIlIlllI[1] != 0);
        this.ySize = GuiContainerCreative.lIIIlllIlIlllI[3];
        this.xSize = GuiContainerCreative.lIIIlllIlIlllI[4];
    }
    
    private static boolean llIIIllIllIIllI(final int lllllllllllllIIllllIllllIlllIIIl) {
        return lllllllllllllIIllllIllllIlllIIIl < 0;
    }
    
    private boolean needsScrollBars() {
        if (llIIIllIlIlllIl(GuiContainerCreative.selectedTabIndex, CreativeTabs.tabInventory.getTabIndex()) && llIIIllIllIIIII(CreativeTabs.creativeTabArray[GuiContainerCreative.selectedTabIndex].shouldHidePlayerInventory() ? 1 : 0) && llIIIllIllIIIII(((ContainerCreative)this.inventorySlots).func_148328_e() ? 1 : 0)) {
            return GuiContainerCreative.lIIIlllIlIlllI[1] != 0;
        }
        return GuiContainerCreative.lIIIlllIlIlllI[0] != 0;
    }
    
    @Override
    protected void renderToolTip(final ItemStack lllllllllllllIIlllllIIIIIIlllIII, final int lllllllllllllIIlllllIIIIIlIIIIIl, final int lllllllllllllIIlllllIIIIIlIIIIII) {
        if (llIIIllIlIllIll(GuiContainerCreative.selectedTabIndex, CreativeTabs.tabAllSearch.getTabIndex())) {
            final List<String> lllllllllllllIIlllllIIIIIIllllll = lllllllllllllIIlllllIIIIIIlllIII.getTooltip(this.mc.thePlayer, this.mc.gameSettings.advancedItemTooltips);
            CreativeTabs lllllllllllllIIlllllIIIIIIlllllI = lllllllllllllIIlllllIIIIIIlllIII.getItem().getCreativeTab();
            if (llIIIllIlIlllII(lllllllllllllIIlllllIIIIIIlllllI) && llIIIllIlIlllll(lllllllllllllIIlllllIIIIIIlllIII.getItem(), Items.enchanted_book)) {
                final Map<Integer, Integer> lllllllllllllIIlllllIIIIIIllllIl = EnchantmentHelper.getEnchantments(lllllllllllllIIlllllIIIIIIlllIII);
                if (llIIIllIlIllIll(lllllllllllllIIlllllIIIIIIllllIl.size(), GuiContainerCreative.lIIIlllIlIlllI[1])) {
                    final Enchantment lllllllllllllIIlllllIIIIIIllllII = Enchantment.getEnchantmentById(lllllllllllllIIlllllIIIIIIllllIl.keySet().iterator().next());
                    final int lllllllllllllIIlllllIIIIIIlIlllI;
                    final short lllllllllllllIIlllllIIIIIIlIllll = (short)((CreativeTabs[])(Object)(lllllllllllllIIlllllIIIIIIlIlllI = (int)(Object)CreativeTabs.creativeTabArray)).length;
                    Exception lllllllllllllIIlllllIIIIIIllIIII = (Exception)GuiContainerCreative.lIIIlllIlIlllI[0];
                    "".length();
                    if (" ".length() <= ((0x2A ^ 0x3D ^ (0x78 ^ 0x43)) & (0x3E ^ 0x65 ^ (0xE9 ^ 0x9E) ^ -" ".length()))) {
                        return;
                    }
                    while (!llIIIllIllIIIIl((int)lllllllllllllIIlllllIIIIIIllIIII, lllllllllllllIIlllllIIIIIIlIllll)) {
                        final CreativeTabs lllllllllllllIIlllllIIIIIIlllIll = lllllllllllllIIlllllIIIIIIlIlllI[lllllllllllllIIlllllIIIIIIllIIII];
                        if (llIIIllIllIIIII(lllllllllllllIIlllllIIIIIIlllIll.hasRelevantEnchantmentType(lllllllllllllIIlllllIIIIIIllllII.type) ? 1 : 0)) {
                            lllllllllllllIIlllllIIIIIIlllllI = lllllllllllllIIlllllIIIIIIlllIll;
                            "".length();
                            if (-" ".length() > "   ".length()) {
                                return;
                            }
                            break;
                        }
                        else {
                            ++lllllllllllllIIlllllIIIIIIllIIII;
                        }
                    }
                }
            }
            if (llIIIllIlIllllI(lllllllllllllIIlllllIIIIIIlllllI)) {
                lllllllllllllIIlllllIIIIIIllllll.add(GuiContainerCreative.lIIIlllIlIlllI[1], String.valueOf(new StringBuilder().append(EnumChatFormatting.BOLD).append(EnumChatFormatting.BLUE).append(I18n.format(lllllllllllllIIlllllIIIIIIlllllI.getTranslatedTabLabel(), new Object[GuiContainerCreative.lIIIlllIlIlllI[0]]))));
            }
            int lllllllllllllIIlllllIIIIIIlllIlI = GuiContainerCreative.lIIIlllIlIlllI[0];
            "".length();
            if (((0xB6 ^ 0x9D) & ~(0x7 ^ 0x2C)) != 0x0) {
                return;
            }
            while (!llIIIllIllIIIIl(lllllllllllllIIlllllIIIIIIlllIlI, lllllllllllllIIlllllIIIIIIllllll.size())) {
                if (llIIIllIlIllIlI(lllllllllllllIIlllllIIIIIIlllIlI)) {
                    lllllllllllllIIlllllIIIIIIllllll.set(lllllllllllllIIlllllIIIIIIlllIlI, String.valueOf(new StringBuilder().append(lllllllllllllIIlllllIIIIIIlllIII.getRarity().rarityColor).append(lllllllllllllIIlllllIIIIIIllllll.get(lllllllllllllIIlllllIIIIIIlllIlI))));
                    "".length();
                    "".length();
                    if (-"   ".length() >= 0) {
                        return;
                    }
                }
                else {
                    lllllllllllllIIlllllIIIIIIllllll.set(lllllllllllllIIlllllIIIIIIlllIlI, String.valueOf(new StringBuilder().append(EnumChatFormatting.GRAY).append(lllllllllllllIIlllllIIIIIIllllll.get(lllllllllllllIIlllllIIIIIIlllIlI))));
                    "".length();
                }
                ++lllllllllllllIIlllllIIIIIIlllIlI;
            }
            this.drawHoveringText(lllllllllllllIIlllllIIIIIIllllll, lllllllllllllIIlllllIIIIIlIIIIIl, lllllllllllllIIlllllIIIIIlIIIIII);
            "".length();
            if (((0x21 ^ 0x40) & ~(0x1D ^ 0x7C)) < 0) {
                return;
            }
        }
        else {
            super.renderToolTip(lllllllllllllIIlllllIIIIIIlllIII, lllllllllllllIIlllllIIIIIlIIIIIl, lllllllllllllIIlllllIIIIIlIIIIII);
        }
    }
    
    private static boolean llIIIllIlIlllll(final Object lllllllllllllIIllllIllllIlllllII, final Object lllllllllllllIIllllIllllIllllIll) {
        return lllllllllllllIIllllIllllIlllllII == lllllllllllllIIllllIllllIllllIll;
    }
    
    private static void llIIIllIlIllIIl() {
        (lIIIlllIlIlllI = new int[38])[0] = ((0x4E ^ 0x42) & ~(0x3C ^ 0x30));
        GuiContainerCreative.lIIIlllIlIlllI[1] = " ".length();
        GuiContainerCreative.lIIIlllIlIlllI[2] = (0x63 ^ 0x37 ^ (0x43 ^ 0x3A));
        GuiContainerCreative.lIIIlllIlIlllI[3] = (0x48 ^ 0x38) + " ".length() - (0x1A ^ 0x3D) + (0x47 ^ 0x79);
        GuiContainerCreative.lIIIlllIlIlllI[4] = 89 + 149 - 98 + 55;
        GuiContainerCreative.lIIIlllIlIlllI[5] = -(-(0xFFFFFEF1 & 0x791F) & (0xFFFFFBF7 & 0x7FFF));
        GuiContainerCreative.lIIIlllIlIlllI[6] = (0x72 ^ 0x6F ^ (0x2C ^ 0x35));
        GuiContainerCreative.lIIIlllIlIlllI[7] = (0x30 ^ 0x35);
        GuiContainerCreative.lIIIlllIlIlllI[8] = "  ".length();
        GuiContainerCreative.lIIIlllIlIlllI[9] = (0xBB ^ 0xB2);
        GuiContainerCreative.lIIIlllIlIlllI[10] = "   ".length();
        GuiContainerCreative.lIIIlllIlIlllI[11] = (0xF ^ 0x5 ^ (0xA2 ^ 0x8C));
        GuiContainerCreative.lIIIlllIlIlllI[12] = (36 + 168 - 195 + 206 ^ 14 + 124 - 84 + 79);
        GuiContainerCreative.lIIIlllIlIlllI[13] = (0x75 ^ 0x73);
        GuiContainerCreative.lIIIlllIlIlllI[14] = (0xE4 ^ 0xBD);
        GuiContainerCreative.lIIIlllIlIlllI[15] = (0x84 ^ 0xAE ^ (0xB5 ^ 0x90));
        GuiContainerCreative.lIIIlllIlIlllI[16] = (-1 & 0xFFFFFF);
        GuiContainerCreative.lIIIlllIlIlllI[17] = -" ".length();
        GuiContainerCreative.lIIIlllIlIlllI[18] = (0x33 ^ 0x1B ^ (0x36 ^ 0x16));
        GuiContainerCreative.lIIIlllIlIlllI[19] = (-(0xFFFFF7B7 & 0x3DDC) & (0xFFFFF5FF & 0x407FD3));
        GuiContainerCreative.lIIIlllIlIlllI[20] = (0xF3 ^ 0xC5);
        GuiContainerCreative.lIIIlllIlIlllI[21] = (29 + 83 + 4 + 13 ^ 128 + 104 - 108 + 30);
        GuiContainerCreative.lIIIlllIlIlllI[22] = -(0xFFFF8FF6 & 0x77D9);
        GuiContainerCreative.lIIIlllIlIlllI[23] = (0x5D ^ 0x4F);
        GuiContainerCreative.lIIIlllIlIlllI[24] = (0x4D ^ 0x73 ^ (0x2D ^ 0x63));
        GuiContainerCreative.lIIIlllIlIlllI[25] = 125 + 49 - 64 + 63;
        GuiContainerCreative.lIIIlllIlIlllI[26] = 34 + 50 - 55 + 107 + (0xD7 ^ 0x9F) - (0xE5 ^ 0xAE) + (0x38 ^ 0x12);
        GuiContainerCreative.lIIIlllIlIlllI[27] = (0x76 ^ 0x12 ^ (0x10 ^ 0x7A));
        GuiContainerCreative.lIIIlllIlIlllI[28] = (104 + 66 - 67 + 80 ^ 75 + 138 - 108 + 62);
        GuiContainerCreative.lIIIlllIlIlllI[29] = (0x51 ^ 0x40);
        GuiContainerCreative.lIIIlllIlIlllI[30] = (0xCE ^ 0x9B) + (0xC ^ 0x56) - (73 + 87 - 137 + 106) + (26 + 147 - 71 + 84);
        GuiContainerCreative.lIIIlllIlIlllI[31] = (0x75 ^ 0xB ^ (0xB6 ^ 0xC4));
        GuiContainerCreative.lIIIlllIlIlllI[32] = (0x12 ^ 0x39);
        GuiContainerCreative.lIIIlllIlIlllI[33] = (0x17 ^ 0x18 ^ (0xBB ^ 0xA0));
        GuiContainerCreative.lIIIlllIlIlllI[34] = (0x2F ^ 0x31);
        GuiContainerCreative.lIIIlllIlIlllI[35] = (0x8C ^ 0x90);
        GuiContainerCreative.lIIIlllIlIlllI[36] = (0x63 ^ 0x43);
        GuiContainerCreative.lIIIlllIlIlllI[37] = (0x60 ^ 0x77);
    }
    
    protected void func_147051_a(final CreativeTabs lllllllllllllIIllllIllllllIllllI) {
        int n;
        if (llIIIllIlIllIll(lllllllllllllIIllllIllllllIllllI.getTabIndex(), GuiContainerCreative.selectedTabIndex)) {
            n = GuiContainerCreative.lIIIlllIlIlllI[1];
            "".length();
            if (-(0xFF ^ 0x85 ^ 113 + 123 - 187 + 78) >= 0) {
                return;
            }
        }
        else {
            n = GuiContainerCreative.lIIIlllIlIlllI[0];
        }
        final boolean lllllllllllllIIllllIllllllIlllIl = n != 0;
        final boolean lllllllllllllIIllllIllllllIlllII = lllllllllllllIIllllIllllllIllllI.isTabInFirstRow();
        final int lllllllllllllIIllllIllllllIllIll = lllllllllllllIIllllIllllllIllllI.getTabColumn();
        final int lllllllllllllIIllllIllllllIllIlI = lllllllllllllIIllllIllllllIllIll * GuiContainerCreative.lIIIlllIlIlllI[35];
        int lllllllllllllIIllllIllllllIllIIl = GuiContainerCreative.lIIIlllIlIlllI[0];
        int lllllllllllllIIllllIllllllIllIII = this.guiLeft + GuiContainerCreative.lIIIlllIlIlllI[35] * lllllllllllllIIllllIllllllIllIll;
        int lllllllllllllIIllllIllllllIlIlll = this.guiTop;
        final int lllllllllllllIIllllIllllllIlIllI = GuiContainerCreative.lIIIlllIlIlllI[36];
        if (llIIIllIllIIIII(lllllllllllllIIllllIllllllIlllIl ? 1 : 0)) {
            lllllllllllllIIllllIllllllIllIIl += 32;
        }
        if (llIIIllIlIllIll(lllllllllllllIIllllIllllllIllIll, GuiContainerCreative.lIIIlllIlIlllI[7])) {
            lllllllllllllIIllllIllllllIllIII = this.guiLeft + this.xSize - GuiContainerCreative.lIIIlllIlIlllI[35];
            "".length();
            if (((0xAD ^ 0x89) & ~(0x51 ^ 0x75)) <= -" ".length()) {
                return;
            }
        }
        else if (llIIIllIllIIlIl(lllllllllllllIIllllIllllllIllIll)) {
            lllllllllllllIIllllIllllllIllIII += lllllllllllllIIllllIllllllIllIll;
        }
        if (llIIIllIllIIIII(lllllllllllllIIllllIllllllIlllII ? 1 : 0)) {
            lllllllllllllIIllllIllllllIlIlll -= 28;
            "".length();
            if ("  ".length() < "  ".length()) {
                return;
            }
        }
        else {
            lllllllllllllIIllllIllllllIllIIl += 64;
            lllllllllllllIIllllIllllllIlIlll += this.ySize - GuiContainerCreative.lIIIlllIlIlllI[6];
        }
        GlStateManager.disableLighting();
        this.drawTexturedModalRect(lllllllllllllIIllllIllllllIllIII, lllllllllllllIIllllIllllllIlIlll, lllllllllllllIIllllIllllllIllIlI, lllllllllllllIIllllIllllllIllIIl, GuiContainerCreative.lIIIlllIlIlllI[35], lllllllllllllIIllllIllllllIlIllI);
        this.zLevel = 100.0f;
        this.itemRender.zLevel = 100.0f;
        lllllllllllllIIllllIllllllIllIII += 6;
        final int n2 = lllllllllllllIIllllIllllllIlIlll + GuiContainerCreative.lIIIlllIlIlllI[18];
        int n3;
        if (llIIIllIllIIIII(lllllllllllllIIllllIllllllIlllII ? 1 : 0)) {
            n3 = GuiContainerCreative.lIIIlllIlIlllI[1];
            "".length();
            if ("   ".length() != "   ".length()) {
                return;
            }
        }
        else {
            n3 = GuiContainerCreative.lIIIlllIlIlllI[17];
        }
        lllllllllllllIIllllIllllllIlIlll = n2 + n3;
        GlStateManager.enableLighting();
        GlStateManager.enableRescaleNormal();
        final ItemStack lllllllllllllIIllllIllllllIlIlIl = lllllllllllllIIllllIllllllIllllI.getIconItemStack();
        this.itemRender.renderItemAndEffectIntoGUI(lllllllllllllIIllllIllllllIlIlIl, lllllllllllllIIllllIllllllIllIII, lllllllllllllIIllllIllllllIlIlll);
        this.itemRender.renderItemOverlays(this.fontRendererObj, lllllllllllllIIllllIllllllIlIlIl, lllllllllllllIIllllIllllllIllIII, lllllllllllllIIllllIllllllIlIlll);
        GlStateManager.disableLighting();
        this.itemRender.zLevel = 0.0f;
        this.zLevel = 0.0f;
    }
    
    private static boolean llIIIllIlIlllIl(final int lllllllllllllIIllllIllllIllIllII, final int lllllllllllllIIllllIllllIllIlIll) {
        return lllllllllllllIIllllIllllIllIllII != lllllllllllllIIllllIllllIllIlIll;
    }
    
    @Override
    protected void handleMouseClick(final Slot lllllllllllllIIlllllIIIlIIIllllI, final int lllllllllllllIIlllllIIIlIIIlllIl, final int lllllllllllllIIlllllIIIlIIlIlllI, int lllllllllllllIIlllllIIIlIIlIllIl) {
        this.field_147057_D = (GuiContainerCreative.lIIIlllIlIlllI[1] != 0);
        int n;
        if (llIIIllIlIllIll(lllllllllllllIIlllllIIIlIIlIllIl, GuiContainerCreative.lIIIlllIlIlllI[1])) {
            n = GuiContainerCreative.lIIIlllIlIlllI[1];
            "".length();
            if (-" ".length() > 0) {
                return;
            }
        }
        else {
            n = GuiContainerCreative.lIIIlllIlIlllI[0];
        }
        final boolean lllllllllllllIIlllllIIIlIIlIllII = n != 0;
        int n2;
        if (llIIIllIlIllIll(lllllllllllllIIlllllIIIlIIIlllIl, GuiContainerCreative.lIIIlllIlIlllI[5]) && llIIIllIlIllIlI(lllllllllllllIIlllllIIIlIIlIllIl)) {
            n2 = GuiContainerCreative.lIIIlllIlIlllI[6];
            "".length();
            if ((0xAC ^ 0xA8) == 0x0) {
                return;
            }
        }
        else {
            n2 = lllllllllllllIIlllllIIIlIIlIllIl;
        }
        lllllllllllllIIlllllIIIlIIlIllIl = n2;
        if (llIIIllIlIlllII(lllllllllllllIIlllllIIIlIIIllllI) && llIIIllIlIlllIl(GuiContainerCreative.selectedTabIndex, CreativeTabs.tabInventory.getTabIndex()) && llIIIllIlIlllIl(lllllllllllllIIlllllIIIlIIlIllIl, GuiContainerCreative.lIIIlllIlIlllI[7])) {
            final InventoryPlayer lllllllllllllIIlllllIIIlIIlIlIll = this.mc.thePlayer.inventory;
            if (llIIIllIlIllllI(lllllllllllllIIlllllIIIlIIlIlIll.getItemStack())) {
                if (llIIIllIlIllIlI(lllllllllllllIIlllllIIIlIIlIlllI)) {
                    this.mc.thePlayer.dropPlayerItemWithRandomChoice(lllllllllllllIIlllllIIIlIIlIlIll.getItemStack(), (boolean)(GuiContainerCreative.lIIIlllIlIlllI[1] != 0));
                    "".length();
                    this.mc.playerController.sendPacketDropItem(lllllllllllllIIlllllIIIlIIlIlIll.getItemStack());
                    lllllllllllllIIlllllIIIlIIlIlIll.setItemStack(null);
                }
                if (llIIIllIlIllIll(lllllllllllllIIlllllIIIlIIlIlllI, GuiContainerCreative.lIIIlllIlIlllI[1])) {
                    final ItemStack lllllllllllllIIlllllIIIlIIlIlIlI = lllllllllllllIIlllllIIIlIIlIlIll.getItemStack().splitStack(GuiContainerCreative.lIIIlllIlIlllI[1]);
                    this.mc.thePlayer.dropPlayerItemWithRandomChoice(lllllllllllllIIlllllIIIlIIlIlIlI, (boolean)(GuiContainerCreative.lIIIlllIlIlllI[1] != 0));
                    "".length();
                    this.mc.playerController.sendPacketDropItem(lllllllllllllIIlllllIIIlIIlIlIlI);
                    if (llIIIllIlIllIlI(lllllllllllllIIlllllIIIlIIlIlIll.getItemStack().stackSize)) {
                        lllllllllllllIIlllllIIIlIIlIlIll.setItemStack(null);
                        "".length();
                        if (-" ".length() >= 0) {
                            return;
                        }
                    }
                }
            }
        }
        else if (llIIIllIlIlllll(lllllllllllllIIlllllIIIlIIIllllI, this.field_147064_C) && llIIIllIllIIIII(lllllllllllllIIlllllIIIlIIlIllII ? 1 : 0)) {
            int lllllllllllllIIlllllIIIlIIlIlIIl = GuiContainerCreative.lIIIlllIlIlllI[0];
            "".length();
            if (-"   ".length() >= 0) {
                return;
            }
            while (!llIIIllIllIIIIl(lllllllllllllIIlllllIIIlIIlIlIIl, this.mc.thePlayer.inventoryContainer.getInventory().size())) {
                this.mc.playerController.sendSlotPacket(null, lllllllllllllIIlllllIIIlIIlIlIIl);
                ++lllllllllllllIIlllllIIIlIIlIlIIl;
            }
            "".length();
            if (((0x98 ^ 0xC6 ^ (0xC2 ^ 0x97)) & (0x31 ^ 0x79 ^ (0x47 ^ 0x4) ^ -" ".length())) > " ".length()) {
                return;
            }
        }
        else if (llIIIllIlIllIll(GuiContainerCreative.selectedTabIndex, CreativeTabs.tabInventory.getTabIndex())) {
            if (llIIIllIlIlllll(lllllllllllllIIlllllIIIlIIIllllI, this.field_147064_C)) {
                this.mc.thePlayer.inventory.setItemStack(null);
                "".length();
                if (" ".length() <= 0) {
                    return;
                }
            }
            else if (llIIIllIlIllIll(lllllllllllllIIlllllIIIlIIlIllIl, GuiContainerCreative.lIIIlllIlIlllI[6]) && llIIIllIlIllllI(lllllllllllllIIlllllIIIlIIIllllI) && llIIIllIllIIIII(lllllllllllllIIlllllIIIlIIIllllI.getHasStack() ? 1 : 0)) {
                int maxStackSize;
                if (llIIIllIlIllIlI(lllllllllllllIIlllllIIIlIIlIlllI)) {
                    maxStackSize = GuiContainerCreative.lIIIlllIlIlllI[1];
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    maxStackSize = lllllllllllllIIlllllIIIlIIIllllI.getStack().getMaxStackSize();
                }
                final ItemStack lllllllllllllIIlllllIIIlIIlIlIII = lllllllllllllIIlllllIIIlIIIllllI.decrStackSize(maxStackSize);
                this.mc.thePlayer.dropPlayerItemWithRandomChoice(lllllllllllllIIlllllIIIlIIlIlIII, (boolean)(GuiContainerCreative.lIIIlllIlIlllI[1] != 0));
                "".length();
                this.mc.playerController.sendPacketDropItem(lllllllllllllIIlllllIIIlIIlIlIII);
                "".length();
                if (((0x44 ^ 0x4F) & ~(0x4E ^ 0x45)) != 0x0) {
                    return;
                }
            }
            else if (llIIIllIlIllIll(lllllllllllllIIlllllIIIlIIlIllIl, GuiContainerCreative.lIIIlllIlIlllI[6]) && llIIIllIlIllllI(this.mc.thePlayer.inventory.getItemStack())) {
                this.mc.thePlayer.dropPlayerItemWithRandomChoice(this.mc.thePlayer.inventory.getItemStack(), (boolean)(GuiContainerCreative.lIIIlllIlIlllI[1] != 0));
                "".length();
                this.mc.playerController.sendPacketDropItem(this.mc.thePlayer.inventory.getItemStack());
                this.mc.thePlayer.inventory.setItemStack(null);
                "".length();
                if (" ".length() == 0) {
                    return;
                }
            }
            else {
                final Container inventoryContainer = this.mc.thePlayer.inventoryContainer;
                int slotNumber;
                if (llIIIllIlIlllII(lllllllllllllIIlllllIIIlIIIllllI)) {
                    slotNumber = lllllllllllllIIlllllIIIlIIIlllIl;
                    "".length();
                    if ((0x9B ^ 0x9F) <= 0) {
                        return;
                    }
                }
                else {
                    slotNumber = ((CreativeSlot)lllllllllllllIIlllllIIIlIIIllllI).slot.slotNumber;
                }
                inventoryContainer.slotClick(slotNumber, lllllllllllllIIlllllIIIlIIlIlllI, lllllllllllllIIlllllIIIlIIlIllIl, this.mc.thePlayer);
                "".length();
                this.mc.thePlayer.inventoryContainer.detectAndSendChanges();
                "".length();
                if (" ".length() <= 0) {
                    return;
                }
            }
        }
        else if (llIIIllIlIlllIl(lllllllllllllIIlllllIIIlIIlIllIl, GuiContainerCreative.lIIIlllIlIlllI[7]) && llIIIllIlIlllll(lllllllllllllIIlllllIIIlIIIllllI.inventory, GuiContainerCreative.field_147060_v)) {
            final InventoryPlayer lllllllllllllIIlllllIIIlIIlIIlll = this.mc.thePlayer.inventory;
            ItemStack lllllllllllllIIlllllIIIlIIlIIllI = lllllllllllllIIlllllIIIlIIlIIlll.getItemStack();
            final ItemStack lllllllllllllIIlllllIIIlIIlIIlIl = lllllllllllllIIlllllIIIlIIIllllI.getStack();
            if (llIIIllIlIllIll(lllllllllllllIIlllllIIIlIIlIllIl, GuiContainerCreative.lIIIlllIlIlllI[8])) {
                if (llIIIllIlIllllI(lllllllllllllIIlllllIIIlIIlIIlIl) && llIIIllIllIIIlI(lllllllllllllIIlllllIIIlIIlIlllI) && llIIIllIllIIIll(lllllllllllllIIlllllIIIlIIlIlllI, GuiContainerCreative.lIIIlllIlIlllI[9])) {
                    final ItemStack lllllllllllllIIlllllIIIlIIlIIlII = lllllllllllllIIlllllIIIlIIlIIlIl.copy();
                    lllllllllllllIIlllllIIIlIIlIIlII.stackSize = lllllllllllllIIlllllIIIlIIlIIlII.getMaxStackSize();
                    this.mc.thePlayer.inventory.setInventorySlotContents(lllllllllllllIIlllllIIIlIIlIlllI, lllllllllllllIIlllllIIIlIIlIIlII);
                    this.mc.thePlayer.inventoryContainer.detectAndSendChanges();
                }
                return;
            }
            if (llIIIllIlIllIll(lllllllllllllIIlllllIIIlIIlIllIl, GuiContainerCreative.lIIIlllIlIlllI[10])) {
                if (llIIIllIlIlllII(lllllllllllllIIlllllIIIlIIlIIlll.getItemStack()) && llIIIllIllIIIII(lllllllllllllIIlllllIIIlIIIllllI.getHasStack() ? 1 : 0)) {
                    final ItemStack lllllllllllllIIlllllIIIlIIlIIIll = lllllllllllllIIlllllIIIlIIIllllI.getStack().copy();
                    lllllllllllllIIlllllIIIlIIlIIIll.stackSize = lllllllllllllIIlllllIIIlIIlIIIll.getMaxStackSize();
                    lllllllllllllIIlllllIIIlIIlIIlll.setItemStack(lllllllllllllIIlllllIIIlIIlIIIll);
                }
                return;
            }
            if (llIIIllIlIllIll(lllllllllllllIIlllllIIIlIIlIllIl, GuiContainerCreative.lIIIlllIlIlllI[6])) {
                if (llIIIllIlIllllI(lllllllllllllIIlllllIIIlIIlIIlIl)) {
                    final ItemStack copy;
                    final ItemStack lllllllllllllIIlllllIIIlIIlIIIlI = copy = lllllllllllllIIlllllIIIlIIlIIlIl.copy();
                    int maxStackSize2;
                    if (llIIIllIlIllIlI(lllllllllllllIIlllllIIIlIIlIlllI)) {
                        maxStackSize2 = GuiContainerCreative.lIIIlllIlIlllI[1];
                        "".length();
                        if ("   ".length() <= 0) {
                            return;
                        }
                    }
                    else {
                        maxStackSize2 = lllllllllllllIIlllllIIIlIIlIIIlI.getMaxStackSize();
                    }
                    copy.stackSize = maxStackSize2;
                    this.mc.thePlayer.dropPlayerItemWithRandomChoice(lllllllllllllIIlllllIIIlIIlIIIlI, (boolean)(GuiContainerCreative.lIIIlllIlIlllI[1] != 0));
                    "".length();
                    this.mc.playerController.sendPacketDropItem(lllllllllllllIIlllllIIIlIIlIIIlI);
                }
                return;
            }
            if (llIIIllIlIllllI(lllllllllllllIIlllllIIIlIIlIIllI) && llIIIllIlIllllI(lllllllllllllIIlllllIIIlIIlIIlIl) && llIIIllIllIIIII(lllllllllllllIIlllllIIIlIIlIIllI.isItemEqual(lllllllllllllIIlllllIIIlIIlIIlIl) ? 1 : 0)) {
                if (llIIIllIlIllIlI(lllllllllllllIIlllllIIIlIIlIlllI)) {
                    if (llIIIllIllIIIII(lllllllllllllIIlllllIIIlIIlIllII ? 1 : 0)) {
                        lllllllllllllIIlllllIIIlIIlIIllI.stackSize = lllllllllllllIIlllllIIIlIIlIIllI.getMaxStackSize();
                        "".length();
                        if (-(0x3A ^ 0x3E) >= 0) {
                            return;
                        }
                    }
                    else if (llIIIllIllIIIll(lllllllllllllIIlllllIIIlIIlIIllI.stackSize, lllllllllllllIIlllllIIIlIIlIIllI.getMaxStackSize())) {
                        final ItemStack itemStack = lllllllllllllIIlllllIIIlIIlIIllI;
                        itemStack.stackSize += GuiContainerCreative.lIIIlllIlIlllI[1];
                        "".length();
                        if ((59 + 76 - 94 + 91 ^ 19 + 27 + 19 + 63) == "   ".length()) {
                            return;
                        }
                    }
                }
                else if (llIIIllIllIIlII(lllllllllllllIIlllllIIIlIIlIIllI.stackSize, GuiContainerCreative.lIIIlllIlIlllI[1])) {
                    lllllllllllllIIlllllIIIlIIlIIlll.setItemStack(null);
                    "".length();
                    if ((0x4E ^ 0x7E ^ (0xF ^ 0x3B)) < 0) {
                        return;
                    }
                }
                else {
                    final ItemStack itemStack2 = lllllllllllllIIlllllIIIlIIlIIllI;
                    itemStack2.stackSize -= GuiContainerCreative.lIIIlllIlIlllI[1];
                    "".length();
                    if ((0xB3 ^ 0xB7) < 0) {
                        return;
                    }
                }
            }
            else if (llIIIllIlIllllI(lllllllllllllIIlllllIIIlIIlIIlIl) && llIIIllIlIlllII(lllllllllllllIIlllllIIIlIIlIIllI)) {
                lllllllllllllIIlllllIIIlIIlIIlll.setItemStack(ItemStack.copyItemStack(lllllllllllllIIlllllIIIlIIlIIlIl));
                lllllllllllllIIlllllIIIlIIlIIllI = lllllllllllllIIlllllIIIlIIlIIlll.getItemStack();
                if (llIIIllIllIIIII(lllllllllllllIIlllllIIIlIIlIllII ? 1 : 0)) {
                    lllllllllllllIIlllllIIIlIIlIIllI.stackSize = lllllllllllllIIlllllIIIlIIlIIllI.getMaxStackSize();
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
            }
            else {
                lllllllllllllIIlllllIIIlIIlIIlll.setItemStack(null);
                "".length();
                if (-" ".length() != -" ".length()) {
                    return;
                }
            }
        }
        else {
            final Container inventorySlots = this.inventorySlots;
            int slotNumber2;
            if (llIIIllIlIlllII(lllllllllllllIIlllllIIIlIIIllllI)) {
                slotNumber2 = lllllllllllllIIlllllIIIlIIIlllIl;
                "".length();
                if ("   ".length() < "  ".length()) {
                    return;
                }
            }
            else {
                slotNumber2 = lllllllllllllIIlllllIIIlIIIllllI.slotNumber;
            }
            inventorySlots.slotClick(slotNumber2, lllllllllllllIIlllllIIIlIIlIlllI, lllllllllllllIIlllllIIIlIIlIllIl, this.mc.thePlayer);
            "".length();
            if (llIIIllIlIllIll(Container.getDragEvent(lllllllllllllIIlllllIIIlIIlIlllI), GuiContainerCreative.lIIIlllIlIlllI[8])) {
                int lllllllllllllIIlllllIIIlIIlIIIIl = GuiContainerCreative.lIIIlllIlIlllI[0];
                "".length();
                if (((0x5B ^ 0x51) & ~(0x43 ^ 0x49)) < 0) {
                    return;
                }
                while (!llIIIllIllIIIIl(lllllllllllllIIlllllIIIlIIlIIIIl, GuiContainerCreative.lIIIlllIlIlllI[9])) {
                    this.mc.playerController.sendSlotPacket(this.inventorySlots.getSlot(GuiContainerCreative.lIIIlllIlIlllI[2] + lllllllllllllIIlllllIIIlIIlIIIIl).getStack(), GuiContainerCreative.lIIIlllIlIlllI[11] + lllllllllllllIIlllllIIIlIIlIIIIl);
                    ++lllllllllllllIIlllllIIIlIIlIIIIl;
                }
                "".length();
                if (-"   ".length() > 0) {
                    return;
                }
            }
            else if (llIIIllIlIllllI(lllllllllllllIIlllllIIIlIIIllllI)) {
                final ItemStack lllllllllllllIIlllllIIIlIIlIIIII = this.inventorySlots.getSlot(lllllllllllllIIlllllIIIlIIIllllI.slotNumber).getStack();
                this.mc.playerController.sendSlotPacket(lllllllllllllIIlllllIIIlIIlIIIII, lllllllllllllIIlllllIIIlIIIllllI.slotNumber - this.inventorySlots.inventorySlots.size() + GuiContainerCreative.lIIIlllIlIlllI[9] + GuiContainerCreative.lIIIlllIlIlllI[11]);
            }
        }
    }
    
    @Override
    protected void keyTyped(final char lllllllllllllIIlllllIIIIllllllll, final int lllllllllllllIIlllllIIIIlllllllI) throws IOException {
        if (llIIIllIlIlllIl(GuiContainerCreative.selectedTabIndex, CreativeTabs.tabAllSearch.getTabIndex())) {
            if (llIIIllIllIIIII(GameSettings.isKeyDown(this.mc.gameSettings.keyBindChat) ? 1 : 0)) {
                this.setCurrentCreativeTab(CreativeTabs.tabAllSearch);
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                super.keyTyped(lllllllllllllIIlllllIIIIllllllll, lllllllllllllIIlllllIIIIlllllllI);
                "".length();
                if ((0x9E ^ 0xBD ^ (0x81 ^ 0xA6)) <= "   ".length()) {
                    return;
                }
            }
        }
        else {
            if (llIIIllIllIIIII(this.field_147057_D ? 1 : 0)) {
                this.field_147057_D = (GuiContainerCreative.lIIIlllIlIlllI[0] != 0);
                this.searchField.setText(GuiContainerCreative.lIIIlllIlIlIll[GuiContainerCreative.lIIIlllIlIlllI[8]]);
            }
            if (llIIIllIlIllIlI(this.checkHotbarKeys(lllllllllllllIIlllllIIIIlllllllI) ? 1 : 0)) {
                if (llIIIllIllIIIII(this.searchField.textboxKeyTyped(lllllllllllllIIlllllIIIIllllllll, lllllllllllllIIlllllIIIIlllllllI) ? 1 : 0)) {
                    this.updateCreativeSearch();
                    "".length();
                    if (" ".length() >= "  ".length()) {
                        return;
                    }
                }
                else {
                    super.keyTyped(lllllllllllllIIlllllIIIIllllllll, lllllllllllllIIlllllIIIIlllllllI);
                }
            }
        }
    }
    
    private static String llIIIllIlIlIlII(final String lllllllllllllIIllllIlllllIIlIlII, final String lllllllllllllIIllllIlllllIIlIIll) {
        try {
            final SecretKeySpec lllllllllllllIIllllIlllllIIllIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllIlllllIIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllllIlllllIIllIII = Cipher.getInstance("Blowfish");
            lllllllllllllIIllllIlllllIIllIII.init(GuiContainerCreative.lIIIlllIlIlllI[8], lllllllllllllIIllllIlllllIIllIIl);
            return new String(lllllllllllllIIllllIlllllIIllIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllIlllllIIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllIlllllIIlIlll) {
            lllllllllllllIIllllIlllllIIlIlll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void handleMouseInput() throws IOException {
        super.handleMouseInput();
        int lllllllllllllIIlllllIIIIIllllllI = Mouse.getEventDWheel();
        if (llIIIllIllIIIII(lllllllllllllIIlllllIIIIIllllllI) && llIIIllIllIIIII(this.needsScrollBars() ? 1 : 0)) {
            final int lllllllllllllIIlllllIIIIIlllllIl = ((ContainerCreative)this.inventorySlots).itemList.size() / GuiContainerCreative.lIIIlllIlIlllI[9] - GuiContainerCreative.lIIIlllIlIlllI[7];
            if (llIIIllIllIIlIl(lllllllllllllIIlllllIIIIIllllllI)) {
                lllllllllllllIIlllllIIIIIllllllI = GuiContainerCreative.lIIIlllIlIlllI[1];
            }
            if (llIIIllIllIIllI(lllllllllllllIIlllllIIIIIllllllI)) {
                lllllllllllllIIlllllIIIIIllllllI = GuiContainerCreative.lIIIlllIlIlllI[17];
            }
            this.currentScroll -= (float)(lllllllllllllIIlllllIIIIIllllllI / (double)lllllllllllllIIlllllIIIIIlllllIl);
            this.currentScroll = MathHelper.clamp_float(this.currentScroll, 0.0f, 1.0f);
            ((ContainerCreative)this.inventorySlots).scrollTo(this.currentScroll);
        }
    }
    
    @Override
    public void drawScreen(final int lllllllllllllIIlllllIIIIIlIlllIl, final int lllllllllllllIIlllllIIIIIlIlllII, final float lllllllllllllIIlllllIIIIIllIIlll) {
        final boolean lllllllllllllIIlllllIIIIIllIIllI = Mouse.isButtonDown(GuiContainerCreative.lIIIlllIlIlllI[0]);
        final int lllllllllllllIIlllllIIIIIllIIlIl = this.guiLeft;
        final int lllllllllllllIIlllllIIIIIllIIlII = this.guiTop;
        final int lllllllllllllIIlllllIIIIIllIIIll = lllllllllllllIIlllllIIIIIllIIlIl + GuiContainerCreative.lIIIlllIlIlllI[26];
        final int lllllllllllllIIlllllIIIIIllIIIlI = lllllllllllllIIlllllIIIIIllIIlII + GuiContainerCreative.lIIIlllIlIlllI[23];
        final int lllllllllllllIIlllllIIIIIllIIIIl = lllllllllllllIIlllllIIIIIllIIIll + GuiContainerCreative.lIIIlllIlIlllI[27];
        final int lllllllllllllIIlllllIIIIIllIIIII = lllllllllllllIIlllllIIIIIllIIIlI + GuiContainerCreative.lIIIlllIlIlllI[24];
        if (llIIIllIlIllIlI(this.wasClicking ? 1 : 0) && llIIIllIllIIIII(lllllllllllllIIlllllIIIIIllIIllI ? 1 : 0) && llIIIllIllIIIIl(lllllllllllllIIlllllIIIIIlIlllIl, lllllllllllllIIlllllIIIIIllIIIll) && llIIIllIllIIIIl(lllllllllllllIIlllllIIIIIlIlllII, lllllllllllllIIlllllIIIIIllIIIlI) && llIIIllIllIIIll(lllllllllllllIIlllllIIIIIlIlllIl, lllllllllllllIIlllllIIIIIllIIIIl) && llIIIllIllIIIll(lllllllllllllIIlllllIIIIIlIlllII, lllllllllllllIIlllllIIIIIllIIIII)) {
            this.isScrolling = this.needsScrollBars();
        }
        if (llIIIllIlIllIlI(lllllllllllllIIlllllIIIIIllIIllI ? 1 : 0)) {
            this.isScrolling = (GuiContainerCreative.lIIIlllIlIlllI[0] != 0);
        }
        this.wasClicking = lllllllllllllIIlllllIIIIIllIIllI;
        if (llIIIllIllIIIII(this.isScrolling ? 1 : 0)) {
            this.currentScroll = (lllllllllllllIIlllllIIIIIlIlllII - lllllllllllllIIlllllIIIIIllIIIlI - 7.5f) / (lllllllllllllIIlllllIIIIIllIIIII - lllllllllllllIIlllllIIIIIllIIIlI - 15.0f);
            this.currentScroll = MathHelper.clamp_float(this.currentScroll, 0.0f, 1.0f);
            ((ContainerCreative)this.inventorySlots).scrollTo(this.currentScroll);
        }
        super.drawScreen(lllllllllllllIIlllllIIIIIlIlllIl, lllllllllllllIIlllllIIIIIlIlllII, lllllllllllllIIlllllIIIIIllIIlll);
        final short lllllllllllllIIlllllIIIIIlIlIIII;
        final double lllllllllllllIIlllllIIIIIlIlIIIl = ((CreativeTabs[])(Object)(lllllllllllllIIlllllIIIIIlIlIIII = (short)(Object)CreativeTabs.creativeTabArray)).length;
        double lllllllllllllIIlllllIIIIIlIlIIlI = GuiContainerCreative.lIIIlllIlIlllI[0];
        "".length();
        if ("   ".length() < 0) {
            return;
        }
        while (!llIIIllIllIIIIl((int)lllllllllllllIIlllllIIIIIlIlIIlI, (int)lllllllllllllIIlllllIIIIIlIlIIIl)) {
            final CreativeTabs lllllllllllllIIlllllIIIIIlIlllll = lllllllllllllIIlllllIIIIIlIlIIII[lllllllllllllIIlllllIIIIIlIlIIlI];
            if (llIIIllIllIIIII(this.renderCreativeInventoryHoveringText(lllllllllllllIIlllllIIIIIlIlllll, lllllllllllllIIlllllIIIIIlIlllIl, lllllllllllllIIlllllIIIIIlIlllII) ? 1 : 0)) {
                "".length();
                if ((0x37 ^ 0x33) <= " ".length()) {
                    return;
                }
                break;
            }
            else {
                ++lllllllllllllIIlllllIIIIIlIlIIlI;
            }
        }
        if (llIIIllIlIllllI(this.field_147064_C) && llIIIllIlIllIll(GuiContainerCreative.selectedTabIndex, CreativeTabs.tabInventory.getTabIndex()) && llIIIllIllIIIII(this.isPointInRegion(this.field_147064_C.xDisplayPosition, this.field_147064_C.yDisplayPosition, GuiContainerCreative.lIIIlllIlIlllI[28], GuiContainerCreative.lIIIlllIlIlllI[28], lllllllllllllIIlllllIIIIIlIlllIl, lllllllllllllIIlllllIIIIIlIlllII) ? 1 : 0)) {
            this.drawCreativeTabHoveringText(I18n.format(GuiContainerCreative.lIIIlllIlIlIll[GuiContainerCreative.lIIIlllIlIlllI[6]], new Object[GuiContainerCreative.lIIIlllIlIlllI[0]]), lllllllllllllIIlllllIIIIIlIlllIl, lllllllllllllIIlllllIIIIIlIlllII);
        }
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.disableLighting();
    }
    
    @Override
    protected void actionPerformed(final GuiButton lllllllllllllIIllllIllllllIIIllI) throws IOException {
        if (llIIIllIlIllIlI(lllllllllllllIIllllIllllllIIIllI.id)) {
            this.mc.displayGuiScreen(new GuiAchievements(this, this.mc.thePlayer.getStatFileWriter()));
        }
        if (llIIIllIlIllIll(lllllllllllllIIllllIllllllIIIllI.id, GuiContainerCreative.lIIIlllIlIlllI[1])) {
            this.mc.displayGuiScreen(new GuiStats(this, this.mc.thePlayer.getStatFileWriter()));
        }
    }
    
    protected boolean func_147049_a(final CreativeTabs lllllllllllllIIlllllIIIIIIIIllII, final int lllllllllllllIIlllllIIIIIIIIlIll, final int lllllllllllllIIlllllIIIIIIIIIIll) {
        final int lllllllllllllIIlllllIIIIIIIIlIIl = lllllllllllllIIlllllIIIIIIIIllII.getTabColumn();
        int lllllllllllllIIlllllIIIIIIIIlIII = GuiContainerCreative.lIIIlllIlIlllI[35] * lllllllllllllIIlllllIIIIIIIIlIIl;
        int lllllllllllllIIlllllIIIIIIIIIlll = GuiContainerCreative.lIIIlllIlIlllI[0];
        if (llIIIllIlIllIll(lllllllllllllIIlllllIIIIIIIIlIIl, GuiContainerCreative.lIIIlllIlIlllI[7])) {
            lllllllllllllIIlllllIIIIIIIIlIII = this.xSize - GuiContainerCreative.lIIIlllIlIlllI[35] + GuiContainerCreative.lIIIlllIlIlllI[8];
            "".length();
            if ("  ".length() < " ".length()) {
                return ((0x62 ^ 0x36) & ~(0x64 ^ 0x30)) != 0x0;
            }
        }
        else if (llIIIllIllIIlIl(lllllllllllllIIlllllIIIIIIIIlIIl)) {
            lllllllllllllIIlllllIIIIIIIIlIII += lllllllllllllIIlllllIIIIIIIIlIIl;
        }
        if (llIIIllIllIIIII(lllllllllllllIIlllllIIIIIIIIllII.isTabInFirstRow() ? 1 : 0)) {
            lllllllllllllIIlllllIIIIIIIIIlll -= 32;
            "".length();
            if (((21 + 124 - 118 + 140 ^ 11 + 51 + 90 + 30) & (0xB6 ^ 0x8F ^ (0x2 ^ 0x2A) ^ -" ".length())) != 0x0) {
                return ((29 + 15 + 105 + 72 ^ 84 + 40 + 22 + 12) & (0x68 ^ 0x25 ^ (0x41 ^ 0x4F) ^ -" ".length())) != 0x0;
            }
        }
        else {
            lllllllllllllIIlllllIIIIIIIIIlll += this.ySize;
        }
        if (llIIIllIllIIIIl(lllllllllllllIIlllllIIIIIIIIlIll, lllllllllllllIIlllllIIIIIIIIlIII) && llIIIllIllIIlII(lllllllllllllIIlllllIIIIIIIIlIll, lllllllllllllIIlllllIIIIIIIIlIII + GuiContainerCreative.lIIIlllIlIlllI[35]) && llIIIllIllIIIIl(lllllllllllllIIlllllIIIIIIIIIIll, lllllllllllllIIlllllIIIIIIIIIlll) && llIIIllIllIIlII(lllllllllllllIIlllllIIIIIIIIIIll, lllllllllllllIIlllllIIIIIIIIIlll + GuiContainerCreative.lIIIlllIlIlllI[36])) {
            return GuiContainerCreative.lIIIlllIlIlllI[1] != 0;
        }
        return GuiContainerCreative.lIIIlllIlIlllI[0] != 0;
    }
    
    private static boolean llIIIllIllIIIIl(final int lllllllllllllIIllllIlllllIIIlIlI, final int lllllllllllllIIllllIlllllIIIlIIl) {
        return lllllllllllllIIllllIlllllIIIlIlI >= lllllllllllllIIllllIlllllIIIlIIl;
    }
    
    private static boolean llIIIllIlIllIll(final int lllllllllllllIIllllIlllllIIIlllI, final int lllllllllllllIIllllIlllllIIIllIl) {
        return lllllllllllllIIllllIlllllIIIlllI == lllllllllllllIIllllIlllllIIIllIl;
    }
    
    private static boolean llIIIllIlIllIlI(final int lllllllllllllIIllllIllllIlllIlIl) {
        return lllllllllllllIIllllIllllIlllIlIl == 0;
    }
    
    static {
        llIIIllIlIllIIl();
        llIIIllIlIlIllI();
        creativeInventoryTabs = new ResourceLocation(GuiContainerCreative.lIIIlllIlIlIll[GuiContainerCreative.lIIIlllIlIlllI[0]]);
        GuiContainerCreative.field_147060_v = new InventoryBasic(GuiContainerCreative.lIIIlllIlIlIll[GuiContainerCreative.lIIIlllIlIlllI[1]], (boolean)(GuiContainerCreative.lIIIlllIlIlllI[1] != 0), GuiContainerCreative.lIIIlllIlIlllI[2]);
        GuiContainerCreative.selectedTabIndex = CreativeTabs.tabBlock.getTabIndex();
    }
    
    @Override
    public void onGuiClosed() {
        super.onGuiClosed();
        if (llIIIllIlIllllI(this.mc.thePlayer) && llIIIllIlIllllI(this.mc.thePlayer.inventory)) {
            this.mc.thePlayer.inventoryContainer.removeCraftingFromCrafters(this.field_147059_E);
        }
        Keyboard.enableRepeatEvents((boolean)(GuiContainerCreative.lIIIlllIlIlllI[0] != 0));
    }
    
    private static boolean llIIIllIllIIlII(final int lllllllllllllIIllllIlllllIIIIIlI, final int lllllllllllllIIllllIlllllIIIIIIl) {
        return lllllllllllllIIllllIlllllIIIIIlI <= lllllllllllllIIllllIlllllIIIIIIl;
    }
    
    @Override
    protected void drawGuiContainerForegroundLayer(final int lllllllllllllIIlllllIIIIlllIIIIl, final int lllllllllllllIIlllllIIIIlllIIIII) {
        final CreativeTabs lllllllllllllIIlllllIIIIllIlllll = CreativeTabs.creativeTabArray[GuiContainerCreative.selectedTabIndex];
        if (llIIIllIllIIIII(lllllllllllllIIlllllIIIIllIlllll.drawInForegroundOfTab() ? 1 : 0)) {
            GlStateManager.disableBlend();
            this.fontRendererObj.drawString(I18n.format(lllllllllllllIIlllllIIIIllIlllll.getTranslatedTabLabel(), new Object[GuiContainerCreative.lIIIlllIlIlllI[0]]), GuiContainerCreative.lIIIlllIlIlllI[18], GuiContainerCreative.lIIIlllIlIlllI[13], GuiContainerCreative.lIIIlllIlIlllI[19]);
            "".length();
        }
    }
    
    @Override
    protected void mouseClicked(final int lllllllllllllIIlllllIIIIllIIlIlI, final int lllllllllllllIIlllllIIIIllIlIIII, final int lllllllllllllIIlllllIIIIllIIllll) throws IOException {
        if (llIIIllIlIllIlI(lllllllllllllIIlllllIIIIllIIllll)) {
            final int lllllllllllllIIlllllIIIIllIIlllI = lllllllllllllIIlllllIIIIllIIlIlI - this.guiLeft;
            final int lllllllllllllIIlllllIIIIllIIllIl = lllllllllllllIIlllllIIIIllIlIIII - this.guiTop;
            final short lllllllllllllIIlllllIIIIllIIIIlI;
            final boolean lllllllllllllIIlllllIIIIllIIIIll = ((CreativeTabs[])(Object)(lllllllllllllIIlllllIIIIllIIIIlI = (short)(Object)CreativeTabs.creativeTabArray)).length != 0;
            String lllllllllllllIIlllllIIIIllIIIlII = (String)GuiContainerCreative.lIIIlllIlIlllI[0];
            "".length();
            if ((0xB1 ^ 0xB5) == ((0xF2 ^ 0xC5) & ~(0x8F ^ 0xB8))) {
                return;
            }
            while (!llIIIllIllIIIIl((int)lllllllllllllIIlllllIIIIllIIIlII, lllllllllllllIIlllllIIIIllIIIIll ? 1 : 0)) {
                final CreativeTabs lllllllllllllIIlllllIIIIllIIllII = lllllllllllllIIlllllIIIIllIIIIlI[lllllllllllllIIlllllIIIIllIIIlII];
                if (llIIIllIllIIIII(this.func_147049_a(lllllllllllllIIlllllIIIIllIIllII, lllllllllllllIIlllllIIIIllIIlllI, lllllllllllllIIlllllIIIIllIIllIl) ? 1 : 0)) {
                    return;
                }
                ++lllllllllllllIIlllllIIIIllIIIlII;
            }
        }
        super.mouseClicked(lllllllllllllIIlllllIIIIllIIlIlI, lllllllllllllIIlllllIIIIllIlIIII, lllllllllllllIIlllllIIIIllIIllll);
    }
    
    @Override
    protected void mouseReleased(final int lllllllllllllIIlllllIIIIlIllIllI, final int lllllllllllllIIlllllIIIIlIlIlllI, final int lllllllllllllIIlllllIIIIlIllIlII) {
        if (llIIIllIlIllIlI(lllllllllllllIIlllllIIIIlIllIlII)) {
            final int lllllllllllllIIlllllIIIIlIllIIll = lllllllllllllIIlllllIIIIlIllIllI - this.guiLeft;
            final int lllllllllllllIIlllllIIIIlIllIIlI = lllllllllllllIIlllllIIIIlIlIlllI - this.guiTop;
            final double lllllllllllllIIlllllIIIIlIlIIlll;
            final double lllllllllllllIIlllllIIIIlIlIlIII = ((CreativeTabs[])(Object)(lllllllllllllIIlllllIIIIlIlIIlll = (double)(Object)CreativeTabs.creativeTabArray)).length;
            Exception lllllllllllllIIlllllIIIIlIlIlIIl = (Exception)GuiContainerCreative.lIIIlllIlIlllI[0];
            "".length();
            if (null != null) {
                return;
            }
            while (!llIIIllIllIIIIl((int)lllllllllllllIIlllllIIIIlIlIlIIl, (int)lllllllllllllIIlllllIIIIlIlIlIII)) {
                final CreativeTabs lllllllllllllIIlllllIIIIlIllIIIl = lllllllllllllIIlllllIIIIlIlIIlll[lllllllllllllIIlllllIIIIlIlIlIIl];
                if (llIIIllIllIIIII(this.func_147049_a(lllllllllllllIIlllllIIIIlIllIIIl, lllllllllllllIIlllllIIIIlIllIIll, lllllllllllllIIlllllIIIIlIllIIlI) ? 1 : 0)) {
                    this.setCurrentCreativeTab(lllllllllllllIIlllllIIIIlIllIIIl);
                    return;
                }
                ++lllllllllllllIIlllllIIIIlIlIlIIl;
            }
        }
        super.mouseReleased(lllllllllllllIIlllllIIIIlIllIllI, lllllllllllllIIlllllIIIIlIlIlllI, lllllllllllllIIlllllIIIIlIllIlII);
    }
    
    private void updateCreativeSearch() {
        final ContainerCreative lllllllllllllIIlllllIIIIllllIlII = (ContainerCreative)this.inventorySlots;
        lllllllllllllIIlllllIIIIllllIlII.itemList.clear();
        double lllllllllllllIIlllllIIIIlllIlIIl = (double)Item.itemRegistry.iterator();
        "".length();
        if ("   ".length() <= -" ".length()) {
            return;
        }
        while (!llIIIllIlIllIlI(((Iterator)lllllllllllllIIlllllIIIIlllIlIIl).hasNext() ? 1 : 0)) {
            final Item lllllllllllllIIlllllIIIIllllIIll = ((Iterator<Item>)lllllllllllllIIlllllIIIIlllIlIIl).next();
            if (llIIIllIlIllllI(lllllllllllllIIlllllIIIIllllIIll) && llIIIllIlIllllI(lllllllllllllIIlllllIIIIllllIIll.getCreativeTab())) {
                lllllllllllllIIlllllIIIIllllIIll.getSubItems(lllllllllllllIIlllllIIIIllllIIll, null, lllllllllllllIIlllllIIIIllllIlII.itemList);
            }
        }
        final Enchantment[] enchantmentsBookList;
        final String lllllllllllllIIlllllIIIIlllIlIII = (String)(enchantmentsBookList = Enchantment.enchantmentsBookList).length;
        lllllllllllllIIlllllIIIIlllIlIIl = GuiContainerCreative.lIIIlllIlIlllI[0];
        "".length();
        if ((157 + 35 - 110 + 85 ^ 4 + 145 - 60 + 74) == " ".length()) {
            return;
        }
        while (!llIIIllIllIIIIl((int)lllllllllllllIIlllllIIIIlllIlIIl, (int)lllllllllllllIIlllllIIIIlllIlIII)) {
            final Enchantment lllllllllllllIIlllllIIIIllllIIlI = enchantmentsBookList[lllllllllllllIIlllllIIIIlllIlIIl];
            if (llIIIllIlIllllI(lllllllllllllIIlllllIIIIllllIIlI) && llIIIllIlIllllI(lllllllllllllIIlllllIIIIllllIIlI.type)) {
                Items.enchanted_book.getAll(lllllllllllllIIlllllIIIIllllIIlI, lllllllllllllIIlllllIIIIllllIlII.itemList);
            }
            ++lllllllllllllIIlllllIIIIlllIlIIl;
        }
        final Iterator<ItemStack> lllllllllllllIIlllllIIIIllllIIIl = lllllllllllllIIlllllIIIIllllIlII.itemList.iterator();
        final String lllllllllllllIIlllllIIIIllllIIII = this.searchField.getText().toLowerCase();
        "".length();
        if (((0x13 ^ 0x58) & ~(0x6C ^ 0x27)) != ((0xFC ^ 0xA6) & ~(0x6 ^ 0x5C))) {
            return;
        }
        while (!llIIIllIlIllIlI(lllllllllllllIIlllllIIIIllllIIIl.hasNext() ? 1 : 0)) {
            final ItemStack lllllllllllllIIlllllIIIIlllIllll = lllllllllllllIIlllllIIIIllllIIIl.next();
            boolean lllllllllllllIIlllllIIIIlllIlllI = GuiContainerCreative.lIIIlllIlIlllI[0] != 0;
            final char lllllllllllllIIlllllIIIIlllIIlIl = (char)lllllllllllllIIlllllIIIIlllIllll.getTooltip(this.mc.thePlayer, this.mc.gameSettings.advancedItemTooltips).iterator();
            "".length();
            if (null != null) {
                return;
            }
            while (!llIIIllIlIllIlI(((Iterator)lllllllllllllIIlllllIIIIlllIIlIl).hasNext() ? 1 : 0)) {
                final String lllllllllllllIIlllllIIIIlllIllIl = ((Iterator<String>)lllllllllllllIIlllllIIIIlllIIlIl).next();
                if (llIIIllIllIIIII(EnumChatFormatting.getTextWithoutFormattingCodes(lllllllllllllIIlllllIIIIlllIllIl).toLowerCase().contains(lllllllllllllIIlllllIIIIllllIIII) ? 1 : 0)) {
                    lllllllllllllIIlllllIIIIlllIlllI = (GuiContainerCreative.lIIIlllIlIlllI[1] != 0);
                    "".length();
                    if (null != null) {
                        return;
                    }
                    break;
                }
            }
            if (!llIIIllIlIllIlI(lllllllllllllIIlllllIIIIlllIlllI ? 1 : 0)) {
                continue;
            }
            lllllllllllllIIlllllIIIIllllIIIl.remove();
        }
        this.currentScroll = 0.0f;
        lllllllllllllIIlllllIIIIllllIlII.scrollTo(0.0f);
    }
    
    private static boolean llIIIllIllIIIlI(final int lllllllllllllIIllllIllllIlllIIll) {
        return lllllllllllllIIllllIllllIlllIIll >= 0;
    }
    
    private static boolean llIIIllIlIlllII(final Object lllllllllllllIIllllIllllIllllIIl) {
        return lllllllllllllIIllllIllllIllllIIl == null;
    }
    
    private static String llIIIllIlIlIIll(final String lllllllllllllIIllllIlllllIlIIIll, final String lllllllllllllIIllllIlllllIlIIIlI) {
        try {
            final SecretKeySpec lllllllllllllIIllllIlllllIlIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllIlllllIlIIIlI.getBytes(StandardCharsets.UTF_8)), GuiContainerCreative.lIIIlllIlIlllI[18]), "DES");
            final Cipher lllllllllllllIIllllIlllllIlIIlIl = Cipher.getInstance("DES");
            lllllllllllllIIllllIlllllIlIIlIl.init(GuiContainerCreative.lIIIlllIlIlllI[8], lllllllllllllIIllllIlllllIlIIllI);
            return new String(lllllllllllllIIllllIlllllIlIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllIlllllIlIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllIlllllIlIIlII) {
            lllllllllllllIIllllIlllllIlIIlII.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIIIllIllIIlIl(final int lllllllllllllIIllllIllllIllIllll) {
        return lllllllllllllIIllllIllllIllIllll > 0;
    }
    
    @Override
    protected void drawGuiContainerBackgroundLayer(final float lllllllllllllIIlllllIIIIIIlIIlII, final int lllllllllllllIIlllllIIIIIIlIIIll, final int lllllllllllllIIlllllIIIIIIIllIlI) {
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        RenderHelper.enableGUIStandardItemLighting();
        final CreativeTabs lllllllllllllIIlllllIIIIIIlIIIIl = CreativeTabs.creativeTabArray[GuiContainerCreative.selectedTabIndex];
        final double lllllllllllllIIlllllIIIIIIIlIlIl;
        final int length = (lllllllllllllIIlllllIIIIIIIlIlIl = (double)(Object)CreativeTabs.creativeTabArray).length;
        int lllllllllllllIIllllIlllllIIIlIlI = GuiContainerCreative.lIIIlllIlIlllI[0];
        "".length();
        if (((0x20 ^ 0x4E ^ (0x2D ^ 0x7A)) & (87 + 31 + 27 + 26 ^ 5 + 13 + 9 + 119 ^ -" ".length())) != 0x0) {
            return;
        }
        while (!llIIIllIllIIIIl(lllllllllllllIIllllIlllllIIIlIlI, length)) {
            final CreativeTabs lllllllllllllIIlllllIIIIIIlIIIII = lllllllllllllIIlllllIIIIIIIlIlIl[lllllllllllllIIllllIlllllIIIlIlI];
            this.mc.getTextureManager().bindTexture(GuiContainerCreative.creativeInventoryTabs);
            if (llIIIllIlIlllIl(lllllllllllllIIlllllIIIIIIlIIIII.getTabIndex(), GuiContainerCreative.selectedTabIndex)) {
                this.func_147051_a(lllllllllllllIIlllllIIIIIIlIIIII);
            }
            ++lllllllllllllIIllllIlllllIIIlIlI;
        }
        this.mc.getTextureManager().bindTexture(new ResourceLocation(String.valueOf(new StringBuilder(GuiContainerCreative.lIIIlllIlIlIll[GuiContainerCreative.lIIIlllIlIlllI[7]]).append(lllllllllllllIIlllllIIIIIIlIIIIl.getBackgroundImageName()))));
        this.drawTexturedModalRect(this.guiLeft, this.guiTop, GuiContainerCreative.lIIIlllIlIlllI[0], GuiContainerCreative.lIIIlllIlIlllI[0], this.xSize, this.ySize);
        this.searchField.drawTextBox();
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        final int lllllllllllllIIlllllIIIIIIIlllll = this.guiLeft + GuiContainerCreative.lIIIlllIlIlllI[26];
        final int lllllllllllllIIlllllIIIIIIIllllI = this.guiTop + GuiContainerCreative.lIIIlllIlIlllI[23];
        final int lllllllllllllIIlllllIIIIIIIlllIl = lllllllllllllIIlllllIIIIIIIllllI + GuiContainerCreative.lIIIlllIlIlllI[24];
        this.mc.getTextureManager().bindTexture(GuiContainerCreative.creativeInventoryTabs);
        if (llIIIllIllIIIII(lllllllllllllIIlllllIIIIIIlIIIIl.shouldHidePlayerInventory() ? 1 : 0)) {
            final int llllllllllllIlllIlIlllIIIlIIIllI = lllllllllllllIIlllllIIIIIIIlllll;
            final int llllllllllllIlllIlIlllIIIlIIIlIl = lllllllllllllIIlllllIIIIIIIllllI + (int)((lllllllllllllIIlllllIIIIIIIlllIl - lllllllllllllIIlllllIIIIIIIllllI - GuiContainerCreative.lIIIlllIlIlllI[29]) * this.currentScroll);
            final int n = GuiContainerCreative.lIIIlllIlIlllI[30];
            int n2;
            if (llIIIllIllIIIII(this.needsScrollBars() ? 1 : 0)) {
                n2 = GuiContainerCreative.lIIIlllIlIlllI[0];
                "".length();
                if ("  ".length() > "   ".length()) {
                    return;
                }
            }
            else {
                n2 = GuiContainerCreative.lIIIlllIlIlllI[31];
            }
            this.drawTexturedModalRect(llllllllllllIlllIlIlllIIIlIIIllI, llllllllllllIlllIlIlllIIIlIIIlIl, n + n2, GuiContainerCreative.lIIIlllIlIlllI[0], GuiContainerCreative.lIIIlllIlIlllI[31], GuiContainerCreative.lIIIlllIlIlllI[15]);
        }
        this.func_147051_a(lllllllllllllIIlllllIIIIIIlIIIIl);
        if (llIIIllIlIlllll(lllllllllllllIIlllllIIIIIIlIIIIl, CreativeTabs.tabInventory)) {
            GuiInventory.drawEntityOnScreen(this.guiLeft + GuiContainerCreative.lIIIlllIlIlllI[32], this.guiTop + GuiContainerCreative.lIIIlllIlIlllI[2], GuiContainerCreative.lIIIlllIlIlllI[33], (float)(this.guiLeft + GuiContainerCreative.lIIIlllIlIlllI[32] - lllllllllllllIIlllllIIIIIIlIIIll), (float)(this.guiTop + GuiContainerCreative.lIIIlllIlIlllI[2] - GuiContainerCreative.lIIIlllIlIlllI[34] - lllllllllllllIIlllllIIIIIIIllIlI), this.mc.thePlayer);
        }
    }
    
    private static boolean llIIIllIlIllllI(final Object lllllllllllllIIllllIllllIlllllll) {
        return lllllllllllllIIllllIllllIlllllll != null;
    }
    
    private static String llIIIllIlIlIIlI(String lllllllllllllIIllllIlllllIllIIll, final String lllllllllllllIIllllIlllllIllIlll) {
        lllllllllllllIIllllIlllllIllIIll = new String(Base64.getDecoder().decode(lllllllllllllIIllllIlllllIllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllllIlllllIllIllI = new StringBuilder();
        final char[] lllllllllllllIIllllIlllllIllIlIl = lllllllllllllIIllllIlllllIllIlll.toCharArray();
        int lllllllllllllIIllllIlllllIllIlII = GuiContainerCreative.lIIIlllIlIlllI[0];
        final char lllllllllllllIIllllIlllllIlIlllI = (Object)lllllllllllllIIllllIlllllIllIIll.toCharArray();
        final Exception lllllllllllllIIllllIlllllIlIllIl = (Exception)lllllllllllllIIllllIlllllIlIlllI.length;
        short lllllllllllllIIllllIlllllIlIllII = (short)GuiContainerCreative.lIIIlllIlIlllI[0];
        while (llIIIllIllIIIll(lllllllllllllIIllllIlllllIlIllII, (int)lllllllllllllIIllllIlllllIlIllIl)) {
            final char lllllllllllllIIllllIlllllIlllIIl = lllllllllllllIIllllIlllllIlIlllI[lllllllllllllIIllllIlllllIlIllII];
            lllllllllllllIIllllIlllllIllIllI.append((char)(lllllllllllllIIllllIlllllIlllIIl ^ lllllllllllllIIllllIlllllIllIlIl[lllllllllllllIIllllIlllllIllIlII % lllllllllllllIIllllIlllllIllIlIl.length]));
            "".length();
            ++lllllllllllllIIllllIlllllIllIlII;
            ++lllllllllllllIIllllIlllllIlIllII;
            "".length();
            if (((139 + 71 - 162 + 98 ^ 11 + 126 - 68 + 120) & (0x95 ^ 0xC2 ^ (0x15 ^ 0x6D) ^ -" ".length())) > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllllIlllllIllIllI);
    }
    
    @Override
    public void initGui() {
        if (llIIIllIllIIIII(this.mc.playerController.isInCreativeMode() ? 1 : 0)) {
            super.initGui();
            this.buttonList.clear();
            Keyboard.enableRepeatEvents((boolean)(GuiContainerCreative.lIIIlllIlIlllI[1] != 0));
            this.searchField = new GuiTextField(GuiContainerCreative.lIIIlllIlIlllI[0], this.fontRendererObj, this.guiLeft + GuiContainerCreative.lIIIlllIlIlllI[12], this.guiTop + GuiContainerCreative.lIIIlllIlIlllI[13], GuiContainerCreative.lIIIlllIlIlllI[14], this.fontRendererObj.FONT_HEIGHT);
            this.searchField.setMaxStringLength(GuiContainerCreative.lIIIlllIlIlllI[15]);
            this.searchField.setEnableBackgroundDrawing((boolean)(GuiContainerCreative.lIIIlllIlIlllI[0] != 0));
            this.searchField.setVisible((boolean)(GuiContainerCreative.lIIIlllIlIlllI[0] != 0));
            this.searchField.setTextColor(GuiContainerCreative.lIIIlllIlIlllI[16]);
            final int lllllllllllllIIlllllIIIlIIIIllII = GuiContainerCreative.selectedTabIndex;
            GuiContainerCreative.selectedTabIndex = GuiContainerCreative.lIIIlllIlIlllI[17];
            this.setCurrentCreativeTab(CreativeTabs.creativeTabArray[lllllllllllllIIlllllIIIlIIIIllII]);
            this.field_147059_E = new CreativeCrafting(this.mc);
            this.mc.thePlayer.inventoryContainer.onCraftGuiOpened(this.field_147059_E);
            "".length();
            if ((0x1A ^ 0x44 ^ (0xE8 ^ 0xB2)) != (121 + 42 - 159 + 142 ^ 98 + 109 - 205 + 148)) {
                return;
            }
        }
        else {
            this.mc.displayGuiScreen(new GuiInventory(this.mc.thePlayer));
        }
    }
    
    @Override
    protected void updateActivePotionEffects() {
        final int lllllllllllllIIlllllIIIlIIIlIIlI = this.guiLeft;
        super.updateActivePotionEffects();
        if (llIIIllIlIllllI(this.searchField) && llIIIllIlIlllIl(this.guiLeft, lllllllllllllIIlllllIIIlIIIlIIlI)) {
            this.searchField.xPosition = this.guiLeft + GuiContainerCreative.lIIIlllIlIlllI[12];
        }
    }
    
    @Override
    public void updateScreen() {
        if (llIIIllIlIllIlI(this.mc.playerController.isInCreativeMode() ? 1 : 0)) {
            this.mc.displayGuiScreen(new GuiInventory(this.mc.thePlayer));
        }
        this.updateActivePotionEffects();
    }
    
    private static void llIIIllIlIlIllI() {
        (lIIIlllIlIlIll = new String[GuiContainerCreative.lIIIlllIlIlllI[13]])[GuiContainerCreative.lIIIlllIlIlllI[0]] = llIIIllIlIlIIlI("BTAeLTIDMBV2IAQ8STooHyEHMCkUJ0k6NRQ0EjAxFAoPNzEUOxI2NQh6EjglAnsWNyA=", "qUfYG");
        GuiContainerCreative.lIIIlllIlIlIll[GuiContainerCreative.lIIIlllIlIlllI[1]] = llIIIllIlIlIIll("+Cz1lFjwJ8Y=", "TOTMI");
        GuiContainerCreative.lIIIlllIlIlIll[GuiContainerCreative.lIIIlllIlIlllI[8]] = llIIIllIlIlIIll("KwGbqdOFQ+c=", "cqhBp");
        GuiContainerCreative.lIIIlllIlIlIll[GuiContainerCreative.lIIIlllIlIlllI[10]] = llIIIllIlIlIlII("JXNgR+NNAvM=", "RFZFU");
        GuiContainerCreative.lIIIlllIlIlIll[GuiContainerCreative.lIIIlllIlIlllI[6]] = llIIIllIlIlIlII("DtNW8jjicAi+oJudTea/Qwd9pM32WQlj", "jOGrE");
        GuiContainerCreative.lIIIlllIlIlIll[GuiContainerCreative.lIIIlllIlIlllI[7]] = llIIIllIlIlIIll("UJ2XAW/aO25/Kin8AGFfGPL2Rve4cR0y1fIaxbfbfvymn8QwUwCuYLir4bF7IVAA", "QZWbM");
    }
    
    private static boolean llIIIllIllIIIll(final int lllllllllllllIIllllIlllllIIIIllI, final int lllllllllllllIIllllIlllllIIIIlIl) {
        return lllllllllllllIIllllIlllllIIIIllI < lllllllllllllIIllllIlllllIIIIlIl;
    }
    
    public int getSelectedTabIndex() {
        return GuiContainerCreative.selectedTabIndex;
    }
    
    private void setCurrentCreativeTab(final CreativeTabs lllllllllllllIIlllllIIIIlIIllIII) {
        final int lllllllllllllIIlllllIIIIlIIlIlll = GuiContainerCreative.selectedTabIndex;
        GuiContainerCreative.selectedTabIndex = lllllllllllllIIlllllIIIIlIIllIII.getTabIndex();
        final ContainerCreative lllllllllllllIIlllllIIIIlIIlIllI = (ContainerCreative)this.inventorySlots;
        this.dragSplittingSlots.clear();
        lllllllllllllIIlllllIIIIlIIlIllI.itemList.clear();
        lllllllllllllIIlllllIIIIlIIllIII.displayAllReleventItems(lllllllllllllIIlllllIIIIlIIlIllI.itemList);
        if (llIIIllIlIlllll(lllllllllllllIIlllllIIIIlIIllIII, CreativeTabs.tabInventory)) {
            final Container lllllllllllllIIlllllIIIIlIIlIlIl = this.mc.thePlayer.inventoryContainer;
            if (llIIIllIlIlllII(this.field_147063_B)) {
                this.field_147063_B = lllllllllllllIIlllllIIIIlIIlIllI.inventorySlots;
            }
            lllllllllllllIIlllllIIIIlIIlIllI.inventorySlots = (List<Slot>)Lists.newArrayList();
            int lllllllllllllIIlllllIIIIlIIlIlII = GuiContainerCreative.lIIIlllIlIlllI[0];
            "".length();
            if (((28 + 86 - 72 + 93 ^ 69 + 80 - 59 + 48) & (133 + 81 - 76 + 4 ^ 48 + 91 - 132 + 124 ^ -" ".length())) != 0x0) {
                return;
            }
            while (!llIIIllIllIIIIl(lllllllllllllIIlllllIIIIlIIlIlII, lllllllllllllIIlllllIIIIlIIlIlIl.inventorySlots.size())) {
                final Slot lllllllllllllIIlllllIIIIlIIlIIll = new CreativeSlot(lllllllllllllIIlllllIIIIlIIlIlIl.inventorySlots.get(lllllllllllllIIlllllIIIIlIIlIlII), lllllllllllllIIlllllIIIIlIIlIlII);
                lllllllllllllIIlllllIIIIlIIlIllI.inventorySlots.add(lllllllllllllIIlllllIIIIlIIlIIll);
                "".length();
                if (llIIIllIllIIIIl(lllllllllllllIIlllllIIIIlIIlIlII, GuiContainerCreative.lIIIlllIlIlllI[7]) && llIIIllIllIIIll(lllllllllllllIIlllllIIIIlIIlIlII, GuiContainerCreative.lIIIlllIlIlllI[9])) {
                    final int lllllllllllllIIlllllIIIIlIIlIIlI = lllllllllllllIIlllllIIIIlIIlIlII - GuiContainerCreative.lIIIlllIlIlllI[7];
                    final int lllllllllllllIIlllllIIIIlIIlIIIl = lllllllllllllIIlllllIIIIlIIlIIlI / GuiContainerCreative.lIIIlllIlIlllI[8];
                    final int lllllllllllllIIlllllIIIIlIIlIIII = lllllllllllllIIlllllIIIIlIIlIIlI % GuiContainerCreative.lIIIlllIlIlllI[8];
                    lllllllllllllIIlllllIIIIlIIlIIll.xDisplayPosition = GuiContainerCreative.lIIIlllIlIlllI[9] + lllllllllllllIIlllllIIIIlIIlIIIl * GuiContainerCreative.lIIIlllIlIlllI[20];
                    lllllllllllllIIlllllIIIIlIIlIIll.yDisplayPosition = GuiContainerCreative.lIIIlllIlIlllI[13] + lllllllllllllIIlllllIIIIlIIlIIII * GuiContainerCreative.lIIIlllIlIlllI[21];
                    "".length();
                    if (-" ".length() > -" ".length()) {
                        return;
                    }
                }
                else if (llIIIllIllIIIlI(lllllllllllllIIlllllIIIIlIIlIlII) && llIIIllIllIIIll(lllllllllllllIIlllllIIIIlIIlIlII, GuiContainerCreative.lIIIlllIlIlllI[7])) {
                    lllllllllllllIIlllllIIIIlIIlIIll.yDisplayPosition = GuiContainerCreative.lIIIlllIlIlllI[22];
                    lllllllllllllIIlllllIIIIlIIlIIll.xDisplayPosition = GuiContainerCreative.lIIIlllIlIlllI[22];
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else if (llIIIllIllIIIll(lllllllllllllIIlllllIIIIlIIlIlII, lllllllllllllIIlllllIIIIlIIlIlIl.inventorySlots.size())) {
                    final int lllllllllllllIIlllllIIIIlIIIllll = lllllllllllllIIlllllIIIIlIIlIlII - GuiContainerCreative.lIIIlllIlIlllI[9];
                    final int lllllllllllllIIlllllIIIIlIIIlllI = lllllllllllllIIlllllIIIIlIIIllll % GuiContainerCreative.lIIIlllIlIlllI[9];
                    final int lllllllllllllIIlllllIIIIlIIIllIl = lllllllllllllIIlllllIIIIlIIIllll / GuiContainerCreative.lIIIlllIlIlllI[9];
                    lllllllllllllIIlllllIIIIlIIlIIll.xDisplayPosition = GuiContainerCreative.lIIIlllIlIlllI[9] + lllllllllllllIIlllllIIIIlIIIlllI * GuiContainerCreative.lIIIlllIlIlllI[23];
                    if (llIIIllIllIIIIl(lllllllllllllIIlllllIIIIlIIlIlII, GuiContainerCreative.lIIIlllIlIlllI[11])) {
                        lllllllllllllIIlllllIIIIlIIlIIll.yDisplayPosition = GuiContainerCreative.lIIIlllIlIlllI[24];
                        "".length();
                        if ((0x52 ^ 0x56) == 0x0) {
                            return;
                        }
                    }
                    else {
                        lllllllllllllIIlllllIIIIlIIlIIll.yDisplayPosition = GuiContainerCreative.lIIIlllIlIlllI[20] + lllllllllllllIIlllllIIIIlIIIllIl * GuiContainerCreative.lIIIlllIlIlllI[23];
                    }
                }
                ++lllllllllllllIIlllllIIIIlIIlIlII;
            }
            this.field_147064_C = new Slot(GuiContainerCreative.field_147060_v, GuiContainerCreative.lIIIlllIlIlllI[0], GuiContainerCreative.lIIIlllIlIlllI[25], GuiContainerCreative.lIIIlllIlIlllI[24]);
            lllllllllllllIIlllllIIIIlIIlIllI.inventorySlots.add(this.field_147064_C);
            "".length();
            "".length();
            if ((0x4D ^ 0x49) == -" ".length()) {
                return;
            }
        }
        else if (llIIIllIlIllIll(lllllllllllllIIlllllIIIIlIIlIlll, CreativeTabs.tabInventory.getTabIndex())) {
            lllllllllllllIIlllllIIIIlIIlIllI.inventorySlots = this.field_147063_B;
            this.field_147063_B = null;
        }
        if (llIIIllIlIllllI(this.searchField)) {
            if (llIIIllIlIlllll(lllllllllllllIIlllllIIIIlIIllIII, CreativeTabs.tabAllSearch)) {
                this.searchField.setVisible((boolean)(GuiContainerCreative.lIIIlllIlIlllI[1] != 0));
                this.searchField.setCanLoseFocus((boolean)(GuiContainerCreative.lIIIlllIlIlllI[0] != 0));
                this.searchField.setFocused((boolean)(GuiContainerCreative.lIIIlllIlIlllI[1] != 0));
                this.searchField.setText(GuiContainerCreative.lIIIlllIlIlIll[GuiContainerCreative.lIIIlllIlIlllI[10]]);
                this.updateCreativeSearch();
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                this.searchField.setVisible((boolean)(GuiContainerCreative.lIIIlllIlIlllI[0] != 0));
                this.searchField.setCanLoseFocus((boolean)(GuiContainerCreative.lIIIlllIlIlllI[1] != 0));
                this.searchField.setFocused((boolean)(GuiContainerCreative.lIIIlllIlIlllI[0] != 0));
            }
        }
        this.currentScroll = 0.0f;
        lllllllllllllIIlllllIIIIlIIlIllI.scrollTo(0.0f);
    }
    
    class CreativeSlot extends Slot
    {
        private static final /* synthetic */ int[] llIlIlllIIIlII;
        private final /* synthetic */ Slot slot;
        
        @Override
        public boolean getHasStack() {
            return this.slot.getHasStack();
        }
        
        @Override
        public void onPickupFromSlot(final EntityPlayer llllllllllllIllIlIIlIIlIIIIllIlI, final ItemStack llllllllllllIllIlIIlIIlIIIIllIIl) {
            this.slot.onPickupFromSlot(llllllllllllIllIlIIlIIlIIIIllIlI, llllllllllllIllIlIIlIIlIIIIllIIl);
        }
        
        @Override
        public void onSlotChanged() {
            this.slot.onSlotChanged();
        }
        
        @Override
        public ItemStack decrStackSize(final int llllllllllllIllIlIIlIIIlllllIlII) {
            return this.slot.decrStackSize(llllllllllllIllIlIIlIIIlllllIlII);
        }
        
        @Override
        public void putStack(final ItemStack llllllllllllIllIlIIlIIlIIIIIIlll) {
            this.slot.putStack(llllllllllllIllIlIIlIIlIIIIIIlll);
        }
        
        @Override
        public String getSlotTexture() {
            return this.slot.getSlotTexture();
        }
        
        @Override
        public int getSlotStackLimit() {
            return this.slot.getSlotStackLimit();
        }
        
        @Override
        public int getItemStackLimit(final ItemStack llllllllllllIllIlIIlIIIlllllllIl) {
            return this.slot.getItemStackLimit(llllllllllllIllIlIIlIIIlllllllIl);
        }
        
        @Override
        public boolean isItemValid(final ItemStack llllllllllllIllIlIIlIIlIIIIlIIll) {
            return this.slot.isItemValid(llllllllllllIllIlIIlIIlIIIIlIIll);
        }
        
        @Override
        public boolean isHere(final IInventory llllllllllllIllIlIIlIIIllllIlIlI, final int llllllllllllIllIlIIlIIIllllIllII) {
            return this.slot.isHere(llllllllllllIllIlIIlIIIllllIlIlI, llllllllllllIllIlIIlIIIllllIllII);
        }
        
        @Override
        public ItemStack getStack() {
            return this.slot.getStack();
        }
        
        private static void lIIlIlIllIIlIIII() {
            (llIlIlllIIIlII = new int[1])[0] = ("   ".length() & ("   ".length() ^ -" ".length()));
        }
        
        public CreativeSlot(final Slot llllllllllllIllIlIIlIIlIIIlIIIll, final int llllllllllllIllIlIIlIIlIIIlIIllI) {
            super(llllllllllllIllIlIIlIIlIIIlIIIll.inventory, llllllllllllIllIlIIlIIlIIIlIIllI, CreativeSlot.llIlIlllIIIlII[0], CreativeSlot.llIlIlllIIIlII[0]);
            this.slot = llllllllllllIllIlIIlIIlIIIlIIIll;
        }
        
        static {
            lIIlIlIllIIlIIII();
        }
    }
    
    static class ContainerCreative extends Container
    {
        public /* synthetic */ List<ItemStack> itemList;
        private static final /* synthetic */ int[] llIlIlllIIlIII;
        
        @Override
        protected void retrySlotClick(final int llllllllllllIllIlIIlIIIllIlllIII, final int llllllllllllIllIlIIlIIIllIllIlll, final boolean llllllllllllIllIlIIlIIIllIllIllI, final EntityPlayer llllllllllllIllIlIIlIIIllIllIlIl) {
        }
        
        private static void lIIlIlIllIIlIlII() {
            (llIlIlllIIlIII = new int[9])[0] = ((134 + 41 - 80 + 70 ^ 155 + 72 - 156 + 110) & (0x4 ^ 0x10 ^ (0x95 ^ 0x91) ^ -" ".length()));
            ContainerCreative.llIlIlllIIlIII[1] = (0xA4 ^ 0xAD);
            ContainerCreative.llIlIlllIIlIII[2] = (0x61 ^ 0x64 ^ (0x1E ^ 0x9));
            ContainerCreative.llIlIlllIIlIII[3] = (0x4B ^ 0x4E);
            ContainerCreative.llIlIlllIIlIII[4] = (0x65 ^ 0x15);
            ContainerCreative.llIlIlllIIlIII[5] = " ".length();
            ContainerCreative.llIlIlllIIlIII[6] = (86 + 51 - 31 + 70 ^ 56 + 39 + 58 + 4);
            ContainerCreative.llIlIlllIIlIII[7] = (0x20 ^ 0x7A);
            ContainerCreative.llIlIlllIIlIII[8] = 48 + 112 - 14 + 6 + (71 + 5 + 39 + 38) - (160 + 158 - 231 + 160) + (0x12 ^ 0x7A);
        }
        
        private static boolean lIIlIlIllIIlIllI(final int llllllllllllIllIlIIlIIIllIIIllII) {
            return llllllllllllIllIlIIlIIIllIIIllII < 0;
        }
        
        private static boolean lIIlIlIllIIlllII(final int llllllllllllIllIlIIlIIIllIIlIIII) {
            return llllllllllllIllIlIIlIIIllIIlIIII == 0;
        }
        
        private static boolean lIIlIlIllIIlIlIl(final int llllllllllllIllIlIIlIIIllIIlllll, final int llllllllllllIllIlIIlIIIllIIllllI) {
            return llllllllllllIllIlIIlIIIllIIlllll >= llllllllllllIllIlIIlIIIllIIllllI;
        }
        
        private static boolean lIIlIlIllIIllIlI(final Object llllllllllllIllIlIIlIIIllIIlIlII) {
            return llllllllllllIllIlIIlIIIllIIlIlII != null;
        }
        
        static {
            lIIlIlIllIIlIlII();
        }
        
        private static boolean lIIlIlIllIIlIlll(final int llllllllllllIllIlIIlIIIllIIIlllI) {
            return llllllllllllIllIlIIlIIIllIIIlllI >= 0;
        }
        
        @Override
        public boolean canDragIntoSlot(final Slot llllllllllllIllIlIIlIIIllIlIIIlI) {
            if (lIIlIlIllIIlllII((llllllllllllIllIlIIlIIIllIlIIIlI.inventory instanceof InventoryPlayer) ? 1 : 0) && (!lIIlIlIllIIllIIl(llllllllllllIllIlIIlIIIllIlIIIlI.yDisplayPosition, ContainerCreative.llIlIlllIIlIII[7]) || lIIlIlIllIIllIIl(llllllllllllIllIlIIlIIIllIlIIIlI.xDisplayPosition, ContainerCreative.llIlIlllIIlIII[8]))) {
                return ContainerCreative.llIlIlllIIlIII[0] != 0;
            }
            return ContainerCreative.llIlIlllIIlIII[5] != 0;
        }
        
        @Override
        public boolean canMergeSlot(final ItemStack llllllllllllIllIlIIlIIIllIlIlIII, final Slot llllllllllllIllIlIIlIIIllIlIIllI) {
            if (lIIlIlIllIIllIIl(llllllllllllIllIlIIlIIIllIlIIllI.yDisplayPosition, ContainerCreative.llIlIlllIIlIII[7])) {
                return ContainerCreative.llIlIlllIIlIII[5] != 0;
            }
            return ContainerCreative.llIlIlllIIlIII[0] != 0;
        }
        
        public boolean func_148328_e() {
            if (lIIlIlIllIIllIIl(this.itemList.size(), ContainerCreative.llIlIlllIIlIII[6])) {
                return ContainerCreative.llIlIlllIIlIII[5] != 0;
            }
            return ContainerCreative.llIlIlllIIlIII[0] != 0;
        }
        
        @Override
        public ItemStack transferStackInSlot(final EntityPlayer llllllllllllIllIlIIlIIIllIllIIII, final int llllllllllllIllIlIIlIIIllIlIllll) {
            if (lIIlIlIllIIlIlIl(llllllllllllIllIlIIlIIIllIlIllll, this.inventorySlots.size() - ContainerCreative.llIlIlllIIlIII[1]) && lIIlIlIllIIllIII(llllllllllllIllIlIIlIIIllIlIllll, this.inventorySlots.size())) {
                final Slot llllllllllllIllIlIIlIIIllIlIlllI = this.inventorySlots.get(llllllllllllIllIlIIlIIIllIlIllll);
                if (lIIlIlIllIIllIlI(llllllllllllIllIlIIlIIIllIlIlllI) && lIIlIlIllIIllIll(llllllllllllIllIlIIlIIIllIlIlllI.getHasStack() ? 1 : 0)) {
                    llllllllllllIllIlIIlIIIllIlIlllI.putStack(null);
                }
            }
            return null;
        }
        
        @Override
        public boolean canInteractWith(final EntityPlayer llllllllllllIllIlIIlIIIlllIlIIlI) {
            return ContainerCreative.llIlIlllIIlIII[5] != 0;
        }
        
        private static boolean lIIlIlIllIIllIII(final int llllllllllllIllIlIIlIIIllIIllIll, final int llllllllllllIllIlIIlIIIllIIllIlI) {
            return llllllllllllIllIlIIlIIIllIIllIll < llllllllllllIllIlIIlIIIllIIllIlI;
        }
        
        private static boolean lIIlIlIllIIllIIl(final int llllllllllllIllIlIIlIIIllIIlIlll, final int llllllllllllIllIlIIlIIIllIIlIllI) {
            return llllllllllllIllIlIIlIIIllIIlIlll > llllllllllllIllIlIIlIIIllIIlIllI;
        }
        
        private static boolean lIIlIlIllIIllIll(final int llllllllllllIllIlIIlIIIllIIlIIlI) {
            return llllllllllllIllIlIIlIIIllIIlIIlI != 0;
        }
        
        public void scrollTo(final float llllllllllllIllIlIIlIIIlllIIIIlI) {
            final int llllllllllllIllIlIIlIIIlllIIlIII = (this.itemList.size() + ContainerCreative.llIlIlllIIlIII[1] - ContainerCreative.llIlIlllIIlIII[5]) / ContainerCreative.llIlIlllIIlIII[1] - ContainerCreative.llIlIlllIIlIII[3];
            int llllllllllllIllIlIIlIIIlllIIIlll = (int)(llllllllllllIllIlIIlIIIlllIIIIlI * llllllllllllIllIlIIlIIIlllIIlIII + 0.5);
            if (lIIlIlIllIIlIllI(llllllllllllIllIlIIlIIIlllIIIlll)) {
                llllllllllllIllIlIIlIIIlllIIIlll = ContainerCreative.llIlIlllIIlIII[0];
            }
            int llllllllllllIllIlIIlIIIlllIIIllI = ContainerCreative.llIlIlllIIlIII[0];
            "".length();
            if ("  ".length() < 0) {
                return;
            }
            while (!lIIlIlIllIIlIlIl(llllllllllllIllIlIIlIIIlllIIIllI, ContainerCreative.llIlIlllIIlIII[3])) {
                int llllllllllllIllIlIIlIIIlllIIIlIl = ContainerCreative.llIlIlllIIlIII[0];
                "".length();
                if (null != null) {
                    return;
                }
                while (!lIIlIlIllIIlIlIl(llllllllllllIllIlIIlIIIlllIIIlIl, ContainerCreative.llIlIlllIIlIII[1])) {
                    final int llllllllllllIllIlIIlIIIlllIIIlII = llllllllllllIllIlIIlIIIlllIIIlIl + (llllllllllllIllIlIIlIIIlllIIIllI + llllllllllllIllIlIIlIIIlllIIIlll) * ContainerCreative.llIlIlllIIlIII[1];
                    if (lIIlIlIllIIlIlll(llllllllllllIllIlIIlIIIlllIIIlII) && lIIlIlIllIIllIII(llllllllllllIllIlIIlIIIlllIIIlII, this.itemList.size())) {
                        GuiContainerCreative.field_147060_v.setInventorySlotContents(llllllllllllIllIlIIlIIIlllIIIlIl + llllllllllllIllIlIIlIIIlllIIIllI * ContainerCreative.llIlIlllIIlIII[1], this.itemList.get(llllllllllllIllIlIIlIIIlllIIIlII));
                        "".length();
                        if ("  ".length() <= ((0x91 ^ 0xB5) & ~(0xB6 ^ 0x92))) {
                            return;
                        }
                    }
                    else {
                        GuiContainerCreative.field_147060_v.setInventorySlotContents(llllllllllllIllIlIIlIIIlllIIIlIl + llllllllllllIllIlIIlIIIlllIIIllI * ContainerCreative.llIlIlllIIlIII[1], null);
                    }
                    ++llllllllllllIllIlIIlIIIlllIIIlIl;
                }
                ++llllllllllllIllIlIIlIIIlllIIIllI;
            }
        }
        
        public ContainerCreative(final EntityPlayer llllllllllllIllIlIIlIIIlllIlllIl) {
            this.itemList = (List<ItemStack>)Lists.newArrayList();
            final InventoryPlayer llllllllllllIllIlIIlIIIlllIlllII = llllllllllllIllIlIIlIIIlllIlllIl.inventory;
            int llllllllllllIllIlIIlIIIlllIllIll = ContainerCreative.llIlIlllIIlIII[0];
            "".length();
            if ("  ".length() == 0) {
                throw null;
            }
            while (!lIIlIlIllIIlIlIl(llllllllllllIllIlIIlIIIlllIllIll, ContainerCreative.llIlIlllIIlIII[3])) {
                int llllllllllllIllIlIIlIIIlllIllIlI = ContainerCreative.llIlIlllIIlIII[0];
                "".length();
                if (-" ".length() >= (0x41 ^ 0x45)) {
                    throw null;
                }
                while (!lIIlIlIllIIlIlIl(llllllllllllIllIlIIlIIIlllIllIlI, ContainerCreative.llIlIlllIIlIII[1])) {
                    this.addSlotToContainer(new Slot(GuiContainerCreative.field_147060_v, llllllllllllIllIlIIlIIIlllIllIll * ContainerCreative.llIlIlllIIlIII[1] + llllllllllllIllIlIIlIIIlllIllIlI, ContainerCreative.llIlIlllIIlIII[1] + llllllllllllIllIlIIlIIIlllIllIlI * ContainerCreative.llIlIlllIIlIII[2], ContainerCreative.llIlIlllIIlIII[2] + llllllllllllIllIlIIlIIIlllIllIll * ContainerCreative.llIlIlllIIlIII[2]));
                    "".length();
                    ++llllllllllllIllIlIIlIIIlllIllIlI;
                }
                ++llllllllllllIllIlIIlIIIlllIllIll;
            }
            int llllllllllllIllIlIIlIIIlllIllIIl = ContainerCreative.llIlIlllIIlIII[0];
            "".length();
            if ("  ".length() < "  ".length()) {
                throw null;
            }
            while (!lIIlIlIllIIlIlIl(llllllllllllIllIlIIlIIIlllIllIIl, ContainerCreative.llIlIlllIIlIII[1])) {
                this.addSlotToContainer(new Slot(llllllllllllIllIlIIlIIIlllIlllII, llllllllllllIllIlIIlIIIlllIllIIl, ContainerCreative.llIlIlllIIlIII[1] + llllllllllllIllIlIIlIIIlllIllIIl * ContainerCreative.llIlIlllIIlIII[2], ContainerCreative.llIlIlllIIlIII[4]));
                "".length();
                ++llllllllllllIllIlIIlIIIlllIllIIl;
            }
            this.scrollTo(0.0f);
        }
    }
}
