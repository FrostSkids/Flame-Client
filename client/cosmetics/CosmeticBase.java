// 
// Decompiled by Procyon v0.5.36
// 

package client.cosmetics;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.entity.RenderPlayer;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;

public abstract class CosmeticBase implements LayerRenderer<AbstractClientPlayer>
{
    private static final /* synthetic */ int[] lllIlllIIlIlIl;
    protected final /* synthetic */ RenderPlayer playerRenderer;
    
    @Override
    public void doRenderLayer(final AbstractClientPlayer llllllllllllIlIllIIIIlIllllIIIlI, final float llllllllllllIlIllIIIIlIllllIlIlI, final float llllllllllllIlIllIIIIlIllllIIIII, final float llllllllllllIlIllIIIIlIllllIlIII, final float llllllllllllIlIllIIIIlIllllIIlll, final float llllllllllllIlIllIIIIlIlllIlllIl, final float llllllllllllIlIllIIIIlIlllIlllII, final float llllllllllllIlIllIIIIlIlllIllIll) {
        if (lIlIIlIllIIlIllI(llllllllllllIlIllIIIIlIllllIIIlI.hasPlayerInfo() ? 1 : 0) && lIlIIlIllIIlIlll(llllllllllllIlIllIIIIlIllllIIIlI.isInvisible() ? 1 : 0)) {
            this.render(llllllllllllIlIllIIIIlIllllIIIlI, llllllllllllIlIllIIIIlIllllIlIlI, llllllllllllIlIllIIIIlIllllIIIII, llllllllllllIlIllIIIIlIllllIlIII, llllllllllllIlIllIIIIlIllllIIlll, llllllllllllIlIllIIIIlIlllIlllIl, llllllllllllIlIllIIIIlIlllIlllII, llllllllllllIlIllIIIIlIlllIllIll);
        }
    }
    
    public CosmeticBase(final RenderPlayer llllllllllllIlIllIIIIlIlllllIllI) {
        this.playerRenderer = llllllllllllIlIllIIIIlIlllllIllI;
    }
    
    private static void lIlIIlIllIIlIlIl() {
        (lllIlllIIlIlIl = new int[1])[0] = ((20 + 95 + 29 + 12 ^ 96 + 40 - 6 + 6) & (70 + 147 - 137 + 94 ^ 87 + 185 - 241 + 155 ^ -" ".length()));
    }
    
    private static boolean lIlIIlIllIIlIllI(final int llllllllllllIlIllIIIIlIlllIIIllI) {
        return llllllllllllIlIllIIIIlIlllIIIllI != 0;
    }
    
    public abstract void render(final AbstractClientPlayer p0, final float p1, final float p2, final float p3, final float p4, final float p5, final float p6, final float p7);
    
    @Override
    public boolean shouldCombineTextures() {
        return CosmeticBase.lllIlllIIlIlIl[0] != 0;
    }
    
    static {
        lIlIIlIllIIlIlIl();
    }
    
    private static boolean lIlIIlIllIIlIlll(final int llllllllllllIlIllIIIIlIlllIIIlII) {
        return llllllllllllIlIllIIIIlIlllIIIlII == 0;
    }
}
