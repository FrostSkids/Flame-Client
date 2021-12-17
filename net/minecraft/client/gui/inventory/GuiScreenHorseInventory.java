// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui.inventory;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.inventory.Container;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ContainerHorseInventory;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.inventory.IInventory;
import net.minecraft.entity.passive.EntityHorse;

public class GuiScreenHorseInventory extends GuiContainer
{
    private /* synthetic */ EntityHorse horseEntity;
    private /* synthetic */ IInventory horseInventory;
    private static final /* synthetic */ String[] lIIIIllIIIIlll;
    private /* synthetic */ float mousePosY;
    private static final /* synthetic */ int[] lIIIIllIIIlIll;
    private /* synthetic */ IInventory playerInventory;
    private /* synthetic */ float mousePosx;
    private static final /* synthetic */ ResourceLocation horseGuiTextures;
    
    private static void lIlllIlIllllIlI() {
        (lIIIIllIIIIlll = new String[GuiScreenHorseInventory.lIIIIllIIIlIll[17]])[GuiScreenHorseInventory.lIIIIllIIIlIll[0]] = lIlllIlIllllIIl("1QY6KmxKqLeVTknutToegt3QBOwVay7c/zxTBeGkNOug/EwQt2DtMA==", "fdUNT");
    }
    
    @Override
    protected void drawGuiContainerBackgroundLayer(final float lllllllllllllIlIIlIIlllllllIlllI, final int lllllllllllllIlIIlIIlllllllIllIl, final int lllllllllllllIlIIlIIlllllllIllII) {
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.getTextureManager().bindTexture(GuiScreenHorseInventory.horseGuiTextures);
        final int lllllllllllllIlIIlIIlllllllIlIll = (this.width - this.xSize) / GuiScreenHorseInventory.lIIIIllIIIlIll[5];
        final int lllllllllllllIlIIlIIlllllllIlIlI = (this.height - this.ySize) / GuiScreenHorseInventory.lIIIIllIIIlIll[5];
        this.drawTexturedModalRect(lllllllllllllIlIIlIIlllllllIlIll, lllllllllllllIlIIlIIlllllllIlIlI, GuiScreenHorseInventory.lIIIIllIIIlIll[0], GuiScreenHorseInventory.lIIIIllIIIlIll[0], this.xSize, this.ySize);
        if (lIlllIlIlllllIl(this.horseEntity.isChested() ? 1 : 0)) {
            this.drawTexturedModalRect(lllllllllllllIlIIlIIlllllllIlIll + GuiScreenHorseInventory.lIIIIllIIIlIll[6], lllllllllllllIlIIlIIlllllllIlIlI + GuiScreenHorseInventory.lIIIIllIIIlIll[7], GuiScreenHorseInventory.lIIIIllIIIlIll[0], this.ySize, GuiScreenHorseInventory.lIIIIllIIIlIll[8], GuiScreenHorseInventory.lIIIIllIIIlIll[9]);
        }
        if (lIlllIlIlllllIl(this.horseEntity.canWearArmor() ? 1 : 0)) {
            this.drawTexturedModalRect(lllllllllllllIlIIlIIlllllllIlIll + GuiScreenHorseInventory.lIIIIllIIIlIll[10], lllllllllllllIlIIlIIlllllllIlIlI + GuiScreenHorseInventory.lIIIIllIIIlIll[11], GuiScreenHorseInventory.lIIIIllIIIlIll[0], this.ySize + GuiScreenHorseInventory.lIIIIllIIIlIll[9], GuiScreenHorseInventory.lIIIIllIIIlIll[12], GuiScreenHorseInventory.lIIIIllIIIlIll[12]);
        }
        GuiInventory.drawEntityOnScreen(lllllllllllllIlIIlIIlllllllIlIll + GuiScreenHorseInventory.lIIIIllIIIlIll[13], lllllllllllllIlIIlIIlllllllIlIlI + GuiScreenHorseInventory.lIIIIllIIIlIll[14], GuiScreenHorseInventory.lIIIIllIIIlIll[7], lllllllllllllIlIIlIIlllllllIlIll + GuiScreenHorseInventory.lIIIIllIIIlIll[13] - this.mousePosx, lllllllllllllIlIIlIIlllllllIlIlI + GuiScreenHorseInventory.lIIIIllIIIlIll[15] - GuiScreenHorseInventory.lIIIIllIIIlIll[16] - this.mousePosY, this.horseEntity);
    }
    
    public GuiScreenHorseInventory(final IInventory lllllllllllllIlIIlIIlllllllllllI, final IInventory lllllllllllllIlIIlIIllllllllllIl, final EntityHorse lllllllllllllIlIIlIIlllllllllIII) {
        super(new ContainerHorseInventory(lllllllllllllIlIIlIIlllllllllllI, lllllllllllllIlIIlIIllllllllllIl, lllllllllllllIlIIlIIlllllllllIII, Minecraft.getMinecraft().thePlayer));
        this.playerInventory = lllllllllllllIlIIlIIlllllllllllI;
        this.horseInventory = lllllllllllllIlIIlIIllllllllllIl;
        this.horseEntity = lllllllllllllIlIIlIIlllllllllIII;
        this.allowUserInput = (GuiScreenHorseInventory.lIIIIllIIIlIll[0] != 0);
    }
    
