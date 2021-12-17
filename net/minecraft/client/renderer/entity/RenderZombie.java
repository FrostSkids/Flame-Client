// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import net.minecraft.client.renderer.entity.layers.LayerVillagerArmor;
import net.minecraft.client.renderer.entity.layers.LayerCustomHead;
import com.google.common.collect.Lists;
import net.minecraft.client.renderer.entity.layers.LayerBipedArmor;
import net.minecraft.client.renderer.entity.layers.LayerHeldItem;
import net.minecraft.client.model.ModelZombie;
import net.minecraft.entity.EntityLivingBase;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.entity.EntityLiving;
import net.minecraft.client.model.ModelZombieVillager;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import java.util.List;
import net.minecraft.entity.monster.EntityZombie;

public class RenderZombie extends RenderBiped<EntityZombie>
{
    private final /* synthetic */ List<LayerRenderer<EntityZombie>> field_177122_o;
    private final /* synthetic */ List<LayerRenderer<EntityZombie>> field_177121_n;
    private final /* synthetic */ ModelBiped field_82434_o;
    private static final /* synthetic */ int[] llIlIIIlllIIll;
    private static final /* synthetic */ ResourceLocation zombieTextures;
    private static final /* synthetic */ String[] llIlIIIllIllll;
    private static final /* synthetic */ ResourceLocation zombieVillagerTextures;
    private final /* synthetic */ ModelZombieVillager zombieVillagerModel;
    
    private static void lIIlIIlIIIlIIlIl() {
        (llIlIIIllIllll = new String[RenderZombie.llIlIIIlllIIll[2]])[RenderZombie.llIlIIIlllIIll[0]] = lIIlIIlIIIlIIIIl("pPiRJJBSfLOk17xn5BVc9qaIPJuEIBFknZT51B+H8/GsxrGx5xKPSQ==", "ePIgj");
        RenderZombie.llIlIIIllIllll[RenderZombie.llIlIIIlllIIll[1]] = lIIlIIlIIIlIIIIl("vhE/THpa+C3XJ1dfs1A6Bv9bsx6R0F1r+3Xl4ExSXTbaD16m8wUgqhxDPpIqlgJU", "kjMgF");
    }
    
    private static boolean lIIlIIlIIIlIlIII(final int llllllllllllIllIllIIlIlIllIlIlII) {
        return llllllllllllIllIllIIlIlIllIlIlII != 0;
    }
    
    private void func_82427_a(final EntityZombie llllllllllllIllIllIIlIllIIIllIII) {
        if (lIIlIIlIIIlIlIII(llllllllllllIllIllIIlIllIIIllIII.isVillager() ? 1 : 0)) {
            this.mainModel = this.zombieVillagerModel;
            this.layerRenderers = (List<LayerRenderer<T>>)this.field_177121_n;
            "".length();
            if ("   ".length() == " ".length()) {
                return;
            }
        }
        else {
            this.mainModel = this.field_82434_o;
            this.layerRenderers = (List<LayerRenderer<T>>)this.field_177122_o;
        }
        this.modelBipedMain = (ModelBiped)this.mainModel;
    }
    
    private static void lIIlIIlIIIlIIlll() {
        (llIlIIIlllIIll = new int[3])[0] = ((0x51 ^ 0x42) & ~(0x34 ^ 0x27));
        RenderZombie.llIlIIIlllIIll[1] = " ".length();
        RenderZombie.llIlIIIlllIIll[2] = "  ".length();
    }
    
