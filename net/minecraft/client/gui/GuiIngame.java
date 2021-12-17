// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import java.util.Iterator;
import net.minecraft.entity.boss.BossStatus;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.util.FoodStats;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import java.util.List;
import java.util.Collection;
import net.minecraft.scoreboard.Team;
import com.google.common.collect.Lists;
import com.google.common.collect.Iterables;
import net.minecraft.scoreboard.Score;
import com.google.common.base.Predicate;
import net.minecraft.util.IChatComponent;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.StringUtils;
import net.minecraft.util.BlockPos;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.scoreboard.ScoreObjective;
import net.minecraft.scoreboard.Scoreboard;
import client.ClientName;
import client.hud.HudConfigScreen;
import net.minecraft.potion.Potion;
import net.minecraft.item.Item;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.init.Blocks;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.world.border.WorldBorder;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.Minecraft;
import java.util.Random;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.item.ItemStack;

public class GuiIngame extends Gui
{
    private /* synthetic */ boolean recordIsPlaying;
    private /* synthetic */ long healthUpdateCounter;
    private /* synthetic */ int recordPlayingUpFor;
    private final /* synthetic */ GuiStreamIndicator streamIndicator;
    private /* synthetic */ String field_175201_x;
    private /* synthetic */ ItemStack highlightingItemStack;
    private static final /* synthetic */ String[] lIIIIIlIIllIlI;
    private final /* synthetic */ RenderItem itemRenderer;
    private final /* synthetic */ GuiNewChat persistantChatGUI;
    private final /* synthetic */ GuiOverlayDebug overlayDebug;
    private /* synthetic */ int field_175192_A;
    private static final /* synthetic */ int[] lIIIIIlIlIIlIl;
    private /* synthetic */ String field_175200_y;
    private static final /* synthetic */ ResourceLocation widgetsTexPath;
    private /* synthetic */ int updateCounter;
    private /* synthetic */ int field_175195_w;
    public /* synthetic */ float prevVignetteBrightness;
    private /* synthetic */ int playerHealth;
    private static final /* synthetic */ ResourceLocation pumpkinBlurTexPath;
    private /* synthetic */ long lastSystemTime;
    private final /* synthetic */ Random rand;
    private /* synthetic */ String recordPlaying;
    private final /* synthetic */ GuiPlayerTabOverlay overlayPlayerList;
    private /* synthetic */ int field_175193_B;
    private /* synthetic */ int remainingHighlightTicks;
    private /* synthetic */ int field_175199_z;
    private final /* synthetic */ Minecraft mc;
    private static final /* synthetic */ ResourceLocation vignetteTexPath;
    private /* synthetic */ int lastPlayerHealth;
    private final /* synthetic */ GuiSpectator spectatorGui;
    
