// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import net.minecraft.client.renderer.WorldRenderer;
import net.minecraft.client.renderer.vertex.DefaultVertexFormats;
import java.util.Random;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.entity.effect.EntityLightningBolt;

public class RenderLightningBolt extends Render<EntityLightningBolt>
{
    private static final /* synthetic */ int[] llllllIIIIIll;
    
    public RenderLightningBolt(final RenderManager lllllllllllllIlIlIlIllllIllIIlII) {
        super(lllllllllllllIlIlIlIllllIllIIlII);
    }
    
    private static boolean lIlIlllllIIlIll(final int lllllllllllllIlIlIlIlllIlllIIlll, final int lllllllllllllIlIlIlIlllIlllIIllI) {
        return lllllllllllllIlIlIlIlllIlllIIlll == lllllllllllllIlIlIlIlllIlllIIllI;
    }
    
    private static boolean lIlIlllllIIllII(final int lllllllllllllIlIlIlIlllIlllIIIll, final int lllllllllllllIlIlIlIlllIlllIIIlI) {
        return lllllllllllllIlIlIlIlllIlllIIIll >= lllllllllllllIlIlIlIlllIlllIIIlI;
    }
    
    private static boolean lIlIlllllIIlIIl(final int lllllllllllllIlIlIlIlllIllIlllII) {
        return lllllllllllllIlIlIlIlllIllIlllII == 0;
    }
    
