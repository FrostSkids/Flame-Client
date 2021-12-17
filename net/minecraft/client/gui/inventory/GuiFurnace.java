// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui.inventory;

import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerFurnace;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.tileentity.TileEntityFurnace;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.player.InventoryPlayer;

public class GuiFurnace extends GuiContainer
{
    private static final /* synthetic */ int[] lIllllIlllIIll;
    private static final /* synthetic */ String[] lIllllIlllIIIl;
    private final /* synthetic */ InventoryPlayer playerInventory;
    private static final /* synthetic */ ResourceLocation furnaceGuiTextures;
    private /* synthetic */ IInventory tileFurnace;
    
    private static boolean lIIIIlIIlllIIIII(final int llllllllllllIllllIlIIIIlIllIIlIl) {
        return llllllllllllIllllIlIIIIlIllIIlIl != 0;
    }
    
    private int getCookProgressScaled(final int llllllllllllIllllIlIIIIllIIlIIlI) {
        final int llllllllllllIllllIlIIIIllIIlIIIl = this.tileFurnace.getField(GuiFurnace.lIllllIlllIIll[1]);
        final int llllllllllllIllllIlIIIIllIIlIIII = this.tileFurnace.getField(GuiFurnace.lIllllIlllIIll[17]);
        int n;
        if (lIIIIlIIlllIIIII(llllllllllllIllllIlIIIIllIIlIIII) && lIIIIlIIlllIIIII(llllllllllllIllllIlIIIIllIIlIIIl)) {
            n = llllllllllllIllllIlIIIIllIIlIIIl * llllllllllllIllllIlIIIIllIIlIIlI / llllllllllllIllllIlIIIIllIIlIIII;
            "".length();
            if (((0x0 ^ 0x36 ^ (0x86 ^ 0x9B)) & (68 + 33 + 60 + 28 ^ 113 + 49 - 152 + 140 ^ -" ".length())) > ((87 + 17 - 39 + 62 ^ (0x48 ^ 0x12)) & (197 + 10 - 78 + 98 ^ 81 + 121 - 91 + 87 ^ -" ".length()))) {
                return (0x9E ^ 0x97 ^ (0xD6 ^ 0x9D)) & (0x1D ^ 0x36 ^ (0x76 ^ 0x1F) ^ -" ".length());
            }
        }
        else {
            n = GuiFurnace.lIllllIlllIIll[0];
        }
        return n;
    }
    
    @Override
    protected void drawGuiContainerBackgroundLayer(final float llllllllllllIllllIlIIIIllIlIIIlI, final int llllllllllllIllllIlIIIIllIlIIIIl, final int llllllllllllIllllIlIIIIllIlIIIII) {
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.getTextureManager().bindTexture(GuiFurnace.furnaceGuiTextures);
        final int llllllllllllIllllIlIIIIllIIlllll = (this.width - this.xSize) / GuiFurnace.lIllllIlllIIll[1];
        final int llllllllllllIllllIlIIIIllIIllllI = (this.height - this.ySize) / GuiFurnace.lIllllIlllIIll[1];
        this.drawTexturedModalRect(llllllllllllIllllIlIIIIllIIlllll, llllllllllllIllllIlIIIIllIIllllI, GuiFurnace.lIllllIlllIIll[0], GuiFurnace.lIllllIlllIIll[0], this.xSize, this.ySize);
        if (lIIIIlIIlllIIIII(TileEntityFurnace.isBurning(this.tileFurnace) ? 1 : 0)) {
            final int llllllllllllIllllIlIIIIllIIlllIl = this.getBurnLeftScaled(GuiFurnace.lIllllIlllIIll[6]);
            this.drawTexturedModalRect(llllllllllllIllllIlIIIIllIIlllll + GuiFurnace.lIllllIlllIIll[7], llllllllllllIllllIlIIIIllIIllllI + GuiFurnace.lIllllIlllIIll[8] + GuiFurnace.lIllllIlllIIll[9] - llllllllllllIllllIlIIIIllIIlllIl, GuiFurnace.lIllllIlllIIll[10], GuiFurnace.lIllllIlllIIll[9] - llllllllllllIllllIlIIIIllIIlllIl, GuiFurnace.lIllllIlllIIll[11], llllllllllllIllllIlIIIIllIIlllIl + GuiFurnace.lIllllIlllIIll[12]);
        }
        final int llllllllllllIllllIlIIIIllIIlllII = this.getCookProgressScaled(GuiFurnace.lIllllIlllIIll[13]);
        this.drawTexturedModalRect(llllllllllllIllllIlIIIIllIIlllll + GuiFurnace.lIllllIlllIIll[14], llllllllllllIllllIlIIIIllIIllllI + GuiFurnace.lIllllIlllIIll[15], GuiFurnace.lIllllIlllIIll[10], GuiFurnace.lIllllIlllIIll[11], llllllllllllIllllIlIIIIllIIlllII + GuiFurnace.lIllllIlllIIll[12], GuiFurnace.lIllllIlllIIll[16]);
    }
    
