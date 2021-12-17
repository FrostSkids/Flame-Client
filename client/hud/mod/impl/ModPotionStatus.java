// 
// Decompiled by Procyon v0.5.36
// 

package client.hud.mod.impl;

import java.util.Iterator;
import java.util.Collection;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.client.renderer.GlStateManager;
import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.gui.FontRenderer;
import client.hud.mod.HudMod;

public class ModPotionStatus extends HudMod
{
    private static final /* synthetic */ String[] lIlIlllIIIIllI;
    private static final /* synthetic */ int[] lIlIlllIIIlIII;
    protected /* synthetic */ float zLevelFloat;
    
    public void drawTexturedModalRect(final int lllllllllllllIIIIlIllllIlllIIIIl, final int lllllllllllllIIIIlIllllIlllIIIII, final int lllllllllllllIIIIlIllllIlllIlIlI, final int lllllllllllllIIIIlIllllIllIllllI, final int lllllllllllllIIIIlIllllIlllIlIII, final int lllllllllllllIIIIlIllllIlllIIlll) {
        final float lllllllllllllIIIIlIllllIlllIIllI = 0.00390625f;
        final float lllllllllllllIIIIlIllllIlllIIlIl = 0.00390625f;
        final Tessellator lllllllllllllIIIIlIllllIlllIIlII = Tessellator.getInstance();
        final WorldRenderer lllllllllllllIIIIlIllllIlllIIIll = lllllllllllllIIIIlIllllIlllIIlII.getWorldRenderer();
        lllllllllllllIIIIlIllllIlllIIIll.begin(ModPotionStatus.lIlIlllIIIlIII[5], DefaultVertexFormats.POSITION_TEX);
        lllllllllllllIIIIlIllllIlllIIIll.pos(lllllllllllllIIIIlIllllIlllIIIIl + ModPotionStatus.lIlIlllIIIlIII[0], lllllllllllllIIIIlIllllIlllIIIII + lllllllllllllIIIIlIllllIlllIIlll, this.zLevelFloat).tex((lllllllllllllIIIIlIllllIlllIlIlI + ModPotionStatus.lIlIlllIIIlIII[0]) * lllllllllllllIIIIlIllllIlllIIllI, (lllllllllllllIIIIlIllllIllIllllI + lllllllllllllIIIIlIllllIlllIIlll) * lllllllllllllIIIIlIllllIlllIIlIl).endVertex();
        lllllllllllllIIIIlIllllIlllIIIll.pos(lllllllllllllIIIIlIllllIlllIIIIl + lllllllllllllIIIIlIllllIlllIlIII, lllllllllllllIIIIlIllllIlllIIIII + lllllllllllllIIIIlIllllIlllIIlll, this.zLevelFloat).tex((lllllllllllllIIIIlIllllIlllIlIlI + lllllllllllllIIIIlIllllIlllIlIII) * lllllllllllllIIIIlIllllIlllIIllI, (lllllllllllllIIIIlIllllIllIllllI + lllllllllllllIIIIlIllllIlllIIlll) * lllllllllllllIIIIlIllllIlllIIlIl).endVertex();
        lllllllllllllIIIIlIllllIlllIIIll.pos(lllllllllllllIIIIlIllllIlllIIIIl + lllllllllllllIIIIlIllllIlllIlIII, lllllllllllllIIIIlIllllIlllIIIII + ModPotionStatus.lIlIlllIIIlIII[0], this.zLevelFloat).tex((lllllllllllllIIIIlIllllIlllIlIlI + lllllllllllllIIIIlIllllIlllIlIII) * lllllllllllllIIIIlIllllIlllIIllI, (lllllllllllllIIIIlIllllIllIllllI + ModPotionStatus.lIlIlllIIIlIII[0]) * lllllllllllllIIIIlIllllIlllIIlIl).endVertex();
        lllllllllllllIIIIlIllllIlllIIIll.pos(lllllllllllllIIIIlIllllIlllIIIIl + ModPotionStatus.lIlIlllIIIlIII[0], lllllllllllllIIIIlIllllIlllIIIII + ModPotionStatus.lIlIlllIIIlIII[0], this.zLevelFloat).tex((lllllllllllllIIIIlIllllIlllIlIlI + ModPotionStatus.lIlIlllIIIlIII[0]) * lllllllllllllIIIIlIllllIlllIIllI, (lllllllllllllIIIIlIllllIllIllllI + ModPotionStatus.lIlIlllIIIlIII[0]) * lllllllllllllIIIIlIllllIlllIIlIl).endVertex();
        lllllllllllllIIIIlIllllIlllIIlII.draw();
    }
    
