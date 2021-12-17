// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.gui;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Random;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.apache.commons.io.Charsets;
import net.minecraft.util.EnumChatFormatting;
import com.google.common.collect.Lists;
import java.util.Arrays;
import net.minecraft.network.Packet;
import net.minecraft.network.play.client.C16PacketClientStatus;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import org.apache.logging.log4j.LogManager;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.client.audio.MusicTicker;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.ResourceLocation;
import java.util.List;
import org.apache.logging.log4j.Logger;

public class GuiWinGame extends GuiScreen
{
    private static final /* synthetic */ String[] lIllIIIIlIllIl;
    private /* synthetic */ float field_146578_s;
    private static final /* synthetic */ Logger logger;
    private /* synthetic */ int field_146579_r;
    private static final /* synthetic */ int[] lIllIIIIlIlllI;
    private /* synthetic */ List<String> field_146582_i;
    private static final /* synthetic */ ResourceLocation VIGNETTE_TEXTURE;
    private static final /* synthetic */ ResourceLocation MINECRAFT_LOGO;
    private /* synthetic */ int field_146581_h;
    
    private static void llllIllIlIllIII() {
        (lIllIIIIlIllIl = new String[GuiWinGame.lIllIIIIlIlllI[24]])[GuiWinGame.lIllIIIIlIlllI[0]] = llllIllIlIlIlIl("v02xUceQ59ZIkl6bqvnRjlZnft2AUNHyowqkrN/sdUmZPoJllb5z5w==", "HTNzE");
        GuiWinGame.lIllIIIIlIllIl[GuiWinGame.lIllIIIIlIlllI[1]] = llllIllIlIlIllI("7YGCSGICf3A1pKAV53s42cnPcvH40mq+l6zt5dN1/LY=", "qcWvW");
        GuiWinGame.lIllIIIIlIllIl[GuiWinGame.lIllIIIIlIlllI[3]] = llllIllIlIlIllI("IIuwEC/lKbs=", "ypbSO");
        GuiWinGame.lIllIIIIlIllIl[GuiWinGame.lIllIIIIlIlllI[5]] = llllIllIlIlIlIl("nTrPnBv1+tJytyW7JeyTsg==", "DUovf");
        GuiWinGame.lIllIIIIlIllIl[GuiWinGame.lIllIIIIlIlllI[6]] = llllIllIlIlIllI("3Ld4H53gQ6bd38lO6a0QkQ==", "xzcwt");
        GuiWinGame.lIllIIIIlIllIl[GuiWinGame.lIllIIIIlIlllI[7]] = llllIllIlIlIlll("ECEuCCkQIS4=", "HyvPq");
        GuiWinGame.lIllIIIIlIllIl[GuiWinGame.lIllIIIIlIlllI[8]] = llllIllIlIlIlIl("yVW3lFnIHfg=", "YnqGy");
        GuiWinGame.lIllIIIIlIllIl[GuiWinGame.lIllIIIIlIlllI[9]] = llllIllIlIlIllI("6JuxNhYW3bo=", "FUZvN");
        GuiWinGame.lIllIIIIlIllIl[GuiWinGame.lIllIIIIlIlllI[10]] = llllIllIlIlIlIl("4OQpOUYt+3R8XcXZ/rRKoY2zkL/mgNLj", "rrZlm");
        GuiWinGame.lIllIIIIlIllIl[GuiWinGame.lIllIIIIlIlllI[11]] = llllIllIlIlIlIl("G8Gi3p1HKMBhyUN0i2xoPw==", "KSlDA");
        GuiWinGame.lIllIIIIlIllIl[GuiWinGame.lIllIIIIlIlllI[12]] = llllIllIlIlIlIl("i8rbSx62OJw=", "UFqSW");
        GuiWinGame.lIllIIIIlIllIl[GuiWinGame.lIllIIIIlIlllI[13]] = llllIllIlIlIllI("zIK7MYLNpSQ=", "kCsiy");
        GuiWinGame.lIllIIIIlIllIl[GuiWinGame.lIllIIIIlIlllI[14]] = llllIllIlIlIllI("WFladAqy+KY=", "PZHIy");
        GuiWinGame.lIllIIIIlIllIl[GuiWinGame.lIllIIIIlIlllI[15]] = llllIllIlIlIlll("DRgPPwUgUA5zDSEWHnMCPBIeOhU9", "NwzSa");
        GuiWinGame.lIllIIIIlIllIl[GuiWinGame.lIllIIIIlIlllI[21]] = llllIllIlIlIlIl("kmAtE4Vt6dE=", "MPFct");
    }
    
