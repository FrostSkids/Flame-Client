// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.tileentity;

import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ActiveRenderInfo;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.tileentity.TileEntity;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import net.minecraft.client.renderer.GLAllocation;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.nio.FloatBuffer;
import java.util.Random;
import net.minecraft.util.ResourceLocation;
import net.minecraft.tileentity.TileEntityEndPortal;

public class TileEntityEndPortalRenderer extends TileEntitySpecialRenderer<TileEntityEndPortal>
{
    private static final /* synthetic */ ResourceLocation END_PORTAL_TEXTURE;
    private static final /* synthetic */ Random field_147527_e;
    /* synthetic */ FloatBuffer field_147528_b;
    private static final /* synthetic */ int[] lIIIlIIIlllIII;
    private static final /* synthetic */ String[] lIIIlIIIllIllI;
    private static final /* synthetic */ ResourceLocation END_SKY_TEXTURE;
    
    private static String lIlllllIllIIllI(String lllllllllllllIlIIIlIlllIIIIlllII, final String lllllllllllllIlIIIlIlllIIIIllIll) {
        lllllllllllllIlIIIlIlllIIIIlllII = new String(Base64.getDecoder().decode(lllllllllllllIlIIIlIlllIIIIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIlIlllIIIIlllll = new StringBuilder();
        final char[] lllllllllllllIlIIIlIlllIIIIllllI = lllllllllllllIlIIIlIlllIIIIllIll.toCharArray();
        int lllllllllllllIlIIIlIlllIIIIlllIl = TileEntityEndPortalRenderer.lIIIlIIIlllIII[0];
        final short lllllllllllllIlIIIlIlllIIIIlIlll = (Object)lllllllllllllIlIIIlIlllIIIIlllII.toCharArray();
        final short lllllllllllllIlIIIlIlllIIIIlIllI = (short)lllllllllllllIlIIIlIlllIIIIlIlll.length;
        Exception lllllllllllllIlIIIlIlllIIIIlIlIl = (Exception)TileEntityEndPortalRenderer.lIIIlIIIlllIII[0];
        while (lIlllllIlllIIII((int)lllllllllllllIlIIIlIlllIIIIlIlIl, lllllllllllllIlIIIlIlllIIIIlIllI)) {
            final char lllllllllllllIlIIIlIlllIIIlIIIlI = lllllllllllllIlIIIlIlllIIIIlIlll[lllllllllllllIlIIIlIlllIIIIlIlIl];
            lllllllllllllIlIIIlIlllIIIIlllll.append((char)(lllllllllllllIlIIIlIlllIIIlIIIlI ^ lllllllllllllIlIIIlIlllIIIIllllI[lllllllllllllIlIIIlIlllIIIIlllIl % lllllllllllllIlIIIlIlllIIIIllllI.length]));
            "".length();
            ++lllllllllllllIlIIIlIlllIIIIlllIl;
            ++lllllllllllllIlIIIlIlllIIIIlIlIl;
            "".length();
            if ("   ".length() <= -" ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIlIlllIIIIlllll);
    }
    
    private static void lIlllllIllIllII() {
        (lIIIlIIIlllIII = new int[16])[0] = ((0x4 ^ 0x4C) & ~(0x0 ^ 0x48));
        TileEntityEndPortalRenderer.lIIIlIIIlllIII[1] = " ".length();
        TileEntityEndPortalRenderer.lIIIlIIIlllIII[2] = (0x26 ^ 0x68 ^ (0xF9 ^ 0xA7));
        TileEntityEndPortalRenderer.lIIIlIIIlllIII[3] = (-(0xFFFFFE5D & 0x7DEF) & (0xFFFFFFEF & 0x7F5E));
        TileEntityEndPortalRenderer.lIIIlIIIlllIII[4] = (0xFFFFD37F & 0x2F83);
        TileEntityEndPortalRenderer.lIIIlIIIlllIII[5] = (0xFFFFFF37 & 0x24C9);
        TileEntityEndPortalRenderer.lIIIlIIIlllIII[6] = (-(0xFFFFFF67 & 0x5BD9) & (0xFFFFFF67 & 0x7FD8));
        TileEntityEndPortalRenderer.lIIIlIIIlllIII[7] = (-(0xFFFFF27F & 0x4FCD) & (0xFFFFF7DF & 0x6F6D));
        TileEntityEndPortalRenderer.lIIIlIIIlllIII[8] = (0xFFFFB567 & 0x6F9A);
        TileEntityEndPortalRenderer.lIIIlIIIlllIII[9] = (0xFFFF9712 & 0x7FEF);
        TileEntityEndPortalRenderer.lIIIlIIIlllIII[10] = (0xFFFFF6F3 & 0x19ED);
        TileEntityEndPortalRenderer.lIIIlIIIlllIII[11] = (0x41 ^ 0x7E ^ (0x63 ^ 0x55));
        TileEntityEndPortalRenderer.lIIIlIIIlllIII[12] = (0xE3 ^ 0xA4 ^ (0xFD ^ 0xBD));
        TileEntityEndPortalRenderer.lIIIlIIIlllIII[13] = (-(0xFFFFF1AB & 0x2EDE) & (0xFFFFBFDF & 0x77A9));
        TileEntityEndPortalRenderer.lIIIlIIIlllIII[14] = "  ".length();
        TileEntityEndPortalRenderer.lIIIlIIIlllIII[15] = (0xA0 ^ 0x9E ^ (0x73 ^ 0x45));
    }
    
    public TileEntityEndPortalRenderer() {
        this.field_147528_b = GLAllocation.createDirectFloatBuffer(TileEntityEndPortalRenderer.lIIIlIIIlllIII[2]);
    }
    
    private static boolean lIlllllIlllIIII(final int lllllllllllllIlIIIlIllIlllllllII, final int lllllllllllllIlIIIlIllIllllllIll) {
        return lllllllllllllIlIIIlIllIlllllllII < lllllllllllllIlIIIlIllIllllllIll;
    }
    
    private static boolean lIlllllIllIlllI(final int lllllllllllllIlIIIlIlllIIIIIIIII, final int lllllllllllllIlIIIlIllIlllllllll) {
        return lllllllllllllIlIIIlIlllIIIIIIIII >= lllllllllllllIlIIIlIllIlllllllll;
    }
    
    private static void lIlllllIllIlIII() {
        (lIIIlIIIllIllI = new String[TileEntityEndPortalRenderer.lIIIlIIIlllIII[14]])[TileEntityEndPortalRenderer.lIIIlIIIlllIII[0]] = lIlllllIllIIllI("EyAcFTYVIBdOJgkzDRMsCSgBDzdIIAoFHBQuHU8zCSI=", "gEdaC");
        TileEntityEndPortalRenderer.lIIIlIIIllIllI[TileEntityEndPortalRenderer.lIIIlIIIlllIII[1]] = lIlllllIllIIlll("Pf2c9fsfHMXYPveyZ6cSa6bmTdB50PcDGz9EUXns61I=", "PBwIm");
    }
    
    private static boolean lIlllllIllIllIl(final int lllllllllllllIlIIIlIllIllllllIIl) {
        return lllllllllllllIlIIIlIllIllllllIIl == 0;
    }
    
    private static String lIlllllIllIIlll(final String lllllllllllllIlIIIlIlllIIIIIlIlI, final String lllllllllllllIlIIIlIlllIIIIIlIll) {
        try {
            final SecretKeySpec lllllllllllllIlIIIlIlllIIIIIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIlIlllIIIIIlIll.getBytes(StandardCharsets.UTF_8)), TileEntityEndPortalRenderer.lIIIlIIIlllIII[15]), "DES");
            final Cipher lllllllllllllIlIIIlIlllIIIIIlllI = Cipher.getInstance("DES");
            lllllllllllllIlIIIlIlllIIIIIlllI.init(TileEntityEndPortalRenderer.lIIIlIIIlllIII[14], lllllllllllllIlIIIlIlllIIIIIllll);
            return new String(lllllllllllllIlIIIlIlllIIIIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIlIlllIIIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIlIlllIIIIIllIl) {
            lllllllllllllIlIIIlIlllIIIIIllIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlllllIllIllll(final int lllllllllllllIlIIIlIlllIIIIIIlII, final int lllllllllllllIlIIIlIlllIIIIIIIll) {
        return lllllllllllllIlIIIlIlllIIIIIIlII == lllllllllllllIlIIIlIlllIIIIIIIll;
    }
    
    static {
        lIlllllIllIllII();
        lIlllllIllIlIII();
        END_SKY_TEXTURE = new ResourceLocation(TileEntityEndPortalRenderer.lIIIlIIIllIllI[TileEntityEndPortalRenderer.lIIIlIIIlllIII[0]]);
        END_PORTAL_TEXTURE = new ResourceLocation(TileEntityEndPortalRenderer.lIIIlIIIllIllI[TileEntityEndPortalRenderer.lIIIlIIIlllIII[1]]);
        field_147527_e = new Random(31100L);
    }
    
    private FloatBuffer func_147525_a(final float lllllllllllllIlIIIlIlllIIIllllIl, final float lllllllllllllIlIIIlIlllIIIllllII, final float lllllllllllllIlIIIlIlllIIIlllIll, final float lllllllllllllIlIIIlIlllIIIlllIlI) {
        this.field_147528_b.clear();
        "".length();
        this.field_147528_b.put(lllllllllllllIlIIIlIlllIIIllllIl).put(lllllllllllllIlIIIlIlllIIIllllII).put(lllllllllllllIlIIIlIlllIIIlllIll).put(lllllllllllllIlIIIlIlllIIIlllIlI);
        "".length();
        this.field_147528_b.flip();
        "".length();
        return this.field_147528_b;
    }
    
    @Override
    public void renderTileEntityAt(final TileEntityEndPortal lllllllllllllIlIIIlIlllIIlllIlII, final double lllllllllllllIlIIIlIlllIIlllIIll, final double lllllllllllllIlIIIlIlllIIlllIIlI, final double lllllllllllllIlIIIlIlllIIlllIIIl, final float lllllllllllllIlIIIlIlllIIlllIIII, final int lllllllllllllIlIIIlIlllIIllIllll) {
        final float lllllllllllllIlIIIlIlllIIllIlllI = (float)this.rendererDispatcher.entityX;
        final float lllllllllllllIlIIIlIlllIIllIllIl = (float)this.rendererDispatcher.entityY;
        final float lllllllllllllIlIIIlIlllIIllIllII = (float)this.rendererDispatcher.entityZ;
        GlStateManager.disableLighting();
        TileEntityEndPortalRenderer.field_147527_e.setSeed(31100L);
        final float lllllllllllllIlIIIlIlllIIllIlIll = 0.75f;
        int lllllllllllllIlIIIlIlllIIllIlIlI = TileEntityEndPortalRenderer.lIIIlIIIlllIII[0];
        "".length();
        if ((75 + 100 - 27 + 18 ^ 34 + 133 - 88 + 83) < 0) {
            return;
        }
        while (!lIlllllIllIlllI(lllllllllllllIlIIIlIlllIIllIlIlI, TileEntityEndPortalRenderer.lIIIlIIIlllIII[2])) {
            GlStateManager.pushMatrix();
            float lllllllllllllIlIIIlIlllIIllIlIIl = (float)(TileEntityEndPortalRenderer.lIIIlIIIlllIII[2] - lllllllllllllIlIIIlIlllIIllIlIlI);
            float lllllllllllllIlIIIlIlllIIllIlIII = 0.0625f;
            float lllllllllllllIlIIIlIlllIIllIIlll = 1.0f / (lllllllllllllIlIIIlIlllIIllIlIIl + 1.0f);
            if (lIlllllIllIllIl(lllllllllllllIlIIIlIlllIIllIlIlI)) {
                this.bindTexture(TileEntityEndPortalRenderer.END_SKY_TEXTURE);
                lllllllllllllIlIIIlIlllIIllIIlll = 0.1f;
                lllllllllllllIlIIIlIlllIIllIlIIl = 65.0f;
                lllllllllllllIlIIIlIlllIIllIlIII = 0.125f;
                GlStateManager.enableBlend();
                GlStateManager.blendFunc(TileEntityEndPortalRenderer.lIIIlIIIlllIII[3], TileEntityEndPortalRenderer.lIIIlIIIlllIII[4]);
            }
            if (lIlllllIllIlllI(lllllllllllllIlIIIlIlllIIllIlIlI, TileEntityEndPortalRenderer.lIIIlIIIlllIII[1])) {
                this.bindTexture(TileEntityEndPortalRenderer.END_PORTAL_TEXTURE);
            }
            if (lIlllllIllIllll(lllllllllllllIlIIIlIlllIIllIlIlI, TileEntityEndPortalRenderer.lIIIlIIIlllIII[1])) {
                GlStateManager.enableBlend();
                GlStateManager.blendFunc(TileEntityEndPortalRenderer.lIIIlIIIlllIII[1], TileEntityEndPortalRenderer.lIIIlIIIlllIII[1]);
                lllllllllllllIlIIIlIlllIIllIlIII = 0.5f;
            }
            final float lllllllllllllIlIIIlIlllIIllIIllI = (float)(-(lllllllllllllIlIIIlIlllIIlllIIlI + lllllllllllllIlIIIlIlllIIllIlIll));
            float lllllllllllllIlIIIlIlllIIllIIlIl = lllllllllllllIlIIIlIlllIIllIIllI + (float)ActiveRenderInfo.getPosition().yCoord;
            final float lllllllllllllIlIIIlIlllIIllIIlII = lllllllllllllIlIIIlIlllIIllIIllI + lllllllllllllIlIIIlIlllIIllIlIIl + (float)ActiveRenderInfo.getPosition().yCoord;
            float lllllllllllllIlIIIlIlllIIllIIIll = lllllllllllllIlIIIlIlllIIllIIlIl / lllllllllllllIlIIIlIlllIIllIIlII;
            lllllllllllllIlIIIlIlllIIllIIIll += (float)(lllllllllllllIlIIIlIlllIIlllIIlI + lllllllllllllIlIIIlIlllIIllIlIll);
            GlStateManager.translate(lllllllllllllIlIIIlIlllIIllIlllI, lllllllllllllIlIIIlIlllIIllIIIll, lllllllllllllIlIIIlIlllIIllIllII);
            GlStateManager.texGen(GlStateManager.TexGen.S, TileEntityEndPortalRenderer.lIIIlIIIlllIII[5]);
            GlStateManager.texGen(GlStateManager.TexGen.T, TileEntityEndPortalRenderer.lIIIlIIIlllIII[5]);
            GlStateManager.texGen(GlStateManager.TexGen.R, TileEntityEndPortalRenderer.lIIIlIIIlllIII[5]);
            GlStateManager.texGen(GlStateManager.TexGen.Q, TileEntityEndPortalRenderer.lIIIlIIIlllIII[6]);
            GlStateManager.func_179105_a(GlStateManager.TexGen.S, TileEntityEndPortalRenderer.lIIIlIIIlllIII[7], this.func_147525_a(1.0f, 0.0f, 0.0f, 0.0f));
            GlStateManager.func_179105_a(GlStateManager.TexGen.T, TileEntityEndPortalRenderer.lIIIlIIIlllIII[7], this.func_147525_a(0.0f, 0.0f, 1.0f, 0.0f));
            GlStateManager.func_179105_a(GlStateManager.TexGen.R, TileEntityEndPortalRenderer.lIIIlIIIlllIII[7], this.func_147525_a(0.0f, 0.0f, 0.0f, 1.0f));
            GlStateManager.func_179105_a(GlStateManager.TexGen.Q, TileEntityEndPortalRenderer.lIIIlIIIlllIII[8], this.func_147525_a(0.0f, 1.0f, 0.0f, 0.0f));
            GlStateManager.enableTexGenCoord(GlStateManager.TexGen.S);
            GlStateManager.enableTexGenCoord(GlStateManager.TexGen.T);
            GlStateManager.enableTexGenCoord(GlStateManager.TexGen.R);
            GlStateManager.enableTexGenCoord(GlStateManager.TexGen.Q);
            GlStateManager.popMatrix();
            GlStateManager.matrixMode(TileEntityEndPortalRenderer.lIIIlIIIlllIII[9]);
            GlStateManager.pushMatrix();
            GlStateManager.loadIdentity();
            GlStateManager.translate(0.0f, Minecraft.getSystemTime() % 700000L / 700000.0f, 0.0f);
            GlStateManager.scale(lllllllllllllIlIIIlIlllIIllIlIII, lllllllllllllIlIIIlIlllIIllIlIII, lllllllllllllIlIIIlIlllIIllIlIII);
            GlStateManager.translate(0.5f, 0.5f, 0.0f);
            GlStateManager.rotate((lllllllllllllIlIIIlIlllIIllIlIlI * lllllllllllllIlIIIlIlllIIllIlIlI * TileEntityEndPortalRenderer.lIIIlIIIlllIII[10] + lllllllllllllIlIIIlIlllIIllIlIlI * TileEntityEndPortalRenderer.lIIIlIIIlllIII[11]) * 2.0f, 0.0f, 0.0f, 1.0f);
            GlStateManager.translate(-0.5f, -0.5f, 0.0f);
            GlStateManager.translate(-lllllllllllllIlIIIlIlllIIllIlllI, -lllllllllllllIlIIIlIlllIIllIllII, -lllllllllllllIlIIIlIlllIIllIllIl);
            lllllllllllllIlIIIlIlllIIllIIlIl = lllllllllllllIlIIIlIlllIIllIIllI + (float)ActiveRenderInfo.getPosition().yCoord;
            GlStateManager.translate((float)ActiveRenderInfo.getPosition().xCoord * lllllllllllllIlIIIlIlllIIllIlIIl / lllllllllllllIlIIIlIlllIIllIIlIl, (float)ActiveRenderInfo.getPosition().zCoord * lllllllllllllIlIIIlIlllIIllIlIIl / lllllllllllllIlIIIlIlllIIllIIlIl, -lllllllllllllIlIIIlIlllIIllIllIl);
            final Tessellator lllllllllllllIlIIIlIlllIIllIIIlI = Tessellator.getInstance();
            final WorldRenderer lllllllllllllIlIIIlIlllIIllIIIIl = lllllllllllllIlIIIlIlllIIllIIIlI.getWorldRenderer();
            lllllllllllllIlIIIlIlllIIllIIIIl.begin(TileEntityEndPortalRenderer.lIIIlIIIlllIII[12], DefaultVertexFormats.POSITION_COLOR);
            float lllllllllllllIlIIIlIlllIIllIIIII = (TileEntityEndPortalRenderer.field_147527_e.nextFloat() * 0.5f + 0.1f) * lllllllllllllIlIIIlIlllIIllIIlll;
            float lllllllllllllIlIIIlIlllIIlIlllll = (TileEntityEndPortalRenderer.field_147527_e.nextFloat() * 0.5f + 0.4f) * lllllllllllllIlIIIlIlllIIllIIlll;
            float lllllllllllllIlIIIlIlllIIlIllllI = (TileEntityEndPortalRenderer.field_147527_e.nextFloat() * 0.5f + 0.5f) * lllllllllllllIlIIIlIlllIIllIIlll;
            if (lIlllllIllIllIl(lllllllllllllIlIIIlIlllIIllIlIlI)) {
                lllllllllllllIlIIIlIlllIIlIlllll = (lllllllllllllIlIIIlIlllIIllIIIII = (lllllllllllllIlIIIlIlllIIlIllllI = 1.0f * lllllllllllllIlIIIlIlllIIllIIlll));
            }
            lllllllllllllIlIIIlIlllIIllIIIIl.pos(lllllllllllllIlIIIlIlllIIlllIIll, lllllllllllllIlIIIlIlllIIlllIIlI + lllllllllllllIlIIIlIlllIIllIlIll, lllllllllllllIlIIIlIlllIIlllIIIl).color(lllllllllllllIlIIIlIlllIIllIIIII, lllllllllllllIlIIIlIlllIIlIlllll, lllllllllllllIlIIIlIlllIIlIllllI, 1.0f).endVertex();
            lllllllllllllIlIIIlIlllIIllIIIIl.pos(lllllllllllllIlIIIlIlllIIlllIIll, lllllllllllllIlIIIlIlllIIlllIIlI + lllllllllllllIlIIIlIlllIIllIlIll, lllllllllllllIlIIIlIlllIIlllIIIl + 1.0).color(lllllllllllllIlIIIlIlllIIllIIIII, lllllllllllllIlIIIlIlllIIlIlllll, lllllllllllllIlIIIlIlllIIlIllllI, 1.0f).endVertex();
            lllllllllllllIlIIIlIlllIIllIIIIl.pos(lllllllllllllIlIIIlIlllIIlllIIll + 1.0, lllllllllllllIlIIIlIlllIIlllIIlI + lllllllllllllIlIIIlIlllIIllIlIll, lllllllllllllIlIIIlIlllIIlllIIIl + 1.0).color(lllllllllllllIlIIIlIlllIIllIIIII, lllllllllllllIlIIIlIlllIIlIlllll, lllllllllllllIlIIIlIlllIIlIllllI, 1.0f).endVertex();
            lllllllllllllIlIIIlIlllIIllIIIIl.pos(lllllllllllllIlIIIlIlllIIlllIIll + 1.0, lllllllllllllIlIIIlIlllIIlllIIlI + lllllllllllllIlIIIlIlllIIllIlIll, lllllllllllllIlIIIlIlllIIlllIIIl).color(lllllllllllllIlIIIlIlllIIllIIIII, lllllllllllllIlIIIlIlllIIlIlllll, lllllllllllllIlIIIlIlllIIlIllllI, 1.0f).endVertex();
            lllllllllllllIlIIIlIlllIIllIIIlI.draw();
            GlStateManager.popMatrix();
            GlStateManager.matrixMode(TileEntityEndPortalRenderer.lIIIlIIIlllIII[13]);
            this.bindTexture(TileEntityEndPortalRenderer.END_SKY_TEXTURE);
            ++lllllllllllllIlIIIlIlllIIllIlIlI;
        }
        GlStateManager.disableBlend();
        GlStateManager.disableTexGenCoord(GlStateManager.TexGen.S);
        GlStateManager.disableTexGenCoord(GlStateManager.TexGen.T);
        GlStateManager.disableTexGenCoord(GlStateManager.TexGen.R);
        GlStateManager.disableTexGenCoord(GlStateManager.TexGen.Q);
        GlStateManager.enableLighting();
    }
}
