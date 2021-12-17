// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.util.MathHelper;
import net.minecraft.client.settings.GameSettings;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.gui.spectator.ISpectatorMenuObject;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.gui.spectator.categories.SpectatorDetails;
import net.minecraft.client.gui.spectator.SpectatorMenu;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.spectator.ISpectatorMenuRecipient;

public class GuiSpectator extends Gui implements ISpectatorMenuRecipient
{
    private final /* synthetic */ Minecraft field_175268_g;
    private static final /* synthetic */ String[] llIllllIllIlll;
    private static final /* synthetic */ ResourceLocation field_175267_f;
    private /* synthetic */ SpectatorMenu field_175271_i;
    private /* synthetic */ long field_175270_h;
    private static final /* synthetic */ int[] llIllllIlllIIl;
    public static final /* synthetic */ ResourceLocation field_175269_a;
    
    public void renderTooltip(final ScaledResolution llllllllllllIllIIIllIlIIIlIllIlI, final float llllllllllllIllIIIllIlIIIlIllIIl) {
        if (lIIllIlIllIlIllI(this.field_175271_i)) {
            final float llllllllllllIllIIIllIlIIIlIllIII = this.func_175265_c();
            if (lIIllIlIllIllIII(lIIllIlIllIlIlll(llllllllllllIllIIIllIlIIIlIllIII, 0.0f))) {
                this.field_175271_i.func_178641_d();
                "".length();
                if ((0x72 ^ 0x76) < ((0x32 ^ 0x21) & ~(0xA9 ^ 0xBA))) {
                    return;
                }
            }
            else {
                final int llllllllllllIllIIIllIlIIIlIlIlll = llllllllllllIllIIIllIlIIIlIllIlI.getScaledWidth() / GuiSpectator.llIllllIlllIIl[2];
                final float llllllllllllIllIIIllIlIIIlIlIllI = this.zLevel;
                this.zLevel = -90.0f;
                final float llllllllllllIllIIIllIlIIIlIlIlIl = llllllllllllIllIIIllIlIIIlIllIlI.getScaledHeight() - 22.0f * llllllllllllIllIIIllIlIIIlIllIII;
                final SpectatorDetails llllllllllllIllIIIllIlIIIlIlIlII = this.field_175271_i.func_178646_f();
                this.func_175258_a(llllllllllllIllIIIllIlIIIlIllIlI, llllllllllllIllIIIllIlIIIlIllIII, llllllllllllIllIIIllIlIIIlIlIlll, llllllllllllIllIIIllIlIIIlIlIlIl, llllllllllllIllIIIllIlIIIlIlIlII);
                this.zLevel = llllllllllllIllIIIllIlIIIlIlIllI;
            }
        }
    }
    
    private static boolean lIIllIlIllIlllII(final int llllllllllllIllIIIllIIllllIIIlII) {
        return llllllllllllIllIIIllIIllllIIIlII != 0;
    }
    
    public void func_175259_b(final int llllllllllllIllIIIllIIllllllllII) {
        int llllllllllllIllIIIllIIlllllllIll = this.field_175271_i.func_178648_e() + llllllllllllIllIIIllIIllllllllII;
        "".length();
        if (" ".length() != " ".length()) {
            return;
        }
        while (lIIllIlIllIllIIl(llllllllllllIllIIIllIIlllllllIll) && lIIllIlIllIllllI(llllllllllllIllIIIllIIlllllllIll, GuiSpectator.llIllllIlllIIl[16]) && (!lIIllIlIllIllIll(this.field_175271_i.func_178643_a(llllllllllllIllIIIllIIlllllllIll), SpectatorMenu.field_178657_a) || !lIIllIlIllIlllII(this.field_175271_i.func_178643_a(llllllllllllIllIIIllIIlllllllIll).func_178662_A_() ? 1 : 0))) {
            llllllllllllIllIIIllIIlllllllIll += llllllllllllIllIIIllIIllllllllII;
        }
        if (lIIllIlIllIllIIl(llllllllllllIllIIIllIIlllllllIll) && lIIllIlIllIllllI(llllllllllllIllIIIllIIlllllllIll, GuiSpectator.llIllllIlllIIl[16])) {
            this.field_175271_i.func_178644_b(llllllllllllIllIIIllIIlllllllIll);
            this.field_175270_h = Minecraft.getSystemTime();
        }
    }
    
