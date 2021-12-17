// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity.layers;

import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.GlStateManager;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.renderer.entity.RenderDragon;
import net.minecraft.entity.boss.EntityDragon;

public class LayerEnderDragonEyes implements LayerRenderer<EntityDragon>
{
    private static final /* synthetic */ int[] lIIIIllIllIIII;
    private static final /* synthetic */ String[] lIIIIllIlIllll;
    private final /* synthetic */ RenderDragon dragonRenderer;
    private static final /* synthetic */ ResourceLocation TEXTURE;
    
    private static void lIllllIIIIIIIll() {
        (lIIIIllIlIllll = new String[LayerEnderDragonEyes.lIIIIllIllIIII[1]])[LayerEnderDragonEyes.lIIIIllIllIIII[0]] = lIllllIIIIIIIlI("FRIvAR8TEiRaDw8DPgETThI5EQ8TEyUUDQ4ZeBEYABA4GzUEDjIGRBEZMA==", "awWuj");
    }
    
    static {
        lIllllIIIIIIlII();
        lIllllIIIIIIIll();
        TEXTURE = new ResourceLocation(LayerEnderDragonEyes.lIIIIllIlIllll[LayerEnderDragonEyes.lIIIIllIllIIII[0]]);
    }
    
    private static void lIllllIIIIIIlII() {
        (lIIIIllIllIIII = new int[6])[0] = ((0xBE ^ 0x9B) & ~(0x5D ^ 0x78));
        LayerEnderDragonEyes.lIIIIllIllIIII[1] = " ".length();
        LayerEnderDragonEyes.lIIIIllIllIIII[2] = (0xFFFFF65B & 0xBA6);
        LayerEnderDragonEyes.lIIIIllIllIIII[3] = (0xFFFFF4FB & 0xFBF4);
        LayerEnderDragonEyes.lIIIIllIllIIII[4] = (0xFFFFB3A2 & 0x14C5D);
        LayerEnderDragonEyes.lIIIIllIllIIII[5] = (-(0xFFFFE9FF & 0x1795) & (0xFFFFE397 & 0x1FFF));
    }
    
    public LayerEnderDragonEyes(final RenderDragon lllllllllllllIlIIlIIIllllIlIlIlI) {
        this.dragonRenderer = lllllllllllllIlIIlIIIllllIlIlIlI;
    }
    
    @Override
    public boolean shouldCombineTextures() {
        return LayerEnderDragonEyes.lIIIIllIllIIII[0] != 0;
    }
    
    private static String lIllllIIIIIIIlI(String lllllllllllllIlIIlIIIlllIllIIIIl, final String lllllllllllllIlIIlIIIlllIllIIlIl) {
        lllllllllllllIlIIlIIIlllIllIIIIl = (double)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIlIIIlllIllIIIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIlIIIlllIllIIlII = new StringBuilder();
        final char[] lllllllllllllIlIIlIIIlllIllIIIll = lllllllllllllIlIIlIIIlllIllIIlIl.toCharArray();
        int lllllllllllllIlIIlIIIlllIllIIIlI = LayerEnderDragonEyes.lIIIIllIllIIII[0];
        final float lllllllllllllIlIIlIIIlllIlIlllII = (Object)((String)lllllllllllllIlIIlIIIlllIllIIIIl).toCharArray();
        final int lllllllllllllIlIIlIIIlllIlIllIll = lllllllllllllIlIIlIIIlllIlIlllII.length;
        int lllllllllllllIlIIlIIIlllIlIllIlI = LayerEnderDragonEyes.lIIIIllIllIIII[0];
        while (lIllllIIIIIIlIl(lllllllllllllIlIIlIIIlllIlIllIlI, lllllllllllllIlIIlIIIlllIlIllIll)) {
            final char lllllllllllllIlIIlIIIlllIllIIlll = lllllllllllllIlIIlIIIlllIlIlllII[lllllllllllllIlIIlIIIlllIlIllIlI];
            lllllllllllllIlIIlIIIlllIllIIlII.append((char)(lllllllllllllIlIIlIIIlllIllIIlll ^ lllllllllllllIlIIlIIIlllIllIIIll[lllllllllllllIlIIlIIIlllIllIIIlI % lllllllllllllIlIIlIIIlllIllIIIll.length]));
            "".length();
            ++lllllllllllllIlIIlIIIlllIllIIIlI;
            ++lllllllllllllIlIIlIIIlllIlIllIlI;
            "".length();
            if (((0xF9 ^ 0xA1 ^ (0x71 ^ 0x27)) & (19 + 182 - 23 + 27 ^ 183 + 160 - 157 + 9 ^ -" ".length())) > "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIlIIIlllIllIIlII);
    }
    
    private static boolean lIllllIIIIIIlIl(final int lllllllllllllIlIIlIIIlllIlIlIllI, final int lllllllllllllIlIIlIIIlllIlIlIlIl) {
        return lllllllllllllIlIIlIIIlllIlIlIllI < lllllllllllllIlIIlIIIlllIlIlIlIl;
    }
    
    @Override
    public void doRenderLayer(final EntityDragon lllllllllllllIlIIlIIIllllIIIlllI, final float lllllllllllllIlIIlIIIllllIIllIIl, final float lllllllllllllIlIIlIIIllllIIIllII, final float lllllllllllllIlIIlIIIllllIIIlIll, final float lllllllllllllIlIIlIIIllllIIIlIlI, final float lllllllllllllIlIIlIIIllllIIlIlIl, final float lllllllllllllIlIIlIIIllllIIIlIII, final float lllllllllllllIlIIlIIIllllIIlIIll) {
        this.dragonRenderer.bindTexture(LayerEnderDragonEyes.TEXTURE);
        GlStateManager.enableBlend();
        GlStateManager.disableAlpha();
        GlStateManager.blendFunc(LayerEnderDragonEyes.lIIIIllIllIIII[1], LayerEnderDragonEyes.lIIIIllIllIIII[1]);
        GlStateManager.disableLighting();
        GlStateManager.depthFunc(LayerEnderDragonEyes.lIIIIllIllIIII[2]);
        final int lllllllllllllIlIIlIIIllllIIlIIlI = LayerEnderDragonEyes.lIIIIllIllIIII[3];
        final int lllllllllllllIlIIlIIIllllIIlIIIl = lllllllllllllIlIIlIIIllllIIlIIlI % LayerEnderDragonEyes.lIIIIllIllIIII[4];
        final int lllllllllllllIlIIlIIIllllIIlIIII = lllllllllllllIlIIlIIIllllIIlIIlI / LayerEnderDragonEyes.lIIIIllIllIIII[4];
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, lllllllllllllIlIIlIIIllllIIlIIIl / 1.0f, lllllllllllllIlIIlIIIllllIIlIIII / 1.0f);
        GlStateManager.enableLighting();
        GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
        this.dragonRenderer.getMainModel().render(lllllllllllllIlIIlIIIllllIIIlllI, lllllllllllllIlIIlIIIllllIIllIIl, lllllllllllllIlIIlIIIllllIIIllII, lllllllllllllIlIIlIIIllllIIIlIlI, lllllllllllllIlIIlIIIllllIIlIlIl, lllllllllllllIlIIlIIIllllIIIlIII, lllllllllllllIlIIlIIIllllIIlIIll);
        this.dragonRenderer.func_177105_a(lllllllllllllIlIIlIIIllllIIIlllI, lllllllllllllIlIIlIIIllllIIIlIll);
        GlStateManager.disableBlend();
        GlStateManager.enableAlpha();
        GlStateManager.depthFunc(LayerEnderDragonEyes.lIIIIllIllIIII[5]);
    }
}