    private static boolean llllIIllIIIIIll(final int lllllllllllllIIIIlIllllIIlIIllIl, final int lllllllllllllIIIIlIllllIIlIIllII) {
        return lllllllllllllIIIIlIllllIIlIIllIl > lllllllllllllIIIIlIllllIIlIIllII;
    }
    
    private static String llllIIlIllllIII(String lllllllllllllIIIIlIllllIIllllIlI, final String lllllllllllllIIIIlIllllIIllllIIl) {
        lllllllllllllIIIIlIllllIIllllIlI = (double)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIlIllllIIllllIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIlIllllIIlllllIl = new StringBuilder();
        final char[] lllllllllllllIIIIlIllllIIlllllII = lllllllllllllIIIIlIllllIIllllIIl.toCharArray();
        int lllllllllllllIIIIlIllllIIllllIll = ModPotionStatus.lIlIlllIIIlIII[0];
        final long lllllllllllllIIIIlIllllIIlllIlIl = (Object)((String)lllllllllllllIIIIlIllllIIllllIlI).toCharArray();
        final long lllllllllllllIIIIlIllllIIlllIlII = lllllllllllllIIIIlIllllIIlllIlIl.length;
        Exception lllllllllllllIIIIlIllllIIlllIIll = (Exception)ModPotionStatus.lIlIlllIIIlIII[0];
        while (llllIIllIIIIllI((int)lllllllllllllIIIIlIllllIIlllIIll, (int)lllllllllllllIIIIlIllllIIlllIlII)) {
            final char lllllllllllllIIIIlIllllIlIIIIIII = lllllllllllllIIIIlIllllIIlllIlIl[lllllllllllllIIIIlIllllIIlllIIll];
            lllllllllllllIIIIlIllllIIlllllIl.append((char)(lllllllllllllIIIIlIllllIlIIIIIII ^ lllllllllllllIIIIlIllllIIlllllII[lllllllllllllIIIIlIllllIIllllIll % lllllllllllllIIIIlIllllIIlllllII.length]));
            "".length();
            ++lllllllllllllIIIIlIllllIIllllIll;
            ++lllllllllllllIIIIlIllllIIlllIIll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIlIllllIIlllllIl);
    }
    
    private static boolean llllIIllIIIIlIl(final int lllllllllllllIIIIlIllllIIlIlIlIl, final int lllllllllllllIIIIlIllllIIlIlIlII) {
        return lllllllllllllIIIIlIllllIIlIlIlIl == lllllllllllllIIIIlIllllIIlIlIlII;
    }
    
    static {
        llllIIllIIIIIIl();
        llllIIlIlllllIl();
    }
    
    private static boolean llllIIllIIIIllI(final int lllllllllllllIIIIlIllllIIlIlIIIl, final int lllllllllllllIIIIlIllllIIlIlIIII) {
        return lllllllllllllIIIIlIllllIIlIlIIIl < lllllllllllllIIIIlIllllIIlIlIIII;
    }
    
    public ModPotionStatus() {
        super(ModPotionStatus.lIlIlllIIIIllI[ModPotionStatus.lIlIlllIIIlIII[0]], ModPotionStatus.lIlIlllIIIlIII[1], ModPotionStatus.lIlIlllIIIlIII[2]);
    }
    