    @Override
    public boolean doesGuiPauseGame() {
        return GuiWinGame.lIllIIIIlIlllI[1] != 0;
    }
    
    private static int llllIllIllIIlII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    @Override
    public void drawScreen(final int lllllllllllllIIIIIllllIlllIllIIl, final int lllllllllllllIIIIIllllIlllIllIII, final float lllllllllllllIIIIIllllIlllIlIlll) {
        this.drawWinGameScreen(lllllllllllllIIIIIllllIlllIllIIl, lllllllllllllIIIIIllllIlllIllIII, lllllllllllllIIIIIllllIlllIlIlll);
        final Tessellator lllllllllllllIIIIIllllIlllIlIllI = Tessellator.getInstance();
        final WorldRenderer lllllllllllllIIIIIllllIlllIlIlIl = lllllllllllllIIIIIllllIlllIlIllI.getWorldRenderer();
        final int lllllllllllllIIIIIllllIlllIlIlII = GuiWinGame.lIllIIIIlIlllI[4];
        final int lllllllllllllIIIIIllllIlllIlIIll = this.width / GuiWinGame.lIllIIIIlIlllI[3] - lllllllllllllIIIIIllllIlllIlIlII / GuiWinGame.lIllIIIIlIlllI[3];
        final int lllllllllllllIIIIIllllIlllIlIIlI = this.height + GuiWinGame.lIllIIIIlIlllI[16];
        final float lllllllllllllIIIIIllllIlllIlIIIl = -(this.field_146581_h + lllllllllllllIIIIIllllIlllIlIlll) * this.field_146578_s;
        GlStateManager.pushMatrix();
        GlStateManager.translate(0.0f, lllllllllllllIIIIIllllIlllIlIIIl, 0.0f);
        this.mc.getTextureManager().bindTexture(GuiWinGame.MINECRAFT_LOGO);
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        this.drawTexturedModalRect(lllllllllllllIIIIIllllIlllIlIIll, lllllllllllllIIIIIllllIlllIlIIlI, GuiWinGame.lIllIIIIlIlllI[0], GuiWinGame.lIllIIIIlIlllI[0], GuiWinGame.lIllIIIIlIlllI[17], GuiWinGame.lIllIIIIlIlllI[18]);
        this.drawTexturedModalRect(lllllllllllllIIIIIllllIlllIlIIll + GuiWinGame.lIllIIIIlIlllI[17], lllllllllllllIIIIIllllIlllIlIIlI, GuiWinGame.lIllIIIIlIlllI[0], GuiWinGame.lIllIIIIlIlllI[19], GuiWinGame.lIllIIIIlIlllI[17], GuiWinGame.lIllIIIIlIlllI[18]);
        int lllllllllllllIIIIIllllIlllIlIIII = lllllllllllllIIIIIllllIlllIlIIlI + GuiWinGame.lIllIIIIlIlllI[20];
        int lllllllllllllIIIIIllllIlllIIllll = GuiWinGame.lIllIIIIlIlllI[0];
        "".length();
        if (" ".length() <= 0) {
            return;
        }
        while (!llllIllIlIlllll(lllllllllllllIIIIIllllIlllIIllll, this.field_146582_i.size())) {
            if (llllIllIlIlllIl(lllllllllllllIIIIIllllIlllIIllll, this.field_146582_i.size() - GuiWinGame.lIllIIIIlIlllI[1])) {
                final float lllllllllllllIIIIIllllIlllIIlllI = lllllllllllllIIIIIllllIlllIlIIII + lllllllllllllIIIIIllllIlllIlIIIl - (this.height / GuiWinGame.lIllIIIIlIlllI[3] - GuiWinGame.lIllIIIIlIlllI[8]);
                if (llllIllIllIIIlI(llllIllIllIIIll(lllllllllllllIIIIIllllIlllIIlllI, 0.0f))) {
                    GlStateManager.translate(0.0f, -lllllllllllllIIIIIllllIlllIIlllI, 0.0f);
                }
            }
            if (llllIllIlIlllII(llllIllIllIIlII(lllllllllllllIIIIIllllIlllIlIIII + lllllllllllllIIIIIllllIlllIlIIIl + 12.0f + 8.0f, 0.0f)) && llllIllIllIIIlI(llllIllIllIIIll(lllllllllllllIIIIIllllIlllIlIIII + lllllllllllllIIIIIllllIlllIlIIIl, (float)this.height))) {
                final String lllllllllllllIIIIIllllIlllIIllIl = this.field_146582_i.get(lllllllllllllIIIIIllllIlllIIllll);
                if (llllIllIllIIlIl(lllllllllllllIIIIIllllIlllIIllIl.startsWith(GuiWinGame.lIllIIIIlIllIl[GuiWinGame.lIllIIIIlIlllI[21]]) ? 1 : 0)) {
                    this.fontRendererObj.drawStringWithShadow(lllllllllllllIIIIIllllIlllIIllIl.substring(GuiWinGame.lIllIIIIlIlllI[5]), (float)(lllllllllllllIIIIIllllIlllIlIIll + (lllllllllllllIIIIIllllIlllIlIlII - this.fontRendererObj.getStringWidth(lllllllllllllIIIIIllllIlllIIllIl.substring(GuiWinGame.lIllIIIIlIlllI[5]))) / GuiWinGame.lIllIIIIlIlllI[3]), (float)lllllllllllllIIIIIllllIlllIlIIII, GuiWinGame.lIllIIIIlIlllI[22]);
                    "".length();
                    "".length();
                    if ("   ".length() < "  ".length()) {
                        return;
                    }
                }
                else {
                    this.fontRendererObj.fontRandom.setSeed(lllllllllllllIIIIIllllIlllIIllll * 4238972211L + this.field_146581_h / GuiWinGame.lIllIIIIlIlllI[6]);
                    this.fontRendererObj.drawStringWithShadow(lllllllllllllIIIIIllllIlllIIllIl, (float)lllllllllllllIIIIIllllIlllIlIIll, (float)lllllllllllllIIIIIllllIlllIlIIII, GuiWinGame.lIllIIIIlIlllI[22]);
                    "".length();
                }
            }
            lllllllllllllIIIIIllllIlllIlIIII += 12;
            ++lllllllllllllIIIIIllllIlllIIllll;
        }
        GlStateManager.popMatrix();
        this.mc.getTextureManager().bindTexture(GuiWinGame.VIGNETTE_TEXTURE);
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(GuiWinGame.lIllIIIIlIlllI[0], GuiWinGame.lIllIIIIlIlllI[23]);
        final int lllllllllllllIIIIIllllIlllIIllII = this.width;
        final int lllllllllllllIIIIIllllIlllIIlIll = this.height;
        lllllllllllllIIIIIllllIlllIlIlIl.begin(GuiWinGame.lIllIIIIlIlllI[9], DefaultVertexFormats.POSITION_TEX_COLOR);
        lllllllllllllIIIIIllllIlllIlIlIl.pos(0.0, lllllllllllllIIIIIllllIlllIIlIll, this.zLevel).tex(0.0, 1.0).color(1.0f, 1.0f, 1.0f, 1.0f).endVertex();
        lllllllllllllIIIIIllllIlllIlIlIl.pos(lllllllllllllIIIIIllllIlllIIllII, lllllllllllllIIIIIllllIlllIIlIll, this.zLevel).tex(1.0, 1.0).color(1.0f, 1.0f, 1.0f, 1.0f).endVertex();
        lllllllllllllIIIIIllllIlllIlIlIl.pos(lllllllllllllIIIIIllllIlllIIllII, 0.0, this.zLevel).tex(1.0, 0.0).color(1.0f, 1.0f, 1.0f, 1.0f).endVertex();
        lllllllllllllIIIIIllllIlllIlIlIl.pos(0.0, 0.0, this.zLevel).tex(0.0, 0.0).color(1.0f, 1.0f, 1.0f, 1.0f).endVertex();
        lllllllllllllIIIIIllllIlllIlIllI.draw();
        GlStateManager.disableBlend();
        super.drawScreen(lllllllllllllIIIIIllllIlllIllIIl, lllllllllllllIIIIIllllIlllIllIII, lllllllllllllIIIIIllllIlllIlIlll);
    }
    