    private static String lIIlIIlIIIlIIIIl(final String llllllllllllIllIllIIlIlIllIllIIl, final String llllllllllllIllIllIIlIlIllIllIlI) {
        try {
            final SecretKeySpec llllllllllllIllIllIIlIlIllIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIIlIlIllIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIllIIlIlIllIlllIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIllIIlIlIllIlllIl.init(RenderZombie.llIlIIIlllIIll[2], llllllllllllIllIllIIlIlIllIllllI);
            return new String(llllllllllllIllIllIIlIlIllIlllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIIlIlIllIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllIIlIlIllIlllII) {
            llllllllllllIllIllIIlIlIllIlllII.printStackTrace();
            return null;
        }
    }
    
    @Override
    protected void rotateCorpse(final EntityZombie llllllllllllIllIllIIlIllIIIIIIlI, final float llllllllllllIllIllIIlIllIIIIIllI, float llllllllllllIllIllIIlIllIIIIIlIl, final float llllllllllllIllIllIIlIllIIIIIlII) {
        if (lIIlIIlIIIlIlIII(llllllllllllIllIllIIlIllIIIIIIlI.isConverting() ? 1 : 0)) {
            llllllllllllIllIllIIlIllIIIIIlIl += (float)(Math.cos(llllllllllllIllIllIIlIllIIIIIIlI.ticksExisted * 3.25) * 3.141592653589793 * 0.25);
        }
        super.rotateCorpse(llllllllllllIllIllIIlIllIIIIIIlI, llllllllllllIllIllIIlIllIIIIIllI, llllllllllllIllIllIIlIllIIIIIlIl, llllllllllllIllIllIIlIllIIIIIlII);
    }
    
    @Override
    public void doRender(final EntityZombie llllllllllllIllIllIIlIllIIllIlIl, final double llllllllllllIllIllIIlIllIIllllll, final double llllllllllllIllIllIIlIllIIllllIl, final double llllllllllllIllIllIIlIllIIllIIII, final float llllllllllllIllIllIIlIllIIlllIIl, final float llllllllllllIllIllIIlIllIIlllIII) {
        this.func_82427_a(llllllllllllIllIllIIlIllIIllIlIl);
        super.doRender(llllllllllllIllIllIIlIllIIllIlIl, llllllllllllIllIllIIlIllIIllllll, llllllllllllIllIllIIlIllIIllllIl, llllllllllllIllIllIIlIllIIllIIII, llllllllllllIllIllIIlIllIIlllIIl, llllllllllllIllIllIIlIllIIlllIII);
    }
    
    static {
        lIIlIIlIIIlIIlll();
        lIIlIIlIIIlIIlIl();
        zombieTextures = new ResourceLocation(RenderZombie.llIlIIIllIllll[RenderZombie.llIlIIIlllIIll[0]]);
        zombieVillagerTextures = new ResourceLocation(RenderZombie.llIlIIIllIllll[RenderZombie.llIlIIIlllIIll[1]]);
    }
    
    public RenderZombie(final RenderManager llllllllllllIllIllIIlIllIlIlllll) {
        super(llllllllllllIllIllIIlIllIlIlllll, new ModelZombie(), 0.5f, 1.0f);
        final LayerRenderer llllllllllllIllIllIIlIllIllIIIlI = this.layerRenderers.get(RenderZombie.llIlIIIlllIIll[0]);
        this.field_82434_o = this.modelBipedMain;
        this.zombieVillagerModel = new ModelZombieVillager();
        ((RendererLivingEntity<EntityLivingBase>)this).addLayer(new LayerHeldItem(this));
        "".length();
        final LayerBipedArmor llllllllllllIllIllIIlIllIllIIIIl = new LayerBipedArmor(this) {
            private static final /* synthetic */ int[] llIlIlIllIlllI;
            
            @Override
            protected void initArmor() {
                this.field_177189_c = (T)new ModelZombie(0.5f, (boolean)(RenderZombie$1.llIlIlIllIlllI[0] != 0));
                this.field_177186_d = (T)new ModelZombie(1.0f, (boolean)(RenderZombie$1.llIlIlIllIlllI[0] != 0));
            }
            
            private static void lIIlIlIIlIlIIIlI() {
                (llIlIlIllIlllI = new int[1])[0] = " ".length();
            }
            
            static {
                lIIlIlIIlIlIIIlI();
            }
        };
        ((RendererLivingEntity<EntityLivingBase>)this).addLayer(llllllllllllIllIllIIlIllIllIIIIl);
        "".length();
        this.field_177122_o = (List<LayerRenderer<EntityZombie>>)Lists.newArrayList((Iterable)this.layerRenderers);
        if (lIIlIIlIIIlIlIII((llllllllllllIllIllIIlIllIllIIIlI instanceof LayerCustomHead) ? 1 : 0)) {
            ((RendererLivingEntity<EntityLivingBase>)this).removeLayer(llllllllllllIllIllIIlIllIllIIIlI);
            "".length();
            ((RendererLivingEntity<EntityLivingBase>)this).addLayer(new LayerCustomHead(this.zombieVillagerModel.bipedHead));
            "".length();
        }
        ((RendererLivingEntity<EntityLivingBase>)this).removeLayer(llllllllllllIllIllIIlIllIllIIIIl);
        "".length();
        ((RendererLivingEntity<EntityLivingBase>)this).addLayer(new LayerVillagerArmor(this));
        "".length();
        this.field_177121_n = (List<LayerRenderer<EntityZombie>>)Lists.newArrayList((Iterable)this.layerRenderers);
    }
    
    @Override
    protected ResourceLocation getEntityTexture(final EntityZombie llllllllllllIllIllIIlIllIIlIIlll) {
        ResourceLocation resourceLocation;
        if (lIIlIIlIIIlIlIII(llllllllllllIllIllIIlIllIIlIIlll.isVillager() ? 1 : 0)) {
            resourceLocation = RenderZombie.zombieVillagerTextures;
            "".length();
            if ("   ".length() < " ".length()) {
                return null;
            }
        }
        else {
            resourceLocation = RenderZombie.zombieTextures;
        }
        return resourceLocation;
    }
}