    private int getBurnLeftScaled(final int llllllllllllIllllIlIIIIllIIIIlll) {
        int llllllllllllIllllIlIIIIllIIIIllI = this.tileFurnace.getField(GuiFurnace.lIllllIlllIIll[12]);
        if (lIIIIlIIlllIIIIl(llllllllllllIllllIlIIIIllIIIIllI)) {
            llllllllllllIllllIlIIIIllIIIIllI = GuiFurnace.lIllllIlllIIll[18];
        }
        return this.tileFurnace.getField(GuiFurnace.lIllllIlllIIll[0]) * llllllllllllIllllIlIIIIllIIIIlll / llllllllllllIllllIlIIIIllIIIIllI;
    }
    
    static {
        lIIIIlIIllIlllll();
        lIIIIlIIllIlllII();
        furnaceGuiTextures = new ResourceLocation(GuiFurnace.lIllllIlllIIIl[GuiFurnace.lIllllIlllIIll[0]]);
    }
    
    private static void lIIIIlIIllIlllll() {
        (lIllllIlllIIll = new int[19])[0] = ((0x9D ^ 0xC7) & ~(0x51 ^ 0xB));
        GuiFurnace.lIllllIlllIIll[1] = "  ".length();
        GuiFurnace.lIllllIlllIIll[2] = (0x75 ^ 0x73);
        GuiFurnace.lIllllIlllIIll[3] = (-(0xFFFFFFBE & 0x37FF) & (-1 & 0x4077FD));
        GuiFurnace.lIllllIlllIIll[4] = (0x5C ^ 0x54);
        GuiFurnace.lIllllIlllIIll[5] = (0x1E ^ 0xE ^ (0xC4 ^ 0xB4));
        GuiFurnace.lIllllIlllIIll[6] = (0x8 ^ 0x5);
        GuiFurnace.lIllllIlllIIll[7] = (0x7 ^ 0x3F);
        GuiFurnace.lIllllIlllIIll[8] = (0xB0 ^ 0x94);
        GuiFurnace.lIllllIlllIIll[9] = (0xB8 ^ 0xB4);
        GuiFurnace.lIllllIlllIIll[10] = 100 + 83 - 56 + 49;
        GuiFurnace.lIllllIlllIIll[11] = (0x8F ^ 0x81);
        GuiFurnace.lIllllIlllIIll[12] = " ".length();
        GuiFurnace.lIllllIlllIIll[13] = (0xAB ^ 0xBA ^ (0x50 ^ 0x59));
        GuiFurnace.lIllllIlllIIll[14] = (0x3E ^ 0x33 ^ (0xCA ^ 0x88));
        GuiFurnace.lIllllIlllIIll[15] = (0x3B ^ 0x19);
        GuiFurnace.lIllllIlllIIll[16] = (0x19 ^ 0x6B ^ (0xEF ^ 0x8D));
        GuiFurnace.lIllllIlllIIll[17] = "   ".length();
        GuiFurnace.lIllllIlllIIll[18] = 192 + 37 - 91 + 62;
    }
    
