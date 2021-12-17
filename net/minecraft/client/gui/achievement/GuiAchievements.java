// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui.achievement;

import java.util.Arrays;
import org.lwjgl.input.Mouse;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.gui.Gui;
import net.minecraft.stats.Achievement;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import java.util.Random;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.MathHelper;
import net.minecraft.client.gui.GuiOptionButton;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C16PacketClientStatus;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.gui.GuiButton;
import java.io.IOException;
import net.minecraft.stats.AchievementList;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.stats.StatFileWriter;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.gui.IProgressMeter;
import net.minecraft.client.gui.GuiScreen;

public class GuiAchievements extends GuiScreen implements IProgressMeter
{
    private /* synthetic */ int field_146554_D;
    protected /* synthetic */ int field_146564_i;
    protected /* synthetic */ double field_146565_w;
    protected /* synthetic */ GuiScreen parentScreen;
    protected /* synthetic */ double field_146566_v;
    protected /* synthetic */ int field_146555_f;
    protected /* synthetic */ double field_146573_x;
    protected /* synthetic */ float field_146570_r;
    private static final /* synthetic */ int field_146572_y;
    private static final /* synthetic */ int field_146559_A;
    protected /* synthetic */ int field_146563_h;
    protected /* synthetic */ int field_146557_g;
    private static final /* synthetic */ int[] lIlllIIlllIlIl;
    private static final /* synthetic */ ResourceLocation ACHIEVEMENT_BACKGROUND;
    protected /* synthetic */ double field_146569_s;
    private /* synthetic */ StatFileWriter statFileWriter;
    private static final /* synthetic */ int field_146571_z;
    private static final /* synthetic */ int field_146560_B;
    protected /* synthetic */ double field_146568_t;
    private static final /* synthetic */ String[] lIlllIIlllIlII;
    protected /* synthetic */ double field_146567_u;
    private /* synthetic */ boolean loadingAchievements;
    
