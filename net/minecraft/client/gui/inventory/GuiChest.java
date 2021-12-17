// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui.inventory;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.inventory.Container;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ContainerChest;
import net.minecraft.client.Minecraft;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.ResourceLocation;
import net.minecraft.inventory.IInventory;

public class GuiChest extends GuiContainer
{
    private /* synthetic */ IInventory upperChestInventory;
    private /* synthetic */ IInventory lowerChestInventory;
    private static final /* synthetic */ ResourceLocation CHEST_GUI_TEXTURE;
    private static final /* synthetic */ String[] lIIlIIIIIlIIll;
    private /* synthetic */ int inventoryRows;
    private static final /* synthetic */ int[] lIIlIIIIIlIlII;
    
    private static void llIIlIIlIIIlllI() {
        (lIIlIIIIIlIIll = new String[GuiChest.lIIlIIIIIlIlII[12]])[GuiChest.lIIlIIIIIlIlII[0]] = llIIlIIlIIIllIl("T7nuFIPACUOZjXvqxv5avS6U7yP8RLnzUCYjtGURY2iHtLLXIa0aAw==", "EwBkX");
    }
    
    private static String llIIlIIlIIIllIl(final String lllllllllllllIIlllIllllIIIIIllII, final String lllllllllllllIIlllIllllIIIIIllIl) {
        try {
            final SecretKeySpec lllllllllllllIIlllIllllIIIIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIllllIIIIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlllIllllIIIIlIIII = Cipher.getInstance("Blowfish");
            lllllllllllllIIlllIllllIIIIlIIII.init(GuiChest.lIIlIIIIIlIlII[9], lllllllllllllIIlllIllllIIIIlIIIl);
            return new String(lllllllllllllIIlllIllllIIIIlIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIllllIIIIIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllIllllIIIIIllll) {
            lllllllllllllIIlllIllllIIIIIllll.printStackTrace();
            return null;
        }
    }
    
    private static void llIIlIIlIIIllll() {
        (lIIlIIIIIlIlII = new int[13])[0] = ((0x17 ^ 0x27 ^ (0x72 ^ 0x64)) & (0x66 ^ 0x40 ^ ((0x5E ^ 0x5B) & ~(0x16 ^ 0x13)) ^ -" ".length()));
        GuiChest.lIIlIIIIIlIlII[1] = 119 + 117 - 148 + 134;
        GuiChest.lIIlIIIIIlIlII[2] = (0x49 ^ 0x25);
        GuiChest.lIIlIIIIIlIlII[3] = (0x6C ^ 0x65);
        GuiChest.lIIlIIIIIlIlII[4] = (0x57 ^ 0x45);
        GuiChest.lIIlIIIIIlIlII[5] = (0x3B ^ 0x33);
        GuiChest.lIIlIIIIIlIlII[6] = (0x8B ^ 0x8D);
        GuiChest.lIIlIIIIIlIlII[7] = (-(0xFFFFE5F0 & 0x3BBF) & (-1 & 0x4061EF));
        GuiChest.lIIlIIIIIlIlII[8] = (0x4C ^ 0x2C);
        GuiChest.lIIlIIIIIlIlII[9] = "  ".length();
        GuiChest.lIIlIIIIIlIlII[10] = (0x84 ^ 0x95);
        GuiChest.lIIlIIIIIlIlII[11] = (0x22 ^ 0x70 ^ (0x76 ^ 0x5A));
        GuiChest.lIIlIIIIIlIlII[12] = " ".length();
    }
    
    public GuiChest(final IInventory lllllllllllllIIlllIllllIIIlIlIlI, final IInventory lllllllllllllIIlllIllllIIIlIlIIl) {
        super(new ContainerChest(lllllllllllllIIlllIllllIIIlIlIlI, lllllllllllllIIlllIllllIIIlIlIIl, Minecraft.getMinecraft().thePlayer));
        this.upperChestInventory = lllllllllllllIIlllIllllIIIlIlIlI;
        this.lowerChestInventory = lllllllllllllIIlllIllllIIIlIlIIl;
        this.allowUserInput = (GuiChest.lIIlIIIIIlIlII[0] != 0);
        final int lllllllllllllIIlllIllllIIIlIllIl = GuiChest.lIIlIIIIIlIlII[1];
        final int lllllllllllllIIlllIllllIIIlIllII = lllllllllllllIIlllIllllIIIlIllIl - GuiChest.lIIlIIIIIlIlII[2];
        this.inventoryRows = lllllllllllllIIlllIllllIIIlIlIIl.getSizeInventory() / GuiChest.lIIlIIIIIlIlII[3];
        this.ySize = lllllllllllllIIlllIllllIIIlIllII + this.inventoryRows * GuiChest.lIIlIIIIIlIlII[4];
    }
    
    @Override
    protected void drawGuiContainerBackgroundLayer(final float lllllllllllllIIlllIllllIIIIlllIl, final int lllllllllllllIIlllIllllIIIIlllII, final int lllllllllllllIIlllIllllIIIIllIll) {
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.getTextureManager().bindTexture(GuiChest.CHEST_GUI_TEXTURE);
        final int lllllllllllllIIlllIllllIIIIllIlI = (this.width - this.xSize) / GuiChest.lIIlIIIIIlIlII[9];
        final int lllllllllllllIIlllIllllIIIIllIIl = (this.height - this.ySize) / GuiChest.lIIlIIIIIlIlII[9];
        this.drawTexturedModalRect(lllllllllllllIIlllIllllIIIIllIlI, lllllllllllllIIlllIllllIIIIllIIl, GuiChest.lIIlIIIIIlIlII[0], GuiChest.lIIlIIIIIlIlII[0], this.xSize, this.inventoryRows * GuiChest.lIIlIIIIIlIlII[4] + GuiChest.lIIlIIIIIlIlII[10]);
        this.drawTexturedModalRect(lllllllllllllIIlllIllllIIIIllIlI, lllllllllllllIIlllIllllIIIIllIIl + this.inventoryRows * GuiChest.lIIlIIIIIlIlII[4] + GuiChest.lIIlIIIIIlIlII[10], GuiChest.lIIlIIIIIlIlII[0], GuiChest.lIIlIIIIIlIlII[11], this.xSize, GuiChest.lIIlIIIIIlIlII[8]);
    }
    
    static {
        llIIlIIlIIIllll();
        llIIlIIlIIIlllI();
        CHEST_GUI_TEXTURE = new ResourceLocation(GuiChest.lIIlIIIIIlIIll[GuiChest.lIIlIIIIIlIlII[0]]);
    }
    
    @Override
    protected void drawGuiContainerForegroundLayer(final int lllllllllllllIIlllIllllIIIlIIlII, final int lllllllllllllIIlllIllllIIIlIIIll) {
        this.fontRendererObj.drawString(this.lowerChestInventory.getDisplayName().getUnformattedText(), GuiChest.lIIlIIIIIlIlII[5], GuiChest.lIIlIIIIIlIlII[6], GuiChest.lIIlIIIIIlIlII[7]);
        "".length();
        this.fontRendererObj.drawString(this.upperChestInventory.getDisplayName().getUnformattedText(), GuiChest.lIIlIIIIIlIlII[5], this.ySize - GuiChest.lIIlIIIIIlIlII[8] + GuiChest.lIIlIIIIIlIlII[9], GuiChest.lIIlIIIIIlIlII[7]);
        "".length();
    }
}