    private static String lIIIIlIIllIllIll(String llllllllllllIllllIlIIIIlIlllIIll, final String llllllllllllIllllIlIIIIlIlllIlll) {
        llllllllllllIllllIlIIIIlIlllIIll = new String(Base64.getDecoder().decode(llllllllllllIllllIlIIIIlIlllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIlIIIIlIlllIllI = new StringBuilder();
        final char[] llllllllllllIllllIlIIIIlIlllIlIl = llllllllllllIllllIlIIIIlIlllIlll.toCharArray();
        int llllllllllllIllllIlIIIIlIlllIlII = GuiFurnace.lIllllIlllIIll[0];
        final float llllllllllllIllllIlIIIIlIllIlllI = (Object)llllllllllllIllllIlIIIIlIlllIIll.toCharArray();
        final int llllllllllllIllllIlIIIIlIllIllIl = llllllllllllIllllIlIIIIlIllIlllI.length;
        double llllllllllllIllllIlIIIIlIllIllII = GuiFurnace.lIllllIlllIIll[0];
        while (lIIIIlIIlllIIIlI((int)llllllllllllIllllIlIIIIlIllIllII, llllllllllllIllllIlIIIIlIllIllIl)) {
            final char llllllllllllIllllIlIIIIlIllllIIl = llllllllllllIllllIlIIIIlIllIlllI[llllllllllllIllllIlIIIIlIllIllII];
            llllllllllllIllllIlIIIIlIlllIllI.append((char)(llllllllllllIllllIlIIIIlIllllIIl ^ llllllllllllIllllIlIIIIlIlllIlIl[llllllllllllIllllIlIIIIlIlllIlII % llllllllllllIllllIlIIIIlIlllIlIl.length]));
            "".length();
            ++llllllllllllIllllIlIIIIlIlllIlII;
            ++llllllllllllIllllIlIIIIlIllIllII;
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIlIIIIlIlllIllI);
    }
    
    private static void lIIIIlIIllIlllII() {
        (lIllllIlllIIIl = new String[GuiFurnace.lIllllIlllIIll[12]])[GuiFurnace.lIllllIlllIIll[0]] = lIIIIlIIllIllIll("OCcaJD0+JxF/LzkrTTMnIjYDOSYpME02PT4sAzMtYjIMNw==", "LBbPH");
    }
    
    private static boolean lIIIIlIIlllIIIIl(final int llllllllllllIllllIlIIIIlIllIIIll) {
        return llllllllllllIllllIlIIIIlIllIIIll == 0;
    }
    
    @Override
    protected void drawGuiContainerForegroundLayer(final int llllllllllllIllllIlIIIIllIlIllII, final int llllllllllllIllllIlIIIIllIlIlIll) {
        final String llllllllllllIllllIlIIIIllIlIlIlI = this.tileFurnace.getDisplayName().getUnformattedText();
        this.fontRendererObj.drawString(llllllllllllIllllIlIIIIllIlIlIlI, this.xSize / GuiFurnace.lIllllIlllIIll[1] - this.fontRendererObj.getStringWidth(llllllllllllIllllIlIIIIllIlIlIlI) / GuiFurnace.lIllllIlllIIll[1], GuiFurnace.lIllllIlllIIll[2], GuiFurnace.lIllllIlllIIll[3]);
        "".length();
        this.fontRendererObj.drawString(this.playerInventory.getDisplayName().getUnformattedText(), GuiFurnace.lIllllIlllIIll[4], this.ySize - GuiFurnace.lIllllIlllIIll[5] + GuiFurnace.lIllllIlllIIll[1], GuiFurnace.lIllllIlllIIll[3]);
        "".length();
    }
    
    private static boolean lIIIIlIIlllIIIlI(final int llllllllllllIllllIlIIIIlIllIlIII, final int llllllllllllIllllIlIIIIlIllIIlll) {
        return llllllllllllIllllIlIIIIlIllIlIII < llllllllllllIllllIlIIIIlIllIIlll;
    }
    
    public GuiFurnace(final InventoryPlayer llllllllllllIllllIlIIIIllIllIlII, final IInventory llllllllllllIllllIlIIIIllIllIIII) {
        super(new ContainerFurnace(llllllllllllIllllIlIIIIllIllIlII, llllllllllllIllllIlIIIIllIllIIII));
        this.playerInventory = llllllllllllIllllIlIIIIllIllIlII;
        this.tileFurnace = llllllllllllIllllIlIIIIllIllIIII;
    }
}
