// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.layers.LayerBipedArmor;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.monster.EntityGiantZombie;

public class RenderGiantZombie extends RenderLiving<EntityGiantZombie>
{
    private static final /* synthetic */ String[] llIlllIIllllII;
    private /* synthetic */ float scale;
    private static final /* synthetic */ ResourceLocation zombieTextures;
    private static final /* synthetic */ int[] llIlllIIllllIl;
    
    private static void lIIllIIllIIlIlIl() {
        (llIlllIIllllIl = new int[2])[0] = ((104 + 75 - 126 + 106 ^ 98 + 1 - 45 + 78) & (0x33 ^ 0x6 ^ (0x83 ^ 0xAD) ^ -" ".length()));
        RenderGiantZombie.llIlllIIllllIl[1] = " ".length();
    }
    
    private static void lIIllIIllIIlIlII() {
        (llIlllIIllllII = new String[RenderGiantZombie.llIlllIIllllIl[1]])[RenderGiantZombie.llIlllIIllllIl[0]] = lIIllIIllIIlIIll("BBYpIhYCFiJ5Bh4HOCIaXwk+OwEZFn4sDB0RODNNAB02", "psQVc");
    }
    
    @Override
    protected void preRenderCallback(final EntityGiantZombie llllllllllllIllIIlIIlIllIlllIIIl, final float llllllllllllIllIIlIIlIllIlllIIII) {
        GlStateManager.scale(this.scale, this.scale, this.scale);
    }
    
    public RenderGiantZombie(final RenderManager llllllllllllIllIIlIIlIllIlllllIl, final ModelBase llllllllllllIllIIlIIlIllIlllllII, final float llllllllllllIllIIlIIlIllIlllIllI, final float llllllllllllIllIIlIIlIllIlllIlIl) {
        super(llllllllllllIllIIlIIlIllIlllllIl, llllllllllllIllIIlIIlIllIlllllII, llllllllllllIllIIlIIlIllIlllIllI * llllllllllllIllIIlIIlIllIlllIlIl);
        this.scale = llllllllllllIllIIlIIlIllIlllIlIl;
        ((RendererLivingEntity<EntityLivingBase>)this).addLayer(new LayerHeldItem(this));
        "".length();
        ((RendererLivingEntity<EntityLivingBase>)this).addLayer(new LayerBipedArmor(this) {
            private static final /* synthetic */ int[] lllIlIlIlllIll;
            
            private static void lIlIIIllIIlIIIlI() {
                (lllIlIlIlllIll = new int[1])[0] = " ".length();
            }
            
            @Override
            protected void initArmor() {
                this.field_177189_c = (T)new ModelZombie(0.5f, (boolean)(RenderGiantZombie$1.lllIlIlIlllIll[0] != 0));
                this.field_177186_d = (T)new ModelZombie(1.0f, (boolean)(RenderGiantZombie$1.lllIlIlIlllIll[0] != 0));
            }
            
            static {
                lIlIIIllIIlIIIlI();
            }
        });
        "".length();
    }
    
    private static String lIIllIIllIIlIIll(String llllllllllllIllIIlIIlIllIlIlIIll, final String llllllllllllIllIIlIIlIllIlIlIlll) {
        llllllllllllIllIIlIIlIllIlIlIIll = new String(Base64.getDecoder().decode(llllllllllllIllIIlIIlIllIlIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIlIIlIllIlIlIllI = new StringBuilder();
        final char[] llllllllllllIllIIlIIlIllIlIlIlIl = llllllllllllIllIIlIIlIllIlIlIlll.toCharArray();
        int llllllllllllIllIIlIIlIllIlIlIlII = RenderGiantZombie.llIlllIIllllIl[0];
        final double llllllllllllIllIIlIIlIllIlIIlllI = (Object)llllllllllllIllIIlIIlIllIlIlIIll.toCharArray();
        final boolean llllllllllllIllIIlIIlIllIlIIllIl = llllllllllllIllIIlIIlIllIlIIlllI.length != 0;
        boolean llllllllllllIllIIlIIlIllIlIIllII = RenderGiantZombie.llIlllIIllllIl[0] != 0;
        while (lIIllIIllIIlIllI(llllllllllllIllIIlIIlIllIlIIllII ? 1 : 0, llllllllllllIllIIlIIlIllIlIIllIl ? 1 : 0)) {
            final char llllllllllllIllIIlIIlIllIlIllIIl = llllllllllllIllIIlIIlIllIlIIlllI[llllllllllllIllIIlIIlIllIlIIllII];
            llllllllllllIllIIlIIlIllIlIlIllI.append((char)(llllllllllllIllIIlIIlIllIlIllIIl ^ llllllllllllIllIIlIIlIllIlIlIlIl[llllllllllllIllIIlIIlIllIlIlIlII % llllllllllllIllIIlIIlIllIlIlIlIl.length]));
            "".length();
            ++llllllllllllIllIIlIIlIllIlIlIlII;
            ++llllllllllllIllIIlIIlIllIlIIllII;
            "".length();
            if (-(0x63 ^ 0x66) >= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIlIIlIllIlIlIllI);
    }
    
    @Override
    public void transformHeldFull3DItemLayer() {
        GlStateManager.translate(0.0f, 0.1875f, 0.0f);
    }
    
    private static boolean lIIllIIllIIlIllI(final int llllllllllllIllIIlIIlIllIlIIlIII, final int llllllllllllIllIIlIIlIllIlIIIlll) {
        return llllllllllllIllIIlIIlIllIlIIlIII < llllllllllllIllIIlIIlIllIlIIIlll;
    }
    
    static {
        lIIllIIllIIlIlIl();
        lIIllIIllIIlIlII();
        zombieTextures = new ResourceLocation(RenderGiantZombie.llIlllIIllllII[RenderGiantZombie.llIlllIIllllIl[0]]);
    }
    
    @Override
    protected ResourceLocation getEntityTexture(final EntityGiantZombie llllllllllllIllIIlIIlIllIllIllIl) {
        return RenderGiantZombie.zombieTextures;
    }
}