    private static String llllIllIlIlIlll(String lllllllllllllIIIIIllllIllIlIlllI, final String lllllllllllllIIIIIllllIllIllIIlI) {
        lllllllllllllIIIIIllllIllIlIlllI = (double)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIIllllIllIlIlllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIIllllIllIllIIIl = new StringBuilder();
        final char[] lllllllllllllIIIIIllllIllIllIIII = lllllllllllllIIIIIllllIllIllIIlI.toCharArray();
        int lllllllllllllIIIIIllllIllIlIllll = GuiWinGame.lIllIIIIlIlllI[0];
        final char lllllllllllllIIIIIllllIllIlIlIIl = (Object)((String)lllllllllllllIIIIIllllIllIlIlllI).toCharArray();
        final int lllllllllllllIIIIIllllIllIlIlIII = lllllllllllllIIIIIllllIllIlIlIIl.length;
        short lllllllllllllIIIIIllllIllIlIIlll = (short)GuiWinGame.lIllIIIIlIlllI[0];
        while (llllIllIllIIllI(lllllllllllllIIIIIllllIllIlIIlll, lllllllllllllIIIIIllllIllIlIlIII)) {
            final char lllllllllllllIIIIIllllIllIllIlII = lllllllllllllIIIIIllllIllIlIlIIl[lllllllllllllIIIIIllllIllIlIIlll];
            lllllllllllllIIIIIllllIllIllIIIl.append((char)(lllllllllllllIIIIIllllIllIllIlII ^ lllllllllllllIIIIIllllIllIllIIII[lllllllllllllIIIIIllllIllIlIllll % lllllllllllllIIIIIllllIllIllIIII.length]));
            "".length();
            ++lllllllllllllIIIIIllllIllIlIllll;
            ++lllllllllllllIIIIIllllIllIlIIlll;
            "".length();
            if ((146 + 95 - 141 + 74 ^ 16 + 122 - 48 + 80) <= ((0x4 ^ 0x43 ^ (0x19 ^ 0x12)) & (0xE0 ^ 0x86 ^ (0x63 ^ 0x49) ^ -" ".length()))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIIllllIllIllIIIl);
    }
    
    private static boolean llllIllIlIlllll(final int lllllllllllllIIIIIllllIllIIIIlIl, final int lllllllllllllIIIIIllllIllIIIIlII) {
        return lllllllllllllIIIIIllllIllIIIIlIl >= lllllllllllllIIIIIllllIllIIIIlII;
    }
    
    @Override
    public void updateScreen() {
        final MusicTicker lllllllllllllIIIIIlllllIIIllllII = this.mc.func_181535_r();
        final SoundHandler lllllllllllllIIIIIlllllIIIlllIll = this.mc.getSoundHandler();
        if (llllIllIlIllIll(this.field_146581_h)) {
            lllllllllllllIIIIIlllllIIIllllII.func_181557_a();
            lllllllllllllIIIIIlllllIIIllllII.func_181558_a(MusicTicker.MusicType.CREDITS);
            lllllllllllllIIIIIlllllIIIlllIll.resumeSounds();
        }
        lllllllllllllIIIIIlllllIIIlllIll.update();
        this.field_146581_h += GuiWinGame.lIllIIIIlIlllI[1];
        final float lllllllllllllIIIIIlllllIIIlllIlI = (this.field_146579_r + this.height + this.height + GuiWinGame.lIllIIIIlIlllI[2]) / this.field_146578_s;
        if (llllIllIlIlllII(llllIllIlIllIlI((float)this.field_146581_h, lllllllllllllIIIIIlllllIIIlllIlI))) {
            this.sendRespawnPacket();
        }
    }
    
    private static void llllIllIlIllIIl() {
        (lIllIIIIlIlllI = new int[25])[0] = ((0x23 ^ 0x2F) & ~(0x59 ^ 0x55));
        GuiWinGame.lIllIIIIlIlllI[1] = " ".length();
        GuiWinGame.lIllIIIIlIlllI[2] = (0x2E ^ 0x36);
        GuiWinGame.lIllIIIIlIlllI[3] = "  ".length();
        GuiWinGame.lIllIIIIlIlllI[4] = (0xFFFFAD57 & 0x53BA);
        GuiWinGame.lIllIIIIlIlllI[5] = "   ".length();
        GuiWinGame.lIllIIIIlIlllI[6] = (0x35 ^ 0x51 ^ (0x68 ^ 0x8));
        GuiWinGame.lIllIIIIlIlllI[7] = (0x67 ^ 0x62);
        GuiWinGame.lIllIIIIlIlllI[8] = (0xB1 ^ 0xB7);
        GuiWinGame.lIllIIIIlIlllI[9] = (0xD9 ^ 0xAA ^ (0x14 ^ 0x60));
        GuiWinGame.lIllIIIIlIlllI[10] = (0x6C ^ 0x64);
        GuiWinGame.lIllIIIIlIlllI[11] = (0x8E ^ 0x87);
        GuiWinGame.lIllIIIIlIlllI[12] = (0x65 ^ 0x6F);
        GuiWinGame.lIllIIIIlIlllI[13] = (3 + 27 + 59 + 48 ^ 56 + 55 - 53 + 72);
        GuiWinGame.lIllIIIIlIlllI[14] = (86 + 22 + 1 + 91 ^ 193 + 98 - 165 + 70);
        GuiWinGame.lIllIIIIlIlllI[15] = (108 + 4 - 52 + 97 ^ 4 + 2 + 59 + 79);
        GuiWinGame.lIllIIIIlIlllI[16] = (0xCB ^ 0x86 ^ 99 + 22 - 98 + 104);
        GuiWinGame.lIllIIIIlIlllI[17] = (0x19 ^ 0x11) + (2 + 58 + 71 + 1) - (0x4D ^ 0x75) + (0xC5 ^ 0x82);
        GuiWinGame.lIllIIIIlIlllI[18] = (52 + 56 - 10 + 78 ^ 13 + 11 + 115 + 17);
        GuiWinGame.lIllIIIIlIlllI[19] = (0xD6 ^ 0x89 ^ (0x68 ^ 0x1A));
        GuiWinGame.lIllIIIIlIlllI[20] = 108 + 82 - 175 + 185;
        GuiWinGame.lIllIIIIlIlllI[21] = (0x77 ^ 0x79);
        GuiWinGame.lIllIIIIlIlllI[22] = (-" ".length() & (-1 & 0xFFFFFF));
        GuiWinGame.lIllIIIIlIlllI[23] = (-(0xFFFFDD3F & 0x2EF7) & (0xFFFFBFFF & 0x4F37));
        GuiWinGame.lIllIIIIlIlllI[24] = (0xA8 ^ 0xA7);
    }
    
    private static int llllIllIllIIIll(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean llllIllIlIllllI(final Object lllllllllllllIIIIIllllIlIllllllI) {
        return lllllllllllllIIIIIllllIlIllllllI == null;
    }
    
    static {
        llllIllIlIllIIl();
        llllIllIlIllIII();
        logger = LogManager.getLogger();
        MINECRAFT_LOGO = new ResourceLocation(GuiWinGame.lIllIIIIlIllIl[GuiWinGame.lIllIIIIlIlllI[0]]);
        VIGNETTE_TEXTURE = new ResourceLocation(GuiWinGame.lIllIIIIlIllIl[GuiWinGame.lIllIIIIlIlllI[1]]);
    }
    
    private static boolean llllIllIlIllIll(final int lllllllllllllIIIIIllllIlIllllIlI) {
        return lllllllllllllIIIIIllllIlIllllIlI == 0;
    }
    
    private static int llllIllIllIIIIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean llllIllIlIlllIl(final int lllllllllllllIIIIIllllIllIIIlIIl, final int lllllllllllllIIIIIllllIllIIIlIII) {
        return lllllllllllllIIIIIllllIllIIIlIIl == lllllllllllllIIIIIllllIllIIIlIII;
    }
    
    private static int llllIllIlIllIlI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static String llllIllIlIlIllI(final String lllllllllllllIIIIIllllIllIIIllll, final String lllllllllllllIIIIIllllIllIIlIIII) {
        try {
            final SecretKeySpec lllllllllllllIIIIIllllIllIIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIllllIllIIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIIllllIllIIlIIll = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIIllllIllIIlIIll.init(GuiWinGame.lIllIIIIlIlllI[3], lllllllllllllIIIIIllllIllIIlIlII);
            return new String(lllllllllllllIIIIIllllIllIIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIllllIllIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIllllIllIIlIIlI) {
            lllllllllllllIIIIIllllIllIIlIIlI.printStackTrace();
            return null;
        }
    }
    
    private static int llllIllIllIIIII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean llllIllIllIIIlI(final int lllllllllllllIIIIIllllIlIllllIII) {
        return lllllllllllllIIIIIllllIlIllllIII < 0;
    }
    
    private void sendRespawnPacket() {
        this.mc.thePlayer.sendQueue.addToSendQueue(new C16PacketClientStatus(C16PacketClientStatus.EnumState.PERFORM_RESPAWN));
        this.mc.displayGuiScreen(null);
    }
    
    private static boolean llllIllIllIIllI(final int lllllllllllllIIIIIllllIllIIIIIIl, final int lllllllllllllIIIIIllllIllIIIIIII) {
        return lllllllllllllIIIIIllllIllIIIIIIl < lllllllllllllIIIIIllllIllIIIIIII;
    }
    
    private static String llllIllIlIlIlIl(final String lllllllllllllIIIIIllllIllIIllllI, final String lllllllllllllIIIIIllllIllIIllIll) {
        try {
            final SecretKeySpec lllllllllllllIIIIIllllIllIlIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIllllIllIIllIll.getBytes(StandardCharsets.UTF_8)), GuiWinGame.lIllIIIIlIlllI[10]), "DES");
            final Cipher lllllllllllllIIIIIllllIllIlIIIII = Cipher.getInstance("DES");
            lllllllllllllIIIIIllllIllIlIIIII.init(GuiWinGame.lIllIIIIlIlllI[3], lllllllllllllIIIIIllllIllIlIIIIl);
            return new String(lllllllllllllIIIIIllllIllIlIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIllllIllIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIllllIllIIlllll) {
            lllllllllllllIIIIIllllIllIIlllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean llllIllIllIIlIl(final int lllllllllllllIIIIIllllIlIlllllII) {
        return lllllllllllllIIIIIllllIlIlllllII != 0;
    }
    
    public GuiWinGame() {
        this.field_146578_s = 0.5f;
    }
    
    private static boolean llllIllIlIlllII(final int lllllllllllllIIIIIllllIlIlllIllI) {
        return lllllllllllllIIIIIllllIlIlllIllI > 0;
    }
    
    @Override
    public void initGui() {
        if (llllIllIlIllllI(this.field_146582_i)) {
            this.field_146582_i = (List<String>)Lists.newArrayList();
            try {
                String lllllllllllllIIIIIlllllIIIIlllll = GuiWinGame.lIllIIIIlIllIl[GuiWinGame.lIllIIIIlIlllI[3]];
                final String lllllllllllllIIIIIlllllIIIIllllI = String.valueOf(new StringBuilder().append(EnumChatFormatting.WHITE).append(EnumChatFormatting.OBFUSCATED).append(EnumChatFormatting.GREEN).append(EnumChatFormatting.AQUA));
                final int lllllllllllllIIIIIlllllIIIIlllIl = GuiWinGame.lIllIIIIlIlllI[4];
                InputStream lllllllllllllIIIIIlllllIIIIlllII = this.mc.getResourceManager().getResource(new ResourceLocation(GuiWinGame.lIllIIIIlIllIl[GuiWinGame.lIllIIIIlIlllI[5]])).getInputStream();
                BufferedReader lllllllllllllIIIIIlllllIIIIllIll = new BufferedReader(new InputStreamReader(lllllllllllllIIIIIlllllIIIIlllII, Charsets.UTF_8));
                final Random lllllllllllllIIIIIlllllIIIIllIlI = new Random(8124371L);
                "".length();
                if (" ".length() == 0) {
                    return;
                }
                while (!llllIllIlIllllI(lllllllllllllIIIIIlllllIIIIlllll = lllllllllllllIIIIIlllllIIIIllIll.readLine())) {
                    lllllllllllllIIIIIlllllIIIIlllll = lllllllllllllIIIIIlllllIIIIlllll.replaceAll(GuiWinGame.lIllIIIIlIllIl[GuiWinGame.lIllIIIIlIlllI[6]], this.mc.getSession().getUsername());
                    "".length();
                    if ("   ".length() > (0x8A ^ 0x8E)) {
                        return;
                    }
                    while (!llllIllIlIllIll(lllllllllllllIIIIIlllllIIIIlllll.contains(lllllllllllllIIIIIlllllIIIIllllI) ? 1 : 0)) {
                        final int lllllllllllllIIIIIlllllIIIIlIlll = lllllllllllllIIIIIlllllIIIIlllll.indexOf(lllllllllllllIIIIIlllllIIIIllllI);
                        final String lllllllllllllIIIIIlllllIIIIllIIl = lllllllllllllIIIIIlllllIIIIlllll.substring(GuiWinGame.lIllIIIIlIlllI[0], lllllllllllllIIIIIlllllIIIIlIlll);
                        final String lllllllllllllIIIIIlllllIIIIllIII = lllllllllllllIIIIIlllllIIIIlllll.substring(lllllllllllllIIIIIlllllIIIIlIlll + lllllllllllllIIIIIlllllIIIIllllI.length());
                        lllllllllllllIIIIIlllllIIIIlllll = String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIIIIIlllllIIIIllIIl)).append(EnumChatFormatting.WHITE).append(EnumChatFormatting.OBFUSCATED).append(GuiWinGame.lIllIIIIlIllIl[GuiWinGame.lIllIIIIlIlllI[7]].substring(GuiWinGame.lIllIIIIlIlllI[0], lllllllllllllIIIIIlllllIIIIllIlI.nextInt(GuiWinGame.lIllIIIIlIlllI[6]) + GuiWinGame.lIllIIIIlIlllI[5])).append(lllllllllllllIIIIIlllllIIIIllIII));
                    }
                    this.field_146582_i.addAll(this.mc.fontRendererObj.listFormattedStringToWidth(lllllllllllllIIIIIlllllIIIIlllll, lllllllllllllIIIIIlllllIIIIlllIl));
                    "".length();
                    this.field_146582_i.add(GuiWinGame.lIllIIIIlIllIl[GuiWinGame.lIllIIIIlIlllI[8]]);
                    "".length();
                }
                lllllllllllllIIIIIlllllIIIIlllII.close();
                int lllllllllllllIIIIIlllllIIIIlIllI = GuiWinGame.lIllIIIIlIlllI[0];
                "".length();
                if ((0x99 ^ 0x9D) == 0x0) {
                    return;
                }
                while (!llllIllIlIlllll(lllllllllllllIIIIIlllllIIIIlIllI, GuiWinGame.lIllIIIIlIlllI[10])) {
                    this.field_146582_i.add(GuiWinGame.lIllIIIIlIllIl[GuiWinGame.lIllIIIIlIlllI[9]]);
                    "".length();
                    ++lllllllllllllIIIIIlllllIIIIlIllI;
                }
                lllllllllllllIIIIIlllllIIIIlllII = this.mc.getResourceManager().getResource(new ResourceLocation(GuiWinGame.lIllIIIIlIllIl[GuiWinGame.lIllIIIIlIlllI[10]])).getInputStream();
                lllllllllllllIIIIIlllllIIIIllIll = new BufferedReader(new InputStreamReader(lllllllllllllIIIIIlllllIIIIlllII, Charsets.UTF_8));
                "".length();
                if ((0x55 ^ 0x50) == 0x0) {
                    return;
                }
                while (!llllIllIlIllllI(lllllllllllllIIIIIlllllIIIIlllll = lllllllllllllIIIIIlllllIIIIllIll.readLine())) {
                    lllllllllllllIIIIIlllllIIIIlllll = lllllllllllllIIIIIlllllIIIIlllll.replaceAll(GuiWinGame.lIllIIIIlIllIl[GuiWinGame.lIllIIIIlIlllI[11]], this.mc.getSession().getUsername());
                    lllllllllllllIIIIIlllllIIIIlllll = lllllllllllllIIIIIlllllIIIIlllll.replaceAll(GuiWinGame.lIllIIIIlIllIl[GuiWinGame.lIllIIIIlIlllI[12]], GuiWinGame.lIllIIIIlIllIl[GuiWinGame.lIllIIIIlIlllI[13]]);
                    this.field_146582_i.addAll(this.mc.fontRendererObj.listFormattedStringToWidth(lllllllllllllIIIIIlllllIIIIlllll, lllllllllllllIIIIIlllllIIIIlllIl));
                    "".length();
                    this.field_146582_i.add(GuiWinGame.lIllIIIIlIllIl[GuiWinGame.lIllIIIIlIlllI[14]]);
                    "".length();
                }
                lllllllllllllIIIIIlllllIIIIlllII.close();
                this.field_146579_r = this.field_146582_i.size() * GuiWinGame.lIllIIIIlIlllI[14];
                "".length();
                if (-"  ".length() >= 0) {
                    return;
                }
            }
            catch (Exception lllllllllllllIIIIIlllllIIIIlIlIl) {
                GuiWinGame.logger.error(GuiWinGame.lIllIIIIlIllIl[GuiWinGame.lIllIIIIlIlllI[15]], (Throwable)lllllllllllllIIIIIlllllIIIIlIlIl);
            }
        }
    }
    
