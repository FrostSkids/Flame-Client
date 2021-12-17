// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui.inventory;

import net.minecraft.client.renderer.GlStateManager;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerBrewingStand;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.inventory.IInventory;

public class GuiBrewingStand extends GuiContainer
{
    private /* synthetic */ IInventory tileBrewingStand;
    private static final /* synthetic */ String[] lIllIIIlllIllI;
    private static final /* synthetic */ ResourceLocation brewingStandGuiTextures;
    private final /* synthetic */ InventoryPlayer playerInventory;
    private static final /* synthetic */ int[] lIllIIIllllIIl;
    
    private static boolean lllllIIlIIlIIll(final int lllllllllllllIIIIIlIIllllIlIIlII) {
        return lllllllllllllIIIIIlIIllllIlIIlII > 0;
    }
    
    public GuiBrewingStand(final InventoryPlayer lllllllllllllIIIIIlIlIIIIIIllIIl, final IInventory lllllllllllllIIIIIlIlIIIIIIllIII) {
        super(new ContainerBrewingStand(lllllllllllllIIIIIlIlIIIIIIllIIl, lllllllllllllIIIIIlIlIIIIIIllIII));
        this.playerInventory = lllllllllllllIIIIIlIlIIIIIIllIIl;
        this.tileBrewingStand = lllllllllllllIIIIIlIlIIIIIIllIII;
    }
    
    private static void lllllIIlIIIlIlI() {
        (lIllIIIlllIllI = new String[GuiBrewingStand.lIllIIIllllIIl[19]])[GuiBrewingStand.lIllIIIllllIIl[0]] = lllllIIlIIIlIIl("ER8eLSQXHxV2NhATSTo+Cw4HMD8ACEk7IwANDzc2OgkSOD8BVBY3Ng==", "ezfYQ");
    }
    
    @Override
    protected void drawGuiContainerForegroundLayer(final int lllllllllllllIIIIIlIlIIIIIIIlIlI, final int lllllllllllllIIIIIlIlIIIIIIIIlll) {
        final String lllllllllllllIIIIIlIlIIIIIIIIlIl = this.tileBrewingStand.getDisplayName().getUnformattedText();
        this.fontRendererObj.drawString(lllllllllllllIIIIIlIlIIIIIIIIlIl, this.xSize / GuiBrewingStand.lIllIIIllllIIl[1] - this.fontRendererObj.getStringWidth(lllllllllllllIIIIIlIlIIIIIIIIlIl) / GuiBrewingStand.lIllIIIllllIIl[1], GuiBrewingStand.lIllIIIllllIIl[2], GuiBrewingStand.lIllIIIllllIIl[3]);
        "".length();
        this.fontRendererObj.drawString(this.playerInventory.getDisplayName().getUnformattedText(), GuiBrewingStand.lIllIIIllllIIl[4], this.ySize - GuiBrewingStand.lIllIIIllllIIl[5] + GuiBrewingStand.lIllIIIllllIIl[1], GuiBrewingStand.lIllIIIllllIIl[3]);
        "".length();
    }
    
    private static void lllllIIlIIIllll() {
        (lIllIIIllllIIl = new int[20])[0] = ((0x84 ^ 0xBE) & ~(0x38 ^ 0x2));
        GuiBrewingStand.lIllIIIllllIIl[1] = "  ".length();
        GuiBrewingStand.lIllIIIllllIIl[2] = (0xE9 ^ 0xBD ^ (0xF0 ^ 0xA2));
        GuiBrewingStand.lIllIIIllllIIl[3] = (-(0xFFFFB9BD & 0x7EEE) & (0xFFFFFCEB & 0x407BFF));
        GuiBrewingStand.lIllIIIllllIIl[4] = (0x9 ^ 0x74 ^ (0x6 ^ 0x73));
        GuiBrewingStand.lIllIIIllllIIl[5] = (0x76 ^ 0x16);
        GuiBrewingStand.lIllIIIllllIIl[6] = (0x4B ^ 0x1F ^ (0xBC ^ 0x89));
        GuiBrewingStand.lIllIIIllllIIl[7] = (0x68 ^ 0x71 ^ (0x7E ^ 0x77));
        GuiBrewingStand.lIllIIIllllIIl[8] = (0xCB ^ 0xAC) + (46 + 130 - 69 + 53) - (81 + 135 - 91 + 79) + (0x31 ^ 0x44);
        GuiBrewingStand.lIllIIIllllIIl[9] = (0x21 ^ 0x28);
        GuiBrewingStand.lIllIIIllllIIl[10] = (0x3A ^ 0x33 ^ (0x87 ^ 0x89));
        GuiBrewingStand.lIllIIIllllIIl[11] = (0xB4 ^ 0x9A ^ (0x92 ^ 0xA1));
        GuiBrewingStand.lIllIIIllllIIl[12] = (0x93 ^ 0x8B);
        GuiBrewingStand.lIllIIIllllIIl[13] = (0x2E ^ 0x3A);
        GuiBrewingStand.lIllIIIllllIIl[14] = (158 + 44 - 56 + 35 ^ 97 + 51 - 108 + 150);
        GuiBrewingStand.lIllIIIllllIIl[15] = (0xF5 ^ 0xB4);
        GuiBrewingStand.lIllIIIllllIIl[16] = (65 + 129 - 135 + 82 ^ 73 + 69 - 21 + 10);
        GuiBrewingStand.lIllIIIllllIIl[17] = 61 + 119 - 155 + 132 + (0xCB ^ 0xA4) - (15 + 126 - 135 + 130) + (0x60 ^ 0x55);
        GuiBrewingStand.lIllIIIllllIIl[18] = (0x56 ^ 0x5A);
        GuiBrewingStand.lIllIIIllllIIl[19] = " ".length();
    }
    