    private static boolean lIIllIlIllIlllIl(final int llllllllllllIllIIIllIIllllIIllIl, final int llllllllllllIllIIIllIIllllIIllII) {
        return llllllllllllIllIIIllIIllllIIllIl > llllllllllllIllIIIllIIllllIIllII;
    }
    
    public void func_175263_a(final ScaledResolution llllllllllllIllIIIllIlIIIIIlIlII) {
        final int llllllllllllIllIIIllIlIIIIIlIIll = (int)(this.func_175265_c() * 255.0f);
        if (lIIllIlIllIlllIl(llllllllllllIllIIIllIlIIIIIlIIll, GuiSpectator.llIllllIlllIIl[12]) && lIIllIlIllIlIllI(this.field_175271_i)) {
            final ISpectatorMenuObject llllllllllllIllIIIllIlIIIIIlIIlI = this.field_175271_i.func_178645_b();
            String s;
            if (lIIllIlIllIllIll(llllllllllllIllIIIllIlIIIIIlIIlI, SpectatorMenu.field_178657_a)) {
                s = llllllllllllIllIIIllIlIIIIIlIIlI.getSpectatorName().getFormattedText();
                "".length();
                if (((0x45 ^ 0x71) & ~(0xB9 ^ 0x8D)) < ((0x37 ^ 0x20) & ~(0xAD ^ 0xBA))) {
                    return;
                }
            }
            else {
                s = this.field_175271_i.func_178650_c().func_178670_b().getFormattedText();
            }
            final String llllllllllllIllIIIllIlIIIIIlIIIl = s;
            if (lIIllIlIllIlIllI(llllllllllllIllIIIllIlIIIIIlIIIl)) {
                final int llllllllllllIllIIIllIlIIIIIlIIII = (llllllllllllIllIIIllIlIIIIIlIlII.getScaledWidth() - this.field_175268_g.fontRendererObj.getStringWidth(llllllllllllIllIIIllIlIIIIIlIIIl)) / GuiSpectator.llIllllIlllIIl[2];
                final int llllllllllllIllIIIllIlIIIIIIllll = llllllllllllIllIIIllIlIIIIIlIlII.getScaledHeight() - GuiSpectator.llIllllIlllIIl[15];
                GlStateManager.pushMatrix();
                GlStateManager.enableBlend();
                GlStateManager.tryBlendFuncSeparate(GuiSpectator.llIllllIlllIIl[3], GuiSpectator.llIllllIlllIIl[4], GuiSpectator.llIllllIlllIIl[1], GuiSpectator.llIllllIlllIIl[0]);
                this.field_175268_g.fontRendererObj.drawStringWithShadow(llllllllllllIllIIIllIlIIIIIlIIIl, (float)llllllllllllIllIIIllIlIIIIIlIIII, (float)llllllllllllIllIIIllIlIIIIIIllll, GuiSpectator.llIllllIlllIIl[14] + (llllllllllllIllIIIllIlIIIIIlIIll << GuiSpectator.llIllllIlllIIl[9]));
                "".length();
                GlStateManager.disableBlend();
                GlStateManager.popMatrix();
            }
        }
    }
    
    private static boolean lIIllIlIllIllIll(final Object llllllllllllIllIIIllIIllllIIlIIl, final Object llllllllllllIllIIIllIIllllIIlIII) {
        return llllllllllllIllIIIllIIllllIIlIIl != llllllllllllIllIIIllIIllllIIlIII;
    }
    
