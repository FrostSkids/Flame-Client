// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui.achievement;

import net.minecraft.client.resources.I18n;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.GlStateManager;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.stats.Achievement;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Gui;

public class GuiAchievement extends Gui
{
    private /* synthetic */ boolean permanentNotification;
    private /* synthetic */ Minecraft mc;
    private static final /* synthetic */ int[] lIIIIIIllllIII;
    private /* synthetic */ RenderItem renderItem;
    private /* synthetic */ int height;
    private static final /* synthetic */ String[] lIIIIIIlllIllI;
    private /* synthetic */ long notificationTime;
    private static final /* synthetic */ ResourceLocation achievementBg;
    private /* synthetic */ int width;
    private /* synthetic */ String achievementTitle;
    private /* synthetic */ String achievementDescription;
    private /* synthetic */ Achievement theAchievement;
    
    private static int lIllIlIlIIIlIll(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static String lIllIlIlIIIIlII(final String lllllllllllllIlIIlllllllIlIIlIlI, final String lllllllllllllIlIIlllllllIlIIlIIl) {
        try {
            final SecretKeySpec lllllllllllllIlIIlllllllIlIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlllllllIlIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIlllllllIlIIlllI = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIlllllllIlIIlllI.init(GuiAchievement.lIIIIIIllllIII[16], lllllllllllllIlIIlllllllIlIIllll);
            return new String(lllllllllllllIlIIlllllllIlIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlllllllIlIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlllllllIlIIllIl) {
            lllllllllllllIlIIlllllllIlIIllIl.printStackTrace();
            return null;
        }
    }
    
    public void displayUnformattedAchievement(final Achievement lllllllllllllIlIIllllllllIIIIlII) {
        this.achievementTitle = lllllllllllllIlIIllllllllIIIIlII.getStatName().getUnformattedText();
        this.achievementDescription = lllllllllllllIlIIllllllllIIIIlII.getDescription();
        this.notificationTime = Minecraft.getSystemTime() + 2500L;
        this.theAchievement = lllllllllllllIlIIllllllllIIIIlII;
        this.permanentNotification = (GuiAchievement.lIIIIIIllllIII[1] != 0);
    }
    
    private static boolean lIllIlIlIIlIIII(final int lllllllllllllIlIIlllllllIIllIlll) {
        return lllllllllllllIlIIlllllllIIllIlll > 0;
    }
    
    private void updateAchievementWindowScale() {
        GlStateManager.viewport(GuiAchievement.lIIIIIIllllIII[0], GuiAchievement.lIIIIIIllllIII[0], this.mc.displayWidth, this.mc.displayHeight);
        GlStateManager.matrixMode(GuiAchievement.lIIIIIIllllIII[2]);
        GlStateManager.loadIdentity();
        GlStateManager.matrixMode(GuiAchievement.lIIIIIIllllIII[3]);
        GlStateManager.loadIdentity();
        this.width = this.mc.displayWidth;
        this.height = this.mc.displayHeight;
        final ScaledResolution lllllllllllllIlIIllllllllIIIIIII = new ScaledResolution(this.mc);
        this.width = lllllllllllllIlIIllllllllIIIIIII.getScaledWidth();
        this.height = lllllllllllllIlIIllllllllIIIIIII.getScaledHeight();
        GlStateManager.clear(GuiAchievement.lIIIIIIllllIII[4]);
        GlStateManager.matrixMode(GuiAchievement.lIIIIIIllllIII[2]);
        GlStateManager.loadIdentity();
        GlStateManager.ortho(0.0, this.width, this.height, 0.0, 1000.0, 3000.0);
        GlStateManager.matrixMode(GuiAchievement.lIIIIIIllllIII[3]);
        GlStateManager.loadIdentity();
        GlStateManager.translate(0.0f, 0.0f, -2000.0f);
    }
    
    private static boolean lIllIlIlIIIlllI(final int lllllllllllllIlIIlllllllIIllllIl) {
        return lllllllllllllIlIIlllllllIIllllIl == 0;
    }
    
    public void clearAchievements() {
        this.theAchievement = null;
        this.notificationTime = 0L;
    }
    
    private static int lIllIlIlIIIlIIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static int lIllIlIlIIIlIlI(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public void updateAchievementWindow() {
        if (lIllIlIlIIIllII(this.theAchievement) && lIllIlIlIIIllIl(lIllIlIlIIIlIIl(this.notificationTime, 0L)) && lIllIlIlIIIllII(Minecraft.getMinecraft().thePlayer)) {
            double lllllllllllllIlIIlllllllIlllIlll = (Minecraft.getSystemTime() - this.notificationTime) / 3000.0;
            if (lIllIlIlIIIlllI(this.permanentNotification ? 1 : 0)) {
                if (!lIllIlIlIIIllll(lIllIlIlIIIlIlI(lllllllllllllIlIIlllllllIlllIlll, 0.0)) || lIllIlIlIIlIIII(lIllIlIlIIIlIll(lllllllllllllIlIIlllllllIlllIlll, 1.0))) {
                    this.notificationTime = 0L;
                    return;
                }
            }
            else if (lIllIlIlIIlIIII(lIllIlIlIIIlIll(lllllllllllllIlIIlllllllIlllIlll, 0.5))) {
                lllllllllllllIlIIlllllllIlllIlll = 0.5;
            }
            this.updateAchievementWindowScale();
            GlStateManager.disableDepth();
            GlStateManager.depthMask((boolean)(GuiAchievement.lIIIIIIllllIII[0] != 0));
            double lllllllllllllIlIIlllllllIlllIllI = lllllllllllllIlIIlllllllIlllIlll * 2.0;
            if (lIllIlIlIIlIIII(lIllIlIlIIIlIll(lllllllllllllIlIIlllllllIlllIllI, 1.0))) {
                lllllllllllllIlIIlllllllIlllIllI = 2.0 - lllllllllllllIlIIlllllllIlllIllI;
            }
            lllllllllllllIlIIlllllllIlllIllI *= 4.0;
            lllllllllllllIlIIlllllllIlllIllI = 1.0 - lllllllllllllIlIIlllllllIlllIllI;
            if (lIllIlIlIIlIIIl(lIllIlIlIIIlIlI(lllllllllllllIlIIlllllllIlllIllI, 0.0))) {
                lllllllllllllIlIIlllllllIlllIllI = 0.0;
            }
            lllllllllllllIlIIlllllllIlllIllI *= lllllllllllllIlIIlllllllIlllIllI;
            lllllllllllllIlIIlllllllIlllIllI *= lllllllllllllIlIIlllllllIlllIllI;
            final int lllllllllllllIlIIlllllllIlllIlIl = this.width - GuiAchievement.lIIIIIIllllIII[5];
            final int lllllllllllllIlIIlllllllIlllIlII = GuiAchievement.lIIIIIIllllIII[0] - (int)(lllllllllllllIlIIlllllllIlllIllI * 36.0);
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManager.enableTexture2D();
            this.mc.getTextureManager().bindTexture(GuiAchievement.achievementBg);
            GlStateManager.disableLighting();
            this.drawTexturedModalRect(lllllllllllllIlIIlllllllIlllIlIl, lllllllllllllIlIIlllllllIlllIlII, GuiAchievement.lIIIIIIllllIII[6], GuiAchievement.lIIIIIIllllIII[7], GuiAchievement.lIIIIIIllllIII[5], GuiAchievement.lIIIIIIllllIII[8]);
            if (lIllIlIlIIIllIl(this.permanentNotification ? 1 : 0)) {
                this.mc.fontRendererObj.drawSplitString(this.achievementDescription, lllllllllllllIlIIlllllllIlllIlIl + GuiAchievement.lIIIIIIllllIII[9], lllllllllllllIlIIlllllllIlllIlII + GuiAchievement.lIIIIIIllllIII[10], GuiAchievement.lIIIIIIllllIII[11], GuiAchievement.lIIIIIIllllIII[12]);
                "".length();
                if ("   ".length() != "   ".length()) {
                    return;
                }
            }
            else {
                this.mc.fontRendererObj.drawString(this.achievementTitle, lllllllllllllIlIIlllllllIlllIlIl + GuiAchievement.lIIIIIIllllIII[9], lllllllllllllIlIIlllllllIlllIlII + GuiAchievement.lIIIIIIllllIII[10], GuiAchievement.lIIIIIIllllIII[13]);
                "".length();
                this.mc.fontRendererObj.drawString(this.achievementDescription, lllllllllllllIlIIlllllllIlllIlIl + GuiAchievement.lIIIIIIllllIII[9], lllllllllllllIlIIlllllllIlllIlII + GuiAchievement.lIIIIIIllllIII[14], GuiAchievement.lIIIIIIllllIII[12]);
                "".length();
            }
            RenderHelper.enableGUIStandardItemLighting();
            GlStateManager.disableLighting();
            GlStateManager.enableRescaleNormal();
            GlStateManager.enableColorMaterial();
            GlStateManager.enableLighting();
            this.renderItem.renderItemAndEffectIntoGUI(this.theAchievement.theItemStack, lllllllllllllIlIIlllllllIlllIlIl + GuiAchievement.lIIIIIIllllIII[15], lllllllllllllIlIIlllllllIlllIlII + GuiAchievement.lIIIIIIllllIII[15]);
            GlStateManager.disableLighting();
            GlStateManager.depthMask((boolean)(GuiAchievement.lIIIIIIllllIII[1] != 0));
            GlStateManager.enableDepth();
        }
    }
    
    private static String lIllIlIlIIIIIll(String lllllllllllllIlIIlllllllIlIlllII, final String lllllllllllllIlIIlllllllIlIllIll) {
        lllllllllllllIlIIlllllllIlIlllII = (char)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIlllllllIlIlllII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIlllllllIlIlllll = new StringBuilder();
        final char[] lllllllllllllIlIIlllllllIlIllllI = lllllllllllllIlIIlllllllIlIllIll.toCharArray();
        int lllllllllllllIlIIlllllllIlIlllIl = GuiAchievement.lIIIIIIllllIII[0];
        final double lllllllllllllIlIIlllllllIlIlIlll = (Object)((String)lllllllllllllIlIIlllllllIlIlllII).toCharArray();
        final byte lllllllllllllIlIIlllllllIlIlIllI = (byte)lllllllllllllIlIIlllllllIlIlIlll.length;
        boolean lllllllllllllIlIIlllllllIlIlIlIl = GuiAchievement.lIIIIIIllllIII[0] != 0;
        while (lIllIlIlIIlIIlI(lllllllllllllIlIIlllllllIlIlIlIl ? 1 : 0, lllllllllllllIlIIlllllllIlIlIllI)) {
            final char lllllllllllllIlIIlllllllIllIIIlI = lllllllllllllIlIIlllllllIlIlIlll[lllllllllllllIlIIlllllllIlIlIlIl];
            lllllllllllllIlIIlllllllIlIlllll.append((char)(lllllllllllllIlIIlllllllIllIIIlI ^ lllllllllllllIlIIlllllllIlIllllI[lllllllllllllIlIIlllllllIlIlllIl % lllllllllllllIlIIlllllllIlIllllI.length]));
            "".length();
            ++lllllllllllllIlIIlllllllIlIlllIl;
            ++lllllllllllllIlIIlllllllIlIlIlIl;
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIlllllllIlIlllll);
    }
    
    private static void lIllIlIlIIIIlIl() {
        (lIIIIIIlllIllI = new String[GuiAchievement.lIIIIIIllllIII[16]])[GuiAchievement.lIIIIIIllllIII[0]] = lIllIlIlIIIIIll("HBUoJD8aFSN/LR0ZfzEpABk1Ji8FFT4kZQkTODkvHhU9NSQcLzIxKQMXIj8/BhR+ICQP", "hpPPJ");
        GuiAchievement.lIIIIIIlllIllI[GuiAchievement.lIIIIIIllllIII[1]] = lIllIlIlIIIIlII("F8rBhQadvXMhhP2WARHrcA==", "xuXdU");
    }
    
    public GuiAchievement(final Minecraft lllllllllllllIlIIllllllllIIlIIII) {
        this.mc = lllllllllllllIlIIllllllllIIlIIII;
        this.renderItem = lllllllllllllIlIIllllllllIIlIIII.getRenderItem();
    }
    
    public void displayAchievement(final Achievement lllllllllllllIlIIllllllllIIIlIlI) {
        this.achievementTitle = I18n.format(GuiAchievement.lIIIIIIlllIllI[GuiAchievement.lIIIIIIllllIII[1]], new Object[GuiAchievement.lIIIIIIllllIII[0]]);
        this.achievementDescription = lllllllllllllIlIIllllllllIIIlIlI.getStatName().getUnformattedText();
        this.notificationTime = Minecraft.getSystemTime();
        this.theAchievement = lllllllllllllIlIIllllllllIIIlIlI;
        this.permanentNotification = (GuiAchievement.lIIIIIIllllIII[0] != 0);
    }
    
    private static boolean lIllIlIlIIlIIIl(final int lllllllllllllIlIIlllllllIIlllIIl) {
        return lllllllllllllIlIIlllllllIIlllIIl < 0;
    }
    
    private static boolean lIllIlIlIIIllll(final int lllllllllllllIlIIlllllllIIlllIll) {
        return lllllllllllllIlIIlllllllIIlllIll >= 0;
    }
    
    private static boolean lIllIlIlIIIllII(final Object lllllllllllllIlIIlllllllIlIIIIIl) {
        return lllllllllllllIlIIlllllllIlIIIIIl != null;
    }
    
    static {
        lIllIlIlIIIlIII();
        lIllIlIlIIIIlIl();
        achievementBg = new ResourceLocation(GuiAchievement.lIIIIIIlllIllI[GuiAchievement.lIIIIIIllllIII[0]]);
    }
    
    private static boolean lIllIlIlIIlIIlI(final int lllllllllllllIlIIlllllllIlIIIlII, final int lllllllllllllIlIIlllllllIlIIIIll) {
        return lllllllllllllIlIIlllllllIlIIIlII < lllllllllllllIlIIlllllllIlIIIIll;
    }
    
    private static boolean lIllIlIlIIIllIl(final int lllllllllllllIlIIlllllllIIllllll) {
        return lllllllllllllIlIIlllllllIIllllll != 0;
    }
    
    private static void lIllIlIlIIIlIII() {
        (lIIIIIIllllIII = new int[17])[0] = ((0x2 ^ 0x47 ^ (0x79 ^ 0x12)) & (0x8C ^ 0xB9 ^ (0x7F ^ 0x64) ^ -" ".length()));
        GuiAchievement.lIIIIIIllllIII[1] = " ".length();
        GuiAchievement.lIIIIIIllllIII[2] = (0xFFFFDF9D & 0x3763);
        GuiAchievement.lIIIIIIllllIII[3] = (0xFFFFFF5D & 0x17A2);
        GuiAchievement.lIIIIIIllllIII[4] = (0xFFFFF1AF & 0xF50);
        GuiAchievement.lIIIIIIllllIII[5] = 55 + 151 - 59 + 13;
        GuiAchievement.lIIIIIIllllIII[6] = (0xA8 ^ 0xC4 ^ (0x66 ^ 0x6A));
        GuiAchievement.lIIIIIIllllIII[7] = 148 + 71 - 67 + 50;
        GuiAchievement.lIIIIIIllllIII[8] = (0xA8 ^ 0x88);
        GuiAchievement.lIIIIIIllllIII[9] = (0xA1 ^ 0x8D ^ (0x82 ^ 0xB0));
        GuiAchievement.lIIIIIIllllIII[10] = (0x3F ^ 0x38);
        GuiAchievement.lIIIIIIllllIII[11] = (0x63 ^ 0x6A ^ (0x79 ^ 0x8));
        GuiAchievement.lIIIIIIllllIII[12] = -" ".length();
        GuiAchievement.lIIIIIIllllIII[13] = -(-(0xFFFFF71D & 0x2EFE) & (0xFFFFA75F & 0x7FBB));
        GuiAchievement.lIIIIIIllllIII[14] = (0x10 ^ 0x68 ^ (0x14 ^ 0x7E));
        GuiAchievement.lIIIIIIllllIII[15] = (0x4B ^ 0x43);
        GuiAchievement.lIIIIIIllllIII[16] = "  ".length();
    }
}