    private static boolean lllllIIlIIlIlIl(final int lllllllllllllIIIIIlIIllllIlIIlll, final int lllllllllllllIIIIIlIIllllIlIIllI) {
        return lllllllllllllIIIIIlIIllllIlIIlll < lllllllllllllIIIIIlIIllllIlIIllI;
    }
    
    private static String lllllIIlIIIlIIl(String lllllllllllllIIIIIlIIllllIllIIlI, final String lllllllllllllIIIIIlIIllllIllIIIl) {
        lllllllllllllIIIIIlIIllllIllIIlI = new String(Base64.getDecoder().decode(lllllllllllllIIIIIlIIllllIllIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIIlIIllllIllIlIl = new StringBuilder();
        final char[] lllllllllllllIIIIIlIIllllIllIlII = lllllllllllllIIIIIlIIllllIllIIIl.toCharArray();
        int lllllllllllllIIIIIlIIllllIllIIll = GuiBrewingStand.lIllIIIllllIIl[0];
        final char lllllllllllllIIIIIlIIllllIlIllIl = (Object)lllllllllllllIIIIIlIIllllIllIIlI.toCharArray();
        final Exception lllllllllllllIIIIIlIIllllIlIllII = (Exception)lllllllllllllIIIIIlIIllllIlIllIl.length;
        long lllllllllllllIIIIIlIIllllIlIlIll = GuiBrewingStand.lIllIIIllllIIl[0];
        while (lllllIIlIIlIlIl((int)lllllllllllllIIIIIlIIllllIlIlIll, (int)lllllllllllllIIIIIlIIllllIlIllII)) {
            final char lllllllllllllIIIIIlIIllllIlllIII = lllllllllllllIIIIIlIIllllIlIllIl[lllllllllllllIIIIIlIIllllIlIlIll];
            lllllllllllllIIIIIlIIllllIllIlIl.append((char)(lllllllllllllIIIIIlIIllllIlllIII ^ lllllllllllllIIIIIlIIllllIllIlII[lllllllllllllIIIIIlIIllllIllIIll % lllllllllllllIIIIIlIIllllIllIlII.length]));
            "".length();
            ++lllllllllllllIIIIIlIIllllIllIIll;
            ++lllllllllllllIIIIIlIIllllIlIlIll;
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIIlIIllllIllIlIl);
    }
    
    static {
        lllllIIlIIIllll();
        lllllIIlIIIlIlI();
        brewingStandGuiTextures = new ResourceLocation(GuiBrewingStand.lIllIIIlllIllI[GuiBrewingStand.lIllIIIllllIIl[0]]);
    }
    
    @Override
    protected void drawGuiContainerBackgroundLayer(final float lllllllllllllIIIIIlIIllllllIIIlI, final int lllllllllllllIIIIIlIIllllllIIIII, final int lllllllllllllIIIIIlIIlllllIllllI) {
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.getTextureManager().bindTexture(GuiBrewingStand.brewingStandGuiTextures);
        final int lllllllllllllIIIIIlIIlllllIlllIl = (this.width - this.xSize) / GuiBrewingStand.lIllIIIllllIIl[1];
        final int lllllllllllllIIIIIlIIlllllIllIll = (this.height - this.ySize) / GuiBrewingStand.lIllIIIllllIIl[1];
        this.drawTexturedModalRect(lllllllllllllIIIIIlIIlllllIlllIl, lllllllllllllIIIIIlIIlllllIllIll, GuiBrewingStand.lIllIIIllllIIl[0], GuiBrewingStand.lIllIIIllllIIl[0], this.xSize, this.ySize);
        final int lllllllllllllIIIIIlIIlllllIllIlI = this.tileBrewingStand.getField(GuiBrewingStand.lIllIIIllllIIl[0]);
        if (lllllIIlIIlIIll(lllllllllllllIIIIIlIIlllllIllIlI)) {
            int lllllllllllllIIIIIlIIlllllIllIII = (int)(28.0f * (1.0f - lllllllllllllIIIIIlIIlllllIllIlI / 400.0f));
            if (lllllIIlIIlIIll(lllllllllllllIIIIIlIIlllllIllIII)) {
                this.drawTexturedModalRect(lllllllllllllIIIIIlIIlllllIlllIl + GuiBrewingStand.lIllIIIllllIIl[6], lllllllllllllIIIIIlIIlllllIllIll + GuiBrewingStand.lIllIIIllllIIl[7], GuiBrewingStand.lIllIIIllllIIl[8], GuiBrewingStand.lIllIIIllllIIl[0], GuiBrewingStand.lIllIIIllllIIl[9], lllllllllllllIIIIIlIIlllllIllIII);
            }
            final int lllllllllllllIIIIIlIIlllllIlIllI = lllllllllllllIIIIIlIIlllllIllIlI / GuiBrewingStand.lIllIIIllllIIl[1] % GuiBrewingStand.lIllIIIllllIIl[10];
            switch (lllllllllllllIIIIIlIIlllllIlIllI) {
                case 0: {
                    lllllllllllllIIIIIlIIlllllIllIII = GuiBrewingStand.lIllIIIllllIIl[11];
                    "".length();
                    if ("   ".length() > (0xC1 ^ 0xC5)) {
                        return;
                    }
                    break;
                }
                case 1: {
                    lllllllllllllIIIIIlIIlllllIllIII = GuiBrewingStand.lIllIIIllllIIl[12];
                    "".length();
                    if (((2 + 125 - 58 + 61 ^ 36 + 94 - 81 + 115) & (66 + 55 + 38 + 4 ^ 19 + 29 + 39 + 46 ^ -" ".length())) < 0) {
                        return;
                    }
                    break;
                }
                case 2: {
                    lllllllllllllIIIIIlIIlllllIllIII = GuiBrewingStand.lIllIIIllllIIl[13];
                    "".length();
                    if ("  ".length() > (0xCB ^ 0xBB ^ (0x57 ^ 0x23))) {
                        return;
                    }
                    break;
                }
                case 3: {
                    lllllllllllllIIIIIlIIlllllIllIII = GuiBrewingStand.lIllIIIllllIIl[7];
                    "".length();
                    if (" ".length() > "   ".length()) {
                        return;
                    }
                    break;
                }
                case 4: {
                    lllllllllllllIIIIIlIIlllllIllIII = GuiBrewingStand.lIllIIIllllIIl[14];
                    "".length();
                    if (" ".length() > "  ".length()) {
                        return;
                    }
                    break;
                }
                case 5: {
                    lllllllllllllIIIIIlIIlllllIllIII = GuiBrewingStand.lIllIIIllllIIl[2];
                    "".length();
                    if (" ".length() == (105 + 96 - 113 + 68 ^ 47 + 100 - 60 + 65)) {
                        return;
                    }
                    break;
                }
                case 6: {
                    lllllllllllllIIIIIlIIlllllIllIII = GuiBrewingStand.lIllIIIllllIIl[0];
                    break;
                }
            }
            if (lllllIIlIIlIIll(lllllllllllllIIIIIlIIlllllIllIII)) {
                this.drawTexturedModalRect(lllllllllllllIIIIIlIIlllllIlllIl + GuiBrewingStand.lIllIIIllllIIl[15], lllllllllllllIIIIIlIIlllllIllIll + GuiBrewingStand.lIllIIIllllIIl[16] + GuiBrewingStand.lIllIIIllllIIl[11] - lllllllllllllIIIIIlIIlllllIllIII, GuiBrewingStand.lIllIIIllllIIl[17], GuiBrewingStand.lIllIIIllllIIl[11] - lllllllllllllIIIIIlIIlllllIllIII, GuiBrewingStand.lIllIIIllllIIl[18], lllllllllllllIIIIIlIIlllllIllIII);
            }
        }
    }
}