    private static boolean lIIllIlIllIlllll(final int llllllllllllIllIIIllIIlllIllllIl, final int llllllllllllIllIIIllIIlllIllllII) {
        return llllllllllllIllIIIllIIlllIllllIl != llllllllllllIllIIIllIIlllIllllII;
    }
    
    static {
        lIIllIlIllIlIlIl();
        lIIllIlIllIlIIlI();
        field_175267_f = new ResourceLocation(GuiSpectator.llIllllIllIlll[GuiSpectator.llIllllIlllIIl[0]]);
        field_175269_a = new ResourceLocation(GuiSpectator.llIllllIllIlll[GuiSpectator.llIllllIlllIIl[1]]);
    }
    
    public void func_175260_a(final int llllllllllllIllIIIllIlIIIllIlIIl) {
        this.field_175270_h = Minecraft.getSystemTime();
        if (lIIllIlIllIlIllI(this.field_175271_i)) {
            this.field_175271_i.func_178644_b(llllllllllllIllIIIllIlIIIllIlIIl);
            "".length();
            if (-"  ".length() >= 0) {
                return;
            }
        }
        else {
            this.field_175271_i = new SpectatorMenu(this);
        }
    }
    
    private static void lIIllIlIllIlIIlI() {
        (llIllllIllIlll = new String[GuiSpectator.llIllllIlllIIl[2]])[GuiSpectator.llIllllIlllIIl[0]] = lIIllIlIllIlIIII("g7aTzM4us05+vMieq8ZggsvsdHWkR/fkxDLp72mgclU=", "GwFxX");
        GuiSpectator.llIllllIllIlll[GuiSpectator.llIllllIlllIIl[1]] = lIIllIlIllIlIIIl("hAmtj2qb3ZitPuiAIf/8M9hOsEhgR8ic5+wf7H0JELn2GLfxoKLcfQ==", "cYTbQ");
    }
    