    private static String lIIIIIlIIIllIIIl(final String llllllllllllIlllllIIlIIllllIlIIl, final String llllllllllllIlllllIIlIIllllIIllI) {
        try {
            final SecretKeySpec llllllllllllIlllllIIlIIllllIllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIIlIIllllIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllllIIlIIllllIlIll = Cipher.getInstance("Blowfish");
            llllllllllllIlllllIIlIIllllIlIll.init(GuiAchievements.lIlllIIlllIlIl[8], llllllllllllIlllllIIlIIllllIllII);
            return new String(llllllllllllIlllllIIlIIllllIlIll.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIIlIIllllIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllIIlIIllllIlIlI) {
            llllllllllllIlllllIIlIIllllIlIlI.printStackTrace();
            return null;
        }
    }
    
    public GuiAchievements(final GuiScreen llllllllllllIlllllIIlIlIlllIllll, final StatFileWriter llllllllllllIlllllIIlIlIlllIlllI) {
        this.field_146555_f = GuiAchievements.lIlllIIlllIlIl[4];
        this.field_146557_g = GuiAchievements.lIlllIIlllIlIl[5];
        this.field_146570_r = 1.0f;
        this.loadingAchievements = (GuiAchievements.lIlllIIlllIlIl[6] != 0);
        this.parentScreen = llllllllllllIlllllIIlIlIlllIllll;
        this.statFileWriter = llllllllllllIlllllIIlIlIlllIlllI;
        final int llllllllllllIlllllIIlIlIllllIIlI = GuiAchievements.lIlllIIlllIlIl[7];
        final int llllllllllllIlllllIIlIlIllllIIIl = GuiAchievements.lIlllIIlllIlIl[7];
        final double field_146569_s = AchievementList.openInventory.displayColumn * GuiAchievements.lIlllIIlllIlIl[0] - llllllllllllIlllllIIlIlIllllIIlI / GuiAchievements.lIlllIIlllIlIl[8] - GuiAchievements.lIlllIIlllIlIl[9];
        this.field_146565_w = field_146569_s;
        this.field_146567_u = field_146569_s;
        this.field_146569_s = field_146569_s;
        final double field_146568_t = AchievementList.openInventory.displayRow * GuiAchievements.lIlllIIlllIlIl[0] - llllllllllllIlllllIIlIlIllllIIIl / GuiAchievements.lIlllIIlllIlIl[8];
        this.field_146573_x = field_146568_t;
        this.field_146566_v = field_146568_t;
        this.field_146568_t = field_146568_t;
    }
    
    private static int lIIIIIlIIIlllIII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    @Override
    protected void keyTyped(final char llllllllllllIlllllIIlIlIllIllllI, final int llllllllllllIlllllIIlIlIllIlllIl) throws IOException {
        if (lIIIIIlIIIllIllI(llllllllllllIlllllIIlIlIllIlllIl, this.mc.gameSettings.keyBindInventory.getKeyCode())) {
            this.mc.displayGuiScreen(null);
            this.mc.setIngameFocus();
            "".length();
            if ("   ".length() == ((194 + 102 - 111 + 10 ^ 130 + 44 - 89 + 111) & (0x79 ^ 0x3E ^ (0xE ^ 0x4E) ^ -" ".length()))) {
                return;
            }
        }
        else {
            super.keyTyped(llllllllllllIlllllIIlIlIllIllllI, llllllllllllIlllllIIlIlIllIlllIl);
        }
    }
    
    private static int lIIIIIlIIlIIIIlI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lIIIIIlIIIlllIlI(final int llllllllllllIlllllIIlIIlllIIllII) {
        return llllllllllllIlllllIIlIIlllIIllII != 0;
    }
    
    private static boolean lIIIIIlIIIllllII(final int llllllllllllIlllllIIlIIlllIllIIl, final int llllllllllllIlllllIIlIIlllIllIII) {
        return llllllllllllIlllllIIlIIlllIllIIl < llllllllllllIlllllIIlIIlllIllIII;
    }
    
    private static boolean lIIIIIlIIlIIIlIl(final int llllllllllllIlllllIIlIIlllIlIIIl, final int llllllllllllIlllllIIlIIlllIlIIII) {
        return llllllllllllIlllllIIlIIlllIlIIIl > llllllllllllIlllllIIlIIlllIlIIII;
    }
    
    @Override
    protected void actionPerformed(final GuiButton llllllllllllIlllllIIlIlIlllIIIll) throws IOException {
        if (lIIIIIlIIIllIlIl(this.loadingAchievements ? 1 : 0) && lIIIIIlIIIllIllI(llllllllllllIlllllIIlIlIlllIIIll.id, GuiAchievements.lIlllIIlllIlIl[6])) {
            this.mc.displayGuiScreen(this.parentScreen);
        }
    }
    
    private static boolean lIIIIIlIIlIIIlII(final int llllllllllllIlllllIIlIIllIllllll, final int llllllllllllIlllllIIlIIllIlllllI) {
        return llllllllllllIlllllIIlIIllIllllll != llllllllllllIlllllIIlIIllIlllllI;
    }
    
    private static boolean lIIIIIlIIIllllll(final int llllllllllllIlllllIIlIIlllIIlIII) {
        return llllllllllllIlllllIIlIIlllIIlIII >= 0;
    }
    
    @Override
    public void updateScreen() {
        if (lIIIIIlIIIllIlIl(this.loadingAchievements ? 1 : 0)) {
            this.field_146569_s = this.field_146567_u;
            this.field_146568_t = this.field_146566_v;
            final double llllllllllllIlllllIIlIlIlIlIllIl = this.field_146565_w - this.field_146567_u;
            final double llllllllllllIlllllIIlIlIlIlIllII = this.field_146573_x - this.field_146566_v;
            if (lIIIIIlIIIllllIl(lIIIIIlIIlIIIIII(llllllllllllIlllllIIlIlIlIlIllIl * llllllllllllIlllllIIlIlIlIlIllIl + llllllllllllIlllllIIlIlIlIlIllII * llllllllllllIlllllIIlIlIlIlIllII, 4.0))) {
                this.field_146567_u += llllllllllllIlllllIIlIlIlIlIllIl;
                this.field_146566_v += llllllllllllIlllllIIlIlIlIlIllII;
                "".length();
                if (" ".length() >= (0x3F ^ 0x3B)) {
                    return;
                }
            }
            else {
                this.field_146567_u += llllllllllllIlllllIIlIlIlIlIllIl * 0.85;
                this.field_146566_v += llllllllllllIlllllIIlIlIlIlIllII * 0.85;
            }
        }
    }
    
    @Override
    public boolean doesGuiPauseGame() {
        int n;
        if (lIIIIIlIIIlllIlI(this.loadingAchievements ? 1 : 0)) {
            n = GuiAchievements.lIlllIIlllIlIl[3];
            "".length();
            if (((0x7D ^ 0x63) & ~(0xE ^ 0x10)) < -" ".length()) {
                return ((0x20 ^ 0x8) & ~(0x1E ^ 0x36)) != 0x0;
            }
        }
        else {
            n = GuiAchievements.lIlllIIlllIlIl[6];
        }
        return n != 0;
    }
    
    private static int lIIIIIlIIIllIlll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    protected void drawTitle() {
        final int llllllllllllIlllllIIlIlIlIlIIlII = (this.width - this.field_146555_f) / GuiAchievements.lIlllIIlllIlIl[8];
        final int llllllllllllIlllllIIlIlIlIlIIIll = (this.height - this.field_146557_g) / GuiAchievements.lIlllIIlllIlIl[8];
        this.fontRendererObj.drawString(I18n.format(GuiAchievements.lIlllIIlllIlII[GuiAchievements.lIlllIIlllIlIl[18]], new Object[GuiAchievements.lIlllIIlllIlIl[3]]), llllllllllllIlllllIIlIlIlIlIIlII + GuiAchievements.lIlllIIlllIlIl[19], llllllllllllIlllllIIlIlIlIlIIIll + GuiAchievements.lIlllIIlllIlIl[20], GuiAchievements.lIlllIIlllIlIl[21]);
        "".length();
    }
    
    private static boolean lIIIIIlIIIlllIll(final int llllllllllllIlllllIIlIIlllIlllIl, final int llllllllllllIlllllIIlIIlllIlllII) {
        return llllllllllllIlllllIIlIIlllIlllIl >= llllllllllllIlllllIIlIIlllIlllII;
    }
    
    private static int lIIIIIlIIlIIIIII(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean lIIIIIlIIlIIIlll(final int llllllllllllIlllllIIlIIlllIIIlII) {
        return llllllllllllIlllllIIlIIlllIIIlII <= 0;
    }
    
    @Override
    public void initGui() {
        this.mc.getNetHandler().addToSendQueue(new C16PacketClientStatus(C16PacketClientStatus.EnumState.REQUEST_STATS));
        this.buttonList.clear();
        this.buttonList.add(new GuiOptionButton(GuiAchievements.lIlllIIlllIlIl[6], this.width / GuiAchievements.lIlllIIlllIlIl[8] + GuiAchievements.lIlllIIlllIlIl[0], this.height / GuiAchievements.lIlllIIlllIlIl[8] + GuiAchievements.lIlllIIlllIlIl[10], GuiAchievements.lIlllIIlllIlIl[11], GuiAchievements.lIlllIIlllIlIl[12], I18n.format(GuiAchievements.lIlllIIlllIlII[GuiAchievements.lIlllIIlllIlIl[6]], new Object[GuiAchievements.lIlllIIlllIlIl[3]])));
        "".length();
    }
    
    private static boolean lIIIIIlIIIllllIl(final int llllllllllllIlllllIIlIIlllIIIllI) {
        return llllllllllllIlllllIIlIIlllIIIllI < 0;
    }
    
    private static boolean lIIIIIlIIIlllllI(final int llllllllllllIlllllIIlIIlllIIIIlI) {
        return llllllllllllIlllllIIlIIlllIIIIlI > 0;
    }
    
    @Override
    public void doneLoading() {
        if (lIIIIIlIIIlllIlI(this.loadingAchievements ? 1 : 0)) {
            this.loadingAchievements = (GuiAchievements.lIlllIIlllIlIl[3] != 0);
        }
    }
    
    private static boolean lIIIIIlIIlIIIIll(final int llllllllllllIlllllIIlIIlllIlIlIl, final int llllllllllllIlllllIIlIIlllIlIlII) {
        return llllllllllllIlllllIIlIIlllIlIlIl <= llllllllllllIlllllIIlIIlllIlIlII;
    }
    
    protected void drawAchievementScreen(final int llllllllllllIlllllIIlIlIIlllllIl, final int llllllllllllIlllllIIlIlIIIlllIll, final float llllllllllllIlllllIIlIlIIIlllIlI) {
        int llllllllllllIlllllIIlIlIIllllIlI = MathHelper.floor_double(this.field_146569_s + (this.field_146567_u - this.field_146569_s) * llllllllllllIlllllIIlIlIIIlllIlI);
        int llllllllllllIlllllIIlIlIIllllIIl = MathHelper.floor_double(this.field_146568_t + (this.field_146566_v - this.field_146568_t) * llllllllllllIlllllIIlIlIIIlllIlI);
        if (lIIIIIlIIIllllII(llllllllllllIlllllIIlIlIIllllIlI, GuiAchievements.field_146572_y)) {
            llllllllllllIlllllIIlIlIIllllIlI = GuiAchievements.field_146572_y;
        }
        if (lIIIIIlIIIllllII(llllllllllllIlllllIIlIlIIllllIIl, GuiAchievements.field_146571_z)) {
            llllllllllllIlllllIIlIlIIllllIIl = GuiAchievements.field_146571_z;
        }
        if (lIIIIIlIIIlllIll(llllllllllllIlllllIIlIlIIllllIlI, GuiAchievements.field_146559_A)) {
            llllllllllllIlllllIIlIlIIllllIlI = GuiAchievements.field_146559_A - GuiAchievements.lIlllIIlllIlIl[6];
        }
        if (lIIIIIlIIIlllIll(llllllllllllIlllllIIlIlIIllllIIl, GuiAchievements.field_146560_B)) {
            llllllllllllIlllllIIlIlIIllllIIl = GuiAchievements.field_146560_B - GuiAchievements.lIlllIIlllIlIl[6];
        }
        final int llllllllllllIlllllIIlIlIIllllIII = (this.width - this.field_146555_f) / GuiAchievements.lIlllIIlllIlIl[8];
        final int llllllllllllIlllllIIlIlIIlllIlll = (this.height - this.field_146557_g) / GuiAchievements.lIlllIIlllIlIl[8];
        final int llllllllllllIlllllIIlIlIIlllIllI = llllllllllllIlllllIIlIlIIllllIII + GuiAchievements.lIlllIIlllIlIl[22];
        final int llllllllllllIlllllIIlIlIIlllIlIl = llllllllllllIlllllIIlIlIIlllIlll + GuiAchievements.lIlllIIlllIlIl[15];
        this.zLevel = 0.0f;
        GlStateManager.depthFunc(GuiAchievements.lIlllIIlllIlIl[23]);
        GlStateManager.pushMatrix();
        GlStateManager.translate((float)llllllllllllIlllllIIlIlIIlllIllI, (float)llllllllllllIlllllIIlIlIIlllIlIl, -200.0f);
        GlStateManager.scale(1.0f / this.field_146570_r, 1.0f / this.field_146570_r, 0.0f);
        GlStateManager.enableTexture2D();
        GlStateManager.disableLighting();
        GlStateManager.enableRescaleNormal();
        GlStateManager.enableColorMaterial();
        final int llllllllllllIlllllIIlIlIIlllIlII = llllllllllllIlllllIIlIlIIllllIlI + GuiAchievements.lIlllIIlllIlIl[24] >> GuiAchievements.lIlllIIlllIlIl[25];
        final int llllllllllllIlllllIIlIlIIlllIIll = llllllllllllIlllllIIlIlIIllllIIl + GuiAchievements.lIlllIIlllIlIl[24] >> GuiAchievements.lIlllIIlllIlIl[25];
        final int llllllllllllIlllllIIlIlIIlllIIlI = (llllllllllllIlllllIIlIlIIllllIlI + GuiAchievements.lIlllIIlllIlIl[24]) % GuiAchievements.lIlllIIlllIlIl[22];
        final int llllllllllllIlllllIIlIlIIlllIIIl = (llllllllllllIlllllIIlIlIIllllIIl + GuiAchievements.lIlllIIlllIlIl[24]) % GuiAchievements.lIlllIIlllIlIl[22];
        final int llllllllllllIlllllIIlIlIIlllIIII = GuiAchievements.lIlllIIlllIlIl[25];
        final int llllllllllllIlllllIIlIlIIllIllll = GuiAchievements.lIlllIIlllIlIl[14];
        final int llllllllllllIlllllIIlIlIIllIlllI = GuiAchievements.lIlllIIlllIlIl[26];
        final int llllllllllllIlllllIIlIlIIllIllIl = GuiAchievements.lIlllIIlllIlIl[27];
        final int llllllllllllIlllllIIlIlIIllIllII = GuiAchievements.lIlllIIlllIlIl[28];
        final Random llllllllllllIlllllIIlIlIIllIlIll = new Random();
        final float llllllllllllIlllllIIlIlIIllIlIlI = 16.0f / this.field_146570_r;
        final float llllllllllllIlllllIIlIlIIllIlIIl = 16.0f / this.field_146570_r;
        int llllllllllllIlllllIIlIlIIllIlIII = GuiAchievements.lIlllIIlllIlIl[3];
        "".length();
        if ("  ".length() <= 0) {
            return;
        }
        while (!lIIIIIlIIIllllll(lIIIIIlIIlIIIIIl(llllllllllllIlllllIIlIlIIllIlIII * llllllllllllIlllllIIlIlIIllIlIlI - llllllllllllIlllllIIlIlIIlllIIIl, 155.0f))) {
            final float llllllllllllIlllllIIlIlIIllIIlll = 0.6f - (llllllllllllIlllllIIlIlIIlllIIll + llllllllllllIlllllIIlIlIIllIlIII) / 25.0f * 0.3f;
            GlStateManager.color(llllllllllllIlllllIIlIlIIllIIlll, llllllllllllIlllllIIlIlIIllIIlll, llllllllllllIlllllIIlIlIIllIIlll, 1.0f);
            int llllllllllllIlllllIIlIlIIllIIllI = GuiAchievements.lIlllIIlllIlIl[3];
            "".length();
            if (null != null) {
                return;
            }
            while (!lIIIIIlIIIllllll(lIIIIIlIIlIIIIIl(llllllllllllIlllllIIlIlIIllIIllI * llllllllllllIlllllIIlIlIIllIlIIl - llllllllllllIlllllIIlIlIIlllIIlI, 224.0f))) {
                llllllllllllIlllllIIlIlIIllIlIll.setSeed(this.mc.getSession().getPlayerID().hashCode() + llllllllllllIlllllIIlIlIIlllIlII + llllllllllllIlllllIIlIlIIllIIllI + (llllllllllllIlllllIIlIlIIlllIIll + llllllllllllIlllllIIlIlIIllIlIII) * GuiAchievements.lIlllIIlllIlIl[22]);
                final int llllllllllllIlllllIIlIlIIllIIlIl = llllllllllllIlllllIIlIlIIllIlIll.nextInt(GuiAchievements.lIlllIIlllIlIl[6] + llllllllllllIlllllIIlIlIIlllIIll + llllllllllllIlllllIIlIlIIllIlIII) + (llllllllllllIlllllIIlIlIIlllIIll + llllllllllllIlllllIIlIlIIllIlIII) / GuiAchievements.lIlllIIlllIlIl[8];
                TextureAtlasSprite llllllllllllIlllllIIlIlIIllIIlII = this.func_175371_a(Blocks.sand);
                if (lIIIIIlIIlIIIIll(llllllllllllIlllllIIlIlIIllIIlIl, GuiAchievements.lIlllIIlllIlIl[28]) && lIIIIIlIIlIIIlII(llllllllllllIlllllIIlIlIIlllIIll + llllllllllllIlllllIIlIlIIllIlIII, GuiAchievements.lIlllIIlllIlIl[29])) {
                    if (lIIIIIlIIIllIllI(llllllllllllIlllllIIlIlIIllIIlIl, GuiAchievements.lIlllIIlllIlIl[27])) {
                        if (lIIIIIlIIIllIlIl(llllllllllllIlllllIIlIlIIllIlIll.nextInt(GuiAchievements.lIlllIIlllIlIl[8]))) {
                            llllllllllllIlllllIIlIlIIllIIlII = this.func_175371_a(Blocks.diamond_ore);
                            "".length();
                            if (null != null) {
                                return;
                            }
                        }
                        else {
                            llllllllllllIlllllIIlIlIIllIIlII = this.func_175371_a(Blocks.redstone_ore);
                            "".length();
                            if ("   ".length() < " ".length()) {
                                return;
                            }
                        }
                    }
                    else if (lIIIIIlIIIllIllI(llllllllllllIlllllIIlIlIIllIIlIl, GuiAchievements.lIlllIIlllIlIl[26])) {
                        llllllllllllIlllllIIlIlIIllIIlII = this.func_175371_a(Blocks.iron_ore);
                        "".length();
                        if (-" ".length() >= " ".length()) {
                            return;
                        }
                    }
                    else if (lIIIIIlIIIllIllI(llllllllllllIlllllIIlIlIIllIIlIl, GuiAchievements.lIlllIIlllIlIl[14])) {
                        llllllllllllIlllllIIlIlIIllIIlII = this.func_175371_a(Blocks.coal_ore);
                        "".length();
                        if (((0x8D ^ 0xBC) & ~(0x1B ^ 0x2A)) > "   ".length()) {
                            return;
                        }
                    }
                    else if (lIIIIIlIIlIIIlIl(llllllllllllIlllllIIlIlIIllIIlIl, GuiAchievements.lIlllIIlllIlIl[25])) {
                        llllllllllllIlllllIIlIlIIllIIlII = this.func_175371_a(Blocks.stone);
                        "".length();
                        if ((0x2E ^ 0x2B) == 0x0) {
                            return;
                        }
                    }
                    else if (lIIIIIlIIIlllllI(llllllllllllIlllllIIlIlIIllIIlIl)) {
                        llllllllllllIlllllIIlIlIIllIIlII = this.func_175371_a(Blocks.dirt);
                        "".length();
                        if (-" ".length() > ((0x62 ^ 0x30) & ~(0x67 ^ 0x35))) {
                            return;
                        }
                    }
                }
                else {
                    final Block llllllllllllIlllllIIlIlIIllIIIll = Blocks.bedrock;
                    llllllllllllIlllllIIlIlIIllIIlII = this.func_175371_a(llllllllllllIlllllIIlIlIIllIIIll);
                }
                this.mc.getTextureManager().bindTexture(TextureMap.locationBlocksTexture);
                this.drawTexturedModalRect(llllllllllllIlllllIIlIlIIllIIllI * GuiAchievements.lIlllIIlllIlIl[22] - llllllllllllIlllllIIlIlIIlllIIlI, llllllllllllIlllllIIlIlIIllIlIII * GuiAchievements.lIlllIIlllIlIl[22] - llllllllllllIlllllIIlIlIIlllIIIl, llllllllllllIlllllIIlIlIIllIIlII, GuiAchievements.lIlllIIlllIlIl[22], GuiAchievements.lIlllIIlllIlIl[22]);
                ++llllllllllllIlllllIIlIlIIllIIllI;
            }
            ++llllllllllllIlllllIIlIlIIllIlIII;
        }
        GlStateManager.enableDepth();
        GlStateManager.depthFunc(GuiAchievements.lIlllIIlllIlIl[30]);
        this.mc.getTextureManager().bindTexture(GuiAchievements.ACHIEVEMENT_BACKGROUND);
        int llllllllllllIlllllIIlIlIIllIIIlI = GuiAchievements.lIlllIIlllIlIl[3];
        "".length();
        if (-" ".length() >= ((0x5D ^ 0x17) & ~(0xE0 ^ 0xAA))) {
            return;
        }
        while (!lIIIIIlIIIlllIll(llllllllllllIlllllIIlIlIIllIIIlI, AchievementList.achievementList.size())) {
            final Achievement llllllllllllIlllllIIlIlIIllIIIIl = AchievementList.achievementList.get(llllllllllllIlllllIIlIlIIllIIIlI);
            if (lIIIIIlIIlIIIllI(llllllllllllIlllllIIlIlIIllIIIIl.parentAchievement)) {
                final int llllllllllllIlllllIIlIlIIllIIIII = llllllllllllIlllllIIlIlIIllIIIIl.displayColumn * GuiAchievements.lIlllIIlllIlIl[0] - llllllllllllIlllllIIlIlIIllllIlI + GuiAchievements.lIlllIIlllIlIl[31];
                final int llllllllllllIlllllIIlIlIIlIlllll = llllllllllllIlllllIIlIlIIllIIIIl.displayRow * GuiAchievements.lIlllIIlllIlIl[0] - llllllllllllIlllllIIlIlIIllllIIl + GuiAchievements.lIlllIIlllIlIl[31];
                final int llllllllllllIlllllIIlIlIIlIllllI = llllllllllllIlllllIIlIlIIllIIIIl.parentAchievement.displayColumn * GuiAchievements.lIlllIIlllIlIl[0] - llllllllllllIlllllIIlIlIIllllIlI + GuiAchievements.lIlllIIlllIlIl[31];
                final int llllllllllllIlllllIIlIlIIlIlllIl = llllllllllllIlllllIIlIlIIllIIIIl.parentAchievement.displayRow * GuiAchievements.lIlllIIlllIlIl[0] - llllllllllllIlllllIIlIlIIllllIIl + GuiAchievements.lIlllIIlllIlIl[31];
                final boolean llllllllllllIlllllIIlIlIIlIlllII = this.statFileWriter.hasAchievementUnlocked(llllllllllllIlllllIIlIlIIllIIIIl);
                final boolean llllllllllllIlllllIIlIlIIlIllIll = this.statFileWriter.canUnlockAchievement(llllllllllllIlllllIIlIlIIllIIIIl);
                final int llllllllllllIlllllIIlIlIIlIllIlI = this.statFileWriter.func_150874_c(llllllllllllIlllllIIlIlIIllIIIIl);
                if (lIIIIIlIIlIIIIll(llllllllllllIlllllIIlIlIIlIllIlI, GuiAchievements.lIlllIIlllIlIl[25])) {
                    int llllllllllllIlllllIIlIlIIlIllIIl = GuiAchievements.lIlllIIlllIlIl[32];
                    if (lIIIIIlIIIlllIlI(llllllllllllIlllllIIlIlIIlIlllII ? 1 : 0)) {
                        llllllllllllIlllllIIlIlIIlIllIIl = GuiAchievements.lIlllIIlllIlIl[33];
                        "".length();
                        if (((0x7B ^ 0x36) & ~(0xCC ^ 0x81)) < 0) {
                            return;
                        }
                    }
                    else if (lIIIIIlIIIlllIlI(llllllllllllIlllllIIlIlIIlIllIll ? 1 : 0)) {
                        llllllllllllIlllllIIlIlIIlIllIIl = GuiAchievements.lIlllIIlllIlIl[34];
                    }
                    Gui.drawHorizontalLine(llllllllllllIlllllIIlIlIIllIIIII, llllllllllllIlllllIIlIlIIlIllllI, llllllllllllIlllllIIlIlIIlIlllll, llllllllllllIlllllIIlIlIIlIllIIl);
                    Gui.drawVerticalLine(llllllllllllIlllllIIlIlIIlIllllI, llllllllllllIlllllIIlIlIIlIlllll, llllllllllllIlllllIIlIlIIlIlllIl, llllllllllllIlllllIIlIlIIlIllIIl);
                    if (lIIIIIlIIlIIIlIl(llllllllllllIlllllIIlIlIIllIIIII, llllllllllllIlllllIIlIlIIlIllllI)) {
                        this.drawTexturedModalRect(llllllllllllIlllllIIlIlIIllIIIII - GuiAchievements.lIlllIIlllIlIl[31] - GuiAchievements.lIlllIIlllIlIl[35], llllllllllllIlllllIIlIlIIlIlllll - GuiAchievements.lIlllIIlllIlIl[20], GuiAchievements.lIlllIIlllIlIl[36], GuiAchievements.lIlllIIlllIlIl[37], GuiAchievements.lIlllIIlllIlIl[35], GuiAchievements.lIlllIIlllIlIl[31]);
                        "".length();
                        if (" ".length() == ((0x2 ^ 0x1A) & ~(0x36 ^ 0x2E))) {
                            return;
                        }
                    }
                    else if (lIIIIIlIIIllllII(llllllllllllIlllllIIlIlIIllIIIII, llllllllllllIlllllIIlIlIIlIllllI)) {
                        this.drawTexturedModalRect(llllllllllllIlllllIIlIlIIllIIIII + GuiAchievements.lIlllIIlllIlIl[31], llllllllllllIlllllIIlIlIIlIlllll - GuiAchievements.lIlllIIlllIlIl[20], GuiAchievements.lIlllIIlllIlIl[38], GuiAchievements.lIlllIIlllIlIl[37], GuiAchievements.lIlllIIlllIlIl[35], GuiAchievements.lIlllIIlllIlIl[31]);
                        "".length();
                        if (-" ".length() >= (166 + 41 - 61 + 23 ^ 117 + 144 - 94 + 6)) {
                            return;
                        }
                    }
                    else if (lIIIIIlIIlIIIlIl(llllllllllllIlllllIIlIlIIlIlllll, llllllllllllIlllllIIlIlIIlIlllIl)) {
                        this.drawTexturedModalRect(llllllllllllIlllllIIlIlIIllIIIII - GuiAchievements.lIlllIIlllIlIl[20], llllllllllllIlllllIIlIlIIlIlllll - GuiAchievements.lIlllIIlllIlIl[31] - GuiAchievements.lIlllIIlllIlIl[35], GuiAchievements.lIlllIIlllIlIl[39], GuiAchievements.lIlllIIlllIlIl[37], GuiAchievements.lIlllIIlllIlIl[31], GuiAchievements.lIlllIIlllIlIl[35]);
                        "".length();
                        if ("  ".length() >= "   ".length()) {
                            return;
                        }
                    }
                    else if (lIIIIIlIIIllllII(llllllllllllIlllllIIlIlIIlIlllll, llllllllllllIlllllIIlIlIIlIlllIl)) {
                        this.drawTexturedModalRect(llllllllllllIlllllIIlIlIIllIIIII - GuiAchievements.lIlllIIlllIlIl[20], llllllllllllIlllllIIlIlIIlIlllll + GuiAchievements.lIlllIIlllIlIl[31], GuiAchievements.lIlllIIlllIlIl[39], GuiAchievements.lIlllIIlllIlIl[40], GuiAchievements.lIlllIIlllIlIl[31], GuiAchievements.lIlllIIlllIlIl[35]);
                    }
                }
            }
            ++llllllllllllIlllllIIlIlIIllIIIlI;
        }
        Achievement llllllllllllIlllllIIlIlIIlIllIII = null;
        final float llllllllllllIlllllIIlIlIIlIlIlll = (llllllllllllIlllllIIlIlIIlllllIl - llllllllllllIlllllIIlIlIIlllIllI) * this.field_146570_r;
        final float llllllllllllIlllllIIlIlIIlIlIllI = (llllllllllllIlllllIIlIlIIIlllIll - llllllllllllIlllllIIlIlIIlllIlIl) * this.field_146570_r;
        RenderHelper.enableGUIStandardItemLighting();
        GlStateManager.disableLighting();
        GlStateManager.enableRescaleNormal();
        GlStateManager.enableColorMaterial();
        int llllllllllllIlllllIIlIlIIlIlIlIl = GuiAchievements.lIlllIIlllIlIl[3];
        "".length();
        if (-"   ".length() >= 0) {
            return;
        }
        while (!lIIIIIlIIIlllIll(llllllllllllIlllllIIlIlIIlIlIlIl, AchievementList.achievementList.size())) {
            final Achievement llllllllllllIlllllIIlIlIIlIlIlII = AchievementList.achievementList.get(llllllllllllIlllllIIlIlIIlIlIlIl);
            final int llllllllllllIlllllIIlIlIIlIlIIll = llllllllllllIlllllIIlIlIIlIlIlII.displayColumn * GuiAchievements.lIlllIIlllIlIl[0] - llllllllllllIlllllIIlIlIIllllIlI;
            final int llllllllllllIlllllIIlIlIIlIlIIlI = llllllllllllIlllllIIlIlIIlIlIlII.displayRow * GuiAchievements.lIlllIIlllIlIl[0] - llllllllllllIlllllIIlIlIIllllIIl;
            Label_2403: {
                if (lIIIIIlIIIlllIll(llllllllllllIlllllIIlIlIIlIlIIll, GuiAchievements.lIlllIIlllIlIl[41]) && lIIIIIlIIIlllIll(llllllllllllIlllllIIlIlIIlIlIIlI, GuiAchievements.lIlllIIlllIlIl[41]) && lIIIIIlIIlIIIlll(lIIIIIlIIlIIIIIl((float)llllllllllllIlllllIIlIlIIlIlIIll, 224.0f * this.field_146570_r)) && lIIIIIlIIlIIIlll(lIIIIIlIIlIIIIIl((float)llllllllllllIlllllIIlIlIIlIlIIlI, 155.0f * this.field_146570_r))) {
                    final int llllllllllllIlllllIIlIlIIlIlIIIl = this.statFileWriter.func_150874_c(llllllllllllIlllllIIlIlIIlIlIlII);
                    if (lIIIIIlIIIlllIlI(this.statFileWriter.hasAchievementUnlocked(llllllllllllIlllllIIlIlIIlIlIlII) ? 1 : 0)) {
                        final float llllllllllllIlllllIIlIlIIlIlIIII = 0.75f;
                        GlStateManager.color(llllllllllllIlllllIIlIlIIlIlIIII, llllllllllllIlllllIIlIlIIlIlIIII, llllllllllllIlllllIIlIlIIlIlIIII, 1.0f);
                        "".length();
                        if ("   ".length() != "   ".length()) {
                            return;
                        }
                    }
                    else if (lIIIIIlIIIlllIlI(this.statFileWriter.canUnlockAchievement(llllllllllllIlllllIIlIlIIlIlIlII) ? 1 : 0)) {
                        final float llllllllllllIlllllIIlIlIIlIIllll = 1.0f;
                        GlStateManager.color(llllllllllllIlllllIIlIlIIlIIllll, llllllllllllIlllllIIlIlIIlIIllll, llllllllllllIlllllIIlIlIIlIIllll, 1.0f);
                        "".length();
                        if ((14 + 4 + 4 + 138 ^ 71 + 103 - 98 + 88) > (0x5C ^ 0x75 ^ (0x69 ^ 0x44))) {
                            return;
                        }
                    }
                    else if (lIIIIIlIIIllllII(llllllllllllIlllllIIlIlIIlIlIIIl, GuiAchievements.lIlllIIlllIlIl[18])) {
                        final float llllllllllllIlllllIIlIlIIlIIlllI = 0.3f;
                        GlStateManager.color(llllllllllllIlllllIIlIlIIlIIlllI, llllllllllllIlllllIIlIlIIlIIlllI, llllllllllllIlllllIIlIlIIlIIlllI, 1.0f);
                        "".length();
                        if (-"   ".length() >= 0) {
                            return;
                        }
                    }
                    else if (lIIIIIlIIIllIllI(llllllllllllIlllllIIlIlIIlIlIIIl, GuiAchievements.lIlllIIlllIlIl[18])) {
                        final float llllllllllllIlllllIIlIlIIlIIllIl = 0.2f;
                        GlStateManager.color(llllllllllllIlllllIIlIlIIlIIllIl, llllllllllllIlllllIIlIlIIlIIllIl, llllllllllllIlllllIIlIlIIlIIllIl, 1.0f);
                        "".length();
                        if ((0x7E ^ 0x7A) == "   ".length()) {
                            return;
                        }
                    }
                    else if (lIIIIIlIIlIIIlII(llllllllllllIlllllIIlIlIIlIlIIIl, GuiAchievements.lIlllIIlllIlIl[25])) {
                        "".length();
                        if ((0xF ^ 0x31 ^ (0x8C ^ 0xB6)) < (0x1B ^ 0x5C ^ (0xC6 ^ 0x85))) {
                            return;
                        }
                        break Label_2403;
                    }
                    else {
                        final float llllllllllllIlllllIIlIlIIlIIllII = 0.1f;
                        GlStateManager.color(llllllllllllIlllllIIlIlIIlIIllII, llllllllllllIlllllIIlIlIIlIIllII, llllllllllllIlllllIIlIlIIlIIllII, 1.0f);
                    }
                    this.mc.getTextureManager().bindTexture(GuiAchievements.ACHIEVEMENT_BACKGROUND);
                    if (lIIIIIlIIIlllIlI(llllllllllllIlllllIIlIlIIlIlIlII.getSpecial() ? 1 : 0)) {
                        this.drawTexturedModalRect(llllllllllllIlllllIIlIlIIlIlIIll - GuiAchievements.lIlllIIlllIlIl[8], llllllllllllIlllllIIlIlIIlIlIIlI - GuiAchievements.lIlllIIlllIlIl[8], GuiAchievements.lIlllIIlllIlIl[42], GuiAchievements.lIlllIIlllIlIl[5], GuiAchievements.lIlllIIlllIlIl[42], GuiAchievements.lIlllIIlllIlIl[42]);
                        "".length();
                        if (null != null) {
                            return;
                        }
                    }
                    else {
                        this.drawTexturedModalRect(llllllllllllIlllllIIlIlIIlIlIIll - GuiAchievements.lIlllIIlllIlIl[8], llllllllllllIlllllIIlIlIIlIlIIlI - GuiAchievements.lIlllIIlllIlIl[8], GuiAchievements.lIlllIIlllIlIl[3], GuiAchievements.lIlllIIlllIlIl[5], GuiAchievements.lIlllIIlllIlIl[42], GuiAchievements.lIlllIIlllIlIl[42]);
                    }
                    if (lIIIIIlIIIllIlIl(this.statFileWriter.canUnlockAchievement(llllllllllllIlllllIIlIlIIlIlIlII) ? 1 : 0)) {
                        final float llllllllllllIlllllIIlIlIIlIIlIll = 0.1f;
                        GlStateManager.color(llllllllllllIlllllIIlIlIIlIIlIll, llllllllllllIlllllIIlIlIIlIIlIll, llllllllllllIlllllIIlIlIIlIIlIll, 1.0f);
                        this.itemRender.func_175039_a((boolean)(GuiAchievements.lIlllIIlllIlIl[3] != 0));
                    }
                    GlStateManager.enableLighting();
                    GlStateManager.enableCull();
                    this.itemRender.renderItemAndEffectIntoGUI(llllllllllllIlllllIIlIlIIlIlIlII.theItemStack, llllllllllllIlllllIIlIlIIlIlIIll + GuiAchievements.lIlllIIlllIlIl[18], llllllllllllIlllllIIlIlIIlIlIIlI + GuiAchievements.lIlllIIlllIlIl[18]);
                    GlStateManager.blendFunc(GuiAchievements.lIlllIIlllIlIl[43], GuiAchievements.lIlllIIlllIlIl[44]);
                    GlStateManager.disableLighting();
                    if (lIIIIIlIIIllIlIl(this.statFileWriter.canUnlockAchievement(llllllllllllIlllllIIlIlIIlIlIlII) ? 1 : 0)) {
                        this.itemRender.func_175039_a((boolean)(GuiAchievements.lIlllIIlllIlIl[6] != 0));
                    }
                    GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
                    if (lIIIIIlIIIllllll(lIIIIIlIIlIIIIlI(llllllllllllIlllllIIlIlIIlIlIlll, (float)llllllllllllIlllllIIlIlIIlIlIIll)) && lIIIIIlIIlIIIlll(lIIIIIlIIlIIIIIl(llllllllllllIlllllIIlIlIIlIlIlll, (float)(llllllllllllIlllllIIlIlIIlIlIIll + GuiAchievements.lIlllIIlllIlIl[27]))) && lIIIIIlIIIllllll(lIIIIIlIIlIIIIlI(llllllllllllIlllllIIlIlIIlIlIllI, (float)llllllllllllIlllllIIlIlIIlIlIIlI)) && lIIIIIlIIlIIIlll(lIIIIIlIIlIIIIIl(llllllllllllIlllllIIlIlIIlIlIllI, (float)(llllllllllllIlllllIIlIlIIlIlIIlI + GuiAchievements.lIlllIIlllIlIl[27])))) {
                        llllllllllllIlllllIIlIlIIlIllIII = llllllllllllIlllllIIlIlIIlIlIlII;
                    }
                }
            }
            ++llllllllllllIlllllIIlIlIIlIlIlIl;
        }
        GlStateManager.disableDepth();
        GlStateManager.enableBlend();
        GlStateManager.popMatrix();
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.getTextureManager().bindTexture(GuiAchievements.ACHIEVEMENT_BACKGROUND);
        this.drawTexturedModalRect(llllllllllllIlllllIIlIlIIllllIII, llllllllllllIlllllIIlIlIIlllIlll, GuiAchievements.lIlllIIlllIlIl[3], GuiAchievements.lIlllIIlllIlIl[3], this.field_146555_f, this.field_146557_g);
        this.zLevel = 0.0f;
        GlStateManager.depthFunc(GuiAchievements.lIlllIIlllIlIl[30]);
        GlStateManager.disableDepth();
        GlStateManager.enableTexture2D();
        super.drawScreen(llllllllllllIlllllIIlIlIIlllllIl, llllllllllllIlllllIIlIlIIIlllIll, llllllllllllIlllllIIlIlIIIlllIlI);
        if (lIIIIIlIIlIIIllI(llllllllllllIlllllIIlIlIIlIllIII)) {
            String llllllllllllIlllllIIlIlIIlIIlIlI = llllllllllllIlllllIIlIlIIlIllIII.getStatName().getUnformattedText();
            final String llllllllllllIlllllIIlIlIIlIIlIIl = llllllllllllIlllllIIlIlIIlIllIII.getDescription();
            final int llllllllllllIlllllIIlIlIIlIIlIII = llllllllllllIlllllIIlIlIIlllllIl + GuiAchievements.lIlllIIlllIlIl[9];
            final int llllllllllllIlllllIIlIlIIlIIIlll = llllllllllllIlllllIIlIlIIIlllIll - GuiAchievements.lIlllIIlllIlIl[25];
            final int llllllllllllIlllllIIlIlIIlIIIllI = this.statFileWriter.func_150874_c(llllllllllllIlllllIIlIlIIlIllIII);
            if (lIIIIIlIIIlllIlI(this.statFileWriter.canUnlockAchievement(llllllllllllIlllllIIlIlIIlIllIII) ? 1 : 0)) {
                final int llllllllllllIlllllIIlIlIIlIIIlIl = Math.max(this.fontRendererObj.getStringWidth(llllllllllllIlllllIIlIlIIlIIlIlI), GuiAchievements.lIlllIIlllIlIl[45]);
                int llllllllllllIlllllIIlIlIIlIIIlII = this.fontRendererObj.splitStringWidth(llllllllllllIlllllIIlIlIIlIIlIIl, llllllllllllIlllllIIlIlIIlIIIlIl);
                if (lIIIIIlIIIlllIlI(this.statFileWriter.hasAchievementUnlocked(llllllllllllIlllllIIlIlIIlIllIII) ? 1 : 0)) {
                    llllllllllllIlllllIIlIlIIlIIIlII += 12;
                }
                this.drawGradientRect(llllllllllllIlllllIIlIlIIlIIlIII - GuiAchievements.lIlllIIlllIlIl[18], llllllllllllIlllllIIlIlIIlIIIlll - GuiAchievements.lIlllIIlllIlIl[18], llllllllllllIlllllIIlIlIIlIIlIII + llllllllllllIlllllIIlIlIIlIIIlIl + GuiAchievements.lIlllIIlllIlIl[18], llllllllllllIlllllIIlIlIIlIIIlll + llllllllllllIlllllIIlIlIIlIIIlII + GuiAchievements.lIlllIIlllIlIl[18] + GuiAchievements.lIlllIIlllIlIl[9], GuiAchievements.lIlllIIlllIlIl[46], GuiAchievements.lIlllIIlllIlIl[46]);
                this.fontRendererObj.drawSplitString(llllllllllllIlllllIIlIlIIlIIlIIl, llllllllllllIlllllIIlIlIIlIIlIII, llllllllllllIlllllIIlIlIIlIIIlll + GuiAchievements.lIlllIIlllIlIl[9], llllllllllllIlllllIIlIlIIlIIIlIl, GuiAchievements.lIlllIIlllIlIl[33]);
                if (lIIIIIlIIIlllIlI(this.statFileWriter.hasAchievementUnlocked(llllllllllllIlllllIIlIlIIlIllIII) ? 1 : 0)) {
                    this.fontRendererObj.drawStringWithShadow(I18n.format(GuiAchievements.lIlllIIlllIlII[GuiAchievements.lIlllIIlllIlIl[25]], new Object[GuiAchievements.lIlllIIlllIlIl[3]]), (float)llllllllllllIlllllIIlIlIIlIIlIII, (float)(llllllllllllIlllllIIlIlIIlIIIlll + llllllllllllIlllllIIlIlIIlIIIlII + GuiAchievements.lIlllIIlllIlIl[25]), GuiAchievements.lIlllIIlllIlIl[47]);
                    "".length();
                    "".length();
                    if (-(0x60 ^ 0x56 ^ (0x82 ^ 0xB0)) >= 0) {
                        return;
                    }
                }
            }
            else if (lIIIIIlIIIllIllI(llllllllllllIlllllIIlIlIIlIIIllI, GuiAchievements.lIlllIIlllIlIl[18])) {
                llllllllllllIlllllIIlIlIIlIIlIlI = I18n.format(GuiAchievements.lIlllIIlllIlII[GuiAchievements.lIlllIIlllIlIl[20]], new Object[GuiAchievements.lIlllIIlllIlIl[3]]);
                final int llllllllllllIlllllIIlIlIIlIIIIll = Math.max(this.fontRendererObj.getStringWidth(llllllllllllIlllllIIlIlIIlIIlIlI), GuiAchievements.lIlllIIlllIlIl[45]);
                final String lllllllllllllIlIIlIlllIIlIIIIIlI = GuiAchievements.lIlllIIlllIlII[GuiAchievements.lIlllIIlllIlIl[48]];
                final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[GuiAchievements.lIlllIIlllIlIl[6]];
                lllllllllllllIlIIlIlllIIlIIIIIIl[GuiAchievements.lIlllIIlllIlIl[3]] = llllllllllllIlllllIIlIlIIlIllIII.parentAchievement.getStatName();
                final String llllllllllllIlllllIIlIlIIlIIIIlI = new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI, lllllllllllllIlIIlIlllIIlIIIIIIl).getUnformattedText();
                final int llllllllllllIlllllIIlIlIIlIIIIIl = this.fontRendererObj.splitStringWidth(llllllllllllIlllllIIlIlIIlIIIIlI, llllllllllllIlllllIIlIlIIlIIIIll);
                this.drawGradientRect(llllllllllllIlllllIIlIlIIlIIlIII - GuiAchievements.lIlllIIlllIlIl[18], llllllllllllIlllllIIlIlIIlIIIlll - GuiAchievements.lIlllIIlllIlIl[18], llllllllllllIlllllIIlIlIIlIIlIII + llllllllllllIlllllIIlIlIIlIIIIll + GuiAchievements.lIlllIIlllIlIl[18], llllllllllllIlllllIIlIlIIlIIIlll + llllllllllllIlllllIIlIlIIlIIIIIl + GuiAchievements.lIlllIIlllIlIl[9] + GuiAchievements.lIlllIIlllIlIl[18], GuiAchievements.lIlllIIlllIlIl[46], GuiAchievements.lIlllIIlllIlIl[46]);
                this.fontRendererObj.drawSplitString(llllllllllllIlllllIIlIlIIlIIIIlI, llllllllllllIlllllIIlIlIIlIIlIII, llllllllllllIlllllIIlIlIIlIIIlll + GuiAchievements.lIlllIIlllIlIl[9], llllllllllllIlllllIIlIlIIlIIIIll, GuiAchievements.lIlllIIlllIlIl[49]);
                "".length();
                if (-" ".length() > -" ".length()) {
                    return;
                }
            }
            else if (lIIIIIlIIIllllII(llllllllllllIlllllIIlIlIIlIIIllI, GuiAchievements.lIlllIIlllIlIl[18])) {
                final int llllllllllllIlllllIIlIlIIlIIIIII = Math.max(this.fontRendererObj.getStringWidth(llllllllllllIlllllIIlIlIIlIIlIlI), GuiAchievements.lIlllIIlllIlIl[45]);
                final String lllllllllllllIlIIlIlllIIlIIIIIlI2 = GuiAchievements.lIlllIIlllIlII[GuiAchievements.lIlllIIlllIlIl[35]];
                final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl2 = new Object[GuiAchievements.lIlllIIlllIlIl[6]];
                lllllllllllllIlIIlIlllIIlIIIIIIl2[GuiAchievements.lIlllIIlllIlIl[3]] = llllllllllllIlllllIIlIlIIlIllIII.parentAchievement.getStatName();
                final String llllllllllllIlllllIIlIlIIIllllll = new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI2, lllllllllllllIlIIlIlllIIlIIIIIIl2).getUnformattedText();
                final int llllllllllllIlllllIIlIlIIIlllllI = this.fontRendererObj.splitStringWidth(llllllllllllIlllllIIlIlIIIllllll, llllllllllllIlllllIIlIlIIlIIIIII);
                this.drawGradientRect(llllllllllllIlllllIIlIlIIlIIlIII - GuiAchievements.lIlllIIlllIlIl[18], llllllllllllIlllllIIlIlIIlIIIlll - GuiAchievements.lIlllIIlllIlIl[18], llllllllllllIlllllIIlIlIIlIIlIII + llllllllllllIlllllIIlIlIIlIIIIII + GuiAchievements.lIlllIIlllIlIl[18], llllllllllllIlllllIIlIlIIlIIIlll + llllllllllllIlllllIIlIlIIIlllllI + GuiAchievements.lIlllIIlllIlIl[9] + GuiAchievements.lIlllIIlllIlIl[18], GuiAchievements.lIlllIIlllIlIl[46], GuiAchievements.lIlllIIlllIlIl[46]);
                this.fontRendererObj.drawSplitString(llllllllllllIlllllIIlIlIIIllllll, llllllllllllIlllllIIlIlIIlIIlIII, llllllllllllIlllllIIlIlIIlIIIlll + GuiAchievements.lIlllIIlllIlIl[9], llllllllllllIlllllIIlIlIIlIIIIII, GuiAchievements.lIlllIIlllIlIl[49]);
                "".length();
                if ("  ".length() > "   ".length()) {
                    return;
                }
            }
            else {
                llllllllllllIlllllIIlIlIIlIIlIlI = null;
            }
            if (lIIIIIlIIlIIIllI(llllllllllllIlllllIIlIlIIlIIlIlI)) {
                final FontRenderer fontRendererObj = this.fontRendererObj;
                final String llllllllllllIlllllllIlIlIIIllIIl = llllllllllllIlllllIIlIlIIlIIlIlI;
                final float llllllllllllIlllllllIlIlIIIlIIll = (float)llllllllllllIlllllIIlIlIIlIIlIII;
                final float llllllllllllIlllllllIlIlIIIlIIlI = (float)llllllllllllIlllllIIlIlIIlIIIlll;
                int llllllllllllIlllllllIlIlIIIlIllI;
                if (lIIIIIlIIIlllIlI(this.statFileWriter.canUnlockAchievement(llllllllllllIlllllIIlIlIIlIllIII) ? 1 : 0)) {
                    if (lIIIIIlIIIlllIlI(llllllllllllIlllllIIlIlIIlIllIII.getSpecial() ? 1 : 0)) {
                        llllllllllllIlllllllIlIlIIIlIllI = GuiAchievements.lIlllIIlllIlIl[50];
                        "".length();
                        if (((0x6A ^ 0x37) & ~(0xEE ^ 0xB3)) != 0x0) {
                            return;
                        }
                    }
                    else {
                        llllllllllllIlllllllIlIlIIIlIllI = GuiAchievements.lIlllIIlllIlIl[51];
                        "".length();
                        if (((0x54 ^ 0x3B ^ (0x88 ^ 0xBF)) & (180 + 39 + 9 + 21 ^ 153 + 160 - 282 + 130 ^ -" ".length())) > 0) {
                            return;
                        }
                    }
                }
                else if (lIIIIIlIIIlllIlI(llllllllllllIlllllIIlIlIIlIllIII.getSpecial() ? 1 : 0)) {
                    llllllllllllIlllllllIlIlIIIlIllI = GuiAchievements.lIlllIIlllIlIl[52];
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    llllllllllllIlllllllIlIlIIIlIllI = GuiAchievements.lIlllIIlllIlIl[53];
                }
                fontRendererObj.drawStringWithShadow(llllllllllllIlllllllIlIlIIIllIIl, llllllllllllIlllllllIlIlIIIlIIll, llllllllllllIlllllllIlIlIIIlIIlI, llllllllllllIlllllllIlIlIIIlIllI);
                "".length();
            }
        }
        GlStateManager.enableDepth();
        GlStateManager.enableLighting();
        RenderHelper.disableStandardItemLighting();
    }
    
