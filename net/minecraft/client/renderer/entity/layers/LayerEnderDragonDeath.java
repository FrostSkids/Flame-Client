// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity.layers;

import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import net.minecraft.client.renderer.GlStateManager;
import java.util.Random;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.boss.EntityDragon;

public class LayerEnderDragonDeath implements LayerRenderer<EntityDragon>
{
    private static final /* synthetic */ int[] lIIllIlIIllIII;
    
    private static int llIllIIIlIIlIll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    static {
        llIllIIIlIIlIlI();
    }
    
    private static int llIllIIIlIIllII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    @Override
    public boolean shouldCombineTextures() {
        return LayerEnderDragonDeath.lIIllIlIIllIII[3] != 0;
    }
    
    private static void llIllIIIlIIlIlI() {
        (lIIllIlIIllIII = new int[7])[0] = (-(0xFFFFE37F & 0x7ED5) & (0xFFFFFFDD & 0x7F77));
        LayerEnderDragonDeath.lIIllIlIIllIII[1] = (-(0xFFFFAC3F & 0x5FC1) & (0xFFFF8F52 & 0x7FAF));
        LayerEnderDragonDeath.lIIllIlIIllIII[2] = " ".length();
        LayerEnderDragonDeath.lIIllIlIIllIII[3] = ((0xFE ^ 0xBF) & ~(0x6A ^ 0x2B));
        LayerEnderDragonDeath.lIIllIlIIllIII[4] = (32 + 55 + 30 + 38 ^ 75 + 74 + 2 + 6);
        LayerEnderDragonDeath.lIIllIlIIllIII[5] = 30 + 67 - 61 + 100 + (0x0 ^ 0x67) - (0xFE ^ 0xC4) + (0xC4 ^ 0x8E);
        LayerEnderDragonDeath.lIIllIlIIllIII[6] = (0xFFFFBF24 & 0x5DDB);
    }
    
    private static boolean llIllIIIlIIllIl(final int lllllllllllllIIlIlIlIlllIllIIlll) {
        return lllllllllllllIIlIlIlIlllIllIIlll > 0;
    }
    
    private static boolean llIllIIIlIIlllI(final int lllllllllllllIIlIlIlIlllIllIlIIl) {
        return lllllllllllllIIlIlIlIlllIllIlIIl >= 0;
    }
    
