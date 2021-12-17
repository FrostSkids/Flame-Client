// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.entity.layers.LayerBipedArmor;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelZombie;
import net.minecraft.entity.EntityLiving;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.monster.EntityPigZombie;

public class RenderPigZombie extends RenderBiped<EntityPigZombie>
{
    private static final /* synthetic */ int[] lIllllIllllIll;
    private static final /* synthetic */ ResourceLocation ZOMBIE_PIGMAN_TEXTURE;
    private static final /* synthetic */ String[] lIllllIlllIlll;
    
    private static String lIIIIlIIlllIllll(String llllllllllllIllllIlIIIIIIIlIIllI, final String llllllllllllIllllIlIIIIIIIlIlIlI) {
        llllllllllllIllllIlIIIIIIIlIIllI = (boolean)new String(Base64.getDecoder().decode(((String)llllllllllllIllllIlIIIIIIIlIIllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIlIIIIIIIlIlIIl = new StringBuilder();
        final char[] llllllllllllIllllIlIIIIIIIlIlIII = llllllllllllIllllIlIIIIIIIlIlIlI.toCharArray();
        int llllllllllllIllllIlIIIIIIIlIIlll = RenderPigZombie.lIllllIllllIll[0];
        final byte llllllllllllIllllIlIIIIIIIlIIIIl = (Object)((String)llllllllllllIllllIlIIIIIIIlIIllI).toCharArray();
        final double llllllllllllIllllIlIIIIIIIlIIIII = llllllllllllIllllIlIIIIIIIlIIIIl.length;
        String llllllllllllIllllIlIIIIIIIIlllll = (String)RenderPigZombie.lIllllIllllIll[0];
        while (lIIIIlIIllllIIll((int)llllllllllllIllllIlIIIIIIIIlllll, (int)llllllllllllIllllIlIIIIIIIlIIIII)) {
            final char llllllllllllIllllIlIIIIIIIlIllII = llllllllllllIllllIlIIIIIIIlIIIIl[llllllllllllIllllIlIIIIIIIIlllll];
            llllllllllllIllllIlIIIIIIIlIlIIl.append((char)(llllllllllllIllllIlIIIIIIIlIllII ^ llllllllllllIllllIlIIIIIIIlIlIII[llllllllllllIllllIlIIIIIIIlIIlll % llllllllllllIllllIlIIIIIIIlIlIII.length]));
            "".length();
            ++llllllllllllIllllIlIIIIIIIlIIlll;
            ++llllllllllllIllllIlIIIIIIIIlllll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIlIIIIIIIlIlIIl);
    }
    
    private static boolean lIIIIlIIllllIIll(final int llllllllllllIllllIlIIIIIIIIllIll, final int llllllllllllIllllIlIIIIIIIIllIlI) {
        return llllllllllllIllllIlIIIIIIIIllIll < llllllllllllIllllIlIIIIIIIIllIlI;
    }
    
    private static void lIIIIlIIllllIIII() {
        (lIllllIlllIlll = new String[RenderPigZombie.lIllllIllllIll[1]])[RenderPigZombie.lIllllIllllIll[0]] = lIIIIlIIlllIllll("JywJACQhLAJbND09GAAofDMeGTM6LC4EODQkEBp/IycW", "SIqtQ");
    }
    
    @Override
    protected ResourceLocation getEntityTexture(final EntityPigZombie llllllllllllIllllIlIIIIIIIlllIlI) {
        return RenderPigZombie.ZOMBIE_PIGMAN_TEXTURE;
    }
    
    private static void lIIIIlIIllllIIlI() {
        (lIllllIllllIll = new int[2])[0] = ((0xEA ^ 0xB8 ^ (0x2 ^ 0x46)) & (0xC ^ 0x25 ^ (0x33 ^ 0xC) ^ -" ".length()));
        RenderPigZombie.lIllllIllllIll[1] = " ".length();
    }
    
    public RenderPigZombie(final RenderManager llllllllllllIllllIlIIIIIIIlllllI) {
        super(llllllllllllIllllIlIIIIIIIlllllI, new ModelZombie(), 0.5f, 1.0f);
        ((RendererLivingEntity<EntityLivingBase>)this).addLayer(new LayerHeldItem(this));
        "".length();
        ((RendererLivingEntity<EntityLivingBase>)this).addLayer(new LayerBipedArmor(this) {
            private static final /* synthetic */ int[] llIIlIIllIlIlI;
            
            private static void lIIIllIIlIIllIlI() {
                (llIIlIIllIlIlI = new int[1])[0] = " ".length();
            }
            
            @Override
            protected void initArmor() {
                this.field_177189_c = (T)new ModelZombie(0.5f, (boolean)(RenderPigZombie$1.llIIlIIllIlIlI[0] != 0));
                this.field_177186_d = (T)new ModelZombie(1.0f, (boolean)(RenderPigZombie$1.llIIlIIllIlIlI[0] != 0));
            }
            
            static {
                lIIIllIIlIIllIlI();
            }
        });
        "".length();
    }
    
    static {
        lIIIIlIIllllIIlI();
        lIIIIlIIllllIIII();
        ZOMBIE_PIGMAN_TEXTURE = new ResourceLocation(RenderPigZombie.lIllllIlllIlll[RenderPigZombie.lIllllIllllIll[0]]);
    }
}