    public void renderExpBar(final ScaledResolution lllllllllllllIlIIlllIllIIllIIIlI, final int lllllllllllllIlIIlllIllIIllIIIIl) {
        this.mc.mcProfiler.startSection(GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[35]]);
        this.mc.getTextureManager().bindTexture(Gui.icons);
        final int lllllllllllllIlIIlllIllIIllIIIII = this.mc.thePlayer.xpBarCap();
        if (lIllIllIIIlIIll(lllllllllllllIlIIlllIllIIllIIIII)) {
            final int lllllllllllllIlIIlllIllIIlIlllll = GuiIngame.lIIIIIlIlIIlIl[29];
            final int lllllllllllllIlIIlllIllIIlIllllI = (int)(this.mc.thePlayer.experience * (lllllllllllllIlIIlllIllIIlIlllll + GuiIngame.lIIIIIlIlIIlIl[1]));
            final int lllllllllllllIlIIlllIllIIlIlllIl = lllllllllllllIlIIlllIllIIllIIIlI.getScaledHeight() - GuiIngame.lIIIIIlIlIIlIl[32] + GuiIngame.lIIIIIlIlIIlIl[3];
            this.drawTexturedModalRect(lllllllllllllIlIIlllIllIIllIIIIl, lllllllllllllIlIIlllIllIIlIlllIl, GuiIngame.lIIIIIlIlIIlIl[0], GuiIngame.lIIIIIlIlIIlIl[36], lllllllllllllIlIIlllIllIIlIlllll, GuiIngame.lIIIIIlIlIIlIl[5]);
            if (lIllIllIIIlIIll(lllllllllllllIlIIlllIllIIlIllllI)) {
                this.drawTexturedModalRect(lllllllllllllIlIIlllIllIIllIIIIl, lllllllllllllIlIIlllIllIIlIlllIl, GuiIngame.lIIIIIlIlIIlIl[0], GuiIngame.lIIIIIlIlIIlIl[37], lllllllllllllIlIIlllIllIIlIllllI, GuiIngame.lIIIIIlIlIIlIl[5]);
            }
        }
        this.mc.mcProfiler.endSection();
        if (lIllIllIIIlIIll(this.mc.thePlayer.experienceLevel)) {
            this.mc.mcProfiler.startSection(GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[38]]);
            final int lllllllllllllIlIIlllIllIIlIlllII = GuiIngame.lIIIIIlIlIIlIl[39];
            final String lllllllllllllIlIIlllIllIIlIllIll = String.valueOf(new StringBuilder().append(this.mc.thePlayer.experienceLevel));
            final int lllllllllllllIlIIlllIllIIlIllIlI = (lllllllllllllIlIIlllIllIIllIIIlI.getScaledWidth() - this.getFontRenderer().getStringWidth(lllllllllllllIlIIlllIllIIlIllIll)) / GuiIngame.lIIIIIlIlIIlIl[2];
            final int lllllllllllllIlIIlllIllIIlIllIIl = lllllllllllllIlIIlllIllIIllIIIlI.getScaledHeight() - GuiIngame.lIIIIIlIlIIlIl[40] - GuiIngame.lIIIIIlIlIIlIl[4];
            final int lllllllllllllIlIIlllIllIIlIllIII = GuiIngame.lIIIIIlIlIIlIl[0];
            this.getFontRenderer().drawString(lllllllllllllIlIIlllIllIIlIllIll, lllllllllllllIlIIlllIllIIlIllIlI + GuiIngame.lIIIIIlIlIIlIl[1], lllllllllllllIlIIlllIllIIlIllIIl, GuiIngame.lIIIIIlIlIIlIl[0]);
            "".length();
            this.getFontRenderer().drawString(lllllllllllllIlIIlllIllIIlIllIll, lllllllllllllIlIIlllIllIIlIllIlI - GuiIngame.lIIIIIlIlIIlIl[1], lllllllllllllIlIIlllIllIIlIllIIl, GuiIngame.lIIIIIlIlIIlIl[0]);
            "".length();
            this.getFontRenderer().drawString(lllllllllllllIlIIlllIllIIlIllIll, lllllllllllllIlIIlllIllIIlIllIlI, lllllllllllllIlIIlllIllIIlIllIIl + GuiIngame.lIIIIIlIlIIlIl[1], GuiIngame.lIIIIIlIlIIlIl[0]);
            "".length();
            this.getFontRenderer().drawString(lllllllllllllIlIIlllIllIIlIllIll, lllllllllllllIlIIlllIllIIlIllIlI, lllllllllllllIlIIlllIllIIlIllIIl - GuiIngame.lIIIIIlIlIIlIl[1], GuiIngame.lIIIIIlIlIIlIl[0]);
            "".length();
            this.getFontRenderer().drawString(lllllllllllllIlIIlllIllIIlIllIll, lllllllllllllIlIIlllIllIIlIllIlI, lllllllllllllIlIIlllIllIIlIllIIl, lllllllllllllIlIIlllIllIIlIlllII);
            "".length();
            this.mc.mcProfiler.endSection();
        }
    }
    
    private static String lIllIlIlllllIIl(final String lllllllllllllIlIIlllIlIIlIlIlIlI, final String lllllllllllllIlIIlllIlIIlIlIIlll) {
        try {
            final SecretKeySpec lllllllllllllIlIIlllIlIIlIlIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlllIlIIlIlIIlll.getBytes(StandardCharsets.UTF_8)), GuiIngame.lIIIIIlIlIIlIl[20]), "DES");
            final Cipher lllllllllllllIlIIlllIlIIlIlIllII = Cipher.getInstance("DES");
            lllllllllllllIlIIlllIlIIlIlIllII.init(GuiIngame.lIIIIIlIlIIlIl[2], lllllllllllllIlIIlllIlIIlIlIllIl);
            return new String(lllllllllllllIlIIlllIlIIlIlIllII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlllIlIIlIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlllIlIIlIlIlIll) {
            lllllllllllllIlIIlllIlIIlIlIlIll.printStackTrace();
            return null;
        }
    }
    
    public void displayTitle(final String lllllllllllllIlIIlllIlIIllIlIlll, final String lllllllllllllIlIIlllIlIIllIlIIII, final int lllllllllllllIlIIlllIlIIllIlIlIl, final int lllllllllllllIlIIlllIlIIllIIlllI, final int lllllllllllllIlIIlllIlIIllIlIIll) {
        if (lIllIllIIIlIlll(lllllllllllllIlIIlllIlIIllIlIlll) && lIllIllIIIlIlll(lllllllllllllIlIIlllIlIIllIlIIII) && lIllIllIIIlllll(lllllllllllllIlIIlllIlIIllIlIlIl) && lIllIllIIIlllll(lllllllllllllIlIIlllIlIIllIIlllI) && lIllIllIIIlllll(lllllllllllllIlIIlllIlIIllIlIIll)) {
            this.field_175201_x = GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[71]];
            this.field_175200_y = GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[72]];
            this.field_175195_w = GuiIngame.lIIIIIlIlIIlIl[0];
            "".length();
            if (((0x24 ^ 0x6A ^ (0x44 ^ 0x2C)) & (102 + 100 - 83 + 31 ^ 117 + 129 - 113 + 43 ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else if (lIllIllIIIlIIIl(lllllllllllllIlIIlllIlIIllIlIlll)) {
            this.field_175201_x = lllllllllllllIlIIlllIlIIllIlIlll;
            this.field_175195_w = this.field_175199_z + this.field_175192_A + this.field_175193_B;
            "".length();
            if (null != null) {
                return;
            }
        }
        else if (lIllIllIIIlIIIl(lllllllllllllIlIIlllIlIIllIlIIII)) {
            this.field_175200_y = lllllllllllllIlIIlllIlIIllIlIIII;
            "".length();
            if ("  ".length() <= -" ".length()) {
                return;
            }
        }
        else {
            if (lIllIllIIIlIllI(lllllllllllllIlIIlllIlIIllIlIlIl)) {
                this.field_175199_z = lllllllllllllIlIIlllIlIIllIlIlIl;
            }
            if (lIllIllIIIlIllI(lllllllllllllIlIIlllIlIIllIIlllI)) {
                this.field_175192_A = lllllllllllllIlIIlllIlIIllIIlllI;
            }
            if (lIllIllIIIlIllI(lllllllllllllIlIIlllIlIIllIlIIll)) {
                this.field_175193_B = lllllllllllllIlIIlllIlIIllIlIIll;
            }
            if (lIllIllIIIlIIll(this.field_175195_w)) {
                this.field_175195_w = this.field_175199_z + this.field_175192_A + this.field_175193_B;
            }
        }
    }
    
    private static boolean lIllIllIIIllIlI(final int lllllllllllllIlIIlllIlIIIlllllIl, final int lllllllllllllIlIIlllIlIIIlllllII) {
        return lllllllllllllIlIIlllIlIIIlllllIl == lllllllllllllIlIIlllIlIIIlllllII;
    }
    
    public void func_181029_i() {
        this.overlayPlayerList.func_181030_a();
    }
    
    private static String lIllIlIllllllII(final String lllllllllllllIlIIlllIlIIlIIIIlIl, final String lllllllllllllIlIIlllIlIIlIIIIlII) {
        try {
            final SecretKeySpec lllllllllllllIlIIlllIlIIlIIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlllIlIIlIIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIlllIlIIlIIIIlll = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIlllIlIIlIIIIlll.init(GuiIngame.lIIIIIlIlIIlIl[2], lllllllllllllIlIIlllIlIIlIIIlIII);
            return new String(lllllllllllllIlIIlllIlIIlIIIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlllIlIIlIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlllIlIIlIIIIllI) {
            lllllllllllllIlIIlllIlIIlIIIIllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIllIllIIIllllI(final int lllllllllllllIlIIlllIlIIIlllIlIl, final int lllllllllllllIlIIlllIlIIIlllIlII) {
        return lllllllllllllIlIIlllIlIIIlllIlIl < lllllllllllllIlIIlllIlIIIlllIlII;
    }
    
    public FontRenderer getFontRenderer() {
        return this.mc.fontRendererObj;
    }
    
    public GuiSpectator getSpectatorGui() {
        return this.spectatorGui;
    }
    
    private static boolean lIllIllIIIlIllI(final int lllllllllllllIlIIlllIlIIIlIllllI) {
        return lllllllllllllIlIIlllIlIIIlIllllI >= 0;
    }
    
    private static int lIllIllIIIlllII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private void renderVignette(float lllllllllllllIlIIlllIlIlIIllIlII, final ScaledResolution lllllllllllllIlIIlllIlIlIIllllII) {
        lllllllllllllIlIIlllIlIlIIllIlII = (short)(1.0f - lllllllllllllIlIIlllIlIlIIllIlII);
        lllllllllllllIlIIlllIlIlIIllIlII = (short)MathHelper.clamp_float(lllllllllllllIlIIlllIlIlIIllIlII, 0.0f, 1.0f);
        final WorldBorder lllllllllllllIlIIlllIlIlIIlllIll = this.mc.theWorld.getWorldBorder();
        float lllllllllllllIlIIlllIlIlIIlllIlI = (float)lllllllllllllIlIIlllIlIlIIlllIll.getClosestDistance(this.mc.thePlayer);
        final double lllllllllllllIlIIlllIlIlIIlllIIl = Math.min(lllllllllllllIlIIlllIlIlIIlllIll.getResizeSpeed() * lllllllllllllIlIIlllIlIlIIlllIll.getWarningTime() * 1000.0, Math.abs(lllllllllllllIlIIlllIlIlIIlllIll.getTargetSize() - lllllllllllllIlIIlllIlIlIIlllIll.getDiameter()));
        final double lllllllllllllIlIIlllIlIlIIlllIII = Math.max(lllllllllllllIlIIlllIlIlIIlllIll.getWarningDistance(), lllllllllllllIlIIlllIlIlIIlllIIl);
        if (lIllIllIIIlllll(lIllIllIIlIIIIl(lllllllllllllIlIIlllIlIlIIlllIlI, lllllllllllllIlIIlllIlIlIIlllIII))) {
            lllllllllllllIlIIlllIlIlIIlllIlI = 1.0f - (float)(lllllllllllllIlIIlllIlIlIIlllIlI / lllllllllllllIlIIlllIlIlIIlllIII);
            "".length();
            if (-(0x57 ^ 0x2C ^ (0xEE ^ 0x90)) >= 0) {
                return;
            }
        }
        else {
            lllllllllllllIlIIlllIlIlIIlllIlI = 0.0f;
        }
        this.prevVignetteBrightness += (float)((lllllllllllllIlIIlllIlIlIIllIlII - this.prevVignetteBrightness) * 0.01);
        GlStateManager.disableDepth();
        GlStateManager.depthMask((boolean)(GuiIngame.lIIIIIlIlIIlIl[0] != 0));
        GlStateManager.tryBlendFuncSeparate(GuiIngame.lIIIIIlIlIIlIl[0], GuiIngame.lIIIIIlIlIIlIl[12], GuiIngame.lIIIIIlIlIIlIl[1], GuiIngame.lIIIIIlIlIIlIl[0]);
        if (lIllIllIIIlIIll(lIllIllIIlIIIlI(lllllllllllllIlIIlllIlIlIIlllIlI, 0.0f))) {
            GlStateManager.color(0.0f, lllllllllllllIlIIlllIlIlIIlllIlI, lllllllllllllIlIIlllIlIlIIlllIlI, 1.0f);
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            GlStateManager.color(this.prevVignetteBrightness, this.prevVignetteBrightness, this.prevVignetteBrightness, 1.0f);
        }
        this.mc.getTextureManager().bindTexture(GuiIngame.vignetteTexPath);
        final Tessellator lllllllllllllIlIIlllIlIlIIllIlll = Tessellator.getInstance();
        final WorldRenderer lllllllllllllIlIIlllIlIlIIllIllI = lllllllllllllIlIIlllIlIlIIllIlll.getWorldRenderer();
        lllllllllllllIlIIlllIlIlIIllIllI.begin(GuiIngame.lIIIIIlIlIIlIl[13], DefaultVertexFormats.POSITION_TEX);
        lllllllllllllIlIIlllIlIlIIllIllI.pos(0.0, lllllllllllllIlIIlllIlIlIIllllII.getScaledHeight(), -90.0).tex(0.0, 1.0).endVertex();
        lllllllllllllIlIIlllIlIlIIllIllI.pos(lllllllllllllIlIIlllIlIlIIllllII.getScaledWidth(), lllllllllllllIlIIlllIlIlIIllllII.getScaledHeight(), -90.0).tex(1.0, 1.0).endVertex();
        lllllllllllllIlIIlllIlIlIIllIllI.pos(lllllllllllllIlIIlllIlIlIIllllII.getScaledWidth(), 0.0, -90.0).tex(1.0, 0.0).endVertex();
        lllllllllllllIlIIlllIlIlIIllIllI.pos(0.0, 0.0, -90.0).tex(0.0, 0.0).endVertex();
        lllllllllllllIlIIlllIlIlIIllIlll.draw();
        GlStateManager.depthMask((boolean)(GuiIngame.lIIIIIlIlIIlIl[1] != 0));
        GlStateManager.enableDepth();
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.tryBlendFuncSeparate(GuiIngame.lIIIIIlIlIIlIl[9], GuiIngame.lIIIIIlIlIIlIl[10], GuiIngame.lIIIIIlIlIIlIl[1], GuiIngame.lIIIIIlIlIIlIl[0]);
    }
    
    private void func_180474_b(float lllllllllllllIlIIlllIlIlIIIlIlll, final ScaledResolution lllllllllllllIlIIlllIlIlIIlIIIII) {
        if (lIllIllIIIlllll(lIllIllIIlIIlII(lllllllllllllIlIIlllIlIlIIIlIlll, 1.0f))) {
            lllllllllllllIlIIlllIlIlIIIlIlll *= lllllllllllllIlIIlllIlIlIIIlIlll;
            lllllllllllllIlIIlllIlIlIIIlIlll *= lllllllllllllIlIIlllIlIlIIIlIlll;
            lllllllllllllIlIIlllIlIlIIIlIlll = lllllllllllllIlIIlllIlIlIIIlIlll * 0.8f + 0.2f;
        }
        GlStateManager.disableAlpha();
        GlStateManager.disableDepth();
        GlStateManager.depthMask((boolean)(GuiIngame.lIIIIIlIlIIlIl[0] != 0));
        GlStateManager.tryBlendFuncSeparate(GuiIngame.lIIIIIlIlIIlIl[9], GuiIngame.lIIIIIlIlIIlIl[10], GuiIngame.lIIIIIlIlIIlIl[1], GuiIngame.lIIIIIlIlIIlIl[0]);
        GlStateManager.color(1.0f, 1.0f, 1.0f, lllllllllllllIlIIlllIlIlIIIlIlll);
        this.mc.getTextureManager().bindTexture(TextureMap.locationBlocksTexture);
        final TextureAtlasSprite lllllllllllllIlIIlllIlIlIIIlllll = this.mc.getBlockRendererDispatcher().getBlockModelShapes().getTexture(Blocks.portal.getDefaultState());
        final float lllllllllllllIlIIlllIlIlIIIllllI = lllllllllllllIlIIlllIlIlIIIlllll.getMinU();
        final float lllllllllllllIlIIlllIlIlIIIlllIl = lllllllllllllIlIIlllIlIlIIIlllll.getMinV();
        final float lllllllllllllIlIIlllIlIlIIIlllII = lllllllllllllIlIIlllIlIlIIIlllll.getMaxU();
        final float lllllllllllllIlIIlllIlIlIIIllIll = lllllllllllllIlIIlllIlIlIIIlllll.getMaxV();
        final Tessellator lllllllllllllIlIIlllIlIlIIIllIlI = Tessellator.getInstance();
        final WorldRenderer lllllllllllllIlIIlllIlIlIIIllIIl = lllllllllllllIlIIlllIlIlIIIllIlI.getWorldRenderer();
        lllllllllllllIlIIlllIlIlIIIllIIl.begin(GuiIngame.lIIIIIlIlIIlIl[13], DefaultVertexFormats.POSITION_TEX);
        lllllllllllllIlIIlllIlIlIIIllIIl.pos(0.0, lllllllllllllIlIIlllIlIlIIlIIIII.getScaledHeight(), -90.0).tex(lllllllllllllIlIIlllIlIlIIIllllI, lllllllllllllIlIIlllIlIlIIIllIll).endVertex();
        lllllllllllllIlIIlllIlIlIIIllIIl.pos(lllllllllllllIlIIlllIlIlIIlIIIII.getScaledWidth(), lllllllllllllIlIIlllIlIlIIlIIIII.getScaledHeight(), -90.0).tex(lllllllllllllIlIIlllIlIlIIIlllII, lllllllllllllIlIIlllIlIlIIIllIll).endVertex();
        lllllllllllllIlIIlllIlIlIIIllIIl.pos(lllllllllllllIlIIlllIlIlIIlIIIII.getScaledWidth(), 0.0, -90.0).tex(lllllllllllllIlIIlllIlIlIIIlllII, lllllllllllllIlIIlllIlIlIIIlllIl).endVertex();
        lllllllllllllIlIIlllIlIlIIIllIIl.pos(0.0, 0.0, -90.0).tex(lllllllllllllIlIIlllIlIlIIIllllI, lllllllllllllIlIIlllIlIlIIIlllIl).endVertex();
        lllllllllllllIlIIlllIlIlIIIllIlI.draw();
        GlStateManager.depthMask((boolean)(GuiIngame.lIIIIIlIlIIlIl[1] != 0));
        GlStateManager.enableDepth();
        GlStateManager.enableAlpha();
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
    }
    
    public void func_175177_a() {
        this.field_175199_z = GuiIngame.lIIIIIlIlIIlIl[6];
        this.field_175192_A = GuiIngame.lIIIIIlIlIIlIl[7];
        this.field_175193_B = GuiIngame.lIIIIIlIlIIlIl[8];
    }
    
    private static boolean lIllIllIIIlIIll(final int lllllllllllllIlIIlllIlIIIlIllIII) {
        return lllllllllllllIlIIlllIlIIIlIllIII > 0;
    }
    
    public void func_181551_a(final ScaledResolution lllllllllllllIlIIlllIllIIlIIIIIl) {
        this.mc.mcProfiler.startSection(GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[41]]);
        if (lIllIllIIIlIIll(this.remainingHighlightTicks) && lIllIllIIIlIIIl(this.highlightingItemStack)) {
            String lllllllllllllIlIIlllIllIIlIIIllI = this.highlightingItemStack.getDisplayName();
            if (lIllIllIIIIllll(this.highlightingItemStack.hasDisplayName() ? 1 : 0)) {
                lllllllllllllIlIIlllIllIIlIIIllI = String.valueOf(new StringBuilder().append(EnumChatFormatting.ITALIC).append(lllllllllllllIlIIlllIllIIlIIIllI));
            }
            final int lllllllllllllIlIIlllIllIIlIIIlIl = (lllllllllllllIlIIlllIllIIlIIIIIl.getScaledWidth() - this.getFontRenderer().getStringWidth(lllllllllllllIlIIlllIllIIlIIIllI)) / GuiIngame.lIIIIIlIlIIlIl[2];
            int lllllllllllllIlIIlllIllIIlIIIlII = lllllllllllllIlIIlllIllIIlIIIIIl.getScaledHeight() - GuiIngame.lIIIIIlIlIIlIl[42];
            if (lIllIllIIIlIIII(this.mc.playerController.shouldDrawHUD() ? 1 : 0)) {
                lllllllllllllIlIIlllIllIIlIIIlII += 14;
            }
            int lllllllllllllIlIIlllIllIIlIIIIll = (int)(this.remainingHighlightTicks * 256.0f / 10.0f);
            if (lIllIllIIIlIlII(lllllllllllllIlIIlllIllIIlIIIIll, GuiIngame.lIIIIIlIlIIlIl[21])) {
                lllllllllllllIlIIlllIllIIlIIIIll = GuiIngame.lIIIIIlIlIIlIl[21];
            }
            if (lIllIllIIIlIIll(lllllllllllllIlIIlllIllIIlIIIIll)) {
                GlStateManager.pushMatrix();
                GlStateManager.enableBlend();
                GlStateManager.tryBlendFuncSeparate(GuiIngame.lIIIIIlIlIIlIl[9], GuiIngame.lIIIIIlIlIIlIl[10], GuiIngame.lIIIIIlIlIIlIl[1], GuiIngame.lIIIIIlIlIIlIl[0]);
                this.getFontRenderer().drawStringWithShadow(lllllllllllllIlIIlllIllIIlIIIllI, (float)lllllllllllllIlIIlllIllIIlIIIlIl, (float)lllllllllllllIlIIlllIllIIlIIIlII, GuiIngame.lIIIIIlIlIIlIl[23] + (lllllllllllllIlIIlllIllIIlIIIIll << GuiIngame.lIIIIIlIlIIlIl[17]));
                "".length();
                GlStateManager.disableBlend();
                GlStateManager.popMatrix();
            }
        }
        this.mc.mcProfiler.endSection();
    }
    
    public void updateTick() {
        if (lIllIllIIIlIIll(this.recordPlayingUpFor)) {
            this.recordPlayingUpFor -= GuiIngame.lIIIIIlIlIIlIl[1];
        }
        if (lIllIllIIIlIIll(this.field_175195_w)) {
            this.field_175195_w -= GuiIngame.lIIIIIlIlIIlIl[1];
            if (lIllIllIIlIIIII(this.field_175195_w)) {
                this.field_175201_x = GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[54]];
                this.field_175200_y = GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[68]];
            }
        }
        this.updateCounter += GuiIngame.lIIIIIlIlIIlIl[1];
        this.streamIndicator.func_152439_a();
        if (lIllIllIIIlIIIl(this.mc.thePlayer)) {
            final ItemStack lllllllllllllIlIIlllIlIIllllIIII = this.mc.thePlayer.inventory.getCurrentItem();
            if (lIllIllIIIlIlll(lllllllllllllIlIIlllIlIIllllIIII)) {
                this.remainingHighlightTicks = GuiIngame.lIIIIIlIlIIlIl[0];
                "".length();
                if (-"  ".length() > 0) {
                    return;
                }
            }
            else if (lIllIllIIIlIIIl(this.highlightingItemStack) && lIllIllIIIlIIlI(lllllllllllllIlIIlllIlIIllllIIII.getItem(), this.highlightingItemStack.getItem()) && lIllIllIIIIllll(ItemStack.areItemStackTagsEqual(lllllllllllllIlIIlllIlIIllllIIII, this.highlightingItemStack) ? 1 : 0) && (!lIllIllIIIlIIII(lllllllllllllIlIIlllIlIIllllIIII.isItemStackDamageable() ? 1 : 0) || lIllIllIIIllIlI(lllllllllllllIlIIlllIlIIllllIIII.getMetadata(), this.highlightingItemStack.getMetadata()))) {
                if (lIllIllIIIlIIll(this.remainingHighlightTicks)) {
                    this.remainingHighlightTicks -= GuiIngame.lIIIIIlIlIIlIl[1];
                    "".length();
                    if (-" ".length() > 0) {
                        return;
                    }
                }
            }
            else {
                this.remainingHighlightTicks = GuiIngame.lIIIIIlIlIIlIl[69];
            }
            this.highlightingItemStack = lllllllllllllIlIIlllIlIIllllIIII;
        }
    }
    
    public void setRecordPlayingMessage(final String lllllllllllllIlIIlllIlIIlllIlIII) {
        final String llllllllllllIlIllIlIIIIIllllIIll = GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[62]];
        final Object[] llllllllllllIlIllIlIIIIIllllIIII = new Object[GuiIngame.lIIIIIlIlIIlIl[1]];
        llllllllllllIlIllIlIIIIIllllIIII[GuiIngame.lIIIIIlIlIIlIl[0]] = lllllllllllllIlIIlllIlIIlllIlIII;
        this.setRecordPlaying(I18n.format(llllllllllllIlIllIlIIIIIllllIIll, llllllllllllIlIllIlIIIIIllllIIII), (boolean)(GuiIngame.lIIIIIlIlIIlIl[1] != 0));
    }
    
    private static String lIllIlIlllllIII(String lllllllllllllIlIIlllIlIIlIIlIlIl, final String lllllllllllllIlIIlllIlIIlIIlIlII) {
        lllllllllllllIlIIlllIlIIlIIlIlIl = new String(Base64.getDecoder().decode(lllllllllllllIlIIlllIlIIlIIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIlllIlIIlIIllIII = new StringBuilder();
        final char[] lllllllllllllIlIIlllIlIIlIIlIlll = lllllllllllllIlIIlllIlIIlIIlIlII.toCharArray();
        int lllllllllllllIlIIlllIlIIlIIlIllI = GuiIngame.lIIIIIlIlIIlIl[0];
        final byte lllllllllllllIlIIlllIlIIlIIlIIII = (Object)lllllllllllllIlIIlllIlIIlIIlIlIl.toCharArray();
        final double lllllllllllllIlIIlllIlIIlIIIllll = lllllllllllllIlIIlllIlIIlIIlIIII.length;
        String lllllllllllllIlIIlllIlIIlIIIlllI = (String)GuiIngame.lIIIIIlIlIIlIl[0];
        while (lIllIllIIIllllI((int)lllllllllllllIlIIlllIlIIlIIIlllI, (int)lllllllllllllIlIIlllIlIIlIIIllll)) {
            final char lllllllllllllIlIIlllIlIIlIIllIll = lllllllllllllIlIIlllIlIIlIIlIIII[lllllllllllllIlIIlllIlIIlIIIlllI];
            lllllllllllllIlIIlllIlIIlIIllIII.append((char)(lllllllllllllIlIIlllIlIIlIIllIll ^ lllllllllllllIlIIlllIlIIlIIlIlll[lllllllllllllIlIIlllIlIIlIIlIllI % lllllllllllllIlIIlllIlIIlIIlIlll.length]));
            "".length();
            ++lllllllllllllIlIIlllIlIIlIIlIllI;
            ++lllllllllllllIlIIlllIlIIlIIIlllI;
            "".length();
            if ("  ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIlllIlIIlIIllIII);
    }
    
    private static boolean lIllIllIIIlllll(final int lllllllllllllIlIIlllIlIIIlIlllII) {
        return lllllllllllllIlIIlllIlIIIlIlllII < 0;
    }
    
    public void renderGameOverlay(final float lllllllllllllIlIIlllIllIlIllllIl) {
        final ScaledResolution lllllllllllllIlIIlllIllIlIllllII = new ScaledResolution(this.mc);
        final int lllllllllllllIlIIlllIllIlIlllIll = lllllllllllllIlIIlllIllIlIllllII.getScaledWidth();
        final int lllllllllllllIlIIlllIllIlIlllIlI = lllllllllllllIlIIlllIllIlIllllII.getScaledHeight();
        this.mc.entityRenderer.setupOverlayRendering();
        GlStateManager.enableBlend();
        if (lIllIllIIIIllll(Minecraft.isFancyGraphicsEnabled() ? 1 : 0)) {
            this.renderVignette(this.mc.thePlayer.getBrightness(lllllllllllllIlIIlllIllIlIllllIl), lllllllllllllIlIIlllIllIlIllllII);
            "".length();
            if (-"   ".length() >= 0) {
                return;
            }
        }
        else {
            GlStateManager.tryBlendFuncSeparate(GuiIngame.lIIIIIlIlIIlIl[9], GuiIngame.lIIIIIlIlIIlIl[10], GuiIngame.lIIIIIlIlIIlIl[1], GuiIngame.lIIIIIlIlIIlIl[0]);
        }
        final ItemStack lllllllllllllIlIIlllIllIlIlllIIl = this.mc.thePlayer.inventory.armorItemInSlot(GuiIngame.lIIIIIlIlIIlIl[3]);
        if (lIllIllIIIlIIII(this.mc.gameSettings.thirdPersonView) && lIllIllIIIlIIIl(lllllllllllllIlIIlllIllIlIlllIIl) && lIllIllIIIlIIlI(lllllllllllllIlIIlllIllIlIlllIIl.getItem(), Item.getItemFromBlock(Blocks.pumpkin))) {
            this.renderPumpkinOverlay(lllllllllllllIlIIlllIllIlIllllII);
        }
        if (lIllIllIIIlIIII(this.mc.thePlayer.isPotionActive(Potion.confusion) ? 1 : 0)) {
            final float lllllllllllllIlIIlllIllIlIlllIII = this.mc.thePlayer.prevTimeInPortal + (this.mc.thePlayer.timeInPortal - this.mc.thePlayer.prevTimeInPortal) * lllllllllllllIlIIlllIllIlIllllIl;
            if (lIllIllIIIlIIll(lIllIllIIIIlllI(lllllllllllllIlIIlllIllIlIlllIII, 0.0f))) {
                this.func_180474_b(lllllllllllllIlIIlllIllIlIlllIII, lllllllllllllIlIIlllIllIlIllllII);
            }
        }
        if (lIllIllIIIIllll(this.mc.playerController.isSpectator() ? 1 : 0)) {
            this.spectatorGui.renderTooltip(lllllllllllllIlIIlllIllIlIllllII, lllllllllllllIlIIlllIllIlIllllIl);
            "".length();
            if ((0x42 ^ 0x46) == 0x0) {
                return;
            }
        }
        else {
            this.renderTooltip(lllllllllllllIlIIlllIllIlIllllII, lllllllllllllIlIIlllIllIlIllllIl);
        }
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.getTextureManager().bindTexture(GuiIngame.icons);
        GlStateManager.enableBlend();
        if (lIllIllIIIIllll(this.showCrosshair() ? 1 : 0)) {
            GlStateManager.tryBlendFuncSeparate(GuiIngame.lIIIIIlIlIIlIl[11], GuiIngame.lIIIIIlIlIIlIl[12], GuiIngame.lIIIIIlIlIIlIl[1], GuiIngame.lIIIIIlIlIIlIl[0]);
            GlStateManager.enableAlpha();
            this.drawTexturedModalRect(lllllllllllllIlIIlllIllIlIlllIll / GuiIngame.lIIIIIlIlIIlIl[2] - GuiIngame.lIIIIIlIlIIlIl[13], lllllllllllllIlIIlllIllIlIlllIlI / GuiIngame.lIIIIIlIlIIlIl[2] - GuiIngame.lIIIIIlIlIIlIl[13], GuiIngame.lIIIIIlIlIIlIl[0], GuiIngame.lIIIIIlIlIIlIl[0], GuiIngame.lIIIIIlIlIIlIl[14], GuiIngame.lIIIIIlIlIIlIl[14]);
        }
        GlStateManager.tryBlendFuncSeparate(GuiIngame.lIIIIIlIlIIlIl[9], GuiIngame.lIIIIIlIlIIlIl[10], GuiIngame.lIIIIIlIlIIlIl[1], GuiIngame.lIIIIIlIlIIlIl[0]);
        this.mc.mcProfiler.startSection(GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[15]]);
        this.renderBossHealth();
        this.mc.mcProfiler.endSection();
        if (lIllIllIIIIllll(this.mc.playerController.shouldDrawHUD() ? 1 : 0)) {
            this.renderPlayerStats(lllllllllllllIlIIlllIllIlIllllII);
        }
        GlStateManager.disableBlend();
        if (lIllIllIIIlIIll(this.mc.thePlayer.getSleepTimer())) {
            this.mc.mcProfiler.startSection(GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[13]]);
            GlStateManager.disableDepth();
            GlStateManager.disableAlpha();
            final int lllllllllllllIlIIlllIllIlIllIlll = this.mc.thePlayer.getSleepTimer();
            float lllllllllllllIlIIlllIllIlIllIllI = lllllllllllllIlIIlllIllIlIllIlll / 100.0f;
            if (lIllIllIIIlIIll(lIllIllIIIIlllI(lllllllllllllIlIIlllIllIlIllIllI, 1.0f))) {
                lllllllllllllIlIIlllIllIlIllIllI = 1.0f - (lllllllllllllIlIIlllIllIlIllIlll - GuiIngame.lIIIIIlIlIIlIl[16]) / 10.0f;
            }
            final int lllllllllllllIlIIlllIllIlIllIlIl = (int)(220.0f * lllllllllllllIlIIlllIllIlIllIllI) << GuiIngame.lIIIIIlIlIIlIl[17] | GuiIngame.lIIIIIlIlIIlIl[18];
            Gui.drawRect(GuiIngame.lIIIIIlIlIIlIl[0], GuiIngame.lIIIIIlIlIIlIl[0], lllllllllllllIlIIlllIllIlIlllIll, lllllllllllllIlIIlllIllIlIlllIlI, lllllllllllllIlIIlllIllIlIllIlIl);
            GlStateManager.enableAlpha();
            GlStateManager.enableDepth();
            this.mc.mcProfiler.endSection();
        }
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        final int lllllllllllllIlIIlllIllIlIllIlII = lllllllllllllIlIIlllIllIlIlllIll / GuiIngame.lIIIIIlIlIIlIl[2] - GuiIngame.lIIIIIlIlIIlIl[19];
        if (lIllIllIIIIllll(this.mc.thePlayer.isRidingHorse() ? 1 : 0)) {
            this.renderHorseJumpBar(lllllllllllllIlIIlllIllIlIllllII, lllllllllllllIlIIlllIllIlIllIlII);
            "".length();
            if (null != null) {
                return;
            }
        }
        else if (lIllIllIIIIllll(this.mc.playerController.gameIsSurvivalOrAdventure() ? 1 : 0)) {
            this.renderExpBar(lllllllllllllIlIIlllIllIlIllllII, lllllllllllllIlIIlllIllIlIllIlII);
        }
        if (lIllIllIIIIllll(this.mc.gameSettings.heldItemTooltips ? 1 : 0) && lIllIllIIIlIIII(this.mc.playerController.isSpectator() ? 1 : 0)) {
            this.func_181551_a(lllllllllllllIlIIlllIllIlIllllII);
            "".length();
            if (null != null) {
                return;
            }
        }
        else if (lIllIllIIIIllll(this.mc.thePlayer.isSpectator() ? 1 : 0)) {
            this.spectatorGui.func_175263_a(lllllllllllllIlIIlllIllIlIllllII);
        }
        if (lIllIllIIIIllll(this.mc.isDemo() ? 1 : 0)) {
            this.renderDemo(lllllllllllllIlIIlllIllIlIllllII);
        }
        if (lIllIllIIIIllll(this.mc.gameSettings.showDebugInfo ? 1 : 0)) {
            this.overlayDebug.renderDebugInfo(lllllllllllllIlIIlllIllIlIllllII);
        }
        if (lIllIllIIIlIIll(this.recordPlayingUpFor)) {
            this.mc.mcProfiler.startSection(GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[20]]);
            final float lllllllllllllIlIIlllIllIlIllIIll = this.recordPlayingUpFor - lllllllllllllIlIIlllIllIlIllllIl;
            int lllllllllllllIlIIlllIllIlIllIIlI = (int)(lllllllllllllIlIIlllIllIlIllIIll * 255.0f / 20.0f);
            if (lIllIllIIIlIlII(lllllllllllllIlIIlllIllIlIllIIlI, GuiIngame.lIIIIIlIlIIlIl[21])) {
                lllllllllllllIlIIlllIllIlIllIIlI = GuiIngame.lIIIIIlIlIIlIl[21];
            }
            if (lIllIllIIIlIlII(lllllllllllllIlIIlllIllIlIllIIlI, GuiIngame.lIIIIIlIlIIlIl[20])) {
                GlStateManager.pushMatrix();
                GlStateManager.translate((float)(lllllllllllllIlIIlllIllIlIlllIll / GuiIngame.lIIIIIlIlIIlIl[2]), (float)(lllllllllllllIlIIlllIllIlIlllIlI - GuiIngame.lIIIIIlIlIIlIl[22]), 0.0f);
                GlStateManager.enableBlend();
                GlStateManager.tryBlendFuncSeparate(GuiIngame.lIIIIIlIlIIlIl[9], GuiIngame.lIIIIIlIlIIlIl[10], GuiIngame.lIIIIIlIlIIlIl[1], GuiIngame.lIIIIIlIlIIlIl[0]);
                int lllllllllllllIlIIlllIllIlIllIIIl = GuiIngame.lIIIIIlIlIIlIl[23];
                if (lIllIllIIIIllll(this.recordIsPlaying ? 1 : 0)) {
                    lllllllllllllIlIIlllIllIlIllIIIl = (MathHelper.func_181758_c(lllllllllllllIlIIlllIllIlIllIIll / 50.0f, 0.7f, 0.6f) & GuiIngame.lIIIIIlIlIIlIl[23]);
                }
                this.getFontRenderer().drawString(this.recordPlaying, -this.getFontRenderer().getStringWidth(this.recordPlaying) / GuiIngame.lIIIIIlIlIIlIl[2], GuiIngame.lIIIIIlIlIIlIl[24], lllllllllllllIlIIlllIllIlIllIIIl + (lllllllllllllIlIIlllIllIlIllIIlI << GuiIngame.lIIIIIlIlIIlIl[17] & GuiIngame.lIIIIIlIlIIlIl[25]));
                "".length();
                GlStateManager.disableBlend();
                GlStateManager.popMatrix();
            }
            this.mc.mcProfiler.endSection();
        }
        if (lIllIllIIIlIIll(this.field_175195_w)) {
            this.mc.mcProfiler.startSection(GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[26]]);
            final float lllllllllllllIlIIlllIllIlIllIIII = this.field_175195_w - lllllllllllllIlIIlllIllIlIllllIl;
            int lllllllllllllIlIIlllIllIlIlIllll = GuiIngame.lIIIIIlIlIIlIl[21];
            if (lIllIllIIIlIlII(this.field_175195_w, this.field_175193_B + this.field_175192_A)) {
                final float lllllllllllllIlIIlllIllIlIlIlllI = this.field_175199_z + this.field_175192_A + this.field_175193_B - lllllllllllllIlIIlllIllIlIllIIII;
                lllllllllllllIlIIlllIllIlIlIllll = (int)(lllllllllllllIlIIlllIllIlIlIlllI * 255.0f / this.field_175199_z);
            }
            if (lIllIllIIIlIlIl(this.field_175195_w, this.field_175193_B)) {
                lllllllllllllIlIIlllIllIlIlIllll = (int)(lllllllllllllIlIIlllIllIlIllIIII * 255.0f / this.field_175193_B);
            }
            lllllllllllllIlIIlllIllIlIlIllll = MathHelper.clamp_int(lllllllllllllIlIIlllIllIlIlIllll, GuiIngame.lIIIIIlIlIIlIl[0], GuiIngame.lIIIIIlIlIIlIl[21]);
            if (lIllIllIIIlIlII(lllllllllllllIlIIlllIllIlIlIllll, GuiIngame.lIIIIIlIlIIlIl[20])) {
                GlStateManager.pushMatrix();
                GlStateManager.translate((float)(lllllllllllllIlIIlllIllIlIlllIll / GuiIngame.lIIIIIlIlIIlIl[2]), (float)(lllllllllllllIlIIlllIllIlIlllIlI / GuiIngame.lIIIIIlIlIIlIl[2]), 0.0f);
                GlStateManager.enableBlend();
                GlStateManager.tryBlendFuncSeparate(GuiIngame.lIIIIIlIlIIlIl[9], GuiIngame.lIIIIIlIlIIlIl[10], GuiIngame.lIIIIIlIlIIlIl[1], GuiIngame.lIIIIIlIlIIlIl[0]);
                GlStateManager.pushMatrix();
                GlStateManager.scale(4.0f, 4.0f, 4.0f);
                final int lllllllllllllIlIIlllIllIlIlIllIl = lllllllllllllIlIIlllIllIlIlIllll << GuiIngame.lIIIIIlIlIIlIl[17] & GuiIngame.lIIIIIlIlIIlIl[25];
                this.getFontRenderer().drawString(this.field_175201_x, (float)(-this.getFontRenderer().getStringWidth(this.field_175201_x) / GuiIngame.lIIIIIlIlIIlIl[2]), -10.0f, GuiIngame.lIIIIIlIlIIlIl[23] | lllllllllllllIlIIlllIllIlIlIllIl, (boolean)(GuiIngame.lIIIIIlIlIIlIl[1] != 0));
                "".length();
                GlStateManager.popMatrix();
                GlStateManager.pushMatrix();
                GlStateManager.scale(2.0f, 2.0f, 2.0f);
                this.getFontRenderer().drawString(this.field_175200_y, (float)(-this.getFontRenderer().getStringWidth(this.field_175200_y) / GuiIngame.lIIIIIlIlIIlIl[2]), 5.0f, GuiIngame.lIIIIIlIlIIlIl[23] | lllllllllllllIlIIlllIllIlIlIllIl, (boolean)(GuiIngame.lIIIIIlIlIIlIl[1] != 0));
                "".length();
                GlStateManager.popMatrix();
                GlStateManager.disableBlend();
                GlStateManager.popMatrix();
            }
            this.mc.mcProfiler.endSection();
        }
        final Scoreboard lllllllllllllIlIIlllIllIlIlIllII = this.mc.theWorld.getScoreboard();
        ScoreObjective lllllllllllllIlIIlllIllIlIlIlIll = null;
        final ScorePlayerTeam lllllllllllllIlIIlllIllIlIlIlIlI = lllllllllllllIlIIlllIllIlIlIllII.getPlayersTeam(this.mc.thePlayer.getName());
        if (lIllIllIIIlIIIl(lllllllllllllIlIIlllIllIlIlIlIlI)) {
            final int lllllllllllllIlIIlllIllIlIlIlIIl = lllllllllllllIlIIlllIllIlIlIlIlI.getChatFormat().getColorIndex();
            if (lIllIllIIIlIllI(lllllllllllllIlIIlllIllIlIlIlIIl)) {
                lllllllllllllIlIIlllIllIlIlIlIll = lllllllllllllIlIIlllIllIlIlIllII.getObjectiveInDisplaySlot(GuiIngame.lIIIIIlIlIIlIl[3] + lllllllllllllIlIIlllIllIlIlIlIIl);
            }
        }
        ScoreObjective objectiveInDisplaySlot;
        if (lIllIllIIIlIIIl(lllllllllllllIlIIlllIllIlIlIlIll)) {
            objectiveInDisplaySlot = lllllllllllllIlIIlllIllIlIlIlIll;
            "".length();
            if (" ".length() <= ((0xE2 ^ 0xC7 ^ (0x38 ^ 0x5)) & (0x70 ^ 0x76 ^ (0xB5 ^ 0xAB) ^ -" ".length()))) {
                return;
            }
        }
        else {
            objectiveInDisplaySlot = lllllllllllllIlIIlllIllIlIlIllII.getObjectiveInDisplaySlot(GuiIngame.lIIIIIlIlIIlIl[1]);
        }
        ScoreObjective lllllllllllllIlIIlllIllIlIlIlIII = objectiveInDisplaySlot;
        if (lIllIllIIIlIIIl(lllllllllllllIlIIlllIllIlIlIlIII)) {
            this.renderScoreboard(lllllllllllllIlIIlllIllIlIlIlIII, lllllllllllllIlIIlllIllIlIllllII);
        }
        GlStateManager.enableBlend();
        GlStateManager.tryBlendFuncSeparate(GuiIngame.lIIIIIlIlIIlIl[9], GuiIngame.lIIIIIlIlIIlIl[10], GuiIngame.lIIIIIlIlIIlIl[1], GuiIngame.lIIIIIlIlIIlIl[0]);
        GlStateManager.disableAlpha();
        GlStateManager.pushMatrix();
        GlStateManager.translate(0.0f, (float)(lllllllllllllIlIIlllIllIlIlllIlI - GuiIngame.lIIIIIlIlIIlIl[27]), 0.0f);
        this.mc.mcProfiler.startSection(GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[6]]);
        this.persistantChatGUI.drawChat(this.updateCounter);
        this.mc.mcProfiler.endSection();
        GlStateManager.popMatrix();
        lllllllllllllIlIIlllIllIlIlIlIII = lllllllllllllIlIIlllIllIlIlIllII.getObjectiveInDisplaySlot(GuiIngame.lIIIIIlIlIIlIl[0]);
        if (!lIllIllIIIIllll(this.mc.gameSettings.keyBindPlayerList.isKeyDown() ? 1 : 0) || (lIllIllIIIIllll(this.mc.isIntegratedServerRunning() ? 1 : 0) && lIllIllIIIlIlIl(this.mc.thePlayer.sendQueue.getPlayerInfoMap().size(), GuiIngame.lIIIIIlIlIIlIl[1]) && lIllIllIIIlIlll(lllllllllllllIlIIlllIllIlIlIlIII))) {
            this.overlayPlayerList.updatePlayerList((boolean)(GuiIngame.lIIIIIlIlIIlIl[0] != 0));
            "".length();
            if ("   ".length() <= -" ".length()) {
                return;
            }
        }
        else {
            this.overlayPlayerList.updatePlayerList((boolean)(GuiIngame.lIIIIIlIlIIlIl[1] != 0));
            this.overlayPlayerList.renderPlayerlist(lllllllllllllIlIIlllIllIlIlllIll, lllllllllllllIlIIlllIllIlIlIllII, lllllllllllllIlIIlllIllIlIlIlIII);
        }
        if (lIllIllIIIlIIII((this.mc.currentScreen instanceof HudConfigScreen) ? 1 : 0)) {
            ClientName.INSTANCE.hudManager.renderMods();
        }
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.disableLighting();
        GlStateManager.enableAlpha();
    }
    
    private static boolean lIllIllIIIlIIlI(final Object lllllllllllllIlIIlllIlIIIllIIlll, final Object lllllllllllllIlIIlllIlIIIllIIllI) {
        return lllllllllllllIlIIlllIlIIIllIIlll == lllllllllllllIlIIlllIlIIIllIIllI;
    }
    
    private static boolean lIllIllIIIlIIIl(final Object lllllllllllllIlIIlllIlIIIllIlIlI) {
        return lllllllllllllIlIIlllIlIIIllIlIlI != null;
    }
    
    protected boolean showCrosshair() {
        if (lIllIllIIIIllll(this.mc.gameSettings.showDebugInfo ? 1 : 0) && lIllIllIIIlIIII(this.mc.thePlayer.hasReducedDebug() ? 1 : 0) && lIllIllIIIlIIII(this.mc.gameSettings.reducedDebugInfo ? 1 : 0)) {
            return GuiIngame.lIIIIIlIlIIlIl[0] != 0;
        }
        if (!lIllIllIIIIllll(this.mc.playerController.isSpectator() ? 1 : 0)) {
            return GuiIngame.lIIIIIlIlIIlIl[1] != 0;
        }
        if (lIllIllIIIlIIIl(this.mc.pointedEntity)) {
            return GuiIngame.lIIIIIlIlIIlIl[1] != 0;
        }
        if (lIllIllIIIlIIIl(this.mc.objectMouseOver) && lIllIllIIIlIIlI(this.mc.objectMouseOver.typeOfHit, MovingObjectPosition.MovingObjectType.BLOCK)) {
            final BlockPos lllllllllllllIlIIlllIllIIIlIllIl = this.mc.objectMouseOver.getBlockPos();
            if (lIllIllIIIIllll((this.mc.theWorld.getTileEntity(lllllllllllllIlIIlllIllIIIlIllIl) instanceof IInventory) ? 1 : 0)) {
                return GuiIngame.lIIIIIlIlIIlIl[1] != 0;
            }
        }
        return GuiIngame.lIIIIIlIlIIlIl[0] != 0;
    }
    
    private static int lIllIllIIIIlllI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public GuiPlayerTabOverlay getTabList() {
        return this.overlayPlayerList;
    }
    
    public void renderHorseJumpBar(final ScaledResolution lllllllllllllIlIIlllIllIIlllIIlI, final int lllllllllllllIlIIlllIllIIlllIIIl) {
        this.mc.mcProfiler.startSection(GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[31]]);
        this.mc.getTextureManager().bindTexture(Gui.icons);
        final float lllllllllllllIlIIlllIllIIlllIlll = this.mc.thePlayer.getHorseJumpPower();
        final int lllllllllllllIlIIlllIllIIlllIllI = GuiIngame.lIIIIIlIlIIlIl[29];
        final int lllllllllllllIlIIlllIllIIlllIlIl = (int)(lllllllllllllIlIIlllIllIIlllIlll * (lllllllllllllIlIIlllIllIIlllIllI + GuiIngame.lIIIIIlIlIIlIl[1]));
        final int lllllllllllllIlIIlllIllIIlllIlII = lllllllllllllIlIIlllIllIIlllIIlI.getScaledHeight() - GuiIngame.lIIIIIlIlIIlIl[32] + GuiIngame.lIIIIIlIlIIlIl[3];
        this.drawTexturedModalRect(lllllllllllllIlIIlllIllIIlllIIIl, lllllllllllllIlIIlllIllIIlllIlII, GuiIngame.lIIIIIlIlIIlIl[0], GuiIngame.lIIIIIlIlIIlIl[33], lllllllllllllIlIIlllIllIIlllIllI, GuiIngame.lIIIIIlIlIIlIl[5]);
        if (lIllIllIIIlIIll(lllllllllllllIlIIlllIllIIlllIlIl)) {
            this.drawTexturedModalRect(lllllllllllllIlIIlllIllIIlllIIIl, lllllllllllllIlIIlllIllIIlllIlII, GuiIngame.lIIIIIlIlIIlIl[0], GuiIngame.lIIIIIlIlIIlIl[34], lllllllllllllIlIIlllIllIIlllIlIl, GuiIngame.lIIIIIlIlIIlIl[5]);
        }
        this.mc.mcProfiler.endSection();
    }
    
    private static boolean lIllIllIIIIllll(final int lllllllllllllIlIIlllIlIIIllIIIlI) {
        return lllllllllllllIlIIlllIlIIIllIIIlI != 0;
    }
    
    public void renderDemo(final ScaledResolution lllllllllllllIlIIlllIllIIIllIlll) {
        this.mc.mcProfiler.startSection(GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[43]]);
        String lllllllllllllIlIIlllIllIIIllIllI = GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[14]];
        if (lIllIllIIIlIllI(lIllIllIIIllIIl(this.mc.theWorld.getTotalWorldTime(), 120500L))) {
            lllllllllllllIlIIlllIllIIIllIllI = I18n.format(GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[44]], new Object[GuiIngame.lIIIIIlIlIIlIl[0]]);
            "".length();
            if ("   ".length() < 0) {
                return;
            }
        }
        else {
            final String llllllllllllIlIllIlIIIIIllllIIll = GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[45]];
            final Object[] llllllllllllIlIllIlIIIIIllllIIII = new Object[GuiIngame.lIIIIIlIlIIlIl[1]];
            llllllllllllIlIllIlIIIIIllllIIII[GuiIngame.lIIIIIlIlIIlIl[0]] = StringUtils.ticksToElapsedTime((int)(120500L - this.mc.theWorld.getTotalWorldTime()));
            lllllllllllllIlIIlllIllIIIllIllI = I18n.format(llllllllllllIlIllIlIIIIIllllIIll, llllllllllllIlIllIlIIIIIllllIIII);
        }
        final int lllllllllllllIlIIlllIllIIIllIlIl = this.getFontRenderer().getStringWidth(lllllllllllllIlIIlllIllIIIllIllI);
        this.getFontRenderer().drawStringWithShadow(lllllllllllllIlIIlllIllIIIllIllI, (float)(lllllllllllllIlIIlllIllIIIllIlll.getScaledWidth() - lllllllllllllIlIIlllIllIIIllIlIl - GuiIngame.lIIIIIlIlIIlIl[6]), 5.0f, GuiIngame.lIIIIIlIlIIlIl[23]);
        "".length();
        this.mc.mcProfiler.endSection();
    }
    
    private static boolean lIllIllIIIlIlll(final Object lllllllllllllIlIIlllIlIIIllIIlII) {
        return lllllllllllllIlIIlllIlIIIllIIlII == null;
    }
    
    private static int lIllIllIIlIIIlI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static int lIllIllIIIlllIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    protected void renderTooltip(final ScaledResolution lllllllllllllIlIIlllIllIlIIlIIlI, final float lllllllllllllIlIIlllIllIlIIlIIIl) {
        if (lIllIllIIIIllll((this.mc.getRenderViewEntity() instanceof EntityPlayer) ? 1 : 0)) {
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            this.mc.getTextureManager().bindTexture(GuiIngame.widgetsTexPath);
            final EntityPlayer lllllllllllllIlIIlllIllIlIIlIIII = (EntityPlayer)this.mc.getRenderViewEntity();
            final int lllllllllllllIlIIlllIllIlIIIllll = lllllllllllllIlIIlllIllIlIIlIIlI.getScaledWidth() / GuiIngame.lIIIIIlIlIIlIl[2];
            final float lllllllllllllIlIIlllIllIlIIIlllI = this.zLevel;
            this.zLevel = -90.0f;
            this.drawTexturedModalRect(lllllllllllllIlIIlllIllIlIIIllll - GuiIngame.lIIIIIlIlIIlIl[19], lllllllllllllIlIIlllIllIlIIlIIlI.getScaledHeight() - GuiIngame.lIIIIIlIlIIlIl[28], GuiIngame.lIIIIIlIlIIlIl[0], GuiIngame.lIIIIIlIlIIlIl[0], GuiIngame.lIIIIIlIlIIlIl[29], GuiIngame.lIIIIIlIlIIlIl[28]);
            this.drawTexturedModalRect(lllllllllllllIlIIlllIllIlIIIllll - GuiIngame.lIIIIIlIlIIlIl[19] - GuiIngame.lIIIIIlIlIIlIl[1] + lllllllllllllIlIIlllIllIlIIlIIII.inventory.currentItem * GuiIngame.lIIIIIlIlIIlIl[8], lllllllllllllIlIIlllIllIlIIlIIlI.getScaledHeight() - GuiIngame.lIIIIIlIlIIlIl[28] - GuiIngame.lIIIIIlIlIIlIl[1], GuiIngame.lIIIIIlIlIIlIl[0], GuiIngame.lIIIIIlIlIIlIl[28], GuiIngame.lIIIIIlIlIIlIl[17], GuiIngame.lIIIIIlIlIIlIl[28]);
            this.zLevel = lllllllllllllIlIIlllIllIlIIIlllI;
            GlStateManager.enableRescaleNormal();
            GlStateManager.enableBlend();
            GlStateManager.tryBlendFuncSeparate(GuiIngame.lIIIIIlIlIIlIl[9], GuiIngame.lIIIIIlIlIIlIl[10], GuiIngame.lIIIIIlIlIIlIl[1], GuiIngame.lIIIIIlIlIIlIl[0]);
            RenderHelper.enableGUIStandardItemLighting();
            int lllllllllllllIlIIlllIllIlIIIllIl = GuiIngame.lIIIIIlIlIIlIl[0];
            "".length();
            if ("  ".length() > "  ".length()) {
                return;
            }
            while (!lIllIllIIIllIII(lllllllllllllIlIIlllIllIlIIIllIl, GuiIngame.lIIIIIlIlIIlIl[26])) {
                final int lllllllllllllIlIIlllIllIlIIIllII = lllllllllllllIlIIlllIllIlIIlIIlI.getScaledWidth() / GuiIngame.lIIIIIlIlIIlIl[2] - GuiIngame.lIIIIIlIlIIlIl[30] + lllllllllllllIlIIlllIllIlIIIllIl * GuiIngame.lIIIIIlIlIIlIl[8] + GuiIngame.lIIIIIlIlIIlIl[2];
                final int lllllllllllllIlIIlllIllIlIIIlIll = lllllllllllllIlIIlllIllIlIIlIIlI.getScaledHeight() - GuiIngame.lIIIIIlIlIIlIl[14] - GuiIngame.lIIIIIlIlIIlIl[3];
                this.renderHotbarItem(lllllllllllllIlIIlllIllIlIIIllIl, lllllllllllllIlIIlllIllIlIIIllII, lllllllllllllIlIIlllIllIlIIIlIll, lllllllllllllIlIIlllIllIlIIlIIIl, lllllllllllllIlIIlllIllIlIIlIIII);
                ++lllllllllllllIlIIlllIllIlIIIllIl;
            }
            RenderHelper.disableStandardItemLighting();
            GlStateManager.disableRescaleNormal();
            GlStateManager.disableBlend();
        }
    }
    
    private void renderPumpkinOverlay(final ScaledResolution lllllllllllllIlIIlllIlIlIlIIlllI) {
        GlStateManager.disableDepth();
        GlStateManager.depthMask((boolean)(GuiIngame.lIIIIIlIlIIlIl[0] != 0));
        GlStateManager.tryBlendFuncSeparate(GuiIngame.lIIIIIlIlIIlIl[9], GuiIngame.lIIIIIlIlIIlIl[10], GuiIngame.lIIIIIlIlIIlIl[1], GuiIngame.lIIIIIlIlIIlIl[0]);
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.disableAlpha();
        this.mc.getTextureManager().bindTexture(GuiIngame.pumpkinBlurTexPath);
        final Tessellator lllllllllllllIlIIlllIlIlIlIIllIl = Tessellator.getInstance();
        final WorldRenderer lllllllllllllIlIIlllIlIlIlIIllII = lllllllllllllIlIIlllIlIlIlIIllIl.getWorldRenderer();
        lllllllllllllIlIIlllIlIlIlIIllII.begin(GuiIngame.lIIIIIlIlIIlIl[13], DefaultVertexFormats.POSITION_TEX);
        lllllllllllllIlIIlllIlIlIlIIllII.pos(0.0, lllllllllllllIlIIlllIlIlIlIIlllI.getScaledHeight(), -90.0).tex(0.0, 1.0).endVertex();
        lllllllllllllIlIIlllIlIlIlIIllII.pos(lllllllllllllIlIIlllIlIlIlIIlllI.getScaledWidth(), lllllllllllllIlIIlllIlIlIlIIlllI.getScaledHeight(), -90.0).tex(1.0, 1.0).endVertex();
        lllllllllllllIlIIlllIlIlIlIIllII.pos(lllllllllllllIlIIlllIlIlIlIIlllI.getScaledWidth(), 0.0, -90.0).tex(1.0, 0.0).endVertex();
        lllllllllllllIlIIlllIlIlIlIIllII.pos(0.0, 0.0, -90.0).tex(0.0, 0.0).endVertex();
        lllllllllllllIlIIlllIlIlIlIIllIl.draw();
        GlStateManager.depthMask((boolean)(GuiIngame.lIIIIIlIlIIlIl[1] != 0));
        GlStateManager.enableDepth();
        GlStateManager.enableAlpha();
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
    }
    
    private static boolean lIllIllIIIlIlII(final int lllllllllllllIlIIlllIlIIIllIllIl, final int lllllllllllllIlIIlllIlIIIllIllII) {
        return lllllllllllllIlIIlllIlIIIllIllIl > lllllllllllllIlIIlllIlIIIllIllII;
    }
    
    private void renderHotbarItem(final int lllllllllllllIlIIlllIlIlIIIIIlII, final int lllllllllllllIlIIlllIlIIlllllIlI, final int lllllllllllllIlIIlllIlIIlllllIIl, final float lllllllllllllIlIIlllIlIIlllllIII, final EntityPlayer lllllllllllllIlIIlllIlIIllllIlll) {
        final ItemStack lllllllllllllIlIIlllIlIIllllllll = lllllllllllllIlIIlllIlIIllllIlll.inventory.mainInventory[lllllllllllllIlIIlllIlIlIIIIIlII];
        if (lIllIllIIIlIIIl(lllllllllllllIlIIlllIlIIllllllll)) {
            final float lllllllllllllIlIIlllIlIIlllllllI = lllllllllllllIlIIlllIlIIllllllll.animationsToGo - lllllllllllllIlIIlllIlIIlllllIII;
            if (lIllIllIIIlIIll(lIllIllIIlIIllI(lllllllllllllIlIIlllIlIIlllllllI, 0.0f))) {
                GlStateManager.pushMatrix();
                final float lllllllllllllIlIIlllIlIIllllllIl = 1.0f + lllllllllllllIlIIlllIlIIlllllllI / 5.0f;
                GlStateManager.translate((float)(lllllllllllllIlIIlllIlIIlllllIlI + GuiIngame.lIIIIIlIlIIlIl[20]), (float)(lllllllllllllIlIIlllIlIIlllllIIl + GuiIngame.lIIIIIlIlIIlIl[35]), 0.0f);
                GlStateManager.scale(1.0f / lllllllllllllIlIIlllIlIIllllllIl, (lllllllllllllIlIIlllIlIIllllllIl + 1.0f) / 2.0f, 1.0f);
                GlStateManager.translate((float)(-(lllllllllllllIlIIlllIlIIlllllIlI + GuiIngame.lIIIIIlIlIIlIl[20])), (float)(-(lllllllllllllIlIIlllIlIIlllllIIl + GuiIngame.lIIIIIlIlIIlIl[35])), 0.0f);
            }
            this.itemRenderer.renderItemAndEffectIntoGUI(lllllllllllllIlIIlllIlIIllllllll, lllllllllllllIlIIlllIlIIlllllIlI, lllllllllllllIlIIlllIlIIlllllIIl);
            if (lIllIllIIIlIIll(lIllIllIIlIIllI(lllllllllllllIlIIlllIlIIlllllllI, 0.0f))) {
                GlStateManager.popMatrix();
            }
            this.itemRenderer.renderItemOverlays(this.mc.fontRendererObj, lllllllllllllIlIIlllIlIIllllllll, lllllllllllllIlIIlllIlIIlllllIlI, lllllllllllllIlIIlllIlIIlllllIIl);
        }
    }
    
    public void setRecordPlaying(final IChatComponent lllllllllllllIlIIlllIlIIllIIIlIl, final boolean lllllllllllllIlIIlllIlIIllIIIlII) {
        this.setRecordPlaying(lllllllllllllIlIIlllIlIIllIIIlIl.getUnformattedText(), lllllllllllllIlIIlllIlIIllIIIlII);
    }
    
    private static boolean lIllIllIIIlIlIl(final int lllllllllllllIlIIlllIlIIIlllIIIl, final int lllllllllllllIlIIlllIlIIIlllIIII) {
        return lllllllllllllIlIIlllIlIIIlllIIIl <= lllllllllllllIlIIlllIlIIIlllIIII;
    }
    
    private static boolean lIllIllIIlIIIII(final int lllllllllllllIlIIlllIlIIIlIllIlI) {
        return lllllllllllllIlIIlllIlIIIlIllIlI <= 0;
    }
    
    private void renderScoreboard(final ScoreObjective lllllllllllllIlIIlllIlIllllllIIl, final ScaledResolution lllllllllllllIlIIlllIlIllllllIII) {
        final Scoreboard lllllllllllllIlIIlllIllIIIIIllIl = lllllllllllllIlIIlllIlIllllllIIl.getScoreboard();
        Collection<Score> lllllllllllllIlIIlllIllIIIIIllII = lllllllllllllIlIIlllIllIIIIIllIl.getSortedScores(lllllllllllllIlIIlllIlIllllllIIl);
        final List<Score> lllllllllllllIlIIlllIllIIIIIlIll = (List<Score>)Lists.newArrayList(Iterables.filter((Iterable)lllllllllllllIlIIlllIllIIIIIllII, (Predicate)new Predicate<Score>() {
            private static final /* synthetic */ String[] lllIllIllIIIIl;
            private static final /* synthetic */ int[] lllIllIllIIIlI;
            
            private static boolean lIlIIlIlIIIlIIII(final int llllllllllllIlIllIIIlllIlIlllIlI) {
                return llllllllllllIlIllIIIlllIlIlllIlI == 0;
            }
            
            private static String lIlIIlIlIIIIllII(String llllllllllllIlIllIIIlllIllIIlIlI, final String llllllllllllIlIllIIIlllIllIIlIIl) {
                llllllllllllIlIllIIIlllIllIIlIlI = (short)new String(Base64.getDecoder().decode(((String)llllllllllllIlIllIIIlllIllIIlIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                final StringBuilder llllllllllllIlIllIIIlllIllIIllIl = new StringBuilder();
                final char[] llllllllllllIlIllIIIlllIllIIllII = llllllllllllIlIllIIIlllIllIIlIIl.toCharArray();
                int llllllllllllIlIllIIIlllIllIIlIll = GuiIngame$1.lllIllIllIIIlI[0];
                final long llllllllllllIlIllIIIlllIllIIIlIl = (long)(Object)((String)llllllllllllIlIllIIIlllIllIIlIlI).toCharArray();
                final double llllllllllllIlIllIIIlllIllIIIlII = llllllllllllIlIllIIIlllIllIIIlIl.length;
                long llllllllllllIlIllIIIlllIllIIIIll = GuiIngame$1.lllIllIllIIIlI[0];
                while (lIlIIlIlIIIlIIIl((int)llllllllllllIlIllIIIlllIllIIIIll, (int)llllllllllllIlIllIIIlllIllIIIlII)) {
                    final char llllllllllllIlIllIIIlllIllIlIIII = llllllllllllIlIllIIIlllIllIIIlIl[llllllllllllIlIllIIIlllIllIIIIll];
                    llllllllllllIlIllIIIlllIllIIllIl.append((char)(llllllllllllIlIllIIIlllIllIlIIII ^ llllllllllllIlIllIIIlllIllIIllII[llllllllllllIlIllIIIlllIllIIlIll % llllllllllllIlIllIIIlllIllIIllII.length]));
                    "".length();
                    ++llllllllllllIlIllIIIlllIllIIlIll;
                    ++llllllllllllIlIllIIIlllIllIIIIll;
                    "".length();
                    if ("   ".length() > "   ".length()) {
                        return null;
                    }
                }
                return String.valueOf(llllllllllllIlIllIIIlllIllIIllIl);
            }
            
            private static boolean lIlIIlIlIIIIllll(final Object llllllllllllIlIllIIIlllIlIllllII) {
                return llllllllllllIlIllIIIlllIlIllllII != null;
            }
            
            private static void lIlIIlIlIIIIlllI() {
                (lllIllIllIIIlI = new int[2])[0] = ((122 + 103 - 121 + 33 ^ 80 + 98 - 49 + 57) & (0x45 ^ 0xE ^ (0x29 ^ 0x51) ^ -" ".length()));
                GuiIngame$1.lllIllIllIIIlI[1] = " ".length();
            }
            
            private static void lIlIIlIlIIIIllIl() {
                (lllIllIllIIIIl = new String[GuiIngame$1.lllIllIllIIIlI[1]])[GuiIngame$1.lllIllIllIIIlI[0]] = lIlIIlIlIIIIllII("YQ==", "BDOhd");
            }
            
            static {
                lIlIIlIlIIIIlllI();
                lIlIIlIlIIIIllIl();
            }
            
            public boolean apply(final Score llllllllllllIlIllIIIlllIllIlllll) {
                if (lIlIIlIlIIIIllll(llllllllllllIlIllIIIlllIllIlllll.getPlayerName()) && lIlIIlIlIIIlIIII(llllllllllllIlIllIIIlllIllIlllll.getPlayerName().startsWith(GuiIngame$1.lllIllIllIIIIl[GuiIngame$1.lllIllIllIIIlI[0]]) ? 1 : 0)) {
                    return GuiIngame$1.lllIllIllIIIlI[1] != 0;
                }
                return GuiIngame$1.lllIllIllIIIlI[0] != 0;
            }
            
            private static boolean lIlIIlIlIIIlIIIl(final int llllllllllllIlIllIIIlllIlIllllll, final int llllllllllllIlIllIIIlllIlIlllllI) {
                return llllllllllllIlIllIIIlllIlIllllll < llllllllllllIlIllIIIlllIlIlllllI;
            }
        }));
        if (lIllIllIIIlIlII(lllllllllllllIlIIlllIllIIIIIlIll.size(), GuiIngame.lIIIIIlIlIIlIl[43])) {
            lllllllllllllIlIIlllIllIIIIIllII = (Collection<Score>)Lists.newArrayList(Iterables.skip((Iterable)lllllllllllllIlIIlllIllIIIIIlIll, lllllllllllllIlIIlllIllIIIIIllII.size() - GuiIngame.lIIIIIlIlIIlIl[43]));
            "".length();
            if (" ".length() < " ".length()) {
                return;
            }
        }
        else {
            lllllllllllllIlIIlllIllIIIIIllII = lllllllllllllIlIIlllIllIIIIIlIll;
        }
        int lllllllllllllIlIIlllIllIIIIIlIlI = this.getFontRenderer().getStringWidth(lllllllllllllIlIIlllIlIllllllIIl.getDisplayName());
        final Exception lllllllllllllIlIIlllIlIlllllIIlI = (Exception)lllllllllllllIlIIlllIllIIIIIllII.iterator();
        "".length();
        if (null != null) {
            return;
        }
        while (!lIllIllIIIlIIII(((Iterator)lllllllllllllIlIIlllIlIlllllIIlI).hasNext() ? 1 : 0)) {
            final Score lllllllllllllIlIIlllIllIIIIIlIIl = ((Iterator<Score>)lllllllllllllIlIIlllIlIlllllIIlI).next();
            final ScorePlayerTeam lllllllllllllIlIIlllIllIIIIIlIII = lllllllllllllIlIIlllIllIIIIIllIl.getPlayersTeam(lllllllllllllIlIIlllIllIIIIIlIIl.getPlayerName());
            final String lllllllllllllIlIIlllIllIIIIIIlll = String.valueOf(new StringBuilder(String.valueOf(ScorePlayerTeam.formatPlayerName(lllllllllllllIlIIlllIllIIIIIlIII, lllllllllllllIlIIlllIllIIIIIlIIl.getPlayerName()))).append(GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[46]]).append(EnumChatFormatting.RED).append(lllllllllllllIlIIlllIllIIIIIlIIl.getScorePoints()));
            lllllllllllllIlIIlllIllIIIIIlIlI = Math.max(lllllllllllllIlIIlllIllIIIIIlIlI, this.getFontRenderer().getStringWidth(lllllllllllllIlIIlllIllIIIIIIlll));
        }
        final int lllllllllllllIlIIlllIllIIIIIIllI = lllllllllllllIlIIlllIllIIIIIllII.size() * this.getFontRenderer().FONT_HEIGHT;
        final int lllllllllllllIlIIlllIllIIIIIIlIl = lllllllllllllIlIIlllIlIllllllIII.getScaledHeight() / GuiIngame.lIIIIIlIlIIlIl[2] + lllllllllllllIlIIlllIllIIIIIIllI / GuiIngame.lIIIIIlIlIIlIl[3];
        final int lllllllllllllIlIIlllIllIIIIIIlII = GuiIngame.lIIIIIlIlIIlIl[3];
        final int lllllllllllllIlIIlllIllIIIIIIIll = lllllllllllllIlIIlllIlIllllllIII.getScaledWidth() - lllllllllllllIlIIlllIllIIIIIlIlI - lllllllllllllIlIIlllIllIIIIIIlII;
        int lllllllllllllIlIIlllIllIIIIIIIlI = GuiIngame.lIIIIIlIlIIlIl[0];
        final Exception lllllllllllllIlIIlllIlIllllIllIl = (Exception)lllllllllllllIlIIlllIllIIIIIllII.iterator();
        "".length();
        if ("  ".length() < "  ".length()) {
            return;
        }
        while (!lIllIllIIIlIIII(((Iterator)lllllllllllllIlIIlllIlIllllIllIl).hasNext() ? 1 : 0)) {
            final Score lllllllllllllIlIIlllIllIIIIIIIIl = ((Iterator<Score>)lllllllllllllIlIIlllIlIllllIllIl).next();
            ++lllllllllllllIlIIlllIllIIIIIIIlI;
            final ScorePlayerTeam lllllllllllllIlIIlllIllIIIIIIIII = lllllllllllllIlIIlllIllIIIIIllIl.getPlayersTeam(lllllllllllllIlIIlllIllIIIIIIIIl.getPlayerName());
            final String lllllllllllllIlIIlllIlIlllllllll = ScorePlayerTeam.formatPlayerName(lllllllllllllIlIIlllIllIIIIIIIII, lllllllllllllIlIIlllIllIIIIIIIIl.getPlayerName());
            final String lllllllllllllIlIIlllIlIllllllllI = String.valueOf(new StringBuilder().append(EnumChatFormatting.RED).append(lllllllllllllIlIIlllIllIIIIIIIIl.getScorePoints()));
            final int lllllllllllllIlIIlllIlIlllllllIl = lllllllllllllIlIIlllIllIIIIIIlIl - lllllllllllllIlIIlllIllIIIIIIIlI * this.getFontRenderer().FONT_HEIGHT;
            final int lllllllllllllIlIIlllIlIlllllllII = lllllllllllllIlIIlllIlIllllllIII.getScaledWidth() - lllllllllllllIlIIlllIllIIIIIIlII + GuiIngame.lIIIIIlIlIIlIl[2];
            Gui.drawRect(lllllllllllllIlIIlllIllIIIIIIIll - GuiIngame.lIIIIIlIlIIlIl[2], lllllllllllllIlIIlllIlIlllllllIl, lllllllllllllIlIIlllIlIlllllllII, lllllllllllllIlIIlllIlIlllllllIl + this.getFontRenderer().FONT_HEIGHT, GuiIngame.lIIIIIlIlIIlIl[47]);
            this.getFontRenderer().drawString(lllllllllllllIlIIlllIlIlllllllll, lllllllllllllIlIIlllIllIIIIIIIll, lllllllllllllIlIIlllIlIlllllllIl, GuiIngame.lIIIIIlIlIIlIl[48]);
            "".length();
            this.getFontRenderer().drawString(lllllllllllllIlIIlllIlIllllllllI, lllllllllllllIlIIlllIlIlllllllII - this.getFontRenderer().getStringWidth(lllllllllllllIlIIlllIlIllllllllI), lllllllllllllIlIIlllIlIlllllllIl, GuiIngame.lIIIIIlIlIIlIl[48]);
            "".length();
            if (lIllIllIIIllIlI(lllllllllllllIlIIlllIllIIIIIIIlI, lllllllllllllIlIIlllIllIIIIIllII.size())) {
                final String lllllllllllllIlIIlllIlIllllllIll = lllllllllllllIlIIlllIlIllllllIIl.getDisplayName();
                Gui.drawRect(lllllllllllllIlIIlllIllIIIIIIIll - GuiIngame.lIIIIIlIlIIlIl[2], lllllllllllllIlIIlllIlIlllllllIl - this.getFontRenderer().FONT_HEIGHT - GuiIngame.lIIIIIlIlIIlIl[1], lllllllllllllIlIIlllIlIlllllllII, lllllllllllllIlIIlllIlIlllllllIl - GuiIngame.lIIIIIlIlIIlIl[1], GuiIngame.lIIIIIlIlIIlIl[49]);
                Gui.drawRect(lllllllllllllIlIIlllIllIIIIIIIll - GuiIngame.lIIIIIlIlIIlIl[2], lllllllllllllIlIIlllIlIlllllllIl - GuiIngame.lIIIIIlIlIIlIl[1], lllllllllllllIlIIlllIlIlllllllII, lllllllllllllIlIIlllIlIlllllllIl, GuiIngame.lIIIIIlIlIIlIl[47]);
                this.getFontRenderer().drawString(lllllllllllllIlIIlllIlIllllllIll, lllllllllllllIlIIlllIllIIIIIIIll + lllllllllllllIlIIlllIllIIIIIlIlI / GuiIngame.lIIIIIlIlIIlIl[2] - this.getFontRenderer().getStringWidth(lllllllllllllIlIIlllIlIllllllIll) / GuiIngame.lIIIIIlIlIIlIl[2], lllllllllllllIlIIlllIlIlllllllIl - this.getFontRenderer().FONT_HEIGHT, GuiIngame.lIIIIIlIlIIlIl[48]);
                "".length();
            }
        }
    }
    
    static {
        lIllIllIIIIllII();
        lIllIllIIIIlIlI();
        vignetteTexPath = new ResourceLocation(GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[0]]);
        widgetsTexPath = new ResourceLocation(GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[1]]);
        pumpkinBlurTexPath = new ResourceLocation(GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[2]]);
    }
    
    private static int lIllIllIIlIIIIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    public GuiNewChat getChatGUI() {
        return this.persistantChatGUI;
    }
    
    public void renderStreamIndicator(final ScaledResolution lllllllllllllIlIIlllIllIIIlIIlIl) {
        this.streamIndicator.render(lllllllllllllIlIIlllIllIIIlIIlIl.getScaledWidth() - GuiIngame.lIIIIIlIlIIlIl[6], GuiIngame.lIIIIIlIlIIlIl[6]);
    }
    
    public GuiIngame(final Minecraft lllllllllllllIlIIlllIlllIIIIlIll) {
        this.rand = new Random();
        this.recordPlaying = GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[3]];
        this.prevVignetteBrightness = 1.0f;
        this.field_175201_x = GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[4]];
        this.field_175200_y = GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[5]];
        this.playerHealth = GuiIngame.lIIIIIlIlIIlIl[0];
        this.lastPlayerHealth = GuiIngame.lIIIIIlIlIIlIl[0];
        this.lastSystemTime = 0L;
        this.healthUpdateCounter = 0L;
        this.mc = lllllllllllllIlIIlllIlllIIIIlIll;
        this.itemRenderer = lllllllllllllIlIIlllIlllIIIIlIll.getRenderItem();
        this.overlayDebug = new GuiOverlayDebug(lllllllllllllIlIIlllIlllIIIIlIll);
        this.spectatorGui = new GuiSpectator(lllllllllllllIlIIlllIlllIIIIlIll);
        this.persistantChatGUI = new GuiNewChat(lllllllllllllIlIIlllIlllIIIIlIll);
        this.streamIndicator = new GuiStreamIndicator(lllllllllllllIlIIlllIlllIIIIlIll);
        this.overlayPlayerList = new GuiPlayerTabOverlay(lllllllllllllIlIIlllIlllIIIIlIll, this);
        this.func_175177_a();
    }
    
    public void setRecordPlaying(final String lllllllllllllIlIIlllIlIIlllIIIll, final boolean lllllllllllllIlIIlllIlIIlllIIIlI) {
        this.recordPlaying = lllllllllllllIlIIlllIlIIlllIIIll;
        this.recordPlayingUpFor = GuiIngame.lIIIIIlIlIIlIl[70];
        this.recordIsPlaying = lllllllllllllIlIIlllIlIIlllIIIlI;
    }
    
    private static void lIllIllIIIIllII() {
        (lIIIIIlIlIIlIl = new int[73])[0] = ((199 + 170 - 348 + 213 ^ 18 + 157 - 97 + 97) & (0x2E ^ 0x1F ^ (0xC4 ^ 0xB0) ^ -" ".length()));
        GuiIngame.lIIIIIlIlIIlIl[1] = " ".length();
        GuiIngame.lIIIIIlIlIIlIl[2] = "  ".length();
        GuiIngame.lIIIIIlIlIIlIl[3] = "   ".length();
        GuiIngame.lIIIIIlIlIIlIl[4] = (99 + 132 - 177 + 102 ^ 99 + 20 - 14 + 47);
        GuiIngame.lIIIIIlIlIIlIl[5] = (86 + 39 - 20 + 42 ^ 17 + 103 - 5 + 35);
        GuiIngame.lIIIIIlIlIIlIl[6] = (0x20 ^ 0x2A);
        GuiIngame.lIIIIIlIlIIlIl[7] = (0xF ^ 0x18 ^ (0xDF ^ 0x8E));
        GuiIngame.lIIIIIlIlIIlIl[8] = (0x3F ^ 0x2B);
        GuiIngame.lIIIIIlIlIIlIl[9] = (0xFFFFAB47 & 0x57BA);
        GuiIngame.lIIIIIlIlIIlIl[10] = (-(0xFFFFFCFD & 0x6FFF) & (0xFFFFEFFF & 0x7FFF));
        GuiIngame.lIIIIIlIlIIlIl[11] = (-(0xFFFFFAF9 & 0x2D9F) & (0xFFFFAF9F & 0x7BFF));
        GuiIngame.lIIIIIlIlIIlIl[12] = (0xFFFFBF27 & 0x43D9);
        GuiIngame.lIIIIIlIlIIlIl[13] = (0x54 ^ 0x53);
        GuiIngame.lIIIIIlIlIIlIl[14] = (0x31 ^ 0x21);
        GuiIngame.lIIIIIlIlIIlIl[15] = (0x44 ^ 0x71 ^ (0x31 ^ 0x2));
        GuiIngame.lIIIIIlIlIIlIl[16] = (224 + 130 - 166 + 42 ^ 60 + 47 - 29 + 52);
        GuiIngame.lIIIIIlIlIIlIl[17] = (0x5D ^ 0x45);
        GuiIngame.lIIIIIlIlIIlIl[18] = (-(0xFFFFF75F & 0x6EEF) & (0xFFFFFF7E & 0x1076EF));
        GuiIngame.lIIIIIlIlIIlIl[19] = (34 + 7 + 32 + 127 ^ 141 + 42 - 52 + 16);
        GuiIngame.lIIIIIlIlIIlIl[20] = (0xF ^ 0x7);
        GuiIngame.lIIIIIlIlIIlIl[21] = 103 + 133 - 202 + 221;
        GuiIngame.lIIIIIlIlIIlIl[22] = (0xF5 ^ 0xB1);
        GuiIngame.lIIIIIlIlIIlIl[23] = (-1 & 0xFFFFFF);
        GuiIngame.lIIIIIlIlIIlIl[24] = -(0x21 ^ 0x25);
        GuiIngame.lIIIIIlIlIIlIl[25] = -(-(0xFFFFEFFF & 0x7E43) & (0xFFFFEEC6 & 0x1007F7B));
        GuiIngame.lIIIIIlIlIIlIl[26] = (0x51 ^ 0x58);
        GuiIngame.lIIIIIlIlIIlIl[27] = (0x2F ^ 0x39 ^ (0xE1 ^ 0xC7));
        GuiIngame.lIIIIIlIlIIlIl[28] = (0x9F ^ 0x89);
        GuiIngame.lIIIIIlIlIIlIl[29] = (0xA ^ 0x52) + (0x71 ^ 0x1C) - (0x66 ^ 0x3D) + (0x59 ^ 0x15);
        GuiIngame.lIIIIIlIlIIlIl[30] = (0x31 ^ 0x7E ^ (0xAB ^ 0xBE));
        GuiIngame.lIIIIIlIlIIlIl[31] = (0x37 ^ 0x3C);
        GuiIngame.lIIIIIlIlIIlIl[32] = (0x1C ^ 0x27 ^ (0x4B ^ 0x50));
        GuiIngame.lIIIIIlIlIIlIl[33] = (" ".length() ^ (0xE9 ^ 0xBC));
        GuiIngame.lIIIIIlIlIIlIl[34] = (0x52 ^ 0x72 ^ (0x1 ^ 0x78));
        GuiIngame.lIIIIIlIlIIlIl[35] = (0x8F ^ 0x83);
        GuiIngame.lIIIIIlIlIIlIl[36] = (0x13 ^ 0x53);
        GuiIngame.lIIIIIlIlIIlIl[37] = (0xEA ^ 0xAF);
        GuiIngame.lIIIIIlIlIIlIl[38] = (0x6E ^ 0x63);
        GuiIngame.lIIIIIlIlIIlIl[39] = (0xFFFFFF2B & 0x80FFF4);
        GuiIngame.lIIIIIlIlIIlIl[40] = (0x63 ^ 0x7C);
        GuiIngame.lIIIIIlIlIIlIl[41] = (0x44 ^ 0x68 ^ (0x14 ^ 0x36));
        GuiIngame.lIIIIIlIlIIlIl[42] = (0xF7 ^ 0x9A ^ (0x14 ^ 0x42));
        GuiIngame.lIIIIIlIlIIlIl[43] = (0xB8 ^ 0xB7);
        GuiIngame.lIIIIIlIlIIlIl[44] = (0x23 ^ 0x32);
        GuiIngame.lIIIIIlIlIIlIl[45] = (0xB7 ^ 0xA5);
        GuiIngame.lIIIIIlIlIIlIl[46] = (0x25 ^ 0x42 ^ (0xC2 ^ 0xB6));
        GuiIngame.lIIIIIlIlIIlIl[47] = (0xFFFFD2F2 & 0x50002D0D);
        GuiIngame.lIIIIIlIlIIlIl[48] = (-" ".length() & (-1 & 0x20FFFFFF));
        GuiIngame.lIIIIIlIlIIlIl[49] = (-(0xFFFF9AEB & 0x6F7C) & (0xFFFFEB67 & 0x60001EFF));
        GuiIngame.lIIIIIlIlIIlIl[50] = (0xFFFFC7FF & 0x4FE27);
        GuiIngame.lIIIIIlIlIIlIl[51] = (0x9B ^ 0xB8 ^ (0x70 ^ 0x74));
        GuiIngame.lIIIIIlIlIIlIl[52] = -" ".length();
        GuiIngame.lIIIIIlIlIIlIl[53] = (0xF ^ 0x31 ^ (0xB0 ^ 0xAC));
        GuiIngame.lIIIIIlIlIIlIl[54] = (0x61 ^ 0x78);
        GuiIngame.lIIIIIlIlIIlIl[55] = (0x17 ^ 0x2);
        GuiIngame.lIIIIIlIlIIlIl[56] = (0x9D ^ 0xAB);
        GuiIngame.lIIIIIlIlIIlIl[57] = (0x4D ^ 0x65 ^ (0xB6 ^ 0xA1));
        GuiIngame.lIIIIIlIlIIlIl[58] = (0xE8 ^ 0x84) + (0x76 ^ 0x4E) - (2 + 128 - 83 + 109) + (80 + 40 - 88 + 113);
        GuiIngame.lIIIIIlIlIIlIl[59] = (0x18 ^ 0xE) + (0x93 ^ 0xA5) - (0x5A ^ 0x5D) + (0x75 ^ 0x3E);
        GuiIngame.lIIIIIlIlIIlIl[60] = (0x23 ^ 0x29 ^ (0xEC ^ 0xC2));
        GuiIngame.lIIIIIlIlIIlIl[61] = (0x6A ^ 0x25 ^ (0x4C ^ 0x2E));
        GuiIngame.lIIIIIlIlIIlIl[62] = (0x5D ^ 0x54 ^ (0x35 ^ 0x27));
        GuiIngame.lIIIIIlIlIIlIl[63] = (0x28 ^ 0x70 ^ (0x21 ^ 0x6E));
        GuiIngame.lIIIIIlIlIIlIl[64] = (0xCC ^ 0x9F ^ (0x56 ^ 0x1B));
        GuiIngame.lIIIIIlIlIIlIl[65] = (0x90 ^ 0xA8 ^ (0x2E ^ 0x22));
        GuiIngame.lIIIIIlIlIIlIl[66] = (0xCE ^ 0x84);
        GuiIngame.lIIIIIlIlIIlIl[67] = (0x2F ^ 0x60);
        GuiIngame.lIIIIIlIlIIlIl[68] = (0x16 ^ 0xC);
        GuiIngame.lIIIIIlIlIIlIl[69] = (0xA2 ^ 0x8A);
        GuiIngame.lIIIIIlIlIIlIl[70] = (0x6B ^ 0x57);
        GuiIngame.lIIIIIlIlIIlIl[71] = (18 + 47 + 52 + 49 ^ 80 + 156 - 131 + 81);
        GuiIngame.lIIIIIlIlIIlIl[72] = (0x84 ^ 0x99);
    }
    
    private static int lIllIllIIlIIllI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static void lIllIllIIIIlIlI() {
        (lIIIIIlIIllIlI = new String[GuiIngame.lIIIIIlIlIIlIl[64]])[GuiIngame.lIIIIIlIlIIlIl[0]] = lIllIlIlllllIII("Aww2GRQFDD1CDB4aLUIXHg4gCBUDDGAdDxA=", "wiNma");
        GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[1]] = lIllIlIlllllIIl("F4wFDEJx4CN5oBm4dB1WEUGIQ6Rxpd5gJHsl1o2JzJM=", "eyLVh");
        GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[2]] = lIllIlIllllllII("oc58tL7CjduxPK8Gc+8XwfUnjaqw5VJa2GviIKATAzA=", "XzJfL");
        GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[3]] = lIllIlIlllllIII("", "OuXvf");
        GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[4]] = lIllIlIlllllIIl("Wc6JvZ4CDkY=", "MVsdR");
        GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[5]] = lIllIlIlllllIIl("CBsHwnE7Bxw=", "uWCaK");
        GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[15]] = lIllIlIllllllII("dDgGyOt1q9gKQXqi5Cwy9g==", "bABQe");
        GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[13]] = lIllIlIllllllII("zXclUQTagF4=", "AWmaq");
        GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[20]] = lIllIlIlllllIIl("rHpVB9wI9aR+H+n5o6y8YA==", "EfWTA");
        GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[26]] = lIllIlIllllllII("Pu4hu0UNyu+fmaZch2hNp63qUZRUF06P", "GXLVq");
        GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[6]] = lIllIlIlllllIIl("06gDoZoP4tk=", "mJqyU");
        GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[31]] = lIllIlIllllllII("yIBu4nwdjdk=", "spUQg");
        GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[35]] = lIllIlIlllllIII("KwEKOxk8", "Nyzyx");
        GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[38]] = lIllIlIllllllII("M+4HUcKwsVCtIdRG6ZzzzA==", "oqamq");
        GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[41]] = lIllIlIlllllIIl("uDeXHCePVw4lqybdxCMgQ2kpGU2qwMmM", "wrmlS");
        GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[43]] = lIllIlIlllllIII("LDM5Fw==", "HVTxh");
        GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[14]] = lIllIlIllllllII("GPAozcTMhNA=", "ZdetD");
        GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[44]] = lIllIlIlllllIIl("ktDwXuvPWiXTaJPjJIduPUF5+daq2QXI", "nlhqd");
        GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[45]] = lIllIlIlllllIII("Dj0aC0IYPRoFBQQxGQM4AzUS", "jXwdl");
        GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[46]] = lIllIlIlllllIIl("c84NHgR6XQc=", "yLnSJ");
        GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[8]] = lIllIlIlllllIIl("CGxw2u+ifDo=", "kyKeR");
        GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[55]] = lIllIlIlllllIII("AQACFS0B", "iecyY");
        GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[28]] = lIllIlIlllllIIl("R8Noj/Iurqw=", "gWmjc");
        GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[63]] = lIllIlIllllllII("x35vM5voGi6IJclBibKf3Q==", "hXmBo");
        GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[17]] = lIllIlIlllllIII("FQsg", "tbRqT");
        GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[54]] = lIllIlIlllllIIl("WZYHt6M+bUU=", "jLNxJ");
        GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[68]] = lIllIlIllllllII("YFnDbiOK0rQ=", "jKJmt");
        GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[62]] = lIllIlIlllllIIl("zOzx+V6lWXu6cpdmitMzrLZXqzqmnDTn", "qKOkM");
        GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[71]] = lIllIlIlllllIIl("CZt8qk6XN18=", "npaQd");
        GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[72]] = lIllIlIlllllIII("", "gsoYA");
    }
    
    private static boolean lIllIllIIIllIII(final int lllllllllllllIlIIlllIlIIIllllIIl, final int lllllllllllllIlIIlllIlIIIllllIII) {
        return lllllllllllllIlIIlllIlIIIllllIIl >= lllllllllllllIlIIlllIlIIIllllIII;
    }
    
    private static int lIllIllIIIllIIl(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private void renderPlayerStats(final ScaledResolution lllllllllllllIlIIlllIlIllIIIllll) {
        if (lIllIllIIIIllll((this.mc.getRenderViewEntity() instanceof EntityPlayer) ? 1 : 0)) {
            final EntityPlayer lllllllllllllIlIIlllIlIlllIIIIlI = (EntityPlayer)this.mc.getRenderViewEntity();
            final int lllllllllllllIlIIlllIlIlllIIIIIl = MathHelper.ceiling_float_int(lllllllllllllIlIIlllIlIlllIIIIlI.getHealth());
            int n;
            if (lIllIllIIIlIIll(lIllIllIIIllIll(this.healthUpdateCounter, this.updateCounter)) && lIllIllIIIlIIII(lIllIllIIIllIll((this.healthUpdateCounter - this.updateCounter) / 3L % 2L, 1L))) {
                n = GuiIngame.lIIIIIlIlIIlIl[1];
                "".length();
                if (" ".length() >= "  ".length()) {
                    return;
                }
            }
            else {
                n = GuiIngame.lIIIIIlIlIIlIl[0];
            }
            final boolean lllllllllllllIlIIlllIlIlllIIIIII = n != 0;
            if (lIllIllIIIllllI(lllllllllllllIlIIlllIlIlllIIIIIl, this.playerHealth) && lIllIllIIIlIIll(lllllllllllllIlIIlllIlIlllIIIIlI.hurtResistantTime)) {
                this.lastSystemTime = Minecraft.getSystemTime();
                this.healthUpdateCounter = this.updateCounter + GuiIngame.lIIIIIlIlIIlIl[8];
                "".length();
                if ((0xB6 ^ 0xB2) <= ((0x16 ^ 0xC) & ~(0x18 ^ 0x2))) {
                    return;
                }
            }
            else if (lIllIllIIIlIlII(lllllllllllllIlIIlllIlIlllIIIIIl, this.playerHealth) && lIllIllIIIlIIll(lllllllllllllIlIIlllIlIlllIIIIlI.hurtResistantTime)) {
                this.lastSystemTime = Minecraft.getSystemTime();
                this.healthUpdateCounter = this.updateCounter + GuiIngame.lIIIIIlIlIIlIl[6];
            }
            if (lIllIllIIIlIIll(lIllIllIIIllIll(Minecraft.getSystemTime() - this.lastSystemTime, 1000L))) {
                this.playerHealth = lllllllllllllIlIIlllIlIlllIIIIIl;
                this.lastPlayerHealth = lllllllllllllIlIIlllIlIlllIIIIIl;
                this.lastSystemTime = Minecraft.getSystemTime();
            }
            this.playerHealth = lllllllllllllIlIIlllIlIlllIIIIIl;
            final int lllllllllllllIlIIlllIlIllIllllll = this.lastPlayerHealth;
            this.rand.setSeed(this.updateCounter * GuiIngame.lIIIIIlIlIIlIl[50]);
            final boolean lllllllllllllIlIIlllIlIllIlllllI = GuiIngame.lIIIIIlIlIIlIl[0] != 0;
            final FoodStats lllllllllllllIlIIlllIlIllIllllIl = lllllllllllllIlIIlllIlIlllIIIIlI.getFoodStats();
            final int lllllllllllllIlIIlllIlIllIllllII = lllllllllllllIlIIlllIlIllIllllIl.getFoodLevel();
            final int lllllllllllllIlIIlllIlIllIlllIll = lllllllllllllIlIIlllIlIllIllllIl.getPrevFoodLevel();
            final IAttributeInstance lllllllllllllIlIIlllIlIllIlllIlI = lllllllllllllIlIIlllIlIlllIIIIlI.getEntityAttribute(SharedMonsterAttributes.maxHealth);
            final int lllllllllllllIlIIlllIlIllIlllIIl = lllllllllllllIlIIlllIlIllIIIllll.getScaledWidth() / GuiIngame.lIIIIIlIlIIlIl[2] - GuiIngame.lIIIIIlIlIIlIl[19];
            final int lllllllllllllIlIIlllIlIllIlllIII = lllllllllllllIlIIlllIlIllIIIllll.getScaledWidth() / GuiIngame.lIIIIIlIlIIlIl[2] + GuiIngame.lIIIIIlIlIIlIl[19];
            final int lllllllllllllIlIIlllIlIllIllIlll = lllllllllllllIlIIlllIlIllIIIllll.getScaledHeight() - GuiIngame.lIIIIIlIlIIlIl[51];
            final float lllllllllllllIlIIlllIlIllIllIllI = (float)lllllllllllllIlIIlllIlIllIlllIlI.getAttributeValue();
            final float lllllllllllllIlIIlllIlIllIllIlIl = lllllllllllllIlIIlllIlIlllIIIIlI.getAbsorptionAmount();
            final int lllllllllllllIlIIlllIlIllIllIlII = MathHelper.ceiling_float_int((lllllllllllllIlIIlllIlIllIllIllI + lllllllllllllIlIIlllIlIllIllIlIl) / 2.0f / 10.0f);
            final int lllllllllllllIlIIlllIlIllIllIIll = Math.max(GuiIngame.lIIIIIlIlIIlIl[6] - (lllllllllllllIlIIlllIlIllIllIlII - GuiIngame.lIIIIIlIlIIlIl[2]), GuiIngame.lIIIIIlIlIIlIl[3]);
            final int lllllllllllllIlIIlllIlIllIllIIlI = lllllllllllllIlIIlllIlIllIllIlll - (lllllllllllllIlIIlllIlIllIllIlII - GuiIngame.lIIIIIlIlIIlIl[1]) * lllllllllllllIlIIlllIlIllIllIIll - GuiIngame.lIIIIIlIlIIlIl[6];
            float lllllllllllllIlIIlllIlIllIllIIIl = lllllllllllllIlIIlllIlIllIllIlIl;
            final int lllllllllllllIlIIlllIlIllIllIIII = lllllllllllllIlIIlllIlIlllIIIIlI.getTotalArmorValue();
            int lllllllllllllIlIIlllIlIllIlIllll = GuiIngame.lIIIIIlIlIIlIl[52];
            if (lIllIllIIIIllll(lllllllllllllIlIIlllIlIlllIIIIlI.isPotionActive(Potion.regeneration) ? 1 : 0)) {
                lllllllllllllIlIIlllIlIllIlIllll = this.updateCounter % MathHelper.ceiling_float_int(lllllllllllllIlIIlllIlIllIllIllI + 5.0f);
            }
            this.mc.mcProfiler.startSection(GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[8]]);
            int lllllllllllllIlIIlllIlIllIlIlllI = GuiIngame.lIIIIIlIlIIlIl[0];
            "".length();
            if (((0xF6 ^ 0xA8) & ~(0xFE ^ 0xA0)) <= -" ".length()) {
                return;
            }
            while (!lIllIllIIIllIII(lllllllllllllIlIIlllIlIllIlIlllI, GuiIngame.lIIIIIlIlIIlIl[6])) {
                if (lIllIllIIIlIIll(lllllllllllllIlIIlllIlIllIllIIII)) {
                    final int lllllllllllllIlIIlllIlIllIlIllIl = lllllllllllllIlIIlllIlIllIlllIIl + lllllllllllllIlIIlllIlIllIlIlllI * GuiIngame.lIIIIIlIlIIlIl[20];
                    if (lIllIllIIIllllI(lllllllllllllIlIIlllIlIllIlIlllI * GuiIngame.lIIIIIlIlIIlIl[2] + GuiIngame.lIIIIIlIlIIlIl[1], lllllllllllllIlIIlllIlIllIllIIII)) {
                        this.drawTexturedModalRect(lllllllllllllIlIIlllIlIllIlIllIl, lllllllllllllIlIIlllIlIllIllIIlI, GuiIngame.lIIIIIlIlIIlIl[53], GuiIngame.lIIIIIlIlIIlIl[26], GuiIngame.lIIIIIlIlIIlIl[26], GuiIngame.lIIIIIlIlIIlIl[26]);
                    }
                    if (lIllIllIIIllIlI(lllllllllllllIlIIlllIlIllIlIlllI * GuiIngame.lIIIIIlIlIIlIl[2] + GuiIngame.lIIIIIlIlIIlIl[1], lllllllllllllIlIIlllIlIllIllIIII)) {
                        this.drawTexturedModalRect(lllllllllllllIlIIlllIlIllIlIllIl, lllllllllllllIlIIlllIlIllIllIIlI, GuiIngame.lIIIIIlIlIIlIl[54], GuiIngame.lIIIIIlIlIIlIl[26], GuiIngame.lIIIIIlIlIIlIl[26], GuiIngame.lIIIIIlIlIIlIl[26]);
                    }
                    if (lIllIllIIIlIlII(lllllllllllllIlIIlllIlIllIlIlllI * GuiIngame.lIIIIIlIlIIlIl[2] + GuiIngame.lIIIIIlIlIIlIl[1], lllllllllllllIlIIlllIlIllIllIIII)) {
                        this.drawTexturedModalRect(lllllllllllllIlIIlllIlIllIlIllIl, lllllllllllllIlIIlllIlIllIllIIlI, GuiIngame.lIIIIIlIlIIlIl[14], GuiIngame.lIIIIIlIlIIlIl[26], GuiIngame.lIIIIIlIlIIlIl[26], GuiIngame.lIIIIIlIlIIlIl[26]);
                    }
                }
                ++lllllllllllllIlIIlllIlIllIlIlllI;
            }
            this.mc.mcProfiler.endStartSection(GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[55]]);
            int lllllllllllllIlIIlllIlIllIlIllII = MathHelper.ceiling_float_int((lllllllllllllIlIIlllIlIllIllIllI + lllllllllllllIlIIlllIlIllIllIlIl) / 2.0f) - GuiIngame.lIIIIIlIlIIlIl[1];
            "".length();
            if (((121 + 159 - 128 + 99 ^ 62 + 156 - 176 + 150) & (0xFC ^ 0xBB ^ (0xEA ^ 0x96) ^ -" ".length())) > ((0x57 ^ 0x50 ^ (0x2D ^ 0x3E)) & (0x58 ^ 0x73 ^ (0xBC ^ 0x83) ^ -" ".length()))) {
                return;
            }
            while (!lIllIllIIIlllll(lllllllllllllIlIIlllIlIllIlIllII)) {
                int lllllllllllllIlIIlllIlIllIlIlIll = GuiIngame.lIIIIIlIlIIlIl[14];
                if (lIllIllIIIIllll(lllllllllllllIlIIlllIlIlllIIIIlI.isPotionActive(Potion.poison) ? 1 : 0)) {
                    lllllllllllllIlIIlllIlIllIlIlIll += 36;
                    "".length();
                    if ((0xBF ^ 0xBB) == 0x0) {
                        return;
                    }
                }
                else if (lIllIllIIIIllll(lllllllllllllIlIIlllIlIlllIIIIlI.isPotionActive(Potion.wither) ? 1 : 0)) {
                    lllllllllllllIlIIlllIlIllIlIlIll += 72;
                }
                int lllllllllllllIlIIlllIlIllIlIlIlI = GuiIngame.lIIIIIlIlIIlIl[0];
                if (lIllIllIIIIllll(lllllllllllllIlIIlllIlIlllIIIIII ? 1 : 0)) {
                    lllllllllllllIlIIlllIlIllIlIlIlI = GuiIngame.lIIIIIlIlIIlIl[1];
                }
                final int lllllllllllllIlIIlllIlIllIlIlIIl = MathHelper.ceiling_float_int((lllllllllllllIlIIlllIlIllIlIllII + GuiIngame.lIIIIIlIlIIlIl[1]) / 10.0f) - GuiIngame.lIIIIIlIlIIlIl[1];
                final int lllllllllllllIlIIlllIlIllIlIlIII = lllllllllllllIlIIlllIlIllIlllIIl + lllllllllllllIlIIlllIlIllIlIllII % GuiIngame.lIIIIIlIlIIlIl[6] * GuiIngame.lIIIIIlIlIIlIl[20];
                int lllllllllllllIlIIlllIlIllIlIIlll = lllllllllllllIlIIlllIlIllIllIlll - lllllllllllllIlIIlllIlIllIlIlIIl * lllllllllllllIlIIlllIlIllIllIIll;
                if (lIllIllIIIlIlIl(lllllllllllllIlIIlllIlIlllIIIIIl, GuiIngame.lIIIIIlIlIIlIl[4])) {
                    lllllllllllllIlIIlllIlIllIlIIlll += this.rand.nextInt(GuiIngame.lIIIIIlIlIIlIl[2]);
                }
                if (lIllIllIIIllIlI(lllllllllllllIlIIlllIlIllIlIllII, lllllllllllllIlIIlllIlIllIlIllll)) {
                    lllllllllllllIlIIlllIlIllIlIIlll -= 2;
                }
                int lllllllllllllIlIIlllIlIllIlIIllI = GuiIngame.lIIIIIlIlIIlIl[0];
                if (lIllIllIIIIllll(lllllllllllllIlIIlllIlIlllIIIIlI.worldObj.getWorldInfo().isHardcoreModeEnabled() ? 1 : 0)) {
                    lllllllllllllIlIIlllIlIllIlIIllI = GuiIngame.lIIIIIlIlIIlIl[5];
                }
                this.drawTexturedModalRect(lllllllllllllIlIIlllIlIllIlIlIII, lllllllllllllIlIIlllIlIllIlIIlll, GuiIngame.lIIIIIlIlIIlIl[14] + lllllllllllllIlIIlllIlIllIlIlIlI * GuiIngame.lIIIIIlIlIIlIl[26], GuiIngame.lIIIIIlIlIIlIl[26] * lllllllllllllIlIIlllIlIllIlIIllI, GuiIngame.lIIIIIlIlIIlIl[26], GuiIngame.lIIIIIlIlIIlIl[26]);
                if (lIllIllIIIIllll(lllllllllllllIlIIlllIlIlllIIIIII ? 1 : 0)) {
                    if (lIllIllIIIllllI(lllllllllllllIlIIlllIlIllIlIllII * GuiIngame.lIIIIIlIlIIlIl[2] + GuiIngame.lIIIIIlIlIIlIl[1], lllllllllllllIlIIlllIlIllIllllll)) {
                        this.drawTexturedModalRect(lllllllllllllIlIIlllIlIllIlIlIII, lllllllllllllIlIIlllIlIllIlIIlll, lllllllllllllIlIIlllIlIllIlIlIll + GuiIngame.lIIIIIlIlIIlIl[56], GuiIngame.lIIIIIlIlIIlIl[26] * lllllllllllllIlIIlllIlIllIlIIllI, GuiIngame.lIIIIIlIlIIlIl[26], GuiIngame.lIIIIIlIlIIlIl[26]);
                    }
                    if (lIllIllIIIllIlI(lllllllllllllIlIIlllIlIllIlIllII * GuiIngame.lIIIIIlIlIIlIl[2] + GuiIngame.lIIIIIlIlIIlIl[1], lllllllllllllIlIIlllIlIllIllllll)) {
                        this.drawTexturedModalRect(lllllllllllllIlIIlllIlIllIlIlIII, lllllllllllllIlIIlllIlIllIlIIlll, lllllllllllllIlIIlllIlIllIlIlIll + GuiIngame.lIIIIIlIlIIlIl[57], GuiIngame.lIIIIIlIlIIlIl[26] * lllllllllllllIlIIlllIlIllIlIIllI, GuiIngame.lIIIIIlIlIIlIl[26], GuiIngame.lIIIIIlIlIIlIl[26]);
                    }
                }
                if (lIllIllIIIlIIll(lIllIllIIIlllII(lllllllllllllIlIIlllIlIllIllIIIl, 0.0f))) {
                    if (lIllIllIIIlIIII(lIllIllIIIlllII(lllllllllllllIlIIlllIlIllIllIIIl, lllllllllllllIlIIlllIlIllIllIlIl)) && lIllIllIIIlIIII(lIllIllIIIlllII(lllllllllllllIlIIlllIlIllIllIlIl % 2.0f, 1.0f))) {
                        this.drawTexturedModalRect(lllllllllllllIlIIlllIlIllIlIlIII, lllllllllllllIlIIlllIlIllIlIIlll, lllllllllllllIlIIlllIlIllIlIlIll + GuiIngame.lIIIIIlIlIIlIl[58], GuiIngame.lIIIIIlIlIIlIl[26] * lllllllllllllIlIIlllIlIllIlIIllI, GuiIngame.lIIIIIlIlIIlIl[26], GuiIngame.lIIIIIlIlIIlIl[26]);
                        "".length();
                        if ("   ".length() == 0) {
                            return;
                        }
                    }
                    else {
                        this.drawTexturedModalRect(lllllllllllllIlIIlllIlIllIlIlIII, lllllllllllllIlIIlllIlIllIlIIlll, lllllllllllllIlIIlllIlIllIlIlIll + GuiIngame.lIIIIIlIlIIlIl[59], GuiIngame.lIIIIIlIlIIlIl[26] * lllllllllllllIlIIlllIlIllIlIIllI, GuiIngame.lIIIIIlIlIIlIl[26], GuiIngame.lIIIIIlIlIIlIl[26]);
                    }
                    lllllllllllllIlIIlllIlIllIllIIIl -= 2.0f;
                    "".length();
                    if ("  ".length() >= (0x14 ^ 0x34 ^ (0x6C ^ 0x48))) {
                        return;
                    }
                }
                else {
                    if (lIllIllIIIllllI(lllllllllllllIlIIlllIlIllIlIllII * GuiIngame.lIIIIIlIlIIlIl[2] + GuiIngame.lIIIIIlIlIIlIl[1], lllllllllllllIlIIlllIlIlllIIIIIl)) {
                        this.drawTexturedModalRect(lllllllllllllIlIIlllIlIllIlIlIII, lllllllllllllIlIIlllIlIllIlIIlll, lllllllllllllIlIIlllIlIllIlIlIll + GuiIngame.lIIIIIlIlIIlIl[60], GuiIngame.lIIIIIlIlIIlIl[26] * lllllllllllllIlIIlllIlIllIlIIllI, GuiIngame.lIIIIIlIlIIlIl[26], GuiIngame.lIIIIIlIlIIlIl[26]);
                    }
                    if (lIllIllIIIllIlI(lllllllllllllIlIIlllIlIllIlIllII * GuiIngame.lIIIIIlIlIIlIl[2] + GuiIngame.lIIIIIlIlIIlIl[1], lllllllllllllIlIIlllIlIlllIIIIIl)) {
                        this.drawTexturedModalRect(lllllllllllllIlIIlllIlIllIlIlIII, lllllllllllllIlIIlllIlIllIlIIlll, lllllllllllllIlIIlllIlIllIlIlIll + GuiIngame.lIIIIIlIlIIlIl[61], GuiIngame.lIIIIIlIlIIlIl[26] * lllllllllllllIlIIlllIlIllIlIIllI, GuiIngame.lIIIIIlIlIIlIl[26], GuiIngame.lIIIIIlIlIIlIl[26]);
                    }
                }
                --lllllllllllllIlIIlllIlIllIlIllII;
            }
            final Entity lllllllllllllIlIIlllIlIllIlIIlIl = lllllllllllllIlIIlllIlIlllIIIIlI.ridingEntity;
            if (lIllIllIIIlIlll(lllllllllllllIlIIlllIlIllIlIIlIl)) {
                this.mc.mcProfiler.endStartSection(GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[28]]);
                int lllllllllllllIlIIlllIlIllIlIIlII = GuiIngame.lIIIIIlIlIIlIl[0];
                "".length();
                if (null != null) {
                    return;
                }
                while (!lIllIllIIIllIII(lllllllllllllIlIIlllIlIllIlIIlII, GuiIngame.lIIIIIlIlIIlIl[6])) {
                    int lllllllllllllIlIIlllIlIllIlIIIll = lllllllllllllIlIIlllIlIllIllIlll;
                    int lllllllllllllIlIIlllIlIllIlIIIlI = GuiIngame.lIIIIIlIlIIlIl[14];
                    int lllllllllllllIlIIlllIlIllIlIIIIl = GuiIngame.lIIIIIlIlIIlIl[0];
                    if (lIllIllIIIIllll(lllllllllllllIlIIlllIlIlllIIIIlI.isPotionActive(Potion.hunger) ? 1 : 0)) {
                        lllllllllllllIlIIlllIlIllIlIIIlI += 36;
                        lllllllllllllIlIIlllIlIllIlIIIIl = GuiIngame.lIIIIIlIlIIlIl[38];
                    }
                    if (lIllIllIIlIIIII(lIllIllIIIlllIl(lllllllllllllIlIIlllIlIlllIIIIlI.getFoodStats().getSaturationLevel(), 0.0f)) && lIllIllIIIlIIII(this.updateCounter % (lllllllllllllIlIIlllIlIllIllllII * GuiIngame.lIIIIIlIlIIlIl[3] + GuiIngame.lIIIIIlIlIIlIl[1]))) {
                        lllllllllllllIlIIlllIlIllIlIIIll = lllllllllllllIlIIlllIlIllIllIlll + (this.rand.nextInt(GuiIngame.lIIIIIlIlIIlIl[3]) - GuiIngame.lIIIIIlIlIIlIl[1]);
                    }
                    if (lIllIllIIIIllll(lllllllllllllIlIIlllIlIllIlllllI ? 1 : 0)) {
                        lllllllllllllIlIIlllIlIllIlIIIIl = GuiIngame.lIIIIIlIlIIlIl[1];
                    }
                    final int lllllllllllllIlIIlllIlIllIlIIIII = lllllllllllllIlIIlllIlIllIlllIII - lllllllllllllIlIIlllIlIllIlIIlII * GuiIngame.lIIIIIlIlIIlIl[20] - GuiIngame.lIIIIIlIlIIlIl[26];
                    this.drawTexturedModalRect(lllllllllllllIlIIlllIlIllIlIIIII, lllllllllllllIlIIlllIlIllIlIIIll, GuiIngame.lIIIIIlIlIIlIl[14] + lllllllllllllIlIIlllIlIllIlIIIIl * GuiIngame.lIIIIIlIlIIlIl[26], GuiIngame.lIIIIIlIlIIlIl[62], GuiIngame.lIIIIIlIlIIlIl[26], GuiIngame.lIIIIIlIlIIlIl[26]);
                    if (lIllIllIIIIllll(lllllllllllllIlIIlllIlIllIlllllI ? 1 : 0)) {
                        if (lIllIllIIIllllI(lllllllllllllIlIIlllIlIllIlIIlII * GuiIngame.lIIIIIlIlIIlIl[2] + GuiIngame.lIIIIIlIlIIlIl[1], lllllllllllllIlIIlllIlIllIlllIll)) {
                            this.drawTexturedModalRect(lllllllllllllIlIIlllIlIllIlIIIII, lllllllllllllIlIIlllIlIllIlIIIll, lllllllllllllIlIIlllIlIllIlIIIlI + GuiIngame.lIIIIIlIlIIlIl[56], GuiIngame.lIIIIIlIlIIlIl[62], GuiIngame.lIIIIIlIlIIlIl[26], GuiIngame.lIIIIIlIlIIlIl[26]);
                        }
                        if (lIllIllIIIllIlI(lllllllllllllIlIIlllIlIllIlIIlII * GuiIngame.lIIIIIlIlIIlIl[2] + GuiIngame.lIIIIIlIlIIlIl[1], lllllllllllllIlIIlllIlIllIlllIll)) {
                            this.drawTexturedModalRect(lllllllllllllIlIIlllIlIllIlIIIII, lllllllllllllIlIIlllIlIllIlIIIll, lllllllllllllIlIIlllIlIllIlIIIlI + GuiIngame.lIIIIIlIlIIlIl[57], GuiIngame.lIIIIIlIlIIlIl[62], GuiIngame.lIIIIIlIlIIlIl[26], GuiIngame.lIIIIIlIlIIlIl[26]);
                        }
                    }
                    if (lIllIllIIIllllI(lllllllllllllIlIIlllIlIllIlIIlII * GuiIngame.lIIIIIlIlIIlIl[2] + GuiIngame.lIIIIIlIlIIlIl[1], lllllllllllllIlIIlllIlIllIllllII)) {
                        this.drawTexturedModalRect(lllllllllllllIlIIlllIlIllIlIIIII, lllllllllllllIlIIlllIlIllIlIIIll, lllllllllllllIlIIlllIlIllIlIIIlI + GuiIngame.lIIIIIlIlIIlIl[60], GuiIngame.lIIIIIlIlIIlIl[62], GuiIngame.lIIIIIlIlIIlIl[26], GuiIngame.lIIIIIlIlIIlIl[26]);
                    }
                    if (lIllIllIIIllIlI(lllllllllllllIlIIlllIlIllIlIIlII * GuiIngame.lIIIIIlIlIIlIl[2] + GuiIngame.lIIIIIlIlIIlIl[1], lllllllllllllIlIIlllIlIllIllllII)) {
                        this.drawTexturedModalRect(lllllllllllllIlIIlllIlIllIlIIIII, lllllllllllllIlIIlllIlIllIlIIIll, lllllllllllllIlIIlllIlIllIlIIIlI + GuiIngame.lIIIIIlIlIIlIl[61], GuiIngame.lIIIIIlIlIIlIl[62], GuiIngame.lIIIIIlIlIIlIl[26], GuiIngame.lIIIIIlIlIIlIl[26]);
                    }
                    ++lllllllllllllIlIIlllIlIllIlIIlII;
                }
                "".length();
                if (((0x6A ^ 0x58) & ~(0xA2 ^ 0x90)) >= (0xA7 ^ 0xA3)) {
                    return;
                }
            }
            else if (lIllIllIIIIllll((lllllllllllllIlIIlllIlIllIlIIlIl instanceof EntityLivingBase) ? 1 : 0)) {
                this.mc.mcProfiler.endStartSection(GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[63]]);
                final EntityLivingBase lllllllllllllIlIIlllIlIllIIlllll = (EntityLivingBase)lllllllllllllIlIIlllIlIllIlIIlIl;
                final int lllllllllllllIlIIlllIlIllIIllllI = (int)Math.ceil(lllllllllllllIlIIlllIlIllIIlllll.getHealth());
                final float lllllllllllllIlIIlllIlIllIIlllIl = lllllllllllllIlIIlllIlIllIIlllll.getMaxHealth();
                int lllllllllllllIlIIlllIlIllIIlllII = (int)(lllllllllllllIlIIlllIlIllIIlllIl + 0.5f) / GuiIngame.lIIIIIlIlIIlIl[2];
                if (lIllIllIIIlIlII(lllllllllllllIlIIlllIlIllIIlllII, GuiIngame.lIIIIIlIlIIlIl[64])) {
                    lllllllllllllIlIIlllIlIllIIlllII = GuiIngame.lIIIIIlIlIIlIl[64];
                }
                int lllllllllllllIlIIlllIlIllIIllIll = lllllllllllllIlIIlllIlIllIllIlll;
                int lllllllllllllIlIIlllIlIllIIllIlI = GuiIngame.lIIIIIlIlIIlIl[0];
                "".length();
                if ((0x8E ^ 0xC3 ^ (0x24 ^ 0x6D)) <= " ".length()) {
                    return;
                }
                while (!lIllIllIIlIIIII(lllllllllllllIlIIlllIlIllIIlllII)) {
                    final int lllllllllllllIlIIlllIlIllIIllIIl = Math.min(lllllllllllllIlIIlllIlIllIIlllII, GuiIngame.lIIIIIlIlIIlIl[6]);
                    lllllllllllllIlIIlllIlIllIIlllII -= lllllllllllllIlIIlllIlIllIIllIIl;
                    int lllllllllllllIlIIlllIlIllIIllIII = GuiIngame.lIIIIIlIlIIlIl[0];
                    "".length();
                    if (" ".length() > "   ".length()) {
                        return;
                    }
                    while (!lIllIllIIIllIII(lllllllllllllIlIIlllIlIllIIllIII, lllllllllllllIlIIlllIlIllIIllIIl)) {
                        final int lllllllllllllIlIIlllIlIllIIlIlll = GuiIngame.lIIIIIlIlIIlIl[65];
                        int lllllllllllllIlIIlllIlIllIIlIllI = GuiIngame.lIIIIIlIlIIlIl[0];
                        if (lIllIllIIIIllll(lllllllllllllIlIIlllIlIllIlllllI ? 1 : 0)) {
                            lllllllllllllIlIIlllIlIllIIlIllI = GuiIngame.lIIIIIlIlIIlIl[1];
                        }
                        final int lllllllllllllIlIIlllIlIllIIlIlIl = lllllllllllllIlIIlllIlIllIlllIII - lllllllllllllIlIIlllIlIllIIllIII * GuiIngame.lIIIIIlIlIIlIl[20] - GuiIngame.lIIIIIlIlIIlIl[26];
                        this.drawTexturedModalRect(lllllllllllllIlIIlllIlIllIIlIlIl, lllllllllllllIlIIlllIlIllIIllIll, lllllllllllllIlIIlllIlIllIIlIlll + lllllllllllllIlIIlllIlIllIIlIllI * GuiIngame.lIIIIIlIlIIlIl[26], GuiIngame.lIIIIIlIlIIlIl[26], GuiIngame.lIIIIIlIlIIlIl[26], GuiIngame.lIIIIIlIlIIlIl[26]);
                        if (lIllIllIIIllllI(lllllllllllllIlIIlllIlIllIIllIII * GuiIngame.lIIIIIlIlIIlIl[2] + GuiIngame.lIIIIIlIlIIlIl[1] + lllllllllllllIlIIlllIlIllIIllIlI, lllllllllllllIlIIlllIlIllIIllllI)) {
                            this.drawTexturedModalRect(lllllllllllllIlIIlllIlIllIIlIlIl, lllllllllllllIlIIlllIlIllIIllIll, lllllllllllllIlIIlllIlIllIIlIlll + GuiIngame.lIIIIIlIlIIlIl[60], GuiIngame.lIIIIIlIlIIlIl[26], GuiIngame.lIIIIIlIlIIlIl[26], GuiIngame.lIIIIIlIlIIlIl[26]);
                        }
                        if (lIllIllIIIllIlI(lllllllllllllIlIIlllIlIllIIllIII * GuiIngame.lIIIIIlIlIIlIl[2] + GuiIngame.lIIIIIlIlIIlIl[1] + lllllllllllllIlIIlllIlIllIIllIlI, lllllllllllllIlIIlllIlIllIIllllI)) {
                            this.drawTexturedModalRect(lllllllllllllIlIIlllIlIllIIlIlIl, lllllllllllllIlIIlllIlIllIIllIll, lllllllllllllIlIIlllIlIllIIlIlll + GuiIngame.lIIIIIlIlIIlIl[61], GuiIngame.lIIIIIlIlIIlIl[26], GuiIngame.lIIIIIlIlIIlIl[26], GuiIngame.lIIIIIlIlIIlIl[26]);
                        }
                        ++lllllllllllllIlIIlllIlIllIIllIII;
                    }
                    lllllllllllllIlIIlllIlIllIIllIll -= 10;
                    lllllllllllllIlIIlllIlIllIIllIlI += 20;
                }
            }
            this.mc.mcProfiler.endStartSection(GuiIngame.lIIIIIlIIllIlI[GuiIngame.lIIIIIlIlIIlIl[17]]);
            if (lIllIllIIIIllll(lllllllllllllIlIIlllIlIlllIIIIlI.isInsideOfMaterial(Material.water) ? 1 : 0)) {
                final int lllllllllllllIlIIlllIlIllIIlIlII = this.mc.thePlayer.getAir();
                final int lllllllllllllIlIIlllIlIllIIlIIll = MathHelper.ceiling_double_int((lllllllllllllIlIIlllIlIllIIlIlII - GuiIngame.lIIIIIlIlIIlIl[2]) * 10.0 / 300.0);
                final int lllllllllllllIlIIlllIlIllIIlIIlI = MathHelper.ceiling_double_int(lllllllllllllIlIIlllIlIllIIlIlII * 10.0 / 300.0) - lllllllllllllIlIIlllIlIllIIlIIll;
                int lllllllllllllIlIIlllIlIllIIlIIIl = GuiIngame.lIIIIIlIlIIlIl[0];
                "".length();
                if ("   ".length() < ((0x6C ^ 0x2F) & ~(0x6C ^ 0x2F))) {
                    return;
                }
                while (!lIllIllIIIllIII(lllllllllllllIlIIlllIlIllIIlIIIl, lllllllllllllIlIIlllIlIllIIlIIll + lllllllllllllIlIIlllIlIllIIlIIlI)) {
                    if (lIllIllIIIllllI(lllllllllllllIlIIlllIlIllIIlIIIl, lllllllllllllIlIIlllIlIllIIlIIll)) {
                        this.drawTexturedModalRect(lllllllllllllIlIIlllIlIllIlllIII - lllllllllllllIlIIlllIlIllIIlIIIl * GuiIngame.lIIIIIlIlIIlIl[20] - GuiIngame.lIIIIIlIlIIlIl[26], lllllllllllllIlIIlllIlIllIllIIlI, GuiIngame.lIIIIIlIlIIlIl[14], GuiIngame.lIIIIIlIlIIlIl[45], GuiIngame.lIIIIIlIlIIlIl[26], GuiIngame.lIIIIIlIlIIlIl[26]);
                        "".length();
                        if ((0x64 ^ 0x61) <= 0) {
                            return;
                        }
                    }
                    else {
                        this.drawTexturedModalRect(lllllllllllllIlIIlllIlIllIlllIII - lllllllllllllIlIIlllIlIllIIlIIIl * GuiIngame.lIIIIIlIlIIlIl[20] - GuiIngame.lIIIIIlIlIIlIl[26], lllllllllllllIlIIlllIlIllIllIIlI, GuiIngame.lIIIIIlIlIIlIl[54], GuiIngame.lIIIIIlIlIIlIl[45], GuiIngame.lIIIIIlIlIIlIl[26], GuiIngame.lIIIIIlIlIIlIl[26]);
                    }
                    ++lllllllllllllIlIIlllIlIllIIlIIIl;
                }
            }
            this.mc.mcProfiler.endSection();
        }
    }
    
    private static int lIllIllIIIllIll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private void renderBossHealth() {
        if (lIllIllIIIlIIIl(BossStatus.bossName) && lIllIllIIIlIIll(BossStatus.statusBarTime)) {
            BossStatus.statusBarTime -= GuiIngame.lIIIIIlIlIIlIl[1];
            final FontRenderer lllllllllllllIlIIlllIlIlIllIIlII = this.mc.fontRendererObj;
            final ScaledResolution lllllllllllllIlIIlllIlIlIllIIIll = new ScaledResolution(this.mc);
            final int lllllllllllllIlIIlllIlIlIllIIIlI = lllllllllllllIlIIlllIlIlIllIIIll.getScaledWidth();
            final int lllllllllllllIlIIlllIlIlIllIIIIl = GuiIngame.lIIIIIlIlIIlIl[29];
            final int lllllllllllllIlIIlllIlIlIllIIIII = lllllllllllllIlIIlllIlIlIllIIIlI / GuiIngame.lIIIIIlIlIIlIl[2] - lllllllllllllIlIIlllIlIlIllIIIIl / GuiIngame.lIIIIIlIlIIlIl[2];
            final int lllllllllllllIlIIlllIlIlIlIlllll = (int)(BossStatus.healthScale * (lllllllllllllIlIIlllIlIlIllIIIIl + GuiIngame.lIIIIIlIlIIlIl[1]));
            final int lllllllllllllIlIIlllIlIlIlIllllI = GuiIngame.lIIIIIlIlIIlIl[35];
            this.drawTexturedModalRect(lllllllllllllIlIIlllIlIlIllIIIII, lllllllllllllIlIIlllIlIlIlIllllI, GuiIngame.lIIIIIlIlIIlIl[0], GuiIngame.lIIIIIlIlIIlIl[66], lllllllllllllIlIIlllIlIlIllIIIIl, GuiIngame.lIIIIIlIlIIlIl[5]);
            this.drawTexturedModalRect(lllllllllllllIlIIlllIlIlIllIIIII, lllllllllllllIlIIlllIlIlIlIllllI, GuiIngame.lIIIIIlIlIIlIl[0], GuiIngame.lIIIIIlIlIIlIl[66], lllllllllllllIlIIlllIlIlIllIIIIl, GuiIngame.lIIIIIlIlIIlIl[5]);
            if (lIllIllIIIlIIll(lllllllllllllIlIIlllIlIlIlIlllll)) {
                this.drawTexturedModalRect(lllllllllllllIlIIlllIlIlIllIIIII, lllllllllllllIlIIlllIlIlIlIllllI, GuiIngame.lIIIIIlIlIIlIl[0], GuiIngame.lIIIIIlIlIIlIl[67], lllllllllllllIlIIlllIlIlIlIlllll, GuiIngame.lIIIIIlIlIIlIl[5]);
            }
            final String lllllllllllllIlIIlllIlIlIlIlllIl = BossStatus.bossName;
            this.getFontRenderer().drawStringWithShadow(lllllllllllllIlIIlllIlIlIlIlllIl, (float)(lllllllllllllIlIIlllIlIlIllIIIlI / GuiIngame.lIIIIIlIlIIlIl[2] - this.getFontRenderer().getStringWidth(lllllllllllllIlIIlllIlIlIlIlllIl) / GuiIngame.lIIIIIlIlIIlIl[2]), (float)(lllllllllllllIlIIlllIlIlIlIllllI - GuiIngame.lIIIIIlIlIIlIl[6]), GuiIngame.lIIIIIlIlIIlIl[23]);
            "".length();
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            this.mc.getTextureManager().bindTexture(GuiIngame.icons);
        }
    }
    
    private static int lIllIllIIlIIlII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean lIllIllIIIlIIII(final int lllllllllllllIlIIlllIlIIIllIIIII) {
        return lllllllllllllIlIIlllIlIIIllIIIII == 0;
    }
    
    public int getUpdateCounter() {
        return this.updateCounter;
    }
}
