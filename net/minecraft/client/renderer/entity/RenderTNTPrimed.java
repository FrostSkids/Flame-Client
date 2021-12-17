// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityTNTPrimed;

public class RenderTNTPrimed extends Render<EntityTNTPrimed>
{
    private static final /* synthetic */ int[] lIIIllllIlIIll;
    
    static {
        llIIIlllllIIlII();
    }
    
    @Override
    protected ResourceLocation getEntityTexture(final EntityTNTPrimed lllllllllllllIIllllIIllllIllIlII) {
        return TextureMap.locationBlocksTexture;
    }
    
    @Override
    public void doRender(final EntityTNTPrimed lllllllllllllIIllllIIllllIlllllI, final double lllllllllllllIIllllIIlllllIIlIII, final double lllllllllllllIIllllIIllllIllllII, final double lllllllllllllIIllllIIllllIlllIll, final float lllllllllllllIIllllIIlllllIIIlIl, final float lllllllllllllIIllllIIlllllIIIlII) {
        final BlockRendererDispatcher lllllllllllllIIllllIIlllllIIIIll = Minecraft.getMinecraft().getBlockRendererDispatcher();
        GlStateManager.pushMatrix();
        GlStateManager.translate((float)lllllllllllllIIllllIIlllllIIlIII, (float)lllllllllllllIIllllIIllllIllllII + 0.5f, (float)lllllllllllllIIllllIIllllIlllIll);
        if (llIIIlllllIIllI(llIIIlllllIIlIl(lllllllllllllIIllllIIllllIlllllI.fuse - lllllllllllllIIllllIIlllllIIIlII + 1.0f, 10.0f))) {
            float lllllllllllllIIllllIIlllllIIIIlI = 1.0f - (lllllllllllllIIllllIIllllIlllllI.fuse - lllllllllllllIIllllIIlllllIIIlII + 1.0f) / 10.0f;
            lllllllllllllIIllllIIlllllIIIIlI = MathHelper.clamp_float(lllllllllllllIIllllIIlllllIIIIlI, 0.0f, 1.0f);
            lllllllllllllIIllllIIlllllIIIIlI *= lllllllllllllIIllllIIlllllIIIIlI;
            lllllllllllllIIllllIIlllllIIIIlI *= lllllllllllllIIllllIIlllllIIIIlI;
            final float lllllllllllllIIllllIIlllllIIIIIl = 1.0f + lllllllllllllIIllllIIlllllIIIIlI * 0.3f;
            GlStateManager.scale(lllllllllllllIIllllIIlllllIIIIIl, lllllllllllllIIllllIIlllllIIIIIl, lllllllllllllIIllllIIlllllIIIIIl);
        }
        final float lllllllllllllIIllllIIlllllIIIIII = (1.0f - (lllllllllllllIIllllIIllllIlllllI.fuse - lllllllllllllIIllllIIlllllIIIlII + 1.0f) / 100.0f) * 0.8f;
        this.bindEntityTexture(lllllllllllllIIllllIIllllIlllllI);
        "".length();
        GlStateManager.translate(-0.5f, -0.5f, 0.5f);
        lllllllllllllIIllllIIlllllIIIIll.renderBlockBrightness(Blocks.tnt.getDefaultState(), lllllllllllllIIllllIIllllIlllllI.getBrightness(lllllllllllllIIllllIIlllllIIIlII));
        GlStateManager.translate(0.0f, 0.0f, 1.0f);
        if (llIIIlllllIIlll(lllllllllllllIIllllIIllllIlllllI.fuse / RenderTNTPrimed.lIIIllllIlIIll[0] % RenderTNTPrimed.lIIIllllIlIIll[1])) {
            GlStateManager.disableTexture2D();
            GlStateManager.disableLighting();
            GlStateManager.enableBlend();
            GlStateManager.blendFunc(RenderTNTPrimed.lIIIllllIlIIll[2], RenderTNTPrimed.lIIIllllIlIIll[3]);
            GlStateManager.color(1.0f, 1.0f, 1.0f, lllllllllllllIIllllIIlllllIIIIII);
            GlStateManager.doPolygonOffset(-3.0f, -3.0f);
            GlStateManager.enablePolygonOffset();
            lllllllllllllIIllllIIlllllIIIIll.renderBlockBrightness(Blocks.tnt.getDefaultState(), 1.0f);
            GlStateManager.doPolygonOffset(0.0f, 0.0f);
            GlStateManager.disablePolygonOffset();
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManager.disableBlend();
            GlStateManager.enableLighting();
            GlStateManager.enableTexture2D();
        }
        GlStateManager.popMatrix();
        super.doRender(lllllllllllllIIllllIIllllIlllllI, lllllllllllllIIllllIIlllllIIlIII, lllllllllllllIIllllIIllllIllllII, lllllllllllllIIllllIIllllIlllIll, lllllllllllllIIllllIIlllllIIIlIl, lllllllllllllIIllllIIlllllIIIlII);
    }
    
    private static boolean llIIIlllllIIllI(final int lllllllllllllIIllllIIllllIIllllI) {
        return lllllllllllllIIllllIIllllIIllllI < 0;
    }
    
    private static void llIIIlllllIIlII() {
        (lIIIllllIlIIll = new int[4])[0] = (0x56 ^ 0x53);
        RenderTNTPrimed.lIIIllllIlIIll[1] = "  ".length();
        RenderTNTPrimed.lIIIllllIlIIll[2] = (0xFFFF97AE & 0x6B53);
        RenderTNTPrimed.lIIIllllIlIIll[3] = (0xFFFFFBE7 & 0x71C);
    }
    
    private static boolean llIIIlllllIIlll(final int lllllllllllllIIllllIIllllIlIIIII) {
        return lllllllllllllIIllllIIllllIlIIIII == 0;
    }
    
    private static int llIIIlllllIIlIl(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public RenderTNTPrimed(final RenderManager lllllllllllllIIllllIIlllllIlIlll) {
        super(lllllllllllllIIllllIIlllllIlIlll);
        this.shadowSize = 0.5f;
    }
}
