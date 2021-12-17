// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import net.minecraft.client.renderer.BlockRendererDispatcher;
import net.minecraft.init.Blocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.MathHelper;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.entity.item.EntityMinecartTNT;

public class RenderTntMinecart extends RenderMinecart<EntityMinecartTNT>
{
    private static final /* synthetic */ int[] lIIIlIIIIllIIl;
    
    static {
        lIlllllIIIlIlll();
    }
    
    private static void lIlllllIIIlIlll() {
        (lIIIlIIIIllIIl = new int[5])[0] = -" ".length();
        RenderTntMinecart.lIIIlIIIIllIIl[1] = (0x5D ^ 0x58);
        RenderTntMinecart.lIIIlIIIIllIIl[2] = "  ".length();
        RenderTntMinecart.lIIIlIIIIllIIl[3] = (0xFFFFEF02 & 0x13FF);
        RenderTntMinecart.lIIIlIIIIllIIl[4] = (-(0xFFFFFCD3 & 0x7BEF) & (0xFFFFFBFE & 0x7FC7));
    }
    
    public RenderTntMinecart(final RenderManager lllllllllllllIlIIIllIIllIllIlllI) {
        super(lllllllllllllIlIIIllIIllIllIlllI);
    }
    
    private static boolean lIlllllIIIllIlI(final int lllllllllllllIlIIIllIIllIlIIIllI) {
        return lllllllllllllIlIIIllIIllIlIIIllI < 0;
    }
    
    @Override
    protected void func_180560_a(final EntityMinecartTNT lllllllllllllIlIIIllIIllIllIIIll, final float lllllllllllllIlIIIllIIllIllIIIlI, final IBlockState lllllllllllllIlIIIllIIllIlIllIIl) {
        final int lllllllllllllIlIIIllIIllIllIIIII = lllllllllllllIlIIIllIIllIllIIIll.getFuseTicks();
        if (lIlllllIIIllIIl(lllllllllllllIlIIIllIIllIllIIIII, RenderTntMinecart.lIIIlIIIIllIIl[0]) && lIlllllIIIllIlI(lIlllllIIIllIII(lllllllllllllIlIIIllIIllIllIIIII - lllllllllllllIlIIIllIIllIllIIIlI + 1.0f, 10.0f))) {
            float lllllllllllllIlIIIllIIllIlIlllll = 1.0f - (lllllllllllllIlIIIllIIllIllIIIII - lllllllllllllIlIIIllIIllIllIIIlI + 1.0f) / 10.0f;
            lllllllllllllIlIIIllIIllIlIlllll = MathHelper.clamp_float(lllllllllllllIlIIIllIIllIlIlllll, 0.0f, 1.0f);
            lllllllllllllIlIIIllIIllIlIlllll *= lllllllllllllIlIIIllIIllIlIlllll;
            lllllllllllllIlIIIllIIllIlIlllll *= lllllllllllllIlIIIllIIllIlIlllll;
            final float lllllllllllllIlIIIllIIllIlIllllI = 1.0f + lllllllllllllIlIIIllIIllIlIlllll * 0.3f;
            GlStateManager.scale(lllllllllllllIlIIIllIIllIlIllllI, lllllllllllllIlIIIllIIllIlIllllI, lllllllllllllIlIIIllIIllIlIllllI);
        }
        super.func_180560_a(lllllllllllllIlIIIllIIllIllIIIll, lllllllllllllIlIIIllIIllIllIIIlI, lllllllllllllIlIIIllIIllIlIllIIl);
        if (lIlllllIIIllIIl(lllllllllllllIlIIIllIIllIllIIIII, RenderTntMinecart.lIIIlIIIIllIIl[0]) && lIlllllIIIllIll(lllllllllllllIlIIIllIIllIllIIIII / RenderTntMinecart.lIIIlIIIIllIIl[1] % RenderTntMinecart.lIIIlIIIIllIIl[2])) {
            final BlockRendererDispatcher lllllllllllllIlIIIllIIllIlIlllIl = Minecraft.getMinecraft().getBlockRendererDispatcher();
            GlStateManager.disableTexture2D();
            GlStateManager.disableLighting();
            GlStateManager.enableBlend();
            GlStateManager.blendFunc(RenderTntMinecart.lIIIlIIIIllIIl[3], RenderTntMinecart.lIIIlIIIIllIIl[4]);
            GlStateManager.color(1.0f, 1.0f, 1.0f, (1.0f - (lllllllllllllIlIIIllIIllIllIIIII - lllllllllllllIlIIIllIIllIllIIIlI + 1.0f) / 100.0f) * 0.8f);
            GlStateManager.pushMatrix();
            lllllllllllllIlIIIllIIllIlIlllIl.renderBlockBrightness(Blocks.tnt.getDefaultState(), 1.0f);
            GlStateManager.popMatrix();
            GlStateManager.color(1.0f, 1.0f, 1.0f, 1.0f);
            GlStateManager.disableBlend();
            GlStateManager.enableLighting();
            GlStateManager.enableTexture2D();
        }
    }
    
    private static boolean lIlllllIIIllIll(final int lllllllllllllIlIIIllIIllIlIIlIII) {
        return lllllllllllllIlIIIllIIllIlIIlIII == 0;
    }
    
    private static int lIlllllIIIllIII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    private static boolean lIlllllIIIllIIl(final int lllllllllllllIlIIIllIIllIlIIlIll, final int lllllllllllllIlIIIllIIllIlIIlIlI) {
        return lllllllllllllIlIIIllIIllIlIIlIll > lllllllllllllIlIIIllIIllIlIIlIlI;
    }
}