    @Override
    public void doRenderLayer(final EntityDragon lllllllllllllIIlIlIlIllllIIlIlll, final float lllllllllllllIIlIlIlIllllIIlIllI, final float lllllllllllllIIlIlIlIllllIIlIlIl, final float lllllllllllllIIlIlIlIllllIIlIlII, final float lllllllllllllIIlIlIlIllllIIlIIll, final float lllllllllllllIIlIlIlIllllIIlIIlI, final float lllllllllllllIIlIlIlIllllIIlIIIl, final float lllllllllllllIIlIlIlIllllIIlIIII) {
        if (llIllIIIlIIllIl(lllllllllllllIIlIlIlIllllIIlIlll.deathTicks)) {
            final Tessellator lllllllllllllIIlIlIlIllllIIIllll = Tessellator.getInstance();
            final WorldRenderer lllllllllllllIIlIlIlIllllIIIlllI = lllllllllllllIIlIlIlIllllIIIllll.getWorldRenderer();
            RenderHelper.disableStandardItemLighting();
            final float lllllllllllllIIlIlIlIllllIIIllIl = (lllllllllllllIIlIlIlIllllIIlIlll.deathTicks + lllllllllllllIIlIlIlIllllIIlIlII) / 200.0f;
            float lllllllllllllIIlIlIlIllllIIIllII = 0.0f;
            if (llIllIIIlIIllIl(llIllIIIlIIlIll(lllllllllllllIIlIlIlIllllIIIllIl, 0.8f))) {
                lllllllllllllIIlIlIlIllllIIIllII = (lllllllllllllIIlIlIlIllllIIIllIl - 0.8f) / 0.2f;
            }
            final Random lllllllllllllIIlIlIlIllllIIIlIll = new Random(432L);
            GlStateManager.disableTexture2D();
            GlStateManager.shadeModel(LayerEnderDragonDeath.lIIllIlIIllIII[0]);
            GlStateManager.enableBlend();
            GlStateManager.blendFunc(LayerEnderDragonDeath.lIIllIlIIllIII[1], LayerEnderDragonDeath.lIIllIlIIllIII[2]);
            GlStateManager.disableAlpha();
            GlStateManager.enableCull();
            GlStateManager.depthMask((boolean)(LayerEnderDragonDeath.lIIllIlIIllIII[3] != 0));
            GlStateManager.pushMatrix();
            GlStateManager.translate(0.0f, -1.0f, -2.0f);
            int lllllllllllllIIlIlIlIllllIIIlIlI = LayerEnderDragonDeath.lIIllIlIIllIII[3];
            "".length();
            if (((0x2A ^ 0x3E) & ~(0x56 ^ 0x42)) > ((0x1A ^ 0x35) & ~(0x35 ^ 0x1A))) {
                return;
            }
            while (!llIllIIIlIIlllI(llIllIIIlIIllII((float)lllllllllllllIIlIlIlIllllIIIlIlI, (lllllllllllllIIlIlIlIllllIIIllIl + lllllllllllllIIlIlIlIllllIIIllIl * lllllllllllllIIlIlIlIllllIIIllIl) / 2.0f * 60.0f))) {
                GlStateManager.rotate(lllllllllllllIIlIlIlIllllIIIlIll.nextFloat() * 360.0f, 1.0f, 0.0f, 0.0f);
                GlStateManager.rotate(lllllllllllllIIlIlIlIllllIIIlIll.nextFloat() * 360.0f, 0.0f, 1.0f, 0.0f);
                GlStateManager.rotate(lllllllllllllIIlIlIlIllllIIIlIll.nextFloat() * 360.0f, 0.0f, 0.0f, 1.0f);
                GlStateManager.rotate(lllllllllllllIIlIlIlIllllIIIlIll.nextFloat() * 360.0f, 1.0f, 0.0f, 0.0f);
                GlStateManager.rotate(lllllllllllllIIlIlIlIllllIIIlIll.nextFloat() * 360.0f, 0.0f, 1.0f, 0.0f);
                GlStateManager.rotate(lllllllllllllIIlIlIlIllllIIIlIll.nextFloat() * 360.0f + lllllllllllllIIlIlIlIllllIIIllIl * 90.0f, 0.0f, 0.0f, 1.0f);
                final float lllllllllllllIIlIlIlIllllIIIlIIl = lllllllllllllIIlIlIlIllllIIIlIll.nextFloat() * 20.0f + 5.0f + lllllllllllllIIlIlIlIllllIIIllII * 10.0f;
                final float lllllllllllllIIlIlIlIllllIIIlIII = lllllllllllllIIlIlIlIllllIIIlIll.nextFloat() * 2.0f + 1.0f + lllllllllllllIIlIlIlIllllIIIllII * 2.0f;
                lllllllllllllIIlIlIlIllllIIIlllI.begin(LayerEnderDragonDeath.lIIllIlIIllIII[4], DefaultVertexFormats.POSITION_COLOR);
                lllllllllllllIIlIlIlIllllIIIlllI.pos(0.0, 0.0, 0.0).color(LayerEnderDragonDeath.lIIllIlIIllIII[5], LayerEnderDragonDeath.lIIllIlIIllIII[5], LayerEnderDragonDeath.lIIllIlIIllIII[5], (int)(255.0f * (1.0f - lllllllllllllIIlIlIlIllllIIIllII))).endVertex();
                lllllllllllllIIlIlIlIllllIIIlllI.pos(-0.866 * lllllllllllllIIlIlIlIllllIIIlIII, lllllllllllllIIlIlIlIllllIIIlIIl, -0.5f * lllllllllllllIIlIlIlIllllIIIlIII).color(LayerEnderDragonDeath.lIIllIlIIllIII[5], LayerEnderDragonDeath.lIIllIlIIllIII[3], LayerEnderDragonDeath.lIIllIlIIllIII[5], LayerEnderDragonDeath.lIIllIlIIllIII[3]).endVertex();
                lllllllllllllIIlIlIlIllllIIIlllI.pos(0.866 * lllllllllllllIIlIlIlIllllIIIlIII, lllllllllllllIIlIlIlIllllIIIlIIl, -0.5f * lllllllllllllIIlIlIlIllllIIIlIII).color(LayerEnderDragonDeath.lIIllIlIIllIII[5], LayerEnderDragonDeath.lIIllIlIIllIII[3], LayerEnderDragonDeath.lIIllIlIIllIII[5], LayerEnderDragonDeath.lIIllIlIIllIII[3]).endVertex();
                lllllllllllllIIlIlIlIllllIIIlllI.pos(0.0, lllllllllllllIIlIlIlIllllIIIlIIl, 1.0f * lllllllllllllIIlIlIlIllllIIIlIII).color(LayerEnderDragonDeath.lIIllIlIIllIII[5], LayerEnderDragonDeath.lIIllIlIIllIII[3], LayerEnderDragonDeath.lIIllIlIIllIII[5], LayerEnderDragonDeath.lIIllIlIIllIII[3]).endVertex();
                lllllllllllllIIlIlIlIllllIIIlllI.pos(-0.866 * lllllllllllllIIlIlIlIllllIIIlIII, lllllllllllllIIlIlIlIllllIIIlIIl, -0.5f * lllllllllllllIIlIlIlIllllIIIlIII).color(LayerEnderDragonDeath.lIIllIlIIllIII[5], LayerEnderDragonDeath.lIIllIlIIllIII[3], LayerEnderDragonDeath.lIIllIlIIllIII[5], LayerEnderDragonDeath.lIIllIlIIllIII[3]).endVertex();
                lllllllllllllIIlIlIlIllllIIIllll.draw();
                ++lllllllllllllIIlIlIlIllllIIIlIlI;
            }
            GlStateManager.popMatrix();
            GlStateManager.depthMask((boolean)(LayerEnderDragonDeath.lIIllIlIIllIII[2] != 0));
            GlStateManager.disableCull();
            GlStateManager.disableBlend();
            GlStateManager.shadeModel(LayerEnderDragonDeath.lIIllIlIIllIII[6]);
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManager.enableTexture2D();
            GlStateManager.enableAlpha();
            RenderHelper.enableStandardItemLighting();
        }
    }
}