    private static void llllIIlIlllllIl() {
        (lIlIlllIIIIllI = new String[ModPotionStatus.lIlIlllIIIlIII[28]])[ModPotionStatus.lIlIlllIIIlIII[0]] = llllIIlIllllIII("IDUCMAseeiUtBQQvBQ==", "pZvYd");
        ModPotionStatus.lIlIlllIIIIllI[ModPotionStatus.lIlIlllIIIlIII[13]] = llllIIlIllllIIl("qyca4Pjio8zO5wi4qUPStPezumG+5AHsj/pIQoGMoC0pI/XPvrBwAA==", "Lhlwz");
        ModPotionStatus.lIlIlllIIIIllI[ModPotionStatus.lIlIlllIIIlIII[1]] = llllIIlIllllIII("YQ==", "AZGxy");
        ModPotionStatus.lIlIlllIIIIllI[ModPotionStatus.lIlIlllIIIlIII[18]] = llllIIlIllllIll("zdSWCbNb9ds6TikC0g/xpkABYJJHsAIX", "NviEt");
        ModPotionStatus.lIlIlllIIIIllI[ModPotionStatus.lIlIlllIIIlIII[19]] = llllIIlIllllIII("UA==", "pcKuB");
        ModPotionStatus.lIlIlllIIIIllI[ModPotionStatus.lIlIlllIIIlIII[11]] = llllIIlIllllIll("H2MzRYY5jJrBMm3gdEsVgWG3oXBpVUKG", "MgTxB");
        ModPotionStatus.lIlIlllIIIIllI[ModPotionStatus.lIlIlllIIIlIII[20]] = llllIIlIllllIII("aw==", "Kfylo");
        ModPotionStatus.lIlIlllIIIIllI[ModPotionStatus.lIlIlllIIIlIII[5]] = llllIIlIllllIII("JAwODBAvFgABHzVMAQEHJA5DUA==", "Abmdq");
        ModPotionStatus.lIlIlllIIIIllI[ModPotionStatus.lIlIlllIIIlIII[15]] = llllIIlIllllIII("HRcPEDAbFwRLIhwbWAcqBwYWDSsMAFgNKx8XGRAqGwtZFCsO", "irwdE");
        ModPotionStatus.lIlIlllIIIIllI[ModPotionStatus.lIlIlllIIIlIII[24]] = llllIIlIllllIII("VQ==", "ujoFG");
        ModPotionStatus.lIlIlllIIIIllI[ModPotionStatus.lIlIlllIIIlIII[22]] = llllIIlIllllIII("NygOPDE8MgAxPiZoATEmNypDZg==", "RFmTP");
        ModPotionStatus.lIlIlllIIIIllI[ModPotionStatus.lIlIlllIIIlIII[25]] = llllIIlIllllIll("ZfFm1mrWXFI=", "ZTIgb");
        ModPotionStatus.lIlIlllIIIIllI[ModPotionStatus.lIlIlllIIIlIII[26]] = llllIIlIllllIll("8hga75xOKn2w9l3YUhbc17Iye67WFyr4", "FLBNs");
        ModPotionStatus.lIlIlllIIIIllI[ModPotionStatus.lIlIlllIIIlIII[27]] = llllIIlIllllIIl("94daPmR3IJw=", "sYwPv");
        ModPotionStatus.lIlIlllIIIIllI[ModPotionStatus.lIlIlllIIIlIII[7]] = llllIIlIllllIII("MxclDiU4DSsDKiJXKgMyMxVoUg==", "VyFfD");
    }
    
    @Override
    public int getWidth() {
        return ModPotionStatus.lIlIlllIIIlIII[3];
    }
    