    private static String lIIllIlIllIlIIIl(final String llllllllllllIllIIIllIIllllIlllIl, final String llllllllllllIllIIIllIIllllIlllII) {
        try {
            final SecretKeySpec llllllllllllIllIIIllIIlllllIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIllIIllllIlllII.getBytes(StandardCharsets.UTF_8)), GuiSpectator.llIllllIlllIIl[16]), "DES");
            final Cipher llllllllllllIllIIIllIIllllIlllll = Cipher.getInstance("DES");
            llllllllllllIllIIIllIIllllIlllll.init(GuiSpectator.llIllllIlllIIl[2], llllllllllllIllIIIllIIlllllIIIII);
            return new String(llllllllllllIllIIIllIIllllIlllll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIllIIllllIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIllIIllllIllllI) {
            llllllllllllIllIIIllIIllllIllllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIllIlIllIllllI(final int llllllllllllIllIIIllIIllllIlIIIl, final int llllllllllllIllIIIllIIllllIlIIII) {
        return llllllllllllIllIIIllIIllllIlIIIl <= llllllllllllIllIIIllIIllllIlIIII;
    }
    
    private static boolean lIIllIlIllIllIIl(final int llllllllllllIllIIIllIIllllIIIIlI) {
        return llllllllllllIllIIIllIIllllIIIIlI >= 0;
    }
    
    public void func_175261_b() {
        this.field_175270_h = Minecraft.getSystemTime();
        if (lIIllIlIllIlllII(this.func_175262_a() ? 1 : 0)) {
            final int llllllllllllIllIIIllIIllllllIlII = this.field_175271_i.func_178648_e();
            if (lIIllIlIllIlllll(llllllllllllIllIIIllIIllllllIlII, GuiSpectator.llIllllIlllIIl[17])) {
                this.field_175271_i.func_178644_b(llllllllllllIllIIIllIIllllllIlII);
                "".length();
                if (((0x61 ^ 0x57) & ~(0x29 ^ 0x1F)) < -" ".length()) {
                    return;
                }
            }
        }
        else {
            this.field_175271_i = new SpectatorMenu(this);
        }
    }
    
    private void func_175266_a(final int llllllllllllIllIIIllIlIIIIlIllIl, final int llllllllllllIllIIIllIlIIIIlIIIll, final float llllllllllllIllIIIllIlIIIIlIlIll, final float llllllllllllIllIIIllIlIIIIlIlIlI, final ISpectatorMenuObject llllllllllllIllIIIllIlIIIIlIlIIl) {
        this.field_175268_g.getTextureManager().bindTexture(GuiSpectator.field_175269_a);
        if (lIIllIlIllIllIll(llllllllllllIllIIIllIlIIIIlIlIIl, SpectatorMenu.field_178657_a)) {
            final int llllllllllllIllIIIllIlIIIIlIlIII = (int)(llllllllllllIllIIIllIlIIIIlIlIlI * 255.0f);
            GlStateManager.pushMatrix();
            GlStateManager.translate((float)llllllllllllIllIIIllIlIIIIlIIIll, llllllllllllIllIIIllIlIIIIlIlIll, 0.0f);
            float n;
            if (lIIllIlIllIlllII(llllllllllllIllIIIllIlIIIIlIlIIl.func_178662_A_() ? 1 : 0)) {
                n = 1.0f;
                "".length();
                if ((43 + 93 + 38 + 2 ^ 107 + 147 - 223 + 149) != (0x74 ^ 0x50 ^ (0xE ^ 0x2E))) {
                    return;
                }
            }
            else {
                n = 0.25f;
            }
            final float llllllllllllIllIIIllIlIIIIlIIlll = n;
            GlStateManager.color(llllllllllllIllIIIllIlIIIIlIIlll, llllllllllllIllIIIllIlIIIIlIIlll, llllllllllllIllIIIllIlIIIIlIIlll, llllllllllllIllIIIllIlIIIIlIlIlI);
            llllllllllllIllIIIllIlIIIIlIlIIl.func_178663_a(llllllllllllIllIIIllIlIIIIlIIlll, llllllllllllIllIIIllIlIIIIlIlIII);
            GlStateManager.popMatrix();
            final String llllllllllllIllIIIllIlIIIIlIIllI = String.valueOf(GameSettings.getKeyDisplayString(this.field_175268_g.gameSettings.keyBindsHotbar[llllllllllllIllIIIllIlIIIIlIllIl].getKeyCode()));
            if (lIIllIlIllIlllIl(llllllllllllIllIIIllIlIIIIlIlIII, GuiSpectator.llIllllIlllIIl[12]) && lIIllIlIllIlllII(llllllllllllIllIIIllIlIIIIlIlIIl.func_178662_A_() ? 1 : 0)) {
                this.field_175268_g.fontRendererObj.drawStringWithShadow(llllllllllllIllIIIllIlIIIIlIIllI, (float)(llllllllllllIllIIIllIlIIIIlIIIll + GuiSpectator.llIllllIlllIIl[13] - GuiSpectator.llIllllIlllIIl[2] - this.field_175268_g.fontRendererObj.getStringWidth(llllllllllllIllIIIllIlIIIIlIIllI)), llllllllllllIllIIIllIlIIIIlIlIll + 6.0f + 3.0f, GuiSpectator.llIllllIlllIIl[14] + (llllllllllllIllIIIllIlIIIIlIlIII << GuiSpectator.llIllllIlllIIl[9]));
                "".length();
            }
        }
    }
    
    private float func_175265_c() {
        final long llllllllllllIllIIIllIlIIIllIIlIl = this.field_175270_h - Minecraft.getSystemTime() + 5000L;
        return MathHelper.clamp_float(llllllllllllIllIIIllIlIIIllIIlIl / 2000.0f, 0.0f, 1.0f);
    }
    
    private static void lIIllIlIllIlIlIl() {
        (llIllllIlllIIl = new int[18])[0] = ((0xA8 ^ 0x9B ^ (0xE ^ 0x3A)) & (0x8D ^ 0xC2 ^ (0x62 ^ 0x2A) ^ -" ".length()));
        GuiSpectator.llIllllIlllIIl[1] = " ".length();
        GuiSpectator.llIllllIlllIIl[2] = "  ".length();
        GuiSpectator.llIllllIlllIIl[3] = (0xFFFFCF5F & 0x33A2);
        GuiSpectator.llIllllIlllIIl[4] = (-(0xFFFFDF7D & 0x68AB) & (0xFFFFFFAF & 0x4B7B));
        GuiSpectator.llIllllIlllIIl[5] = (0x4D ^ 0x16);
        GuiSpectator.llIllllIlllIIl[6] = (0x44 ^ 0x6B) + (0x47 ^ 0x4) - (0xBD ^ 0xB6) + (0x0 ^ 0x4F);
        GuiSpectator.llIllllIlllIIl[7] = (111 + 156 - 219 + 142 ^ 47 + 32 - 48 + 137);
        GuiSpectator.llIllllIlllIIl[8] = (0x2B ^ 0x2F ^ (0x94 ^ 0x84));
        GuiSpectator.llIllllIlllIIl[9] = (0xB1 ^ 0xA5 ^ (0x3 ^ 0xF));
        GuiSpectator.llIllllIlllIIl[10] = (0x2 ^ 0x58);
        GuiSpectator.llIllllIlllIIl[11] = (0x5C ^ 0x55);
        GuiSpectator.llIllllIlllIIl[12] = "   ".length();
        GuiSpectator.llIllllIlllIIl[13] = (0x69 ^ 0x4 ^ (0x1D ^ 0x63));
        GuiSpectator.llIllllIlllIIl[14] = (-" ".length() & (-1 & 0xFFFFFF));
        GuiSpectator.llIllllIlllIIl[15] = (0x16 ^ 0x35);
        GuiSpectator.llIllllIlllIIl[16] = (0x95 ^ 0x9D);
        GuiSpectator.llIllllIlllIIl[17] = -" ".length();
    }
    
    protected void func_175258_a(final ScaledResolution llllllllllllIllIIIllIlIIIIllllIl, final float llllllllllllIllIIIllIlIIIIllllII, final int llllllllllllIllIIIllIlIIIlIIIIlI, final float llllllllllllIllIIIllIlIIIlIIIIIl, final SpectatorDetails llllllllllllIllIIIllIlIIIlIIIIII) {
        GlStateManager.enableRescaleNormal();
        GlStateManager.enableBlend();
        GlStateManager.tryBlendFuncSeparate(GuiSpectator.llIllllIlllIIl[3], GuiSpectator.llIllllIlllIIl[4], GuiSpectator.llIllllIlllIIl[1], GuiSpectator.llIllllIlllIIl[0]);
        GlStateManager.color(1.0f, 1.0f, 1.0f, llllllllllllIllIIIllIlIIIIllllII);
        this.field_175268_g.getTextureManager().bindTexture(GuiSpectator.field_175267_f);
        this.drawTexturedModalRect((float)(llllllllllllIllIIIllIlIIIlIIIIlI - GuiSpectator.llIllllIlllIIl[5]), llllllllllllIllIIIllIlIIIlIIIIIl, GuiSpectator.llIllllIlllIIl[0], GuiSpectator.llIllllIlllIIl[0], GuiSpectator.llIllllIlllIIl[6], GuiSpectator.llIllllIlllIIl[7]);
        if (lIIllIlIllIllIIl(llllllllllllIllIIIllIlIIIlIIIIII.func_178681_b())) {
            this.drawTexturedModalRect((float)(llllllllllllIllIIIllIlIIIlIIIIlI - GuiSpectator.llIllllIlllIIl[5] - GuiSpectator.llIllllIlllIIl[1] + llllllllllllIllIIIllIlIIIlIIIIII.func_178681_b() * GuiSpectator.llIllllIlllIIl[8]), llllllllllllIllIIIllIlIIIlIIIIIl - 1.0f, GuiSpectator.llIllllIlllIIl[0], GuiSpectator.llIllllIlllIIl[7], GuiSpectator.llIllllIlllIIl[9], GuiSpectator.llIllllIlllIIl[7]);
        }
        RenderHelper.enableGUIStandardItemLighting();
        int llllllllllllIllIIIllIlIIIIllllll = GuiSpectator.llIllllIlllIIl[0];
        "".length();
        if (-"   ".length() > 0) {
            return;
        }
        while (!lIIllIlIllIllIlI(llllllllllllIllIIIllIlIIIIllllll, GuiSpectator.llIllllIlllIIl[11])) {
            this.func_175266_a(llllllllllllIllIIIllIlIIIIllllll, llllllllllllIllIIIllIlIIIIllllIl.getScaledWidth() / GuiSpectator.llIllllIlllIIl[2] - GuiSpectator.llIllllIlllIIl[10] + llllllllllllIllIIIllIlIIIIllllll * GuiSpectator.llIllllIlllIIl[8] + GuiSpectator.llIllllIlllIIl[2], llllllllllllIllIIIllIlIIIlIIIIIl + 3.0f, llllllllllllIllIIIllIlIIIIllllII, llllllllllllIllIIIllIlIIIlIIIIII.func_178680_a(llllllllllllIllIIIllIlIIIIllllll));
            ++llllllllllllIllIIIllIlIIIIllllll;
        }
        RenderHelper.disableStandardItemLighting();
        GlStateManager.disableRescaleNormal();
        GlStateManager.disableBlend();
    }
    
    private static String lIIllIlIllIlIIII(final String llllllllllllIllIIIllIIlllllIlIII, final String llllllllllllIllIIIllIIlllllIlIIl) {
        try {
            final SecretKeySpec llllllllllllIllIIIllIIlllllIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIllIIlllllIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIIllIIlllllIllII = Cipher.getInstance("Blowfish");
            llllllllllllIllIIIllIIlllllIllII.init(GuiSpectator.llIllllIlllIIl[2], llllllllllllIllIIIllIIlllllIllIl);
            return new String(llllllllllllIllIIIllIIlllllIllII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIllIIlllllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIllIIlllllIlIll) {
            llllllllllllIllIIIllIIlllllIlIll.printStackTrace();
            return null;
        }
    }
    
    private static int lIIllIlIllIlIlll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public boolean func_175262_a() {
        if (lIIllIlIllIlIllI(this.field_175271_i)) {
            return GuiSpectator.llIllllIlllIIl[1] != 0;
        }
        return GuiSpectator.llIllllIlllIIl[0] != 0;
    }
    
    private static boolean lIIllIlIllIllIII(final int llllllllllllIllIIIllIIllllIIIIII) {
        return llllllllllllIllIIIllIIllllIIIIII <= 0;
    }
    
    private static boolean lIIllIlIllIllIlI(final int llllllllllllIllIIIllIIllllIlIlIl, final int llllllllllllIllIIIllIIllllIlIlII) {
        return llllllllllllIllIIIllIIllllIlIlIl >= llllllllllllIllIIIllIIllllIlIlII;
    }
    
    @Override
    public void func_175257_a(final SpectatorMenu llllllllllllIllIIIllIlIIIIIIIlIl) {
        this.field_175271_i = null;
        this.field_175270_h = 0L;
    }
    
    public GuiSpectator(final Minecraft llllllllllllIllIIIllIlIIIlllIIIl) {
        this.field_175268_g = llllllllllllIllIIIllIlIIIlllIIIl;
    }
    
    private static boolean lIIllIlIllIlIllI(final Object llllllllllllIllIIIllIIllllIIIllI) {
        return llllllllllllIllIIIllIIllllIIIllI != null;
    }
}
