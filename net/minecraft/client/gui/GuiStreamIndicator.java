// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.GlStateManager;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.Minecraft;

public class GuiStreamIndicator
{
    private final /* synthetic */ Minecraft mc;
    private static final /* synthetic */ String[] lIIIIllIIlIIll;
    private static final /* synthetic */ int[] lIIIlIIIIIllll;
    private static final /* synthetic */ ResourceLocation locationStreamIndicator;
    private /* synthetic */ int field_152444_d;
    private /* synthetic */ float field_152443_c;
    
    private static int lIllllIlllllIlI(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private int func_152440_b() {
        int n;
        if (lIllllIlllllIII(this.mc.getTwitchStream().isPaused() ? 1 : 0)) {
            n = GuiStreamIndicator.lIIIlIIIIIllll[6];
            "".length();
            if (-" ".length() > 0) {
                return (0x13 ^ 0x18) & ~(0x75 ^ 0x7E);
            }
        }
        else {
            n = GuiStreamIndicator.lIIIlIIIIIllll[0];
        }
        return n;
    }
    
    public GuiStreamIndicator(final Minecraft lllllllllllllIlIIIllIlIIlIllIIll) {
        this.field_152443_c = 1.0f;
        this.field_152444_d = GuiStreamIndicator.lIIIlIIIIIllll[1];
        this.mc = lllllllllllllIlIIIllIlIIlIllIIll;
    }
    
    private static boolean lIllllIlllllIII(final int lllllllllllllIlIIIllIlIIIlIlIIIl) {
        return lllllllllllllIlIIIllIlIIIlIlIIIl != 0;
    }
    
    private static int lIllllIlllllIll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static String lIllllIllllIlIl(final String lllllllllllllIlIIIllIlIIIlIlIllI, final String lllllllllllllIlIIIllIlIIIlIlIlIl) {
        try {
            final SecretKeySpec lllllllllllllIlIIIllIlIIIlIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIllIlIIIlIlIlIl.getBytes(StandardCharsets.UTF_8)), GuiStreamIndicator.lIIIlIIIIIllll[10]), "DES");
            final Cipher lllllllllllllIlIIIllIlIIIlIllIlI = Cipher.getInstance("DES");
            lllllllllllllIlIIIllIlIIIlIllIlI.init(GuiStreamIndicator.lIIIlIIIIIllll[11], lllllllllllllIlIIIllIlIIIlIllIll);
            return new String(lllllllllllllIlIIIllIlIIIlIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIllIlIIIlIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIllIlIIIlIllIIl) {
            lllllllllllllIlIIIllIlIIIlIllIIl.printStackTrace();
            return null;
        }
    }
    
    public void func_152439_a() {
        if (lIllllIlllllIII(this.mc.getTwitchStream().isBroadcasting() ? 1 : 0)) {
            this.field_152443_c += 0.025f * this.field_152444_d;
            if (lIllllIllllllII(lIllllIlllllIlI(this.field_152443_c, 0.0f))) {
                this.field_152444_d *= GuiStreamIndicator.lIIIlIIIIIllll[9];
                this.field_152443_c = 0.0f;
                "".length();
                if (((0xF ^ 0x24) & ~(0xB0 ^ 0x9B)) > 0) {
                    return;
                }
            }
            else if (lIllllIlllllIIl(lIllllIlllllIll(this.field_152443_c, 1.0f))) {
                this.field_152444_d *= GuiStreamIndicator.lIIIlIIIIIllll[9];
                this.field_152443_c = 1.0f;
                "".length();
                if (null != null) {
                    return;
                }
            }
        }
        else {
            this.field_152443_c = 1.0f;
            this.field_152444_d = GuiStreamIndicator.lIIIlIIIIIllll[1];
        }
    }
    
    static {
        lIllllIllllIlll();
        lIllllIllllIllI();
        locationStreamIndicator = new ResourceLocation(GuiStreamIndicator.lIIIIllIIlIIll[GuiStreamIndicator.lIIIlIIIIIllll[0]]);
    }
    
    private int func_152438_c() {
        int n;
        if (lIllllIlllllIII(this.mc.getTwitchStream().func_152929_G() ? 1 : 0)) {
            n = GuiStreamIndicator.lIIIlIIIIIllll[7];
            "".length();
            if (-" ".length() >= "  ".length()) {
                return (0xD2 ^ 0x97 ^ (0xA0 ^ 0xAA)) & (0x70 ^ 0x7 ^ (0x11 ^ 0x29) ^ -" ".length());
            }
        }
        else {
            n = GuiStreamIndicator.lIIIlIIIIIllll[8];
        }
        return n;
    }
    
    private static boolean lIllllIllllllII(final int lllllllllllllIlIIIllIlIIIlIIllll) {
        return lllllllllllllIlIIIllIlIIIlIIllll < 0;
    }
    
    private static boolean lIllllIlllllIIl(final int lllllllllllllIlIIIllIlIIIlIIllIl) {
        return lllllllllllllIlIIIllIlIIIlIIllIl > 0;
    }
    
    private void render(final int lllllllllllllIlIIIllIlIIIlllllll, final int lllllllllllllIlIIIllIlIIIllllllI, final int lllllllllllllIlIIIllIlIIIlllIIIl, final int lllllllllllllIlIIIllIlIIIlllllII) {
        GlStateManager.color(1.0f, 1.0f, 1.0f, 0.65f + 0.35000002f * this.field_152443_c);
        this.mc.getTextureManager().bindTexture(GuiStreamIndicator.locationStreamIndicator);
        final float lllllllllllllIlIIIllIlIIIllllIll = 150.0f;
        final float lllllllllllllIlIIIllIlIIIllllIlI = 0.0f;
        final float lllllllllllllIlIIIllIlIIIllllIIl = lllllllllllllIlIIIllIlIIIlllIIIl * 0.015625f;
        final float lllllllllllllIlIIIllIlIIIllllIII = 1.0f;
        final float lllllllllllllIlIIIllIlIIIlllIlll = (lllllllllllllIlIIIllIlIIIlllIIIl + GuiStreamIndicator.lIIIlIIIIIllll[6]) * 0.015625f;
        final Tessellator lllllllllllllIlIIIllIlIIIlllIllI = Tessellator.getInstance();
        final WorldRenderer lllllllllllllIlIIIllIlIIIlllIlIl = lllllllllllllIlIIIllIlIIIlllIllI.getWorldRenderer();
        lllllllllllllIlIIIllIlIIIlllIlIl.begin(GuiStreamIndicator.lIIIlIIIIIllll[3], DefaultVertexFormats.POSITION_TEX);
        lllllllllllllIlIIIllIlIIIlllIlIl.pos(lllllllllllllIlIIIllIlIIIlllllll - GuiStreamIndicator.lIIIlIIIIIllll[6] - lllllllllllllIlIIIllIlIIIlllllII, lllllllllllllIlIIIllIlIIIllllllI + GuiStreamIndicator.lIIIlIIIIIllll[6], lllllllllllllIlIIIllIlIIIllllIll).tex(lllllllllllllIlIIIllIlIIIllllIlI, lllllllllllllIlIIIllIlIIIlllIlll).endVertex();
        lllllllllllllIlIIIllIlIIIlllIlIl.pos(lllllllllllllIlIIIllIlIIIlllllll - lllllllllllllIlIIIllIlIIIlllllII, lllllllllllllIlIIIllIlIIIllllllI + GuiStreamIndicator.lIIIlIIIIIllll[6], lllllllllllllIlIIIllIlIIIllllIll).tex(lllllllllllllIlIIIllIlIIIllllIII, lllllllllllllIlIIIllIlIIIlllIlll).endVertex();
        lllllllllllllIlIIIllIlIIIlllIlIl.pos(lllllllllllllIlIIIllIlIIIlllllll - lllllllllllllIlIIIllIlIIIlllllII, lllllllllllllIlIIIllIlIIIllllllI + GuiStreamIndicator.lIIIlIIIIIllll[0], lllllllllllllIlIIIllIlIIIllllIll).tex(lllllllllllllIlIIIllIlIIIllllIII, lllllllllllllIlIIIllIlIIIllllIIl).endVertex();
        lllllllllllllIlIIIllIlIIIlllIlIl.pos(lllllllllllllIlIIIllIlIIIlllllll - GuiStreamIndicator.lIIIlIIIIIllll[6] - lllllllllllllIlIIIllIlIIIlllllII, lllllllllllllIlIIIllIlIIIllllllI + GuiStreamIndicator.lIIIlIIIIIllll[0], lllllllllllllIlIIIllIlIIIllllIll).tex(lllllllllllllIlIIIllIlIIIllllIlI, lllllllllllllIlIIIllIlIIIllllIIl).endVertex();
        lllllllllllllIlIIIllIlIIIlllIllI.draw();
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
    }
    
    private static void lIllllIllllIlll() {
        (lIIIlIIIIIllll = new int[12])[0] = ((0xE2 ^ 0xA6 ^ (0x79 ^ 0xC)) & (122 + 144 - 196 + 114 ^ 42 + 3 - 18 + 110 ^ -" ".length()));
        GuiStreamIndicator.lIIIlIIIIIllll[1] = " ".length();
        GuiStreamIndicator.lIIIlIIIIIllll[2] = (0x47 ^ 0x53);
        GuiStreamIndicator.lIIIlIIIIIllll[3] = (0x42 ^ 0x6 ^ (0x81 ^ 0xC2));
        GuiStreamIndicator.lIIIlIIIIIllll[4] = (-1 & 0xFFFFFF);
        GuiStreamIndicator.lIIIlIIIIIllll[5] = (92 + 109 - 158 + 137 ^ 142 + 60 - 172 + 135);
        GuiStreamIndicator.lIIIlIIIIIllll[6] = (103 + 49 - 113 + 101 ^ 76 + 135 - 94 + 39);
        GuiStreamIndicator.lIIIlIIIIIllll[7] = (121 + 28 - 128 + 119 ^ 12 + 72 - 67 + 171);
        GuiStreamIndicator.lIIIlIIIIIllll[8] = (136 + 30 - 117 + 141 ^ 55 + 100 - 140 + 143);
        GuiStreamIndicator.lIIIlIIIIIllll[9] = -" ".length();
        GuiStreamIndicator.lIIIlIIIIIllll[10] = (0x42 ^ 0x4A);
        GuiStreamIndicator.lIIIlIIIIIllll[11] = "  ".length();
    }
    
    private static void lIllllIllllIllI() {
        (lIIIIllIIlIIll = new String[GuiStreamIndicator.lIIIlIIIIIllll[1]])[GuiStreamIndicator.lIIIlIIIIIllll[0]] = lIllllIllllIlIl("MPpnWLOmeXuuYtvk1HRJFEu0A0xcBesqFJgo4lZlqCuo62VQNOE4WQ==", "wXTiA");
    }
    
    public void render(final int lllllllllllllIlIIIllIlIIlIIlIlll, final int lllllllllllllIlIIIllIlIIlIlIIIlI) {
        if (lIllllIlllllIII(this.mc.getTwitchStream().isBroadcasting() ? 1 : 0)) {
            GlStateManager.enableBlend();
            final int lllllllllllllIlIIIllIlIIlIlIIIIl = this.mc.getTwitchStream().func_152920_A();
            if (lIllllIlllllIIl(lllllllllllllIlIIIllIlIIlIlIIIIl)) {
                final String lllllllllllllIlIIIllIlIIlIlIIIII = String.valueOf(new StringBuilder().append(lllllllllllllIlIIIllIlIIlIlIIIIl));
                final int lllllllllllllIlIIIllIlIIlIIlllll = this.mc.fontRendererObj.getStringWidth(lllllllllllllIlIIIllIlIIlIlIIIII);
                final int lllllllllllllIlIIIllIlIIlIIllllI = GuiStreamIndicator.lIIIlIIIIIllll[2];
                final int lllllllllllllIlIIIllIlIIlIIlllIl = lllllllllllllIlIIIllIlIIlIIlIlll - lllllllllllllIlIIIllIlIIlIIlllll - GuiStreamIndicator.lIIIlIIIIIllll[1];
                final int lllllllllllllIlIIIllIlIIlIIlllII = lllllllllllllIlIIIllIlIIlIlIIIlI + GuiStreamIndicator.lIIIlIIIIIllll[2] - GuiStreamIndicator.lIIIlIIIIIllll[1];
                final int lllllllllllllIlIIIllIlIIlIIllIll = lllllllllllllIlIIIllIlIIlIlIIIlI + GuiStreamIndicator.lIIIlIIIIIllll[2] + this.mc.fontRendererObj.FONT_HEIGHT - GuiStreamIndicator.lIIIlIIIIIllll[1];
                GlStateManager.disableTexture2D();
                final Tessellator lllllllllllllIlIIIllIlIIlIIllIlI = Tessellator.getInstance();
                final WorldRenderer lllllllllllllIlIIIllIlIIlIIllIIl = lllllllllllllIlIIIllIlIIlIIllIlI.getWorldRenderer();
                GlStateManager.color(0.0f, 0.0f, 0.0f, (0.65f + 0.35000002f * this.field_152443_c) / 2.0f);
                lllllllllllllIlIIIllIlIIlIIllIIl.begin(GuiStreamIndicator.lIIIlIIIIIllll[3], DefaultVertexFormats.POSITION);
                lllllllllllllIlIIIllIlIIlIIllIIl.pos(lllllllllllllIlIIIllIlIIlIIlllIl, lllllllllllllIlIIIllIlIIlIIllIll, 0.0).endVertex();
                lllllllllllllIlIIIllIlIIlIIllIIl.pos(lllllllllllllIlIIIllIlIIlIIlIlll, lllllllllllllIlIIIllIlIIlIIllIll, 0.0).endVertex();
                lllllllllllllIlIIIllIlIIlIIllIIl.pos(lllllllllllllIlIIIllIlIIlIIlIlll, lllllllllllllIlIIIllIlIIlIIlllII, 0.0).endVertex();
                lllllllllllllIlIIIllIlIIlIIllIIl.pos(lllllllllllllIlIIIllIlIIlIIlllIl, lllllllllllllIlIIIllIlIIlIIlllII, 0.0).endVertex();
                lllllllllllllIlIIIllIlIIlIIllIlI.draw();
                GlStateManager.enableTexture2D();
                this.mc.fontRendererObj.drawString(lllllllllllllIlIIIllIlIIlIlIIIII, lllllllllllllIlIIIllIlIIlIIlIlll - lllllllllllllIlIIIllIlIIlIIlllll, lllllllllllllIlIIIllIlIIlIlIIIlI + GuiStreamIndicator.lIIIlIIIIIllll[2], GuiStreamIndicator.lIIIlIIIIIllll[4]);
                "".length();
            }
            this.render(lllllllllllllIlIIIllIlIIlIIlIlll, lllllllllllllIlIIIllIlIIlIlIIIlI, this.func_152440_b(), GuiStreamIndicator.lIIIlIIIIIllll[0]);
            this.render(lllllllllllllIlIIIllIlIIlIIlIlll, lllllllllllllIlIIIllIlIIlIlIIIlI, this.func_152438_c(), GuiStreamIndicator.lIIIlIIIIIllll[5]);
        }
    }
}
