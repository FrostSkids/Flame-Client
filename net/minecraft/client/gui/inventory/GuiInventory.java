// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui.inventory;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.io.IOException;
import net.minecraft.client.gui.achievement.GuiStats;
import net.minecraft.client.gui.achievement.GuiAchievements;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.entity.Entity;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.InventoryEffectRenderer;

public class GuiInventory extends InventoryEffectRenderer
{
    private /* synthetic */ float oldMouseY;
    private /* synthetic */ float oldMouseX;
    private static final /* synthetic */ String[] llIlllIllIllll;
    private static final /* synthetic */ int[] llIlllIllllIII;
    
    @Override
    protected void drawGuiContainerBackgroundLayer(final float llllllllllllIllIIlIIIIlIIIlllIIl, final int llllllllllllIllIIlIIIIlIIIlllIII, final int llllllllllllIllIIlIIIIlIIIllIlll) {
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.getTextureManager().bindTexture(GuiInventory.inventoryBackground);
        final int llllllllllllIllIIlIIIIlIIIllIllI = this.guiLeft;
        final int llllllllllllIllIIlIIIIlIIIllIlIl = this.guiTop;
        this.drawTexturedModalRect(llllllllllllIllIIlIIIIlIIIllIllI, llllllllllllIllIIlIIIIlIIIllIlIl, GuiInventory.llIlllIllllIII[1], GuiInventory.llIlllIllllIII[1], this.xSize, this.ySize);
        drawEntityOnScreen(llllllllllllIllIIlIIIIlIIIllIllI + GuiInventory.llIlllIllllIII[5], llllllllllllIllIIlIIIIlIIIllIlIl + GuiInventory.llIlllIllllIII[6], GuiInventory.llIlllIllllIII[7], llllllllllllIllIIlIIIIlIIIllIllI + GuiInventory.llIlllIllllIII[5] - this.oldMouseX, llllllllllllIllIIlIIIIlIIIllIlIl + GuiInventory.llIlllIllllIII[6] - GuiInventory.llIlllIllllIII[8] - this.oldMouseY, this.mc.thePlayer);
    }
    
