// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerHeldItemWitch;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.EntityLiving;
import net.minecraft.client.model.ModelWitch;
import net.minecraft.entity.EntityLivingBase;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.monster.EntityWitch;

public class RenderWitch extends RenderLiving<EntityWitch>
{
    private static final /* synthetic */ String[] lIllIIlIllIlll;
    private static final /* synthetic */ ResourceLocation witchTextures;
    private static final /* synthetic */ int[] lIllIIlIlllIIl;
    
    private static boolean lllllIlIIlIlIII(final int lllllllllllllIIIIIIlllIIIlllIllI, final int lllllllllllllIIIIIIlllIIIlllIlIl) {
        return lllllllllllllIIIIIIlllIIIlllIllI < lllllllllllllIIIIIIlllIIIlllIlIl;
    }
    
    private static boolean lllllIlIIlIIlll(final Object lllllllllllllIIIIIIlllIIIlllIIll) {
        return lllllllllllllIIIIIIlllIIIlllIIll != null;
    }
    
    private static String lllllIlIIlIIIlI(String lllllllllllllIIIIIIlllIIlIIIIIIl, final String lllllllllllllIIIIIIlllIIlIIIIIII) {
        lllllllllllllIIIIIIlllIIlIIIIIIl = new String(Base64.getDecoder().decode(lllllllllllllIIIIIIlllIIlIIIIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIIIlllIIlIIIIlII = new StringBuilder();
        final char[] lllllllllllllIIIIIIlllIIlIIIIIll = lllllllllllllIIIIIIlllIIlIIIIIII.toCharArray();
        int lllllllllllllIIIIIIlllIIlIIIIIlI = RenderWitch.lIllIIlIlllIIl[0];
        final float lllllllllllllIIIIIIlllIIIlllllII = (Object)lllllllllllllIIIIIIlllIIlIIIIIIl.toCharArray();
        final double lllllllllllllIIIIIIlllIIIllllIll = lllllllllllllIIIIIIlllIIIlllllII.length;
        short lllllllllllllIIIIIIlllIIIllllIlI = (short)RenderWitch.lIllIIlIlllIIl[0];
        while (lllllIlIIlIlIII(lllllllllllllIIIIIIlllIIIllllIlI, (int)lllllllllllllIIIIIIlllIIIllllIll)) {
            final char lllllllllllllIIIIIIlllIIlIIIIlll = lllllllllllllIIIIIIlllIIIlllllII[lllllllllllllIIIIIIlllIIIllllIlI];
            lllllllllllllIIIIIIlllIIlIIIIlII.append((char)(lllllllllllllIIIIIIlllIIlIIIIlll ^ lllllllllllllIIIIIIlllIIlIIIIIll[lllllllllllllIIIIIIlllIIlIIIIIlI % lllllllllllllIIIIIIlllIIlIIIIIll.length]));
            "".length();
            ++lllllllllllllIIIIIIlllIIlIIIIIlI;
            ++lllllllllllllIIIIIIlllIIIllllIlI;
            "".length();
            if (-" ".length() > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIIIlllIIlIIIIlII);
    }
    
    @Override
    public void doRender(final EntityWitch lllllllllllllIIIIIIlllIIlIllIlll, final double lllllllllllllIIIIIIlllIIlIllllIl, final double lllllllllllllIIIIIIlllIIlIllllII, final double lllllllllllllIIIIIIlllIIlIlllIll, final float lllllllllllllIIIIIIlllIIlIlllIlI, final float lllllllllllllIIIIIIlllIIlIllIIlI) {
        final ModelWitch modelWitch = (ModelWitch)this.mainModel;
        int field_82900_g;
        if (lllllIlIIlIIlll(lllllllllllllIIIIIIlllIIlIllIlll.getHeldItem())) {
            field_82900_g = RenderWitch.lIllIIlIlllIIl[1];
            "".length();
            if (" ".length() == 0) {
                return;
            }
        }
        else {
            field_82900_g = RenderWitch.lIllIIlIlllIIl[0];
        }
        modelWitch.field_82900_g = (field_82900_g != 0);
        super.doRender(lllllllllllllIIIIIIlllIIlIllIlll, lllllllllllllIIIIIIlllIIlIllllIl, lllllllllllllIIIIIIlllIIlIllllII, lllllllllllllIIIIIIlllIIlIlllIll, lllllllllllllIIIIIIlllIIlIlllIlI, lllllllllllllIIIIIIlllIIlIllIIlI);
    }
    
    public RenderWitch(final RenderManager lllllllllllllIIIIIIlllIIllIIIlll) {
        super(lllllllllllllIIIIIIlllIIllIIIlll, new ModelWitch(0.0f), 0.5f);
        ((RendererLivingEntity<EntityLivingBase>)this).addLayer(new LayerHeldItemWitch(this));
        "".length();
    }
    
    private static void lllllIlIIlIIIll() {
        (lIllIIlIllIlll = new String[RenderWitch.lIllIIlIlllIIl[1]])[RenderWitch.lIllIIlIlllIIl[0]] = lllllIlIIlIIIlI("LCIAJycqIgt8NzYzEScrdzARJzEwaQg9NQ==", "XGxSR");
    }
    
    @Override
    public void transformHeldFull3DItemLayer() {
        GlStateManager.translate(0.0f, 0.1875f, 0.0f);
    }
    
    private static void lllllIlIIlIIllI() {
        (lIllIIlIlllIIl = new int[2])[0] = ((0x85 ^ 0x9A) & ~(0x8F ^ 0x90));
        RenderWitch.lIllIIlIlllIIl[1] = " ".length();
    }
    
    static {
        lllllIlIIlIIllI();
        lllllIlIIlIIIll();
        witchTextures = new ResourceLocation(RenderWitch.lIllIIlIllIlll[RenderWitch.lIllIIlIlllIIl[0]]);
    }
    
    @Override
    protected void preRenderCallback(final EntityWitch lllllllllllllIIIIIIlllIIlIlIllII, final float lllllllllllllIIIIIIlllIIlIlIlIll) {
        final float lllllllllllllIIIIIIlllIIlIlIlIlI = 0.9375f;
        GlStateManager.scale(lllllllllllllIIIIIIlllIIlIlIlIlI, lllllllllllllIIIIIIlllIIlIlIlIlI, lllllllllllllIIIIIIlllIIlIlIlIlI);
    }
    
    @Override
    protected ResourceLocation getEntityTexture(final EntityWitch lllllllllllllIIIIIIlllIIlIllIIII) {
        return RenderWitch.witchTextures;
    }
}
