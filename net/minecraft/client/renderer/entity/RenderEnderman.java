// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.entity;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.entity.layers.LayerHeldBlock;
import net.minecraft.client.renderer.entity.layers.LayerEndermanEyes;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.EntityLiving;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Random;
import net.minecraft.client.model.ModelEnderman;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.monster.EntityEnderman;

public class RenderEnderman extends RenderLiving<EntityEnderman>
{
    private static final /* synthetic */ ResourceLocation endermanTextures;
    private static final /* synthetic */ int[] lIllIIlIllIIlI;
    private /* synthetic */ ModelEnderman endermanModel;
    private static final /* synthetic */ String[] lIllIIlIllIIIl;
    private /* synthetic */ Random rnd;
    
    private static String lllllIlIIIllIIl(final String lllllllllllllIIIIIIlllIIlllIIIIl, final String lllllllllllllIIIIIIlllIIlllIIIII) {
        try {
            final SecretKeySpec lllllllllllllIIIIIIlllIIlllIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIlllIIlllIIIII.getBytes(StandardCharsets.UTF_8)), RenderEnderman.lIllIIlIllIIlI[2]), "DES");
            final Cipher lllllllllllllIIIIIIlllIIlllIIlIl = Cipher.getInstance("DES");
            lllllllllllllIIIIIIlllIIlllIIlIl.init(RenderEnderman.lIllIIlIllIIlI[3], lllllllllllllIIIIIIlllIIlllIIllI);
            return new String(lllllllllllllIIIIIIlllIIlllIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIlllIIlllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIIlllIIlllIIlII) {
            lllllllllllllIIIIIIlllIIlllIIlII.printStackTrace();
            return null;
        }
    }
    
    public RenderEnderman(final RenderManager lllllllllllllIIIIIIlllIlIIlIllII) {
        super(lllllllllllllIIIIIIlllIlIIlIllII, new ModelEnderman(0.0f), 0.5f);
        this.rnd = new Random();
        this.endermanModel = (ModelEnderman)super.mainModel;
        ((RendererLivingEntity<EntityLivingBase>)this).addLayer(new LayerEndermanEyes(this));
        "".length();
        ((RendererLivingEntity<EntityLivingBase>)this).addLayer(new LayerHeldBlock(this));
        "".length();
    }
    
    @Override
    public void doRender(final EntityEnderman lllllllllllllIIIIIIlllIlIIIllIll, double lllllllllllllIIIIIIlllIlIIIIllII, final double lllllllllllllIIIIIIlllIlIIIIlIlI, double lllllllllllllIIIIIIlllIlIIIIlIIl, final float lllllllllllllIIIIIIlllIlIIIIlIII, final float lllllllllllllIIIIIIlllIlIIIIIlll) {
        final ModelEnderman endermanModel = this.endermanModel;
        int isCarrying;
        if (lllllIlIIIllllI(lllllllllllllIIIIIIlllIlIIIllIll.getHeldBlockState().getBlock().getMaterial(), Material.air)) {
            isCarrying = RenderEnderman.lIllIIlIllIIlI[1];
            "".length();
            if ("  ".length() < ((0xA7 ^ 0xAB ^ (0x67 ^ 0x74)) & (0xA3 ^ 0xAD ^ (0xB9 ^ 0xA8) ^ -" ".length()))) {
                return;
            }
        }
        else {
            isCarrying = RenderEnderman.lIllIIlIllIIlI[0];
        }
        endermanModel.isCarrying = (isCarrying != 0);
        this.endermanModel.isAttacking = lllllllllllllIIIIIIlllIlIIIllIll.isScreaming();
        if (lllllIlIIIlllll(lllllllllllllIIIIIIlllIlIIIllIll.isScreaming() ? 1 : 0)) {
            final double lllllllllllllIIIIIIlllIlIIIlIIII = 0.02;
            lllllllllllllIIIIIIlllIlIIIIllII += this.rnd.nextGaussian() * lllllllllllllIIIIIIlllIlIIIlIIII;
            lllllllllllllIIIIIIlllIlIIIIlIIl += this.rnd.nextGaussian() * lllllllllllllIIIIIIlllIlIIIlIIII;
        }
        super.doRender(lllllllllllllIIIIIIlllIlIIIllIll, lllllllllllllIIIIIIlllIlIIIIllII, lllllllllllllIIIIIIlllIlIIIIlIlI, lllllllllllllIIIIIIlllIlIIIIlIIl, lllllllllllllIIIIIIlllIlIIIIlIII, lllllllllllllIIIIIIlllIlIIIIIlll);
    }
    
    private static boolean lllllIlIIIlllll(final int lllllllllllllIIIIIIlllIIllIllIII) {
        return lllllllllllllIIIIIIlllIIllIllIII != 0;
    }
    
    private static void lllllIlIIIllIlI() {
        (lIllIIlIllIIIl = new String[RenderEnderman.lIllIIlIllIIlI[1]])[RenderEnderman.lIllIIlIllIIlI[0]] = lllllIlIIIllIIl("IaeIOa/yfxth9D1PWaCMEfCe32ycCJ4h/GikmwF7JECE/UEsOs2G5Q==", "bEJfT");
    }
    
    @Override
    protected ResourceLocation getEntityTexture(final EntityEnderman lllllllllllllIIIIIIlllIlIIIIIIIl) {
        return RenderEnderman.endermanTextures;
    }
    
    static {
        lllllIlIIIllIll();
        lllllIlIIIllIlI();
        endermanTextures = new ResourceLocation(RenderEnderman.lIllIIlIllIIIl[RenderEnderman.lIllIIlIllIIlI[0]]);
    }
    
    private static void lllllIlIIIllIll() {
        (lIllIIlIllIIlI = new int[4])[0] = ((0x97 ^ 0xC5) & ~(0x91 ^ 0xC3));
        RenderEnderman.lIllIIlIllIIlI[1] = " ".length();
        RenderEnderman.lIllIIlIllIIlI[2] = (0xBE ^ 0xB6);
        RenderEnderman.lIllIIlIllIIlI[3] = "  ".length();
    }
    
    private static boolean lllllIlIIIllllI(final Object lllllllllllllIIIIIIlllIIllIllIll, final Object lllllllllllllIIIIIIlllIIllIllIlI) {
        return lllllllllllllIIIIIIlllIIllIllIll != lllllllllllllIIIIIIlllIIllIllIlI;
    }
}