    private void drawWinGameScreen(final int lllllllllllllIIIIIllllIllllllllI, final int lllllllllllllIIIIIllllIlllllllIl, final float lllllllllllllIIIIIllllIlllllIIIl) {
        final Tessellator lllllllllllllIIIIIllllIllllllIll = Tessellator.getInstance();
        final WorldRenderer lllllllllllllIIIIIllllIllllllIlI = lllllllllllllIIIIIllllIllllllIll.getWorldRenderer();
        this.mc.getTextureManager().bindTexture(Gui.optionsBackground);
        lllllllllllllIIIIIllllIllllllIlI.begin(GuiWinGame.lIllIIIIlIlllI[9], DefaultVertexFormats.POSITION_TEX_COLOR);
        final int lllllllllllllIIIIIllllIllllllIIl = this.width;
        final float lllllllllllllIIIIIllllIllllllIII = 0.0f - (this.field_146581_h + lllllllllllllIIIIIllllIlllllIIIl) * 0.5f * this.field_146578_s;
        final float lllllllllllllIIIIIllllIlllllIlll = this.height - (this.field_146581_h + lllllllllllllIIIIIllllIlllllIIIl) * 0.5f * this.field_146578_s;
        final float lllllllllllllIIIIIllllIlllllIllI = 0.015625f;
        float lllllllllllllIIIIIllllIlllllIlIl = (this.field_146581_h + lllllllllllllIIIIIllllIlllllIIIl - 0.0f) * 0.02f;
        final float lllllllllllllIIIIIllllIlllllIlII = (this.field_146579_r + this.height + this.height + GuiWinGame.lIllIIIIlIlllI[2]) / this.field_146578_s;
        final float lllllllllllllIIIIIllllIlllllIIll = (lllllllllllllIIIIIllllIlllllIlII - 20.0f - (this.field_146581_h + lllllllllllllIIIIIllllIlllllIIIl)) * 0.005f;
        if (llllIllIllIIIlI(llllIllIllIIIII(lllllllllllllIIIIIllllIlllllIIll, lllllllllllllIIIIIllllIlllllIlIl))) {
            lllllllllllllIIIIIllllIlllllIlIl = lllllllllllllIIIIIllllIlllllIIll;
        }
        if (llllIllIlIlllII(llllIllIllIIIIl(lllllllllllllIIIIIllllIlllllIlIl, 1.0f))) {
            lllllllllllllIIIIIllllIlllllIlIl = 1.0f;
        }
        lllllllllllllIIIIIllllIlllllIlIl *= lllllllllllllIIIIIllllIlllllIlIl;
        lllllllllllllIIIIIllllIlllllIlIl = lllllllllllllIIIIIllllIlllllIlIl * 96.0f / 255.0f;
        lllllllllllllIIIIIllllIllllllIlI.pos(0.0, this.height, this.zLevel).tex(0.0, lllllllllllllIIIIIllllIllllllIII * lllllllllllllIIIIIllllIlllllIllI).color(lllllllllllllIIIIIllllIlllllIlIl, lllllllllllllIIIIIllllIlllllIlIl, lllllllllllllIIIIIllllIlllllIlIl, 1.0f).endVertex();
        lllllllllllllIIIIIllllIllllllIlI.pos(lllllllllllllIIIIIllllIllllllIIl, this.height, this.zLevel).tex(lllllllllllllIIIIIllllIllllllIIl * lllllllllllllIIIIIllllIlllllIllI, lllllllllllllIIIIIllllIllllllIII * lllllllllllllIIIIIllllIlllllIllI).color(lllllllllllllIIIIIllllIlllllIlIl, lllllllllllllIIIIIllllIlllllIlIl, lllllllllllllIIIIIllllIlllllIlIl, 1.0f).endVertex();
        lllllllllllllIIIIIllllIllllllIlI.pos(lllllllllllllIIIIIllllIllllllIIl, 0.0, this.zLevel).tex(lllllllllllllIIIIIllllIllllllIIl * lllllllllllllIIIIIllllIlllllIllI, lllllllllllllIIIIIllllIlllllIlll * lllllllllllllIIIIIllllIlllllIllI).color(lllllllllllllIIIIIllllIlllllIlIl, lllllllllllllIIIIIllllIlllllIlIl, lllllllllllllIIIIIllllIlllllIlIl, 1.0f).endVertex();
        lllllllllllllIIIIIllllIllllllIlI.pos(0.0, 0.0, this.zLevel).tex(0.0, lllllllllllllIIIIIllllIlllllIlll * lllllllllllllIIIIIllllIlllllIllI).color(lllllllllllllIIIIIllllIlllllIlIl, lllllllllllllIIIIIllllIlllllIlIl, lllllllllllllIIIIIllllIlllllIlIl, 1.0f).endVertex();
        lllllllllllllIIIIIllllIllllllIll.draw();
    }
    
    @Override
    protected void keyTyped(final char lllllllllllllIIIIIlllllIIIllIIlI, final int lllllllllllllIIIIIlllllIIIlIllll) throws IOException {
        if (llllIllIlIlllIl(lllllllllllllIIIIIlllllIIIlIllll, GuiWinGame.lIllIIIIlIlllI[1])) {
            this.sendRespawnPacket();
        }
    }
}