    private static void llllIIllIIIIIIl() {
        (lIlIlllIIIlIII = new int[29])[0] = ((0x5 ^ 0x6B ^ (0x34 ^ 0x4)) & (0x13 ^ 0x69 ^ (0x15 ^ 0x31) ^ -" ".length()));
        ModPotionStatus.lIlIlllIIIlIII[1] = "  ".length();
        ModPotionStatus.lIlIlllIIIlIII[2] = (0x24 ^ 0x73 ^ (0xB8 ^ 0xBC));
        ModPotionStatus.lIlIlllIIIlIII[3] = (0x31 ^ 0x71 ^ (0x17 ^ 0x32));
        ModPotionStatus.lIlIlllIIIlIII[4] = (0x62 ^ 0x7B) + (98 + 97 - 162 + 98) - (0x99 ^ 0xC5) + (0x45 ^ 0x1F);
        ModPotionStatus.lIlIlllIIIlIII[5] = (0xAC ^ 0xAB);
        ModPotionStatus.lIlIlllIIIlIII[6] = (0x68 ^ 0x7D);
        ModPotionStatus.lIlIlllIIIlIII[7] = (0x4E ^ 0x40);
        ModPotionStatus.lIlIlllIIIlIII[8] = (0xF1 ^ 0xC2 ^ (0x1C ^ 0x7F));
        ModPotionStatus.lIlIlllIIIlIII[9] = (0x11 ^ 0x1);
        ModPotionStatus.lIlIlllIIIlIII[10] = (0x35 ^ 0x2C ^ (0x6 ^ 0x3E));
        ModPotionStatus.lIlIlllIIIlIII[11] = (0x27 ^ 0x22);
        ModPotionStatus.lIlIlllIIIlIII[12] = 117 + 35 - 74 + 54;
        ModPotionStatus.lIlIlllIIIlIII[13] = " ".length();
        ModPotionStatus.lIlIlllIIIlIII[14] = (0x3E ^ 0x2B ^ " ".length());
        ModPotionStatus.lIlIlllIIIlIII[15] = (0x43 ^ 0x7 ^ (0xF5 ^ 0xB9));
        ModPotionStatus.lIlIlllIIIlIII[16] = (133 + 166 - 150 + 29 ^ 150 + 155 - 280 + 135);
        ModPotionStatus.lIlIlllIIIlIII[17] = 107 + 26 + 17 + 25 + (50 + 116 - 50 + 52) - (71 + 86 - 55 + 151) + (0x17 ^ 0x7B);
        ModPotionStatus.lIlIlllIIIlIII[18] = "   ".length();
        ModPotionStatus.lIlIlllIIIlIII[19] = (0x23 ^ 0x27);
        ModPotionStatus.lIlIlllIIIlIII[20] = (0xC5 ^ 0xA1 ^ (0x4E ^ 0x2C));
        ModPotionStatus.lIlIlllIIIlIII[21] = (-" ".length() & (-1 & 0xFFFFFF));
        ModPotionStatus.lIlIlllIIIlIII[22] = (122 + 128 - 182 + 62 ^ 111 + 39 - 81 + 67);
        ModPotionStatus.lIlIlllIIIlIII[23] = (-" ".length() & (-1 & 0x7F7F7F));
        ModPotionStatus.lIlIlllIIIlIII[24] = ("  ".length() ^ (0xB8 ^ 0xB3));
        ModPotionStatus.lIlIlllIIIlIII[25] = (0x4C ^ 0x47);
        ModPotionStatus.lIlIlllIIIlIII[26] = (0xBE ^ 0xB2);
        ModPotionStatus.lIlIlllIIIlIII[27] = (0x96 ^ 0x9C ^ (0xF ^ 0x8));
        ModPotionStatus.lIlIlllIIIlIII[28] = (142 + 167 - 279 + 157 ^ 61 + 150 - 139 + 108);
    }
    
