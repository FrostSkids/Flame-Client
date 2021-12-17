// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity.layers;

import net.minecraft.entity.EntityLivingBase;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.renderer.entity.RenderEnderman;
import net.minecraft.entity.monster.EntityEnderman;

public class LayerEndermanEyes implements LayerRenderer<EntityEnderman>
{
    private final /* synthetic */ RenderEnderman endermanRenderer;
    private static final /* synthetic */ String[] lllIllllIIlllI;
    private static final /* synthetic */ ResourceLocation field_177203_a;
    private static final /* synthetic */ int[] lllIllllIlIllI;
    
    private static void lIlIIlIlllllllII() {
        (lllIllllIIlllI = new String[LayerEndermanEyes.lllIllllIlIllI[1]])[LayerEndermanEyes.lllIllllIlIllI[0]] = lIlIIlIllllllIll("hMFAIqc19EPZIFBopmv2BBui9LoZ1oIM9R9vEKHFBvVz5PEsK2hE1m/Ylf4sJ2v7", "sbfDT");
    }
    
    public LayerEndermanEyes(final RenderEnderman llllllllllllIlIlIllllllIIlllIlII) {
        this.endermanRenderer = llllllllllllIlIlIllllllIIlllIlII;
    }
    
    private static boolean lIlIIllIIIIlIIll(final int llllllllllllIlIlIllllllIIIlIllII) {
        return llllllllllllIlIlIllllllIIIlIllII != 0;
    }
    
    @Override
    public void doRenderLayer(final EntityEnderman llllllllllllIlIlIllllllIIlIllIII, final float llllllllllllIlIlIllllllIIllIIIll, final float llllllllllllIlIlIllllllIIlIlIllI, final float llllllllllllIlIlIllllllIIllIIIIl, final float llllllllllllIlIlIllllllIIlIlIlII, final float llllllllllllIlIlIllllllIIlIlllll, final float llllllllllllIlIlIllllllIIlIllllI, final float llllllllllllIlIlIllllllIIlIlIIIl) {
        this.endermanRenderer.bindTexture(LayerEndermanEyes.field_177203_a);
        GlStateManager.enableBlend();
        GlStateManager.disableAlpha();
        GlStateManager.blendFunc(LayerEndermanEyes.lllIllllIlIllI[1], LayerEndermanEyes.lllIllllIlIllI[1]);
        GlStateManager.disableLighting();
        int lllllllllllllIIlIlIIlllIIIIIIIIl;
        if (lIlIIllIIIIlIIll(llllllllllllIlIlIllllllIIlIllIII.isInvisible() ? 1 : 0)) {
            lllllllllllllIIlIlIIlllIIIIIIIIl = LayerEndermanEyes.lllIllllIlIllI[0];
            "".length();
            if (" ".length() == ((193 + 2 - 184 + 244 ^ 113 + 102 - 59 + 16) & (0x7C ^ 0x6B ^ (0xCE ^ 0x8A) ^ -" ".length()))) {
                return;
            }
        }
        else {
            lllllllllllllIIlIlIIlllIIIIIIIIl = LayerEndermanEyes.lllIllllIlIllI[1];
        }
        GlStateManager.depthMask((boolean)(lllllllllllllIIlIlIIlllIIIIIIIIl != 0));
        final int llllllllllllIlIlIllllllIIlIlllII = LayerEndermanEyes.lllIllllIlIllI[2];
        final int llllllllllllIlIlIllllllIIlIllIll = llllllllllllIlIlIllllllIIlIlllII % LayerEndermanEyes.lllIllllIlIllI[3];
        final int llllllllllllIlIlIllllllIIlIllIlI = llllllllllllIlIlIllllllIIlIlllII / LayerEndermanEyes.lllIllllIlIllI[3];
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, llllllllllllIlIlIllllllIIlIllIll / 1.0f, llllllllllllIlIlIllllllIIlIllIlI / 1.0f);
        GlStateManager.enableLighting();
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        this.endermanRenderer.getMainModel().render(llllllllllllIlIlIllllllIIlIllIII, llllllllllllIlIlIllllllIIllIIIll, llllllllllllIlIlIllllllIIlIlIllI, llllllllllllIlIlIllllllIIlIlIlII, llllllllllllIlIlIllllllIIlIlllll, llllllllllllIlIlIllllllIIlIllllI, llllllllllllIlIlIllllllIIlIlIIIl);
        this.endermanRenderer.func_177105_a(llllllllllllIlIlIllllllIIlIllIII, llllllllllllIlIlIllllllIIllIIIIl);
        GlStateManager.depthMask((boolean)(LayerEndermanEyes.lllIllllIlIllI[1] != 0));
        GlStateManager.disableBlend();
        GlStateManager.enableAlpha();
    }
    
    private static String lIlIIlIllllllIll(final String llllllllllllIlIlIllllllIIIllIIll, final String llllllllllllIlIlIllllllIIIllIIII) {
        try {
            final SecretKeySpec llllllllllllIlIlIllllllIIIllIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlIllllllIIIllIIII.getBytes(StandardCharsets.UTF_8)), LayerEndermanEyes.lllIllllIlIllI[4]), "DES");
            final Cipher llllllllllllIlIlIllllllIIIllIlIl = Cipher.getInstance("DES");
            llllllllllllIlIlIllllllIIIllIlIl.init(LayerEndermanEyes.lllIllllIlIllI[5], llllllllllllIlIlIllllllIIIllIllI);
            return new String(llllllllllllIlIlIllllllIIIllIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIlIllllllIIIllIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlIllllllIIIllIlII) {
            llllllllllllIlIlIllllllIIIllIlII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public boolean shouldCombineTextures() {
        return LayerEndermanEyes.lllIllllIlIllI[0] != 0;
    }
    
    static {
        lIlIIllIIIIlIIlI();
        lIlIIlIlllllllII();
        field_177203_a = new ResourceLocation(LayerEndermanEyes.lllIllllIIlllI[LayerEndermanEyes.lllIllllIlIllI[0]]);
    }
    
    private static void lIlIIllIIIIlIIlI() {
        (lllIllllIlIllI = new int[6])[0] = ((0x5A ^ 0x3B ^ (0xD1 ^ 0xAB)) & (0xF1 ^ 0xBB ^ (0xE4 ^ 0xB5) ^ -" ".length()));
        LayerEndermanEyes.lllIllllIlIllI[1] = " ".length();
        LayerEndermanEyes.lllIllllIlIllI[2] = (-(0xFFFFF98B & 0xF7F) & (0xFFFFFFFB & 0xF9FE));
        LayerEndermanEyes.lllIllllIlIllI[3] = (0xFFFF8C43 & 0x173BC);
        LayerEndermanEyes.lllIllllIlIllI[4] = (0x3A ^ 0x32);
        LayerEndermanEyes.lllIllllIlIllI[5] = "  ".length();
    }
}