    private static String lIIIIIlIIIlIllll(String llllllllllllIlllllIIlIIllllllIIl, final String llllllllllllIlllllIIlIIllllllIII) {
        llllllllllllIlllllIIlIIllllllIIl = (int)new String(Base64.getDecoder().decode(((String)llllllllllllIlllllIIlIIllllllIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllllIIlIIlllllllII = new StringBuilder();
        final char[] llllllllllllIlllllIIlIIllllllIll = llllllllllllIlllllIIlIIllllllIII.toCharArray();
        int llllllllllllIlllllIIlIIllllllIlI = GuiAchievements.lIlllIIlllIlIl[3];
        final int llllllllllllIlllllIIlIIlllllIlII = (Object)((String)llllllllllllIlllllIIlIIllllllIIl).toCharArray();
        final long llllllllllllIlllllIIlIIlllllIIll = llllllllllllIlllllIIlIIlllllIlII.length;
        int llllllllllllIlllllIIlIIlllllIIlI = GuiAchievements.lIlllIIlllIlIl[3];
        while (lIIIIIlIIIllllII(llllllllllllIlllllIIlIIlllllIIlI, (int)llllllllllllIlllllIIlIIlllllIIll)) {
            final char llllllllllllIlllllIIlIIlllllllll = llllllllllllIlllllIIlIIlllllIlII[llllllllllllIlllllIIlIIlllllIIlI];
            llllllllllllIlllllIIlIIlllllllII.append((char)(llllllllllllIlllllIIlIIlllllllll ^ llllllllllllIlllllIIlIIllllllIll[llllllllllllIlllllIIlIIllllllIlI % llllllllllllIlllllIIlIIllllllIll.length]));
            "".length();
            ++llllllllllllIlllllIIlIIllllllIlI;
            ++llllllllllllIlllllIIlIIlllllIIlI;
            "".length();
            if ("   ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllllIIlIIlllllllII);
    }
    
    static {
        lIIIIIlIIIllIlII();
        lIIIIIlIIIllIIlI();
        field_146572_y = AchievementList.minDisplayColumn * GuiAchievements.lIlllIIlllIlIl[0] - GuiAchievements.lIlllIIlllIlIl[1];
        field_146571_z = AchievementList.minDisplayRow * GuiAchievements.lIlllIIlllIlIl[0] - GuiAchievements.lIlllIIlllIlIl[1];
        field_146559_A = AchievementList.maxDisplayColumn * GuiAchievements.lIlllIIlllIlIl[0] - GuiAchievements.lIlllIIlllIlIl[2];
        field_146560_B = AchievementList.maxDisplayRow * GuiAchievements.lIlllIIlllIlIl[0] - GuiAchievements.lIlllIIlllIlIl[2];
        ACHIEVEMENT_BACKGROUND = new ResourceLocation(GuiAchievements.lIlllIIlllIlII[GuiAchievements.lIlllIIlllIlIl[3]]);
    }
    
    @Override
    public void drawScreen(final int llllllllllllIlllllIIlIlIlIlllllI, final int llllllllllllIlllllIIlIlIlIllllIl, final float llllllllllllIlllllIIlIlIllIIlIll) {
        if (lIIIIIlIIIlllIlI(this.loadingAchievements ? 1 : 0)) {
            this.drawDefaultBackground();
            this.drawCenteredString(this.fontRendererObj, I18n.format(GuiAchievements.lIlllIIlllIlII[GuiAchievements.lIlllIIlllIlIl[8]], new Object[GuiAchievements.lIlllIIlllIlIl[3]]), this.width / GuiAchievements.lIlllIIlllIlIl[8], this.height / GuiAchievements.lIlllIIlllIlIl[8], GuiAchievements.lIlllIIlllIlIl[13]);
            this.drawCenteredString(this.fontRendererObj, GuiAchievements.lanSearchStates[(int)(Minecraft.getSystemTime() / 150L % GuiAchievements.lanSearchStates.length)], this.width / GuiAchievements.lIlllIIlllIlIl[8], this.height / GuiAchievements.lIlllIIlllIlIl[8] + this.fontRendererObj.FONT_HEIGHT * GuiAchievements.lIlllIIlllIlIl[8], GuiAchievements.lIlllIIlllIlIl[13]);
            "".length();
            if (-(0x86 ^ 0xC3 ^ (0x42 ^ 0x3)) >= 0) {
                return;
            }
        }
        else {
            if (lIIIIIlIIIlllIlI(Mouse.isButtonDown(GuiAchievements.lIlllIIlllIlIl[3]) ? 1 : 0)) {
                final int llllllllllllIlllllIIlIlIllIIlIlI = (this.width - this.field_146555_f) / GuiAchievements.lIlllIIlllIlIl[8];
                final int llllllllllllIlllllIIlIlIllIIlIIl = (this.height - this.field_146557_g) / GuiAchievements.lIlllIIlllIlIl[8];
                final int llllllllllllIlllllIIlIlIllIIlIII = llllllllllllIlllllIIlIlIllIIlIlI + GuiAchievements.lIlllIIlllIlIl[14];
                final int llllllllllllIlllllIIlIlIllIIIlll = llllllllllllIlllllIIlIlIllIIlIIl + GuiAchievements.lIlllIIlllIlIl[15];
                if ((!lIIIIIlIIIlllIlI(this.field_146554_D) || lIIIIIlIIIllIllI(this.field_146554_D, GuiAchievements.lIlllIIlllIlIl[6])) && lIIIIIlIIIlllIll(llllllllllllIlllllIIlIlIlIlllllI, llllllllllllIlllllIIlIlIllIIlIII) && lIIIIIlIIIllllII(llllllllllllIlllllIIlIlIlIlllllI, llllllllllllIlllllIIlIlIllIIlIII + GuiAchievements.lIlllIIlllIlIl[16]) && lIIIIIlIIIlllIll(llllllllllllIlllllIIlIlIlIllllIl, llllllllllllIlllllIIlIlIllIIIlll) && lIIIIIlIIIllllII(llllllllllllIlllllIIlIlIlIllllIl, llllllllllllIlllllIIlIlIllIIIlll + GuiAchievements.lIlllIIlllIlIl[17])) {
                    if (lIIIIIlIIIllIlIl(this.field_146554_D)) {
                        this.field_146554_D = GuiAchievements.lIlllIIlllIlIl[6];
                        "".length();
                        if (((0x58 ^ 0x6D ^ (0x51 ^ 0x79)) & (0xEB ^ 0x8E ^ (0xF ^ 0x77) ^ -" ".length())) > ((8 + 194 - 2 + 26 ^ 93 + 65 - 107 + 119) & (127 + 73 - 99 + 94 ^ 55 + 60 - 56 + 80 ^ -" ".length()))) {
                            return;
                        }
                    }
                    else {
                        this.field_146567_u -= (llllllllllllIlllllIIlIlIlIlllllI - this.field_146563_h) * this.field_146570_r;
                        this.field_146566_v -= (llllllllllllIlllllIIlIlIlIllllIl - this.field_146564_i) * this.field_146570_r;
                        final double field_146567_u = this.field_146567_u;
                        this.field_146569_s = field_146567_u;
                        this.field_146565_w = field_146567_u;
                        final double field_146566_v = this.field_146566_v;
                        this.field_146568_t = field_146566_v;
                        this.field_146573_x = field_146566_v;
                    }
                    this.field_146563_h = llllllllllllIlllllIIlIlIlIlllllI;
                    this.field_146564_i = llllllllllllIlllllIIlIlIlIllllIl;
                    "".length();
                    if (-(0x79 ^ 0x7C) >= 0) {
                        return;
                    }
                }
            }
            else {
                this.field_146554_D = GuiAchievements.lIlllIIlllIlIl[3];
            }
            final int llllllllllllIlllllIIlIlIllIIIllI = Mouse.getDWheel();
            final float llllllllllllIlllllIIlIlIllIIIlIl = this.field_146570_r;
            if (lIIIIIlIIIllllIl(llllllllllllIlllllIIlIlIllIIIllI)) {
                this.field_146570_r += 0.25f;
                "".length();
                if ("   ".length() < "   ".length()) {
                    return;
                }
            }
            else if (lIIIIIlIIIlllllI(llllllllllllIlllllIIlIlIllIIIllI)) {
                this.field_146570_r -= 0.25f;
            }
            this.field_146570_r = MathHelper.clamp_float(this.field_146570_r, 1.0f, 2.0f);
            if (lIIIIIlIIIlllIlI(lIIIIIlIIIllIlll(this.field_146570_r, llllllllllllIlllllIIlIlIllIIIlIl))) {
                final float llllllllllllIlllllIIlIlIllIIIlII = llllllllllllIlllllIIlIlIllIIIlIl - this.field_146570_r;
                final float llllllllllllIlllllIIlIlIllIIIIll = llllllllllllIlllllIIlIlIllIIIlIl * this.field_146555_f;
                final float llllllllllllIlllllIIlIlIllIIIIlI = llllllllllllIlllllIIlIlIllIIIlIl * this.field_146557_g;
                final float llllllllllllIlllllIIlIlIllIIIIIl = this.field_146570_r * this.field_146555_f;
                final float llllllllllllIlllllIIlIlIllIIIIII = this.field_146570_r * this.field_146557_g;
                this.field_146567_u -= (llllllllllllIlllllIIlIlIllIIIIIl - llllllllllllIlllllIIlIlIllIIIIll) * 0.5f;
                this.field_146566_v -= (llllllllllllIlllllIIlIlIllIIIIII - llllllllllllIlllllIIlIlIllIIIIlI) * 0.5f;
                final double field_146567_u2 = this.field_146567_u;
                this.field_146569_s = field_146567_u2;
                this.field_146565_w = field_146567_u2;
                final double field_146566_v2 = this.field_146566_v;
                this.field_146568_t = field_146566_v2;
                this.field_146573_x = field_146566_v2;
            }
            if (lIIIIIlIIIllllIl(lIIIIIlIIIlllIII(this.field_146565_w, GuiAchievements.field_146572_y))) {
                this.field_146565_w = GuiAchievements.field_146572_y;
            }
            if (lIIIIIlIIIllllIl(lIIIIIlIIIlllIII(this.field_146573_x, GuiAchievements.field_146571_z))) {
                this.field_146573_x = GuiAchievements.field_146571_z;
            }
            if (lIIIIIlIIIllllll(lIIIIIlIIIlllIIl(this.field_146565_w, GuiAchievements.field_146559_A))) {
                this.field_146565_w = GuiAchievements.field_146559_A - GuiAchievements.lIlllIIlllIlIl[6];
            }
            if (lIIIIIlIIIllllll(lIIIIIlIIIlllIIl(this.field_146573_x, GuiAchievements.field_146560_B))) {
                this.field_146573_x = GuiAchievements.field_146560_B - GuiAchievements.lIlllIIlllIlIl[6];
            }
            this.drawDefaultBackground();
            this.drawAchievementScreen(llllllllllllIlllllIIlIlIlIlllllI, llllllllllllIlllllIIlIlIlIllllIl, llllllllllllIlllllIIlIlIllIIlIll);
            GlStateManager.disableLighting();
            GlStateManager.disableDepth();
            this.drawTitle();
            GlStateManager.enableLighting();
            GlStateManager.enableDepth();
        }
    }
    
    private static int lIIIIIlIIIlllIIl(final double n, final double n2) {
        return dcmpl(n, n2);
    }
    
    private static void lIIIIIlIIIllIIlI() {
        (lIlllIIlllIlII = new String[GuiAchievements.lIlllIIlllIlIl[14]])[GuiAchievements.lIlllIIlllIlIl[3]] = lIIIIIlIIIlIllll("EDYaOwQWNhFgFhE6TS4SDDoHORQJNgw7XgUwCiYUEjYPKh8QDAAuEg80ECAECjdMPx8D", "dSbOq");
        GuiAchievements.lIlllIIlllIlII[GuiAchievements.lIlllIIlllIlIl[6]] = lIIIIIlIIIllIIII("A+093PhuphMzTE/0yFAleA==", "IcMkr");
        GuiAchievements.lIlllIIlllIlII[GuiAchievements.lIlllIIlllIlIl[8]] = lIIIIIlIIIllIIII("9HfnKJ7TPIisOght71NOce0HI+4qOiMZSUk1HyKSeQE=", "okoQl");
        GuiAchievements.lIlllIIlllIlII[GuiAchievements.lIlllIIlllIlIl[18]] = lIIIIIlIIIllIIIl("ntfWnE7Uz959REoCmNEA8igt4AjGwFJi", "vvIXN");
        GuiAchievements.lIlllIIlllIlII[GuiAchievements.lIlllIIlllIlIl[25]] = lIIIIIlIIIllIIIl("8+seQKc+1dcREYg4ibAngSYu6SMmVG7r", "FtdjG");
        GuiAchievements.lIlllIIlllIlII[GuiAchievements.lIlllIIlllIlIl[20]] = lIIIIIlIIIllIIII("OU5jqwWsjRexZWImbOmBVB+fs+mT4xp6", "dIbya");
        GuiAchievements.lIlllIIlllIlII[GuiAchievements.lIlllIIlllIlIl[48]] = lIIIIIlIIIlIllll("GzkxAQ4MPzQNBQ50Kw0aDzMrDRg=", "zZYhk");
        GuiAchievements.lIlllIIlllIlII[GuiAchievements.lIlllIIlllIlIl[35]] = lIIIIIlIIIlIllll("DjoQOzUZPBU3Pht3CjchGjAKNyM=", "oYxRP");
    }
    
    private static String lIIIIIlIIIllIIII(final String llllllllllllIlllllIIlIlIIIIIlllI, final String llllllllllllIlllllIIlIlIIIIIllIl) {
        try {
            final SecretKeySpec llllllllllllIlllllIIlIlIIIIlIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIIlIlIIIIIllIl.getBytes(StandardCharsets.UTF_8)), GuiAchievements.lIlllIIlllIlIl[14]), "DES");
            final Cipher llllllllllllIlllllIIlIlIIIIlIIII = Cipher.getInstance("DES");
            llllllllllllIlllllIIlIlIIIIlIIII.init(GuiAchievements.lIlllIIlllIlIl[8], llllllllllllIlllllIIlIlIIIIlIIIl);
            return new String(llllllllllllIlllllIIlIlIIIIlIIII.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIIlIlIIIIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllIIlIlIIIIIllll) {
            llllllllllllIlllllIIlIlIIIIIllll.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIIIlIIIllIlII() {
        (lIlllIIlllIlIl = new int[54])[0] = (0x46 ^ 0x3 ^ (0x1 ^ 0x5C));
        GuiAchievements.lIlllIIlllIlIl[1] = (0xE8 ^ 0x98);
        GuiAchievements.lIlllIIlllIlIl[2] = (0x7 ^ 0x4A);
        GuiAchievements.lIlllIIlllIlIl[3] = ((17 + 17 + 45 + 58 ^ 138 + 30 - 89 + 83) & (100 + 115 - 155 + 104 ^ 48 + 6 - 39 + 128 ^ -" ".length()));
        GuiAchievements.lIlllIIlllIlIl[4] = (-(0xFFFF878E & 0x7CF3) & (0xFFFFA5CB & 0x5FB5));
        GuiAchievements.lIlllIIlllIlIl[5] = (0x7 ^ 0x61) + (44 + 27 - 7 + 79) - (105 + 181 - 279 + 182) + (7 + 19 + 68 + 52);
        GuiAchievements.lIlllIIlllIlIl[6] = " ".length();
        GuiAchievements.lIlllIIlllIlIl[7] = 66 + 49 - 97 + 123;
        GuiAchievements.lIlllIIlllIlIl[8] = "  ".length();
        GuiAchievements.lIlllIIlllIlIl[9] = (0x25 ^ 0x29);
        GuiAchievements.lIlllIIlllIlIl[10] = (0x4F ^ 0x5);
        GuiAchievements.lIlllIIlllIlIl[11] = (0xB ^ 0x5B);
        GuiAchievements.lIlllIIlllIlIl[12] = (0x61 ^ 0x3D ^ (0xFC ^ 0xB4));
        GuiAchievements.lIlllIIlllIlIl[13] = (-1 & 0xFFFFFF);
        GuiAchievements.lIlllIIlllIlIl[14] = (0x63 ^ 0x6B);
        GuiAchievements.lIlllIIlllIlIl[15] = (18 + 22 + 72 + 28 ^ 52 + 82 - 50 + 73);
        GuiAchievements.lIlllIIlllIlIl[16] = 158 + 140 - 167 + 76 + (0x1 ^ 0x22) - (78 + 77 - 84 + 80) + (100 + 121 - 197 + 109);
        GuiAchievements.lIlllIIlllIlIl[17] = 40 + 31 + 11 + 73;
        GuiAchievements.lIlllIIlllIlIl[18] = "   ".length();
        GuiAchievements.lIlllIIlllIlIl[19] = (0x2E ^ 0x55 ^ (0xE8 ^ 0x9C));
        GuiAchievements.lIlllIIlllIlIl[20] = (0x13 ^ 0x16);
        GuiAchievements.lIlllIIlllIlIl[21] = (-(0xFFFFBFDB & 0x5E3F) & (0xFFFFFE7A & 0x405FDF));
        GuiAchievements.lIlllIIlllIlIl[22] = (0xE9 ^ 0xC4 ^ (0x4A ^ 0x77));
        GuiAchievements.lIlllIIlllIlIl[23] = (0xFFFFBF5E & 0x42A7);
        GuiAchievements.lIlllIIlllIlIl[24] = (-(0xFFFFBE5F & 0x7FEF) & (0xFFFFFF6E & 0x3FFF));
        GuiAchievements.lIlllIIlllIlIl[25] = (0x59 ^ 0x5D);
        GuiAchievements.lIlllIIlllIlIl[26] = (0xC9 ^ 0xC3);
        GuiAchievements.lIlllIIlllIlIl[27] = (0x6A ^ 0x7C);
        GuiAchievements.lIlllIIlllIlIl[28] = (0x58 ^ 0x7D);
        GuiAchievements.lIlllIIlllIlIl[29] = (0x9E ^ 0xBD);
        GuiAchievements.lIlllIIlllIlIl[30] = (0xFFFF9EA7 & 0x635B);
        GuiAchievements.lIlllIIlllIlIl[31] = (0xCF ^ 0xC4);
        GuiAchievements.lIlllIIlllIlIl[32] = -(0xFFFFF85F & 0x10007A0);
        GuiAchievements.lIlllIIlllIlIl[33] = -(-(0xFFFFFB9F & 0x24FF) & (-1 & 0x5F7FFE));
        GuiAchievements.lIlllIIlllIlIl[34] = -(0xFFFFD1B5 & 0xFF2F4A);
        GuiAchievements.lIlllIIlllIlIl[35] = (0x93 ^ 0x94);
        GuiAchievements.lIlllIIlllIlIl[36] = (84 + 202 - 183 + 137 ^ 24 + 112 - 66 + 60);
        GuiAchievements.lIlllIIlllIlIl[37] = 51 + 28 - 14 + 131 + (0xDF ^ 0xC5) - (0x6A ^ 0x0) + (0x28 ^ 0x5E);
        GuiAchievements.lIlllIIlllIlIl[38] = (76 + 141 - 196 + 195 ^ 74 + 91 - 79 + 93);
        GuiAchievements.lIlllIIlllIlIl[39] = (0x98 ^ 0xBD ^ (0x59 ^ 0x1C));
        GuiAchievements.lIlllIIlllIlIl[40] = 134 + 27 - 145 + 216 + (0x60 ^ 0x18) - (0xFB ^ 0x85) + (0x2C ^ 0x23);
        GuiAchievements.lIlllIIlllIlIl[41] = -(0x4A ^ 0x52);
        GuiAchievements.lIlllIIlllIlIl[42] = (0xC ^ 0x64 ^ (0x58 ^ 0x2A));
        GuiAchievements.lIlllIIlllIlIl[43] = (0xFFFF8FFA & 0x7307);
        GuiAchievements.lIlllIIlllIlIl[44] = (-(0x56 ^ 0x6B) & (0xFFFFF37F & 0xFBF));
        GuiAchievements.lIlllIIlllIlIl[45] = (0x41 ^ 0x39);
        GuiAchievements.lIlllIIlllIlIl[46] = -(0xFFFFC397 & 0x40003C68);
        GuiAchievements.lIlllIIlllIlIl[47] = -(0xFFFFEFEF & 0x6F7F11);
        GuiAchievements.lIlllIIlllIlIl[48] = (174 + 14 - 43 + 30 ^ 133 + 5 - 20 + 51);
        GuiAchievements.lIlllIIlllIlIl[49] = -(0xFFFFAFF5 & 0x8FFFBA);
        GuiAchievements.lIlllIIlllIlIl[50] = -(105 + 106 - 83 + 0);
        GuiAchievements.lIlllIIlllIlIl[51] = -" ".length();
        GuiAchievements.lIlllIIlllIlIl[52] = -(-(0xB7 ^ 0x8C) & (0xFFFFFFFA & 0x7F7FFF));
        GuiAchievements.lIlllIIlllIlIl[53] = -(-(0x3E ^ 0x13) & (-1 & 0x7F7FAC));
    }
    
    private static boolean lIIIIIlIIlIIIllI(final Object llllllllllllIlllllIIlIIlllIIlllI) {
        return llllllllllllIlllllIIlIIlllIIlllI != null;
    }
    
    private static boolean lIIIIIlIIIllIllI(final int llllllllllllIlllllIIlIIllllIIIIl, final int llllllllllllIlllllIIlIIllllIIIII) {
        return llllllllllllIlllllIIlIIllllIIIIl == llllllllllllIlllllIIlIIllllIIIII;
    }
    
    private static int lIIIIIlIIlIIIIIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean lIIIIIlIIIllIlIl(final int llllllllllllIlllllIIlIIlllIIlIlI) {
        return llllllllllllIlllllIIlIIlllIIlIlI == 0;
    }
    
    private TextureAtlasSprite func_175371_a(final Block llllllllllllIlllllIIlIlIIIIllIIl) {
        return Minecraft.getMinecraft().getBlockRendererDispatcher().getBlockModelShapes().getTexture(llllllllllllIlllllIIlIlIIIIllIIl.getDefaultState());
    }
}