    @Override
    public void initGui() {
        this.buttonList.clear();
        if (lIIllIlIIIllIIII(this.mc.playerController.isInCreativeMode() ? 1 : 0)) {
            this.mc.displayGuiScreen(new GuiContainerCreative(this.mc.thePlayer));
            "".length();
            if (((0xA1 ^ 0xB3 ^ "   ".length()) & (0x97 ^ 0x86 ^ ((0x86 ^ 0xBA) & ~(0xA4 ^ 0x98)) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else {
            super.initGui();
        }
    }
    
    private static void lIIllIlIIIlIIlll() {
        (llIlllIllIllll = new String[GuiInventory.llIlllIllllIII[0]])[GuiInventory.llIlllIllllIII[1]] = lIIllIlIIIlIIllI("J+S3fMpGcsFn7kDED6z84xuuzNm14QBR", "vRiuI");
    }
    
    public static void drawEntityOnScreen(final int llllllllllllIllIIlIIIIlIIIlIIlIl, final int llllllllllllIllIIlIIIIlIIIlIIlII, final int llllllllllllIllIIlIIIIlIIIlIIIll, final float llllllllllllIllIIlIIIIlIIIlIIIlI, final float llllllllllllIllIIlIIIIlIIIlIIIIl, final EntityLivingBase llllllllllllIllIIlIIIIlIIIIlIlII) {
        GlStateManager.enableColorMaterial();
        GlStateManager.pushMatrix();
        GlStateManager.translate((float)llllllllllllIllIIlIIIIlIIIlIIlIl, (float)llllllllllllIllIIlIIIIlIIIlIIlII, 50.0f);
        GlStateManager.scale((float)(-llllllllllllIllIIlIIIIlIIIlIIIll), (float)llllllllllllIllIIlIIIIlIIIlIIIll, (float)llllllllllllIllIIlIIIIlIIIlIIIll);
        GlStateManager.rotate(180.0f, 0.0f, 0.0f, 1.0f);
        final float llllllllllllIllIIlIIIIlIIIIlllll = llllllllllllIllIIlIIIIlIIIIlIlII.renderYawOffset;
        final float llllllllllllIllIIlIIIIlIIIIllllI = llllllllllllIllIIlIIIIlIIIIlIlII.rotationYaw;
        final float llllllllllllIllIIlIIIIlIIIIlllIl = llllllllllllIllIIlIIIIlIIIIlIlII.rotationPitch;
        final float llllllllllllIllIIlIIIIlIIIIlllII = llllllllllllIllIIlIIIIlIIIIlIlII.prevRotationYawHead;
        final float llllllllllllIllIIlIIIIlIIIIllIll = llllllllllllIllIIlIIIIlIIIIlIlII.rotationYawHead;
        GlStateManager.rotate(135.0f, 0.0f, 1.0f, 0.0f);
        RenderHelper.enableStandardItemLighting();
        GlStateManager.rotate(-135.0f, 0.0f, 1.0f, 0.0f);
        GlStateManager.rotate(-(float)Math.atan(llllllllllllIllIIlIIIIlIIIlIIIIl / 40.0f) * 20.0f, 1.0f, 0.0f, 0.0f);
        llllllllllllIllIIlIIIIlIIIIlIlII.renderYawOffset = (float)Math.atan(llllllllllllIllIIlIIIIlIIIlIIIlI / 40.0f) * 20.0f;
        llllllllllllIllIIlIIIIlIIIIlIlII.rotationYaw = (float)Math.atan(llllllllllllIllIIlIIIIlIIIlIIIlI / 40.0f) * 40.0f;
        llllllllllllIllIIlIIIIlIIIIlIlII.rotationPitch = -(float)Math.atan(llllllllllllIllIIlIIIIlIIIlIIIIl / 40.0f) * 20.0f;
        llllllllllllIllIIlIIIIlIIIIlIlII.rotationYawHead = llllllllllllIllIIlIIIIlIIIIlIlII.rotationYaw;
        llllllllllllIllIIlIIIIlIIIIlIlII.prevRotationYawHead = llllllllllllIllIIlIIIIlIIIIlIlII.rotationYaw;
        GlStateManager.translate(0.0f, 0.0f, 0.0f);
        final RenderManager llllllllllllIllIIlIIIIlIIIIllIlI = Minecraft.getMinecraft().getRenderManager();
        llllllllllllIllIIlIIIIlIIIIllIlI.setPlayerViewY(180.0f);
        llllllllllllIllIIlIIIIlIIIIllIlI.setRenderShadow((boolean)(GuiInventory.llIlllIllllIII[1] != 0));
        llllllllllllIllIIlIIIIlIIIIllIlI.renderEntityWithPosYaw(llllllllllllIllIIlIIIIlIIIIlIlII, 0.0, 0.0, 0.0, 0.0f, 1.0f);
        "".length();
        llllllllllllIllIIlIIIIlIIIIllIlI.setRenderShadow((boolean)(GuiInventory.llIlllIllllIII[0] != 0));
        llllllllllllIllIIlIIIIlIIIIlIlII.renderYawOffset = llllllllllllIllIIlIIIIlIIIIlllll;
        llllllllllllIllIIlIIIIlIIIIlIlII.rotationYaw = llllllllllllIllIIlIIIIlIIIIllllI;
        llllllllllllIllIIlIIIIlIIIIlIlII.rotationPitch = llllllllllllIllIIlIIIIlIIIIlllIl;
        llllllllllllIllIIlIIIIlIIIIlIlII.prevRotationYawHead = llllllllllllIllIIlIIIIlIIIIlllII;
        llllllllllllIllIIlIIIIlIIIIlIlII.rotationYawHead = llllllllllllIllIIlIIIIlIIIIllIll;
        GlStateManager.popMatrix();
        RenderHelper.disableStandardItemLighting();
        GlStateManager.disableRescaleNormal();
        GlStateManager.setActiveTexture(OpenGlHelper.lightmapTexUnit);
        GlStateManager.disableTexture2D();
        GlStateManager.setActiveTexture(OpenGlHelper.defaultTexUnit);
    }
    
    private static void lIIllIlIIIlIllll() {
        (llIlllIllllIII = new int[11])[0] = " ".length();
        GuiInventory.llIlllIllllIII[1] = ((173 + 22 - 127 + 180 ^ 176 + 173 - 312 + 150) & (0xBC ^ 0x82 ^ (0x6A ^ 0x17) ^ -" ".length()));
        GuiInventory.llIlllIllllIII[2] = (0x74 ^ 0x22);
        GuiInventory.llIlllIllllIII[3] = (0x38 ^ 0x32 ^ (0x5 ^ 0x1F));
        GuiInventory.llIlllIllllIII[4] = (-(27 + 43 + 8 + 59) & (0xFFFFEAEF & 0x4055D8));
        GuiInventory.llIlllIllllIII[5] = (0x35 ^ 0x6D ^ (0x54 ^ 0x3F));
        GuiInventory.llIlllIllllIII[6] = (127 + 141 - 238 + 175 ^ 121 + 85 - 189 + 117);
        GuiInventory.llIlllIllllIII[7] = (0x72 ^ 0x6C);
        GuiInventory.llIlllIllllIII[8] = (105 + 132 - 97 + 0 ^ 69 + 137 - 175 + 159);
        GuiInventory.llIlllIllllIII[9] = (0x48 ^ 0x40);
        GuiInventory.llIlllIllllIII[10] = "  ".length();
    }
    
    @Override
    public void updateScreen() {
        if (lIIllIlIIIllIIII(this.mc.playerController.isInCreativeMode() ? 1 : 0)) {
            this.mc.displayGuiScreen(new GuiContainerCreative(this.mc.thePlayer));
        }
        this.updateActivePotionEffects();
    }
    
    @Override
    protected void drawGuiContainerForegroundLayer(final int llllllllllllIllIIlIIIIlIIlIIllII, final int llllllllllllIllIIlIIIIlIIlIIlIll) {
        this.fontRendererObj.drawString(I18n.format(GuiInventory.llIlllIllIllll[GuiInventory.llIlllIllllIII[1]], new Object[GuiInventory.llIlllIllllIII[1]]), GuiInventory.llIlllIllllIII[2], GuiInventory.llIlllIllllIII[3], GuiInventory.llIlllIllllIII[4]);
        "".length();
    }
    
    private static boolean lIIllIlIIIllIIIl(final int llllllllllllIllIIlIIIIIlllllIIll) {
        return llllllllllllIllIIlIIIIIlllllIIll == 0;
    }
    
    private static boolean lIIllIlIIIllIIlI(final int llllllllllllIllIIlIIIIIllllllIII, final int llllllllllllIllIIlIIIIIlllllIlll) {
        return llllllllllllIllIIlIIIIIllllllIII == llllllllllllIllIIlIIIIIlllllIlll;
    }
    
    public GuiInventory(final EntityPlayer llllllllllllIllIIlIIIIlIIlIlIlll) {
        super(llllllllllllIllIIlIIIIlIIlIlIlll.inventoryContainer);
        this.allowUserInput = (GuiInventory.llIlllIllllIII[0] != 0);
    }
    
    static {
        lIIllIlIIIlIllll();
        lIIllIlIIIlIIlll();
    }
    
    @Override
    protected void actionPerformed(final GuiButton llllllllllllIllIIlIIIIlIIIIIlIII) throws IOException {
        if (lIIllIlIIIllIIIl(llllllllllllIllIIlIIIIlIIIIIlIII.id)) {
            this.mc.displayGuiScreen(new GuiAchievements(this, this.mc.thePlayer.getStatFileWriter()));
        }
        if (lIIllIlIIIllIIlI(llllllllllllIllIIlIIIIlIIIIIlIII.id, GuiInventory.llIlllIllllIII[0])) {
            this.mc.displayGuiScreen(new GuiStats(this, this.mc.thePlayer.getStatFileWriter()));
        }
    }
    
    @Override
    public void drawScreen(final int llllllllllllIllIIlIIIIlIIlIIIIII, final int llllllllllllIllIIlIIIIlIIIllllll, final float llllllllllllIllIIlIIIIlIIIlllllI) {
        super.drawScreen(llllllllllllIllIIlIIIIlIIlIIIIII, llllllllllllIllIIlIIIIlIIIllllll, llllllllllllIllIIlIIIIlIIIlllllI);
        this.oldMouseX = (float)llllllllllllIllIIlIIIIlIIlIIIIII;
        this.oldMouseY = (float)llllllllllllIllIIlIIIIlIIIllllll;
    }
    
    private static boolean lIIllIlIIIllIIII(final int llllllllllllIllIIlIIIIIlllllIlIl) {
        return llllllllllllIllIIlIIIIIlllllIlIl != 0;
    }
    
    private static String lIIllIlIIIlIIllI(final String llllllllllllIllIIlIIIIlIIIIIIIII, final String llllllllllllIllIIlIIIIIlllllllIl) {
        try {
            final SecretKeySpec llllllllllllIllIIlIIIIlIIIIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIIIIIlllllllIl.getBytes(StandardCharsets.UTF_8)), GuiInventory.llIlllIllllIII[9]), "DES");
            final Cipher llllllllllllIllIIlIIIIlIIIIIIIlI = Cipher.getInstance("DES");
            llllllllllllIllIIlIIIIlIIIIIIIlI.init(GuiInventory.llIlllIllllIII[10], llllllllllllIllIIlIIIIlIIIIIIIll);
            return new String(llllllllllllIllIIlIIIIlIIIIIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIIIIlIIIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlIIIIlIIIIIIIIl) {
            llllllllllllIllIIlIIIIlIIIIIIIIl.printStackTrace();
            return null;
        }
    }
}