    private static String llllIIlIllllIIl(final String lllllllllllllIIIIlIllllIIlIlllIl, final String lllllllllllllIIIIlIllllIIlIlllII) {
        try {
            final SecretKeySpec lllllllllllllIIIIlIllllIIllIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIllllIIlIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIlIllllIIlIlllll = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIlIllllIIlIlllll.init(ModPotionStatus.lIlIlllIIIlIII[1], lllllllllllllIIIIlIllllIIllIIIII);
            return new String(lllllllllllllIIIIlIllllIIlIlllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIllllIIlIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlIllllIIlIllllI) {
            lllllllllllllIIIIlIllllIIlIllllI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public int getHeight() {
        return ModPotionStatus.lIlIlllIIIlIII[4];
    }
    
    private static String llllIIlIllllIll(final String lllllllllllllIIIIlIllllIIllIlIII, final String lllllllllllllIIIIlIllllIIllIlIIl) {
        try {
            final SecretKeySpec lllllllllllllIIIIlIllllIIllIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIllllIIllIlIIl.getBytes(StandardCharsets.UTF_8)), ModPotionStatus.lIlIlllIIIlIII[15]), "DES");
            final Cipher lllllllllllllIIIIlIllllIIllIllII = Cipher.getInstance("DES");
            lllllllllllllIIIIlIllllIIllIllII.init(ModPotionStatus.lIlIlllIIIlIII[1], lllllllllllllIIIIlIllllIIllIllIl);
            return new String(lllllllllllllIIIIlIllllIIllIllII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIllllIIllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlIllllIIllIlIll) {
            lllllllllllllIIIIlIllllIIllIlIll.printStackTrace();
            return null;
        }
    }
    
    private static boolean llllIIllIIIIIlI(final int lllllllllllllIIIIlIllllIIlIIlIII) {
        return lllllllllllllIIIIlIllllIIlIIlIII == 0;
    }
    
    private static boolean llllIIllIIIIlII(final int lllllllllllllIIIIlIllllIIlIIlIlI) {
        return lllllllllllllIIIIlIllllIIlIIlIlI != 0;
    }
    
    @Override
    public void draw() {
        final int lllllllllllllIIIIlIllllIllIIlIlI = ModPotionStatus.lIlIlllIIIlIII[6];
        final int lllllllllllllIIIIlIllllIllIIlIIl = ModPotionStatus.lIlIlllIIIlIII[7];
        final int lllllllllllllIIIIlIllllIllIIlIII = ModPotionStatus.lIlIlllIIIlIII[8];
        int lllllllllllllIIIIlIllllIllIIIlll = ModPotionStatus.lIlIlllIIIlIII[9];
        final Collection<PotionEffect> lllllllllllllIIIIlIllllIllIIIllI = this.mc.thePlayer.getActivePotionEffects();
        if (llllIIllIIIIIlI(lllllllllllllIIIIlIllllIllIIIllI.isEmpty() ? 1 : 0)) {
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManager.disableLighting();
            int lllllllllllllIIIIlIllllIllIIIlIl = ModPotionStatus.lIlIlllIIIlIII[10];
            if (llllIIllIIIIIll(lllllllllllllIIIIlIllllIllIIIllI.size(), ModPotionStatus.lIlIlllIIIlIII[11])) {
                lllllllllllllIIIIlIllllIllIIIlIl = ModPotionStatus.lIlIlllIIIlIII[12] / (lllllllllllllIIIIlIllllIllIIIllI.size() - ModPotionStatus.lIlIlllIIIlIII[13]);
            }
            final float lllllllllllllIIIIlIllllIlIllIlll = (float)this.mc.thePlayer.getActivePotionEffects().iterator();
            "".length();
            if ((0xA0 ^ 0xA4) != (0x63 ^ 0x67)) {
                return;
            }
            while (!llllIIllIIIIIlI(((Iterator)lllllllllllllIIIIlIllllIlIllIlll).hasNext() ? 1 : 0)) {
                final PotionEffect lllllllllllllIIIIlIllllIllIIIlII = ((Iterator<PotionEffect>)lllllllllllllIIIIlIllllIlIllIlll).next();
                final Potion lllllllllllllIIIIlIllllIllIIIIll = Potion.potionTypes[lllllllllllllIIIIlIllllIllIIIlII.getPotionID()];
                GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
                if (llllIIllIIIIlII(lllllllllllllIIIIlIllllIllIIIIll.hasStatusIcon() ? 1 : 0)) {
                    Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(ModPotionStatus.lIlIlllIIIIllI[ModPotionStatus.lIlIlllIIIlIII[13]]));
                    final int lllllllllllllIIIIlIllllIllIIIIlI = lllllllllllllIIIIlIllllIllIIIIll.getStatusIconIndex();
                    this.drawTexturedModalRect(this.getX() + lllllllllllllIIIIlIllllIllIIlIlI - ModPotionStatus.lIlIlllIIIlIII[14], this.getY() + lllllllllllllIIIIlIllllIllIIIlll - lllllllllllllIIIIlIllllIllIIlIIl, ModPotionStatus.lIlIlllIIIlIII[0] + lllllllllllllIIIIlIllllIllIIIIlI % ModPotionStatus.lIlIlllIIIlIII[15] * ModPotionStatus.lIlIlllIIIlIII[16], ModPotionStatus.lIlIlllIIIlIII[17] + lllllllllllllIIIIlIllllIllIIIIlI / ModPotionStatus.lIlIlllIIIlIII[15] * ModPotionStatus.lIlIlllIIIlIII[16], ModPotionStatus.lIlIlllIIIlIII[16], ModPotionStatus.lIlIlllIIIlIII[16]);
                }
                String lllllllllllllIIIIlIllllIllIIIIIl = I18n.format(lllllllllllllIIIIlIllllIllIIIIll.getName(), new Object[ModPotionStatus.lIlIlllIIIlIII[0]]);
                if (llllIIllIIIIlIl(lllllllllllllIIIIlIllllIllIIIlII.getAmplifier(), ModPotionStatus.lIlIlllIIIlIII[13])) {
                    lllllllllllllIIIIlIllllIllIIIIIl = String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIIIIlIllllIllIIIIIl)).append(ModPotionStatus.lIlIlllIIIIllI[ModPotionStatus.lIlIlllIIIlIII[1]]).append(I18n.format(ModPotionStatus.lIlIlllIIIIllI[ModPotionStatus.lIlIlllIIIlIII[18]], new Object[ModPotionStatus.lIlIlllIIIlIII[0]])));
                    "".length();
                    if ("  ".length() != "  ".length()) {
                        return;
                    }
                }
                else if (llllIIllIIIIlIl(lllllllllllllIIIIlIllllIllIIIlII.getAmplifier(), ModPotionStatus.lIlIlllIIIlIII[1])) {
                    lllllllllllllIIIIlIllllIllIIIIIl = String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIIIIlIllllIllIIIIIl)).append(ModPotionStatus.lIlIlllIIIIllI[ModPotionStatus.lIlIlllIIIlIII[19]]).append(I18n.format(ModPotionStatus.lIlIlllIIIIllI[ModPotionStatus.lIlIlllIIIlIII[11]], new Object[ModPotionStatus.lIlIlllIIIlIII[0]])));
                    "".length();
                    if ("  ".length() == 0) {
                        return;
                    }
                }
                else if (llllIIllIIIIlIl(lllllllllllllIIIIlIllllIllIIIlII.getAmplifier(), ModPotionStatus.lIlIlllIIIlIII[18])) {
                    lllllllllllllIIIIlIllllIllIIIIIl = String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIIIIlIllllIllIIIIIl)).append(ModPotionStatus.lIlIlllIIIIllI[ModPotionStatus.lIlIlllIIIlIII[20]]).append(I18n.format(ModPotionStatus.lIlIlllIIIIllI[ModPotionStatus.lIlIlllIIIlIII[5]], new Object[ModPotionStatus.lIlIlllIIIlIII[0]])));
                }
                this.fr.drawString(lllllllllllllIIIIlIllllIllIIIIIl, (float)(this.getX() + lllllllllllllIIIIlIllllIllIIlIlI), (float)(this.getY() + lllllllllllllIIIIlIllllIllIIIlll - lllllllllllllIIIIlIllllIllIIlIIl), ModPotionStatus.lIlIlllIIIlIII[21], (boolean)(ModPotionStatus.lIlIlllIIIlIII[13] != 0));
                "".length();
                final String lllllllllllllIIIIlIllllIllIIIIII = Potion.getDurationString(lllllllllllllIIIIlIllllIllIIIlII);
                this.fr.drawString(lllllllllllllIIIIlIllllIllIIIIII, (float)(this.getX() + lllllllllllllIIIIlIllllIllIIlIlI), (float)(this.getY() + lllllllllllllIIIIlIllllIllIIIlll + ModPotionStatus.lIlIlllIIIlIII[22] - lllllllllllllIIIIlIllllIllIIlIIl), ModPotionStatus.lIlIlllIIIlIII[23], (boolean)(ModPotionStatus.lIlIlllIIIlIII[13] != 0));
                "".length();
                lllllllllllllIIIIlIllllIllIIIlll += lllllllllllllIIIIlIllllIllIIIlIl;
                super.draw();
            }
        }
    }
    
    @Override
    public void renderDummy(final int lllllllllllllIIIIlIllllIlIlIIlII, final int lllllllllllllIIIIlIllllIlIlIIIll) {
        final int lllllllllllllIIIIlIllllIlIlIIIlI = ModPotionStatus.lIlIlllIIIlIII[6];
        final int lllllllllllllIIIIlIllllIlIlIIIIl = ModPotionStatus.lIlIlllIIIlIII[7];
        final int lllllllllllllIIIIlIllllIlIlIIIII = ModPotionStatus.lIlIlllIIIlIII[8];
        int lllllllllllllIIIIlIllllIlIIlllll = ModPotionStatus.lIlIlllIIIlIII[9];
        final Collection<PotionEffect> lllllllllllllIIIIlIllllIlIIllllI = this.mc.thePlayer.getActivePotionEffects();
        if (llllIIllIIIIIlI(lllllllllllllIIIIlIllllIlIIllllI.isEmpty() ? 1 : 0)) {
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManager.disableLighting();
            int lllllllllllllIIIIlIllllIlIIlllIl = ModPotionStatus.lIlIlllIIIlIII[10];
            if (llllIIllIIIIIll(lllllllllllllIIIIlIllllIlIIllllI.size(), ModPotionStatus.lIlIlllIIIlIII[11])) {
                lllllllllllllIIIIlIllllIlIIlllIl = ModPotionStatus.lIlIlllIIIlIII[12] / (lllllllllllllIIIIlIllllIlIIllllI.size() - ModPotionStatus.lIlIlllIIIlIII[13]);
            }
            final short lllllllllllllIIIIlIllllIlIIIllIl = (short)this.mc.thePlayer.getActivePotionEffects().iterator();
            "".length();
            if ("   ".length() > "   ".length()) {
                return;
            }
            while (!llllIIllIIIIIlI(((Iterator)lllllllllllllIIIIlIllllIlIIIllIl).hasNext() ? 1 : 0)) {
                final PotionEffect lllllllllllllIIIIlIllllIlIIlllII = ((Iterator<PotionEffect>)lllllllllllllIIIIlIllllIlIIIllIl).next();
                final Potion lllllllllllllIIIIlIllllIlIIllIll = Potion.potionTypes[lllllllllllllIIIIlIllllIlIIlllII.getPotionID()];
                GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
                if (llllIIllIIIIlII(lllllllllllllIIIIlIllllIlIIllIll.hasStatusIcon() ? 1 : 0)) {
                    Minecraft.getMinecraft().getTextureManager().bindTexture(new ResourceLocation(ModPotionStatus.lIlIlllIIIIllI[ModPotionStatus.lIlIlllIIIlIII[15]]));
                    final int lllllllllllllIIIIlIllllIlIIllIlI = lllllllllllllIIIIlIllllIlIIllIll.getStatusIconIndex();
                    this.drawTexturedModalRect(this.getX() + lllllllllllllIIIIlIllllIlIlIIIlI - ModPotionStatus.lIlIlllIIIlIII[14], this.getY() + lllllllllllllIIIIlIllllIlIIlllll - lllllllllllllIIIIlIllllIlIlIIIIl, ModPotionStatus.lIlIlllIIIlIII[0] + lllllllllllllIIIIlIllllIlIIllIlI % ModPotionStatus.lIlIlllIIIlIII[15] * ModPotionStatus.lIlIlllIIIlIII[16], ModPotionStatus.lIlIlllIIIlIII[17] + lllllllllllllIIIIlIllllIlIIllIlI / ModPotionStatus.lIlIlllIIIlIII[15] * ModPotionStatus.lIlIlllIIIlIII[16], ModPotionStatus.lIlIlllIIIlIII[16], ModPotionStatus.lIlIlllIIIlIII[16]);
                }
                String lllllllllllllIIIIlIllllIlIIllIIl = I18n.format(lllllllllllllIIIIlIllllIlIIllIll.getName(), new Object[ModPotionStatus.lIlIlllIIIlIII[0]]);
                if (llllIIllIIIIlIl(lllllllllllllIIIIlIllllIlIIlllII.getAmplifier(), ModPotionStatus.lIlIlllIIIlIII[13])) {
                    lllllllllllllIIIIlIllllIlIIllIIl = String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIIIIlIllllIlIIllIIl)).append(ModPotionStatus.lIlIlllIIIIllI[ModPotionStatus.lIlIlllIIIlIII[24]]).append(I18n.format(ModPotionStatus.lIlIlllIIIIllI[ModPotionStatus.lIlIlllIIIlIII[22]], new Object[ModPotionStatus.lIlIlllIIIlIII[0]])));
                    "".length();
                    if ("   ".length() < 0) {
                        return;
                    }
                }
                else if (llllIIllIIIIlIl(lllllllllllllIIIIlIllllIlIIlllII.getAmplifier(), ModPotionStatus.lIlIlllIIIlIII[1])) {
                    lllllllllllllIIIIlIllllIlIIllIIl = String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIIIIlIllllIlIIllIIl)).append(ModPotionStatus.lIlIlllIIIIllI[ModPotionStatus.lIlIlllIIIlIII[25]]).append(I18n.format(ModPotionStatus.lIlIlllIIIIllI[ModPotionStatus.lIlIlllIIIlIII[26]], new Object[ModPotionStatus.lIlIlllIIIlIII[0]])));
                    "".length();
                    if ("  ".length() <= 0) {
                        return;
                    }
                }
                else if (llllIIllIIIIlIl(lllllllllllllIIIIlIllllIlIIlllII.getAmplifier(), ModPotionStatus.lIlIlllIIIlIII[18])) {
                    lllllllllllllIIIIlIllllIlIIllIIl = String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIIIIlIllllIlIIllIIl)).append(ModPotionStatus.lIlIlllIIIIllI[ModPotionStatus.lIlIlllIIIlIII[27]]).append(I18n.format(ModPotionStatus.lIlIlllIIIIllI[ModPotionStatus.lIlIlllIIIlIII[7]], new Object[ModPotionStatus.lIlIlllIIIlIII[0]])));
                }
                this.fr.drawString(lllllllllllllIIIIlIllllIlIIllIIl, (float)(this.getX() + lllllllllllllIIIIlIllllIlIlIIIlI), (float)(this.getY() + lllllllllllllIIIIlIllllIlIIlllll - lllllllllllllIIIIlIllllIlIlIIIIl), ModPotionStatus.lIlIlllIIIlIII[21], (boolean)(ModPotionStatus.lIlIlllIIIlIII[13] != 0));
                "".length();
                final String lllllllllllllIIIIlIllllIlIIllIII = Potion.getDurationString(lllllllllllllIIIIlIllllIlIIlllII);
                this.fr.drawString(lllllllllllllIIIIlIllllIlIIllIII, (float)(this.getX() + lllllllllllllIIIIlIllllIlIlIIIlI), (float)(this.getY() + lllllllllllllIIIIlIllllIlIIlllll + ModPotionStatus.lIlIlllIIIlIII[22] - lllllllllllllIIIIlIllllIlIlIIIIl), ModPotionStatus.lIlIlllIIIlIII[23], (boolean)(ModPotionStatus.lIlIlllIIIlIII[13] != 0));
                "".length();
                lllllllllllllIIIIlIllllIlIIlllll += lllllllllllllIIIIlIllllIlIIlllIl;
                super.renderDummy(lllllllllllllIIIIlIllllIlIlIIlII, lllllllllllllIIIIlIllllIlIlIIIll);
            }
        }
    }
}
