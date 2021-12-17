// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui.inventory;

import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerDispenser;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;

public class GuiDispenser extends GuiContainer
{
    private static final /* synthetic */ int[] llIlIIIIIIllIl;
    private static final /* synthetic */ ResourceLocation dispenserGuiTextures;
    public /* synthetic */ IInventory dispenserInventory;
    private static final /* synthetic */ String[] llIlIIIIIIllII;
    private final /* synthetic */ InventoryPlayer playerInventory;
    
    @Override
    protected void drawGuiContainerBackgroundLayer(final float llllllllllllIllIllIlllIllIIlIllI, final int llllllllllllIllIllIlllIllIIlIlIl, final int llllllllllllIllIllIlllIllIIlIlII) {
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.getTextureManager().bindTexture(GuiDispenser.dispenserGuiTextures);
        final int llllllllllllIllIllIlllIllIIlIIll = (this.width - this.xSize) / GuiDispenser.llIlIIIIIIllIl[1];
        final int llllllllllllIllIllIlllIllIIlIIlI = (this.height - this.ySize) / GuiDispenser.llIlIIIIIIllIl[1];
        this.drawTexturedModalRect(llllllllllllIllIllIlllIllIIlIIll, llllllllllllIllIllIlllIllIIlIIlI, GuiDispenser.llIlIIIIIIllIl[0], GuiDispenser.llIlIIIIIIllIl[0], this.xSize, this.ySize);
    }
    
    private static void lIIlIIIlIIIllIlI() {
        (llIlIIIIIIllII = new String[GuiDispenser.llIlIIIIIIllIl[6]])[GuiDispenser.llIlIIIIIIllIl[0]] = lIIlIIIlIIIllIIl("l0NCkBGhx2mb2GS1ilOs6dIevWCECQc20iESW1fr+fd5FYBlIWb9YQ==", "JtgfG");
    }
    
    private static String lIIlIIIlIIIllIIl(final String llllllllllllIllIllIlllIllIIIIlIl, final String llllllllllllIllIllIlllIllIIIIlII) {
        try {
            final SecretKeySpec llllllllllllIllIllIlllIllIIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIlllIllIIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIllIlllIllIIIlIIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIllIlllIllIIIlIIl.init(GuiDispenser.llIlIIIIIIllIl[1], llllllllllllIllIllIlllIllIIIlIlI);
            return new String(llllllllllllIllIllIlllIllIIIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIlllIllIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllIlllIllIIIlIII) {
            llllllllllllIllIllIlllIllIIIlIII.printStackTrace();
            return null;
        }
    }
    
    static {
        lIIlIIIlIIIllIll();
        lIIlIIIlIIIllIlI();
        dispenserGuiTextures = new ResourceLocation(GuiDispenser.llIlIIIIIIllII[GuiDispenser.llIlIIIIIIllIl[0]]);
    }
    
    public GuiDispenser(final InventoryPlayer llllllllllllIllIllIlllIllIlIIlll, final IInventory llllllllllllIllIllIlllIllIlIIIll) {
        super(new ContainerDispenser(llllllllllllIllIllIlllIllIlIIlll, llllllllllllIllIllIlllIllIlIIIll));
        this.playerInventory = llllllllllllIllIllIlllIllIlIIlll;
        this.dispenserInventory = llllllllllllIllIllIlllIllIlIIIll;
    }
    
    @Override
    protected void drawGuiContainerForegroundLayer(final int llllllllllllIllIllIlllIllIIlllll, final int llllllllllllIllIllIlllIllIIllllI) {
        final String llllllllllllIllIllIlllIllIIlllIl = this.dispenserInventory.getDisplayName().getUnformattedText();
        this.fontRendererObj.drawString(llllllllllllIllIllIlllIllIIlllIl, this.xSize / GuiDispenser.llIlIIIIIIllIl[1] - this.fontRendererObj.getStringWidth(llllllllllllIllIllIlllIllIIlllIl) / GuiDispenser.llIlIIIIIIllIl[1], GuiDispenser.llIlIIIIIIllIl[2], GuiDispenser.llIlIIIIIIllIl[3]);
        "".length();
        this.fontRendererObj.drawString(this.playerInventory.getDisplayName().getUnformattedText(), GuiDispenser.llIlIIIIIIllIl[4], this.ySize - GuiDispenser.llIlIIIIIIllIl[5] + GuiDispenser.llIlIIIIIIllIl[1], GuiDispenser.llIlIIIIIIllIl[3]);
        "".length();
    }
    
    private static void lIIlIIIlIIIllIll() {
        (llIlIIIIIIllIl = new int[7])[0] = ("  ".length() & ~"  ".length());
        GuiDispenser.llIlIIIIIIllIl[1] = "  ".length();
        GuiDispenser.llIlIIIIIIllIl[2] = (0xA1 ^ 0xA7);
        GuiDispenser.llIlIIIIIIllIl[3] = (-(0xFFFFEF6F & 0x3B96) & (0xFFFFFF5D & 0x406BE7));
        GuiDispenser.llIlIIIIIIllIl[4] = (0x6 ^ 0x77 ^ (0x70 ^ 0x9));
        GuiDispenser.llIlIIIIIIllIl[5] = (0x4A ^ 0x4F ^ (0xF6 ^ 0x93));
        GuiDispenser.llIlIIIIIIllIl[6] = " ".length();
    }
}