    @Override
    public void doRender(final EntityLightningBolt lllllllllllllIlIlIlIllllIIIlllIl, final double lllllllllllllIlIlIlIllllIIIlllII, final double lllllllllllllIlIlIlIllllIIlllllI, final double lllllllllllllIlIlIlIllllIIllllIl, final float lllllllllllllIlIlIlIllllIIllllII, final float lllllllllllllIlIlIlIllllIIlllIll) {
        final Tessellator lllllllllllllIlIlIlIllllIIlllIlI = Tessellator.getInstance();
        final WorldRenderer lllllllllllllIlIlIlIllllIIlllIIl = lllllllllllllIlIlIlIllllIIlllIlI.getWorldRenderer();
        GlStateManager.disableTexture2D();
        GlStateManager.disableLighting();
        GlStateManager.enableBlend();
        GlStateManager.blendFunc(RenderLightningBolt.llllllIIIIIll[0], RenderLightningBolt.llllllIIIIIll[1]);
        final double[] lllllllllllllIlIlIlIllllIIlllIII = new double[RenderLightningBolt.llllllIIIIIll[2]];
        final double[] lllllllllllllIlIlIlIllllIIllIlll = new double[RenderLightningBolt.llllllIIIIIll[2]];
        double lllllllllllllIlIlIlIllllIIllIllI = 0.0;
        double lllllllllllllIlIlIlIllllIIllIlIl = 0.0;
        final Random lllllllllllllIlIlIlIllllIIllIlII = new Random(lllllllllllllIlIlIlIllllIIIlllIl.boltVertex);
        int lllllllllllllIlIlIlIllllIIllIIll = RenderLightningBolt.llllllIIIIIll[3];
        "".length();
        if (((0x59 ^ 0x18) & ~(0xFE ^ 0xBF)) != 0x0) {
            return;
        }
        while (!lIlIlllllIIIlll(lllllllllllllIlIlIlIllllIIllIIll)) {
            lllllllllllllIlIlIlIllllIIlllIII[lllllllllllllIlIlIlIllllIIllIIll] = lllllllllllllIlIlIlIllllIIllIllI;
            lllllllllllllIlIlIlIllllIIllIlll[lllllllllllllIlIlIlIllllIIllIIll] = lllllllllllllIlIlIlIllllIIllIlIl;
            lllllllllllllIlIlIlIllllIIllIllI += lllllllllllllIlIlIlIllllIIllIlII.nextInt(RenderLightningBolt.llllllIIIIIll[4]) - RenderLightningBolt.llllllIIIIIll[5];
            lllllllllllllIlIlIlIllllIIllIlIl += lllllllllllllIlIlIlIllllIIllIlII.nextInt(RenderLightningBolt.llllllIIIIIll[4]) - RenderLightningBolt.llllllIIIIIll[5];
            --lllllllllllllIlIlIlIllllIIllIIll;
        }
        int lllllllllllllIlIlIlIllllIIllIIlI = RenderLightningBolt.llllllIIIIIll[6];
        "".length();
        if (-(0x41 ^ 0x46 ^ "  ".length()) >= 0) {
            return;
        }
        while (!lIlIlllllIIllII(lllllllllllllIlIlIlIllllIIllIIlI, RenderLightningBolt.llllllIIIIIll[12])) {
            final Random lllllllllllllIlIlIlIllllIIllIIIl = new Random(lllllllllllllIlIlIlIllllIIIlllIl.boltVertex);
            int lllllllllllllIlIlIlIllllIIllIIII = RenderLightningBolt.llllllIIIIIll[6];
            "".length();
            if (null != null) {
                return;
            }
            while (!lIlIlllllIIllII(lllllllllllllIlIlIlIllllIIllIIII, RenderLightningBolt.llllllIIIIIll[10])) {
                int lllllllllllllIlIlIlIllllIIlIllll = RenderLightningBolt.llllllIIIIIll[3];
                int lllllllllllllIlIlIlIllllIIlIlllI = RenderLightningBolt.llllllIIIIIll[6];
                if (lIlIlllllIIlIII(lllllllllllllIlIlIlIllllIIllIIII)) {
                    lllllllllllllIlIlIlIllllIIlIllll = RenderLightningBolt.llllllIIIIIll[3] - lllllllllllllIlIlIlIllllIIllIIII;
                }
                if (lIlIlllllIIlIII(lllllllllllllIlIlIlIllllIIllIIII)) {
                    lllllllllllllIlIlIlIllllIIlIlllI = lllllllllllllIlIlIlIllllIIlIllll - RenderLightningBolt.llllllIIIIIll[7];
                }
                double lllllllllllllIlIlIlIllllIIlIllIl = lllllllllllllIlIlIlIllllIIlllIII[lllllllllllllIlIlIlIllllIIlIllll] - lllllllllllllIlIlIlIllllIIllIllI;
                double lllllllllllllIlIlIlIllllIIlIllII = lllllllllllllIlIlIlIllllIIllIlll[lllllllllllllIlIlIlIllllIIlIllll] - lllllllllllllIlIlIlIllllIIllIlIl;
                int lllllllllllllIlIlIlIllllIIlIlIll = lllllllllllllIlIlIlIllllIIlIllll;
                "".length();
                if ((0x17 ^ 0x13) <= "  ".length()) {
                    return;
                }
                while (!lIlIlllllIIllIl(lllllllllllllIlIlIlIllllIIlIlIll, lllllllllllllIlIlIlIllllIIlIlllI)) {
                    final double lllllllllllllIlIlIlIllllIIlIlIlI = lllllllllllllIlIlIlIllllIIlIllIl;
                    final double lllllllllllllIlIlIlIllllIIlIlIIl = lllllllllllllIlIlIlIllllIIlIllII;
                    if (lIlIlllllIIlIIl(lllllllllllllIlIlIlIllllIIllIIII)) {
                        lllllllllllllIlIlIlIllllIIlIllIl += lllllllllllllIlIlIlIllllIIllIIIl.nextInt(RenderLightningBolt.llllllIIIIIll[4]) - RenderLightningBolt.llllllIIIIIll[5];
                        lllllllllllllIlIlIlIllllIIlIllII += lllllllllllllIlIlIlIllllIIllIIIl.nextInt(RenderLightningBolt.llllllIIIIIll[4]) - RenderLightningBolt.llllllIIIIIll[5];
                        "".length();
                        if (((0x69 ^ 0x1C ^ (0x6 ^ 0x20)) & (98 + 10 - 90 + 205 ^ 39 + 122 - 123 + 102 ^ -" ".length())) != 0x0) {
                            return;
                        }
                    }
                    else {
                        lllllllllllllIlIlIlIllllIIlIllIl += lllllllllllllIlIlIlIllllIIllIIIl.nextInt(RenderLightningBolt.llllllIIIIIll[8]) - RenderLightningBolt.llllllIIIIIll[9];
                        lllllllllllllIlIlIlIllllIIlIllII += lllllllllllllIlIlIlIllllIIllIIIl.nextInt(RenderLightningBolt.llllllIIIIIll[8]) - RenderLightningBolt.llllllIIIIIll[9];
                    }
                    lllllllllllllIlIlIlIllllIIlllIIl.begin(RenderLightningBolt.llllllIIIIIll[5], DefaultVertexFormats.POSITION_COLOR);
                    final float lllllllllllllIlIlIlIllllIIlIlIII = 0.5f;
                    final float lllllllllllllIlIlIlIllllIIlIIlll = 0.45f;
                    final float lllllllllllllIlIlIlIllllIIlIIllI = 0.45f;
                    final float lllllllllllllIlIlIlIllllIIlIIlIl = 0.5f;
                    double lllllllllllllIlIlIlIllllIIlIIlII = 0.1 + lllllllllllllIlIlIlIllllIIllIIlI * 0.2;
                    if (lIlIlllllIIlIIl(lllllllllllllIlIlIlIllllIIllIIII)) {
                        lllllllllllllIlIlIlIllllIIlIIlII *= lllllllllllllIlIlIlIllllIIlIlIll * 0.1 + 1.0;
                    }
                    double lllllllllllllIlIlIlIllllIIlIIIll = 0.1 + lllllllllllllIlIlIlIllllIIllIIlI * 0.2;
                    if (lIlIlllllIIlIIl(lllllllllllllIlIlIlIllllIIllIIII)) {
                        lllllllllllllIlIlIlIllllIIlIIIll *= (lllllllllllllIlIlIlIllllIIlIlIll - RenderLightningBolt.llllllIIIIIll[1]) * 0.1 + 1.0;
                    }
                    int lllllllllllllIlIlIlIllllIIlIIIlI = RenderLightningBolt.llllllIIIIIll[6];
                    "".length();
                    if ((0x57 ^ 0x53) < 0) {
                        return;
                    }
                    while (!lIlIlllllIIllII(lllllllllllllIlIlIlIllllIIlIIIlI, RenderLightningBolt.llllllIIIIIll[5])) {
                        double lllllllllllllIlIlIlIllllIIlIIIIl = lllllllllllllIlIlIlIllllIIIlllII + 0.5 - lllllllllllllIlIlIlIllllIIlIIlII;
                        double lllllllllllllIlIlIlIllllIIlIIIII = lllllllllllllIlIlIlIllllIIllllIl + 0.5 - lllllllllllllIlIlIlIllllIIlIIlII;
                        if (!lIlIlllllIIlIlI(lllllllllllllIlIlIlIllllIIlIIIlI, RenderLightningBolt.llllllIIIIIll[1]) || lIlIlllllIIlIll(lllllllllllllIlIlIlIllllIIlIIIlI, RenderLightningBolt.llllllIIIIIll[7])) {
                            lllllllllllllIlIlIlIllllIIlIIIIl += lllllllllllllIlIlIlIllllIIlIIlII * 2.0;
                        }
                        if (!lIlIlllllIIlIlI(lllllllllllllIlIlIlIllllIIlIIIlI, RenderLightningBolt.llllllIIIIIll[7]) || lIlIlllllIIlIll(lllllllllllllIlIlIlIllllIIlIIIlI, RenderLightningBolt.llllllIIIIIll[10])) {
                            lllllllllllllIlIlIlIllllIIlIIIII += lllllllllllllIlIlIlIllllIIlIIlII * 2.0;
                        }
                        double lllllllllllllIlIlIlIllllIIIlllll = lllllllllllllIlIlIlIllllIIIlllII + 0.5 - lllllllllllllIlIlIlIllllIIlIIIll;
                        double lllllllllllllIlIlIlIllllIIIllllI = lllllllllllllIlIlIlIllllIIllllIl + 0.5 - lllllllllllllIlIlIlIllllIIlIIIll;
                        if (!lIlIlllllIIlIlI(lllllllllllllIlIlIlIllllIIlIIIlI, RenderLightningBolt.llllllIIIIIll[1]) || lIlIlllllIIlIll(lllllllllllllIlIlIlIllllIIlIIIlI, RenderLightningBolt.llllllIIIIIll[7])) {
                            lllllllllllllIlIlIlIllllIIIlllll += lllllllllllllIlIlIlIllllIIlIIIll * 2.0;
                        }
                        if (!lIlIlllllIIlIlI(lllllllllllllIlIlIlIllllIIlIIIlI, RenderLightningBolt.llllllIIIIIll[7]) || lIlIlllllIIlIll(lllllllllllllIlIlIlIllllIIlIIIlI, RenderLightningBolt.llllllIIIIIll[10])) {
                            lllllllllllllIlIlIlIllllIIIllllI += lllllllllllllIlIlIlIllllIIlIIIll * 2.0;
                        }
                        lllllllllllllIlIlIlIllllIIlllIIl.pos(lllllllllllllIlIlIlIllllIIIlllll + lllllllllllllIlIlIlIllllIIlIllIl, lllllllllllllIlIlIlIllllIIlllllI + lllllllllllllIlIlIlIllllIIlIlIll * RenderLightningBolt.llllllIIIIIll[11], lllllllllllllIlIlIlIllllIIIllllI + lllllllllllllIlIlIlIllllIIlIllII).color(0.45f, 0.45f, 0.5f, 0.3f).endVertex();
                        lllllllllllllIlIlIlIllllIIlllIIl.pos(lllllllllllllIlIlIlIllllIIlIIIIl + lllllllllllllIlIlIlIllllIIlIlIlI, lllllllllllllIlIlIlIllllIIlllllI + (lllllllllllllIlIlIlIllllIIlIlIll + RenderLightningBolt.llllllIIIIIll[1]) * RenderLightningBolt.llllllIIIIIll[11], lllllllllllllIlIlIlIllllIIlIIIII + lllllllllllllIlIlIlIllllIIlIlIIl).color(0.45f, 0.45f, 0.5f, 0.3f).endVertex();
                        ++lllllllllllllIlIlIlIllllIIlIIIlI;
                    }
                    lllllllllllllIlIlIlIllllIIlllIlI.draw();
                    --lllllllllllllIlIlIlIllllIIlIlIll;
                }
                ++lllllllllllllIlIlIlIllllIIllIIII;
            }
            ++lllllllllllllIlIlIlIllllIIllIIlI;
        }
        GlStateManager.disableBlend();
        GlStateManager.enableLighting();
        GlStateManager.enableTexture2D();
    }
    
