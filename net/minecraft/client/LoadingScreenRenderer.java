// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client;

import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.util.MinecraftError;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.client.shader.Framebuffer;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.util.IProgressUpdate;

public class LoadingScreenRenderer implements IProgressUpdate
{
    private /* synthetic */ Minecraft mc;
    private static final /* synthetic */ String[] lIIlIIIlIIIIll;
    private /* synthetic */ ScaledResolution scaledResolution;
    private /* synthetic */ boolean field_73724_e;
    private /* synthetic */ String message;
    private static final /* synthetic */ int[] lIIlIIIlIIIlIl;
    private /* synthetic */ long systemTime;
    private /* synthetic */ Framebuffer framebuffer;
    private /* synthetic */ String currentlyDisplayedText;
    
    private static String llIIlIlIIllIllI(final String lllllllllllllIIlllIlIIlllIIIllIl, final String lllllllllllllIIlllIlIIlllIIIllII) {
        try {
            final SecretKeySpec lllllllllllllIIlllIlIIlllIIlIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIlIIlllIIIllII.getBytes(StandardCharsets.UTF_8)), LoadingScreenRenderer.lIIlIIIlIIIlIl[19]), "DES");
            final Cipher lllllllllllllIIlllIlIIlllIIlIIIl = Cipher.getInstance("DES");
            lllllllllllllIIlllIlIIlllIIlIIIl.init(LoadingScreenRenderer.lIIlIIIlIIIlIl[12], lllllllllllllIIlllIlIIlllIIlIIlI);
            return new String(lllllllllllllIIlllIlIIlllIIlIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIlIIlllIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllIlIIlllIIlIIII) {
            lllllllllllllIIlllIlIIlllIIlIIII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void setLoadingProgress(final int lllllllllllllIIlllIlIIlllIllllII) {
        if (llIIlIlIIlllIlI(this.mc.running ? 1 : 0)) {
            if (llIIlIlIIlllIlI(this.field_73724_e ? 1 : 0)) {
                throw new MinecraftError();
            }
        }
        else {
            final long lllllllllllllIIlllIlIIllllIIlIIl = Minecraft.getSystemTime();
            if (llIIlIlIIllllIl(llIIlIlIIllllII(lllllllllllllIIlllIlIIllllIIlIIl - this.systemTime, 100L))) {
                this.systemTime = lllllllllllllIIlllIlIIllllIIlIIl;
                final ScaledResolution lllllllllllllIIlllIlIIllllIIlIII = new ScaledResolution(this.mc);
                final int lllllllllllllIIlllIlIIllllIIIlll = lllllllllllllIIlllIlIIllllIIlIII.getScaleFactor();
                final int lllllllllllllIIlllIlIIllllIIIllI = lllllllllllllIIlllIlIIllllIIlIII.getScaledWidth();
                final int lllllllllllllIIlllIlIIllllIIIlIl = lllllllllllllIIlllIlIIllllIIlIII.getScaledHeight();
                if (llIIlIlIIlllIll(OpenGlHelper.isFramebufferEnabled() ? 1 : 0)) {
                    this.framebuffer.framebufferClear();
                    "".length();
                    if ((54 + 52 + 5 + 66 ^ 48 + 73 - 47 + 107) <= " ".length()) {
                        return;
                    }
                }
                else {
                    GlStateManager.clear(LoadingScreenRenderer.lIIlIIIlIIIlIl[3]);
                }
                this.framebuffer.bindFramebuffer((boolean)(LoadingScreenRenderer.lIIlIIIlIIIlIl[0] != 0));
                GlStateManager.matrixMode(LoadingScreenRenderer.lIIlIIIlIIIlIl[4]);
                GlStateManager.loadIdentity();
                GlStateManager.ortho(0.0, lllllllllllllIIlllIlIIllllIIlIII.getScaledWidth_double(), lllllllllllllIIlllIlIIllllIIlIII.getScaledHeight_double(), 0.0, 100.0, 300.0);
                GlStateManager.matrixMode(LoadingScreenRenderer.lIIlIIIlIIIlIl[5]);
                GlStateManager.loadIdentity();
                GlStateManager.translate(0.0f, 0.0f, -200.0f);
                if (llIIlIlIIlllIlI(OpenGlHelper.isFramebufferEnabled() ? 1 : 0)) {
                    GlStateManager.clear(LoadingScreenRenderer.lIIlIIIlIIIlIl[7]);
                }
                final Tessellator lllllllllllllIIlllIlIIllllIIIlII = Tessellator.getInstance();
                final WorldRenderer lllllllllllllIIlllIlIIllllIIIIll = lllllllllllllIIlllIlIIllllIIIlII.getWorldRenderer();
                this.mc.getTextureManager().bindTexture(Gui.optionsBackground);
                final float lllllllllllllIIlllIlIIllllIIIIlI = 32.0f;
                lllllllllllllIIlllIlIIllllIIIIll.begin(LoadingScreenRenderer.lIIlIIIlIIIlIl[8], DefaultVertexFormats.POSITION_TEX_COLOR);
                lllllllllllllIIlllIlIIllllIIIIll.pos(0.0, lllllllllllllIIlllIlIIllllIIIlIl, 0.0).tex(0.0, lllllllllllllIIlllIlIIllllIIIlIl / lllllllllllllIIlllIlIIllllIIIIlI).color(LoadingScreenRenderer.lIIlIIIlIIIlIl[9], LoadingScreenRenderer.lIIlIIIlIIIlIl[9], LoadingScreenRenderer.lIIlIIIlIIIlIl[9], LoadingScreenRenderer.lIIlIIIlIIIlIl[10]).endVertex();
                lllllllllllllIIlllIlIIllllIIIIll.pos(lllllllllllllIIlllIlIIllllIIIllI, lllllllllllllIIlllIlIIllllIIIlIl, 0.0).tex(lllllllllllllIIlllIlIIllllIIIllI / lllllllllllllIIlllIlIIllllIIIIlI, lllllllllllllIIlllIlIIllllIIIlIl / lllllllllllllIIlllIlIIllllIIIIlI).color(LoadingScreenRenderer.lIIlIIIlIIIlIl[9], LoadingScreenRenderer.lIIlIIIlIIIlIl[9], LoadingScreenRenderer.lIIlIIIlIIIlIl[9], LoadingScreenRenderer.lIIlIIIlIIIlIl[10]).endVertex();
                lllllllllllllIIlllIlIIllllIIIIll.pos(lllllllllllllIIlllIlIIllllIIIllI, 0.0, 0.0).tex(lllllllllllllIIlllIlIIllllIIIllI / lllllllllllllIIlllIlIIllllIIIIlI, 0.0).color(LoadingScreenRenderer.lIIlIIIlIIIlIl[9], LoadingScreenRenderer.lIIlIIIlIIIlIl[9], LoadingScreenRenderer.lIIlIIIlIIIlIl[9], LoadingScreenRenderer.lIIlIIIlIIIlIl[10]).endVertex();
                lllllllllllllIIlllIlIIllllIIIIll.pos(0.0, 0.0, 0.0).tex(0.0, 0.0).color(LoadingScreenRenderer.lIIlIIIlIIIlIl[9], LoadingScreenRenderer.lIIlIIIlIIIlIl[9], LoadingScreenRenderer.lIIlIIIlIIIlIl[9], LoadingScreenRenderer.lIIlIIIlIIIlIl[10]).endVertex();
                lllllllllllllIIlllIlIIllllIIIlII.draw();
                if (llIIlIlIIllllIl(lllllllllllllIIlllIlIIlllIllllII)) {
                    final int lllllllllllllIIlllIlIIllllIIIIIl = LoadingScreenRenderer.lIIlIIIlIIIlIl[11];
                    final int lllllllllllllIIlllIlIIllllIIIIII = LoadingScreenRenderer.lIIlIIIlIIIlIl[12];
                    final int lllllllllllllIIlllIlIIlllIllllll = lllllllllllllIIlllIlIIllllIIIllI / LoadingScreenRenderer.lIIlIIIlIIIlIl[12] - lllllllllllllIIlllIlIIllllIIIIIl / LoadingScreenRenderer.lIIlIIIlIIIlIl[12];
                    final int lllllllllllllIIlllIlIIlllIlllllI = lllllllllllllIIlllIlIIllllIIIlIl / LoadingScreenRenderer.lIIlIIIlIIIlIl[12] + LoadingScreenRenderer.lIIlIIIlIIIlIl[13];
                    GlStateManager.disableTexture2D();
                    lllllllllllllIIlllIlIIllllIIIIll.begin(LoadingScreenRenderer.lIIlIIIlIIIlIl[8], DefaultVertexFormats.POSITION_COLOR);
                    lllllllllllllIIlllIlIIllllIIIIll.pos(lllllllllllllIIlllIlIIlllIllllll, lllllllllllllIIlllIlIIlllIlllllI, 0.0).color(LoadingScreenRenderer.lIIlIIIlIIIlIl[14], LoadingScreenRenderer.lIIlIIIlIIIlIl[14], LoadingScreenRenderer.lIIlIIIlIIIlIl[14], LoadingScreenRenderer.lIIlIIIlIIIlIl[10]).endVertex();
                    lllllllllllllIIlllIlIIllllIIIIll.pos(lllllllllllllIIlllIlIIlllIllllll, lllllllllllllIIlllIlIIlllIlllllI + lllllllllllllIIlllIlIIllllIIIIII, 0.0).color(LoadingScreenRenderer.lIIlIIIlIIIlIl[14], LoadingScreenRenderer.lIIlIIIlIIIlIl[14], LoadingScreenRenderer.lIIlIIIlIIIlIl[14], LoadingScreenRenderer.lIIlIIIlIIIlIl[10]).endVertex();
                    lllllllllllllIIlllIlIIllllIIIIll.pos(lllllllllllllIIlllIlIIlllIllllll + lllllllllllllIIlllIlIIllllIIIIIl, lllllllllllllIIlllIlIIlllIlllllI + lllllllllllllIIlllIlIIllllIIIIII, 0.0).color(LoadingScreenRenderer.lIIlIIIlIIIlIl[14], LoadingScreenRenderer.lIIlIIIlIIIlIl[14], LoadingScreenRenderer.lIIlIIIlIIIlIl[14], LoadingScreenRenderer.lIIlIIIlIIIlIl[10]).endVertex();
                    lllllllllllllIIlllIlIIllllIIIIll.pos(lllllllllllllIIlllIlIIlllIllllll + lllllllllllllIIlllIlIIllllIIIIIl, lllllllllllllIIlllIlIIlllIlllllI, 0.0).color(LoadingScreenRenderer.lIIlIIIlIIIlIl[14], LoadingScreenRenderer.lIIlIIIlIIIlIl[14], LoadingScreenRenderer.lIIlIIIlIIIlIl[14], LoadingScreenRenderer.lIIlIIIlIIIlIl[10]).endVertex();
                    lllllllllllllIIlllIlIIllllIIIIll.pos(lllllllllllllIIlllIlIIlllIllllll, lllllllllllllIIlllIlIIlllIlllllI, 0.0).color(LoadingScreenRenderer.lIIlIIIlIIIlIl[14], LoadingScreenRenderer.lIIlIIIlIIIlIl[10], LoadingScreenRenderer.lIIlIIIlIIIlIl[14], LoadingScreenRenderer.lIIlIIIlIIIlIl[10]).endVertex();
                    lllllllllllllIIlllIlIIllllIIIIll.pos(lllllllllllllIIlllIlIIlllIllllll, lllllllllllllIIlllIlIIlllIlllllI + lllllllllllllIIlllIlIIllllIIIIII, 0.0).color(LoadingScreenRenderer.lIIlIIIlIIIlIl[14], LoadingScreenRenderer.lIIlIIIlIIIlIl[10], LoadingScreenRenderer.lIIlIIIlIIIlIl[14], LoadingScreenRenderer.lIIlIIIlIIIlIl[10]).endVertex();
                    lllllllllllllIIlllIlIIllllIIIIll.pos(lllllllllllllIIlllIlIIlllIllllll + lllllllllllllIIlllIlIIlllIllllII, lllllllllllllIIlllIlIIlllIlllllI + lllllllllllllIIlllIlIIllllIIIIII, 0.0).color(LoadingScreenRenderer.lIIlIIIlIIIlIl[14], LoadingScreenRenderer.lIIlIIIlIIIlIl[10], LoadingScreenRenderer.lIIlIIIlIIIlIl[14], LoadingScreenRenderer.lIIlIIIlIIIlIl[10]).endVertex();
                    lllllllllllllIIlllIlIIllllIIIIll.pos(lllllllllllllIIlllIlIIlllIllllll + lllllllllllllIIlllIlIIlllIllllII, lllllllllllllIIlllIlIIlllIlllllI, 0.0).color(LoadingScreenRenderer.lIIlIIIlIIIlIl[14], LoadingScreenRenderer.lIIlIIIlIIIlIl[10], LoadingScreenRenderer.lIIlIIIlIIIlIl[14], LoadingScreenRenderer.lIIlIIIlIIIlIl[10]).endVertex();
                    lllllllllllllIIlllIlIIllllIIIlII.draw();
                    GlStateManager.enableTexture2D();
                }
                GlStateManager.enableBlend();
                GlStateManager.tryBlendFuncSeparate(LoadingScreenRenderer.lIIlIIIlIIIlIl[15], LoadingScreenRenderer.lIIlIIIlIIIlIl[16], LoadingScreenRenderer.lIIlIIIlIIIlIl[1], LoadingScreenRenderer.lIIlIIIlIIIlIl[0]);
                this.mc.fontRendererObj.drawStringWithShadow(this.currentlyDisplayedText, (float)((lllllllllllllIIlllIlIIllllIIIllI - this.mc.fontRendererObj.getStringWidth(this.currentlyDisplayedText)) / LoadingScreenRenderer.lIIlIIIlIIIlIl[12]), (float)(lllllllllllllIIlllIlIIllllIIIlIl / LoadingScreenRenderer.lIIlIIIlIIIlIl[12] - LoadingScreenRenderer.lIIlIIIlIIIlIl[17] - LoadingScreenRenderer.lIIlIIIlIIIlIl[13]), LoadingScreenRenderer.lIIlIIIlIIIlIl[18]);
                "".length();
                this.mc.fontRendererObj.drawStringWithShadow(this.message, (float)((lllllllllllllIIlllIlIIllllIIIllI - this.mc.fontRendererObj.getStringWidth(this.message)) / LoadingScreenRenderer.lIIlIIIlIIIlIl[12]), (float)(lllllllllllllIIlllIlIIllllIIIlIl / LoadingScreenRenderer.lIIlIIIlIIIlIl[12] - LoadingScreenRenderer.lIIlIIIlIIIlIl[17] + LoadingScreenRenderer.lIIlIIIlIIIlIl[19]), LoadingScreenRenderer.lIIlIIIlIIIlIl[18]);
                "".length();
                this.framebuffer.unbindFramebuffer();
                if (llIIlIlIIlllIll(OpenGlHelper.isFramebufferEnabled() ? 1 : 0)) {
                    this.framebuffer.framebufferRender(lllllllllllllIIlllIlIIllllIIIllI * lllllllllllllIIlllIlIIllllIIIlll, lllllllllllllIIlllIlIIllllIIIlIl * lllllllllllllIIlllIlIIllllIIIlll);
                }
                this.mc.updateDisplay();
                try {
                    Thread.yield();
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                catch (Exception ex) {}
            }
        }
    }
    
    private static boolean llIIlIlIIlllllI(final int lllllllllllllIIlllIlIIlllIIIIlll, final int lllllllllllllIIlllIlIIlllIIIIllI) {
        return lllllllllllllIIlllIlIIlllIIIIlll < lllllllllllllIIlllIlIIlllIIIIllI;
    }
    
    @Override
    public void setDoneWorking() {
    }
    
    private static boolean llIIlIlIIllllIl(final int lllllllllllllIIlllIlIIlllIIIIIII) {
        return lllllllllllllIIlllIlIIlllIIIIIII >= 0;
    }
    
    private static int llIIlIlIIllllII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private void displayString(final String lllllllllllllIIlllIlIIlllllIIIIl) {
        this.currentlyDisplayedText = lllllllllllllIIlllIlIIlllllIIIIl;
        if (llIIlIlIIlllIlI(this.mc.running ? 1 : 0)) {
            if (llIIlIlIIlllIlI(this.field_73724_e ? 1 : 0)) {
                throw new MinecraftError();
            }
        }
        else {
            GlStateManager.clear(LoadingScreenRenderer.lIIlIIIlIIIlIl[3]);
            GlStateManager.matrixMode(LoadingScreenRenderer.lIIlIIIlIIIlIl[4]);
            GlStateManager.loadIdentity();
            if (llIIlIlIIlllIll(OpenGlHelper.isFramebufferEnabled() ? 1 : 0)) {
                final int lllllllllllllIIlllIlIIlllllIIlII = this.scaledResolution.getScaleFactor();
                GlStateManager.ortho(0.0, this.scaledResolution.getScaledWidth() * lllllllllllllIIlllIlIIlllllIIlII, this.scaledResolution.getScaledHeight() * lllllllllllllIIlllIlIIlllllIIlII, 0.0, 100.0, 300.0);
                "".length();
                if (" ".length() > (0x54 ^ 0x31 ^ (0x27 ^ 0x46))) {
                    return;
                }
            }
            else {
                final ScaledResolution lllllllllllllIIlllIlIIlllllIIIll = new ScaledResolution(this.mc);
                GlStateManager.ortho(0.0, lllllllllllllIIlllIlIIlllllIIIll.getScaledWidth_double(), lllllllllllllIIlllIlIIlllllIIIll.getScaledHeight_double(), 0.0, 100.0, 300.0);
            }
            GlStateManager.matrixMode(LoadingScreenRenderer.lIIlIIIlIIIlIl[5]);
            GlStateManager.loadIdentity();
            GlStateManager.translate(0.0f, 0.0f, -200.0f);
        }
    }
    
    static {
        llIIlIlIIlllIIl();
        llIIlIlIIlllIII();
    }
    
    private static String llIIlIlIIllIlll(String lllllllllllllIIlllIlIIlllIIlllll, final String lllllllllllllIIlllIlIIlllIIllllI) {
        lllllllllllllIIlllIlIIlllIIlllll = new String(Base64.getDecoder().decode(lllllllllllllIIlllIlIIlllIIlllll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlllIlIIlllIlIIIlI = new StringBuilder();
        final char[] lllllllllllllIIlllIlIIlllIlIIIIl = lllllllllllllIIlllIlIIlllIIllllI.toCharArray();
        int lllllllllllllIIlllIlIIlllIlIIIII = LoadingScreenRenderer.lIIlIIIlIIIlIl[0];
        final long lllllllllllllIIlllIlIIlllIIllIlI = (Object)lllllllllllllIIlllIlIIlllIIlllll.toCharArray();
        final boolean lllllllllllllIIlllIlIIlllIIllIIl = lllllllllllllIIlllIlIIlllIIllIlI.length != 0;
        float lllllllllllllIIlllIlIIlllIIllIII = LoadingScreenRenderer.lIIlIIIlIIIlIl[0];
        while (llIIlIlIIlllllI((int)lllllllllllllIIlllIlIIlllIIllIII, lllllllllllllIIlllIlIIlllIIllIIl ? 1 : 0)) {
            final char lllllllllllllIIlllIlIIlllIlIIlIl = lllllllllllllIIlllIlIIlllIIllIlI[lllllllllllllIIlllIlIIlllIIllIII];
            lllllllllllllIIlllIlIIlllIlIIIlI.append((char)(lllllllllllllIIlllIlIIlllIlIIlIl ^ lllllllllllllIIlllIlIIlllIlIIIIl[lllllllllllllIIlllIlIIlllIlIIIII % lllllllllllllIIlllIlIIlllIlIIIIl.length]));
            "".length();
            ++lllllllllllllIIlllIlIIlllIlIIIII;
            ++lllllllllllllIIlllIlIIlllIIllIII;
            "".length();
            if ((0x54 ^ 0x51) == 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlllIlIIlllIlIIIlI);
    }
    
    @Override
    public void resetProgressAndMessage(final String lllllllllllllIIlllIlIIllllllIIII) {
        this.field_73724_e = (LoadingScreenRenderer.lIIlIIIlIIIlIl[0] != 0);
        this.displayString(lllllllllllllIIlllIlIIllllllIIII);
    }
    
    private static void llIIlIlIIlllIIl() {
        (lIIlIIIlIIIlIl = new int[20])[0] = ((0xBF ^ 0x9B) & ~(0xE0 ^ 0xC4));
        LoadingScreenRenderer.lIIlIIIlIIIlIl[1] = " ".length();
        LoadingScreenRenderer.lIIlIIIlIIIlIl[2] = (-(0xFFFFDB31 & 0x3DFF) & (0xFFFFFF72 & 0x3FBD));
        LoadingScreenRenderer.lIIlIIIlIIIlIl[3] = (-(0xFFFFF2F7 & 0x7F68) & (0xFFFFF3DF & 0x7F7F));
        LoadingScreenRenderer.lIIlIIIlIIIlIl[4] = (-(0xFFFFE9B7 & 0x5EEF) & (0xFFFFFFE7 & 0x5FBF));
        LoadingScreenRenderer.lIIlIIIlIIIlIl[5] = (0xFFFFFFB3 & 0x174C);
        LoadingScreenRenderer.lIIlIIIlIIIlIl[6] = -" ".length();
        LoadingScreenRenderer.lIIlIIIlIIIlIl[7] = (0xFFFFD5C7 & 0x6B38);
        LoadingScreenRenderer.lIIlIIIlIIIlIl[8] = (0x8E ^ 0x8A ^ "   ".length());
        LoadingScreenRenderer.lIIlIIIlIIIlIl[9] = (140 + 150 - 94 + 40 ^ 171 + 43 - 42 + 0);
        LoadingScreenRenderer.lIIlIIIlIIIlIl[10] = (0x6E ^ 0x3B) + (70 + 118 - 24 + 8) - (113 + 94 - 178 + 191) + (133 + 146 - 259 + 198);
        LoadingScreenRenderer.lIIlIIIlIIIlIl[11] = (0x72 ^ 0x56 ^ (0x3A ^ 0x7A));
        LoadingScreenRenderer.lIIlIIIlIIIlIl[12] = "  ".length();
        LoadingScreenRenderer.lIIlIIIlIIIlIl[13] = (0xB1 ^ 0x80 ^ (0x8E ^ 0xAF));
        LoadingScreenRenderer.lIIlIIIlIIIlIl[14] = 100 + 99 - 108 + 37;
        LoadingScreenRenderer.lIIlIIIlIIIlIl[15] = (-(0xFFFF9CDF & 0x7FBE) & (0xFFFFFF9F & 0x1FFF));
        LoadingScreenRenderer.lIIlIIIlIIIlIl[16] = (-(0xFFFFF9EF & 0x6E95) & (0xFFFFFF8F & 0x6BF7));
        LoadingScreenRenderer.lIIlIIIlIIIlIl[17] = (0x91 ^ 0x95);
        LoadingScreenRenderer.lIIlIIIlIIIlIl[18] = (-" ".length() & (-1 & 0xFFFFFF));
        LoadingScreenRenderer.lIIlIIIlIIIlIl[19] = (0x8E ^ 0xA1 ^ (0x5C ^ 0x7B));
    }
    
    public LoadingScreenRenderer(final Minecraft lllllllllllllIIlllIlIIlllllllIII) {
        this.message = LoadingScreenRenderer.lIIlIIIlIIIIll[LoadingScreenRenderer.lIIlIIIlIIIlIl[0]];
        this.currentlyDisplayedText = LoadingScreenRenderer.lIIlIIIlIIIIll[LoadingScreenRenderer.lIIlIIIlIIIlIl[1]];
        this.systemTime = Minecraft.getSystemTime();
        this.mc = lllllllllllllIIlllIlIIlllllllIII;
        this.scaledResolution = new ScaledResolution(lllllllllllllIIlllIlIIlllllllIII);
        this.framebuffer = new Framebuffer(lllllllllllllIIlllIlIIlllllllIII.displayWidth, lllllllllllllIIlllIlIIlllllllIII.displayHeight, (boolean)(LoadingScreenRenderer.lIIlIIIlIIIlIl[0] != 0));
        this.framebuffer.setFramebufferFilter(LoadingScreenRenderer.lIIlIIIlIIIlIl[2]);
    }
    
    @Override
    public void displaySavingString(final String lllllllllllllIIlllIlIIlllllIlIlI) {
        this.field_73724_e = (LoadingScreenRenderer.lIIlIIIlIIIlIl[1] != 0);
        this.displayString(lllllllllllllIIlllIlIIlllllIlIlI);
    }
    
    private static void llIIlIlIIlllIII() {
        (lIIlIIIlIIIIll = new String[LoadingScreenRenderer.lIIlIIIlIIIlIl[12]])[LoadingScreenRenderer.lIIlIIIlIIIlIl[0]] = llIIlIlIIllIllI("4fZCra5z6IY=", "QLNjB");
        LoadingScreenRenderer.lIIlIIIlIIIIll[LoadingScreenRenderer.lIIlIIIlIIIlIl[1]] = llIIlIlIIllIlll("", "GAkem");
    }
    
    @Override
    public void displayLoadingString(final String lllllllllllllIIlllIlIIllllIllIlI) {
        if (llIIlIlIIlllIlI(this.mc.running ? 1 : 0)) {
            if (llIIlIlIIlllIlI(this.field_73724_e ? 1 : 0)) {
                throw new MinecraftError();
            }
        }
        else {
            this.systemTime = 0L;
            this.message = lllllllllllllIIlllIlIIllllIllIlI;
            this.setLoadingProgress(LoadingScreenRenderer.lIIlIIIlIIIlIl[6]);
            this.systemTime = 0L;
        }
    }
    
    private static boolean llIIlIlIIlllIll(final int lllllllllllllIIlllIlIIlllIIIIlII) {
        return lllllllllllllIIlllIlIIlllIIIIlII != 0;
    }
    
    private static boolean llIIlIlIIlllIlI(final int lllllllllllllIIlllIlIIlllIIIIIlI) {
        return lllllllllllllIIlllIlIIlllIIIIIlI == 0;
    }
}
