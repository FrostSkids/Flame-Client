// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.tileentity;

import java.util.List;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.block.Block;
import net.minecraft.util.IChatComponent;
import net.minecraft.client.gui.GuiUtilRenderComponents;
import org.lwjgl.opengl.GL11;
import net.minecraft.init.Blocks;
import net.minecraft.client.renderer.GlStateManager;
import java.util.Arrays;
import net.minecraft.tileentity.TileEntity;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.model.ModelSign;
import net.minecraft.tileentity.TileEntitySign;

public class TileEntitySignRenderer extends TileEntitySpecialRenderer<TileEntitySign>
{
    private static final /* synthetic */ String[] lIllIlllllIIIl;
    private final /* synthetic */ ModelSign model;
    private static final /* synthetic */ int[] lIllIllllllIII;
    private static final /* synthetic */ ResourceLocation SIGN_TEXTURE;
    
    public TileEntitySignRenderer() {
        this.model = new ModelSign();
    }
    
    private static String lIIIIIIIlIIIllll(final String llllllllllllIllllllIIIIllIlllIll, final String llllllllllllIllllllIIIIllIlllIlI) {
        try {
            final SecretKeySpec llllllllllllIllllllIIIIllIlllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllllIIIIllIlllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllllIIIIllIllllIl = Cipher.getInstance("Blowfish");
            llllllllllllIllllllIIIIllIllllIl.init(TileEntitySignRenderer.lIllIllllllIII[3], llllllllllllIllllllIIIIllIlllllI);
            return new String(llllllllllllIllllllIIIIllIllllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllllllIIIIllIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllllIIIIllIllllII) {
            llllllllllllIllllllIIIIllIllllII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIIIIlIIllllI(final Object llllllllllllIllllllIIIIllIlIlIll, final Object llllllllllllIllllllIIIIllIlIlIlI) {
        return llllllllllllIllllllIIIIllIlIlIll == llllllllllllIllllllIIIIllIlIlIlI;
    }
    
    private static boolean lIIIIIIIlIlIIIII(final int llllllllllllIllllllIIIIllIlIIllI) {
        return llllllllllllIllllllIIIIllIlIIllI >= 0;
    }
    
    private static void lIIIIIIIlIIlIlII() {
        (lIllIlllllIIIl = new String[TileEntitySignRenderer.lIllIllllllIII[4]])[TileEntitySignRenderer.lIllIllllllIII[0]] = lIIIIIIIlIIIllll("E/lFkWp6/5RZSS1CQabbfuL9HtDvQD/invtii3P23c8=", "iORvA");
        TileEntitySignRenderer.lIllIlllllIIIl[TileEntitySignRenderer.lIllIllllllIII[2]] = lIIIIIIIlIIlIIIl("GOjNd2Tn/a4=", "XWwVi");
        TileEntitySignRenderer.lIllIlllllIIIl[TileEntitySignRenderer.lIllIllllllIII[3]] = lIIIIIIIlIIIllll("GxFuSvEeDR8=", "OMAhc");
        TileEntitySignRenderer.lIllIlllllIIIl[TileEntitySignRenderer.lIllIllllllIII[9]] = lIIIIIIIlIIlIIIl("z9StvOcScoE=", "lGyZk");
    }
    
    private static boolean lIIIIIIIlIIlllll(final int llllllllllllIllllllIIIIllIllIIll, final int llllllllllllIllllllIIIIllIllIIlI) {
        return llllllllllllIllllllIIIIllIllIIll == llllllllllllIllllllIIIIllIllIIlI;
    }
    
    private static boolean lIIIIIIIlIlIIIIl(final int llllllllllllIllllllIIIIllIlIIlII) {
        return llllllllllllIllllllIIIIllIlIIlII < 0;
    }
    
    private static boolean lIIIIIIIlIlIIIll(final int llllllllllllIllllllIIIIllIlIIIlI) {
        return llllllllllllIllllllIIIIllIlIIIlI > 0;
    }
    
    private static String lIIIIIIIlIIlIIIl(final String llllllllllllIllllllIIIIlllIIlIII, final String llllllllllllIllllllIIIIlllIIIlIl) {
        try {
            final SecretKeySpec llllllllllllIllllllIIIIlllIIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllllIIIIlllIIIlIl.getBytes(StandardCharsets.UTF_8)), TileEntitySignRenderer.lIllIllllllIII[11]), "DES");
            final Cipher llllllllllllIllllllIIIIlllIIlIlI = Cipher.getInstance("DES");
            llllllllllllIllllllIIIIlllIIlIlI.init(TileEntitySignRenderer.lIllIllllllIII[3], llllllllllllIllllllIIIIlllIIlIll);
            return new String(llllllllllllIllllllIIIIlllIIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllllllIIIIlllIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllllIIIIlllIIlIIl) {
            llllllllllllIllllllIIIIlllIIlIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void renderTileEntityAt(final TileEntitySign llllllllllllIllllllIIIIllllIlIll, final double llllllllllllIllllllIIIIlllllllIl, final double llllllllllllIllllllIIIIlllllllII, final double llllllllllllIllllllIIIIllllllIll, final float llllllllllllIllllllIIIIllllllIlI, final int llllllllllllIllllllIIIIllllIIlll) {
        final Block llllllllllllIllllllIIIIllllllIII = llllllllllllIllllllIIIIllllIlIll.getBlockType();
        GlStateManager.pushMatrix();
        final float llllllllllllIllllllIIIIlllllIlll = 0.6666667f;
        if (lIIIIIIIlIIllllI(llllllllllllIllllllIIIIllllllIII, Blocks.standing_sign)) {
            GlStateManager.translate((float)llllllllllllIllllllIIIIlllllllIl + 0.5f, (float)llllllllllllIllllllIIIIlllllllII + 0.75f * llllllllllllIllllllIIIIlllllIlll, (float)llllllllllllIllllllIIIIllllllIll + 0.5f);
            final float llllllllllllIllllllIIIIlllllIllI = llllllllllllIllllllIIIIllllIlIll.getBlockMetadata() * TileEntitySignRenderer.lIllIllllllIII[1] / 16.0f;
            GlStateManager.rotate(-llllllllllllIllllllIIIIlllllIllI, 0.0f, 1.0f, 0.0f);
            this.model.signStick.showModel = (TileEntitySignRenderer.lIllIllllllIII[2] != 0);
            "".length();
            if ("  ".length() > (0xBA ^ 0xBE)) {
                return;
            }
        }
        else {
            final int llllllllllllIllllllIIIIlllllIlIl = llllllllllllIllllllIIIIllllIlIll.getBlockMetadata();
            float llllllllllllIllllllIIIIlllllIlII = 0.0f;
            if (lIIIIIIIlIIlllll(llllllllllllIllllllIIIIlllllIlIl, TileEntitySignRenderer.lIllIllllllIII[3])) {
                llllllllllllIllllllIIIIlllllIlII = 180.0f;
            }
            if (lIIIIIIIlIIlllll(llllllllllllIllllllIIIIlllllIlIl, TileEntitySignRenderer.lIllIllllllIII[4])) {
                llllllllllllIllllllIIIIlllllIlII = 90.0f;
            }
            if (lIIIIIIIlIIlllll(llllllllllllIllllllIIIIlllllIlIl, TileEntitySignRenderer.lIllIllllllIII[5])) {
                llllllllllllIllllllIIIIlllllIlII = -90.0f;
            }
            GlStateManager.translate((float)llllllllllllIllllllIIIIlllllllIl + 0.5f, (float)llllllllllllIllllllIIIIlllllllII + 0.75f * llllllllllllIllllllIIIIlllllIlll, (float)llllllllllllIllllllIIIIllllllIll + 0.5f);
            GlStateManager.rotate(-llllllllllllIllllllIIIIlllllIlII, 0.0f, 1.0f, 0.0f);
            GlStateManager.translate(0.0f, -0.3125f, -0.4375f);
            this.model.signStick.showModel = (TileEntitySignRenderer.lIllIllllllIII[0] != 0);
        }
        if (lIIIIIIIlIlIIIII(llllllllllllIllllllIIIIllllIIlll)) {
            this.bindTexture(TileEntitySignRenderer.DESTROY_STAGES[llllllllllllIllllllIIIIllllIIlll]);
            GlStateManager.matrixMode(TileEntitySignRenderer.lIllIllllllIII[6]);
            GlStateManager.pushMatrix();
            GlStateManager.scale(4.0f, 2.0f, 1.0f);
            GlStateManager.translate(0.0625f, 0.0625f, 0.0625f);
            GlStateManager.matrixMode(TileEntitySignRenderer.lIllIllllllIII[7]);
            "".length();
            if (-" ".length() < -" ".length()) {
                return;
            }
        }
        else {
            this.bindTexture(TileEntitySignRenderer.SIGN_TEXTURE);
        }
        GlStateManager.enableRescaleNormal();
        GlStateManager.pushMatrix();
        GlStateManager.scale(llllllllllllIllllllIIIIlllllIlll, -llllllllllllIllllllIIIIlllllIlll, -llllllllllllIllllllIIIIlllllIlll);
        this.model.renderSign();
        GlStateManager.popMatrix();
        final FontRenderer llllllllllllIllllllIIIIlllllIIll = this.getFontRenderer();
        final float llllllllllllIllllllIIIIlllllIIlI = 0.015625f * llllllllllllIllllllIIIIlllllIlll;
        GlStateManager.translate(0.0f, 0.5f * llllllllllllIllllllIIIIlllllIlll, 0.07f * llllllllllllIllllllIIIIlllllIlll);
        GlStateManager.scale(llllllllllllIllllllIIIIlllllIIlI, -llllllllllllIllllllIIIIlllllIIlI, llllllllllllIllllllIIIIlllllIIlI);
        GL11.glNormal3f(0.0f, 0.0f, -1.0f * llllllllllllIllllllIIIIlllllIIlI);
        GlStateManager.depthMask((boolean)(TileEntitySignRenderer.lIllIllllllIII[0] != 0));
        final int llllllllllllIllllllIIIIlllllIIIl = TileEntitySignRenderer.lIllIllllllIII[0];
        if (lIIIIIIIlIlIIIIl(llllllllllllIllllllIIIIllllIIlll)) {
            int llllllllllllIllllllIIIIlllllIIII = TileEntitySignRenderer.lIllIllllllIII[0];
            "".length();
            if (" ".length() > "   ".length()) {
                return;
            }
            while (!lIIIIIIIlIlIIlII(llllllllllllIllllllIIIIlllllIIII, llllllllllllIllllllIIIIllllIlIll.signText.length)) {
                if (lIIIIIIIlIlIIIlI(llllllllllllIllllllIIIIllllIlIll.signText[llllllllllllIllllllIIIIlllllIIII])) {
                    final IChatComponent llllllllllllIllllllIIIIllllIllll = llllllllllllIllllllIIIIllllIlIll.signText[llllllllllllIllllllIIIIlllllIIII];
                    final List<IChatComponent> llllllllllllIllllllIIIIllllIlllI = GuiUtilRenderComponents.func_178908_a(llllllllllllIllllllIIIIllllIllll, TileEntitySignRenderer.lIllIllllllIII[8], llllllllllllIllllllIIIIlllllIIll, (boolean)(TileEntitySignRenderer.lIllIllllllIII[0] != 0), (boolean)(TileEntitySignRenderer.lIllIllllllIII[2] != 0));
                    String formattedText;
                    if (lIIIIIIIlIlIIIlI(llllllllllllIllllllIIIIllllIlllI) && lIIIIIIIlIlIIIll(llllllllllllIllllllIIIIllllIlllI.size())) {
                        formattedText = llllllllllllIllllllIIIIllllIlllI.get(TileEntitySignRenderer.lIllIllllllIII[0]).getFormattedText();
                        "".length();
                        if ((0x6B ^ 0x29 ^ (0x44 ^ 0x2)) == 0x0) {
                            return;
                        }
                    }
                    else {
                        formattedText = TileEntitySignRenderer.lIllIlllllIIIl[TileEntitySignRenderer.lIllIllllllIII[2]];
                    }
                    String llllllllllllIllllllIIIIllllIllIl = formattedText;
                    if (lIIIIIIIlIIlllll(llllllllllllIllllllIIIIlllllIIII, llllllllllllIllllllIIIIllllIlIll.lineBeingEdited)) {
                        llllllllllllIllllllIIIIllllIllIl = String.valueOf(new StringBuilder(TileEntitySignRenderer.lIllIlllllIIIl[TileEntitySignRenderer.lIllIllllllIII[3]]).append(llllllllllllIllllllIIIIllllIllIl).append(TileEntitySignRenderer.lIllIlllllIIIl[TileEntitySignRenderer.lIllIllllllIII[9]]));
                        llllllllllllIllllllIIIIlllllIIll.drawString(llllllllllllIllllllIIIIllllIllIl, -llllllllllllIllllllIIIIlllllIIll.getStringWidth(llllllllllllIllllllIIIIllllIllIl) / TileEntitySignRenderer.lIllIllllllIII[3], llllllllllllIllllllIIIIlllllIIII * TileEntitySignRenderer.lIllIllllllIII[10] - llllllllllllIllllllIIIIllllIlIll.signText.length * TileEntitySignRenderer.lIllIllllllIII[5], llllllllllllIllllllIIIIlllllIIIl);
                        "".length();
                        "".length();
                        if (((0x35 ^ 0x70 ^ (0x16 ^ 0x78)) & (0x4A ^ 0x6E ^ (0x9 ^ 0x6) ^ -" ".length())) != 0x0) {
                            return;
                        }
                    }
                    else {
                        llllllllllllIllllllIIIIlllllIIll.drawString(llllllllllllIllllllIIIIllllIllIl, -llllllllllllIllllllIIIIlllllIIll.getStringWidth(llllllllllllIllllllIIIIllllIllIl) / TileEntitySignRenderer.lIllIllllllIII[3], llllllllllllIllllllIIIIlllllIIII * TileEntitySignRenderer.lIllIllllllIII[10] - llllllllllllIllllllIIIIllllIlIll.signText.length * TileEntitySignRenderer.lIllIllllllIII[5], llllllllllllIllllllIIIIlllllIIIl);
                        "".length();
                    }
                }
                ++llllllllllllIllllllIIIIlllllIIII;
            }
        }
        GlStateManager.depthMask((boolean)(TileEntitySignRenderer.lIllIllllllIII[2] != 0));
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        GlStateManager.popMatrix();
        if (lIIIIIIIlIlIIIII(llllllllllllIllllllIIIIllllIIlll)) {
            GlStateManager.matrixMode(TileEntitySignRenderer.lIllIllllllIII[6]);
            GlStateManager.popMatrix();
            GlStateManager.matrixMode(TileEntitySignRenderer.lIllIllllllIII[7]);
        }
    }
    
    static {
        lIIIIIIIlIIlllIl();
        lIIIIIIIlIIlIlII();
        SIGN_TEXTURE = new ResourceLocation(TileEntitySignRenderer.lIllIlllllIIIl[TileEntitySignRenderer.lIllIllllllIII[0]]);
    }
    
    private static boolean lIIIIIIIlIlIIlII(final int llllllllllllIllllllIIIIllIlIllll, final int llllllllllllIllllllIIIIllIlIlllI) {
        return llllllllllllIllllllIIIIllIlIllll >= llllllllllllIllllllIIIIllIlIlllI;
    }
    
    private static boolean lIIIIIIIlIlIIIlI(final Object llllllllllllIllllllIIIIllIlIlIII) {
        return llllllllllllIllllllIIIIllIlIlIII != null;
    }
    
    private static void lIIIIIIIlIIlllIl() {
        (lIllIllllllIII = new int[12])[0] = ((0x7A ^ 0x3A) & ~(0x39 ^ 0x79));
        TileEntitySignRenderer.lIllIllllllIII[1] = (-(0xFFFFFF53 & 0x74BF) & (0xFFFFF5FF & 0x7F7A));
        TileEntitySignRenderer.lIllIllllllIII[2] = " ".length();
        TileEntitySignRenderer.lIllIllllllIII[3] = "  ".length();
        TileEntitySignRenderer.lIllIllllllIII[4] = (0x2A ^ 0x18 ^ (0x1C ^ 0x2A));
        TileEntitySignRenderer.lIllIllllllIII[5] = (164 + 48 - 80 + 47 ^ 91 + 142 - 80 + 29);
        TileEntitySignRenderer.lIllIllllllIII[6] = (0xFFFFBFF6 & 0x570B);
        TileEntitySignRenderer.lIllIllllllIII[7] = (-(0xFFFFCBFB & 0x3CBE) & (0xFFFFFFB9 & 0x1FFF));
        TileEntitySignRenderer.lIllIllllllIII[8] = (0xA8 ^ 0x87 ^ (0xD2 ^ 0xA7));
        TileEntitySignRenderer.lIllIllllllIII[9] = "   ".length();
        TileEntitySignRenderer.lIllIllllllIII[10] = (0x64 ^ 0x6E);
        TileEntitySignRenderer.lIllIllllllIII[11] = (0x59 ^ 0x27 ^ (0xDD ^ 0xAB));
    }
}