    static {
        lIlIlllllIIIllI();
    }
    
    private static boolean lIlIlllllIIlIlI(final int lllllllllllllIlIlIlIlllIllIlIlIl, final int lllllllllllllIlIlIlIlllIllIlIlII) {
        return lllllllllllllIlIlIlIlllIllIlIlIl != lllllllllllllIlIlIlIlllIllIlIlII;
    }
    
    private static boolean lIlIlllllIIllIl(final int lllllllllllllIlIlIlIlllIllIlllll, final int lllllllllllllIlIlIlIlllIllIllllI) {
        return lllllllllllllIlIlIlIlllIllIlllll < lllllllllllllIlIlIlIlllIllIllllI;
    }
    
    private static boolean lIlIlllllIIlIII(final int lllllllllllllIlIlIlIlllIllIllIII) {
        return lllllllllllllIlIlIlIlllIllIllIII > 0;
    }
    
    private static void lIlIlllllIIIllI() {
        (llllllIIIIIll = new int[13])[0] = (-(0xFFFFFE79 & 0x199F) & (0xFFFF9F1B & 0x7BFE));
        RenderLightningBolt.llllllIIIIIll[1] = " ".length();
        RenderLightningBolt.llllllIIIIIll[2] = (0x7E ^ 0x76);
        RenderLightningBolt.llllllIIIIIll[3] = (0x5D ^ 0x5A);
        RenderLightningBolt.llllllIIIIIll[4] = (0x7 ^ 0xC);
        RenderLightningBolt.llllllIIIIIll[5] = (0x61 ^ 0x64);
        RenderLightningBolt.llllllIIIIIll[6] = ((0x84 ^ 0xB5 ^ (0xC7 ^ 0xA4)) & (0x64 ^ 0x21 ^ (0x1A ^ 0xD) ^ -" ".length()));
        RenderLightningBolt.llllllIIIIIll[7] = "  ".length();
        RenderLightningBolt.llllllIIIIIll[8] = (0x87 ^ 0x98);
        RenderLightningBolt.llllllIIIIIll[9] = (0x89 ^ 0x86);
        RenderLightningBolt.llllllIIIIIll[10] = "   ".length();
        RenderLightningBolt.llllllIIIIIll[11] = (0x2A ^ 0x14 ^ (0xAB ^ 0x85));
        RenderLightningBolt.llllllIIIIIll[12] = (0x43 ^ 0x47);
    }
    
    private static boolean lIlIlllllIIIlll(final int lllllllllllllIlIlIlIlllIllIllIlI) {
        return lllllllllllllIlIlIlIlllIllIllIlI < 0;
    }
    
    @Override
    protected ResourceLocation getEntityTexture(final EntityLightningBolt lllllllllllllIlIlIlIlllIllllllII) {
        return null;
    }
}
