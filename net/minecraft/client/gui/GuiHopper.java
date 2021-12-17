// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.inventory.Container;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ContainerHopper;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.inventory.IInventory;
import net.minecraft.client.gui.inventory.GuiContainer;

public class GuiHopper extends GuiContainer
{
    private static final /* synthetic */ int[] lIIIIIIIIlIIll;
    private /* synthetic */ IInventory hopperInventory;
    private /* synthetic */ IInventory playerInventory;
    private static final /* synthetic */ String[] lIIIIIIIIlIIIl;
    private static final /* synthetic */ ResourceLocation HOPPER_GUI_TEXTURE;
    
    private static void lIllIIlIlIlIlll() {
        (lIIIIIIIIlIIIl = new String[GuiHopper.lIIIIIIIIlIIll[7]])[GuiHopper.lIIIIIIIIlIIll[0]] = lIllIIlIlIlIllI("Bfr9iKQaTOUbCHu8JosVXhULgcdewnQYtb4hYk1KXmFYWdfZuOvOVw==", "XFOqP");
    }
    
    @Override
    protected void drawGuiContainerBackgroundLayer(final float lllllllllllllIlIlIIlIIlIlIIlIllI, final int lllllllllllllIlIlIIlIIlIlIIlIlIl, final int lllllllllllllIlIlIIlIIlIlIIlIlII) {
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.getTextureManager().bindTexture(GuiHopper.HOPPER_GUI_TEXTURE);
        final int lllllllllllllIlIlIIlIIlIlIIlIIll = (this.width - this.xSize) / GuiHopper.lIIIIIIIIlIIll[6];
        final int lllllllllllllIlIlIIlIIlIlIIlIIlI = (this.height - this.ySize) / GuiHopper.lIIIIIIIIlIIll[6];
        this.drawTexturedModalRect(lllllllllllllIlIlIIlIIlIlIIlIIll, lllllllllllllIlIlIIlIIlIlIIlIIlI, GuiHopper.lIIIIIIIIlIIll[0], GuiHopper.lIIIIIIIIlIIll[0], this.xSize, this.ySize);
    }
    
    static {
        lIllIIlIllIIIll();
        lIllIIlIlIlIlll();
        HOPPER_GUI_TEXTURE = new ResourceLocation(GuiHopper.lIIIIIIIIlIIIl[GuiHopper.lIIIIIIIIlIIll[0]]);
    }
    
    public GuiHopper(final InventoryPlayer lllllllllllllIlIlIIlIIlIlIlIIIIl, final IInventory lllllllllllllIlIlIIlIIlIlIlIIIII) {
        super(new ContainerHopper(lllllllllllllIlIlIIlIIlIlIlIIIIl, lllllllllllllIlIlIIlIIlIlIlIIIII, Minecraft.getMinecraft().thePlayer));
        this.playerInventory = lllllllllllllIlIlIIlIIlIlIlIIIIl;
        this.hopperInventory = lllllllllllllIlIlIIlIIlIlIlIIIII;
        this.allowUserInput = (GuiHopper.lIIIIIIIIlIIll[0] != 0);
        this.ySize = GuiHopper.lIIIIIIIIlIIll[1];
    }
    
    private static String lIllIIlIlIlIllI(final String lllllllllllllIlIlIIlIIlIlIIIIlll, final String lllllllllllllIlIlIIlIIlIlIIIIlII) {
        try {
            final SecretKeySpec lllllllllllllIlIlIIlIIlIlIIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIlIIlIlIIIIlII.getBytes(StandardCharsets.UTF_8)), GuiHopper.lIIIIIIIIlIIll[2]), "DES");
            final Cipher lllllllllllllIlIlIIlIIlIlIIIlIIl = Cipher.getInstance("DES");
            lllllllllllllIlIlIIlIIlIlIIIlIIl.init(GuiHopper.lIIIIIIIIlIIll[6], lllllllllllllIlIlIIlIIlIlIIIlIlI);
            return new String(lllllllllllllIlIlIIlIIlIlIIIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIlIIlIlIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIIlIIlIlIIIlIII) {
            lllllllllllllIlIlIIlIIlIlIIIlIII.printStackTrace();
            return null;
        }
    }
    
    private static void lIllIIlIllIIIll() {
        (lIIIIIIIIlIIll = new int[8])[0] = ((0x8A ^ 0xB1) & ~(0xA2 ^ 0x99));
        GuiHopper.lIIIIIIIIlIIll[1] = 8 + 73 + 31 + 21;
        GuiHopper.lIIIIIIIIlIIll[2] = (0x79 ^ 0x71);
        GuiHopper.lIIIIIIIIlIIll[3] = (4 + 69 + 12 + 71 ^ 35 + 14 - 4 + 109);
        GuiHopper.lIIIIIIIIlIIll[4] = (-(0xFFFFFF6E & 0x35B5) & (0xFFFFF5E3 & 0x407F7F));
        GuiHopper.lIIIIIIIIlIIll[5] = (0xF8 ^ 0x98);
        GuiHopper.lIIIIIIIIlIIll[6] = "  ".length();
        GuiHopper.lIIIIIIIIlIIll[7] = " ".length();
    }
    
    @Override
    protected void drawGuiContainerForegroundLayer(final int lllllllllllllIlIlIIlIIlIlIIlllIl, final int lllllllllllllIlIlIIlIIlIlIIlllII) {
        this.fontRendererObj.drawString(this.hopperInventory.getDisplayName().getUnformattedText(), GuiHopper.lIIIIIIIIlIIll[2], GuiHopper.lIIIIIIIIlIIll[3], GuiHopper.lIIIIIIIIlIIll[4]);
        "".length();
        this.fontRendererObj.drawString(this.playerInventory.getDisplayName().getUnformattedText(), GuiHopper.lIIIIIIIIlIIll[2], this.ySize - GuiHopper.lIIIIIIIIlIIll[5] + GuiHopper.lIIIIIIIIlIIll[6], GuiHopper.lIIIIIIIIlIIll[4]);
        "".length();
    }
}
