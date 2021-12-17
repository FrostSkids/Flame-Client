// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity.layers;

import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import net.minecraft.client.renderer.GlStateManager;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.model.ModelWither;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.renderer.entity.RenderWither;
import net.minecraft.entity.boss.EntityWither;

public class LayerWitherAura implements LayerRenderer<EntityWither>
{
    private final /* synthetic */ RenderWither witherRenderer;
    private static final /* synthetic */ ResourceLocation WITHER_ARMOR;
    private final /* synthetic */ ModelWither witherModel;
    private static final /* synthetic */ String[] lIIllIlIIIlIll;
    private static final /* synthetic */ int[] lIIllIlIIIllII;
    
    private static boolean llIllIIIIlIllII(final int lllllllllllllIIlIlIllIlIIlIlIIII) {
        return lllllllllllllIIlIlIllIlIIlIlIIII != 0;
    }
    
    static {
        llIllIIIIlIlIll();
        llIllIIIIlIlIlI();
        WITHER_ARMOR = new ResourceLocation(LayerWitherAura.lIIllIlIIIlIll[LayerWitherAura.lIIllIlIIIllII[0]]);
    }
    
    private static String llIllIIIIlIlIIl(final String lllllllllllllIIlIlIllIlIIlIlIlll, final String lllllllllllllIIlIlIllIlIIlIlIllI) {
        try {
            final SecretKeySpec lllllllllllllIIlIlIllIlIIlIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIllIlIIlIlIllI.getBytes(StandardCharsets.UTF_8)), LayerWitherAura.lIIllIlIIIllII[4]), "DES");
            final Cipher lllllllllllllIIlIlIllIlIIlIllIIl = Cipher.getInstance("DES");
            lllllllllllllIIlIlIllIlIIlIllIIl.init(LayerWitherAura.lIIllIlIIIllII[5], lllllllllllllIIlIlIllIlIIlIllIlI);
            return new String(lllllllllllllIIlIlIllIlIIlIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIllIlIIlIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIlIllIlIIlIllIII) {
            lllllllllllllIIlIlIllIlIIlIllIII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public boolean shouldCombineTextures() {
        return LayerWitherAura.lIIllIlIIIllII[0] != 0;
    }
    
    private static void llIllIIIIlIlIlI() {
        (lIIllIlIIIlIll = new String[LayerWitherAura.lIIllIlIIIllII[1]])[LayerWitherAura.lIIllIlIIIllII[0]] = llIllIIIIlIlIIl("70JzpYJXcoxuTKnoj1b9lLT1hXOu1CPvS4scq58UzXVXGpf+YLjG4A==", "FaJNy");
    }
    
    @Override
    public void doRenderLayer(final EntityWither lllllllllllllIIlIlIllIlIIlllllIl, final float lllllllllllllIIlIlIllIlIlIIIlIIl, final float lllllllllllllIIlIlIllIlIlIIIlIII, final float lllllllllllllIIlIlIllIlIIllllIlI, final float lllllllllllllIIlIlIllIlIIllllIIl, final float lllllllllllllIIlIlIllIlIIllllIII, final float lllllllllllllIIlIlIllIlIIlllIlll, final float lllllllllllllIIlIlIllIlIlIIIIIll) {
        if (llIllIIIIlIllII(lllllllllllllIIlIlIllIlIIlllllIl.isArmored() ? 1 : 0)) {
            int lllllllllllllIIlIlIIlllIIIIIIIIl;
            if (llIllIIIIlIllII(lllllllllllllIIlIlIllIlIIlllllIl.isInvisible() ? 1 : 0)) {
                lllllllllllllIIlIlIIlllIIIIIIIIl = LayerWitherAura.lIIllIlIIIllII[0];
                "".length();
                if (((0x3E ^ 0x5) & ~(0xA4 ^ 0x9F)) <= -" ".length()) {
                    return;
                }
            }
            else {
                lllllllllllllIIlIlIIlllIIIIIIIIl = LayerWitherAura.lIIllIlIIIllII[1];
            }
            GlStateManager.depthMask((boolean)(lllllllllllllIIlIlIIlllIIIIIIIIl != 0));
            this.witherRenderer.bindTexture(LayerWitherAura.WITHER_ARMOR);
            GlStateManager.matrixMode(LayerWitherAura.lIIllIlIIIllII[2]);
            GlStateManager.loadIdentity();
            final float lllllllllllllIIlIlIllIlIlIIIIIlI = lllllllllllllIIlIlIllIlIIlllllIl.ticksExisted + lllllllllllllIIlIlIllIlIIllllIlI;
            final float lllllllllllllIIlIlIllIlIlIIIIIIl = MathHelper.cos(lllllllllllllIIlIlIllIlIlIIIIIlI * 0.02f) * 3.0f;
            final float lllllllllllllIIlIlIllIlIlIIIIIII = lllllllllllllIIlIlIllIlIlIIIIIlI * 0.01f;
            GlStateManager.translate(lllllllllllllIIlIlIllIlIlIIIIIIl, lllllllllllllIIlIlIllIlIlIIIIIII, 0.0f);
            GlStateManager.matrixMode(LayerWitherAura.lIIllIlIIIllII[3]);
            GlStateManager.enableBlend();
            final float lllllllllllllIIlIlIllIlIIlllllll = 0.5f;
            GlStateManager.color(lllllllllllllIIlIlIllIlIIlllllll, lllllllllllllIIlIlIllIlIIlllllll, lllllllllllllIIlIlIllIlIIlllllll, 1.0f);
            GlStateManager.disableLighting();
            GlStateManager.blendFunc(LayerWitherAura.lIIllIlIIIllII[1], LayerWitherAura.lIIllIlIIIllII[1]);
            this.witherModel.setLivingAnimations(lllllllllllllIIlIlIllIlIIlllllIl, lllllllllllllIIlIlIllIlIlIIIlIIl, lllllllllllllIIlIlIllIlIlIIIlIII, lllllllllllllIIlIlIllIlIIllllIlI);
            this.witherModel.setModelAttributes(this.witherRenderer.getMainModel());
            this.witherModel.render(lllllllllllllIIlIlIllIlIIlllllIl, lllllllllllllIIlIlIllIlIlIIIlIIl, lllllllllllllIIlIlIllIlIlIIIlIII, lllllllllllllIIlIlIllIlIIllllIIl, lllllllllllllIIlIlIllIlIIllllIII, lllllllllllllIIlIlIllIlIIlllIlll, lllllllllllllIIlIlIllIlIlIIIIIll);
            GlStateManager.matrixMode(LayerWitherAura.lIIllIlIIIllII[2]);
            GlStateManager.loadIdentity();
            GlStateManager.matrixMode(LayerWitherAura.lIIllIlIIIllII[3]);
            GlStateManager.enableLighting();
            GlStateManager.disableBlend();
        }
    }
    
    private static void llIllIIIIlIlIll() {
        (lIIllIlIIIllII = new int[6])[0] = ((172 + 119 - 134 + 24 ^ 63 + 185 - 211 + 149) & (0xDB ^ 0xA6 ^ (0xB6 ^ 0xC4) ^ -" ".length()));
        LayerWitherAura.lIIllIlIIIllII[1] = " ".length();
        LayerWitherAura.lIIllIlIIIllII[2] = (-(0xFFFFDBF7 & 0x6CDE) & (0xFFFFDFFF & 0x7FD7));
        LayerWitherAura.lIIllIlIIIllII[3] = (-(0xFFFFEAFF & 0x3D4E) & (0xFFFFFFFD & 0x3F4F));
        LayerWitherAura.lIIllIlIIIllII[4] = (0x12 ^ 0x1A);
        LayerWitherAura.lIIllIlIIIllII[5] = "  ".length();
    }
    
    public LayerWitherAura(final RenderWither lllllllllllllIIlIlIllIlIlIIllIll) {
        this.witherModel = new ModelWither(0.5f);
        this.witherRenderer = lllllllllllllIIlIlIllIlIlIIllIll;
    }
}