    @Override
    protected void drawGuiContainerForegroundLayer(final int lllllllllllllIlIIlIIllllllllIlIl, final int lllllllllllllIlIIlIIllllllllIlII) {
        this.fontRendererObj.drawString(this.horseInventory.getDisplayName().getUnformattedText(), GuiScreenHorseInventory.lIIIIllIIIlIll[1], GuiScreenHorseInventory.lIIIIllIIIlIll[2], GuiScreenHorseInventory.lIIIIllIIIlIll[3]);
        "".length();
        this.fontRendererObj.drawString(this.playerInventory.getDisplayName().getUnformattedText(), GuiScreenHorseInventory.lIIIIllIIIlIll[1], this.ySize - GuiScreenHorseInventory.lIIIIllIIIlIll[4] + GuiScreenHorseInventory.lIIIIllIIIlIll[5], GuiScreenHorseInventory.lIIIIllIIIlIll[3]);
        "".length();
    }
    
    private static boolean lIlllIlIlllllIl(final int lllllllllllllIlIIlIIllllllIIllII) {
        return lllllllllllllIlIIlIIllllllIIllII != 0;
    }
    
    @Override
    public void drawScreen(final int lllllllllllllIlIIlIIlllllllIIIIl, final int lllllllllllllIlIIlIIllllllIlllII, final float lllllllllllllIlIIlIIllllllIllIll) {
        this.mousePosx = (float)lllllllllllllIlIIlIIlllllllIIIIl;
        this.mousePosY = (float)lllllllllllllIlIIlIIllllllIlllII;
        super.drawScreen(lllllllllllllIlIIlIIlllllllIIIIl, lllllllllllllIlIIlIIllllllIlllII, lllllllllllllIlIIlIIllllllIllIll);
    }
    
    private static String lIlllIlIllllIIl(final String lllllllllllllIlIIlIIllllllIlIIIl, final String lllllllllllllIlIIlIIllllllIlIIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIIllllllIlIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIIllllllIlIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIlIIllllllIlIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIlIIllllllIlIlIl.init(GuiScreenHorseInventory.lIIIIllIIIlIll[5], lllllllllllllIlIIlIIllllllIlIllI);
            return new String(lllllllllllllIlIIlIIllllllIlIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIIllllllIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIIllllllIlIlII) {
            lllllllllllllIlIIlIIllllllIlIlII.printStackTrace();
            return null;
        }
    }
    
    private static void lIlllIlIlllllII() {
        (lIIIIllIIIlIll = new int[18])[0] = ((0xF8 ^ 0xAE) & ~(0x28 ^ 0x7E));
        GuiScreenHorseInventory.lIIIIllIIIlIll[1] = (55 + 103 - 150 + 128 ^ 102 + 17 - 83 + 92);
        GuiScreenHorseInventory.lIIIIllIIIlIll[2] = (0x1A ^ 0x1C);
        GuiScreenHorseInventory.lIIIIllIIIlIll[3] = (0xFFFFEC71 & 0x4053CE);
        GuiScreenHorseInventory.lIIIIllIIIlIll[4] = (169 + 6 - 127 + 146 ^ 123 + 27 + 12 + 0);
        GuiScreenHorseInventory.lIIIIllIIIlIll[5] = "  ".length();
        GuiScreenHorseInventory.lIIIIllIIIlIll[6] = (0x41 ^ 0xE);
        GuiScreenHorseInventory.lIIIIllIIIlIll[7] = (58 + 153 - 99 + 58 ^ 26 + 157 - 176 + 180);
        GuiScreenHorseInventory.lIIIIllIIIlIll[8] = (49 + 190 - 49 + 16 ^ 107 + 9 - 92 + 124);
        GuiScreenHorseInventory.lIIIIllIIIlIll[9] = (17 + 137 - 150 + 142 ^ 127 + 123 - 217 + 131);
        GuiScreenHorseInventory.lIIIIllIIIlIll[10] = (0x7A ^ 0x7D);
        GuiScreenHorseInventory.lIIIIllIIIlIll[11] = (0x91 ^ 0xB2);
        GuiScreenHorseInventory.lIIIIllIIIlIll[12] = (0x5C ^ 0x4E);
        GuiScreenHorseInventory.lIIIIllIIIlIll[13] = (0x0 ^ 0x33);
        GuiScreenHorseInventory.lIIIIllIIIlIll[14] = (0x5D ^ 0x75 ^ (0x69 ^ 0x7D));
        GuiScreenHorseInventory.lIIIIllIIIlIll[15] = (0x38 ^ 0x73);
        GuiScreenHorseInventory.lIIIIllIIIlIll[16] = (0x3D ^ 0x6D ^ (0x4C ^ 0x2E));
        GuiScreenHorseInventory.lIIIIllIIIlIll[17] = " ".length();
    }
    
    static {
        lIlllIlIlllllII();
        lIlllIlIllllIlI();
        horseGuiTextures = new ResourceLocation(GuiScreenHorseInventory.lIIIIllIIIIlll[GuiScreenHorseInventory.lIIIIllIIIlIll[0]]);
    }
}
