// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui.inventory;

import net.minecraft.client.resources.I18n;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ContainerWorkbench;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class GuiCrafting extends GuiContainer
{
    private static final /* synthetic */ int[] lIlIIIIIlIIIIl;
    private static final /* synthetic */ ResourceLocation craftingTableGuiTextures;
    private static final /* synthetic */ String[] lIlIIIIIIllllI;
    
    private static boolean lllIIIIIIllIlll(final int lllllllllllllIIlIIIlIIIlIIIIlIlI, final int lllllllllllllIIlIIIlIIIlIIIIlIIl) {
        return lllllllllllllIIlIIIlIIIlIIIIlIlI < lllllllllllllIIlIIIlIIIlIIIIlIIl;
    }
    
    public GuiCrafting(final InventoryPlayer lllllllllllllIIlIIIlIIIlIllIIIII, final World lllllllllllllIIlIIIlIIIlIlIlllll) {
        this(lllllllllllllIIlIIIlIIIlIllIIIII, lllllllllllllIIlIIIlIIIlIlIlllll, BlockPos.ORIGIN);
    }
    
    public GuiCrafting(final InventoryPlayer lllllllllllllIIlIIIlIIIlIlIlIllI, final World lllllllllllllIIlIIIlIIIlIlIlIlIl, final BlockPos lllllllllllllIIlIIIlIIIlIlIlIlII) {
        super(new ContainerWorkbench(lllllllllllllIIlIIIlIIIlIlIlIllI, lllllllllllllIIlIIIlIIIlIlIlIlIl, lllllllllllllIIlIIIlIIIlIlIlIlII));
    }
    
    private static void lllIIIIIIllIIII() {
        (lIlIIIIIIllllI = new String[GuiCrafting.lIlIIIIIlIIIIl[8]])[GuiCrafting.lIlIIIIIlIIIIl[0]] = lllIIIIIIlIllIl("24nN/Pim+JQCHQ0munGHCmhpiRqMNYNUOkKPmmVXEwCUVDL16424jETOhM9Ac0FI", "RUXEW");
        GuiCrafting.lIlIIIIIIllllI[GuiCrafting.lIlIIIIIlIIIIl[1]] = lllIIIIIIlIlllI("KAMjDhkiAigIVigeLBwMIgIq", "KlMzx");
        GuiCrafting.lIlIIIIIIllllI[GuiCrafting.lIlIIIIIlIIIIl[5]] = lllIIIIIIlIllll("/zSOxfyXBGxNPD/9WBVvzrn7oBdc0Ska", "MaIHq");
    }
    
    @Override
    protected void drawGuiContainerBackgroundLayer(final float lllllllllllllIIlIIIlIIIlIlIIIllI, final int lllllllllllllIIlIIIlIIIlIlIIIlIl, final int lllllllllllllIIlIIIlIIIlIlIIIlII) {
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.getTextureManager().bindTexture(GuiCrafting.craftingTableGuiTextures);
        final int lllllllllllllIIlIIIlIIIlIlIIIIll = (this.width - this.xSize) / GuiCrafting.lIlIIIIIlIIIIl[5];
        final int lllllllllllllIIlIIIlIIIlIlIIIIlI = (this.height - this.ySize) / GuiCrafting.lIlIIIIIlIIIIl[5];
        this.drawTexturedModalRect(lllllllllllllIIlIIIlIIIlIlIIIIll, lllllllllllllIIlIIIlIIIlIlIIIIlI, GuiCrafting.lIlIIIIIlIIIIl[0], GuiCrafting.lIlIIIIIlIIIIl[0], this.xSize, this.ySize);
    }
    
    private static void lllIIIIIIllIllI() {
        (lIlIIIIIlIIIIl = new int[9])[0] = ((96 + 218 - 286 + 212 ^ 147 + 104 - 144 + 60) & (0x2C ^ 0x35 ^ (0xD6 ^ 0x98) ^ -" ".length()));
        GuiCrafting.lIlIIIIIlIIIIl[1] = " ".length();
        GuiCrafting.lIlIIIIIlIIIIl[2] = (0x63 ^ 0x7F);
        GuiCrafting.lIlIIIIIlIIIIl[3] = (0x1B ^ 0x44 ^ (0x3E ^ 0x67));
        GuiCrafting.lIlIIIIIlIIIIl[4] = (-(0xFFFFAED5 & 0x7F3B) & (0xFFFFEF57 & 0x407EF8));
        GuiCrafting.lIlIIIIIlIIIIl[5] = "  ".length();
        GuiCrafting.lIlIIIIIlIIIIl[6] = (0xC9 ^ 0xC1);
        GuiCrafting.lIlIIIIIlIIIIl[7] = (0x1D ^ 0x76 ^ (0xA5 ^ 0xAE));
        GuiCrafting.lIlIIIIIlIIIIl[8] = "   ".length();
    }
    
    private static String lllIIIIIIlIllIl(final String lllllllllllllIIlIIIlIIIlIIIlIIlI, final String lllllllllllllIIlIIIlIIIlIIIlIIIl) {
        try {
            final SecretKeySpec lllllllllllllIIlIIIlIIIlIIIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIlIIIlIIIlIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIIIlIIIlIIIlIlII = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIIIlIIIlIIIlIlII.init(GuiCrafting.lIlIIIIIlIIIIl[5], lllllllllllllIIlIIIlIIIlIIIlIlIl);
            return new String(lllllllllllllIIlIIIlIIIlIIIlIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIlIIIlIIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIIlIIIlIIIlIIll) {
            lllllllllllllIIlIIIlIIIlIIIlIIll.printStackTrace();
            return null;
        }
    }
    
    private static String lllIIIIIIlIllll(final String lllllllllllllIIlIIIlIIIlIIllIlll, final String lllllllllllllIIlIIIlIIIlIIllIllI) {
        try {
            final SecretKeySpec lllllllllllllIIlIIIlIIIlIIlllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIlIIIlIIllIllI.getBytes(StandardCharsets.UTF_8)), GuiCrafting.lIlIIIIIlIIIIl[6]), "DES");
            final Cipher lllllllllllllIIlIIIlIIIlIIlllIIl = Cipher.getInstance("DES");
            lllllllllllllIIlIIIlIIIlIIlllIIl.init(GuiCrafting.lIlIIIIIlIIIIl[5], lllllllllllllIIlIIIlIIIlIIlllIlI);
            return new String(lllllllllllllIIlIIIlIIIlIIlllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIlIIIlIIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIIlIIIlIIlllIII) {
            lllllllllllllIIlIIIlIIIlIIlllIII.printStackTrace();
            return null;
        }
    }
    
    private static String lllIIIIIIlIlllI(String lllllllllllllIIlIIIlIIIlIIlIIIlI, final String lllllllllllllIIlIIIlIIIlIIlIIIIl) {
        lllllllllllllIIlIIIlIIIlIIlIIIlI = (Exception)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIIIlIIIlIIlIIIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIIIlIIIlIIlIIlIl = new StringBuilder();
        final char[] lllllllllllllIIlIIIlIIIlIIlIIlII = lllllllllllllIIlIIIlIIIlIIlIIIIl.toCharArray();
        int lllllllllllllIIlIIIlIIIlIIlIIIll = GuiCrafting.lIlIIIIIlIIIIl[0];
        final byte lllllllllllllIIlIIIlIIIlIIIlllIl = (Object)((String)lllllllllllllIIlIIIlIIIlIIlIIIlI).toCharArray();
        final Exception lllllllllllllIIlIIIlIIIlIIIlllII = (Exception)lllllllllllllIIlIIIlIIIlIIIlllIl.length;
        double lllllllllllllIIlIIIlIIIlIIIllIll = GuiCrafting.lIlIIIIIlIIIIl[0];
        while (lllIIIIIIllIlll((int)lllllllllllllIIlIIIlIIIlIIIllIll, (int)lllllllllllllIIlIIIlIIIlIIIlllII)) {
            final char lllllllllllllIIlIIIlIIIlIIlIlIII = lllllllllllllIIlIIIlIIIlIIIlllIl[lllllllllllllIIlIIIlIIIlIIIllIll];
            lllllllllllllIIlIIIlIIIlIIlIIlIl.append((char)(lllllllllllllIIlIIIlIIIlIIlIlIII ^ lllllllllllllIIlIIIlIIIlIIlIIlII[lllllllllllllIIlIIIlIIIlIIlIIIll % lllllllllllllIIlIIIlIIIlIIlIIlII.length]));
            "".length();
            ++lllllllllllllIIlIIIlIIIlIIlIIIll;
            ++lllllllllllllIIlIIIlIIIlIIIllIll;
            "".length();
            if ("   ".length() > (0xB6 ^ 0xB2)) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIIIlIIIlIIlIIlIl);
    }
    
    static {
        lllIIIIIIllIllI();
        lllIIIIIIllIIII();
        craftingTableGuiTextures = new ResourceLocation(GuiCrafting.lIlIIIIIIllllI[GuiCrafting.lIlIIIIIlIIIIl[0]]);
    }
    
    @Override
    protected void drawGuiContainerForegroundLayer(final int lllllllllllllIIlIIIlIIIlIlIIllIl, final int lllllllllllllIIlIIIlIIIlIlIIllII) {
        this.fontRendererObj.drawString(I18n.format(GuiCrafting.lIlIIIIIIllllI[GuiCrafting.lIlIIIIIlIIIIl[1]], new Object[GuiCrafting.lIlIIIIIlIIIIl[0]]), GuiCrafting.lIlIIIIIlIIIIl[2], GuiCrafting.lIlIIIIIlIIIIl[3], GuiCrafting.lIlIIIIIlIIIIl[4]);
        "".length();
        this.fontRendererObj.drawString(I18n.format(GuiCrafting.lIlIIIIIIllllI[GuiCrafting.lIlIIIIIlIIIIl[5]], new Object[GuiCrafting.lIlIIIIIlIIIIl[0]]), GuiCrafting.lIlIIIIIlIIIIl[6], this.ySize - GuiCrafting.lIlIIIIIlIIIIl[7] + GuiCrafting.lIlIIIIIlIIIIl[5], GuiCrafting.lIlIIIIIlIIIIl[4]);
        "".length();
    }
}
